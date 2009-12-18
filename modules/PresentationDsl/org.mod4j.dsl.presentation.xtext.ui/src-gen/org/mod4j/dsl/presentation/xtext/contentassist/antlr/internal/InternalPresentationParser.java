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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'new'", "'save'", "'edit'", "'remove'", "'presentation'", "';'", "'from'", "'import'", "'ContentForm'", "'context'", "'['", "']'", "'readonly'", "'actions'", "'processes'", "'use'", "'CompoundDialogue'", "'dialogues'", "'CollectionDialogue'", "'MasterDetail'", "'master'", "'detail'", "'AutomatedProcess'", "'steps'", "'InteractiveProcess'", "'element'", "'label'", "'alias'", "'to'", "'linkref'", "'call'", "'.'", "'LinkStep'", "'navigate'", "'LinkPath'", "'dialogue'", "'process'", "'list'", "'true'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:68:1: rulePresentationModel : ( ( rule__PresentationModel__Group__0 ) ) ;
    public final void rulePresentationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:72:2: ( ( ( rule__PresentationModel__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:73:1: ( ( rule__PresentationModel__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:73:1: ( ( rule__PresentationModel__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:74:1: ( rule__PresentationModel__Group__0 )
            {
             before(grammarAccess.getPresentationModelAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:75:1: ( rule__PresentationModel__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:75:2: rule__PresentationModel__Group__0
            {
            pushFollow(FOLLOW_rule__PresentationModel__Group__0_in_rulePresentationModel94);
            rule__PresentationModel__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPresentationModelAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start entryRuleExternalReference
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:87:1: entryRuleExternalReference : ruleExternalReference EOF ;
    public final void entryRuleExternalReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:87:28: ( ruleExternalReference EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:88:1: ruleExternalReference EOF
            {
             before(grammarAccess.getExternalReferenceRule()); 
            pushFollow(FOLLOW_ruleExternalReference_in_entryRuleExternalReference120);
            ruleExternalReference();
            _fsp--;

             after(grammarAccess.getExternalReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalReference127); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:95:1: ruleExternalReference : ( ( rule__ExternalReference__Group__0 ) ) ;
    public final void ruleExternalReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:99:2: ( ( ( rule__ExternalReference__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:100:1: ( ( rule__ExternalReference__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:100:1: ( ( rule__ExternalReference__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:101:1: ( rule__ExternalReference__Group__0 )
            {
             before(grammarAccess.getExternalReferenceAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:102:1: ( rule__ExternalReference__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:102:2: rule__ExternalReference__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalReference__Group__0_in_ruleExternalReference154);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:114:1: entryRuleModelElementWithContext : ruleModelElementWithContext EOF ;
    public final void entryRuleModelElementWithContext() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:114:34: ( ruleModelElementWithContext EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:115:1: ruleModelElementWithContext EOF
            {
             before(grammarAccess.getModelElementWithContextRule()); 
            pushFollow(FOLLOW_ruleModelElementWithContext_in_entryRuleModelElementWithContext180);
            ruleModelElementWithContext();
            _fsp--;

             after(grammarAccess.getModelElementWithContextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElementWithContext187); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:122:1: ruleModelElementWithContext : ( ( rule__ModelElementWithContext__Alternatives ) ) ;
    public final void ruleModelElementWithContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:126:2: ( ( ( rule__ModelElementWithContext__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:127:1: ( ( rule__ModelElementWithContext__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:127:1: ( ( rule__ModelElementWithContext__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:128:1: ( rule__ModelElementWithContext__Alternatives )
            {
             before(grammarAccess.getModelElementWithContextAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:129:1: ( rule__ModelElementWithContext__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:129:2: rule__ModelElementWithContext__Alternatives
            {
            pushFollow(FOLLOW_rule__ModelElementWithContext__Alternatives_in_ruleModelElementWithContext214);
            rule__ModelElementWithContext__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getModelElementWithContextAccess().getAlternatives()); 

            }


            }

        }
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:141:1: entryRuleUIModelElement : ruleUIModelElement EOF ;
    public final void entryRuleUIModelElement() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:141:25: ( ruleUIModelElement EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:142:1: ruleUIModelElement EOF
            {
             before(grammarAccess.getUIModelElementRule()); 
            pushFollow(FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement240);
            ruleUIModelElement();
            _fsp--;

             after(grammarAccess.getUIModelElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIModelElement247); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:149:1: ruleUIModelElement : ( ( rule__UIModelElement__Alternatives ) ) ;
    public final void ruleUIModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:153:2: ( ( ( rule__UIModelElement__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:154:1: ( ( rule__UIModelElement__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:154:1: ( ( rule__UIModelElement__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:155:1: ( rule__UIModelElement__Alternatives )
            {
             before(grammarAccess.getUIModelElementAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:156:1: ( rule__UIModelElement__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:156:2: rule__UIModelElement__Alternatives
            {
            pushFollow(FOLLOW_rule__UIModelElement__Alternatives_in_ruleUIModelElement274);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:168:1: entryRuleDialogue : ruleDialogue EOF ;
    public final void entryRuleDialogue() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:168:19: ( ruleDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:169:1: ruleDialogue EOF
            {
             before(grammarAccess.getDialogueRule()); 
            pushFollow(FOLLOW_ruleDialogue_in_entryRuleDialogue300);
            ruleDialogue();
            _fsp--;

             after(grammarAccess.getDialogueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialogue307); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:176:1: ruleDialogue : ( ( rule__Dialogue__Alternatives ) ) ;
    public final void ruleDialogue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:180:2: ( ( ( rule__Dialogue__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:181:1: ( ( rule__Dialogue__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:181:1: ( ( rule__Dialogue__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:182:1: ( rule__Dialogue__Alternatives )
            {
             before(grammarAccess.getDialogueAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:183:1: ( rule__Dialogue__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:183:2: rule__Dialogue__Alternatives
            {
            pushFollow(FOLLOW_rule__Dialogue__Alternatives_in_ruleDialogue334);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:195:1: entryRuleContentForm : ruleContentForm EOF ;
    public final void entryRuleContentForm() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:195:22: ( ruleContentForm EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:196:1: ruleContentForm EOF
            {
             before(grammarAccess.getContentFormRule()); 
            pushFollow(FOLLOW_ruleContentForm_in_entryRuleContentForm360);
            ruleContentForm();
            _fsp--;

             after(grammarAccess.getContentFormRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentForm367); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:203:1: ruleContentForm : ( ( rule__ContentForm__Group__0 ) ) ;
    public final void ruleContentForm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:207:2: ( ( ( rule__ContentForm__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:208:1: ( ( rule__ContentForm__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:208:1: ( ( rule__ContentForm__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:209:1: ( rule__ContentForm__Group__0 )
            {
             before(grammarAccess.getContentFormAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:210:1: ( rule__ContentForm__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:210:2: rule__ContentForm__Group__0
            {
            pushFollow(FOLLOW_rule__ContentForm__Group__0_in_ruleContentForm394);
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


    // $ANTLR start entryRuleSimpleProcess
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:222:1: entryRuleSimpleProcess : ruleSimpleProcess EOF ;
    public final void entryRuleSimpleProcess() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:222:24: ( ruleSimpleProcess EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:223:1: ruleSimpleProcess EOF
            {
             before(grammarAccess.getSimpleProcessRule()); 
            pushFollow(FOLLOW_ruleSimpleProcess_in_entryRuleSimpleProcess420);
            ruleSimpleProcess();
            _fsp--;

             after(grammarAccess.getSimpleProcessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleProcess427); 

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
    // $ANTLR end entryRuleSimpleProcess


    // $ANTLR start ruleSimpleProcess
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:230:1: ruleSimpleProcess : ( ( rule__SimpleProcess__Group__0 ) ) ;
    public final void ruleSimpleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:234:2: ( ( ( rule__SimpleProcess__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:235:1: ( ( rule__SimpleProcess__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:235:1: ( ( rule__SimpleProcess__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:236:1: ( rule__SimpleProcess__Group__0 )
            {
             before(grammarAccess.getSimpleProcessAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:237:1: ( rule__SimpleProcess__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:237:2: rule__SimpleProcess__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleProcess__Group__0_in_ruleSimpleProcess454);
            rule__SimpleProcess__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSimpleProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSimpleProcess


    // $ANTLR start entryRuleCompoundDialogue
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:249:1: entryRuleCompoundDialogue : ruleCompoundDialogue EOF ;
    public final void entryRuleCompoundDialogue() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:249:27: ( ruleCompoundDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:250:1: ruleCompoundDialogue EOF
            {
             before(grammarAccess.getCompoundDialogueRule()); 
            pushFollow(FOLLOW_ruleCompoundDialogue_in_entryRuleCompoundDialogue480);
            ruleCompoundDialogue();
            _fsp--;

             after(grammarAccess.getCompoundDialogueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundDialogue487); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:257:1: ruleCompoundDialogue : ( ( rule__CompoundDialogue__Alternatives ) ) ;
    public final void ruleCompoundDialogue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:261:2: ( ( ( rule__CompoundDialogue__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:262:1: ( ( rule__CompoundDialogue__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:262:1: ( ( rule__CompoundDialogue__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:263:1: ( rule__CompoundDialogue__Alternatives )
            {
             before(grammarAccess.getCompoundDialogueAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:264:1: ( rule__CompoundDialogue__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:264:2: rule__CompoundDialogue__Alternatives
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__Alternatives_in_ruleCompoundDialogue514);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:276:1: entryRuleCollectionDialogue : ruleCollectionDialogue EOF ;
    public final void entryRuleCollectionDialogue() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:276:29: ( ruleCollectionDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:277:1: ruleCollectionDialogue EOF
            {
             before(grammarAccess.getCollectionDialogueRule()); 
            pushFollow(FOLLOW_ruleCollectionDialogue_in_entryRuleCollectionDialogue540);
            ruleCollectionDialogue();
            _fsp--;

             after(grammarAccess.getCollectionDialogueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionDialogue547); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:284:1: ruleCollectionDialogue : ( ( rule__CollectionDialogue__Group__0 ) ) ;
    public final void ruleCollectionDialogue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:288:2: ( ( ( rule__CollectionDialogue__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:289:1: ( ( rule__CollectionDialogue__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:289:1: ( ( rule__CollectionDialogue__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:290:1: ( rule__CollectionDialogue__Group__0 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:291:1: ( rule__CollectionDialogue__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:291:2: rule__CollectionDialogue__Group__0
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__Group__0_in_ruleCollectionDialogue574);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:303:1: entryRuleMasterDetail : ruleMasterDetail EOF ;
    public final void entryRuleMasterDetail() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:303:23: ( ruleMasterDetail EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:304:1: ruleMasterDetail EOF
            {
             before(grammarAccess.getMasterDetailRule()); 
            pushFollow(FOLLOW_ruleMasterDetail_in_entryRuleMasterDetail600);
            ruleMasterDetail();
            _fsp--;

             after(grammarAccess.getMasterDetailRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMasterDetail607); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:311:1: ruleMasterDetail : ( ( rule__MasterDetail__Group__0 ) ) ;
    public final void ruleMasterDetail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:315:2: ( ( ( rule__MasterDetail__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:316:1: ( ( rule__MasterDetail__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:316:1: ( ( rule__MasterDetail__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:317:1: ( rule__MasterDetail__Group__0 )
            {
             before(grammarAccess.getMasterDetailAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:318:1: ( rule__MasterDetail__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:318:2: rule__MasterDetail__Group__0
            {
            pushFollow(FOLLOW_rule__MasterDetail__Group__0_in_ruleMasterDetail634);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:330:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:330:18: ( ruleProcess EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:331:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess660);
            ruleProcess();
            _fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess667); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:338:1: ruleProcess : ( ( rule__Process__Alternatives ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:342:2: ( ( ( rule__Process__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:343:1: ( ( rule__Process__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:343:1: ( ( rule__Process__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:344:1: ( rule__Process__Alternatives )
            {
             before(grammarAccess.getProcessAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:345:1: ( rule__Process__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:345:2: rule__Process__Alternatives
            {
            pushFollow(FOLLOW_rule__Process__Alternatives_in_ruleProcess694);
            rule__Process__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start entryRuleAutomatedProcess
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:357:1: entryRuleAutomatedProcess : ruleAutomatedProcess EOF ;
    public final void entryRuleAutomatedProcess() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:357:27: ( ruleAutomatedProcess EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:358:1: ruleAutomatedProcess EOF
            {
             before(grammarAccess.getAutomatedProcessRule()); 
            pushFollow(FOLLOW_ruleAutomatedProcess_in_entryRuleAutomatedProcess720);
            ruleAutomatedProcess();
            _fsp--;

             after(grammarAccess.getAutomatedProcessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAutomatedProcess727); 

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
    // $ANTLR end entryRuleAutomatedProcess


    // $ANTLR start ruleAutomatedProcess
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:365:1: ruleAutomatedProcess : ( ( rule__AutomatedProcess__Group__0 ) ) ;
    public final void ruleAutomatedProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:369:2: ( ( ( rule__AutomatedProcess__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:370:1: ( ( rule__AutomatedProcess__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:370:1: ( ( rule__AutomatedProcess__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:371:1: ( rule__AutomatedProcess__Group__0 )
            {
             before(grammarAccess.getAutomatedProcessAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:372:1: ( rule__AutomatedProcess__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:372:2: rule__AutomatedProcess__Group__0
            {
            pushFollow(FOLLOW_rule__AutomatedProcess__Group__0_in_ruleAutomatedProcess754);
            rule__AutomatedProcess__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAutomatedProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAutomatedProcess


    // $ANTLR start entryRuleInteractiveProcess
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:384:1: entryRuleInteractiveProcess : ruleInteractiveProcess EOF ;
    public final void entryRuleInteractiveProcess() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:384:29: ( ruleInteractiveProcess EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:385:1: ruleInteractiveProcess EOF
            {
             before(grammarAccess.getInteractiveProcessRule()); 
            pushFollow(FOLLOW_ruleInteractiveProcess_in_entryRuleInteractiveProcess780);
            ruleInteractiveProcess();
            _fsp--;

             after(grammarAccess.getInteractiveProcessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractiveProcess787); 

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
    // $ANTLR end entryRuleInteractiveProcess


    // $ANTLR start ruleInteractiveProcess
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:392:1: ruleInteractiveProcess : ( ( rule__InteractiveProcess__Group__0 ) ) ;
    public final void ruleInteractiveProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:396:2: ( ( ( rule__InteractiveProcess__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:397:1: ( ( rule__InteractiveProcess__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:397:1: ( ( rule__InteractiveProcess__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:398:1: ( rule__InteractiveProcess__Group__0 )
            {
             before(grammarAccess.getInteractiveProcessAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:399:1: ( rule__InteractiveProcess__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:399:2: rule__InteractiveProcess__Group__0
            {
            pushFollow(FOLLOW_rule__InteractiveProcess__Group__0_in_ruleInteractiveProcess814);
            rule__InteractiveProcess__Group__0();
            _fsp--;


            }

             after(grammarAccess.getInteractiveProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleInteractiveProcess


    // $ANTLR start entryRuleFormElement
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:411:1: entryRuleFormElement : ruleFormElement EOF ;
    public final void entryRuleFormElement() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:411:22: ( ruleFormElement EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:412:1: ruleFormElement EOF
            {
             before(grammarAccess.getFormElementRule()); 
            pushFollow(FOLLOW_ruleFormElement_in_entryRuleFormElement840);
            ruleFormElement();
            _fsp--;

             after(grammarAccess.getFormElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormElement847); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:419:1: ruleFormElement : ( ( rule__FormElement__Group__0 ) ) ;
    public final void ruleFormElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:423:2: ( ( ( rule__FormElement__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:424:1: ( ( rule__FormElement__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:424:1: ( ( rule__FormElement__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:425:1: ( rule__FormElement__Group__0 )
            {
             before(grammarAccess.getFormElementAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:426:1: ( rule__FormElement__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:426:2: rule__FormElement__Group__0
            {
            pushFollow(FOLLOW_rule__FormElement__Group__0_in_ruleFormElement874);
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


    // $ANTLR start entryRuleDialogueCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:438:1: entryRuleDialogueCall : ruleDialogueCall EOF ;
    public final void entryRuleDialogueCall() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:438:23: ( ruleDialogueCall EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:439:1: ruleDialogueCall EOF
            {
             before(grammarAccess.getDialogueCallRule()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_entryRuleDialogueCall900);
            ruleDialogueCall();
            _fsp--;

             after(grammarAccess.getDialogueCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialogueCall907); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:446:1: ruleDialogueCall : ( ( rule__DialogueCall__Group__0 ) ) ;
    public final void ruleDialogueCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:450:2: ( ( ( rule__DialogueCall__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:451:1: ( ( rule__DialogueCall__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:451:1: ( ( rule__DialogueCall__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:452:1: ( rule__DialogueCall__Group__0 )
            {
             before(grammarAccess.getDialogueCallAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:453:1: ( rule__DialogueCall__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:453:2: rule__DialogueCall__Group__0
            {
            pushFollow(FOLLOW_rule__DialogueCall__Group__0_in_ruleDialogueCall934);
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


    // $ANTLR start entryRuleLinkedDialogueCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:465:1: entryRuleLinkedDialogueCall : ruleLinkedDialogueCall EOF ;
    public final void entryRuleLinkedDialogueCall() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:465:29: ( ruleLinkedDialogueCall EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:466:1: ruleLinkedDialogueCall EOF
            {
             before(grammarAccess.getLinkedDialogueCallRule()); 
            pushFollow(FOLLOW_ruleLinkedDialogueCall_in_entryRuleLinkedDialogueCall960);
            ruleLinkedDialogueCall();
            _fsp--;

             after(grammarAccess.getLinkedDialogueCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkedDialogueCall967); 

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
    // $ANTLR end entryRuleLinkedDialogueCall


    // $ANTLR start ruleLinkedDialogueCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:473:1: ruleLinkedDialogueCall : ( ( rule__LinkedDialogueCall__Group__0 ) ) ;
    public final void ruleLinkedDialogueCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:477:2: ( ( ( rule__LinkedDialogueCall__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:478:1: ( ( rule__LinkedDialogueCall__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:478:1: ( ( rule__LinkedDialogueCall__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:479:1: ( rule__LinkedDialogueCall__Group__0 )
            {
             before(grammarAccess.getLinkedDialogueCallAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:480:1: ( rule__LinkedDialogueCall__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:480:2: rule__LinkedDialogueCall__Group__0
            {
            pushFollow(FOLLOW_rule__LinkedDialogueCall__Group__0_in_ruleLinkedDialogueCall994);
            rule__LinkedDialogueCall__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLinkedDialogueCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLinkedDialogueCall


    // $ANTLR start entryRuleDirectDialogueCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:492:1: entryRuleDirectDialogueCall : ruleDirectDialogueCall EOF ;
    public final void entryRuleDirectDialogueCall() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:492:29: ( ruleDirectDialogueCall EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:493:1: ruleDirectDialogueCall EOF
            {
             before(grammarAccess.getDirectDialogueCallRule()); 
            pushFollow(FOLLOW_ruleDirectDialogueCall_in_entryRuleDirectDialogueCall1020);
            ruleDirectDialogueCall();
            _fsp--;

             after(grammarAccess.getDirectDialogueCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectDialogueCall1027); 

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
    // $ANTLR end entryRuleDirectDialogueCall


    // $ANTLR start ruleDirectDialogueCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:500:1: ruleDirectDialogueCall : ( ( rule__DirectDialogueCall__NameAssignment ) ) ;
    public final void ruleDirectDialogueCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:504:2: ( ( ( rule__DirectDialogueCall__NameAssignment ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:505:1: ( ( rule__DirectDialogueCall__NameAssignment ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:505:1: ( ( rule__DirectDialogueCall__NameAssignment ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:506:1: ( rule__DirectDialogueCall__NameAssignment )
            {
             before(grammarAccess.getDirectDialogueCallAccess().getNameAssignment()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:507:1: ( rule__DirectDialogueCall__NameAssignment )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:507:2: rule__DirectDialogueCall__NameAssignment
            {
            pushFollow(FOLLOW_rule__DirectDialogueCall__NameAssignment_in_ruleDirectDialogueCall1054);
            rule__DirectDialogueCall__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getDirectDialogueCallAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDirectDialogueCall


    // $ANTLR start entryRuleProcessCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:519:1: entryRuleProcessCall : ruleProcessCall EOF ;
    public final void entryRuleProcessCall() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:519:22: ( ruleProcessCall EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:520:1: ruleProcessCall EOF
            {
             before(grammarAccess.getProcessCallRule()); 
            pushFollow(FOLLOW_ruleProcessCall_in_entryRuleProcessCall1080);
            ruleProcessCall();
            _fsp--;

             after(grammarAccess.getProcessCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessCall1087); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:527:1: ruleProcessCall : ( ( rule__ProcessCall__Group__0 ) ) ;
    public final void ruleProcessCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:531:2: ( ( ( rule__ProcessCall__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:532:1: ( ( rule__ProcessCall__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:532:1: ( ( rule__ProcessCall__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:533:1: ( rule__ProcessCall__Group__0 )
            {
             before(grammarAccess.getProcessCallAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:534:1: ( rule__ProcessCall__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:534:2: rule__ProcessCall__Group__0
            {
            pushFollow(FOLLOW_rule__ProcessCall__Group__0_in_ruleProcessCall1114);
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


    // $ANTLR start entryRuleLinkedProcessCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:546:1: entryRuleLinkedProcessCall : ruleLinkedProcessCall EOF ;
    public final void entryRuleLinkedProcessCall() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:546:28: ( ruleLinkedProcessCall EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:547:1: ruleLinkedProcessCall EOF
            {
             before(grammarAccess.getLinkedProcessCallRule()); 
            pushFollow(FOLLOW_ruleLinkedProcessCall_in_entryRuleLinkedProcessCall1140);
            ruleLinkedProcessCall();
            _fsp--;

             after(grammarAccess.getLinkedProcessCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkedProcessCall1147); 

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
    // $ANTLR end entryRuleLinkedProcessCall


    // $ANTLR start ruleLinkedProcessCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:554:1: ruleLinkedProcessCall : ( ( rule__LinkedProcessCall__Group__0 ) ) ;
    public final void ruleLinkedProcessCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:558:2: ( ( ( rule__LinkedProcessCall__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:559:1: ( ( rule__LinkedProcessCall__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:559:1: ( ( rule__LinkedProcessCall__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:560:1: ( rule__LinkedProcessCall__Group__0 )
            {
             before(grammarAccess.getLinkedProcessCallAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:561:1: ( rule__LinkedProcessCall__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:561:2: rule__LinkedProcessCall__Group__0
            {
            pushFollow(FOLLOW_rule__LinkedProcessCall__Group__0_in_ruleLinkedProcessCall1174);
            rule__LinkedProcessCall__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLinkedProcessCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLinkedProcessCall


    // $ANTLR start entryRuleDirectProcessCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:573:1: entryRuleDirectProcessCall : ruleDirectProcessCall EOF ;
    public final void entryRuleDirectProcessCall() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:573:28: ( ruleDirectProcessCall EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:574:1: ruleDirectProcessCall EOF
            {
             before(grammarAccess.getDirectProcessCallRule()); 
            pushFollow(FOLLOW_ruleDirectProcessCall_in_entryRuleDirectProcessCall1200);
            ruleDirectProcessCall();
            _fsp--;

             after(grammarAccess.getDirectProcessCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectProcessCall1207); 

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
    // $ANTLR end entryRuleDirectProcessCall


    // $ANTLR start ruleDirectProcessCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:581:1: ruleDirectProcessCall : ( ( rule__DirectProcessCall__NameAssignment ) ) ;
    public final void ruleDirectProcessCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:585:2: ( ( ( rule__DirectProcessCall__NameAssignment ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:586:1: ( ( rule__DirectProcessCall__NameAssignment ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:586:1: ( ( rule__DirectProcessCall__NameAssignment ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:587:1: ( rule__DirectProcessCall__NameAssignment )
            {
             before(grammarAccess.getDirectProcessCallAccess().getNameAssignment()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:588:1: ( rule__DirectProcessCall__NameAssignment )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:588:2: rule__DirectProcessCall__NameAssignment
            {
            pushFollow(FOLLOW_rule__DirectProcessCall__NameAssignment_in_ruleDirectProcessCall1234);
            rule__DirectProcessCall__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getDirectProcessCallAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDirectProcessCall


    // $ANTLR start entryRuleLinkRef
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:600:1: entryRuleLinkRef : ruleLinkRef EOF ;
    public final void entryRuleLinkRef() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:600:18: ( ruleLinkRef EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:601:1: ruleLinkRef EOF
            {
             before(grammarAccess.getLinkRefRule()); 
            pushFollow(FOLLOW_ruleLinkRef_in_entryRuleLinkRef1260);
            ruleLinkRef();
            _fsp--;

             after(grammarAccess.getLinkRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkRef1267); 

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
    // $ANTLR end entryRuleLinkRef


    // $ANTLR start ruleLinkRef
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:608:1: ruleLinkRef : ( ( rule__LinkRef__Group__0 ) ) ;
    public final void ruleLinkRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:612:2: ( ( ( rule__LinkRef__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:613:1: ( ( rule__LinkRef__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:613:1: ( ( rule__LinkRef__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:614:1: ( rule__LinkRef__Group__0 )
            {
             before(grammarAccess.getLinkRefAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:615:1: ( rule__LinkRef__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:615:2: rule__LinkRef__Group__0
            {
            pushFollow(FOLLOW_rule__LinkRef__Group__0_in_ruleLinkRef1294);
            rule__LinkRef__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLinkRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLinkRef


    // $ANTLR start entryRuleLink
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:627:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:627:15: ( ruleLink EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:628:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink1320);
            ruleLink();
            _fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink1327); 

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
    // $ANTLR end entryRuleLink


    // $ANTLR start ruleLink
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:635:1: ruleLink : ( ( rule__Link__Alternatives ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:639:2: ( ( ( rule__Link__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:640:1: ( ( rule__Link__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:640:1: ( ( rule__Link__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:641:1: ( rule__Link__Alternatives )
            {
             before(grammarAccess.getLinkAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:642:1: ( rule__Link__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:642:2: rule__Link__Alternatives
            {
            pushFollow(FOLLOW_rule__Link__Alternatives_in_ruleLink1354);
            rule__Link__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLink


    // $ANTLR start entryRuleLinkService
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:654:1: entryRuleLinkService : ruleLinkService EOF ;
    public final void entryRuleLinkService() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:654:22: ( ruleLinkService EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:655:1: ruleLinkService EOF
            {
             before(grammarAccess.getLinkServiceRule()); 
            pushFollow(FOLLOW_ruleLinkService_in_entryRuleLinkService1380);
            ruleLinkService();
            _fsp--;

             after(grammarAccess.getLinkServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkService1387); 

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
    // $ANTLR end entryRuleLinkService


    // $ANTLR start ruleLinkService
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:662:1: ruleLinkService : ( ( rule__LinkService__Group__0 ) ) ;
    public final void ruleLinkService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:666:2: ( ( ( rule__LinkService__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:667:1: ( ( rule__LinkService__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:667:1: ( ( rule__LinkService__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:668:1: ( rule__LinkService__Group__0 )
            {
             before(grammarAccess.getLinkServiceAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:669:1: ( rule__LinkService__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:669:2: rule__LinkService__Group__0
            {
            pushFollow(FOLLOW_rule__LinkService__Group__0_in_ruleLinkService1414);
            rule__LinkService__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLinkServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLinkService


    // $ANTLR start entryRuleLinkStep
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:681:1: entryRuleLinkStep : ruleLinkStep EOF ;
    public final void entryRuleLinkStep() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:681:19: ( ruleLinkStep EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:682:1: ruleLinkStep EOF
            {
             before(grammarAccess.getLinkStepRule()); 
            pushFollow(FOLLOW_ruleLinkStep_in_entryRuleLinkStep1440);
            ruleLinkStep();
            _fsp--;

             after(grammarAccess.getLinkStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkStep1447); 

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
    // $ANTLR end entryRuleLinkStep


    // $ANTLR start ruleLinkStep
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:689:1: ruleLinkStep : ( ( rule__LinkStep__Group__0 ) ) ;
    public final void ruleLinkStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:693:2: ( ( ( rule__LinkStep__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:694:1: ( ( rule__LinkStep__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:694:1: ( ( rule__LinkStep__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:695:1: ( rule__LinkStep__Group__0 )
            {
             before(grammarAccess.getLinkStepAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:696:1: ( rule__LinkStep__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:696:2: rule__LinkStep__Group__0
            {
            pushFollow(FOLLOW_rule__LinkStep__Group__0_in_ruleLinkStep1474);
            rule__LinkStep__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLinkStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLinkStep


    // $ANTLR start entryRuleLinkPath
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:708:1: entryRuleLinkPath : ruleLinkPath EOF ;
    public final void entryRuleLinkPath() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:708:19: ( ruleLinkPath EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:709:1: ruleLinkPath EOF
            {
             before(grammarAccess.getLinkPathRule()); 
            pushFollow(FOLLOW_ruleLinkPath_in_entryRuleLinkPath1500);
            ruleLinkPath();
            _fsp--;

             after(grammarAccess.getLinkPathRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkPath1507); 

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
    // $ANTLR end entryRuleLinkPath


    // $ANTLR start ruleLinkPath
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:716:1: ruleLinkPath : ( ( rule__LinkPath__Group__0 ) ) ;
    public final void ruleLinkPath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:720:2: ( ( ( rule__LinkPath__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:721:1: ( ( rule__LinkPath__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:721:1: ( ( rule__LinkPath__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:722:1: ( rule__LinkPath__Group__0 )
            {
             before(grammarAccess.getLinkPathAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:723:1: ( rule__LinkPath__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:723:2: rule__LinkPath__Group__0
            {
            pushFollow(FOLLOW_rule__LinkPath__Group__0_in_ruleLinkPath1534);
            rule__LinkPath__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLinkPathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLinkPath


    // $ANTLR start entryRuleLinkNavigation
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:735:1: entryRuleLinkNavigation : ruleLinkNavigation EOF ;
    public final void entryRuleLinkNavigation() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:735:25: ( ruleLinkNavigation EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:736:1: ruleLinkNavigation EOF
            {
             before(grammarAccess.getLinkNavigationRule()); 
            pushFollow(FOLLOW_ruleLinkNavigation_in_entryRuleLinkNavigation1560);
            ruleLinkNavigation();
            _fsp--;

             after(grammarAccess.getLinkNavigationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkNavigation1567); 

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
    // $ANTLR end entryRuleLinkNavigation


    // $ANTLR start ruleLinkNavigation
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:743:1: ruleLinkNavigation : ( ( rule__LinkNavigation__Group__0 ) ) ;
    public final void ruleLinkNavigation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:747:2: ( ( ( rule__LinkNavigation__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:748:1: ( ( rule__LinkNavigation__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:748:1: ( ( rule__LinkNavigation__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:749:1: ( rule__LinkNavigation__Group__0 )
            {
             before(grammarAccess.getLinkNavigationAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:750:1: ( rule__LinkNavigation__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:750:2: rule__LinkNavigation__Group__0
            {
            pushFollow(FOLLOW_rule__LinkNavigation__Group__0_in_ruleLinkNavigation1594);
            rule__LinkNavigation__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLinkNavigationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLinkNavigation


    // $ANTLR start entryRuleDtoPropertyReference
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:762:1: entryRuleDtoPropertyReference : ruleDtoPropertyReference EOF ;
    public final void entryRuleDtoPropertyReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:762:31: ( ruleDtoPropertyReference EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:763:1: ruleDtoPropertyReference EOF
            {
             before(grammarAccess.getDtoPropertyReferenceRule()); 
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference1620);
            ruleDtoPropertyReference();
            _fsp--;

             after(grammarAccess.getDtoPropertyReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoPropertyReference1627); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:770:1: ruleDtoPropertyReference : ( ( rule__DtoPropertyReference__NameAssignment ) ) ;
    public final void ruleDtoPropertyReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:774:2: ( ( ( rule__DtoPropertyReference__NameAssignment ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:775:1: ( ( rule__DtoPropertyReference__NameAssignment ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:775:1: ( ( rule__DtoPropertyReference__NameAssignment ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:776:1: ( rule__DtoPropertyReference__NameAssignment )
            {
             before(grammarAccess.getDtoPropertyReferenceAccess().getNameAssignment()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:777:1: ( rule__DtoPropertyReference__NameAssignment )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:777:2: rule__DtoPropertyReference__NameAssignment
            {
            pushFollow(FOLLOW_rule__DtoPropertyReference__NameAssignment_in_ruleDtoPropertyReference1654);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:789:1: entryRuleAssociationRoleReference : ruleAssociationRoleReference EOF ;
    public final void entryRuleAssociationRoleReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:789:35: ( ruleAssociationRoleReference EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:790:1: ruleAssociationRoleReference EOF
            {
             before(grammarAccess.getAssociationRoleReferenceRule()); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference1680);
            ruleAssociationRoleReference();
            _fsp--;

             after(grammarAccess.getAssociationRoleReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociationRoleReference1687); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:797:1: ruleAssociationRoleReference : ( ( rule__AssociationRoleReference__NameAssignment ) ) ;
    public final void ruleAssociationRoleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:801:2: ( ( ( rule__AssociationRoleReference__NameAssignment ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:802:1: ( ( rule__AssociationRoleReference__NameAssignment ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:802:1: ( ( rule__AssociationRoleReference__NameAssignment ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:803:1: ( rule__AssociationRoleReference__NameAssignment )
            {
             before(grammarAccess.getAssociationRoleReferenceAccess().getNameAssignment()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:804:1: ( rule__AssociationRoleReference__NameAssignment )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:804:2: rule__AssociationRoleReference__NameAssignment
            {
            pushFollow(FOLLOW_rule__AssociationRoleReference__NameAssignment_in_ruleAssociationRoleReference1714);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:816:1: entryRuleUICall : ruleUICall EOF ;
    public final void entryRuleUICall() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:816:17: ( ruleUICall EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:817:1: ruleUICall EOF
            {
             before(grammarAccess.getUICallRule()); 
            pushFollow(FOLLOW_ruleUICall_in_entryRuleUICall1740);
            ruleUICall();
            _fsp--;

             after(grammarAccess.getUICallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUICall1747); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:824:1: ruleUICall : ( ruleUIModelElementCall ) ;
    public final void ruleUICall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:828:2: ( ( ruleUIModelElementCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:829:1: ( ruleUIModelElementCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:829:1: ( ruleUIModelElementCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:830:1: ruleUIModelElementCall
            {
             before(grammarAccess.getUICallAccess().getUIModelElementCallParserRuleCall()); 
            pushFollow(FOLLOW_ruleUIModelElementCall_in_ruleUICall1774);
            ruleUIModelElementCall();
            _fsp--;

             after(grammarAccess.getUICallAccess().getUIModelElementCallParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start entryRuleUIModelElementCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:843:1: entryRuleUIModelElementCall : ruleUIModelElementCall EOF ;
    public final void entryRuleUIModelElementCall() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:843:29: ( ruleUIModelElementCall EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:844:1: ruleUIModelElementCall EOF
            {
             before(grammarAccess.getUIModelElementCallRule()); 
            pushFollow(FOLLOW_ruleUIModelElementCall_in_entryRuleUIModelElementCall1799);
            ruleUIModelElementCall();
            _fsp--;

             after(grammarAccess.getUIModelElementCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIModelElementCall1806); 

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
    // $ANTLR end entryRuleUIModelElementCall


    // $ANTLR start ruleUIModelElementCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:851:1: ruleUIModelElementCall : ( ( rule__UIModelElementCall__Alternatives ) ) ;
    public final void ruleUIModelElementCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:855:2: ( ( ( rule__UIModelElementCall__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:856:1: ( ( rule__UIModelElementCall__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:856:1: ( ( rule__UIModelElementCall__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:857:1: ( rule__UIModelElementCall__Alternatives )
            {
             before(grammarAccess.getUIModelElementCallAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:858:1: ( rule__UIModelElementCall__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:858:2: rule__UIModelElementCall__Alternatives
            {
            pushFollow(FOLLOW_rule__UIModelElementCall__Alternatives_in_ruleUIModelElementCall1833);
            rule__UIModelElementCall__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getUIModelElementCallAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUIModelElementCall


    // $ANTLR start ruleProcessType
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:871:1: ruleProcessType : ( ( rule__ProcessType__Alternatives ) ) ;
    public final void ruleProcessType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:875:1: ( ( ( rule__ProcessType__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:876:1: ( ( rule__ProcessType__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:876:1: ( ( rule__ProcessType__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:877:1: ( rule__ProcessType__Alternatives )
            {
             before(grammarAccess.getProcessTypeAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:878:1: ( rule__ProcessType__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:878:2: rule__ProcessType__Alternatives
            {
            pushFollow(FOLLOW_rule__ProcessType__Alternatives_in_ruleProcessType1870);
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


    // $ANTLR start rule__ModelElementWithContext__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:889:1: rule__ModelElementWithContext__Alternatives : ( ( ruleUIModelElement ) | ( ruleLink ) );
    public final void rule__ModelElementWithContext__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:893:1: ( ( ruleUIModelElement ) | ( ruleLink ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==20||LA1_1==28||(LA1_1>=30 && LA1_1<=31)||LA1_1==34||LA1_1==36) ) {
                    alt1=1;
                }
                else if ( (LA1_1==44||LA1_1==46) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("889:1: rule__ModelElementWithContext__Alternatives : ( ( ruleUIModelElement ) | ( ruleLink ) );", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 20:
            case 28:
            case 30:
            case 31:
            case 34:
            case 36:
                {
                alt1=1;
                }
                break;
            case 41:
            case 42:
            case 44:
            case 45:
            case 46:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("889:1: rule__ModelElementWithContext__Alternatives : ( ( ruleUIModelElement ) | ( ruleLink ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:894:1: ( ruleUIModelElement )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:894:1: ( ruleUIModelElement )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:895:1: ruleUIModelElement
                    {
                     before(grammarAccess.getModelElementWithContextAccess().getUIModelElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUIModelElement_in_rule__ModelElementWithContext__Alternatives1905);
                    ruleUIModelElement();
                    _fsp--;

                     after(grammarAccess.getModelElementWithContextAccess().getUIModelElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:900:6: ( ruleLink )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:900:6: ( ruleLink )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:901:1: ruleLink
                    {
                     before(grammarAccess.getModelElementWithContextAccess().getLinkParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLink_in_rule__ModelElementWithContext__Alternatives1922);
                    ruleLink();
                    _fsp--;

                     after(grammarAccess.getModelElementWithContextAccess().getLinkParserRuleCall_1()); 

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
    // $ANTLR end rule__ModelElementWithContext__Alternatives


    // $ANTLR start rule__UIModelElement__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:911:1: rule__UIModelElement__Alternatives : ( ( ruleDialogue ) | ( ruleProcess ) );
    public final void rule__UIModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:915:1: ( ( ruleDialogue ) | ( ruleProcess ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==20||LA2_1==28||(LA2_1>=30 && LA2_1<=31)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==34||LA2_1==36) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("911:1: rule__UIModelElement__Alternatives : ( ( ruleDialogue ) | ( ruleProcess ) );", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 20:
            case 28:
            case 30:
            case 31:
                {
                alt2=1;
                }
                break;
            case 34:
            case 36:
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("911:1: rule__UIModelElement__Alternatives : ( ( ruleDialogue ) | ( ruleProcess ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:916:1: ( ruleDialogue )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:916:1: ( ruleDialogue )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:917:1: ruleDialogue
                    {
                     before(grammarAccess.getUIModelElementAccess().getDialogueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDialogue_in_rule__UIModelElement__Alternatives1954);
                    ruleDialogue();
                    _fsp--;

                     after(grammarAccess.getUIModelElementAccess().getDialogueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:922:6: ( ruleProcess )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:922:6: ( ruleProcess )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:923:1: ruleProcess
                    {
                     before(grammarAccess.getUIModelElementAccess().getProcessParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleProcess_in_rule__UIModelElement__Alternatives1971);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:933:1: rule__Dialogue__Alternatives : ( ( ruleContentForm ) | ( ruleCompoundDialogue ) );
    public final void rule__Dialogue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:937:1: ( ( ruleContentForm ) | ( ruleCompoundDialogue ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==28||(LA3_1>=30 && LA3_1<=31)) ) {
                    alt3=2;
                }
                else if ( (LA3_1==20) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("933:1: rule__Dialogue__Alternatives : ( ( ruleContentForm ) | ( ruleCompoundDialogue ) );", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt3=1;
                }
                break;
            case 28:
            case 30:
            case 31:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("933:1: rule__Dialogue__Alternatives : ( ( ruleContentForm ) | ( ruleCompoundDialogue ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:938:1: ( ruleContentForm )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:938:1: ( ruleContentForm )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:939:1: ruleContentForm
                    {
                     before(grammarAccess.getDialogueAccess().getContentFormParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleContentForm_in_rule__Dialogue__Alternatives2003);
                    ruleContentForm();
                    _fsp--;

                     after(grammarAccess.getDialogueAccess().getContentFormParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:944:6: ( ruleCompoundDialogue )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:944:6: ( ruleCompoundDialogue )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:945:1: ruleCompoundDialogue
                    {
                     before(grammarAccess.getDialogueAccess().getCompoundDialogueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCompoundDialogue_in_rule__Dialogue__Alternatives2020);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:955:1: rule__ContentForm__Alternatives_7_1 : ( ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) ) | ( 'false' ) );
    public final void rule__ContentForm__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:959:1: ( ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==50) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("955:1: rule__ContentForm__Alternatives_7_1 : ( ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) ) | ( 'false' ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:960:1: ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:960:1: ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:961:1: ( rule__ContentForm__ReadonlyAssignment_7_1_0 )
                    {
                     before(grammarAccess.getContentFormAccess().getReadonlyAssignment_7_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:962:1: ( rule__ContentForm__ReadonlyAssignment_7_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:962:2: rule__ContentForm__ReadonlyAssignment_7_1_0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__ReadonlyAssignment_7_1_0_in_rule__ContentForm__Alternatives_7_12052);
                    rule__ContentForm__ReadonlyAssignment_7_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getContentFormAccess().getReadonlyAssignment_7_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:966:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:966:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:967:1: 'false'
                    {
                     before(grammarAccess.getContentFormAccess().getFalseKeyword_7_1_1()); 
                    match(input,11,FOLLOW_11_in_rule__ContentForm__Alternatives_7_12071); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:979:1: rule__CompoundDialogue__Alternatives : ( ( ( rule__CompoundDialogue__Group_0__0 ) ) | ( ruleCollectionDialogue ) | ( ruleMasterDetail ) );
    public final void rule__CompoundDialogue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:983:1: ( ( ( rule__CompoundDialogue__Group_0__0 ) ) | ( ruleCollectionDialogue ) | ( ruleMasterDetail ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt5=1;
                    }
                    break;
                case 31:
                    {
                    alt5=3;
                    }
                    break;
                case 30:
                    {
                    alt5=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("979:1: rule__CompoundDialogue__Alternatives : ( ( ( rule__CompoundDialogue__Group_0__0 ) ) | ( ruleCollectionDialogue ) | ( ruleMasterDetail ) );", 5, 1, input);

                    throw nvae;
                }

                }
                break;
            case 28:
                {
                alt5=1;
                }
                break;
            case 30:
                {
                alt5=2;
                }
                break;
            case 31:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("979:1: rule__CompoundDialogue__Alternatives : ( ( ( rule__CompoundDialogue__Group_0__0 ) ) | ( ruleCollectionDialogue ) | ( ruleMasterDetail ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:984:1: ( ( rule__CompoundDialogue__Group_0__0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:984:1: ( ( rule__CompoundDialogue__Group_0__0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:985:1: ( rule__CompoundDialogue__Group_0__0 )
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getGroup_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:986:1: ( rule__CompoundDialogue__Group_0__0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:986:2: rule__CompoundDialogue__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__0_in_rule__CompoundDialogue__Alternatives2105);
                    rule__CompoundDialogue__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCompoundDialogueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:990:6: ( ruleCollectionDialogue )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:990:6: ( ruleCollectionDialogue )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:991:1: ruleCollectionDialogue
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getCollectionDialogueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCollectionDialogue_in_rule__CompoundDialogue__Alternatives2123);
                    ruleCollectionDialogue();
                    _fsp--;

                     after(grammarAccess.getCompoundDialogueAccess().getCollectionDialogueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:996:6: ( ruleMasterDetail )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:996:6: ( ruleMasterDetail )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:997:1: ruleMasterDetail
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getMasterDetailParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMasterDetail_in_rule__CompoundDialogue__Alternatives2140);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1007:1: rule__CompoundDialogue__Alternatives_0_5_1 : ( ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) ) | ( 'false' ) );
    public final void rule__CompoundDialogue__Alternatives_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1011:1: ( ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==50) ) {
                alt6=1;
            }
            else if ( (LA6_0==11) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1007:1: rule__CompoundDialogue__Alternatives_0_5_1 : ( ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) ) | ( 'false' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1012:1: ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1012:1: ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1013:1: ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 )
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getReadonlyAssignment_0_5_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1014:1: ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1014:2: rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0_in_rule__CompoundDialogue__Alternatives_0_5_12172);
                    rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getCompoundDialogueAccess().getReadonlyAssignment_0_5_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1018:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1018:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1019:1: 'false'
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getFalseKeyword_0_5_1_1()); 
                    match(input,11,FOLLOW_11_in_rule__CompoundDialogue__Alternatives_0_5_12191); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1031:1: rule__CollectionDialogue__Alternatives_6_1 : ( ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) ) | ( 'false' ) );
    public final void rule__CollectionDialogue__Alternatives_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1035:1: ( ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) ) | ( 'false' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==50) ) {
                alt7=1;
            }
            else if ( (LA7_0==11) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1031:1: rule__CollectionDialogue__Alternatives_6_1 : ( ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) ) | ( 'false' ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1036:1: ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1036:1: ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1037:1: ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 )
                    {
                     before(grammarAccess.getCollectionDialogueAccess().getReadonlyAssignment_6_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1038:1: ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1038:2: rule__CollectionDialogue__ReadonlyAssignment_6_1_0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__ReadonlyAssignment_6_1_0_in_rule__CollectionDialogue__Alternatives_6_12225);
                    rule__CollectionDialogue__ReadonlyAssignment_6_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getCollectionDialogueAccess().getReadonlyAssignment_6_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1042:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1042:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1043:1: 'false'
                    {
                     before(grammarAccess.getCollectionDialogueAccess().getFalseKeyword_6_1_1()); 
                    match(input,11,FOLLOW_11_in_rule__CollectionDialogue__Alternatives_6_12244); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1055:1: rule__MasterDetail__Alternatives_5_1 : ( ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) ) | ( 'false' ) );
    public final void rule__MasterDetail__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1059:1: ( ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) ) | ( 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==50) ) {
                alt8=1;
            }
            else if ( (LA8_0==11) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1055:1: rule__MasterDetail__Alternatives_5_1 : ( ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) ) | ( 'false' ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1060:1: ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1060:1: ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1061:1: ( rule__MasterDetail__ReadonlyAssignment_5_1_0 )
                    {
                     before(grammarAccess.getMasterDetailAccess().getReadonlyAssignment_5_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1062:1: ( rule__MasterDetail__ReadonlyAssignment_5_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1062:2: rule__MasterDetail__ReadonlyAssignment_5_1_0
                    {
                    pushFollow(FOLLOW_rule__MasterDetail__ReadonlyAssignment_5_1_0_in_rule__MasterDetail__Alternatives_5_12278);
                    rule__MasterDetail__ReadonlyAssignment_5_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getMasterDetailAccess().getReadonlyAssignment_5_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1066:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1066:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1067:1: 'false'
                    {
                     before(grammarAccess.getMasterDetailAccess().getFalseKeyword_5_1_1()); 
                    match(input,11,FOLLOW_11_in_rule__MasterDetail__Alternatives_5_12297); 
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


    // $ANTLR start rule__Process__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1079:1: rule__Process__Alternatives : ( ( ruleAutomatedProcess ) | ( ruleInteractiveProcess ) );
    public final void rule__Process__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1083:1: ( ( ruleAutomatedProcess ) | ( ruleInteractiveProcess ) )
            int alt9=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==34) ) {
                    alt9=1;
                }
                else if ( (LA9_1==36) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1079:1: rule__Process__Alternatives : ( ( ruleAutomatedProcess ) | ( ruleInteractiveProcess ) );", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                alt9=1;
                }
                break;
            case 36:
                {
                alt9=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1079:1: rule__Process__Alternatives : ( ( ruleAutomatedProcess ) | ( ruleInteractiveProcess ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1084:1: ( ruleAutomatedProcess )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1084:1: ( ruleAutomatedProcess )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1085:1: ruleAutomatedProcess
                    {
                     before(grammarAccess.getProcessAccess().getAutomatedProcessParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAutomatedProcess_in_rule__Process__Alternatives2331);
                    ruleAutomatedProcess();
                    _fsp--;

                     after(grammarAccess.getProcessAccess().getAutomatedProcessParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1090:6: ( ruleInteractiveProcess )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1090:6: ( ruleInteractiveProcess )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1091:1: ruleInteractiveProcess
                    {
                     before(grammarAccess.getProcessAccess().getInteractiveProcessParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInteractiveProcess_in_rule__Process__Alternatives2348);
                    ruleInteractiveProcess();
                    _fsp--;

                     after(grammarAccess.getProcessAccess().getInteractiveProcessParserRuleCall_1()); 

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
    // $ANTLR end rule__Process__Alternatives


    // $ANTLR start rule__FormElement__Alternatives_5_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1101:1: rule__FormElement__Alternatives_5_1 : ( ( ( rule__FormElement__ReadonlyAssignment_5_1_0 ) ) | ( 'false' ) );
    public final void rule__FormElement__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1105:1: ( ( ( rule__FormElement__ReadonlyAssignment_5_1_0 ) ) | ( 'false' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==50) ) {
                alt10=1;
            }
            else if ( (LA10_0==11) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1101:1: rule__FormElement__Alternatives_5_1 : ( ( ( rule__FormElement__ReadonlyAssignment_5_1_0 ) ) | ( 'false' ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1106:1: ( ( rule__FormElement__ReadonlyAssignment_5_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1106:1: ( ( rule__FormElement__ReadonlyAssignment_5_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1107:1: ( rule__FormElement__ReadonlyAssignment_5_1_0 )
                    {
                     before(grammarAccess.getFormElementAccess().getReadonlyAssignment_5_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1108:1: ( rule__FormElement__ReadonlyAssignment_5_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1108:2: rule__FormElement__ReadonlyAssignment_5_1_0
                    {
                    pushFollow(FOLLOW_rule__FormElement__ReadonlyAssignment_5_1_0_in_rule__FormElement__Alternatives_5_12380);
                    rule__FormElement__ReadonlyAssignment_5_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getFormElementAccess().getReadonlyAssignment_5_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1112:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1112:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1113:1: 'false'
                    {
                     before(grammarAccess.getFormElementAccess().getFalseKeyword_5_1_1()); 
                    match(input,11,FOLLOW_11_in_rule__FormElement__Alternatives_5_12399); 
                     after(grammarAccess.getFormElementAccess().getFalseKeyword_5_1_1()); 

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
    // $ANTLR end rule__FormElement__Alternatives_5_1


    // $ANTLR start rule__DialogueCall__Alternatives_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1125:1: rule__DialogueCall__Alternatives_0 : ( ( ruleDirectDialogueCall ) | ( ruleLinkedDialogueCall ) );
    public final void rule__DialogueCall__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1129:1: ( ( ruleDirectDialogueCall ) | ( ruleLinkedDialogueCall ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING||(LA11_0>=41 && LA11_0<=42)||(LA11_0>=44 && LA11_0<=46)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1125:1: rule__DialogueCall__Alternatives_0 : ( ( ruleDirectDialogueCall ) | ( ruleLinkedDialogueCall ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1130:1: ( ruleDirectDialogueCall )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1130:1: ( ruleDirectDialogueCall )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1131:1: ruleDirectDialogueCall
                    {
                     before(grammarAccess.getDialogueCallAccess().getDirectDialogueCallParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleDirectDialogueCall_in_rule__DialogueCall__Alternatives_02433);
                    ruleDirectDialogueCall();
                    _fsp--;

                     after(grammarAccess.getDialogueCallAccess().getDirectDialogueCallParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1136:6: ( ruleLinkedDialogueCall )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1136:6: ( ruleLinkedDialogueCall )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1137:1: ruleLinkedDialogueCall
                    {
                     before(grammarAccess.getDialogueCallAccess().getLinkedDialogueCallParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleLinkedDialogueCall_in_rule__DialogueCall__Alternatives_02450);
                    ruleLinkedDialogueCall();
                    _fsp--;

                     after(grammarAccess.getDialogueCallAccess().getLinkedDialogueCallParserRuleCall_0_1()); 

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
    // $ANTLR end rule__DialogueCall__Alternatives_0


    // $ANTLR start rule__ProcessCall__Alternatives_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1147:1: rule__ProcessCall__Alternatives_0 : ( ( ruleDirectProcessCall ) | ( ruleLinkedProcessCall ) );
    public final void rule__ProcessCall__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1151:1: ( ( ruleDirectProcessCall ) | ( ruleLinkedProcessCall ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==41) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1147:1: rule__ProcessCall__Alternatives_0 : ( ( ruleDirectProcessCall ) | ( ruleLinkedProcessCall ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1152:1: ( ruleDirectProcessCall )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1152:1: ( ruleDirectProcessCall )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1153:1: ruleDirectProcessCall
                    {
                     before(grammarAccess.getProcessCallAccess().getDirectProcessCallParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleDirectProcessCall_in_rule__ProcessCall__Alternatives_02482);
                    ruleDirectProcessCall();
                    _fsp--;

                     after(grammarAccess.getProcessCallAccess().getDirectProcessCallParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1158:6: ( ruleLinkedProcessCall )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1158:6: ( ruleLinkedProcessCall )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1159:1: ruleLinkedProcessCall
                    {
                     before(grammarAccess.getProcessCallAccess().getLinkedProcessCallParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleLinkedProcessCall_in_rule__ProcessCall__Alternatives_02499);
                    ruleLinkedProcessCall();
                    _fsp--;

                     after(grammarAccess.getProcessCallAccess().getLinkedProcessCallParserRuleCall_0_1()); 

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
    // $ANTLR end rule__ProcessCall__Alternatives_0


    // $ANTLR start rule__Link__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1169:1: rule__Link__Alternatives : ( ( ruleLinkStep ) | ( ruleLinkPath ) | ( ruleLinkService ) | ( ruleLinkRef ) | ( ruleLinkNavigation ) );
    public final void rule__Link__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1173:1: ( ( ruleLinkStep ) | ( ruleLinkPath ) | ( ruleLinkService ) | ( ruleLinkRef ) | ( ruleLinkNavigation ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==44) ) {
                    alt13=1;
                }
                else if ( (LA13_1==46) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1169:1: rule__Link__Alternatives : ( ( ruleLinkStep ) | ( ruleLinkPath ) | ( ruleLinkService ) | ( ruleLinkRef ) | ( ruleLinkNavigation ) );", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                alt13=1;
                }
                break;
            case 46:
                {
                alt13=2;
                }
                break;
            case 42:
                {
                alt13=3;
                }
                break;
            case 41:
                {
                alt13=4;
                }
                break;
            case 45:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1169:1: rule__Link__Alternatives : ( ( ruleLinkStep ) | ( ruleLinkPath ) | ( ruleLinkService ) | ( ruleLinkRef ) | ( ruleLinkNavigation ) );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1174:1: ( ruleLinkStep )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1174:1: ( ruleLinkStep )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1175:1: ruleLinkStep
                    {
                     before(grammarAccess.getLinkAccess().getLinkStepParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLinkStep_in_rule__Link__Alternatives2531);
                    ruleLinkStep();
                    _fsp--;

                     after(grammarAccess.getLinkAccess().getLinkStepParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1180:6: ( ruleLinkPath )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1180:6: ( ruleLinkPath )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1181:1: ruleLinkPath
                    {
                     before(grammarAccess.getLinkAccess().getLinkPathParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLinkPath_in_rule__Link__Alternatives2548);
                    ruleLinkPath();
                    _fsp--;

                     after(grammarAccess.getLinkAccess().getLinkPathParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1186:6: ( ruleLinkService )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1186:6: ( ruleLinkService )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1187:1: ruleLinkService
                    {
                     before(grammarAccess.getLinkAccess().getLinkServiceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleLinkService_in_rule__Link__Alternatives2565);
                    ruleLinkService();
                    _fsp--;

                     after(grammarAccess.getLinkAccess().getLinkServiceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1192:6: ( ruleLinkRef )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1192:6: ( ruleLinkRef )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1193:1: ruleLinkRef
                    {
                     before(grammarAccess.getLinkAccess().getLinkRefParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleLinkRef_in_rule__Link__Alternatives2582);
                    ruleLinkRef();
                    _fsp--;

                     after(grammarAccess.getLinkAccess().getLinkRefParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1198:6: ( ruleLinkNavigation )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1198:6: ( ruleLinkNavigation )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1199:1: ruleLinkNavigation
                    {
                     before(grammarAccess.getLinkAccess().getLinkNavigationParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleLinkNavigation_in_rule__Link__Alternatives2599);
                    ruleLinkNavigation();
                    _fsp--;

                     after(grammarAccess.getLinkAccess().getLinkNavigationParserRuleCall_4()); 

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
    // $ANTLR end rule__Link__Alternatives


    // $ANTLR start rule__UIModelElementCall__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1209:1: rule__UIModelElementCall__Alternatives : ( ( ( rule__UIModelElementCall__Group_0__0 ) ) | ( ( rule__UIModelElementCall__Group_1__0 ) ) );
    public final void rule__UIModelElementCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1213:1: ( ( ( rule__UIModelElementCall__Group_0__0 ) ) | ( ( rule__UIModelElementCall__Group_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==47) ) {
                alt14=1;
            }
            else if ( (LA14_0==48) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1209:1: rule__UIModelElementCall__Alternatives : ( ( ( rule__UIModelElementCall__Group_0__0 ) ) | ( ( rule__UIModelElementCall__Group_1__0 ) ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1214:1: ( ( rule__UIModelElementCall__Group_0__0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1214:1: ( ( rule__UIModelElementCall__Group_0__0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1215:1: ( rule__UIModelElementCall__Group_0__0 )
                    {
                     before(grammarAccess.getUIModelElementCallAccess().getGroup_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1216:1: ( rule__UIModelElementCall__Group_0__0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1216:2: rule__UIModelElementCall__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__UIModelElementCall__Group_0__0_in_rule__UIModelElementCall__Alternatives2631);
                    rule__UIModelElementCall__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getUIModelElementCallAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1220:6: ( ( rule__UIModelElementCall__Group_1__0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1220:6: ( ( rule__UIModelElementCall__Group_1__0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1221:1: ( rule__UIModelElementCall__Group_1__0 )
                    {
                     before(grammarAccess.getUIModelElementCallAccess().getGroup_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1222:1: ( rule__UIModelElementCall__Group_1__0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1222:2: rule__UIModelElementCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__UIModelElementCall__Group_1__0_in_rule__UIModelElementCall__Alternatives2649);
                    rule__UIModelElementCall__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getUIModelElementCallAccess().getGroup_1()); 

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
    // $ANTLR end rule__UIModelElementCall__Alternatives


    // $ANTLR start rule__ProcessType__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1231:1: rule__ProcessType__Alternatives : ( ( ( 'new' ) ) | ( ( 'save' ) ) | ( ( 'edit' ) ) | ( ( 'remove' ) ) );
    public final void rule__ProcessType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1235:1: ( ( ( 'new' ) ) | ( ( 'save' ) ) | ( ( 'edit' ) ) | ( ( 'remove' ) ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt15=1;
                }
                break;
            case 13:
                {
                alt15=2;
                }
                break;
            case 14:
                {
                alt15=3;
                }
                break;
            case 15:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1231:1: rule__ProcessType__Alternatives : ( ( ( 'new' ) ) | ( ( 'save' ) ) | ( ( 'edit' ) ) | ( ( 'remove' ) ) );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1236:1: ( ( 'new' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1236:1: ( ( 'new' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1237:1: ( 'new' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1238:1: ( 'new' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1238:3: 'new'
                    {
                    match(input,12,FOLLOW_12_in_rule__ProcessType__Alternatives2683); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1243:6: ( ( 'save' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1243:6: ( ( 'save' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1244:1: ( 'save' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1245:1: ( 'save' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1245:3: 'save'
                    {
                    match(input,13,FOLLOW_13_in_rule__ProcessType__Alternatives2704); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1250:6: ( ( 'edit' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1250:6: ( ( 'edit' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1251:1: ( 'edit' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1252:1: ( 'edit' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1252:3: 'edit'
                    {
                    match(input,14,FOLLOW_14_in_rule__ProcessType__Alternatives2725); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1257:6: ( ( 'remove' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1257:6: ( ( 'remove' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1258:1: ( 'remove' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getREMOVEEnumLiteralDeclaration_3()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1259:1: ( 'remove' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1259:3: 'remove'
                    {
                    match(input,15,FOLLOW_15_in_rule__ProcessType__Alternatives2746); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getREMOVEEnumLiteralDeclaration_3()); 

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


    // $ANTLR start rule__PresentationModel__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1271:1: rule__PresentationModel__Group__0 : ( ( rule__PresentationModel__DescriptionAssignment_0 )? ) rule__PresentationModel__Group__1 ;
    public final void rule__PresentationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1275:1: ( ( ( rule__PresentationModel__DescriptionAssignment_0 )? ) rule__PresentationModel__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1276:1: ( ( rule__PresentationModel__DescriptionAssignment_0 )? ) rule__PresentationModel__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1276:1: ( ( rule__PresentationModel__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1277:1: ( rule__PresentationModel__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getPresentationModelAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1278:1: ( rule__PresentationModel__DescriptionAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1278:2: rule__PresentationModel__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PresentationModel__DescriptionAssignment_0_in_rule__PresentationModel__Group__02783);
                    rule__PresentationModel__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentationModelAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__1_in_rule__PresentationModel__Group__02793);
            rule__PresentationModel__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PresentationModel__Group__0


    // $ANTLR start rule__PresentationModel__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1289:1: rule__PresentationModel__Group__1 : ( 'presentation' ) rule__PresentationModel__Group__2 ;
    public final void rule__PresentationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1293:1: ( ( 'presentation' ) rule__PresentationModel__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1294:1: ( 'presentation' ) rule__PresentationModel__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1294:1: ( 'presentation' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1295:1: 'presentation'
            {
             before(grammarAccess.getPresentationModelAccess().getPresentationKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__PresentationModel__Group__12822); 
             after(grammarAccess.getPresentationModelAccess().getPresentationKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__2_in_rule__PresentationModel__Group__12832);
            rule__PresentationModel__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PresentationModel__Group__1


    // $ANTLR start rule__PresentationModel__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1309:1: rule__PresentationModel__Group__2 : ( ( rule__PresentationModel__NameAssignment_2 ) ) rule__PresentationModel__Group__3 ;
    public final void rule__PresentationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1313:1: ( ( ( rule__PresentationModel__NameAssignment_2 ) ) rule__PresentationModel__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1314:1: ( ( rule__PresentationModel__NameAssignment_2 ) ) rule__PresentationModel__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1314:1: ( ( rule__PresentationModel__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1315:1: ( rule__PresentationModel__NameAssignment_2 )
            {
             before(grammarAccess.getPresentationModelAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1316:1: ( rule__PresentationModel__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1316:2: rule__PresentationModel__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PresentationModel__NameAssignment_2_in_rule__PresentationModel__Group__22860);
            rule__PresentationModel__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPresentationModelAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__3_in_rule__PresentationModel__Group__22869);
            rule__PresentationModel__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PresentationModel__Group__2


    // $ANTLR start rule__PresentationModel__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1327:1: rule__PresentationModel__Group__3 : ( ';' ) rule__PresentationModel__Group__4 ;
    public final void rule__PresentationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1331:1: ( ( ';' ) rule__PresentationModel__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1332:1: ( ';' ) rule__PresentationModel__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1332:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1333:1: ';'
            {
             before(grammarAccess.getPresentationModelAccess().getSemicolonKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__PresentationModel__Group__32898); 
             after(grammarAccess.getPresentationModelAccess().getSemicolonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__4_in_rule__PresentationModel__Group__32908);
            rule__PresentationModel__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PresentationModel__Group__3


    // $ANTLR start rule__PresentationModel__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1347:1: rule__PresentationModel__Group__4 : ( ( rule__PresentationModel__ExternalReferencesAssignment_4 )* ) rule__PresentationModel__Group__5 ;
    public final void rule__PresentationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1351:1: ( ( ( rule__PresentationModel__ExternalReferencesAssignment_4 )* ) rule__PresentationModel__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1352:1: ( ( rule__PresentationModel__ExternalReferencesAssignment_4 )* ) rule__PresentationModel__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1352:1: ( ( rule__PresentationModel__ExternalReferencesAssignment_4 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1353:1: ( rule__PresentationModel__ExternalReferencesAssignment_4 )*
            {
             before(grammarAccess.getPresentationModelAccess().getExternalReferencesAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1354:1: ( rule__PresentationModel__ExternalReferencesAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1354:2: rule__PresentationModel__ExternalReferencesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__PresentationModel__ExternalReferencesAssignment_4_in_rule__PresentationModel__Group__42936);
            	    rule__PresentationModel__ExternalReferencesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPresentationModelAccess().getExternalReferencesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__5_in_rule__PresentationModel__Group__42946);
            rule__PresentationModel__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PresentationModel__Group__4


    // $ANTLR start rule__PresentationModel__Group__5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1365:1: rule__PresentationModel__Group__5 : ( ( rule__PresentationModel__ElementsAssignment_5 )* ) ;
    public final void rule__PresentationModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1369:1: ( ( ( rule__PresentationModel__ElementsAssignment_5 )* ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1370:1: ( ( rule__PresentationModel__ElementsAssignment_5 )* )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1370:1: ( ( rule__PresentationModel__ElementsAssignment_5 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1371:1: ( rule__PresentationModel__ElementsAssignment_5 )*
            {
             before(grammarAccess.getPresentationModelAccess().getElementsAssignment_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1372:1: ( rule__PresentationModel__ElementsAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STRING||LA18_0==20||LA18_0==28||(LA18_0>=30 && LA18_0<=31)||LA18_0==34||LA18_0==36||(LA18_0>=41 && LA18_0<=42)||(LA18_0>=44 && LA18_0<=46)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1372:2: rule__PresentationModel__ElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__PresentationModel__ElementsAssignment_5_in_rule__PresentationModel__Group__52974);
            	    rule__PresentationModel__ElementsAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getPresentationModelAccess().getElementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PresentationModel__Group__5


    // $ANTLR start rule__ExternalReference__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1394:1: rule__ExternalReference__Group__0 : ( 'from' ) rule__ExternalReference__Group__1 ;
    public final void rule__ExternalReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1398:1: ( ( 'from' ) rule__ExternalReference__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1399:1: ( 'from' ) rule__ExternalReference__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1399:1: ( 'from' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1400:1: 'from'
            {
             before(grammarAccess.getExternalReferenceAccess().getFromKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__ExternalReference__Group__03022); 
             after(grammarAccess.getExternalReferenceAccess().getFromKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__1_in_rule__ExternalReference__Group__03032);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1414:1: rule__ExternalReference__Group__1 : ( ( rule__ExternalReference__ModelNameAssignment_1 ) ) rule__ExternalReference__Group__2 ;
    public final void rule__ExternalReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1418:1: ( ( ( rule__ExternalReference__ModelNameAssignment_1 ) ) rule__ExternalReference__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1419:1: ( ( rule__ExternalReference__ModelNameAssignment_1 ) ) rule__ExternalReference__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1419:1: ( ( rule__ExternalReference__ModelNameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1420:1: ( rule__ExternalReference__ModelNameAssignment_1 )
            {
             before(grammarAccess.getExternalReferenceAccess().getModelNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1421:1: ( rule__ExternalReference__ModelNameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1421:2: rule__ExternalReference__ModelNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalReference__ModelNameAssignment_1_in_rule__ExternalReference__Group__13060);
            rule__ExternalReference__ModelNameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getModelNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__2_in_rule__ExternalReference__Group__13069);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1432:1: rule__ExternalReference__Group__2 : ( 'import' ) rule__ExternalReference__Group__3 ;
    public final void rule__ExternalReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1436:1: ( ( 'import' ) rule__ExternalReference__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1437:1: ( 'import' ) rule__ExternalReference__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1437:1: ( 'import' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1438:1: 'import'
            {
             before(grammarAccess.getExternalReferenceAccess().getImportKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__ExternalReference__Group__23098); 
             after(grammarAccess.getExternalReferenceAccess().getImportKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__3_in_rule__ExternalReference__Group__23108);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1452:1: rule__ExternalReference__Group__3 : ( ( rule__ExternalReference__NameAssignment_3 ) ) rule__ExternalReference__Group__4 ;
    public final void rule__ExternalReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1456:1: ( ( ( rule__ExternalReference__NameAssignment_3 ) ) rule__ExternalReference__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1457:1: ( ( rule__ExternalReference__NameAssignment_3 ) ) rule__ExternalReference__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1457:1: ( ( rule__ExternalReference__NameAssignment_3 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1458:1: ( rule__ExternalReference__NameAssignment_3 )
            {
             before(grammarAccess.getExternalReferenceAccess().getNameAssignment_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1459:1: ( rule__ExternalReference__NameAssignment_3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1459:2: rule__ExternalReference__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ExternalReference__NameAssignment_3_in_rule__ExternalReference__Group__33136);
            rule__ExternalReference__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getNameAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__4_in_rule__ExternalReference__Group__33145);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1470:1: rule__ExternalReference__Group__4 : ( ';' ) ;
    public final void rule__ExternalReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1474:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1475:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1475:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1476:1: ';'
            {
             before(grammarAccess.getExternalReferenceAccess().getSemicolonKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__ExternalReference__Group__43174); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1499:1: rule__ContentForm__Group__0 : ( ( rule__ContentForm__DescriptionAssignment_0 )? ) rule__ContentForm__Group__1 ;
    public final void rule__ContentForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1503:1: ( ( ( rule__ContentForm__DescriptionAssignment_0 )? ) rule__ContentForm__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1504:1: ( ( rule__ContentForm__DescriptionAssignment_0 )? ) rule__ContentForm__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1504:1: ( ( rule__ContentForm__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1505:1: ( rule__ContentForm__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getContentFormAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1506:1: ( rule__ContentForm__DescriptionAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1506:2: rule__ContentForm__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__DescriptionAssignment_0_in_rule__ContentForm__Group__03219);
                    rule__ContentForm__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__1_in_rule__ContentForm__Group__03229);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1517:1: rule__ContentForm__Group__1 : ( 'ContentForm' ) rule__ContentForm__Group__2 ;
    public final void rule__ContentForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1521:1: ( ( 'ContentForm' ) rule__ContentForm__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1522:1: ( 'ContentForm' ) rule__ContentForm__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1522:1: ( 'ContentForm' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1523:1: 'ContentForm'
            {
             before(grammarAccess.getContentFormAccess().getContentFormKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__ContentForm__Group__13258); 
             after(grammarAccess.getContentFormAccess().getContentFormKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__2_in_rule__ContentForm__Group__13268);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1537:1: rule__ContentForm__Group__2 : ( ( rule__ContentForm__NameAssignment_2 ) ) rule__ContentForm__Group__3 ;
    public final void rule__ContentForm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1541:1: ( ( ( rule__ContentForm__NameAssignment_2 ) ) rule__ContentForm__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1542:1: ( ( rule__ContentForm__NameAssignment_2 ) ) rule__ContentForm__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1542:1: ( ( rule__ContentForm__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1543:1: ( rule__ContentForm__NameAssignment_2 )
            {
             before(grammarAccess.getContentFormAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1544:1: ( rule__ContentForm__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1544:2: rule__ContentForm__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ContentForm__NameAssignment_2_in_rule__ContentForm__Group__23296);
            rule__ContentForm__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__3_in_rule__ContentForm__Group__23305);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1555:1: rule__ContentForm__Group__3 : ( 'context' ) rule__ContentForm__Group__4 ;
    public final void rule__ContentForm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1559:1: ( ( 'context' ) rule__ContentForm__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1560:1: ( 'context' ) rule__ContentForm__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1560:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1561:1: 'context'
            {
             before(grammarAccess.getContentFormAccess().getContextKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__ContentForm__Group__33334); 
             after(grammarAccess.getContentFormAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__4_in_rule__ContentForm__Group__33344);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1575:1: rule__ContentForm__Group__4 : ( ( rule__ContentForm__IsCollectionAssignment_4 )? ) rule__ContentForm__Group__5 ;
    public final void rule__ContentForm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1579:1: ( ( ( rule__ContentForm__IsCollectionAssignment_4 )? ) rule__ContentForm__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1580:1: ( ( rule__ContentForm__IsCollectionAssignment_4 )? ) rule__ContentForm__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1580:1: ( ( rule__ContentForm__IsCollectionAssignment_4 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1581:1: ( rule__ContentForm__IsCollectionAssignment_4 )?
            {
             before(grammarAccess.getContentFormAccess().getIsCollectionAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1582:1: ( rule__ContentForm__IsCollectionAssignment_4 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==49) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1582:2: rule__ContentForm__IsCollectionAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ContentForm__IsCollectionAssignment_4_in_rule__ContentForm__Group__43372);
                    rule__ContentForm__IsCollectionAssignment_4();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getIsCollectionAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__5_in_rule__ContentForm__Group__43382);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1593:1: rule__ContentForm__Group__5 : ( ( rule__ContentForm__ContextRefAssignment_5 ) ) rule__ContentForm__Group__6 ;
    public final void rule__ContentForm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1597:1: ( ( ( rule__ContentForm__ContextRefAssignment_5 ) ) rule__ContentForm__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1598:1: ( ( rule__ContentForm__ContextRefAssignment_5 ) ) rule__ContentForm__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1598:1: ( ( rule__ContentForm__ContextRefAssignment_5 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1599:1: ( rule__ContentForm__ContextRefAssignment_5 )
            {
             before(grammarAccess.getContentFormAccess().getContextRefAssignment_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1600:1: ( rule__ContentForm__ContextRefAssignment_5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1600:2: rule__ContentForm__ContextRefAssignment_5
            {
            pushFollow(FOLLOW_rule__ContentForm__ContextRefAssignment_5_in_rule__ContentForm__Group__53410);
            rule__ContentForm__ContextRefAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getContextRefAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__6_in_rule__ContentForm__Group__53419);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1611:1: rule__ContentForm__Group__6 : ( '[' ) rule__ContentForm__Group__7 ;
    public final void rule__ContentForm__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1615:1: ( ( '[' ) rule__ContentForm__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1616:1: ( '[' ) rule__ContentForm__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1616:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1617:1: '['
            {
             before(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_6()); 
            match(input,22,FOLLOW_22_in_rule__ContentForm__Group__63448); 
             after(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__7_in_rule__ContentForm__Group__63458);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1631:1: rule__ContentForm__Group__7 : ( ( rule__ContentForm__Group_7__0 )? ) rule__ContentForm__Group__8 ;
    public final void rule__ContentForm__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1635:1: ( ( ( rule__ContentForm__Group_7__0 )? ) rule__ContentForm__Group__8 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1636:1: ( ( rule__ContentForm__Group_7__0 )? ) rule__ContentForm__Group__8
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1636:1: ( ( rule__ContentForm__Group_7__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1637:1: ( rule__ContentForm__Group_7__0 )?
            {
             before(grammarAccess.getContentFormAccess().getGroup_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1638:1: ( rule__ContentForm__Group_7__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1638:2: rule__ContentForm__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__Group_7__0_in_rule__ContentForm__Group__73486);
                    rule__ContentForm__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getGroup_7()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__8_in_rule__ContentForm__Group__73496);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1649:1: rule__ContentForm__Group__8 : ( ( rule__ContentForm__FormElementsAssignment_8 )* ) rule__ContentForm__Group__9 ;
    public final void rule__ContentForm__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1653:1: ( ( ( rule__ContentForm__FormElementsAssignment_8 )* ) rule__ContentForm__Group__9 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1654:1: ( ( rule__ContentForm__FormElementsAssignment_8 )* ) rule__ContentForm__Group__9
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1654:1: ( ( rule__ContentForm__FormElementsAssignment_8 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1655:1: ( rule__ContentForm__FormElementsAssignment_8 )*
            {
             before(grammarAccess.getContentFormAccess().getFormElementsAssignment_8()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1656:1: ( rule__ContentForm__FormElementsAssignment_8 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING||LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1656:2: rule__ContentForm__FormElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__ContentForm__FormElementsAssignment_8_in_rule__ContentForm__Group__83524);
            	    rule__ContentForm__FormElementsAssignment_8();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getContentFormAccess().getFormElementsAssignment_8()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__9_in_rule__ContentForm__Group__83534);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1667:1: rule__ContentForm__Group__9 : ( ( rule__ContentForm__Group_9__0 )? ) rule__ContentForm__Group__10 ;
    public final void rule__ContentForm__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1671:1: ( ( ( rule__ContentForm__Group_9__0 )? ) rule__ContentForm__Group__10 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1672:1: ( ( rule__ContentForm__Group_9__0 )? ) rule__ContentForm__Group__10
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1672:1: ( ( rule__ContentForm__Group_9__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1673:1: ( rule__ContentForm__Group_9__0 )?
            {
             before(grammarAccess.getContentFormAccess().getGroup_9()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1674:1: ( rule__ContentForm__Group_9__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1674:2: rule__ContentForm__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__Group_9__0_in_rule__ContentForm__Group__93562);
                    rule__ContentForm__Group_9__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getGroup_9()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__10_in_rule__ContentForm__Group__93572);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1685:1: rule__ContentForm__Group__10 : ( ( rule__ContentForm__Group_10__0 )? ) rule__ContentForm__Group__11 ;
    public final void rule__ContentForm__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1689:1: ( ( ( rule__ContentForm__Group_10__0 )? ) rule__ContentForm__Group__11 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1690:1: ( ( rule__ContentForm__Group_10__0 )? ) rule__ContentForm__Group__11
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1690:1: ( ( rule__ContentForm__Group_10__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1691:1: ( rule__ContentForm__Group_10__0 )?
            {
             before(grammarAccess.getContentFormAccess().getGroup_10()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1692:1: ( rule__ContentForm__Group_10__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1692:2: rule__ContentForm__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__Group_10__0_in_rule__ContentForm__Group__103600);
                    rule__ContentForm__Group_10__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getGroup_10()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__11_in_rule__ContentForm__Group__103610);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1703:1: rule__ContentForm__Group__11 : ( ']' ) ;
    public final void rule__ContentForm__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1707:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1708:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1708:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1709:1: ']'
            {
             before(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_11()); 
            match(input,23,FOLLOW_23_in_rule__ContentForm__Group__113639); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1746:1: rule__ContentForm__Group_7__0 : ( 'readonly' ) rule__ContentForm__Group_7__1 ;
    public final void rule__ContentForm__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1750:1: ( ( 'readonly' ) rule__ContentForm__Group_7__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1751:1: ( 'readonly' ) rule__ContentForm__Group_7__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1751:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1752:1: 'readonly'
            {
             before(grammarAccess.getContentFormAccess().getReadonlyKeyword_7_0()); 
            match(input,24,FOLLOW_24_in_rule__ContentForm__Group_7__03699); 
             after(grammarAccess.getContentFormAccess().getReadonlyKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_7__1_in_rule__ContentForm__Group_7__03709);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1766:1: rule__ContentForm__Group_7__1 : ( ( rule__ContentForm__Alternatives_7_1 ) ) rule__ContentForm__Group_7__2 ;
    public final void rule__ContentForm__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1770:1: ( ( ( rule__ContentForm__Alternatives_7_1 ) ) rule__ContentForm__Group_7__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1771:1: ( ( rule__ContentForm__Alternatives_7_1 ) ) rule__ContentForm__Group_7__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1771:1: ( ( rule__ContentForm__Alternatives_7_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1772:1: ( rule__ContentForm__Alternatives_7_1 )
            {
             before(grammarAccess.getContentFormAccess().getAlternatives_7_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1773:1: ( rule__ContentForm__Alternatives_7_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1773:2: rule__ContentForm__Alternatives_7_1
            {
            pushFollow(FOLLOW_rule__ContentForm__Alternatives_7_1_in_rule__ContentForm__Group_7__13737);
            rule__ContentForm__Alternatives_7_1();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getAlternatives_7_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_7__2_in_rule__ContentForm__Group_7__13746);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1784:1: rule__ContentForm__Group_7__2 : ( ';' ) ;
    public final void rule__ContentForm__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1788:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1789:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1789:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1790:1: ';'
            {
             before(grammarAccess.getContentFormAccess().getSemicolonKeyword_7_2()); 
            match(input,17,FOLLOW_17_in_rule__ContentForm__Group_7__23775); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1809:1: rule__ContentForm__Group_9__0 : ( 'actions' ) rule__ContentForm__Group_9__1 ;
    public final void rule__ContentForm__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1813:1: ( ( 'actions' ) rule__ContentForm__Group_9__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1814:1: ( 'actions' ) rule__ContentForm__Group_9__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1814:1: ( 'actions' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1815:1: 'actions'
            {
             before(grammarAccess.getContentFormAccess().getActionsKeyword_9_0()); 
            match(input,25,FOLLOW_25_in_rule__ContentForm__Group_9__03817); 
             after(grammarAccess.getContentFormAccess().getActionsKeyword_9_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_9__1_in_rule__ContentForm__Group_9__03827);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1829:1: rule__ContentForm__Group_9__1 : ( '[' ) rule__ContentForm__Group_9__2 ;
    public final void rule__ContentForm__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1833:1: ( ( '[' ) rule__ContentForm__Group_9__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1834:1: ( '[' ) rule__ContentForm__Group_9__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1834:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1835:1: '['
            {
             before(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_9_1()); 
            match(input,22,FOLLOW_22_in_rule__ContentForm__Group_9__13856); 
             after(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_9_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_9__2_in_rule__ContentForm__Group_9__13866);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1849:1: rule__ContentForm__Group_9__2 : ( ( rule__ContentForm__Group_9_2__0 )* ) rule__ContentForm__Group_9__3 ;
    public final void rule__ContentForm__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1853:1: ( ( ( rule__ContentForm__Group_9_2__0 )* ) rule__ContentForm__Group_9__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1854:1: ( ( rule__ContentForm__Group_9_2__0 )* ) rule__ContentForm__Group_9__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1854:1: ( ( rule__ContentForm__Group_9_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1855:1: ( rule__ContentForm__Group_9_2__0 )*
            {
             before(grammarAccess.getContentFormAccess().getGroup_9_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1856:1: ( rule__ContentForm__Group_9_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1856:2: rule__ContentForm__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ContentForm__Group_9_2__0_in_rule__ContentForm__Group_9__23894);
            	    rule__ContentForm__Group_9_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getContentFormAccess().getGroup_9_2()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_9__3_in_rule__ContentForm__Group_9__23904);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1867:1: rule__ContentForm__Group_9__3 : ( ']' ) ;
    public final void rule__ContentForm__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1871:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1872:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1872:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1873:1: ']'
            {
             before(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_9_3()); 
            match(input,23,FOLLOW_23_in_rule__ContentForm__Group_9__33933); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1894:1: rule__ContentForm__Group_9_2__0 : ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) ) rule__ContentForm__Group_9_2__1 ;
    public final void rule__ContentForm__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1898:1: ( ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) ) rule__ContentForm__Group_9_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1899:1: ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) ) rule__ContentForm__Group_9_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1899:1: ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1900:1: ( rule__ContentForm__ActionsAssignment_9_2_0 )
            {
             before(grammarAccess.getContentFormAccess().getActionsAssignment_9_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1901:1: ( rule__ContentForm__ActionsAssignment_9_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1901:2: rule__ContentForm__ActionsAssignment_9_2_0
            {
            pushFollow(FOLLOW_rule__ContentForm__ActionsAssignment_9_2_0_in_rule__ContentForm__Group_9_2__03976);
            rule__ContentForm__ActionsAssignment_9_2_0();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getActionsAssignment_9_2_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_9_2__1_in_rule__ContentForm__Group_9_2__03985);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1912:1: rule__ContentForm__Group_9_2__1 : ( ';' ) ;
    public final void rule__ContentForm__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1916:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1917:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1917:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1918:1: ';'
            {
             before(grammarAccess.getContentFormAccess().getSemicolonKeyword_9_2_1()); 
            match(input,17,FOLLOW_17_in_rule__ContentForm__Group_9_2__14014); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1935:1: rule__ContentForm__Group_10__0 : ( 'processes' ) rule__ContentForm__Group_10__1 ;
    public final void rule__ContentForm__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1939:1: ( ( 'processes' ) rule__ContentForm__Group_10__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1940:1: ( 'processes' ) rule__ContentForm__Group_10__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1940:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1941:1: 'processes'
            {
             before(grammarAccess.getContentFormAccess().getProcessesKeyword_10_0()); 
            match(input,26,FOLLOW_26_in_rule__ContentForm__Group_10__04054); 
             after(grammarAccess.getContentFormAccess().getProcessesKeyword_10_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_10__1_in_rule__ContentForm__Group_10__04064);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1955:1: rule__ContentForm__Group_10__1 : ( '[' ) rule__ContentForm__Group_10__2 ;
    public final void rule__ContentForm__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1959:1: ( ( '[' ) rule__ContentForm__Group_10__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1960:1: ( '[' ) rule__ContentForm__Group_10__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1960:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1961:1: '['
            {
             before(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_10_1()); 
            match(input,22,FOLLOW_22_in_rule__ContentForm__Group_10__14093); 
             after(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_10_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_10__2_in_rule__ContentForm__Group_10__14103);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1975:1: rule__ContentForm__Group_10__2 : ( ( rule__ContentForm__Group_10_2__0 )* ) rule__ContentForm__Group_10__3 ;
    public final void rule__ContentForm__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1979:1: ( ( ( rule__ContentForm__Group_10_2__0 )* ) rule__ContentForm__Group_10__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1980:1: ( ( rule__ContentForm__Group_10_2__0 )* ) rule__ContentForm__Group_10__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1980:1: ( ( rule__ContentForm__Group_10_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1981:1: ( rule__ContentForm__Group_10_2__0 )*
            {
             before(grammarAccess.getContentFormAccess().getGroup_10_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1982:1: ( rule__ContentForm__Group_10_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==41) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1982:2: rule__ContentForm__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ContentForm__Group_10_2__0_in_rule__ContentForm__Group_10__24131);
            	    rule__ContentForm__Group_10_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getContentFormAccess().getGroup_10_2()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_10__3_in_rule__ContentForm__Group_10__24141);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1993:1: rule__ContentForm__Group_10__3 : ( ']' ) ;
    public final void rule__ContentForm__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1997:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1998:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1998:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1999:1: ']'
            {
             before(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_10_3()); 
            match(input,23,FOLLOW_23_in_rule__ContentForm__Group_10__34170); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2020:1: rule__ContentForm__Group_10_2__0 : ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) ) rule__ContentForm__Group_10_2__1 ;
    public final void rule__ContentForm__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2024:1: ( ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) ) rule__ContentForm__Group_10_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2025:1: ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) ) rule__ContentForm__Group_10_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2025:1: ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2026:1: ( rule__ContentForm__ProcessesAssignment_10_2_0 )
            {
             before(grammarAccess.getContentFormAccess().getProcessesAssignment_10_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2027:1: ( rule__ContentForm__ProcessesAssignment_10_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2027:2: rule__ContentForm__ProcessesAssignment_10_2_0
            {
            pushFollow(FOLLOW_rule__ContentForm__ProcessesAssignment_10_2_0_in_rule__ContentForm__Group_10_2__04213);
            rule__ContentForm__ProcessesAssignment_10_2_0();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getProcessesAssignment_10_2_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_10_2__1_in_rule__ContentForm__Group_10_2__04222);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2038:1: rule__ContentForm__Group_10_2__1 : ( ';' ) ;
    public final void rule__ContentForm__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2042:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2043:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2043:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2044:1: ';'
            {
             before(grammarAccess.getContentFormAccess().getSemicolonKeyword_10_2_1()); 
            match(input,17,FOLLOW_17_in_rule__ContentForm__Group_10_2__14251); 
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


    // $ANTLR start rule__SimpleProcess__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2061:1: rule__SimpleProcess__Group__0 : ( ( rule__SimpleProcess__NameAssignment_0 ) ) rule__SimpleProcess__Group__1 ;
    public final void rule__SimpleProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2065:1: ( ( ( rule__SimpleProcess__NameAssignment_0 ) ) rule__SimpleProcess__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2066:1: ( ( rule__SimpleProcess__NameAssignment_0 ) ) rule__SimpleProcess__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2066:1: ( ( rule__SimpleProcess__NameAssignment_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2067:1: ( rule__SimpleProcess__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleProcessAccess().getNameAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2068:1: ( rule__SimpleProcess__NameAssignment_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2068:2: rule__SimpleProcess__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleProcess__NameAssignment_0_in_rule__SimpleProcess__Group__04290);
            rule__SimpleProcess__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSimpleProcessAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleProcess__Group__1_in_rule__SimpleProcess__Group__04299);
            rule__SimpleProcess__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleProcess__Group__0


    // $ANTLR start rule__SimpleProcess__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2079:1: rule__SimpleProcess__Group__1 : ( ( rule__SimpleProcess__TypeAssignment_1 )? ) rule__SimpleProcess__Group__2 ;
    public final void rule__SimpleProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2083:1: ( ( ( rule__SimpleProcess__TypeAssignment_1 )? ) rule__SimpleProcess__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2084:1: ( ( rule__SimpleProcess__TypeAssignment_1 )? ) rule__SimpleProcess__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2084:1: ( ( rule__SimpleProcess__TypeAssignment_1 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2085:1: ( rule__SimpleProcess__TypeAssignment_1 )?
            {
             before(grammarAccess.getSimpleProcessAccess().getTypeAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2086:1: ( rule__SimpleProcess__TypeAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=12 && LA27_0<=15)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2086:2: rule__SimpleProcess__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SimpleProcess__TypeAssignment_1_in_rule__SimpleProcess__Group__14327);
                    rule__SimpleProcess__TypeAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleProcessAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__SimpleProcess__Group__2_in_rule__SimpleProcess__Group__14337);
            rule__SimpleProcess__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleProcess__Group__1


    // $ANTLR start rule__SimpleProcess__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2097:1: rule__SimpleProcess__Group__2 : ( ( rule__SimpleProcess__Group_2__0 )? ) ;
    public final void rule__SimpleProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2101:1: ( ( ( rule__SimpleProcess__Group_2__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2102:1: ( ( rule__SimpleProcess__Group_2__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2102:1: ( ( rule__SimpleProcess__Group_2__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2103:1: ( rule__SimpleProcess__Group_2__0 )?
            {
             before(grammarAccess.getSimpleProcessAccess().getGroup_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2104:1: ( rule__SimpleProcess__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2104:2: rule__SimpleProcess__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SimpleProcess__Group_2__0_in_rule__SimpleProcess__Group__24365);
                    rule__SimpleProcess__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleProcessAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleProcess__Group__2


    // $ANTLR start rule__SimpleProcess__Group_2__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2120:1: rule__SimpleProcess__Group_2__0 : ( 'use' ) rule__SimpleProcess__Group_2__1 ;
    public final void rule__SimpleProcess__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2124:1: ( ( 'use' ) rule__SimpleProcess__Group_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2125:1: ( 'use' ) rule__SimpleProcess__Group_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2125:1: ( 'use' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2126:1: 'use'
            {
             before(grammarAccess.getSimpleProcessAccess().getUseKeyword_2_0()); 
            match(input,27,FOLLOW_27_in_rule__SimpleProcess__Group_2__04407); 
             after(grammarAccess.getSimpleProcessAccess().getUseKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleProcess__Group_2__1_in_rule__SimpleProcess__Group_2__04417);
            rule__SimpleProcess__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleProcess__Group_2__0


    // $ANTLR start rule__SimpleProcess__Group_2__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2140:1: rule__SimpleProcess__Group_2__1 : ( ( rule__SimpleProcess__DialogueAssignment_2_1 ) ) ;
    public final void rule__SimpleProcess__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2144:1: ( ( ( rule__SimpleProcess__DialogueAssignment_2_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2145:1: ( ( rule__SimpleProcess__DialogueAssignment_2_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2145:1: ( ( rule__SimpleProcess__DialogueAssignment_2_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2146:1: ( rule__SimpleProcess__DialogueAssignment_2_1 )
            {
             before(grammarAccess.getSimpleProcessAccess().getDialogueAssignment_2_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2147:1: ( rule__SimpleProcess__DialogueAssignment_2_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2147:2: rule__SimpleProcess__DialogueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SimpleProcess__DialogueAssignment_2_1_in_rule__SimpleProcess__Group_2__14445);
            rule__SimpleProcess__DialogueAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getSimpleProcessAccess().getDialogueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleProcess__Group_2__1


    // $ANTLR start rule__CompoundDialogue__Group_0__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2161:1: rule__CompoundDialogue__Group_0__0 : ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? ) rule__CompoundDialogue__Group_0__1 ;
    public final void rule__CompoundDialogue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2165:1: ( ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? ) rule__CompoundDialogue__Group_0__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2166:1: ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? ) rule__CompoundDialogue__Group_0__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2166:1: ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2167:1: ( rule__CompoundDialogue__DescriptionAssignment_0_0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getDescriptionAssignment_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2168:1: ( rule__CompoundDialogue__DescriptionAssignment_0_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2168:2: rule__CompoundDialogue__DescriptionAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__DescriptionAssignment_0_0_in_rule__CompoundDialogue__Group_0__04483);
                    rule__CompoundDialogue__DescriptionAssignment_0_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundDialogueAccess().getDescriptionAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__1_in_rule__CompoundDialogue__Group_0__04493);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2179:1: rule__CompoundDialogue__Group_0__1 : ( 'CompoundDialogue' ) rule__CompoundDialogue__Group_0__2 ;
    public final void rule__CompoundDialogue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2183:1: ( ( 'CompoundDialogue' ) rule__CompoundDialogue__Group_0__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2184:1: ( 'CompoundDialogue' ) rule__CompoundDialogue__Group_0__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2184:1: ( 'CompoundDialogue' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2185:1: 'CompoundDialogue'
            {
             before(grammarAccess.getCompoundDialogueAccess().getCompoundDialogueKeyword_0_1()); 
            match(input,28,FOLLOW_28_in_rule__CompoundDialogue__Group_0__14522); 
             after(grammarAccess.getCompoundDialogueAccess().getCompoundDialogueKeyword_0_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__2_in_rule__CompoundDialogue__Group_0__14532);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2199:1: rule__CompoundDialogue__Group_0__2 : ( ( rule__CompoundDialogue__NameAssignment_0_2 ) ) rule__CompoundDialogue__Group_0__3 ;
    public final void rule__CompoundDialogue__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2203:1: ( ( ( rule__CompoundDialogue__NameAssignment_0_2 ) ) rule__CompoundDialogue__Group_0__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2204:1: ( ( rule__CompoundDialogue__NameAssignment_0_2 ) ) rule__CompoundDialogue__Group_0__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2204:1: ( ( rule__CompoundDialogue__NameAssignment_0_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2205:1: ( rule__CompoundDialogue__NameAssignment_0_2 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getNameAssignment_0_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2206:1: ( rule__CompoundDialogue__NameAssignment_0_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2206:2: rule__CompoundDialogue__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__NameAssignment_0_2_in_rule__CompoundDialogue__Group_0__24560);
            rule__CompoundDialogue__NameAssignment_0_2();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getNameAssignment_0_2()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__3_in_rule__CompoundDialogue__Group_0__24569);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2217:1: rule__CompoundDialogue__Group_0__3 : ( 'context' ) rule__CompoundDialogue__Group_0__4 ;
    public final void rule__CompoundDialogue__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2221:1: ( ( 'context' ) rule__CompoundDialogue__Group_0__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2222:1: ( 'context' ) rule__CompoundDialogue__Group_0__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2222:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2223:1: 'context'
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextKeyword_0_3()); 
            match(input,21,FOLLOW_21_in_rule__CompoundDialogue__Group_0__34598); 
             after(grammarAccess.getCompoundDialogueAccess().getContextKeyword_0_3()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__4_in_rule__CompoundDialogue__Group_0__34608);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2237:1: rule__CompoundDialogue__Group_0__4 : ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) ) rule__CompoundDialogue__Group_0__5 ;
    public final void rule__CompoundDialogue__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2241:1: ( ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) ) rule__CompoundDialogue__Group_0__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2242:1: ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) ) rule__CompoundDialogue__Group_0__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2242:1: ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2243:1: ( rule__CompoundDialogue__ContextRefAssignment_0_4 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextRefAssignment_0_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2244:1: ( rule__CompoundDialogue__ContextRefAssignment_0_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2244:2: rule__CompoundDialogue__ContextRefAssignment_0_4
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__ContextRefAssignment_0_4_in_rule__CompoundDialogue__Group_0__44636);
            rule__CompoundDialogue__ContextRefAssignment_0_4();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getContextRefAssignment_0_4()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__5_in_rule__CompoundDialogue__Group_0__44645);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2255:1: rule__CompoundDialogue__Group_0__5 : ( ( rule__CompoundDialogue__Group_0_5__0 )? ) rule__CompoundDialogue__Group_0__6 ;
    public final void rule__CompoundDialogue__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2259:1: ( ( ( rule__CompoundDialogue__Group_0_5__0 )? ) rule__CompoundDialogue__Group_0__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2260:1: ( ( rule__CompoundDialogue__Group_0_5__0 )? ) rule__CompoundDialogue__Group_0__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2260:1: ( ( rule__CompoundDialogue__Group_0_5__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2261:1: ( rule__CompoundDialogue__Group_0_5__0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2262:1: ( rule__CompoundDialogue__Group_0_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==24) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2262:2: rule__CompoundDialogue__Group_0_5__0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_5__0_in_rule__CompoundDialogue__Group_0__54673);
                    rule__CompoundDialogue__Group_0_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundDialogueAccess().getGroup_0_5()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__6_in_rule__CompoundDialogue__Group_0__54683);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2273:1: rule__CompoundDialogue__Group_0__6 : ( ( rule__CompoundDialogue__Group_0_6__0 )? ) rule__CompoundDialogue__Group_0__7 ;
    public final void rule__CompoundDialogue__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2277:1: ( ( ( rule__CompoundDialogue__Group_0_6__0 )? ) rule__CompoundDialogue__Group_0__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2278:1: ( ( rule__CompoundDialogue__Group_0_6__0 )? ) rule__CompoundDialogue__Group_0__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2278:1: ( ( rule__CompoundDialogue__Group_0_6__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2279:1: ( rule__CompoundDialogue__Group_0_6__0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2280:1: ( rule__CompoundDialogue__Group_0_6__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==29) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2280:2: rule__CompoundDialogue__Group_0_6__0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__0_in_rule__CompoundDialogue__Group_0__64711);
                    rule__CompoundDialogue__Group_0_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundDialogueAccess().getGroup_0_6()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__7_in_rule__CompoundDialogue__Group_0__64721);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2291:1: rule__CompoundDialogue__Group_0__7 : ( ( rule__CompoundDialogue__Group_0_7__0 )? ) ;
    public final void rule__CompoundDialogue__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2295:1: ( ( ( rule__CompoundDialogue__Group_0_7__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2296:1: ( ( rule__CompoundDialogue__Group_0_7__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2296:1: ( ( rule__CompoundDialogue__Group_0_7__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2297:1: ( rule__CompoundDialogue__Group_0_7__0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2298:1: ( rule__CompoundDialogue__Group_0_7__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2298:2: rule__CompoundDialogue__Group_0_7__0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__0_in_rule__CompoundDialogue__Group_0__74749);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2324:1: rule__CompoundDialogue__Group_0_5__0 : ( 'readonly' ) rule__CompoundDialogue__Group_0_5__1 ;
    public final void rule__CompoundDialogue__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2328:1: ( ( 'readonly' ) rule__CompoundDialogue__Group_0_5__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2329:1: ( 'readonly' ) rule__CompoundDialogue__Group_0_5__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2329:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2330:1: 'readonly'
            {
             before(grammarAccess.getCompoundDialogueAccess().getReadonlyKeyword_0_5_0()); 
            match(input,24,FOLLOW_24_in_rule__CompoundDialogue__Group_0_5__04801); 
             after(grammarAccess.getCompoundDialogueAccess().getReadonlyKeyword_0_5_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_5__1_in_rule__CompoundDialogue__Group_0_5__04811);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2344:1: rule__CompoundDialogue__Group_0_5__1 : ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) ) rule__CompoundDialogue__Group_0_5__2 ;
    public final void rule__CompoundDialogue__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2348:1: ( ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) ) rule__CompoundDialogue__Group_0_5__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2349:1: ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) ) rule__CompoundDialogue__Group_0_5__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2349:1: ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2350:1: ( rule__CompoundDialogue__Alternatives_0_5_1 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getAlternatives_0_5_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2351:1: ( rule__CompoundDialogue__Alternatives_0_5_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2351:2: rule__CompoundDialogue__Alternatives_0_5_1
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__Alternatives_0_5_1_in_rule__CompoundDialogue__Group_0_5__14839);
            rule__CompoundDialogue__Alternatives_0_5_1();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getAlternatives_0_5_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_5__2_in_rule__CompoundDialogue__Group_0_5__14848);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2362:1: rule__CompoundDialogue__Group_0_5__2 : ( ';' ) ;
    public final void rule__CompoundDialogue__Group_0_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2366:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2367:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2367:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2368:1: ';'
            {
             before(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_5_2()); 
            match(input,17,FOLLOW_17_in_rule__CompoundDialogue__Group_0_5__24877); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2387:1: rule__CompoundDialogue__Group_0_6__0 : ( 'dialogues' ) rule__CompoundDialogue__Group_0_6__1 ;
    public final void rule__CompoundDialogue__Group_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2391:1: ( ( 'dialogues' ) rule__CompoundDialogue__Group_0_6__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2392:1: ( 'dialogues' ) rule__CompoundDialogue__Group_0_6__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2392:1: ( 'dialogues' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2393:1: 'dialogues'
            {
             before(grammarAccess.getCompoundDialogueAccess().getDialoguesKeyword_0_6_0()); 
            match(input,29,FOLLOW_29_in_rule__CompoundDialogue__Group_0_6__04919); 
             after(grammarAccess.getCompoundDialogueAccess().getDialoguesKeyword_0_6_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__1_in_rule__CompoundDialogue__Group_0_6__04929);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2407:1: rule__CompoundDialogue__Group_0_6__1 : ( '[' ) rule__CompoundDialogue__Group_0_6__2 ;
    public final void rule__CompoundDialogue__Group_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2411:1: ( ( '[' ) rule__CompoundDialogue__Group_0_6__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2412:1: ( '[' ) rule__CompoundDialogue__Group_0_6__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2412:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2413:1: '['
            {
             before(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_6_1()); 
            match(input,22,FOLLOW_22_in_rule__CompoundDialogue__Group_0_6__14958); 
             after(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_6_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__2_in_rule__CompoundDialogue__Group_0_6__14968);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2427:1: rule__CompoundDialogue__Group_0_6__2 : ( ( rule__CompoundDialogue__Group_0_6_2__0 )* ) rule__CompoundDialogue__Group_0_6__3 ;
    public final void rule__CompoundDialogue__Group_0_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2431:1: ( ( ( rule__CompoundDialogue__Group_0_6_2__0 )* ) rule__CompoundDialogue__Group_0_6__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2432:1: ( ( rule__CompoundDialogue__Group_0_6_2__0 )* ) rule__CompoundDialogue__Group_0_6__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2432:1: ( ( rule__CompoundDialogue__Group_0_6_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2433:1: ( rule__CompoundDialogue__Group_0_6_2__0 )*
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_6_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2434:1: ( rule__CompoundDialogue__Group_0_6_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_ID)||(LA33_0>=41 && LA33_0<=42)||(LA33_0>=44 && LA33_0<=46)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2434:2: rule__CompoundDialogue__Group_0_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6_2__0_in_rule__CompoundDialogue__Group_0_6__24996);
            	    rule__CompoundDialogue__Group_0_6_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getCompoundDialogueAccess().getGroup_0_6_2()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__3_in_rule__CompoundDialogue__Group_0_6__25006);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2445:1: rule__CompoundDialogue__Group_0_6__3 : ( ']' ) ;
    public final void rule__CompoundDialogue__Group_0_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2449:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2450:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2450:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2451:1: ']'
            {
             before(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_6_3()); 
            match(input,23,FOLLOW_23_in_rule__CompoundDialogue__Group_0_6__35035); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2472:1: rule__CompoundDialogue__Group_0_6_2__0 : ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) ) rule__CompoundDialogue__Group_0_6_2__1 ;
    public final void rule__CompoundDialogue__Group_0_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2476:1: ( ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) ) rule__CompoundDialogue__Group_0_6_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2477:1: ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) ) rule__CompoundDialogue__Group_0_6_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2477:1: ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2478:1: ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getDialoguesAssignment_0_6_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2479:1: ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2479:2: rule__CompoundDialogue__DialoguesAssignment_0_6_2_0
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__DialoguesAssignment_0_6_2_0_in_rule__CompoundDialogue__Group_0_6_2__05078);
            rule__CompoundDialogue__DialoguesAssignment_0_6_2_0();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getDialoguesAssignment_0_6_2_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6_2__1_in_rule__CompoundDialogue__Group_0_6_2__05087);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2490:1: rule__CompoundDialogue__Group_0_6_2__1 : ( ';' ) ;
    public final void rule__CompoundDialogue__Group_0_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2494:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2495:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2495:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2496:1: ';'
            {
             before(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_6_2_1()); 
            match(input,17,FOLLOW_17_in_rule__CompoundDialogue__Group_0_6_2__15116); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2513:1: rule__CompoundDialogue__Group_0_7__0 : ( 'processes' ) rule__CompoundDialogue__Group_0_7__1 ;
    public final void rule__CompoundDialogue__Group_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2517:1: ( ( 'processes' ) rule__CompoundDialogue__Group_0_7__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2518:1: ( 'processes' ) rule__CompoundDialogue__Group_0_7__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2518:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2519:1: 'processes'
            {
             before(grammarAccess.getCompoundDialogueAccess().getProcessesKeyword_0_7_0()); 
            match(input,26,FOLLOW_26_in_rule__CompoundDialogue__Group_0_7__05156); 
             after(grammarAccess.getCompoundDialogueAccess().getProcessesKeyword_0_7_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__1_in_rule__CompoundDialogue__Group_0_7__05166);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2533:1: rule__CompoundDialogue__Group_0_7__1 : ( '[' ) rule__CompoundDialogue__Group_0_7__2 ;
    public final void rule__CompoundDialogue__Group_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2537:1: ( ( '[' ) rule__CompoundDialogue__Group_0_7__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2538:1: ( '[' ) rule__CompoundDialogue__Group_0_7__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2538:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2539:1: '['
            {
             before(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_7_1()); 
            match(input,22,FOLLOW_22_in_rule__CompoundDialogue__Group_0_7__15195); 
             after(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_7_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__2_in_rule__CompoundDialogue__Group_0_7__15205);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2553:1: rule__CompoundDialogue__Group_0_7__2 : ( ( rule__CompoundDialogue__Group_0_7_2__0 )* ) rule__CompoundDialogue__Group_0_7__3 ;
    public final void rule__CompoundDialogue__Group_0_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2557:1: ( ( ( rule__CompoundDialogue__Group_0_7_2__0 )* ) rule__CompoundDialogue__Group_0_7__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2558:1: ( ( rule__CompoundDialogue__Group_0_7_2__0 )* ) rule__CompoundDialogue__Group_0_7__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2558:1: ( ( rule__CompoundDialogue__Group_0_7_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2559:1: ( rule__CompoundDialogue__Group_0_7_2__0 )*
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_7_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2560:1: ( rule__CompoundDialogue__Group_0_7_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||LA34_0==41) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2560:2: rule__CompoundDialogue__Group_0_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7_2__0_in_rule__CompoundDialogue__Group_0_7__25233);
            	    rule__CompoundDialogue__Group_0_7_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getCompoundDialogueAccess().getGroup_0_7_2()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__3_in_rule__CompoundDialogue__Group_0_7__25243);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2571:1: rule__CompoundDialogue__Group_0_7__3 : ( ']' ) ;
    public final void rule__CompoundDialogue__Group_0_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2575:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2576:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2576:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2577:1: ']'
            {
             before(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_7_3()); 
            match(input,23,FOLLOW_23_in_rule__CompoundDialogue__Group_0_7__35272); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2598:1: rule__CompoundDialogue__Group_0_7_2__0 : ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) ) rule__CompoundDialogue__Group_0_7_2__1 ;
    public final void rule__CompoundDialogue__Group_0_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2602:1: ( ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) ) rule__CompoundDialogue__Group_0_7_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2603:1: ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) ) rule__CompoundDialogue__Group_0_7_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2603:1: ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2604:1: ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getProcessesAssignment_0_7_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2605:1: ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2605:2: rule__CompoundDialogue__ProcessesAssignment_0_7_2_0
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__ProcessesAssignment_0_7_2_0_in_rule__CompoundDialogue__Group_0_7_2__05315);
            rule__CompoundDialogue__ProcessesAssignment_0_7_2_0();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getProcessesAssignment_0_7_2_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7_2__1_in_rule__CompoundDialogue__Group_0_7_2__05324);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2616:1: rule__CompoundDialogue__Group_0_7_2__1 : ( ';' ) ;
    public final void rule__CompoundDialogue__Group_0_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2620:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2621:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2621:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2622:1: ';'
            {
             before(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_7_2_1()); 
            match(input,17,FOLLOW_17_in_rule__CompoundDialogue__Group_0_7_2__15353); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2639:1: rule__CollectionDialogue__Group__0 : ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? ) rule__CollectionDialogue__Group__1 ;
    public final void rule__CollectionDialogue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2643:1: ( ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? ) rule__CollectionDialogue__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2644:1: ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? ) rule__CollectionDialogue__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2644:1: ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2645:1: ( rule__CollectionDialogue__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2646:1: ( rule__CollectionDialogue__DescriptionAssignment_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2646:2: rule__CollectionDialogue__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__DescriptionAssignment_0_in_rule__CollectionDialogue__Group__05392);
                    rule__CollectionDialogue__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__1_in_rule__CollectionDialogue__Group__05402);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2657:1: rule__CollectionDialogue__Group__1 : ( 'CollectionDialogue' ) rule__CollectionDialogue__Group__2 ;
    public final void rule__CollectionDialogue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2661:1: ( ( 'CollectionDialogue' ) rule__CollectionDialogue__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2662:1: ( 'CollectionDialogue' ) rule__CollectionDialogue__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2662:1: ( 'CollectionDialogue' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2663:1: 'CollectionDialogue'
            {
             before(grammarAccess.getCollectionDialogueAccess().getCollectionDialogueKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__CollectionDialogue__Group__15431); 
             after(grammarAccess.getCollectionDialogueAccess().getCollectionDialogueKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__2_in_rule__CollectionDialogue__Group__15441);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2677:1: rule__CollectionDialogue__Group__2 : ( ( rule__CollectionDialogue__NameAssignment_2 ) ) rule__CollectionDialogue__Group__3 ;
    public final void rule__CollectionDialogue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2681:1: ( ( ( rule__CollectionDialogue__NameAssignment_2 ) ) rule__CollectionDialogue__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2682:1: ( ( rule__CollectionDialogue__NameAssignment_2 ) ) rule__CollectionDialogue__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2682:1: ( ( rule__CollectionDialogue__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2683:1: ( rule__CollectionDialogue__NameAssignment_2 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2684:1: ( rule__CollectionDialogue__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2684:2: rule__CollectionDialogue__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__NameAssignment_2_in_rule__CollectionDialogue__Group__25469);
            rule__CollectionDialogue__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__3_in_rule__CollectionDialogue__Group__25478);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2695:1: rule__CollectionDialogue__Group__3 : ( 'context' ) rule__CollectionDialogue__Group__4 ;
    public final void rule__CollectionDialogue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2699:1: ( ( 'context' ) rule__CollectionDialogue__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2700:1: ( 'context' ) rule__CollectionDialogue__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2700:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2701:1: 'context'
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__CollectionDialogue__Group__35507); 
             after(grammarAccess.getCollectionDialogueAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__4_in_rule__CollectionDialogue__Group__35517);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2715:1: rule__CollectionDialogue__Group__4 : ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) ) rule__CollectionDialogue__Group__5 ;
    public final void rule__CollectionDialogue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2719:1: ( ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) ) rule__CollectionDialogue__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2720:1: ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) ) rule__CollectionDialogue__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2720:1: ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2721:1: ( rule__CollectionDialogue__ContextRefAssignment_4 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextRefAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2722:1: ( rule__CollectionDialogue__ContextRefAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2722:2: rule__CollectionDialogue__ContextRefAssignment_4
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__ContextRefAssignment_4_in_rule__CollectionDialogue__Group__45545);
            rule__CollectionDialogue__ContextRefAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getContextRefAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__5_in_rule__CollectionDialogue__Group__45554);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2733:1: rule__CollectionDialogue__Group__5 : ( '[' ) rule__CollectionDialogue__Group__6 ;
    public final void rule__CollectionDialogue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2737:1: ( ( '[' ) rule__CollectionDialogue__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2738:1: ( '[' ) rule__CollectionDialogue__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2738:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2739:1: '['
            {
             before(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__CollectionDialogue__Group__55583); 
             after(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__6_in_rule__CollectionDialogue__Group__55593);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2753:1: rule__CollectionDialogue__Group__6 : ( ( rule__CollectionDialogue__Group_6__0 )? ) rule__CollectionDialogue__Group__7 ;
    public final void rule__CollectionDialogue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2757:1: ( ( ( rule__CollectionDialogue__Group_6__0 )? ) rule__CollectionDialogue__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2758:1: ( ( rule__CollectionDialogue__Group_6__0 )? ) rule__CollectionDialogue__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2758:1: ( ( rule__CollectionDialogue__Group_6__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2759:1: ( rule__CollectionDialogue__Group_6__0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2760:1: ( rule__CollectionDialogue__Group_6__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==24) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2760:2: rule__CollectionDialogue__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__Group_6__0_in_rule__CollectionDialogue__Group__65621);
                    rule__CollectionDialogue__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getGroup_6()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__7_in_rule__CollectionDialogue__Group__65631);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2771:1: rule__CollectionDialogue__Group__7 : ( ( rule__CollectionDialogue__Group_7__0 )? ) rule__CollectionDialogue__Group__8 ;
    public final void rule__CollectionDialogue__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2775:1: ( ( ( rule__CollectionDialogue__Group_7__0 )? ) rule__CollectionDialogue__Group__8 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2776:1: ( ( rule__CollectionDialogue__Group_7__0 )? ) rule__CollectionDialogue__Group__8
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2776:1: ( ( rule__CollectionDialogue__Group_7__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2777:1: ( rule__CollectionDialogue__Group_7__0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2778:1: ( rule__CollectionDialogue__Group_7__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==29) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2778:2: rule__CollectionDialogue__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__0_in_rule__CollectionDialogue__Group__75659);
                    rule__CollectionDialogue__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getGroup_7()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__8_in_rule__CollectionDialogue__Group__75669);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2789:1: rule__CollectionDialogue__Group__8 : ( ( rule__CollectionDialogue__Group_8__0 )? ) rule__CollectionDialogue__Group__9 ;
    public final void rule__CollectionDialogue__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2793:1: ( ( ( rule__CollectionDialogue__Group_8__0 )? ) rule__CollectionDialogue__Group__9 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2794:1: ( ( rule__CollectionDialogue__Group_8__0 )? ) rule__CollectionDialogue__Group__9
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2794:1: ( ( rule__CollectionDialogue__Group_8__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2795:1: ( rule__CollectionDialogue__Group_8__0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_8()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2796:1: ( rule__CollectionDialogue__Group_8__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==26) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2796:2: rule__CollectionDialogue__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__0_in_rule__CollectionDialogue__Group__85697);
                    rule__CollectionDialogue__Group_8__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getGroup_8()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__9_in_rule__CollectionDialogue__Group__85707);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2807:1: rule__CollectionDialogue__Group__9 : ( ']' ) ;
    public final void rule__CollectionDialogue__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2811:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2812:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2812:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2813:1: ']'
            {
             before(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__CollectionDialogue__Group__95736); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2846:1: rule__CollectionDialogue__Group_6__0 : ( 'readonly' ) rule__CollectionDialogue__Group_6__1 ;
    public final void rule__CollectionDialogue__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2850:1: ( ( 'readonly' ) rule__CollectionDialogue__Group_6__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2851:1: ( 'readonly' ) rule__CollectionDialogue__Group_6__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2851:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2852:1: 'readonly'
            {
             before(grammarAccess.getCollectionDialogueAccess().getReadonlyKeyword_6_0()); 
            match(input,24,FOLLOW_24_in_rule__CollectionDialogue__Group_6__05792); 
             after(grammarAccess.getCollectionDialogueAccess().getReadonlyKeyword_6_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_6__1_in_rule__CollectionDialogue__Group_6__05802);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2866:1: rule__CollectionDialogue__Group_6__1 : ( ( rule__CollectionDialogue__Alternatives_6_1 ) ) rule__CollectionDialogue__Group_6__2 ;
    public final void rule__CollectionDialogue__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2870:1: ( ( ( rule__CollectionDialogue__Alternatives_6_1 ) ) rule__CollectionDialogue__Group_6__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2871:1: ( ( rule__CollectionDialogue__Alternatives_6_1 ) ) rule__CollectionDialogue__Group_6__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2871:1: ( ( rule__CollectionDialogue__Alternatives_6_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2872:1: ( rule__CollectionDialogue__Alternatives_6_1 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getAlternatives_6_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2873:1: ( rule__CollectionDialogue__Alternatives_6_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2873:2: rule__CollectionDialogue__Alternatives_6_1
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__Alternatives_6_1_in_rule__CollectionDialogue__Group_6__15830);
            rule__CollectionDialogue__Alternatives_6_1();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getAlternatives_6_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_6__2_in_rule__CollectionDialogue__Group_6__15839);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2884:1: rule__CollectionDialogue__Group_6__2 : ( ';' ) ;
    public final void rule__CollectionDialogue__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2888:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2889:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2889:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2890:1: ';'
            {
             before(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_6_2()); 
            match(input,17,FOLLOW_17_in_rule__CollectionDialogue__Group_6__25868); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2909:1: rule__CollectionDialogue__Group_7__0 : ( 'dialogues' ) rule__CollectionDialogue__Group_7__1 ;
    public final void rule__CollectionDialogue__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2913:1: ( ( 'dialogues' ) rule__CollectionDialogue__Group_7__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2914:1: ( 'dialogues' ) rule__CollectionDialogue__Group_7__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2914:1: ( 'dialogues' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2915:1: 'dialogues'
            {
             before(grammarAccess.getCollectionDialogueAccess().getDialoguesKeyword_7_0()); 
            match(input,29,FOLLOW_29_in_rule__CollectionDialogue__Group_7__05910); 
             after(grammarAccess.getCollectionDialogueAccess().getDialoguesKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__1_in_rule__CollectionDialogue__Group_7__05920);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2929:1: rule__CollectionDialogue__Group_7__1 : ( '[' ) rule__CollectionDialogue__Group_7__2 ;
    public final void rule__CollectionDialogue__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2933:1: ( ( '[' ) rule__CollectionDialogue__Group_7__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2934:1: ( '[' ) rule__CollectionDialogue__Group_7__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2934:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2935:1: '['
            {
             before(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_7_1()); 
            match(input,22,FOLLOW_22_in_rule__CollectionDialogue__Group_7__15949); 
             after(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_7_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__2_in_rule__CollectionDialogue__Group_7__15959);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2949:1: rule__CollectionDialogue__Group_7__2 : ( ( rule__CollectionDialogue__Group_7_2__0 )* ) rule__CollectionDialogue__Group_7__3 ;
    public final void rule__CollectionDialogue__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2953:1: ( ( ( rule__CollectionDialogue__Group_7_2__0 )* ) rule__CollectionDialogue__Group_7__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2954:1: ( ( rule__CollectionDialogue__Group_7_2__0 )* ) rule__CollectionDialogue__Group_7__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2954:1: ( ( rule__CollectionDialogue__Group_7_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2955:1: ( rule__CollectionDialogue__Group_7_2__0 )*
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_7_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2956:1: ( rule__CollectionDialogue__Group_7_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)||(LA39_0>=41 && LA39_0<=42)||(LA39_0>=44 && LA39_0<=46)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2956:2: rule__CollectionDialogue__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CollectionDialogue__Group_7_2__0_in_rule__CollectionDialogue__Group_7__25987);
            	    rule__CollectionDialogue__Group_7_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getCollectionDialogueAccess().getGroup_7_2()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__3_in_rule__CollectionDialogue__Group_7__25997);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2967:1: rule__CollectionDialogue__Group_7__3 : ( ']' ) ;
    public final void rule__CollectionDialogue__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2971:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2972:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2972:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2973:1: ']'
            {
             before(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_7_3()); 
            match(input,23,FOLLOW_23_in_rule__CollectionDialogue__Group_7__36026); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2994:1: rule__CollectionDialogue__Group_7_2__0 : ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) ) rule__CollectionDialogue__Group_7_2__1 ;
    public final void rule__CollectionDialogue__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2998:1: ( ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) ) rule__CollectionDialogue__Group_7_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2999:1: ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) ) rule__CollectionDialogue__Group_7_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2999:1: ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3000:1: ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getDialoguesAssignment_7_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3001:1: ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3001:2: rule__CollectionDialogue__DialoguesAssignment_7_2_0
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__DialoguesAssignment_7_2_0_in_rule__CollectionDialogue__Group_7_2__06069);
            rule__CollectionDialogue__DialoguesAssignment_7_2_0();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getDialoguesAssignment_7_2_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7_2__1_in_rule__CollectionDialogue__Group_7_2__06078);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3012:1: rule__CollectionDialogue__Group_7_2__1 : ( ';' ) ;
    public final void rule__CollectionDialogue__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3016:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3017:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3017:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3018:1: ';'
            {
             before(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_7_2_1()); 
            match(input,17,FOLLOW_17_in_rule__CollectionDialogue__Group_7_2__16107); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3035:1: rule__CollectionDialogue__Group_8__0 : ( 'processes' ) rule__CollectionDialogue__Group_8__1 ;
    public final void rule__CollectionDialogue__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3039:1: ( ( 'processes' ) rule__CollectionDialogue__Group_8__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3040:1: ( 'processes' ) rule__CollectionDialogue__Group_8__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3040:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3041:1: 'processes'
            {
             before(grammarAccess.getCollectionDialogueAccess().getProcessesKeyword_8_0()); 
            match(input,26,FOLLOW_26_in_rule__CollectionDialogue__Group_8__06147); 
             after(grammarAccess.getCollectionDialogueAccess().getProcessesKeyword_8_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__1_in_rule__CollectionDialogue__Group_8__06157);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3055:1: rule__CollectionDialogue__Group_8__1 : ( '[' ) rule__CollectionDialogue__Group_8__2 ;
    public final void rule__CollectionDialogue__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3059:1: ( ( '[' ) rule__CollectionDialogue__Group_8__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3060:1: ( '[' ) rule__CollectionDialogue__Group_8__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3060:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3061:1: '['
            {
             before(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_8_1()); 
            match(input,22,FOLLOW_22_in_rule__CollectionDialogue__Group_8__16186); 
             after(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_8_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__2_in_rule__CollectionDialogue__Group_8__16196);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3075:1: rule__CollectionDialogue__Group_8__2 : ( ( rule__CollectionDialogue__Group_8_2__0 )* ) rule__CollectionDialogue__Group_8__3 ;
    public final void rule__CollectionDialogue__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3079:1: ( ( ( rule__CollectionDialogue__Group_8_2__0 )* ) rule__CollectionDialogue__Group_8__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3080:1: ( ( rule__CollectionDialogue__Group_8_2__0 )* ) rule__CollectionDialogue__Group_8__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3080:1: ( ( rule__CollectionDialogue__Group_8_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3081:1: ( rule__CollectionDialogue__Group_8_2__0 )*
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_8_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3082:1: ( rule__CollectionDialogue__Group_8_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID||LA40_0==41) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3082:2: rule__CollectionDialogue__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CollectionDialogue__Group_8_2__0_in_rule__CollectionDialogue__Group_8__26224);
            	    rule__CollectionDialogue__Group_8_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getCollectionDialogueAccess().getGroup_8_2()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__3_in_rule__CollectionDialogue__Group_8__26234);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3093:1: rule__CollectionDialogue__Group_8__3 : ( ']' ) ;
    public final void rule__CollectionDialogue__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3097:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3098:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3098:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3099:1: ']'
            {
             before(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_8_3()); 
            match(input,23,FOLLOW_23_in_rule__CollectionDialogue__Group_8__36263); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3120:1: rule__CollectionDialogue__Group_8_2__0 : ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) ) rule__CollectionDialogue__Group_8_2__1 ;
    public final void rule__CollectionDialogue__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3124:1: ( ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) ) rule__CollectionDialogue__Group_8_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3125:1: ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) ) rule__CollectionDialogue__Group_8_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3125:1: ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3126:1: ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getProcessesAssignment_8_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3127:1: ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3127:2: rule__CollectionDialogue__ProcessesAssignment_8_2_0
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__ProcessesAssignment_8_2_0_in_rule__CollectionDialogue__Group_8_2__06306);
            rule__CollectionDialogue__ProcessesAssignment_8_2_0();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getProcessesAssignment_8_2_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8_2__1_in_rule__CollectionDialogue__Group_8_2__06315);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3138:1: rule__CollectionDialogue__Group_8_2__1 : ( ';' ) ;
    public final void rule__CollectionDialogue__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3142:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3143:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3143:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3144:1: ';'
            {
             before(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_8_2_1()); 
            match(input,17,FOLLOW_17_in_rule__CollectionDialogue__Group_8_2__16344); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3161:1: rule__MasterDetail__Group__0 : ( ( rule__MasterDetail__DescriptionAssignment_0 )? ) rule__MasterDetail__Group__1 ;
    public final void rule__MasterDetail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3165:1: ( ( ( rule__MasterDetail__DescriptionAssignment_0 )? ) rule__MasterDetail__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3166:1: ( ( rule__MasterDetail__DescriptionAssignment_0 )? ) rule__MasterDetail__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3166:1: ( ( rule__MasterDetail__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3167:1: ( rule__MasterDetail__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getMasterDetailAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3168:1: ( rule__MasterDetail__DescriptionAssignment_0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_STRING) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3168:2: rule__MasterDetail__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__MasterDetail__DescriptionAssignment_0_in_rule__MasterDetail__Group__06383);
                    rule__MasterDetail__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMasterDetailAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__1_in_rule__MasterDetail__Group__06393);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3179:1: rule__MasterDetail__Group__1 : ( 'MasterDetail' ) rule__MasterDetail__Group__2 ;
    public final void rule__MasterDetail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3183:1: ( ( 'MasterDetail' ) rule__MasterDetail__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3184:1: ( 'MasterDetail' ) rule__MasterDetail__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3184:1: ( 'MasterDetail' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3185:1: 'MasterDetail'
            {
             before(grammarAccess.getMasterDetailAccess().getMasterDetailKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__MasterDetail__Group__16422); 
             after(grammarAccess.getMasterDetailAccess().getMasterDetailKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__2_in_rule__MasterDetail__Group__16432);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3199:1: rule__MasterDetail__Group__2 : ( ( rule__MasterDetail__NameAssignment_2 ) ) rule__MasterDetail__Group__3 ;
    public final void rule__MasterDetail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3203:1: ( ( ( rule__MasterDetail__NameAssignment_2 ) ) rule__MasterDetail__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3204:1: ( ( rule__MasterDetail__NameAssignment_2 ) ) rule__MasterDetail__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3204:1: ( ( rule__MasterDetail__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3205:1: ( rule__MasterDetail__NameAssignment_2 )
            {
             before(grammarAccess.getMasterDetailAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3206:1: ( rule__MasterDetail__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3206:2: rule__MasterDetail__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MasterDetail__NameAssignment_2_in_rule__MasterDetail__Group__26460);
            rule__MasterDetail__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__3_in_rule__MasterDetail__Group__26469);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3217:1: rule__MasterDetail__Group__3 : ( 'context' ) rule__MasterDetail__Group__4 ;
    public final void rule__MasterDetail__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3221:1: ( ( 'context' ) rule__MasterDetail__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3222:1: ( 'context' ) rule__MasterDetail__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3222:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3223:1: 'context'
            {
             before(grammarAccess.getMasterDetailAccess().getContextKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__MasterDetail__Group__36498); 
             after(grammarAccess.getMasterDetailAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__4_in_rule__MasterDetail__Group__36508);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3237:1: rule__MasterDetail__Group__4 : ( ( rule__MasterDetail__ContextRefAssignment_4 ) ) rule__MasterDetail__Group__5 ;
    public final void rule__MasterDetail__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3241:1: ( ( ( rule__MasterDetail__ContextRefAssignment_4 ) ) rule__MasterDetail__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3242:1: ( ( rule__MasterDetail__ContextRefAssignment_4 ) ) rule__MasterDetail__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3242:1: ( ( rule__MasterDetail__ContextRefAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3243:1: ( rule__MasterDetail__ContextRefAssignment_4 )
            {
             before(grammarAccess.getMasterDetailAccess().getContextRefAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3244:1: ( rule__MasterDetail__ContextRefAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3244:2: rule__MasterDetail__ContextRefAssignment_4
            {
            pushFollow(FOLLOW_rule__MasterDetail__ContextRefAssignment_4_in_rule__MasterDetail__Group__46536);
            rule__MasterDetail__ContextRefAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getContextRefAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__5_in_rule__MasterDetail__Group__46545);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3255:1: rule__MasterDetail__Group__5 : ( ( rule__MasterDetail__Group_5__0 )? ) rule__MasterDetail__Group__6 ;
    public final void rule__MasterDetail__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3259:1: ( ( ( rule__MasterDetail__Group_5__0 )? ) rule__MasterDetail__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3260:1: ( ( rule__MasterDetail__Group_5__0 )? ) rule__MasterDetail__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3260:1: ( ( rule__MasterDetail__Group_5__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3261:1: ( rule__MasterDetail__Group_5__0 )?
            {
             before(grammarAccess.getMasterDetailAccess().getGroup_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3262:1: ( rule__MasterDetail__Group_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==24) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3262:2: rule__MasterDetail__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__MasterDetail__Group_5__0_in_rule__MasterDetail__Group__56573);
                    rule__MasterDetail__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMasterDetailAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__6_in_rule__MasterDetail__Group__56583);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3273:1: rule__MasterDetail__Group__6 : ( 'master' ) rule__MasterDetail__Group__7 ;
    public final void rule__MasterDetail__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3277:1: ( ( 'master' ) rule__MasterDetail__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3278:1: ( 'master' ) rule__MasterDetail__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3278:1: ( 'master' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3279:1: 'master'
            {
             before(grammarAccess.getMasterDetailAccess().getMasterKeyword_6()); 
            match(input,32,FOLLOW_32_in_rule__MasterDetail__Group__66612); 
             after(grammarAccess.getMasterDetailAccess().getMasterKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__7_in_rule__MasterDetail__Group__66622);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3293:1: rule__MasterDetail__Group__7 : ( ( rule__MasterDetail__MasterAssignment_7 ) ) rule__MasterDetail__Group__8 ;
    public final void rule__MasterDetail__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3297:1: ( ( ( rule__MasterDetail__MasterAssignment_7 ) ) rule__MasterDetail__Group__8 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3298:1: ( ( rule__MasterDetail__MasterAssignment_7 ) ) rule__MasterDetail__Group__8
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3298:1: ( ( rule__MasterDetail__MasterAssignment_7 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3299:1: ( rule__MasterDetail__MasterAssignment_7 )
            {
             before(grammarAccess.getMasterDetailAccess().getMasterAssignment_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3300:1: ( rule__MasterDetail__MasterAssignment_7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3300:2: rule__MasterDetail__MasterAssignment_7
            {
            pushFollow(FOLLOW_rule__MasterDetail__MasterAssignment_7_in_rule__MasterDetail__Group__76650);
            rule__MasterDetail__MasterAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getMasterAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__8_in_rule__MasterDetail__Group__76659);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3311:1: rule__MasterDetail__Group__8 : ( ';' ) rule__MasterDetail__Group__9 ;
    public final void rule__MasterDetail__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3315:1: ( ( ';' ) rule__MasterDetail__Group__9 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3316:1: ( ';' ) rule__MasterDetail__Group__9
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3316:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3317:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_8()); 
            match(input,17,FOLLOW_17_in_rule__MasterDetail__Group__86688); 
             after(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__9_in_rule__MasterDetail__Group__86698);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3331:1: rule__MasterDetail__Group__9 : ( 'detail' ) rule__MasterDetail__Group__10 ;
    public final void rule__MasterDetail__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3335:1: ( ( 'detail' ) rule__MasterDetail__Group__10 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3336:1: ( 'detail' ) rule__MasterDetail__Group__10
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3336:1: ( 'detail' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3337:1: 'detail'
            {
             before(grammarAccess.getMasterDetailAccess().getDetailKeyword_9()); 
            match(input,33,FOLLOW_33_in_rule__MasterDetail__Group__96727); 
             after(grammarAccess.getMasterDetailAccess().getDetailKeyword_9()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__10_in_rule__MasterDetail__Group__96737);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3351:1: rule__MasterDetail__Group__10 : ( ( rule__MasterDetail__DetailAssignment_10 ) ) rule__MasterDetail__Group__11 ;
    public final void rule__MasterDetail__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3355:1: ( ( ( rule__MasterDetail__DetailAssignment_10 ) ) rule__MasterDetail__Group__11 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3356:1: ( ( rule__MasterDetail__DetailAssignment_10 ) ) rule__MasterDetail__Group__11
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3356:1: ( ( rule__MasterDetail__DetailAssignment_10 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3357:1: ( rule__MasterDetail__DetailAssignment_10 )
            {
             before(grammarAccess.getMasterDetailAccess().getDetailAssignment_10()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3358:1: ( rule__MasterDetail__DetailAssignment_10 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3358:2: rule__MasterDetail__DetailAssignment_10
            {
            pushFollow(FOLLOW_rule__MasterDetail__DetailAssignment_10_in_rule__MasterDetail__Group__106765);
            rule__MasterDetail__DetailAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getDetailAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__11_in_rule__MasterDetail__Group__106774);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3369:1: rule__MasterDetail__Group__11 : ( ';' ) rule__MasterDetail__Group__12 ;
    public final void rule__MasterDetail__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3373:1: ( ( ';' ) rule__MasterDetail__Group__12 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3374:1: ( ';' ) rule__MasterDetail__Group__12
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3374:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3375:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_11()); 
            match(input,17,FOLLOW_17_in_rule__MasterDetail__Group__116803); 
             after(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_11()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__12_in_rule__MasterDetail__Group__116813);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3389:1: rule__MasterDetail__Group__12 : ( ( rule__MasterDetail__Group_12__0 )? ) ;
    public final void rule__MasterDetail__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3393:1: ( ( ( rule__MasterDetail__Group_12__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3394:1: ( ( rule__MasterDetail__Group_12__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3394:1: ( ( rule__MasterDetail__Group_12__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3395:1: ( rule__MasterDetail__Group_12__0 )?
            {
             before(grammarAccess.getMasterDetailAccess().getGroup_12()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3396:1: ( rule__MasterDetail__Group_12__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==26) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3396:2: rule__MasterDetail__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__MasterDetail__Group_12__0_in_rule__MasterDetail__Group__126841);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3432:1: rule__MasterDetail__Group_5__0 : ( 'readonly' ) rule__MasterDetail__Group_5__1 ;
    public final void rule__MasterDetail__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3436:1: ( ( 'readonly' ) rule__MasterDetail__Group_5__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3437:1: ( 'readonly' ) rule__MasterDetail__Group_5__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3437:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3438:1: 'readonly'
            {
             before(grammarAccess.getMasterDetailAccess().getReadonlyKeyword_5_0()); 
            match(input,24,FOLLOW_24_in_rule__MasterDetail__Group_5__06903); 
             after(grammarAccess.getMasterDetailAccess().getReadonlyKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_5__1_in_rule__MasterDetail__Group_5__06913);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3452:1: rule__MasterDetail__Group_5__1 : ( ( rule__MasterDetail__Alternatives_5_1 ) ) rule__MasterDetail__Group_5__2 ;
    public final void rule__MasterDetail__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3456:1: ( ( ( rule__MasterDetail__Alternatives_5_1 ) ) rule__MasterDetail__Group_5__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3457:1: ( ( rule__MasterDetail__Alternatives_5_1 ) ) rule__MasterDetail__Group_5__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3457:1: ( ( rule__MasterDetail__Alternatives_5_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3458:1: ( rule__MasterDetail__Alternatives_5_1 )
            {
             before(grammarAccess.getMasterDetailAccess().getAlternatives_5_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3459:1: ( rule__MasterDetail__Alternatives_5_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3459:2: rule__MasterDetail__Alternatives_5_1
            {
            pushFollow(FOLLOW_rule__MasterDetail__Alternatives_5_1_in_rule__MasterDetail__Group_5__16941);
            rule__MasterDetail__Alternatives_5_1();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getAlternatives_5_1()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_5__2_in_rule__MasterDetail__Group_5__16950);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3470:1: rule__MasterDetail__Group_5__2 : ( ';' ) ;
    public final void rule__MasterDetail__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3474:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3475:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3475:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3476:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_5_2()); 
            match(input,17,FOLLOW_17_in_rule__MasterDetail__Group_5__26979); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3495:1: rule__MasterDetail__Group_12__0 : ( 'processes' ) rule__MasterDetail__Group_12__1 ;
    public final void rule__MasterDetail__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3499:1: ( ( 'processes' ) rule__MasterDetail__Group_12__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3500:1: ( 'processes' ) rule__MasterDetail__Group_12__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3500:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3501:1: 'processes'
            {
             before(grammarAccess.getMasterDetailAccess().getProcessesKeyword_12_0()); 
            match(input,26,FOLLOW_26_in_rule__MasterDetail__Group_12__07021); 
             after(grammarAccess.getMasterDetailAccess().getProcessesKeyword_12_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_12__1_in_rule__MasterDetail__Group_12__07031);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3515:1: rule__MasterDetail__Group_12__1 : ( '[' ) rule__MasterDetail__Group_12__2 ;
    public final void rule__MasterDetail__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3519:1: ( ( '[' ) rule__MasterDetail__Group_12__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3520:1: ( '[' ) rule__MasterDetail__Group_12__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3520:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3521:1: '['
            {
             before(grammarAccess.getMasterDetailAccess().getLeftSquareBracketKeyword_12_1()); 
            match(input,22,FOLLOW_22_in_rule__MasterDetail__Group_12__17060); 
             after(grammarAccess.getMasterDetailAccess().getLeftSquareBracketKeyword_12_1()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_12__2_in_rule__MasterDetail__Group_12__17070);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3535:1: rule__MasterDetail__Group_12__2 : ( ( rule__MasterDetail__Group_12_2__0 )* ) rule__MasterDetail__Group_12__3 ;
    public final void rule__MasterDetail__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3539:1: ( ( ( rule__MasterDetail__Group_12_2__0 )* ) rule__MasterDetail__Group_12__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3540:1: ( ( rule__MasterDetail__Group_12_2__0 )* ) rule__MasterDetail__Group_12__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3540:1: ( ( rule__MasterDetail__Group_12_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3541:1: ( rule__MasterDetail__Group_12_2__0 )*
            {
             before(grammarAccess.getMasterDetailAccess().getGroup_12_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3542:1: ( rule__MasterDetail__Group_12_2__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID||LA44_0==41) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3542:2: rule__MasterDetail__Group_12_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MasterDetail__Group_12_2__0_in_rule__MasterDetail__Group_12__27098);
            	    rule__MasterDetail__Group_12_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getMasterDetailAccess().getGroup_12_2()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_12__3_in_rule__MasterDetail__Group_12__27108);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3553:1: rule__MasterDetail__Group_12__3 : ( ']' ) ;
    public final void rule__MasterDetail__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3557:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3558:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3558:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3559:1: ']'
            {
             before(grammarAccess.getMasterDetailAccess().getRightSquareBracketKeyword_12_3()); 
            match(input,23,FOLLOW_23_in_rule__MasterDetail__Group_12__37137); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3580:1: rule__MasterDetail__Group_12_2__0 : ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) ) rule__MasterDetail__Group_12_2__1 ;
    public final void rule__MasterDetail__Group_12_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3584:1: ( ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) ) rule__MasterDetail__Group_12_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3585:1: ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) ) rule__MasterDetail__Group_12_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3585:1: ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3586:1: ( rule__MasterDetail__ProcessesAssignment_12_2_0 )
            {
             before(grammarAccess.getMasterDetailAccess().getProcessesAssignment_12_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3587:1: ( rule__MasterDetail__ProcessesAssignment_12_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3587:2: rule__MasterDetail__ProcessesAssignment_12_2_0
            {
            pushFollow(FOLLOW_rule__MasterDetail__ProcessesAssignment_12_2_0_in_rule__MasterDetail__Group_12_2__07180);
            rule__MasterDetail__ProcessesAssignment_12_2_0();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getProcessesAssignment_12_2_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_12_2__1_in_rule__MasterDetail__Group_12_2__07189);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3598:1: rule__MasterDetail__Group_12_2__1 : ( ';' ) ;
    public final void rule__MasterDetail__Group_12_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3602:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3603:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3603:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3604:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_12_2_1()); 
            match(input,17,FOLLOW_17_in_rule__MasterDetail__Group_12_2__17218); 
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


    // $ANTLR start rule__AutomatedProcess__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3621:1: rule__AutomatedProcess__Group__0 : ( ( rule__AutomatedProcess__DescriptionAssignment_0 )? ) rule__AutomatedProcess__Group__1 ;
    public final void rule__AutomatedProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3625:1: ( ( ( rule__AutomatedProcess__DescriptionAssignment_0 )? ) rule__AutomatedProcess__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3626:1: ( ( rule__AutomatedProcess__DescriptionAssignment_0 )? ) rule__AutomatedProcess__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3626:1: ( ( rule__AutomatedProcess__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3627:1: ( rule__AutomatedProcess__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getAutomatedProcessAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3628:1: ( rule__AutomatedProcess__DescriptionAssignment_0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_STRING) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3628:2: rule__AutomatedProcess__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__AutomatedProcess__DescriptionAssignment_0_in_rule__AutomatedProcess__Group__07257);
                    rule__AutomatedProcess__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomatedProcessAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__AutomatedProcess__Group__1_in_rule__AutomatedProcess__Group__07267);
            rule__AutomatedProcess__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AutomatedProcess__Group__0


    // $ANTLR start rule__AutomatedProcess__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3639:1: rule__AutomatedProcess__Group__1 : ( 'AutomatedProcess' ) rule__AutomatedProcess__Group__2 ;
    public final void rule__AutomatedProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3643:1: ( ( 'AutomatedProcess' ) rule__AutomatedProcess__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3644:1: ( 'AutomatedProcess' ) rule__AutomatedProcess__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3644:1: ( 'AutomatedProcess' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3645:1: 'AutomatedProcess'
            {
             before(grammarAccess.getAutomatedProcessAccess().getAutomatedProcessKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__AutomatedProcess__Group__17296); 
             after(grammarAccess.getAutomatedProcessAccess().getAutomatedProcessKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__AutomatedProcess__Group__2_in_rule__AutomatedProcess__Group__17306);
            rule__AutomatedProcess__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AutomatedProcess__Group__1


    // $ANTLR start rule__AutomatedProcess__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3659:1: rule__AutomatedProcess__Group__2 : ( ( rule__AutomatedProcess__NameAssignment_2 ) ) rule__AutomatedProcess__Group__3 ;
    public final void rule__AutomatedProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3663:1: ( ( ( rule__AutomatedProcess__NameAssignment_2 ) ) rule__AutomatedProcess__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3664:1: ( ( rule__AutomatedProcess__NameAssignment_2 ) ) rule__AutomatedProcess__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3664:1: ( ( rule__AutomatedProcess__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3665:1: ( rule__AutomatedProcess__NameAssignment_2 )
            {
             before(grammarAccess.getAutomatedProcessAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3666:1: ( rule__AutomatedProcess__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3666:2: rule__AutomatedProcess__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__AutomatedProcess__NameAssignment_2_in_rule__AutomatedProcess__Group__27334);
            rule__AutomatedProcess__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAutomatedProcessAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__AutomatedProcess__Group__3_in_rule__AutomatedProcess__Group__27343);
            rule__AutomatedProcess__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AutomatedProcess__Group__2


    // $ANTLR start rule__AutomatedProcess__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3677:1: rule__AutomatedProcess__Group__3 : ( 'context' ) rule__AutomatedProcess__Group__4 ;
    public final void rule__AutomatedProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3681:1: ( ( 'context' ) rule__AutomatedProcess__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3682:1: ( 'context' ) rule__AutomatedProcess__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3682:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3683:1: 'context'
            {
             before(grammarAccess.getAutomatedProcessAccess().getContextKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__AutomatedProcess__Group__37372); 
             after(grammarAccess.getAutomatedProcessAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__AutomatedProcess__Group__4_in_rule__AutomatedProcess__Group__37382);
            rule__AutomatedProcess__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AutomatedProcess__Group__3


    // $ANTLR start rule__AutomatedProcess__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3697:1: rule__AutomatedProcess__Group__4 : ( ( rule__AutomatedProcess__ContextRefAssignment_4 ) ) rule__AutomatedProcess__Group__5 ;
    public final void rule__AutomatedProcess__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3701:1: ( ( ( rule__AutomatedProcess__ContextRefAssignment_4 ) ) rule__AutomatedProcess__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3702:1: ( ( rule__AutomatedProcess__ContextRefAssignment_4 ) ) rule__AutomatedProcess__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3702:1: ( ( rule__AutomatedProcess__ContextRefAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3703:1: ( rule__AutomatedProcess__ContextRefAssignment_4 )
            {
             before(grammarAccess.getAutomatedProcessAccess().getContextRefAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3704:1: ( rule__AutomatedProcess__ContextRefAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3704:2: rule__AutomatedProcess__ContextRefAssignment_4
            {
            pushFollow(FOLLOW_rule__AutomatedProcess__ContextRefAssignment_4_in_rule__AutomatedProcess__Group__47410);
            rule__AutomatedProcess__ContextRefAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getAutomatedProcessAccess().getContextRefAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__AutomatedProcess__Group__5_in_rule__AutomatedProcess__Group__47419);
            rule__AutomatedProcess__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AutomatedProcess__Group__4


    // $ANTLR start rule__AutomatedProcess__Group__5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3715:1: rule__AutomatedProcess__Group__5 : ( ( rule__AutomatedProcess__TypeAssignment_5 )? ) rule__AutomatedProcess__Group__6 ;
    public final void rule__AutomatedProcess__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3719:1: ( ( ( rule__AutomatedProcess__TypeAssignment_5 )? ) rule__AutomatedProcess__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3720:1: ( ( rule__AutomatedProcess__TypeAssignment_5 )? ) rule__AutomatedProcess__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3720:1: ( ( rule__AutomatedProcess__TypeAssignment_5 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3721:1: ( rule__AutomatedProcess__TypeAssignment_5 )?
            {
             before(grammarAccess.getAutomatedProcessAccess().getTypeAssignment_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3722:1: ( rule__AutomatedProcess__TypeAssignment_5 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=12 && LA46_0<=15)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3722:2: rule__AutomatedProcess__TypeAssignment_5
                    {
                    pushFollow(FOLLOW_rule__AutomatedProcess__TypeAssignment_5_in_rule__AutomatedProcess__Group__57447);
                    rule__AutomatedProcess__TypeAssignment_5();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomatedProcessAccess().getTypeAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__AutomatedProcess__Group__6_in_rule__AutomatedProcess__Group__57457);
            rule__AutomatedProcess__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AutomatedProcess__Group__5


    // $ANTLR start rule__AutomatedProcess__Group__6
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3733:1: rule__AutomatedProcess__Group__6 : ( ( rule__AutomatedProcess__Group_6__0 )? ) ;
    public final void rule__AutomatedProcess__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3737:1: ( ( ( rule__AutomatedProcess__Group_6__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3738:1: ( ( rule__AutomatedProcess__Group_6__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3738:1: ( ( rule__AutomatedProcess__Group_6__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3739:1: ( rule__AutomatedProcess__Group_6__0 )?
            {
             before(grammarAccess.getAutomatedProcessAccess().getGroup_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3740:1: ( rule__AutomatedProcess__Group_6__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==35) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3740:2: rule__AutomatedProcess__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__AutomatedProcess__Group_6__0_in_rule__AutomatedProcess__Group__67485);
                    rule__AutomatedProcess__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomatedProcessAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AutomatedProcess__Group__6


    // $ANTLR start rule__AutomatedProcess__Group_6__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3764:1: rule__AutomatedProcess__Group_6__0 : ( 'steps' ) rule__AutomatedProcess__Group_6__1 ;
    public final void rule__AutomatedProcess__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3768:1: ( ( 'steps' ) rule__AutomatedProcess__Group_6__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3769:1: ( 'steps' ) rule__AutomatedProcess__Group_6__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3769:1: ( 'steps' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3770:1: 'steps'
            {
             before(grammarAccess.getAutomatedProcessAccess().getStepsKeyword_6_0()); 
            match(input,35,FOLLOW_35_in_rule__AutomatedProcess__Group_6__07535); 
             after(grammarAccess.getAutomatedProcessAccess().getStepsKeyword_6_0()); 

            }

            pushFollow(FOLLOW_rule__AutomatedProcess__Group_6__1_in_rule__AutomatedProcess__Group_6__07545);
            rule__AutomatedProcess__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AutomatedProcess__Group_6__0


    // $ANTLR start rule__AutomatedProcess__Group_6__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3784:1: rule__AutomatedProcess__Group_6__1 : ( '[' ) rule__AutomatedProcess__Group_6__2 ;
    public final void rule__AutomatedProcess__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3788:1: ( ( '[' ) rule__AutomatedProcess__Group_6__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3789:1: ( '[' ) rule__AutomatedProcess__Group_6__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3789:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3790:1: '['
            {
             before(grammarAccess.getAutomatedProcessAccess().getLeftSquareBracketKeyword_6_1()); 
            match(input,22,FOLLOW_22_in_rule__AutomatedProcess__Group_6__17574); 
             after(grammarAccess.getAutomatedProcessAccess().getLeftSquareBracketKeyword_6_1()); 

            }

            pushFollow(FOLLOW_rule__AutomatedProcess__Group_6__2_in_rule__AutomatedProcess__Group_6__17584);
            rule__AutomatedProcess__Group_6__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AutomatedProcess__Group_6__1


    // $ANTLR start rule__AutomatedProcess__Group_6__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3804:1: rule__AutomatedProcess__Group_6__2 : ( ( rule__AutomatedProcess__Group_6_2__0 )* ) rule__AutomatedProcess__Group_6__3 ;
    public final void rule__AutomatedProcess__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3808:1: ( ( ( rule__AutomatedProcess__Group_6_2__0 )* ) rule__AutomatedProcess__Group_6__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3809:1: ( ( rule__AutomatedProcess__Group_6_2__0 )* ) rule__AutomatedProcess__Group_6__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3809:1: ( ( rule__AutomatedProcess__Group_6_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3810:1: ( rule__AutomatedProcess__Group_6_2__0 )*
            {
             before(grammarAccess.getAutomatedProcessAccess().getGroup_6_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3811:1: ( rule__AutomatedProcess__Group_6_2__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=47 && LA48_0<=48)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3811:2: rule__AutomatedProcess__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__AutomatedProcess__Group_6_2__0_in_rule__AutomatedProcess__Group_6__27612);
            	    rule__AutomatedProcess__Group_6_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getAutomatedProcessAccess().getGroup_6_2()); 

            }

            pushFollow(FOLLOW_rule__AutomatedProcess__Group_6__3_in_rule__AutomatedProcess__Group_6__27622);
            rule__AutomatedProcess__Group_6__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AutomatedProcess__Group_6__2


    // $ANTLR start rule__AutomatedProcess__Group_6__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3822:1: rule__AutomatedProcess__Group_6__3 : ( ']' ) ;
    public final void rule__AutomatedProcess__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3826:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3827:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3827:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3828:1: ']'
            {
             before(grammarAccess.getAutomatedProcessAccess().getRightSquareBracketKeyword_6_3()); 
            match(input,23,FOLLOW_23_in_rule__AutomatedProcess__Group_6__37651); 
             after(grammarAccess.getAutomatedProcessAccess().getRightSquareBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AutomatedProcess__Group_6__3


    // $ANTLR start rule__AutomatedProcess__Group_6_2__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3849:1: rule__AutomatedProcess__Group_6_2__0 : ( ( rule__AutomatedProcess__ProcessElementsAssignment_6_2_0 ) ) rule__AutomatedProcess__Group_6_2__1 ;
    public final void rule__AutomatedProcess__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3853:1: ( ( ( rule__AutomatedProcess__ProcessElementsAssignment_6_2_0 ) ) rule__AutomatedProcess__Group_6_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3854:1: ( ( rule__AutomatedProcess__ProcessElementsAssignment_6_2_0 ) ) rule__AutomatedProcess__Group_6_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3854:1: ( ( rule__AutomatedProcess__ProcessElementsAssignment_6_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3855:1: ( rule__AutomatedProcess__ProcessElementsAssignment_6_2_0 )
            {
             before(grammarAccess.getAutomatedProcessAccess().getProcessElementsAssignment_6_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3856:1: ( rule__AutomatedProcess__ProcessElementsAssignment_6_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3856:2: rule__AutomatedProcess__ProcessElementsAssignment_6_2_0
            {
            pushFollow(FOLLOW_rule__AutomatedProcess__ProcessElementsAssignment_6_2_0_in_rule__AutomatedProcess__Group_6_2__07694);
            rule__AutomatedProcess__ProcessElementsAssignment_6_2_0();
            _fsp--;


            }

             after(grammarAccess.getAutomatedProcessAccess().getProcessElementsAssignment_6_2_0()); 

            }

            pushFollow(FOLLOW_rule__AutomatedProcess__Group_6_2__1_in_rule__AutomatedProcess__Group_6_2__07703);
            rule__AutomatedProcess__Group_6_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AutomatedProcess__Group_6_2__0


    // $ANTLR start rule__AutomatedProcess__Group_6_2__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3867:1: rule__AutomatedProcess__Group_6_2__1 : ( ';' ) ;
    public final void rule__AutomatedProcess__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3871:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3872:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3872:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3873:1: ';'
            {
             before(grammarAccess.getAutomatedProcessAccess().getSemicolonKeyword_6_2_1()); 
            match(input,17,FOLLOW_17_in_rule__AutomatedProcess__Group_6_2__17732); 
             after(grammarAccess.getAutomatedProcessAccess().getSemicolonKeyword_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AutomatedProcess__Group_6_2__1


    // $ANTLR start rule__InteractiveProcess__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3890:1: rule__InteractiveProcess__Group__0 : ( ( rule__InteractiveProcess__DescriptionAssignment_0 )? ) rule__InteractiveProcess__Group__1 ;
    public final void rule__InteractiveProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3894:1: ( ( ( rule__InteractiveProcess__DescriptionAssignment_0 )? ) rule__InteractiveProcess__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3895:1: ( ( rule__InteractiveProcess__DescriptionAssignment_0 )? ) rule__InteractiveProcess__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3895:1: ( ( rule__InteractiveProcess__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3896:1: ( rule__InteractiveProcess__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getInteractiveProcessAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3897:1: ( rule__InteractiveProcess__DescriptionAssignment_0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_STRING) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3897:2: rule__InteractiveProcess__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__InteractiveProcess__DescriptionAssignment_0_in_rule__InteractiveProcess__Group__07771);
                    rule__InteractiveProcess__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInteractiveProcessAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__InteractiveProcess__Group__1_in_rule__InteractiveProcess__Group__07781);
            rule__InteractiveProcess__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InteractiveProcess__Group__0


    // $ANTLR start rule__InteractiveProcess__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3908:1: rule__InteractiveProcess__Group__1 : ( 'InteractiveProcess' ) rule__InteractiveProcess__Group__2 ;
    public final void rule__InteractiveProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3912:1: ( ( 'InteractiveProcess' ) rule__InteractiveProcess__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3913:1: ( 'InteractiveProcess' ) rule__InteractiveProcess__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3913:1: ( 'InteractiveProcess' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3914:1: 'InteractiveProcess'
            {
             before(grammarAccess.getInteractiveProcessAccess().getInteractiveProcessKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__InteractiveProcess__Group__17810); 
             after(grammarAccess.getInteractiveProcessAccess().getInteractiveProcessKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__InteractiveProcess__Group__2_in_rule__InteractiveProcess__Group__17820);
            rule__InteractiveProcess__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InteractiveProcess__Group__1


    // $ANTLR start rule__InteractiveProcess__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3928:1: rule__InteractiveProcess__Group__2 : ( ( rule__InteractiveProcess__NameAssignment_2 ) ) rule__InteractiveProcess__Group__3 ;
    public final void rule__InteractiveProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3932:1: ( ( ( rule__InteractiveProcess__NameAssignment_2 ) ) rule__InteractiveProcess__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3933:1: ( ( rule__InteractiveProcess__NameAssignment_2 ) ) rule__InteractiveProcess__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3933:1: ( ( rule__InteractiveProcess__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3934:1: ( rule__InteractiveProcess__NameAssignment_2 )
            {
             before(grammarAccess.getInteractiveProcessAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3935:1: ( rule__InteractiveProcess__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3935:2: rule__InteractiveProcess__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__InteractiveProcess__NameAssignment_2_in_rule__InteractiveProcess__Group__27848);
            rule__InteractiveProcess__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getInteractiveProcessAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__InteractiveProcess__Group__3_in_rule__InteractiveProcess__Group__27857);
            rule__InteractiveProcess__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InteractiveProcess__Group__2


    // $ANTLR start rule__InteractiveProcess__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3946:1: rule__InteractiveProcess__Group__3 : ( 'context' ) rule__InteractiveProcess__Group__4 ;
    public final void rule__InteractiveProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3950:1: ( ( 'context' ) rule__InteractiveProcess__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3951:1: ( 'context' ) rule__InteractiveProcess__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3951:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3952:1: 'context'
            {
             before(grammarAccess.getInteractiveProcessAccess().getContextKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__InteractiveProcess__Group__37886); 
             after(grammarAccess.getInteractiveProcessAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__InteractiveProcess__Group__4_in_rule__InteractiveProcess__Group__37896);
            rule__InteractiveProcess__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InteractiveProcess__Group__3


    // $ANTLR start rule__InteractiveProcess__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3966:1: rule__InteractiveProcess__Group__4 : ( ( rule__InteractiveProcess__ContextRefAssignment_4 ) ) rule__InteractiveProcess__Group__5 ;
    public final void rule__InteractiveProcess__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3970:1: ( ( ( rule__InteractiveProcess__ContextRefAssignment_4 ) ) rule__InteractiveProcess__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3971:1: ( ( rule__InteractiveProcess__ContextRefAssignment_4 ) ) rule__InteractiveProcess__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3971:1: ( ( rule__InteractiveProcess__ContextRefAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3972:1: ( rule__InteractiveProcess__ContextRefAssignment_4 )
            {
             before(grammarAccess.getInteractiveProcessAccess().getContextRefAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3973:1: ( rule__InteractiveProcess__ContextRefAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3973:2: rule__InteractiveProcess__ContextRefAssignment_4
            {
            pushFollow(FOLLOW_rule__InteractiveProcess__ContextRefAssignment_4_in_rule__InteractiveProcess__Group__47924);
            rule__InteractiveProcess__ContextRefAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getInteractiveProcessAccess().getContextRefAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__InteractiveProcess__Group__5_in_rule__InteractiveProcess__Group__47933);
            rule__InteractiveProcess__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InteractiveProcess__Group__4


    // $ANTLR start rule__InteractiveProcess__Group__5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3984:1: rule__InteractiveProcess__Group__5 : ( ( rule__InteractiveProcess__TypeAssignment_5 )? ) rule__InteractiveProcess__Group__6 ;
    public final void rule__InteractiveProcess__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3988:1: ( ( ( rule__InteractiveProcess__TypeAssignment_5 )? ) rule__InteractiveProcess__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3989:1: ( ( rule__InteractiveProcess__TypeAssignment_5 )? ) rule__InteractiveProcess__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3989:1: ( ( rule__InteractiveProcess__TypeAssignment_5 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3990:1: ( rule__InteractiveProcess__TypeAssignment_5 )?
            {
             before(grammarAccess.getInteractiveProcessAccess().getTypeAssignment_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3991:1: ( rule__InteractiveProcess__TypeAssignment_5 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=12 && LA50_0<=15)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3991:2: rule__InteractiveProcess__TypeAssignment_5
                    {
                    pushFollow(FOLLOW_rule__InteractiveProcess__TypeAssignment_5_in_rule__InteractiveProcess__Group__57961);
                    rule__InteractiveProcess__TypeAssignment_5();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInteractiveProcessAccess().getTypeAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__InteractiveProcess__Group__6_in_rule__InteractiveProcess__Group__57971);
            rule__InteractiveProcess__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InteractiveProcess__Group__5


    // $ANTLR start rule__InteractiveProcess__Group__6
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4002:1: rule__InteractiveProcess__Group__6 : ( ( rule__InteractiveProcess__Group_6__0 )? ) ;
    public final void rule__InteractiveProcess__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4006:1: ( ( ( rule__InteractiveProcess__Group_6__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4007:1: ( ( rule__InteractiveProcess__Group_6__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4007:1: ( ( rule__InteractiveProcess__Group_6__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4008:1: ( rule__InteractiveProcess__Group_6__0 )?
            {
             before(grammarAccess.getInteractiveProcessAccess().getGroup_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4009:1: ( rule__InteractiveProcess__Group_6__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==35) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4009:2: rule__InteractiveProcess__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__InteractiveProcess__Group_6__0_in_rule__InteractiveProcess__Group__67999);
                    rule__InteractiveProcess__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInteractiveProcessAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InteractiveProcess__Group__6


    // $ANTLR start rule__InteractiveProcess__Group_6__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4033:1: rule__InteractiveProcess__Group_6__0 : ( 'steps' ) rule__InteractiveProcess__Group_6__1 ;
    public final void rule__InteractiveProcess__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4037:1: ( ( 'steps' ) rule__InteractiveProcess__Group_6__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4038:1: ( 'steps' ) rule__InteractiveProcess__Group_6__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4038:1: ( 'steps' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4039:1: 'steps'
            {
             before(grammarAccess.getInteractiveProcessAccess().getStepsKeyword_6_0()); 
            match(input,35,FOLLOW_35_in_rule__InteractiveProcess__Group_6__08049); 
             after(grammarAccess.getInteractiveProcessAccess().getStepsKeyword_6_0()); 

            }

            pushFollow(FOLLOW_rule__InteractiveProcess__Group_6__1_in_rule__InteractiveProcess__Group_6__08059);
            rule__InteractiveProcess__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InteractiveProcess__Group_6__0


    // $ANTLR start rule__InteractiveProcess__Group_6__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4053:1: rule__InteractiveProcess__Group_6__1 : ( '[' ) rule__InteractiveProcess__Group_6__2 ;
    public final void rule__InteractiveProcess__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4057:1: ( ( '[' ) rule__InteractiveProcess__Group_6__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4058:1: ( '[' ) rule__InteractiveProcess__Group_6__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4058:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4059:1: '['
            {
             before(grammarAccess.getInteractiveProcessAccess().getLeftSquareBracketKeyword_6_1()); 
            match(input,22,FOLLOW_22_in_rule__InteractiveProcess__Group_6__18088); 
             after(grammarAccess.getInteractiveProcessAccess().getLeftSquareBracketKeyword_6_1()); 

            }

            pushFollow(FOLLOW_rule__InteractiveProcess__Group_6__2_in_rule__InteractiveProcess__Group_6__18098);
            rule__InteractiveProcess__Group_6__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InteractiveProcess__Group_6__1


    // $ANTLR start rule__InteractiveProcess__Group_6__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4073:1: rule__InteractiveProcess__Group_6__2 : ( ( rule__InteractiveProcess__Group_6_2__0 )* ) rule__InteractiveProcess__Group_6__3 ;
    public final void rule__InteractiveProcess__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4077:1: ( ( ( rule__InteractiveProcess__Group_6_2__0 )* ) rule__InteractiveProcess__Group_6__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4078:1: ( ( rule__InteractiveProcess__Group_6_2__0 )* ) rule__InteractiveProcess__Group_6__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4078:1: ( ( rule__InteractiveProcess__Group_6_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4079:1: ( rule__InteractiveProcess__Group_6_2__0 )*
            {
             before(grammarAccess.getInteractiveProcessAccess().getGroup_6_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4080:1: ( rule__InteractiveProcess__Group_6_2__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=47 && LA52_0<=48)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4080:2: rule__InteractiveProcess__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__InteractiveProcess__Group_6_2__0_in_rule__InteractiveProcess__Group_6__28126);
            	    rule__InteractiveProcess__Group_6_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getInteractiveProcessAccess().getGroup_6_2()); 

            }

            pushFollow(FOLLOW_rule__InteractiveProcess__Group_6__3_in_rule__InteractiveProcess__Group_6__28136);
            rule__InteractiveProcess__Group_6__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InteractiveProcess__Group_6__2


    // $ANTLR start rule__InteractiveProcess__Group_6__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4091:1: rule__InteractiveProcess__Group_6__3 : ( ']' ) ;
    public final void rule__InteractiveProcess__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4095:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4096:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4096:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4097:1: ']'
            {
             before(grammarAccess.getInteractiveProcessAccess().getRightSquareBracketKeyword_6_3()); 
            match(input,23,FOLLOW_23_in_rule__InteractiveProcess__Group_6__38165); 
             after(grammarAccess.getInteractiveProcessAccess().getRightSquareBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InteractiveProcess__Group_6__3


    // $ANTLR start rule__InteractiveProcess__Group_6_2__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4118:1: rule__InteractiveProcess__Group_6_2__0 : ( ( rule__InteractiveProcess__ProcessElementsAssignment_6_2_0 ) ) rule__InteractiveProcess__Group_6_2__1 ;
    public final void rule__InteractiveProcess__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4122:1: ( ( ( rule__InteractiveProcess__ProcessElementsAssignment_6_2_0 ) ) rule__InteractiveProcess__Group_6_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4123:1: ( ( rule__InteractiveProcess__ProcessElementsAssignment_6_2_0 ) ) rule__InteractiveProcess__Group_6_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4123:1: ( ( rule__InteractiveProcess__ProcessElementsAssignment_6_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4124:1: ( rule__InteractiveProcess__ProcessElementsAssignment_6_2_0 )
            {
             before(grammarAccess.getInteractiveProcessAccess().getProcessElementsAssignment_6_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4125:1: ( rule__InteractiveProcess__ProcessElementsAssignment_6_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4125:2: rule__InteractiveProcess__ProcessElementsAssignment_6_2_0
            {
            pushFollow(FOLLOW_rule__InteractiveProcess__ProcessElementsAssignment_6_2_0_in_rule__InteractiveProcess__Group_6_2__08208);
            rule__InteractiveProcess__ProcessElementsAssignment_6_2_0();
            _fsp--;


            }

             after(grammarAccess.getInteractiveProcessAccess().getProcessElementsAssignment_6_2_0()); 

            }

            pushFollow(FOLLOW_rule__InteractiveProcess__Group_6_2__1_in_rule__InteractiveProcess__Group_6_2__08217);
            rule__InteractiveProcess__Group_6_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InteractiveProcess__Group_6_2__0


    // $ANTLR start rule__InteractiveProcess__Group_6_2__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4136:1: rule__InteractiveProcess__Group_6_2__1 : ( ';' ) ;
    public final void rule__InteractiveProcess__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4140:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4141:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4141:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4142:1: ';'
            {
             before(grammarAccess.getInteractiveProcessAccess().getSemicolonKeyword_6_2_1()); 
            match(input,17,FOLLOW_17_in_rule__InteractiveProcess__Group_6_2__18246); 
             after(grammarAccess.getInteractiveProcessAccess().getSemicolonKeyword_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InteractiveProcess__Group_6_2__1


    // $ANTLR start rule__FormElement__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4159:1: rule__FormElement__Group__0 : ( ( rule__FormElement__DescriptionAssignment_0 )? ) rule__FormElement__Group__1 ;
    public final void rule__FormElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4163:1: ( ( ( rule__FormElement__DescriptionAssignment_0 )? ) rule__FormElement__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4164:1: ( ( rule__FormElement__DescriptionAssignment_0 )? ) rule__FormElement__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4164:1: ( ( rule__FormElement__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4165:1: ( rule__FormElement__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getFormElementAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4166:1: ( rule__FormElement__DescriptionAssignment_0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_STRING) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4166:2: rule__FormElement__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FormElement__DescriptionAssignment_0_in_rule__FormElement__Group__08285);
                    rule__FormElement__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormElementAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__1_in_rule__FormElement__Group__08295);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4177:1: rule__FormElement__Group__1 : ( 'element' ) rule__FormElement__Group__2 ;
    public final void rule__FormElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4181:1: ( ( 'element' ) rule__FormElement__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4182:1: ( 'element' ) rule__FormElement__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4182:1: ( 'element' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4183:1: 'element'
            {
             before(grammarAccess.getFormElementAccess().getElementKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__FormElement__Group__18324); 
             after(grammarAccess.getFormElementAccess().getElementKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__2_in_rule__FormElement__Group__18334);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4197:1: rule__FormElement__Group__2 : ( ( rule__FormElement__ReferencesAssignment_2 ) ) rule__FormElement__Group__3 ;
    public final void rule__FormElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4201:1: ( ( ( rule__FormElement__ReferencesAssignment_2 ) ) rule__FormElement__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4202:1: ( ( rule__FormElement__ReferencesAssignment_2 ) ) rule__FormElement__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4202:1: ( ( rule__FormElement__ReferencesAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4203:1: ( rule__FormElement__ReferencesAssignment_2 )
            {
             before(grammarAccess.getFormElementAccess().getReferencesAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4204:1: ( rule__FormElement__ReferencesAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4204:2: rule__FormElement__ReferencesAssignment_2
            {
            pushFollow(FOLLOW_rule__FormElement__ReferencesAssignment_2_in_rule__FormElement__Group__28362);
            rule__FormElement__ReferencesAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFormElementAccess().getReferencesAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__3_in_rule__FormElement__Group__28371);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4215:1: rule__FormElement__Group__3 : ( 'label' ) rule__FormElement__Group__4 ;
    public final void rule__FormElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4219:1: ( ( 'label' ) rule__FormElement__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4220:1: ( 'label' ) rule__FormElement__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4220:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4221:1: 'label'
            {
             before(grammarAccess.getFormElementAccess().getLabelKeyword_3()); 
            match(input,38,FOLLOW_38_in_rule__FormElement__Group__38400); 
             after(grammarAccess.getFormElementAccess().getLabelKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__4_in_rule__FormElement__Group__38410);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4235:1: rule__FormElement__Group__4 : ( ( rule__FormElement__LabelAssignment_4 ) ) rule__FormElement__Group__5 ;
    public final void rule__FormElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4239:1: ( ( ( rule__FormElement__LabelAssignment_4 ) ) rule__FormElement__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4240:1: ( ( rule__FormElement__LabelAssignment_4 ) ) rule__FormElement__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4240:1: ( ( rule__FormElement__LabelAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4241:1: ( rule__FormElement__LabelAssignment_4 )
            {
             before(grammarAccess.getFormElementAccess().getLabelAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4242:1: ( rule__FormElement__LabelAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4242:2: rule__FormElement__LabelAssignment_4
            {
            pushFollow(FOLLOW_rule__FormElement__LabelAssignment_4_in_rule__FormElement__Group__48438);
            rule__FormElement__LabelAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getFormElementAccess().getLabelAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__5_in_rule__FormElement__Group__48447);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4253:1: rule__FormElement__Group__5 : ( ( rule__FormElement__Group_5__0 )? ) rule__FormElement__Group__6 ;
    public final void rule__FormElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4257:1: ( ( ( rule__FormElement__Group_5__0 )? ) rule__FormElement__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4258:1: ( ( rule__FormElement__Group_5__0 )? ) rule__FormElement__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4258:1: ( ( rule__FormElement__Group_5__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4259:1: ( rule__FormElement__Group_5__0 )?
            {
             before(grammarAccess.getFormElementAccess().getGroup_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4260:1: ( rule__FormElement__Group_5__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==24) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4260:2: rule__FormElement__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__FormElement__Group_5__0_in_rule__FormElement__Group__58475);
                    rule__FormElement__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormElementAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__6_in_rule__FormElement__Group__58485);
            rule__FormElement__Group__6();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__FormElement__Group__6
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4271:1: rule__FormElement__Group__6 : ( ';' ) ;
    public final void rule__FormElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4275:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4276:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4276:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4277:1: ';'
            {
             before(grammarAccess.getFormElementAccess().getSemicolonKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__FormElement__Group__68514); 
             after(grammarAccess.getFormElementAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__Group__6


    // $ANTLR start rule__FormElement__Group_5__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4304:1: rule__FormElement__Group_5__0 : ( 'readonly' ) rule__FormElement__Group_5__1 ;
    public final void rule__FormElement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4308:1: ( ( 'readonly' ) rule__FormElement__Group_5__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4309:1: ( 'readonly' ) rule__FormElement__Group_5__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4309:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4310:1: 'readonly'
            {
             before(grammarAccess.getFormElementAccess().getReadonlyKeyword_5_0()); 
            match(input,24,FOLLOW_24_in_rule__FormElement__Group_5__08564); 
             after(grammarAccess.getFormElementAccess().getReadonlyKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group_5__1_in_rule__FormElement__Group_5__08574);
            rule__FormElement__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__Group_5__0


    // $ANTLR start rule__FormElement__Group_5__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4324:1: rule__FormElement__Group_5__1 : ( ( rule__FormElement__Alternatives_5_1 ) ) ;
    public final void rule__FormElement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4328:1: ( ( ( rule__FormElement__Alternatives_5_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4329:1: ( ( rule__FormElement__Alternatives_5_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4329:1: ( ( rule__FormElement__Alternatives_5_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4330:1: ( rule__FormElement__Alternatives_5_1 )
            {
             before(grammarAccess.getFormElementAccess().getAlternatives_5_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4331:1: ( rule__FormElement__Alternatives_5_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4331:2: rule__FormElement__Alternatives_5_1
            {
            pushFollow(FOLLOW_rule__FormElement__Alternatives_5_1_in_rule__FormElement__Group_5__18602);
            rule__FormElement__Alternatives_5_1();
            _fsp--;


            }

             after(grammarAccess.getFormElementAccess().getAlternatives_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__Group_5__1


    // $ANTLR start rule__DialogueCall__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4345:1: rule__DialogueCall__Group__0 : ( ( rule__DialogueCall__Alternatives_0 ) ) rule__DialogueCall__Group__1 ;
    public final void rule__DialogueCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4349:1: ( ( ( rule__DialogueCall__Alternatives_0 ) ) rule__DialogueCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4350:1: ( ( rule__DialogueCall__Alternatives_0 ) ) rule__DialogueCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4350:1: ( ( rule__DialogueCall__Alternatives_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4351:1: ( rule__DialogueCall__Alternatives_0 )
            {
             before(grammarAccess.getDialogueCallAccess().getAlternatives_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4352:1: ( rule__DialogueCall__Alternatives_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4352:2: rule__DialogueCall__Alternatives_0
            {
            pushFollow(FOLLOW_rule__DialogueCall__Alternatives_0_in_rule__DialogueCall__Group__08640);
            rule__DialogueCall__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getDialogueCallAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group__1_in_rule__DialogueCall__Group__08649);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4363:1: rule__DialogueCall__Group__1 : ( ( rule__DialogueCall__Group_1__0 )? ) ;
    public final void rule__DialogueCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4367:1: ( ( ( rule__DialogueCall__Group_1__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4368:1: ( ( rule__DialogueCall__Group_1__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4368:1: ( ( rule__DialogueCall__Group_1__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4369:1: ( rule__DialogueCall__Group_1__0 )?
            {
             before(grammarAccess.getDialogueCallAccess().getGroup_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4370:1: ( rule__DialogueCall__Group_1__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==39) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4370:2: rule__DialogueCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DialogueCall__Group_1__0_in_rule__DialogueCall__Group__18677);
                    rule__DialogueCall__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDialogueCallAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start rule__DialogueCall__Group_1__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4384:1: rule__DialogueCall__Group_1__0 : ( 'alias' ) rule__DialogueCall__Group_1__1 ;
    public final void rule__DialogueCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4388:1: ( ( 'alias' ) rule__DialogueCall__Group_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4389:1: ( 'alias' ) rule__DialogueCall__Group_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4389:1: ( 'alias' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4390:1: 'alias'
            {
             before(grammarAccess.getDialogueCallAccess().getAliasKeyword_1_0()); 
            match(input,39,FOLLOW_39_in_rule__DialogueCall__Group_1__08717); 
             after(grammarAccess.getDialogueCallAccess().getAliasKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group_1__1_in_rule__DialogueCall__Group_1__08727);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4404:1: rule__DialogueCall__Group_1__1 : ( ( rule__DialogueCall__AliasAssignment_1_1 ) ) ;
    public final void rule__DialogueCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4408:1: ( ( ( rule__DialogueCall__AliasAssignment_1_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4409:1: ( ( rule__DialogueCall__AliasAssignment_1_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4409:1: ( ( rule__DialogueCall__AliasAssignment_1_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4410:1: ( rule__DialogueCall__AliasAssignment_1_1 )
            {
             before(grammarAccess.getDialogueCallAccess().getAliasAssignment_1_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4411:1: ( rule__DialogueCall__AliasAssignment_1_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4411:2: rule__DialogueCall__AliasAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DialogueCall__AliasAssignment_1_1_in_rule__DialogueCall__Group_1__18755);
            rule__DialogueCall__AliasAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getDialogueCallAccess().getAliasAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start rule__LinkedDialogueCall__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4425:1: rule__LinkedDialogueCall__Group__0 : ( ( rule__LinkedDialogueCall__LinkAssignment_0 ) ) rule__LinkedDialogueCall__Group__1 ;
    public final void rule__LinkedDialogueCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4429:1: ( ( ( rule__LinkedDialogueCall__LinkAssignment_0 ) ) rule__LinkedDialogueCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4430:1: ( ( rule__LinkedDialogueCall__LinkAssignment_0 ) ) rule__LinkedDialogueCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4430:1: ( ( rule__LinkedDialogueCall__LinkAssignment_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4431:1: ( rule__LinkedDialogueCall__LinkAssignment_0 )
            {
             before(grammarAccess.getLinkedDialogueCallAccess().getLinkAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4432:1: ( rule__LinkedDialogueCall__LinkAssignment_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4432:2: rule__LinkedDialogueCall__LinkAssignment_0
            {
            pushFollow(FOLLOW_rule__LinkedDialogueCall__LinkAssignment_0_in_rule__LinkedDialogueCall__Group__08793);
            rule__LinkedDialogueCall__LinkAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getLinkedDialogueCallAccess().getLinkAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__LinkedDialogueCall__Group__1_in_rule__LinkedDialogueCall__Group__08802);
            rule__LinkedDialogueCall__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkedDialogueCall__Group__0


    // $ANTLR start rule__LinkedDialogueCall__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4443:1: rule__LinkedDialogueCall__Group__1 : ( 'to' ) rule__LinkedDialogueCall__Group__2 ;
    public final void rule__LinkedDialogueCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4447:1: ( ( 'to' ) rule__LinkedDialogueCall__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4448:1: ( 'to' ) rule__LinkedDialogueCall__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4448:1: ( 'to' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4449:1: 'to'
            {
             before(grammarAccess.getLinkedDialogueCallAccess().getToKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__LinkedDialogueCall__Group__18831); 
             after(grammarAccess.getLinkedDialogueCallAccess().getToKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__LinkedDialogueCall__Group__2_in_rule__LinkedDialogueCall__Group__18841);
            rule__LinkedDialogueCall__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkedDialogueCall__Group__1


    // $ANTLR start rule__LinkedDialogueCall__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4463:1: rule__LinkedDialogueCall__Group__2 : ( ( rule__LinkedDialogueCall__NameAssignment_2 ) ) ;
    public final void rule__LinkedDialogueCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4467:1: ( ( ( rule__LinkedDialogueCall__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4468:1: ( ( rule__LinkedDialogueCall__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4468:1: ( ( rule__LinkedDialogueCall__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4469:1: ( rule__LinkedDialogueCall__NameAssignment_2 )
            {
             before(grammarAccess.getLinkedDialogueCallAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4470:1: ( rule__LinkedDialogueCall__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4470:2: rule__LinkedDialogueCall__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__LinkedDialogueCall__NameAssignment_2_in_rule__LinkedDialogueCall__Group__28869);
            rule__LinkedDialogueCall__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getLinkedDialogueCallAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkedDialogueCall__Group__2


    // $ANTLR start rule__ProcessCall__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4486:1: rule__ProcessCall__Group__0 : ( ( rule__ProcessCall__Alternatives_0 ) ) rule__ProcessCall__Group__1 ;
    public final void rule__ProcessCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4490:1: ( ( ( rule__ProcessCall__Alternatives_0 ) ) rule__ProcessCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4491:1: ( ( rule__ProcessCall__Alternatives_0 ) ) rule__ProcessCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4491:1: ( ( rule__ProcessCall__Alternatives_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4492:1: ( rule__ProcessCall__Alternatives_0 )
            {
             before(grammarAccess.getProcessCallAccess().getAlternatives_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4493:1: ( rule__ProcessCall__Alternatives_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4493:2: rule__ProcessCall__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ProcessCall__Alternatives_0_in_rule__ProcessCall__Group__08909);
            rule__ProcessCall__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getProcessCallAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__1_in_rule__ProcessCall__Group__08918);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4504:1: rule__ProcessCall__Group__1 : ( ( rule__ProcessCall__Group_1__0 )? ) ;
    public final void rule__ProcessCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4508:1: ( ( ( rule__ProcessCall__Group_1__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4509:1: ( ( rule__ProcessCall__Group_1__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4509:1: ( ( rule__ProcessCall__Group_1__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4510:1: ( rule__ProcessCall__Group_1__0 )?
            {
             before(grammarAccess.getProcessCallAccess().getGroup_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4511:1: ( rule__ProcessCall__Group_1__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==39) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4511:2: rule__ProcessCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ProcessCall__Group_1__0_in_rule__ProcessCall__Group__18946);
                    rule__ProcessCall__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessCallAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start rule__ProcessCall__Group_1__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4525:1: rule__ProcessCall__Group_1__0 : ( 'alias' ) rule__ProcessCall__Group_1__1 ;
    public final void rule__ProcessCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4529:1: ( ( 'alias' ) rule__ProcessCall__Group_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4530:1: ( 'alias' ) rule__ProcessCall__Group_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4530:1: ( 'alias' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4531:1: 'alias'
            {
             before(grammarAccess.getProcessCallAccess().getAliasKeyword_1_0()); 
            match(input,39,FOLLOW_39_in_rule__ProcessCall__Group_1__08986); 
             after(grammarAccess.getProcessCallAccess().getAliasKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_1__1_in_rule__ProcessCall__Group_1__08996);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4545:1: rule__ProcessCall__Group_1__1 : ( ( rule__ProcessCall__AliasAssignment_1_1 ) ) ;
    public final void rule__ProcessCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4549:1: ( ( ( rule__ProcessCall__AliasAssignment_1_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4550:1: ( ( rule__ProcessCall__AliasAssignment_1_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4550:1: ( ( rule__ProcessCall__AliasAssignment_1_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4551:1: ( rule__ProcessCall__AliasAssignment_1_1 )
            {
             before(grammarAccess.getProcessCallAccess().getAliasAssignment_1_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4552:1: ( rule__ProcessCall__AliasAssignment_1_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4552:2: rule__ProcessCall__AliasAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ProcessCall__AliasAssignment_1_1_in_rule__ProcessCall__Group_1__19024);
            rule__ProcessCall__AliasAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getProcessCallAccess().getAliasAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start rule__LinkedProcessCall__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4566:1: rule__LinkedProcessCall__Group__0 : ( ( rule__LinkedProcessCall__LinkAssignment_0 ) ) rule__LinkedProcessCall__Group__1 ;
    public final void rule__LinkedProcessCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4570:1: ( ( ( rule__LinkedProcessCall__LinkAssignment_0 ) ) rule__LinkedProcessCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4571:1: ( ( rule__LinkedProcessCall__LinkAssignment_0 ) ) rule__LinkedProcessCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4571:1: ( ( rule__LinkedProcessCall__LinkAssignment_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4572:1: ( rule__LinkedProcessCall__LinkAssignment_0 )
            {
             before(grammarAccess.getLinkedProcessCallAccess().getLinkAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4573:1: ( rule__LinkedProcessCall__LinkAssignment_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4573:2: rule__LinkedProcessCall__LinkAssignment_0
            {
            pushFollow(FOLLOW_rule__LinkedProcessCall__LinkAssignment_0_in_rule__LinkedProcessCall__Group__09062);
            rule__LinkedProcessCall__LinkAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getLinkedProcessCallAccess().getLinkAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__LinkedProcessCall__Group__1_in_rule__LinkedProcessCall__Group__09071);
            rule__LinkedProcessCall__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkedProcessCall__Group__0


    // $ANTLR start rule__LinkedProcessCall__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4584:1: rule__LinkedProcessCall__Group__1 : ( 'to' ) rule__LinkedProcessCall__Group__2 ;
    public final void rule__LinkedProcessCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4588:1: ( ( 'to' ) rule__LinkedProcessCall__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4589:1: ( 'to' ) rule__LinkedProcessCall__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4589:1: ( 'to' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4590:1: 'to'
            {
             before(grammarAccess.getLinkedProcessCallAccess().getToKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__LinkedProcessCall__Group__19100); 
             after(grammarAccess.getLinkedProcessCallAccess().getToKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__LinkedProcessCall__Group__2_in_rule__LinkedProcessCall__Group__19110);
            rule__LinkedProcessCall__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkedProcessCall__Group__1


    // $ANTLR start rule__LinkedProcessCall__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4604:1: rule__LinkedProcessCall__Group__2 : ( ( rule__LinkedProcessCall__NameAssignment_2 ) ) ;
    public final void rule__LinkedProcessCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4608:1: ( ( ( rule__LinkedProcessCall__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4609:1: ( ( rule__LinkedProcessCall__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4609:1: ( ( rule__LinkedProcessCall__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4610:1: ( rule__LinkedProcessCall__NameAssignment_2 )
            {
             before(grammarAccess.getLinkedProcessCallAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4611:1: ( rule__LinkedProcessCall__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4611:2: rule__LinkedProcessCall__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__LinkedProcessCall__NameAssignment_2_in_rule__LinkedProcessCall__Group__29138);
            rule__LinkedProcessCall__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getLinkedProcessCallAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkedProcessCall__Group__2


    // $ANTLR start rule__LinkRef__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4627:1: rule__LinkRef__Group__0 : ( 'linkref' ) rule__LinkRef__Group__1 ;
    public final void rule__LinkRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4631:1: ( ( 'linkref' ) rule__LinkRef__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4632:1: ( 'linkref' ) rule__LinkRef__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4632:1: ( 'linkref' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4633:1: 'linkref'
            {
             before(grammarAccess.getLinkRefAccess().getLinkrefKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__LinkRef__Group__09179); 
             after(grammarAccess.getLinkRefAccess().getLinkrefKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__LinkRef__Group__1_in_rule__LinkRef__Group__09189);
            rule__LinkRef__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkRef__Group__0


    // $ANTLR start rule__LinkRef__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4647:1: rule__LinkRef__Group__1 : ( ( rule__LinkRef__NameAssignment_1 ) ) ;
    public final void rule__LinkRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4651:1: ( ( ( rule__LinkRef__NameAssignment_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4652:1: ( ( rule__LinkRef__NameAssignment_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4652:1: ( ( rule__LinkRef__NameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4653:1: ( rule__LinkRef__NameAssignment_1 )
            {
             before(grammarAccess.getLinkRefAccess().getNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4654:1: ( rule__LinkRef__NameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4654:2: rule__LinkRef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__LinkRef__NameAssignment_1_in_rule__LinkRef__Group__19217);
            rule__LinkRef__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLinkRefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkRef__Group__1


    // $ANTLR start rule__LinkService__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4668:1: rule__LinkService__Group__0 : ( 'call' ) rule__LinkService__Group__1 ;
    public final void rule__LinkService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4672:1: ( ( 'call' ) rule__LinkService__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4673:1: ( 'call' ) rule__LinkService__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4673:1: ( 'call' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4674:1: 'call'
            {
             before(grammarAccess.getLinkServiceAccess().getCallKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__LinkService__Group__09256); 
             after(grammarAccess.getLinkServiceAccess().getCallKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__LinkService__Group__1_in_rule__LinkService__Group__09266);
            rule__LinkService__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkService__Group__0


    // $ANTLR start rule__LinkService__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4688:1: rule__LinkService__Group__1 : ( ( rule__LinkService__ServiceNameAssignment_1 ) ) rule__LinkService__Group__2 ;
    public final void rule__LinkService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4692:1: ( ( ( rule__LinkService__ServiceNameAssignment_1 ) ) rule__LinkService__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4693:1: ( ( rule__LinkService__ServiceNameAssignment_1 ) ) rule__LinkService__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4693:1: ( ( rule__LinkService__ServiceNameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4694:1: ( rule__LinkService__ServiceNameAssignment_1 )
            {
             before(grammarAccess.getLinkServiceAccess().getServiceNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4695:1: ( rule__LinkService__ServiceNameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4695:2: rule__LinkService__ServiceNameAssignment_1
            {
            pushFollow(FOLLOW_rule__LinkService__ServiceNameAssignment_1_in_rule__LinkService__Group__19294);
            rule__LinkService__ServiceNameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLinkServiceAccess().getServiceNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__LinkService__Group__2_in_rule__LinkService__Group__19303);
            rule__LinkService__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkService__Group__1


    // $ANTLR start rule__LinkService__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4706:1: rule__LinkService__Group__2 : ( '.' ) rule__LinkService__Group__3 ;
    public final void rule__LinkService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4710:1: ( ( '.' ) rule__LinkService__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4711:1: ( '.' ) rule__LinkService__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4711:1: ( '.' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4712:1: '.'
            {
             before(grammarAccess.getLinkServiceAccess().getFullStopKeyword_2()); 
            match(input,43,FOLLOW_43_in_rule__LinkService__Group__29332); 
             after(grammarAccess.getLinkServiceAccess().getFullStopKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__LinkService__Group__3_in_rule__LinkService__Group__29342);
            rule__LinkService__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkService__Group__2


    // $ANTLR start rule__LinkService__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4726:1: rule__LinkService__Group__3 : ( ( rule__LinkService__ServiceMethodAssignment_3 ) ) ;
    public final void rule__LinkService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4730:1: ( ( ( rule__LinkService__ServiceMethodAssignment_3 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4731:1: ( ( rule__LinkService__ServiceMethodAssignment_3 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4731:1: ( ( rule__LinkService__ServiceMethodAssignment_3 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4732:1: ( rule__LinkService__ServiceMethodAssignment_3 )
            {
             before(grammarAccess.getLinkServiceAccess().getServiceMethodAssignment_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4733:1: ( rule__LinkService__ServiceMethodAssignment_3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4733:2: rule__LinkService__ServiceMethodAssignment_3
            {
            pushFollow(FOLLOW_rule__LinkService__ServiceMethodAssignment_3_in_rule__LinkService__Group__39370);
            rule__LinkService__ServiceMethodAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getLinkServiceAccess().getServiceMethodAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkService__Group__3


    // $ANTLR start rule__LinkStep__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4751:1: rule__LinkStep__Group__0 : ( ( rule__LinkStep__DescriptionAssignment_0 )? ) rule__LinkStep__Group__1 ;
    public final void rule__LinkStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4755:1: ( ( ( rule__LinkStep__DescriptionAssignment_0 )? ) rule__LinkStep__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4756:1: ( ( rule__LinkStep__DescriptionAssignment_0 )? ) rule__LinkStep__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4756:1: ( ( rule__LinkStep__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4757:1: ( rule__LinkStep__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getLinkStepAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4758:1: ( rule__LinkStep__DescriptionAssignment_0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_STRING) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4758:2: rule__LinkStep__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__LinkStep__DescriptionAssignment_0_in_rule__LinkStep__Group__09412);
                    rule__LinkStep__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkStepAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__LinkStep__Group__1_in_rule__LinkStep__Group__09422);
            rule__LinkStep__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkStep__Group__0


    // $ANTLR start rule__LinkStep__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4769:1: rule__LinkStep__Group__1 : ( 'LinkStep' ) rule__LinkStep__Group__2 ;
    public final void rule__LinkStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4773:1: ( ( 'LinkStep' ) rule__LinkStep__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4774:1: ( 'LinkStep' ) rule__LinkStep__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4774:1: ( 'LinkStep' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4775:1: 'LinkStep'
            {
             before(grammarAccess.getLinkStepAccess().getLinkStepKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__LinkStep__Group__19451); 
             after(grammarAccess.getLinkStepAccess().getLinkStepKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__LinkStep__Group__2_in_rule__LinkStep__Group__19461);
            rule__LinkStep__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkStep__Group__1


    // $ANTLR start rule__LinkStep__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4789:1: rule__LinkStep__Group__2 : ( ( rule__LinkStep__NameAssignment_2 ) ) rule__LinkStep__Group__3 ;
    public final void rule__LinkStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4793:1: ( ( ( rule__LinkStep__NameAssignment_2 ) ) rule__LinkStep__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4794:1: ( ( rule__LinkStep__NameAssignment_2 ) ) rule__LinkStep__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4794:1: ( ( rule__LinkStep__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4795:1: ( rule__LinkStep__NameAssignment_2 )
            {
             before(grammarAccess.getLinkStepAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4796:1: ( rule__LinkStep__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4796:2: rule__LinkStep__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__LinkStep__NameAssignment_2_in_rule__LinkStep__Group__29489);
            rule__LinkStep__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getLinkStepAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__LinkStep__Group__3_in_rule__LinkStep__Group__29498);
            rule__LinkStep__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkStep__Group__2


    // $ANTLR start rule__LinkStep__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4807:1: rule__LinkStep__Group__3 : ( 'context' ) rule__LinkStep__Group__4 ;
    public final void rule__LinkStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4811:1: ( ( 'context' ) rule__LinkStep__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4812:1: ( 'context' ) rule__LinkStep__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4812:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4813:1: 'context'
            {
             before(grammarAccess.getLinkStepAccess().getContextKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__LinkStep__Group__39527); 
             after(grammarAccess.getLinkStepAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__LinkStep__Group__4_in_rule__LinkStep__Group__39537);
            rule__LinkStep__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkStep__Group__3


    // $ANTLR start rule__LinkStep__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4827:1: rule__LinkStep__Group__4 : ( ( rule__LinkStep__ContextRefAssignment_4 ) ) rule__LinkStep__Group__5 ;
    public final void rule__LinkStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4831:1: ( ( ( rule__LinkStep__ContextRefAssignment_4 ) ) rule__LinkStep__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4832:1: ( ( rule__LinkStep__ContextRefAssignment_4 ) ) rule__LinkStep__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4832:1: ( ( rule__LinkStep__ContextRefAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4833:1: ( rule__LinkStep__ContextRefAssignment_4 )
            {
             before(grammarAccess.getLinkStepAccess().getContextRefAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4834:1: ( rule__LinkStep__ContextRefAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4834:2: rule__LinkStep__ContextRefAssignment_4
            {
            pushFollow(FOLLOW_rule__LinkStep__ContextRefAssignment_4_in_rule__LinkStep__Group__49565);
            rule__LinkStep__ContextRefAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getLinkStepAccess().getContextRefAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__LinkStep__Group__5_in_rule__LinkStep__Group__49574);
            rule__LinkStep__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkStep__Group__4


    // $ANTLR start rule__LinkStep__Group__5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4845:1: rule__LinkStep__Group__5 : ( 'navigate' ) rule__LinkStep__Group__6 ;
    public final void rule__LinkStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4849:1: ( ( 'navigate' ) rule__LinkStep__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4850:1: ( 'navigate' ) rule__LinkStep__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4850:1: ( 'navigate' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4851:1: 'navigate'
            {
             before(grammarAccess.getLinkStepAccess().getNavigateKeyword_5()); 
            match(input,45,FOLLOW_45_in_rule__LinkStep__Group__59603); 
             after(grammarAccess.getLinkStepAccess().getNavigateKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__LinkStep__Group__6_in_rule__LinkStep__Group__59613);
            rule__LinkStep__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkStep__Group__5


    // $ANTLR start rule__LinkStep__Group__6
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4865:1: rule__LinkStep__Group__6 : ( ( rule__LinkStep__ReferenceAssignment_6 ) ) ;
    public final void rule__LinkStep__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4869:1: ( ( ( rule__LinkStep__ReferenceAssignment_6 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4870:1: ( ( rule__LinkStep__ReferenceAssignment_6 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4870:1: ( ( rule__LinkStep__ReferenceAssignment_6 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4871:1: ( rule__LinkStep__ReferenceAssignment_6 )
            {
             before(grammarAccess.getLinkStepAccess().getReferenceAssignment_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4872:1: ( rule__LinkStep__ReferenceAssignment_6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4872:2: rule__LinkStep__ReferenceAssignment_6
            {
            pushFollow(FOLLOW_rule__LinkStep__ReferenceAssignment_6_in_rule__LinkStep__Group__69641);
            rule__LinkStep__ReferenceAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getLinkStepAccess().getReferenceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkStep__Group__6


    // $ANTLR start rule__LinkPath__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4896:1: rule__LinkPath__Group__0 : ( ( rule__LinkPath__DescriptionAssignment_0 )? ) rule__LinkPath__Group__1 ;
    public final void rule__LinkPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4900:1: ( ( ( rule__LinkPath__DescriptionAssignment_0 )? ) rule__LinkPath__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4901:1: ( ( rule__LinkPath__DescriptionAssignment_0 )? ) rule__LinkPath__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4901:1: ( ( rule__LinkPath__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4902:1: ( rule__LinkPath__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getLinkPathAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4903:1: ( rule__LinkPath__DescriptionAssignment_0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_STRING) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4903:2: rule__LinkPath__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__LinkPath__DescriptionAssignment_0_in_rule__LinkPath__Group__09689);
                    rule__LinkPath__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkPathAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__LinkPath__Group__1_in_rule__LinkPath__Group__09699);
            rule__LinkPath__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkPath__Group__0


    // $ANTLR start rule__LinkPath__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4914:1: rule__LinkPath__Group__1 : ( 'LinkPath' ) rule__LinkPath__Group__2 ;
    public final void rule__LinkPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4918:1: ( ( 'LinkPath' ) rule__LinkPath__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4919:1: ( 'LinkPath' ) rule__LinkPath__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4919:1: ( 'LinkPath' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4920:1: 'LinkPath'
            {
             before(grammarAccess.getLinkPathAccess().getLinkPathKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__LinkPath__Group__19728); 
             after(grammarAccess.getLinkPathAccess().getLinkPathKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__LinkPath__Group__2_in_rule__LinkPath__Group__19738);
            rule__LinkPath__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkPath__Group__1


    // $ANTLR start rule__LinkPath__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4934:1: rule__LinkPath__Group__2 : ( ( rule__LinkPath__NameAssignment_2 ) ) rule__LinkPath__Group__3 ;
    public final void rule__LinkPath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4938:1: ( ( ( rule__LinkPath__NameAssignment_2 ) ) rule__LinkPath__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4939:1: ( ( rule__LinkPath__NameAssignment_2 ) ) rule__LinkPath__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4939:1: ( ( rule__LinkPath__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4940:1: ( rule__LinkPath__NameAssignment_2 )
            {
             before(grammarAccess.getLinkPathAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4941:1: ( rule__LinkPath__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4941:2: rule__LinkPath__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__LinkPath__NameAssignment_2_in_rule__LinkPath__Group__29766);
            rule__LinkPath__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getLinkPathAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__LinkPath__Group__3_in_rule__LinkPath__Group__29775);
            rule__LinkPath__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkPath__Group__2


    // $ANTLR start rule__LinkPath__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4952:1: rule__LinkPath__Group__3 : ( 'context' ) rule__LinkPath__Group__4 ;
    public final void rule__LinkPath__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4956:1: ( ( 'context' ) rule__LinkPath__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4957:1: ( 'context' ) rule__LinkPath__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4957:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4958:1: 'context'
            {
             before(grammarAccess.getLinkPathAccess().getContextKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__LinkPath__Group__39804); 
             after(grammarAccess.getLinkPathAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__LinkPath__Group__4_in_rule__LinkPath__Group__39814);
            rule__LinkPath__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkPath__Group__3


    // $ANTLR start rule__LinkPath__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4972:1: rule__LinkPath__Group__4 : ( ( rule__LinkPath__ContextRefAssignment_4 ) ) ;
    public final void rule__LinkPath__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4976:1: ( ( ( rule__LinkPath__ContextRefAssignment_4 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4977:1: ( ( rule__LinkPath__ContextRefAssignment_4 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4977:1: ( ( rule__LinkPath__ContextRefAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4978:1: ( rule__LinkPath__ContextRefAssignment_4 )
            {
             before(grammarAccess.getLinkPathAccess().getContextRefAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4979:1: ( rule__LinkPath__ContextRefAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4979:2: rule__LinkPath__ContextRefAssignment_4
            {
            pushFollow(FOLLOW_rule__LinkPath__ContextRefAssignment_4_in_rule__LinkPath__Group__49842);
            rule__LinkPath__ContextRefAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getLinkPathAccess().getContextRefAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkPath__Group__4


    // $ANTLR start rule__LinkNavigation__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4999:1: rule__LinkNavigation__Group__0 : ( 'navigate' ) rule__LinkNavigation__Group__1 ;
    public final void rule__LinkNavigation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5003:1: ( ( 'navigate' ) rule__LinkNavigation__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5004:1: ( 'navigate' ) rule__LinkNavigation__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5004:1: ( 'navigate' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5005:1: 'navigate'
            {
             before(grammarAccess.getLinkNavigationAccess().getNavigateKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__LinkNavigation__Group__09887); 
             after(grammarAccess.getLinkNavigationAccess().getNavigateKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__LinkNavigation__Group__1_in_rule__LinkNavigation__Group__09897);
            rule__LinkNavigation__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkNavigation__Group__0


    // $ANTLR start rule__LinkNavigation__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5019:1: rule__LinkNavigation__Group__1 : ( ( rule__LinkNavigation__ReferencesAssignment_1 ) ) rule__LinkNavigation__Group__2 ;
    public final void rule__LinkNavigation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5023:1: ( ( ( rule__LinkNavigation__ReferencesAssignment_1 ) ) rule__LinkNavigation__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5024:1: ( ( rule__LinkNavigation__ReferencesAssignment_1 ) ) rule__LinkNavigation__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5024:1: ( ( rule__LinkNavigation__ReferencesAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5025:1: ( rule__LinkNavigation__ReferencesAssignment_1 )
            {
             before(grammarAccess.getLinkNavigationAccess().getReferencesAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5026:1: ( rule__LinkNavigation__ReferencesAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5026:2: rule__LinkNavigation__ReferencesAssignment_1
            {
            pushFollow(FOLLOW_rule__LinkNavigation__ReferencesAssignment_1_in_rule__LinkNavigation__Group__19925);
            rule__LinkNavigation__ReferencesAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLinkNavigationAccess().getReferencesAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__LinkNavigation__Group__2_in_rule__LinkNavigation__Group__19934);
            rule__LinkNavigation__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkNavigation__Group__1


    // $ANTLR start rule__LinkNavigation__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5037:1: rule__LinkNavigation__Group__2 : ( ( rule__LinkNavigation__Group_2__0 )* ) ;
    public final void rule__LinkNavigation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5041:1: ( ( ( rule__LinkNavigation__Group_2__0 )* ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5042:1: ( ( rule__LinkNavigation__Group_2__0 )* )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5042:1: ( ( rule__LinkNavigation__Group_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5043:1: ( rule__LinkNavigation__Group_2__0 )*
            {
             before(grammarAccess.getLinkNavigationAccess().getGroup_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5044:1: ( rule__LinkNavigation__Group_2__0 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==43) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5044:2: rule__LinkNavigation__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__LinkNavigation__Group_2__0_in_rule__LinkNavigation__Group__29962);
            	    rule__LinkNavigation__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getLinkNavigationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkNavigation__Group__2


    // $ANTLR start rule__LinkNavigation__Group_2__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5060:1: rule__LinkNavigation__Group_2__0 : ( '.' ) rule__LinkNavigation__Group_2__1 ;
    public final void rule__LinkNavigation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5064:1: ( ( '.' ) rule__LinkNavigation__Group_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5065:1: ( '.' ) rule__LinkNavigation__Group_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5065:1: ( '.' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5066:1: '.'
            {
             before(grammarAccess.getLinkNavigationAccess().getFullStopKeyword_2_0()); 
            match(input,43,FOLLOW_43_in_rule__LinkNavigation__Group_2__010004); 
             after(grammarAccess.getLinkNavigationAccess().getFullStopKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__LinkNavigation__Group_2__1_in_rule__LinkNavigation__Group_2__010014);
            rule__LinkNavigation__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkNavigation__Group_2__0


    // $ANTLR start rule__LinkNavigation__Group_2__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5080:1: rule__LinkNavigation__Group_2__1 : ( ( rule__LinkNavigation__ReferencesAssignment_2_1 ) ) ;
    public final void rule__LinkNavigation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5084:1: ( ( ( rule__LinkNavigation__ReferencesAssignment_2_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5085:1: ( ( rule__LinkNavigation__ReferencesAssignment_2_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5085:1: ( ( rule__LinkNavigation__ReferencesAssignment_2_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5086:1: ( rule__LinkNavigation__ReferencesAssignment_2_1 )
            {
             before(grammarAccess.getLinkNavigationAccess().getReferencesAssignment_2_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5087:1: ( rule__LinkNavigation__ReferencesAssignment_2_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5087:2: rule__LinkNavigation__ReferencesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__LinkNavigation__ReferencesAssignment_2_1_in_rule__LinkNavigation__Group_2__110042);
            rule__LinkNavigation__ReferencesAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getLinkNavigationAccess().getReferencesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkNavigation__Group_2__1


    // $ANTLR start rule__UIModelElementCall__Group_0__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5101:1: rule__UIModelElementCall__Group_0__0 : ( 'dialogue' ) rule__UIModelElementCall__Group_0__1 ;
    public final void rule__UIModelElementCall__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5105:1: ( ( 'dialogue' ) rule__UIModelElementCall__Group_0__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5106:1: ( 'dialogue' ) rule__UIModelElementCall__Group_0__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5106:1: ( 'dialogue' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5107:1: 'dialogue'
            {
             before(grammarAccess.getUIModelElementCallAccess().getDialogueKeyword_0_0()); 
            match(input,47,FOLLOW_47_in_rule__UIModelElementCall__Group_0__010081); 
             after(grammarAccess.getUIModelElementCallAccess().getDialogueKeyword_0_0()); 

            }

            pushFollow(FOLLOW_rule__UIModelElementCall__Group_0__1_in_rule__UIModelElementCall__Group_0__010091);
            rule__UIModelElementCall__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UIModelElementCall__Group_0__0


    // $ANTLR start rule__UIModelElementCall__Group_0__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5121:1: rule__UIModelElementCall__Group_0__1 : ( ruleDialogueCall ) ;
    public final void rule__UIModelElementCall__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5125:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5126:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5126:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5127:1: ruleDialogueCall
            {
             before(grammarAccess.getUIModelElementCallAccess().getDialogueCallParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__UIModelElementCall__Group_0__110119);
            ruleDialogueCall();
            _fsp--;

             after(grammarAccess.getUIModelElementCallAccess().getDialogueCallParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UIModelElementCall__Group_0__1


    // $ANTLR start rule__UIModelElementCall__Group_1__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5142:1: rule__UIModelElementCall__Group_1__0 : ( 'process' ) rule__UIModelElementCall__Group_1__1 ;
    public final void rule__UIModelElementCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5146:1: ( ( 'process' ) rule__UIModelElementCall__Group_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5147:1: ( 'process' ) rule__UIModelElementCall__Group_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5147:1: ( 'process' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5148:1: 'process'
            {
             before(grammarAccess.getUIModelElementCallAccess().getProcessKeyword_1_0()); 
            match(input,48,FOLLOW_48_in_rule__UIModelElementCall__Group_1__010157); 
             after(grammarAccess.getUIModelElementCallAccess().getProcessKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__UIModelElementCall__Group_1__1_in_rule__UIModelElementCall__Group_1__010167);
            rule__UIModelElementCall__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UIModelElementCall__Group_1__0


    // $ANTLR start rule__UIModelElementCall__Group_1__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5162:1: rule__UIModelElementCall__Group_1__1 : ( ruleProcessCall ) ;
    public final void rule__UIModelElementCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5166:1: ( ( ruleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5167:1: ( ruleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5167:1: ( ruleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5168:1: ruleProcessCall
            {
             before(grammarAccess.getUIModelElementCallAccess().getProcessCallParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleProcessCall_in_rule__UIModelElementCall__Group_1__110195);
            ruleProcessCall();
            _fsp--;

             after(grammarAccess.getUIModelElementCallAccess().getProcessCallParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UIModelElementCall__Group_1__1


    // $ANTLR start rule__PresentationModel__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5183:1: rule__PresentationModel__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__PresentationModel__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5187:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5188:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5188:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5189:1: RULE_STRING
            {
             before(grammarAccess.getPresentationModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PresentationModel__DescriptionAssignment_010232); 
             after(grammarAccess.getPresentationModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PresentationModel__DescriptionAssignment_0


    // $ANTLR start rule__PresentationModel__NameAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5198:1: rule__PresentationModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PresentationModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5202:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5203:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5203:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5204:1: RULE_ID
            {
             before(grammarAccess.getPresentationModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PresentationModel__NameAssignment_210263); 
             after(grammarAccess.getPresentationModelAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PresentationModel__NameAssignment_2


    // $ANTLR start rule__PresentationModel__ExternalReferencesAssignment_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5213:1: rule__PresentationModel__ExternalReferencesAssignment_4 : ( ruleExternalReference ) ;
    public final void rule__PresentationModel__ExternalReferencesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5217:1: ( ( ruleExternalReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5218:1: ( ruleExternalReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5218:1: ( ruleExternalReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5219:1: ruleExternalReference
            {
             before(grammarAccess.getPresentationModelAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExternalReference_in_rule__PresentationModel__ExternalReferencesAssignment_410294);
            ruleExternalReference();
            _fsp--;

             after(grammarAccess.getPresentationModelAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PresentationModel__ExternalReferencesAssignment_4


    // $ANTLR start rule__PresentationModel__ElementsAssignment_5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5228:1: rule__PresentationModel__ElementsAssignment_5 : ( ruleModelElementWithContext ) ;
    public final void rule__PresentationModel__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5232:1: ( ( ruleModelElementWithContext ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5233:1: ( ruleModelElementWithContext )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5233:1: ( ruleModelElementWithContext )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5234:1: ruleModelElementWithContext
            {
             before(grammarAccess.getPresentationModelAccess().getElementsModelElementWithContextParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleModelElementWithContext_in_rule__PresentationModel__ElementsAssignment_510325);
            ruleModelElementWithContext();
            _fsp--;

             after(grammarAccess.getPresentationModelAccess().getElementsModelElementWithContextParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PresentationModel__ElementsAssignment_5


    // $ANTLR start rule__ExternalReference__ModelNameAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5243:1: rule__ExternalReference__ModelNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExternalReference__ModelNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5247:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5248:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5248:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5249:1: RULE_ID
            {
             before(grammarAccess.getExternalReferenceAccess().getModelNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalReference__ModelNameAssignment_110356); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5258:1: rule__ExternalReference__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ExternalReference__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5262:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5263:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5263:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5264:1: RULE_ID
            {
             before(grammarAccess.getExternalReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalReference__NameAssignment_310387); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5273:1: rule__ContentForm__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ContentForm__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5277:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5278:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5278:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5279:1: RULE_STRING
            {
             before(grammarAccess.getContentFormAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ContentForm__DescriptionAssignment_010418); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5288:1: rule__ContentForm__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ContentForm__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5292:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5293:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5293:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5294:1: RULE_ID
            {
             before(grammarAccess.getContentFormAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContentForm__NameAssignment_210449); 
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


    // $ANTLR start rule__ContentForm__IsCollectionAssignment_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5303:1: rule__ContentForm__IsCollectionAssignment_4 : ( ( 'list' ) ) ;
    public final void rule__ContentForm__IsCollectionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5307:1: ( ( ( 'list' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5308:1: ( ( 'list' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5308:1: ( ( 'list' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5309:1: ( 'list' )
            {
             before(grammarAccess.getContentFormAccess().getIsCollectionListKeyword_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5310:1: ( 'list' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5311:1: 'list'
            {
             before(grammarAccess.getContentFormAccess().getIsCollectionListKeyword_4_0()); 
            match(input,49,FOLLOW_49_in_rule__ContentForm__IsCollectionAssignment_410485); 
             after(grammarAccess.getContentFormAccess().getIsCollectionListKeyword_4_0()); 

            }

             after(grammarAccess.getContentFormAccess().getIsCollectionListKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__IsCollectionAssignment_4


    // $ANTLR start rule__ContentForm__ContextRefAssignment_5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5326:1: rule__ContentForm__ContextRefAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ContentForm__ContextRefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5330:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5331:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5331:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5332:1: ( RULE_ID )
            {
             before(grammarAccess.getContentFormAccess().getContextRefExternalReferenceCrossReference_5_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5333:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5334:1: RULE_ID
            {
             before(grammarAccess.getContentFormAccess().getContextRefExternalReferenceIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContentForm__ContextRefAssignment_510528); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5345:1: rule__ContentForm__ReadonlyAssignment_7_1_0 : ( ( 'true' ) ) ;
    public final void rule__ContentForm__ReadonlyAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5349:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5350:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5350:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5351:1: ( 'true' )
            {
             before(grammarAccess.getContentFormAccess().getReadonlyTrueKeyword_7_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5352:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5353:1: 'true'
            {
             before(grammarAccess.getContentFormAccess().getReadonlyTrueKeyword_7_1_0_0()); 
            match(input,50,FOLLOW_50_in_rule__ContentForm__ReadonlyAssignment_7_1_010568); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5368:1: rule__ContentForm__FormElementsAssignment_8 : ( ruleFormElement ) ;
    public final void rule__ContentForm__FormElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5372:1: ( ( ruleFormElement ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5373:1: ( ruleFormElement )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5373:1: ( ruleFormElement )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5374:1: ruleFormElement
            {
             before(grammarAccess.getContentFormAccess().getFormElementsFormElementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleFormElement_in_rule__ContentForm__FormElementsAssignment_810607);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5383:1: rule__ContentForm__ActionsAssignment_9_2_0 : ( ruleSimpleProcess ) ;
    public final void rule__ContentForm__ActionsAssignment_9_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5387:1: ( ( ruleSimpleProcess ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5388:1: ( ruleSimpleProcess )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5388:1: ( ruleSimpleProcess )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5389:1: ruleSimpleProcess
            {
             before(grammarAccess.getContentFormAccess().getActionsSimpleProcessParserRuleCall_9_2_0_0()); 
            pushFollow(FOLLOW_ruleSimpleProcess_in_rule__ContentForm__ActionsAssignment_9_2_010638);
            ruleSimpleProcess();
            _fsp--;

             after(grammarAccess.getContentFormAccess().getActionsSimpleProcessParserRuleCall_9_2_0_0()); 

            }


            }

        }
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5398:1: rule__ContentForm__ProcessesAssignment_10_2_0 : ( ruleProcessCall ) ;
    public final void rule__ContentForm__ProcessesAssignment_10_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5402:1: ( ( ruleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5403:1: ( ruleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5403:1: ( ruleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5404:1: ruleProcessCall
            {
             before(grammarAccess.getContentFormAccess().getProcessesProcessCallParserRuleCall_10_2_0_0()); 
            pushFollow(FOLLOW_ruleProcessCall_in_rule__ContentForm__ProcessesAssignment_10_2_010669);
            ruleProcessCall();
            _fsp--;

             after(grammarAccess.getContentFormAccess().getProcessesProcessCallParserRuleCall_10_2_0_0()); 

            }


            }

        }
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


    // $ANTLR start rule__SimpleProcess__NameAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5413:1: rule__SimpleProcess__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleProcess__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5417:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5418:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5418:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5419:1: RULE_ID
            {
             before(grammarAccess.getSimpleProcessAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleProcess__NameAssignment_010700); 
             after(grammarAccess.getSimpleProcessAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleProcess__NameAssignment_0


    // $ANTLR start rule__SimpleProcess__TypeAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5428:1: rule__SimpleProcess__TypeAssignment_1 : ( ruleProcessType ) ;
    public final void rule__SimpleProcess__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5432:1: ( ( ruleProcessType ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5433:1: ( ruleProcessType )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5433:1: ( ruleProcessType )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5434:1: ruleProcessType
            {
             before(grammarAccess.getSimpleProcessAccess().getTypeProcessTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProcessType_in_rule__SimpleProcess__TypeAssignment_110731);
            ruleProcessType();
            _fsp--;

             after(grammarAccess.getSimpleProcessAccess().getTypeProcessTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleProcess__TypeAssignment_1


    // $ANTLR start rule__SimpleProcess__DialogueAssignment_2_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5443:1: rule__SimpleProcess__DialogueAssignment_2_1 : ( ruleDialogueCall ) ;
    public final void rule__SimpleProcess__DialogueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5447:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5448:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5448:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5449:1: ruleDialogueCall
            {
             before(grammarAccess.getSimpleProcessAccess().getDialogueDialogueCallParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__SimpleProcess__DialogueAssignment_2_110762);
            ruleDialogueCall();
            _fsp--;

             after(grammarAccess.getSimpleProcessAccess().getDialogueDialogueCallParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleProcess__DialogueAssignment_2_1


    // $ANTLR start rule__CompoundDialogue__DescriptionAssignment_0_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5458:1: rule__CompoundDialogue__DescriptionAssignment_0_0 : ( RULE_STRING ) ;
    public final void rule__CompoundDialogue__DescriptionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5462:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5463:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5463:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5464:1: RULE_STRING
            {
             before(grammarAccess.getCompoundDialogueAccess().getDescriptionSTRINGTerminalRuleCall_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CompoundDialogue__DescriptionAssignment_0_010793); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5473:1: rule__CompoundDialogue__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__CompoundDialogue__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5477:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5478:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5478:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5479:1: RULE_ID
            {
             before(grammarAccess.getCompoundDialogueAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CompoundDialogue__NameAssignment_0_210824); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5488:1: rule__CompoundDialogue__ContextRefAssignment_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__CompoundDialogue__ContextRefAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5492:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5493:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5493:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5494:1: ( RULE_ID )
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextRefExternalReferenceCrossReference_0_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5495:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5496:1: RULE_ID
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextRefExternalReferenceIDTerminalRuleCall_0_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CompoundDialogue__ContextRefAssignment_0_410859); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5507:1: rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 : ( ( 'true' ) ) ;
    public final void rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5511:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5512:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5512:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5513:1: ( 'true' )
            {
             before(grammarAccess.getCompoundDialogueAccess().getReadonlyTrueKeyword_0_5_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5514:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5515:1: 'true'
            {
             before(grammarAccess.getCompoundDialogueAccess().getReadonlyTrueKeyword_0_5_1_0_0()); 
            match(input,50,FOLLOW_50_in_rule__CompoundDialogue__ReadonlyAssignment_0_5_1_010899); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5530:1: rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 : ( ruleDialogueCall ) ;
    public final void rule__CompoundDialogue__DialoguesAssignment_0_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5534:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5535:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5535:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5536:1: ruleDialogueCall
            {
             before(grammarAccess.getCompoundDialogueAccess().getDialoguesDialogueCallParserRuleCall_0_6_2_0_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__CompoundDialogue__DialoguesAssignment_0_6_2_010938);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5545:1: rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 : ( ruleProcessCall ) ;
    public final void rule__CompoundDialogue__ProcessesAssignment_0_7_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5549:1: ( ( ruleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5550:1: ( ruleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5550:1: ( ruleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5551:1: ruleProcessCall
            {
             before(grammarAccess.getCompoundDialogueAccess().getProcessesProcessCallParserRuleCall_0_7_2_0_0()); 
            pushFollow(FOLLOW_ruleProcessCall_in_rule__CompoundDialogue__ProcessesAssignment_0_7_2_010969);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5560:1: rule__CollectionDialogue__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__CollectionDialogue__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5564:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5565:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5565:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5566:1: RULE_STRING
            {
             before(grammarAccess.getCollectionDialogueAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CollectionDialogue__DescriptionAssignment_011000); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5575:1: rule__CollectionDialogue__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CollectionDialogue__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5579:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5580:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5580:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5581:1: RULE_ID
            {
             before(grammarAccess.getCollectionDialogueAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CollectionDialogue__NameAssignment_211031); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5590:1: rule__CollectionDialogue__ContextRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__CollectionDialogue__ContextRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5594:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5595:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5595:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5596:1: ( RULE_ID )
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextRefExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5597:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5598:1: RULE_ID
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CollectionDialogue__ContextRefAssignment_411066); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5609:1: rule__CollectionDialogue__ReadonlyAssignment_6_1_0 : ( ( 'true' ) ) ;
    public final void rule__CollectionDialogue__ReadonlyAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5613:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5614:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5614:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5615:1: ( 'true' )
            {
             before(grammarAccess.getCollectionDialogueAccess().getReadonlyTrueKeyword_6_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5616:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5617:1: 'true'
            {
             before(grammarAccess.getCollectionDialogueAccess().getReadonlyTrueKeyword_6_1_0_0()); 
            match(input,50,FOLLOW_50_in_rule__CollectionDialogue__ReadonlyAssignment_6_1_011106); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5632:1: rule__CollectionDialogue__DialoguesAssignment_7_2_0 : ( ruleDialogueCall ) ;
    public final void rule__CollectionDialogue__DialoguesAssignment_7_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5636:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5637:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5637:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5638:1: ruleDialogueCall
            {
             before(grammarAccess.getCollectionDialogueAccess().getDialoguesDialogueCallParserRuleCall_7_2_0_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__CollectionDialogue__DialoguesAssignment_7_2_011145);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5647:1: rule__CollectionDialogue__ProcessesAssignment_8_2_0 : ( ruleProcessCall ) ;
    public final void rule__CollectionDialogue__ProcessesAssignment_8_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5651:1: ( ( ruleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5652:1: ( ruleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5652:1: ( ruleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5653:1: ruleProcessCall
            {
             before(grammarAccess.getCollectionDialogueAccess().getProcessesProcessCallParserRuleCall_8_2_0_0()); 
            pushFollow(FOLLOW_ruleProcessCall_in_rule__CollectionDialogue__ProcessesAssignment_8_2_011176);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5662:1: rule__MasterDetail__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MasterDetail__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5666:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5667:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5667:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5668:1: RULE_STRING
            {
             before(grammarAccess.getMasterDetailAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MasterDetail__DescriptionAssignment_011207); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5677:1: rule__MasterDetail__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MasterDetail__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5681:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5682:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5682:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5683:1: RULE_ID
            {
             before(grammarAccess.getMasterDetailAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MasterDetail__NameAssignment_211238); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5692:1: rule__MasterDetail__ContextRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__MasterDetail__ContextRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5696:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5697:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5697:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5698:1: ( RULE_ID )
            {
             before(grammarAccess.getMasterDetailAccess().getContextRefExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5699:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5700:1: RULE_ID
            {
             before(grammarAccess.getMasterDetailAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MasterDetail__ContextRefAssignment_411273); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5711:1: rule__MasterDetail__ReadonlyAssignment_5_1_0 : ( ( 'true' ) ) ;
    public final void rule__MasterDetail__ReadonlyAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5715:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5716:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5716:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5717:1: ( 'true' )
            {
             before(grammarAccess.getMasterDetailAccess().getReadonlyTrueKeyword_5_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5718:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5719:1: 'true'
            {
             before(grammarAccess.getMasterDetailAccess().getReadonlyTrueKeyword_5_1_0_0()); 
            match(input,50,FOLLOW_50_in_rule__MasterDetail__ReadonlyAssignment_5_1_011313); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5734:1: rule__MasterDetail__MasterAssignment_7 : ( ruleDialogueCall ) ;
    public final void rule__MasterDetail__MasterAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5738:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5739:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5739:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5740:1: ruleDialogueCall
            {
             before(grammarAccess.getMasterDetailAccess().getMasterDialogueCallParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__MasterDetail__MasterAssignment_711352);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5749:1: rule__MasterDetail__DetailAssignment_10 : ( ruleDialogueCall ) ;
    public final void rule__MasterDetail__DetailAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5753:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5754:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5754:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5755:1: ruleDialogueCall
            {
             before(grammarAccess.getMasterDetailAccess().getDetailDialogueCallParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__MasterDetail__DetailAssignment_1011383);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5764:1: rule__MasterDetail__ProcessesAssignment_12_2_0 : ( ruleProcessCall ) ;
    public final void rule__MasterDetail__ProcessesAssignment_12_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5768:1: ( ( ruleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5769:1: ( ruleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5769:1: ( ruleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5770:1: ruleProcessCall
            {
             before(grammarAccess.getMasterDetailAccess().getProcessesProcessCallParserRuleCall_12_2_0_0()); 
            pushFollow(FOLLOW_ruleProcessCall_in_rule__MasterDetail__ProcessesAssignment_12_2_011414);
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


    // $ANTLR start rule__AutomatedProcess__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5779:1: rule__AutomatedProcess__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__AutomatedProcess__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5783:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5784:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5784:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5785:1: RULE_STRING
            {
             before(grammarAccess.getAutomatedProcessAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AutomatedProcess__DescriptionAssignment_011445); 
             after(grammarAccess.getAutomatedProcessAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AutomatedProcess__DescriptionAssignment_0


    // $ANTLR start rule__AutomatedProcess__NameAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5794:1: rule__AutomatedProcess__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__AutomatedProcess__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5798:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5799:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5799:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5800:1: RULE_ID
            {
             before(grammarAccess.getAutomatedProcessAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AutomatedProcess__NameAssignment_211476); 
             after(grammarAccess.getAutomatedProcessAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AutomatedProcess__NameAssignment_2


    // $ANTLR start rule__AutomatedProcess__ContextRefAssignment_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5809:1: rule__AutomatedProcess__ContextRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__AutomatedProcess__ContextRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5813:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5814:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5814:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5815:1: ( RULE_ID )
            {
             before(grammarAccess.getAutomatedProcessAccess().getContextRefExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5816:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5817:1: RULE_ID
            {
             before(grammarAccess.getAutomatedProcessAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AutomatedProcess__ContextRefAssignment_411511); 
             after(grammarAccess.getAutomatedProcessAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAutomatedProcessAccess().getContextRefExternalReferenceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AutomatedProcess__ContextRefAssignment_4


    // $ANTLR start rule__AutomatedProcess__TypeAssignment_5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5828:1: rule__AutomatedProcess__TypeAssignment_5 : ( ruleProcessType ) ;
    public final void rule__AutomatedProcess__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5832:1: ( ( ruleProcessType ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5833:1: ( ruleProcessType )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5833:1: ( ruleProcessType )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5834:1: ruleProcessType
            {
             before(grammarAccess.getAutomatedProcessAccess().getTypeProcessTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleProcessType_in_rule__AutomatedProcess__TypeAssignment_511546);
            ruleProcessType();
            _fsp--;

             after(grammarAccess.getAutomatedProcessAccess().getTypeProcessTypeEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AutomatedProcess__TypeAssignment_5


    // $ANTLR start rule__AutomatedProcess__ProcessElementsAssignment_6_2_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5843:1: rule__AutomatedProcess__ProcessElementsAssignment_6_2_0 : ( ruleUICall ) ;
    public final void rule__AutomatedProcess__ProcessElementsAssignment_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5847:1: ( ( ruleUICall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5848:1: ( ruleUICall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5848:1: ( ruleUICall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5849:1: ruleUICall
            {
             before(grammarAccess.getAutomatedProcessAccess().getProcessElementsUICallParserRuleCall_6_2_0_0()); 
            pushFollow(FOLLOW_ruleUICall_in_rule__AutomatedProcess__ProcessElementsAssignment_6_2_011577);
            ruleUICall();
            _fsp--;

             after(grammarAccess.getAutomatedProcessAccess().getProcessElementsUICallParserRuleCall_6_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AutomatedProcess__ProcessElementsAssignment_6_2_0


    // $ANTLR start rule__InteractiveProcess__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5858:1: rule__InteractiveProcess__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__InteractiveProcess__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5862:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5863:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5863:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5864:1: RULE_STRING
            {
             before(grammarAccess.getInteractiveProcessAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InteractiveProcess__DescriptionAssignment_011608); 
             after(grammarAccess.getInteractiveProcessAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InteractiveProcess__DescriptionAssignment_0


    // $ANTLR start rule__InteractiveProcess__NameAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5873:1: rule__InteractiveProcess__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__InteractiveProcess__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5877:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5878:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5878:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5879:1: RULE_ID
            {
             before(grammarAccess.getInteractiveProcessAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InteractiveProcess__NameAssignment_211639); 
             after(grammarAccess.getInteractiveProcessAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InteractiveProcess__NameAssignment_2


    // $ANTLR start rule__InteractiveProcess__ContextRefAssignment_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5888:1: rule__InteractiveProcess__ContextRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__InteractiveProcess__ContextRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5892:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5893:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5893:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5894:1: ( RULE_ID )
            {
             before(grammarAccess.getInteractiveProcessAccess().getContextRefExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5895:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5896:1: RULE_ID
            {
             before(grammarAccess.getInteractiveProcessAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InteractiveProcess__ContextRefAssignment_411674); 
             after(grammarAccess.getInteractiveProcessAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getInteractiveProcessAccess().getContextRefExternalReferenceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InteractiveProcess__ContextRefAssignment_4


    // $ANTLR start rule__InteractiveProcess__TypeAssignment_5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5907:1: rule__InteractiveProcess__TypeAssignment_5 : ( ruleProcessType ) ;
    public final void rule__InteractiveProcess__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5911:1: ( ( ruleProcessType ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5912:1: ( ruleProcessType )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5912:1: ( ruleProcessType )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5913:1: ruleProcessType
            {
             before(grammarAccess.getInteractiveProcessAccess().getTypeProcessTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleProcessType_in_rule__InteractiveProcess__TypeAssignment_511709);
            ruleProcessType();
            _fsp--;

             after(grammarAccess.getInteractiveProcessAccess().getTypeProcessTypeEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InteractiveProcess__TypeAssignment_5


    // $ANTLR start rule__InteractiveProcess__ProcessElementsAssignment_6_2_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5922:1: rule__InteractiveProcess__ProcessElementsAssignment_6_2_0 : ( ruleUICall ) ;
    public final void rule__InteractiveProcess__ProcessElementsAssignment_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5926:1: ( ( ruleUICall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5927:1: ( ruleUICall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5927:1: ( ruleUICall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5928:1: ruleUICall
            {
             before(grammarAccess.getInteractiveProcessAccess().getProcessElementsUICallParserRuleCall_6_2_0_0()); 
            pushFollow(FOLLOW_ruleUICall_in_rule__InteractiveProcess__ProcessElementsAssignment_6_2_011740);
            ruleUICall();
            _fsp--;

             after(grammarAccess.getInteractiveProcessAccess().getProcessElementsUICallParserRuleCall_6_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InteractiveProcess__ProcessElementsAssignment_6_2_0


    // $ANTLR start rule__FormElement__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5937:1: rule__FormElement__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__FormElement__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5941:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5942:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5942:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5943:1: RULE_STRING
            {
             before(grammarAccess.getFormElementAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FormElement__DescriptionAssignment_011771); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5952:1: rule__FormElement__ReferencesAssignment_2 : ( ruleDtoPropertyReference ) ;
    public final void rule__FormElement__ReferencesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5956:1: ( ( ruleDtoPropertyReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5957:1: ( ruleDtoPropertyReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5957:1: ( ruleDtoPropertyReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5958:1: ruleDtoPropertyReference
            {
             before(grammarAccess.getFormElementAccess().getReferencesDtoPropertyReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_rule__FormElement__ReferencesAssignment_211802);
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


    // $ANTLR start rule__FormElement__LabelAssignment_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5967:1: rule__FormElement__LabelAssignment_4 : ( RULE_ID ) ;
    public final void rule__FormElement__LabelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5971:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5972:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5972:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5973:1: RULE_ID
            {
             before(grammarAccess.getFormElementAccess().getLabelIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FormElement__LabelAssignment_411833); 
             after(grammarAccess.getFormElementAccess().getLabelIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__LabelAssignment_4


    // $ANTLR start rule__FormElement__ReadonlyAssignment_5_1_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5982:1: rule__FormElement__ReadonlyAssignment_5_1_0 : ( ( 'true' ) ) ;
    public final void rule__FormElement__ReadonlyAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5986:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5987:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5987:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5988:1: ( 'true' )
            {
             before(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_5_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5989:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5990:1: 'true'
            {
             before(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_5_1_0_0()); 
            match(input,50,FOLLOW_50_in_rule__FormElement__ReadonlyAssignment_5_1_011869); 
             after(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_5_1_0_0()); 

            }

             after(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_5_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__ReadonlyAssignment_5_1_0


    // $ANTLR start rule__DialogueCall__AliasAssignment_1_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6005:1: rule__DialogueCall__AliasAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__DialogueCall__AliasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6009:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6010:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6010:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6011:1: RULE_ID
            {
             before(grammarAccess.getDialogueCallAccess().getAliasIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DialogueCall__AliasAssignment_1_111908); 
             after(grammarAccess.getDialogueCallAccess().getAliasIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DialogueCall__AliasAssignment_1_1


    // $ANTLR start rule__LinkedDialogueCall__LinkAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6020:1: rule__LinkedDialogueCall__LinkAssignment_0 : ( ruleLink ) ;
    public final void rule__LinkedDialogueCall__LinkAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6024:1: ( ( ruleLink ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6025:1: ( ruleLink )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6025:1: ( ruleLink )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6026:1: ruleLink
            {
             before(grammarAccess.getLinkedDialogueCallAccess().getLinkLinkParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLink_in_rule__LinkedDialogueCall__LinkAssignment_011939);
            ruleLink();
            _fsp--;

             after(grammarAccess.getLinkedDialogueCallAccess().getLinkLinkParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkedDialogueCall__LinkAssignment_0


    // $ANTLR start rule__LinkedDialogueCall__NameAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6035:1: rule__LinkedDialogueCall__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LinkedDialogueCall__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6039:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6040:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6040:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6041:1: RULE_ID
            {
             before(grammarAccess.getLinkedDialogueCallAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LinkedDialogueCall__NameAssignment_211970); 
             after(grammarAccess.getLinkedDialogueCallAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkedDialogueCall__NameAssignment_2


    // $ANTLR start rule__DirectDialogueCall__NameAssignment
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6050:1: rule__DirectDialogueCall__NameAssignment : ( RULE_ID ) ;
    public final void rule__DirectDialogueCall__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6054:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6055:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6055:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6056:1: RULE_ID
            {
             before(grammarAccess.getDirectDialogueCallAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DirectDialogueCall__NameAssignment12001); 
             after(grammarAccess.getDirectDialogueCallAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DirectDialogueCall__NameAssignment


    // $ANTLR start rule__ProcessCall__AliasAssignment_1_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6065:1: rule__ProcessCall__AliasAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__ProcessCall__AliasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6069:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6070:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6070:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6071:1: RULE_ID
            {
             before(grammarAccess.getProcessCallAccess().getAliasIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProcessCall__AliasAssignment_1_112032); 
             after(grammarAccess.getProcessCallAccess().getAliasIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__AliasAssignment_1_1


    // $ANTLR start rule__LinkedProcessCall__LinkAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6080:1: rule__LinkedProcessCall__LinkAssignment_0 : ( ruleLinkRef ) ;
    public final void rule__LinkedProcessCall__LinkAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6084:1: ( ( ruleLinkRef ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6085:1: ( ruleLinkRef )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6085:1: ( ruleLinkRef )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6086:1: ruleLinkRef
            {
             before(grammarAccess.getLinkedProcessCallAccess().getLinkLinkRefParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLinkRef_in_rule__LinkedProcessCall__LinkAssignment_012063);
            ruleLinkRef();
            _fsp--;

             after(grammarAccess.getLinkedProcessCallAccess().getLinkLinkRefParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkedProcessCall__LinkAssignment_0


    // $ANTLR start rule__LinkedProcessCall__NameAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6095:1: rule__LinkedProcessCall__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LinkedProcessCall__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6099:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6100:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6100:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6101:1: RULE_ID
            {
             before(grammarAccess.getLinkedProcessCallAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LinkedProcessCall__NameAssignment_212094); 
             after(grammarAccess.getLinkedProcessCallAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkedProcessCall__NameAssignment_2


    // $ANTLR start rule__DirectProcessCall__NameAssignment
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6110:1: rule__DirectProcessCall__NameAssignment : ( RULE_ID ) ;
    public final void rule__DirectProcessCall__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6114:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6115:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6115:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6116:1: RULE_ID
            {
             before(grammarAccess.getDirectProcessCallAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DirectProcessCall__NameAssignment12125); 
             after(grammarAccess.getDirectProcessCallAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DirectProcessCall__NameAssignment


    // $ANTLR start rule__LinkRef__NameAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6125:1: rule__LinkRef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LinkRef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6129:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6130:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6130:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6131:1: RULE_ID
            {
             before(grammarAccess.getLinkRefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LinkRef__NameAssignment_112156); 
             after(grammarAccess.getLinkRefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkRef__NameAssignment_1


    // $ANTLR start rule__LinkService__ServiceNameAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6140:1: rule__LinkService__ServiceNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LinkService__ServiceNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6144:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6145:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6145:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6146:1: RULE_ID
            {
             before(grammarAccess.getLinkServiceAccess().getServiceNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LinkService__ServiceNameAssignment_112187); 
             after(grammarAccess.getLinkServiceAccess().getServiceNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkService__ServiceNameAssignment_1


    // $ANTLR start rule__LinkService__ServiceMethodAssignment_3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6155:1: rule__LinkService__ServiceMethodAssignment_3 : ( RULE_ID ) ;
    public final void rule__LinkService__ServiceMethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6159:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6160:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6160:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6161:1: RULE_ID
            {
             before(grammarAccess.getLinkServiceAccess().getServiceMethodIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LinkService__ServiceMethodAssignment_312218); 
             after(grammarAccess.getLinkServiceAccess().getServiceMethodIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkService__ServiceMethodAssignment_3


    // $ANTLR start rule__LinkStep__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6170:1: rule__LinkStep__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__LinkStep__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6174:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6175:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6175:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6176:1: RULE_STRING
            {
             before(grammarAccess.getLinkStepAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LinkStep__DescriptionAssignment_012249); 
             after(grammarAccess.getLinkStepAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkStep__DescriptionAssignment_0


    // $ANTLR start rule__LinkStep__NameAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6185:1: rule__LinkStep__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LinkStep__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6189:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6190:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6190:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6191:1: RULE_ID
            {
             before(grammarAccess.getLinkStepAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LinkStep__NameAssignment_212280); 
             after(grammarAccess.getLinkStepAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkStep__NameAssignment_2


    // $ANTLR start rule__LinkStep__ContextRefAssignment_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6200:1: rule__LinkStep__ContextRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__LinkStep__ContextRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6204:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6205:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6205:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6206:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkStepAccess().getContextRefExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6207:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6208:1: RULE_ID
            {
             before(grammarAccess.getLinkStepAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LinkStep__ContextRefAssignment_412315); 
             after(grammarAccess.getLinkStepAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getLinkStepAccess().getContextRefExternalReferenceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkStep__ContextRefAssignment_4


    // $ANTLR start rule__LinkStep__ReferenceAssignment_6
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6219:1: rule__LinkStep__ReferenceAssignment_6 : ( ruleAssociationRoleReference ) ;
    public final void rule__LinkStep__ReferenceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6223:1: ( ( ruleAssociationRoleReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6224:1: ( ruleAssociationRoleReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6224:1: ( ruleAssociationRoleReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6225:1: ruleAssociationRoleReference
            {
             before(grammarAccess.getLinkStepAccess().getReferenceAssociationRoleReferenceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_rule__LinkStep__ReferenceAssignment_612350);
            ruleAssociationRoleReference();
            _fsp--;

             after(grammarAccess.getLinkStepAccess().getReferenceAssociationRoleReferenceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkStep__ReferenceAssignment_6


    // $ANTLR start rule__LinkPath__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6234:1: rule__LinkPath__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__LinkPath__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6238:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6239:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6239:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6240:1: RULE_STRING
            {
             before(grammarAccess.getLinkPathAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LinkPath__DescriptionAssignment_012381); 
             after(grammarAccess.getLinkPathAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkPath__DescriptionAssignment_0


    // $ANTLR start rule__LinkPath__NameAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6249:1: rule__LinkPath__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LinkPath__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6253:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6254:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6254:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6255:1: RULE_ID
            {
             before(grammarAccess.getLinkPathAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LinkPath__NameAssignment_212412); 
             after(grammarAccess.getLinkPathAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkPath__NameAssignment_2


    // $ANTLR start rule__LinkPath__ContextRefAssignment_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6264:1: rule__LinkPath__ContextRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__LinkPath__ContextRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6268:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6269:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6269:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6270:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkPathAccess().getContextRefExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6271:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6272:1: RULE_ID
            {
             before(grammarAccess.getLinkPathAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LinkPath__ContextRefAssignment_412447); 
             after(grammarAccess.getLinkPathAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getLinkPathAccess().getContextRefExternalReferenceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkPath__ContextRefAssignment_4


    // $ANTLR start rule__LinkNavigation__ReferencesAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6283:1: rule__LinkNavigation__ReferencesAssignment_1 : ( ruleAssociationRoleReference ) ;
    public final void rule__LinkNavigation__ReferencesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6287:1: ( ( ruleAssociationRoleReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6288:1: ( ruleAssociationRoleReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6288:1: ( ruleAssociationRoleReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6289:1: ruleAssociationRoleReference
            {
             before(grammarAccess.getLinkNavigationAccess().getReferencesAssociationRoleReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_rule__LinkNavigation__ReferencesAssignment_112482);
            ruleAssociationRoleReference();
            _fsp--;

             after(grammarAccess.getLinkNavigationAccess().getReferencesAssociationRoleReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkNavigation__ReferencesAssignment_1


    // $ANTLR start rule__LinkNavigation__ReferencesAssignment_2_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6298:1: rule__LinkNavigation__ReferencesAssignment_2_1 : ( ruleAssociationRoleReference ) ;
    public final void rule__LinkNavigation__ReferencesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6302:1: ( ( ruleAssociationRoleReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6303:1: ( ruleAssociationRoleReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6303:1: ( ruleAssociationRoleReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6304:1: ruleAssociationRoleReference
            {
             before(grammarAccess.getLinkNavigationAccess().getReferencesAssociationRoleReferenceParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_rule__LinkNavigation__ReferencesAssignment_2_112513);
            ruleAssociationRoleReference();
            _fsp--;

             after(grammarAccess.getLinkNavigationAccess().getReferencesAssociationRoleReferenceParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LinkNavigation__ReferencesAssignment_2_1


    // $ANTLR start rule__DtoPropertyReference__NameAssignment
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6313:1: rule__DtoPropertyReference__NameAssignment : ( RULE_ID ) ;
    public final void rule__DtoPropertyReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6317:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6318:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6318:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6319:1: RULE_ID
            {
             before(grammarAccess.getDtoPropertyReferenceAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoPropertyReference__NameAssignment12544); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6328:1: rule__AssociationRoleReference__NameAssignment : ( RULE_ID ) ;
    public final void rule__AssociationRoleReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6332:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6333:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6333:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6334:1: RULE_ID
            {
             before(grammarAccess.getAssociationRoleReferenceAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssociationRoleReference__NameAssignment12575); 
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
    public static final BitSet FOLLOW_rule__PresentationModel__Group__0_in_rulePresentationModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_entryRuleExternalReference120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalReference127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__0_in_ruleExternalReference154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_entryRuleModelElementWithContext180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElementWithContext187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelElementWithContext__Alternatives_in_ruleModelElementWithContext214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIModelElement247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIModelElement__Alternatives_in_ruleUIModelElement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogue_in_entryRuleDialogue300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialogue307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dialogue__Alternatives_in_ruleDialogue334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentForm_in_entryRuleContentForm360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentForm367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__0_in_ruleContentForm394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProcess_in_entryRuleSimpleProcess420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleProcess427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProcess__Group__0_in_ruleSimpleProcess454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundDialogue_in_entryRuleCompoundDialogue480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundDialogue487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Alternatives_in_ruleCompoundDialogue514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionDialogue_in_entryRuleCollectionDialogue540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionDialogue547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__0_in_ruleCollectionDialogue574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterDetail_in_entryRuleMasterDetail600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMasterDetail607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__0_in_ruleMasterDetail634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Alternatives_in_ruleProcess694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutomatedProcess_in_entryRuleAutomatedProcess720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAutomatedProcess727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AutomatedProcess__Group__0_in_ruleAutomatedProcess754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiveProcess_in_entryRuleInteractiveProcess780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractiveProcess787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InteractiveProcess__Group__0_in_ruleInteractiveProcess814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_entryRuleFormElement840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormElement847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group__0_in_ruleFormElement874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_entryRuleDialogueCall900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialogueCall907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__0_in_ruleDialogueCall934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedDialogueCall_in_entryRuleLinkedDialogueCall960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkedDialogueCall967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkedDialogueCall__Group__0_in_ruleLinkedDialogueCall994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectDialogueCall_in_entryRuleDirectDialogueCall1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectDialogueCall1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectDialogueCall__NameAssignment_in_ruleDirectDialogueCall1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_entryRuleProcessCall1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessCall1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__0_in_ruleProcessCall1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedProcessCall_in_entryRuleLinkedProcessCall1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkedProcessCall1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkedProcessCall__Group__0_in_ruleLinkedProcessCall1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectProcessCall_in_entryRuleDirectProcessCall1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectProcessCall1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectProcessCall__NameAssignment_in_ruleDirectProcessCall1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkRef_in_entryRuleLinkRef1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkRef1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkRef__Group__0_in_ruleLinkRef1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Alternatives_in_ruleLink1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkService_in_entryRuleLinkService1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkService1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkService__Group__0_in_ruleLinkService1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkStep_in_entryRuleLinkStep1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkStep1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkStep__Group__0_in_ruleLinkStep1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkPath_in_entryRuleLinkPath1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkPath1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkPath__Group__0_in_ruleLinkPath1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkNavigation_in_entryRuleLinkNavigation1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkNavigation1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkNavigation__Group__0_in_ruleLinkNavigation1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference1620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoPropertyReference1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoPropertyReference__NameAssignment_in_ruleDtoPropertyReference1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference1680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociationRoleReference1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationRoleReference__NameAssignment_in_ruleAssociationRoleReference1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUICall_in_entryRuleUICall1740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUICall1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElementCall_in_ruleUICall1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElementCall_in_entryRuleUIModelElementCall1799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIModelElementCall1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIModelElementCall__Alternatives_in_ruleUIModelElementCall1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessType__Alternatives_in_ruleProcessType1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_rule__ModelElementWithContext__Alternatives1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__ModelElementWithContext__Alternatives1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogue_in_rule__UIModelElement__Alternatives1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_rule__UIModelElement__Alternatives1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentForm_in_rule__Dialogue__Alternatives2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundDialogue_in_rule__Dialogue__Alternatives2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__ReadonlyAssignment_7_1_0_in_rule__ContentForm__Alternatives_7_12052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ContentForm__Alternatives_7_12071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__0_in_rule__CompoundDialogue__Alternatives2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionDialogue_in_rule__CompoundDialogue__Alternatives2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterDetail_in_rule__CompoundDialogue__Alternatives2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0_in_rule__CompoundDialogue__Alternatives_0_5_12172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CompoundDialogue__Alternatives_0_5_12191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__ReadonlyAssignment_6_1_0_in_rule__CollectionDialogue__Alternatives_6_12225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CollectionDialogue__Alternatives_6_12244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__ReadonlyAssignment_5_1_0_in_rule__MasterDetail__Alternatives_5_12278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__MasterDetail__Alternatives_5_12297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutomatedProcess_in_rule__Process__Alternatives2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiveProcess_in_rule__Process__Alternatives2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__ReadonlyAssignment_5_1_0_in_rule__FormElement__Alternatives_5_12380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__FormElement__Alternatives_5_12399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectDialogueCall_in_rule__DialogueCall__Alternatives_02433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedDialogueCall_in_rule__DialogueCall__Alternatives_02450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectProcessCall_in_rule__ProcessCall__Alternatives_02482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedProcessCall_in_rule__ProcessCall__Alternatives_02499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkStep_in_rule__Link__Alternatives2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkPath_in_rule__Link__Alternatives2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkService_in_rule__Link__Alternatives2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkRef_in_rule__Link__Alternatives2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkNavigation_in_rule__Link__Alternatives2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIModelElementCall__Group_0__0_in_rule__UIModelElementCall__Alternatives2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIModelElementCall__Group_1__0_in_rule__UIModelElementCall__Alternatives2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ProcessType__Alternatives2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ProcessType__Alternatives2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ProcessType__Alternatives2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ProcessType__Alternatives2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__DescriptionAssignment_0_in_rule__PresentationModel__Group__02783 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__1_in_rule__PresentationModel__Group__02793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PresentationModel__Group__12822 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__2_in_rule__PresentationModel__Group__12832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__NameAssignment_2_in_rule__PresentationModel__Group__22860 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__3_in_rule__PresentationModel__Group__22869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PresentationModel__Group__32898 = new BitSet(new long[]{0x00007614D0140012L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__4_in_rule__PresentationModel__Group__32908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__ExternalReferencesAssignment_4_in_rule__PresentationModel__Group__42936 = new BitSet(new long[]{0x00007614D0140012L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__5_in_rule__PresentationModel__Group__42946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__ElementsAssignment_5_in_rule__PresentationModel__Group__52974 = new BitSet(new long[]{0x00007614D0100012L});
    public static final BitSet FOLLOW_18_in_rule__ExternalReference__Group__03022 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__1_in_rule__ExternalReference__Group__03032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__ModelNameAssignment_1_in_rule__ExternalReference__Group__13060 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__2_in_rule__ExternalReference__Group__13069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ExternalReference__Group__23098 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__3_in_rule__ExternalReference__Group__23108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__NameAssignment_3_in_rule__ExternalReference__Group__33136 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__4_in_rule__ExternalReference__Group__33145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ExternalReference__Group__43174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__DescriptionAssignment_0_in_rule__ContentForm__Group__03219 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__1_in_rule__ContentForm__Group__03229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ContentForm__Group__13258 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__2_in_rule__ContentForm__Group__13268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__NameAssignment_2_in_rule__ContentForm__Group__23296 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__3_in_rule__ContentForm__Group__23305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ContentForm__Group__33334 = new BitSet(new long[]{0x0002000000000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__4_in_rule__ContentForm__Group__33344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__IsCollectionAssignment_4_in_rule__ContentForm__Group__43372 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__5_in_rule__ContentForm__Group__43382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__ContextRefAssignment_5_in_rule__ContentForm__Group__53410 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__6_in_rule__ContentForm__Group__53419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ContentForm__Group__63448 = new BitSet(new long[]{0x0000002007800010L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__7_in_rule__ContentForm__Group__63458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_7__0_in_rule__ContentForm__Group__73486 = new BitSet(new long[]{0x0000002006800010L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__8_in_rule__ContentForm__Group__73496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__FormElementsAssignment_8_in_rule__ContentForm__Group__83524 = new BitSet(new long[]{0x0000002006800010L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__9_in_rule__ContentForm__Group__83534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__0_in_rule__ContentForm__Group__93562 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__10_in_rule__ContentForm__Group__93572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__0_in_rule__ContentForm__Group__103600 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__11_in_rule__ContentForm__Group__103610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ContentForm__Group__113639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ContentForm__Group_7__03699 = new BitSet(new long[]{0x0004000000000800L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_7__1_in_rule__ContentForm__Group_7__03709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Alternatives_7_1_in_rule__ContentForm__Group_7__13737 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_7__2_in_rule__ContentForm__Group_7__13746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ContentForm__Group_7__23775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ContentForm__Group_9__03817 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__1_in_rule__ContentForm__Group_9__03827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ContentForm__Group_9__13856 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__2_in_rule__ContentForm__Group_9__13866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9_2__0_in_rule__ContentForm__Group_9__23894 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__3_in_rule__ContentForm__Group_9__23904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ContentForm__Group_9__33933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__ActionsAssignment_9_2_0_in_rule__ContentForm__Group_9_2__03976 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9_2__1_in_rule__ContentForm__Group_9_2__03985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ContentForm__Group_9_2__14014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ContentForm__Group_10__04054 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__1_in_rule__ContentForm__Group_10__04064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ContentForm__Group_10__14093 = new BitSet(new long[]{0x0000020000800020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__2_in_rule__ContentForm__Group_10__14103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10_2__0_in_rule__ContentForm__Group_10__24131 = new BitSet(new long[]{0x0000020000800020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__3_in_rule__ContentForm__Group_10__24141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ContentForm__Group_10__34170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__ProcessesAssignment_10_2_0_in_rule__ContentForm__Group_10_2__04213 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10_2__1_in_rule__ContentForm__Group_10_2__04222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ContentForm__Group_10_2__14251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProcess__NameAssignment_0_in_rule__SimpleProcess__Group__04290 = new BitSet(new long[]{0x000000000800F002L});
    public static final BitSet FOLLOW_rule__SimpleProcess__Group__1_in_rule__SimpleProcess__Group__04299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProcess__TypeAssignment_1_in_rule__SimpleProcess__Group__14327 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__SimpleProcess__Group__2_in_rule__SimpleProcess__Group__14337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProcess__Group_2__0_in_rule__SimpleProcess__Group__24365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SimpleProcess__Group_2__04407 = new BitSet(new long[]{0x0000760000000030L});
    public static final BitSet FOLLOW_rule__SimpleProcess__Group_2__1_in_rule__SimpleProcess__Group_2__04417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProcess__DialogueAssignment_2_1_in_rule__SimpleProcess__Group_2__14445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__DescriptionAssignment_0_0_in_rule__CompoundDialogue__Group_0__04483 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__1_in_rule__CompoundDialogue__Group_0__04493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CompoundDialogue__Group_0__14522 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__2_in_rule__CompoundDialogue__Group_0__14532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__NameAssignment_0_2_in_rule__CompoundDialogue__Group_0__24560 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__3_in_rule__CompoundDialogue__Group_0__24569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CompoundDialogue__Group_0__34598 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__4_in_rule__CompoundDialogue__Group_0__34608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__ContextRefAssignment_0_4_in_rule__CompoundDialogue__Group_0__44636 = new BitSet(new long[]{0x0000000025000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__5_in_rule__CompoundDialogue__Group_0__44645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_5__0_in_rule__CompoundDialogue__Group_0__54673 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__6_in_rule__CompoundDialogue__Group_0__54683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__0_in_rule__CompoundDialogue__Group_0__64711 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__7_in_rule__CompoundDialogue__Group_0__64721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__0_in_rule__CompoundDialogue__Group_0__74749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CompoundDialogue__Group_0_5__04801 = new BitSet(new long[]{0x0004000000000800L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_5__1_in_rule__CompoundDialogue__Group_0_5__04811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Alternatives_0_5_1_in_rule__CompoundDialogue__Group_0_5__14839 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_5__2_in_rule__CompoundDialogue__Group_0_5__14848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CompoundDialogue__Group_0_5__24877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CompoundDialogue__Group_0_6__04919 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__1_in_rule__CompoundDialogue__Group_0_6__04929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CompoundDialogue__Group_0_6__14958 = new BitSet(new long[]{0x0000760000800030L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__2_in_rule__CompoundDialogue__Group_0_6__14968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6_2__0_in_rule__CompoundDialogue__Group_0_6__24996 = new BitSet(new long[]{0x0000760000800030L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__3_in_rule__CompoundDialogue__Group_0_6__25006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CompoundDialogue__Group_0_6__35035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__DialoguesAssignment_0_6_2_0_in_rule__CompoundDialogue__Group_0_6_2__05078 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6_2__1_in_rule__CompoundDialogue__Group_0_6_2__05087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CompoundDialogue__Group_0_6_2__15116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CompoundDialogue__Group_0_7__05156 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__1_in_rule__CompoundDialogue__Group_0_7__05166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CompoundDialogue__Group_0_7__15195 = new BitSet(new long[]{0x0000020000800020L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__2_in_rule__CompoundDialogue__Group_0_7__15205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7_2__0_in_rule__CompoundDialogue__Group_0_7__25233 = new BitSet(new long[]{0x0000020000800020L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__3_in_rule__CompoundDialogue__Group_0_7__25243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CompoundDialogue__Group_0_7__35272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__ProcessesAssignment_0_7_2_0_in_rule__CompoundDialogue__Group_0_7_2__05315 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7_2__1_in_rule__CompoundDialogue__Group_0_7_2__05324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CompoundDialogue__Group_0_7_2__15353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__DescriptionAssignment_0_in_rule__CollectionDialogue__Group__05392 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__1_in_rule__CollectionDialogue__Group__05402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CollectionDialogue__Group__15431 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__2_in_rule__CollectionDialogue__Group__15441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__NameAssignment_2_in_rule__CollectionDialogue__Group__25469 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__3_in_rule__CollectionDialogue__Group__25478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CollectionDialogue__Group__35507 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__4_in_rule__CollectionDialogue__Group__35517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__ContextRefAssignment_4_in_rule__CollectionDialogue__Group__45545 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__5_in_rule__CollectionDialogue__Group__45554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CollectionDialogue__Group__55583 = new BitSet(new long[]{0x0000000025800000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__6_in_rule__CollectionDialogue__Group__55593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_6__0_in_rule__CollectionDialogue__Group__65621 = new BitSet(new long[]{0x0000000024800000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__7_in_rule__CollectionDialogue__Group__65631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__0_in_rule__CollectionDialogue__Group__75659 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__8_in_rule__CollectionDialogue__Group__75669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__0_in_rule__CollectionDialogue__Group__85697 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__9_in_rule__CollectionDialogue__Group__85707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CollectionDialogue__Group__95736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CollectionDialogue__Group_6__05792 = new BitSet(new long[]{0x0004000000000800L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_6__1_in_rule__CollectionDialogue__Group_6__05802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Alternatives_6_1_in_rule__CollectionDialogue__Group_6__15830 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_6__2_in_rule__CollectionDialogue__Group_6__15839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CollectionDialogue__Group_6__25868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CollectionDialogue__Group_7__05910 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__1_in_rule__CollectionDialogue__Group_7__05920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CollectionDialogue__Group_7__15949 = new BitSet(new long[]{0x0000760000800030L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__2_in_rule__CollectionDialogue__Group_7__15959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7_2__0_in_rule__CollectionDialogue__Group_7__25987 = new BitSet(new long[]{0x0000760000800030L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__3_in_rule__CollectionDialogue__Group_7__25997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CollectionDialogue__Group_7__36026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__DialoguesAssignment_7_2_0_in_rule__CollectionDialogue__Group_7_2__06069 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7_2__1_in_rule__CollectionDialogue__Group_7_2__06078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CollectionDialogue__Group_7_2__16107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CollectionDialogue__Group_8__06147 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__1_in_rule__CollectionDialogue__Group_8__06157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CollectionDialogue__Group_8__16186 = new BitSet(new long[]{0x0000020000800020L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__2_in_rule__CollectionDialogue__Group_8__16196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8_2__0_in_rule__CollectionDialogue__Group_8__26224 = new BitSet(new long[]{0x0000020000800020L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__3_in_rule__CollectionDialogue__Group_8__26234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CollectionDialogue__Group_8__36263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__ProcessesAssignment_8_2_0_in_rule__CollectionDialogue__Group_8_2__06306 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8_2__1_in_rule__CollectionDialogue__Group_8_2__06315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CollectionDialogue__Group_8_2__16344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__DescriptionAssignment_0_in_rule__MasterDetail__Group__06383 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__1_in_rule__MasterDetail__Group__06393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MasterDetail__Group__16422 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__2_in_rule__MasterDetail__Group__16432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__NameAssignment_2_in_rule__MasterDetail__Group__26460 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__3_in_rule__MasterDetail__Group__26469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MasterDetail__Group__36498 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__4_in_rule__MasterDetail__Group__36508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__ContextRefAssignment_4_in_rule__MasterDetail__Group__46536 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__5_in_rule__MasterDetail__Group__46545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_5__0_in_rule__MasterDetail__Group__56573 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__6_in_rule__MasterDetail__Group__56583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MasterDetail__Group__66612 = new BitSet(new long[]{0x0000760000000030L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__7_in_rule__MasterDetail__Group__66622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__MasterAssignment_7_in_rule__MasterDetail__Group__76650 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__8_in_rule__MasterDetail__Group__76659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MasterDetail__Group__86688 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__9_in_rule__MasterDetail__Group__86698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MasterDetail__Group__96727 = new BitSet(new long[]{0x0000760000000030L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__10_in_rule__MasterDetail__Group__96737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__DetailAssignment_10_in_rule__MasterDetail__Group__106765 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__11_in_rule__MasterDetail__Group__106774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MasterDetail__Group__116803 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__12_in_rule__MasterDetail__Group__116813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__0_in_rule__MasterDetail__Group__126841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MasterDetail__Group_5__06903 = new BitSet(new long[]{0x0004000000000800L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_5__1_in_rule__MasterDetail__Group_5__06913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Alternatives_5_1_in_rule__MasterDetail__Group_5__16941 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_5__2_in_rule__MasterDetail__Group_5__16950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MasterDetail__Group_5__26979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MasterDetail__Group_12__07021 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__1_in_rule__MasterDetail__Group_12__07031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MasterDetail__Group_12__17060 = new BitSet(new long[]{0x0000020000800020L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__2_in_rule__MasterDetail__Group_12__17070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12_2__0_in_rule__MasterDetail__Group_12__27098 = new BitSet(new long[]{0x0000020000800020L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__3_in_rule__MasterDetail__Group_12__27108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MasterDetail__Group_12__37137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__ProcessesAssignment_12_2_0_in_rule__MasterDetail__Group_12_2__07180 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12_2__1_in_rule__MasterDetail__Group_12_2__07189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MasterDetail__Group_12_2__17218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AutomatedProcess__DescriptionAssignment_0_in_rule__AutomatedProcess__Group__07257 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__AutomatedProcess__Group__1_in_rule__AutomatedProcess__Group__07267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__AutomatedProcess__Group__17296 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AutomatedProcess__Group__2_in_rule__AutomatedProcess__Group__17306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AutomatedProcess__NameAssignment_2_in_rule__AutomatedProcess__Group__27334 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__AutomatedProcess__Group__3_in_rule__AutomatedProcess__Group__27343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AutomatedProcess__Group__37372 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AutomatedProcess__Group__4_in_rule__AutomatedProcess__Group__37382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AutomatedProcess__ContextRefAssignment_4_in_rule__AutomatedProcess__Group__47410 = new BitSet(new long[]{0x000000080000F002L});
    public static final BitSet FOLLOW_rule__AutomatedProcess__Group__5_in_rule__AutomatedProcess__Group__47419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AutomatedProcess__TypeAssignment_5_in_rule__AutomatedProcess__Group__57447 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__AutomatedProcess__Group__6_in_rule__AutomatedProcess__Group__57457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AutomatedProcess__Group_6__0_in_rule__AutomatedProcess__Group__67485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__AutomatedProcess__Group_6__07535 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__AutomatedProcess__Group_6__1_in_rule__AutomatedProcess__Group_6__07545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AutomatedProcess__Group_6__17574 = new BitSet(new long[]{0x0001800000800000L});
    public static final BitSet FOLLOW_rule__AutomatedProcess__Group_6__2_in_rule__AutomatedProcess__Group_6__17584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AutomatedProcess__Group_6_2__0_in_rule__AutomatedProcess__Group_6__27612 = new BitSet(new long[]{0x0001800000800000L});
    public static final BitSet FOLLOW_rule__AutomatedProcess__Group_6__3_in_rule__AutomatedProcess__Group_6__27622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AutomatedProcess__Group_6__37651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AutomatedProcess__ProcessElementsAssignment_6_2_0_in_rule__AutomatedProcess__Group_6_2__07694 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__AutomatedProcess__Group_6_2__1_in_rule__AutomatedProcess__Group_6_2__07703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AutomatedProcess__Group_6_2__17732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InteractiveProcess__DescriptionAssignment_0_in_rule__InteractiveProcess__Group__07771 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__InteractiveProcess__Group__1_in_rule__InteractiveProcess__Group__07781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__InteractiveProcess__Group__17810 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InteractiveProcess__Group__2_in_rule__InteractiveProcess__Group__17820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InteractiveProcess__NameAssignment_2_in_rule__InteractiveProcess__Group__27848 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__InteractiveProcess__Group__3_in_rule__InteractiveProcess__Group__27857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__InteractiveProcess__Group__37886 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InteractiveProcess__Group__4_in_rule__InteractiveProcess__Group__37896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InteractiveProcess__ContextRefAssignment_4_in_rule__InteractiveProcess__Group__47924 = new BitSet(new long[]{0x000000080000F002L});
    public static final BitSet FOLLOW_rule__InteractiveProcess__Group__5_in_rule__InteractiveProcess__Group__47933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InteractiveProcess__TypeAssignment_5_in_rule__InteractiveProcess__Group__57961 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__InteractiveProcess__Group__6_in_rule__InteractiveProcess__Group__57971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InteractiveProcess__Group_6__0_in_rule__InteractiveProcess__Group__67999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__InteractiveProcess__Group_6__08049 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__InteractiveProcess__Group_6__1_in_rule__InteractiveProcess__Group_6__08059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__InteractiveProcess__Group_6__18088 = new BitSet(new long[]{0x0001800000800000L});
    public static final BitSet FOLLOW_rule__InteractiveProcess__Group_6__2_in_rule__InteractiveProcess__Group_6__18098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InteractiveProcess__Group_6_2__0_in_rule__InteractiveProcess__Group_6__28126 = new BitSet(new long[]{0x0001800000800000L});
    public static final BitSet FOLLOW_rule__InteractiveProcess__Group_6__3_in_rule__InteractiveProcess__Group_6__28136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__InteractiveProcess__Group_6__38165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InteractiveProcess__ProcessElementsAssignment_6_2_0_in_rule__InteractiveProcess__Group_6_2__08208 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__InteractiveProcess__Group_6_2__1_in_rule__InteractiveProcess__Group_6_2__08217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__InteractiveProcess__Group_6_2__18246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__DescriptionAssignment_0_in_rule__FormElement__Group__08285 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__1_in_rule__FormElement__Group__08295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FormElement__Group__18324 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FormElement__Group__2_in_rule__FormElement__Group__18334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__ReferencesAssignment_2_in_rule__FormElement__Group__28362 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__3_in_rule__FormElement__Group__28371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FormElement__Group__38400 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FormElement__Group__4_in_rule__FormElement__Group__38410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__LabelAssignment_4_in_rule__FormElement__Group__48438 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__5_in_rule__FormElement__Group__48447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group_5__0_in_rule__FormElement__Group__58475 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__6_in_rule__FormElement__Group__58485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FormElement__Group__68514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__FormElement__Group_5__08564 = new BitSet(new long[]{0x0004000000000800L});
    public static final BitSet FOLLOW_rule__FormElement__Group_5__1_in_rule__FormElement__Group_5__08574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Alternatives_5_1_in_rule__FormElement__Group_5__18602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__Alternatives_0_in_rule__DialogueCall__Group__08640 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__1_in_rule__DialogueCall__Group__08649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_1__0_in_rule__DialogueCall__Group__18677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__DialogueCall__Group_1__08717 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_1__1_in_rule__DialogueCall__Group_1__08727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__AliasAssignment_1_1_in_rule__DialogueCall__Group_1__18755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkedDialogueCall__LinkAssignment_0_in_rule__LinkedDialogueCall__Group__08793 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__LinkedDialogueCall__Group__1_in_rule__LinkedDialogueCall__Group__08802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__LinkedDialogueCall__Group__18831 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LinkedDialogueCall__Group__2_in_rule__LinkedDialogueCall__Group__18841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkedDialogueCall__NameAssignment_2_in_rule__LinkedDialogueCall__Group__28869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Alternatives_0_in_rule__ProcessCall__Group__08909 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__1_in_rule__ProcessCall__Group__08918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_1__0_in_rule__ProcessCall__Group__18946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ProcessCall__Group_1__08986 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_1__1_in_rule__ProcessCall__Group_1__08996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__AliasAssignment_1_1_in_rule__ProcessCall__Group_1__19024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkedProcessCall__LinkAssignment_0_in_rule__LinkedProcessCall__Group__09062 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__LinkedProcessCall__Group__1_in_rule__LinkedProcessCall__Group__09071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__LinkedProcessCall__Group__19100 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LinkedProcessCall__Group__2_in_rule__LinkedProcessCall__Group__19110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkedProcessCall__NameAssignment_2_in_rule__LinkedProcessCall__Group__29138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__LinkRef__Group__09179 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LinkRef__Group__1_in_rule__LinkRef__Group__09189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkRef__NameAssignment_1_in_rule__LinkRef__Group__19217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__LinkService__Group__09256 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LinkService__Group__1_in_rule__LinkService__Group__09266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkService__ServiceNameAssignment_1_in_rule__LinkService__Group__19294 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__LinkService__Group__2_in_rule__LinkService__Group__19303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__LinkService__Group__29332 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LinkService__Group__3_in_rule__LinkService__Group__29342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkService__ServiceMethodAssignment_3_in_rule__LinkService__Group__39370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkStep__DescriptionAssignment_0_in_rule__LinkStep__Group__09412 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__LinkStep__Group__1_in_rule__LinkStep__Group__09422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__LinkStep__Group__19451 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LinkStep__Group__2_in_rule__LinkStep__Group__19461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkStep__NameAssignment_2_in_rule__LinkStep__Group__29489 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__LinkStep__Group__3_in_rule__LinkStep__Group__29498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LinkStep__Group__39527 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LinkStep__Group__4_in_rule__LinkStep__Group__39537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkStep__ContextRefAssignment_4_in_rule__LinkStep__Group__49565 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__LinkStep__Group__5_in_rule__LinkStep__Group__49574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__LinkStep__Group__59603 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LinkStep__Group__6_in_rule__LinkStep__Group__59613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkStep__ReferenceAssignment_6_in_rule__LinkStep__Group__69641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkPath__DescriptionAssignment_0_in_rule__LinkPath__Group__09689 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__LinkPath__Group__1_in_rule__LinkPath__Group__09699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__LinkPath__Group__19728 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LinkPath__Group__2_in_rule__LinkPath__Group__19738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkPath__NameAssignment_2_in_rule__LinkPath__Group__29766 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__LinkPath__Group__3_in_rule__LinkPath__Group__29775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LinkPath__Group__39804 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LinkPath__Group__4_in_rule__LinkPath__Group__39814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkPath__ContextRefAssignment_4_in_rule__LinkPath__Group__49842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__LinkNavigation__Group__09887 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LinkNavigation__Group__1_in_rule__LinkNavigation__Group__09897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkNavigation__ReferencesAssignment_1_in_rule__LinkNavigation__Group__19925 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__LinkNavigation__Group__2_in_rule__LinkNavigation__Group__19934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkNavigation__Group_2__0_in_rule__LinkNavigation__Group__29962 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_rule__LinkNavigation__Group_2__010004 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LinkNavigation__Group_2__1_in_rule__LinkNavigation__Group_2__010014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkNavigation__ReferencesAssignment_2_1_in_rule__LinkNavigation__Group_2__110042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__UIModelElementCall__Group_0__010081 = new BitSet(new long[]{0x0000760000000030L});
    public static final BitSet FOLLOW_rule__UIModelElementCall__Group_0__1_in_rule__UIModelElementCall__Group_0__010091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__UIModelElementCall__Group_0__110119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__UIModelElementCall__Group_1__010157 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_rule__UIModelElementCall__Group_1__1_in_rule__UIModelElementCall__Group_1__010167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__UIModelElementCall__Group_1__110195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PresentationModel__DescriptionAssignment_010232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PresentationModel__NameAssignment_210263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_rule__PresentationModel__ExternalReferencesAssignment_410294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_rule__PresentationModel__ElementsAssignment_510325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalReference__ModelNameAssignment_110356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalReference__NameAssignment_310387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ContentForm__DescriptionAssignment_010418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContentForm__NameAssignment_210449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ContentForm__IsCollectionAssignment_410485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContentForm__ContextRefAssignment_510528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ContentForm__ReadonlyAssignment_7_1_010568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_rule__ContentForm__FormElementsAssignment_810607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProcess_in_rule__ContentForm__ActionsAssignment_9_2_010638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__ContentForm__ProcessesAssignment_10_2_010669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleProcess__NameAssignment_010700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessType_in_rule__SimpleProcess__TypeAssignment_110731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__SimpleProcess__DialogueAssignment_2_110762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CompoundDialogue__DescriptionAssignment_0_010793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CompoundDialogue__NameAssignment_0_210824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CompoundDialogue__ContextRefAssignment_0_410859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__CompoundDialogue__ReadonlyAssignment_0_5_1_010899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__CompoundDialogue__DialoguesAssignment_0_6_2_010938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__CompoundDialogue__ProcessesAssignment_0_7_2_010969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CollectionDialogue__DescriptionAssignment_011000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CollectionDialogue__NameAssignment_211031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CollectionDialogue__ContextRefAssignment_411066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__CollectionDialogue__ReadonlyAssignment_6_1_011106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__CollectionDialogue__DialoguesAssignment_7_2_011145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__CollectionDialogue__ProcessesAssignment_8_2_011176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MasterDetail__DescriptionAssignment_011207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MasterDetail__NameAssignment_211238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MasterDetail__ContextRefAssignment_411273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__MasterDetail__ReadonlyAssignment_5_1_011313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__MasterDetail__MasterAssignment_711352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__MasterDetail__DetailAssignment_1011383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__MasterDetail__ProcessesAssignment_12_2_011414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AutomatedProcess__DescriptionAssignment_011445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AutomatedProcess__NameAssignment_211476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AutomatedProcess__ContextRefAssignment_411511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessType_in_rule__AutomatedProcess__TypeAssignment_511546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUICall_in_rule__AutomatedProcess__ProcessElementsAssignment_6_2_011577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InteractiveProcess__DescriptionAssignment_011608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InteractiveProcess__NameAssignment_211639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InteractiveProcess__ContextRefAssignment_411674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessType_in_rule__InteractiveProcess__TypeAssignment_511709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUICall_in_rule__InteractiveProcess__ProcessElementsAssignment_6_2_011740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FormElement__DescriptionAssignment_011771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_rule__FormElement__ReferencesAssignment_211802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FormElement__LabelAssignment_411833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__FormElement__ReadonlyAssignment_5_1_011869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DialogueCall__AliasAssignment_1_111908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__LinkedDialogueCall__LinkAssignment_011939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LinkedDialogueCall__NameAssignment_211970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DirectDialogueCall__NameAssignment12001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProcessCall__AliasAssignment_1_112032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkRef_in_rule__LinkedProcessCall__LinkAssignment_012063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LinkedProcessCall__NameAssignment_212094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DirectProcessCall__NameAssignment12125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LinkRef__NameAssignment_112156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LinkService__ServiceNameAssignment_112187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LinkService__ServiceMethodAssignment_312218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LinkStep__DescriptionAssignment_012249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LinkStep__NameAssignment_212280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LinkStep__ContextRefAssignment_412315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_rule__LinkStep__ReferenceAssignment_612350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LinkPath__DescriptionAssignment_012381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LinkPath__NameAssignment_212412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LinkPath__ContextRefAssignment_412447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_rule__LinkNavigation__ReferencesAssignment_112482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_rule__LinkNavigation__ReferencesAssignment_2_112513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoPropertyReference__NameAssignment12544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationRoleReference__NameAssignment12575 = new BitSet(new long[]{0x0000000000000002L});

}