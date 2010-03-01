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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'link'", "'false'", "';'", "'new'", "'save'", "'edit'", "'delete'", "'cancel'", "'removefrom'", "'addto'", "'all'", "'find'", "'presentation'", "'application'", "'['", "']'", "'from'", "'import'", "'form'", "'context'", "'readonly'", "'actions'", "'processes'", "'label'", "'CompoundDialogue'", "'dialogues'", "'CollectionDialogue'", "'MasterDetail'", "'master'", "'detail'", "'process'", "'element'", "':'", "'if'", "'('", "')'", "'call'", "'service'", "'.'", "'navigate'", "'list'", "'true'", "'composite'"
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


    // $ANTLR start entryRuleApplication
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:87:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:87:22: ( ruleApplication EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:88:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication120);
            ruleApplication();
            _fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication127); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:95:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:99:2: ( ( ( rule__Application__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:100:1: ( ( rule__Application__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:100:1: ( ( rule__Application__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:101:1: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:102:1: ( rule__Application__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:102:2: rule__Application__Group__0
            {
            pushFollow(FOLLOW_rule__Application__Group__0_in_ruleApplication154);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:114:1: entryRuleExternalReference : ruleExternalReference EOF ;
    public final void entryRuleExternalReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:114:28: ( ruleExternalReference EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:115:1: ruleExternalReference EOF
            {
             before(grammarAccess.getExternalReferenceRule()); 
            pushFollow(FOLLOW_ruleExternalReference_in_entryRuleExternalReference180);
            ruleExternalReference();
            _fsp--;

             after(grammarAccess.getExternalReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalReference187); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:122:1: ruleExternalReference : ( ( rule__ExternalReference__Group__0 ) ) ;
    public final void ruleExternalReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:126:2: ( ( ( rule__ExternalReference__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:127:1: ( ( rule__ExternalReference__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:127:1: ( ( rule__ExternalReference__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:128:1: ( rule__ExternalReference__Group__0 )
            {
             before(grammarAccess.getExternalReferenceAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:129:1: ( rule__ExternalReference__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:129:2: rule__ExternalReference__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalReference__Group__0_in_ruleExternalReference214);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:141:1: entryRuleModelElementWithContext : ruleModelElementWithContext EOF ;
    public final void entryRuleModelElementWithContext() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:141:34: ( ruleModelElementWithContext EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:142:1: ruleModelElementWithContext EOF
            {
             before(grammarAccess.getModelElementWithContextRule()); 
            pushFollow(FOLLOW_ruleModelElementWithContext_in_entryRuleModelElementWithContext240);
            ruleModelElementWithContext();
            _fsp--;

             after(grammarAccess.getModelElementWithContextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElementWithContext247); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:149:1: ruleModelElementWithContext : ( ruleUIModelElement ) ;
    public final void ruleModelElementWithContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:153:2: ( ( ruleUIModelElement ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:154:1: ( ruleUIModelElement )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:154:1: ( ruleUIModelElement )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:155:1: ruleUIModelElement
            {
             before(grammarAccess.getModelElementWithContextAccess().getUIModelElementParserRuleCall()); 
            pushFollow(FOLLOW_ruleUIModelElement_in_ruleModelElementWithContext274);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:168:1: entryRuleUIModelElement : ruleUIModelElement EOF ;
    public final void entryRuleUIModelElement() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:168:25: ( ruleUIModelElement EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:169:1: ruleUIModelElement EOF
            {
             before(grammarAccess.getUIModelElementRule()); 
            pushFollow(FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement299);
            ruleUIModelElement();
            _fsp--;

             after(grammarAccess.getUIModelElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIModelElement306); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:176:1: ruleUIModelElement : ( ( rule__UIModelElement__Alternatives ) ) ;
    public final void ruleUIModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:180:2: ( ( ( rule__UIModelElement__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:181:1: ( ( rule__UIModelElement__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:181:1: ( ( rule__UIModelElement__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:182:1: ( rule__UIModelElement__Alternatives )
            {
             before(grammarAccess.getUIModelElementAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:183:1: ( rule__UIModelElement__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:183:2: rule__UIModelElement__Alternatives
            {
            pushFollow(FOLLOW_rule__UIModelElement__Alternatives_in_ruleUIModelElement333);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:195:1: entryRuleDialogue : ruleDialogue EOF ;
    public final void entryRuleDialogue() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:195:19: ( ruleDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:196:1: ruleDialogue EOF
            {
             before(grammarAccess.getDialogueRule()); 
            pushFollow(FOLLOW_ruleDialogue_in_entryRuleDialogue359);
            ruleDialogue();
            _fsp--;

             after(grammarAccess.getDialogueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialogue366); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:203:1: ruleDialogue : ( ( rule__Dialogue__Alternatives ) ) ;
    public final void ruleDialogue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:207:2: ( ( ( rule__Dialogue__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:208:1: ( ( rule__Dialogue__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:208:1: ( ( rule__Dialogue__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:209:1: ( rule__Dialogue__Alternatives )
            {
             before(grammarAccess.getDialogueAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:210:1: ( rule__Dialogue__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:210:2: rule__Dialogue__Alternatives
            {
            pushFollow(FOLLOW_rule__Dialogue__Alternatives_in_ruleDialogue393);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:222:1: entryRuleContentForm : ruleContentForm EOF ;
    public final void entryRuleContentForm() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:222:22: ( ruleContentForm EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:223:1: ruleContentForm EOF
            {
             before(grammarAccess.getContentFormRule()); 
            pushFollow(FOLLOW_ruleContentForm_in_entryRuleContentForm419);
            ruleContentForm();
            _fsp--;

             after(grammarAccess.getContentFormRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentForm426); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:230:1: ruleContentForm : ( ( rule__ContentForm__Group__0 ) ) ;
    public final void ruleContentForm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:234:2: ( ( ( rule__ContentForm__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:235:1: ( ( rule__ContentForm__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:235:1: ( ( rule__ContentForm__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:236:1: ( rule__ContentForm__Group__0 )
            {
             before(grammarAccess.getContentFormAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:237:1: ( rule__ContentForm__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:237:2: rule__ContentForm__Group__0
            {
            pushFollow(FOLLOW_rule__ContentForm__Group__0_in_ruleContentForm453);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:249:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:249:17: ( ruleAction EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:250:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction479);
            ruleAction();
            _fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction486); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:257:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:261:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:262:1: ( ( rule__Action__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:262:1: ( ( rule__Action__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:263:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:264:1: ( rule__Action__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:264:2: rule__Action__Group__0
            {
            pushFollow(FOLLOW_rule__Action__Group__0_in_ruleAction513);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:276:1: entryRuleCompoundDialogue : ruleCompoundDialogue EOF ;
    public final void entryRuleCompoundDialogue() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:276:27: ( ruleCompoundDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:277:1: ruleCompoundDialogue EOF
            {
             before(grammarAccess.getCompoundDialogueRule()); 
            pushFollow(FOLLOW_ruleCompoundDialogue_in_entryRuleCompoundDialogue539);
            ruleCompoundDialogue();
            _fsp--;

             after(grammarAccess.getCompoundDialogueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundDialogue546); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:284:1: ruleCompoundDialogue : ( ( rule__CompoundDialogue__Alternatives ) ) ;
    public final void ruleCompoundDialogue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:288:2: ( ( ( rule__CompoundDialogue__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:289:1: ( ( rule__CompoundDialogue__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:289:1: ( ( rule__CompoundDialogue__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:290:1: ( rule__CompoundDialogue__Alternatives )
            {
             before(grammarAccess.getCompoundDialogueAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:291:1: ( rule__CompoundDialogue__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:291:2: rule__CompoundDialogue__Alternatives
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__Alternatives_in_ruleCompoundDialogue573);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:303:1: entryRuleCollectionDialogue : ruleCollectionDialogue EOF ;
    public final void entryRuleCollectionDialogue() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:303:29: ( ruleCollectionDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:304:1: ruleCollectionDialogue EOF
            {
             before(grammarAccess.getCollectionDialogueRule()); 
            pushFollow(FOLLOW_ruleCollectionDialogue_in_entryRuleCollectionDialogue599);
            ruleCollectionDialogue();
            _fsp--;

             after(grammarAccess.getCollectionDialogueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionDialogue606); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:311:1: ruleCollectionDialogue : ( ( rule__CollectionDialogue__Group__0 ) ) ;
    public final void ruleCollectionDialogue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:315:2: ( ( ( rule__CollectionDialogue__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:316:1: ( ( rule__CollectionDialogue__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:316:1: ( ( rule__CollectionDialogue__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:317:1: ( rule__CollectionDialogue__Group__0 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:318:1: ( rule__CollectionDialogue__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:318:2: rule__CollectionDialogue__Group__0
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__Group__0_in_ruleCollectionDialogue633);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:330:1: entryRuleMasterDetail : ruleMasterDetail EOF ;
    public final void entryRuleMasterDetail() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:330:23: ( ruleMasterDetail EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:331:1: ruleMasterDetail EOF
            {
             before(grammarAccess.getMasterDetailRule()); 
            pushFollow(FOLLOW_ruleMasterDetail_in_entryRuleMasterDetail659);
            ruleMasterDetail();
            _fsp--;

             after(grammarAccess.getMasterDetailRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMasterDetail666); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:338:1: ruleMasterDetail : ( ( rule__MasterDetail__Group__0 ) ) ;
    public final void ruleMasterDetail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:342:2: ( ( ( rule__MasterDetail__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:343:1: ( ( rule__MasterDetail__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:343:1: ( ( rule__MasterDetail__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:344:1: ( rule__MasterDetail__Group__0 )
            {
             before(grammarAccess.getMasterDetailAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:345:1: ( rule__MasterDetail__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:345:2: rule__MasterDetail__Group__0
            {
            pushFollow(FOLLOW_rule__MasterDetail__Group__0_in_ruleMasterDetail693);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:357:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:357:18: ( ruleProcess EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:358:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess719);
            ruleProcess();
            _fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess726); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:365:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:369:2: ( ( ( rule__Process__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:370:1: ( ( rule__Process__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:370:1: ( ( rule__Process__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:371:1: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:372:1: ( rule__Process__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:372:2: rule__Process__Group__0
            {
            pushFollow(FOLLOW_rule__Process__Group__0_in_ruleProcess753);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:384:1: entryRuleFormElement : ruleFormElement EOF ;
    public final void entryRuleFormElement() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:384:22: ( ruleFormElement EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:385:1: ruleFormElement EOF
            {
             before(grammarAccess.getFormElementRule()); 
            pushFollow(FOLLOW_ruleFormElement_in_entryRuleFormElement779);
            ruleFormElement();
            _fsp--;

             after(grammarAccess.getFormElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormElement786); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:392:1: ruleFormElement : ( ( rule__FormElement__Group__0 ) ) ;
    public final void ruleFormElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:396:2: ( ( ( rule__FormElement__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:397:1: ( ( rule__FormElement__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:397:1: ( ( rule__FormElement__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:398:1: ( rule__FormElement__Group__0 )
            {
             before(grammarAccess.getFormElementAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:399:1: ( rule__FormElement__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:399:2: rule__FormElement__Group__0
            {
            pushFollow(FOLLOW_rule__FormElement__Group__0_in_ruleFormElement813);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:411:1: entryRuleActionDialogueCall : ruleActionDialogueCall EOF ;
    public final void entryRuleActionDialogueCall() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:411:29: ( ruleActionDialogueCall EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:412:1: ruleActionDialogueCall EOF
            {
             before(grammarAccess.getActionDialogueCallRule()); 
            pushFollow(FOLLOW_ruleActionDialogueCall_in_entryRuleActionDialogueCall839);
            ruleActionDialogueCall();
            _fsp--;

             after(grammarAccess.getActionDialogueCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionDialogueCall846); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:419:1: ruleActionDialogueCall : ( ( rule__ActionDialogueCall__Group__0 ) ) ;
    public final void ruleActionDialogueCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:423:2: ( ( ( rule__ActionDialogueCall__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:424:1: ( ( rule__ActionDialogueCall__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:424:1: ( ( rule__ActionDialogueCall__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:425:1: ( rule__ActionDialogueCall__Group__0 )
            {
             before(grammarAccess.getActionDialogueCallAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:426:1: ( rule__ActionDialogueCall__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:426:2: rule__ActionDialogueCall__Group__0
            {
            pushFollow(FOLLOW_rule__ActionDialogueCall__Group__0_in_ruleActionDialogueCall873);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:438:1: entryRuleDialogueCall : ruleDialogueCall EOF ;
    public final void entryRuleDialogueCall() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:438:23: ( ruleDialogueCall EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:439:1: ruleDialogueCall EOF
            {
             before(grammarAccess.getDialogueCallRule()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_entryRuleDialogueCall899);
            ruleDialogueCall();
            _fsp--;

             after(grammarAccess.getDialogueCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialogueCall906); 

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
            pushFollow(FOLLOW_rule__DialogueCall__Group__0_in_ruleDialogueCall933);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:465:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:465:21: ( ruleExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:466:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression959);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression966); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:473:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:477:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:478:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:478:1: ( ( rule__Expression__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:479:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:480:1: ( rule__Expression__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:480:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression993);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:492:1: entryRuleProcessCall : ruleProcessCall EOF ;
    public final void entryRuleProcessCall() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:492:22: ( ruleProcessCall EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:493:1: ruleProcessCall EOF
            {
             before(grammarAccess.getProcessCallRule()); 
            pushFollow(FOLLOW_ruleProcessCall_in_entryRuleProcessCall1019);
            ruleProcessCall();
            _fsp--;

             after(grammarAccess.getProcessCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessCall1026); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:500:1: ruleProcessCall : ( ( rule__ProcessCall__Group__0 ) ) ;
    public final void ruleProcessCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:504:2: ( ( ( rule__ProcessCall__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:505:1: ( ( rule__ProcessCall__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:505:1: ( ( rule__ProcessCall__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:506:1: ( rule__ProcessCall__Group__0 )
            {
             before(grammarAccess.getProcessCallAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:507:1: ( rule__ProcessCall__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:507:2: rule__ProcessCall__Group__0
            {
            pushFollow(FOLLOW_rule__ProcessCall__Group__0_in_ruleProcessCall1053);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:519:1: entryRuleOperationExpression : ruleOperationExpression EOF ;
    public final void entryRuleOperationExpression() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:519:30: ( ruleOperationExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:520:1: ruleOperationExpression EOF
            {
             before(grammarAccess.getOperationExpressionRule()); 
            pushFollow(FOLLOW_ruleOperationExpression_in_entryRuleOperationExpression1079);
            ruleOperationExpression();
            _fsp--;

             after(grammarAccess.getOperationExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationExpression1086); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:527:1: ruleOperationExpression : ( ( rule__OperationExpression__Group__0 ) ) ;
    public final void ruleOperationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:531:2: ( ( ( rule__OperationExpression__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:532:1: ( ( rule__OperationExpression__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:532:1: ( ( rule__OperationExpression__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:533:1: ( rule__OperationExpression__Group__0 )
            {
             before(grammarAccess.getOperationExpressionAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:534:1: ( rule__OperationExpression__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:534:2: rule__OperationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__OperationExpression__Group__0_in_ruleOperationExpression1113);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:546:1: entryRuleSimpleProcessCall : ruleSimpleProcessCall EOF ;
    public final void entryRuleSimpleProcessCall() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:546:28: ( ruleSimpleProcessCall EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:547:1: ruleSimpleProcessCall EOF
            {
             before(grammarAccess.getSimpleProcessCallRule()); 
            pushFollow(FOLLOW_ruleSimpleProcessCall_in_entryRuleSimpleProcessCall1139);
            ruleSimpleProcessCall();
            _fsp--;

             after(grammarAccess.getSimpleProcessCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleProcessCall1146); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:554:1: ruleSimpleProcessCall : ( ( rule__SimpleProcessCall__Group__0 ) ) ;
    public final void ruleSimpleProcessCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:558:2: ( ( ( rule__SimpleProcessCall__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:559:1: ( ( rule__SimpleProcessCall__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:559:1: ( ( rule__SimpleProcessCall__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:560:1: ( rule__SimpleProcessCall__Group__0 )
            {
             before(grammarAccess.getSimpleProcessCallAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:561:1: ( rule__SimpleProcessCall__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:561:2: rule__SimpleProcessCall__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleProcessCall__Group__0_in_ruleSimpleProcessCall1173);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:573:1: entryRuleStandardExpression : ruleStandardExpression EOF ;
    public final void entryRuleStandardExpression() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:573:29: ( ruleStandardExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:574:1: ruleStandardExpression EOF
            {
             before(grammarAccess.getStandardExpressionRule()); 
            pushFollow(FOLLOW_ruleStandardExpression_in_entryRuleStandardExpression1199);
            ruleStandardExpression();
            _fsp--;

             after(grammarAccess.getStandardExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStandardExpression1206); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:581:1: ruleStandardExpression : ( ( rule__StandardExpression__TypeAssignment ) ) ;
    public final void ruleStandardExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:585:2: ( ( ( rule__StandardExpression__TypeAssignment ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:586:1: ( ( rule__StandardExpression__TypeAssignment ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:586:1: ( ( rule__StandardExpression__TypeAssignment ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:587:1: ( rule__StandardExpression__TypeAssignment )
            {
             before(grammarAccess.getStandardExpressionAccess().getTypeAssignment()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:588:1: ( rule__StandardExpression__TypeAssignment )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:588:2: rule__StandardExpression__TypeAssignment
            {
            pushFollow(FOLLOW_rule__StandardExpression__TypeAssignment_in_ruleStandardExpression1233);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:600:1: entryRuleServiceExpression : ruleServiceExpression EOF ;
    public final void entryRuleServiceExpression() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:600:28: ( ruleServiceExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:601:1: ruleServiceExpression EOF
            {
             before(grammarAccess.getServiceExpressionRule()); 
            pushFollow(FOLLOW_ruleServiceExpression_in_entryRuleServiceExpression1259);
            ruleServiceExpression();
            _fsp--;

             after(grammarAccess.getServiceExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceExpression1266); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:608:1: ruleServiceExpression : ( ( rule__ServiceExpression__Group__0 ) ) ;
    public final void ruleServiceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:612:2: ( ( ( rule__ServiceExpression__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:613:1: ( ( rule__ServiceExpression__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:613:1: ( ( rule__ServiceExpression__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:614:1: ( rule__ServiceExpression__Group__0 )
            {
             before(grammarAccess.getServiceExpressionAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:615:1: ( rule__ServiceExpression__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:615:2: rule__ServiceExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceExpression__Group__0_in_ruleServiceExpression1293);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:627:1: entryRuleNavigationExpression : ruleNavigationExpression EOF ;
    public final void entryRuleNavigationExpression() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:627:31: ( ruleNavigationExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:628:1: ruleNavigationExpression EOF
            {
             before(grammarAccess.getNavigationExpressionRule()); 
            pushFollow(FOLLOW_ruleNavigationExpression_in_entryRuleNavigationExpression1319);
            ruleNavigationExpression();
            _fsp--;

             after(grammarAccess.getNavigationExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigationExpression1326); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:635:1: ruleNavigationExpression : ( ( rule__NavigationExpression__Group__0 ) ) ;
    public final void ruleNavigationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:639:2: ( ( ( rule__NavigationExpression__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:640:1: ( ( rule__NavigationExpression__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:640:1: ( ( rule__NavigationExpression__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:641:1: ( rule__NavigationExpression__Group__0 )
            {
             before(grammarAccess.getNavigationExpressionAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:642:1: ( rule__NavigationExpression__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:642:2: rule__NavigationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NavigationExpression__Group__0_in_ruleNavigationExpression1353);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:654:1: entryRuleDtoPropertyReference : ruleDtoPropertyReference EOF ;
    public final void entryRuleDtoPropertyReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:654:31: ( ruleDtoPropertyReference EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:655:1: ruleDtoPropertyReference EOF
            {
             before(grammarAccess.getDtoPropertyReferenceRule()); 
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference1379);
            ruleDtoPropertyReference();
            _fsp--;

             after(grammarAccess.getDtoPropertyReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoPropertyReference1386); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:662:1: ruleDtoPropertyReference : ( ( rule__DtoPropertyReference__NameAssignment ) ) ;
    public final void ruleDtoPropertyReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:666:2: ( ( ( rule__DtoPropertyReference__NameAssignment ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:667:1: ( ( rule__DtoPropertyReference__NameAssignment ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:667:1: ( ( rule__DtoPropertyReference__NameAssignment ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:668:1: ( rule__DtoPropertyReference__NameAssignment )
            {
             before(grammarAccess.getDtoPropertyReferenceAccess().getNameAssignment()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:669:1: ( rule__DtoPropertyReference__NameAssignment )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:669:2: rule__DtoPropertyReference__NameAssignment
            {
            pushFollow(FOLLOW_rule__DtoPropertyReference__NameAssignment_in_ruleDtoPropertyReference1413);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:681:1: entryRuleAssociationRoleReference : ruleAssociationRoleReference EOF ;
    public final void entryRuleAssociationRoleReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:681:35: ( ruleAssociationRoleReference EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:682:1: ruleAssociationRoleReference EOF
            {
             before(grammarAccess.getAssociationRoleReferenceRule()); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference1439);
            ruleAssociationRoleReference();
            _fsp--;

             after(grammarAccess.getAssociationRoleReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociationRoleReference1446); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:689:1: ruleAssociationRoleReference : ( ( rule__AssociationRoleReference__NameAssignment ) ) ;
    public final void ruleAssociationRoleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:693:2: ( ( ( rule__AssociationRoleReference__NameAssignment ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:694:1: ( ( rule__AssociationRoleReference__NameAssignment ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:694:1: ( ( rule__AssociationRoleReference__NameAssignment ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:695:1: ( rule__AssociationRoleReference__NameAssignment )
            {
             before(grammarAccess.getAssociationRoleReferenceAccess().getNameAssignment()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:696:1: ( rule__AssociationRoleReference__NameAssignment )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:696:2: rule__AssociationRoleReference__NameAssignment
            {
            pushFollow(FOLLOW_rule__AssociationRoleReference__NameAssignment_in_ruleAssociationRoleReference1473);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:708:1: entryRuleUICall : ruleUICall EOF ;
    public final void entryRuleUICall() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:708:17: ( ruleUICall EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:709:1: ruleUICall EOF
            {
             before(grammarAccess.getUICallRule()); 
            pushFollow(FOLLOW_ruleUICall_in_entryRuleUICall1499);
            ruleUICall();
            _fsp--;

             after(grammarAccess.getUICallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUICall1506); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:716:1: ruleUICall : ( ruleUIModelElementCall ) ;
    public final void ruleUICall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:720:2: ( ( ruleUIModelElementCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:721:1: ( ruleUIModelElementCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:721:1: ( ruleUIModelElementCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:722:1: ruleUIModelElementCall
            {
             before(grammarAccess.getUICallAccess().getUIModelElementCallParserRuleCall()); 
            pushFollow(FOLLOW_ruleUIModelElementCall_in_ruleUICall1533);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:735:1: entryRuleUIModelElementCall : ruleUIModelElementCall EOF ;
    public final void entryRuleUIModelElementCall() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:735:29: ( ruleUIModelElementCall EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:736:1: ruleUIModelElementCall EOF
            {
             before(grammarAccess.getUIModelElementCallRule()); 
            pushFollow(FOLLOW_ruleUIModelElementCall_in_entryRuleUIModelElementCall1558);
            ruleUIModelElementCall();
            _fsp--;

             after(grammarAccess.getUIModelElementCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIModelElementCall1565); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:743:1: ruleUIModelElementCall : ( ( rule__UIModelElementCall__Alternatives ) ) ;
    public final void ruleUIModelElementCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:747:2: ( ( ( rule__UIModelElementCall__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:748:1: ( ( rule__UIModelElementCall__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:748:1: ( ( rule__UIModelElementCall__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:749:1: ( rule__UIModelElementCall__Alternatives )
            {
             before(grammarAccess.getUIModelElementCallAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:750:1: ( rule__UIModelElementCall__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:750:2: rule__UIModelElementCall__Alternatives
            {
            pushFollow(FOLLOW_rule__UIModelElementCall__Alternatives_in_ruleUIModelElementCall1592);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:763:1: ruleProcessType : ( ( rule__ProcessType__Alternatives ) ) ;
    public final void ruleProcessType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:767:1: ( ( ( rule__ProcessType__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:768:1: ( ( rule__ProcessType__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:768:1: ( ( rule__ProcessType__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:769:1: ( rule__ProcessType__Alternatives )
            {
             before(grammarAccess.getProcessTypeAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:770:1: ( rule__ProcessType__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:770:2: rule__ProcessType__Alternatives
            {
            pushFollow(FOLLOW_rule__ProcessType__Alternatives_in_ruleProcessType1629);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:782:1: ruleProcessTypeLink : ( ( 'link' ) ) ;
    public final void ruleProcessTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:786:1: ( ( ( 'link' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:787:1: ( ( 'link' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:787:1: ( ( 'link' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:788:1: ( 'link' )
            {
             before(grammarAccess.getProcessTypeLinkAccess().getLINKEnumLiteralDeclaration()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:789:1: ( 'link' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:789:3: 'link'
            {
            match(input,11,FOLLOW_11_in_ruleProcessTypeLink1666); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:802:1: ruleExpressionType : ( ( rule__ExpressionType__Alternatives ) ) ;
    public final void ruleExpressionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:806:1: ( ( ( rule__ExpressionType__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:807:1: ( ( rule__ExpressionType__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:807:1: ( ( rule__ExpressionType__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:808:1: ( rule__ExpressionType__Alternatives )
            {
             before(grammarAccess.getExpressionTypeAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:809:1: ( rule__ExpressionType__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:809:2: rule__ExpressionType__Alternatives
            {
            pushFollow(FOLLOW_rule__ExpressionType__Alternatives_in_ruleExpressionType1704);
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


    // $ANTLR start rule__UIModelElement__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:820:1: rule__UIModelElement__Alternatives : ( ( ruleDialogue ) | ( ruleProcess ) );
    public final void rule__UIModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:824:1: ( ( ruleDialogue ) | ( ruleProcess ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==29||LA1_1==35||(LA1_1>=37 && LA1_1<=38)) ) {
                    alt1=1;
                }
                else if ( (LA1_1==41) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("820:1: rule__UIModelElement__Alternatives : ( ( ruleDialogue ) | ( ruleProcess ) );", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 29:
            case 35:
            case 37:
            case 38:
                {
                alt1=1;
                }
                break;
            case 41:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("820:1: rule__UIModelElement__Alternatives : ( ( ruleDialogue ) | ( ruleProcess ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:825:1: ( ruleDialogue )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:825:1: ( ruleDialogue )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:826:1: ruleDialogue
                    {
                     before(grammarAccess.getUIModelElementAccess().getDialogueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDialogue_in_rule__UIModelElement__Alternatives1739);
                    ruleDialogue();
                    _fsp--;

                     after(grammarAccess.getUIModelElementAccess().getDialogueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:831:6: ( ruleProcess )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:831:6: ( ruleProcess )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:832:1: ruleProcess
                    {
                     before(grammarAccess.getUIModelElementAccess().getProcessParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleProcess_in_rule__UIModelElement__Alternatives1756);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:842:1: rule__Dialogue__Alternatives : ( ( ruleContentForm ) | ( ruleCompoundDialogue ) );
    public final void rule__Dialogue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:846:1: ( ( ruleContentForm ) | ( ruleCompoundDialogue ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==35||(LA2_1>=37 && LA2_1<=38)) ) {
                    alt2=2;
                }
                else if ( (LA2_1==29) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("842:1: rule__Dialogue__Alternatives : ( ( ruleContentForm ) | ( ruleCompoundDialogue ) );", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                alt2=1;
                }
                break;
            case 35:
            case 37:
            case 38:
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("842:1: rule__Dialogue__Alternatives : ( ( ruleContentForm ) | ( ruleCompoundDialogue ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:847:1: ( ruleContentForm )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:847:1: ( ruleContentForm )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:848:1: ruleContentForm
                    {
                     before(grammarAccess.getDialogueAccess().getContentFormParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleContentForm_in_rule__Dialogue__Alternatives1788);
                    ruleContentForm();
                    _fsp--;

                     after(grammarAccess.getDialogueAccess().getContentFormParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:853:6: ( ruleCompoundDialogue )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:853:6: ( ruleCompoundDialogue )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:854:1: ruleCompoundDialogue
                    {
                     before(grammarAccess.getDialogueAccess().getCompoundDialogueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCompoundDialogue_in_rule__Dialogue__Alternatives1805);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:864:1: rule__ContentForm__Alternatives_7_1 : ( ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) ) | ( 'false' ) );
    public final void rule__ContentForm__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:868:1: ( ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==52) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("864:1: rule__ContentForm__Alternatives_7_1 : ( ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) ) | ( 'false' ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:869:1: ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:869:1: ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:870:1: ( rule__ContentForm__ReadonlyAssignment_7_1_0 )
                    {
                     before(grammarAccess.getContentFormAccess().getReadonlyAssignment_7_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:871:1: ( rule__ContentForm__ReadonlyAssignment_7_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:871:2: rule__ContentForm__ReadonlyAssignment_7_1_0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__ReadonlyAssignment_7_1_0_in_rule__ContentForm__Alternatives_7_11837);
                    rule__ContentForm__ReadonlyAssignment_7_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getContentFormAccess().getReadonlyAssignment_7_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:875:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:875:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:876:1: 'false'
                    {
                     before(grammarAccess.getContentFormAccess().getFalseKeyword_7_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__ContentForm__Alternatives_7_11856); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:888:1: rule__CompoundDialogue__Alternatives : ( ( ( rule__CompoundDialogue__Group_0__0 ) ) | ( ruleCollectionDialogue ) | ( ruleMasterDetail ) );
    public final void rule__CompoundDialogue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:892:1: ( ( ( rule__CompoundDialogue__Group_0__0 ) ) | ( ruleCollectionDialogue ) | ( ruleMasterDetail ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    alt4=1;
                    }
                    break;
                case 37:
                    {
                    alt4=2;
                    }
                    break;
                case 38:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("888:1: rule__CompoundDialogue__Alternatives : ( ( ( rule__CompoundDialogue__Group_0__0 ) ) | ( ruleCollectionDialogue ) | ( ruleMasterDetail ) );", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case 35:
                {
                alt4=1;
                }
                break;
            case 37:
                {
                alt4=2;
                }
                break;
            case 38:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("888:1: rule__CompoundDialogue__Alternatives : ( ( ( rule__CompoundDialogue__Group_0__0 ) ) | ( ruleCollectionDialogue ) | ( ruleMasterDetail ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:893:1: ( ( rule__CompoundDialogue__Group_0__0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:893:1: ( ( rule__CompoundDialogue__Group_0__0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:894:1: ( rule__CompoundDialogue__Group_0__0 )
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getGroup_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:895:1: ( rule__CompoundDialogue__Group_0__0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:895:2: rule__CompoundDialogue__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__0_in_rule__CompoundDialogue__Alternatives1890);
                    rule__CompoundDialogue__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCompoundDialogueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:899:6: ( ruleCollectionDialogue )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:899:6: ( ruleCollectionDialogue )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:900:1: ruleCollectionDialogue
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getCollectionDialogueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCollectionDialogue_in_rule__CompoundDialogue__Alternatives1908);
                    ruleCollectionDialogue();
                    _fsp--;

                     after(grammarAccess.getCompoundDialogueAccess().getCollectionDialogueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:905:6: ( ruleMasterDetail )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:905:6: ( ruleMasterDetail )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:906:1: ruleMasterDetail
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getMasterDetailParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMasterDetail_in_rule__CompoundDialogue__Alternatives1925);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:916:1: rule__CompoundDialogue__Alternatives_0_5_1 : ( ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) ) | ( 'false' ) );
    public final void rule__CompoundDialogue__Alternatives_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:920:1: ( ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==52) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("916:1: rule__CompoundDialogue__Alternatives_0_5_1 : ( ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) ) | ( 'false' ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:921:1: ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:921:1: ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:922:1: ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 )
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getReadonlyAssignment_0_5_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:923:1: ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:923:2: rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0_in_rule__CompoundDialogue__Alternatives_0_5_11957);
                    rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getCompoundDialogueAccess().getReadonlyAssignment_0_5_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:927:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:927:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:928:1: 'false'
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getFalseKeyword_0_5_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__CompoundDialogue__Alternatives_0_5_11976); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:940:1: rule__CollectionDialogue__Alternatives_6_1 : ( ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) ) | ( 'false' ) );
    public final void rule__CollectionDialogue__Alternatives_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:944:1: ( ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) ) | ( 'false' ) )
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
                    new NoViableAltException("940:1: rule__CollectionDialogue__Alternatives_6_1 : ( ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) ) | ( 'false' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:945:1: ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:945:1: ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:946:1: ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 )
                    {
                     before(grammarAccess.getCollectionDialogueAccess().getReadonlyAssignment_6_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:947:1: ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:947:2: rule__CollectionDialogue__ReadonlyAssignment_6_1_0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__ReadonlyAssignment_6_1_0_in_rule__CollectionDialogue__Alternatives_6_12010);
                    rule__CollectionDialogue__ReadonlyAssignment_6_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getCollectionDialogueAccess().getReadonlyAssignment_6_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:951:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:951:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:952:1: 'false'
                    {
                     before(grammarAccess.getCollectionDialogueAccess().getFalseKeyword_6_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__CollectionDialogue__Alternatives_6_12029); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:964:1: rule__MasterDetail__Alternatives_5_1 : ( ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) ) | ( 'false' ) );
    public final void rule__MasterDetail__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:968:1: ( ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) ) | ( 'false' ) )
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
                    new NoViableAltException("964:1: rule__MasterDetail__Alternatives_5_1 : ( ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) ) | ( 'false' ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:969:1: ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:969:1: ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:970:1: ( rule__MasterDetail__ReadonlyAssignment_5_1_0 )
                    {
                     before(grammarAccess.getMasterDetailAccess().getReadonlyAssignment_5_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:971:1: ( rule__MasterDetail__ReadonlyAssignment_5_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:971:2: rule__MasterDetail__ReadonlyAssignment_5_1_0
                    {
                    pushFollow(FOLLOW_rule__MasterDetail__ReadonlyAssignment_5_1_0_in_rule__MasterDetail__Alternatives_5_12063);
                    rule__MasterDetail__ReadonlyAssignment_5_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getMasterDetailAccess().getReadonlyAssignment_5_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:975:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:975:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:976:1: 'false'
                    {
                     before(grammarAccess.getMasterDetailAccess().getFalseKeyword_5_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__MasterDetail__Alternatives_5_12082); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:988:1: rule__Process__Alternatives_2 : ( ( ( rule__Process__TypeAssignment_2_0 ) ) | ( ( rule__Process__Group_2_1__0 ) ) );
    public final void rule__Process__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:992:1: ( ( ( rule__Process__TypeAssignment_2_0 ) ) | ( ( rule__Process__Group_2_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=14 && LA8_0<=20)) ) {
                alt8=1;
            }
            else if ( (LA8_0==11) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("988:1: rule__Process__Alternatives_2 : ( ( ( rule__Process__TypeAssignment_2_0 ) ) | ( ( rule__Process__Group_2_1__0 ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:993:1: ( ( rule__Process__TypeAssignment_2_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:993:1: ( ( rule__Process__TypeAssignment_2_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:994:1: ( rule__Process__TypeAssignment_2_0 )
                    {
                     before(grammarAccess.getProcessAccess().getTypeAssignment_2_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:995:1: ( rule__Process__TypeAssignment_2_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:995:2: rule__Process__TypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Process__TypeAssignment_2_0_in_rule__Process__Alternatives_22116);
                    rule__Process__TypeAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getProcessAccess().getTypeAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:999:6: ( ( rule__Process__Group_2_1__0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:999:6: ( ( rule__Process__Group_2_1__0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1000:1: ( rule__Process__Group_2_1__0 )
                    {
                     before(grammarAccess.getProcessAccess().getGroup_2_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1001:1: ( rule__Process__Group_2_1__0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1001:2: rule__Process__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Process__Group_2_1__0_in_rule__Process__Alternatives_22134);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1010:1: rule__Process__Alternatives_7 : ( ( ';' ) | ( ( rule__Process__Group_7_1__0 ) ) );
    public final void rule__Process__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1014:1: ( ( ';' ) | ( ( rule__Process__Group_7_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1010:1: rule__Process__Alternatives_7 : ( ( ';' ) | ( ( rule__Process__Group_7_1__0 ) ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1015:1: ( ';' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1015:1: ( ';' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1016:1: ';'
                    {
                     before(grammarAccess.getProcessAccess().getSemicolonKeyword_7_0()); 
                    match(input,13,FOLLOW_13_in_rule__Process__Alternatives_72168); 
                     after(grammarAccess.getProcessAccess().getSemicolonKeyword_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1023:6: ( ( rule__Process__Group_7_1__0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1023:6: ( ( rule__Process__Group_7_1__0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1024:1: ( rule__Process__Group_7_1__0 )
                    {
                     before(grammarAccess.getProcessAccess().getGroup_7_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1025:1: ( rule__Process__Group_7_1__0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1025:2: rule__Process__Group_7_1__0
                    {
                    pushFollow(FOLLOW_rule__Process__Group_7_1__0_in_rule__Process__Alternatives_72187);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1034:1: rule__FormElement__Alternatives_4_1 : ( ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) ) | ( 'false' ) );
    public final void rule__FormElement__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1038:1: ( ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) ) | ( 'false' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==52) ) {
                alt10=1;
            }
            else if ( (LA10_0==12) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1034:1: rule__FormElement__Alternatives_4_1 : ( ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) ) | ( 'false' ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1039:1: ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1039:1: ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1040:1: ( rule__FormElement__ReadonlyAssignment_4_1_0 )
                    {
                     before(grammarAccess.getFormElementAccess().getReadonlyAssignment_4_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1041:1: ( rule__FormElement__ReadonlyAssignment_4_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1041:2: rule__FormElement__ReadonlyAssignment_4_1_0
                    {
                    pushFollow(FOLLOW_rule__FormElement__ReadonlyAssignment_4_1_0_in_rule__FormElement__Alternatives_4_12220);
                    rule__FormElement__ReadonlyAssignment_4_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getFormElementAccess().getReadonlyAssignment_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1045:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1045:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1046:1: 'false'
                    {
                     before(grammarAccess.getFormElementAccess().getFalseKeyword_4_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__FormElement__Alternatives_4_12239); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1058:1: rule__Expression__Alternatives : ( ( ruleServiceExpression ) | ( ruleNavigationExpression ) | ( ruleStandardExpression ) | ( ruleOperationExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1062:1: ( ( ruleServiceExpression ) | ( ruleNavigationExpression ) | ( ruleStandardExpression ) | ( ruleOperationExpression ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt11=1;
                }
                break;
            case 50:
            case 53:
                {
                alt11=2;
                }
                break;
            case 21:
            case 22:
                {
                alt11=3;
                }
                break;
            case 47:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1058:1: rule__Expression__Alternatives : ( ( ruleServiceExpression ) | ( ruleNavigationExpression ) | ( ruleStandardExpression ) | ( ruleOperationExpression ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1063:1: ( ruleServiceExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1063:1: ( ruleServiceExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1064:1: ruleServiceExpression
                    {
                     before(grammarAccess.getExpressionAccess().getServiceExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleServiceExpression_in_rule__Expression__Alternatives2273);
                    ruleServiceExpression();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getServiceExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1069:6: ( ruleNavigationExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1069:6: ( ruleNavigationExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1070:1: ruleNavigationExpression
                    {
                     before(grammarAccess.getExpressionAccess().getNavigationExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNavigationExpression_in_rule__Expression__Alternatives2290);
                    ruleNavigationExpression();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getNavigationExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1075:6: ( ruleStandardExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1075:6: ( ruleStandardExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1076:1: ruleStandardExpression
                    {
                     before(grammarAccess.getExpressionAccess().getStandardExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStandardExpression_in_rule__Expression__Alternatives2307);
                    ruleStandardExpression();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getStandardExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1081:6: ( ruleOperationExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1081:6: ( ruleOperationExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1082:1: ruleOperationExpression
                    {
                     before(grammarAccess.getExpressionAccess().getOperationExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleOperationExpression_in_rule__Expression__Alternatives2324);
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


    // $ANTLR start rule__UIModelElementCall__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );
    public final void rule__UIModelElementCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1096:1: ( ( ruleDialogueCall ) | ( ruleProcessCall ) )
            int alt12=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==43) ) {
                    switch ( input.LA(3) ) {
                    case 44:
                        {
                        int LA12_2 = input.LA(4);

                        if ( (LA12_2==45) ) {
                            int LA12_12 = input.LA(5);

                            if ( (LA12_12==47) ) {
                                int LA12_16 = input.LA(6);

                                if ( (LA12_16==RULE_ID) ) {
                                    int LA12_18 = input.LA(7);

                                    if ( (LA12_18==46) ) {
                                        switch ( input.LA(8) ) {
                                        case 48:
                                            {
                                            int LA12_3 = input.LA(9);

                                            if ( (LA12_3==RULE_ID) ) {
                                                int LA12_13 = input.LA(10);

                                                if ( (LA12_13==49) ) {
                                                    int LA12_17 = input.LA(11);

                                                    if ( (LA12_17==RULE_ID) ) {
                                                        int LA12_19 = input.LA(12);

                                                        if ( (LA12_19==29) ) {
                                                            alt12=1;
                                                        }
                                                        else if ( (LA12_19==41) ) {
                                                            alt12=2;
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 19, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 17, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 13, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 3, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 53:
                                            {
                                            int LA12_4 = input.LA(9);

                                            if ( (LA12_4==50) ) {
                                                int LA12_5 = input.LA(10);

                                                if ( (LA12_5==RULE_ID) ) {
                                                    int LA12_14 = input.LA(11);

                                                    if ( (LA12_14==41) ) {
                                                        alt12=2;
                                                    }
                                                    else if ( (LA12_14==29) ) {
                                                        alt12=1;
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 14, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 5, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 4, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 50:
                                            {
                                            int LA12_5 = input.LA(9);

                                            if ( (LA12_5==RULE_ID) ) {
                                                int LA12_14 = input.LA(10);

                                                if ( (LA12_14==41) ) {
                                                    alt12=2;
                                                }
                                                else if ( (LA12_14==29) ) {
                                                    alt12=1;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 14, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 5, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 21:
                                            {
                                            int LA12_6 = input.LA(9);

                                            if ( (LA12_6==29) ) {
                                                alt12=1;
                                            }
                                            else if ( (LA12_6==41) ) {
                                                alt12=2;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 6, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 22:
                                            {
                                            int LA12_7 = input.LA(9);

                                            if ( (LA12_7==29) ) {
                                                alt12=1;
                                            }
                                            else if ( (LA12_7==41) ) {
                                                alt12=2;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 7, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 47:
                                            {
                                            int LA12_8 = input.LA(9);

                                            if ( (LA12_8==RULE_ID) ) {
                                                int LA12_15 = input.LA(10);

                                                if ( (LA12_15==29) ) {
                                                    alt12=1;
                                                }
                                                else if ( (LA12_15==41) ) {
                                                    alt12=2;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 15, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 8, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 29:
                                            {
                                            alt12=1;
                                            }
                                            break;
                                        case 41:
                                            {
                                            alt12=2;
                                            }
                                            break;
                                        default:
                                            NoViableAltException nvae =
                                                new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 20, input);

                                            throw nvae;
                                        }

                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 18, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 16, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 12, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 48:
                        {
                        int LA12_3 = input.LA(4);

                        if ( (LA12_3==RULE_ID) ) {
                            int LA12_13 = input.LA(5);

                            if ( (LA12_13==49) ) {
                                int LA12_17 = input.LA(6);

                                if ( (LA12_17==RULE_ID) ) {
                                    int LA12_19 = input.LA(7);

                                    if ( (LA12_19==29) ) {
                                        alt12=1;
                                    }
                                    else if ( (LA12_19==41) ) {
                                        alt12=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 19, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 17, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 13, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 53:
                        {
                        int LA12_4 = input.LA(4);

                        if ( (LA12_4==50) ) {
                            int LA12_5 = input.LA(5);

                            if ( (LA12_5==RULE_ID) ) {
                                int LA12_14 = input.LA(6);

                                if ( (LA12_14==41) ) {
                                    alt12=2;
                                }
                                else if ( (LA12_14==29) ) {
                                    alt12=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 14, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 50:
                        {
                        int LA12_5 = input.LA(4);

                        if ( (LA12_5==RULE_ID) ) {
                            int LA12_14 = input.LA(5);

                            if ( (LA12_14==41) ) {
                                alt12=2;
                            }
                            else if ( (LA12_14==29) ) {
                                alt12=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 14, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 21:
                        {
                        int LA12_6 = input.LA(4);

                        if ( (LA12_6==29) ) {
                            alt12=1;
                        }
                        else if ( (LA12_6==41) ) {
                            alt12=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 22:
                        {
                        int LA12_7 = input.LA(4);

                        if ( (LA12_7==29) ) {
                            alt12=1;
                        }
                        else if ( (LA12_7==41) ) {
                            alt12=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 47:
                        {
                        int LA12_8 = input.LA(4);

                        if ( (LA12_8==RULE_ID) ) {
                            int LA12_15 = input.LA(5);

                            if ( (LA12_15==29) ) {
                                alt12=1;
                            }
                            else if ( (LA12_15==41) ) {
                                alt12=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 29:
                        {
                        alt12=1;
                        }
                        break;
                    case 41:
                        {
                        alt12=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 11, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==45) ) {
                    int LA12_12 = input.LA(3);

                    if ( (LA12_12==47) ) {
                        int LA12_16 = input.LA(4);

                        if ( (LA12_16==RULE_ID) ) {
                            int LA12_18 = input.LA(5);

                            if ( (LA12_18==46) ) {
                                switch ( input.LA(6) ) {
                                case 48:
                                    {
                                    int LA12_3 = input.LA(7);

                                    if ( (LA12_3==RULE_ID) ) {
                                        int LA12_13 = input.LA(8);

                                        if ( (LA12_13==49) ) {
                                            int LA12_17 = input.LA(9);

                                            if ( (LA12_17==RULE_ID) ) {
                                                int LA12_19 = input.LA(10);

                                                if ( (LA12_19==29) ) {
                                                    alt12=1;
                                                }
                                                else if ( (LA12_19==41) ) {
                                                    alt12=2;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 19, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 17, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 13, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 3, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 53:
                                    {
                                    int LA12_4 = input.LA(7);

                                    if ( (LA12_4==50) ) {
                                        int LA12_5 = input.LA(8);

                                        if ( (LA12_5==RULE_ID) ) {
                                            int LA12_14 = input.LA(9);

                                            if ( (LA12_14==41) ) {
                                                alt12=2;
                                            }
                                            else if ( (LA12_14==29) ) {
                                                alt12=1;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 14, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 5, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 4, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 50:
                                    {
                                    int LA12_5 = input.LA(7);

                                    if ( (LA12_5==RULE_ID) ) {
                                        int LA12_14 = input.LA(8);

                                        if ( (LA12_14==41) ) {
                                            alt12=2;
                                        }
                                        else if ( (LA12_14==29) ) {
                                            alt12=1;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 14, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 5, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 21:
                                    {
                                    int LA12_6 = input.LA(7);

                                    if ( (LA12_6==29) ) {
                                        alt12=1;
                                    }
                                    else if ( (LA12_6==41) ) {
                                        alt12=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 6, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 22:
                                    {
                                    int LA12_7 = input.LA(7);

                                    if ( (LA12_7==29) ) {
                                        alt12=1;
                                    }
                                    else if ( (LA12_7==41) ) {
                                        alt12=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 7, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 47:
                                    {
                                    int LA12_8 = input.LA(7);

                                    if ( (LA12_8==RULE_ID) ) {
                                        int LA12_15 = input.LA(8);

                                        if ( (LA12_15==29) ) {
                                            alt12=1;
                                        }
                                        else if ( (LA12_15==41) ) {
                                            alt12=2;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 15, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 8, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 29:
                                    {
                                    alt12=1;
                                    }
                                    break;
                                case 41:
                                    {
                                    alt12=2;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 20, input);

                                    throw nvae;
                                }

                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 18, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 12, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA12_3 = input.LA(2);

                if ( (LA12_3==RULE_ID) ) {
                    int LA12_13 = input.LA(3);

                    if ( (LA12_13==49) ) {
                        int LA12_17 = input.LA(4);

                        if ( (LA12_17==RULE_ID) ) {
                            int LA12_19 = input.LA(5);

                            if ( (LA12_19==29) ) {
                                alt12=1;
                            }
                            else if ( (LA12_19==41) ) {
                                alt12=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 19, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 17, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 13, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 3, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                int LA12_4 = input.LA(2);

                if ( (LA12_4==50) ) {
                    int LA12_5 = input.LA(3);

                    if ( (LA12_5==RULE_ID) ) {
                        int LA12_14 = input.LA(4);

                        if ( (LA12_14==41) ) {
                            alt12=2;
                        }
                        else if ( (LA12_14==29) ) {
                            alt12=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 14, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 4, input);

                    throw nvae;
                }
                }
                break;
            case 50:
                {
                int LA12_5 = input.LA(2);

                if ( (LA12_5==RULE_ID) ) {
                    int LA12_14 = input.LA(3);

                    if ( (LA12_14==41) ) {
                        alt12=2;
                    }
                    else if ( (LA12_14==29) ) {
                        alt12=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 14, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 5, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA12_6 = input.LA(2);

                if ( (LA12_6==29) ) {
                    alt12=1;
                }
                else if ( (LA12_6==41) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 6, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                int LA12_7 = input.LA(2);

                if ( (LA12_7==29) ) {
                    alt12=1;
                }
                else if ( (LA12_7==41) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 7, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA12_8 = input.LA(2);

                if ( (LA12_8==RULE_ID) ) {
                    int LA12_15 = input.LA(3);

                    if ( (LA12_15==29) ) {
                        alt12=1;
                    }
                    else if ( (LA12_15==41) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 15, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 8, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                alt12=1;
                }
                break;
            case 41:
                {
                alt12=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1092:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1097:1: ( ruleDialogueCall )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1097:1: ( ruleDialogueCall )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1098:1: ruleDialogueCall
                    {
                     before(grammarAccess.getUIModelElementCallAccess().getDialogueCallParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDialogueCall_in_rule__UIModelElementCall__Alternatives2356);
                    ruleDialogueCall();
                    _fsp--;

                     after(grammarAccess.getUIModelElementCallAccess().getDialogueCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1103:6: ( ruleProcessCall )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1103:6: ( ruleProcessCall )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1104:1: ruleProcessCall
                    {
                     before(grammarAccess.getUIModelElementCallAccess().getProcessCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleProcessCall_in_rule__UIModelElementCall__Alternatives2373);
                    ruleProcessCall();
                    _fsp--;

                     after(grammarAccess.getUIModelElementCallAccess().getProcessCallParserRuleCall_1()); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1114:1: rule__ProcessType__Alternatives : ( ( ( 'new' ) ) | ( ( 'save' ) ) | ( ( 'edit' ) ) | ( ( 'delete' ) ) | ( ( 'cancel' ) ) | ( ( 'removefrom' ) ) | ( ( 'addto' ) ) );
    public final void rule__ProcessType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1118:1: ( ( ( 'new' ) ) | ( ( 'save' ) ) | ( ( 'edit' ) ) | ( ( 'delete' ) ) | ( ( 'cancel' ) ) | ( ( 'removefrom' ) ) | ( ( 'addto' ) ) )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt13=1;
                }
                break;
            case 15:
                {
                alt13=2;
                }
                break;
            case 16:
                {
                alt13=3;
                }
                break;
            case 17:
                {
                alt13=4;
                }
                break;
            case 18:
                {
                alt13=5;
                }
                break;
            case 19:
                {
                alt13=6;
                }
                break;
            case 20:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1114:1: rule__ProcessType__Alternatives : ( ( ( 'new' ) ) | ( ( 'save' ) ) | ( ( 'edit' ) ) | ( ( 'delete' ) ) | ( ( 'cancel' ) ) | ( ( 'removefrom' ) ) | ( ( 'addto' ) ) );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1119:1: ( ( 'new' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1119:1: ( ( 'new' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1120:1: ( 'new' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1121:1: ( 'new' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1121:3: 'new'
                    {
                    match(input,14,FOLLOW_14_in_rule__ProcessType__Alternatives2406); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1126:6: ( ( 'save' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1126:6: ( ( 'save' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1127:1: ( 'save' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1128:1: ( 'save' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1128:3: 'save'
                    {
                    match(input,15,FOLLOW_15_in_rule__ProcessType__Alternatives2427); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1133:6: ( ( 'edit' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1133:6: ( ( 'edit' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1134:1: ( 'edit' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1135:1: ( 'edit' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1135:3: 'edit'
                    {
                    match(input,16,FOLLOW_16_in_rule__ProcessType__Alternatives2448); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1140:6: ( ( 'delete' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1140:6: ( ( 'delete' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1141:1: ( 'delete' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1142:1: ( 'delete' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1142:3: 'delete'
                    {
                    match(input,17,FOLLOW_17_in_rule__ProcessType__Alternatives2469); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getDELETEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1147:6: ( ( 'cancel' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1147:6: ( ( 'cancel' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1148:1: ( 'cancel' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getCANCELEnumLiteralDeclaration_4()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1149:1: ( 'cancel' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1149:3: 'cancel'
                    {
                    match(input,18,FOLLOW_18_in_rule__ProcessType__Alternatives2490); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getCANCELEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1154:6: ( ( 'removefrom' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1154:6: ( ( 'removefrom' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1155:1: ( 'removefrom' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getREMOVEFROMEnumLiteralDeclaration_5()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1156:1: ( 'removefrom' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1156:3: 'removefrom'
                    {
                    match(input,19,FOLLOW_19_in_rule__ProcessType__Alternatives2511); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getREMOVEFROMEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1161:6: ( ( 'addto' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1161:6: ( ( 'addto' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1162:1: ( 'addto' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getADDTOEnumLiteralDeclaration_6()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1163:1: ( 'addto' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1163:3: 'addto'
                    {
                    match(input,20,FOLLOW_20_in_rule__ProcessType__Alternatives2532); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1173:1: rule__ExpressionType__Alternatives : ( ( ( 'all' ) ) | ( ( 'find' ) ) );
    public final void rule__ExpressionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1177:1: ( ( ( 'all' ) ) | ( ( 'find' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            else if ( (LA14_0==22) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1173:1: rule__ExpressionType__Alternatives : ( ( ( 'all' ) ) | ( ( 'find' ) ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1178:1: ( ( 'all' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1178:1: ( ( 'all' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1179:1: ( 'all' )
                    {
                     before(grammarAccess.getExpressionTypeAccess().getALLEnumLiteralDeclaration_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1180:1: ( 'all' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1180:3: 'all'
                    {
                    match(input,21,FOLLOW_21_in_rule__ExpressionType__Alternatives2568); 

                    }

                     after(grammarAccess.getExpressionTypeAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1185:6: ( ( 'find' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1185:6: ( ( 'find' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1186:1: ( 'find' )
                    {
                     before(grammarAccess.getExpressionTypeAccess().getFINDEnumLiteralDeclaration_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1187:1: ( 'find' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1187:3: 'find'
                    {
                    match(input,22,FOLLOW_22_in_rule__ExpressionType__Alternatives2589); 

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


    // $ANTLR start rule__PresentationModel__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1199:1: rule__PresentationModel__Group__0 : ( ( rule__PresentationModel__DescriptionAssignment_0 )? ) rule__PresentationModel__Group__1 ;
    public final void rule__PresentationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1203:1: ( ( ( rule__PresentationModel__DescriptionAssignment_0 )? ) rule__PresentationModel__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1204:1: ( ( rule__PresentationModel__DescriptionAssignment_0 )? ) rule__PresentationModel__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1204:1: ( ( rule__PresentationModel__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1205:1: ( rule__PresentationModel__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getPresentationModelAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1206:1: ( rule__PresentationModel__DescriptionAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1206:2: rule__PresentationModel__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PresentationModel__DescriptionAssignment_0_in_rule__PresentationModel__Group__02626);
                    rule__PresentationModel__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentationModelAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__1_in_rule__PresentationModel__Group__02636);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1217:1: rule__PresentationModel__Group__1 : ( 'presentation' ) rule__PresentationModel__Group__2 ;
    public final void rule__PresentationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1221:1: ( ( 'presentation' ) rule__PresentationModel__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1222:1: ( 'presentation' ) rule__PresentationModel__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1222:1: ( 'presentation' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1223:1: 'presentation'
            {
             before(grammarAccess.getPresentationModelAccess().getPresentationKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__PresentationModel__Group__12665); 
             after(grammarAccess.getPresentationModelAccess().getPresentationKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__2_in_rule__PresentationModel__Group__12675);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1237:1: rule__PresentationModel__Group__2 : ( ( rule__PresentationModel__NameAssignment_2 ) ) rule__PresentationModel__Group__3 ;
    public final void rule__PresentationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1241:1: ( ( ( rule__PresentationModel__NameAssignment_2 ) ) rule__PresentationModel__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1242:1: ( ( rule__PresentationModel__NameAssignment_2 ) ) rule__PresentationModel__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1242:1: ( ( rule__PresentationModel__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1243:1: ( rule__PresentationModel__NameAssignment_2 )
            {
             before(grammarAccess.getPresentationModelAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1244:1: ( rule__PresentationModel__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1244:2: rule__PresentationModel__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PresentationModel__NameAssignment_2_in_rule__PresentationModel__Group__22703);
            rule__PresentationModel__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPresentationModelAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__3_in_rule__PresentationModel__Group__22712);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1255:1: rule__PresentationModel__Group__3 : ( ';' ) rule__PresentationModel__Group__4 ;
    public final void rule__PresentationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1259:1: ( ( ';' ) rule__PresentationModel__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1260:1: ( ';' ) rule__PresentationModel__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1260:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1261:1: ';'
            {
             before(grammarAccess.getPresentationModelAccess().getSemicolonKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__PresentationModel__Group__32741); 
             after(grammarAccess.getPresentationModelAccess().getSemicolonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__4_in_rule__PresentationModel__Group__32751);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1275:1: rule__PresentationModel__Group__4 : ( ( rule__PresentationModel__ExternalReferencesAssignment_4 )* ) rule__PresentationModel__Group__5 ;
    public final void rule__PresentationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1279:1: ( ( ( rule__PresentationModel__ExternalReferencesAssignment_4 )* ) rule__PresentationModel__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1280:1: ( ( rule__PresentationModel__ExternalReferencesAssignment_4 )* ) rule__PresentationModel__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1280:1: ( ( rule__PresentationModel__ExternalReferencesAssignment_4 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1281:1: ( rule__PresentationModel__ExternalReferencesAssignment_4 )*
            {
             before(grammarAccess.getPresentationModelAccess().getExternalReferencesAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1282:1: ( rule__PresentationModel__ExternalReferencesAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1282:2: rule__PresentationModel__ExternalReferencesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__PresentationModel__ExternalReferencesAssignment_4_in_rule__PresentationModel__Group__42779);
            	    rule__PresentationModel__ExternalReferencesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPresentationModelAccess().getExternalReferencesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__5_in_rule__PresentationModel__Group__42789);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1293:1: rule__PresentationModel__Group__5 : ( ( rule__PresentationModel__StartAssignment_5 )? ) rule__PresentationModel__Group__6 ;
    public final void rule__PresentationModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1297:1: ( ( ( rule__PresentationModel__StartAssignment_5 )? ) rule__PresentationModel__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1298:1: ( ( rule__PresentationModel__StartAssignment_5 )? ) rule__PresentationModel__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1298:1: ( ( rule__PresentationModel__StartAssignment_5 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1299:1: ( rule__PresentationModel__StartAssignment_5 )?
            {
             before(grammarAccess.getPresentationModelAccess().getStartAssignment_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1300:1: ( rule__PresentationModel__StartAssignment_5 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1300:2: rule__PresentationModel__StartAssignment_5
                    {
                    pushFollow(FOLLOW_rule__PresentationModel__StartAssignment_5_in_rule__PresentationModel__Group__52817);
                    rule__PresentationModel__StartAssignment_5();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentationModelAccess().getStartAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__6_in_rule__PresentationModel__Group__52827);
            rule__PresentationModel__Group__6();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__PresentationModel__Group__6
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1311:1: rule__PresentationModel__Group__6 : ( ( rule__PresentationModel__ElementsAssignment_6 )* ) ;
    public final void rule__PresentationModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1315:1: ( ( ( rule__PresentationModel__ElementsAssignment_6 )* ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1316:1: ( ( rule__PresentationModel__ElementsAssignment_6 )* )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1316:1: ( ( rule__PresentationModel__ElementsAssignment_6 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1317:1: ( rule__PresentationModel__ElementsAssignment_6 )*
            {
             before(grammarAccess.getPresentationModelAccess().getElementsAssignment_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1318:1: ( rule__PresentationModel__ElementsAssignment_6 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STRING||LA18_0==29||LA18_0==35||(LA18_0>=37 && LA18_0<=38)||LA18_0==41) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1318:2: rule__PresentationModel__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__PresentationModel__ElementsAssignment_6_in_rule__PresentationModel__Group__62855);
            	    rule__PresentationModel__ElementsAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getPresentationModelAccess().getElementsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PresentationModel__Group__6


    // $ANTLR start rule__Application__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1342:1: rule__Application__Group__0 : ( 'application' ) rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1346:1: ( ( 'application' ) rule__Application__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1347:1: ( 'application' ) rule__Application__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1347:1: ( 'application' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1348:1: 'application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Application__Group__02905); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Application__Group__1_in_rule__Application__Group__02915);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1362:1: rule__Application__Group__1 : ( '[' ) rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1366:1: ( ( '[' ) rule__Application__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1367:1: ( '[' ) rule__Application__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1367:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1368:1: '['
            {
             before(grammarAccess.getApplicationAccess().getLeftSquareBracketKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Application__Group__12944); 
             after(grammarAccess.getApplicationAccess().getLeftSquareBracketKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Application__Group__2_in_rule__Application__Group__12954);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1382:1: rule__Application__Group__2 : ( ( ( rule__Application__Group_2__0 ) ) ( ( rule__Application__Group_2__0 )* ) ) rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1386:1: ( ( ( ( rule__Application__Group_2__0 ) ) ( ( rule__Application__Group_2__0 )* ) ) rule__Application__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1387:1: ( ( ( rule__Application__Group_2__0 ) ) ( ( rule__Application__Group_2__0 )* ) ) rule__Application__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1387:1: ( ( ( rule__Application__Group_2__0 ) ) ( ( rule__Application__Group_2__0 )* ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1388:1: ( ( rule__Application__Group_2__0 ) ) ( ( rule__Application__Group_2__0 )* )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1388:1: ( ( rule__Application__Group_2__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1389:1: ( rule__Application__Group_2__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1390:1: ( rule__Application__Group_2__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1390:2: rule__Application__Group_2__0
            {
            pushFollow(FOLLOW_rule__Application__Group_2__0_in_rule__Application__Group__22984);
            rule__Application__Group_2__0();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup_2()); 

            }

            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1393:1: ( ( rule__Application__Group_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1394:1: ( rule__Application__Group_2__0 )*
            {
             before(grammarAccess.getApplicationAccess().getGroup_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1395:1: ( rule__Application__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1395:2: rule__Application__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Application__Group_2__0_in_rule__Application__Group__22996);
            	    rule__Application__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getGroup_2()); 

            }


            }

            pushFollow(FOLLOW_rule__Application__Group__3_in_rule__Application__Group__23008);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1407:1: rule__Application__Group__3 : ( ']' ) ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1411:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1412:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1412:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1413:1: ']'
            {
             before(grammarAccess.getApplicationAccess().getRightSquareBracketKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Application__Group__33037); 
             after(grammarAccess.getApplicationAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start rule__Application__Group_2__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1434:1: rule__Application__Group_2__0 : ( ( rule__Application__StartProcessesAssignment_2_0 ) ) rule__Application__Group_2__1 ;
    public final void rule__Application__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1438:1: ( ( ( rule__Application__StartProcessesAssignment_2_0 ) ) rule__Application__Group_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1439:1: ( ( rule__Application__StartProcessesAssignment_2_0 ) ) rule__Application__Group_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1439:1: ( ( rule__Application__StartProcessesAssignment_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1440:1: ( rule__Application__StartProcessesAssignment_2_0 )
            {
             before(grammarAccess.getApplicationAccess().getStartProcessesAssignment_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1441:1: ( rule__Application__StartProcessesAssignment_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1441:2: rule__Application__StartProcessesAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Application__StartProcessesAssignment_2_0_in_rule__Application__Group_2__03080);
            rule__Application__StartProcessesAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getStartProcessesAssignment_2_0()); 

            }

            pushFollow(FOLLOW_rule__Application__Group_2__1_in_rule__Application__Group_2__03089);
            rule__Application__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group_2__0


    // $ANTLR start rule__Application__Group_2__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1452:1: rule__Application__Group_2__1 : ( ';' ) ;
    public final void rule__Application__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1456:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1457:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1457:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1458:1: ';'
            {
             before(grammarAccess.getApplicationAccess().getSemicolonKeyword_2_1()); 
            match(input,13,FOLLOW_13_in_rule__Application__Group_2__13118); 
             after(grammarAccess.getApplicationAccess().getSemicolonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group_2__1


    // $ANTLR start rule__ExternalReference__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1475:1: rule__ExternalReference__Group__0 : ( 'from' ) rule__ExternalReference__Group__1 ;
    public final void rule__ExternalReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1479:1: ( ( 'from' ) rule__ExternalReference__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1480:1: ( 'from' ) rule__ExternalReference__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1480:1: ( 'from' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1481:1: 'from'
            {
             before(grammarAccess.getExternalReferenceAccess().getFromKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__ExternalReference__Group__03158); 
             after(grammarAccess.getExternalReferenceAccess().getFromKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__1_in_rule__ExternalReference__Group__03168);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1495:1: rule__ExternalReference__Group__1 : ( ( rule__ExternalReference__ModelNameAssignment_1 ) ) rule__ExternalReference__Group__2 ;
    public final void rule__ExternalReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1499:1: ( ( ( rule__ExternalReference__ModelNameAssignment_1 ) ) rule__ExternalReference__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1500:1: ( ( rule__ExternalReference__ModelNameAssignment_1 ) ) rule__ExternalReference__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1500:1: ( ( rule__ExternalReference__ModelNameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1501:1: ( rule__ExternalReference__ModelNameAssignment_1 )
            {
             before(grammarAccess.getExternalReferenceAccess().getModelNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1502:1: ( rule__ExternalReference__ModelNameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1502:2: rule__ExternalReference__ModelNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalReference__ModelNameAssignment_1_in_rule__ExternalReference__Group__13196);
            rule__ExternalReference__ModelNameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getModelNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__2_in_rule__ExternalReference__Group__13205);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1513:1: rule__ExternalReference__Group__2 : ( 'import' ) rule__ExternalReference__Group__3 ;
    public final void rule__ExternalReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1517:1: ( ( 'import' ) rule__ExternalReference__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1518:1: ( 'import' ) rule__ExternalReference__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1518:1: ( 'import' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1519:1: 'import'
            {
             before(grammarAccess.getExternalReferenceAccess().getImportKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__ExternalReference__Group__23234); 
             after(grammarAccess.getExternalReferenceAccess().getImportKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__3_in_rule__ExternalReference__Group__23244);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1533:1: rule__ExternalReference__Group__3 : ( ( rule__ExternalReference__NameAssignment_3 ) ) rule__ExternalReference__Group__4 ;
    public final void rule__ExternalReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1537:1: ( ( ( rule__ExternalReference__NameAssignment_3 ) ) rule__ExternalReference__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1538:1: ( ( rule__ExternalReference__NameAssignment_3 ) ) rule__ExternalReference__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1538:1: ( ( rule__ExternalReference__NameAssignment_3 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1539:1: ( rule__ExternalReference__NameAssignment_3 )
            {
             before(grammarAccess.getExternalReferenceAccess().getNameAssignment_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1540:1: ( rule__ExternalReference__NameAssignment_3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1540:2: rule__ExternalReference__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ExternalReference__NameAssignment_3_in_rule__ExternalReference__Group__33272);
            rule__ExternalReference__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getNameAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__4_in_rule__ExternalReference__Group__33281);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1551:1: rule__ExternalReference__Group__4 : ( ';' ) ;
    public final void rule__ExternalReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1555:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1556:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1556:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1557:1: ';'
            {
             before(grammarAccess.getExternalReferenceAccess().getSemicolonKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__ExternalReference__Group__43310); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1580:1: rule__ContentForm__Group__0 : ( ( rule__ContentForm__DescriptionAssignment_0 )? ) rule__ContentForm__Group__1 ;
    public final void rule__ContentForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1584:1: ( ( ( rule__ContentForm__DescriptionAssignment_0 )? ) rule__ContentForm__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1585:1: ( ( rule__ContentForm__DescriptionAssignment_0 )? ) rule__ContentForm__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1585:1: ( ( rule__ContentForm__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1586:1: ( rule__ContentForm__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getContentFormAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1587:1: ( rule__ContentForm__DescriptionAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1587:2: rule__ContentForm__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__DescriptionAssignment_0_in_rule__ContentForm__Group__03355);
                    rule__ContentForm__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__1_in_rule__ContentForm__Group__03365);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1598:1: rule__ContentForm__Group__1 : ( 'form' ) rule__ContentForm__Group__2 ;
    public final void rule__ContentForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1602:1: ( ( 'form' ) rule__ContentForm__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1603:1: ( 'form' ) rule__ContentForm__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1603:1: ( 'form' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1604:1: 'form'
            {
             before(grammarAccess.getContentFormAccess().getFormKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__ContentForm__Group__13394); 
             after(grammarAccess.getContentFormAccess().getFormKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__2_in_rule__ContentForm__Group__13404);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1618:1: rule__ContentForm__Group__2 : ( ( rule__ContentForm__NameAssignment_2 ) ) rule__ContentForm__Group__3 ;
    public final void rule__ContentForm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1622:1: ( ( ( rule__ContentForm__NameAssignment_2 ) ) rule__ContentForm__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1623:1: ( ( rule__ContentForm__NameAssignment_2 ) ) rule__ContentForm__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1623:1: ( ( rule__ContentForm__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1624:1: ( rule__ContentForm__NameAssignment_2 )
            {
             before(grammarAccess.getContentFormAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1625:1: ( rule__ContentForm__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1625:2: rule__ContentForm__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ContentForm__NameAssignment_2_in_rule__ContentForm__Group__23432);
            rule__ContentForm__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__3_in_rule__ContentForm__Group__23441);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1636:1: rule__ContentForm__Group__3 : ( 'context' ) rule__ContentForm__Group__4 ;
    public final void rule__ContentForm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1640:1: ( ( 'context' ) rule__ContentForm__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1641:1: ( 'context' ) rule__ContentForm__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1641:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1642:1: 'context'
            {
             before(grammarAccess.getContentFormAccess().getContextKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__ContentForm__Group__33470); 
             after(grammarAccess.getContentFormAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__4_in_rule__ContentForm__Group__33480);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1656:1: rule__ContentForm__Group__4 : ( ( rule__ContentForm__CollectionContextAssignment_4 )? ) rule__ContentForm__Group__5 ;
    public final void rule__ContentForm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1660:1: ( ( ( rule__ContentForm__CollectionContextAssignment_4 )? ) rule__ContentForm__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1661:1: ( ( rule__ContentForm__CollectionContextAssignment_4 )? ) rule__ContentForm__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1661:1: ( ( rule__ContentForm__CollectionContextAssignment_4 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1662:1: ( rule__ContentForm__CollectionContextAssignment_4 )?
            {
             before(grammarAccess.getContentFormAccess().getCollectionContextAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1663:1: ( rule__ContentForm__CollectionContextAssignment_4 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==51) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1663:2: rule__ContentForm__CollectionContextAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ContentForm__CollectionContextAssignment_4_in_rule__ContentForm__Group__43508);
                    rule__ContentForm__CollectionContextAssignment_4();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getCollectionContextAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__5_in_rule__ContentForm__Group__43518);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1674:1: rule__ContentForm__Group__5 : ( ( rule__ContentForm__ContextRefAssignment_5 ) ) rule__ContentForm__Group__6 ;
    public final void rule__ContentForm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1678:1: ( ( ( rule__ContentForm__ContextRefAssignment_5 ) ) rule__ContentForm__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1679:1: ( ( rule__ContentForm__ContextRefAssignment_5 ) ) rule__ContentForm__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1679:1: ( ( rule__ContentForm__ContextRefAssignment_5 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1680:1: ( rule__ContentForm__ContextRefAssignment_5 )
            {
             before(grammarAccess.getContentFormAccess().getContextRefAssignment_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1681:1: ( rule__ContentForm__ContextRefAssignment_5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1681:2: rule__ContentForm__ContextRefAssignment_5
            {
            pushFollow(FOLLOW_rule__ContentForm__ContextRefAssignment_5_in_rule__ContentForm__Group__53546);
            rule__ContentForm__ContextRefAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getContextRefAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__6_in_rule__ContentForm__Group__53555);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1692:1: rule__ContentForm__Group__6 : ( '[' ) rule__ContentForm__Group__7 ;
    public final void rule__ContentForm__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1696:1: ( ( '[' ) rule__ContentForm__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1697:1: ( '[' ) rule__ContentForm__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1697:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1698:1: '['
            {
             before(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__ContentForm__Group__63584); 
             after(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__7_in_rule__ContentForm__Group__63594);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1712:1: rule__ContentForm__Group__7 : ( ( rule__ContentForm__Group_7__0 )? ) rule__ContentForm__Group__8 ;
    public final void rule__ContentForm__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1716:1: ( ( ( rule__ContentForm__Group_7__0 )? ) rule__ContentForm__Group__8 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1717:1: ( ( rule__ContentForm__Group_7__0 )? ) rule__ContentForm__Group__8
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1717:1: ( ( rule__ContentForm__Group_7__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1718:1: ( rule__ContentForm__Group_7__0 )?
            {
             before(grammarAccess.getContentFormAccess().getGroup_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1719:1: ( rule__ContentForm__Group_7__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1719:2: rule__ContentForm__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__Group_7__0_in_rule__ContentForm__Group__73622);
                    rule__ContentForm__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getGroup_7()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__8_in_rule__ContentForm__Group__73632);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1730:1: rule__ContentForm__Group__8 : ( ( rule__ContentForm__FormElementsAssignment_8 )* ) rule__ContentForm__Group__9 ;
    public final void rule__ContentForm__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1734:1: ( ( ( rule__ContentForm__FormElementsAssignment_8 )* ) rule__ContentForm__Group__9 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1735:1: ( ( rule__ContentForm__FormElementsAssignment_8 )* ) rule__ContentForm__Group__9
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1735:1: ( ( rule__ContentForm__FormElementsAssignment_8 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1736:1: ( rule__ContentForm__FormElementsAssignment_8 )*
            {
             before(grammarAccess.getContentFormAccess().getFormElementsAssignment_8()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1737:1: ( rule__ContentForm__FormElementsAssignment_8 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_STRING||LA23_0==42) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1737:2: rule__ContentForm__FormElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__ContentForm__FormElementsAssignment_8_in_rule__ContentForm__Group__83660);
            	    rule__ContentForm__FormElementsAssignment_8();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getContentFormAccess().getFormElementsAssignment_8()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__9_in_rule__ContentForm__Group__83670);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1748:1: rule__ContentForm__Group__9 : ( ( rule__ContentForm__Group_9__0 )? ) rule__ContentForm__Group__10 ;
    public final void rule__ContentForm__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1752:1: ( ( ( rule__ContentForm__Group_9__0 )? ) rule__ContentForm__Group__10 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1753:1: ( ( rule__ContentForm__Group_9__0 )? ) rule__ContentForm__Group__10
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1753:1: ( ( rule__ContentForm__Group_9__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1754:1: ( rule__ContentForm__Group_9__0 )?
            {
             before(grammarAccess.getContentFormAccess().getGroup_9()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1755:1: ( rule__ContentForm__Group_9__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1755:2: rule__ContentForm__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__Group_9__0_in_rule__ContentForm__Group__93698);
                    rule__ContentForm__Group_9__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getGroup_9()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__10_in_rule__ContentForm__Group__93708);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1766:1: rule__ContentForm__Group__10 : ( ( rule__ContentForm__Group_10__0 )? ) rule__ContentForm__Group__11 ;
    public final void rule__ContentForm__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1770:1: ( ( ( rule__ContentForm__Group_10__0 )? ) rule__ContentForm__Group__11 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1771:1: ( ( rule__ContentForm__Group_10__0 )? ) rule__ContentForm__Group__11
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1771:1: ( ( rule__ContentForm__Group_10__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1772:1: ( rule__ContentForm__Group_10__0 )?
            {
             before(grammarAccess.getContentFormAccess().getGroup_10()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1773:1: ( rule__ContentForm__Group_10__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1773:2: rule__ContentForm__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__Group_10__0_in_rule__ContentForm__Group__103736);
                    rule__ContentForm__Group_10__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getGroup_10()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__11_in_rule__ContentForm__Group__103746);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1784:1: rule__ContentForm__Group__11 : ( ']' ) ;
    public final void rule__ContentForm__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1788:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1789:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1789:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1790:1: ']'
            {
             before(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_11()); 
            match(input,26,FOLLOW_26_in_rule__ContentForm__Group__113775); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1827:1: rule__ContentForm__Group_7__0 : ( 'readonly' ) rule__ContentForm__Group_7__1 ;
    public final void rule__ContentForm__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1831:1: ( ( 'readonly' ) rule__ContentForm__Group_7__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1832:1: ( 'readonly' ) rule__ContentForm__Group_7__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1832:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1833:1: 'readonly'
            {
             before(grammarAccess.getContentFormAccess().getReadonlyKeyword_7_0()); 
            match(input,31,FOLLOW_31_in_rule__ContentForm__Group_7__03835); 
             after(grammarAccess.getContentFormAccess().getReadonlyKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_7__1_in_rule__ContentForm__Group_7__03845);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1847:1: rule__ContentForm__Group_7__1 : ( ( rule__ContentForm__Alternatives_7_1 ) ) rule__ContentForm__Group_7__2 ;
    public final void rule__ContentForm__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1851:1: ( ( ( rule__ContentForm__Alternatives_7_1 ) ) rule__ContentForm__Group_7__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1852:1: ( ( rule__ContentForm__Alternatives_7_1 ) ) rule__ContentForm__Group_7__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1852:1: ( ( rule__ContentForm__Alternatives_7_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1853:1: ( rule__ContentForm__Alternatives_7_1 )
            {
             before(grammarAccess.getContentFormAccess().getAlternatives_7_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1854:1: ( rule__ContentForm__Alternatives_7_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1854:2: rule__ContentForm__Alternatives_7_1
            {
            pushFollow(FOLLOW_rule__ContentForm__Alternatives_7_1_in_rule__ContentForm__Group_7__13873);
            rule__ContentForm__Alternatives_7_1();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getAlternatives_7_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_7__2_in_rule__ContentForm__Group_7__13882);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1865:1: rule__ContentForm__Group_7__2 : ( ';' ) ;
    public final void rule__ContentForm__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1869:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1870:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1870:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1871:1: ';'
            {
             before(grammarAccess.getContentFormAccess().getSemicolonKeyword_7_2()); 
            match(input,13,FOLLOW_13_in_rule__ContentForm__Group_7__23911); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1890:1: rule__ContentForm__Group_9__0 : ( 'actions' ) rule__ContentForm__Group_9__1 ;
    public final void rule__ContentForm__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1894:1: ( ( 'actions' ) rule__ContentForm__Group_9__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1895:1: ( 'actions' ) rule__ContentForm__Group_9__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1895:1: ( 'actions' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1896:1: 'actions'
            {
             before(grammarAccess.getContentFormAccess().getActionsKeyword_9_0()); 
            match(input,32,FOLLOW_32_in_rule__ContentForm__Group_9__03953); 
             after(grammarAccess.getContentFormAccess().getActionsKeyword_9_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_9__1_in_rule__ContentForm__Group_9__03963);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1910:1: rule__ContentForm__Group_9__1 : ( '[' ) rule__ContentForm__Group_9__2 ;
    public final void rule__ContentForm__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1914:1: ( ( '[' ) rule__ContentForm__Group_9__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1915:1: ( '[' ) rule__ContentForm__Group_9__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1915:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1916:1: '['
            {
             before(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_9_1()); 
            match(input,25,FOLLOW_25_in_rule__ContentForm__Group_9__13992); 
             after(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_9_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_9__2_in_rule__ContentForm__Group_9__14002);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1930:1: rule__ContentForm__Group_9__2 : ( ( rule__ContentForm__Group_9_2__0 )* ) rule__ContentForm__Group_9__3 ;
    public final void rule__ContentForm__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1934:1: ( ( ( rule__ContentForm__Group_9_2__0 )* ) rule__ContentForm__Group_9__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1935:1: ( ( rule__ContentForm__Group_9_2__0 )* ) rule__ContentForm__Group_9__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1935:1: ( ( rule__ContentForm__Group_9_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1936:1: ( rule__ContentForm__Group_9_2__0 )*
            {
             before(grammarAccess.getContentFormAccess().getGroup_9_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1937:1: ( rule__ContentForm__Group_9_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)||(LA26_0>=14 && LA26_0<=20)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1937:2: rule__ContentForm__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ContentForm__Group_9_2__0_in_rule__ContentForm__Group_9__24030);
            	    rule__ContentForm__Group_9_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getContentFormAccess().getGroup_9_2()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_9__3_in_rule__ContentForm__Group_9__24040);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1948:1: rule__ContentForm__Group_9__3 : ( ']' ) ;
    public final void rule__ContentForm__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1952:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1953:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1953:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1954:1: ']'
            {
             before(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_9_3()); 
            match(input,26,FOLLOW_26_in_rule__ContentForm__Group_9__34069); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1975:1: rule__ContentForm__Group_9_2__0 : ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) ) rule__ContentForm__Group_9_2__1 ;
    public final void rule__ContentForm__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1979:1: ( ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) ) rule__ContentForm__Group_9_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1980:1: ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) ) rule__ContentForm__Group_9_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1980:1: ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1981:1: ( rule__ContentForm__ActionsAssignment_9_2_0 )
            {
             before(grammarAccess.getContentFormAccess().getActionsAssignment_9_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1982:1: ( rule__ContentForm__ActionsAssignment_9_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1982:2: rule__ContentForm__ActionsAssignment_9_2_0
            {
            pushFollow(FOLLOW_rule__ContentForm__ActionsAssignment_9_2_0_in_rule__ContentForm__Group_9_2__04112);
            rule__ContentForm__ActionsAssignment_9_2_0();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getActionsAssignment_9_2_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_9_2__1_in_rule__ContentForm__Group_9_2__04121);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1993:1: rule__ContentForm__Group_9_2__1 : ( ';' ) ;
    public final void rule__ContentForm__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1997:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1998:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1998:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1999:1: ';'
            {
             before(grammarAccess.getContentFormAccess().getSemicolonKeyword_9_2_1()); 
            match(input,13,FOLLOW_13_in_rule__ContentForm__Group_9_2__14150); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2016:1: rule__ContentForm__Group_10__0 : ( 'processes' ) rule__ContentForm__Group_10__1 ;
    public final void rule__ContentForm__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2020:1: ( ( 'processes' ) rule__ContentForm__Group_10__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2021:1: ( 'processes' ) rule__ContentForm__Group_10__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2021:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2022:1: 'processes'
            {
             before(grammarAccess.getContentFormAccess().getProcessesKeyword_10_0()); 
            match(input,33,FOLLOW_33_in_rule__ContentForm__Group_10__04190); 
             after(grammarAccess.getContentFormAccess().getProcessesKeyword_10_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_10__1_in_rule__ContentForm__Group_10__04200);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2036:1: rule__ContentForm__Group_10__1 : ( '[' ) rule__ContentForm__Group_10__2 ;
    public final void rule__ContentForm__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2040:1: ( ( '[' ) rule__ContentForm__Group_10__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2041:1: ( '[' ) rule__ContentForm__Group_10__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2041:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2042:1: '['
            {
             before(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_10_1()); 
            match(input,25,FOLLOW_25_in_rule__ContentForm__Group_10__14229); 
             after(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_10_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_10__2_in_rule__ContentForm__Group_10__14239);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2056:1: rule__ContentForm__Group_10__2 : ( ( rule__ContentForm__Group_10_2__0 )* ) rule__ContentForm__Group_10__3 ;
    public final void rule__ContentForm__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2060:1: ( ( ( rule__ContentForm__Group_10_2__0 )* ) rule__ContentForm__Group_10__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2061:1: ( ( rule__ContentForm__Group_10_2__0 )* ) rule__ContentForm__Group_10__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2061:1: ( ( rule__ContentForm__Group_10_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2062:1: ( rule__ContentForm__Group_10_2__0 )*
            {
             before(grammarAccess.getContentFormAccess().getGroup_10_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2063:1: ( rule__ContentForm__Group_10_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2063:2: rule__ContentForm__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ContentForm__Group_10_2__0_in_rule__ContentForm__Group_10__24267);
            	    rule__ContentForm__Group_10_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getContentFormAccess().getGroup_10_2()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_10__3_in_rule__ContentForm__Group_10__24277);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2074:1: rule__ContentForm__Group_10__3 : ( ']' ) ;
    public final void rule__ContentForm__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2078:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2079:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2079:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2080:1: ']'
            {
             before(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_10_3()); 
            match(input,26,FOLLOW_26_in_rule__ContentForm__Group_10__34306); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2101:1: rule__ContentForm__Group_10_2__0 : ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) ) rule__ContentForm__Group_10_2__1 ;
    public final void rule__ContentForm__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2105:1: ( ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) ) rule__ContentForm__Group_10_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2106:1: ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) ) rule__ContentForm__Group_10_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2106:1: ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2107:1: ( rule__ContentForm__ProcessesAssignment_10_2_0 )
            {
             before(grammarAccess.getContentFormAccess().getProcessesAssignment_10_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2108:1: ( rule__ContentForm__ProcessesAssignment_10_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2108:2: rule__ContentForm__ProcessesAssignment_10_2_0
            {
            pushFollow(FOLLOW_rule__ContentForm__ProcessesAssignment_10_2_0_in_rule__ContentForm__Group_10_2__04349);
            rule__ContentForm__ProcessesAssignment_10_2_0();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getProcessesAssignment_10_2_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_10_2__1_in_rule__ContentForm__Group_10_2__04358);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2119:1: rule__ContentForm__Group_10_2__1 : ( ';' ) ;
    public final void rule__ContentForm__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2123:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2124:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2124:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2125:1: ';'
            {
             before(grammarAccess.getContentFormAccess().getSemicolonKeyword_10_2_1()); 
            match(input,13,FOLLOW_13_in_rule__ContentForm__Group_10_2__14387); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2142:1: rule__Action__Group__0 : ( ( rule__Action__DescriptionAssignment_0 )? ) rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2146:1: ( ( ( rule__Action__DescriptionAssignment_0 )? ) rule__Action__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2147:1: ( ( rule__Action__DescriptionAssignment_0 )? ) rule__Action__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2147:1: ( ( rule__Action__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2148:1: ( rule__Action__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getActionAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2149:1: ( rule__Action__DescriptionAssignment_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2149:2: rule__Action__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Action__DescriptionAssignment_0_in_rule__Action__Group__04426);
                    rule__Action__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04436);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2160:1: rule__Action__Group__1 : ( ( rule__Action__TypeAssignment_1 )? ) rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2164:1: ( ( ( rule__Action__TypeAssignment_1 )? ) rule__Action__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2165:1: ( ( rule__Action__TypeAssignment_1 )? ) rule__Action__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2165:1: ( ( rule__Action__TypeAssignment_1 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2166:1: ( rule__Action__TypeAssignment_1 )?
            {
             before(grammarAccess.getActionAccess().getTypeAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2167:1: ( rule__Action__TypeAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=14 && LA29_0<=20)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2167:2: rule__Action__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Action__TypeAssignment_1_in_rule__Action__Group__14464);
                    rule__Action__TypeAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14474);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2178:1: rule__Action__Group__2 : ( ( rule__Action__NameAssignment_2 ) ) rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2182:1: ( ( ( rule__Action__NameAssignment_2 ) ) rule__Action__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2183:1: ( ( rule__Action__NameAssignment_2 ) ) rule__Action__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2183:1: ( ( rule__Action__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2184:1: ( rule__Action__NameAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2185:1: ( rule__Action__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2185:2: rule__Action__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_2_in_rule__Action__Group__24502);
            rule__Action__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__24511);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2196:1: rule__Action__Group__3 : ( ( rule__Action__Group_3__0 )? ) rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2200:1: ( ( ( rule__Action__Group_3__0 )? ) rule__Action__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2201:1: ( ( rule__Action__Group_3__0 )? ) rule__Action__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2201:1: ( ( rule__Action__Group_3__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2202:1: ( rule__Action__Group_3__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2203:1: ( rule__Action__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2203:2: rule__Action__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__34539);
                    rule__Action__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__4_in_rule__Action__Group__34549);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2214:1: rule__Action__Group__4 : ( ( rule__Action__ProcessElementsAssignment_4 )? ) ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2218:1: ( ( ( rule__Action__ProcessElementsAssignment_4 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2219:1: ( ( rule__Action__ProcessElementsAssignment_4 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2219:1: ( ( rule__Action__ProcessElementsAssignment_4 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2220:1: ( rule__Action__ProcessElementsAssignment_4 )?
            {
             before(grammarAccess.getActionAccess().getProcessElementsAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2221:1: ( rule__Action__ProcessElementsAssignment_4 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=21 && LA31_0<=22)||LA31_0==29||(LA31_0>=47 && LA31_0<=48)||LA31_0==50||LA31_0==53) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2221:2: rule__Action__ProcessElementsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Action__ProcessElementsAssignment_4_in_rule__Action__Group__44577);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2241:1: rule__Action__Group_3__0 : ( 'label' ) rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2245:1: ( ( 'label' ) rule__Action__Group_3__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2246:1: ( 'label' ) rule__Action__Group_3__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2246:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2247:1: 'label'
            {
             before(grammarAccess.getActionAccess().getLabelKeyword_3_0()); 
            match(input,34,FOLLOW_34_in_rule__Action__Group_3__04623); 
             after(grammarAccess.getActionAccess().getLabelKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__04633);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2261:1: rule__Action__Group_3__1 : ( ( rule__Action__LabelAssignment_3_1 ) ) ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2265:1: ( ( ( rule__Action__LabelAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2266:1: ( ( rule__Action__LabelAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2266:1: ( ( rule__Action__LabelAssignment_3_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2267:1: ( rule__Action__LabelAssignment_3_1 )
            {
             before(grammarAccess.getActionAccess().getLabelAssignment_3_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2268:1: ( rule__Action__LabelAssignment_3_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2268:2: rule__Action__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Action__LabelAssignment_3_1_in_rule__Action__Group_3__14661);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2282:1: rule__CompoundDialogue__Group_0__0 : ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? ) rule__CompoundDialogue__Group_0__1 ;
    public final void rule__CompoundDialogue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2286:1: ( ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? ) rule__CompoundDialogue__Group_0__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2287:1: ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? ) rule__CompoundDialogue__Group_0__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2287:1: ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2288:1: ( rule__CompoundDialogue__DescriptionAssignment_0_0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getDescriptionAssignment_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2289:1: ( rule__CompoundDialogue__DescriptionAssignment_0_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2289:2: rule__CompoundDialogue__DescriptionAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__DescriptionAssignment_0_0_in_rule__CompoundDialogue__Group_0__04699);
                    rule__CompoundDialogue__DescriptionAssignment_0_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundDialogueAccess().getDescriptionAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__1_in_rule__CompoundDialogue__Group_0__04709);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2300:1: rule__CompoundDialogue__Group_0__1 : ( 'CompoundDialogue' ) rule__CompoundDialogue__Group_0__2 ;
    public final void rule__CompoundDialogue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2304:1: ( ( 'CompoundDialogue' ) rule__CompoundDialogue__Group_0__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2305:1: ( 'CompoundDialogue' ) rule__CompoundDialogue__Group_0__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2305:1: ( 'CompoundDialogue' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2306:1: 'CompoundDialogue'
            {
             before(grammarAccess.getCompoundDialogueAccess().getCompoundDialogueKeyword_0_1()); 
            match(input,35,FOLLOW_35_in_rule__CompoundDialogue__Group_0__14738); 
             after(grammarAccess.getCompoundDialogueAccess().getCompoundDialogueKeyword_0_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__2_in_rule__CompoundDialogue__Group_0__14748);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2320:1: rule__CompoundDialogue__Group_0__2 : ( ( rule__CompoundDialogue__NameAssignment_0_2 ) ) rule__CompoundDialogue__Group_0__3 ;
    public final void rule__CompoundDialogue__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2324:1: ( ( ( rule__CompoundDialogue__NameAssignment_0_2 ) ) rule__CompoundDialogue__Group_0__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2325:1: ( ( rule__CompoundDialogue__NameAssignment_0_2 ) ) rule__CompoundDialogue__Group_0__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2325:1: ( ( rule__CompoundDialogue__NameAssignment_0_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2326:1: ( rule__CompoundDialogue__NameAssignment_0_2 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getNameAssignment_0_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2327:1: ( rule__CompoundDialogue__NameAssignment_0_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2327:2: rule__CompoundDialogue__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__NameAssignment_0_2_in_rule__CompoundDialogue__Group_0__24776);
            rule__CompoundDialogue__NameAssignment_0_2();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getNameAssignment_0_2()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__3_in_rule__CompoundDialogue__Group_0__24785);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2338:1: rule__CompoundDialogue__Group_0__3 : ( 'context' ) rule__CompoundDialogue__Group_0__4 ;
    public final void rule__CompoundDialogue__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2342:1: ( ( 'context' ) rule__CompoundDialogue__Group_0__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2343:1: ( 'context' ) rule__CompoundDialogue__Group_0__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2343:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2344:1: 'context'
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextKeyword_0_3()); 
            match(input,30,FOLLOW_30_in_rule__CompoundDialogue__Group_0__34814); 
             after(grammarAccess.getCompoundDialogueAccess().getContextKeyword_0_3()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__4_in_rule__CompoundDialogue__Group_0__34824);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2358:1: rule__CompoundDialogue__Group_0__4 : ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) ) rule__CompoundDialogue__Group_0__5 ;
    public final void rule__CompoundDialogue__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2362:1: ( ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) ) rule__CompoundDialogue__Group_0__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2363:1: ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) ) rule__CompoundDialogue__Group_0__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2363:1: ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2364:1: ( rule__CompoundDialogue__ContextRefAssignment_0_4 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextRefAssignment_0_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2365:1: ( rule__CompoundDialogue__ContextRefAssignment_0_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2365:2: rule__CompoundDialogue__ContextRefAssignment_0_4
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__ContextRefAssignment_0_4_in_rule__CompoundDialogue__Group_0__44852);
            rule__CompoundDialogue__ContextRefAssignment_0_4();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getContextRefAssignment_0_4()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__5_in_rule__CompoundDialogue__Group_0__44861);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2376:1: rule__CompoundDialogue__Group_0__5 : ( ( rule__CompoundDialogue__Group_0_5__0 )? ) rule__CompoundDialogue__Group_0__6 ;
    public final void rule__CompoundDialogue__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2380:1: ( ( ( rule__CompoundDialogue__Group_0_5__0 )? ) rule__CompoundDialogue__Group_0__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2381:1: ( ( rule__CompoundDialogue__Group_0_5__0 )? ) rule__CompoundDialogue__Group_0__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2381:1: ( ( rule__CompoundDialogue__Group_0_5__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2382:1: ( rule__CompoundDialogue__Group_0_5__0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2383:1: ( rule__CompoundDialogue__Group_0_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2383:2: rule__CompoundDialogue__Group_0_5__0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_5__0_in_rule__CompoundDialogue__Group_0__54889);
                    rule__CompoundDialogue__Group_0_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundDialogueAccess().getGroup_0_5()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__6_in_rule__CompoundDialogue__Group_0__54899);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2394:1: rule__CompoundDialogue__Group_0__6 : ( ( rule__CompoundDialogue__Group_0_6__0 )? ) rule__CompoundDialogue__Group_0__7 ;
    public final void rule__CompoundDialogue__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2398:1: ( ( ( rule__CompoundDialogue__Group_0_6__0 )? ) rule__CompoundDialogue__Group_0__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2399:1: ( ( rule__CompoundDialogue__Group_0_6__0 )? ) rule__CompoundDialogue__Group_0__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2399:1: ( ( rule__CompoundDialogue__Group_0_6__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2400:1: ( rule__CompoundDialogue__Group_0_6__0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2401:1: ( rule__CompoundDialogue__Group_0_6__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2401:2: rule__CompoundDialogue__Group_0_6__0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__0_in_rule__CompoundDialogue__Group_0__64927);
                    rule__CompoundDialogue__Group_0_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundDialogueAccess().getGroup_0_6()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__7_in_rule__CompoundDialogue__Group_0__64937);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2412:1: rule__CompoundDialogue__Group_0__7 : ( ( rule__CompoundDialogue__Group_0_7__0 )? ) ;
    public final void rule__CompoundDialogue__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2416:1: ( ( ( rule__CompoundDialogue__Group_0_7__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2417:1: ( ( rule__CompoundDialogue__Group_0_7__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2417:1: ( ( rule__CompoundDialogue__Group_0_7__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2418:1: ( rule__CompoundDialogue__Group_0_7__0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2419:1: ( rule__CompoundDialogue__Group_0_7__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2419:2: rule__CompoundDialogue__Group_0_7__0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__0_in_rule__CompoundDialogue__Group_0__74965);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2445:1: rule__CompoundDialogue__Group_0_5__0 : ( 'readonly' ) rule__CompoundDialogue__Group_0_5__1 ;
    public final void rule__CompoundDialogue__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2449:1: ( ( 'readonly' ) rule__CompoundDialogue__Group_0_5__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2450:1: ( 'readonly' ) rule__CompoundDialogue__Group_0_5__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2450:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2451:1: 'readonly'
            {
             before(grammarAccess.getCompoundDialogueAccess().getReadonlyKeyword_0_5_0()); 
            match(input,31,FOLLOW_31_in_rule__CompoundDialogue__Group_0_5__05017); 
             after(grammarAccess.getCompoundDialogueAccess().getReadonlyKeyword_0_5_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_5__1_in_rule__CompoundDialogue__Group_0_5__05027);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2465:1: rule__CompoundDialogue__Group_0_5__1 : ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) ) rule__CompoundDialogue__Group_0_5__2 ;
    public final void rule__CompoundDialogue__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2469:1: ( ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) ) rule__CompoundDialogue__Group_0_5__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2470:1: ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) ) rule__CompoundDialogue__Group_0_5__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2470:1: ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2471:1: ( rule__CompoundDialogue__Alternatives_0_5_1 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getAlternatives_0_5_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2472:1: ( rule__CompoundDialogue__Alternatives_0_5_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2472:2: rule__CompoundDialogue__Alternatives_0_5_1
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__Alternatives_0_5_1_in_rule__CompoundDialogue__Group_0_5__15055);
            rule__CompoundDialogue__Alternatives_0_5_1();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getAlternatives_0_5_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_5__2_in_rule__CompoundDialogue__Group_0_5__15064);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2483:1: rule__CompoundDialogue__Group_0_5__2 : ( ';' ) ;
    public final void rule__CompoundDialogue__Group_0_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2487:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2488:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2488:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2489:1: ';'
            {
             before(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_5_2()); 
            match(input,13,FOLLOW_13_in_rule__CompoundDialogue__Group_0_5__25093); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2508:1: rule__CompoundDialogue__Group_0_6__0 : ( 'dialogues' ) rule__CompoundDialogue__Group_0_6__1 ;
    public final void rule__CompoundDialogue__Group_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2512:1: ( ( 'dialogues' ) rule__CompoundDialogue__Group_0_6__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2513:1: ( 'dialogues' ) rule__CompoundDialogue__Group_0_6__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2513:1: ( 'dialogues' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2514:1: 'dialogues'
            {
             before(grammarAccess.getCompoundDialogueAccess().getDialoguesKeyword_0_6_0()); 
            match(input,36,FOLLOW_36_in_rule__CompoundDialogue__Group_0_6__05135); 
             after(grammarAccess.getCompoundDialogueAccess().getDialoguesKeyword_0_6_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__1_in_rule__CompoundDialogue__Group_0_6__05145);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2528:1: rule__CompoundDialogue__Group_0_6__1 : ( '[' ) rule__CompoundDialogue__Group_0_6__2 ;
    public final void rule__CompoundDialogue__Group_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2532:1: ( ( '[' ) rule__CompoundDialogue__Group_0_6__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2533:1: ( '[' ) rule__CompoundDialogue__Group_0_6__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2533:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2534:1: '['
            {
             before(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_6_1()); 
            match(input,25,FOLLOW_25_in_rule__CompoundDialogue__Group_0_6__15174); 
             after(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_6_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__2_in_rule__CompoundDialogue__Group_0_6__15184);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2548:1: rule__CompoundDialogue__Group_0_6__2 : ( ( rule__CompoundDialogue__Group_0_6_2__0 )* ) rule__CompoundDialogue__Group_0_6__3 ;
    public final void rule__CompoundDialogue__Group_0_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2552:1: ( ( ( rule__CompoundDialogue__Group_0_6_2__0 )* ) rule__CompoundDialogue__Group_0_6__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2553:1: ( ( rule__CompoundDialogue__Group_0_6_2__0 )* ) rule__CompoundDialogue__Group_0_6__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2553:1: ( ( rule__CompoundDialogue__Group_0_6_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2554:1: ( rule__CompoundDialogue__Group_0_6_2__0 )*
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_6_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2555:1: ( rule__CompoundDialogue__Group_0_6_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_STRING||(LA36_0>=21 && LA36_0<=22)||LA36_0==29||LA36_0==44||(LA36_0>=47 && LA36_0<=48)||LA36_0==50||LA36_0==53) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2555:2: rule__CompoundDialogue__Group_0_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6_2__0_in_rule__CompoundDialogue__Group_0_6__25212);
            	    rule__CompoundDialogue__Group_0_6_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getCompoundDialogueAccess().getGroup_0_6_2()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__3_in_rule__CompoundDialogue__Group_0_6__25222);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2566:1: rule__CompoundDialogue__Group_0_6__3 : ( ']' ) ;
    public final void rule__CompoundDialogue__Group_0_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2570:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2571:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2571:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2572:1: ']'
            {
             before(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_6_3()); 
            match(input,26,FOLLOW_26_in_rule__CompoundDialogue__Group_0_6__35251); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2593:1: rule__CompoundDialogue__Group_0_6_2__0 : ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) ) rule__CompoundDialogue__Group_0_6_2__1 ;
    public final void rule__CompoundDialogue__Group_0_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2597:1: ( ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) ) rule__CompoundDialogue__Group_0_6_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2598:1: ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) ) rule__CompoundDialogue__Group_0_6_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2598:1: ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2599:1: ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getDialoguesAssignment_0_6_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2600:1: ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2600:2: rule__CompoundDialogue__DialoguesAssignment_0_6_2_0
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__DialoguesAssignment_0_6_2_0_in_rule__CompoundDialogue__Group_0_6_2__05294);
            rule__CompoundDialogue__DialoguesAssignment_0_6_2_0();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getDialoguesAssignment_0_6_2_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6_2__1_in_rule__CompoundDialogue__Group_0_6_2__05303);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2611:1: rule__CompoundDialogue__Group_0_6_2__1 : ( ';' ) ;
    public final void rule__CompoundDialogue__Group_0_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2615:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2616:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2616:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2617:1: ';'
            {
             before(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_6_2_1()); 
            match(input,13,FOLLOW_13_in_rule__CompoundDialogue__Group_0_6_2__15332); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2634:1: rule__CompoundDialogue__Group_0_7__0 : ( 'processes' ) rule__CompoundDialogue__Group_0_7__1 ;
    public final void rule__CompoundDialogue__Group_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2638:1: ( ( 'processes' ) rule__CompoundDialogue__Group_0_7__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2639:1: ( 'processes' ) rule__CompoundDialogue__Group_0_7__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2639:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2640:1: 'processes'
            {
             before(grammarAccess.getCompoundDialogueAccess().getProcessesKeyword_0_7_0()); 
            match(input,33,FOLLOW_33_in_rule__CompoundDialogue__Group_0_7__05372); 
             after(grammarAccess.getCompoundDialogueAccess().getProcessesKeyword_0_7_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__1_in_rule__CompoundDialogue__Group_0_7__05382);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2654:1: rule__CompoundDialogue__Group_0_7__1 : ( '[' ) rule__CompoundDialogue__Group_0_7__2 ;
    public final void rule__CompoundDialogue__Group_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2658:1: ( ( '[' ) rule__CompoundDialogue__Group_0_7__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2659:1: ( '[' ) rule__CompoundDialogue__Group_0_7__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2659:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2660:1: '['
            {
             before(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_7_1()); 
            match(input,25,FOLLOW_25_in_rule__CompoundDialogue__Group_0_7__15411); 
             after(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_7_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__2_in_rule__CompoundDialogue__Group_0_7__15421);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2674:1: rule__CompoundDialogue__Group_0_7__2 : ( ( rule__CompoundDialogue__Group_0_7_2__0 )* ) rule__CompoundDialogue__Group_0_7__3 ;
    public final void rule__CompoundDialogue__Group_0_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2678:1: ( ( ( rule__CompoundDialogue__Group_0_7_2__0 )* ) rule__CompoundDialogue__Group_0_7__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2679:1: ( ( rule__CompoundDialogue__Group_0_7_2__0 )* ) rule__CompoundDialogue__Group_0_7__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2679:1: ( ( rule__CompoundDialogue__Group_0_7_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2680:1: ( rule__CompoundDialogue__Group_0_7_2__0 )*
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_7_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2681:1: ( rule__CompoundDialogue__Group_0_7_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_STRING||(LA37_0>=21 && LA37_0<=22)||LA37_0==41||LA37_0==44||(LA37_0>=47 && LA37_0<=48)||LA37_0==50||LA37_0==53) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2681:2: rule__CompoundDialogue__Group_0_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7_2__0_in_rule__CompoundDialogue__Group_0_7__25449);
            	    rule__CompoundDialogue__Group_0_7_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getCompoundDialogueAccess().getGroup_0_7_2()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__3_in_rule__CompoundDialogue__Group_0_7__25459);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2692:1: rule__CompoundDialogue__Group_0_7__3 : ( ']' ) ;
    public final void rule__CompoundDialogue__Group_0_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2696:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2697:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2697:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2698:1: ']'
            {
             before(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_7_3()); 
            match(input,26,FOLLOW_26_in_rule__CompoundDialogue__Group_0_7__35488); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2719:1: rule__CompoundDialogue__Group_0_7_2__0 : ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) ) rule__CompoundDialogue__Group_0_7_2__1 ;
    public final void rule__CompoundDialogue__Group_0_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2723:1: ( ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) ) rule__CompoundDialogue__Group_0_7_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2724:1: ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) ) rule__CompoundDialogue__Group_0_7_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2724:1: ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2725:1: ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getProcessesAssignment_0_7_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2726:1: ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2726:2: rule__CompoundDialogue__ProcessesAssignment_0_7_2_0
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__ProcessesAssignment_0_7_2_0_in_rule__CompoundDialogue__Group_0_7_2__05531);
            rule__CompoundDialogue__ProcessesAssignment_0_7_2_0();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getProcessesAssignment_0_7_2_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7_2__1_in_rule__CompoundDialogue__Group_0_7_2__05540);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2737:1: rule__CompoundDialogue__Group_0_7_2__1 : ( ';' ) ;
    public final void rule__CompoundDialogue__Group_0_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2741:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2742:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2742:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2743:1: ';'
            {
             before(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_7_2_1()); 
            match(input,13,FOLLOW_13_in_rule__CompoundDialogue__Group_0_7_2__15569); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2760:1: rule__CollectionDialogue__Group__0 : ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? ) rule__CollectionDialogue__Group__1 ;
    public final void rule__CollectionDialogue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2764:1: ( ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? ) rule__CollectionDialogue__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2765:1: ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? ) rule__CollectionDialogue__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2765:1: ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2766:1: ( rule__CollectionDialogue__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2767:1: ( rule__CollectionDialogue__DescriptionAssignment_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2767:2: rule__CollectionDialogue__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__DescriptionAssignment_0_in_rule__CollectionDialogue__Group__05608);
                    rule__CollectionDialogue__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__1_in_rule__CollectionDialogue__Group__05618);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2778:1: rule__CollectionDialogue__Group__1 : ( 'CollectionDialogue' ) rule__CollectionDialogue__Group__2 ;
    public final void rule__CollectionDialogue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2782:1: ( ( 'CollectionDialogue' ) rule__CollectionDialogue__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2783:1: ( 'CollectionDialogue' ) rule__CollectionDialogue__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2783:1: ( 'CollectionDialogue' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2784:1: 'CollectionDialogue'
            {
             before(grammarAccess.getCollectionDialogueAccess().getCollectionDialogueKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__CollectionDialogue__Group__15647); 
             after(grammarAccess.getCollectionDialogueAccess().getCollectionDialogueKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__2_in_rule__CollectionDialogue__Group__15657);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2798:1: rule__CollectionDialogue__Group__2 : ( ( rule__CollectionDialogue__NameAssignment_2 ) ) rule__CollectionDialogue__Group__3 ;
    public final void rule__CollectionDialogue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2802:1: ( ( ( rule__CollectionDialogue__NameAssignment_2 ) ) rule__CollectionDialogue__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2803:1: ( ( rule__CollectionDialogue__NameAssignment_2 ) ) rule__CollectionDialogue__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2803:1: ( ( rule__CollectionDialogue__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2804:1: ( rule__CollectionDialogue__NameAssignment_2 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2805:1: ( rule__CollectionDialogue__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2805:2: rule__CollectionDialogue__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__NameAssignment_2_in_rule__CollectionDialogue__Group__25685);
            rule__CollectionDialogue__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__3_in_rule__CollectionDialogue__Group__25694);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2816:1: rule__CollectionDialogue__Group__3 : ( 'context' ) rule__CollectionDialogue__Group__4 ;
    public final void rule__CollectionDialogue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2820:1: ( ( 'context' ) rule__CollectionDialogue__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2821:1: ( 'context' ) rule__CollectionDialogue__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2821:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2822:1: 'context'
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__CollectionDialogue__Group__35723); 
             after(grammarAccess.getCollectionDialogueAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__4_in_rule__CollectionDialogue__Group__35733);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2836:1: rule__CollectionDialogue__Group__4 : ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) ) rule__CollectionDialogue__Group__5 ;
    public final void rule__CollectionDialogue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2840:1: ( ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) ) rule__CollectionDialogue__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2841:1: ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) ) rule__CollectionDialogue__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2841:1: ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2842:1: ( rule__CollectionDialogue__ContextRefAssignment_4 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextRefAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2843:1: ( rule__CollectionDialogue__ContextRefAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2843:2: rule__CollectionDialogue__ContextRefAssignment_4
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__ContextRefAssignment_4_in_rule__CollectionDialogue__Group__45761);
            rule__CollectionDialogue__ContextRefAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getContextRefAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__5_in_rule__CollectionDialogue__Group__45770);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2854:1: rule__CollectionDialogue__Group__5 : ( '[' ) rule__CollectionDialogue__Group__6 ;
    public final void rule__CollectionDialogue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2858:1: ( ( '[' ) rule__CollectionDialogue__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2859:1: ( '[' ) rule__CollectionDialogue__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2859:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2860:1: '['
            {
             before(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__CollectionDialogue__Group__55799); 
             after(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__6_in_rule__CollectionDialogue__Group__55809);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2874:1: rule__CollectionDialogue__Group__6 : ( ( rule__CollectionDialogue__Group_6__0 )? ) rule__CollectionDialogue__Group__7 ;
    public final void rule__CollectionDialogue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2878:1: ( ( ( rule__CollectionDialogue__Group_6__0 )? ) rule__CollectionDialogue__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2879:1: ( ( rule__CollectionDialogue__Group_6__0 )? ) rule__CollectionDialogue__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2879:1: ( ( rule__CollectionDialogue__Group_6__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2880:1: ( rule__CollectionDialogue__Group_6__0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2881:1: ( rule__CollectionDialogue__Group_6__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==31) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2881:2: rule__CollectionDialogue__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__Group_6__0_in_rule__CollectionDialogue__Group__65837);
                    rule__CollectionDialogue__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getGroup_6()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__7_in_rule__CollectionDialogue__Group__65847);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2892:1: rule__CollectionDialogue__Group__7 : ( ( rule__CollectionDialogue__Group_7__0 )? ) rule__CollectionDialogue__Group__8 ;
    public final void rule__CollectionDialogue__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2896:1: ( ( ( rule__CollectionDialogue__Group_7__0 )? ) rule__CollectionDialogue__Group__8 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2897:1: ( ( rule__CollectionDialogue__Group_7__0 )? ) rule__CollectionDialogue__Group__8
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2897:1: ( ( rule__CollectionDialogue__Group_7__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2898:1: ( rule__CollectionDialogue__Group_7__0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2899:1: ( rule__CollectionDialogue__Group_7__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2899:2: rule__CollectionDialogue__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__0_in_rule__CollectionDialogue__Group__75875);
                    rule__CollectionDialogue__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getGroup_7()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__8_in_rule__CollectionDialogue__Group__75885);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2910:1: rule__CollectionDialogue__Group__8 : ( ( rule__CollectionDialogue__Group_8__0 )? ) rule__CollectionDialogue__Group__9 ;
    public final void rule__CollectionDialogue__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2914:1: ( ( ( rule__CollectionDialogue__Group_8__0 )? ) rule__CollectionDialogue__Group__9 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2915:1: ( ( rule__CollectionDialogue__Group_8__0 )? ) rule__CollectionDialogue__Group__9
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2915:1: ( ( rule__CollectionDialogue__Group_8__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2916:1: ( rule__CollectionDialogue__Group_8__0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_8()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2917:1: ( rule__CollectionDialogue__Group_8__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==33) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2917:2: rule__CollectionDialogue__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__0_in_rule__CollectionDialogue__Group__85913);
                    rule__CollectionDialogue__Group_8__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getGroup_8()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__9_in_rule__CollectionDialogue__Group__85923);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2928:1: rule__CollectionDialogue__Group__9 : ( ']' ) ;
    public final void rule__CollectionDialogue__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2932:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2933:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2933:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2934:1: ']'
            {
             before(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_9()); 
            match(input,26,FOLLOW_26_in_rule__CollectionDialogue__Group__95952); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2967:1: rule__CollectionDialogue__Group_6__0 : ( 'readonly' ) rule__CollectionDialogue__Group_6__1 ;
    public final void rule__CollectionDialogue__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2971:1: ( ( 'readonly' ) rule__CollectionDialogue__Group_6__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2972:1: ( 'readonly' ) rule__CollectionDialogue__Group_6__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2972:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2973:1: 'readonly'
            {
             before(grammarAccess.getCollectionDialogueAccess().getReadonlyKeyword_6_0()); 
            match(input,31,FOLLOW_31_in_rule__CollectionDialogue__Group_6__06008); 
             after(grammarAccess.getCollectionDialogueAccess().getReadonlyKeyword_6_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_6__1_in_rule__CollectionDialogue__Group_6__06018);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2987:1: rule__CollectionDialogue__Group_6__1 : ( ( rule__CollectionDialogue__Alternatives_6_1 ) ) rule__CollectionDialogue__Group_6__2 ;
    public final void rule__CollectionDialogue__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2991:1: ( ( ( rule__CollectionDialogue__Alternatives_6_1 ) ) rule__CollectionDialogue__Group_6__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2992:1: ( ( rule__CollectionDialogue__Alternatives_6_1 ) ) rule__CollectionDialogue__Group_6__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2992:1: ( ( rule__CollectionDialogue__Alternatives_6_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2993:1: ( rule__CollectionDialogue__Alternatives_6_1 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getAlternatives_6_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2994:1: ( rule__CollectionDialogue__Alternatives_6_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2994:2: rule__CollectionDialogue__Alternatives_6_1
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__Alternatives_6_1_in_rule__CollectionDialogue__Group_6__16046);
            rule__CollectionDialogue__Alternatives_6_1();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getAlternatives_6_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_6__2_in_rule__CollectionDialogue__Group_6__16055);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3005:1: rule__CollectionDialogue__Group_6__2 : ( ';' ) ;
    public final void rule__CollectionDialogue__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3009:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3010:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3010:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3011:1: ';'
            {
             before(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_6_2()); 
            match(input,13,FOLLOW_13_in_rule__CollectionDialogue__Group_6__26084); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3030:1: rule__CollectionDialogue__Group_7__0 : ( 'dialogues' ) rule__CollectionDialogue__Group_7__1 ;
    public final void rule__CollectionDialogue__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3034:1: ( ( 'dialogues' ) rule__CollectionDialogue__Group_7__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3035:1: ( 'dialogues' ) rule__CollectionDialogue__Group_7__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3035:1: ( 'dialogues' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3036:1: 'dialogues'
            {
             before(grammarAccess.getCollectionDialogueAccess().getDialoguesKeyword_7_0()); 
            match(input,36,FOLLOW_36_in_rule__CollectionDialogue__Group_7__06126); 
             after(grammarAccess.getCollectionDialogueAccess().getDialoguesKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__1_in_rule__CollectionDialogue__Group_7__06136);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3050:1: rule__CollectionDialogue__Group_7__1 : ( '[' ) rule__CollectionDialogue__Group_7__2 ;
    public final void rule__CollectionDialogue__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3054:1: ( ( '[' ) rule__CollectionDialogue__Group_7__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3055:1: ( '[' ) rule__CollectionDialogue__Group_7__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3055:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3056:1: '['
            {
             before(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_7_1()); 
            match(input,25,FOLLOW_25_in_rule__CollectionDialogue__Group_7__16165); 
             after(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_7_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__2_in_rule__CollectionDialogue__Group_7__16175);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3070:1: rule__CollectionDialogue__Group_7__2 : ( ( rule__CollectionDialogue__Group_7_2__0 )* ) rule__CollectionDialogue__Group_7__3 ;
    public final void rule__CollectionDialogue__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3074:1: ( ( ( rule__CollectionDialogue__Group_7_2__0 )* ) rule__CollectionDialogue__Group_7__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3075:1: ( ( rule__CollectionDialogue__Group_7_2__0 )* ) rule__CollectionDialogue__Group_7__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3075:1: ( ( rule__CollectionDialogue__Group_7_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3076:1: ( rule__CollectionDialogue__Group_7_2__0 )*
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_7_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3077:1: ( rule__CollectionDialogue__Group_7_2__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_STRING||(LA42_0>=21 && LA42_0<=22)||LA42_0==29||LA42_0==44||(LA42_0>=47 && LA42_0<=48)||LA42_0==50||LA42_0==53) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3077:2: rule__CollectionDialogue__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CollectionDialogue__Group_7_2__0_in_rule__CollectionDialogue__Group_7__26203);
            	    rule__CollectionDialogue__Group_7_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getCollectionDialogueAccess().getGroup_7_2()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__3_in_rule__CollectionDialogue__Group_7__26213);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3088:1: rule__CollectionDialogue__Group_7__3 : ( ']' ) ;
    public final void rule__CollectionDialogue__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3092:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3093:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3093:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3094:1: ']'
            {
             before(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_7_3()); 
            match(input,26,FOLLOW_26_in_rule__CollectionDialogue__Group_7__36242); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3115:1: rule__CollectionDialogue__Group_7_2__0 : ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) ) rule__CollectionDialogue__Group_7_2__1 ;
    public final void rule__CollectionDialogue__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3119:1: ( ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) ) rule__CollectionDialogue__Group_7_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3120:1: ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) ) rule__CollectionDialogue__Group_7_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3120:1: ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3121:1: ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getDialoguesAssignment_7_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3122:1: ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3122:2: rule__CollectionDialogue__DialoguesAssignment_7_2_0
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__DialoguesAssignment_7_2_0_in_rule__CollectionDialogue__Group_7_2__06285);
            rule__CollectionDialogue__DialoguesAssignment_7_2_0();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getDialoguesAssignment_7_2_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7_2__1_in_rule__CollectionDialogue__Group_7_2__06294);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3133:1: rule__CollectionDialogue__Group_7_2__1 : ( ';' ) ;
    public final void rule__CollectionDialogue__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3137:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3138:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3138:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3139:1: ';'
            {
             before(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_7_2_1()); 
            match(input,13,FOLLOW_13_in_rule__CollectionDialogue__Group_7_2__16323); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3156:1: rule__CollectionDialogue__Group_8__0 : ( 'processes' ) rule__CollectionDialogue__Group_8__1 ;
    public final void rule__CollectionDialogue__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3160:1: ( ( 'processes' ) rule__CollectionDialogue__Group_8__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3161:1: ( 'processes' ) rule__CollectionDialogue__Group_8__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3161:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3162:1: 'processes'
            {
             before(grammarAccess.getCollectionDialogueAccess().getProcessesKeyword_8_0()); 
            match(input,33,FOLLOW_33_in_rule__CollectionDialogue__Group_8__06363); 
             after(grammarAccess.getCollectionDialogueAccess().getProcessesKeyword_8_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__1_in_rule__CollectionDialogue__Group_8__06373);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3176:1: rule__CollectionDialogue__Group_8__1 : ( '[' ) rule__CollectionDialogue__Group_8__2 ;
    public final void rule__CollectionDialogue__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3180:1: ( ( '[' ) rule__CollectionDialogue__Group_8__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3181:1: ( '[' ) rule__CollectionDialogue__Group_8__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3181:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3182:1: '['
            {
             before(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_8_1()); 
            match(input,25,FOLLOW_25_in_rule__CollectionDialogue__Group_8__16402); 
             after(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_8_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__2_in_rule__CollectionDialogue__Group_8__16412);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3196:1: rule__CollectionDialogue__Group_8__2 : ( ( rule__CollectionDialogue__Group_8_2__0 )* ) rule__CollectionDialogue__Group_8__3 ;
    public final void rule__CollectionDialogue__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3200:1: ( ( ( rule__CollectionDialogue__Group_8_2__0 )* ) rule__CollectionDialogue__Group_8__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3201:1: ( ( rule__CollectionDialogue__Group_8_2__0 )* ) rule__CollectionDialogue__Group_8__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3201:1: ( ( rule__CollectionDialogue__Group_8_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3202:1: ( rule__CollectionDialogue__Group_8_2__0 )*
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_8_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3203:1: ( rule__CollectionDialogue__Group_8_2__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_STRING||(LA43_0>=21 && LA43_0<=22)||LA43_0==41||LA43_0==44||(LA43_0>=47 && LA43_0<=48)||LA43_0==50||LA43_0==53) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3203:2: rule__CollectionDialogue__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CollectionDialogue__Group_8_2__0_in_rule__CollectionDialogue__Group_8__26440);
            	    rule__CollectionDialogue__Group_8_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getCollectionDialogueAccess().getGroup_8_2()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__3_in_rule__CollectionDialogue__Group_8__26450);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3214:1: rule__CollectionDialogue__Group_8__3 : ( ']' ) ;
    public final void rule__CollectionDialogue__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3218:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3219:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3219:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3220:1: ']'
            {
             before(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_8_3()); 
            match(input,26,FOLLOW_26_in_rule__CollectionDialogue__Group_8__36479); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3241:1: rule__CollectionDialogue__Group_8_2__0 : ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) ) rule__CollectionDialogue__Group_8_2__1 ;
    public final void rule__CollectionDialogue__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3245:1: ( ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) ) rule__CollectionDialogue__Group_8_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3246:1: ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) ) rule__CollectionDialogue__Group_8_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3246:1: ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3247:1: ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getProcessesAssignment_8_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3248:1: ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3248:2: rule__CollectionDialogue__ProcessesAssignment_8_2_0
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__ProcessesAssignment_8_2_0_in_rule__CollectionDialogue__Group_8_2__06522);
            rule__CollectionDialogue__ProcessesAssignment_8_2_0();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getProcessesAssignment_8_2_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8_2__1_in_rule__CollectionDialogue__Group_8_2__06531);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3259:1: rule__CollectionDialogue__Group_8_2__1 : ( ';' ) ;
    public final void rule__CollectionDialogue__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3263:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3264:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3264:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3265:1: ';'
            {
             before(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_8_2_1()); 
            match(input,13,FOLLOW_13_in_rule__CollectionDialogue__Group_8_2__16560); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3282:1: rule__MasterDetail__Group__0 : ( ( rule__MasterDetail__DescriptionAssignment_0 )? ) rule__MasterDetail__Group__1 ;
    public final void rule__MasterDetail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3286:1: ( ( ( rule__MasterDetail__DescriptionAssignment_0 )? ) rule__MasterDetail__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3287:1: ( ( rule__MasterDetail__DescriptionAssignment_0 )? ) rule__MasterDetail__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3287:1: ( ( rule__MasterDetail__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3288:1: ( rule__MasterDetail__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getMasterDetailAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3289:1: ( rule__MasterDetail__DescriptionAssignment_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3289:2: rule__MasterDetail__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__MasterDetail__DescriptionAssignment_0_in_rule__MasterDetail__Group__06599);
                    rule__MasterDetail__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMasterDetailAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__1_in_rule__MasterDetail__Group__06609);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3300:1: rule__MasterDetail__Group__1 : ( 'MasterDetail' ) rule__MasterDetail__Group__2 ;
    public final void rule__MasterDetail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3304:1: ( ( 'MasterDetail' ) rule__MasterDetail__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3305:1: ( 'MasterDetail' ) rule__MasterDetail__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3305:1: ( 'MasterDetail' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3306:1: 'MasterDetail'
            {
             before(grammarAccess.getMasterDetailAccess().getMasterDetailKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__MasterDetail__Group__16638); 
             after(grammarAccess.getMasterDetailAccess().getMasterDetailKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__2_in_rule__MasterDetail__Group__16648);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3320:1: rule__MasterDetail__Group__2 : ( ( rule__MasterDetail__NameAssignment_2 ) ) rule__MasterDetail__Group__3 ;
    public final void rule__MasterDetail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3324:1: ( ( ( rule__MasterDetail__NameAssignment_2 ) ) rule__MasterDetail__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3325:1: ( ( rule__MasterDetail__NameAssignment_2 ) ) rule__MasterDetail__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3325:1: ( ( rule__MasterDetail__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3326:1: ( rule__MasterDetail__NameAssignment_2 )
            {
             before(grammarAccess.getMasterDetailAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3327:1: ( rule__MasterDetail__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3327:2: rule__MasterDetail__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MasterDetail__NameAssignment_2_in_rule__MasterDetail__Group__26676);
            rule__MasterDetail__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__3_in_rule__MasterDetail__Group__26685);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3338:1: rule__MasterDetail__Group__3 : ( 'context' ) rule__MasterDetail__Group__4 ;
    public final void rule__MasterDetail__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3342:1: ( ( 'context' ) rule__MasterDetail__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3343:1: ( 'context' ) rule__MasterDetail__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3343:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3344:1: 'context'
            {
             before(grammarAccess.getMasterDetailAccess().getContextKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__MasterDetail__Group__36714); 
             after(grammarAccess.getMasterDetailAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__4_in_rule__MasterDetail__Group__36724);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3358:1: rule__MasterDetail__Group__4 : ( ( rule__MasterDetail__ContextRefAssignment_4 ) ) rule__MasterDetail__Group__5 ;
    public final void rule__MasterDetail__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3362:1: ( ( ( rule__MasterDetail__ContextRefAssignment_4 ) ) rule__MasterDetail__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3363:1: ( ( rule__MasterDetail__ContextRefAssignment_4 ) ) rule__MasterDetail__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3363:1: ( ( rule__MasterDetail__ContextRefAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3364:1: ( rule__MasterDetail__ContextRefAssignment_4 )
            {
             before(grammarAccess.getMasterDetailAccess().getContextRefAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3365:1: ( rule__MasterDetail__ContextRefAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3365:2: rule__MasterDetail__ContextRefAssignment_4
            {
            pushFollow(FOLLOW_rule__MasterDetail__ContextRefAssignment_4_in_rule__MasterDetail__Group__46752);
            rule__MasterDetail__ContextRefAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getContextRefAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__5_in_rule__MasterDetail__Group__46761);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3376:1: rule__MasterDetail__Group__5 : ( ( rule__MasterDetail__Group_5__0 )? ) rule__MasterDetail__Group__6 ;
    public final void rule__MasterDetail__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3380:1: ( ( ( rule__MasterDetail__Group_5__0 )? ) rule__MasterDetail__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3381:1: ( ( rule__MasterDetail__Group_5__0 )? ) rule__MasterDetail__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3381:1: ( ( rule__MasterDetail__Group_5__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3382:1: ( rule__MasterDetail__Group_5__0 )?
            {
             before(grammarAccess.getMasterDetailAccess().getGroup_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3383:1: ( rule__MasterDetail__Group_5__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==31) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3383:2: rule__MasterDetail__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__MasterDetail__Group_5__0_in_rule__MasterDetail__Group__56789);
                    rule__MasterDetail__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMasterDetailAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__6_in_rule__MasterDetail__Group__56799);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3394:1: rule__MasterDetail__Group__6 : ( 'master' ) rule__MasterDetail__Group__7 ;
    public final void rule__MasterDetail__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3398:1: ( ( 'master' ) rule__MasterDetail__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3399:1: ( 'master' ) rule__MasterDetail__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3399:1: ( 'master' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3400:1: 'master'
            {
             before(grammarAccess.getMasterDetailAccess().getMasterKeyword_6()); 
            match(input,39,FOLLOW_39_in_rule__MasterDetail__Group__66828); 
             after(grammarAccess.getMasterDetailAccess().getMasterKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__7_in_rule__MasterDetail__Group__66838);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3414:1: rule__MasterDetail__Group__7 : ( ( rule__MasterDetail__MasterAssignment_7 ) ) rule__MasterDetail__Group__8 ;
    public final void rule__MasterDetail__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3418:1: ( ( ( rule__MasterDetail__MasterAssignment_7 ) ) rule__MasterDetail__Group__8 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3419:1: ( ( rule__MasterDetail__MasterAssignment_7 ) ) rule__MasterDetail__Group__8
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3419:1: ( ( rule__MasterDetail__MasterAssignment_7 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3420:1: ( rule__MasterDetail__MasterAssignment_7 )
            {
             before(grammarAccess.getMasterDetailAccess().getMasterAssignment_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3421:1: ( rule__MasterDetail__MasterAssignment_7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3421:2: rule__MasterDetail__MasterAssignment_7
            {
            pushFollow(FOLLOW_rule__MasterDetail__MasterAssignment_7_in_rule__MasterDetail__Group__76866);
            rule__MasterDetail__MasterAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getMasterAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__8_in_rule__MasterDetail__Group__76875);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3432:1: rule__MasterDetail__Group__8 : ( ';' ) rule__MasterDetail__Group__9 ;
    public final void rule__MasterDetail__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3436:1: ( ( ';' ) rule__MasterDetail__Group__9 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3437:1: ( ';' ) rule__MasterDetail__Group__9
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3437:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3438:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_8()); 
            match(input,13,FOLLOW_13_in_rule__MasterDetail__Group__86904); 
             after(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__9_in_rule__MasterDetail__Group__86914);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3452:1: rule__MasterDetail__Group__9 : ( 'detail' ) rule__MasterDetail__Group__10 ;
    public final void rule__MasterDetail__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3456:1: ( ( 'detail' ) rule__MasterDetail__Group__10 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3457:1: ( 'detail' ) rule__MasterDetail__Group__10
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3457:1: ( 'detail' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3458:1: 'detail'
            {
             before(grammarAccess.getMasterDetailAccess().getDetailKeyword_9()); 
            match(input,40,FOLLOW_40_in_rule__MasterDetail__Group__96943); 
             after(grammarAccess.getMasterDetailAccess().getDetailKeyword_9()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__10_in_rule__MasterDetail__Group__96953);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3472:1: rule__MasterDetail__Group__10 : ( ( rule__MasterDetail__DetailAssignment_10 ) ) rule__MasterDetail__Group__11 ;
    public final void rule__MasterDetail__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3476:1: ( ( ( rule__MasterDetail__DetailAssignment_10 ) ) rule__MasterDetail__Group__11 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3477:1: ( ( rule__MasterDetail__DetailAssignment_10 ) ) rule__MasterDetail__Group__11
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3477:1: ( ( rule__MasterDetail__DetailAssignment_10 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3478:1: ( rule__MasterDetail__DetailAssignment_10 )
            {
             before(grammarAccess.getMasterDetailAccess().getDetailAssignment_10()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3479:1: ( rule__MasterDetail__DetailAssignment_10 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3479:2: rule__MasterDetail__DetailAssignment_10
            {
            pushFollow(FOLLOW_rule__MasterDetail__DetailAssignment_10_in_rule__MasterDetail__Group__106981);
            rule__MasterDetail__DetailAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getDetailAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__11_in_rule__MasterDetail__Group__106990);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3490:1: rule__MasterDetail__Group__11 : ( ';' ) rule__MasterDetail__Group__12 ;
    public final void rule__MasterDetail__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3494:1: ( ( ';' ) rule__MasterDetail__Group__12 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3495:1: ( ';' ) rule__MasterDetail__Group__12
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3495:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3496:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_11()); 
            match(input,13,FOLLOW_13_in_rule__MasterDetail__Group__117019); 
             after(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_11()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__12_in_rule__MasterDetail__Group__117029);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3510:1: rule__MasterDetail__Group__12 : ( ( rule__MasterDetail__Group_12__0 )? ) ;
    public final void rule__MasterDetail__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3514:1: ( ( ( rule__MasterDetail__Group_12__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3515:1: ( ( rule__MasterDetail__Group_12__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3515:1: ( ( rule__MasterDetail__Group_12__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3516:1: ( rule__MasterDetail__Group_12__0 )?
            {
             before(grammarAccess.getMasterDetailAccess().getGroup_12()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3517:1: ( rule__MasterDetail__Group_12__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==33) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3517:2: rule__MasterDetail__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__MasterDetail__Group_12__0_in_rule__MasterDetail__Group__127057);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3553:1: rule__MasterDetail__Group_5__0 : ( 'readonly' ) rule__MasterDetail__Group_5__1 ;
    public final void rule__MasterDetail__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3557:1: ( ( 'readonly' ) rule__MasterDetail__Group_5__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3558:1: ( 'readonly' ) rule__MasterDetail__Group_5__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3558:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3559:1: 'readonly'
            {
             before(grammarAccess.getMasterDetailAccess().getReadonlyKeyword_5_0()); 
            match(input,31,FOLLOW_31_in_rule__MasterDetail__Group_5__07119); 
             after(grammarAccess.getMasterDetailAccess().getReadonlyKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_5__1_in_rule__MasterDetail__Group_5__07129);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3573:1: rule__MasterDetail__Group_5__1 : ( ( rule__MasterDetail__Alternatives_5_1 ) ) rule__MasterDetail__Group_5__2 ;
    public final void rule__MasterDetail__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3577:1: ( ( ( rule__MasterDetail__Alternatives_5_1 ) ) rule__MasterDetail__Group_5__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3578:1: ( ( rule__MasterDetail__Alternatives_5_1 ) ) rule__MasterDetail__Group_5__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3578:1: ( ( rule__MasterDetail__Alternatives_5_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3579:1: ( rule__MasterDetail__Alternatives_5_1 )
            {
             before(grammarAccess.getMasterDetailAccess().getAlternatives_5_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3580:1: ( rule__MasterDetail__Alternatives_5_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3580:2: rule__MasterDetail__Alternatives_5_1
            {
            pushFollow(FOLLOW_rule__MasterDetail__Alternatives_5_1_in_rule__MasterDetail__Group_5__17157);
            rule__MasterDetail__Alternatives_5_1();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getAlternatives_5_1()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_5__2_in_rule__MasterDetail__Group_5__17166);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3591:1: rule__MasterDetail__Group_5__2 : ( ';' ) ;
    public final void rule__MasterDetail__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3595:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3596:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3596:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3597:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_5_2()); 
            match(input,13,FOLLOW_13_in_rule__MasterDetail__Group_5__27195); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3616:1: rule__MasterDetail__Group_12__0 : ( 'processes' ) rule__MasterDetail__Group_12__1 ;
    public final void rule__MasterDetail__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3620:1: ( ( 'processes' ) rule__MasterDetail__Group_12__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3621:1: ( 'processes' ) rule__MasterDetail__Group_12__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3621:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3622:1: 'processes'
            {
             before(grammarAccess.getMasterDetailAccess().getProcessesKeyword_12_0()); 
            match(input,33,FOLLOW_33_in_rule__MasterDetail__Group_12__07237); 
             after(grammarAccess.getMasterDetailAccess().getProcessesKeyword_12_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_12__1_in_rule__MasterDetail__Group_12__07247);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3636:1: rule__MasterDetail__Group_12__1 : ( '[' ) rule__MasterDetail__Group_12__2 ;
    public final void rule__MasterDetail__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3640:1: ( ( '[' ) rule__MasterDetail__Group_12__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3641:1: ( '[' ) rule__MasterDetail__Group_12__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3641:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3642:1: '['
            {
             before(grammarAccess.getMasterDetailAccess().getLeftSquareBracketKeyword_12_1()); 
            match(input,25,FOLLOW_25_in_rule__MasterDetail__Group_12__17276); 
             after(grammarAccess.getMasterDetailAccess().getLeftSquareBracketKeyword_12_1()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_12__2_in_rule__MasterDetail__Group_12__17286);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3656:1: rule__MasterDetail__Group_12__2 : ( ( rule__MasterDetail__Group_12_2__0 )* ) rule__MasterDetail__Group_12__3 ;
    public final void rule__MasterDetail__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3660:1: ( ( ( rule__MasterDetail__Group_12_2__0 )* ) rule__MasterDetail__Group_12__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3661:1: ( ( rule__MasterDetail__Group_12_2__0 )* ) rule__MasterDetail__Group_12__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3661:1: ( ( rule__MasterDetail__Group_12_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3662:1: ( rule__MasterDetail__Group_12_2__0 )*
            {
             before(grammarAccess.getMasterDetailAccess().getGroup_12_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3663:1: ( rule__MasterDetail__Group_12_2__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_STRING||(LA47_0>=21 && LA47_0<=22)||LA47_0==41||LA47_0==44||(LA47_0>=47 && LA47_0<=48)||LA47_0==50||LA47_0==53) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3663:2: rule__MasterDetail__Group_12_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MasterDetail__Group_12_2__0_in_rule__MasterDetail__Group_12__27314);
            	    rule__MasterDetail__Group_12_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getMasterDetailAccess().getGroup_12_2()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_12__3_in_rule__MasterDetail__Group_12__27324);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3674:1: rule__MasterDetail__Group_12__3 : ( ']' ) ;
    public final void rule__MasterDetail__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3678:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3679:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3679:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3680:1: ']'
            {
             before(grammarAccess.getMasterDetailAccess().getRightSquareBracketKeyword_12_3()); 
            match(input,26,FOLLOW_26_in_rule__MasterDetail__Group_12__37353); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3701:1: rule__MasterDetail__Group_12_2__0 : ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) ) rule__MasterDetail__Group_12_2__1 ;
    public final void rule__MasterDetail__Group_12_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3705:1: ( ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) ) rule__MasterDetail__Group_12_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3706:1: ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) ) rule__MasterDetail__Group_12_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3706:1: ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3707:1: ( rule__MasterDetail__ProcessesAssignment_12_2_0 )
            {
             before(grammarAccess.getMasterDetailAccess().getProcessesAssignment_12_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3708:1: ( rule__MasterDetail__ProcessesAssignment_12_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3708:2: rule__MasterDetail__ProcessesAssignment_12_2_0
            {
            pushFollow(FOLLOW_rule__MasterDetail__ProcessesAssignment_12_2_0_in_rule__MasterDetail__Group_12_2__07396);
            rule__MasterDetail__ProcessesAssignment_12_2_0();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getProcessesAssignment_12_2_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_12_2__1_in_rule__MasterDetail__Group_12_2__07405);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3719:1: rule__MasterDetail__Group_12_2__1 : ( ';' ) ;
    public final void rule__MasterDetail__Group_12_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3723:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3724:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3724:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3725:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_12_2_1()); 
            match(input,13,FOLLOW_13_in_rule__MasterDetail__Group_12_2__17434); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3742:1: rule__Process__Group__0 : ( ( rule__Process__DescriptionAssignment_0 )? ) rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3746:1: ( ( ( rule__Process__DescriptionAssignment_0 )? ) rule__Process__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3747:1: ( ( rule__Process__DescriptionAssignment_0 )? ) rule__Process__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3747:1: ( ( rule__Process__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3748:1: ( rule__Process__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getProcessAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3749:1: ( rule__Process__DescriptionAssignment_0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_STRING) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3749:2: rule__Process__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Process__DescriptionAssignment_0_in_rule__Process__Group__07473);
                    rule__Process__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__1_in_rule__Process__Group__07483);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3760:1: rule__Process__Group__1 : ( 'process' ) rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3764:1: ( ( 'process' ) rule__Process__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3765:1: ( 'process' ) rule__Process__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3765:1: ( 'process' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3766:1: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__Process__Group__17512); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__2_in_rule__Process__Group__17522);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3780:1: rule__Process__Group__2 : ( ( rule__Process__Alternatives_2 )? ) rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3784:1: ( ( ( rule__Process__Alternatives_2 )? ) rule__Process__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3785:1: ( ( rule__Process__Alternatives_2 )? ) rule__Process__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3785:1: ( ( rule__Process__Alternatives_2 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3786:1: ( rule__Process__Alternatives_2 )?
            {
             before(grammarAccess.getProcessAccess().getAlternatives_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3787:1: ( rule__Process__Alternatives_2 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==11||(LA49_0>=14 && LA49_0<=20)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3787:2: rule__Process__Alternatives_2
                    {
                    pushFollow(FOLLOW_rule__Process__Alternatives_2_in_rule__Process__Group__27550);
                    rule__Process__Alternatives_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getAlternatives_2()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__3_in_rule__Process__Group__27560);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3798:1: rule__Process__Group__3 : ( ( rule__Process__NameAssignment_3 ) ) rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3802:1: ( ( ( rule__Process__NameAssignment_3 ) ) rule__Process__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3803:1: ( ( rule__Process__NameAssignment_3 ) ) rule__Process__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3803:1: ( ( rule__Process__NameAssignment_3 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3804:1: ( rule__Process__NameAssignment_3 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3805:1: ( rule__Process__NameAssignment_3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3805:2: rule__Process__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Process__NameAssignment_3_in_rule__Process__Group__37588);
            rule__Process__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__4_in_rule__Process__Group__37597);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3816:1: rule__Process__Group__4 : ( 'context' ) rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3820:1: ( ( 'context' ) rule__Process__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3821:1: ( 'context' ) rule__Process__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3821:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3822:1: 'context'
            {
             before(grammarAccess.getProcessAccess().getContextKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__Process__Group__47626); 
             after(grammarAccess.getProcessAccess().getContextKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__5_in_rule__Process__Group__47636);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3836:1: rule__Process__Group__5 : ( ( rule__Process__CollectionContextAssignment_5 )? ) rule__Process__Group__6 ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3840:1: ( ( ( rule__Process__CollectionContextAssignment_5 )? ) rule__Process__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3841:1: ( ( rule__Process__CollectionContextAssignment_5 )? ) rule__Process__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3841:1: ( ( rule__Process__CollectionContextAssignment_5 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3842:1: ( rule__Process__CollectionContextAssignment_5 )?
            {
             before(grammarAccess.getProcessAccess().getCollectionContextAssignment_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3843:1: ( rule__Process__CollectionContextAssignment_5 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==51) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3843:2: rule__Process__CollectionContextAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Process__CollectionContextAssignment_5_in_rule__Process__Group__57664);
                    rule__Process__CollectionContextAssignment_5();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getCollectionContextAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__6_in_rule__Process__Group__57674);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3854:1: rule__Process__Group__6 : ( ( rule__Process__ContextRefAssignment_6 ) ) rule__Process__Group__7 ;
    public final void rule__Process__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3858:1: ( ( ( rule__Process__ContextRefAssignment_6 ) ) rule__Process__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3859:1: ( ( rule__Process__ContextRefAssignment_6 ) ) rule__Process__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3859:1: ( ( rule__Process__ContextRefAssignment_6 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3860:1: ( rule__Process__ContextRefAssignment_6 )
            {
             before(grammarAccess.getProcessAccess().getContextRefAssignment_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3861:1: ( rule__Process__ContextRefAssignment_6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3861:2: rule__Process__ContextRefAssignment_6
            {
            pushFollow(FOLLOW_rule__Process__ContextRefAssignment_6_in_rule__Process__Group__67702);
            rule__Process__ContextRefAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getContextRefAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__7_in_rule__Process__Group__67711);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3872:1: rule__Process__Group__7 : ( ( rule__Process__Alternatives_7 ) ) ;
    public final void rule__Process__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3876:1: ( ( ( rule__Process__Alternatives_7 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3877:1: ( ( rule__Process__Alternatives_7 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3877:1: ( ( rule__Process__Alternatives_7 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3878:1: ( rule__Process__Alternatives_7 )
            {
             before(grammarAccess.getProcessAccess().getAlternatives_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3879:1: ( rule__Process__Alternatives_7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3879:2: rule__Process__Alternatives_7
            {
            pushFollow(FOLLOW_rule__Process__Alternatives_7_in_rule__Process__Group__77739);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3905:1: rule__Process__Group_2_1__0 : ( ( rule__Process__TypeAssignment_2_1_0 ) ) rule__Process__Group_2_1__1 ;
    public final void rule__Process__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3909:1: ( ( ( rule__Process__TypeAssignment_2_1_0 ) ) rule__Process__Group_2_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3910:1: ( ( rule__Process__TypeAssignment_2_1_0 ) ) rule__Process__Group_2_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3910:1: ( ( rule__Process__TypeAssignment_2_1_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3911:1: ( rule__Process__TypeAssignment_2_1_0 )
            {
             before(grammarAccess.getProcessAccess().getTypeAssignment_2_1_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3912:1: ( rule__Process__TypeAssignment_2_1_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3912:2: rule__Process__TypeAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__Process__TypeAssignment_2_1_0_in_rule__Process__Group_2_1__07789);
            rule__Process__TypeAssignment_2_1_0();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getTypeAssignment_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__Process__Group_2_1__1_in_rule__Process__Group_2_1__07798);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3923:1: rule__Process__Group_2_1__1 : ( ( rule__Process__LinkAssignment_2_1_1 ) ) ;
    public final void rule__Process__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3927:1: ( ( ( rule__Process__LinkAssignment_2_1_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3928:1: ( ( rule__Process__LinkAssignment_2_1_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3928:1: ( ( rule__Process__LinkAssignment_2_1_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3929:1: ( rule__Process__LinkAssignment_2_1_1 )
            {
             before(grammarAccess.getProcessAccess().getLinkAssignment_2_1_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3930:1: ( rule__Process__LinkAssignment_2_1_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3930:2: rule__Process__LinkAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Process__LinkAssignment_2_1_1_in_rule__Process__Group_2_1__17826);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3944:1: rule__Process__Group_7_1__0 : ( '[' ) rule__Process__Group_7_1__1 ;
    public final void rule__Process__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3948:1: ( ( '[' ) rule__Process__Group_7_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3949:1: ( '[' ) rule__Process__Group_7_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3949:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3950:1: '['
            {
             before(grammarAccess.getProcessAccess().getLeftSquareBracketKeyword_7_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Process__Group_7_1__07865); 
             after(grammarAccess.getProcessAccess().getLeftSquareBracketKeyword_7_1_0()); 

            }

            pushFollow(FOLLOW_rule__Process__Group_7_1__1_in_rule__Process__Group_7_1__07875);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3964:1: rule__Process__Group_7_1__1 : ( ( rule__Process__Group_7_1_1__0 )* ) rule__Process__Group_7_1__2 ;
    public final void rule__Process__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3968:1: ( ( ( rule__Process__Group_7_1_1__0 )* ) rule__Process__Group_7_1__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3969:1: ( ( rule__Process__Group_7_1_1__0 )* ) rule__Process__Group_7_1__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3969:1: ( ( rule__Process__Group_7_1_1__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3970:1: ( rule__Process__Group_7_1_1__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_7_1_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3971:1: ( rule__Process__Group_7_1_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_STRING||(LA51_0>=21 && LA51_0<=22)||LA51_0==29||LA51_0==41||LA51_0==44||(LA51_0>=47 && LA51_0<=48)||LA51_0==50||LA51_0==53) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3971:2: rule__Process__Group_7_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Process__Group_7_1_1__0_in_rule__Process__Group_7_1__17903);
            	    rule__Process__Group_7_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_7_1_1()); 

            }

            pushFollow(FOLLOW_rule__Process__Group_7_1__2_in_rule__Process__Group_7_1__17913);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3982:1: rule__Process__Group_7_1__2 : ( ']' ) ;
    public final void rule__Process__Group_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3986:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3987:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3987:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3988:1: ']'
            {
             before(grammarAccess.getProcessAccess().getRightSquareBracketKeyword_7_1_2()); 
            match(input,26,FOLLOW_26_in_rule__Process__Group_7_1__27942); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4007:1: rule__Process__Group_7_1_1__0 : ( ( rule__Process__ProcessElementsAssignment_7_1_1_0 ) ) rule__Process__Group_7_1_1__1 ;
    public final void rule__Process__Group_7_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4011:1: ( ( ( rule__Process__ProcessElementsAssignment_7_1_1_0 ) ) rule__Process__Group_7_1_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4012:1: ( ( rule__Process__ProcessElementsAssignment_7_1_1_0 ) ) rule__Process__Group_7_1_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4012:1: ( ( rule__Process__ProcessElementsAssignment_7_1_1_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4013:1: ( rule__Process__ProcessElementsAssignment_7_1_1_0 )
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_7_1_1_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4014:1: ( rule__Process__ProcessElementsAssignment_7_1_1_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4014:2: rule__Process__ProcessElementsAssignment_7_1_1_0
            {
            pushFollow(FOLLOW_rule__Process__ProcessElementsAssignment_7_1_1_0_in_rule__Process__Group_7_1_1__07983);
            rule__Process__ProcessElementsAssignment_7_1_1_0();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_7_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__Process__Group_7_1_1__1_in_rule__Process__Group_7_1_1__07992);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4025:1: rule__Process__Group_7_1_1__1 : ( ';' ) ;
    public final void rule__Process__Group_7_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4029:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4030:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4030:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4031:1: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_7_1_1_1()); 
            match(input,13,FOLLOW_13_in_rule__Process__Group_7_1_1__18021); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4048:1: rule__FormElement__Group__0 : ( ( rule__FormElement__DescriptionAssignment_0 )? ) rule__FormElement__Group__1 ;
    public final void rule__FormElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4052:1: ( ( ( rule__FormElement__DescriptionAssignment_0 )? ) rule__FormElement__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4053:1: ( ( rule__FormElement__DescriptionAssignment_0 )? ) rule__FormElement__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4053:1: ( ( rule__FormElement__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4054:1: ( rule__FormElement__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getFormElementAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4055:1: ( rule__FormElement__DescriptionAssignment_0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_STRING) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4055:2: rule__FormElement__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FormElement__DescriptionAssignment_0_in_rule__FormElement__Group__08060);
                    rule__FormElement__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormElementAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__1_in_rule__FormElement__Group__08070);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4066:1: rule__FormElement__Group__1 : ( 'element' ) rule__FormElement__Group__2 ;
    public final void rule__FormElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4070:1: ( ( 'element' ) rule__FormElement__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4071:1: ( 'element' ) rule__FormElement__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4071:1: ( 'element' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4072:1: 'element'
            {
             before(grammarAccess.getFormElementAccess().getElementKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__FormElement__Group__18099); 
             after(grammarAccess.getFormElementAccess().getElementKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__2_in_rule__FormElement__Group__18109);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4086:1: rule__FormElement__Group__2 : ( ( rule__FormElement__ReferencesAssignment_2 ) ) rule__FormElement__Group__3 ;
    public final void rule__FormElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4090:1: ( ( ( rule__FormElement__ReferencesAssignment_2 ) ) rule__FormElement__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4091:1: ( ( rule__FormElement__ReferencesAssignment_2 ) ) rule__FormElement__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4091:1: ( ( rule__FormElement__ReferencesAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4092:1: ( rule__FormElement__ReferencesAssignment_2 )
            {
             before(grammarAccess.getFormElementAccess().getReferencesAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4093:1: ( rule__FormElement__ReferencesAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4093:2: rule__FormElement__ReferencesAssignment_2
            {
            pushFollow(FOLLOW_rule__FormElement__ReferencesAssignment_2_in_rule__FormElement__Group__28137);
            rule__FormElement__ReferencesAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFormElementAccess().getReferencesAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__3_in_rule__FormElement__Group__28146);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4104:1: rule__FormElement__Group__3 : ( ( rule__FormElement__Group_3__0 )? ) rule__FormElement__Group__4 ;
    public final void rule__FormElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4108:1: ( ( ( rule__FormElement__Group_3__0 )? ) rule__FormElement__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4109:1: ( ( rule__FormElement__Group_3__0 )? ) rule__FormElement__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4109:1: ( ( rule__FormElement__Group_3__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4110:1: ( rule__FormElement__Group_3__0 )?
            {
             before(grammarAccess.getFormElementAccess().getGroup_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4111:1: ( rule__FormElement__Group_3__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==34) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4111:2: rule__FormElement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FormElement__Group_3__0_in_rule__FormElement__Group__38174);
                    rule__FormElement__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormElementAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__4_in_rule__FormElement__Group__38184);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4122:1: rule__FormElement__Group__4 : ( ( rule__FormElement__Group_4__0 )? ) rule__FormElement__Group__5 ;
    public final void rule__FormElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4126:1: ( ( ( rule__FormElement__Group_4__0 )? ) rule__FormElement__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4127:1: ( ( rule__FormElement__Group_4__0 )? ) rule__FormElement__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4127:1: ( ( rule__FormElement__Group_4__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4128:1: ( rule__FormElement__Group_4__0 )?
            {
             before(grammarAccess.getFormElementAccess().getGroup_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4129:1: ( rule__FormElement__Group_4__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==31) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4129:2: rule__FormElement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__FormElement__Group_4__0_in_rule__FormElement__Group__48212);
                    rule__FormElement__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormElementAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__5_in_rule__FormElement__Group__48222);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4140:1: rule__FormElement__Group__5 : ( ';' ) ;
    public final void rule__FormElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4144:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4145:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4145:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4146:1: ';'
            {
             before(grammarAccess.getFormElementAccess().getSemicolonKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__FormElement__Group__58251); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4171:1: rule__FormElement__Group_3__0 : ( 'label' ) rule__FormElement__Group_3__1 ;
    public final void rule__FormElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4175:1: ( ( 'label' ) rule__FormElement__Group_3__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4176:1: ( 'label' ) rule__FormElement__Group_3__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4176:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4177:1: 'label'
            {
             before(grammarAccess.getFormElementAccess().getLabelKeyword_3_0()); 
            match(input,34,FOLLOW_34_in_rule__FormElement__Group_3__08299); 
             after(grammarAccess.getFormElementAccess().getLabelKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group_3__1_in_rule__FormElement__Group_3__08309);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4191:1: rule__FormElement__Group_3__1 : ( ( rule__FormElement__LabelAssignment_3_1 ) ) ;
    public final void rule__FormElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4195:1: ( ( ( rule__FormElement__LabelAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4196:1: ( ( rule__FormElement__LabelAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4196:1: ( ( rule__FormElement__LabelAssignment_3_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4197:1: ( rule__FormElement__LabelAssignment_3_1 )
            {
             before(grammarAccess.getFormElementAccess().getLabelAssignment_3_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4198:1: ( rule__FormElement__LabelAssignment_3_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4198:2: rule__FormElement__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__FormElement__LabelAssignment_3_1_in_rule__FormElement__Group_3__18337);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4212:1: rule__FormElement__Group_4__0 : ( 'readonly' ) rule__FormElement__Group_4__1 ;
    public final void rule__FormElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4216:1: ( ( 'readonly' ) rule__FormElement__Group_4__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4217:1: ( 'readonly' ) rule__FormElement__Group_4__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4217:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4218:1: 'readonly'
            {
             before(grammarAccess.getFormElementAccess().getReadonlyKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__FormElement__Group_4__08376); 
             after(grammarAccess.getFormElementAccess().getReadonlyKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group_4__1_in_rule__FormElement__Group_4__08386);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4232:1: rule__FormElement__Group_4__1 : ( ( rule__FormElement__Alternatives_4_1 ) ) ;
    public final void rule__FormElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4236:1: ( ( ( rule__FormElement__Alternatives_4_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4237:1: ( ( rule__FormElement__Alternatives_4_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4237:1: ( ( rule__FormElement__Alternatives_4_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4238:1: ( rule__FormElement__Alternatives_4_1 )
            {
             before(grammarAccess.getFormElementAccess().getAlternatives_4_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4239:1: ( rule__FormElement__Alternatives_4_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4239:2: rule__FormElement__Alternatives_4_1
            {
            pushFollow(FOLLOW_rule__FormElement__Alternatives_4_1_in_rule__FormElement__Group_4__18414);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4253:1: rule__ActionDialogueCall__Group__0 : ( ( rule__ActionDialogueCall__ContextExpAssignment_0 )? ) rule__ActionDialogueCall__Group__1 ;
    public final void rule__ActionDialogueCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4257:1: ( ( ( rule__ActionDialogueCall__ContextExpAssignment_0 )? ) rule__ActionDialogueCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4258:1: ( ( rule__ActionDialogueCall__ContextExpAssignment_0 )? ) rule__ActionDialogueCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4258:1: ( ( rule__ActionDialogueCall__ContextExpAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4259:1: ( rule__ActionDialogueCall__ContextExpAssignment_0 )?
            {
             before(grammarAccess.getActionDialogueCallAccess().getContextExpAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4260:1: ( rule__ActionDialogueCall__ContextExpAssignment_0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=21 && LA55_0<=22)||(LA55_0>=47 && LA55_0<=48)||LA55_0==50||LA55_0==53) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4260:2: rule__ActionDialogueCall__ContextExpAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ActionDialogueCall__ContextExpAssignment_0_in_rule__ActionDialogueCall__Group__08452);
                    rule__ActionDialogueCall__ContextExpAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionDialogueCallAccess().getContextExpAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ActionDialogueCall__Group__1_in_rule__ActionDialogueCall__Group__08462);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4271:1: rule__ActionDialogueCall__Group__1 : ( 'form' ) rule__ActionDialogueCall__Group__2 ;
    public final void rule__ActionDialogueCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4275:1: ( ( 'form' ) rule__ActionDialogueCall__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4276:1: ( 'form' ) rule__ActionDialogueCall__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4276:1: ( 'form' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4277:1: 'form'
            {
             before(grammarAccess.getActionDialogueCallAccess().getFormKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__ActionDialogueCall__Group__18491); 
             after(grammarAccess.getActionDialogueCallAccess().getFormKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ActionDialogueCall__Group__2_in_rule__ActionDialogueCall__Group__18501);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4291:1: rule__ActionDialogueCall__Group__2 : ( ( rule__ActionDialogueCall__NameAssignment_2 ) ) ;
    public final void rule__ActionDialogueCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4295:1: ( ( ( rule__ActionDialogueCall__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4296:1: ( ( rule__ActionDialogueCall__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4296:1: ( ( rule__ActionDialogueCall__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4297:1: ( rule__ActionDialogueCall__NameAssignment_2 )
            {
             before(grammarAccess.getActionDialogueCallAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4298:1: ( rule__ActionDialogueCall__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4298:2: rule__ActionDialogueCall__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ActionDialogueCall__NameAssignment_2_in_rule__ActionDialogueCall__Group__28529);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4314:1: rule__DialogueCall__Group__0 : ( ( rule__DialogueCall__Group_0__0 )? ) rule__DialogueCall__Group__1 ;
    public final void rule__DialogueCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4318:1: ( ( ( rule__DialogueCall__Group_0__0 )? ) rule__DialogueCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4319:1: ( ( rule__DialogueCall__Group_0__0 )? ) rule__DialogueCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4319:1: ( ( rule__DialogueCall__Group_0__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4320:1: ( rule__DialogueCall__Group_0__0 )?
            {
             before(grammarAccess.getDialogueCallAccess().getGroup_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4321:1: ( rule__DialogueCall__Group_0__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_STRING) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4321:2: rule__DialogueCall__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__DialogueCall__Group_0__0_in_rule__DialogueCall__Group__08569);
                    rule__DialogueCall__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDialogueCallAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group__1_in_rule__DialogueCall__Group__08579);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4332:1: rule__DialogueCall__Group__1 : ( ( rule__DialogueCall__Group_1__0 )? ) rule__DialogueCall__Group__2 ;
    public final void rule__DialogueCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4336:1: ( ( ( rule__DialogueCall__Group_1__0 )? ) rule__DialogueCall__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4337:1: ( ( rule__DialogueCall__Group_1__0 )? ) rule__DialogueCall__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4337:1: ( ( rule__DialogueCall__Group_1__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4338:1: ( rule__DialogueCall__Group_1__0 )?
            {
             before(grammarAccess.getDialogueCallAccess().getGroup_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4339:1: ( rule__DialogueCall__Group_1__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==44) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4339:2: rule__DialogueCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DialogueCall__Group_1__0_in_rule__DialogueCall__Group__18607);
                    rule__DialogueCall__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDialogueCallAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group__2_in_rule__DialogueCall__Group__18617);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4350:1: rule__DialogueCall__Group__2 : ( ( rule__DialogueCall__ContextExpAssignment_2 )? ) rule__DialogueCall__Group__3 ;
    public final void rule__DialogueCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4354:1: ( ( ( rule__DialogueCall__ContextExpAssignment_2 )? ) rule__DialogueCall__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4355:1: ( ( rule__DialogueCall__ContextExpAssignment_2 )? ) rule__DialogueCall__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4355:1: ( ( rule__DialogueCall__ContextExpAssignment_2 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4356:1: ( rule__DialogueCall__ContextExpAssignment_2 )?
            {
             before(grammarAccess.getDialogueCallAccess().getContextExpAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4357:1: ( rule__DialogueCall__ContextExpAssignment_2 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=21 && LA58_0<=22)||(LA58_0>=47 && LA58_0<=48)||LA58_0==50||LA58_0==53) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4357:2: rule__DialogueCall__ContextExpAssignment_2
                    {
                    pushFollow(FOLLOW_rule__DialogueCall__ContextExpAssignment_2_in_rule__DialogueCall__Group__28645);
                    rule__DialogueCall__ContextExpAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDialogueCallAccess().getContextExpAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group__3_in_rule__DialogueCall__Group__28655);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4368:1: rule__DialogueCall__Group__3 : ( 'form' ) rule__DialogueCall__Group__4 ;
    public final void rule__DialogueCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4372:1: ( ( 'form' ) rule__DialogueCall__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4373:1: ( 'form' ) rule__DialogueCall__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4373:1: ( 'form' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4374:1: 'form'
            {
             before(grammarAccess.getDialogueCallAccess().getFormKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__DialogueCall__Group__38684); 
             after(grammarAccess.getDialogueCallAccess().getFormKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group__4_in_rule__DialogueCall__Group__38694);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4388:1: rule__DialogueCall__Group__4 : ( ( rule__DialogueCall__NameAssignment_4 ) ) ;
    public final void rule__DialogueCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4392:1: ( ( ( rule__DialogueCall__NameAssignment_4 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4393:1: ( ( rule__DialogueCall__NameAssignment_4 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4393:1: ( ( rule__DialogueCall__NameAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4394:1: ( rule__DialogueCall__NameAssignment_4 )
            {
             before(grammarAccess.getDialogueCallAccess().getNameAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4395:1: ( rule__DialogueCall__NameAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4395:2: rule__DialogueCall__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__DialogueCall__NameAssignment_4_in_rule__DialogueCall__Group__48722);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4415:1: rule__DialogueCall__Group_0__0 : ( ( rule__DialogueCall__LabelAssignment_0_0 ) ) rule__DialogueCall__Group_0__1 ;
    public final void rule__DialogueCall__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4419:1: ( ( ( rule__DialogueCall__LabelAssignment_0_0 ) ) rule__DialogueCall__Group_0__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4420:1: ( ( rule__DialogueCall__LabelAssignment_0_0 ) ) rule__DialogueCall__Group_0__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4420:1: ( ( rule__DialogueCall__LabelAssignment_0_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4421:1: ( rule__DialogueCall__LabelAssignment_0_0 )
            {
             before(grammarAccess.getDialogueCallAccess().getLabelAssignment_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4422:1: ( rule__DialogueCall__LabelAssignment_0_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4422:2: rule__DialogueCall__LabelAssignment_0_0
            {
            pushFollow(FOLLOW_rule__DialogueCall__LabelAssignment_0_0_in_rule__DialogueCall__Group_0__08766);
            rule__DialogueCall__LabelAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getDialogueCallAccess().getLabelAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group_0__1_in_rule__DialogueCall__Group_0__08775);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4433:1: rule__DialogueCall__Group_0__1 : ( ':' ) ;
    public final void rule__DialogueCall__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4437:1: ( ( ':' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4438:1: ( ':' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4438:1: ( ':' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4439:1: ':'
            {
             before(grammarAccess.getDialogueCallAccess().getColonKeyword_0_1()); 
            match(input,43,FOLLOW_43_in_rule__DialogueCall__Group_0__18804); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4456:1: rule__DialogueCall__Group_1__0 : ( 'if' ) rule__DialogueCall__Group_1__1 ;
    public final void rule__DialogueCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4460:1: ( ( 'if' ) rule__DialogueCall__Group_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4461:1: ( 'if' ) rule__DialogueCall__Group_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4461:1: ( 'if' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4462:1: 'if'
            {
             before(grammarAccess.getDialogueCallAccess().getIfKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__DialogueCall__Group_1__08844); 
             after(grammarAccess.getDialogueCallAccess().getIfKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group_1__1_in_rule__DialogueCall__Group_1__08854);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4476:1: rule__DialogueCall__Group_1__1 : ( '(' ) rule__DialogueCall__Group_1__2 ;
    public final void rule__DialogueCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4480:1: ( ( '(' ) rule__DialogueCall__Group_1__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4481:1: ( '(' ) rule__DialogueCall__Group_1__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4481:1: ( '(' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4482:1: '('
            {
             before(grammarAccess.getDialogueCallAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,45,FOLLOW_45_in_rule__DialogueCall__Group_1__18883); 
             after(grammarAccess.getDialogueCallAccess().getLeftParenthesisKeyword_1_1()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group_1__2_in_rule__DialogueCall__Group_1__18893);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4496:1: rule__DialogueCall__Group_1__2 : ( ( rule__DialogueCall__ConditionAssignment_1_2 ) ) rule__DialogueCall__Group_1__3 ;
    public final void rule__DialogueCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4500:1: ( ( ( rule__DialogueCall__ConditionAssignment_1_2 ) ) rule__DialogueCall__Group_1__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4501:1: ( ( rule__DialogueCall__ConditionAssignment_1_2 ) ) rule__DialogueCall__Group_1__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4501:1: ( ( rule__DialogueCall__ConditionAssignment_1_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4502:1: ( rule__DialogueCall__ConditionAssignment_1_2 )
            {
             before(grammarAccess.getDialogueCallAccess().getConditionAssignment_1_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4503:1: ( rule__DialogueCall__ConditionAssignment_1_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4503:2: rule__DialogueCall__ConditionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__DialogueCall__ConditionAssignment_1_2_in_rule__DialogueCall__Group_1__28921);
            rule__DialogueCall__ConditionAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getDialogueCallAccess().getConditionAssignment_1_2()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group_1__3_in_rule__DialogueCall__Group_1__28930);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4514:1: rule__DialogueCall__Group_1__3 : ( ')' ) ;
    public final void rule__DialogueCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4518:1: ( ( ')' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4519:1: ( ')' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4519:1: ( ')' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4520:1: ')'
            {
             before(grammarAccess.getDialogueCallAccess().getRightParenthesisKeyword_1_3()); 
            match(input,46,FOLLOW_46_in_rule__DialogueCall__Group_1__38959); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4541:1: rule__ProcessCall__Group__0 : ( ( rule__ProcessCall__Group_0__0 )? ) rule__ProcessCall__Group__1 ;
    public final void rule__ProcessCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4545:1: ( ( ( rule__ProcessCall__Group_0__0 )? ) rule__ProcessCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4546:1: ( ( rule__ProcessCall__Group_0__0 )? ) rule__ProcessCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4546:1: ( ( rule__ProcessCall__Group_0__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4547:1: ( rule__ProcessCall__Group_0__0 )?
            {
             before(grammarAccess.getProcessCallAccess().getGroup_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4548:1: ( rule__ProcessCall__Group_0__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_STRING) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4548:2: rule__ProcessCall__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ProcessCall__Group_0__0_in_rule__ProcessCall__Group__09002);
                    rule__ProcessCall__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessCallAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__1_in_rule__ProcessCall__Group__09012);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4559:1: rule__ProcessCall__Group__1 : ( ( rule__ProcessCall__Group_1__0 )? ) rule__ProcessCall__Group__2 ;
    public final void rule__ProcessCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4563:1: ( ( ( rule__ProcessCall__Group_1__0 )? ) rule__ProcessCall__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4564:1: ( ( rule__ProcessCall__Group_1__0 )? ) rule__ProcessCall__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4564:1: ( ( rule__ProcessCall__Group_1__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4565:1: ( rule__ProcessCall__Group_1__0 )?
            {
             before(grammarAccess.getProcessCallAccess().getGroup_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4566:1: ( rule__ProcessCall__Group_1__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==44) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4566:2: rule__ProcessCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ProcessCall__Group_1__0_in_rule__ProcessCall__Group__19040);
                    rule__ProcessCall__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessCallAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__2_in_rule__ProcessCall__Group__19050);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4577:1: rule__ProcessCall__Group__2 : ( ( rule__ProcessCall__ContextExpAssignment_2 )? ) rule__ProcessCall__Group__3 ;
    public final void rule__ProcessCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4581:1: ( ( ( rule__ProcessCall__ContextExpAssignment_2 )? ) rule__ProcessCall__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4582:1: ( ( rule__ProcessCall__ContextExpAssignment_2 )? ) rule__ProcessCall__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4582:1: ( ( rule__ProcessCall__ContextExpAssignment_2 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4583:1: ( rule__ProcessCall__ContextExpAssignment_2 )?
            {
             before(grammarAccess.getProcessCallAccess().getContextExpAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4584:1: ( rule__ProcessCall__ContextExpAssignment_2 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=21 && LA61_0<=22)||(LA61_0>=47 && LA61_0<=48)||LA61_0==50||LA61_0==53) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4584:2: rule__ProcessCall__ContextExpAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ProcessCall__ContextExpAssignment_2_in_rule__ProcessCall__Group__29078);
                    rule__ProcessCall__ContextExpAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessCallAccess().getContextExpAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__3_in_rule__ProcessCall__Group__29088);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4595:1: rule__ProcessCall__Group__3 : ( 'process' ) rule__ProcessCall__Group__4 ;
    public final void rule__ProcessCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4599:1: ( ( 'process' ) rule__ProcessCall__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4600:1: ( 'process' ) rule__ProcessCall__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4600:1: ( 'process' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4601:1: 'process'
            {
             before(grammarAccess.getProcessCallAccess().getProcessKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__ProcessCall__Group__39117); 
             after(grammarAccess.getProcessCallAccess().getProcessKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__4_in_rule__ProcessCall__Group__39127);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4615:1: rule__ProcessCall__Group__4 : ( ( rule__ProcessCall__NameAssignment_4 ) ) rule__ProcessCall__Group__5 ;
    public final void rule__ProcessCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4619:1: ( ( ( rule__ProcessCall__NameAssignment_4 ) ) rule__ProcessCall__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4620:1: ( ( rule__ProcessCall__NameAssignment_4 ) ) rule__ProcessCall__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4620:1: ( ( rule__ProcessCall__NameAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4621:1: ( rule__ProcessCall__NameAssignment_4 )
            {
             before(grammarAccess.getProcessCallAccess().getNameAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4622:1: ( rule__ProcessCall__NameAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4622:2: rule__ProcessCall__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__ProcessCall__NameAssignment_4_in_rule__ProcessCall__Group__49155);
            rule__ProcessCall__NameAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getProcessCallAccess().getNameAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__5_in_rule__ProcessCall__Group__49164);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4633:1: rule__ProcessCall__Group__5 : ( ( rule__ProcessCall__Group_5__0 )? ) ;
    public final void rule__ProcessCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4637:1: ( ( ( rule__ProcessCall__Group_5__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4638:1: ( ( rule__ProcessCall__Group_5__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4638:1: ( ( rule__ProcessCall__Group_5__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4639:1: ( rule__ProcessCall__Group_5__0 )?
            {
             before(grammarAccess.getProcessCallAccess().getGroup_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4640:1: ( rule__ProcessCall__Group_5__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==34) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4640:2: rule__ProcessCall__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ProcessCall__Group_5__0_in_rule__ProcessCall__Group__59192);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4662:1: rule__ProcessCall__Group_0__0 : ( ( rule__ProcessCall__LabelAssignment_0_0 ) ) rule__ProcessCall__Group_0__1 ;
    public final void rule__ProcessCall__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4666:1: ( ( ( rule__ProcessCall__LabelAssignment_0_0 ) ) rule__ProcessCall__Group_0__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4667:1: ( ( rule__ProcessCall__LabelAssignment_0_0 ) ) rule__ProcessCall__Group_0__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4667:1: ( ( rule__ProcessCall__LabelAssignment_0_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4668:1: ( rule__ProcessCall__LabelAssignment_0_0 )
            {
             before(grammarAccess.getProcessCallAccess().getLabelAssignment_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4669:1: ( rule__ProcessCall__LabelAssignment_0_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4669:2: rule__ProcessCall__LabelAssignment_0_0
            {
            pushFollow(FOLLOW_rule__ProcessCall__LabelAssignment_0_0_in_rule__ProcessCall__Group_0__09239);
            rule__ProcessCall__LabelAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getProcessCallAccess().getLabelAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_0__1_in_rule__ProcessCall__Group_0__09248);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4680:1: rule__ProcessCall__Group_0__1 : ( ':' ) ;
    public final void rule__ProcessCall__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4684:1: ( ( ':' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4685:1: ( ':' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4685:1: ( ':' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4686:1: ':'
            {
             before(grammarAccess.getProcessCallAccess().getColonKeyword_0_1()); 
            match(input,43,FOLLOW_43_in_rule__ProcessCall__Group_0__19277); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4703:1: rule__ProcessCall__Group_1__0 : ( 'if' ) rule__ProcessCall__Group_1__1 ;
    public final void rule__ProcessCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4707:1: ( ( 'if' ) rule__ProcessCall__Group_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4708:1: ( 'if' ) rule__ProcessCall__Group_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4708:1: ( 'if' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4709:1: 'if'
            {
             before(grammarAccess.getProcessCallAccess().getIfKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__ProcessCall__Group_1__09317); 
             after(grammarAccess.getProcessCallAccess().getIfKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_1__1_in_rule__ProcessCall__Group_1__09327);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4723:1: rule__ProcessCall__Group_1__1 : ( '(' ) rule__ProcessCall__Group_1__2 ;
    public final void rule__ProcessCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4727:1: ( ( '(' ) rule__ProcessCall__Group_1__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4728:1: ( '(' ) rule__ProcessCall__Group_1__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4728:1: ( '(' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4729:1: '('
            {
             before(grammarAccess.getProcessCallAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,45,FOLLOW_45_in_rule__ProcessCall__Group_1__19356); 
             after(grammarAccess.getProcessCallAccess().getLeftParenthesisKeyword_1_1()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_1__2_in_rule__ProcessCall__Group_1__19366);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4743:1: rule__ProcessCall__Group_1__2 : ( ( rule__ProcessCall__ConditionAssignment_1_2 ) ) rule__ProcessCall__Group_1__3 ;
    public final void rule__ProcessCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4747:1: ( ( ( rule__ProcessCall__ConditionAssignment_1_2 ) ) rule__ProcessCall__Group_1__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4748:1: ( ( rule__ProcessCall__ConditionAssignment_1_2 ) ) rule__ProcessCall__Group_1__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4748:1: ( ( rule__ProcessCall__ConditionAssignment_1_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4749:1: ( rule__ProcessCall__ConditionAssignment_1_2 )
            {
             before(grammarAccess.getProcessCallAccess().getConditionAssignment_1_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4750:1: ( rule__ProcessCall__ConditionAssignment_1_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4750:2: rule__ProcessCall__ConditionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ProcessCall__ConditionAssignment_1_2_in_rule__ProcessCall__Group_1__29394);
            rule__ProcessCall__ConditionAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getProcessCallAccess().getConditionAssignment_1_2()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_1__3_in_rule__ProcessCall__Group_1__29403);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4761:1: rule__ProcessCall__Group_1__3 : ( ')' ) ;
    public final void rule__ProcessCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4765:1: ( ( ')' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4766:1: ( ')' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4766:1: ( ')' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4767:1: ')'
            {
             before(grammarAccess.getProcessCallAccess().getRightParenthesisKeyword_1_3()); 
            match(input,46,FOLLOW_46_in_rule__ProcessCall__Group_1__39432); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4788:1: rule__ProcessCall__Group_5__0 : ( 'label' ) rule__ProcessCall__Group_5__1 ;
    public final void rule__ProcessCall__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4792:1: ( ( 'label' ) rule__ProcessCall__Group_5__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4793:1: ( 'label' ) rule__ProcessCall__Group_5__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4793:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4794:1: 'label'
            {
             before(grammarAccess.getProcessCallAccess().getLabelKeyword_5_0()); 
            match(input,34,FOLLOW_34_in_rule__ProcessCall__Group_5__09476); 
             after(grammarAccess.getProcessCallAccess().getLabelKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_5__1_in_rule__ProcessCall__Group_5__09486);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4808:1: rule__ProcessCall__Group_5__1 : ( ( rule__ProcessCall__LabelAssignment_5_1 ) ) ;
    public final void rule__ProcessCall__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4812:1: ( ( ( rule__ProcessCall__LabelAssignment_5_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4813:1: ( ( rule__ProcessCall__LabelAssignment_5_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4813:1: ( ( rule__ProcessCall__LabelAssignment_5_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4814:1: ( rule__ProcessCall__LabelAssignment_5_1 )
            {
             before(grammarAccess.getProcessCallAccess().getLabelAssignment_5_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4815:1: ( rule__ProcessCall__LabelAssignment_5_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4815:2: rule__ProcessCall__LabelAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ProcessCall__LabelAssignment_5_1_in_rule__ProcessCall__Group_5__19514);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4829:1: rule__OperationExpression__Group__0 : ( 'call' ) rule__OperationExpression__Group__1 ;
    public final void rule__OperationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4833:1: ( ( 'call' ) rule__OperationExpression__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4834:1: ( 'call' ) rule__OperationExpression__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4834:1: ( 'call' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4835:1: 'call'
            {
             before(grammarAccess.getOperationExpressionAccess().getCallKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__OperationExpression__Group__09553); 
             after(grammarAccess.getOperationExpressionAccess().getCallKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__OperationExpression__Group__1_in_rule__OperationExpression__Group__09563);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4849:1: rule__OperationExpression__Group__1 : ( ( rule__OperationExpression__NameAssignment_1 ) ) ;
    public final void rule__OperationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4853:1: ( ( ( rule__OperationExpression__NameAssignment_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4854:1: ( ( rule__OperationExpression__NameAssignment_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4854:1: ( ( rule__OperationExpression__NameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4855:1: ( rule__OperationExpression__NameAssignment_1 )
            {
             before(grammarAccess.getOperationExpressionAccess().getNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4856:1: ( rule__OperationExpression__NameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4856:2: rule__OperationExpression__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OperationExpression__NameAssignment_1_in_rule__OperationExpression__Group__19591);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4870:1: rule__SimpleProcessCall__Group__0 : ( ( rule__SimpleProcessCall__NameAssignment_0 ) ) rule__SimpleProcessCall__Group__1 ;
    public final void rule__SimpleProcessCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4874:1: ( ( ( rule__SimpleProcessCall__NameAssignment_0 ) ) rule__SimpleProcessCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4875:1: ( ( rule__SimpleProcessCall__NameAssignment_0 ) ) rule__SimpleProcessCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4875:1: ( ( rule__SimpleProcessCall__NameAssignment_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4876:1: ( rule__SimpleProcessCall__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleProcessCallAccess().getNameAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4877:1: ( rule__SimpleProcessCall__NameAssignment_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4877:2: rule__SimpleProcessCall__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleProcessCall__NameAssignment_0_in_rule__SimpleProcessCall__Group__09629);
            rule__SimpleProcessCall__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSimpleProcessCallAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleProcessCall__Group__1_in_rule__SimpleProcessCall__Group__09638);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4888:1: rule__SimpleProcessCall__Group__1 : ( ( rule__SimpleProcessCall__Group_1__0 )? ) ;
    public final void rule__SimpleProcessCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4892:1: ( ( ( rule__SimpleProcessCall__Group_1__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4893:1: ( ( rule__SimpleProcessCall__Group_1__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4893:1: ( ( rule__SimpleProcessCall__Group_1__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4894:1: ( rule__SimpleProcessCall__Group_1__0 )?
            {
             before(grammarAccess.getSimpleProcessCallAccess().getGroup_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4895:1: ( rule__SimpleProcessCall__Group_1__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==34) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4895:2: rule__SimpleProcessCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SimpleProcessCall__Group_1__0_in_rule__SimpleProcessCall__Group__19666);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4909:1: rule__SimpleProcessCall__Group_1__0 : ( 'label' ) rule__SimpleProcessCall__Group_1__1 ;
    public final void rule__SimpleProcessCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4913:1: ( ( 'label' ) rule__SimpleProcessCall__Group_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4914:1: ( 'label' ) rule__SimpleProcessCall__Group_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4914:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4915:1: 'label'
            {
             before(grammarAccess.getSimpleProcessCallAccess().getLabelKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__SimpleProcessCall__Group_1__09706); 
             after(grammarAccess.getSimpleProcessCallAccess().getLabelKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleProcessCall__Group_1__1_in_rule__SimpleProcessCall__Group_1__09716);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4929:1: rule__SimpleProcessCall__Group_1__1 : ( ( rule__SimpleProcessCall__LabelAssignment_1_1 ) ) ;
    public final void rule__SimpleProcessCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4933:1: ( ( ( rule__SimpleProcessCall__LabelAssignment_1_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4934:1: ( ( rule__SimpleProcessCall__LabelAssignment_1_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4934:1: ( ( rule__SimpleProcessCall__LabelAssignment_1_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4935:1: ( rule__SimpleProcessCall__LabelAssignment_1_1 )
            {
             before(grammarAccess.getSimpleProcessCallAccess().getLabelAssignment_1_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4936:1: ( rule__SimpleProcessCall__LabelAssignment_1_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4936:2: rule__SimpleProcessCall__LabelAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SimpleProcessCall__LabelAssignment_1_1_in_rule__SimpleProcessCall__Group_1__19744);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4950:1: rule__ServiceExpression__Group__0 : ( 'service' ) rule__ServiceExpression__Group__1 ;
    public final void rule__ServiceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4954:1: ( ( 'service' ) rule__ServiceExpression__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4955:1: ( 'service' ) rule__ServiceExpression__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4955:1: ( 'service' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4956:1: 'service'
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__ServiceExpression__Group__09783); 
             after(grammarAccess.getServiceExpressionAccess().getServiceKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ServiceExpression__Group__1_in_rule__ServiceExpression__Group__09793);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4970:1: rule__ServiceExpression__Group__1 : ( ( rule__ServiceExpression__ServiceNameAssignment_1 ) ) rule__ServiceExpression__Group__2 ;
    public final void rule__ServiceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4974:1: ( ( ( rule__ServiceExpression__ServiceNameAssignment_1 ) ) rule__ServiceExpression__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4975:1: ( ( rule__ServiceExpression__ServiceNameAssignment_1 ) ) rule__ServiceExpression__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4975:1: ( ( rule__ServiceExpression__ServiceNameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4976:1: ( rule__ServiceExpression__ServiceNameAssignment_1 )
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4977:1: ( rule__ServiceExpression__ServiceNameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4977:2: rule__ServiceExpression__ServiceNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ServiceExpression__ServiceNameAssignment_1_in_rule__ServiceExpression__Group__19821);
            rule__ServiceExpression__ServiceNameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getServiceExpressionAccess().getServiceNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ServiceExpression__Group__2_in_rule__ServiceExpression__Group__19830);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4988:1: rule__ServiceExpression__Group__2 : ( '.' ) rule__ServiceExpression__Group__3 ;
    public final void rule__ServiceExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4992:1: ( ( '.' ) rule__ServiceExpression__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4993:1: ( '.' ) rule__ServiceExpression__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4993:1: ( '.' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4994:1: '.'
            {
             before(grammarAccess.getServiceExpressionAccess().getFullStopKeyword_2()); 
            match(input,49,FOLLOW_49_in_rule__ServiceExpression__Group__29859); 
             after(grammarAccess.getServiceExpressionAccess().getFullStopKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__ServiceExpression__Group__3_in_rule__ServiceExpression__Group__29869);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5008:1: rule__ServiceExpression__Group__3 : ( ( rule__ServiceExpression__ServiceMethodAssignment_3 ) ) ;
    public final void rule__ServiceExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5012:1: ( ( ( rule__ServiceExpression__ServiceMethodAssignment_3 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5013:1: ( ( rule__ServiceExpression__ServiceMethodAssignment_3 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5013:1: ( ( rule__ServiceExpression__ServiceMethodAssignment_3 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5014:1: ( rule__ServiceExpression__ServiceMethodAssignment_3 )
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceMethodAssignment_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5015:1: ( rule__ServiceExpression__ServiceMethodAssignment_3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5015:2: rule__ServiceExpression__ServiceMethodAssignment_3
            {
            pushFollow(FOLLOW_rule__ServiceExpression__ServiceMethodAssignment_3_in_rule__ServiceExpression__Group__39897);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5033:1: rule__NavigationExpression__Group__0 : ( ( rule__NavigationExpression__CompositionAssignment_0 )? ) rule__NavigationExpression__Group__1 ;
    public final void rule__NavigationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5037:1: ( ( ( rule__NavigationExpression__CompositionAssignment_0 )? ) rule__NavigationExpression__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5038:1: ( ( rule__NavigationExpression__CompositionAssignment_0 )? ) rule__NavigationExpression__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5038:1: ( ( rule__NavigationExpression__CompositionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5039:1: ( rule__NavigationExpression__CompositionAssignment_0 )?
            {
             before(grammarAccess.getNavigationExpressionAccess().getCompositionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5040:1: ( rule__NavigationExpression__CompositionAssignment_0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==53) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5040:2: rule__NavigationExpression__CompositionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__NavigationExpression__CompositionAssignment_0_in_rule__NavigationExpression__Group__09939);
                    rule__NavigationExpression__CompositionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNavigationExpressionAccess().getCompositionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__NavigationExpression__Group__1_in_rule__NavigationExpression__Group__09949);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5051:1: rule__NavigationExpression__Group__1 : ( 'navigate' ) rule__NavigationExpression__Group__2 ;
    public final void rule__NavigationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5055:1: ( ( 'navigate' ) rule__NavigationExpression__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5056:1: ( 'navigate' ) rule__NavigationExpression__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5056:1: ( 'navigate' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5057:1: 'navigate'
            {
             before(grammarAccess.getNavigationExpressionAccess().getNavigateKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__NavigationExpression__Group__19978); 
             after(grammarAccess.getNavigationExpressionAccess().getNavigateKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__NavigationExpression__Group__2_in_rule__NavigationExpression__Group__19988);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5071:1: rule__NavigationExpression__Group__2 : ( ( rule__NavigationExpression__ReferencesAssignment_2 ) ) ;
    public final void rule__NavigationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5075:1: ( ( ( rule__NavigationExpression__ReferencesAssignment_2 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5076:1: ( ( rule__NavigationExpression__ReferencesAssignment_2 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5076:1: ( ( rule__NavigationExpression__ReferencesAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5077:1: ( rule__NavigationExpression__ReferencesAssignment_2 )
            {
             before(grammarAccess.getNavigationExpressionAccess().getReferencesAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5078:1: ( rule__NavigationExpression__ReferencesAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5078:2: rule__NavigationExpression__ReferencesAssignment_2
            {
            pushFollow(FOLLOW_rule__NavigationExpression__ReferencesAssignment_2_in_rule__NavigationExpression__Group__210016);
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


    // $ANTLR start rule__PresentationModel__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5094:1: rule__PresentationModel__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__PresentationModel__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5098:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5099:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5099:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5100:1: RULE_STRING
            {
             before(grammarAccess.getPresentationModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PresentationModel__DescriptionAssignment_010056); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5109:1: rule__PresentationModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PresentationModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5113:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5114:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5114:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5115:1: RULE_ID
            {
             before(grammarAccess.getPresentationModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PresentationModel__NameAssignment_210087); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5124:1: rule__PresentationModel__ExternalReferencesAssignment_4 : ( ruleExternalReference ) ;
    public final void rule__PresentationModel__ExternalReferencesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5128:1: ( ( ruleExternalReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5129:1: ( ruleExternalReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5129:1: ( ruleExternalReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5130:1: ruleExternalReference
            {
             before(grammarAccess.getPresentationModelAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExternalReference_in_rule__PresentationModel__ExternalReferencesAssignment_410118);
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


    // $ANTLR start rule__PresentationModel__StartAssignment_5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5139:1: rule__PresentationModel__StartAssignment_5 : ( ruleApplication ) ;
    public final void rule__PresentationModel__StartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5143:1: ( ( ruleApplication ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5144:1: ( ruleApplication )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5144:1: ( ruleApplication )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5145:1: ruleApplication
            {
             before(grammarAccess.getPresentationModelAccess().getStartApplicationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__PresentationModel__StartAssignment_510149);
            ruleApplication();
            _fsp--;

             after(grammarAccess.getPresentationModelAccess().getStartApplicationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PresentationModel__StartAssignment_5


    // $ANTLR start rule__PresentationModel__ElementsAssignment_6
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5154:1: rule__PresentationModel__ElementsAssignment_6 : ( ruleModelElementWithContext ) ;
    public final void rule__PresentationModel__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5158:1: ( ( ruleModelElementWithContext ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5159:1: ( ruleModelElementWithContext )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5159:1: ( ruleModelElementWithContext )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5160:1: ruleModelElementWithContext
            {
             before(grammarAccess.getPresentationModelAccess().getElementsModelElementWithContextParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleModelElementWithContext_in_rule__PresentationModel__ElementsAssignment_610180);
            ruleModelElementWithContext();
            _fsp--;

             after(grammarAccess.getPresentationModelAccess().getElementsModelElementWithContextParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PresentationModel__ElementsAssignment_6


    // $ANTLR start rule__Application__StartProcessesAssignment_2_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5169:1: rule__Application__StartProcessesAssignment_2_0 : ( ruleSimpleProcessCall ) ;
    public final void rule__Application__StartProcessesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5173:1: ( ( ruleSimpleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5174:1: ( ruleSimpleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5174:1: ( ruleSimpleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5175:1: ruleSimpleProcessCall
            {
             before(grammarAccess.getApplicationAccess().getStartProcessesSimpleProcessCallParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleSimpleProcessCall_in_rule__Application__StartProcessesAssignment_2_010211);
            ruleSimpleProcessCall();
            _fsp--;

             after(grammarAccess.getApplicationAccess().getStartProcessesSimpleProcessCallParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__StartProcessesAssignment_2_0


    // $ANTLR start rule__ExternalReference__ModelNameAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5184:1: rule__ExternalReference__ModelNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExternalReference__ModelNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5188:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5189:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5189:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5190:1: RULE_ID
            {
             before(grammarAccess.getExternalReferenceAccess().getModelNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalReference__ModelNameAssignment_110242); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5199:1: rule__ExternalReference__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ExternalReference__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5203:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5204:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5204:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5205:1: RULE_ID
            {
             before(grammarAccess.getExternalReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalReference__NameAssignment_310273); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5214:1: rule__ContentForm__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ContentForm__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5218:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5219:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5219:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5220:1: RULE_STRING
            {
             before(grammarAccess.getContentFormAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ContentForm__DescriptionAssignment_010304); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5229:1: rule__ContentForm__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ContentForm__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5233:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5234:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5234:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5235:1: RULE_ID
            {
             before(grammarAccess.getContentFormAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContentForm__NameAssignment_210335); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5244:1: rule__ContentForm__CollectionContextAssignment_4 : ( ( 'list' ) ) ;
    public final void rule__ContentForm__CollectionContextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5248:1: ( ( ( 'list' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5249:1: ( ( 'list' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5249:1: ( ( 'list' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5250:1: ( 'list' )
            {
             before(grammarAccess.getContentFormAccess().getCollectionContextListKeyword_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5251:1: ( 'list' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5252:1: 'list'
            {
             before(grammarAccess.getContentFormAccess().getCollectionContextListKeyword_4_0()); 
            match(input,51,FOLLOW_51_in_rule__ContentForm__CollectionContextAssignment_410371); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5267:1: rule__ContentForm__ContextRefAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ContentForm__ContextRefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5271:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5272:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5272:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5273:1: ( RULE_ID )
            {
             before(grammarAccess.getContentFormAccess().getContextRefExternalReferenceCrossReference_5_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5274:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5275:1: RULE_ID
            {
             before(grammarAccess.getContentFormAccess().getContextRefExternalReferenceIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContentForm__ContextRefAssignment_510414); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5286:1: rule__ContentForm__ReadonlyAssignment_7_1_0 : ( ( 'true' ) ) ;
    public final void rule__ContentForm__ReadonlyAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5290:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5291:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5291:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5292:1: ( 'true' )
            {
             before(grammarAccess.getContentFormAccess().getReadonlyTrueKeyword_7_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5293:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5294:1: 'true'
            {
             before(grammarAccess.getContentFormAccess().getReadonlyTrueKeyword_7_1_0_0()); 
            match(input,52,FOLLOW_52_in_rule__ContentForm__ReadonlyAssignment_7_1_010454); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5309:1: rule__ContentForm__FormElementsAssignment_8 : ( ruleFormElement ) ;
    public final void rule__ContentForm__FormElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5313:1: ( ( ruleFormElement ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5314:1: ( ruleFormElement )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5314:1: ( ruleFormElement )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5315:1: ruleFormElement
            {
             before(grammarAccess.getContentFormAccess().getFormElementsFormElementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleFormElement_in_rule__ContentForm__FormElementsAssignment_810493);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5324:1: rule__ContentForm__ActionsAssignment_9_2_0 : ( ruleAction ) ;
    public final void rule__ContentForm__ActionsAssignment_9_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5328:1: ( ( ruleAction ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5329:1: ( ruleAction )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5329:1: ( ruleAction )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5330:1: ruleAction
            {
             before(grammarAccess.getContentFormAccess().getActionsActionParserRuleCall_9_2_0_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__ContentForm__ActionsAssignment_9_2_010524);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5339:1: rule__ContentForm__ProcessesAssignment_10_2_0 : ( ruleSimpleProcessCall ) ;
    public final void rule__ContentForm__ProcessesAssignment_10_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5343:1: ( ( ruleSimpleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5344:1: ( ruleSimpleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5344:1: ( ruleSimpleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5345:1: ruleSimpleProcessCall
            {
             before(grammarAccess.getContentFormAccess().getProcessesSimpleProcessCallParserRuleCall_10_2_0_0()); 
            pushFollow(FOLLOW_ruleSimpleProcessCall_in_rule__ContentForm__ProcessesAssignment_10_2_010555);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5354:1: rule__Action__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Action__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5358:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5359:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5359:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5360:1: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Action__DescriptionAssignment_010586); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5369:1: rule__Action__TypeAssignment_1 : ( ruleProcessType ) ;
    public final void rule__Action__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5373:1: ( ( ruleProcessType ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5374:1: ( ruleProcessType )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5374:1: ( ruleProcessType )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5375:1: ruleProcessType
            {
             before(grammarAccess.getActionAccess().getTypeProcessTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProcessType_in_rule__Action__TypeAssignment_110617);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5384:1: rule__Action__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5388:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5389:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5389:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5390:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__NameAssignment_210648); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5399:1: rule__Action__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Action__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5403:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5404:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5404:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5405:1: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Action__LabelAssignment_3_110679); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5414:1: rule__Action__ProcessElementsAssignment_4 : ( ruleActionDialogueCall ) ;
    public final void rule__Action__ProcessElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5418:1: ( ( ruleActionDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5419:1: ( ruleActionDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5419:1: ( ruleActionDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5420:1: ruleActionDialogueCall
            {
             before(grammarAccess.getActionAccess().getProcessElementsActionDialogueCallParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleActionDialogueCall_in_rule__Action__ProcessElementsAssignment_410710);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5429:1: rule__CompoundDialogue__DescriptionAssignment_0_0 : ( RULE_STRING ) ;
    public final void rule__CompoundDialogue__DescriptionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5433:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5434:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5434:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5435:1: RULE_STRING
            {
             before(grammarAccess.getCompoundDialogueAccess().getDescriptionSTRINGTerminalRuleCall_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CompoundDialogue__DescriptionAssignment_0_010741); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5444:1: rule__CompoundDialogue__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__CompoundDialogue__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5448:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5449:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5449:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5450:1: RULE_ID
            {
             before(grammarAccess.getCompoundDialogueAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CompoundDialogue__NameAssignment_0_210772); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5459:1: rule__CompoundDialogue__ContextRefAssignment_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__CompoundDialogue__ContextRefAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5463:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5464:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5464:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5465:1: ( RULE_ID )
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextRefExternalReferenceCrossReference_0_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5466:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5467:1: RULE_ID
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextRefExternalReferenceIDTerminalRuleCall_0_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CompoundDialogue__ContextRefAssignment_0_410807); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5478:1: rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 : ( ( 'true' ) ) ;
    public final void rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5482:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5483:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5483:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5484:1: ( 'true' )
            {
             before(grammarAccess.getCompoundDialogueAccess().getReadonlyTrueKeyword_0_5_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5485:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5486:1: 'true'
            {
             before(grammarAccess.getCompoundDialogueAccess().getReadonlyTrueKeyword_0_5_1_0_0()); 
            match(input,52,FOLLOW_52_in_rule__CompoundDialogue__ReadonlyAssignment_0_5_1_010847); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5501:1: rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 : ( ruleDialogueCall ) ;
    public final void rule__CompoundDialogue__DialoguesAssignment_0_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5505:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5506:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5506:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5507:1: ruleDialogueCall
            {
             before(grammarAccess.getCompoundDialogueAccess().getDialoguesDialogueCallParserRuleCall_0_6_2_0_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__CompoundDialogue__DialoguesAssignment_0_6_2_010886);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5516:1: rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 : ( ruleProcessCall ) ;
    public final void rule__CompoundDialogue__ProcessesAssignment_0_7_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5520:1: ( ( ruleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5521:1: ( ruleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5521:1: ( ruleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5522:1: ruleProcessCall
            {
             before(grammarAccess.getCompoundDialogueAccess().getProcessesProcessCallParserRuleCall_0_7_2_0_0()); 
            pushFollow(FOLLOW_ruleProcessCall_in_rule__CompoundDialogue__ProcessesAssignment_0_7_2_010917);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5531:1: rule__CollectionDialogue__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__CollectionDialogue__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5535:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5536:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5536:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5537:1: RULE_STRING
            {
             before(grammarAccess.getCollectionDialogueAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CollectionDialogue__DescriptionAssignment_010948); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5546:1: rule__CollectionDialogue__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CollectionDialogue__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5550:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5551:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5551:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5552:1: RULE_ID
            {
             before(grammarAccess.getCollectionDialogueAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CollectionDialogue__NameAssignment_210979); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5561:1: rule__CollectionDialogue__ContextRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__CollectionDialogue__ContextRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5565:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5566:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5566:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5567:1: ( RULE_ID )
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextRefExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5568:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5569:1: RULE_ID
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CollectionDialogue__ContextRefAssignment_411014); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5580:1: rule__CollectionDialogue__ReadonlyAssignment_6_1_0 : ( ( 'true' ) ) ;
    public final void rule__CollectionDialogue__ReadonlyAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5584:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5585:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5585:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5586:1: ( 'true' )
            {
             before(grammarAccess.getCollectionDialogueAccess().getReadonlyTrueKeyword_6_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5587:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5588:1: 'true'
            {
             before(grammarAccess.getCollectionDialogueAccess().getReadonlyTrueKeyword_6_1_0_0()); 
            match(input,52,FOLLOW_52_in_rule__CollectionDialogue__ReadonlyAssignment_6_1_011054); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5603:1: rule__CollectionDialogue__DialoguesAssignment_7_2_0 : ( ruleDialogueCall ) ;
    public final void rule__CollectionDialogue__DialoguesAssignment_7_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5607:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5608:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5608:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5609:1: ruleDialogueCall
            {
             before(grammarAccess.getCollectionDialogueAccess().getDialoguesDialogueCallParserRuleCall_7_2_0_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__CollectionDialogue__DialoguesAssignment_7_2_011093);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5618:1: rule__CollectionDialogue__ProcessesAssignment_8_2_0 : ( ruleProcessCall ) ;
    public final void rule__CollectionDialogue__ProcessesAssignment_8_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5622:1: ( ( ruleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5623:1: ( ruleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5623:1: ( ruleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5624:1: ruleProcessCall
            {
             before(grammarAccess.getCollectionDialogueAccess().getProcessesProcessCallParserRuleCall_8_2_0_0()); 
            pushFollow(FOLLOW_ruleProcessCall_in_rule__CollectionDialogue__ProcessesAssignment_8_2_011124);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5633:1: rule__MasterDetail__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MasterDetail__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5637:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5638:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5638:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5639:1: RULE_STRING
            {
             before(grammarAccess.getMasterDetailAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MasterDetail__DescriptionAssignment_011155); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5648:1: rule__MasterDetail__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MasterDetail__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5652:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5653:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5653:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5654:1: RULE_ID
            {
             before(grammarAccess.getMasterDetailAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MasterDetail__NameAssignment_211186); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5663:1: rule__MasterDetail__ContextRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__MasterDetail__ContextRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5667:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5668:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5668:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5669:1: ( RULE_ID )
            {
             before(grammarAccess.getMasterDetailAccess().getContextRefExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5670:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5671:1: RULE_ID
            {
             before(grammarAccess.getMasterDetailAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MasterDetail__ContextRefAssignment_411221); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5682:1: rule__MasterDetail__ReadonlyAssignment_5_1_0 : ( ( 'true' ) ) ;
    public final void rule__MasterDetail__ReadonlyAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5686:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5687:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5687:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5688:1: ( 'true' )
            {
             before(grammarAccess.getMasterDetailAccess().getReadonlyTrueKeyword_5_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5689:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5690:1: 'true'
            {
             before(grammarAccess.getMasterDetailAccess().getReadonlyTrueKeyword_5_1_0_0()); 
            match(input,52,FOLLOW_52_in_rule__MasterDetail__ReadonlyAssignment_5_1_011261); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5705:1: rule__MasterDetail__MasterAssignment_7 : ( ruleDialogueCall ) ;
    public final void rule__MasterDetail__MasterAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5709:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5710:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5710:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5711:1: ruleDialogueCall
            {
             before(grammarAccess.getMasterDetailAccess().getMasterDialogueCallParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__MasterDetail__MasterAssignment_711300);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5720:1: rule__MasterDetail__DetailAssignment_10 : ( ruleDialogueCall ) ;
    public final void rule__MasterDetail__DetailAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5724:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5725:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5725:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5726:1: ruleDialogueCall
            {
             before(grammarAccess.getMasterDetailAccess().getDetailDialogueCallParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__MasterDetail__DetailAssignment_1011331);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5735:1: rule__MasterDetail__ProcessesAssignment_12_2_0 : ( ruleProcessCall ) ;
    public final void rule__MasterDetail__ProcessesAssignment_12_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5739:1: ( ( ruleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5740:1: ( ruleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5740:1: ( ruleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5741:1: ruleProcessCall
            {
             before(grammarAccess.getMasterDetailAccess().getProcessesProcessCallParserRuleCall_12_2_0_0()); 
            pushFollow(FOLLOW_ruleProcessCall_in_rule__MasterDetail__ProcessesAssignment_12_2_011362);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5750:1: rule__Process__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Process__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5754:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5755:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5755:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5756:1: RULE_STRING
            {
             before(grammarAccess.getProcessAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Process__DescriptionAssignment_011393); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5765:1: rule__Process__TypeAssignment_2_0 : ( ruleProcessType ) ;
    public final void rule__Process__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5769:1: ( ( ruleProcessType ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5770:1: ( ruleProcessType )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5770:1: ( ruleProcessType )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5771:1: ruleProcessType
            {
             before(grammarAccess.getProcessAccess().getTypeProcessTypeEnumRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleProcessType_in_rule__Process__TypeAssignment_2_011424);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5780:1: rule__Process__TypeAssignment_2_1_0 : ( ruleProcessTypeLink ) ;
    public final void rule__Process__TypeAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5784:1: ( ( ruleProcessTypeLink ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5785:1: ( ruleProcessTypeLink )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5785:1: ( ruleProcessTypeLink )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5786:1: ruleProcessTypeLink
            {
             before(grammarAccess.getProcessAccess().getTypeProcessTypeLinkEnumRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleProcessTypeLink_in_rule__Process__TypeAssignment_2_1_011455);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5795:1: rule__Process__LinkAssignment_2_1_1 : ( ruleAssociationRoleReference ) ;
    public final void rule__Process__LinkAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5799:1: ( ( ruleAssociationRoleReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5800:1: ( ruleAssociationRoleReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5800:1: ( ruleAssociationRoleReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5801:1: ruleAssociationRoleReference
            {
             before(grammarAccess.getProcessAccess().getLinkAssociationRoleReferenceParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_rule__Process__LinkAssignment_2_1_111486);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5810:1: rule__Process__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5814:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5815:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5815:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5816:1: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Process__NameAssignment_311517); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5825:1: rule__Process__CollectionContextAssignment_5 : ( ( 'list' ) ) ;
    public final void rule__Process__CollectionContextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5829:1: ( ( ( 'list' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5830:1: ( ( 'list' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5830:1: ( ( 'list' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5831:1: ( 'list' )
            {
             before(grammarAccess.getProcessAccess().getCollectionContextListKeyword_5_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5832:1: ( 'list' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5833:1: 'list'
            {
             before(grammarAccess.getProcessAccess().getCollectionContextListKeyword_5_0()); 
            match(input,51,FOLLOW_51_in_rule__Process__CollectionContextAssignment_511553); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5848:1: rule__Process__ContextRefAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Process__ContextRefAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5852:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5853:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5853:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5854:1: ( RULE_ID )
            {
             before(grammarAccess.getProcessAccess().getContextRefExternalReferenceCrossReference_6_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5855:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5856:1: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getContextRefExternalReferenceIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Process__ContextRefAssignment_611596); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5867:1: rule__Process__ProcessElementsAssignment_7_1_1_0 : ( ruleUICall ) ;
    public final void rule__Process__ProcessElementsAssignment_7_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5871:1: ( ( ruleUICall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5872:1: ( ruleUICall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5872:1: ( ruleUICall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5873:1: ruleUICall
            {
             before(grammarAccess.getProcessAccess().getProcessElementsUICallParserRuleCall_7_1_1_0_0()); 
            pushFollow(FOLLOW_ruleUICall_in_rule__Process__ProcessElementsAssignment_7_1_1_011631);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5882:1: rule__FormElement__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__FormElement__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5886:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5887:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5887:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5888:1: RULE_STRING
            {
             before(grammarAccess.getFormElementAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FormElement__DescriptionAssignment_011662); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5897:1: rule__FormElement__ReferencesAssignment_2 : ( ruleDtoPropertyReference ) ;
    public final void rule__FormElement__ReferencesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5901:1: ( ( ruleDtoPropertyReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5902:1: ( ruleDtoPropertyReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5902:1: ( ruleDtoPropertyReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5903:1: ruleDtoPropertyReference
            {
             before(grammarAccess.getFormElementAccess().getReferencesDtoPropertyReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_rule__FormElement__ReferencesAssignment_211693);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5912:1: rule__FormElement__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__FormElement__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5916:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5917:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5917:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5918:1: RULE_STRING
            {
             before(grammarAccess.getFormElementAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FormElement__LabelAssignment_3_111724); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5927:1: rule__FormElement__ReadonlyAssignment_4_1_0 : ( ( 'true' ) ) ;
    public final void rule__FormElement__ReadonlyAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5931:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5932:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5932:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5933:1: ( 'true' )
            {
             before(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_4_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5934:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5935:1: 'true'
            {
             before(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_4_1_0_0()); 
            match(input,52,FOLLOW_52_in_rule__FormElement__ReadonlyAssignment_4_1_011760); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5950:1: rule__ActionDialogueCall__ContextExpAssignment_0 : ( ruleExpression ) ;
    public final void rule__ActionDialogueCall__ContextExpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5954:1: ( ( ruleExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5955:1: ( ruleExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5955:1: ( ruleExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5956:1: ruleExpression
            {
             before(grammarAccess.getActionDialogueCallAccess().getContextExpExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ActionDialogueCall__ContextExpAssignment_011799);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5965:1: rule__ActionDialogueCall__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ActionDialogueCall__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5969:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5970:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5970:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5971:1: RULE_ID
            {
             before(grammarAccess.getActionDialogueCallAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionDialogueCall__NameAssignment_211830); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5980:1: rule__DialogueCall__LabelAssignment_0_0 : ( RULE_STRING ) ;
    public final void rule__DialogueCall__LabelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5984:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5985:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5985:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5986:1: RULE_STRING
            {
             before(grammarAccess.getDialogueCallAccess().getLabelSTRINGTerminalRuleCall_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DialogueCall__LabelAssignment_0_011861); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5995:1: rule__DialogueCall__ConditionAssignment_1_2 : ( ruleOperationExpression ) ;
    public final void rule__DialogueCall__ConditionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5999:1: ( ( ruleOperationExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6000:1: ( ruleOperationExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6000:1: ( ruleOperationExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6001:1: ruleOperationExpression
            {
             before(grammarAccess.getDialogueCallAccess().getConditionOperationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleOperationExpression_in_rule__DialogueCall__ConditionAssignment_1_211892);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6010:1: rule__DialogueCall__ContextExpAssignment_2 : ( ruleExpression ) ;
    public final void rule__DialogueCall__ContextExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6014:1: ( ( ruleExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6015:1: ( ruleExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6015:1: ( ruleExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6016:1: ruleExpression
            {
             before(grammarAccess.getDialogueCallAccess().getContextExpExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__DialogueCall__ContextExpAssignment_211923);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6025:1: rule__DialogueCall__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__DialogueCall__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6029:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6030:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6030:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6031:1: RULE_ID
            {
             before(grammarAccess.getDialogueCallAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DialogueCall__NameAssignment_411954); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6040:1: rule__ProcessCall__LabelAssignment_0_0 : ( RULE_STRING ) ;
    public final void rule__ProcessCall__LabelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6044:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6045:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6045:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6046:1: RULE_STRING
            {
             before(grammarAccess.getProcessCallAccess().getLabelSTRINGTerminalRuleCall_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ProcessCall__LabelAssignment_0_011985); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6055:1: rule__ProcessCall__ConditionAssignment_1_2 : ( ruleOperationExpression ) ;
    public final void rule__ProcessCall__ConditionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6059:1: ( ( ruleOperationExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6060:1: ( ruleOperationExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6060:1: ( ruleOperationExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6061:1: ruleOperationExpression
            {
             before(grammarAccess.getProcessCallAccess().getConditionOperationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleOperationExpression_in_rule__ProcessCall__ConditionAssignment_1_212016);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6070:1: rule__ProcessCall__ContextExpAssignment_2 : ( ruleExpression ) ;
    public final void rule__ProcessCall__ContextExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6074:1: ( ( ruleExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6075:1: ( ruleExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6075:1: ( ruleExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6076:1: ruleExpression
            {
             before(grammarAccess.getProcessCallAccess().getContextExpExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ProcessCall__ContextExpAssignment_212047);
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


    // $ANTLR start rule__ProcessCall__NameAssignment_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6085:1: rule__ProcessCall__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__ProcessCall__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6089:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6090:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6090:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6091:1: RULE_ID
            {
             before(grammarAccess.getProcessCallAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProcessCall__NameAssignment_412078); 
             after(grammarAccess.getProcessCallAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__NameAssignment_4


    // $ANTLR start rule__ProcessCall__LabelAssignment_5_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6100:1: rule__ProcessCall__LabelAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__ProcessCall__LabelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6104:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6105:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6105:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6106:1: RULE_ID
            {
             before(grammarAccess.getProcessCallAccess().getLabelIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProcessCall__LabelAssignment_5_112109); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6115:1: rule__OperationExpression__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OperationExpression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6119:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6120:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6120:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6121:1: RULE_ID
            {
             before(grammarAccess.getOperationExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OperationExpression__NameAssignment_112140); 
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


    // $ANTLR start rule__SimpleProcessCall__NameAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6130:1: rule__SimpleProcessCall__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleProcessCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6134:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6135:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6135:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6136:1: RULE_ID
            {
             before(grammarAccess.getSimpleProcessCallAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleProcessCall__NameAssignment_012171); 
             after(grammarAccess.getSimpleProcessCallAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleProcessCall__NameAssignment_0


    // $ANTLR start rule__SimpleProcessCall__LabelAssignment_1_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6145:1: rule__SimpleProcessCall__LabelAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__SimpleProcessCall__LabelAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6149:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6150:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6150:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6151:1: RULE_STRING
            {
             before(grammarAccess.getSimpleProcessCallAccess().getLabelSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleProcessCall__LabelAssignment_1_112202); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6160:1: rule__StandardExpression__TypeAssignment : ( ruleExpressionType ) ;
    public final void rule__StandardExpression__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6164:1: ( ( ruleExpressionType ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6165:1: ( ruleExpressionType )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6165:1: ( ruleExpressionType )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6166:1: ruleExpressionType
            {
             before(grammarAccess.getStandardExpressionAccess().getTypeExpressionTypeEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleExpressionType_in_rule__StandardExpression__TypeAssignment12233);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6175:1: rule__ServiceExpression__ServiceNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceExpression__ServiceNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6179:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6180:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6180:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6181:1: RULE_ID
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceExpression__ServiceNameAssignment_112264); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6190:1: rule__ServiceExpression__ServiceMethodAssignment_3 : ( RULE_ID ) ;
    public final void rule__ServiceExpression__ServiceMethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6194:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6195:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6195:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6196:1: RULE_ID
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceMethodIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceExpression__ServiceMethodAssignment_312295); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6205:1: rule__NavigationExpression__CompositionAssignment_0 : ( ( 'composite' ) ) ;
    public final void rule__NavigationExpression__CompositionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6209:1: ( ( ( 'composite' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6210:1: ( ( 'composite' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6210:1: ( ( 'composite' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6211:1: ( 'composite' )
            {
             before(grammarAccess.getNavigationExpressionAccess().getCompositionCompositeKeyword_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6212:1: ( 'composite' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6213:1: 'composite'
            {
             before(grammarAccess.getNavigationExpressionAccess().getCompositionCompositeKeyword_0_0()); 
            match(input,53,FOLLOW_53_in_rule__NavigationExpression__CompositionAssignment_012331); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6228:1: rule__NavigationExpression__ReferencesAssignment_2 : ( ruleAssociationRoleReference ) ;
    public final void rule__NavigationExpression__ReferencesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6232:1: ( ( ruleAssociationRoleReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6233:1: ( ruleAssociationRoleReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6233:1: ( ruleAssociationRoleReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6234:1: ruleAssociationRoleReference
            {
             before(grammarAccess.getNavigationExpressionAccess().getReferencesAssociationRoleReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_rule__NavigationExpression__ReferencesAssignment_212370);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6243:1: rule__DtoPropertyReference__NameAssignment : ( RULE_ID ) ;
    public final void rule__DtoPropertyReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6247:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6248:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6248:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6249:1: RULE_ID
            {
             before(grammarAccess.getDtoPropertyReferenceAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoPropertyReference__NameAssignment12401); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6258:1: rule__AssociationRoleReference__NameAssignment : ( RULE_ID ) ;
    public final void rule__AssociationRoleReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6262:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6263:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6263:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6264:1: RULE_ID
            {
             before(grammarAccess.getAssociationRoleReferenceAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssociationRoleReference__NameAssignment12432); 
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
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0_in_ruleApplication154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_entryRuleExternalReference180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalReference187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__0_in_ruleExternalReference214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_entryRuleModelElementWithContext240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElementWithContext247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_ruleModelElementWithContext274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIModelElement306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIModelElement__Alternatives_in_ruleUIModelElement333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogue_in_entryRuleDialogue359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialogue366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dialogue__Alternatives_in_ruleDialogue393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentForm_in_entryRuleContentForm419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentForm426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__0_in_ruleContentForm453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundDialogue_in_entryRuleCompoundDialogue539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundDialogue546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Alternatives_in_ruleCompoundDialogue573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionDialogue_in_entryRuleCollectionDialogue599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionDialogue606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__0_in_ruleCollectionDialogue633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterDetail_in_entryRuleMasterDetail659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMasterDetail666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__0_in_ruleMasterDetail693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__0_in_ruleProcess753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_entryRuleFormElement779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormElement786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group__0_in_ruleFormElement813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDialogueCall_in_entryRuleActionDialogueCall839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionDialogueCall846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionDialogueCall__Group__0_in_ruleActionDialogueCall873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_entryRuleDialogueCall899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialogueCall906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__0_in_ruleDialogueCall933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_entryRuleProcessCall1019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessCall1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__0_in_ruleProcessCall1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_entryRuleOperationExpression1079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationExpression1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationExpression__Group__0_in_ruleOperationExpression1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProcessCall_in_entryRuleSimpleProcessCall1139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleProcessCall1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__Group__0_in_ruleSimpleProcessCall1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardExpression_in_entryRuleStandardExpression1199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStandardExpression1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandardExpression__TypeAssignment_in_ruleStandardExpression1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceExpression_in_entryRuleServiceExpression1259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceExpression1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceExpression__Group__0_in_ruleServiceExpression1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_entryRuleNavigationExpression1319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigationExpression1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NavigationExpression__Group__0_in_ruleNavigationExpression1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference1379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoPropertyReference1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoPropertyReference__NameAssignment_in_ruleDtoPropertyReference1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference1439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociationRoleReference1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationRoleReference__NameAssignment_in_ruleAssociationRoleReference1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUICall_in_entryRuleUICall1499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUICall1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElementCall_in_ruleUICall1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElementCall_in_entryRuleUIModelElementCall1558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIModelElementCall1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIModelElementCall__Alternatives_in_ruleUIModelElementCall1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessType__Alternatives_in_ruleProcessType1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProcessTypeLink1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionType__Alternatives_in_ruleExpressionType1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogue_in_rule__UIModelElement__Alternatives1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_rule__UIModelElement__Alternatives1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentForm_in_rule__Dialogue__Alternatives1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundDialogue_in_rule__Dialogue__Alternatives1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__ReadonlyAssignment_7_1_0_in_rule__ContentForm__Alternatives_7_11837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ContentForm__Alternatives_7_11856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__0_in_rule__CompoundDialogue__Alternatives1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionDialogue_in_rule__CompoundDialogue__Alternatives1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterDetail_in_rule__CompoundDialogue__Alternatives1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0_in_rule__CompoundDialogue__Alternatives_0_5_11957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CompoundDialogue__Alternatives_0_5_11976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__ReadonlyAssignment_6_1_0_in_rule__CollectionDialogue__Alternatives_6_12010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CollectionDialogue__Alternatives_6_12029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__ReadonlyAssignment_5_1_0_in_rule__MasterDetail__Alternatives_5_12063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MasterDetail__Alternatives_5_12082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__TypeAssignment_2_0_in_rule__Process__Alternatives_22116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_2_1__0_in_rule__Process__Alternatives_22134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Process__Alternatives_72168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_7_1__0_in_rule__Process__Alternatives_72187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__ReadonlyAssignment_4_1_0_in_rule__FormElement__Alternatives_4_12220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FormElement__Alternatives_4_12239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceExpression_in_rule__Expression__Alternatives2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_rule__Expression__Alternatives2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardExpression_in_rule__Expression__Alternatives2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_rule__Expression__Alternatives2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__UIModelElementCall__Alternatives2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__UIModelElementCall__Alternatives2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ProcessType__Alternatives2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ProcessType__Alternatives2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ProcessType__Alternatives2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ProcessType__Alternatives2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ProcessType__Alternatives2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ProcessType__Alternatives2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ProcessType__Alternatives2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ExpressionType__Alternatives2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ExpressionType__Alternatives2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__DescriptionAssignment_0_in_rule__PresentationModel__Group__02626 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__1_in_rule__PresentationModel__Group__02636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PresentationModel__Group__12665 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__2_in_rule__PresentationModel__Group__12675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__NameAssignment_2_in_rule__PresentationModel__Group__22703 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__3_in_rule__PresentationModel__Group__22712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PresentationModel__Group__32741 = new BitSet(new long[]{0x0000026829000012L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__4_in_rule__PresentationModel__Group__32751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__ExternalReferencesAssignment_4_in_rule__PresentationModel__Group__42779 = new BitSet(new long[]{0x0000026829000012L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__5_in_rule__PresentationModel__Group__42789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__StartAssignment_5_in_rule__PresentationModel__Group__52817 = new BitSet(new long[]{0x0000026820000012L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__6_in_rule__PresentationModel__Group__52827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__ElementsAssignment_6_in_rule__PresentationModel__Group__62855 = new BitSet(new long[]{0x0000026820000012L});
    public static final BitSet FOLLOW_24_in_rule__Application__Group__02905 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Application__Group__1_in_rule__Application__Group__02915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Application__Group__12944 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Application__Group__2_in_rule__Application__Group__12954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_2__0_in_rule__Application__Group__22984 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__Application__Group_2__0_in_rule__Application__Group__22996 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__Application__Group__3_in_rule__Application__Group__23008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Application__Group__33037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__StartProcessesAssignment_2_0_in_rule__Application__Group_2__03080 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Application__Group_2__1_in_rule__Application__Group_2__03089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Application__Group_2__13118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ExternalReference__Group__03158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__1_in_rule__ExternalReference__Group__03168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__ModelNameAssignment_1_in_rule__ExternalReference__Group__13196 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__2_in_rule__ExternalReference__Group__13205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ExternalReference__Group__23234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__3_in_rule__ExternalReference__Group__23244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__NameAssignment_3_in_rule__ExternalReference__Group__33272 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__4_in_rule__ExternalReference__Group__33281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ExternalReference__Group__43310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__DescriptionAssignment_0_in_rule__ContentForm__Group__03355 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__1_in_rule__ContentForm__Group__03365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ContentForm__Group__13394 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__2_in_rule__ContentForm__Group__13404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__NameAssignment_2_in_rule__ContentForm__Group__23432 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__3_in_rule__ContentForm__Group__23441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ContentForm__Group__33470 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__4_in_rule__ContentForm__Group__33480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__CollectionContextAssignment_4_in_rule__ContentForm__Group__43508 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__5_in_rule__ContentForm__Group__43518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__ContextRefAssignment_5_in_rule__ContentForm__Group__53546 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__6_in_rule__ContentForm__Group__53555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ContentForm__Group__63584 = new BitSet(new long[]{0x0000040384000010L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__7_in_rule__ContentForm__Group__63594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_7__0_in_rule__ContentForm__Group__73622 = new BitSet(new long[]{0x0000040304000010L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__8_in_rule__ContentForm__Group__73632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__FormElementsAssignment_8_in_rule__ContentForm__Group__83660 = new BitSet(new long[]{0x0000040304000010L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__9_in_rule__ContentForm__Group__83670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__0_in_rule__ContentForm__Group__93698 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__10_in_rule__ContentForm__Group__93708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__0_in_rule__ContentForm__Group__103736 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__11_in_rule__ContentForm__Group__103746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ContentForm__Group__113775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ContentForm__Group_7__03835 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_7__1_in_rule__ContentForm__Group_7__03845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Alternatives_7_1_in_rule__ContentForm__Group_7__13873 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_7__2_in_rule__ContentForm__Group_7__13882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ContentForm__Group_7__23911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ContentForm__Group_9__03953 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__1_in_rule__ContentForm__Group_9__03963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ContentForm__Group_9__13992 = new BitSet(new long[]{0x00000000041FC030L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__2_in_rule__ContentForm__Group_9__14002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9_2__0_in_rule__ContentForm__Group_9__24030 = new BitSet(new long[]{0x00000000041FC030L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__3_in_rule__ContentForm__Group_9__24040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ContentForm__Group_9__34069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__ActionsAssignment_9_2_0_in_rule__ContentForm__Group_9_2__04112 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9_2__1_in_rule__ContentForm__Group_9_2__04121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ContentForm__Group_9_2__14150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ContentForm__Group_10__04190 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__1_in_rule__ContentForm__Group_10__04200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ContentForm__Group_10__14229 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__2_in_rule__ContentForm__Group_10__14239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10_2__0_in_rule__ContentForm__Group_10__24267 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__3_in_rule__ContentForm__Group_10__24277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ContentForm__Group_10__34306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__ProcessesAssignment_10_2_0_in_rule__ContentForm__Group_10_2__04349 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10_2__1_in_rule__ContentForm__Group_10_2__04358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ContentForm__Group_10_2__14387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DescriptionAssignment_0_in_rule__Action__Group__04426 = new BitSet(new long[]{0x00000000001FC020L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__TypeAssignment_1_in_rule__Action__Group__14464 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_2_in_rule__Action__Group__24502 = new BitSet(new long[]{0x0025800420600002L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__24511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__34539 = new BitSet(new long[]{0x0025800020600002L});
    public static final BitSet FOLLOW_rule__Action__Group__4_in_rule__Action__Group__34549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__ProcessElementsAssignment_4_in_rule__Action__Group__44577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Action__Group_3__04623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__04633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__LabelAssignment_3_1_in_rule__Action__Group_3__14661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__DescriptionAssignment_0_0_in_rule__CompoundDialogue__Group_0__04699 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__1_in_rule__CompoundDialogue__Group_0__04709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CompoundDialogue__Group_0__14738 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__2_in_rule__CompoundDialogue__Group_0__14748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__NameAssignment_0_2_in_rule__CompoundDialogue__Group_0__24776 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__3_in_rule__CompoundDialogue__Group_0__24785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CompoundDialogue__Group_0__34814 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__4_in_rule__CompoundDialogue__Group_0__34824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__ContextRefAssignment_0_4_in_rule__CompoundDialogue__Group_0__44852 = new BitSet(new long[]{0x0000001280000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__5_in_rule__CompoundDialogue__Group_0__44861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_5__0_in_rule__CompoundDialogue__Group_0__54889 = new BitSet(new long[]{0x0000001200000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__6_in_rule__CompoundDialogue__Group_0__54899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__0_in_rule__CompoundDialogue__Group_0__64927 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__7_in_rule__CompoundDialogue__Group_0__64937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__0_in_rule__CompoundDialogue__Group_0__74965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CompoundDialogue__Group_0_5__05017 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_5__1_in_rule__CompoundDialogue__Group_0_5__05027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Alternatives_0_5_1_in_rule__CompoundDialogue__Group_0_5__15055 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_5__2_in_rule__CompoundDialogue__Group_0_5__15064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CompoundDialogue__Group_0_5__25093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__CompoundDialogue__Group_0_6__05135 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__1_in_rule__CompoundDialogue__Group_0_6__05145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CompoundDialogue__Group_0_6__15174 = new BitSet(new long[]{0x0025900024600010L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__2_in_rule__CompoundDialogue__Group_0_6__15184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6_2__0_in_rule__CompoundDialogue__Group_0_6__25212 = new BitSet(new long[]{0x0025900024600010L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__3_in_rule__CompoundDialogue__Group_0_6__25222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CompoundDialogue__Group_0_6__35251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__DialoguesAssignment_0_6_2_0_in_rule__CompoundDialogue__Group_0_6_2__05294 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6_2__1_in_rule__CompoundDialogue__Group_0_6_2__05303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CompoundDialogue__Group_0_6_2__15332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CompoundDialogue__Group_0_7__05372 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__1_in_rule__CompoundDialogue__Group_0_7__05382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CompoundDialogue__Group_0_7__15411 = new BitSet(new long[]{0x0025920004600010L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__2_in_rule__CompoundDialogue__Group_0_7__15421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7_2__0_in_rule__CompoundDialogue__Group_0_7__25449 = new BitSet(new long[]{0x0025920004600010L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__3_in_rule__CompoundDialogue__Group_0_7__25459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CompoundDialogue__Group_0_7__35488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__ProcessesAssignment_0_7_2_0_in_rule__CompoundDialogue__Group_0_7_2__05531 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7_2__1_in_rule__CompoundDialogue__Group_0_7_2__05540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CompoundDialogue__Group_0_7_2__15569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__DescriptionAssignment_0_in_rule__CollectionDialogue__Group__05608 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__1_in_rule__CollectionDialogue__Group__05618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__CollectionDialogue__Group__15647 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__2_in_rule__CollectionDialogue__Group__15657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__NameAssignment_2_in_rule__CollectionDialogue__Group__25685 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__3_in_rule__CollectionDialogue__Group__25694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CollectionDialogue__Group__35723 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__4_in_rule__CollectionDialogue__Group__35733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__ContextRefAssignment_4_in_rule__CollectionDialogue__Group__45761 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__5_in_rule__CollectionDialogue__Group__45770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CollectionDialogue__Group__55799 = new BitSet(new long[]{0x0000001284000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__6_in_rule__CollectionDialogue__Group__55809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_6__0_in_rule__CollectionDialogue__Group__65837 = new BitSet(new long[]{0x0000001204000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__7_in_rule__CollectionDialogue__Group__65847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__0_in_rule__CollectionDialogue__Group__75875 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__8_in_rule__CollectionDialogue__Group__75885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__0_in_rule__CollectionDialogue__Group__85913 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__9_in_rule__CollectionDialogue__Group__85923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CollectionDialogue__Group__95952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CollectionDialogue__Group_6__06008 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_6__1_in_rule__CollectionDialogue__Group_6__06018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Alternatives_6_1_in_rule__CollectionDialogue__Group_6__16046 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_6__2_in_rule__CollectionDialogue__Group_6__16055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CollectionDialogue__Group_6__26084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__CollectionDialogue__Group_7__06126 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__1_in_rule__CollectionDialogue__Group_7__06136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CollectionDialogue__Group_7__16165 = new BitSet(new long[]{0x0025900024600010L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__2_in_rule__CollectionDialogue__Group_7__16175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7_2__0_in_rule__CollectionDialogue__Group_7__26203 = new BitSet(new long[]{0x0025900024600010L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__3_in_rule__CollectionDialogue__Group_7__26213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CollectionDialogue__Group_7__36242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__DialoguesAssignment_7_2_0_in_rule__CollectionDialogue__Group_7_2__06285 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7_2__1_in_rule__CollectionDialogue__Group_7_2__06294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CollectionDialogue__Group_7_2__16323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CollectionDialogue__Group_8__06363 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__1_in_rule__CollectionDialogue__Group_8__06373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CollectionDialogue__Group_8__16402 = new BitSet(new long[]{0x0025920004600010L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__2_in_rule__CollectionDialogue__Group_8__16412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8_2__0_in_rule__CollectionDialogue__Group_8__26440 = new BitSet(new long[]{0x0025920004600010L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__3_in_rule__CollectionDialogue__Group_8__26450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CollectionDialogue__Group_8__36479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__ProcessesAssignment_8_2_0_in_rule__CollectionDialogue__Group_8_2__06522 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8_2__1_in_rule__CollectionDialogue__Group_8_2__06531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CollectionDialogue__Group_8_2__16560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__DescriptionAssignment_0_in_rule__MasterDetail__Group__06599 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__1_in_rule__MasterDetail__Group__06609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__MasterDetail__Group__16638 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__2_in_rule__MasterDetail__Group__16648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__NameAssignment_2_in_rule__MasterDetail__Group__26676 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__3_in_rule__MasterDetail__Group__26685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MasterDetail__Group__36714 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__4_in_rule__MasterDetail__Group__36724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__ContextRefAssignment_4_in_rule__MasterDetail__Group__46752 = new BitSet(new long[]{0x0000008080000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__5_in_rule__MasterDetail__Group__46761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_5__0_in_rule__MasterDetail__Group__56789 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__6_in_rule__MasterDetail__Group__56799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MasterDetail__Group__66828 = new BitSet(new long[]{0x0025900020600010L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__7_in_rule__MasterDetail__Group__66838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__MasterAssignment_7_in_rule__MasterDetail__Group__76866 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__8_in_rule__MasterDetail__Group__76875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MasterDetail__Group__86904 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__9_in_rule__MasterDetail__Group__86914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MasterDetail__Group__96943 = new BitSet(new long[]{0x0025900020600010L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__10_in_rule__MasterDetail__Group__96953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__DetailAssignment_10_in_rule__MasterDetail__Group__106981 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__11_in_rule__MasterDetail__Group__106990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MasterDetail__Group__117019 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__12_in_rule__MasterDetail__Group__117029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__0_in_rule__MasterDetail__Group__127057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MasterDetail__Group_5__07119 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_5__1_in_rule__MasterDetail__Group_5__07129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Alternatives_5_1_in_rule__MasterDetail__Group_5__17157 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_5__2_in_rule__MasterDetail__Group_5__17166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MasterDetail__Group_5__27195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MasterDetail__Group_12__07237 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__1_in_rule__MasterDetail__Group_12__07247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MasterDetail__Group_12__17276 = new BitSet(new long[]{0x0025920004600010L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__2_in_rule__MasterDetail__Group_12__17286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12_2__0_in_rule__MasterDetail__Group_12__27314 = new BitSet(new long[]{0x0025920004600010L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__3_in_rule__MasterDetail__Group_12__27324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MasterDetail__Group_12__37353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__ProcessesAssignment_12_2_0_in_rule__MasterDetail__Group_12_2__07396 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12_2__1_in_rule__MasterDetail__Group_12_2__07405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MasterDetail__Group_12_2__17434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__DescriptionAssignment_0_in_rule__Process__Group__07473 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Process__Group__1_in_rule__Process__Group__07483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Process__Group__17512 = new BitSet(new long[]{0x00000000001FC820L});
    public static final BitSet FOLLOW_rule__Process__Group__2_in_rule__Process__Group__17522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Alternatives_2_in_rule__Process__Group__27550 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Process__Group__3_in_rule__Process__Group__27560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__NameAssignment_3_in_rule__Process__Group__37588 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Process__Group__4_in_rule__Process__Group__37597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Process__Group__47626 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_rule__Process__Group__5_in_rule__Process__Group__47636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__CollectionContextAssignment_5_in_rule__Process__Group__57664 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Process__Group__6_in_rule__Process__Group__57674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__ContextRefAssignment_6_in_rule__Process__Group__67702 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_rule__Process__Group__7_in_rule__Process__Group__67711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Alternatives_7_in_rule__Process__Group__77739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__TypeAssignment_2_1_0_in_rule__Process__Group_2_1__07789 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Process__Group_2_1__1_in_rule__Process__Group_2_1__07798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__LinkAssignment_2_1_1_in_rule__Process__Group_2_1__17826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Process__Group_7_1__07865 = new BitSet(new long[]{0x0025920024600010L});
    public static final BitSet FOLLOW_rule__Process__Group_7_1__1_in_rule__Process__Group_7_1__07875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_7_1_1__0_in_rule__Process__Group_7_1__17903 = new BitSet(new long[]{0x0025920024600010L});
    public static final BitSet FOLLOW_rule__Process__Group_7_1__2_in_rule__Process__Group_7_1__17913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Process__Group_7_1__27942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__ProcessElementsAssignment_7_1_1_0_in_rule__Process__Group_7_1_1__07983 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Process__Group_7_1_1__1_in_rule__Process__Group_7_1_1__07992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Process__Group_7_1_1__18021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__DescriptionAssignment_0_in_rule__FormElement__Group__08060 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__1_in_rule__FormElement__Group__08070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__FormElement__Group__18099 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FormElement__Group__2_in_rule__FormElement__Group__18109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__ReferencesAssignment_2_in_rule__FormElement__Group__28137 = new BitSet(new long[]{0x0000000480002000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__3_in_rule__FormElement__Group__28146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group_3__0_in_rule__FormElement__Group__38174 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__4_in_rule__FormElement__Group__38184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group_4__0_in_rule__FormElement__Group__48212 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__5_in_rule__FormElement__Group__48222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__FormElement__Group__58251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FormElement__Group_3__08299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FormElement__Group_3__1_in_rule__FormElement__Group_3__08309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__LabelAssignment_3_1_in_rule__FormElement__Group_3__18337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FormElement__Group_4__08376 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_rule__FormElement__Group_4__1_in_rule__FormElement__Group_4__08386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Alternatives_4_1_in_rule__FormElement__Group_4__18414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionDialogueCall__ContextExpAssignment_0_in_rule__ActionDialogueCall__Group__08452 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ActionDialogueCall__Group__1_in_rule__ActionDialogueCall__Group__08462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ActionDialogueCall__Group__18491 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ActionDialogueCall__Group__2_in_rule__ActionDialogueCall__Group__18501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionDialogueCall__NameAssignment_2_in_rule__ActionDialogueCall__Group__28529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_0__0_in_rule__DialogueCall__Group__08569 = new BitSet(new long[]{0x0025900020600000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__1_in_rule__DialogueCall__Group__08579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_1__0_in_rule__DialogueCall__Group__18607 = new BitSet(new long[]{0x0025800020600000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__2_in_rule__DialogueCall__Group__18617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__ContextExpAssignment_2_in_rule__DialogueCall__Group__28645 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__3_in_rule__DialogueCall__Group__28655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DialogueCall__Group__38684 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__4_in_rule__DialogueCall__Group__38694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__NameAssignment_4_in_rule__DialogueCall__Group__48722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__LabelAssignment_0_0_in_rule__DialogueCall__Group_0__08766 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_0__1_in_rule__DialogueCall__Group_0__08775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__DialogueCall__Group_0__18804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__DialogueCall__Group_1__08844 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_1__1_in_rule__DialogueCall__Group_1__08854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__DialogueCall__Group_1__18883 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_1__2_in_rule__DialogueCall__Group_1__18893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__ConditionAssignment_1_2_in_rule__DialogueCall__Group_1__28921 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_1__3_in_rule__DialogueCall__Group_1__28930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__DialogueCall__Group_1__38959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_0__0_in_rule__ProcessCall__Group__09002 = new BitSet(new long[]{0x0025920000600000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__1_in_rule__ProcessCall__Group__09012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_1__0_in_rule__ProcessCall__Group__19040 = new BitSet(new long[]{0x0025820000600000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__2_in_rule__ProcessCall__Group__19050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__ContextExpAssignment_2_in_rule__ProcessCall__Group__29078 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__3_in_rule__ProcessCall__Group__29088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ProcessCall__Group__39117 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__4_in_rule__ProcessCall__Group__39127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__NameAssignment_4_in_rule__ProcessCall__Group__49155 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__5_in_rule__ProcessCall__Group__49164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_5__0_in_rule__ProcessCall__Group__59192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__LabelAssignment_0_0_in_rule__ProcessCall__Group_0__09239 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_0__1_in_rule__ProcessCall__Group_0__09248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ProcessCall__Group_0__19277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ProcessCall__Group_1__09317 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_1__1_in_rule__ProcessCall__Group_1__09327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ProcessCall__Group_1__19356 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_1__2_in_rule__ProcessCall__Group_1__19366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__ConditionAssignment_1_2_in_rule__ProcessCall__Group_1__29394 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_1__3_in_rule__ProcessCall__Group_1__29403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ProcessCall__Group_1__39432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ProcessCall__Group_5__09476 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_5__1_in_rule__ProcessCall__Group_5__09486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__LabelAssignment_5_1_in_rule__ProcessCall__Group_5__19514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__OperationExpression__Group__09553 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__OperationExpression__Group__1_in_rule__OperationExpression__Group__09563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationExpression__NameAssignment_1_in_rule__OperationExpression__Group__19591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__NameAssignment_0_in_rule__SimpleProcessCall__Group__09629 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__Group__1_in_rule__SimpleProcessCall__Group__09638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__Group_1__0_in_rule__SimpleProcessCall__Group__19666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SimpleProcessCall__Group_1__09706 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__Group_1__1_in_rule__SimpleProcessCall__Group_1__09716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__LabelAssignment_1_1_in_rule__SimpleProcessCall__Group_1__19744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ServiceExpression__Group__09783 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ServiceExpression__Group__1_in_rule__ServiceExpression__Group__09793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceExpression__ServiceNameAssignment_1_in_rule__ServiceExpression__Group__19821 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__ServiceExpression__Group__2_in_rule__ServiceExpression__Group__19830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ServiceExpression__Group__29859 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ServiceExpression__Group__3_in_rule__ServiceExpression__Group__29869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceExpression__ServiceMethodAssignment_3_in_rule__ServiceExpression__Group__39897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NavigationExpression__CompositionAssignment_0_in_rule__NavigationExpression__Group__09939 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__NavigationExpression__Group__1_in_rule__NavigationExpression__Group__09949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__NavigationExpression__Group__19978 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NavigationExpression__Group__2_in_rule__NavigationExpression__Group__19988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NavigationExpression__ReferencesAssignment_2_in_rule__NavigationExpression__Group__210016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PresentationModel__DescriptionAssignment_010056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PresentationModel__NameAssignment_210087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_rule__PresentationModel__ExternalReferencesAssignment_410118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__PresentationModel__StartAssignment_510149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_rule__PresentationModel__ElementsAssignment_610180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProcessCall_in_rule__Application__StartProcessesAssignment_2_010211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalReference__ModelNameAssignment_110242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalReference__NameAssignment_310273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ContentForm__DescriptionAssignment_010304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContentForm__NameAssignment_210335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ContentForm__CollectionContextAssignment_410371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContentForm__ContextRefAssignment_510414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ContentForm__ReadonlyAssignment_7_1_010454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_rule__ContentForm__FormElementsAssignment_810493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__ContentForm__ActionsAssignment_9_2_010524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProcessCall_in_rule__ContentForm__ProcessesAssignment_10_2_010555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Action__DescriptionAssignment_010586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessType_in_rule__Action__TypeAssignment_110617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NameAssignment_210648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Action__LabelAssignment_3_110679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDialogueCall_in_rule__Action__ProcessElementsAssignment_410710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CompoundDialogue__DescriptionAssignment_0_010741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CompoundDialogue__NameAssignment_0_210772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CompoundDialogue__ContextRefAssignment_0_410807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__CompoundDialogue__ReadonlyAssignment_0_5_1_010847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__CompoundDialogue__DialoguesAssignment_0_6_2_010886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__CompoundDialogue__ProcessesAssignment_0_7_2_010917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CollectionDialogue__DescriptionAssignment_010948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CollectionDialogue__NameAssignment_210979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CollectionDialogue__ContextRefAssignment_411014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__CollectionDialogue__ReadonlyAssignment_6_1_011054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__CollectionDialogue__DialoguesAssignment_7_2_011093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__CollectionDialogue__ProcessesAssignment_8_2_011124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MasterDetail__DescriptionAssignment_011155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MasterDetail__NameAssignment_211186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MasterDetail__ContextRefAssignment_411221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__MasterDetail__ReadonlyAssignment_5_1_011261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__MasterDetail__MasterAssignment_711300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__MasterDetail__DetailAssignment_1011331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__MasterDetail__ProcessesAssignment_12_2_011362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Process__DescriptionAssignment_011393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessType_in_rule__Process__TypeAssignment_2_011424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessTypeLink_in_rule__Process__TypeAssignment_2_1_011455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_rule__Process__LinkAssignment_2_1_111486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Process__NameAssignment_311517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Process__CollectionContextAssignment_511553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Process__ContextRefAssignment_611596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUICall_in_rule__Process__ProcessElementsAssignment_7_1_1_011631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FormElement__DescriptionAssignment_011662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_rule__FormElement__ReferencesAssignment_211693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FormElement__LabelAssignment_3_111724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__FormElement__ReadonlyAssignment_4_1_011760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ActionDialogueCall__ContextExpAssignment_011799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionDialogueCall__NameAssignment_211830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DialogueCall__LabelAssignment_0_011861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_rule__DialogueCall__ConditionAssignment_1_211892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__DialogueCall__ContextExpAssignment_211923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DialogueCall__NameAssignment_411954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ProcessCall__LabelAssignment_0_011985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_rule__ProcessCall__ConditionAssignment_1_212016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ProcessCall__ContextExpAssignment_212047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProcessCall__NameAssignment_412078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProcessCall__LabelAssignment_5_112109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OperationExpression__NameAssignment_112140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleProcessCall__NameAssignment_012171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleProcessCall__LabelAssignment_1_112202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionType_in_rule__StandardExpression__TypeAssignment12233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceExpression__ServiceNameAssignment_112264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceExpression__ServiceMethodAssignment_312295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__NavigationExpression__CompositionAssignment_012331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_rule__NavigationExpression__ReferencesAssignment_212370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoPropertyReference__NameAssignment12401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationRoleReference__NameAssignment12432 = new BitSet(new long[]{0x0000000000000002L});

}