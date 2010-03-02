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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:716:1: ruleUICall : ( ( rule__UICall__Alternatives ) ) ;
    public final void ruleUICall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:720:2: ( ( ( rule__UICall__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:721:1: ( ( rule__UICall__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:721:1: ( ( rule__UICall__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:722:1: ( rule__UICall__Alternatives )
            {
             before(grammarAccess.getUICallAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:723:1: ( rule__UICall__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:723:2: rule__UICall__Alternatives
            {
            pushFollow(FOLLOW_rule__UICall__Alternatives_in_ruleUICall1533);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:736:1: ruleProcessType : ( ( rule__ProcessType__Alternatives ) ) ;
    public final void ruleProcessType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:740:1: ( ( ( rule__ProcessType__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:741:1: ( ( rule__ProcessType__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:741:1: ( ( rule__ProcessType__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:742:1: ( rule__ProcessType__Alternatives )
            {
             before(grammarAccess.getProcessTypeAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:743:1: ( rule__ProcessType__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:743:2: rule__ProcessType__Alternatives
            {
            pushFollow(FOLLOW_rule__ProcessType__Alternatives_in_ruleProcessType1570);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:755:1: ruleProcessTypeLink : ( ( 'link' ) ) ;
    public final void ruleProcessTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:759:1: ( ( ( 'link' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:760:1: ( ( 'link' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:760:1: ( ( 'link' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:761:1: ( 'link' )
            {
             before(grammarAccess.getProcessTypeLinkAccess().getLINKEnumLiteralDeclaration()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:762:1: ( 'link' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:762:3: 'link'
            {
            match(input,11,FOLLOW_11_in_ruleProcessTypeLink1607); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:775:1: ruleExpressionType : ( ( rule__ExpressionType__Alternatives ) ) ;
    public final void ruleExpressionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:779:1: ( ( ( rule__ExpressionType__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:780:1: ( ( rule__ExpressionType__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:780:1: ( ( rule__ExpressionType__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:781:1: ( rule__ExpressionType__Alternatives )
            {
             before(grammarAccess.getExpressionTypeAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:782:1: ( rule__ExpressionType__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:782:2: rule__ExpressionType__Alternatives
            {
            pushFollow(FOLLOW_rule__ExpressionType__Alternatives_in_ruleExpressionType1645);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:793:1: rule__UIModelElement__Alternatives : ( ( ruleDialogue ) | ( ruleProcess ) );
    public final void rule__UIModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:797:1: ( ( ruleDialogue ) | ( ruleProcess ) )
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
                        new NoViableAltException("793:1: rule__UIModelElement__Alternatives : ( ( ruleDialogue ) | ( ruleProcess ) );", 1, 1, input);

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
                    new NoViableAltException("793:1: rule__UIModelElement__Alternatives : ( ( ruleDialogue ) | ( ruleProcess ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:798:1: ( ruleDialogue )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:798:1: ( ruleDialogue )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:799:1: ruleDialogue
                    {
                     before(grammarAccess.getUIModelElementAccess().getDialogueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDialogue_in_rule__UIModelElement__Alternatives1680);
                    ruleDialogue();
                    _fsp--;

                     after(grammarAccess.getUIModelElementAccess().getDialogueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:804:6: ( ruleProcess )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:804:6: ( ruleProcess )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:805:1: ruleProcess
                    {
                     before(grammarAccess.getUIModelElementAccess().getProcessParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleProcess_in_rule__UIModelElement__Alternatives1697);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:815:1: rule__Dialogue__Alternatives : ( ( ruleContentForm ) | ( ruleCompoundDialogue ) );
    public final void rule__Dialogue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:819:1: ( ( ruleContentForm ) | ( ruleCompoundDialogue ) )
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
                        new NoViableAltException("815:1: rule__Dialogue__Alternatives : ( ( ruleContentForm ) | ( ruleCompoundDialogue ) );", 2, 1, input);

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
                    new NoViableAltException("815:1: rule__Dialogue__Alternatives : ( ( ruleContentForm ) | ( ruleCompoundDialogue ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:820:1: ( ruleContentForm )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:820:1: ( ruleContentForm )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:821:1: ruleContentForm
                    {
                     before(grammarAccess.getDialogueAccess().getContentFormParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleContentForm_in_rule__Dialogue__Alternatives1729);
                    ruleContentForm();
                    _fsp--;

                     after(grammarAccess.getDialogueAccess().getContentFormParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:826:6: ( ruleCompoundDialogue )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:826:6: ( ruleCompoundDialogue )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:827:1: ruleCompoundDialogue
                    {
                     before(grammarAccess.getDialogueAccess().getCompoundDialogueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCompoundDialogue_in_rule__Dialogue__Alternatives1746);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:837:1: rule__ContentForm__Alternatives_7_1 : ( ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) ) | ( 'false' ) );
    public final void rule__ContentForm__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:841:1: ( ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) ) | ( 'false' ) )
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
                    new NoViableAltException("837:1: rule__ContentForm__Alternatives_7_1 : ( ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) ) | ( 'false' ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:842:1: ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:842:1: ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:843:1: ( rule__ContentForm__ReadonlyAssignment_7_1_0 )
                    {
                     before(grammarAccess.getContentFormAccess().getReadonlyAssignment_7_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:844:1: ( rule__ContentForm__ReadonlyAssignment_7_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:844:2: rule__ContentForm__ReadonlyAssignment_7_1_0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__ReadonlyAssignment_7_1_0_in_rule__ContentForm__Alternatives_7_11778);
                    rule__ContentForm__ReadonlyAssignment_7_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getContentFormAccess().getReadonlyAssignment_7_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:848:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:848:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:849:1: 'false'
                    {
                     before(grammarAccess.getContentFormAccess().getFalseKeyword_7_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__ContentForm__Alternatives_7_11797); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:861:1: rule__CompoundDialogue__Alternatives : ( ( ( rule__CompoundDialogue__Group_0__0 ) ) | ( ruleCollectionDialogue ) | ( ruleMasterDetail ) );
    public final void rule__CompoundDialogue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:865:1: ( ( ( rule__CompoundDialogue__Group_0__0 ) ) | ( ruleCollectionDialogue ) | ( ruleMasterDetail ) )
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
                        new NoViableAltException("861:1: rule__CompoundDialogue__Alternatives : ( ( ( rule__CompoundDialogue__Group_0__0 ) ) | ( ruleCollectionDialogue ) | ( ruleMasterDetail ) );", 4, 1, input);

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
                    new NoViableAltException("861:1: rule__CompoundDialogue__Alternatives : ( ( ( rule__CompoundDialogue__Group_0__0 ) ) | ( ruleCollectionDialogue ) | ( ruleMasterDetail ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:866:1: ( ( rule__CompoundDialogue__Group_0__0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:866:1: ( ( rule__CompoundDialogue__Group_0__0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:867:1: ( rule__CompoundDialogue__Group_0__0 )
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getGroup_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:868:1: ( rule__CompoundDialogue__Group_0__0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:868:2: rule__CompoundDialogue__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__0_in_rule__CompoundDialogue__Alternatives1831);
                    rule__CompoundDialogue__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCompoundDialogueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:872:6: ( ruleCollectionDialogue )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:872:6: ( ruleCollectionDialogue )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:873:1: ruleCollectionDialogue
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getCollectionDialogueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCollectionDialogue_in_rule__CompoundDialogue__Alternatives1849);
                    ruleCollectionDialogue();
                    _fsp--;

                     after(grammarAccess.getCompoundDialogueAccess().getCollectionDialogueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:878:6: ( ruleMasterDetail )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:878:6: ( ruleMasterDetail )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:879:1: ruleMasterDetail
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getMasterDetailParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMasterDetail_in_rule__CompoundDialogue__Alternatives1866);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:889:1: rule__CompoundDialogue__Alternatives_0_5_1 : ( ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) ) | ( 'false' ) );
    public final void rule__CompoundDialogue__Alternatives_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:893:1: ( ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) ) | ( 'false' ) )
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
                    new NoViableAltException("889:1: rule__CompoundDialogue__Alternatives_0_5_1 : ( ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) ) | ( 'false' ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:894:1: ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:894:1: ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:895:1: ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 )
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getReadonlyAssignment_0_5_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:896:1: ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:896:2: rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0_in_rule__CompoundDialogue__Alternatives_0_5_11898);
                    rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getCompoundDialogueAccess().getReadonlyAssignment_0_5_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:900:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:900:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:901:1: 'false'
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getFalseKeyword_0_5_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__CompoundDialogue__Alternatives_0_5_11917); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:913:1: rule__CollectionDialogue__Alternatives_6_1 : ( ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) ) | ( 'false' ) );
    public final void rule__CollectionDialogue__Alternatives_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:917:1: ( ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) ) | ( 'false' ) )
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
                    new NoViableAltException("913:1: rule__CollectionDialogue__Alternatives_6_1 : ( ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) ) | ( 'false' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:918:1: ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:918:1: ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:919:1: ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 )
                    {
                     before(grammarAccess.getCollectionDialogueAccess().getReadonlyAssignment_6_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:920:1: ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:920:2: rule__CollectionDialogue__ReadonlyAssignment_6_1_0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__ReadonlyAssignment_6_1_0_in_rule__CollectionDialogue__Alternatives_6_11951);
                    rule__CollectionDialogue__ReadonlyAssignment_6_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getCollectionDialogueAccess().getReadonlyAssignment_6_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:924:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:924:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:925:1: 'false'
                    {
                     before(grammarAccess.getCollectionDialogueAccess().getFalseKeyword_6_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__CollectionDialogue__Alternatives_6_11970); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:937:1: rule__MasterDetail__Alternatives_5_1 : ( ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) ) | ( 'false' ) );
    public final void rule__MasterDetail__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:941:1: ( ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) ) | ( 'false' ) )
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
                    new NoViableAltException("937:1: rule__MasterDetail__Alternatives_5_1 : ( ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) ) | ( 'false' ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:942:1: ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:942:1: ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:943:1: ( rule__MasterDetail__ReadonlyAssignment_5_1_0 )
                    {
                     before(grammarAccess.getMasterDetailAccess().getReadonlyAssignment_5_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:944:1: ( rule__MasterDetail__ReadonlyAssignment_5_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:944:2: rule__MasterDetail__ReadonlyAssignment_5_1_0
                    {
                    pushFollow(FOLLOW_rule__MasterDetail__ReadonlyAssignment_5_1_0_in_rule__MasterDetail__Alternatives_5_12004);
                    rule__MasterDetail__ReadonlyAssignment_5_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getMasterDetailAccess().getReadonlyAssignment_5_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:948:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:948:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:949:1: 'false'
                    {
                     before(grammarAccess.getMasterDetailAccess().getFalseKeyword_5_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__MasterDetail__Alternatives_5_12023); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:961:1: rule__Process__Alternatives_2 : ( ( ( rule__Process__TypeAssignment_2_0 ) ) | ( ( rule__Process__Group_2_1__0 ) ) );
    public final void rule__Process__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:965:1: ( ( ( rule__Process__TypeAssignment_2_0 ) ) | ( ( rule__Process__Group_2_1__0 ) ) )
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
                    new NoViableAltException("961:1: rule__Process__Alternatives_2 : ( ( ( rule__Process__TypeAssignment_2_0 ) ) | ( ( rule__Process__Group_2_1__0 ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:966:1: ( ( rule__Process__TypeAssignment_2_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:966:1: ( ( rule__Process__TypeAssignment_2_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:967:1: ( rule__Process__TypeAssignment_2_0 )
                    {
                     before(grammarAccess.getProcessAccess().getTypeAssignment_2_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:968:1: ( rule__Process__TypeAssignment_2_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:968:2: rule__Process__TypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Process__TypeAssignment_2_0_in_rule__Process__Alternatives_22057);
                    rule__Process__TypeAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getProcessAccess().getTypeAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:972:6: ( ( rule__Process__Group_2_1__0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:972:6: ( ( rule__Process__Group_2_1__0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:973:1: ( rule__Process__Group_2_1__0 )
                    {
                     before(grammarAccess.getProcessAccess().getGroup_2_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:974:1: ( rule__Process__Group_2_1__0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:974:2: rule__Process__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Process__Group_2_1__0_in_rule__Process__Alternatives_22075);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:983:1: rule__Process__Alternatives_7 : ( ( ';' ) | ( ( rule__Process__Group_7_1__0 ) ) );
    public final void rule__Process__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:987:1: ( ( ';' ) | ( ( rule__Process__Group_7_1__0 ) ) )
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
                    new NoViableAltException("983:1: rule__Process__Alternatives_7 : ( ( ';' ) | ( ( rule__Process__Group_7_1__0 ) ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:988:1: ( ';' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:988:1: ( ';' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:989:1: ';'
                    {
                     before(grammarAccess.getProcessAccess().getSemicolonKeyword_7_0()); 
                    match(input,13,FOLLOW_13_in_rule__Process__Alternatives_72109); 
                     after(grammarAccess.getProcessAccess().getSemicolonKeyword_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:996:6: ( ( rule__Process__Group_7_1__0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:996:6: ( ( rule__Process__Group_7_1__0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:997:1: ( rule__Process__Group_7_1__0 )
                    {
                     before(grammarAccess.getProcessAccess().getGroup_7_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:998:1: ( rule__Process__Group_7_1__0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:998:2: rule__Process__Group_7_1__0
                    {
                    pushFollow(FOLLOW_rule__Process__Group_7_1__0_in_rule__Process__Alternatives_72128);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1007:1: rule__FormElement__Alternatives_4_1 : ( ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) ) | ( 'false' ) );
    public final void rule__FormElement__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1011:1: ( ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) ) | ( 'false' ) )
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
                    new NoViableAltException("1007:1: rule__FormElement__Alternatives_4_1 : ( ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) ) | ( 'false' ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1012:1: ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1012:1: ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1013:1: ( rule__FormElement__ReadonlyAssignment_4_1_0 )
                    {
                     before(grammarAccess.getFormElementAccess().getReadonlyAssignment_4_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1014:1: ( rule__FormElement__ReadonlyAssignment_4_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1014:2: rule__FormElement__ReadonlyAssignment_4_1_0
                    {
                    pushFollow(FOLLOW_rule__FormElement__ReadonlyAssignment_4_1_0_in_rule__FormElement__Alternatives_4_12161);
                    rule__FormElement__ReadonlyAssignment_4_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getFormElementAccess().getReadonlyAssignment_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1018:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1018:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1019:1: 'false'
                    {
                     before(grammarAccess.getFormElementAccess().getFalseKeyword_4_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__FormElement__Alternatives_4_12180); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1031:1: rule__Expression__Alternatives : ( ( ruleServiceExpression ) | ( ruleNavigationExpression ) | ( ruleStandardExpression ) | ( ruleOperationExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1035:1: ( ( ruleServiceExpression ) | ( ruleNavigationExpression ) | ( ruleStandardExpression ) | ( ruleOperationExpression ) )
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
                    new NoViableAltException("1031:1: rule__Expression__Alternatives : ( ( ruleServiceExpression ) | ( ruleNavigationExpression ) | ( ruleStandardExpression ) | ( ruleOperationExpression ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1036:1: ( ruleServiceExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1036:1: ( ruleServiceExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1037:1: ruleServiceExpression
                    {
                     before(grammarAccess.getExpressionAccess().getServiceExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleServiceExpression_in_rule__Expression__Alternatives2214);
                    ruleServiceExpression();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getServiceExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1042:6: ( ruleNavigationExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1042:6: ( ruleNavigationExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1043:1: ruleNavigationExpression
                    {
                     before(grammarAccess.getExpressionAccess().getNavigationExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNavigationExpression_in_rule__Expression__Alternatives2231);
                    ruleNavigationExpression();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getNavigationExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1048:6: ( ruleStandardExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1048:6: ( ruleStandardExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1049:1: ruleStandardExpression
                    {
                     before(grammarAccess.getExpressionAccess().getStandardExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStandardExpression_in_rule__Expression__Alternatives2248);
                    ruleStandardExpression();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getStandardExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1054:6: ( ruleOperationExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1054:6: ( ruleOperationExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1055:1: ruleOperationExpression
                    {
                     before(grammarAccess.getExpressionAccess().getOperationExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleOperationExpression_in_rule__Expression__Alternatives2265);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );
    public final void rule__UICall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1069:1: ( ( ruleDialogueCall ) | ( ruleProcessCall ) )
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
                                                                new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 19, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 17, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 13, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 3, input);

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
                                                            new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 14, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 5, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 4, input);

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
                                                        new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 14, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 5, input);

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
                                                    new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 6, input);

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
                                                    new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 7, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 47:
                                            {
                                            int LA12_8 = input.LA(9);

                                            if ( (LA12_8==RULE_ID) ) {
                                                int LA12_15 = input.LA(10);

                                                if ( (LA12_15==41) ) {
                                                    alt12=2;
                                                }
                                                else if ( (LA12_15==29) ) {
                                                    alt12=1;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 15, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 8, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 41:
                                            {
                                            alt12=2;
                                            }
                                            break;
                                        case 29:
                                            {
                                            alt12=1;
                                            }
                                            break;
                                        default:
                                            NoViableAltException nvae =
                                                new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 20, input);

                                            throw nvae;
                                        }

                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 18, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 16, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 12, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 2, input);

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
                                            new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 19, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 17, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 13, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 3, input);

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
                                        new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 14, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 4, input);

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
                                    new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 14, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 5, input);

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
                                new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 6, input);

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
                                new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 47:
                        {
                        int LA12_8 = input.LA(4);

                        if ( (LA12_8==RULE_ID) ) {
                            int LA12_15 = input.LA(5);

                            if ( (LA12_15==41) ) {
                                alt12=2;
                            }
                            else if ( (LA12_15==29) ) {
                                alt12=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 41:
                        {
                        alt12=2;
                        }
                        break;
                    case 29:
                        {
                        alt12=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 11, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 1, input);

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
                                                        new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 19, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 17, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 13, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 3, input);

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
                                                    new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 14, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 5, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 4, input);

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
                                                new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 14, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 5, input);

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
                                            new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 6, input);

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
                                            new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 7, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 47:
                                    {
                                    int LA12_8 = input.LA(7);

                                    if ( (LA12_8==RULE_ID) ) {
                                        int LA12_15 = input.LA(8);

                                        if ( (LA12_15==41) ) {
                                            alt12=2;
                                        }
                                        else if ( (LA12_15==29) ) {
                                            alt12=1;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 15, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 8, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 41:
                                    {
                                    alt12=2;
                                    }
                                    break;
                                case 29:
                                    {
                                    alt12=1;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 20, input);

                                    throw nvae;
                                }

                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 18, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 12, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 2, input);

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
                                    new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 19, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 17, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 13, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 3, input);

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
                                new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 14, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 4, input);

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
                            new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 14, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 5, input);

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
                        new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 6, input);

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
                        new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 7, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA12_8 = input.LA(2);

                if ( (LA12_8==RULE_ID) ) {
                    int LA12_15 = input.LA(3);

                    if ( (LA12_15==41) ) {
                        alt12=2;
                    }
                    else if ( (LA12_15==29) ) {
                        alt12=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 15, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 8, input);

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
                    new NoViableAltException("1065:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1070:1: ( ruleDialogueCall )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1070:1: ( ruleDialogueCall )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1071:1: ruleDialogueCall
                    {
                     before(grammarAccess.getUICallAccess().getDialogueCallParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDialogueCall_in_rule__UICall__Alternatives2297);
                    ruleDialogueCall();
                    _fsp--;

                     after(grammarAccess.getUICallAccess().getDialogueCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1076:6: ( ruleProcessCall )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1076:6: ( ruleProcessCall )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1077:1: ruleProcessCall
                    {
                     before(grammarAccess.getUICallAccess().getProcessCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleProcessCall_in_rule__UICall__Alternatives2314);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1087:1: rule__ProcessType__Alternatives : ( ( ( 'new' ) ) | ( ( 'save' ) ) | ( ( 'edit' ) ) | ( ( 'delete' ) ) | ( ( 'cancel' ) ) | ( ( 'removefrom' ) ) | ( ( 'addto' ) ) );
    public final void rule__ProcessType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1091:1: ( ( ( 'new' ) ) | ( ( 'save' ) ) | ( ( 'edit' ) ) | ( ( 'delete' ) ) | ( ( 'cancel' ) ) | ( ( 'removefrom' ) ) | ( ( 'addto' ) ) )
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
                    new NoViableAltException("1087:1: rule__ProcessType__Alternatives : ( ( ( 'new' ) ) | ( ( 'save' ) ) | ( ( 'edit' ) ) | ( ( 'delete' ) ) | ( ( 'cancel' ) ) | ( ( 'removefrom' ) ) | ( ( 'addto' ) ) );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1092:1: ( ( 'new' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1092:1: ( ( 'new' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1093:1: ( 'new' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1094:1: ( 'new' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1094:3: 'new'
                    {
                    match(input,14,FOLLOW_14_in_rule__ProcessType__Alternatives2347); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1099:6: ( ( 'save' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1099:6: ( ( 'save' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1100:1: ( 'save' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1101:1: ( 'save' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1101:3: 'save'
                    {
                    match(input,15,FOLLOW_15_in_rule__ProcessType__Alternatives2368); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1106:6: ( ( 'edit' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1106:6: ( ( 'edit' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1107:1: ( 'edit' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1108:1: ( 'edit' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1108:3: 'edit'
                    {
                    match(input,16,FOLLOW_16_in_rule__ProcessType__Alternatives2389); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1113:6: ( ( 'delete' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1113:6: ( ( 'delete' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1114:1: ( 'delete' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1115:1: ( 'delete' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1115:3: 'delete'
                    {
                    match(input,17,FOLLOW_17_in_rule__ProcessType__Alternatives2410); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getDELETEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1120:6: ( ( 'cancel' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1120:6: ( ( 'cancel' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1121:1: ( 'cancel' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getCANCELEnumLiteralDeclaration_4()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1122:1: ( 'cancel' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1122:3: 'cancel'
                    {
                    match(input,18,FOLLOW_18_in_rule__ProcessType__Alternatives2431); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getCANCELEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1127:6: ( ( 'removefrom' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1127:6: ( ( 'removefrom' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1128:1: ( 'removefrom' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getREMOVEFROMEnumLiteralDeclaration_5()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1129:1: ( 'removefrom' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1129:3: 'removefrom'
                    {
                    match(input,19,FOLLOW_19_in_rule__ProcessType__Alternatives2452); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getREMOVEFROMEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1134:6: ( ( 'addto' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1134:6: ( ( 'addto' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1135:1: ( 'addto' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getADDTOEnumLiteralDeclaration_6()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1136:1: ( 'addto' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1136:3: 'addto'
                    {
                    match(input,20,FOLLOW_20_in_rule__ProcessType__Alternatives2473); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1146:1: rule__ExpressionType__Alternatives : ( ( ( 'all' ) ) | ( ( 'find' ) ) );
    public final void rule__ExpressionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1150:1: ( ( ( 'all' ) ) | ( ( 'find' ) ) )
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
                    new NoViableAltException("1146:1: rule__ExpressionType__Alternatives : ( ( ( 'all' ) ) | ( ( 'find' ) ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1151:1: ( ( 'all' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1151:1: ( ( 'all' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1152:1: ( 'all' )
                    {
                     before(grammarAccess.getExpressionTypeAccess().getALLEnumLiteralDeclaration_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1153:1: ( 'all' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1153:3: 'all'
                    {
                    match(input,21,FOLLOW_21_in_rule__ExpressionType__Alternatives2509); 

                    }

                     after(grammarAccess.getExpressionTypeAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1158:6: ( ( 'find' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1158:6: ( ( 'find' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1159:1: ( 'find' )
                    {
                     before(grammarAccess.getExpressionTypeAccess().getFINDEnumLiteralDeclaration_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1160:1: ( 'find' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1160:3: 'find'
                    {
                    match(input,22,FOLLOW_22_in_rule__ExpressionType__Alternatives2530); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1172:1: rule__PresentationModel__Group__0 : ( ( rule__PresentationModel__DescriptionAssignment_0 )? ) rule__PresentationModel__Group__1 ;
    public final void rule__PresentationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1176:1: ( ( ( rule__PresentationModel__DescriptionAssignment_0 )? ) rule__PresentationModel__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1177:1: ( ( rule__PresentationModel__DescriptionAssignment_0 )? ) rule__PresentationModel__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1177:1: ( ( rule__PresentationModel__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1178:1: ( rule__PresentationModel__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getPresentationModelAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1179:1: ( rule__PresentationModel__DescriptionAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1179:2: rule__PresentationModel__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PresentationModel__DescriptionAssignment_0_in_rule__PresentationModel__Group__02567);
                    rule__PresentationModel__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentationModelAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__1_in_rule__PresentationModel__Group__02577);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1190:1: rule__PresentationModel__Group__1 : ( 'presentation' ) rule__PresentationModel__Group__2 ;
    public final void rule__PresentationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1194:1: ( ( 'presentation' ) rule__PresentationModel__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1195:1: ( 'presentation' ) rule__PresentationModel__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1195:1: ( 'presentation' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1196:1: 'presentation'
            {
             before(grammarAccess.getPresentationModelAccess().getPresentationKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__PresentationModel__Group__12606); 
             after(grammarAccess.getPresentationModelAccess().getPresentationKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__2_in_rule__PresentationModel__Group__12616);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1210:1: rule__PresentationModel__Group__2 : ( ( rule__PresentationModel__NameAssignment_2 ) ) rule__PresentationModel__Group__3 ;
    public final void rule__PresentationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1214:1: ( ( ( rule__PresentationModel__NameAssignment_2 ) ) rule__PresentationModel__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1215:1: ( ( rule__PresentationModel__NameAssignment_2 ) ) rule__PresentationModel__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1215:1: ( ( rule__PresentationModel__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1216:1: ( rule__PresentationModel__NameAssignment_2 )
            {
             before(grammarAccess.getPresentationModelAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1217:1: ( rule__PresentationModel__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1217:2: rule__PresentationModel__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PresentationModel__NameAssignment_2_in_rule__PresentationModel__Group__22644);
            rule__PresentationModel__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPresentationModelAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__3_in_rule__PresentationModel__Group__22653);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1228:1: rule__PresentationModel__Group__3 : ( ';' ) rule__PresentationModel__Group__4 ;
    public final void rule__PresentationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1232:1: ( ( ';' ) rule__PresentationModel__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1233:1: ( ';' ) rule__PresentationModel__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1233:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1234:1: ';'
            {
             before(grammarAccess.getPresentationModelAccess().getSemicolonKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__PresentationModel__Group__32682); 
             after(grammarAccess.getPresentationModelAccess().getSemicolonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__4_in_rule__PresentationModel__Group__32692);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1248:1: rule__PresentationModel__Group__4 : ( ( rule__PresentationModel__ExternalReferencesAssignment_4 )* ) rule__PresentationModel__Group__5 ;
    public final void rule__PresentationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1252:1: ( ( ( rule__PresentationModel__ExternalReferencesAssignment_4 )* ) rule__PresentationModel__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1253:1: ( ( rule__PresentationModel__ExternalReferencesAssignment_4 )* ) rule__PresentationModel__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1253:1: ( ( rule__PresentationModel__ExternalReferencesAssignment_4 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1254:1: ( rule__PresentationModel__ExternalReferencesAssignment_4 )*
            {
             before(grammarAccess.getPresentationModelAccess().getExternalReferencesAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1255:1: ( rule__PresentationModel__ExternalReferencesAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1255:2: rule__PresentationModel__ExternalReferencesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__PresentationModel__ExternalReferencesAssignment_4_in_rule__PresentationModel__Group__42720);
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

            pushFollow(FOLLOW_rule__PresentationModel__Group__5_in_rule__PresentationModel__Group__42730);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1266:1: rule__PresentationModel__Group__5 : ( ( rule__PresentationModel__StartAssignment_5 )? ) rule__PresentationModel__Group__6 ;
    public final void rule__PresentationModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1270:1: ( ( ( rule__PresentationModel__StartAssignment_5 )? ) rule__PresentationModel__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1271:1: ( ( rule__PresentationModel__StartAssignment_5 )? ) rule__PresentationModel__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1271:1: ( ( rule__PresentationModel__StartAssignment_5 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1272:1: ( rule__PresentationModel__StartAssignment_5 )?
            {
             before(grammarAccess.getPresentationModelAccess().getStartAssignment_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1273:1: ( rule__PresentationModel__StartAssignment_5 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1273:2: rule__PresentationModel__StartAssignment_5
                    {
                    pushFollow(FOLLOW_rule__PresentationModel__StartAssignment_5_in_rule__PresentationModel__Group__52758);
                    rule__PresentationModel__StartAssignment_5();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentationModelAccess().getStartAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__6_in_rule__PresentationModel__Group__52768);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1284:1: rule__PresentationModel__Group__6 : ( ( rule__PresentationModel__ElementsAssignment_6 )* ) ;
    public final void rule__PresentationModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1288:1: ( ( ( rule__PresentationModel__ElementsAssignment_6 )* ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1289:1: ( ( rule__PresentationModel__ElementsAssignment_6 )* )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1289:1: ( ( rule__PresentationModel__ElementsAssignment_6 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1290:1: ( rule__PresentationModel__ElementsAssignment_6 )*
            {
             before(grammarAccess.getPresentationModelAccess().getElementsAssignment_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1291:1: ( rule__PresentationModel__ElementsAssignment_6 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STRING||LA18_0==29||LA18_0==35||(LA18_0>=37 && LA18_0<=38)||LA18_0==41) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1291:2: rule__PresentationModel__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__PresentationModel__ElementsAssignment_6_in_rule__PresentationModel__Group__62796);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1315:1: rule__Application__Group__0 : ( 'application' ) rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1319:1: ( ( 'application' ) rule__Application__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1320:1: ( 'application' ) rule__Application__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1320:1: ( 'application' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1321:1: 'application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Application__Group__02846); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Application__Group__1_in_rule__Application__Group__02856);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1335:1: rule__Application__Group__1 : ( '[' ) rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1339:1: ( ( '[' ) rule__Application__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1340:1: ( '[' ) rule__Application__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1340:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1341:1: '['
            {
             before(grammarAccess.getApplicationAccess().getLeftSquareBracketKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Application__Group__12885); 
             after(grammarAccess.getApplicationAccess().getLeftSquareBracketKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Application__Group__2_in_rule__Application__Group__12895);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1355:1: rule__Application__Group__2 : ( ( ( rule__Application__Group_2__0 ) ) ( ( rule__Application__Group_2__0 )* ) ) rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1359:1: ( ( ( ( rule__Application__Group_2__0 ) ) ( ( rule__Application__Group_2__0 )* ) ) rule__Application__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1360:1: ( ( ( rule__Application__Group_2__0 ) ) ( ( rule__Application__Group_2__0 )* ) ) rule__Application__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1360:1: ( ( ( rule__Application__Group_2__0 ) ) ( ( rule__Application__Group_2__0 )* ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1361:1: ( ( rule__Application__Group_2__0 ) ) ( ( rule__Application__Group_2__0 )* )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1361:1: ( ( rule__Application__Group_2__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1362:1: ( rule__Application__Group_2__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1363:1: ( rule__Application__Group_2__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1363:2: rule__Application__Group_2__0
            {
            pushFollow(FOLLOW_rule__Application__Group_2__0_in_rule__Application__Group__22925);
            rule__Application__Group_2__0();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup_2()); 

            }

            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1366:1: ( ( rule__Application__Group_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1367:1: ( rule__Application__Group_2__0 )*
            {
             before(grammarAccess.getApplicationAccess().getGroup_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1368:1: ( rule__Application__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1368:2: rule__Application__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Application__Group_2__0_in_rule__Application__Group__22937);
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

            pushFollow(FOLLOW_rule__Application__Group__3_in_rule__Application__Group__22949);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1380:1: rule__Application__Group__3 : ( ']' ) ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1384:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1385:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1385:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1386:1: ']'
            {
             before(grammarAccess.getApplicationAccess().getRightSquareBracketKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Application__Group__32978); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1407:1: rule__Application__Group_2__0 : ( ( rule__Application__StartProcessesAssignment_2_0 ) ) rule__Application__Group_2__1 ;
    public final void rule__Application__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1411:1: ( ( ( rule__Application__StartProcessesAssignment_2_0 ) ) rule__Application__Group_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1412:1: ( ( rule__Application__StartProcessesAssignment_2_0 ) ) rule__Application__Group_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1412:1: ( ( rule__Application__StartProcessesAssignment_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1413:1: ( rule__Application__StartProcessesAssignment_2_0 )
            {
             before(grammarAccess.getApplicationAccess().getStartProcessesAssignment_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1414:1: ( rule__Application__StartProcessesAssignment_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1414:2: rule__Application__StartProcessesAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Application__StartProcessesAssignment_2_0_in_rule__Application__Group_2__03021);
            rule__Application__StartProcessesAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getStartProcessesAssignment_2_0()); 

            }

            pushFollow(FOLLOW_rule__Application__Group_2__1_in_rule__Application__Group_2__03030);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1425:1: rule__Application__Group_2__1 : ( ';' ) ;
    public final void rule__Application__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1429:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1430:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1430:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1431:1: ';'
            {
             before(grammarAccess.getApplicationAccess().getSemicolonKeyword_2_1()); 
            match(input,13,FOLLOW_13_in_rule__Application__Group_2__13059); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1448:1: rule__ExternalReference__Group__0 : ( 'from' ) rule__ExternalReference__Group__1 ;
    public final void rule__ExternalReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1452:1: ( ( 'from' ) rule__ExternalReference__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1453:1: ( 'from' ) rule__ExternalReference__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1453:1: ( 'from' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1454:1: 'from'
            {
             before(grammarAccess.getExternalReferenceAccess().getFromKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__ExternalReference__Group__03099); 
             after(grammarAccess.getExternalReferenceAccess().getFromKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__1_in_rule__ExternalReference__Group__03109);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1468:1: rule__ExternalReference__Group__1 : ( ( rule__ExternalReference__ModelNameAssignment_1 ) ) rule__ExternalReference__Group__2 ;
    public final void rule__ExternalReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1472:1: ( ( ( rule__ExternalReference__ModelNameAssignment_1 ) ) rule__ExternalReference__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1473:1: ( ( rule__ExternalReference__ModelNameAssignment_1 ) ) rule__ExternalReference__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1473:1: ( ( rule__ExternalReference__ModelNameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1474:1: ( rule__ExternalReference__ModelNameAssignment_1 )
            {
             before(grammarAccess.getExternalReferenceAccess().getModelNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1475:1: ( rule__ExternalReference__ModelNameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1475:2: rule__ExternalReference__ModelNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalReference__ModelNameAssignment_1_in_rule__ExternalReference__Group__13137);
            rule__ExternalReference__ModelNameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getModelNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__2_in_rule__ExternalReference__Group__13146);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1486:1: rule__ExternalReference__Group__2 : ( 'import' ) rule__ExternalReference__Group__3 ;
    public final void rule__ExternalReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1490:1: ( ( 'import' ) rule__ExternalReference__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1491:1: ( 'import' ) rule__ExternalReference__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1491:1: ( 'import' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1492:1: 'import'
            {
             before(grammarAccess.getExternalReferenceAccess().getImportKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__ExternalReference__Group__23175); 
             after(grammarAccess.getExternalReferenceAccess().getImportKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__3_in_rule__ExternalReference__Group__23185);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1506:1: rule__ExternalReference__Group__3 : ( ( rule__ExternalReference__NameAssignment_3 ) ) rule__ExternalReference__Group__4 ;
    public final void rule__ExternalReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1510:1: ( ( ( rule__ExternalReference__NameAssignment_3 ) ) rule__ExternalReference__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1511:1: ( ( rule__ExternalReference__NameAssignment_3 ) ) rule__ExternalReference__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1511:1: ( ( rule__ExternalReference__NameAssignment_3 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1512:1: ( rule__ExternalReference__NameAssignment_3 )
            {
             before(grammarAccess.getExternalReferenceAccess().getNameAssignment_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1513:1: ( rule__ExternalReference__NameAssignment_3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1513:2: rule__ExternalReference__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ExternalReference__NameAssignment_3_in_rule__ExternalReference__Group__33213);
            rule__ExternalReference__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getNameAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__4_in_rule__ExternalReference__Group__33222);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1524:1: rule__ExternalReference__Group__4 : ( ';' ) ;
    public final void rule__ExternalReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1528:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1529:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1529:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1530:1: ';'
            {
             before(grammarAccess.getExternalReferenceAccess().getSemicolonKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__ExternalReference__Group__43251); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1553:1: rule__ContentForm__Group__0 : ( ( rule__ContentForm__DescriptionAssignment_0 )? ) rule__ContentForm__Group__1 ;
    public final void rule__ContentForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1557:1: ( ( ( rule__ContentForm__DescriptionAssignment_0 )? ) rule__ContentForm__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1558:1: ( ( rule__ContentForm__DescriptionAssignment_0 )? ) rule__ContentForm__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1558:1: ( ( rule__ContentForm__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1559:1: ( rule__ContentForm__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getContentFormAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1560:1: ( rule__ContentForm__DescriptionAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1560:2: rule__ContentForm__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__DescriptionAssignment_0_in_rule__ContentForm__Group__03296);
                    rule__ContentForm__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__1_in_rule__ContentForm__Group__03306);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1571:1: rule__ContentForm__Group__1 : ( 'form' ) rule__ContentForm__Group__2 ;
    public final void rule__ContentForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1575:1: ( ( 'form' ) rule__ContentForm__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1576:1: ( 'form' ) rule__ContentForm__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1576:1: ( 'form' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1577:1: 'form'
            {
             before(grammarAccess.getContentFormAccess().getFormKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__ContentForm__Group__13335); 
             after(grammarAccess.getContentFormAccess().getFormKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__2_in_rule__ContentForm__Group__13345);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1591:1: rule__ContentForm__Group__2 : ( ( rule__ContentForm__NameAssignment_2 ) ) rule__ContentForm__Group__3 ;
    public final void rule__ContentForm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1595:1: ( ( ( rule__ContentForm__NameAssignment_2 ) ) rule__ContentForm__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1596:1: ( ( rule__ContentForm__NameAssignment_2 ) ) rule__ContentForm__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1596:1: ( ( rule__ContentForm__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1597:1: ( rule__ContentForm__NameAssignment_2 )
            {
             before(grammarAccess.getContentFormAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1598:1: ( rule__ContentForm__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1598:2: rule__ContentForm__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ContentForm__NameAssignment_2_in_rule__ContentForm__Group__23373);
            rule__ContentForm__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__3_in_rule__ContentForm__Group__23382);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1609:1: rule__ContentForm__Group__3 : ( 'context' ) rule__ContentForm__Group__4 ;
    public final void rule__ContentForm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1613:1: ( ( 'context' ) rule__ContentForm__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1614:1: ( 'context' ) rule__ContentForm__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1614:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1615:1: 'context'
            {
             before(grammarAccess.getContentFormAccess().getContextKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__ContentForm__Group__33411); 
             after(grammarAccess.getContentFormAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__4_in_rule__ContentForm__Group__33421);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1629:1: rule__ContentForm__Group__4 : ( ( rule__ContentForm__CollectionContextAssignment_4 )? ) rule__ContentForm__Group__5 ;
    public final void rule__ContentForm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1633:1: ( ( ( rule__ContentForm__CollectionContextAssignment_4 )? ) rule__ContentForm__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1634:1: ( ( rule__ContentForm__CollectionContextAssignment_4 )? ) rule__ContentForm__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1634:1: ( ( rule__ContentForm__CollectionContextAssignment_4 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1635:1: ( rule__ContentForm__CollectionContextAssignment_4 )?
            {
             before(grammarAccess.getContentFormAccess().getCollectionContextAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1636:1: ( rule__ContentForm__CollectionContextAssignment_4 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==51) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1636:2: rule__ContentForm__CollectionContextAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ContentForm__CollectionContextAssignment_4_in_rule__ContentForm__Group__43449);
                    rule__ContentForm__CollectionContextAssignment_4();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getCollectionContextAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__5_in_rule__ContentForm__Group__43459);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1647:1: rule__ContentForm__Group__5 : ( ( rule__ContentForm__ContextRefAssignment_5 ) ) rule__ContentForm__Group__6 ;
    public final void rule__ContentForm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1651:1: ( ( ( rule__ContentForm__ContextRefAssignment_5 ) ) rule__ContentForm__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1652:1: ( ( rule__ContentForm__ContextRefAssignment_5 ) ) rule__ContentForm__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1652:1: ( ( rule__ContentForm__ContextRefAssignment_5 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1653:1: ( rule__ContentForm__ContextRefAssignment_5 )
            {
             before(grammarAccess.getContentFormAccess().getContextRefAssignment_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1654:1: ( rule__ContentForm__ContextRefAssignment_5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1654:2: rule__ContentForm__ContextRefAssignment_5
            {
            pushFollow(FOLLOW_rule__ContentForm__ContextRefAssignment_5_in_rule__ContentForm__Group__53487);
            rule__ContentForm__ContextRefAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getContextRefAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__6_in_rule__ContentForm__Group__53496);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1665:1: rule__ContentForm__Group__6 : ( '[' ) rule__ContentForm__Group__7 ;
    public final void rule__ContentForm__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1669:1: ( ( '[' ) rule__ContentForm__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1670:1: ( '[' ) rule__ContentForm__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1670:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1671:1: '['
            {
             before(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__ContentForm__Group__63525); 
             after(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__7_in_rule__ContentForm__Group__63535);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1685:1: rule__ContentForm__Group__7 : ( ( rule__ContentForm__Group_7__0 )? ) rule__ContentForm__Group__8 ;
    public final void rule__ContentForm__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1689:1: ( ( ( rule__ContentForm__Group_7__0 )? ) rule__ContentForm__Group__8 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1690:1: ( ( rule__ContentForm__Group_7__0 )? ) rule__ContentForm__Group__8
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1690:1: ( ( rule__ContentForm__Group_7__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1691:1: ( rule__ContentForm__Group_7__0 )?
            {
             before(grammarAccess.getContentFormAccess().getGroup_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1692:1: ( rule__ContentForm__Group_7__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1692:2: rule__ContentForm__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__Group_7__0_in_rule__ContentForm__Group__73563);
                    rule__ContentForm__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getGroup_7()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__8_in_rule__ContentForm__Group__73573);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1703:1: rule__ContentForm__Group__8 : ( ( rule__ContentForm__FormElementsAssignment_8 )* ) rule__ContentForm__Group__9 ;
    public final void rule__ContentForm__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1707:1: ( ( ( rule__ContentForm__FormElementsAssignment_8 )* ) rule__ContentForm__Group__9 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1708:1: ( ( rule__ContentForm__FormElementsAssignment_8 )* ) rule__ContentForm__Group__9
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1708:1: ( ( rule__ContentForm__FormElementsAssignment_8 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1709:1: ( rule__ContentForm__FormElementsAssignment_8 )*
            {
             before(grammarAccess.getContentFormAccess().getFormElementsAssignment_8()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1710:1: ( rule__ContentForm__FormElementsAssignment_8 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_STRING||LA23_0==42) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1710:2: rule__ContentForm__FormElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__ContentForm__FormElementsAssignment_8_in_rule__ContentForm__Group__83601);
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

            pushFollow(FOLLOW_rule__ContentForm__Group__9_in_rule__ContentForm__Group__83611);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1721:1: rule__ContentForm__Group__9 : ( ( rule__ContentForm__Group_9__0 )? ) rule__ContentForm__Group__10 ;
    public final void rule__ContentForm__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1725:1: ( ( ( rule__ContentForm__Group_9__0 )? ) rule__ContentForm__Group__10 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1726:1: ( ( rule__ContentForm__Group_9__0 )? ) rule__ContentForm__Group__10
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1726:1: ( ( rule__ContentForm__Group_9__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1727:1: ( rule__ContentForm__Group_9__0 )?
            {
             before(grammarAccess.getContentFormAccess().getGroup_9()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1728:1: ( rule__ContentForm__Group_9__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1728:2: rule__ContentForm__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__Group_9__0_in_rule__ContentForm__Group__93639);
                    rule__ContentForm__Group_9__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getGroup_9()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__10_in_rule__ContentForm__Group__93649);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1739:1: rule__ContentForm__Group__10 : ( ( rule__ContentForm__Group_10__0 )? ) rule__ContentForm__Group__11 ;
    public final void rule__ContentForm__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1743:1: ( ( ( rule__ContentForm__Group_10__0 )? ) rule__ContentForm__Group__11 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1744:1: ( ( rule__ContentForm__Group_10__0 )? ) rule__ContentForm__Group__11
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1744:1: ( ( rule__ContentForm__Group_10__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1745:1: ( rule__ContentForm__Group_10__0 )?
            {
             before(grammarAccess.getContentFormAccess().getGroup_10()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1746:1: ( rule__ContentForm__Group_10__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1746:2: rule__ContentForm__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__Group_10__0_in_rule__ContentForm__Group__103677);
                    rule__ContentForm__Group_10__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getGroup_10()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__11_in_rule__ContentForm__Group__103687);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1757:1: rule__ContentForm__Group__11 : ( ']' ) ;
    public final void rule__ContentForm__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1761:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1762:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1762:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1763:1: ']'
            {
             before(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_11()); 
            match(input,26,FOLLOW_26_in_rule__ContentForm__Group__113716); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1800:1: rule__ContentForm__Group_7__0 : ( 'readonly' ) rule__ContentForm__Group_7__1 ;
    public final void rule__ContentForm__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1804:1: ( ( 'readonly' ) rule__ContentForm__Group_7__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1805:1: ( 'readonly' ) rule__ContentForm__Group_7__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1805:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1806:1: 'readonly'
            {
             before(grammarAccess.getContentFormAccess().getReadonlyKeyword_7_0()); 
            match(input,31,FOLLOW_31_in_rule__ContentForm__Group_7__03776); 
             after(grammarAccess.getContentFormAccess().getReadonlyKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_7__1_in_rule__ContentForm__Group_7__03786);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1820:1: rule__ContentForm__Group_7__1 : ( ( rule__ContentForm__Alternatives_7_1 ) ) rule__ContentForm__Group_7__2 ;
    public final void rule__ContentForm__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1824:1: ( ( ( rule__ContentForm__Alternatives_7_1 ) ) rule__ContentForm__Group_7__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1825:1: ( ( rule__ContentForm__Alternatives_7_1 ) ) rule__ContentForm__Group_7__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1825:1: ( ( rule__ContentForm__Alternatives_7_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1826:1: ( rule__ContentForm__Alternatives_7_1 )
            {
             before(grammarAccess.getContentFormAccess().getAlternatives_7_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1827:1: ( rule__ContentForm__Alternatives_7_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1827:2: rule__ContentForm__Alternatives_7_1
            {
            pushFollow(FOLLOW_rule__ContentForm__Alternatives_7_1_in_rule__ContentForm__Group_7__13814);
            rule__ContentForm__Alternatives_7_1();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getAlternatives_7_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_7__2_in_rule__ContentForm__Group_7__13823);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1838:1: rule__ContentForm__Group_7__2 : ( ';' ) ;
    public final void rule__ContentForm__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1842:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1843:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1843:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1844:1: ';'
            {
             before(grammarAccess.getContentFormAccess().getSemicolonKeyword_7_2()); 
            match(input,13,FOLLOW_13_in_rule__ContentForm__Group_7__23852); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1863:1: rule__ContentForm__Group_9__0 : ( 'actions' ) rule__ContentForm__Group_9__1 ;
    public final void rule__ContentForm__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1867:1: ( ( 'actions' ) rule__ContentForm__Group_9__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1868:1: ( 'actions' ) rule__ContentForm__Group_9__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1868:1: ( 'actions' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1869:1: 'actions'
            {
             before(grammarAccess.getContentFormAccess().getActionsKeyword_9_0()); 
            match(input,32,FOLLOW_32_in_rule__ContentForm__Group_9__03894); 
             after(grammarAccess.getContentFormAccess().getActionsKeyword_9_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_9__1_in_rule__ContentForm__Group_9__03904);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1883:1: rule__ContentForm__Group_9__1 : ( '[' ) rule__ContentForm__Group_9__2 ;
    public final void rule__ContentForm__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1887:1: ( ( '[' ) rule__ContentForm__Group_9__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1888:1: ( '[' ) rule__ContentForm__Group_9__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1888:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1889:1: '['
            {
             before(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_9_1()); 
            match(input,25,FOLLOW_25_in_rule__ContentForm__Group_9__13933); 
             after(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_9_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_9__2_in_rule__ContentForm__Group_9__13943);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1903:1: rule__ContentForm__Group_9__2 : ( ( rule__ContentForm__Group_9_2__0 )* ) rule__ContentForm__Group_9__3 ;
    public final void rule__ContentForm__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1907:1: ( ( ( rule__ContentForm__Group_9_2__0 )* ) rule__ContentForm__Group_9__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1908:1: ( ( rule__ContentForm__Group_9_2__0 )* ) rule__ContentForm__Group_9__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1908:1: ( ( rule__ContentForm__Group_9_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1909:1: ( rule__ContentForm__Group_9_2__0 )*
            {
             before(grammarAccess.getContentFormAccess().getGroup_9_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1910:1: ( rule__ContentForm__Group_9_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)||(LA26_0>=14 && LA26_0<=20)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1910:2: rule__ContentForm__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ContentForm__Group_9_2__0_in_rule__ContentForm__Group_9__23971);
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

            pushFollow(FOLLOW_rule__ContentForm__Group_9__3_in_rule__ContentForm__Group_9__23981);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1921:1: rule__ContentForm__Group_9__3 : ( ']' ) ;
    public final void rule__ContentForm__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1925:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1926:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1926:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1927:1: ']'
            {
             before(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_9_3()); 
            match(input,26,FOLLOW_26_in_rule__ContentForm__Group_9__34010); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1948:1: rule__ContentForm__Group_9_2__0 : ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) ) rule__ContentForm__Group_9_2__1 ;
    public final void rule__ContentForm__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1952:1: ( ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) ) rule__ContentForm__Group_9_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1953:1: ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) ) rule__ContentForm__Group_9_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1953:1: ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1954:1: ( rule__ContentForm__ActionsAssignment_9_2_0 )
            {
             before(grammarAccess.getContentFormAccess().getActionsAssignment_9_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1955:1: ( rule__ContentForm__ActionsAssignment_9_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1955:2: rule__ContentForm__ActionsAssignment_9_2_0
            {
            pushFollow(FOLLOW_rule__ContentForm__ActionsAssignment_9_2_0_in_rule__ContentForm__Group_9_2__04053);
            rule__ContentForm__ActionsAssignment_9_2_0();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getActionsAssignment_9_2_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_9_2__1_in_rule__ContentForm__Group_9_2__04062);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1966:1: rule__ContentForm__Group_9_2__1 : ( ';' ) ;
    public final void rule__ContentForm__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1970:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1971:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1971:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1972:1: ';'
            {
             before(grammarAccess.getContentFormAccess().getSemicolonKeyword_9_2_1()); 
            match(input,13,FOLLOW_13_in_rule__ContentForm__Group_9_2__14091); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1989:1: rule__ContentForm__Group_10__0 : ( 'processes' ) rule__ContentForm__Group_10__1 ;
    public final void rule__ContentForm__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1993:1: ( ( 'processes' ) rule__ContentForm__Group_10__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1994:1: ( 'processes' ) rule__ContentForm__Group_10__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1994:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1995:1: 'processes'
            {
             before(grammarAccess.getContentFormAccess().getProcessesKeyword_10_0()); 
            match(input,33,FOLLOW_33_in_rule__ContentForm__Group_10__04131); 
             after(grammarAccess.getContentFormAccess().getProcessesKeyword_10_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_10__1_in_rule__ContentForm__Group_10__04141);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2009:1: rule__ContentForm__Group_10__1 : ( '[' ) rule__ContentForm__Group_10__2 ;
    public final void rule__ContentForm__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2013:1: ( ( '[' ) rule__ContentForm__Group_10__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2014:1: ( '[' ) rule__ContentForm__Group_10__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2014:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2015:1: '['
            {
             before(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_10_1()); 
            match(input,25,FOLLOW_25_in_rule__ContentForm__Group_10__14170); 
             after(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_10_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_10__2_in_rule__ContentForm__Group_10__14180);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2029:1: rule__ContentForm__Group_10__2 : ( ( rule__ContentForm__Group_10_2__0 )* ) rule__ContentForm__Group_10__3 ;
    public final void rule__ContentForm__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2033:1: ( ( ( rule__ContentForm__Group_10_2__0 )* ) rule__ContentForm__Group_10__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2034:1: ( ( rule__ContentForm__Group_10_2__0 )* ) rule__ContentForm__Group_10__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2034:1: ( ( rule__ContentForm__Group_10_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2035:1: ( rule__ContentForm__Group_10_2__0 )*
            {
             before(grammarAccess.getContentFormAccess().getGroup_10_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2036:1: ( rule__ContentForm__Group_10_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2036:2: rule__ContentForm__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ContentForm__Group_10_2__0_in_rule__ContentForm__Group_10__24208);
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

            pushFollow(FOLLOW_rule__ContentForm__Group_10__3_in_rule__ContentForm__Group_10__24218);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2047:1: rule__ContentForm__Group_10__3 : ( ']' ) ;
    public final void rule__ContentForm__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2051:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2052:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2052:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2053:1: ']'
            {
             before(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_10_3()); 
            match(input,26,FOLLOW_26_in_rule__ContentForm__Group_10__34247); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2074:1: rule__ContentForm__Group_10_2__0 : ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) ) rule__ContentForm__Group_10_2__1 ;
    public final void rule__ContentForm__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2078:1: ( ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) ) rule__ContentForm__Group_10_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2079:1: ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) ) rule__ContentForm__Group_10_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2079:1: ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2080:1: ( rule__ContentForm__ProcessesAssignment_10_2_0 )
            {
             before(grammarAccess.getContentFormAccess().getProcessesAssignment_10_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2081:1: ( rule__ContentForm__ProcessesAssignment_10_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2081:2: rule__ContentForm__ProcessesAssignment_10_2_0
            {
            pushFollow(FOLLOW_rule__ContentForm__ProcessesAssignment_10_2_0_in_rule__ContentForm__Group_10_2__04290);
            rule__ContentForm__ProcessesAssignment_10_2_0();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getProcessesAssignment_10_2_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_10_2__1_in_rule__ContentForm__Group_10_2__04299);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2092:1: rule__ContentForm__Group_10_2__1 : ( ';' ) ;
    public final void rule__ContentForm__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2096:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2097:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2097:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2098:1: ';'
            {
             before(grammarAccess.getContentFormAccess().getSemicolonKeyword_10_2_1()); 
            match(input,13,FOLLOW_13_in_rule__ContentForm__Group_10_2__14328); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2115:1: rule__Action__Group__0 : ( ( rule__Action__DescriptionAssignment_0 )? ) rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2119:1: ( ( ( rule__Action__DescriptionAssignment_0 )? ) rule__Action__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2120:1: ( ( rule__Action__DescriptionAssignment_0 )? ) rule__Action__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2120:1: ( ( rule__Action__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2121:1: ( rule__Action__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getActionAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2122:1: ( rule__Action__DescriptionAssignment_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2122:2: rule__Action__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Action__DescriptionAssignment_0_in_rule__Action__Group__04367);
                    rule__Action__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04377);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2133:1: rule__Action__Group__1 : ( ( rule__Action__TypeAssignment_1 )? ) rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2137:1: ( ( ( rule__Action__TypeAssignment_1 )? ) rule__Action__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2138:1: ( ( rule__Action__TypeAssignment_1 )? ) rule__Action__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2138:1: ( ( rule__Action__TypeAssignment_1 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2139:1: ( rule__Action__TypeAssignment_1 )?
            {
             before(grammarAccess.getActionAccess().getTypeAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2140:1: ( rule__Action__TypeAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=14 && LA29_0<=20)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2140:2: rule__Action__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Action__TypeAssignment_1_in_rule__Action__Group__14405);
                    rule__Action__TypeAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14415);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2151:1: rule__Action__Group__2 : ( ( rule__Action__NameAssignment_2 ) ) rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2155:1: ( ( ( rule__Action__NameAssignment_2 ) ) rule__Action__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2156:1: ( ( rule__Action__NameAssignment_2 ) ) rule__Action__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2156:1: ( ( rule__Action__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2157:1: ( rule__Action__NameAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2158:1: ( rule__Action__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2158:2: rule__Action__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_2_in_rule__Action__Group__24443);
            rule__Action__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__24452);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2169:1: rule__Action__Group__3 : ( ( rule__Action__Group_3__0 )? ) rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2173:1: ( ( ( rule__Action__Group_3__0 )? ) rule__Action__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2174:1: ( ( rule__Action__Group_3__0 )? ) rule__Action__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2174:1: ( ( rule__Action__Group_3__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2175:1: ( rule__Action__Group_3__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2176:1: ( rule__Action__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2176:2: rule__Action__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__34480);
                    rule__Action__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__4_in_rule__Action__Group__34490);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2187:1: rule__Action__Group__4 : ( ( rule__Action__ProcessElementsAssignment_4 )? ) ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2191:1: ( ( ( rule__Action__ProcessElementsAssignment_4 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2192:1: ( ( rule__Action__ProcessElementsAssignment_4 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2192:1: ( ( rule__Action__ProcessElementsAssignment_4 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2193:1: ( rule__Action__ProcessElementsAssignment_4 )?
            {
             before(grammarAccess.getActionAccess().getProcessElementsAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2194:1: ( rule__Action__ProcessElementsAssignment_4 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=21 && LA31_0<=22)||LA31_0==29||(LA31_0>=47 && LA31_0<=48)||LA31_0==50||LA31_0==53) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2194:2: rule__Action__ProcessElementsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Action__ProcessElementsAssignment_4_in_rule__Action__Group__44518);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2214:1: rule__Action__Group_3__0 : ( 'label' ) rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2218:1: ( ( 'label' ) rule__Action__Group_3__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2219:1: ( 'label' ) rule__Action__Group_3__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2219:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2220:1: 'label'
            {
             before(grammarAccess.getActionAccess().getLabelKeyword_3_0()); 
            match(input,34,FOLLOW_34_in_rule__Action__Group_3__04564); 
             after(grammarAccess.getActionAccess().getLabelKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__04574);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2234:1: rule__Action__Group_3__1 : ( ( rule__Action__LabelAssignment_3_1 ) ) ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2238:1: ( ( ( rule__Action__LabelAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2239:1: ( ( rule__Action__LabelAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2239:1: ( ( rule__Action__LabelAssignment_3_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2240:1: ( rule__Action__LabelAssignment_3_1 )
            {
             before(grammarAccess.getActionAccess().getLabelAssignment_3_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2241:1: ( rule__Action__LabelAssignment_3_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2241:2: rule__Action__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Action__LabelAssignment_3_1_in_rule__Action__Group_3__14602);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2255:1: rule__CompoundDialogue__Group_0__0 : ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? ) rule__CompoundDialogue__Group_0__1 ;
    public final void rule__CompoundDialogue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2259:1: ( ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? ) rule__CompoundDialogue__Group_0__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2260:1: ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? ) rule__CompoundDialogue__Group_0__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2260:1: ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2261:1: ( rule__CompoundDialogue__DescriptionAssignment_0_0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getDescriptionAssignment_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2262:1: ( rule__CompoundDialogue__DescriptionAssignment_0_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2262:2: rule__CompoundDialogue__DescriptionAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__DescriptionAssignment_0_0_in_rule__CompoundDialogue__Group_0__04640);
                    rule__CompoundDialogue__DescriptionAssignment_0_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundDialogueAccess().getDescriptionAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__1_in_rule__CompoundDialogue__Group_0__04650);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2273:1: rule__CompoundDialogue__Group_0__1 : ( 'CompoundDialogue' ) rule__CompoundDialogue__Group_0__2 ;
    public final void rule__CompoundDialogue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2277:1: ( ( 'CompoundDialogue' ) rule__CompoundDialogue__Group_0__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2278:1: ( 'CompoundDialogue' ) rule__CompoundDialogue__Group_0__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2278:1: ( 'CompoundDialogue' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2279:1: 'CompoundDialogue'
            {
             before(grammarAccess.getCompoundDialogueAccess().getCompoundDialogueKeyword_0_1()); 
            match(input,35,FOLLOW_35_in_rule__CompoundDialogue__Group_0__14679); 
             after(grammarAccess.getCompoundDialogueAccess().getCompoundDialogueKeyword_0_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__2_in_rule__CompoundDialogue__Group_0__14689);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2293:1: rule__CompoundDialogue__Group_0__2 : ( ( rule__CompoundDialogue__NameAssignment_0_2 ) ) rule__CompoundDialogue__Group_0__3 ;
    public final void rule__CompoundDialogue__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2297:1: ( ( ( rule__CompoundDialogue__NameAssignment_0_2 ) ) rule__CompoundDialogue__Group_0__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2298:1: ( ( rule__CompoundDialogue__NameAssignment_0_2 ) ) rule__CompoundDialogue__Group_0__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2298:1: ( ( rule__CompoundDialogue__NameAssignment_0_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2299:1: ( rule__CompoundDialogue__NameAssignment_0_2 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getNameAssignment_0_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2300:1: ( rule__CompoundDialogue__NameAssignment_0_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2300:2: rule__CompoundDialogue__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__NameAssignment_0_2_in_rule__CompoundDialogue__Group_0__24717);
            rule__CompoundDialogue__NameAssignment_0_2();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getNameAssignment_0_2()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__3_in_rule__CompoundDialogue__Group_0__24726);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2311:1: rule__CompoundDialogue__Group_0__3 : ( 'context' ) rule__CompoundDialogue__Group_0__4 ;
    public final void rule__CompoundDialogue__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2315:1: ( ( 'context' ) rule__CompoundDialogue__Group_0__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2316:1: ( 'context' ) rule__CompoundDialogue__Group_0__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2316:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2317:1: 'context'
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextKeyword_0_3()); 
            match(input,30,FOLLOW_30_in_rule__CompoundDialogue__Group_0__34755); 
             after(grammarAccess.getCompoundDialogueAccess().getContextKeyword_0_3()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__4_in_rule__CompoundDialogue__Group_0__34765);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2331:1: rule__CompoundDialogue__Group_0__4 : ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) ) rule__CompoundDialogue__Group_0__5 ;
    public final void rule__CompoundDialogue__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2335:1: ( ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) ) rule__CompoundDialogue__Group_0__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2336:1: ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) ) rule__CompoundDialogue__Group_0__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2336:1: ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2337:1: ( rule__CompoundDialogue__ContextRefAssignment_0_4 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextRefAssignment_0_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2338:1: ( rule__CompoundDialogue__ContextRefAssignment_0_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2338:2: rule__CompoundDialogue__ContextRefAssignment_0_4
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__ContextRefAssignment_0_4_in_rule__CompoundDialogue__Group_0__44793);
            rule__CompoundDialogue__ContextRefAssignment_0_4();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getContextRefAssignment_0_4()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__5_in_rule__CompoundDialogue__Group_0__44802);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2349:1: rule__CompoundDialogue__Group_0__5 : ( ( rule__CompoundDialogue__Group_0_5__0 )? ) rule__CompoundDialogue__Group_0__6 ;
    public final void rule__CompoundDialogue__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2353:1: ( ( ( rule__CompoundDialogue__Group_0_5__0 )? ) rule__CompoundDialogue__Group_0__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2354:1: ( ( rule__CompoundDialogue__Group_0_5__0 )? ) rule__CompoundDialogue__Group_0__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2354:1: ( ( rule__CompoundDialogue__Group_0_5__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2355:1: ( rule__CompoundDialogue__Group_0_5__0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2356:1: ( rule__CompoundDialogue__Group_0_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2356:2: rule__CompoundDialogue__Group_0_5__0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_5__0_in_rule__CompoundDialogue__Group_0__54830);
                    rule__CompoundDialogue__Group_0_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundDialogueAccess().getGroup_0_5()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__6_in_rule__CompoundDialogue__Group_0__54840);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2367:1: rule__CompoundDialogue__Group_0__6 : ( ( rule__CompoundDialogue__Group_0_6__0 )? ) rule__CompoundDialogue__Group_0__7 ;
    public final void rule__CompoundDialogue__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2371:1: ( ( ( rule__CompoundDialogue__Group_0_6__0 )? ) rule__CompoundDialogue__Group_0__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2372:1: ( ( rule__CompoundDialogue__Group_0_6__0 )? ) rule__CompoundDialogue__Group_0__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2372:1: ( ( rule__CompoundDialogue__Group_0_6__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2373:1: ( rule__CompoundDialogue__Group_0_6__0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2374:1: ( rule__CompoundDialogue__Group_0_6__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2374:2: rule__CompoundDialogue__Group_0_6__0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__0_in_rule__CompoundDialogue__Group_0__64868);
                    rule__CompoundDialogue__Group_0_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundDialogueAccess().getGroup_0_6()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__7_in_rule__CompoundDialogue__Group_0__64878);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2385:1: rule__CompoundDialogue__Group_0__7 : ( ( rule__CompoundDialogue__Group_0_7__0 )? ) ;
    public final void rule__CompoundDialogue__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2389:1: ( ( ( rule__CompoundDialogue__Group_0_7__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2390:1: ( ( rule__CompoundDialogue__Group_0_7__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2390:1: ( ( rule__CompoundDialogue__Group_0_7__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2391:1: ( rule__CompoundDialogue__Group_0_7__0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2392:1: ( rule__CompoundDialogue__Group_0_7__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2392:2: rule__CompoundDialogue__Group_0_7__0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__0_in_rule__CompoundDialogue__Group_0__74906);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2418:1: rule__CompoundDialogue__Group_0_5__0 : ( 'readonly' ) rule__CompoundDialogue__Group_0_5__1 ;
    public final void rule__CompoundDialogue__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2422:1: ( ( 'readonly' ) rule__CompoundDialogue__Group_0_5__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2423:1: ( 'readonly' ) rule__CompoundDialogue__Group_0_5__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2423:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2424:1: 'readonly'
            {
             before(grammarAccess.getCompoundDialogueAccess().getReadonlyKeyword_0_5_0()); 
            match(input,31,FOLLOW_31_in_rule__CompoundDialogue__Group_0_5__04958); 
             after(grammarAccess.getCompoundDialogueAccess().getReadonlyKeyword_0_5_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_5__1_in_rule__CompoundDialogue__Group_0_5__04968);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2438:1: rule__CompoundDialogue__Group_0_5__1 : ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) ) rule__CompoundDialogue__Group_0_5__2 ;
    public final void rule__CompoundDialogue__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2442:1: ( ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) ) rule__CompoundDialogue__Group_0_5__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2443:1: ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) ) rule__CompoundDialogue__Group_0_5__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2443:1: ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2444:1: ( rule__CompoundDialogue__Alternatives_0_5_1 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getAlternatives_0_5_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2445:1: ( rule__CompoundDialogue__Alternatives_0_5_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2445:2: rule__CompoundDialogue__Alternatives_0_5_1
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__Alternatives_0_5_1_in_rule__CompoundDialogue__Group_0_5__14996);
            rule__CompoundDialogue__Alternatives_0_5_1();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getAlternatives_0_5_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_5__2_in_rule__CompoundDialogue__Group_0_5__15005);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2456:1: rule__CompoundDialogue__Group_0_5__2 : ( ';' ) ;
    public final void rule__CompoundDialogue__Group_0_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2460:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2461:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2461:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2462:1: ';'
            {
             before(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_5_2()); 
            match(input,13,FOLLOW_13_in_rule__CompoundDialogue__Group_0_5__25034); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2481:1: rule__CompoundDialogue__Group_0_6__0 : ( 'dialogues' ) rule__CompoundDialogue__Group_0_6__1 ;
    public final void rule__CompoundDialogue__Group_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2485:1: ( ( 'dialogues' ) rule__CompoundDialogue__Group_0_6__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2486:1: ( 'dialogues' ) rule__CompoundDialogue__Group_0_6__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2486:1: ( 'dialogues' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2487:1: 'dialogues'
            {
             before(grammarAccess.getCompoundDialogueAccess().getDialoguesKeyword_0_6_0()); 
            match(input,36,FOLLOW_36_in_rule__CompoundDialogue__Group_0_6__05076); 
             after(grammarAccess.getCompoundDialogueAccess().getDialoguesKeyword_0_6_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__1_in_rule__CompoundDialogue__Group_0_6__05086);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2501:1: rule__CompoundDialogue__Group_0_6__1 : ( '[' ) rule__CompoundDialogue__Group_0_6__2 ;
    public final void rule__CompoundDialogue__Group_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2505:1: ( ( '[' ) rule__CompoundDialogue__Group_0_6__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2506:1: ( '[' ) rule__CompoundDialogue__Group_0_6__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2506:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2507:1: '['
            {
             before(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_6_1()); 
            match(input,25,FOLLOW_25_in_rule__CompoundDialogue__Group_0_6__15115); 
             after(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_6_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__2_in_rule__CompoundDialogue__Group_0_6__15125);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2521:1: rule__CompoundDialogue__Group_0_6__2 : ( ( rule__CompoundDialogue__Group_0_6_2__0 )* ) rule__CompoundDialogue__Group_0_6__3 ;
    public final void rule__CompoundDialogue__Group_0_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2525:1: ( ( ( rule__CompoundDialogue__Group_0_6_2__0 )* ) rule__CompoundDialogue__Group_0_6__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2526:1: ( ( rule__CompoundDialogue__Group_0_6_2__0 )* ) rule__CompoundDialogue__Group_0_6__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2526:1: ( ( rule__CompoundDialogue__Group_0_6_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2527:1: ( rule__CompoundDialogue__Group_0_6_2__0 )*
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_6_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2528:1: ( rule__CompoundDialogue__Group_0_6_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_STRING||(LA36_0>=21 && LA36_0<=22)||LA36_0==29||LA36_0==44||(LA36_0>=47 && LA36_0<=48)||LA36_0==50||LA36_0==53) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2528:2: rule__CompoundDialogue__Group_0_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6_2__0_in_rule__CompoundDialogue__Group_0_6__25153);
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

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__3_in_rule__CompoundDialogue__Group_0_6__25163);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2539:1: rule__CompoundDialogue__Group_0_6__3 : ( ']' ) ;
    public final void rule__CompoundDialogue__Group_0_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2543:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2544:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2544:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2545:1: ']'
            {
             before(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_6_3()); 
            match(input,26,FOLLOW_26_in_rule__CompoundDialogue__Group_0_6__35192); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2566:1: rule__CompoundDialogue__Group_0_6_2__0 : ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) ) rule__CompoundDialogue__Group_0_6_2__1 ;
    public final void rule__CompoundDialogue__Group_0_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2570:1: ( ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) ) rule__CompoundDialogue__Group_0_6_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2571:1: ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) ) rule__CompoundDialogue__Group_0_6_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2571:1: ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2572:1: ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getDialoguesAssignment_0_6_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2573:1: ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2573:2: rule__CompoundDialogue__DialoguesAssignment_0_6_2_0
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__DialoguesAssignment_0_6_2_0_in_rule__CompoundDialogue__Group_0_6_2__05235);
            rule__CompoundDialogue__DialoguesAssignment_0_6_2_0();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getDialoguesAssignment_0_6_2_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6_2__1_in_rule__CompoundDialogue__Group_0_6_2__05244);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2584:1: rule__CompoundDialogue__Group_0_6_2__1 : ( ';' ) ;
    public final void rule__CompoundDialogue__Group_0_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2588:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2589:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2589:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2590:1: ';'
            {
             before(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_6_2_1()); 
            match(input,13,FOLLOW_13_in_rule__CompoundDialogue__Group_0_6_2__15273); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2607:1: rule__CompoundDialogue__Group_0_7__0 : ( 'processes' ) rule__CompoundDialogue__Group_0_7__1 ;
    public final void rule__CompoundDialogue__Group_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2611:1: ( ( 'processes' ) rule__CompoundDialogue__Group_0_7__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2612:1: ( 'processes' ) rule__CompoundDialogue__Group_0_7__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2612:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2613:1: 'processes'
            {
             before(grammarAccess.getCompoundDialogueAccess().getProcessesKeyword_0_7_0()); 
            match(input,33,FOLLOW_33_in_rule__CompoundDialogue__Group_0_7__05313); 
             after(grammarAccess.getCompoundDialogueAccess().getProcessesKeyword_0_7_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__1_in_rule__CompoundDialogue__Group_0_7__05323);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2627:1: rule__CompoundDialogue__Group_0_7__1 : ( '[' ) rule__CompoundDialogue__Group_0_7__2 ;
    public final void rule__CompoundDialogue__Group_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2631:1: ( ( '[' ) rule__CompoundDialogue__Group_0_7__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2632:1: ( '[' ) rule__CompoundDialogue__Group_0_7__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2632:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2633:1: '['
            {
             before(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_7_1()); 
            match(input,25,FOLLOW_25_in_rule__CompoundDialogue__Group_0_7__15352); 
             after(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_7_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__2_in_rule__CompoundDialogue__Group_0_7__15362);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2647:1: rule__CompoundDialogue__Group_0_7__2 : ( ( rule__CompoundDialogue__Group_0_7_2__0 )* ) rule__CompoundDialogue__Group_0_7__3 ;
    public final void rule__CompoundDialogue__Group_0_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2651:1: ( ( ( rule__CompoundDialogue__Group_0_7_2__0 )* ) rule__CompoundDialogue__Group_0_7__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2652:1: ( ( rule__CompoundDialogue__Group_0_7_2__0 )* ) rule__CompoundDialogue__Group_0_7__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2652:1: ( ( rule__CompoundDialogue__Group_0_7_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2653:1: ( rule__CompoundDialogue__Group_0_7_2__0 )*
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_7_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2654:1: ( rule__CompoundDialogue__Group_0_7_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_STRING||(LA37_0>=21 && LA37_0<=22)||LA37_0==41||LA37_0==44||(LA37_0>=47 && LA37_0<=48)||LA37_0==50||LA37_0==53) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2654:2: rule__CompoundDialogue__Group_0_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7_2__0_in_rule__CompoundDialogue__Group_0_7__25390);
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

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__3_in_rule__CompoundDialogue__Group_0_7__25400);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2665:1: rule__CompoundDialogue__Group_0_7__3 : ( ']' ) ;
    public final void rule__CompoundDialogue__Group_0_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2669:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2670:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2670:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2671:1: ']'
            {
             before(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_7_3()); 
            match(input,26,FOLLOW_26_in_rule__CompoundDialogue__Group_0_7__35429); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2692:1: rule__CompoundDialogue__Group_0_7_2__0 : ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) ) rule__CompoundDialogue__Group_0_7_2__1 ;
    public final void rule__CompoundDialogue__Group_0_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2696:1: ( ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) ) rule__CompoundDialogue__Group_0_7_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2697:1: ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) ) rule__CompoundDialogue__Group_0_7_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2697:1: ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2698:1: ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getProcessesAssignment_0_7_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2699:1: ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2699:2: rule__CompoundDialogue__ProcessesAssignment_0_7_2_0
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__ProcessesAssignment_0_7_2_0_in_rule__CompoundDialogue__Group_0_7_2__05472);
            rule__CompoundDialogue__ProcessesAssignment_0_7_2_0();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getProcessesAssignment_0_7_2_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7_2__1_in_rule__CompoundDialogue__Group_0_7_2__05481);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2710:1: rule__CompoundDialogue__Group_0_7_2__1 : ( ';' ) ;
    public final void rule__CompoundDialogue__Group_0_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2714:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2715:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2715:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2716:1: ';'
            {
             before(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_7_2_1()); 
            match(input,13,FOLLOW_13_in_rule__CompoundDialogue__Group_0_7_2__15510); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2733:1: rule__CollectionDialogue__Group__0 : ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? ) rule__CollectionDialogue__Group__1 ;
    public final void rule__CollectionDialogue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2737:1: ( ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? ) rule__CollectionDialogue__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2738:1: ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? ) rule__CollectionDialogue__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2738:1: ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2739:1: ( rule__CollectionDialogue__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2740:1: ( rule__CollectionDialogue__DescriptionAssignment_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2740:2: rule__CollectionDialogue__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__DescriptionAssignment_0_in_rule__CollectionDialogue__Group__05549);
                    rule__CollectionDialogue__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__1_in_rule__CollectionDialogue__Group__05559);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2751:1: rule__CollectionDialogue__Group__1 : ( 'CollectionDialogue' ) rule__CollectionDialogue__Group__2 ;
    public final void rule__CollectionDialogue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2755:1: ( ( 'CollectionDialogue' ) rule__CollectionDialogue__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2756:1: ( 'CollectionDialogue' ) rule__CollectionDialogue__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2756:1: ( 'CollectionDialogue' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2757:1: 'CollectionDialogue'
            {
             before(grammarAccess.getCollectionDialogueAccess().getCollectionDialogueKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__CollectionDialogue__Group__15588); 
             after(grammarAccess.getCollectionDialogueAccess().getCollectionDialogueKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__2_in_rule__CollectionDialogue__Group__15598);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2771:1: rule__CollectionDialogue__Group__2 : ( ( rule__CollectionDialogue__NameAssignment_2 ) ) rule__CollectionDialogue__Group__3 ;
    public final void rule__CollectionDialogue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2775:1: ( ( ( rule__CollectionDialogue__NameAssignment_2 ) ) rule__CollectionDialogue__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2776:1: ( ( rule__CollectionDialogue__NameAssignment_2 ) ) rule__CollectionDialogue__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2776:1: ( ( rule__CollectionDialogue__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2777:1: ( rule__CollectionDialogue__NameAssignment_2 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2778:1: ( rule__CollectionDialogue__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2778:2: rule__CollectionDialogue__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__NameAssignment_2_in_rule__CollectionDialogue__Group__25626);
            rule__CollectionDialogue__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__3_in_rule__CollectionDialogue__Group__25635);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2789:1: rule__CollectionDialogue__Group__3 : ( 'context' ) rule__CollectionDialogue__Group__4 ;
    public final void rule__CollectionDialogue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2793:1: ( ( 'context' ) rule__CollectionDialogue__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2794:1: ( 'context' ) rule__CollectionDialogue__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2794:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2795:1: 'context'
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__CollectionDialogue__Group__35664); 
             after(grammarAccess.getCollectionDialogueAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__4_in_rule__CollectionDialogue__Group__35674);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2809:1: rule__CollectionDialogue__Group__4 : ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) ) rule__CollectionDialogue__Group__5 ;
    public final void rule__CollectionDialogue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2813:1: ( ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) ) rule__CollectionDialogue__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2814:1: ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) ) rule__CollectionDialogue__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2814:1: ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2815:1: ( rule__CollectionDialogue__ContextRefAssignment_4 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextRefAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2816:1: ( rule__CollectionDialogue__ContextRefAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2816:2: rule__CollectionDialogue__ContextRefAssignment_4
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__ContextRefAssignment_4_in_rule__CollectionDialogue__Group__45702);
            rule__CollectionDialogue__ContextRefAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getContextRefAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__5_in_rule__CollectionDialogue__Group__45711);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2827:1: rule__CollectionDialogue__Group__5 : ( '[' ) rule__CollectionDialogue__Group__6 ;
    public final void rule__CollectionDialogue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2831:1: ( ( '[' ) rule__CollectionDialogue__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2832:1: ( '[' ) rule__CollectionDialogue__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2832:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2833:1: '['
            {
             before(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__CollectionDialogue__Group__55740); 
             after(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__6_in_rule__CollectionDialogue__Group__55750);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2847:1: rule__CollectionDialogue__Group__6 : ( ( rule__CollectionDialogue__Group_6__0 )? ) rule__CollectionDialogue__Group__7 ;
    public final void rule__CollectionDialogue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2851:1: ( ( ( rule__CollectionDialogue__Group_6__0 )? ) rule__CollectionDialogue__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2852:1: ( ( rule__CollectionDialogue__Group_6__0 )? ) rule__CollectionDialogue__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2852:1: ( ( rule__CollectionDialogue__Group_6__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2853:1: ( rule__CollectionDialogue__Group_6__0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2854:1: ( rule__CollectionDialogue__Group_6__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==31) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2854:2: rule__CollectionDialogue__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__Group_6__0_in_rule__CollectionDialogue__Group__65778);
                    rule__CollectionDialogue__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getGroup_6()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__7_in_rule__CollectionDialogue__Group__65788);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2865:1: rule__CollectionDialogue__Group__7 : ( ( rule__CollectionDialogue__Group_7__0 )? ) rule__CollectionDialogue__Group__8 ;
    public final void rule__CollectionDialogue__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2869:1: ( ( ( rule__CollectionDialogue__Group_7__0 )? ) rule__CollectionDialogue__Group__8 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2870:1: ( ( rule__CollectionDialogue__Group_7__0 )? ) rule__CollectionDialogue__Group__8
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2870:1: ( ( rule__CollectionDialogue__Group_7__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2871:1: ( rule__CollectionDialogue__Group_7__0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2872:1: ( rule__CollectionDialogue__Group_7__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2872:2: rule__CollectionDialogue__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__0_in_rule__CollectionDialogue__Group__75816);
                    rule__CollectionDialogue__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getGroup_7()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__8_in_rule__CollectionDialogue__Group__75826);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2883:1: rule__CollectionDialogue__Group__8 : ( ( rule__CollectionDialogue__Group_8__0 )? ) rule__CollectionDialogue__Group__9 ;
    public final void rule__CollectionDialogue__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2887:1: ( ( ( rule__CollectionDialogue__Group_8__0 )? ) rule__CollectionDialogue__Group__9 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2888:1: ( ( rule__CollectionDialogue__Group_8__0 )? ) rule__CollectionDialogue__Group__9
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2888:1: ( ( rule__CollectionDialogue__Group_8__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2889:1: ( rule__CollectionDialogue__Group_8__0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_8()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2890:1: ( rule__CollectionDialogue__Group_8__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==33) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2890:2: rule__CollectionDialogue__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__0_in_rule__CollectionDialogue__Group__85854);
                    rule__CollectionDialogue__Group_8__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getGroup_8()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__9_in_rule__CollectionDialogue__Group__85864);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2901:1: rule__CollectionDialogue__Group__9 : ( ']' ) ;
    public final void rule__CollectionDialogue__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2905:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2906:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2906:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2907:1: ']'
            {
             before(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_9()); 
            match(input,26,FOLLOW_26_in_rule__CollectionDialogue__Group__95893); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2940:1: rule__CollectionDialogue__Group_6__0 : ( 'readonly' ) rule__CollectionDialogue__Group_6__1 ;
    public final void rule__CollectionDialogue__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2944:1: ( ( 'readonly' ) rule__CollectionDialogue__Group_6__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2945:1: ( 'readonly' ) rule__CollectionDialogue__Group_6__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2945:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2946:1: 'readonly'
            {
             before(grammarAccess.getCollectionDialogueAccess().getReadonlyKeyword_6_0()); 
            match(input,31,FOLLOW_31_in_rule__CollectionDialogue__Group_6__05949); 
             after(grammarAccess.getCollectionDialogueAccess().getReadonlyKeyword_6_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_6__1_in_rule__CollectionDialogue__Group_6__05959);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2960:1: rule__CollectionDialogue__Group_6__1 : ( ( rule__CollectionDialogue__Alternatives_6_1 ) ) rule__CollectionDialogue__Group_6__2 ;
    public final void rule__CollectionDialogue__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2964:1: ( ( ( rule__CollectionDialogue__Alternatives_6_1 ) ) rule__CollectionDialogue__Group_6__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2965:1: ( ( rule__CollectionDialogue__Alternatives_6_1 ) ) rule__CollectionDialogue__Group_6__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2965:1: ( ( rule__CollectionDialogue__Alternatives_6_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2966:1: ( rule__CollectionDialogue__Alternatives_6_1 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getAlternatives_6_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2967:1: ( rule__CollectionDialogue__Alternatives_6_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2967:2: rule__CollectionDialogue__Alternatives_6_1
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__Alternatives_6_1_in_rule__CollectionDialogue__Group_6__15987);
            rule__CollectionDialogue__Alternatives_6_1();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getAlternatives_6_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_6__2_in_rule__CollectionDialogue__Group_6__15996);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2978:1: rule__CollectionDialogue__Group_6__2 : ( ';' ) ;
    public final void rule__CollectionDialogue__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2982:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2983:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2983:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2984:1: ';'
            {
             before(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_6_2()); 
            match(input,13,FOLLOW_13_in_rule__CollectionDialogue__Group_6__26025); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3003:1: rule__CollectionDialogue__Group_7__0 : ( 'dialogues' ) rule__CollectionDialogue__Group_7__1 ;
    public final void rule__CollectionDialogue__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3007:1: ( ( 'dialogues' ) rule__CollectionDialogue__Group_7__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3008:1: ( 'dialogues' ) rule__CollectionDialogue__Group_7__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3008:1: ( 'dialogues' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3009:1: 'dialogues'
            {
             before(grammarAccess.getCollectionDialogueAccess().getDialoguesKeyword_7_0()); 
            match(input,36,FOLLOW_36_in_rule__CollectionDialogue__Group_7__06067); 
             after(grammarAccess.getCollectionDialogueAccess().getDialoguesKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__1_in_rule__CollectionDialogue__Group_7__06077);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3023:1: rule__CollectionDialogue__Group_7__1 : ( '[' ) rule__CollectionDialogue__Group_7__2 ;
    public final void rule__CollectionDialogue__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3027:1: ( ( '[' ) rule__CollectionDialogue__Group_7__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3028:1: ( '[' ) rule__CollectionDialogue__Group_7__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3028:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3029:1: '['
            {
             before(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_7_1()); 
            match(input,25,FOLLOW_25_in_rule__CollectionDialogue__Group_7__16106); 
             after(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_7_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__2_in_rule__CollectionDialogue__Group_7__16116);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3043:1: rule__CollectionDialogue__Group_7__2 : ( ( rule__CollectionDialogue__Group_7_2__0 )* ) rule__CollectionDialogue__Group_7__3 ;
    public final void rule__CollectionDialogue__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3047:1: ( ( ( rule__CollectionDialogue__Group_7_2__0 )* ) rule__CollectionDialogue__Group_7__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3048:1: ( ( rule__CollectionDialogue__Group_7_2__0 )* ) rule__CollectionDialogue__Group_7__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3048:1: ( ( rule__CollectionDialogue__Group_7_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3049:1: ( rule__CollectionDialogue__Group_7_2__0 )*
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_7_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3050:1: ( rule__CollectionDialogue__Group_7_2__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_STRING||(LA42_0>=21 && LA42_0<=22)||LA42_0==29||LA42_0==44||(LA42_0>=47 && LA42_0<=48)||LA42_0==50||LA42_0==53) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3050:2: rule__CollectionDialogue__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CollectionDialogue__Group_7_2__0_in_rule__CollectionDialogue__Group_7__26144);
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

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__3_in_rule__CollectionDialogue__Group_7__26154);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3061:1: rule__CollectionDialogue__Group_7__3 : ( ']' ) ;
    public final void rule__CollectionDialogue__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3065:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3066:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3066:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3067:1: ']'
            {
             before(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_7_3()); 
            match(input,26,FOLLOW_26_in_rule__CollectionDialogue__Group_7__36183); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3088:1: rule__CollectionDialogue__Group_7_2__0 : ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) ) rule__CollectionDialogue__Group_7_2__1 ;
    public final void rule__CollectionDialogue__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3092:1: ( ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) ) rule__CollectionDialogue__Group_7_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3093:1: ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) ) rule__CollectionDialogue__Group_7_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3093:1: ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3094:1: ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getDialoguesAssignment_7_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3095:1: ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3095:2: rule__CollectionDialogue__DialoguesAssignment_7_2_0
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__DialoguesAssignment_7_2_0_in_rule__CollectionDialogue__Group_7_2__06226);
            rule__CollectionDialogue__DialoguesAssignment_7_2_0();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getDialoguesAssignment_7_2_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7_2__1_in_rule__CollectionDialogue__Group_7_2__06235);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3106:1: rule__CollectionDialogue__Group_7_2__1 : ( ';' ) ;
    public final void rule__CollectionDialogue__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3110:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3111:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3111:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3112:1: ';'
            {
             before(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_7_2_1()); 
            match(input,13,FOLLOW_13_in_rule__CollectionDialogue__Group_7_2__16264); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3129:1: rule__CollectionDialogue__Group_8__0 : ( 'processes' ) rule__CollectionDialogue__Group_8__1 ;
    public final void rule__CollectionDialogue__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3133:1: ( ( 'processes' ) rule__CollectionDialogue__Group_8__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3134:1: ( 'processes' ) rule__CollectionDialogue__Group_8__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3134:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3135:1: 'processes'
            {
             before(grammarAccess.getCollectionDialogueAccess().getProcessesKeyword_8_0()); 
            match(input,33,FOLLOW_33_in_rule__CollectionDialogue__Group_8__06304); 
             after(grammarAccess.getCollectionDialogueAccess().getProcessesKeyword_8_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__1_in_rule__CollectionDialogue__Group_8__06314);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3149:1: rule__CollectionDialogue__Group_8__1 : ( '[' ) rule__CollectionDialogue__Group_8__2 ;
    public final void rule__CollectionDialogue__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3153:1: ( ( '[' ) rule__CollectionDialogue__Group_8__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3154:1: ( '[' ) rule__CollectionDialogue__Group_8__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3154:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3155:1: '['
            {
             before(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_8_1()); 
            match(input,25,FOLLOW_25_in_rule__CollectionDialogue__Group_8__16343); 
             after(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_8_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__2_in_rule__CollectionDialogue__Group_8__16353);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3169:1: rule__CollectionDialogue__Group_8__2 : ( ( rule__CollectionDialogue__Group_8_2__0 )* ) rule__CollectionDialogue__Group_8__3 ;
    public final void rule__CollectionDialogue__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3173:1: ( ( ( rule__CollectionDialogue__Group_8_2__0 )* ) rule__CollectionDialogue__Group_8__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3174:1: ( ( rule__CollectionDialogue__Group_8_2__0 )* ) rule__CollectionDialogue__Group_8__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3174:1: ( ( rule__CollectionDialogue__Group_8_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3175:1: ( rule__CollectionDialogue__Group_8_2__0 )*
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_8_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3176:1: ( rule__CollectionDialogue__Group_8_2__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_STRING||(LA43_0>=21 && LA43_0<=22)||LA43_0==41||LA43_0==44||(LA43_0>=47 && LA43_0<=48)||LA43_0==50||LA43_0==53) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3176:2: rule__CollectionDialogue__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CollectionDialogue__Group_8_2__0_in_rule__CollectionDialogue__Group_8__26381);
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

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__3_in_rule__CollectionDialogue__Group_8__26391);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3187:1: rule__CollectionDialogue__Group_8__3 : ( ']' ) ;
    public final void rule__CollectionDialogue__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3191:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3192:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3192:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3193:1: ']'
            {
             before(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_8_3()); 
            match(input,26,FOLLOW_26_in_rule__CollectionDialogue__Group_8__36420); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3214:1: rule__CollectionDialogue__Group_8_2__0 : ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) ) rule__CollectionDialogue__Group_8_2__1 ;
    public final void rule__CollectionDialogue__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3218:1: ( ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) ) rule__CollectionDialogue__Group_8_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3219:1: ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) ) rule__CollectionDialogue__Group_8_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3219:1: ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3220:1: ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getProcessesAssignment_8_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3221:1: ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3221:2: rule__CollectionDialogue__ProcessesAssignment_8_2_0
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__ProcessesAssignment_8_2_0_in_rule__CollectionDialogue__Group_8_2__06463);
            rule__CollectionDialogue__ProcessesAssignment_8_2_0();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getProcessesAssignment_8_2_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8_2__1_in_rule__CollectionDialogue__Group_8_2__06472);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3232:1: rule__CollectionDialogue__Group_8_2__1 : ( ';' ) ;
    public final void rule__CollectionDialogue__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3236:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3237:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3237:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3238:1: ';'
            {
             before(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_8_2_1()); 
            match(input,13,FOLLOW_13_in_rule__CollectionDialogue__Group_8_2__16501); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3255:1: rule__MasterDetail__Group__0 : ( ( rule__MasterDetail__DescriptionAssignment_0 )? ) rule__MasterDetail__Group__1 ;
    public final void rule__MasterDetail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3259:1: ( ( ( rule__MasterDetail__DescriptionAssignment_0 )? ) rule__MasterDetail__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3260:1: ( ( rule__MasterDetail__DescriptionAssignment_0 )? ) rule__MasterDetail__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3260:1: ( ( rule__MasterDetail__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3261:1: ( rule__MasterDetail__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getMasterDetailAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3262:1: ( rule__MasterDetail__DescriptionAssignment_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3262:2: rule__MasterDetail__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__MasterDetail__DescriptionAssignment_0_in_rule__MasterDetail__Group__06540);
                    rule__MasterDetail__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMasterDetailAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__1_in_rule__MasterDetail__Group__06550);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3273:1: rule__MasterDetail__Group__1 : ( 'MasterDetail' ) rule__MasterDetail__Group__2 ;
    public final void rule__MasterDetail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3277:1: ( ( 'MasterDetail' ) rule__MasterDetail__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3278:1: ( 'MasterDetail' ) rule__MasterDetail__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3278:1: ( 'MasterDetail' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3279:1: 'MasterDetail'
            {
             before(grammarAccess.getMasterDetailAccess().getMasterDetailKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__MasterDetail__Group__16579); 
             after(grammarAccess.getMasterDetailAccess().getMasterDetailKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__2_in_rule__MasterDetail__Group__16589);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3293:1: rule__MasterDetail__Group__2 : ( ( rule__MasterDetail__NameAssignment_2 ) ) rule__MasterDetail__Group__3 ;
    public final void rule__MasterDetail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3297:1: ( ( ( rule__MasterDetail__NameAssignment_2 ) ) rule__MasterDetail__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3298:1: ( ( rule__MasterDetail__NameAssignment_2 ) ) rule__MasterDetail__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3298:1: ( ( rule__MasterDetail__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3299:1: ( rule__MasterDetail__NameAssignment_2 )
            {
             before(grammarAccess.getMasterDetailAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3300:1: ( rule__MasterDetail__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3300:2: rule__MasterDetail__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MasterDetail__NameAssignment_2_in_rule__MasterDetail__Group__26617);
            rule__MasterDetail__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__3_in_rule__MasterDetail__Group__26626);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3311:1: rule__MasterDetail__Group__3 : ( 'context' ) rule__MasterDetail__Group__4 ;
    public final void rule__MasterDetail__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3315:1: ( ( 'context' ) rule__MasterDetail__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3316:1: ( 'context' ) rule__MasterDetail__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3316:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3317:1: 'context'
            {
             before(grammarAccess.getMasterDetailAccess().getContextKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__MasterDetail__Group__36655); 
             after(grammarAccess.getMasterDetailAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__4_in_rule__MasterDetail__Group__36665);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3331:1: rule__MasterDetail__Group__4 : ( ( rule__MasterDetail__ContextRefAssignment_4 ) ) rule__MasterDetail__Group__5 ;
    public final void rule__MasterDetail__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3335:1: ( ( ( rule__MasterDetail__ContextRefAssignment_4 ) ) rule__MasterDetail__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3336:1: ( ( rule__MasterDetail__ContextRefAssignment_4 ) ) rule__MasterDetail__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3336:1: ( ( rule__MasterDetail__ContextRefAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3337:1: ( rule__MasterDetail__ContextRefAssignment_4 )
            {
             before(grammarAccess.getMasterDetailAccess().getContextRefAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3338:1: ( rule__MasterDetail__ContextRefAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3338:2: rule__MasterDetail__ContextRefAssignment_4
            {
            pushFollow(FOLLOW_rule__MasterDetail__ContextRefAssignment_4_in_rule__MasterDetail__Group__46693);
            rule__MasterDetail__ContextRefAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getContextRefAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__5_in_rule__MasterDetail__Group__46702);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3349:1: rule__MasterDetail__Group__5 : ( ( rule__MasterDetail__Group_5__0 )? ) rule__MasterDetail__Group__6 ;
    public final void rule__MasterDetail__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3353:1: ( ( ( rule__MasterDetail__Group_5__0 )? ) rule__MasterDetail__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3354:1: ( ( rule__MasterDetail__Group_5__0 )? ) rule__MasterDetail__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3354:1: ( ( rule__MasterDetail__Group_5__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3355:1: ( rule__MasterDetail__Group_5__0 )?
            {
             before(grammarAccess.getMasterDetailAccess().getGroup_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3356:1: ( rule__MasterDetail__Group_5__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==31) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3356:2: rule__MasterDetail__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__MasterDetail__Group_5__0_in_rule__MasterDetail__Group__56730);
                    rule__MasterDetail__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMasterDetailAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__6_in_rule__MasterDetail__Group__56740);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3367:1: rule__MasterDetail__Group__6 : ( 'master' ) rule__MasterDetail__Group__7 ;
    public final void rule__MasterDetail__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3371:1: ( ( 'master' ) rule__MasterDetail__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3372:1: ( 'master' ) rule__MasterDetail__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3372:1: ( 'master' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3373:1: 'master'
            {
             before(grammarAccess.getMasterDetailAccess().getMasterKeyword_6()); 
            match(input,39,FOLLOW_39_in_rule__MasterDetail__Group__66769); 
             after(grammarAccess.getMasterDetailAccess().getMasterKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__7_in_rule__MasterDetail__Group__66779);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3387:1: rule__MasterDetail__Group__7 : ( ( rule__MasterDetail__MasterAssignment_7 ) ) rule__MasterDetail__Group__8 ;
    public final void rule__MasterDetail__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3391:1: ( ( ( rule__MasterDetail__MasterAssignment_7 ) ) rule__MasterDetail__Group__8 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3392:1: ( ( rule__MasterDetail__MasterAssignment_7 ) ) rule__MasterDetail__Group__8
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3392:1: ( ( rule__MasterDetail__MasterAssignment_7 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3393:1: ( rule__MasterDetail__MasterAssignment_7 )
            {
             before(grammarAccess.getMasterDetailAccess().getMasterAssignment_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3394:1: ( rule__MasterDetail__MasterAssignment_7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3394:2: rule__MasterDetail__MasterAssignment_7
            {
            pushFollow(FOLLOW_rule__MasterDetail__MasterAssignment_7_in_rule__MasterDetail__Group__76807);
            rule__MasterDetail__MasterAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getMasterAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__8_in_rule__MasterDetail__Group__76816);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3405:1: rule__MasterDetail__Group__8 : ( ';' ) rule__MasterDetail__Group__9 ;
    public final void rule__MasterDetail__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3409:1: ( ( ';' ) rule__MasterDetail__Group__9 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3410:1: ( ';' ) rule__MasterDetail__Group__9
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3410:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3411:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_8()); 
            match(input,13,FOLLOW_13_in_rule__MasterDetail__Group__86845); 
             after(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__9_in_rule__MasterDetail__Group__86855);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3425:1: rule__MasterDetail__Group__9 : ( 'detail' ) rule__MasterDetail__Group__10 ;
    public final void rule__MasterDetail__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3429:1: ( ( 'detail' ) rule__MasterDetail__Group__10 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3430:1: ( 'detail' ) rule__MasterDetail__Group__10
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3430:1: ( 'detail' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3431:1: 'detail'
            {
             before(grammarAccess.getMasterDetailAccess().getDetailKeyword_9()); 
            match(input,40,FOLLOW_40_in_rule__MasterDetail__Group__96884); 
             after(grammarAccess.getMasterDetailAccess().getDetailKeyword_9()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__10_in_rule__MasterDetail__Group__96894);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3445:1: rule__MasterDetail__Group__10 : ( ( rule__MasterDetail__DetailAssignment_10 ) ) rule__MasterDetail__Group__11 ;
    public final void rule__MasterDetail__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3449:1: ( ( ( rule__MasterDetail__DetailAssignment_10 ) ) rule__MasterDetail__Group__11 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3450:1: ( ( rule__MasterDetail__DetailAssignment_10 ) ) rule__MasterDetail__Group__11
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3450:1: ( ( rule__MasterDetail__DetailAssignment_10 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3451:1: ( rule__MasterDetail__DetailAssignment_10 )
            {
             before(grammarAccess.getMasterDetailAccess().getDetailAssignment_10()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3452:1: ( rule__MasterDetail__DetailAssignment_10 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3452:2: rule__MasterDetail__DetailAssignment_10
            {
            pushFollow(FOLLOW_rule__MasterDetail__DetailAssignment_10_in_rule__MasterDetail__Group__106922);
            rule__MasterDetail__DetailAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getDetailAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__11_in_rule__MasterDetail__Group__106931);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3463:1: rule__MasterDetail__Group__11 : ( ';' ) rule__MasterDetail__Group__12 ;
    public final void rule__MasterDetail__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3467:1: ( ( ';' ) rule__MasterDetail__Group__12 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3468:1: ( ';' ) rule__MasterDetail__Group__12
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3468:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3469:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_11()); 
            match(input,13,FOLLOW_13_in_rule__MasterDetail__Group__116960); 
             after(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_11()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__12_in_rule__MasterDetail__Group__116970);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3483:1: rule__MasterDetail__Group__12 : ( ( rule__MasterDetail__Group_12__0 )? ) ;
    public final void rule__MasterDetail__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3487:1: ( ( ( rule__MasterDetail__Group_12__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3488:1: ( ( rule__MasterDetail__Group_12__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3488:1: ( ( rule__MasterDetail__Group_12__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3489:1: ( rule__MasterDetail__Group_12__0 )?
            {
             before(grammarAccess.getMasterDetailAccess().getGroup_12()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3490:1: ( rule__MasterDetail__Group_12__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==33) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3490:2: rule__MasterDetail__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__MasterDetail__Group_12__0_in_rule__MasterDetail__Group__126998);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3526:1: rule__MasterDetail__Group_5__0 : ( 'readonly' ) rule__MasterDetail__Group_5__1 ;
    public final void rule__MasterDetail__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3530:1: ( ( 'readonly' ) rule__MasterDetail__Group_5__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3531:1: ( 'readonly' ) rule__MasterDetail__Group_5__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3531:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3532:1: 'readonly'
            {
             before(grammarAccess.getMasterDetailAccess().getReadonlyKeyword_5_0()); 
            match(input,31,FOLLOW_31_in_rule__MasterDetail__Group_5__07060); 
             after(grammarAccess.getMasterDetailAccess().getReadonlyKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_5__1_in_rule__MasterDetail__Group_5__07070);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3546:1: rule__MasterDetail__Group_5__1 : ( ( rule__MasterDetail__Alternatives_5_1 ) ) rule__MasterDetail__Group_5__2 ;
    public final void rule__MasterDetail__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3550:1: ( ( ( rule__MasterDetail__Alternatives_5_1 ) ) rule__MasterDetail__Group_5__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3551:1: ( ( rule__MasterDetail__Alternatives_5_1 ) ) rule__MasterDetail__Group_5__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3551:1: ( ( rule__MasterDetail__Alternatives_5_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3552:1: ( rule__MasterDetail__Alternatives_5_1 )
            {
             before(grammarAccess.getMasterDetailAccess().getAlternatives_5_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3553:1: ( rule__MasterDetail__Alternatives_5_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3553:2: rule__MasterDetail__Alternatives_5_1
            {
            pushFollow(FOLLOW_rule__MasterDetail__Alternatives_5_1_in_rule__MasterDetail__Group_5__17098);
            rule__MasterDetail__Alternatives_5_1();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getAlternatives_5_1()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_5__2_in_rule__MasterDetail__Group_5__17107);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3564:1: rule__MasterDetail__Group_5__2 : ( ';' ) ;
    public final void rule__MasterDetail__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3568:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3569:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3569:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3570:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_5_2()); 
            match(input,13,FOLLOW_13_in_rule__MasterDetail__Group_5__27136); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3589:1: rule__MasterDetail__Group_12__0 : ( 'processes' ) rule__MasterDetail__Group_12__1 ;
    public final void rule__MasterDetail__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3593:1: ( ( 'processes' ) rule__MasterDetail__Group_12__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3594:1: ( 'processes' ) rule__MasterDetail__Group_12__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3594:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3595:1: 'processes'
            {
             before(grammarAccess.getMasterDetailAccess().getProcessesKeyword_12_0()); 
            match(input,33,FOLLOW_33_in_rule__MasterDetail__Group_12__07178); 
             after(grammarAccess.getMasterDetailAccess().getProcessesKeyword_12_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_12__1_in_rule__MasterDetail__Group_12__07188);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3609:1: rule__MasterDetail__Group_12__1 : ( '[' ) rule__MasterDetail__Group_12__2 ;
    public final void rule__MasterDetail__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3613:1: ( ( '[' ) rule__MasterDetail__Group_12__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3614:1: ( '[' ) rule__MasterDetail__Group_12__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3614:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3615:1: '['
            {
             before(grammarAccess.getMasterDetailAccess().getLeftSquareBracketKeyword_12_1()); 
            match(input,25,FOLLOW_25_in_rule__MasterDetail__Group_12__17217); 
             after(grammarAccess.getMasterDetailAccess().getLeftSquareBracketKeyword_12_1()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_12__2_in_rule__MasterDetail__Group_12__17227);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3629:1: rule__MasterDetail__Group_12__2 : ( ( rule__MasterDetail__Group_12_2__0 )* ) rule__MasterDetail__Group_12__3 ;
    public final void rule__MasterDetail__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3633:1: ( ( ( rule__MasterDetail__Group_12_2__0 )* ) rule__MasterDetail__Group_12__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3634:1: ( ( rule__MasterDetail__Group_12_2__0 )* ) rule__MasterDetail__Group_12__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3634:1: ( ( rule__MasterDetail__Group_12_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3635:1: ( rule__MasterDetail__Group_12_2__0 )*
            {
             before(grammarAccess.getMasterDetailAccess().getGroup_12_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3636:1: ( rule__MasterDetail__Group_12_2__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_STRING||(LA47_0>=21 && LA47_0<=22)||LA47_0==41||LA47_0==44||(LA47_0>=47 && LA47_0<=48)||LA47_0==50||LA47_0==53) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3636:2: rule__MasterDetail__Group_12_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MasterDetail__Group_12_2__0_in_rule__MasterDetail__Group_12__27255);
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

            pushFollow(FOLLOW_rule__MasterDetail__Group_12__3_in_rule__MasterDetail__Group_12__27265);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3647:1: rule__MasterDetail__Group_12__3 : ( ']' ) ;
    public final void rule__MasterDetail__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3651:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3652:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3652:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3653:1: ']'
            {
             before(grammarAccess.getMasterDetailAccess().getRightSquareBracketKeyword_12_3()); 
            match(input,26,FOLLOW_26_in_rule__MasterDetail__Group_12__37294); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3674:1: rule__MasterDetail__Group_12_2__0 : ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) ) rule__MasterDetail__Group_12_2__1 ;
    public final void rule__MasterDetail__Group_12_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3678:1: ( ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) ) rule__MasterDetail__Group_12_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3679:1: ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) ) rule__MasterDetail__Group_12_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3679:1: ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3680:1: ( rule__MasterDetail__ProcessesAssignment_12_2_0 )
            {
             before(grammarAccess.getMasterDetailAccess().getProcessesAssignment_12_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3681:1: ( rule__MasterDetail__ProcessesAssignment_12_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3681:2: rule__MasterDetail__ProcessesAssignment_12_2_0
            {
            pushFollow(FOLLOW_rule__MasterDetail__ProcessesAssignment_12_2_0_in_rule__MasterDetail__Group_12_2__07337);
            rule__MasterDetail__ProcessesAssignment_12_2_0();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getProcessesAssignment_12_2_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_12_2__1_in_rule__MasterDetail__Group_12_2__07346);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3692:1: rule__MasterDetail__Group_12_2__1 : ( ';' ) ;
    public final void rule__MasterDetail__Group_12_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3696:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3697:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3697:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3698:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_12_2_1()); 
            match(input,13,FOLLOW_13_in_rule__MasterDetail__Group_12_2__17375); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3715:1: rule__Process__Group__0 : ( ( rule__Process__DescriptionAssignment_0 )? ) rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3719:1: ( ( ( rule__Process__DescriptionAssignment_0 )? ) rule__Process__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3720:1: ( ( rule__Process__DescriptionAssignment_0 )? ) rule__Process__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3720:1: ( ( rule__Process__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3721:1: ( rule__Process__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getProcessAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3722:1: ( rule__Process__DescriptionAssignment_0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_STRING) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3722:2: rule__Process__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Process__DescriptionAssignment_0_in_rule__Process__Group__07414);
                    rule__Process__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__1_in_rule__Process__Group__07424);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3733:1: rule__Process__Group__1 : ( 'process' ) rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3737:1: ( ( 'process' ) rule__Process__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3738:1: ( 'process' ) rule__Process__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3738:1: ( 'process' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3739:1: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__Process__Group__17453); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__2_in_rule__Process__Group__17463);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3753:1: rule__Process__Group__2 : ( ( rule__Process__Alternatives_2 )? ) rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3757:1: ( ( ( rule__Process__Alternatives_2 )? ) rule__Process__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3758:1: ( ( rule__Process__Alternatives_2 )? ) rule__Process__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3758:1: ( ( rule__Process__Alternatives_2 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3759:1: ( rule__Process__Alternatives_2 )?
            {
             before(grammarAccess.getProcessAccess().getAlternatives_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3760:1: ( rule__Process__Alternatives_2 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==11||(LA49_0>=14 && LA49_0<=20)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3760:2: rule__Process__Alternatives_2
                    {
                    pushFollow(FOLLOW_rule__Process__Alternatives_2_in_rule__Process__Group__27491);
                    rule__Process__Alternatives_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getAlternatives_2()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__3_in_rule__Process__Group__27501);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3771:1: rule__Process__Group__3 : ( ( rule__Process__NameAssignment_3 ) ) rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3775:1: ( ( ( rule__Process__NameAssignment_3 ) ) rule__Process__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3776:1: ( ( rule__Process__NameAssignment_3 ) ) rule__Process__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3776:1: ( ( rule__Process__NameAssignment_3 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3777:1: ( rule__Process__NameAssignment_3 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3778:1: ( rule__Process__NameAssignment_3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3778:2: rule__Process__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Process__NameAssignment_3_in_rule__Process__Group__37529);
            rule__Process__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__4_in_rule__Process__Group__37538);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3789:1: rule__Process__Group__4 : ( 'context' ) rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3793:1: ( ( 'context' ) rule__Process__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3794:1: ( 'context' ) rule__Process__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3794:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3795:1: 'context'
            {
             before(grammarAccess.getProcessAccess().getContextKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__Process__Group__47567); 
             after(grammarAccess.getProcessAccess().getContextKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__5_in_rule__Process__Group__47577);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3809:1: rule__Process__Group__5 : ( ( rule__Process__CollectionContextAssignment_5 )? ) rule__Process__Group__6 ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3813:1: ( ( ( rule__Process__CollectionContextAssignment_5 )? ) rule__Process__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3814:1: ( ( rule__Process__CollectionContextAssignment_5 )? ) rule__Process__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3814:1: ( ( rule__Process__CollectionContextAssignment_5 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3815:1: ( rule__Process__CollectionContextAssignment_5 )?
            {
             before(grammarAccess.getProcessAccess().getCollectionContextAssignment_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3816:1: ( rule__Process__CollectionContextAssignment_5 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==51) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3816:2: rule__Process__CollectionContextAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Process__CollectionContextAssignment_5_in_rule__Process__Group__57605);
                    rule__Process__CollectionContextAssignment_5();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getCollectionContextAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__6_in_rule__Process__Group__57615);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3827:1: rule__Process__Group__6 : ( ( rule__Process__ContextRefAssignment_6 ) ) rule__Process__Group__7 ;
    public final void rule__Process__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3831:1: ( ( ( rule__Process__ContextRefAssignment_6 ) ) rule__Process__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3832:1: ( ( rule__Process__ContextRefAssignment_6 ) ) rule__Process__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3832:1: ( ( rule__Process__ContextRefAssignment_6 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3833:1: ( rule__Process__ContextRefAssignment_6 )
            {
             before(grammarAccess.getProcessAccess().getContextRefAssignment_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3834:1: ( rule__Process__ContextRefAssignment_6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3834:2: rule__Process__ContextRefAssignment_6
            {
            pushFollow(FOLLOW_rule__Process__ContextRefAssignment_6_in_rule__Process__Group__67643);
            rule__Process__ContextRefAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getContextRefAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__7_in_rule__Process__Group__67652);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3845:1: rule__Process__Group__7 : ( ( rule__Process__Alternatives_7 ) ) ;
    public final void rule__Process__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3849:1: ( ( ( rule__Process__Alternatives_7 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3850:1: ( ( rule__Process__Alternatives_7 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3850:1: ( ( rule__Process__Alternatives_7 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3851:1: ( rule__Process__Alternatives_7 )
            {
             before(grammarAccess.getProcessAccess().getAlternatives_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3852:1: ( rule__Process__Alternatives_7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3852:2: rule__Process__Alternatives_7
            {
            pushFollow(FOLLOW_rule__Process__Alternatives_7_in_rule__Process__Group__77680);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3878:1: rule__Process__Group_2_1__0 : ( ( rule__Process__TypeAssignment_2_1_0 ) ) rule__Process__Group_2_1__1 ;
    public final void rule__Process__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3882:1: ( ( ( rule__Process__TypeAssignment_2_1_0 ) ) rule__Process__Group_2_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3883:1: ( ( rule__Process__TypeAssignment_2_1_0 ) ) rule__Process__Group_2_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3883:1: ( ( rule__Process__TypeAssignment_2_1_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3884:1: ( rule__Process__TypeAssignment_2_1_0 )
            {
             before(grammarAccess.getProcessAccess().getTypeAssignment_2_1_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3885:1: ( rule__Process__TypeAssignment_2_1_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3885:2: rule__Process__TypeAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__Process__TypeAssignment_2_1_0_in_rule__Process__Group_2_1__07730);
            rule__Process__TypeAssignment_2_1_0();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getTypeAssignment_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__Process__Group_2_1__1_in_rule__Process__Group_2_1__07739);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3896:1: rule__Process__Group_2_1__1 : ( ( rule__Process__LinkAssignment_2_1_1 ) ) ;
    public final void rule__Process__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3900:1: ( ( ( rule__Process__LinkAssignment_2_1_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3901:1: ( ( rule__Process__LinkAssignment_2_1_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3901:1: ( ( rule__Process__LinkAssignment_2_1_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3902:1: ( rule__Process__LinkAssignment_2_1_1 )
            {
             before(grammarAccess.getProcessAccess().getLinkAssignment_2_1_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3903:1: ( rule__Process__LinkAssignment_2_1_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3903:2: rule__Process__LinkAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Process__LinkAssignment_2_1_1_in_rule__Process__Group_2_1__17767);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3917:1: rule__Process__Group_7_1__0 : ( '[' ) rule__Process__Group_7_1__1 ;
    public final void rule__Process__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3921:1: ( ( '[' ) rule__Process__Group_7_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3922:1: ( '[' ) rule__Process__Group_7_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3922:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3923:1: '['
            {
             before(grammarAccess.getProcessAccess().getLeftSquareBracketKeyword_7_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Process__Group_7_1__07806); 
             after(grammarAccess.getProcessAccess().getLeftSquareBracketKeyword_7_1_0()); 

            }

            pushFollow(FOLLOW_rule__Process__Group_7_1__1_in_rule__Process__Group_7_1__07816);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3937:1: rule__Process__Group_7_1__1 : ( ( rule__Process__Group_7_1_1__0 )* ) rule__Process__Group_7_1__2 ;
    public final void rule__Process__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3941:1: ( ( ( rule__Process__Group_7_1_1__0 )* ) rule__Process__Group_7_1__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3942:1: ( ( rule__Process__Group_7_1_1__0 )* ) rule__Process__Group_7_1__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3942:1: ( ( rule__Process__Group_7_1_1__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3943:1: ( rule__Process__Group_7_1_1__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_7_1_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3944:1: ( rule__Process__Group_7_1_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_STRING||(LA51_0>=21 && LA51_0<=22)||LA51_0==29||LA51_0==41||LA51_0==44||(LA51_0>=47 && LA51_0<=48)||LA51_0==50||LA51_0==53) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3944:2: rule__Process__Group_7_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Process__Group_7_1_1__0_in_rule__Process__Group_7_1__17844);
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

            pushFollow(FOLLOW_rule__Process__Group_7_1__2_in_rule__Process__Group_7_1__17854);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3955:1: rule__Process__Group_7_1__2 : ( ']' ) ;
    public final void rule__Process__Group_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3959:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3960:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3960:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3961:1: ']'
            {
             before(grammarAccess.getProcessAccess().getRightSquareBracketKeyword_7_1_2()); 
            match(input,26,FOLLOW_26_in_rule__Process__Group_7_1__27883); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3980:1: rule__Process__Group_7_1_1__0 : ( ( rule__Process__ProcessElementsAssignment_7_1_1_0 ) ) rule__Process__Group_7_1_1__1 ;
    public final void rule__Process__Group_7_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3984:1: ( ( ( rule__Process__ProcessElementsAssignment_7_1_1_0 ) ) rule__Process__Group_7_1_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3985:1: ( ( rule__Process__ProcessElementsAssignment_7_1_1_0 ) ) rule__Process__Group_7_1_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3985:1: ( ( rule__Process__ProcessElementsAssignment_7_1_1_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3986:1: ( rule__Process__ProcessElementsAssignment_7_1_1_0 )
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_7_1_1_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3987:1: ( rule__Process__ProcessElementsAssignment_7_1_1_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3987:2: rule__Process__ProcessElementsAssignment_7_1_1_0
            {
            pushFollow(FOLLOW_rule__Process__ProcessElementsAssignment_7_1_1_0_in_rule__Process__Group_7_1_1__07924);
            rule__Process__ProcessElementsAssignment_7_1_1_0();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_7_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__Process__Group_7_1_1__1_in_rule__Process__Group_7_1_1__07933);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3998:1: rule__Process__Group_7_1_1__1 : ( ';' ) ;
    public final void rule__Process__Group_7_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4002:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4003:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4003:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4004:1: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_7_1_1_1()); 
            match(input,13,FOLLOW_13_in_rule__Process__Group_7_1_1__17962); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4021:1: rule__FormElement__Group__0 : ( ( rule__FormElement__DescriptionAssignment_0 )? ) rule__FormElement__Group__1 ;
    public final void rule__FormElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4025:1: ( ( ( rule__FormElement__DescriptionAssignment_0 )? ) rule__FormElement__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4026:1: ( ( rule__FormElement__DescriptionAssignment_0 )? ) rule__FormElement__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4026:1: ( ( rule__FormElement__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4027:1: ( rule__FormElement__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getFormElementAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4028:1: ( rule__FormElement__DescriptionAssignment_0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_STRING) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4028:2: rule__FormElement__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FormElement__DescriptionAssignment_0_in_rule__FormElement__Group__08001);
                    rule__FormElement__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormElementAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__1_in_rule__FormElement__Group__08011);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4039:1: rule__FormElement__Group__1 : ( 'element' ) rule__FormElement__Group__2 ;
    public final void rule__FormElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4043:1: ( ( 'element' ) rule__FormElement__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4044:1: ( 'element' ) rule__FormElement__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4044:1: ( 'element' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4045:1: 'element'
            {
             before(grammarAccess.getFormElementAccess().getElementKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__FormElement__Group__18040); 
             after(grammarAccess.getFormElementAccess().getElementKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__2_in_rule__FormElement__Group__18050);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4059:1: rule__FormElement__Group__2 : ( ( rule__FormElement__ReferencesAssignment_2 ) ) rule__FormElement__Group__3 ;
    public final void rule__FormElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4063:1: ( ( ( rule__FormElement__ReferencesAssignment_2 ) ) rule__FormElement__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4064:1: ( ( rule__FormElement__ReferencesAssignment_2 ) ) rule__FormElement__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4064:1: ( ( rule__FormElement__ReferencesAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4065:1: ( rule__FormElement__ReferencesAssignment_2 )
            {
             before(grammarAccess.getFormElementAccess().getReferencesAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4066:1: ( rule__FormElement__ReferencesAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4066:2: rule__FormElement__ReferencesAssignment_2
            {
            pushFollow(FOLLOW_rule__FormElement__ReferencesAssignment_2_in_rule__FormElement__Group__28078);
            rule__FormElement__ReferencesAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFormElementAccess().getReferencesAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__3_in_rule__FormElement__Group__28087);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4077:1: rule__FormElement__Group__3 : ( ( rule__FormElement__Group_3__0 )? ) rule__FormElement__Group__4 ;
    public final void rule__FormElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4081:1: ( ( ( rule__FormElement__Group_3__0 )? ) rule__FormElement__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4082:1: ( ( rule__FormElement__Group_3__0 )? ) rule__FormElement__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4082:1: ( ( rule__FormElement__Group_3__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4083:1: ( rule__FormElement__Group_3__0 )?
            {
             before(grammarAccess.getFormElementAccess().getGroup_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4084:1: ( rule__FormElement__Group_3__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==34) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4084:2: rule__FormElement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FormElement__Group_3__0_in_rule__FormElement__Group__38115);
                    rule__FormElement__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormElementAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__4_in_rule__FormElement__Group__38125);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4095:1: rule__FormElement__Group__4 : ( ( rule__FormElement__Group_4__0 )? ) rule__FormElement__Group__5 ;
    public final void rule__FormElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4099:1: ( ( ( rule__FormElement__Group_4__0 )? ) rule__FormElement__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4100:1: ( ( rule__FormElement__Group_4__0 )? ) rule__FormElement__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4100:1: ( ( rule__FormElement__Group_4__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4101:1: ( rule__FormElement__Group_4__0 )?
            {
             before(grammarAccess.getFormElementAccess().getGroup_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4102:1: ( rule__FormElement__Group_4__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==31) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4102:2: rule__FormElement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__FormElement__Group_4__0_in_rule__FormElement__Group__48153);
                    rule__FormElement__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormElementAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__5_in_rule__FormElement__Group__48163);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4113:1: rule__FormElement__Group__5 : ( ';' ) ;
    public final void rule__FormElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4117:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4118:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4118:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4119:1: ';'
            {
             before(grammarAccess.getFormElementAccess().getSemicolonKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__FormElement__Group__58192); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4144:1: rule__FormElement__Group_3__0 : ( 'label' ) rule__FormElement__Group_3__1 ;
    public final void rule__FormElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4148:1: ( ( 'label' ) rule__FormElement__Group_3__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4149:1: ( 'label' ) rule__FormElement__Group_3__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4149:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4150:1: 'label'
            {
             before(grammarAccess.getFormElementAccess().getLabelKeyword_3_0()); 
            match(input,34,FOLLOW_34_in_rule__FormElement__Group_3__08240); 
             after(grammarAccess.getFormElementAccess().getLabelKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group_3__1_in_rule__FormElement__Group_3__08250);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4164:1: rule__FormElement__Group_3__1 : ( ( rule__FormElement__LabelAssignment_3_1 ) ) ;
    public final void rule__FormElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4168:1: ( ( ( rule__FormElement__LabelAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4169:1: ( ( rule__FormElement__LabelAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4169:1: ( ( rule__FormElement__LabelAssignment_3_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4170:1: ( rule__FormElement__LabelAssignment_3_1 )
            {
             before(grammarAccess.getFormElementAccess().getLabelAssignment_3_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4171:1: ( rule__FormElement__LabelAssignment_3_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4171:2: rule__FormElement__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__FormElement__LabelAssignment_3_1_in_rule__FormElement__Group_3__18278);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4185:1: rule__FormElement__Group_4__0 : ( 'readonly' ) rule__FormElement__Group_4__1 ;
    public final void rule__FormElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4189:1: ( ( 'readonly' ) rule__FormElement__Group_4__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4190:1: ( 'readonly' ) rule__FormElement__Group_4__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4190:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4191:1: 'readonly'
            {
             before(grammarAccess.getFormElementAccess().getReadonlyKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__FormElement__Group_4__08317); 
             after(grammarAccess.getFormElementAccess().getReadonlyKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group_4__1_in_rule__FormElement__Group_4__08327);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4205:1: rule__FormElement__Group_4__1 : ( ( rule__FormElement__Alternatives_4_1 ) ) ;
    public final void rule__FormElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4209:1: ( ( ( rule__FormElement__Alternatives_4_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4210:1: ( ( rule__FormElement__Alternatives_4_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4210:1: ( ( rule__FormElement__Alternatives_4_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4211:1: ( rule__FormElement__Alternatives_4_1 )
            {
             before(grammarAccess.getFormElementAccess().getAlternatives_4_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4212:1: ( rule__FormElement__Alternatives_4_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4212:2: rule__FormElement__Alternatives_4_1
            {
            pushFollow(FOLLOW_rule__FormElement__Alternatives_4_1_in_rule__FormElement__Group_4__18355);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4226:1: rule__ActionDialogueCall__Group__0 : ( ( rule__ActionDialogueCall__ContextExpAssignment_0 )? ) rule__ActionDialogueCall__Group__1 ;
    public final void rule__ActionDialogueCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4230:1: ( ( ( rule__ActionDialogueCall__ContextExpAssignment_0 )? ) rule__ActionDialogueCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4231:1: ( ( rule__ActionDialogueCall__ContextExpAssignment_0 )? ) rule__ActionDialogueCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4231:1: ( ( rule__ActionDialogueCall__ContextExpAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4232:1: ( rule__ActionDialogueCall__ContextExpAssignment_0 )?
            {
             before(grammarAccess.getActionDialogueCallAccess().getContextExpAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4233:1: ( rule__ActionDialogueCall__ContextExpAssignment_0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=21 && LA55_0<=22)||(LA55_0>=47 && LA55_0<=48)||LA55_0==50||LA55_0==53) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4233:2: rule__ActionDialogueCall__ContextExpAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ActionDialogueCall__ContextExpAssignment_0_in_rule__ActionDialogueCall__Group__08393);
                    rule__ActionDialogueCall__ContextExpAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionDialogueCallAccess().getContextExpAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ActionDialogueCall__Group__1_in_rule__ActionDialogueCall__Group__08403);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4244:1: rule__ActionDialogueCall__Group__1 : ( 'form' ) rule__ActionDialogueCall__Group__2 ;
    public final void rule__ActionDialogueCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4248:1: ( ( 'form' ) rule__ActionDialogueCall__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4249:1: ( 'form' ) rule__ActionDialogueCall__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4249:1: ( 'form' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4250:1: 'form'
            {
             before(grammarAccess.getActionDialogueCallAccess().getFormKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__ActionDialogueCall__Group__18432); 
             after(grammarAccess.getActionDialogueCallAccess().getFormKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ActionDialogueCall__Group__2_in_rule__ActionDialogueCall__Group__18442);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4264:1: rule__ActionDialogueCall__Group__2 : ( ( rule__ActionDialogueCall__NameAssignment_2 ) ) ;
    public final void rule__ActionDialogueCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4268:1: ( ( ( rule__ActionDialogueCall__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4269:1: ( ( rule__ActionDialogueCall__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4269:1: ( ( rule__ActionDialogueCall__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4270:1: ( rule__ActionDialogueCall__NameAssignment_2 )
            {
             before(grammarAccess.getActionDialogueCallAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4271:1: ( rule__ActionDialogueCall__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4271:2: rule__ActionDialogueCall__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ActionDialogueCall__NameAssignment_2_in_rule__ActionDialogueCall__Group__28470);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4287:1: rule__DialogueCall__Group__0 : ( ( rule__DialogueCall__Group_0__0 )? ) rule__DialogueCall__Group__1 ;
    public final void rule__DialogueCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4291:1: ( ( ( rule__DialogueCall__Group_0__0 )? ) rule__DialogueCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4292:1: ( ( rule__DialogueCall__Group_0__0 )? ) rule__DialogueCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4292:1: ( ( rule__DialogueCall__Group_0__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4293:1: ( rule__DialogueCall__Group_0__0 )?
            {
             before(grammarAccess.getDialogueCallAccess().getGroup_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4294:1: ( rule__DialogueCall__Group_0__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_STRING) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4294:2: rule__DialogueCall__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__DialogueCall__Group_0__0_in_rule__DialogueCall__Group__08510);
                    rule__DialogueCall__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDialogueCallAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group__1_in_rule__DialogueCall__Group__08520);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4305:1: rule__DialogueCall__Group__1 : ( ( rule__DialogueCall__Group_1__0 )? ) rule__DialogueCall__Group__2 ;
    public final void rule__DialogueCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4309:1: ( ( ( rule__DialogueCall__Group_1__0 )? ) rule__DialogueCall__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4310:1: ( ( rule__DialogueCall__Group_1__0 )? ) rule__DialogueCall__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4310:1: ( ( rule__DialogueCall__Group_1__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4311:1: ( rule__DialogueCall__Group_1__0 )?
            {
             before(grammarAccess.getDialogueCallAccess().getGroup_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4312:1: ( rule__DialogueCall__Group_1__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==44) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4312:2: rule__DialogueCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DialogueCall__Group_1__0_in_rule__DialogueCall__Group__18548);
                    rule__DialogueCall__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDialogueCallAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group__2_in_rule__DialogueCall__Group__18558);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4323:1: rule__DialogueCall__Group__2 : ( ( rule__DialogueCall__ContextExpAssignment_2 )? ) rule__DialogueCall__Group__3 ;
    public final void rule__DialogueCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4327:1: ( ( ( rule__DialogueCall__ContextExpAssignment_2 )? ) rule__DialogueCall__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4328:1: ( ( rule__DialogueCall__ContextExpAssignment_2 )? ) rule__DialogueCall__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4328:1: ( ( rule__DialogueCall__ContextExpAssignment_2 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4329:1: ( rule__DialogueCall__ContextExpAssignment_2 )?
            {
             before(grammarAccess.getDialogueCallAccess().getContextExpAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4330:1: ( rule__DialogueCall__ContextExpAssignment_2 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=21 && LA58_0<=22)||(LA58_0>=47 && LA58_0<=48)||LA58_0==50||LA58_0==53) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4330:2: rule__DialogueCall__ContextExpAssignment_2
                    {
                    pushFollow(FOLLOW_rule__DialogueCall__ContextExpAssignment_2_in_rule__DialogueCall__Group__28586);
                    rule__DialogueCall__ContextExpAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDialogueCallAccess().getContextExpAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group__3_in_rule__DialogueCall__Group__28596);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4341:1: rule__DialogueCall__Group__3 : ( 'form' ) rule__DialogueCall__Group__4 ;
    public final void rule__DialogueCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4345:1: ( ( 'form' ) rule__DialogueCall__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4346:1: ( 'form' ) rule__DialogueCall__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4346:1: ( 'form' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4347:1: 'form'
            {
             before(grammarAccess.getDialogueCallAccess().getFormKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__DialogueCall__Group__38625); 
             after(grammarAccess.getDialogueCallAccess().getFormKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group__4_in_rule__DialogueCall__Group__38635);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4361:1: rule__DialogueCall__Group__4 : ( ( rule__DialogueCall__NameAssignment_4 ) ) ;
    public final void rule__DialogueCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4365:1: ( ( ( rule__DialogueCall__NameAssignment_4 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4366:1: ( ( rule__DialogueCall__NameAssignment_4 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4366:1: ( ( rule__DialogueCall__NameAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4367:1: ( rule__DialogueCall__NameAssignment_4 )
            {
             before(grammarAccess.getDialogueCallAccess().getNameAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4368:1: ( rule__DialogueCall__NameAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4368:2: rule__DialogueCall__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__DialogueCall__NameAssignment_4_in_rule__DialogueCall__Group__48663);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4388:1: rule__DialogueCall__Group_0__0 : ( ( rule__DialogueCall__LabelAssignment_0_0 ) ) rule__DialogueCall__Group_0__1 ;
    public final void rule__DialogueCall__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4392:1: ( ( ( rule__DialogueCall__LabelAssignment_0_0 ) ) rule__DialogueCall__Group_0__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4393:1: ( ( rule__DialogueCall__LabelAssignment_0_0 ) ) rule__DialogueCall__Group_0__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4393:1: ( ( rule__DialogueCall__LabelAssignment_0_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4394:1: ( rule__DialogueCall__LabelAssignment_0_0 )
            {
             before(grammarAccess.getDialogueCallAccess().getLabelAssignment_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4395:1: ( rule__DialogueCall__LabelAssignment_0_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4395:2: rule__DialogueCall__LabelAssignment_0_0
            {
            pushFollow(FOLLOW_rule__DialogueCall__LabelAssignment_0_0_in_rule__DialogueCall__Group_0__08707);
            rule__DialogueCall__LabelAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getDialogueCallAccess().getLabelAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group_0__1_in_rule__DialogueCall__Group_0__08716);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4406:1: rule__DialogueCall__Group_0__1 : ( ':' ) ;
    public final void rule__DialogueCall__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4410:1: ( ( ':' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4411:1: ( ':' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4411:1: ( ':' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4412:1: ':'
            {
             before(grammarAccess.getDialogueCallAccess().getColonKeyword_0_1()); 
            match(input,43,FOLLOW_43_in_rule__DialogueCall__Group_0__18745); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4429:1: rule__DialogueCall__Group_1__0 : ( 'if' ) rule__DialogueCall__Group_1__1 ;
    public final void rule__DialogueCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4433:1: ( ( 'if' ) rule__DialogueCall__Group_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4434:1: ( 'if' ) rule__DialogueCall__Group_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4434:1: ( 'if' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4435:1: 'if'
            {
             before(grammarAccess.getDialogueCallAccess().getIfKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__DialogueCall__Group_1__08785); 
             after(grammarAccess.getDialogueCallAccess().getIfKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group_1__1_in_rule__DialogueCall__Group_1__08795);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4449:1: rule__DialogueCall__Group_1__1 : ( '(' ) rule__DialogueCall__Group_1__2 ;
    public final void rule__DialogueCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4453:1: ( ( '(' ) rule__DialogueCall__Group_1__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4454:1: ( '(' ) rule__DialogueCall__Group_1__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4454:1: ( '(' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4455:1: '('
            {
             before(grammarAccess.getDialogueCallAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,45,FOLLOW_45_in_rule__DialogueCall__Group_1__18824); 
             after(grammarAccess.getDialogueCallAccess().getLeftParenthesisKeyword_1_1()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group_1__2_in_rule__DialogueCall__Group_1__18834);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4469:1: rule__DialogueCall__Group_1__2 : ( ( rule__DialogueCall__ConditionAssignment_1_2 ) ) rule__DialogueCall__Group_1__3 ;
    public final void rule__DialogueCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4473:1: ( ( ( rule__DialogueCall__ConditionAssignment_1_2 ) ) rule__DialogueCall__Group_1__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4474:1: ( ( rule__DialogueCall__ConditionAssignment_1_2 ) ) rule__DialogueCall__Group_1__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4474:1: ( ( rule__DialogueCall__ConditionAssignment_1_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4475:1: ( rule__DialogueCall__ConditionAssignment_1_2 )
            {
             before(grammarAccess.getDialogueCallAccess().getConditionAssignment_1_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4476:1: ( rule__DialogueCall__ConditionAssignment_1_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4476:2: rule__DialogueCall__ConditionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__DialogueCall__ConditionAssignment_1_2_in_rule__DialogueCall__Group_1__28862);
            rule__DialogueCall__ConditionAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getDialogueCallAccess().getConditionAssignment_1_2()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group_1__3_in_rule__DialogueCall__Group_1__28871);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4487:1: rule__DialogueCall__Group_1__3 : ( ')' ) ;
    public final void rule__DialogueCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4491:1: ( ( ')' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4492:1: ( ')' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4492:1: ( ')' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4493:1: ')'
            {
             before(grammarAccess.getDialogueCallAccess().getRightParenthesisKeyword_1_3()); 
            match(input,46,FOLLOW_46_in_rule__DialogueCall__Group_1__38900); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4514:1: rule__ProcessCall__Group__0 : ( ( rule__ProcessCall__Group_0__0 )? ) rule__ProcessCall__Group__1 ;
    public final void rule__ProcessCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4518:1: ( ( ( rule__ProcessCall__Group_0__0 )? ) rule__ProcessCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4519:1: ( ( rule__ProcessCall__Group_0__0 )? ) rule__ProcessCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4519:1: ( ( rule__ProcessCall__Group_0__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4520:1: ( rule__ProcessCall__Group_0__0 )?
            {
             before(grammarAccess.getProcessCallAccess().getGroup_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4521:1: ( rule__ProcessCall__Group_0__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_STRING) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4521:2: rule__ProcessCall__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ProcessCall__Group_0__0_in_rule__ProcessCall__Group__08943);
                    rule__ProcessCall__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessCallAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__1_in_rule__ProcessCall__Group__08953);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4532:1: rule__ProcessCall__Group__1 : ( ( rule__ProcessCall__Group_1__0 )? ) rule__ProcessCall__Group__2 ;
    public final void rule__ProcessCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4536:1: ( ( ( rule__ProcessCall__Group_1__0 )? ) rule__ProcessCall__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4537:1: ( ( rule__ProcessCall__Group_1__0 )? ) rule__ProcessCall__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4537:1: ( ( rule__ProcessCall__Group_1__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4538:1: ( rule__ProcessCall__Group_1__0 )?
            {
             before(grammarAccess.getProcessCallAccess().getGroup_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4539:1: ( rule__ProcessCall__Group_1__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==44) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4539:2: rule__ProcessCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ProcessCall__Group_1__0_in_rule__ProcessCall__Group__18981);
                    rule__ProcessCall__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessCallAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__2_in_rule__ProcessCall__Group__18991);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4550:1: rule__ProcessCall__Group__2 : ( ( rule__ProcessCall__ContextExpAssignment_2 )? ) rule__ProcessCall__Group__3 ;
    public final void rule__ProcessCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4554:1: ( ( ( rule__ProcessCall__ContextExpAssignment_2 )? ) rule__ProcessCall__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4555:1: ( ( rule__ProcessCall__ContextExpAssignment_2 )? ) rule__ProcessCall__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4555:1: ( ( rule__ProcessCall__ContextExpAssignment_2 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4556:1: ( rule__ProcessCall__ContextExpAssignment_2 )?
            {
             before(grammarAccess.getProcessCallAccess().getContextExpAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4557:1: ( rule__ProcessCall__ContextExpAssignment_2 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=21 && LA61_0<=22)||(LA61_0>=47 && LA61_0<=48)||LA61_0==50||LA61_0==53) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4557:2: rule__ProcessCall__ContextExpAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ProcessCall__ContextExpAssignment_2_in_rule__ProcessCall__Group__29019);
                    rule__ProcessCall__ContextExpAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessCallAccess().getContextExpAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__3_in_rule__ProcessCall__Group__29029);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4568:1: rule__ProcessCall__Group__3 : ( 'process' ) rule__ProcessCall__Group__4 ;
    public final void rule__ProcessCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4572:1: ( ( 'process' ) rule__ProcessCall__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4573:1: ( 'process' ) rule__ProcessCall__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4573:1: ( 'process' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4574:1: 'process'
            {
             before(grammarAccess.getProcessCallAccess().getProcessKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__ProcessCall__Group__39058); 
             after(grammarAccess.getProcessCallAccess().getProcessKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__4_in_rule__ProcessCall__Group__39068);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4588:1: rule__ProcessCall__Group__4 : ( ( rule__ProcessCall__NameAssignment_4 ) ) rule__ProcessCall__Group__5 ;
    public final void rule__ProcessCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4592:1: ( ( ( rule__ProcessCall__NameAssignment_4 ) ) rule__ProcessCall__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4593:1: ( ( rule__ProcessCall__NameAssignment_4 ) ) rule__ProcessCall__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4593:1: ( ( rule__ProcessCall__NameAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4594:1: ( rule__ProcessCall__NameAssignment_4 )
            {
             before(grammarAccess.getProcessCallAccess().getNameAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4595:1: ( rule__ProcessCall__NameAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4595:2: rule__ProcessCall__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__ProcessCall__NameAssignment_4_in_rule__ProcessCall__Group__49096);
            rule__ProcessCall__NameAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getProcessCallAccess().getNameAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__5_in_rule__ProcessCall__Group__49105);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4606:1: rule__ProcessCall__Group__5 : ( ( rule__ProcessCall__Group_5__0 )? ) ;
    public final void rule__ProcessCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4610:1: ( ( ( rule__ProcessCall__Group_5__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4611:1: ( ( rule__ProcessCall__Group_5__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4611:1: ( ( rule__ProcessCall__Group_5__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4612:1: ( rule__ProcessCall__Group_5__0 )?
            {
             before(grammarAccess.getProcessCallAccess().getGroup_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4613:1: ( rule__ProcessCall__Group_5__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==34) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4613:2: rule__ProcessCall__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ProcessCall__Group_5__0_in_rule__ProcessCall__Group__59133);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4635:1: rule__ProcessCall__Group_0__0 : ( ( rule__ProcessCall__LabelAssignment_0_0 ) ) rule__ProcessCall__Group_0__1 ;
    public final void rule__ProcessCall__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4639:1: ( ( ( rule__ProcessCall__LabelAssignment_0_0 ) ) rule__ProcessCall__Group_0__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4640:1: ( ( rule__ProcessCall__LabelAssignment_0_0 ) ) rule__ProcessCall__Group_0__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4640:1: ( ( rule__ProcessCall__LabelAssignment_0_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4641:1: ( rule__ProcessCall__LabelAssignment_0_0 )
            {
             before(grammarAccess.getProcessCallAccess().getLabelAssignment_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4642:1: ( rule__ProcessCall__LabelAssignment_0_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4642:2: rule__ProcessCall__LabelAssignment_0_0
            {
            pushFollow(FOLLOW_rule__ProcessCall__LabelAssignment_0_0_in_rule__ProcessCall__Group_0__09180);
            rule__ProcessCall__LabelAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getProcessCallAccess().getLabelAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_0__1_in_rule__ProcessCall__Group_0__09189);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4653:1: rule__ProcessCall__Group_0__1 : ( ':' ) ;
    public final void rule__ProcessCall__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4657:1: ( ( ':' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4658:1: ( ':' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4658:1: ( ':' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4659:1: ':'
            {
             before(grammarAccess.getProcessCallAccess().getColonKeyword_0_1()); 
            match(input,43,FOLLOW_43_in_rule__ProcessCall__Group_0__19218); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4676:1: rule__ProcessCall__Group_1__0 : ( 'if' ) rule__ProcessCall__Group_1__1 ;
    public final void rule__ProcessCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4680:1: ( ( 'if' ) rule__ProcessCall__Group_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4681:1: ( 'if' ) rule__ProcessCall__Group_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4681:1: ( 'if' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4682:1: 'if'
            {
             before(grammarAccess.getProcessCallAccess().getIfKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__ProcessCall__Group_1__09258); 
             after(grammarAccess.getProcessCallAccess().getIfKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_1__1_in_rule__ProcessCall__Group_1__09268);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4696:1: rule__ProcessCall__Group_1__1 : ( '(' ) rule__ProcessCall__Group_1__2 ;
    public final void rule__ProcessCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4700:1: ( ( '(' ) rule__ProcessCall__Group_1__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4701:1: ( '(' ) rule__ProcessCall__Group_1__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4701:1: ( '(' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4702:1: '('
            {
             before(grammarAccess.getProcessCallAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,45,FOLLOW_45_in_rule__ProcessCall__Group_1__19297); 
             after(grammarAccess.getProcessCallAccess().getLeftParenthesisKeyword_1_1()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_1__2_in_rule__ProcessCall__Group_1__19307);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4716:1: rule__ProcessCall__Group_1__2 : ( ( rule__ProcessCall__ConditionAssignment_1_2 ) ) rule__ProcessCall__Group_1__3 ;
    public final void rule__ProcessCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4720:1: ( ( ( rule__ProcessCall__ConditionAssignment_1_2 ) ) rule__ProcessCall__Group_1__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4721:1: ( ( rule__ProcessCall__ConditionAssignment_1_2 ) ) rule__ProcessCall__Group_1__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4721:1: ( ( rule__ProcessCall__ConditionAssignment_1_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4722:1: ( rule__ProcessCall__ConditionAssignment_1_2 )
            {
             before(grammarAccess.getProcessCallAccess().getConditionAssignment_1_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4723:1: ( rule__ProcessCall__ConditionAssignment_1_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4723:2: rule__ProcessCall__ConditionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ProcessCall__ConditionAssignment_1_2_in_rule__ProcessCall__Group_1__29335);
            rule__ProcessCall__ConditionAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getProcessCallAccess().getConditionAssignment_1_2()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_1__3_in_rule__ProcessCall__Group_1__29344);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4734:1: rule__ProcessCall__Group_1__3 : ( ')' ) ;
    public final void rule__ProcessCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4738:1: ( ( ')' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4739:1: ( ')' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4739:1: ( ')' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4740:1: ')'
            {
             before(grammarAccess.getProcessCallAccess().getRightParenthesisKeyword_1_3()); 
            match(input,46,FOLLOW_46_in_rule__ProcessCall__Group_1__39373); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4761:1: rule__ProcessCall__Group_5__0 : ( 'label' ) rule__ProcessCall__Group_5__1 ;
    public final void rule__ProcessCall__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4765:1: ( ( 'label' ) rule__ProcessCall__Group_5__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4766:1: ( 'label' ) rule__ProcessCall__Group_5__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4766:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4767:1: 'label'
            {
             before(grammarAccess.getProcessCallAccess().getLabelKeyword_5_0()); 
            match(input,34,FOLLOW_34_in_rule__ProcessCall__Group_5__09417); 
             after(grammarAccess.getProcessCallAccess().getLabelKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_5__1_in_rule__ProcessCall__Group_5__09427);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4781:1: rule__ProcessCall__Group_5__1 : ( ( rule__ProcessCall__LabelAssignment_5_1 ) ) ;
    public final void rule__ProcessCall__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4785:1: ( ( ( rule__ProcessCall__LabelAssignment_5_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4786:1: ( ( rule__ProcessCall__LabelAssignment_5_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4786:1: ( ( rule__ProcessCall__LabelAssignment_5_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4787:1: ( rule__ProcessCall__LabelAssignment_5_1 )
            {
             before(grammarAccess.getProcessCallAccess().getLabelAssignment_5_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4788:1: ( rule__ProcessCall__LabelAssignment_5_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4788:2: rule__ProcessCall__LabelAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ProcessCall__LabelAssignment_5_1_in_rule__ProcessCall__Group_5__19455);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4802:1: rule__OperationExpression__Group__0 : ( 'call' ) rule__OperationExpression__Group__1 ;
    public final void rule__OperationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4806:1: ( ( 'call' ) rule__OperationExpression__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4807:1: ( 'call' ) rule__OperationExpression__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4807:1: ( 'call' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4808:1: 'call'
            {
             before(grammarAccess.getOperationExpressionAccess().getCallKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__OperationExpression__Group__09494); 
             after(grammarAccess.getOperationExpressionAccess().getCallKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__OperationExpression__Group__1_in_rule__OperationExpression__Group__09504);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4822:1: rule__OperationExpression__Group__1 : ( ( rule__OperationExpression__NameAssignment_1 ) ) ;
    public final void rule__OperationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4826:1: ( ( ( rule__OperationExpression__NameAssignment_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4827:1: ( ( rule__OperationExpression__NameAssignment_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4827:1: ( ( rule__OperationExpression__NameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4828:1: ( rule__OperationExpression__NameAssignment_1 )
            {
             before(grammarAccess.getOperationExpressionAccess().getNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4829:1: ( rule__OperationExpression__NameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4829:2: rule__OperationExpression__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OperationExpression__NameAssignment_1_in_rule__OperationExpression__Group__19532);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4843:1: rule__SimpleProcessCall__Group__0 : ( ( rule__SimpleProcessCall__NameAssignment_0 ) ) rule__SimpleProcessCall__Group__1 ;
    public final void rule__SimpleProcessCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4847:1: ( ( ( rule__SimpleProcessCall__NameAssignment_0 ) ) rule__SimpleProcessCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4848:1: ( ( rule__SimpleProcessCall__NameAssignment_0 ) ) rule__SimpleProcessCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4848:1: ( ( rule__SimpleProcessCall__NameAssignment_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4849:1: ( rule__SimpleProcessCall__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleProcessCallAccess().getNameAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4850:1: ( rule__SimpleProcessCall__NameAssignment_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4850:2: rule__SimpleProcessCall__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleProcessCall__NameAssignment_0_in_rule__SimpleProcessCall__Group__09570);
            rule__SimpleProcessCall__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSimpleProcessCallAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleProcessCall__Group__1_in_rule__SimpleProcessCall__Group__09579);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4861:1: rule__SimpleProcessCall__Group__1 : ( ( rule__SimpleProcessCall__Group_1__0 )? ) ;
    public final void rule__SimpleProcessCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4865:1: ( ( ( rule__SimpleProcessCall__Group_1__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4866:1: ( ( rule__SimpleProcessCall__Group_1__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4866:1: ( ( rule__SimpleProcessCall__Group_1__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4867:1: ( rule__SimpleProcessCall__Group_1__0 )?
            {
             before(grammarAccess.getSimpleProcessCallAccess().getGroup_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4868:1: ( rule__SimpleProcessCall__Group_1__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==34) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4868:2: rule__SimpleProcessCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SimpleProcessCall__Group_1__0_in_rule__SimpleProcessCall__Group__19607);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4882:1: rule__SimpleProcessCall__Group_1__0 : ( 'label' ) rule__SimpleProcessCall__Group_1__1 ;
    public final void rule__SimpleProcessCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4886:1: ( ( 'label' ) rule__SimpleProcessCall__Group_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4887:1: ( 'label' ) rule__SimpleProcessCall__Group_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4887:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4888:1: 'label'
            {
             before(grammarAccess.getSimpleProcessCallAccess().getLabelKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__SimpleProcessCall__Group_1__09647); 
             after(grammarAccess.getSimpleProcessCallAccess().getLabelKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleProcessCall__Group_1__1_in_rule__SimpleProcessCall__Group_1__09657);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4902:1: rule__SimpleProcessCall__Group_1__1 : ( ( rule__SimpleProcessCall__LabelAssignment_1_1 ) ) ;
    public final void rule__SimpleProcessCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4906:1: ( ( ( rule__SimpleProcessCall__LabelAssignment_1_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4907:1: ( ( rule__SimpleProcessCall__LabelAssignment_1_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4907:1: ( ( rule__SimpleProcessCall__LabelAssignment_1_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4908:1: ( rule__SimpleProcessCall__LabelAssignment_1_1 )
            {
             before(grammarAccess.getSimpleProcessCallAccess().getLabelAssignment_1_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4909:1: ( rule__SimpleProcessCall__LabelAssignment_1_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4909:2: rule__SimpleProcessCall__LabelAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SimpleProcessCall__LabelAssignment_1_1_in_rule__SimpleProcessCall__Group_1__19685);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4923:1: rule__ServiceExpression__Group__0 : ( 'service' ) rule__ServiceExpression__Group__1 ;
    public final void rule__ServiceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4927:1: ( ( 'service' ) rule__ServiceExpression__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4928:1: ( 'service' ) rule__ServiceExpression__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4928:1: ( 'service' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4929:1: 'service'
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__ServiceExpression__Group__09724); 
             after(grammarAccess.getServiceExpressionAccess().getServiceKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ServiceExpression__Group__1_in_rule__ServiceExpression__Group__09734);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4943:1: rule__ServiceExpression__Group__1 : ( ( rule__ServiceExpression__ServiceNameAssignment_1 ) ) rule__ServiceExpression__Group__2 ;
    public final void rule__ServiceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4947:1: ( ( ( rule__ServiceExpression__ServiceNameAssignment_1 ) ) rule__ServiceExpression__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4948:1: ( ( rule__ServiceExpression__ServiceNameAssignment_1 ) ) rule__ServiceExpression__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4948:1: ( ( rule__ServiceExpression__ServiceNameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4949:1: ( rule__ServiceExpression__ServiceNameAssignment_1 )
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4950:1: ( rule__ServiceExpression__ServiceNameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4950:2: rule__ServiceExpression__ServiceNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ServiceExpression__ServiceNameAssignment_1_in_rule__ServiceExpression__Group__19762);
            rule__ServiceExpression__ServiceNameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getServiceExpressionAccess().getServiceNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ServiceExpression__Group__2_in_rule__ServiceExpression__Group__19771);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4961:1: rule__ServiceExpression__Group__2 : ( '.' ) rule__ServiceExpression__Group__3 ;
    public final void rule__ServiceExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4965:1: ( ( '.' ) rule__ServiceExpression__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4966:1: ( '.' ) rule__ServiceExpression__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4966:1: ( '.' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4967:1: '.'
            {
             before(grammarAccess.getServiceExpressionAccess().getFullStopKeyword_2()); 
            match(input,49,FOLLOW_49_in_rule__ServiceExpression__Group__29800); 
             after(grammarAccess.getServiceExpressionAccess().getFullStopKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__ServiceExpression__Group__3_in_rule__ServiceExpression__Group__29810);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4981:1: rule__ServiceExpression__Group__3 : ( ( rule__ServiceExpression__ServiceMethodAssignment_3 ) ) ;
    public final void rule__ServiceExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4985:1: ( ( ( rule__ServiceExpression__ServiceMethodAssignment_3 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4986:1: ( ( rule__ServiceExpression__ServiceMethodAssignment_3 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4986:1: ( ( rule__ServiceExpression__ServiceMethodAssignment_3 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4987:1: ( rule__ServiceExpression__ServiceMethodAssignment_3 )
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceMethodAssignment_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4988:1: ( rule__ServiceExpression__ServiceMethodAssignment_3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4988:2: rule__ServiceExpression__ServiceMethodAssignment_3
            {
            pushFollow(FOLLOW_rule__ServiceExpression__ServiceMethodAssignment_3_in_rule__ServiceExpression__Group__39838);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5006:1: rule__NavigationExpression__Group__0 : ( ( rule__NavigationExpression__CompositionAssignment_0 )? ) rule__NavigationExpression__Group__1 ;
    public final void rule__NavigationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5010:1: ( ( ( rule__NavigationExpression__CompositionAssignment_0 )? ) rule__NavigationExpression__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5011:1: ( ( rule__NavigationExpression__CompositionAssignment_0 )? ) rule__NavigationExpression__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5011:1: ( ( rule__NavigationExpression__CompositionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5012:1: ( rule__NavigationExpression__CompositionAssignment_0 )?
            {
             before(grammarAccess.getNavigationExpressionAccess().getCompositionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5013:1: ( rule__NavigationExpression__CompositionAssignment_0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==53) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5013:2: rule__NavigationExpression__CompositionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__NavigationExpression__CompositionAssignment_0_in_rule__NavigationExpression__Group__09880);
                    rule__NavigationExpression__CompositionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNavigationExpressionAccess().getCompositionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__NavigationExpression__Group__1_in_rule__NavigationExpression__Group__09890);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5024:1: rule__NavigationExpression__Group__1 : ( 'navigate' ) rule__NavigationExpression__Group__2 ;
    public final void rule__NavigationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5028:1: ( ( 'navigate' ) rule__NavigationExpression__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5029:1: ( 'navigate' ) rule__NavigationExpression__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5029:1: ( 'navigate' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5030:1: 'navigate'
            {
             before(grammarAccess.getNavigationExpressionAccess().getNavigateKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__NavigationExpression__Group__19919); 
             after(grammarAccess.getNavigationExpressionAccess().getNavigateKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__NavigationExpression__Group__2_in_rule__NavigationExpression__Group__19929);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5044:1: rule__NavigationExpression__Group__2 : ( ( rule__NavigationExpression__ReferencesAssignment_2 ) ) ;
    public final void rule__NavigationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5048:1: ( ( ( rule__NavigationExpression__ReferencesAssignment_2 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5049:1: ( ( rule__NavigationExpression__ReferencesAssignment_2 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5049:1: ( ( rule__NavigationExpression__ReferencesAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5050:1: ( rule__NavigationExpression__ReferencesAssignment_2 )
            {
             before(grammarAccess.getNavigationExpressionAccess().getReferencesAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5051:1: ( rule__NavigationExpression__ReferencesAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5051:2: rule__NavigationExpression__ReferencesAssignment_2
            {
            pushFollow(FOLLOW_rule__NavigationExpression__ReferencesAssignment_2_in_rule__NavigationExpression__Group__29957);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5067:1: rule__PresentationModel__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__PresentationModel__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5071:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5072:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5072:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5073:1: RULE_STRING
            {
             before(grammarAccess.getPresentationModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PresentationModel__DescriptionAssignment_09997); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5082:1: rule__PresentationModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PresentationModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5086:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5087:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5087:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5088:1: RULE_ID
            {
             before(grammarAccess.getPresentationModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PresentationModel__NameAssignment_210028); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5097:1: rule__PresentationModel__ExternalReferencesAssignment_4 : ( ruleExternalReference ) ;
    public final void rule__PresentationModel__ExternalReferencesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5101:1: ( ( ruleExternalReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5102:1: ( ruleExternalReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5102:1: ( ruleExternalReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5103:1: ruleExternalReference
            {
             before(grammarAccess.getPresentationModelAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExternalReference_in_rule__PresentationModel__ExternalReferencesAssignment_410059);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5112:1: rule__PresentationModel__StartAssignment_5 : ( ruleApplication ) ;
    public final void rule__PresentationModel__StartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5116:1: ( ( ruleApplication ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5117:1: ( ruleApplication )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5117:1: ( ruleApplication )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5118:1: ruleApplication
            {
             before(grammarAccess.getPresentationModelAccess().getStartApplicationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__PresentationModel__StartAssignment_510090);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5127:1: rule__PresentationModel__ElementsAssignment_6 : ( ruleModelElementWithContext ) ;
    public final void rule__PresentationModel__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5131:1: ( ( ruleModelElementWithContext ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5132:1: ( ruleModelElementWithContext )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5132:1: ( ruleModelElementWithContext )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5133:1: ruleModelElementWithContext
            {
             before(grammarAccess.getPresentationModelAccess().getElementsModelElementWithContextParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleModelElementWithContext_in_rule__PresentationModel__ElementsAssignment_610121);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5142:1: rule__Application__StartProcessesAssignment_2_0 : ( ruleSimpleProcessCall ) ;
    public final void rule__Application__StartProcessesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5146:1: ( ( ruleSimpleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5147:1: ( ruleSimpleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5147:1: ( ruleSimpleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5148:1: ruleSimpleProcessCall
            {
             before(grammarAccess.getApplicationAccess().getStartProcessesSimpleProcessCallParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleSimpleProcessCall_in_rule__Application__StartProcessesAssignment_2_010152);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5157:1: rule__ExternalReference__ModelNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExternalReference__ModelNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5161:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5162:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5162:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5163:1: RULE_ID
            {
             before(grammarAccess.getExternalReferenceAccess().getModelNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalReference__ModelNameAssignment_110183); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5172:1: rule__ExternalReference__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ExternalReference__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5176:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5177:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5177:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5178:1: RULE_ID
            {
             before(grammarAccess.getExternalReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalReference__NameAssignment_310214); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5187:1: rule__ContentForm__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ContentForm__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5191:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5192:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5192:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5193:1: RULE_STRING
            {
             before(grammarAccess.getContentFormAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ContentForm__DescriptionAssignment_010245); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5202:1: rule__ContentForm__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ContentForm__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5206:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5207:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5207:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5208:1: RULE_ID
            {
             before(grammarAccess.getContentFormAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContentForm__NameAssignment_210276); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5217:1: rule__ContentForm__CollectionContextAssignment_4 : ( ( 'list' ) ) ;
    public final void rule__ContentForm__CollectionContextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5221:1: ( ( ( 'list' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5222:1: ( ( 'list' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5222:1: ( ( 'list' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5223:1: ( 'list' )
            {
             before(grammarAccess.getContentFormAccess().getCollectionContextListKeyword_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5224:1: ( 'list' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5225:1: 'list'
            {
             before(grammarAccess.getContentFormAccess().getCollectionContextListKeyword_4_0()); 
            match(input,51,FOLLOW_51_in_rule__ContentForm__CollectionContextAssignment_410312); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5240:1: rule__ContentForm__ContextRefAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ContentForm__ContextRefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5244:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5245:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5245:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5246:1: ( RULE_ID )
            {
             before(grammarAccess.getContentFormAccess().getContextRefExternalReferenceCrossReference_5_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5247:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5248:1: RULE_ID
            {
             before(grammarAccess.getContentFormAccess().getContextRefExternalReferenceIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContentForm__ContextRefAssignment_510355); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5259:1: rule__ContentForm__ReadonlyAssignment_7_1_0 : ( ( 'true' ) ) ;
    public final void rule__ContentForm__ReadonlyAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5263:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5264:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5264:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5265:1: ( 'true' )
            {
             before(grammarAccess.getContentFormAccess().getReadonlyTrueKeyword_7_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5266:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5267:1: 'true'
            {
             before(grammarAccess.getContentFormAccess().getReadonlyTrueKeyword_7_1_0_0()); 
            match(input,52,FOLLOW_52_in_rule__ContentForm__ReadonlyAssignment_7_1_010395); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5282:1: rule__ContentForm__FormElementsAssignment_8 : ( ruleFormElement ) ;
    public final void rule__ContentForm__FormElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5286:1: ( ( ruleFormElement ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5287:1: ( ruleFormElement )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5287:1: ( ruleFormElement )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5288:1: ruleFormElement
            {
             before(grammarAccess.getContentFormAccess().getFormElementsFormElementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleFormElement_in_rule__ContentForm__FormElementsAssignment_810434);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5297:1: rule__ContentForm__ActionsAssignment_9_2_0 : ( ruleAction ) ;
    public final void rule__ContentForm__ActionsAssignment_9_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5301:1: ( ( ruleAction ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5302:1: ( ruleAction )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5302:1: ( ruleAction )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5303:1: ruleAction
            {
             before(grammarAccess.getContentFormAccess().getActionsActionParserRuleCall_9_2_0_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__ContentForm__ActionsAssignment_9_2_010465);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5312:1: rule__ContentForm__ProcessesAssignment_10_2_0 : ( ruleSimpleProcessCall ) ;
    public final void rule__ContentForm__ProcessesAssignment_10_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5316:1: ( ( ruleSimpleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5317:1: ( ruleSimpleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5317:1: ( ruleSimpleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5318:1: ruleSimpleProcessCall
            {
             before(grammarAccess.getContentFormAccess().getProcessesSimpleProcessCallParserRuleCall_10_2_0_0()); 
            pushFollow(FOLLOW_ruleSimpleProcessCall_in_rule__ContentForm__ProcessesAssignment_10_2_010496);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5327:1: rule__Action__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Action__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5331:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5332:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5332:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5333:1: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Action__DescriptionAssignment_010527); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5342:1: rule__Action__TypeAssignment_1 : ( ruleProcessType ) ;
    public final void rule__Action__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5346:1: ( ( ruleProcessType ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5347:1: ( ruleProcessType )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5347:1: ( ruleProcessType )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5348:1: ruleProcessType
            {
             before(grammarAccess.getActionAccess().getTypeProcessTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProcessType_in_rule__Action__TypeAssignment_110558);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5357:1: rule__Action__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5361:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5362:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5362:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5363:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__NameAssignment_210589); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5372:1: rule__Action__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Action__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5376:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5377:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5377:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5378:1: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Action__LabelAssignment_3_110620); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5387:1: rule__Action__ProcessElementsAssignment_4 : ( ruleActionDialogueCall ) ;
    public final void rule__Action__ProcessElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5391:1: ( ( ruleActionDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5392:1: ( ruleActionDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5392:1: ( ruleActionDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5393:1: ruleActionDialogueCall
            {
             before(grammarAccess.getActionAccess().getProcessElementsActionDialogueCallParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleActionDialogueCall_in_rule__Action__ProcessElementsAssignment_410651);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5402:1: rule__CompoundDialogue__DescriptionAssignment_0_0 : ( RULE_STRING ) ;
    public final void rule__CompoundDialogue__DescriptionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5406:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5407:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5407:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5408:1: RULE_STRING
            {
             before(grammarAccess.getCompoundDialogueAccess().getDescriptionSTRINGTerminalRuleCall_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CompoundDialogue__DescriptionAssignment_0_010682); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5417:1: rule__CompoundDialogue__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__CompoundDialogue__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5421:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5422:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5422:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5423:1: RULE_ID
            {
             before(grammarAccess.getCompoundDialogueAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CompoundDialogue__NameAssignment_0_210713); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5432:1: rule__CompoundDialogue__ContextRefAssignment_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__CompoundDialogue__ContextRefAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5436:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5437:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5437:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5438:1: ( RULE_ID )
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextRefExternalReferenceCrossReference_0_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5439:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5440:1: RULE_ID
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextRefExternalReferenceIDTerminalRuleCall_0_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CompoundDialogue__ContextRefAssignment_0_410748); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5451:1: rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 : ( ( 'true' ) ) ;
    public final void rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5455:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5456:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5456:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5457:1: ( 'true' )
            {
             before(grammarAccess.getCompoundDialogueAccess().getReadonlyTrueKeyword_0_5_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5458:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5459:1: 'true'
            {
             before(grammarAccess.getCompoundDialogueAccess().getReadonlyTrueKeyword_0_5_1_0_0()); 
            match(input,52,FOLLOW_52_in_rule__CompoundDialogue__ReadonlyAssignment_0_5_1_010788); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5474:1: rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 : ( ruleDialogueCall ) ;
    public final void rule__CompoundDialogue__DialoguesAssignment_0_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5478:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5479:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5479:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5480:1: ruleDialogueCall
            {
             before(grammarAccess.getCompoundDialogueAccess().getDialoguesDialogueCallParserRuleCall_0_6_2_0_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__CompoundDialogue__DialoguesAssignment_0_6_2_010827);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5489:1: rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 : ( ruleProcessCall ) ;
    public final void rule__CompoundDialogue__ProcessesAssignment_0_7_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5493:1: ( ( ruleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5494:1: ( ruleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5494:1: ( ruleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5495:1: ruleProcessCall
            {
             before(grammarAccess.getCompoundDialogueAccess().getProcessesProcessCallParserRuleCall_0_7_2_0_0()); 
            pushFollow(FOLLOW_ruleProcessCall_in_rule__CompoundDialogue__ProcessesAssignment_0_7_2_010858);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5504:1: rule__CollectionDialogue__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__CollectionDialogue__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5508:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5509:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5509:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5510:1: RULE_STRING
            {
             before(grammarAccess.getCollectionDialogueAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CollectionDialogue__DescriptionAssignment_010889); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5519:1: rule__CollectionDialogue__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CollectionDialogue__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5523:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5524:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5524:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5525:1: RULE_ID
            {
             before(grammarAccess.getCollectionDialogueAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CollectionDialogue__NameAssignment_210920); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5534:1: rule__CollectionDialogue__ContextRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__CollectionDialogue__ContextRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5538:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5539:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5539:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5540:1: ( RULE_ID )
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextRefExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5541:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5542:1: RULE_ID
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CollectionDialogue__ContextRefAssignment_410955); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5553:1: rule__CollectionDialogue__ReadonlyAssignment_6_1_0 : ( ( 'true' ) ) ;
    public final void rule__CollectionDialogue__ReadonlyAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5557:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5558:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5558:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5559:1: ( 'true' )
            {
             before(grammarAccess.getCollectionDialogueAccess().getReadonlyTrueKeyword_6_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5560:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5561:1: 'true'
            {
             before(grammarAccess.getCollectionDialogueAccess().getReadonlyTrueKeyword_6_1_0_0()); 
            match(input,52,FOLLOW_52_in_rule__CollectionDialogue__ReadonlyAssignment_6_1_010995); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5576:1: rule__CollectionDialogue__DialoguesAssignment_7_2_0 : ( ruleDialogueCall ) ;
    public final void rule__CollectionDialogue__DialoguesAssignment_7_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5580:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5581:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5581:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5582:1: ruleDialogueCall
            {
             before(grammarAccess.getCollectionDialogueAccess().getDialoguesDialogueCallParserRuleCall_7_2_0_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__CollectionDialogue__DialoguesAssignment_7_2_011034);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5591:1: rule__CollectionDialogue__ProcessesAssignment_8_2_0 : ( ruleProcessCall ) ;
    public final void rule__CollectionDialogue__ProcessesAssignment_8_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5595:1: ( ( ruleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5596:1: ( ruleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5596:1: ( ruleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5597:1: ruleProcessCall
            {
             before(grammarAccess.getCollectionDialogueAccess().getProcessesProcessCallParserRuleCall_8_2_0_0()); 
            pushFollow(FOLLOW_ruleProcessCall_in_rule__CollectionDialogue__ProcessesAssignment_8_2_011065);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5606:1: rule__MasterDetail__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MasterDetail__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5610:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5611:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5611:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5612:1: RULE_STRING
            {
             before(grammarAccess.getMasterDetailAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MasterDetail__DescriptionAssignment_011096); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5621:1: rule__MasterDetail__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MasterDetail__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5625:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5626:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5626:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5627:1: RULE_ID
            {
             before(grammarAccess.getMasterDetailAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MasterDetail__NameAssignment_211127); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5636:1: rule__MasterDetail__ContextRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__MasterDetail__ContextRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5640:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5641:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5641:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5642:1: ( RULE_ID )
            {
             before(grammarAccess.getMasterDetailAccess().getContextRefExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5643:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5644:1: RULE_ID
            {
             before(grammarAccess.getMasterDetailAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MasterDetail__ContextRefAssignment_411162); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5655:1: rule__MasterDetail__ReadonlyAssignment_5_1_0 : ( ( 'true' ) ) ;
    public final void rule__MasterDetail__ReadonlyAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5659:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5660:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5660:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5661:1: ( 'true' )
            {
             before(grammarAccess.getMasterDetailAccess().getReadonlyTrueKeyword_5_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5662:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5663:1: 'true'
            {
             before(grammarAccess.getMasterDetailAccess().getReadonlyTrueKeyword_5_1_0_0()); 
            match(input,52,FOLLOW_52_in_rule__MasterDetail__ReadonlyAssignment_5_1_011202); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5678:1: rule__MasterDetail__MasterAssignment_7 : ( ruleDialogueCall ) ;
    public final void rule__MasterDetail__MasterAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5682:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5683:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5683:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5684:1: ruleDialogueCall
            {
             before(grammarAccess.getMasterDetailAccess().getMasterDialogueCallParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__MasterDetail__MasterAssignment_711241);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5693:1: rule__MasterDetail__DetailAssignment_10 : ( ruleDialogueCall ) ;
    public final void rule__MasterDetail__DetailAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5697:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5698:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5698:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5699:1: ruleDialogueCall
            {
             before(grammarAccess.getMasterDetailAccess().getDetailDialogueCallParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__MasterDetail__DetailAssignment_1011272);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5708:1: rule__MasterDetail__ProcessesAssignment_12_2_0 : ( ruleProcessCall ) ;
    public final void rule__MasterDetail__ProcessesAssignment_12_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5712:1: ( ( ruleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5713:1: ( ruleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5713:1: ( ruleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5714:1: ruleProcessCall
            {
             before(grammarAccess.getMasterDetailAccess().getProcessesProcessCallParserRuleCall_12_2_0_0()); 
            pushFollow(FOLLOW_ruleProcessCall_in_rule__MasterDetail__ProcessesAssignment_12_2_011303);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5723:1: rule__Process__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Process__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5727:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5728:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5728:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5729:1: RULE_STRING
            {
             before(grammarAccess.getProcessAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Process__DescriptionAssignment_011334); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5738:1: rule__Process__TypeAssignment_2_0 : ( ruleProcessType ) ;
    public final void rule__Process__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5742:1: ( ( ruleProcessType ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5743:1: ( ruleProcessType )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5743:1: ( ruleProcessType )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5744:1: ruleProcessType
            {
             before(grammarAccess.getProcessAccess().getTypeProcessTypeEnumRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleProcessType_in_rule__Process__TypeAssignment_2_011365);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5753:1: rule__Process__TypeAssignment_2_1_0 : ( ruleProcessTypeLink ) ;
    public final void rule__Process__TypeAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5757:1: ( ( ruleProcessTypeLink ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5758:1: ( ruleProcessTypeLink )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5758:1: ( ruleProcessTypeLink )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5759:1: ruleProcessTypeLink
            {
             before(grammarAccess.getProcessAccess().getTypeProcessTypeLinkEnumRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleProcessTypeLink_in_rule__Process__TypeAssignment_2_1_011396);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5768:1: rule__Process__LinkAssignment_2_1_1 : ( ruleAssociationRoleReference ) ;
    public final void rule__Process__LinkAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5772:1: ( ( ruleAssociationRoleReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5773:1: ( ruleAssociationRoleReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5773:1: ( ruleAssociationRoleReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5774:1: ruleAssociationRoleReference
            {
             before(grammarAccess.getProcessAccess().getLinkAssociationRoleReferenceParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_rule__Process__LinkAssignment_2_1_111427);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5783:1: rule__Process__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5787:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5788:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5788:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5789:1: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Process__NameAssignment_311458); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5798:1: rule__Process__CollectionContextAssignment_5 : ( ( 'list' ) ) ;
    public final void rule__Process__CollectionContextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5802:1: ( ( ( 'list' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5803:1: ( ( 'list' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5803:1: ( ( 'list' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5804:1: ( 'list' )
            {
             before(grammarAccess.getProcessAccess().getCollectionContextListKeyword_5_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5805:1: ( 'list' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5806:1: 'list'
            {
             before(grammarAccess.getProcessAccess().getCollectionContextListKeyword_5_0()); 
            match(input,51,FOLLOW_51_in_rule__Process__CollectionContextAssignment_511494); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5821:1: rule__Process__ContextRefAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Process__ContextRefAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5825:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5826:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5826:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5827:1: ( RULE_ID )
            {
             before(grammarAccess.getProcessAccess().getContextRefExternalReferenceCrossReference_6_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5828:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5829:1: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getContextRefExternalReferenceIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Process__ContextRefAssignment_611537); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5840:1: rule__Process__ProcessElementsAssignment_7_1_1_0 : ( ruleUICall ) ;
    public final void rule__Process__ProcessElementsAssignment_7_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5844:1: ( ( ruleUICall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5845:1: ( ruleUICall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5845:1: ( ruleUICall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5846:1: ruleUICall
            {
             before(grammarAccess.getProcessAccess().getProcessElementsUICallParserRuleCall_7_1_1_0_0()); 
            pushFollow(FOLLOW_ruleUICall_in_rule__Process__ProcessElementsAssignment_7_1_1_011572);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5855:1: rule__FormElement__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__FormElement__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5859:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5860:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5860:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5861:1: RULE_STRING
            {
             before(grammarAccess.getFormElementAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FormElement__DescriptionAssignment_011603); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5870:1: rule__FormElement__ReferencesAssignment_2 : ( ruleDtoPropertyReference ) ;
    public final void rule__FormElement__ReferencesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5874:1: ( ( ruleDtoPropertyReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5875:1: ( ruleDtoPropertyReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5875:1: ( ruleDtoPropertyReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5876:1: ruleDtoPropertyReference
            {
             before(grammarAccess.getFormElementAccess().getReferencesDtoPropertyReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_rule__FormElement__ReferencesAssignment_211634);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5885:1: rule__FormElement__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__FormElement__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5889:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5890:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5890:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5891:1: RULE_STRING
            {
             before(grammarAccess.getFormElementAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FormElement__LabelAssignment_3_111665); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5900:1: rule__FormElement__ReadonlyAssignment_4_1_0 : ( ( 'true' ) ) ;
    public final void rule__FormElement__ReadonlyAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5904:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5905:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5905:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5906:1: ( 'true' )
            {
             before(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_4_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5907:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5908:1: 'true'
            {
             before(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_4_1_0_0()); 
            match(input,52,FOLLOW_52_in_rule__FormElement__ReadonlyAssignment_4_1_011701); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5923:1: rule__ActionDialogueCall__ContextExpAssignment_0 : ( ruleExpression ) ;
    public final void rule__ActionDialogueCall__ContextExpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5927:1: ( ( ruleExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5928:1: ( ruleExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5928:1: ( ruleExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5929:1: ruleExpression
            {
             before(grammarAccess.getActionDialogueCallAccess().getContextExpExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ActionDialogueCall__ContextExpAssignment_011740);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5938:1: rule__ActionDialogueCall__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ActionDialogueCall__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5942:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5943:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5943:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5944:1: RULE_ID
            {
             before(grammarAccess.getActionDialogueCallAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionDialogueCall__NameAssignment_211771); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5953:1: rule__DialogueCall__LabelAssignment_0_0 : ( RULE_STRING ) ;
    public final void rule__DialogueCall__LabelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5957:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5958:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5958:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5959:1: RULE_STRING
            {
             before(grammarAccess.getDialogueCallAccess().getLabelSTRINGTerminalRuleCall_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DialogueCall__LabelAssignment_0_011802); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5968:1: rule__DialogueCall__ConditionAssignment_1_2 : ( ruleOperationExpression ) ;
    public final void rule__DialogueCall__ConditionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5972:1: ( ( ruleOperationExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5973:1: ( ruleOperationExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5973:1: ( ruleOperationExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5974:1: ruleOperationExpression
            {
             before(grammarAccess.getDialogueCallAccess().getConditionOperationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleOperationExpression_in_rule__DialogueCall__ConditionAssignment_1_211833);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5983:1: rule__DialogueCall__ContextExpAssignment_2 : ( ruleExpression ) ;
    public final void rule__DialogueCall__ContextExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5987:1: ( ( ruleExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5988:1: ( ruleExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5988:1: ( ruleExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5989:1: ruleExpression
            {
             before(grammarAccess.getDialogueCallAccess().getContextExpExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__DialogueCall__ContextExpAssignment_211864);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5998:1: rule__DialogueCall__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__DialogueCall__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6002:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6003:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6003:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6004:1: RULE_ID
            {
             before(grammarAccess.getDialogueCallAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DialogueCall__NameAssignment_411895); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6013:1: rule__ProcessCall__LabelAssignment_0_0 : ( RULE_STRING ) ;
    public final void rule__ProcessCall__LabelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6017:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6018:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6018:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6019:1: RULE_STRING
            {
             before(grammarAccess.getProcessCallAccess().getLabelSTRINGTerminalRuleCall_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ProcessCall__LabelAssignment_0_011926); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6028:1: rule__ProcessCall__ConditionAssignment_1_2 : ( ruleOperationExpression ) ;
    public final void rule__ProcessCall__ConditionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6032:1: ( ( ruleOperationExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6033:1: ( ruleOperationExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6033:1: ( ruleOperationExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6034:1: ruleOperationExpression
            {
             before(grammarAccess.getProcessCallAccess().getConditionOperationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleOperationExpression_in_rule__ProcessCall__ConditionAssignment_1_211957);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6043:1: rule__ProcessCall__ContextExpAssignment_2 : ( ruleExpression ) ;
    public final void rule__ProcessCall__ContextExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6047:1: ( ( ruleExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6048:1: ( ruleExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6048:1: ( ruleExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6049:1: ruleExpression
            {
             before(grammarAccess.getProcessCallAccess().getContextExpExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ProcessCall__ContextExpAssignment_211988);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6058:1: rule__ProcessCall__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__ProcessCall__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6062:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6063:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6063:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6064:1: RULE_ID
            {
             before(grammarAccess.getProcessCallAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProcessCall__NameAssignment_412019); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6073:1: rule__ProcessCall__LabelAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__ProcessCall__LabelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6077:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6078:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6078:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6079:1: RULE_ID
            {
             before(grammarAccess.getProcessCallAccess().getLabelIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProcessCall__LabelAssignment_5_112050); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6088:1: rule__OperationExpression__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OperationExpression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6092:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6093:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6093:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6094:1: RULE_ID
            {
             before(grammarAccess.getOperationExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OperationExpression__NameAssignment_112081); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6103:1: rule__SimpleProcessCall__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleProcessCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6107:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6108:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6108:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6109:1: RULE_ID
            {
             before(grammarAccess.getSimpleProcessCallAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleProcessCall__NameAssignment_012112); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6118:1: rule__SimpleProcessCall__LabelAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__SimpleProcessCall__LabelAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6122:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6123:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6123:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6124:1: RULE_STRING
            {
             before(grammarAccess.getSimpleProcessCallAccess().getLabelSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleProcessCall__LabelAssignment_1_112143); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6133:1: rule__StandardExpression__TypeAssignment : ( ruleExpressionType ) ;
    public final void rule__StandardExpression__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6137:1: ( ( ruleExpressionType ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6138:1: ( ruleExpressionType )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6138:1: ( ruleExpressionType )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6139:1: ruleExpressionType
            {
             before(grammarAccess.getStandardExpressionAccess().getTypeExpressionTypeEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleExpressionType_in_rule__StandardExpression__TypeAssignment12174);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6148:1: rule__ServiceExpression__ServiceNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceExpression__ServiceNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6152:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6153:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6153:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6154:1: RULE_ID
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceExpression__ServiceNameAssignment_112205); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6163:1: rule__ServiceExpression__ServiceMethodAssignment_3 : ( RULE_ID ) ;
    public final void rule__ServiceExpression__ServiceMethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6167:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6168:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6168:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6169:1: RULE_ID
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceMethodIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceExpression__ServiceMethodAssignment_312236); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6178:1: rule__NavigationExpression__CompositionAssignment_0 : ( ( 'composite' ) ) ;
    public final void rule__NavigationExpression__CompositionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6182:1: ( ( ( 'composite' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6183:1: ( ( 'composite' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6183:1: ( ( 'composite' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6184:1: ( 'composite' )
            {
             before(grammarAccess.getNavigationExpressionAccess().getCompositionCompositeKeyword_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6185:1: ( 'composite' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6186:1: 'composite'
            {
             before(grammarAccess.getNavigationExpressionAccess().getCompositionCompositeKeyword_0_0()); 
            match(input,53,FOLLOW_53_in_rule__NavigationExpression__CompositionAssignment_012272); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6201:1: rule__NavigationExpression__ReferencesAssignment_2 : ( ruleAssociationRoleReference ) ;
    public final void rule__NavigationExpression__ReferencesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6205:1: ( ( ruleAssociationRoleReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6206:1: ( ruleAssociationRoleReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6206:1: ( ruleAssociationRoleReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6207:1: ruleAssociationRoleReference
            {
             before(grammarAccess.getNavigationExpressionAccess().getReferencesAssociationRoleReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_rule__NavigationExpression__ReferencesAssignment_212311);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6216:1: rule__DtoPropertyReference__NameAssignment : ( RULE_ID ) ;
    public final void rule__DtoPropertyReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6220:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6221:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6221:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6222:1: RULE_ID
            {
             before(grammarAccess.getDtoPropertyReferenceAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoPropertyReference__NameAssignment12342); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6231:1: rule__AssociationRoleReference__NameAssignment : ( RULE_ID ) ;
    public final void rule__AssociationRoleReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6235:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6236:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6236:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6237:1: RULE_ID
            {
             before(grammarAccess.getAssociationRoleReferenceAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssociationRoleReference__NameAssignment12373); 
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
    public static final BitSet FOLLOW_rule__UICall__Alternatives_in_ruleUICall1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessType__Alternatives_in_ruleProcessType1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProcessTypeLink1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionType__Alternatives_in_ruleExpressionType1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogue_in_rule__UIModelElement__Alternatives1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_rule__UIModelElement__Alternatives1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentForm_in_rule__Dialogue__Alternatives1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundDialogue_in_rule__Dialogue__Alternatives1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__ReadonlyAssignment_7_1_0_in_rule__ContentForm__Alternatives_7_11778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ContentForm__Alternatives_7_11797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__0_in_rule__CompoundDialogue__Alternatives1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionDialogue_in_rule__CompoundDialogue__Alternatives1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterDetail_in_rule__CompoundDialogue__Alternatives1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0_in_rule__CompoundDialogue__Alternatives_0_5_11898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CompoundDialogue__Alternatives_0_5_11917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__ReadonlyAssignment_6_1_0_in_rule__CollectionDialogue__Alternatives_6_11951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CollectionDialogue__Alternatives_6_11970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__ReadonlyAssignment_5_1_0_in_rule__MasterDetail__Alternatives_5_12004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MasterDetail__Alternatives_5_12023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__TypeAssignment_2_0_in_rule__Process__Alternatives_22057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_2_1__0_in_rule__Process__Alternatives_22075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Process__Alternatives_72109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_7_1__0_in_rule__Process__Alternatives_72128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__ReadonlyAssignment_4_1_0_in_rule__FormElement__Alternatives_4_12161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FormElement__Alternatives_4_12180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceExpression_in_rule__Expression__Alternatives2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_rule__Expression__Alternatives2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardExpression_in_rule__Expression__Alternatives2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_rule__Expression__Alternatives2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__UICall__Alternatives2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__UICall__Alternatives2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ProcessType__Alternatives2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ProcessType__Alternatives2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ProcessType__Alternatives2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ProcessType__Alternatives2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ProcessType__Alternatives2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ProcessType__Alternatives2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ProcessType__Alternatives2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ExpressionType__Alternatives2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ExpressionType__Alternatives2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__DescriptionAssignment_0_in_rule__PresentationModel__Group__02567 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__1_in_rule__PresentationModel__Group__02577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PresentationModel__Group__12606 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__2_in_rule__PresentationModel__Group__12616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__NameAssignment_2_in_rule__PresentationModel__Group__22644 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__3_in_rule__PresentationModel__Group__22653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PresentationModel__Group__32682 = new BitSet(new long[]{0x0000026829000012L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__4_in_rule__PresentationModel__Group__32692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__ExternalReferencesAssignment_4_in_rule__PresentationModel__Group__42720 = new BitSet(new long[]{0x0000026829000012L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__5_in_rule__PresentationModel__Group__42730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__StartAssignment_5_in_rule__PresentationModel__Group__52758 = new BitSet(new long[]{0x0000026820000012L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__6_in_rule__PresentationModel__Group__52768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__ElementsAssignment_6_in_rule__PresentationModel__Group__62796 = new BitSet(new long[]{0x0000026820000012L});
    public static final BitSet FOLLOW_24_in_rule__Application__Group__02846 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Application__Group__1_in_rule__Application__Group__02856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Application__Group__12885 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Application__Group__2_in_rule__Application__Group__12895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_2__0_in_rule__Application__Group__22925 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__Application__Group_2__0_in_rule__Application__Group__22937 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__Application__Group__3_in_rule__Application__Group__22949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Application__Group__32978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__StartProcessesAssignment_2_0_in_rule__Application__Group_2__03021 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Application__Group_2__1_in_rule__Application__Group_2__03030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Application__Group_2__13059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ExternalReference__Group__03099 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__1_in_rule__ExternalReference__Group__03109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__ModelNameAssignment_1_in_rule__ExternalReference__Group__13137 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__2_in_rule__ExternalReference__Group__13146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ExternalReference__Group__23175 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__3_in_rule__ExternalReference__Group__23185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__NameAssignment_3_in_rule__ExternalReference__Group__33213 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__4_in_rule__ExternalReference__Group__33222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ExternalReference__Group__43251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__DescriptionAssignment_0_in_rule__ContentForm__Group__03296 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__1_in_rule__ContentForm__Group__03306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ContentForm__Group__13335 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__2_in_rule__ContentForm__Group__13345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__NameAssignment_2_in_rule__ContentForm__Group__23373 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__3_in_rule__ContentForm__Group__23382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ContentForm__Group__33411 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__4_in_rule__ContentForm__Group__33421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__CollectionContextAssignment_4_in_rule__ContentForm__Group__43449 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__5_in_rule__ContentForm__Group__43459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__ContextRefAssignment_5_in_rule__ContentForm__Group__53487 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__6_in_rule__ContentForm__Group__53496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ContentForm__Group__63525 = new BitSet(new long[]{0x0000040384000010L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__7_in_rule__ContentForm__Group__63535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_7__0_in_rule__ContentForm__Group__73563 = new BitSet(new long[]{0x0000040304000010L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__8_in_rule__ContentForm__Group__73573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__FormElementsAssignment_8_in_rule__ContentForm__Group__83601 = new BitSet(new long[]{0x0000040304000010L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__9_in_rule__ContentForm__Group__83611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__0_in_rule__ContentForm__Group__93639 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__10_in_rule__ContentForm__Group__93649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__0_in_rule__ContentForm__Group__103677 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__11_in_rule__ContentForm__Group__103687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ContentForm__Group__113716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ContentForm__Group_7__03776 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_7__1_in_rule__ContentForm__Group_7__03786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Alternatives_7_1_in_rule__ContentForm__Group_7__13814 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_7__2_in_rule__ContentForm__Group_7__13823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ContentForm__Group_7__23852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ContentForm__Group_9__03894 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__1_in_rule__ContentForm__Group_9__03904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ContentForm__Group_9__13933 = new BitSet(new long[]{0x00000000041FC030L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__2_in_rule__ContentForm__Group_9__13943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9_2__0_in_rule__ContentForm__Group_9__23971 = new BitSet(new long[]{0x00000000041FC030L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__3_in_rule__ContentForm__Group_9__23981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ContentForm__Group_9__34010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__ActionsAssignment_9_2_0_in_rule__ContentForm__Group_9_2__04053 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9_2__1_in_rule__ContentForm__Group_9_2__04062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ContentForm__Group_9_2__14091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ContentForm__Group_10__04131 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__1_in_rule__ContentForm__Group_10__04141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ContentForm__Group_10__14170 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__2_in_rule__ContentForm__Group_10__14180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10_2__0_in_rule__ContentForm__Group_10__24208 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__3_in_rule__ContentForm__Group_10__24218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ContentForm__Group_10__34247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__ProcessesAssignment_10_2_0_in_rule__ContentForm__Group_10_2__04290 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10_2__1_in_rule__ContentForm__Group_10_2__04299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ContentForm__Group_10_2__14328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DescriptionAssignment_0_in_rule__Action__Group__04367 = new BitSet(new long[]{0x00000000001FC020L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__TypeAssignment_1_in_rule__Action__Group__14405 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_2_in_rule__Action__Group__24443 = new BitSet(new long[]{0x0025800420600002L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__24452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__34480 = new BitSet(new long[]{0x0025800020600002L});
    public static final BitSet FOLLOW_rule__Action__Group__4_in_rule__Action__Group__34490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__ProcessElementsAssignment_4_in_rule__Action__Group__44518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Action__Group_3__04564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__04574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__LabelAssignment_3_1_in_rule__Action__Group_3__14602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__DescriptionAssignment_0_0_in_rule__CompoundDialogue__Group_0__04640 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__1_in_rule__CompoundDialogue__Group_0__04650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CompoundDialogue__Group_0__14679 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__2_in_rule__CompoundDialogue__Group_0__14689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__NameAssignment_0_2_in_rule__CompoundDialogue__Group_0__24717 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__3_in_rule__CompoundDialogue__Group_0__24726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CompoundDialogue__Group_0__34755 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__4_in_rule__CompoundDialogue__Group_0__34765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__ContextRefAssignment_0_4_in_rule__CompoundDialogue__Group_0__44793 = new BitSet(new long[]{0x0000001280000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__5_in_rule__CompoundDialogue__Group_0__44802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_5__0_in_rule__CompoundDialogue__Group_0__54830 = new BitSet(new long[]{0x0000001200000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__6_in_rule__CompoundDialogue__Group_0__54840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__0_in_rule__CompoundDialogue__Group_0__64868 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__7_in_rule__CompoundDialogue__Group_0__64878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__0_in_rule__CompoundDialogue__Group_0__74906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CompoundDialogue__Group_0_5__04958 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_5__1_in_rule__CompoundDialogue__Group_0_5__04968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Alternatives_0_5_1_in_rule__CompoundDialogue__Group_0_5__14996 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_5__2_in_rule__CompoundDialogue__Group_0_5__15005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CompoundDialogue__Group_0_5__25034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__CompoundDialogue__Group_0_6__05076 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__1_in_rule__CompoundDialogue__Group_0_6__05086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CompoundDialogue__Group_0_6__15115 = new BitSet(new long[]{0x0025900024600010L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__2_in_rule__CompoundDialogue__Group_0_6__15125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6_2__0_in_rule__CompoundDialogue__Group_0_6__25153 = new BitSet(new long[]{0x0025900024600010L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__3_in_rule__CompoundDialogue__Group_0_6__25163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CompoundDialogue__Group_0_6__35192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__DialoguesAssignment_0_6_2_0_in_rule__CompoundDialogue__Group_0_6_2__05235 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6_2__1_in_rule__CompoundDialogue__Group_0_6_2__05244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CompoundDialogue__Group_0_6_2__15273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CompoundDialogue__Group_0_7__05313 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__1_in_rule__CompoundDialogue__Group_0_7__05323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CompoundDialogue__Group_0_7__15352 = new BitSet(new long[]{0x0025920004600010L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__2_in_rule__CompoundDialogue__Group_0_7__15362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7_2__0_in_rule__CompoundDialogue__Group_0_7__25390 = new BitSet(new long[]{0x0025920004600010L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__3_in_rule__CompoundDialogue__Group_0_7__25400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CompoundDialogue__Group_0_7__35429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__ProcessesAssignment_0_7_2_0_in_rule__CompoundDialogue__Group_0_7_2__05472 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7_2__1_in_rule__CompoundDialogue__Group_0_7_2__05481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CompoundDialogue__Group_0_7_2__15510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__DescriptionAssignment_0_in_rule__CollectionDialogue__Group__05549 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__1_in_rule__CollectionDialogue__Group__05559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__CollectionDialogue__Group__15588 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__2_in_rule__CollectionDialogue__Group__15598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__NameAssignment_2_in_rule__CollectionDialogue__Group__25626 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__3_in_rule__CollectionDialogue__Group__25635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CollectionDialogue__Group__35664 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__4_in_rule__CollectionDialogue__Group__35674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__ContextRefAssignment_4_in_rule__CollectionDialogue__Group__45702 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__5_in_rule__CollectionDialogue__Group__45711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CollectionDialogue__Group__55740 = new BitSet(new long[]{0x0000001284000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__6_in_rule__CollectionDialogue__Group__55750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_6__0_in_rule__CollectionDialogue__Group__65778 = new BitSet(new long[]{0x0000001204000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__7_in_rule__CollectionDialogue__Group__65788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__0_in_rule__CollectionDialogue__Group__75816 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__8_in_rule__CollectionDialogue__Group__75826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__0_in_rule__CollectionDialogue__Group__85854 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__9_in_rule__CollectionDialogue__Group__85864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CollectionDialogue__Group__95893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CollectionDialogue__Group_6__05949 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_6__1_in_rule__CollectionDialogue__Group_6__05959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Alternatives_6_1_in_rule__CollectionDialogue__Group_6__15987 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_6__2_in_rule__CollectionDialogue__Group_6__15996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CollectionDialogue__Group_6__26025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__CollectionDialogue__Group_7__06067 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__1_in_rule__CollectionDialogue__Group_7__06077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CollectionDialogue__Group_7__16106 = new BitSet(new long[]{0x0025900024600010L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__2_in_rule__CollectionDialogue__Group_7__16116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7_2__0_in_rule__CollectionDialogue__Group_7__26144 = new BitSet(new long[]{0x0025900024600010L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__3_in_rule__CollectionDialogue__Group_7__26154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CollectionDialogue__Group_7__36183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__DialoguesAssignment_7_2_0_in_rule__CollectionDialogue__Group_7_2__06226 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7_2__1_in_rule__CollectionDialogue__Group_7_2__06235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CollectionDialogue__Group_7_2__16264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CollectionDialogue__Group_8__06304 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__1_in_rule__CollectionDialogue__Group_8__06314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CollectionDialogue__Group_8__16343 = new BitSet(new long[]{0x0025920004600010L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__2_in_rule__CollectionDialogue__Group_8__16353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8_2__0_in_rule__CollectionDialogue__Group_8__26381 = new BitSet(new long[]{0x0025920004600010L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__3_in_rule__CollectionDialogue__Group_8__26391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CollectionDialogue__Group_8__36420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__ProcessesAssignment_8_2_0_in_rule__CollectionDialogue__Group_8_2__06463 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8_2__1_in_rule__CollectionDialogue__Group_8_2__06472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CollectionDialogue__Group_8_2__16501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__DescriptionAssignment_0_in_rule__MasterDetail__Group__06540 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__1_in_rule__MasterDetail__Group__06550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__MasterDetail__Group__16579 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__2_in_rule__MasterDetail__Group__16589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__NameAssignment_2_in_rule__MasterDetail__Group__26617 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__3_in_rule__MasterDetail__Group__26626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MasterDetail__Group__36655 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__4_in_rule__MasterDetail__Group__36665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__ContextRefAssignment_4_in_rule__MasterDetail__Group__46693 = new BitSet(new long[]{0x0000008080000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__5_in_rule__MasterDetail__Group__46702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_5__0_in_rule__MasterDetail__Group__56730 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__6_in_rule__MasterDetail__Group__56740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MasterDetail__Group__66769 = new BitSet(new long[]{0x0025900020600010L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__7_in_rule__MasterDetail__Group__66779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__MasterAssignment_7_in_rule__MasterDetail__Group__76807 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__8_in_rule__MasterDetail__Group__76816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MasterDetail__Group__86845 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__9_in_rule__MasterDetail__Group__86855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MasterDetail__Group__96884 = new BitSet(new long[]{0x0025900020600010L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__10_in_rule__MasterDetail__Group__96894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__DetailAssignment_10_in_rule__MasterDetail__Group__106922 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__11_in_rule__MasterDetail__Group__106931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MasterDetail__Group__116960 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__12_in_rule__MasterDetail__Group__116970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__0_in_rule__MasterDetail__Group__126998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MasterDetail__Group_5__07060 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_5__1_in_rule__MasterDetail__Group_5__07070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Alternatives_5_1_in_rule__MasterDetail__Group_5__17098 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_5__2_in_rule__MasterDetail__Group_5__17107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MasterDetail__Group_5__27136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MasterDetail__Group_12__07178 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__1_in_rule__MasterDetail__Group_12__07188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MasterDetail__Group_12__17217 = new BitSet(new long[]{0x0025920004600010L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__2_in_rule__MasterDetail__Group_12__17227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12_2__0_in_rule__MasterDetail__Group_12__27255 = new BitSet(new long[]{0x0025920004600010L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__3_in_rule__MasterDetail__Group_12__27265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MasterDetail__Group_12__37294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__ProcessesAssignment_12_2_0_in_rule__MasterDetail__Group_12_2__07337 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12_2__1_in_rule__MasterDetail__Group_12_2__07346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MasterDetail__Group_12_2__17375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__DescriptionAssignment_0_in_rule__Process__Group__07414 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Process__Group__1_in_rule__Process__Group__07424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Process__Group__17453 = new BitSet(new long[]{0x00000000001FC820L});
    public static final BitSet FOLLOW_rule__Process__Group__2_in_rule__Process__Group__17463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Alternatives_2_in_rule__Process__Group__27491 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Process__Group__3_in_rule__Process__Group__27501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__NameAssignment_3_in_rule__Process__Group__37529 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Process__Group__4_in_rule__Process__Group__37538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Process__Group__47567 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_rule__Process__Group__5_in_rule__Process__Group__47577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__CollectionContextAssignment_5_in_rule__Process__Group__57605 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Process__Group__6_in_rule__Process__Group__57615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__ContextRefAssignment_6_in_rule__Process__Group__67643 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_rule__Process__Group__7_in_rule__Process__Group__67652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Alternatives_7_in_rule__Process__Group__77680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__TypeAssignment_2_1_0_in_rule__Process__Group_2_1__07730 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Process__Group_2_1__1_in_rule__Process__Group_2_1__07739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__LinkAssignment_2_1_1_in_rule__Process__Group_2_1__17767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Process__Group_7_1__07806 = new BitSet(new long[]{0x0025920024600010L});
    public static final BitSet FOLLOW_rule__Process__Group_7_1__1_in_rule__Process__Group_7_1__07816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_7_1_1__0_in_rule__Process__Group_7_1__17844 = new BitSet(new long[]{0x0025920024600010L});
    public static final BitSet FOLLOW_rule__Process__Group_7_1__2_in_rule__Process__Group_7_1__17854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Process__Group_7_1__27883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__ProcessElementsAssignment_7_1_1_0_in_rule__Process__Group_7_1_1__07924 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Process__Group_7_1_1__1_in_rule__Process__Group_7_1_1__07933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Process__Group_7_1_1__17962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__DescriptionAssignment_0_in_rule__FormElement__Group__08001 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__1_in_rule__FormElement__Group__08011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__FormElement__Group__18040 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FormElement__Group__2_in_rule__FormElement__Group__18050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__ReferencesAssignment_2_in_rule__FormElement__Group__28078 = new BitSet(new long[]{0x0000000480002000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__3_in_rule__FormElement__Group__28087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group_3__0_in_rule__FormElement__Group__38115 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__4_in_rule__FormElement__Group__38125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group_4__0_in_rule__FormElement__Group__48153 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__5_in_rule__FormElement__Group__48163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__FormElement__Group__58192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FormElement__Group_3__08240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FormElement__Group_3__1_in_rule__FormElement__Group_3__08250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__LabelAssignment_3_1_in_rule__FormElement__Group_3__18278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FormElement__Group_4__08317 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_rule__FormElement__Group_4__1_in_rule__FormElement__Group_4__08327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Alternatives_4_1_in_rule__FormElement__Group_4__18355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionDialogueCall__ContextExpAssignment_0_in_rule__ActionDialogueCall__Group__08393 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ActionDialogueCall__Group__1_in_rule__ActionDialogueCall__Group__08403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ActionDialogueCall__Group__18432 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ActionDialogueCall__Group__2_in_rule__ActionDialogueCall__Group__18442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionDialogueCall__NameAssignment_2_in_rule__ActionDialogueCall__Group__28470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_0__0_in_rule__DialogueCall__Group__08510 = new BitSet(new long[]{0x0025900020600000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__1_in_rule__DialogueCall__Group__08520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_1__0_in_rule__DialogueCall__Group__18548 = new BitSet(new long[]{0x0025800020600000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__2_in_rule__DialogueCall__Group__18558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__ContextExpAssignment_2_in_rule__DialogueCall__Group__28586 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__3_in_rule__DialogueCall__Group__28596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DialogueCall__Group__38625 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__4_in_rule__DialogueCall__Group__38635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__NameAssignment_4_in_rule__DialogueCall__Group__48663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__LabelAssignment_0_0_in_rule__DialogueCall__Group_0__08707 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_0__1_in_rule__DialogueCall__Group_0__08716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__DialogueCall__Group_0__18745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__DialogueCall__Group_1__08785 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_1__1_in_rule__DialogueCall__Group_1__08795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__DialogueCall__Group_1__18824 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_1__2_in_rule__DialogueCall__Group_1__18834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__ConditionAssignment_1_2_in_rule__DialogueCall__Group_1__28862 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_1__3_in_rule__DialogueCall__Group_1__28871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__DialogueCall__Group_1__38900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_0__0_in_rule__ProcessCall__Group__08943 = new BitSet(new long[]{0x0025920000600000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__1_in_rule__ProcessCall__Group__08953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_1__0_in_rule__ProcessCall__Group__18981 = new BitSet(new long[]{0x0025820000600000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__2_in_rule__ProcessCall__Group__18991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__ContextExpAssignment_2_in_rule__ProcessCall__Group__29019 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__3_in_rule__ProcessCall__Group__29029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ProcessCall__Group__39058 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__4_in_rule__ProcessCall__Group__39068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__NameAssignment_4_in_rule__ProcessCall__Group__49096 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__5_in_rule__ProcessCall__Group__49105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_5__0_in_rule__ProcessCall__Group__59133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__LabelAssignment_0_0_in_rule__ProcessCall__Group_0__09180 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_0__1_in_rule__ProcessCall__Group_0__09189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ProcessCall__Group_0__19218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ProcessCall__Group_1__09258 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_1__1_in_rule__ProcessCall__Group_1__09268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ProcessCall__Group_1__19297 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_1__2_in_rule__ProcessCall__Group_1__19307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__ConditionAssignment_1_2_in_rule__ProcessCall__Group_1__29335 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_1__3_in_rule__ProcessCall__Group_1__29344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ProcessCall__Group_1__39373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ProcessCall__Group_5__09417 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_5__1_in_rule__ProcessCall__Group_5__09427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__LabelAssignment_5_1_in_rule__ProcessCall__Group_5__19455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__OperationExpression__Group__09494 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__OperationExpression__Group__1_in_rule__OperationExpression__Group__09504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationExpression__NameAssignment_1_in_rule__OperationExpression__Group__19532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__NameAssignment_0_in_rule__SimpleProcessCall__Group__09570 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__Group__1_in_rule__SimpleProcessCall__Group__09579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__Group_1__0_in_rule__SimpleProcessCall__Group__19607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SimpleProcessCall__Group_1__09647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__Group_1__1_in_rule__SimpleProcessCall__Group_1__09657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__LabelAssignment_1_1_in_rule__SimpleProcessCall__Group_1__19685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ServiceExpression__Group__09724 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ServiceExpression__Group__1_in_rule__ServiceExpression__Group__09734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceExpression__ServiceNameAssignment_1_in_rule__ServiceExpression__Group__19762 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__ServiceExpression__Group__2_in_rule__ServiceExpression__Group__19771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ServiceExpression__Group__29800 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ServiceExpression__Group__3_in_rule__ServiceExpression__Group__29810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceExpression__ServiceMethodAssignment_3_in_rule__ServiceExpression__Group__39838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NavigationExpression__CompositionAssignment_0_in_rule__NavigationExpression__Group__09880 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__NavigationExpression__Group__1_in_rule__NavigationExpression__Group__09890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__NavigationExpression__Group__19919 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NavigationExpression__Group__2_in_rule__NavigationExpression__Group__19929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NavigationExpression__ReferencesAssignment_2_in_rule__NavigationExpression__Group__29957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PresentationModel__DescriptionAssignment_09997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PresentationModel__NameAssignment_210028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_rule__PresentationModel__ExternalReferencesAssignment_410059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__PresentationModel__StartAssignment_510090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_rule__PresentationModel__ElementsAssignment_610121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProcessCall_in_rule__Application__StartProcessesAssignment_2_010152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalReference__ModelNameAssignment_110183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalReference__NameAssignment_310214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ContentForm__DescriptionAssignment_010245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContentForm__NameAssignment_210276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ContentForm__CollectionContextAssignment_410312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContentForm__ContextRefAssignment_510355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ContentForm__ReadonlyAssignment_7_1_010395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_rule__ContentForm__FormElementsAssignment_810434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__ContentForm__ActionsAssignment_9_2_010465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProcessCall_in_rule__ContentForm__ProcessesAssignment_10_2_010496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Action__DescriptionAssignment_010527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessType_in_rule__Action__TypeAssignment_110558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NameAssignment_210589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Action__LabelAssignment_3_110620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDialogueCall_in_rule__Action__ProcessElementsAssignment_410651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CompoundDialogue__DescriptionAssignment_0_010682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CompoundDialogue__NameAssignment_0_210713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CompoundDialogue__ContextRefAssignment_0_410748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__CompoundDialogue__ReadonlyAssignment_0_5_1_010788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__CompoundDialogue__DialoguesAssignment_0_6_2_010827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__CompoundDialogue__ProcessesAssignment_0_7_2_010858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CollectionDialogue__DescriptionAssignment_010889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CollectionDialogue__NameAssignment_210920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CollectionDialogue__ContextRefAssignment_410955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__CollectionDialogue__ReadonlyAssignment_6_1_010995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__CollectionDialogue__DialoguesAssignment_7_2_011034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__CollectionDialogue__ProcessesAssignment_8_2_011065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MasterDetail__DescriptionAssignment_011096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MasterDetail__NameAssignment_211127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MasterDetail__ContextRefAssignment_411162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__MasterDetail__ReadonlyAssignment_5_1_011202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__MasterDetail__MasterAssignment_711241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__MasterDetail__DetailAssignment_1011272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__MasterDetail__ProcessesAssignment_12_2_011303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Process__DescriptionAssignment_011334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessType_in_rule__Process__TypeAssignment_2_011365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessTypeLink_in_rule__Process__TypeAssignment_2_1_011396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_rule__Process__LinkAssignment_2_1_111427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Process__NameAssignment_311458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Process__CollectionContextAssignment_511494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Process__ContextRefAssignment_611537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUICall_in_rule__Process__ProcessElementsAssignment_7_1_1_011572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FormElement__DescriptionAssignment_011603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_rule__FormElement__ReferencesAssignment_211634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FormElement__LabelAssignment_3_111665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__FormElement__ReadonlyAssignment_4_1_011701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ActionDialogueCall__ContextExpAssignment_011740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionDialogueCall__NameAssignment_211771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DialogueCall__LabelAssignment_0_011802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_rule__DialogueCall__ConditionAssignment_1_211833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__DialogueCall__ContextExpAssignment_211864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DialogueCall__NameAssignment_411895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ProcessCall__LabelAssignment_0_011926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_rule__ProcessCall__ConditionAssignment_1_211957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ProcessCall__ContextExpAssignment_211988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProcessCall__NameAssignment_412019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProcessCall__LabelAssignment_5_112050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OperationExpression__NameAssignment_112081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleProcessCall__NameAssignment_012112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleProcessCall__LabelAssignment_1_112143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionType_in_rule__StandardExpression__TypeAssignment12174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceExpression__ServiceNameAssignment_112205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceExpression__ServiceMethodAssignment_312236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__NavigationExpression__CompositionAssignment_012272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_rule__NavigationExpression__ReferencesAssignment_212311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoPropertyReference__NameAssignment12342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationRoleReference__NameAssignment12373 = new BitSet(new long[]{0x0000000000000002L});

}