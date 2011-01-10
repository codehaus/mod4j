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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'link'", "'false'", "'new'", "'save'", "'edit'", "'delete'", "'cancel'", "'removefrom'", "'addto'", "'custom'", "'all'", "'find'", "'application'", "';'", "'presentation'", "'menu'", "'['", "']'", "'from'", "'dto'", "'page'", "'service'", "'panel'", "'extends'", "'actions'", "'context'", "':'", "'label'", "'-->'", "'shows'", "'readonly'", "'call'", "'navigate'", "'.'", "'list'", "'collection'", "'true'"
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


    // $ANTLR start entryRuleFormsAndProcesses
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:114:1: entryRuleFormsAndProcesses : ruleFormsAndProcesses EOF ;
    public final void entryRuleFormsAndProcesses() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:114:28: ( ruleFormsAndProcesses EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:115:1: ruleFormsAndProcesses EOF
            {
             before(grammarAccess.getFormsAndProcessesRule()); 
            pushFollow(FOLLOW_ruleFormsAndProcesses_in_entryRuleFormsAndProcesses180);
            ruleFormsAndProcesses();
            _fsp--;

             after(grammarAccess.getFormsAndProcessesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormsAndProcesses187); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:122:1: ruleFormsAndProcesses : ( ( rule__FormsAndProcesses__Group__0 ) ) ;
    public final void ruleFormsAndProcesses() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:126:2: ( ( ( rule__FormsAndProcesses__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:127:1: ( ( rule__FormsAndProcesses__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:127:1: ( ( rule__FormsAndProcesses__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:128:1: ( rule__FormsAndProcesses__Group__0 )
            {
             before(grammarAccess.getFormsAndProcessesAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:129:1: ( rule__FormsAndProcesses__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:129:2: rule__FormsAndProcesses__Group__0
            {
            pushFollow(FOLLOW_rule__FormsAndProcesses__Group__0_in_ruleFormsAndProcesses214);
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


    // $ANTLR start entryRuleMenu
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:141:1: entryRuleMenu : ruleMenu EOF ;
    public final void entryRuleMenu() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:141:15: ( ruleMenu EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:142:1: ruleMenu EOF
            {
             before(grammarAccess.getMenuRule()); 
            pushFollow(FOLLOW_ruleMenu_in_entryRuleMenu240);
            ruleMenu();
            _fsp--;

             after(grammarAccess.getMenuRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMenu247); 

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
    // $ANTLR end entryRuleMenu


    // $ANTLR start ruleMenu
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:149:1: ruleMenu : ( ( rule__Menu__Group__0 ) ) ;
    public final void ruleMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:153:2: ( ( ( rule__Menu__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:154:1: ( ( rule__Menu__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:154:1: ( ( rule__Menu__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:155:1: ( rule__Menu__Group__0 )
            {
             before(grammarAccess.getMenuAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:156:1: ( rule__Menu__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:156:2: rule__Menu__Group__0
            {
            pushFollow(FOLLOW_rule__Menu__Group__0_in_ruleMenu274);
            rule__Menu__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMenuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMenu


    // $ANTLR start entryRuleExternalReference
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:168:1: entryRuleExternalReference : ruleExternalReference EOF ;
    public final void entryRuleExternalReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:168:28: ( ruleExternalReference EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:169:1: ruleExternalReference EOF
            {
             before(grammarAccess.getExternalReferenceRule()); 
            pushFollow(FOLLOW_ruleExternalReference_in_entryRuleExternalReference300);
            ruleExternalReference();
            _fsp--;

             after(grammarAccess.getExternalReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalReference307); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:176:1: ruleExternalReference : ( ( rule__ExternalReference__Alternatives ) ) ;
    public final void ruleExternalReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:180:2: ( ( ( rule__ExternalReference__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:181:1: ( ( rule__ExternalReference__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:181:1: ( ( rule__ExternalReference__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:182:1: ( rule__ExternalReference__Alternatives )
            {
             before(grammarAccess.getExternalReferenceAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:183:1: ( rule__ExternalReference__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:183:2: rule__ExternalReference__Alternatives
            {
            pushFollow(FOLLOW_rule__ExternalReference__Alternatives_in_ruleExternalReference334);
            rule__ExternalReference__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start entryRuleDtoReference
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:195:1: entryRuleDtoReference : ruleDtoReference EOF ;
    public final void entryRuleDtoReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:195:23: ( ruleDtoReference EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:196:1: ruleDtoReference EOF
            {
             before(grammarAccess.getDtoReferenceRule()); 
            pushFollow(FOLLOW_ruleDtoReference_in_entryRuleDtoReference360);
            ruleDtoReference();
            _fsp--;

             after(grammarAccess.getDtoReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoReference367); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:203:1: ruleDtoReference : ( ( rule__DtoReference__Group__0 ) ) ;
    public final void ruleDtoReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:207:2: ( ( ( rule__DtoReference__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:208:1: ( ( rule__DtoReference__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:208:1: ( ( rule__DtoReference__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:209:1: ( rule__DtoReference__Group__0 )
            {
             before(grammarAccess.getDtoReferenceAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:210:1: ( rule__DtoReference__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:210:2: rule__DtoReference__Group__0
            {
            pushFollow(FOLLOW_rule__DtoReference__Group__0_in_ruleDtoReference394);
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


    // $ANTLR start entryRulePageReference
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:222:1: entryRulePageReference : rulePageReference EOF ;
    public final void entryRulePageReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:222:24: ( rulePageReference EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:223:1: rulePageReference EOF
            {
             before(grammarAccess.getPageReferenceRule()); 
            pushFollow(FOLLOW_rulePageReference_in_entryRulePageReference420);
            rulePageReference();
            _fsp--;

             after(grammarAccess.getPageReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageReference427); 

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
    // $ANTLR end entryRulePageReference


    // $ANTLR start rulePageReference
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:230:1: rulePageReference : ( ( rule__PageReference__Group__0 ) ) ;
    public final void rulePageReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:234:2: ( ( ( rule__PageReference__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:235:1: ( ( rule__PageReference__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:235:1: ( ( rule__PageReference__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:236:1: ( rule__PageReference__Group__0 )
            {
             before(grammarAccess.getPageReferenceAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:237:1: ( rule__PageReference__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:237:2: rule__PageReference__Group__0
            {
            pushFollow(FOLLOW_rule__PageReference__Group__0_in_rulePageReference454);
            rule__PageReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPageReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePageReference


    // $ANTLR start entryRuleServiceReference
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:249:1: entryRuleServiceReference : ruleServiceReference EOF ;
    public final void entryRuleServiceReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:249:27: ( ruleServiceReference EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:250:1: ruleServiceReference EOF
            {
             before(grammarAccess.getServiceReferenceRule()); 
            pushFollow(FOLLOW_ruleServiceReference_in_entryRuleServiceReference480);
            ruleServiceReference();
            _fsp--;

             after(grammarAccess.getServiceReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceReference487); 

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
    // $ANTLR end entryRuleServiceReference


    // $ANTLR start ruleServiceReference
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:257:1: ruleServiceReference : ( ( rule__ServiceReference__Group__0 ) ) ;
    public final void ruleServiceReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:261:2: ( ( ( rule__ServiceReference__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:262:1: ( ( rule__ServiceReference__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:262:1: ( ( rule__ServiceReference__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:263:1: ( rule__ServiceReference__Group__0 )
            {
             before(grammarAccess.getServiceReferenceAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:264:1: ( rule__ServiceReference__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:264:2: rule__ServiceReference__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceReference__Group__0_in_ruleServiceReference514);
            rule__ServiceReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getServiceReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleServiceReference


    // $ANTLR start entryRuleModelElementWithContext
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:276:1: entryRuleModelElementWithContext : ruleModelElementWithContext EOF ;
    public final void entryRuleModelElementWithContext() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:276:34: ( ruleModelElementWithContext EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:277:1: ruleModelElementWithContext EOF
            {
             before(grammarAccess.getModelElementWithContextRule()); 
            pushFollow(FOLLOW_ruleModelElementWithContext_in_entryRuleModelElementWithContext540);
            ruleModelElementWithContext();
            _fsp--;

             after(grammarAccess.getModelElementWithContextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElementWithContext547); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:284:1: ruleModelElementWithContext : ( ruleUIModelElement ) ;
    public final void ruleModelElementWithContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:288:2: ( ( ruleUIModelElement ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:289:1: ( ruleUIModelElement )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:289:1: ( ruleUIModelElement )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:290:1: ruleUIModelElement
            {
             before(grammarAccess.getModelElementWithContextAccess().getUIModelElementParserRuleCall()); 
            pushFollow(FOLLOW_ruleUIModelElement_in_ruleModelElementWithContext574);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:303:1: entryRuleUIModelElement : ruleUIModelElement EOF ;
    public final void entryRuleUIModelElement() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:303:25: ( ruleUIModelElement EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:304:1: ruleUIModelElement EOF
            {
             before(grammarAccess.getUIModelElementRule()); 
            pushFollow(FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement599);
            ruleUIModelElement();
            _fsp--;

             after(grammarAccess.getUIModelElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIModelElement606); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:311:1: ruleUIModelElement : ( ruleAbstractDialogue ) ;
    public final void ruleUIModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:315:2: ( ( ruleAbstractDialogue ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:316:1: ( ruleAbstractDialogue )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:316:1: ( ruleAbstractDialogue )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:317:1: ruleAbstractDialogue
            {
             before(grammarAccess.getUIModelElementAccess().getAbstractDialogueParserRuleCall()); 
            pushFollow(FOLLOW_ruleAbstractDialogue_in_ruleUIModelElement633);
            ruleAbstractDialogue();
            _fsp--;

             after(grammarAccess.getUIModelElementAccess().getAbstractDialogueParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start entryRuleAbstractDialogue
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:330:1: entryRuleAbstractDialogue : ruleAbstractDialogue EOF ;
    public final void entryRuleAbstractDialogue() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:330:27: ( ruleAbstractDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:331:1: ruleAbstractDialogue EOF
            {
             before(grammarAccess.getAbstractDialogueRule()); 
            pushFollow(FOLLOW_ruleAbstractDialogue_in_entryRuleAbstractDialogue658);
            ruleAbstractDialogue();
            _fsp--;

             after(grammarAccess.getAbstractDialogueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDialogue665); 

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
    // $ANTLR end entryRuleAbstractDialogue


    // $ANTLR start ruleAbstractDialogue
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:338:1: ruleAbstractDialogue : ( ( rule__AbstractDialogue__Alternatives ) ) ;
    public final void ruleAbstractDialogue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:342:2: ( ( ( rule__AbstractDialogue__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:343:1: ( ( rule__AbstractDialogue__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:343:1: ( ( rule__AbstractDialogue__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:344:1: ( rule__AbstractDialogue__Alternatives )
            {
             before(grammarAccess.getAbstractDialogueAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:345:1: ( rule__AbstractDialogue__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:345:2: rule__AbstractDialogue__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractDialogue__Alternatives_in_ruleAbstractDialogue692);
            rule__AbstractDialogue__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getAbstractDialogueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAbstractDialogue


    // $ANTLR start entryRuleView
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:357:1: entryRuleView : ruleView EOF ;
    public final void entryRuleView() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:357:15: ( ruleView EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:358:1: ruleView EOF
            {
             before(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView718);
            ruleView();
            _fsp--;

             after(grammarAccess.getViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView725); 

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
    // $ANTLR end entryRuleView


    // $ANTLR start ruleView
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:365:1: ruleView : ( ( rule__View__Group__0 ) ) ;
    public final void ruleView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:369:2: ( ( ( rule__View__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:370:1: ( ( rule__View__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:370:1: ( ( rule__View__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:371:1: ( rule__View__Group__0 )
            {
             before(grammarAccess.getViewAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:372:1: ( rule__View__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:372:2: rule__View__Group__0
            {
            pushFollow(FOLLOW_rule__View__Group__0_in_ruleView752);
            rule__View__Group__0();
            _fsp--;


            }

             after(grammarAccess.getViewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleView


    // $ANTLR start entryRuleMenuAction
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:384:1: entryRuleMenuAction : ruleMenuAction EOF ;
    public final void entryRuleMenuAction() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:384:21: ( ruleMenuAction EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:385:1: ruleMenuAction EOF
            {
             before(grammarAccess.getMenuActionRule()); 
            pushFollow(FOLLOW_ruleMenuAction_in_entryRuleMenuAction778);
            ruleMenuAction();
            _fsp--;

             after(grammarAccess.getMenuActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMenuAction785); 

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
    // $ANTLR end entryRuleMenuAction


    // $ANTLR start ruleMenuAction
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:392:1: ruleMenuAction : ( ( rule__MenuAction__Group__0 ) ) ;
    public final void ruleMenuAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:396:2: ( ( ( rule__MenuAction__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:397:1: ( ( rule__MenuAction__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:397:1: ( ( rule__MenuAction__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:398:1: ( rule__MenuAction__Group__0 )
            {
             before(grammarAccess.getMenuActionAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:399:1: ( rule__MenuAction__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:399:2: rule__MenuAction__Group__0
            {
            pushFollow(FOLLOW_rule__MenuAction__Group__0_in_ruleMenuAction812);
            rule__MenuAction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMenuActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMenuAction


    // $ANTLR start entryRuleAction
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:411:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:411:17: ( ruleAction EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:412:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction838);
            ruleAction();
            _fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction845); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:419:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:423:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:424:1: ( ( rule__Action__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:424:1: ( ( rule__Action__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:425:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:426:1: ( rule__Action__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:426:2: rule__Action__Group__0
            {
            pushFollow(FOLLOW_rule__Action__Group__0_in_ruleAction872);
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


    // $ANTLR start entryRulePage
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:438:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:438:15: ( rulePage EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:439:1: rulePage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage898);
            rulePage();
            _fsp--;

             after(grammarAccess.getPageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage905); 

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
    // $ANTLR end entryRulePage


    // $ANTLR start rulePage
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:446:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:450:2: ( ( ( rule__Page__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:451:1: ( ( rule__Page__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:451:1: ( ( rule__Page__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:452:1: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:453:1: ( rule__Page__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:453:2: rule__Page__Group__0
            {
            pushFollow(FOLLOW_rule__Page__Group__0_in_rulePage932);
            rule__Page__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePage


    // $ANTLR start entryRuleFormElement
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:465:1: entryRuleFormElement : ruleFormElement EOF ;
    public final void entryRuleFormElement() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:465:22: ( ruleFormElement EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:466:1: ruleFormElement EOF
            {
             before(grammarAccess.getFormElementRule()); 
            pushFollow(FOLLOW_ruleFormElement_in_entryRuleFormElement958);
            ruleFormElement();
            _fsp--;

             after(grammarAccess.getFormElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormElement965); 

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
            pushFollow(FOLLOW_rule__FormElement__Group__0_in_ruleFormElement992);
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


    // $ANTLR start entryRuleExpression
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:494:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:494:21: ( ruleExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:495:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1020);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1027); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:502:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:506:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:507:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:507:1: ( ( rule__Expression__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:508:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:509:1: ( rule__Expression__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:509:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression1054);
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


    // $ANTLR start entryRuleOperationExpression
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:521:1: entryRuleOperationExpression : ruleOperationExpression EOF ;
    public final void entryRuleOperationExpression() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:521:30: ( ruleOperationExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:522:1: ruleOperationExpression EOF
            {
             before(grammarAccess.getOperationExpressionRule()); 
            pushFollow(FOLLOW_ruleOperationExpression_in_entryRuleOperationExpression1080);
            ruleOperationExpression();
            _fsp--;

             after(grammarAccess.getOperationExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationExpression1087); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:529:1: ruleOperationExpression : ( ( rule__OperationExpression__Group__0 ) ) ;
    public final void ruleOperationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:533:2: ( ( ( rule__OperationExpression__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:534:1: ( ( rule__OperationExpression__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:534:1: ( ( rule__OperationExpression__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:535:1: ( rule__OperationExpression__Group__0 )
            {
             before(grammarAccess.getOperationExpressionAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:536:1: ( rule__OperationExpression__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:536:2: rule__OperationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__OperationExpression__Group__0_in_ruleOperationExpression1114);
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


    // $ANTLR start entryRuleStandardExpression
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:548:1: entryRuleStandardExpression : ruleStandardExpression EOF ;
    public final void entryRuleStandardExpression() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:548:29: ( ruleStandardExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:549:1: ruleStandardExpression EOF
            {
             before(grammarAccess.getStandardExpressionRule()); 
            pushFollow(FOLLOW_ruleStandardExpression_in_entryRuleStandardExpression1140);
            ruleStandardExpression();
            _fsp--;

             after(grammarAccess.getStandardExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStandardExpression1147); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:556:1: ruleStandardExpression : ( ( rule__StandardExpression__Group__0 ) ) ;
    public final void ruleStandardExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:560:2: ( ( ( rule__StandardExpression__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:561:1: ( ( rule__StandardExpression__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:561:1: ( ( rule__StandardExpression__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:562:1: ( rule__StandardExpression__Group__0 )
            {
             before(grammarAccess.getStandardExpressionAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:563:1: ( rule__StandardExpression__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:563:2: rule__StandardExpression__Group__0
            {
            pushFollow(FOLLOW_rule__StandardExpression__Group__0_in_ruleStandardExpression1174);
            rule__StandardExpression__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStandardExpressionAccess().getGroup()); 

            }


            }

        }
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:575:1: entryRuleServiceExpression : ruleServiceExpression EOF ;
    public final void entryRuleServiceExpression() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:575:28: ( ruleServiceExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:576:1: ruleServiceExpression EOF
            {
             before(grammarAccess.getServiceExpressionRule()); 
            pushFollow(FOLLOW_ruleServiceExpression_in_entryRuleServiceExpression1200);
            ruleServiceExpression();
            _fsp--;

             after(grammarAccess.getServiceExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceExpression1207); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:583:1: ruleServiceExpression : ( ( rule__ServiceExpression__Group__0 ) ) ;
    public final void ruleServiceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:587:2: ( ( ( rule__ServiceExpression__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:588:1: ( ( rule__ServiceExpression__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:588:1: ( ( rule__ServiceExpression__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:589:1: ( rule__ServiceExpression__Group__0 )
            {
             before(grammarAccess.getServiceExpressionAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:590:1: ( rule__ServiceExpression__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:590:2: rule__ServiceExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceExpression__Group__0_in_ruleServiceExpression1234);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:602:1: entryRuleNavigationExpression : ruleNavigationExpression EOF ;
    public final void entryRuleNavigationExpression() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:602:31: ( ruleNavigationExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:603:1: ruleNavigationExpression EOF
            {
             before(grammarAccess.getNavigationExpressionRule()); 
            pushFollow(FOLLOW_ruleNavigationExpression_in_entryRuleNavigationExpression1260);
            ruleNavigationExpression();
            _fsp--;

             after(grammarAccess.getNavigationExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigationExpression1267); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:610:1: ruleNavigationExpression : ( ( rule__NavigationExpression__Group__0 ) ) ;
    public final void ruleNavigationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:614:2: ( ( ( rule__NavigationExpression__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:615:1: ( ( rule__NavigationExpression__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:615:1: ( ( rule__NavigationExpression__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:616:1: ( rule__NavigationExpression__Group__0 )
            {
             before(grammarAccess.getNavigationExpressionAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:617:1: ( rule__NavigationExpression__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:617:2: rule__NavigationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NavigationExpression__Group__0_in_ruleNavigationExpression1294);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:629:1: entryRuleDtoPropertyReference : ruleDtoPropertyReference EOF ;
    public final void entryRuleDtoPropertyReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:629:31: ( ruleDtoPropertyReference EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:630:1: ruleDtoPropertyReference EOF
            {
             before(grammarAccess.getDtoPropertyReferenceRule()); 
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference1320);
            ruleDtoPropertyReference();
            _fsp--;

             after(grammarAccess.getDtoPropertyReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoPropertyReference1327); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:637:1: ruleDtoPropertyReference : ( ( rule__DtoPropertyReference__Group__0 ) ) ;
    public final void ruleDtoPropertyReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:641:2: ( ( ( rule__DtoPropertyReference__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:642:1: ( ( rule__DtoPropertyReference__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:642:1: ( ( rule__DtoPropertyReference__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:643:1: ( rule__DtoPropertyReference__Group__0 )
            {
             before(grammarAccess.getDtoPropertyReferenceAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:644:1: ( rule__DtoPropertyReference__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:644:2: rule__DtoPropertyReference__Group__0
            {
            pushFollow(FOLLOW_rule__DtoPropertyReference__Group__0_in_ruleDtoPropertyReference1354);
            rule__DtoPropertyReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDtoPropertyReferenceAccess().getGroup()); 

            }


            }

        }
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:656:1: entryRuleAssociationRoleReference : ruleAssociationRoleReference EOF ;
    public final void entryRuleAssociationRoleReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:656:35: ( ruleAssociationRoleReference EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:657:1: ruleAssociationRoleReference EOF
            {
             before(grammarAccess.getAssociationRoleReferenceRule()); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference1380);
            ruleAssociationRoleReference();
            _fsp--;

             after(grammarAccess.getAssociationRoleReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociationRoleReference1387); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:664:1: ruleAssociationRoleReference : ( ( rule__AssociationRoleReference__NameAssignment ) ) ;
    public final void ruleAssociationRoleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:668:2: ( ( ( rule__AssociationRoleReference__NameAssignment ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:669:1: ( ( rule__AssociationRoleReference__NameAssignment ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:669:1: ( ( rule__AssociationRoleReference__NameAssignment ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:670:1: ( rule__AssociationRoleReference__NameAssignment )
            {
             before(grammarAccess.getAssociationRoleReferenceAccess().getNameAssignment()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:671:1: ( rule__AssociationRoleReference__NameAssignment )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:671:2: rule__AssociationRoleReference__NameAssignment
            {
            pushFollow(FOLLOW_rule__AssociationRoleReference__NameAssignment_in_ruleAssociationRoleReference1414);
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


    // $ANTLR start ruleProcessType
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:684:1: ruleProcessType : ( ( rule__ProcessType__Alternatives ) ) ;
    public final void ruleProcessType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:688:1: ( ( ( rule__ProcessType__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:689:1: ( ( rule__ProcessType__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:689:1: ( ( rule__ProcessType__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:690:1: ( rule__ProcessType__Alternatives )
            {
             before(grammarAccess.getProcessTypeAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:691:1: ( rule__ProcessType__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:691:2: rule__ProcessType__Alternatives
            {
            pushFollow(FOLLOW_rule__ProcessType__Alternatives_in_ruleProcessType1451);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:703:1: ruleProcessTypeLink : ( ( 'link' ) ) ;
    public final void ruleProcessTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:707:1: ( ( ( 'link' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:708:1: ( ( 'link' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:708:1: ( ( 'link' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:709:1: ( 'link' )
            {
             before(grammarAccess.getProcessTypeLinkAccess().getLINKEnumLiteralDeclaration()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:710:1: ( 'link' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:710:3: 'link'
            {
            match(input,11,FOLLOW_11_in_ruleProcessTypeLink1488); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:723:1: ruleExpressionType : ( ( rule__ExpressionType__Alternatives ) ) ;
    public final void ruleExpressionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:727:1: ( ( ( rule__ExpressionType__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:728:1: ( ( rule__ExpressionType__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:728:1: ( ( rule__ExpressionType__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:729:1: ( rule__ExpressionType__Alternatives )
            {
             before(grammarAccess.getExpressionTypeAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:730:1: ( rule__ExpressionType__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:730:2: rule__ExpressionType__Alternatives
            {
            pushFollow(FOLLOW_rule__ExpressionType__Alternatives_in_ruleExpressionType1526);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:741:1: rule__PresentationModel__Alternatives : ( ( ruleApplicationModel ) | ( ruleFormsAndProcesses ) );
    public final void rule__PresentationModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:745:1: ( ( ruleApplicationModel ) | ( ruleFormsAndProcesses ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==23) ) {
                    alt1=1;
                }
                else if ( (LA1_1==25) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("741:1: rule__PresentationModel__Alternatives : ( ( ruleApplicationModel ) | ( ruleFormsAndProcesses ) );", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("741:1: rule__PresentationModel__Alternatives : ( ( ruleApplicationModel ) | ( ruleFormsAndProcesses ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:746:1: ( ruleApplicationModel )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:746:1: ( ruleApplicationModel )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:747:1: ruleApplicationModel
                    {
                     before(grammarAccess.getPresentationModelAccess().getApplicationModelParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleApplicationModel_in_rule__PresentationModel__Alternatives1561);
                    ruleApplicationModel();
                    _fsp--;

                     after(grammarAccess.getPresentationModelAccess().getApplicationModelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:752:6: ( ruleFormsAndProcesses )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:752:6: ( ruleFormsAndProcesses )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:753:1: ruleFormsAndProcesses
                    {
                     before(grammarAccess.getPresentationModelAccess().getFormsAndProcessesParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFormsAndProcesses_in_rule__PresentationModel__Alternatives1578);
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


    // $ANTLR start rule__ExternalReference__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:763:1: rule__ExternalReference__Alternatives : ( ( ruleDtoReference ) | ( rulePageReference ) | ( ruleServiceReference ) );
    public final void rule__ExternalReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:767:1: ( ( ruleDtoReference ) | ( rulePageReference ) | ( ruleServiceReference ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 31:
                        {
                        alt2=2;
                        }
                        break;
                    case 30:
                        {
                        alt2=1;
                        }
                        break;
                    case 32:
                        {
                        alt2=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("763:1: rule__ExternalReference__Alternatives : ( ( ruleDtoReference ) | ( rulePageReference ) | ( ruleServiceReference ) );", 2, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("763:1: rule__ExternalReference__Alternatives : ( ( ruleDtoReference ) | ( rulePageReference ) | ( ruleServiceReference ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("763:1: rule__ExternalReference__Alternatives : ( ( ruleDtoReference ) | ( rulePageReference ) | ( ruleServiceReference ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:768:1: ( ruleDtoReference )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:768:1: ( ruleDtoReference )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:769:1: ruleDtoReference
                    {
                     before(grammarAccess.getExternalReferenceAccess().getDtoReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDtoReference_in_rule__ExternalReference__Alternatives1610);
                    ruleDtoReference();
                    _fsp--;

                     after(grammarAccess.getExternalReferenceAccess().getDtoReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:774:6: ( rulePageReference )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:774:6: ( rulePageReference )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:775:1: rulePageReference
                    {
                     before(grammarAccess.getExternalReferenceAccess().getPageReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePageReference_in_rule__ExternalReference__Alternatives1627);
                    rulePageReference();
                    _fsp--;

                     after(grammarAccess.getExternalReferenceAccess().getPageReferenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:780:6: ( ruleServiceReference )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:780:6: ( ruleServiceReference )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:781:1: ruleServiceReference
                    {
                     before(grammarAccess.getExternalReferenceAccess().getServiceReferenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleServiceReference_in_rule__ExternalReference__Alternatives1644);
                    ruleServiceReference();
                    _fsp--;

                     after(grammarAccess.getExternalReferenceAccess().getServiceReferenceParserRuleCall_2()); 

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
    // $ANTLR end rule__ExternalReference__Alternatives


    // $ANTLR start rule__AbstractDialogue__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:791:1: rule__AbstractDialogue__Alternatives : ( ( ruleView ) | ( rulePage ) );
    public final void rule__AbstractDialogue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:795:1: ( ( ruleView ) | ( rulePage ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING||LA3_0==33) ) {
                alt3=1;
            }
            else if ( (LA3_0==31) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("791:1: rule__AbstractDialogue__Alternatives : ( ( ruleView ) | ( rulePage ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:796:1: ( ruleView )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:796:1: ( ruleView )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:797:1: ruleView
                    {
                     before(grammarAccess.getAbstractDialogueAccess().getViewParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleView_in_rule__AbstractDialogue__Alternatives1676);
                    ruleView();
                    _fsp--;

                     after(grammarAccess.getAbstractDialogueAccess().getViewParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:802:6: ( rulePage )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:802:6: ( rulePage )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:803:1: rulePage
                    {
                     before(grammarAccess.getAbstractDialogueAccess().getPageParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePage_in_rule__AbstractDialogue__Alternatives1693);
                    rulePage();
                    _fsp--;

                     after(grammarAccess.getAbstractDialogueAccess().getPageParserRuleCall_1()); 

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
    // $ANTLR end rule__AbstractDialogue__Alternatives


    // $ANTLR start rule__View__Alternatives_3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:813:1: rule__View__Alternatives_3 : ( ( ( rule__View__Group_3_0__0 ) ) | ( ( rule__View__Group_3_1__0 ) ) );
    public final void rule__View__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:817:1: ( ( ( rule__View__Group_3_0__0 ) ) | ( ( rule__View__Group_3_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34) ) {
                alt4=1;
            }
            else if ( (LA4_0==36) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("813:1: rule__View__Alternatives_3 : ( ( ( rule__View__Group_3_0__0 ) ) | ( ( rule__View__Group_3_1__0 ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:818:1: ( ( rule__View__Group_3_0__0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:818:1: ( ( rule__View__Group_3_0__0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:819:1: ( rule__View__Group_3_0__0 )
                    {
                     before(grammarAccess.getViewAccess().getGroup_3_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:820:1: ( rule__View__Group_3_0__0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:820:2: rule__View__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__View__Group_3_0__0_in_rule__View__Alternatives_31725);
                    rule__View__Group_3_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getViewAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:824:6: ( ( rule__View__Group_3_1__0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:824:6: ( ( rule__View__Group_3_1__0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:825:1: ( rule__View__Group_3_1__0 )
                    {
                     before(grammarAccess.getViewAccess().getGroup_3_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:826:1: ( rule__View__Group_3_1__0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:826:2: rule__View__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__View__Group_3_1__0_in_rule__View__Alternatives_31743);
                    rule__View__Group_3_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getViewAccess().getGroup_3_1()); 

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
    // $ANTLR end rule__View__Alternatives_3


    // $ANTLR start rule__MenuAction__Alternatives_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:835:1: rule__MenuAction__Alternatives_4 : ( ( ( rule__MenuAction__Alternatives_4_0 ) ) | ( ( rule__MenuAction__ContextExpAssignment_4_1 ) ) );
    public final void rule__MenuAction__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:839:1: ( ( ( rule__MenuAction__Alternatives_4_0 ) ) | ( ( rule__MenuAction__ContextExpAssignment_4_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11||(LA5_0>=13 && LA5_0<=20)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=21 && LA5_0<=22)||LA5_0==32||(LA5_0>=42 && LA5_0<=43)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("835:1: rule__MenuAction__Alternatives_4 : ( ( ( rule__MenuAction__Alternatives_4_0 ) ) | ( ( rule__MenuAction__ContextExpAssignment_4_1 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:840:1: ( ( rule__MenuAction__Alternatives_4_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:840:1: ( ( rule__MenuAction__Alternatives_4_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:841:1: ( rule__MenuAction__Alternatives_4_0 )
                    {
                     before(grammarAccess.getMenuActionAccess().getAlternatives_4_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:842:1: ( rule__MenuAction__Alternatives_4_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:842:2: rule__MenuAction__Alternatives_4_0
                    {
                    pushFollow(FOLLOW_rule__MenuAction__Alternatives_4_0_in_rule__MenuAction__Alternatives_41776);
                    rule__MenuAction__Alternatives_4_0();
                    _fsp--;


                    }

                     after(grammarAccess.getMenuActionAccess().getAlternatives_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:846:6: ( ( rule__MenuAction__ContextExpAssignment_4_1 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:846:6: ( ( rule__MenuAction__ContextExpAssignment_4_1 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:847:1: ( rule__MenuAction__ContextExpAssignment_4_1 )
                    {
                     before(grammarAccess.getMenuActionAccess().getContextExpAssignment_4_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:848:1: ( rule__MenuAction__ContextExpAssignment_4_1 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:848:2: rule__MenuAction__ContextExpAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__MenuAction__ContextExpAssignment_4_1_in_rule__MenuAction__Alternatives_41794);
                    rule__MenuAction__ContextExpAssignment_4_1();
                    _fsp--;


                    }

                     after(grammarAccess.getMenuActionAccess().getContextExpAssignment_4_1()); 

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
    // $ANTLR end rule__MenuAction__Alternatives_4


    // $ANTLR start rule__MenuAction__Alternatives_4_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:857:1: rule__MenuAction__Alternatives_4_0 : ( ( ( rule__MenuAction__TypeAssignment_4_0_0 ) ) | ( ( rule__MenuAction__Group_4_0_1__0 ) ) );
    public final void rule__MenuAction__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:861:1: ( ( ( rule__MenuAction__TypeAssignment_4_0_0 ) ) | ( ( rule__MenuAction__Group_4_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=13 && LA6_0<=20)) ) {
                alt6=1;
            }
            else if ( (LA6_0==11) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("857:1: rule__MenuAction__Alternatives_4_0 : ( ( ( rule__MenuAction__TypeAssignment_4_0_0 ) ) | ( ( rule__MenuAction__Group_4_0_1__0 ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:862:1: ( ( rule__MenuAction__TypeAssignment_4_0_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:862:1: ( ( rule__MenuAction__TypeAssignment_4_0_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:863:1: ( rule__MenuAction__TypeAssignment_4_0_0 )
                    {
                     before(grammarAccess.getMenuActionAccess().getTypeAssignment_4_0_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:864:1: ( rule__MenuAction__TypeAssignment_4_0_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:864:2: rule__MenuAction__TypeAssignment_4_0_0
                    {
                    pushFollow(FOLLOW_rule__MenuAction__TypeAssignment_4_0_0_in_rule__MenuAction__Alternatives_4_01827);
                    rule__MenuAction__TypeAssignment_4_0_0();
                    _fsp--;


                    }

                     after(grammarAccess.getMenuActionAccess().getTypeAssignment_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:868:6: ( ( rule__MenuAction__Group_4_0_1__0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:868:6: ( ( rule__MenuAction__Group_4_0_1__0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:869:1: ( rule__MenuAction__Group_4_0_1__0 )
                    {
                     before(grammarAccess.getMenuActionAccess().getGroup_4_0_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:870:1: ( rule__MenuAction__Group_4_0_1__0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:870:2: rule__MenuAction__Group_4_0_1__0
                    {
                    pushFollow(FOLLOW_rule__MenuAction__Group_4_0_1__0_in_rule__MenuAction__Alternatives_4_01845);
                    rule__MenuAction__Group_4_0_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMenuActionAccess().getGroup_4_0_1()); 

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
    // $ANTLR end rule__MenuAction__Alternatives_4_0


    // $ANTLR start rule__Action__Alternatives_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:879:1: rule__Action__Alternatives_4 : ( ( ( rule__Action__Alternatives_4_0 ) ) | ( ( rule__Action__ContextExpAssignment_4_1 ) ) );
    public final void rule__Action__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:883:1: ( ( ( rule__Action__Alternatives_4_0 ) ) | ( ( rule__Action__ContextExpAssignment_4_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11||(LA7_0>=13 && LA7_0<=20)) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=21 && LA7_0<=22)||LA7_0==32||(LA7_0>=42 && LA7_0<=43)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("879:1: rule__Action__Alternatives_4 : ( ( ( rule__Action__Alternatives_4_0 ) ) | ( ( rule__Action__ContextExpAssignment_4_1 ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:884:1: ( ( rule__Action__Alternatives_4_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:884:1: ( ( rule__Action__Alternatives_4_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:885:1: ( rule__Action__Alternatives_4_0 )
                    {
                     before(grammarAccess.getActionAccess().getAlternatives_4_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:886:1: ( rule__Action__Alternatives_4_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:886:2: rule__Action__Alternatives_4_0
                    {
                    pushFollow(FOLLOW_rule__Action__Alternatives_4_0_in_rule__Action__Alternatives_41878);
                    rule__Action__Alternatives_4_0();
                    _fsp--;


                    }

                     after(grammarAccess.getActionAccess().getAlternatives_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:890:6: ( ( rule__Action__ContextExpAssignment_4_1 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:890:6: ( ( rule__Action__ContextExpAssignment_4_1 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:891:1: ( rule__Action__ContextExpAssignment_4_1 )
                    {
                     before(grammarAccess.getActionAccess().getContextExpAssignment_4_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:892:1: ( rule__Action__ContextExpAssignment_4_1 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:892:2: rule__Action__ContextExpAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__Action__ContextExpAssignment_4_1_in_rule__Action__Alternatives_41896);
                    rule__Action__ContextExpAssignment_4_1();
                    _fsp--;


                    }

                     after(grammarAccess.getActionAccess().getContextExpAssignment_4_1()); 

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
    // $ANTLR end rule__Action__Alternatives_4


    // $ANTLR start rule__Action__Alternatives_4_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:901:1: rule__Action__Alternatives_4_0 : ( ( ( rule__Action__TypeAssignment_4_0_0 ) ) | ( ( rule__Action__Group_4_0_1__0 ) ) );
    public final void rule__Action__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:905:1: ( ( ( rule__Action__TypeAssignment_4_0_0 ) ) | ( ( rule__Action__Group_4_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=13 && LA8_0<=20)) ) {
                alt8=1;
            }
            else if ( (LA8_0==11) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("901:1: rule__Action__Alternatives_4_0 : ( ( ( rule__Action__TypeAssignment_4_0_0 ) ) | ( ( rule__Action__Group_4_0_1__0 ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:906:1: ( ( rule__Action__TypeAssignment_4_0_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:906:1: ( ( rule__Action__TypeAssignment_4_0_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:907:1: ( rule__Action__TypeAssignment_4_0_0 )
                    {
                     before(grammarAccess.getActionAccess().getTypeAssignment_4_0_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:908:1: ( rule__Action__TypeAssignment_4_0_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:908:2: rule__Action__TypeAssignment_4_0_0
                    {
                    pushFollow(FOLLOW_rule__Action__TypeAssignment_4_0_0_in_rule__Action__Alternatives_4_01929);
                    rule__Action__TypeAssignment_4_0_0();
                    _fsp--;


                    }

                     after(grammarAccess.getActionAccess().getTypeAssignment_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:912:6: ( ( rule__Action__Group_4_0_1__0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:912:6: ( ( rule__Action__Group_4_0_1__0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:913:1: ( rule__Action__Group_4_0_1__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_4_0_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:914:1: ( rule__Action__Group_4_0_1__0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:914:2: rule__Action__Group_4_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_4_0_1__0_in_rule__Action__Alternatives_4_01947);
                    rule__Action__Group_4_0_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getActionAccess().getGroup_4_0_1()); 

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
    // $ANTLR end rule__Action__Alternatives_4_0


    // $ANTLR start rule__FormElement__Alternatives_3_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:923:1: rule__FormElement__Alternatives_3_1 : ( ( ( rule__FormElement__ReadonlyAssignment_3_1_0 ) ) | ( 'false' ) );
    public final void rule__FormElement__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:927:1: ( ( ( rule__FormElement__ReadonlyAssignment_3_1_0 ) ) | ( 'false' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==47) ) {
                alt9=1;
            }
            else if ( (LA9_0==12) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("923:1: rule__FormElement__Alternatives_3_1 : ( ( ( rule__FormElement__ReadonlyAssignment_3_1_0 ) ) | ( 'false' ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:928:1: ( ( rule__FormElement__ReadonlyAssignment_3_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:928:1: ( ( rule__FormElement__ReadonlyAssignment_3_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:929:1: ( rule__FormElement__ReadonlyAssignment_3_1_0 )
                    {
                     before(grammarAccess.getFormElementAccess().getReadonlyAssignment_3_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:930:1: ( rule__FormElement__ReadonlyAssignment_3_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:930:2: rule__FormElement__ReadonlyAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_rule__FormElement__ReadonlyAssignment_3_1_0_in_rule__FormElement__Alternatives_3_11980);
                    rule__FormElement__ReadonlyAssignment_3_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getFormElementAccess().getReadonlyAssignment_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:934:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:934:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:935:1: 'false'
                    {
                     before(grammarAccess.getFormElementAccess().getFalseKeyword_3_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__FormElement__Alternatives_3_11999); 
                     after(grammarAccess.getFormElementAccess().getFalseKeyword_3_1_1()); 

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
    // $ANTLR end rule__FormElement__Alternatives_3_1


    // $ANTLR start rule__Expression__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:948:1: rule__Expression__Alternatives : ( ( ruleServiceExpression ) | ( ruleNavigationExpression ) | ( ruleStandardExpression ) | ( ruleOperationExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:952:1: ( ( ruleServiceExpression ) | ( ruleNavigationExpression ) | ( ruleStandardExpression ) | ( ruleOperationExpression ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt10=1;
                }
                break;
            case 43:
                {
                alt10=2;
                }
                break;
            case 21:
            case 22:
                {
                alt10=3;
                }
                break;
            case 42:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("948:1: rule__Expression__Alternatives : ( ( ruleServiceExpression ) | ( ruleNavigationExpression ) | ( ruleStandardExpression ) | ( ruleOperationExpression ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:953:1: ( ruleServiceExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:953:1: ( ruleServiceExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:954:1: ruleServiceExpression
                    {
                     before(grammarAccess.getExpressionAccess().getServiceExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleServiceExpression_in_rule__Expression__Alternatives2034);
                    ruleServiceExpression();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getServiceExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:959:6: ( ruleNavigationExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:959:6: ( ruleNavigationExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:960:1: ruleNavigationExpression
                    {
                     before(grammarAccess.getExpressionAccess().getNavigationExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNavigationExpression_in_rule__Expression__Alternatives2051);
                    ruleNavigationExpression();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getNavigationExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:965:6: ( ruleStandardExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:965:6: ( ruleStandardExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:966:1: ruleStandardExpression
                    {
                     before(grammarAccess.getExpressionAccess().getStandardExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStandardExpression_in_rule__Expression__Alternatives2068);
                    ruleStandardExpression();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getStandardExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:971:6: ( ruleOperationExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:971:6: ( ruleOperationExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:972:1: ruleOperationExpression
                    {
                     before(grammarAccess.getExpressionAccess().getOperationExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleOperationExpression_in_rule__Expression__Alternatives2085);
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


    // $ANTLR start rule__ProcessType__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:982:1: rule__ProcessType__Alternatives : ( ( ( 'new' ) ) | ( ( 'save' ) ) | ( ( 'edit' ) ) | ( ( 'delete' ) ) | ( ( 'cancel' ) ) | ( ( 'removefrom' ) ) | ( ( 'addto' ) ) | ( ( 'custom' ) ) );
    public final void rule__ProcessType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:986:1: ( ( ( 'new' ) ) | ( ( 'save' ) ) | ( ( 'edit' ) ) | ( ( 'delete' ) ) | ( ( 'cancel' ) ) | ( ( 'removefrom' ) ) | ( ( 'addto' ) ) | ( ( 'custom' ) ) )
            int alt11=8;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt11=1;
                }
                break;
            case 14:
                {
                alt11=2;
                }
                break;
            case 15:
                {
                alt11=3;
                }
                break;
            case 16:
                {
                alt11=4;
                }
                break;
            case 17:
                {
                alt11=5;
                }
                break;
            case 18:
                {
                alt11=6;
                }
                break;
            case 19:
                {
                alt11=7;
                }
                break;
            case 20:
                {
                alt11=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("982:1: rule__ProcessType__Alternatives : ( ( ( 'new' ) ) | ( ( 'save' ) ) | ( ( 'edit' ) ) | ( ( 'delete' ) ) | ( ( 'cancel' ) ) | ( ( 'removefrom' ) ) | ( ( 'addto' ) ) | ( ( 'custom' ) ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:987:1: ( ( 'new' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:987:1: ( ( 'new' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:988:1: ( 'new' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:989:1: ( 'new' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:989:3: 'new'
                    {
                    match(input,13,FOLLOW_13_in_rule__ProcessType__Alternatives2118); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:994:6: ( ( 'save' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:994:6: ( ( 'save' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:995:1: ( 'save' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:996:1: ( 'save' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:996:3: 'save'
                    {
                    match(input,14,FOLLOW_14_in_rule__ProcessType__Alternatives2139); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1001:6: ( ( 'edit' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1001:6: ( ( 'edit' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1002:1: ( 'edit' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1003:1: ( 'edit' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1003:3: 'edit'
                    {
                    match(input,15,FOLLOW_15_in_rule__ProcessType__Alternatives2160); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1008:6: ( ( 'delete' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1008:6: ( ( 'delete' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1009:1: ( 'delete' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1010:1: ( 'delete' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1010:3: 'delete'
                    {
                    match(input,16,FOLLOW_16_in_rule__ProcessType__Alternatives2181); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getDELETEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1015:6: ( ( 'cancel' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1015:6: ( ( 'cancel' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1016:1: ( 'cancel' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getCANCELEnumLiteralDeclaration_4()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1017:1: ( 'cancel' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1017:3: 'cancel'
                    {
                    match(input,17,FOLLOW_17_in_rule__ProcessType__Alternatives2202); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getCANCELEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1022:6: ( ( 'removefrom' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1022:6: ( ( 'removefrom' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1023:1: ( 'removefrom' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getREMOVEFROMEnumLiteralDeclaration_5()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1024:1: ( 'removefrom' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1024:3: 'removefrom'
                    {
                    match(input,18,FOLLOW_18_in_rule__ProcessType__Alternatives2223); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getREMOVEFROMEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1029:6: ( ( 'addto' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1029:6: ( ( 'addto' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1030:1: ( 'addto' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getADDTOEnumLiteralDeclaration_6()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1031:1: ( 'addto' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1031:3: 'addto'
                    {
                    match(input,19,FOLLOW_19_in_rule__ProcessType__Alternatives2244); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getADDTOEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1036:6: ( ( 'custom' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1036:6: ( ( 'custom' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1037:1: ( 'custom' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getCUSTOMEnumLiteralDeclaration_7()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1038:1: ( 'custom' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1038:3: 'custom'
                    {
                    match(input,20,FOLLOW_20_in_rule__ProcessType__Alternatives2265); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getCUSTOMEnumLiteralDeclaration_7()); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1048:1: rule__ExpressionType__Alternatives : ( ( ( 'all' ) ) | ( ( 'find' ) ) );
    public final void rule__ExpressionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1052:1: ( ( ( 'all' ) ) | ( ( 'find' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==22) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1048:1: rule__ExpressionType__Alternatives : ( ( ( 'all' ) ) | ( ( 'find' ) ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1053:1: ( ( 'all' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1053:1: ( ( 'all' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1054:1: ( 'all' )
                    {
                     before(grammarAccess.getExpressionTypeAccess().getALLEnumLiteralDeclaration_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1055:1: ( 'all' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1055:3: 'all'
                    {
                    match(input,21,FOLLOW_21_in_rule__ExpressionType__Alternatives2301); 

                    }

                     after(grammarAccess.getExpressionTypeAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1060:6: ( ( 'find' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1060:6: ( ( 'find' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1061:1: ( 'find' )
                    {
                     before(grammarAccess.getExpressionTypeAccess().getFINDEnumLiteralDeclaration_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1062:1: ( 'find' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1062:3: 'find'
                    {
                    match(input,22,FOLLOW_22_in_rule__ExpressionType__Alternatives2322); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1074:1: rule__ApplicationModel__Group__0 : ( ( rule__ApplicationModel__DescriptionAssignment_0 )? ) rule__ApplicationModel__Group__1 ;
    public final void rule__ApplicationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1078:1: ( ( ( rule__ApplicationModel__DescriptionAssignment_0 )? ) rule__ApplicationModel__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1079:1: ( ( rule__ApplicationModel__DescriptionAssignment_0 )? ) rule__ApplicationModel__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1079:1: ( ( rule__ApplicationModel__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1080:1: ( rule__ApplicationModel__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getApplicationModelAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1081:1: ( rule__ApplicationModel__DescriptionAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1081:2: rule__ApplicationModel__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ApplicationModel__DescriptionAssignment_0_in_rule__ApplicationModel__Group__02359);
                    rule__ApplicationModel__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationModelAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ApplicationModel__Group__1_in_rule__ApplicationModel__Group__02369);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1092:1: rule__ApplicationModel__Group__1 : ( 'application' ) rule__ApplicationModel__Group__2 ;
    public final void rule__ApplicationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1096:1: ( ( 'application' ) rule__ApplicationModel__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1097:1: ( 'application' ) rule__ApplicationModel__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1097:1: ( 'application' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1098:1: 'application'
            {
             before(grammarAccess.getApplicationModelAccess().getApplicationKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__ApplicationModel__Group__12398); 
             after(grammarAccess.getApplicationModelAccess().getApplicationKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ApplicationModel__Group__2_in_rule__ApplicationModel__Group__12408);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1112:1: rule__ApplicationModel__Group__2 : ( ( rule__ApplicationModel__NameAssignment_2 ) ) rule__ApplicationModel__Group__3 ;
    public final void rule__ApplicationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1116:1: ( ( ( rule__ApplicationModel__NameAssignment_2 ) ) rule__ApplicationModel__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1117:1: ( ( rule__ApplicationModel__NameAssignment_2 ) ) rule__ApplicationModel__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1117:1: ( ( rule__ApplicationModel__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1118:1: ( rule__ApplicationModel__NameAssignment_2 )
            {
             before(grammarAccess.getApplicationModelAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1119:1: ( rule__ApplicationModel__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1119:2: rule__ApplicationModel__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ApplicationModel__NameAssignment_2_in_rule__ApplicationModel__Group__22436);
            rule__ApplicationModel__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getApplicationModelAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ApplicationModel__Group__3_in_rule__ApplicationModel__Group__22445);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1130:1: rule__ApplicationModel__Group__3 : ( ';' ) rule__ApplicationModel__Group__4 ;
    public final void rule__ApplicationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1134:1: ( ( ';' ) rule__ApplicationModel__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1135:1: ( ';' ) rule__ApplicationModel__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1135:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1136:1: ';'
            {
             before(grammarAccess.getApplicationModelAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__ApplicationModel__Group__32474); 
             after(grammarAccess.getApplicationModelAccess().getSemicolonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ApplicationModel__Group__4_in_rule__ApplicationModel__Group__32484);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1150:1: rule__ApplicationModel__Group__4 : ( ( rule__ApplicationModel__ExternalReferencesAssignment_4 )* ) rule__ApplicationModel__Group__5 ;
    public final void rule__ApplicationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1154:1: ( ( ( rule__ApplicationModel__ExternalReferencesAssignment_4 )* ) rule__ApplicationModel__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1155:1: ( ( rule__ApplicationModel__ExternalReferencesAssignment_4 )* ) rule__ApplicationModel__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1155:1: ( ( rule__ApplicationModel__ExternalReferencesAssignment_4 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1156:1: ( rule__ApplicationModel__ExternalReferencesAssignment_4 )*
            {
             before(grammarAccess.getApplicationModelAccess().getExternalReferencesAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1157:1: ( rule__ApplicationModel__ExternalReferencesAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1157:2: rule__ApplicationModel__ExternalReferencesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ApplicationModel__ExternalReferencesAssignment_4_in_rule__ApplicationModel__Group__42512);
            	    rule__ApplicationModel__ExternalReferencesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getApplicationModelAccess().getExternalReferencesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ApplicationModel__Group__5_in_rule__ApplicationModel__Group__42522);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1168:1: rule__ApplicationModel__Group__5 : ( ( rule__ApplicationModel__MainMenuAssignment_5 ) ) ;
    public final void rule__ApplicationModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1172:1: ( ( ( rule__ApplicationModel__MainMenuAssignment_5 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1173:1: ( ( rule__ApplicationModel__MainMenuAssignment_5 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1173:1: ( ( rule__ApplicationModel__MainMenuAssignment_5 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1174:1: ( rule__ApplicationModel__MainMenuAssignment_5 )
            {
             before(grammarAccess.getApplicationModelAccess().getMainMenuAssignment_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1175:1: ( rule__ApplicationModel__MainMenuAssignment_5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1175:2: rule__ApplicationModel__MainMenuAssignment_5
            {
            pushFollow(FOLLOW_rule__ApplicationModel__MainMenuAssignment_5_in_rule__ApplicationModel__Group__52550);
            rule__ApplicationModel__MainMenuAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getApplicationModelAccess().getMainMenuAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start rule__FormsAndProcesses__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1197:1: rule__FormsAndProcesses__Group__0 : ( ( rule__FormsAndProcesses__DescriptionAssignment_0 )? ) rule__FormsAndProcesses__Group__1 ;
    public final void rule__FormsAndProcesses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1201:1: ( ( ( rule__FormsAndProcesses__DescriptionAssignment_0 )? ) rule__FormsAndProcesses__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1202:1: ( ( rule__FormsAndProcesses__DescriptionAssignment_0 )? ) rule__FormsAndProcesses__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1202:1: ( ( rule__FormsAndProcesses__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1203:1: ( rule__FormsAndProcesses__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getFormsAndProcessesAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1204:1: ( rule__FormsAndProcesses__DescriptionAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1204:2: rule__FormsAndProcesses__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FormsAndProcesses__DescriptionAssignment_0_in_rule__FormsAndProcesses__Group__02596);
                    rule__FormsAndProcesses__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormsAndProcessesAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__FormsAndProcesses__Group__1_in_rule__FormsAndProcesses__Group__02606);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1215:1: rule__FormsAndProcesses__Group__1 : ( 'presentation' ) rule__FormsAndProcesses__Group__2 ;
    public final void rule__FormsAndProcesses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1219:1: ( ( 'presentation' ) rule__FormsAndProcesses__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1220:1: ( 'presentation' ) rule__FormsAndProcesses__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1220:1: ( 'presentation' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1221:1: 'presentation'
            {
             before(grammarAccess.getFormsAndProcessesAccess().getPresentationKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__FormsAndProcesses__Group__12635); 
             after(grammarAccess.getFormsAndProcessesAccess().getPresentationKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__FormsAndProcesses__Group__2_in_rule__FormsAndProcesses__Group__12645);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1235:1: rule__FormsAndProcesses__Group__2 : ( ( rule__FormsAndProcesses__NameAssignment_2 ) ) rule__FormsAndProcesses__Group__3 ;
    public final void rule__FormsAndProcesses__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1239:1: ( ( ( rule__FormsAndProcesses__NameAssignment_2 ) ) rule__FormsAndProcesses__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1240:1: ( ( rule__FormsAndProcesses__NameAssignment_2 ) ) rule__FormsAndProcesses__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1240:1: ( ( rule__FormsAndProcesses__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1241:1: ( rule__FormsAndProcesses__NameAssignment_2 )
            {
             before(grammarAccess.getFormsAndProcessesAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1242:1: ( rule__FormsAndProcesses__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1242:2: rule__FormsAndProcesses__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__FormsAndProcesses__NameAssignment_2_in_rule__FormsAndProcesses__Group__22673);
            rule__FormsAndProcesses__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFormsAndProcessesAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__FormsAndProcesses__Group__3_in_rule__FormsAndProcesses__Group__22682);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1253:1: rule__FormsAndProcesses__Group__3 : ( ';' ) rule__FormsAndProcesses__Group__4 ;
    public final void rule__FormsAndProcesses__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1257:1: ( ( ';' ) rule__FormsAndProcesses__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1258:1: ( ';' ) rule__FormsAndProcesses__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1258:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1259:1: ';'
            {
             before(grammarAccess.getFormsAndProcessesAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__FormsAndProcesses__Group__32711); 
             after(grammarAccess.getFormsAndProcessesAccess().getSemicolonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__FormsAndProcesses__Group__4_in_rule__FormsAndProcesses__Group__32721);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1273:1: rule__FormsAndProcesses__Group__4 : ( ( rule__FormsAndProcesses__ExternalReferencesAssignment_4 )* ) rule__FormsAndProcesses__Group__5 ;
    public final void rule__FormsAndProcesses__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1277:1: ( ( ( rule__FormsAndProcesses__ExternalReferencesAssignment_4 )* ) rule__FormsAndProcesses__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1278:1: ( ( rule__FormsAndProcesses__ExternalReferencesAssignment_4 )* ) rule__FormsAndProcesses__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1278:1: ( ( rule__FormsAndProcesses__ExternalReferencesAssignment_4 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1279:1: ( rule__FormsAndProcesses__ExternalReferencesAssignment_4 )*
            {
             before(grammarAccess.getFormsAndProcessesAccess().getExternalReferencesAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1280:1: ( rule__FormsAndProcesses__ExternalReferencesAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1280:2: rule__FormsAndProcesses__ExternalReferencesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__FormsAndProcesses__ExternalReferencesAssignment_4_in_rule__FormsAndProcesses__Group__42749);
            	    rule__FormsAndProcesses__ExternalReferencesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getFormsAndProcessesAccess().getExternalReferencesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__FormsAndProcesses__Group__5_in_rule__FormsAndProcesses__Group__42759);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1291:1: rule__FormsAndProcesses__Group__5 : ( ( rule__FormsAndProcesses__ElementsAssignment_5 )* ) ;
    public final void rule__FormsAndProcesses__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1295:1: ( ( ( rule__FormsAndProcesses__ElementsAssignment_5 )* ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1296:1: ( ( rule__FormsAndProcesses__ElementsAssignment_5 )* )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1296:1: ( ( rule__FormsAndProcesses__ElementsAssignment_5 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1297:1: ( rule__FormsAndProcesses__ElementsAssignment_5 )*
            {
             before(grammarAccess.getFormsAndProcessesAccess().getElementsAssignment_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1298:1: ( rule__FormsAndProcesses__ElementsAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING||LA17_0==31||LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1298:2: rule__FormsAndProcesses__ElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__FormsAndProcesses__ElementsAssignment_5_in_rule__FormsAndProcesses__Group__52787);
            	    rule__FormsAndProcesses__ElementsAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getFormsAndProcessesAccess().getElementsAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start rule__Menu__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1320:1: rule__Menu__Group__0 : ( 'menu' ) rule__Menu__Group__1 ;
    public final void rule__Menu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1324:1: ( ( 'menu' ) rule__Menu__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1325:1: ( 'menu' ) rule__Menu__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1325:1: ( 'menu' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1326:1: 'menu'
            {
             before(grammarAccess.getMenuAccess().getMenuKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Menu__Group__02835); 
             after(grammarAccess.getMenuAccess().getMenuKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Menu__Group__1_in_rule__Menu__Group__02845);
            rule__Menu__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Menu__Group__0


    // $ANTLR start rule__Menu__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1340:1: rule__Menu__Group__1 : ( '[' ) rule__Menu__Group__2 ;
    public final void rule__Menu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1344:1: ( ( '[' ) rule__Menu__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1345:1: ( '[' ) rule__Menu__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1345:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1346:1: '['
            {
             before(grammarAccess.getMenuAccess().getLeftSquareBracketKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__Menu__Group__12874); 
             after(grammarAccess.getMenuAccess().getLeftSquareBracketKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Menu__Group__2_in_rule__Menu__Group__12884);
            rule__Menu__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Menu__Group__1


    // $ANTLR start rule__Menu__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1360:1: rule__Menu__Group__2 : ( ( rule__Menu__StartActionsAssignment_2 )* ) rule__Menu__Group__3 ;
    public final void rule__Menu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1364:1: ( ( ( rule__Menu__StartActionsAssignment_2 )* ) rule__Menu__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1365:1: ( ( rule__Menu__StartActionsAssignment_2 )* ) rule__Menu__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1365:1: ( ( rule__Menu__StartActionsAssignment_2 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1366:1: ( rule__Menu__StartActionsAssignment_2 )*
            {
             before(grammarAccess.getMenuAccess().getStartActionsAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1367:1: ( rule__Menu__StartActionsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1367:2: rule__Menu__StartActionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Menu__StartActionsAssignment_2_in_rule__Menu__Group__22912);
            	    rule__Menu__StartActionsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMenuAccess().getStartActionsAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Menu__Group__3_in_rule__Menu__Group__22922);
            rule__Menu__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Menu__Group__2


    // $ANTLR start rule__Menu__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1378:1: rule__Menu__Group__3 : ( ']' ) ;
    public final void rule__Menu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1382:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1383:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1383:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1384:1: ']'
            {
             before(grammarAccess.getMenuAccess().getRightSquareBracketKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__Menu__Group__32951); 
             after(grammarAccess.getMenuAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Menu__Group__3


    // $ANTLR start rule__DtoReference__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1405:1: rule__DtoReference__Group__0 : ( 'from' ) rule__DtoReference__Group__1 ;
    public final void rule__DtoReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1409:1: ( ( 'from' ) rule__DtoReference__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1410:1: ( 'from' ) rule__DtoReference__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1410:1: ( 'from' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1411:1: 'from'
            {
             before(grammarAccess.getDtoReferenceAccess().getFromKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__DtoReference__Group__02995); 
             after(grammarAccess.getDtoReferenceAccess().getFromKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__DtoReference__Group__1_in_rule__DtoReference__Group__03005);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1425:1: rule__DtoReference__Group__1 : ( ( rule__DtoReference__ModelNameAssignment_1 ) ) rule__DtoReference__Group__2 ;
    public final void rule__DtoReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1429:1: ( ( ( rule__DtoReference__ModelNameAssignment_1 ) ) rule__DtoReference__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1430:1: ( ( rule__DtoReference__ModelNameAssignment_1 ) ) rule__DtoReference__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1430:1: ( ( rule__DtoReference__ModelNameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1431:1: ( rule__DtoReference__ModelNameAssignment_1 )
            {
             before(grammarAccess.getDtoReferenceAccess().getModelNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1432:1: ( rule__DtoReference__ModelNameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1432:2: rule__DtoReference__ModelNameAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoReference__ModelNameAssignment_1_in_rule__DtoReference__Group__13033);
            rule__DtoReference__ModelNameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoReferenceAccess().getModelNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoReference__Group__2_in_rule__DtoReference__Group__13042);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1443:1: rule__DtoReference__Group__2 : ( 'dto' ) rule__DtoReference__Group__3 ;
    public final void rule__DtoReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1447:1: ( ( 'dto' ) rule__DtoReference__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1448:1: ( 'dto' ) rule__DtoReference__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1448:1: ( 'dto' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1449:1: 'dto'
            {
             before(grammarAccess.getDtoReferenceAccess().getDtoKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__DtoReference__Group__23071); 
             after(grammarAccess.getDtoReferenceAccess().getDtoKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__DtoReference__Group__3_in_rule__DtoReference__Group__23081);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1463:1: rule__DtoReference__Group__3 : ( ( rule__DtoReference__NameAssignment_3 ) ) rule__DtoReference__Group__4 ;
    public final void rule__DtoReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1467:1: ( ( ( rule__DtoReference__NameAssignment_3 ) ) rule__DtoReference__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1468:1: ( ( rule__DtoReference__NameAssignment_3 ) ) rule__DtoReference__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1468:1: ( ( rule__DtoReference__NameAssignment_3 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1469:1: ( rule__DtoReference__NameAssignment_3 )
            {
             before(grammarAccess.getDtoReferenceAccess().getNameAssignment_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1470:1: ( rule__DtoReference__NameAssignment_3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1470:2: rule__DtoReference__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__DtoReference__NameAssignment_3_in_rule__DtoReference__Group__33109);
            rule__DtoReference__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getDtoReferenceAccess().getNameAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__DtoReference__Group__4_in_rule__DtoReference__Group__33118);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1481:1: rule__DtoReference__Group__4 : ( ';' ) ;
    public final void rule__DtoReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1485:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1486:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1486:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1487:1: ';'
            {
             before(grammarAccess.getDtoReferenceAccess().getSemicolonKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__DtoReference__Group__43147); 
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


    // $ANTLR start rule__PageReference__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1510:1: rule__PageReference__Group__0 : ( 'from' ) rule__PageReference__Group__1 ;
    public final void rule__PageReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1514:1: ( ( 'from' ) rule__PageReference__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1515:1: ( 'from' ) rule__PageReference__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1515:1: ( 'from' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1516:1: 'from'
            {
             before(grammarAccess.getPageReferenceAccess().getFromKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__PageReference__Group__03193); 
             after(grammarAccess.getPageReferenceAccess().getFromKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__PageReference__Group__1_in_rule__PageReference__Group__03203);
            rule__PageReference__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PageReference__Group__0


    // $ANTLR start rule__PageReference__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1530:1: rule__PageReference__Group__1 : ( ( rule__PageReference__ModelNameAssignment_1 ) ) rule__PageReference__Group__2 ;
    public final void rule__PageReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1534:1: ( ( ( rule__PageReference__ModelNameAssignment_1 ) ) rule__PageReference__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1535:1: ( ( rule__PageReference__ModelNameAssignment_1 ) ) rule__PageReference__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1535:1: ( ( rule__PageReference__ModelNameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1536:1: ( rule__PageReference__ModelNameAssignment_1 )
            {
             before(grammarAccess.getPageReferenceAccess().getModelNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1537:1: ( rule__PageReference__ModelNameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1537:2: rule__PageReference__ModelNameAssignment_1
            {
            pushFollow(FOLLOW_rule__PageReference__ModelNameAssignment_1_in_rule__PageReference__Group__13231);
            rule__PageReference__ModelNameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPageReferenceAccess().getModelNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__PageReference__Group__2_in_rule__PageReference__Group__13240);
            rule__PageReference__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PageReference__Group__1


    // $ANTLR start rule__PageReference__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1548:1: rule__PageReference__Group__2 : ( 'page' ) rule__PageReference__Group__3 ;
    public final void rule__PageReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1552:1: ( ( 'page' ) rule__PageReference__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1553:1: ( 'page' ) rule__PageReference__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1553:1: ( 'page' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1554:1: 'page'
            {
             before(grammarAccess.getPageReferenceAccess().getPageKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__PageReference__Group__23269); 
             after(grammarAccess.getPageReferenceAccess().getPageKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__PageReference__Group__3_in_rule__PageReference__Group__23279);
            rule__PageReference__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PageReference__Group__2


    // $ANTLR start rule__PageReference__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1568:1: rule__PageReference__Group__3 : ( ( rule__PageReference__NameAssignment_3 ) ) rule__PageReference__Group__4 ;
    public final void rule__PageReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1572:1: ( ( ( rule__PageReference__NameAssignment_3 ) ) rule__PageReference__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1573:1: ( ( rule__PageReference__NameAssignment_3 ) ) rule__PageReference__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1573:1: ( ( rule__PageReference__NameAssignment_3 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1574:1: ( rule__PageReference__NameAssignment_3 )
            {
             before(grammarAccess.getPageReferenceAccess().getNameAssignment_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1575:1: ( rule__PageReference__NameAssignment_3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1575:2: rule__PageReference__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__PageReference__NameAssignment_3_in_rule__PageReference__Group__33307);
            rule__PageReference__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getPageReferenceAccess().getNameAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__PageReference__Group__4_in_rule__PageReference__Group__33316);
            rule__PageReference__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PageReference__Group__3


    // $ANTLR start rule__PageReference__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1586:1: rule__PageReference__Group__4 : ( ';' ) ;
    public final void rule__PageReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1590:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1591:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1591:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1592:1: ';'
            {
             before(grammarAccess.getPageReferenceAccess().getSemicolonKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__PageReference__Group__43345); 
             after(grammarAccess.getPageReferenceAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PageReference__Group__4


    // $ANTLR start rule__ServiceReference__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1615:1: rule__ServiceReference__Group__0 : ( 'from' ) rule__ServiceReference__Group__1 ;
    public final void rule__ServiceReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1619:1: ( ( 'from' ) rule__ServiceReference__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1620:1: ( 'from' ) rule__ServiceReference__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1620:1: ( 'from' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1621:1: 'from'
            {
             before(grammarAccess.getServiceReferenceAccess().getFromKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__ServiceReference__Group__03391); 
             after(grammarAccess.getServiceReferenceAccess().getFromKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ServiceReference__Group__1_in_rule__ServiceReference__Group__03401);
            rule__ServiceReference__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceReference__Group__0


    // $ANTLR start rule__ServiceReference__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1635:1: rule__ServiceReference__Group__1 : ( ( rule__ServiceReference__ModelNameAssignment_1 ) ) rule__ServiceReference__Group__2 ;
    public final void rule__ServiceReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1639:1: ( ( ( rule__ServiceReference__ModelNameAssignment_1 ) ) rule__ServiceReference__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1640:1: ( ( rule__ServiceReference__ModelNameAssignment_1 ) ) rule__ServiceReference__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1640:1: ( ( rule__ServiceReference__ModelNameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1641:1: ( rule__ServiceReference__ModelNameAssignment_1 )
            {
             before(grammarAccess.getServiceReferenceAccess().getModelNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1642:1: ( rule__ServiceReference__ModelNameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1642:2: rule__ServiceReference__ModelNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ServiceReference__ModelNameAssignment_1_in_rule__ServiceReference__Group__13429);
            rule__ServiceReference__ModelNameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getServiceReferenceAccess().getModelNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ServiceReference__Group__2_in_rule__ServiceReference__Group__13438);
            rule__ServiceReference__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceReference__Group__1


    // $ANTLR start rule__ServiceReference__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1653:1: rule__ServiceReference__Group__2 : ( 'service' ) rule__ServiceReference__Group__3 ;
    public final void rule__ServiceReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1657:1: ( ( 'service' ) rule__ServiceReference__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1658:1: ( 'service' ) rule__ServiceReference__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1658:1: ( 'service' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1659:1: 'service'
            {
             before(grammarAccess.getServiceReferenceAccess().getServiceKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__ServiceReference__Group__23467); 
             after(grammarAccess.getServiceReferenceAccess().getServiceKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__ServiceReference__Group__3_in_rule__ServiceReference__Group__23477);
            rule__ServiceReference__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceReference__Group__2


    // $ANTLR start rule__ServiceReference__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1673:1: rule__ServiceReference__Group__3 : ( ( rule__ServiceReference__NameAssignment_3 ) ) rule__ServiceReference__Group__4 ;
    public final void rule__ServiceReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1677:1: ( ( ( rule__ServiceReference__NameAssignment_3 ) ) rule__ServiceReference__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1678:1: ( ( rule__ServiceReference__NameAssignment_3 ) ) rule__ServiceReference__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1678:1: ( ( rule__ServiceReference__NameAssignment_3 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1679:1: ( rule__ServiceReference__NameAssignment_3 )
            {
             before(grammarAccess.getServiceReferenceAccess().getNameAssignment_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1680:1: ( rule__ServiceReference__NameAssignment_3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1680:2: rule__ServiceReference__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ServiceReference__NameAssignment_3_in_rule__ServiceReference__Group__33505);
            rule__ServiceReference__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getServiceReferenceAccess().getNameAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__ServiceReference__Group__4_in_rule__ServiceReference__Group__33514);
            rule__ServiceReference__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceReference__Group__3


    // $ANTLR start rule__ServiceReference__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1691:1: rule__ServiceReference__Group__4 : ( ';' ) ;
    public final void rule__ServiceReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1695:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1696:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1696:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1697:1: ';'
            {
             before(grammarAccess.getServiceReferenceAccess().getSemicolonKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__ServiceReference__Group__43543); 
             after(grammarAccess.getServiceReferenceAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceReference__Group__4


    // $ANTLR start rule__View__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1720:1: rule__View__Group__0 : ( ( rule__View__DescriptionAssignment_0 )? ) rule__View__Group__1 ;
    public final void rule__View__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1724:1: ( ( ( rule__View__DescriptionAssignment_0 )? ) rule__View__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1725:1: ( ( rule__View__DescriptionAssignment_0 )? ) rule__View__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1725:1: ( ( rule__View__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1726:1: ( rule__View__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getViewAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1727:1: ( rule__View__DescriptionAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1727:2: rule__View__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__View__DescriptionAssignment_0_in_rule__View__Group__03588);
                    rule__View__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__View__Group__1_in_rule__View__Group__03598);
            rule__View__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group__0


    // $ANTLR start rule__View__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1738:1: rule__View__Group__1 : ( 'panel' ) rule__View__Group__2 ;
    public final void rule__View__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1742:1: ( ( 'panel' ) rule__View__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1743:1: ( 'panel' ) rule__View__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1743:1: ( 'panel' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1744:1: 'panel'
            {
             before(grammarAccess.getViewAccess().getPanelKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__View__Group__13627); 
             after(grammarAccess.getViewAccess().getPanelKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__View__Group__2_in_rule__View__Group__13637);
            rule__View__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group__1


    // $ANTLR start rule__View__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1758:1: rule__View__Group__2 : ( ( rule__View__NameAssignment_2 ) ) rule__View__Group__3 ;
    public final void rule__View__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1762:1: ( ( ( rule__View__NameAssignment_2 ) ) rule__View__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1763:1: ( ( rule__View__NameAssignment_2 ) ) rule__View__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1763:1: ( ( rule__View__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1764:1: ( rule__View__NameAssignment_2 )
            {
             before(grammarAccess.getViewAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1765:1: ( rule__View__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1765:2: rule__View__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__View__NameAssignment_2_in_rule__View__Group__23665);
            rule__View__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getViewAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__View__Group__3_in_rule__View__Group__23674);
            rule__View__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group__2


    // $ANTLR start rule__View__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1776:1: rule__View__Group__3 : ( ( rule__View__Alternatives_3 ) ) ;
    public final void rule__View__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1780:1: ( ( ( rule__View__Alternatives_3 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1781:1: ( ( rule__View__Alternatives_3 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1781:1: ( ( rule__View__Alternatives_3 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1782:1: ( rule__View__Alternatives_3 )
            {
             before(grammarAccess.getViewAccess().getAlternatives_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1783:1: ( rule__View__Alternatives_3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1783:2: rule__View__Alternatives_3
            {
            pushFollow(FOLLOW_rule__View__Alternatives_3_in_rule__View__Group__33702);
            rule__View__Alternatives_3();
            _fsp--;


            }

             after(grammarAccess.getViewAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group__3


    // $ANTLR start rule__View__Group_3_0__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1801:1: rule__View__Group_3_0__0 : ( 'extends' ) rule__View__Group_3_0__1 ;
    public final void rule__View__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1805:1: ( ( 'extends' ) rule__View__Group_3_0__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1806:1: ( 'extends' ) rule__View__Group_3_0__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1806:1: ( 'extends' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1807:1: 'extends'
            {
             before(grammarAccess.getViewAccess().getExtendsKeyword_3_0_0()); 
            match(input,34,FOLLOW_34_in_rule__View__Group_3_0__03745); 
             after(grammarAccess.getViewAccess().getExtendsKeyword_3_0_0()); 

            }

            pushFollow(FOLLOW_rule__View__Group_3_0__1_in_rule__View__Group_3_0__03755);
            rule__View__Group_3_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_0__0


    // $ANTLR start rule__View__Group_3_0__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1821:1: rule__View__Group_3_0__1 : ( ( rule__View__BaseViewAssignment_3_0_1 ) ) rule__View__Group_3_0__2 ;
    public final void rule__View__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1825:1: ( ( ( rule__View__BaseViewAssignment_3_0_1 ) ) rule__View__Group_3_0__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1826:1: ( ( rule__View__BaseViewAssignment_3_0_1 ) ) rule__View__Group_3_0__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1826:1: ( ( rule__View__BaseViewAssignment_3_0_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1827:1: ( rule__View__BaseViewAssignment_3_0_1 )
            {
             before(grammarAccess.getViewAccess().getBaseViewAssignment_3_0_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1828:1: ( rule__View__BaseViewAssignment_3_0_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1828:2: rule__View__BaseViewAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__View__BaseViewAssignment_3_0_1_in_rule__View__Group_3_0__13783);
            rule__View__BaseViewAssignment_3_0_1();
            _fsp--;


            }

             after(grammarAccess.getViewAccess().getBaseViewAssignment_3_0_1()); 

            }

            pushFollow(FOLLOW_rule__View__Group_3_0__2_in_rule__View__Group_3_0__13792);
            rule__View__Group_3_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_0__1


    // $ANTLR start rule__View__Group_3_0__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1839:1: rule__View__Group_3_0__2 : ( '[' ) rule__View__Group_3_0__3 ;
    public final void rule__View__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1843:1: ( ( '[' ) rule__View__Group_3_0__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1844:1: ( '[' ) rule__View__Group_3_0__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1844:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1845:1: '['
            {
             before(grammarAccess.getViewAccess().getLeftSquareBracketKeyword_3_0_2()); 
            match(input,27,FOLLOW_27_in_rule__View__Group_3_0__23821); 
             after(grammarAccess.getViewAccess().getLeftSquareBracketKeyword_3_0_2()); 

            }

            pushFollow(FOLLOW_rule__View__Group_3_0__3_in_rule__View__Group_3_0__23831);
            rule__View__Group_3_0__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_0__2


    // $ANTLR start rule__View__Group_3_0__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1859:1: rule__View__Group_3_0__3 : ( ( rule__View__Group_3_0_3__0 )? ) rule__View__Group_3_0__4 ;
    public final void rule__View__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1863:1: ( ( ( rule__View__Group_3_0_3__0 )? ) rule__View__Group_3_0__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1864:1: ( ( rule__View__Group_3_0_3__0 )? ) rule__View__Group_3_0__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1864:1: ( ( rule__View__Group_3_0_3__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1865:1: ( rule__View__Group_3_0_3__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_3_0_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1866:1: ( rule__View__Group_3_0_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1866:2: rule__View__Group_3_0_3__0
                    {
                    pushFollow(FOLLOW_rule__View__Group_3_0_3__0_in_rule__View__Group_3_0__33859);
                    rule__View__Group_3_0_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getGroup_3_0_3()); 

            }

            pushFollow(FOLLOW_rule__View__Group_3_0__4_in_rule__View__Group_3_0__33869);
            rule__View__Group_3_0__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_0__3


    // $ANTLR start rule__View__Group_3_0__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1877:1: rule__View__Group_3_0__4 : ( ']' ) ;
    public final void rule__View__Group_3_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1881:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1882:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1882:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1883:1: ']'
            {
             before(grammarAccess.getViewAccess().getRightSquareBracketKeyword_3_0_4()); 
            match(input,28,FOLLOW_28_in_rule__View__Group_3_0__43898); 
             after(grammarAccess.getViewAccess().getRightSquareBracketKeyword_3_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_0__4


    // $ANTLR start rule__View__Group_3_0_3__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1906:1: rule__View__Group_3_0_3__0 : ( 'actions' ) rule__View__Group_3_0_3__1 ;
    public final void rule__View__Group_3_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1910:1: ( ( 'actions' ) rule__View__Group_3_0_3__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1911:1: ( 'actions' ) rule__View__Group_3_0_3__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1911:1: ( 'actions' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1912:1: 'actions'
            {
             before(grammarAccess.getViewAccess().getActionsKeyword_3_0_3_0()); 
            match(input,35,FOLLOW_35_in_rule__View__Group_3_0_3__03944); 
             after(grammarAccess.getViewAccess().getActionsKeyword_3_0_3_0()); 

            }

            pushFollow(FOLLOW_rule__View__Group_3_0_3__1_in_rule__View__Group_3_0_3__03954);
            rule__View__Group_3_0_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_0_3__0


    // $ANTLR start rule__View__Group_3_0_3__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1926:1: rule__View__Group_3_0_3__1 : ( '[' ) rule__View__Group_3_0_3__2 ;
    public final void rule__View__Group_3_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1930:1: ( ( '[' ) rule__View__Group_3_0_3__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1931:1: ( '[' ) rule__View__Group_3_0_3__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1931:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1932:1: '['
            {
             before(grammarAccess.getViewAccess().getLeftSquareBracketKeyword_3_0_3_1()); 
            match(input,27,FOLLOW_27_in_rule__View__Group_3_0_3__13983); 
             after(grammarAccess.getViewAccess().getLeftSquareBracketKeyword_3_0_3_1()); 

            }

            pushFollow(FOLLOW_rule__View__Group_3_0_3__2_in_rule__View__Group_3_0_3__13993);
            rule__View__Group_3_0_3__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_0_3__1


    // $ANTLR start rule__View__Group_3_0_3__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1946:1: rule__View__Group_3_0_3__2 : ( ( rule__View__ActionsAssignment_3_0_3_2 )* ) rule__View__Group_3_0_3__3 ;
    public final void rule__View__Group_3_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1950:1: ( ( ( rule__View__ActionsAssignment_3_0_3_2 )* ) rule__View__Group_3_0_3__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1951:1: ( ( rule__View__ActionsAssignment_3_0_3_2 )* ) rule__View__Group_3_0_3__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1951:1: ( ( rule__View__ActionsAssignment_3_0_3_2 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1952:1: ( rule__View__ActionsAssignment_3_0_3_2 )*
            {
             before(grammarAccess.getViewAccess().getActionsAssignment_3_0_3_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1953:1: ( rule__View__ActionsAssignment_3_0_3_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1953:2: rule__View__ActionsAssignment_3_0_3_2
            	    {
            	    pushFollow(FOLLOW_rule__View__ActionsAssignment_3_0_3_2_in_rule__View__Group_3_0_3__24021);
            	    rule__View__ActionsAssignment_3_0_3_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getViewAccess().getActionsAssignment_3_0_3_2()); 

            }

            pushFollow(FOLLOW_rule__View__Group_3_0_3__3_in_rule__View__Group_3_0_3__24031);
            rule__View__Group_3_0_3__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_0_3__2


    // $ANTLR start rule__View__Group_3_0_3__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1964:1: rule__View__Group_3_0_3__3 : ( ']' ) ;
    public final void rule__View__Group_3_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1968:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1969:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1969:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1970:1: ']'
            {
             before(grammarAccess.getViewAccess().getRightSquareBracketKeyword_3_0_3_3()); 
            match(input,28,FOLLOW_28_in_rule__View__Group_3_0_3__34060); 
             after(grammarAccess.getViewAccess().getRightSquareBracketKeyword_3_0_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_0_3__3


    // $ANTLR start rule__View__Group_3_1__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1991:1: rule__View__Group_3_1__0 : ( 'context' ) rule__View__Group_3_1__1 ;
    public final void rule__View__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1995:1: ( ( 'context' ) rule__View__Group_3_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1996:1: ( 'context' ) rule__View__Group_3_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1996:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1997:1: 'context'
            {
             before(grammarAccess.getViewAccess().getContextKeyword_3_1_0()); 
            match(input,36,FOLLOW_36_in_rule__View__Group_3_1__04104); 
             after(grammarAccess.getViewAccess().getContextKeyword_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__View__Group_3_1__1_in_rule__View__Group_3_1__04114);
            rule__View__Group_3_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_1__0


    // $ANTLR start rule__View__Group_3_1__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2011:1: rule__View__Group_3_1__1 : ( ( rule__View__CollectionContextAssignment_3_1_1 )? ) rule__View__Group_3_1__2 ;
    public final void rule__View__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2015:1: ( ( ( rule__View__CollectionContextAssignment_3_1_1 )? ) rule__View__Group_3_1__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2016:1: ( ( rule__View__CollectionContextAssignment_3_1_1 )? ) rule__View__Group_3_1__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2016:1: ( ( rule__View__CollectionContextAssignment_3_1_1 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2017:1: ( rule__View__CollectionContextAssignment_3_1_1 )?
            {
             before(grammarAccess.getViewAccess().getCollectionContextAssignment_3_1_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2018:1: ( rule__View__CollectionContextAssignment_3_1_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2018:2: rule__View__CollectionContextAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_rule__View__CollectionContextAssignment_3_1_1_in_rule__View__Group_3_1__14142);
                    rule__View__CollectionContextAssignment_3_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getCollectionContextAssignment_3_1_1()); 

            }

            pushFollow(FOLLOW_rule__View__Group_3_1__2_in_rule__View__Group_3_1__14152);
            rule__View__Group_3_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_1__1


    // $ANTLR start rule__View__Group_3_1__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2029:1: rule__View__Group_3_1__2 : ( ( rule__View__ContextRefAssignment_3_1_2 ) ) rule__View__Group_3_1__3 ;
    public final void rule__View__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2033:1: ( ( ( rule__View__ContextRefAssignment_3_1_2 ) ) rule__View__Group_3_1__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2034:1: ( ( rule__View__ContextRefAssignment_3_1_2 ) ) rule__View__Group_3_1__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2034:1: ( ( rule__View__ContextRefAssignment_3_1_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2035:1: ( rule__View__ContextRefAssignment_3_1_2 )
            {
             before(grammarAccess.getViewAccess().getContextRefAssignment_3_1_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2036:1: ( rule__View__ContextRefAssignment_3_1_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2036:2: rule__View__ContextRefAssignment_3_1_2
            {
            pushFollow(FOLLOW_rule__View__ContextRefAssignment_3_1_2_in_rule__View__Group_3_1__24180);
            rule__View__ContextRefAssignment_3_1_2();
            _fsp--;


            }

             after(grammarAccess.getViewAccess().getContextRefAssignment_3_1_2()); 

            }

            pushFollow(FOLLOW_rule__View__Group_3_1__3_in_rule__View__Group_3_1__24189);
            rule__View__Group_3_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_1__2


    // $ANTLR start rule__View__Group_3_1__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2047:1: rule__View__Group_3_1__3 : ( '[' ) rule__View__Group_3_1__4 ;
    public final void rule__View__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2051:1: ( ( '[' ) rule__View__Group_3_1__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2052:1: ( '[' ) rule__View__Group_3_1__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2052:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2053:1: '['
            {
             before(grammarAccess.getViewAccess().getLeftSquareBracketKeyword_3_1_3()); 
            match(input,27,FOLLOW_27_in_rule__View__Group_3_1__34218); 
             after(grammarAccess.getViewAccess().getLeftSquareBracketKeyword_3_1_3()); 

            }

            pushFollow(FOLLOW_rule__View__Group_3_1__4_in_rule__View__Group_3_1__34228);
            rule__View__Group_3_1__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_1__3


    // $ANTLR start rule__View__Group_3_1__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2067:1: rule__View__Group_3_1__4 : ( ( rule__View__FormElementsAssignment_3_1_4 )* ) rule__View__Group_3_1__5 ;
    public final void rule__View__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2071:1: ( ( ( rule__View__FormElementsAssignment_3_1_4 )* ) rule__View__Group_3_1__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2072:1: ( ( rule__View__FormElementsAssignment_3_1_4 )* ) rule__View__Group_3_1__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2072:1: ( ( rule__View__FormElementsAssignment_3_1_4 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2073:1: ( rule__View__FormElementsAssignment_3_1_4 )*
            {
             before(grammarAccess.getViewAccess().getFormElementsAssignment_3_1_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2074:1: ( rule__View__FormElementsAssignment_3_1_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2074:2: rule__View__FormElementsAssignment_3_1_4
            	    {
            	    pushFollow(FOLLOW_rule__View__FormElementsAssignment_3_1_4_in_rule__View__Group_3_1__44256);
            	    rule__View__FormElementsAssignment_3_1_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getViewAccess().getFormElementsAssignment_3_1_4()); 

            }

            pushFollow(FOLLOW_rule__View__Group_3_1__5_in_rule__View__Group_3_1__44266);
            rule__View__Group_3_1__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_1__4


    // $ANTLR start rule__View__Group_3_1__5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2085:1: rule__View__Group_3_1__5 : ( ( rule__View__Group_3_1_5__0 )? ) rule__View__Group_3_1__6 ;
    public final void rule__View__Group_3_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2089:1: ( ( ( rule__View__Group_3_1_5__0 )? ) rule__View__Group_3_1__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2090:1: ( ( rule__View__Group_3_1_5__0 )? ) rule__View__Group_3_1__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2090:1: ( ( rule__View__Group_3_1_5__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2091:1: ( rule__View__Group_3_1_5__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_3_1_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2092:1: ( rule__View__Group_3_1_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2092:2: rule__View__Group_3_1_5__0
                    {
                    pushFollow(FOLLOW_rule__View__Group_3_1_5__0_in_rule__View__Group_3_1__54294);
                    rule__View__Group_3_1_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getGroup_3_1_5()); 

            }

            pushFollow(FOLLOW_rule__View__Group_3_1__6_in_rule__View__Group_3_1__54304);
            rule__View__Group_3_1__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_1__5


    // $ANTLR start rule__View__Group_3_1__6
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2103:1: rule__View__Group_3_1__6 : ( ']' ) ;
    public final void rule__View__Group_3_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2107:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2108:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2108:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2109:1: ']'
            {
             before(grammarAccess.getViewAccess().getRightSquareBracketKeyword_3_1_6()); 
            match(input,28,FOLLOW_28_in_rule__View__Group_3_1__64333); 
             after(grammarAccess.getViewAccess().getRightSquareBracketKeyword_3_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_1__6


    // $ANTLR start rule__View__Group_3_1_5__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2136:1: rule__View__Group_3_1_5__0 : ( 'actions' ) rule__View__Group_3_1_5__1 ;
    public final void rule__View__Group_3_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2140:1: ( ( 'actions' ) rule__View__Group_3_1_5__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2141:1: ( 'actions' ) rule__View__Group_3_1_5__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2141:1: ( 'actions' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2142:1: 'actions'
            {
             before(grammarAccess.getViewAccess().getActionsKeyword_3_1_5_0()); 
            match(input,35,FOLLOW_35_in_rule__View__Group_3_1_5__04383); 
             after(grammarAccess.getViewAccess().getActionsKeyword_3_1_5_0()); 

            }

            pushFollow(FOLLOW_rule__View__Group_3_1_5__1_in_rule__View__Group_3_1_5__04393);
            rule__View__Group_3_1_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_1_5__0


    // $ANTLR start rule__View__Group_3_1_5__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2156:1: rule__View__Group_3_1_5__1 : ( '[' ) rule__View__Group_3_1_5__2 ;
    public final void rule__View__Group_3_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2160:1: ( ( '[' ) rule__View__Group_3_1_5__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2161:1: ( '[' ) rule__View__Group_3_1_5__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2161:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2162:1: '['
            {
             before(grammarAccess.getViewAccess().getLeftSquareBracketKeyword_3_1_5_1()); 
            match(input,27,FOLLOW_27_in_rule__View__Group_3_1_5__14422); 
             after(grammarAccess.getViewAccess().getLeftSquareBracketKeyword_3_1_5_1()); 

            }

            pushFollow(FOLLOW_rule__View__Group_3_1_5__2_in_rule__View__Group_3_1_5__14432);
            rule__View__Group_3_1_5__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_1_5__1


    // $ANTLR start rule__View__Group_3_1_5__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2176:1: rule__View__Group_3_1_5__2 : ( ( rule__View__ActionsAssignment_3_1_5_2 )* ) rule__View__Group_3_1_5__3 ;
    public final void rule__View__Group_3_1_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2180:1: ( ( ( rule__View__ActionsAssignment_3_1_5_2 )* ) rule__View__Group_3_1_5__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2181:1: ( ( rule__View__ActionsAssignment_3_1_5_2 )* ) rule__View__Group_3_1_5__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2181:1: ( ( rule__View__ActionsAssignment_3_1_5_2 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2182:1: ( rule__View__ActionsAssignment_3_1_5_2 )*
            {
             before(grammarAccess.getViewAccess().getActionsAssignment_3_1_5_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2183:1: ( rule__View__ActionsAssignment_3_1_5_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2183:2: rule__View__ActionsAssignment_3_1_5_2
            	    {
            	    pushFollow(FOLLOW_rule__View__ActionsAssignment_3_1_5_2_in_rule__View__Group_3_1_5__24460);
            	    rule__View__ActionsAssignment_3_1_5_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getViewAccess().getActionsAssignment_3_1_5_2()); 

            }

            pushFollow(FOLLOW_rule__View__Group_3_1_5__3_in_rule__View__Group_3_1_5__24470);
            rule__View__Group_3_1_5__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_1_5__2


    // $ANTLR start rule__View__Group_3_1_5__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2194:1: rule__View__Group_3_1_5__3 : ( ']' ) ;
    public final void rule__View__Group_3_1_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2198:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2199:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2199:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2200:1: ']'
            {
             before(grammarAccess.getViewAccess().getRightSquareBracketKeyword_3_1_5_3()); 
            match(input,28,FOLLOW_28_in_rule__View__Group_3_1_5__34499); 
             after(grammarAccess.getViewAccess().getRightSquareBracketKeyword_3_1_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Group_3_1_5__3


    // $ANTLR start rule__MenuAction__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2221:1: rule__MenuAction__Group__0 : ( ( rule__MenuAction__DescriptionAssignment_0 )? ) rule__MenuAction__Group__1 ;
    public final void rule__MenuAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2225:1: ( ( ( rule__MenuAction__DescriptionAssignment_0 )? ) rule__MenuAction__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2226:1: ( ( rule__MenuAction__DescriptionAssignment_0 )? ) rule__MenuAction__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2226:1: ( ( rule__MenuAction__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2227:1: ( rule__MenuAction__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getMenuActionAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2228:1: ( rule__MenuAction__DescriptionAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2228:2: rule__MenuAction__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__MenuAction__DescriptionAssignment_0_in_rule__MenuAction__Group__04542);
                    rule__MenuAction__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMenuActionAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__MenuAction__Group__1_in_rule__MenuAction__Group__04552);
            rule__MenuAction__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__Group__0


    // $ANTLR start rule__MenuAction__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2239:1: rule__MenuAction__Group__1 : ( ( rule__MenuAction__NameAssignment_1 ) ) rule__MenuAction__Group__2 ;
    public final void rule__MenuAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2243:1: ( ( ( rule__MenuAction__NameAssignment_1 ) ) rule__MenuAction__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2244:1: ( ( rule__MenuAction__NameAssignment_1 ) ) rule__MenuAction__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2244:1: ( ( rule__MenuAction__NameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2245:1: ( rule__MenuAction__NameAssignment_1 )
            {
             before(grammarAccess.getMenuActionAccess().getNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2246:1: ( rule__MenuAction__NameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2246:2: rule__MenuAction__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MenuAction__NameAssignment_1_in_rule__MenuAction__Group__14580);
            rule__MenuAction__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMenuActionAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__MenuAction__Group__2_in_rule__MenuAction__Group__14589);
            rule__MenuAction__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__Group__1


    // $ANTLR start rule__MenuAction__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2257:1: rule__MenuAction__Group__2 : ( ( rule__MenuAction__Group_2__0 )? ) rule__MenuAction__Group__3 ;
    public final void rule__MenuAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2261:1: ( ( ( rule__MenuAction__Group_2__0 )? ) rule__MenuAction__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2262:1: ( ( rule__MenuAction__Group_2__0 )? ) rule__MenuAction__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2262:1: ( ( rule__MenuAction__Group_2__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2263:1: ( rule__MenuAction__Group_2__0 )?
            {
             before(grammarAccess.getMenuActionAccess().getGroup_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2264:1: ( rule__MenuAction__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2264:2: rule__MenuAction__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__MenuAction__Group_2__0_in_rule__MenuAction__Group__24617);
                    rule__MenuAction__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMenuActionAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__MenuAction__Group__3_in_rule__MenuAction__Group__24627);
            rule__MenuAction__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__Group__2


    // $ANTLR start rule__MenuAction__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2275:1: rule__MenuAction__Group__3 : ( ':' ) rule__MenuAction__Group__4 ;
    public final void rule__MenuAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2279:1: ( ( ':' ) rule__MenuAction__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2280:1: ( ':' ) rule__MenuAction__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2280:1: ( ':' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2281:1: ':'
            {
             before(grammarAccess.getMenuActionAccess().getColonKeyword_3()); 
            match(input,37,FOLLOW_37_in_rule__MenuAction__Group__34656); 
             after(grammarAccess.getMenuActionAccess().getColonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__MenuAction__Group__4_in_rule__MenuAction__Group__34666);
            rule__MenuAction__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__Group__3


    // $ANTLR start rule__MenuAction__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2295:1: rule__MenuAction__Group__4 : ( ( rule__MenuAction__Alternatives_4 ) ) rule__MenuAction__Group__5 ;
    public final void rule__MenuAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2299:1: ( ( ( rule__MenuAction__Alternatives_4 ) ) rule__MenuAction__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2300:1: ( ( rule__MenuAction__Alternatives_4 ) ) rule__MenuAction__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2300:1: ( ( rule__MenuAction__Alternatives_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2301:1: ( rule__MenuAction__Alternatives_4 )
            {
             before(grammarAccess.getMenuActionAccess().getAlternatives_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2302:1: ( rule__MenuAction__Alternatives_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2302:2: rule__MenuAction__Alternatives_4
            {
            pushFollow(FOLLOW_rule__MenuAction__Alternatives_4_in_rule__MenuAction__Group__44694);
            rule__MenuAction__Alternatives_4();
            _fsp--;


            }

             after(grammarAccess.getMenuActionAccess().getAlternatives_4()); 

            }

            pushFollow(FOLLOW_rule__MenuAction__Group__5_in_rule__MenuAction__Group__44703);
            rule__MenuAction__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__Group__4


    // $ANTLR start rule__MenuAction__Group__5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2313:1: rule__MenuAction__Group__5 : ( ( rule__MenuAction__Group_5__0 )? ) rule__MenuAction__Group__6 ;
    public final void rule__MenuAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2317:1: ( ( ( rule__MenuAction__Group_5__0 )? ) rule__MenuAction__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2318:1: ( ( rule__MenuAction__Group_5__0 )? ) rule__MenuAction__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2318:1: ( ( rule__MenuAction__Group_5__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2319:1: ( rule__MenuAction__Group_5__0 )?
            {
             before(grammarAccess.getMenuActionAccess().getGroup_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2320:1: ( rule__MenuAction__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2320:2: rule__MenuAction__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__MenuAction__Group_5__0_in_rule__MenuAction__Group__54731);
                    rule__MenuAction__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMenuActionAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__MenuAction__Group__6_in_rule__MenuAction__Group__54741);
            rule__MenuAction__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__Group__5


    // $ANTLR start rule__MenuAction__Group__6
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2331:1: rule__MenuAction__Group__6 : ( ';' ) ;
    public final void rule__MenuAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2335:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2336:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2336:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2337:1: ';'
            {
             before(grammarAccess.getMenuActionAccess().getSemicolonKeyword_6()); 
            match(input,24,FOLLOW_24_in_rule__MenuAction__Group__64770); 
             after(grammarAccess.getMenuActionAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__Group__6


    // $ANTLR start rule__MenuAction__Group_2__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2364:1: rule__MenuAction__Group_2__0 : ( 'label' ) rule__MenuAction__Group_2__1 ;
    public final void rule__MenuAction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2368:1: ( ( 'label' ) rule__MenuAction__Group_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2369:1: ( 'label' ) rule__MenuAction__Group_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2369:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2370:1: 'label'
            {
             before(grammarAccess.getMenuActionAccess().getLabelKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__MenuAction__Group_2__04820); 
             after(grammarAccess.getMenuActionAccess().getLabelKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__MenuAction__Group_2__1_in_rule__MenuAction__Group_2__04830);
            rule__MenuAction__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__Group_2__0


    // $ANTLR start rule__MenuAction__Group_2__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2384:1: rule__MenuAction__Group_2__1 : ( ( rule__MenuAction__LabelAssignment_2_1 ) ) ;
    public final void rule__MenuAction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2388:1: ( ( ( rule__MenuAction__LabelAssignment_2_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2389:1: ( ( rule__MenuAction__LabelAssignment_2_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2389:1: ( ( rule__MenuAction__LabelAssignment_2_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2390:1: ( rule__MenuAction__LabelAssignment_2_1 )
            {
             before(grammarAccess.getMenuActionAccess().getLabelAssignment_2_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2391:1: ( rule__MenuAction__LabelAssignment_2_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2391:2: rule__MenuAction__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_rule__MenuAction__LabelAssignment_2_1_in_rule__MenuAction__Group_2__14858);
            rule__MenuAction__LabelAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getMenuActionAccess().getLabelAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__Group_2__1


    // $ANTLR start rule__MenuAction__Group_4_0_1__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2405:1: rule__MenuAction__Group_4_0_1__0 : ( ( rule__MenuAction__TypeAssignment_4_0_1_0 ) ) rule__MenuAction__Group_4_0_1__1 ;
    public final void rule__MenuAction__Group_4_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2409:1: ( ( ( rule__MenuAction__TypeAssignment_4_0_1_0 ) ) rule__MenuAction__Group_4_0_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2410:1: ( ( rule__MenuAction__TypeAssignment_4_0_1_0 ) ) rule__MenuAction__Group_4_0_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2410:1: ( ( rule__MenuAction__TypeAssignment_4_0_1_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2411:1: ( rule__MenuAction__TypeAssignment_4_0_1_0 )
            {
             before(grammarAccess.getMenuActionAccess().getTypeAssignment_4_0_1_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2412:1: ( rule__MenuAction__TypeAssignment_4_0_1_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2412:2: rule__MenuAction__TypeAssignment_4_0_1_0
            {
            pushFollow(FOLLOW_rule__MenuAction__TypeAssignment_4_0_1_0_in_rule__MenuAction__Group_4_0_1__04896);
            rule__MenuAction__TypeAssignment_4_0_1_0();
            _fsp--;


            }

             after(grammarAccess.getMenuActionAccess().getTypeAssignment_4_0_1_0()); 

            }

            pushFollow(FOLLOW_rule__MenuAction__Group_4_0_1__1_in_rule__MenuAction__Group_4_0_1__04905);
            rule__MenuAction__Group_4_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__Group_4_0_1__0


    // $ANTLR start rule__MenuAction__Group_4_0_1__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2423:1: rule__MenuAction__Group_4_0_1__1 : ( ( rule__MenuAction__ContextExpAssignment_4_0_1_1 ) ) ;
    public final void rule__MenuAction__Group_4_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2427:1: ( ( ( rule__MenuAction__ContextExpAssignment_4_0_1_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2428:1: ( ( rule__MenuAction__ContextExpAssignment_4_0_1_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2428:1: ( ( rule__MenuAction__ContextExpAssignment_4_0_1_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2429:1: ( rule__MenuAction__ContextExpAssignment_4_0_1_1 )
            {
             before(grammarAccess.getMenuActionAccess().getContextExpAssignment_4_0_1_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2430:1: ( rule__MenuAction__ContextExpAssignment_4_0_1_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2430:2: rule__MenuAction__ContextExpAssignment_4_0_1_1
            {
            pushFollow(FOLLOW_rule__MenuAction__ContextExpAssignment_4_0_1_1_in_rule__MenuAction__Group_4_0_1__14933);
            rule__MenuAction__ContextExpAssignment_4_0_1_1();
            _fsp--;


            }

             after(grammarAccess.getMenuActionAccess().getContextExpAssignment_4_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__Group_4_0_1__1


    // $ANTLR start rule__MenuAction__Group_5__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2444:1: rule__MenuAction__Group_5__0 : ( '-->' ) rule__MenuAction__Group_5__1 ;
    public final void rule__MenuAction__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2448:1: ( ( '-->' ) rule__MenuAction__Group_5__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2449:1: ( '-->' ) rule__MenuAction__Group_5__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2449:1: ( '-->' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2450:1: '-->'
            {
             before(grammarAccess.getMenuActionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_5_0()); 
            match(input,39,FOLLOW_39_in_rule__MenuAction__Group_5__04972); 
             after(grammarAccess.getMenuActionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__MenuAction__Group_5__1_in_rule__MenuAction__Group_5__04982);
            rule__MenuAction__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__Group_5__0


    // $ANTLR start rule__MenuAction__Group_5__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2464:1: rule__MenuAction__Group_5__1 : ( 'page' ) rule__MenuAction__Group_5__2 ;
    public final void rule__MenuAction__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2468:1: ( ( 'page' ) rule__MenuAction__Group_5__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2469:1: ( 'page' ) rule__MenuAction__Group_5__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2469:1: ( 'page' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2470:1: 'page'
            {
             before(grammarAccess.getMenuActionAccess().getPageKeyword_5_1()); 
            match(input,31,FOLLOW_31_in_rule__MenuAction__Group_5__15011); 
             after(grammarAccess.getMenuActionAccess().getPageKeyword_5_1()); 

            }

            pushFollow(FOLLOW_rule__MenuAction__Group_5__2_in_rule__MenuAction__Group_5__15021);
            rule__MenuAction__Group_5__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__Group_5__1


    // $ANTLR start rule__MenuAction__Group_5__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2484:1: rule__MenuAction__Group_5__2 : ( ( rule__MenuAction__NextPageAssignment_5_2 ) ) ;
    public final void rule__MenuAction__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2488:1: ( ( ( rule__MenuAction__NextPageAssignment_5_2 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2489:1: ( ( rule__MenuAction__NextPageAssignment_5_2 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2489:1: ( ( rule__MenuAction__NextPageAssignment_5_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2490:1: ( rule__MenuAction__NextPageAssignment_5_2 )
            {
             before(grammarAccess.getMenuActionAccess().getNextPageAssignment_5_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2491:1: ( rule__MenuAction__NextPageAssignment_5_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2491:2: rule__MenuAction__NextPageAssignment_5_2
            {
            pushFollow(FOLLOW_rule__MenuAction__NextPageAssignment_5_2_in_rule__MenuAction__Group_5__25049);
            rule__MenuAction__NextPageAssignment_5_2();
            _fsp--;


            }

             after(grammarAccess.getMenuActionAccess().getNextPageAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__Group_5__2


    // $ANTLR start rule__Action__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2507:1: rule__Action__Group__0 : ( ( rule__Action__DescriptionAssignment_0 )? ) rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2511:1: ( ( ( rule__Action__DescriptionAssignment_0 )? ) rule__Action__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2512:1: ( ( rule__Action__DescriptionAssignment_0 )? ) rule__Action__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2512:1: ( ( rule__Action__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2513:1: ( rule__Action__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getActionAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2514:1: ( rule__Action__DescriptionAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2514:2: rule__Action__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Action__DescriptionAssignment_0_in_rule__Action__Group__05089);
                    rule__Action__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__05099);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2525:1: rule__Action__Group__1 : ( ( rule__Action__NameAssignment_1 ) ) rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2529:1: ( ( ( rule__Action__NameAssignment_1 ) ) rule__Action__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2530:1: ( ( rule__Action__NameAssignment_1 ) ) rule__Action__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2530:1: ( ( rule__Action__NameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2531:1: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2532:1: ( rule__Action__NameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2532:2: rule__Action__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__15127);
            rule__Action__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__15136);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2543:1: rule__Action__Group__2 : ( ( rule__Action__Group_2__0 )? ) rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2547:1: ( ( ( rule__Action__Group_2__0 )? ) rule__Action__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2548:1: ( ( rule__Action__Group_2__0 )? ) rule__Action__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2548:1: ( ( rule__Action__Group_2__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2549:1: ( rule__Action__Group_2__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2550:1: ( rule__Action__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2550:2: rule__Action__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_2__0_in_rule__Action__Group__25164);
                    rule__Action__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__25174);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2561:1: rule__Action__Group__3 : ( ':' ) rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2565:1: ( ( ':' ) rule__Action__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2566:1: ( ':' ) rule__Action__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2566:1: ( ':' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2567:1: ':'
            {
             before(grammarAccess.getActionAccess().getColonKeyword_3()); 
            match(input,37,FOLLOW_37_in_rule__Action__Group__35203); 
             after(grammarAccess.getActionAccess().getColonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__4_in_rule__Action__Group__35213);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2581:1: rule__Action__Group__4 : ( ( rule__Action__Alternatives_4 ) ) rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2585:1: ( ( ( rule__Action__Alternatives_4 ) ) rule__Action__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2586:1: ( ( rule__Action__Alternatives_4 ) ) rule__Action__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2586:1: ( ( rule__Action__Alternatives_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2587:1: ( rule__Action__Alternatives_4 )
            {
             before(grammarAccess.getActionAccess().getAlternatives_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2588:1: ( rule__Action__Alternatives_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2588:2: rule__Action__Alternatives_4
            {
            pushFollow(FOLLOW_rule__Action__Alternatives_4_in_rule__Action__Group__45241);
            rule__Action__Alternatives_4();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives_4()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__5_in_rule__Action__Group__45250);
            rule__Action__Group__5();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__Action__Group__5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2599:1: rule__Action__Group__5 : ( ( rule__Action__Group_5__0 )? ) rule__Action__Group__6 ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2603:1: ( ( ( rule__Action__Group_5__0 )? ) rule__Action__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2604:1: ( ( rule__Action__Group_5__0 )? ) rule__Action__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2604:1: ( ( rule__Action__Group_5__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2605:1: ( rule__Action__Group_5__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2606:1: ( rule__Action__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2606:2: rule__Action__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_5__0_in_rule__Action__Group__55278);
                    rule__Action__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__6_in_rule__Action__Group__55288);
            rule__Action__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__5


    // $ANTLR start rule__Action__Group__6
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2617:1: rule__Action__Group__6 : ( ( rule__Action__CollectionContextAssignment_6 )? ) rule__Action__Group__7 ;
    public final void rule__Action__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2621:1: ( ( ( rule__Action__CollectionContextAssignment_6 )? ) rule__Action__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2622:1: ( ( rule__Action__CollectionContextAssignment_6 )? ) rule__Action__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2622:1: ( ( rule__Action__CollectionContextAssignment_6 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2623:1: ( rule__Action__CollectionContextAssignment_6 )?
            {
             before(grammarAccess.getActionAccess().getCollectionContextAssignment_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2624:1: ( rule__Action__CollectionContextAssignment_6 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2624:2: rule__Action__CollectionContextAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Action__CollectionContextAssignment_6_in_rule__Action__Group__65316);
                    rule__Action__CollectionContextAssignment_6();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getCollectionContextAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__7_in_rule__Action__Group__65326);
            rule__Action__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__6


    // $ANTLR start rule__Action__Group__7
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2635:1: rule__Action__Group__7 : ( ';' ) ;
    public final void rule__Action__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2639:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2640:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2640:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2641:1: ';'
            {
             before(grammarAccess.getActionAccess().getSemicolonKeyword_7()); 
            match(input,24,FOLLOW_24_in_rule__Action__Group__75355); 
             after(grammarAccess.getActionAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__7


    // $ANTLR start rule__Action__Group_2__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2670:1: rule__Action__Group_2__0 : ( 'label' ) rule__Action__Group_2__1 ;
    public final void rule__Action__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2674:1: ( ( 'label' ) rule__Action__Group_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2675:1: ( 'label' ) rule__Action__Group_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2675:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2676:1: 'label'
            {
             before(grammarAccess.getActionAccess().getLabelKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__Action__Group_2__05407); 
             after(grammarAccess.getActionAccess().getLabelKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Action__Group_2__1_in_rule__Action__Group_2__05417);
            rule__Action__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_2__0


    // $ANTLR start rule__Action__Group_2__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2690:1: rule__Action__Group_2__1 : ( ( rule__Action__LabelAssignment_2_1 ) ) ;
    public final void rule__Action__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2694:1: ( ( ( rule__Action__LabelAssignment_2_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2695:1: ( ( rule__Action__LabelAssignment_2_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2695:1: ( ( rule__Action__LabelAssignment_2_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2696:1: ( rule__Action__LabelAssignment_2_1 )
            {
             before(grammarAccess.getActionAccess().getLabelAssignment_2_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2697:1: ( rule__Action__LabelAssignment_2_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2697:2: rule__Action__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Action__LabelAssignment_2_1_in_rule__Action__Group_2__15445);
            rule__Action__LabelAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getLabelAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_2__1


    // $ANTLR start rule__Action__Group_4_0_1__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2711:1: rule__Action__Group_4_0_1__0 : ( ( rule__Action__TypeAssignment_4_0_1_0 ) ) rule__Action__Group_4_0_1__1 ;
    public final void rule__Action__Group_4_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2715:1: ( ( ( rule__Action__TypeAssignment_4_0_1_0 ) ) rule__Action__Group_4_0_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2716:1: ( ( rule__Action__TypeAssignment_4_0_1_0 ) ) rule__Action__Group_4_0_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2716:1: ( ( rule__Action__TypeAssignment_4_0_1_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2717:1: ( rule__Action__TypeAssignment_4_0_1_0 )
            {
             before(grammarAccess.getActionAccess().getTypeAssignment_4_0_1_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2718:1: ( rule__Action__TypeAssignment_4_0_1_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2718:2: rule__Action__TypeAssignment_4_0_1_0
            {
            pushFollow(FOLLOW_rule__Action__TypeAssignment_4_0_1_0_in_rule__Action__Group_4_0_1__05483);
            rule__Action__TypeAssignment_4_0_1_0();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getTypeAssignment_4_0_1_0()); 

            }

            pushFollow(FOLLOW_rule__Action__Group_4_0_1__1_in_rule__Action__Group_4_0_1__05492);
            rule__Action__Group_4_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_4_0_1__0


    // $ANTLR start rule__Action__Group_4_0_1__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2729:1: rule__Action__Group_4_0_1__1 : ( ( rule__Action__ContextExpAssignment_4_0_1_1 ) ) ;
    public final void rule__Action__Group_4_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2733:1: ( ( ( rule__Action__ContextExpAssignment_4_0_1_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2734:1: ( ( rule__Action__ContextExpAssignment_4_0_1_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2734:1: ( ( rule__Action__ContextExpAssignment_4_0_1_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2735:1: ( rule__Action__ContextExpAssignment_4_0_1_1 )
            {
             before(grammarAccess.getActionAccess().getContextExpAssignment_4_0_1_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2736:1: ( rule__Action__ContextExpAssignment_4_0_1_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2736:2: rule__Action__ContextExpAssignment_4_0_1_1
            {
            pushFollow(FOLLOW_rule__Action__ContextExpAssignment_4_0_1_1_in_rule__Action__Group_4_0_1__15520);
            rule__Action__ContextExpAssignment_4_0_1_1();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getContextExpAssignment_4_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_4_0_1__1


    // $ANTLR start rule__Action__Group_5__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2750:1: rule__Action__Group_5__0 : ( '-->' ) rule__Action__Group_5__1 ;
    public final void rule__Action__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2754:1: ( ( '-->' ) rule__Action__Group_5__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2755:1: ( '-->' ) rule__Action__Group_5__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2755:1: ( '-->' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2756:1: '-->'
            {
             before(grammarAccess.getActionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_5_0()); 
            match(input,39,FOLLOW_39_in_rule__Action__Group_5__05559); 
             after(grammarAccess.getActionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__Action__Group_5__1_in_rule__Action__Group_5__05569);
            rule__Action__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_5__0


    // $ANTLR start rule__Action__Group_5__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2770:1: rule__Action__Group_5__1 : ( 'page' ) rule__Action__Group_5__2 ;
    public final void rule__Action__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2774:1: ( ( 'page' ) rule__Action__Group_5__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2775:1: ( 'page' ) rule__Action__Group_5__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2775:1: ( 'page' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2776:1: 'page'
            {
             before(grammarAccess.getActionAccess().getPageKeyword_5_1()); 
            match(input,31,FOLLOW_31_in_rule__Action__Group_5__15598); 
             after(grammarAccess.getActionAccess().getPageKeyword_5_1()); 

            }

            pushFollow(FOLLOW_rule__Action__Group_5__2_in_rule__Action__Group_5__15608);
            rule__Action__Group_5__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_5__1


    // $ANTLR start rule__Action__Group_5__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2790:1: rule__Action__Group_5__2 : ( ( rule__Action__NextPageAssignment_5_2 ) ) ;
    public final void rule__Action__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2794:1: ( ( ( rule__Action__NextPageAssignment_5_2 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2795:1: ( ( rule__Action__NextPageAssignment_5_2 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2795:1: ( ( rule__Action__NextPageAssignment_5_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2796:1: ( rule__Action__NextPageAssignment_5_2 )
            {
             before(grammarAccess.getActionAccess().getNextPageAssignment_5_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2797:1: ( rule__Action__NextPageAssignment_5_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2797:2: rule__Action__NextPageAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Action__NextPageAssignment_5_2_in_rule__Action__Group_5__25636);
            rule__Action__NextPageAssignment_5_2();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getNextPageAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_5__2


    // $ANTLR start rule__Page__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2813:1: rule__Page__Group__0 : ( 'page' ) rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2817:1: ( ( 'page' ) rule__Page__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2818:1: ( 'page' ) rule__Page__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2818:1: ( 'page' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2819:1: 'page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Page__Group__05677); 
             after(grammarAccess.getPageAccess().getPageKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Page__Group__1_in_rule__Page__Group__05687);
            rule__Page__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__0


    // $ANTLR start rule__Page__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2833:1: rule__Page__Group__1 : ( ( rule__Page__NameAssignment_1 ) ) rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2837:1: ( ( ( rule__Page__NameAssignment_1 ) ) rule__Page__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2838:1: ( ( rule__Page__NameAssignment_1 ) ) rule__Page__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2838:1: ( ( rule__Page__NameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2839:1: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2840:1: ( rule__Page__NameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2840:2: rule__Page__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__15715);
            rule__Page__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPageAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Page__Group__2_in_rule__Page__Group__15724);
            rule__Page__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__1


    // $ANTLR start rule__Page__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2851:1: rule__Page__Group__2 : ( 'shows' ) rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2855:1: ( ( 'shows' ) rule__Page__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2856:1: ( 'shows' ) rule__Page__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2856:1: ( 'shows' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2857:1: 'shows'
            {
             before(grammarAccess.getPageAccess().getShowsKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__Page__Group__25753); 
             after(grammarAccess.getPageAccess().getShowsKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Page__Group__3_in_rule__Page__Group__25763);
            rule__Page__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__2


    // $ANTLR start rule__Page__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2871:1: rule__Page__Group__3 : ( ( rule__Page__DialogueAssignment_3 ) ) rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2875:1: ( ( ( rule__Page__DialogueAssignment_3 ) ) rule__Page__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2876:1: ( ( rule__Page__DialogueAssignment_3 ) ) rule__Page__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2876:1: ( ( rule__Page__DialogueAssignment_3 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2877:1: ( rule__Page__DialogueAssignment_3 )
            {
             before(grammarAccess.getPageAccess().getDialogueAssignment_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2878:1: ( rule__Page__DialogueAssignment_3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2878:2: rule__Page__DialogueAssignment_3
            {
            pushFollow(FOLLOW_rule__Page__DialogueAssignment_3_in_rule__Page__Group__35791);
            rule__Page__DialogueAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getPageAccess().getDialogueAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Page__Group__4_in_rule__Page__Group__35800);
            rule__Page__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__3


    // $ANTLR start rule__Page__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2889:1: rule__Page__Group__4 : ( ';' ) ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2893:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2894:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2894:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2895:1: ';'
            {
             before(grammarAccess.getPageAccess().getSemicolonKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Page__Group__45829); 
             after(grammarAccess.getPageAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__Group__4


    // $ANTLR start rule__FormElement__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2918:1: rule__FormElement__Group__0 : ( ( rule__FormElement__DescriptionAssignment_0 )? ) rule__FormElement__Group__1 ;
    public final void rule__FormElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2922:1: ( ( ( rule__FormElement__DescriptionAssignment_0 )? ) rule__FormElement__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2923:1: ( ( rule__FormElement__DescriptionAssignment_0 )? ) rule__FormElement__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2923:1: ( ( rule__FormElement__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2924:1: ( rule__FormElement__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getFormElementAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2925:1: ( rule__FormElement__DescriptionAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2925:2: rule__FormElement__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FormElement__DescriptionAssignment_0_in_rule__FormElement__Group__05874);
                    rule__FormElement__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormElementAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__1_in_rule__FormElement__Group__05884);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2936:1: rule__FormElement__Group__1 : ( ( rule__FormElement__ReferencesAssignment_1 ) ) rule__FormElement__Group__2 ;
    public final void rule__FormElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2940:1: ( ( ( rule__FormElement__ReferencesAssignment_1 ) ) rule__FormElement__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2941:1: ( ( rule__FormElement__ReferencesAssignment_1 ) ) rule__FormElement__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2941:1: ( ( rule__FormElement__ReferencesAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2942:1: ( rule__FormElement__ReferencesAssignment_1 )
            {
             before(grammarAccess.getFormElementAccess().getReferencesAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2943:1: ( rule__FormElement__ReferencesAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2943:2: rule__FormElement__ReferencesAssignment_1
            {
            pushFollow(FOLLOW_rule__FormElement__ReferencesAssignment_1_in_rule__FormElement__Group__15912);
            rule__FormElement__ReferencesAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getFormElementAccess().getReferencesAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__2_in_rule__FormElement__Group__15921);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2954:1: rule__FormElement__Group__2 : ( ( rule__FormElement__Group_2__0 )? ) rule__FormElement__Group__3 ;
    public final void rule__FormElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2958:1: ( ( ( rule__FormElement__Group_2__0 )? ) rule__FormElement__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2959:1: ( ( rule__FormElement__Group_2__0 )? ) rule__FormElement__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2959:1: ( ( rule__FormElement__Group_2__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2960:1: ( rule__FormElement__Group_2__0 )?
            {
             before(grammarAccess.getFormElementAccess().getGroup_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2961:1: ( rule__FormElement__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2961:2: rule__FormElement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FormElement__Group_2__0_in_rule__FormElement__Group__25949);
                    rule__FormElement__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormElementAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__3_in_rule__FormElement__Group__25959);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2972:1: rule__FormElement__Group__3 : ( ( rule__FormElement__Group_3__0 )? ) rule__FormElement__Group__4 ;
    public final void rule__FormElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2976:1: ( ( ( rule__FormElement__Group_3__0 )? ) rule__FormElement__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2977:1: ( ( rule__FormElement__Group_3__0 )? ) rule__FormElement__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2977:1: ( ( rule__FormElement__Group_3__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2978:1: ( rule__FormElement__Group_3__0 )?
            {
             before(grammarAccess.getFormElementAccess().getGroup_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2979:1: ( rule__FormElement__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2979:2: rule__FormElement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FormElement__Group_3__0_in_rule__FormElement__Group__35987);
                    rule__FormElement__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormElementAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__4_in_rule__FormElement__Group__35997);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2990:1: rule__FormElement__Group__4 : ( ';' ) ;
    public final void rule__FormElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2994:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2995:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2995:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2996:1: ';'
            {
             before(grammarAccess.getFormElementAccess().getSemicolonKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__FormElement__Group__46026); 
             after(grammarAccess.getFormElementAccess().getSemicolonKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start rule__FormElement__Group_2__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3019:1: rule__FormElement__Group_2__0 : ( 'label' ) rule__FormElement__Group_2__1 ;
    public final void rule__FormElement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3023:1: ( ( 'label' ) rule__FormElement__Group_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3024:1: ( 'label' ) rule__FormElement__Group_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3024:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3025:1: 'label'
            {
             before(grammarAccess.getFormElementAccess().getLabelKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__FormElement__Group_2__06072); 
             after(grammarAccess.getFormElementAccess().getLabelKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group_2__1_in_rule__FormElement__Group_2__06082);
            rule__FormElement__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__Group_2__0


    // $ANTLR start rule__FormElement__Group_2__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3039:1: rule__FormElement__Group_2__1 : ( ( rule__FormElement__LabelAssignment_2_1 ) ) ;
    public final void rule__FormElement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3043:1: ( ( ( rule__FormElement__LabelAssignment_2_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3044:1: ( ( rule__FormElement__LabelAssignment_2_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3044:1: ( ( rule__FormElement__LabelAssignment_2_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3045:1: ( rule__FormElement__LabelAssignment_2_1 )
            {
             before(grammarAccess.getFormElementAccess().getLabelAssignment_2_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3046:1: ( rule__FormElement__LabelAssignment_2_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3046:2: rule__FormElement__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FormElement__LabelAssignment_2_1_in_rule__FormElement__Group_2__16110);
            rule__FormElement__LabelAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getFormElementAccess().getLabelAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__Group_2__1


    // $ANTLR start rule__FormElement__Group_3__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3060:1: rule__FormElement__Group_3__0 : ( 'readonly' ) rule__FormElement__Group_3__1 ;
    public final void rule__FormElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3064:1: ( ( 'readonly' ) rule__FormElement__Group_3__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3065:1: ( 'readonly' ) rule__FormElement__Group_3__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3065:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3066:1: 'readonly'
            {
             before(grammarAccess.getFormElementAccess().getReadonlyKeyword_3_0()); 
            match(input,41,FOLLOW_41_in_rule__FormElement__Group_3__06149); 
             after(grammarAccess.getFormElementAccess().getReadonlyKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group_3__1_in_rule__FormElement__Group_3__06159);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3080:1: rule__FormElement__Group_3__1 : ( ( rule__FormElement__Alternatives_3_1 ) ) ;
    public final void rule__FormElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3084:1: ( ( ( rule__FormElement__Alternatives_3_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3085:1: ( ( rule__FormElement__Alternatives_3_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3085:1: ( ( rule__FormElement__Alternatives_3_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3086:1: ( rule__FormElement__Alternatives_3_1 )
            {
             before(grammarAccess.getFormElementAccess().getAlternatives_3_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3087:1: ( rule__FormElement__Alternatives_3_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3087:2: rule__FormElement__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__FormElement__Alternatives_3_1_in_rule__FormElement__Group_3__16187);
            rule__FormElement__Alternatives_3_1();
            _fsp--;


            }

             after(grammarAccess.getFormElementAccess().getAlternatives_3_1()); 

            }


            }

        }
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


    // $ANTLR start rule__OperationExpression__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3101:1: rule__OperationExpression__Group__0 : ( 'call' ) rule__OperationExpression__Group__1 ;
    public final void rule__OperationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3105:1: ( ( 'call' ) rule__OperationExpression__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3106:1: ( 'call' ) rule__OperationExpression__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3106:1: ( 'call' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3107:1: 'call'
            {
             before(grammarAccess.getOperationExpressionAccess().getCallKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__OperationExpression__Group__06226); 
             after(grammarAccess.getOperationExpressionAccess().getCallKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__OperationExpression__Group__1_in_rule__OperationExpression__Group__06236);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3121:1: rule__OperationExpression__Group__1 : ( ( rule__OperationExpression__NameAssignment_1 ) ) ;
    public final void rule__OperationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3125:1: ( ( ( rule__OperationExpression__NameAssignment_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3126:1: ( ( rule__OperationExpression__NameAssignment_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3126:1: ( ( rule__OperationExpression__NameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3127:1: ( rule__OperationExpression__NameAssignment_1 )
            {
             before(grammarAccess.getOperationExpressionAccess().getNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3128:1: ( rule__OperationExpression__NameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3128:2: rule__OperationExpression__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OperationExpression__NameAssignment_1_in_rule__OperationExpression__Group__16264);
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


    // $ANTLR start rule__StandardExpression__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3142:1: rule__StandardExpression__Group__0 : ( ( rule__StandardExpression__TypeAssignment_0 ) ) rule__StandardExpression__Group__1 ;
    public final void rule__StandardExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3146:1: ( ( ( rule__StandardExpression__TypeAssignment_0 ) ) rule__StandardExpression__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3147:1: ( ( rule__StandardExpression__TypeAssignment_0 ) ) rule__StandardExpression__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3147:1: ( ( rule__StandardExpression__TypeAssignment_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3148:1: ( rule__StandardExpression__TypeAssignment_0 )
            {
             before(grammarAccess.getStandardExpressionAccess().getTypeAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3149:1: ( rule__StandardExpression__TypeAssignment_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3149:2: rule__StandardExpression__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__StandardExpression__TypeAssignment_0_in_rule__StandardExpression__Group__06302);
            rule__StandardExpression__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStandardExpressionAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__StandardExpression__Group__1_in_rule__StandardExpression__Group__06311);
            rule__StandardExpression__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StandardExpression__Group__0


    // $ANTLR start rule__StandardExpression__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3160:1: rule__StandardExpression__Group__1 : ( ( rule__StandardExpression__ContextRefAssignment_1 ) ) ;
    public final void rule__StandardExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3164:1: ( ( ( rule__StandardExpression__ContextRefAssignment_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3165:1: ( ( rule__StandardExpression__ContextRefAssignment_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3165:1: ( ( rule__StandardExpression__ContextRefAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3166:1: ( rule__StandardExpression__ContextRefAssignment_1 )
            {
             before(grammarAccess.getStandardExpressionAccess().getContextRefAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3167:1: ( rule__StandardExpression__ContextRefAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3167:2: rule__StandardExpression__ContextRefAssignment_1
            {
            pushFollow(FOLLOW_rule__StandardExpression__ContextRefAssignment_1_in_rule__StandardExpression__Group__16339);
            rule__StandardExpression__ContextRefAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStandardExpressionAccess().getContextRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StandardExpression__Group__1


    // $ANTLR start rule__ServiceExpression__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3181:1: rule__ServiceExpression__Group__0 : ( 'service' ) rule__ServiceExpression__Group__1 ;
    public final void rule__ServiceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3185:1: ( ( 'service' ) rule__ServiceExpression__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3186:1: ( 'service' ) rule__ServiceExpression__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3186:1: ( 'service' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3187:1: 'service'
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ServiceExpression__Group__06378); 
             after(grammarAccess.getServiceExpressionAccess().getServiceKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ServiceExpression__Group__1_in_rule__ServiceExpression__Group__06388);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3201:1: rule__ServiceExpression__Group__1 : ( ( rule__ServiceExpression__ServiceAssignment_1 ) ) ;
    public final void rule__ServiceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3205:1: ( ( ( rule__ServiceExpression__ServiceAssignment_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3206:1: ( ( rule__ServiceExpression__ServiceAssignment_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3206:1: ( ( rule__ServiceExpression__ServiceAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3207:1: ( rule__ServiceExpression__ServiceAssignment_1 )
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3208:1: ( rule__ServiceExpression__ServiceAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3208:2: rule__ServiceExpression__ServiceAssignment_1
            {
            pushFollow(FOLLOW_rule__ServiceExpression__ServiceAssignment_1_in_rule__ServiceExpression__Group__16416);
            rule__ServiceExpression__ServiceAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getServiceExpressionAccess().getServiceAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start rule__NavigationExpression__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3222:1: rule__NavigationExpression__Group__0 : ( 'navigate' ) rule__NavigationExpression__Group__1 ;
    public final void rule__NavigationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3226:1: ( ( 'navigate' ) rule__NavigationExpression__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3227:1: ( 'navigate' ) rule__NavigationExpression__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3227:1: ( 'navigate' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3228:1: 'navigate'
            {
             before(grammarAccess.getNavigationExpressionAccess().getNavigateKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__NavigationExpression__Group__06455); 
             after(grammarAccess.getNavigationExpressionAccess().getNavigateKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__NavigationExpression__Group__1_in_rule__NavigationExpression__Group__06465);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3242:1: rule__NavigationExpression__Group__1 : ( ( rule__NavigationExpression__ReferencesAssignment_1 ) ) ;
    public final void rule__NavigationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3246:1: ( ( ( rule__NavigationExpression__ReferencesAssignment_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3247:1: ( ( rule__NavigationExpression__ReferencesAssignment_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3247:1: ( ( rule__NavigationExpression__ReferencesAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3248:1: ( rule__NavigationExpression__ReferencesAssignment_1 )
            {
             before(grammarAccess.getNavigationExpressionAccess().getReferencesAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3249:1: ( rule__NavigationExpression__ReferencesAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3249:2: rule__NavigationExpression__ReferencesAssignment_1
            {
            pushFollow(FOLLOW_rule__NavigationExpression__ReferencesAssignment_1_in_rule__NavigationExpression__Group__16493);
            rule__NavigationExpression__ReferencesAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getNavigationExpressionAccess().getReferencesAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start rule__DtoPropertyReference__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3263:1: rule__DtoPropertyReference__Group__0 : ( ( rule__DtoPropertyReference__NameAssignment_0 ) ) rule__DtoPropertyReference__Group__1 ;
    public final void rule__DtoPropertyReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3267:1: ( ( ( rule__DtoPropertyReference__NameAssignment_0 ) ) rule__DtoPropertyReference__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3268:1: ( ( rule__DtoPropertyReference__NameAssignment_0 ) ) rule__DtoPropertyReference__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3268:1: ( ( rule__DtoPropertyReference__NameAssignment_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3269:1: ( rule__DtoPropertyReference__NameAssignment_0 )
            {
             before(grammarAccess.getDtoPropertyReferenceAccess().getNameAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3270:1: ( rule__DtoPropertyReference__NameAssignment_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3270:2: rule__DtoPropertyReference__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__DtoPropertyReference__NameAssignment_0_in_rule__DtoPropertyReference__Group__06531);
            rule__DtoPropertyReference__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDtoPropertyReferenceAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoPropertyReference__Group__1_in_rule__DtoPropertyReference__Group__06540);
            rule__DtoPropertyReference__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoPropertyReference__Group__0


    // $ANTLR start rule__DtoPropertyReference__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3281:1: rule__DtoPropertyReference__Group__1 : ( ( rule__DtoPropertyReference__Group_1__0 )? ) ;
    public final void rule__DtoPropertyReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3285:1: ( ( ( rule__DtoPropertyReference__Group_1__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3286:1: ( ( rule__DtoPropertyReference__Group_1__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3286:1: ( ( rule__DtoPropertyReference__Group_1__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3287:1: ( rule__DtoPropertyReference__Group_1__0 )?
            {
             before(grammarAccess.getDtoPropertyReferenceAccess().getGroup_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3288:1: ( rule__DtoPropertyReference__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==44) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3288:2: rule__DtoPropertyReference__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DtoPropertyReference__Group_1__0_in_rule__DtoPropertyReference__Group__16568);
                    rule__DtoPropertyReference__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoPropertyReferenceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoPropertyReference__Group__1


    // $ANTLR start rule__DtoPropertyReference__Group_1__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3302:1: rule__DtoPropertyReference__Group_1__0 : ( '.' ) rule__DtoPropertyReference__Group_1__1 ;
    public final void rule__DtoPropertyReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3306:1: ( ( '.' ) rule__DtoPropertyReference__Group_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3307:1: ( '.' ) rule__DtoPropertyReference__Group_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3307:1: ( '.' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3308:1: '.'
            {
             before(grammarAccess.getDtoPropertyReferenceAccess().getFullStopKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__DtoPropertyReference__Group_1__06608); 
             after(grammarAccess.getDtoPropertyReferenceAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__DtoPropertyReference__Group_1__1_in_rule__DtoPropertyReference__Group_1__06618);
            rule__DtoPropertyReference__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoPropertyReference__Group_1__0


    // $ANTLR start rule__DtoPropertyReference__Group_1__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3322:1: rule__DtoPropertyReference__Group_1__1 : ( ( rule__DtoPropertyReference__SubnameAssignment_1_1 ) ) ;
    public final void rule__DtoPropertyReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3326:1: ( ( ( rule__DtoPropertyReference__SubnameAssignment_1_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3327:1: ( ( rule__DtoPropertyReference__SubnameAssignment_1_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3327:1: ( ( rule__DtoPropertyReference__SubnameAssignment_1_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3328:1: ( rule__DtoPropertyReference__SubnameAssignment_1_1 )
            {
             before(grammarAccess.getDtoPropertyReferenceAccess().getSubnameAssignment_1_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3329:1: ( rule__DtoPropertyReference__SubnameAssignment_1_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3329:2: rule__DtoPropertyReference__SubnameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DtoPropertyReference__SubnameAssignment_1_1_in_rule__DtoPropertyReference__Group_1__16646);
            rule__DtoPropertyReference__SubnameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getDtoPropertyReferenceAccess().getSubnameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoPropertyReference__Group_1__1


    // $ANTLR start rule__ApplicationModel__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3343:1: rule__ApplicationModel__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ApplicationModel__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3347:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3348:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3348:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3349:1: RULE_STRING
            {
             before(grammarAccess.getApplicationModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ApplicationModel__DescriptionAssignment_06684); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3358:1: rule__ApplicationModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ApplicationModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3362:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3363:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3363:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3364:1: RULE_ID
            {
             before(grammarAccess.getApplicationModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ApplicationModel__NameAssignment_26715); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3373:1: rule__ApplicationModel__ExternalReferencesAssignment_4 : ( ruleExternalReference ) ;
    public final void rule__ApplicationModel__ExternalReferencesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3377:1: ( ( ruleExternalReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3378:1: ( ruleExternalReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3378:1: ( ruleExternalReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3379:1: ruleExternalReference
            {
             before(grammarAccess.getApplicationModelAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExternalReference_in_rule__ApplicationModel__ExternalReferencesAssignment_46746);
            ruleExternalReference();
            _fsp--;

             after(grammarAccess.getApplicationModelAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0()); 

            }


            }

        }
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


    // $ANTLR start rule__ApplicationModel__MainMenuAssignment_5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3388:1: rule__ApplicationModel__MainMenuAssignment_5 : ( ruleMenu ) ;
    public final void rule__ApplicationModel__MainMenuAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3392:1: ( ( ruleMenu ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3393:1: ( ruleMenu )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3393:1: ( ruleMenu )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3394:1: ruleMenu
            {
             before(grammarAccess.getApplicationModelAccess().getMainMenuMenuParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMenu_in_rule__ApplicationModel__MainMenuAssignment_56777);
            ruleMenu();
            _fsp--;

             after(grammarAccess.getApplicationModelAccess().getMainMenuMenuParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ApplicationModel__MainMenuAssignment_5


    // $ANTLR start rule__FormsAndProcesses__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3403:1: rule__FormsAndProcesses__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__FormsAndProcesses__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3407:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3408:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3408:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3409:1: RULE_STRING
            {
             before(grammarAccess.getFormsAndProcessesAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FormsAndProcesses__DescriptionAssignment_06808); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3418:1: rule__FormsAndProcesses__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FormsAndProcesses__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3422:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3423:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3423:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3424:1: RULE_ID
            {
             before(grammarAccess.getFormsAndProcessesAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FormsAndProcesses__NameAssignment_26839); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3433:1: rule__FormsAndProcesses__ExternalReferencesAssignment_4 : ( ruleExternalReference ) ;
    public final void rule__FormsAndProcesses__ExternalReferencesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3437:1: ( ( ruleExternalReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3438:1: ( ruleExternalReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3438:1: ( ruleExternalReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3439:1: ruleExternalReference
            {
             before(grammarAccess.getFormsAndProcessesAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExternalReference_in_rule__FormsAndProcesses__ExternalReferencesAssignment_46870);
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


    // $ANTLR start rule__FormsAndProcesses__ElementsAssignment_5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3448:1: rule__FormsAndProcesses__ElementsAssignment_5 : ( ruleModelElementWithContext ) ;
    public final void rule__FormsAndProcesses__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3452:1: ( ( ruleModelElementWithContext ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3453:1: ( ruleModelElementWithContext )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3453:1: ( ruleModelElementWithContext )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3454:1: ruleModelElementWithContext
            {
             before(grammarAccess.getFormsAndProcessesAccess().getElementsModelElementWithContextParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleModelElementWithContext_in_rule__FormsAndProcesses__ElementsAssignment_56901);
            ruleModelElementWithContext();
            _fsp--;

             after(grammarAccess.getFormsAndProcessesAccess().getElementsModelElementWithContextParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormsAndProcesses__ElementsAssignment_5


    // $ANTLR start rule__Menu__StartActionsAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3463:1: rule__Menu__StartActionsAssignment_2 : ( ruleMenuAction ) ;
    public final void rule__Menu__StartActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3467:1: ( ( ruleMenuAction ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3468:1: ( ruleMenuAction )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3468:1: ( ruleMenuAction )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3469:1: ruleMenuAction
            {
             before(grammarAccess.getMenuAccess().getStartActionsMenuActionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMenuAction_in_rule__Menu__StartActionsAssignment_26932);
            ruleMenuAction();
            _fsp--;

             after(grammarAccess.getMenuAccess().getStartActionsMenuActionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Menu__StartActionsAssignment_2


    // $ANTLR start rule__DtoReference__ModelNameAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3478:1: rule__DtoReference__ModelNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DtoReference__ModelNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3482:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3483:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3483:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3484:1: RULE_ID
            {
             before(grammarAccess.getDtoReferenceAccess().getModelNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoReference__ModelNameAssignment_16963); 
             after(grammarAccess.getDtoReferenceAccess().getModelNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoReference__ModelNameAssignment_1


    // $ANTLR start rule__DtoReference__NameAssignment_3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3493:1: rule__DtoReference__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__DtoReference__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3497:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3498:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3498:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3499:1: RULE_ID
            {
             before(grammarAccess.getDtoReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoReference__NameAssignment_36994); 
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


    // $ANTLR start rule__PageReference__ModelNameAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3508:1: rule__PageReference__ModelNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PageReference__ModelNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3512:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3513:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3513:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3514:1: RULE_ID
            {
             before(grammarAccess.getPageReferenceAccess().getModelNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PageReference__ModelNameAssignment_17025); 
             after(grammarAccess.getPageReferenceAccess().getModelNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PageReference__ModelNameAssignment_1


    // $ANTLR start rule__PageReference__NameAssignment_3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3523:1: rule__PageReference__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__PageReference__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3527:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3528:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3528:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3529:1: RULE_ID
            {
             before(grammarAccess.getPageReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PageReference__NameAssignment_37056); 
             after(grammarAccess.getPageReferenceAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PageReference__NameAssignment_3


    // $ANTLR start rule__ServiceReference__ModelNameAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3538:1: rule__ServiceReference__ModelNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceReference__ModelNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3542:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3543:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3543:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3544:1: RULE_ID
            {
             before(grammarAccess.getServiceReferenceAccess().getModelNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceReference__ModelNameAssignment_17087); 
             after(grammarAccess.getServiceReferenceAccess().getModelNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceReference__ModelNameAssignment_1


    // $ANTLR start rule__ServiceReference__NameAssignment_3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3553:1: rule__ServiceReference__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ServiceReference__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3557:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3558:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3558:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3559:1: RULE_ID
            {
             before(grammarAccess.getServiceReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceReference__NameAssignment_37118); 
             after(grammarAccess.getServiceReferenceAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceReference__NameAssignment_3


    // $ANTLR start rule__View__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3568:1: rule__View__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__View__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3572:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3573:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3573:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3574:1: RULE_STRING
            {
             before(grammarAccess.getViewAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__View__DescriptionAssignment_07149); 
             after(grammarAccess.getViewAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__DescriptionAssignment_0


    // $ANTLR start rule__View__NameAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3583:1: rule__View__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__View__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3587:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3588:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3588:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3589:1: RULE_ID
            {
             before(grammarAccess.getViewAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__View__NameAssignment_27180); 
             after(grammarAccess.getViewAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__NameAssignment_2


    // $ANTLR start rule__View__BaseViewAssignment_3_0_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3598:1: rule__View__BaseViewAssignment_3_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__View__BaseViewAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3602:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3603:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3603:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3604:1: ( RULE_ID )
            {
             before(grammarAccess.getViewAccess().getBaseViewViewCrossReference_3_0_1_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3605:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3606:1: RULE_ID
            {
             before(grammarAccess.getViewAccess().getBaseViewViewIDTerminalRuleCall_3_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__View__BaseViewAssignment_3_0_17215); 
             after(grammarAccess.getViewAccess().getBaseViewViewIDTerminalRuleCall_3_0_1_0_1()); 

            }

             after(grammarAccess.getViewAccess().getBaseViewViewCrossReference_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__BaseViewAssignment_3_0_1


    // $ANTLR start rule__View__ActionsAssignment_3_0_3_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3617:1: rule__View__ActionsAssignment_3_0_3_2 : ( ruleAction ) ;
    public final void rule__View__ActionsAssignment_3_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3621:1: ( ( ruleAction ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3622:1: ( ruleAction )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3622:1: ( ruleAction )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3623:1: ruleAction
            {
             before(grammarAccess.getViewAccess().getActionsActionParserRuleCall_3_0_3_2_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__View__ActionsAssignment_3_0_3_27250);
            ruleAction();
            _fsp--;

             after(grammarAccess.getViewAccess().getActionsActionParserRuleCall_3_0_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__ActionsAssignment_3_0_3_2


    // $ANTLR start rule__View__CollectionContextAssignment_3_1_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3632:1: rule__View__CollectionContextAssignment_3_1_1 : ( ( 'list' ) ) ;
    public final void rule__View__CollectionContextAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3636:1: ( ( ( 'list' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3637:1: ( ( 'list' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3637:1: ( ( 'list' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3638:1: ( 'list' )
            {
             before(grammarAccess.getViewAccess().getCollectionContextListKeyword_3_1_1_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3639:1: ( 'list' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3640:1: 'list'
            {
             before(grammarAccess.getViewAccess().getCollectionContextListKeyword_3_1_1_0()); 
            match(input,45,FOLLOW_45_in_rule__View__CollectionContextAssignment_3_1_17286); 
             after(grammarAccess.getViewAccess().getCollectionContextListKeyword_3_1_1_0()); 

            }

             after(grammarAccess.getViewAccess().getCollectionContextListKeyword_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__CollectionContextAssignment_3_1_1


    // $ANTLR start rule__View__ContextRefAssignment_3_1_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3655:1: rule__View__ContextRefAssignment_3_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__View__ContextRefAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3659:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3660:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3660:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3661:1: ( RULE_ID )
            {
             before(grammarAccess.getViewAccess().getContextRefDtoReferenceCrossReference_3_1_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3662:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3663:1: RULE_ID
            {
             before(grammarAccess.getViewAccess().getContextRefDtoReferenceIDTerminalRuleCall_3_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__View__ContextRefAssignment_3_1_27329); 
             after(grammarAccess.getViewAccess().getContextRefDtoReferenceIDTerminalRuleCall_3_1_2_0_1()); 

            }

             after(grammarAccess.getViewAccess().getContextRefDtoReferenceCrossReference_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__ContextRefAssignment_3_1_2


    // $ANTLR start rule__View__FormElementsAssignment_3_1_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3674:1: rule__View__FormElementsAssignment_3_1_4 : ( ruleFormElement ) ;
    public final void rule__View__FormElementsAssignment_3_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3678:1: ( ( ruleFormElement ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3679:1: ( ruleFormElement )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3679:1: ( ruleFormElement )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3680:1: ruleFormElement
            {
             before(grammarAccess.getViewAccess().getFormElementsFormElementParserRuleCall_3_1_4_0()); 
            pushFollow(FOLLOW_ruleFormElement_in_rule__View__FormElementsAssignment_3_1_47364);
            ruleFormElement();
            _fsp--;

             after(grammarAccess.getViewAccess().getFormElementsFormElementParserRuleCall_3_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__FormElementsAssignment_3_1_4


    // $ANTLR start rule__View__ActionsAssignment_3_1_5_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3689:1: rule__View__ActionsAssignment_3_1_5_2 : ( ruleAction ) ;
    public final void rule__View__ActionsAssignment_3_1_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3693:1: ( ( ruleAction ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3694:1: ( ruleAction )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3694:1: ( ruleAction )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3695:1: ruleAction
            {
             before(grammarAccess.getViewAccess().getActionsActionParserRuleCall_3_1_5_2_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__View__ActionsAssignment_3_1_5_27395);
            ruleAction();
            _fsp--;

             after(grammarAccess.getViewAccess().getActionsActionParserRuleCall_3_1_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__ActionsAssignment_3_1_5_2


    // $ANTLR start rule__MenuAction__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3704:1: rule__MenuAction__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MenuAction__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3708:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3709:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3709:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3710:1: RULE_STRING
            {
             before(grammarAccess.getMenuActionAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MenuAction__DescriptionAssignment_07426); 
             after(grammarAccess.getMenuActionAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__DescriptionAssignment_0


    // $ANTLR start rule__MenuAction__NameAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3719:1: rule__MenuAction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MenuAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3723:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3724:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3724:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3725:1: RULE_ID
            {
             before(grammarAccess.getMenuActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MenuAction__NameAssignment_17457); 
             after(grammarAccess.getMenuActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__NameAssignment_1


    // $ANTLR start rule__MenuAction__LabelAssignment_2_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3734:1: rule__MenuAction__LabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__MenuAction__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3738:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3739:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3739:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3740:1: RULE_STRING
            {
             before(grammarAccess.getMenuActionAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MenuAction__LabelAssignment_2_17488); 
             after(grammarAccess.getMenuActionAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__LabelAssignment_2_1


    // $ANTLR start rule__MenuAction__TypeAssignment_4_0_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3749:1: rule__MenuAction__TypeAssignment_4_0_0 : ( ruleProcessType ) ;
    public final void rule__MenuAction__TypeAssignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3753:1: ( ( ruleProcessType ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3754:1: ( ruleProcessType )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3754:1: ( ruleProcessType )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3755:1: ruleProcessType
            {
             before(grammarAccess.getMenuActionAccess().getTypeProcessTypeEnumRuleCall_4_0_0_0()); 
            pushFollow(FOLLOW_ruleProcessType_in_rule__MenuAction__TypeAssignment_4_0_07519);
            ruleProcessType();
            _fsp--;

             after(grammarAccess.getMenuActionAccess().getTypeProcessTypeEnumRuleCall_4_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__TypeAssignment_4_0_0


    // $ANTLR start rule__MenuAction__TypeAssignment_4_0_1_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3764:1: rule__MenuAction__TypeAssignment_4_0_1_0 : ( ruleProcessTypeLink ) ;
    public final void rule__MenuAction__TypeAssignment_4_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3768:1: ( ( ruleProcessTypeLink ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3769:1: ( ruleProcessTypeLink )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3769:1: ( ruleProcessTypeLink )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3770:1: ruleProcessTypeLink
            {
             before(grammarAccess.getMenuActionAccess().getTypeProcessTypeLinkEnumRuleCall_4_0_1_0_0()); 
            pushFollow(FOLLOW_ruleProcessTypeLink_in_rule__MenuAction__TypeAssignment_4_0_1_07550);
            ruleProcessTypeLink();
            _fsp--;

             after(grammarAccess.getMenuActionAccess().getTypeProcessTypeLinkEnumRuleCall_4_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__TypeAssignment_4_0_1_0


    // $ANTLR start rule__MenuAction__ContextExpAssignment_4_0_1_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3779:1: rule__MenuAction__ContextExpAssignment_4_0_1_1 : ( ruleNavigationExpression ) ;
    public final void rule__MenuAction__ContextExpAssignment_4_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3783:1: ( ( ruleNavigationExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3784:1: ( ruleNavigationExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3784:1: ( ruleNavigationExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3785:1: ruleNavigationExpression
            {
             before(grammarAccess.getMenuActionAccess().getContextExpNavigationExpressionParserRuleCall_4_0_1_1_0()); 
            pushFollow(FOLLOW_ruleNavigationExpression_in_rule__MenuAction__ContextExpAssignment_4_0_1_17581);
            ruleNavigationExpression();
            _fsp--;

             after(grammarAccess.getMenuActionAccess().getContextExpNavigationExpressionParserRuleCall_4_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__ContextExpAssignment_4_0_1_1


    // $ANTLR start rule__MenuAction__ContextExpAssignment_4_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3794:1: rule__MenuAction__ContextExpAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__MenuAction__ContextExpAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3798:1: ( ( ruleExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3799:1: ( ruleExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3799:1: ( ruleExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3800:1: ruleExpression
            {
             before(grammarAccess.getMenuActionAccess().getContextExpExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__MenuAction__ContextExpAssignment_4_17612);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getMenuActionAccess().getContextExpExpressionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__ContextExpAssignment_4_1


    // $ANTLR start rule__MenuAction__NextPageAssignment_5_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3809:1: rule__MenuAction__NextPageAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__MenuAction__NextPageAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3813:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3814:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3814:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3815:1: ( RULE_ID )
            {
             before(grammarAccess.getMenuActionAccess().getNextPagePageCrossReference_5_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3816:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3817:1: RULE_ID
            {
             before(grammarAccess.getMenuActionAccess().getNextPagePageIDTerminalRuleCall_5_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MenuAction__NextPageAssignment_5_27647); 
             after(grammarAccess.getMenuActionAccess().getNextPagePageIDTerminalRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getMenuActionAccess().getNextPagePageCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MenuAction__NextPageAssignment_5_2


    // $ANTLR start rule__Action__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3828:1: rule__Action__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Action__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3832:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3833:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3833:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3834:1: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Action__DescriptionAssignment_07682); 
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


    // $ANTLR start rule__Action__NameAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3843:1: rule__Action__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3847:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3848:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3848:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3849:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__NameAssignment_17713); 
             after(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__NameAssignment_1


    // $ANTLR start rule__Action__LabelAssignment_2_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3858:1: rule__Action__LabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Action__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3862:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3863:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3863:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3864:1: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Action__LabelAssignment_2_17744); 
             after(grammarAccess.getActionAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__LabelAssignment_2_1


    // $ANTLR start rule__Action__TypeAssignment_4_0_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3873:1: rule__Action__TypeAssignment_4_0_0 : ( ruleProcessType ) ;
    public final void rule__Action__TypeAssignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3877:1: ( ( ruleProcessType ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3878:1: ( ruleProcessType )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3878:1: ( ruleProcessType )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3879:1: ruleProcessType
            {
             before(grammarAccess.getActionAccess().getTypeProcessTypeEnumRuleCall_4_0_0_0()); 
            pushFollow(FOLLOW_ruleProcessType_in_rule__Action__TypeAssignment_4_0_07775);
            ruleProcessType();
            _fsp--;

             after(grammarAccess.getActionAccess().getTypeProcessTypeEnumRuleCall_4_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__TypeAssignment_4_0_0


    // $ANTLR start rule__Action__TypeAssignment_4_0_1_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3888:1: rule__Action__TypeAssignment_4_0_1_0 : ( ruleProcessTypeLink ) ;
    public final void rule__Action__TypeAssignment_4_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3892:1: ( ( ruleProcessTypeLink ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3893:1: ( ruleProcessTypeLink )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3893:1: ( ruleProcessTypeLink )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3894:1: ruleProcessTypeLink
            {
             before(grammarAccess.getActionAccess().getTypeProcessTypeLinkEnumRuleCall_4_0_1_0_0()); 
            pushFollow(FOLLOW_ruleProcessTypeLink_in_rule__Action__TypeAssignment_4_0_1_07806);
            ruleProcessTypeLink();
            _fsp--;

             after(grammarAccess.getActionAccess().getTypeProcessTypeLinkEnumRuleCall_4_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__TypeAssignment_4_0_1_0


    // $ANTLR start rule__Action__ContextExpAssignment_4_0_1_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3903:1: rule__Action__ContextExpAssignment_4_0_1_1 : ( ruleNavigationExpression ) ;
    public final void rule__Action__ContextExpAssignment_4_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3907:1: ( ( ruleNavigationExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3908:1: ( ruleNavigationExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3908:1: ( ruleNavigationExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3909:1: ruleNavigationExpression
            {
             before(grammarAccess.getActionAccess().getContextExpNavigationExpressionParserRuleCall_4_0_1_1_0()); 
            pushFollow(FOLLOW_ruleNavigationExpression_in_rule__Action__ContextExpAssignment_4_0_1_17837);
            ruleNavigationExpression();
            _fsp--;

             after(grammarAccess.getActionAccess().getContextExpNavigationExpressionParserRuleCall_4_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__ContextExpAssignment_4_0_1_1


    // $ANTLR start rule__Action__ContextExpAssignment_4_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3918:1: rule__Action__ContextExpAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__Action__ContextExpAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3922:1: ( ( ruleExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3923:1: ( ruleExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3923:1: ( ruleExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3924:1: ruleExpression
            {
             before(grammarAccess.getActionAccess().getContextExpExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Action__ContextExpAssignment_4_17868);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getActionAccess().getContextExpExpressionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__ContextExpAssignment_4_1


    // $ANTLR start rule__Action__NextPageAssignment_5_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3933:1: rule__Action__NextPageAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__Action__NextPageAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3937:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3938:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3938:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3939:1: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getNextPagePageCrossReference_5_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3940:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3941:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNextPagePageIDTerminalRuleCall_5_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__NextPageAssignment_5_27903); 
             after(grammarAccess.getActionAccess().getNextPagePageIDTerminalRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getActionAccess().getNextPagePageCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__NextPageAssignment_5_2


    // $ANTLR start rule__Action__CollectionContextAssignment_6
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3952:1: rule__Action__CollectionContextAssignment_6 : ( ( 'collection' ) ) ;
    public final void rule__Action__CollectionContextAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3956:1: ( ( ( 'collection' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3957:1: ( ( 'collection' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3957:1: ( ( 'collection' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3958:1: ( 'collection' )
            {
             before(grammarAccess.getActionAccess().getCollectionContextCollectionKeyword_6_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3959:1: ( 'collection' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3960:1: 'collection'
            {
             before(grammarAccess.getActionAccess().getCollectionContextCollectionKeyword_6_0()); 
            match(input,46,FOLLOW_46_in_rule__Action__CollectionContextAssignment_67943); 
             after(grammarAccess.getActionAccess().getCollectionContextCollectionKeyword_6_0()); 

            }

             after(grammarAccess.getActionAccess().getCollectionContextCollectionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__CollectionContextAssignment_6


    // $ANTLR start rule__Page__NameAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3975:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3979:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3980:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3980:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3981:1: RULE_ID
            {
             before(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Page__NameAssignment_17982); 
             after(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__NameAssignment_1


    // $ANTLR start rule__Page__DialogueAssignment_3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3990:1: rule__Page__DialogueAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Page__DialogueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3994:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3995:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3995:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3996:1: ( RULE_ID )
            {
             before(grammarAccess.getPageAccess().getDialogueViewCrossReference_3_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3997:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3998:1: RULE_ID
            {
             before(grammarAccess.getPageAccess().getDialogueViewIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Page__DialogueAssignment_38017); 
             after(grammarAccess.getPageAccess().getDialogueViewIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPageAccess().getDialogueViewCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Page__DialogueAssignment_3


    // $ANTLR start rule__FormElement__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4009:1: rule__FormElement__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__FormElement__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4013:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4014:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4014:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4015:1: RULE_STRING
            {
             before(grammarAccess.getFormElementAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FormElement__DescriptionAssignment_08052); 
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


    // $ANTLR start rule__FormElement__ReferencesAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4024:1: rule__FormElement__ReferencesAssignment_1 : ( ruleDtoPropertyReference ) ;
    public final void rule__FormElement__ReferencesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4028:1: ( ( ruleDtoPropertyReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4029:1: ( ruleDtoPropertyReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4029:1: ( ruleDtoPropertyReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4030:1: ruleDtoPropertyReference
            {
             before(grammarAccess.getFormElementAccess().getReferencesDtoPropertyReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_rule__FormElement__ReferencesAssignment_18083);
            ruleDtoPropertyReference();
            _fsp--;

             after(grammarAccess.getFormElementAccess().getReferencesDtoPropertyReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__ReferencesAssignment_1


    // $ANTLR start rule__FormElement__LabelAssignment_2_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4039:1: rule__FormElement__LabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__FormElement__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4043:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4044:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4044:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4045:1: RULE_STRING
            {
             before(grammarAccess.getFormElementAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FormElement__LabelAssignment_2_18114); 
             after(grammarAccess.getFormElementAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__LabelAssignment_2_1


    // $ANTLR start rule__FormElement__ReadonlyAssignment_3_1_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4054:1: rule__FormElement__ReadonlyAssignment_3_1_0 : ( ( 'true' ) ) ;
    public final void rule__FormElement__ReadonlyAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4058:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4059:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4059:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4060:1: ( 'true' )
            {
             before(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_3_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4061:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4062:1: 'true'
            {
             before(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_3_1_0_0()); 
            match(input,47,FOLLOW_47_in_rule__FormElement__ReadonlyAssignment_3_1_08150); 
             after(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_3_1_0_0()); 

            }

             after(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__ReadonlyAssignment_3_1_0


    // $ANTLR start rule__OperationExpression__NameAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4077:1: rule__OperationExpression__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OperationExpression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4081:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4082:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4082:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4083:1: RULE_ID
            {
             before(grammarAccess.getOperationExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OperationExpression__NameAssignment_18189); 
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


    // $ANTLR start rule__StandardExpression__TypeAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4092:1: rule__StandardExpression__TypeAssignment_0 : ( ruleExpressionType ) ;
    public final void rule__StandardExpression__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4096:1: ( ( ruleExpressionType ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4097:1: ( ruleExpressionType )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4097:1: ( ruleExpressionType )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4098:1: ruleExpressionType
            {
             before(grammarAccess.getStandardExpressionAccess().getTypeExpressionTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpressionType_in_rule__StandardExpression__TypeAssignment_08220);
            ruleExpressionType();
            _fsp--;

             after(grammarAccess.getStandardExpressionAccess().getTypeExpressionTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StandardExpression__TypeAssignment_0


    // $ANTLR start rule__StandardExpression__ContextRefAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4107:1: rule__StandardExpression__ContextRefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__StandardExpression__ContextRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4111:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4112:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4112:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4113:1: ( RULE_ID )
            {
             before(grammarAccess.getStandardExpressionAccess().getContextRefDtoReferenceCrossReference_1_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4114:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4115:1: RULE_ID
            {
             before(grammarAccess.getStandardExpressionAccess().getContextRefDtoReferenceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StandardExpression__ContextRefAssignment_18255); 
             after(grammarAccess.getStandardExpressionAccess().getContextRefDtoReferenceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getStandardExpressionAccess().getContextRefDtoReferenceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StandardExpression__ContextRefAssignment_1


    // $ANTLR start rule__ServiceExpression__ServiceAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4126:1: rule__ServiceExpression__ServiceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ServiceExpression__ServiceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4130:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4131:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4131:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4132:1: ( RULE_ID )
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceServiceReferenceCrossReference_1_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4133:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4134:1: RULE_ID
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceServiceReferenceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceExpression__ServiceAssignment_18294); 
             after(grammarAccess.getServiceExpressionAccess().getServiceServiceReferenceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getServiceExpressionAccess().getServiceServiceReferenceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceExpression__ServiceAssignment_1


    // $ANTLR start rule__NavigationExpression__ReferencesAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4145:1: rule__NavigationExpression__ReferencesAssignment_1 : ( ruleAssociationRoleReference ) ;
    public final void rule__NavigationExpression__ReferencesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4149:1: ( ( ruleAssociationRoleReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4150:1: ( ruleAssociationRoleReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4150:1: ( ruleAssociationRoleReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4151:1: ruleAssociationRoleReference
            {
             before(grammarAccess.getNavigationExpressionAccess().getReferencesAssociationRoleReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_rule__NavigationExpression__ReferencesAssignment_18329);
            ruleAssociationRoleReference();
            _fsp--;

             after(grammarAccess.getNavigationExpressionAccess().getReferencesAssociationRoleReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NavigationExpression__ReferencesAssignment_1


    // $ANTLR start rule__DtoPropertyReference__NameAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4160:1: rule__DtoPropertyReference__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DtoPropertyReference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4164:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4165:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4165:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4166:1: RULE_ID
            {
             before(grammarAccess.getDtoPropertyReferenceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoPropertyReference__NameAssignment_08360); 
             after(grammarAccess.getDtoPropertyReferenceAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoPropertyReference__NameAssignment_0


    // $ANTLR start rule__DtoPropertyReference__SubnameAssignment_1_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4175:1: rule__DtoPropertyReference__SubnameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__DtoPropertyReference__SubnameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4179:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4180:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4180:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4181:1: RULE_ID
            {
             before(grammarAccess.getDtoPropertyReferenceAccess().getSubnameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoPropertyReference__SubnameAssignment_1_18391); 
             after(grammarAccess.getDtoPropertyReferenceAccess().getSubnameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoPropertyReference__SubnameAssignment_1_1


    // $ANTLR start rule__AssociationRoleReference__NameAssignment
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4190:1: rule__AssociationRoleReference__NameAssignment : ( RULE_ID ) ;
    public final void rule__AssociationRoleReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4194:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4195:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4195:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4196:1: RULE_ID
            {
             before(grammarAccess.getAssociationRoleReferenceAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssociationRoleReference__NameAssignment8422); 
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
    public static final BitSet FOLLOW_ruleFormsAndProcesses_in_entryRuleFormsAndProcesses180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormsAndProcesses187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__Group__0_in_ruleFormsAndProcesses214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMenu_in_entryRuleMenu240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMenu247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__Group__0_in_ruleMenu274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_entryRuleExternalReference300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalReference307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__Alternatives_in_ruleExternalReference334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoReference_in_entryRuleDtoReference360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoReference367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoReference__Group__0_in_ruleDtoReference394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageReference_in_entryRulePageReference420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageReference427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageReference__Group__0_in_rulePageReference454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceReference_in_entryRuleServiceReference480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceReference487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceReference__Group__0_in_ruleServiceReference514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_entryRuleModelElementWithContext540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElementWithContext547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_ruleModelElementWithContext574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIModelElement606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDialogue_in_ruleUIModelElement633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDialogue_in_entryRuleAbstractDialogue658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDialogue665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractDialogue__Alternatives_in_ruleAbstractDialogue692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__0_in_ruleView752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMenuAction_in_entryRuleMenuAction778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMenuAction785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MenuAction__Group__0_in_ruleMenuAction812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0_in_rulePage932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_entryRuleFormElement958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormElement965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group__0_in_ruleFormElement992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_entryRuleOperationExpression1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationExpression1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationExpression__Group__0_in_ruleOperationExpression1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardExpression_in_entryRuleStandardExpression1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStandardExpression1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandardExpression__Group__0_in_ruleStandardExpression1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceExpression_in_entryRuleServiceExpression1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceExpression1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceExpression__Group__0_in_ruleServiceExpression1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_entryRuleNavigationExpression1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigationExpression1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NavigationExpression__Group__0_in_ruleNavigationExpression1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoPropertyReference1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoPropertyReference__Group__0_in_ruleDtoPropertyReference1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociationRoleReference1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationRoleReference__NameAssignment_in_ruleAssociationRoleReference1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessType__Alternatives_in_ruleProcessType1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProcessTypeLink1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionType__Alternatives_in_ruleExpressionType1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationModel_in_rule__PresentationModel__Alternatives1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormsAndProcesses_in_rule__PresentationModel__Alternatives1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoReference_in_rule__ExternalReference__Alternatives1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageReference_in_rule__ExternalReference__Alternatives1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceReference_in_rule__ExternalReference__Alternatives1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_rule__AbstractDialogue__Alternatives1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_rule__AbstractDialogue__Alternatives1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__0_in_rule__View__Alternatives_31725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3_1__0_in_rule__View__Alternatives_31743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MenuAction__Alternatives_4_0_in_rule__MenuAction__Alternatives_41776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MenuAction__ContextExpAssignment_4_1_in_rule__MenuAction__Alternatives_41794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MenuAction__TypeAssignment_4_0_0_in_rule__MenuAction__Alternatives_4_01827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MenuAction__Group_4_0_1__0_in_rule__MenuAction__Alternatives_4_01845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Alternatives_4_0_in_rule__Action__Alternatives_41878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__ContextExpAssignment_4_1_in_rule__Action__Alternatives_41896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__TypeAssignment_4_0_0_in_rule__Action__Alternatives_4_01929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4_0_1__0_in_rule__Action__Alternatives_4_01947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__ReadonlyAssignment_3_1_0_in_rule__FormElement__Alternatives_3_11980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FormElement__Alternatives_3_11999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceExpression_in_rule__Expression__Alternatives2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_rule__Expression__Alternatives2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardExpression_in_rule__Expression__Alternatives2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_rule__Expression__Alternatives2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ProcessType__Alternatives2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ProcessType__Alternatives2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ProcessType__Alternatives2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ProcessType__Alternatives2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ProcessType__Alternatives2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ProcessType__Alternatives2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ProcessType__Alternatives2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ProcessType__Alternatives2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ExpressionType__Alternatives2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ExpressionType__Alternatives2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__DescriptionAssignment_0_in_rule__ApplicationModel__Group__02359 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__1_in_rule__ApplicationModel__Group__02369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ApplicationModel__Group__12398 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__2_in_rule__ApplicationModel__Group__12408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__NameAssignment_2_in_rule__ApplicationModel__Group__22436 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__3_in_rule__ApplicationModel__Group__22445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ApplicationModel__Group__32474 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__4_in_rule__ApplicationModel__Group__32484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__ExternalReferencesAssignment_4_in_rule__ApplicationModel__Group__42512 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__5_in_rule__ApplicationModel__Group__42522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__MainMenuAssignment_5_in_rule__ApplicationModel__Group__52550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__DescriptionAssignment_0_in_rule__FormsAndProcesses__Group__02596 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__Group__1_in_rule__FormsAndProcesses__Group__02606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FormsAndProcesses__Group__12635 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__Group__2_in_rule__FormsAndProcesses__Group__12645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__NameAssignment_2_in_rule__FormsAndProcesses__Group__22673 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__Group__3_in_rule__FormsAndProcesses__Group__22682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__FormsAndProcesses__Group__32711 = new BitSet(new long[]{0x00000002A0000012L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__Group__4_in_rule__FormsAndProcesses__Group__32721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__ExternalReferencesAssignment_4_in_rule__FormsAndProcesses__Group__42749 = new BitSet(new long[]{0x00000002A0000012L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__Group__5_in_rule__FormsAndProcesses__Group__42759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__ElementsAssignment_5_in_rule__FormsAndProcesses__Group__52787 = new BitSet(new long[]{0x0000000280000012L});
    public static final BitSet FOLLOW_26_in_rule__Menu__Group__02835 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Menu__Group__1_in_rule__Menu__Group__02845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Menu__Group__12874 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_rule__Menu__Group__2_in_rule__Menu__Group__12884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Menu__StartActionsAssignment_2_in_rule__Menu__Group__22912 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_rule__Menu__Group__3_in_rule__Menu__Group__22922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Menu__Group__32951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DtoReference__Group__02995 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoReference__Group__1_in_rule__DtoReference__Group__03005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoReference__ModelNameAssignment_1_in_rule__DtoReference__Group__13033 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DtoReference__Group__2_in_rule__DtoReference__Group__13042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DtoReference__Group__23071 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoReference__Group__3_in_rule__DtoReference__Group__23081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoReference__NameAssignment_3_in_rule__DtoReference__Group__33109 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__DtoReference__Group__4_in_rule__DtoReference__Group__33118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DtoReference__Group__43147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PageReference__Group__03193 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PageReference__Group__1_in_rule__PageReference__Group__03203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageReference__ModelNameAssignment_1_in_rule__PageReference__Group__13231 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PageReference__Group__2_in_rule__PageReference__Group__13240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PageReference__Group__23269 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PageReference__Group__3_in_rule__PageReference__Group__23279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageReference__NameAssignment_3_in_rule__PageReference__Group__33307 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__PageReference__Group__4_in_rule__PageReference__Group__33316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PageReference__Group__43345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ServiceReference__Group__03391 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ServiceReference__Group__1_in_rule__ServiceReference__Group__03401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceReference__ModelNameAssignment_1_in_rule__ServiceReference__Group__13429 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ServiceReference__Group__2_in_rule__ServiceReference__Group__13438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ServiceReference__Group__23467 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ServiceReference__Group__3_in_rule__ServiceReference__Group__23477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceReference__NameAssignment_3_in_rule__ServiceReference__Group__33505 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ServiceReference__Group__4_in_rule__ServiceReference__Group__33514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ServiceReference__Group__43543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__DescriptionAssignment_0_in_rule__View__Group__03588 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__View__Group__1_in_rule__View__Group__03598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__View__Group__13627 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__View__Group__2_in_rule__View__Group__13637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__NameAssignment_2_in_rule__View__Group__23665 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_rule__View__Group__3_in_rule__View__Group__23674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Alternatives_3_in_rule__View__Group__33702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__View__Group_3_0__03745 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__1_in_rule__View__Group_3_0__03755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__BaseViewAssignment_3_0_1_in_rule__View__Group_3_0__13783 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__2_in_rule__View__Group_3_0__13792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__View__Group_3_0__23821 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__3_in_rule__View__Group_3_0__23831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3_0_3__0_in_rule__View__Group_3_0__33859 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__4_in_rule__View__Group_3_0__33869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__View__Group_3_0__43898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__View__Group_3_0_3__03944 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__View__Group_3_0_3__1_in_rule__View__Group_3_0_3__03954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__View__Group_3_0_3__13983 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_rule__View__Group_3_0_3__2_in_rule__View__Group_3_0_3__13993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__ActionsAssignment_3_0_3_2_in_rule__View__Group_3_0_3__24021 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_rule__View__Group_3_0_3__3_in_rule__View__Group_3_0_3__24031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__View__Group_3_0_3__34060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__View__Group_3_1__04104 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_rule__View__Group_3_1__1_in_rule__View__Group_3_1__04114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__CollectionContextAssignment_3_1_1_in_rule__View__Group_3_1__14142 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__View__Group_3_1__2_in_rule__View__Group_3_1__14152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__ContextRefAssignment_3_1_2_in_rule__View__Group_3_1__24180 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__View__Group_3_1__3_in_rule__View__Group_3_1__24189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__View__Group_3_1__34218 = new BitSet(new long[]{0x0000000810000030L});
    public static final BitSet FOLLOW_rule__View__Group_3_1__4_in_rule__View__Group_3_1__34228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__FormElementsAssignment_3_1_4_in_rule__View__Group_3_1__44256 = new BitSet(new long[]{0x0000000810000030L});
    public static final BitSet FOLLOW_rule__View__Group_3_1__5_in_rule__View__Group_3_1__44266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3_1_5__0_in_rule__View__Group_3_1__54294 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__View__Group_3_1__6_in_rule__View__Group_3_1__54304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__View__Group_3_1__64333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__View__Group_3_1_5__04383 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__View__Group_3_1_5__1_in_rule__View__Group_3_1_5__04393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__View__Group_3_1_5__14422 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_rule__View__Group_3_1_5__2_in_rule__View__Group_3_1_5__14432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__ActionsAssignment_3_1_5_2_in_rule__View__Group_3_1_5__24460 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_rule__View__Group_3_1_5__3_in_rule__View__Group_3_1_5__24470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__View__Group_3_1_5__34499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MenuAction__DescriptionAssignment_0_in_rule__MenuAction__Group__04542 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MenuAction__Group__1_in_rule__MenuAction__Group__04552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MenuAction__NameAssignment_1_in_rule__MenuAction__Group__14580 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__MenuAction__Group__2_in_rule__MenuAction__Group__14589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MenuAction__Group_2__0_in_rule__MenuAction__Group__24617 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__MenuAction__Group__3_in_rule__MenuAction__Group__24627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__MenuAction__Group__34656 = new BitSet(new long[]{0x00000C01007FE800L});
    public static final BitSet FOLLOW_rule__MenuAction__Group__4_in_rule__MenuAction__Group__34666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MenuAction__Alternatives_4_in_rule__MenuAction__Group__44694 = new BitSet(new long[]{0x0000008001000000L});
    public static final BitSet FOLLOW_rule__MenuAction__Group__5_in_rule__MenuAction__Group__44703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MenuAction__Group_5__0_in_rule__MenuAction__Group__54731 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MenuAction__Group__6_in_rule__MenuAction__Group__54741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MenuAction__Group__64770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__MenuAction__Group_2__04820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MenuAction__Group_2__1_in_rule__MenuAction__Group_2__04830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MenuAction__LabelAssignment_2_1_in_rule__MenuAction__Group_2__14858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MenuAction__TypeAssignment_4_0_1_0_in_rule__MenuAction__Group_4_0_1__04896 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__MenuAction__Group_4_0_1__1_in_rule__MenuAction__Group_4_0_1__04905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MenuAction__ContextExpAssignment_4_0_1_1_in_rule__MenuAction__Group_4_0_1__14933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MenuAction__Group_5__04972 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__MenuAction__Group_5__1_in_rule__MenuAction__Group_5__04982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MenuAction__Group_5__15011 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MenuAction__Group_5__2_in_rule__MenuAction__Group_5__15021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MenuAction__NextPageAssignment_5_2_in_rule__MenuAction__Group_5__25049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DescriptionAssignment_0_in_rule__Action__Group__05089 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__05099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__15127 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__15136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_2__0_in_rule__Action__Group__25164 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__25174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Action__Group__35203 = new BitSet(new long[]{0x00000C01007FE800L});
    public static final BitSet FOLLOW_rule__Action__Group__4_in_rule__Action__Group__35213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Alternatives_4_in_rule__Action__Group__45241 = new BitSet(new long[]{0x0000408001000000L});
    public static final BitSet FOLLOW_rule__Action__Group__5_in_rule__Action__Group__45250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_5__0_in_rule__Action__Group__55278 = new BitSet(new long[]{0x0000400001000000L});
    public static final BitSet FOLLOW_rule__Action__Group__6_in_rule__Action__Group__55288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__CollectionContextAssignment_6_in_rule__Action__Group__65316 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Action__Group__7_in_rule__Action__Group__65326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Action__Group__75355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Action__Group_2__05407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Action__Group_2__1_in_rule__Action__Group_2__05417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__LabelAssignment_2_1_in_rule__Action__Group_2__15445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__TypeAssignment_4_0_1_0_in_rule__Action__Group_4_0_1__05483 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Action__Group_4_0_1__1_in_rule__Action__Group_4_0_1__05492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__ContextExpAssignment_4_0_1_1_in_rule__Action__Group_4_0_1__15520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Action__Group_5__05559 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Action__Group_5__1_in_rule__Action__Group_5__05569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Action__Group_5__15598 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Action__Group_5__2_in_rule__Action__Group_5__15608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NextPageAssignment_5_2_in_rule__Action__Group_5__25636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Page__Group__05677 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__05687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__15715 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__15724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Page__Group__25753 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__25763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__DialogueAssignment_3_in_rule__Page__Group__35791 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__35800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Page__Group__45829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__DescriptionAssignment_0_in_rule__FormElement__Group__05874 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FormElement__Group__1_in_rule__FormElement__Group__05884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__ReferencesAssignment_1_in_rule__FormElement__Group__15912 = new BitSet(new long[]{0x0000024001000000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__2_in_rule__FormElement__Group__15921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group_2__0_in_rule__FormElement__Group__25949 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__3_in_rule__FormElement__Group__25959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group_3__0_in_rule__FormElement__Group__35987 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__4_in_rule__FormElement__Group__35997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__FormElement__Group__46026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FormElement__Group_2__06072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FormElement__Group_2__1_in_rule__FormElement__Group_2__06082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__LabelAssignment_2_1_in_rule__FormElement__Group_2__16110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__FormElement__Group_3__06149 = new BitSet(new long[]{0x0000800000001000L});
    public static final BitSet FOLLOW_rule__FormElement__Group_3__1_in_rule__FormElement__Group_3__06159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Alternatives_3_1_in_rule__FormElement__Group_3__16187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__OperationExpression__Group__06226 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__OperationExpression__Group__1_in_rule__OperationExpression__Group__06236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationExpression__NameAssignment_1_in_rule__OperationExpression__Group__16264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandardExpression__TypeAssignment_0_in_rule__StandardExpression__Group__06302 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StandardExpression__Group__1_in_rule__StandardExpression__Group__06311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandardExpression__ContextRefAssignment_1_in_rule__StandardExpression__Group__16339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ServiceExpression__Group__06378 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ServiceExpression__Group__1_in_rule__ServiceExpression__Group__06388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceExpression__ServiceAssignment_1_in_rule__ServiceExpression__Group__16416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__NavigationExpression__Group__06455 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NavigationExpression__Group__1_in_rule__NavigationExpression__Group__06465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NavigationExpression__ReferencesAssignment_1_in_rule__NavigationExpression__Group__16493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoPropertyReference__NameAssignment_0_in_rule__DtoPropertyReference__Group__06531 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__DtoPropertyReference__Group__1_in_rule__DtoPropertyReference__Group__06540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoPropertyReference__Group_1__0_in_rule__DtoPropertyReference__Group__16568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__DtoPropertyReference__Group_1__06608 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoPropertyReference__Group_1__1_in_rule__DtoPropertyReference__Group_1__06618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoPropertyReference__SubnameAssignment_1_1_in_rule__DtoPropertyReference__Group_1__16646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ApplicationModel__DescriptionAssignment_06684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ApplicationModel__NameAssignment_26715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_rule__ApplicationModel__ExternalReferencesAssignment_46746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMenu_in_rule__ApplicationModel__MainMenuAssignment_56777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FormsAndProcesses__DescriptionAssignment_06808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FormsAndProcesses__NameAssignment_26839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_rule__FormsAndProcesses__ExternalReferencesAssignment_46870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_rule__FormsAndProcesses__ElementsAssignment_56901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMenuAction_in_rule__Menu__StartActionsAssignment_26932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoReference__ModelNameAssignment_16963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoReference__NameAssignment_36994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PageReference__ModelNameAssignment_17025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PageReference__NameAssignment_37056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceReference__ModelNameAssignment_17087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceReference__NameAssignment_37118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__View__DescriptionAssignment_07149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__View__NameAssignment_27180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__View__BaseViewAssignment_3_0_17215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__View__ActionsAssignment_3_0_3_27250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__View__CollectionContextAssignment_3_1_17286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__View__ContextRefAssignment_3_1_27329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_rule__View__FormElementsAssignment_3_1_47364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__View__ActionsAssignment_3_1_5_27395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MenuAction__DescriptionAssignment_07426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MenuAction__NameAssignment_17457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MenuAction__LabelAssignment_2_17488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessType_in_rule__MenuAction__TypeAssignment_4_0_07519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessTypeLink_in_rule__MenuAction__TypeAssignment_4_0_1_07550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_rule__MenuAction__ContextExpAssignment_4_0_1_17581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__MenuAction__ContextExpAssignment_4_17612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MenuAction__NextPageAssignment_5_27647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Action__DescriptionAssignment_07682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NameAssignment_17713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Action__LabelAssignment_2_17744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessType_in_rule__Action__TypeAssignment_4_0_07775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessTypeLink_in_rule__Action__TypeAssignment_4_0_1_07806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_rule__Action__ContextExpAssignment_4_0_1_17837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Action__ContextExpAssignment_4_17868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NextPageAssignment_5_27903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Action__CollectionContextAssignment_67943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Page__NameAssignment_17982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Page__DialogueAssignment_38017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FormElement__DescriptionAssignment_08052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_rule__FormElement__ReferencesAssignment_18083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FormElement__LabelAssignment_2_18114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__FormElement__ReadonlyAssignment_3_1_08150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OperationExpression__NameAssignment_18189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionType_in_rule__StandardExpression__TypeAssignment_08220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StandardExpression__ContextRefAssignment_18255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceExpression__ServiceAssignment_18294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_rule__NavigationExpression__ReferencesAssignment_18329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoPropertyReference__NameAssignment_08360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoPropertyReference__SubnameAssignment_1_18391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationRoleReference__NameAssignment8422 = new BitSet(new long[]{0x0000000000000002L});

}