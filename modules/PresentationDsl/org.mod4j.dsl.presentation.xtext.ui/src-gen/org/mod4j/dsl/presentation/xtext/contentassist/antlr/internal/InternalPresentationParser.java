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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'link'", "'false'", "'new'", "'save'", "'edit'", "'delete'", "'cancel'", "'removefrom'", "'addto'", "'all'", "'find'", "'presentation'", "';'", "'application'", "'['", "']'", "'from'", "'import'", "'form'", "'context'", "'readonly'", "'actions'", "'processes'", "'label'", "'CompoundDialogue'", "'dialogues'", "'CollectionDialogue'", "'MasterDetail'", "'master'", "'detail'", "'process'", "'element'", "'dialogue'", "':'", "'if'", "'('", "')'", "'call'", "'service'", "'.'", "'navigate'", "'list'", "'true'", "'composite'"
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

            if ( (LA3_0==53) ) {
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

            if ( (LA5_0==53) ) {
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

            if ( (LA6_0==53) ) {
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

            if ( (LA7_0==53) ) {
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


    // $ANTLR start rule__Process__Alternatives_7
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:988:1: rule__Process__Alternatives_7 : ( ( ( rule__Process__TypeAssignment_7_0 ) ) | ( ( rule__Process__Group_7_1__0 ) ) );
    public final void rule__Process__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:992:1: ( ( ( rule__Process__TypeAssignment_7_0 ) ) | ( ( rule__Process__Group_7_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=13 && LA8_0<=19)) ) {
                alt8=1;
            }
            else if ( (LA8_0==11) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("988:1: rule__Process__Alternatives_7 : ( ( ( rule__Process__TypeAssignment_7_0 ) ) | ( ( rule__Process__Group_7_1__0 ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:993:1: ( ( rule__Process__TypeAssignment_7_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:993:1: ( ( rule__Process__TypeAssignment_7_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:994:1: ( rule__Process__TypeAssignment_7_0 )
                    {
                     before(grammarAccess.getProcessAccess().getTypeAssignment_7_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:995:1: ( rule__Process__TypeAssignment_7_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:995:2: rule__Process__TypeAssignment_7_0
                    {
                    pushFollow(FOLLOW_rule__Process__TypeAssignment_7_0_in_rule__Process__Alternatives_72116);
                    rule__Process__TypeAssignment_7_0();
                    _fsp--;


                    }

                     after(grammarAccess.getProcessAccess().getTypeAssignment_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:999:6: ( ( rule__Process__Group_7_1__0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:999:6: ( ( rule__Process__Group_7_1__0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1000:1: ( rule__Process__Group_7_1__0 )
                    {
                     before(grammarAccess.getProcessAccess().getGroup_7_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1001:1: ( rule__Process__Group_7_1__0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1001:2: rule__Process__Group_7_1__0
                    {
                    pushFollow(FOLLOW_rule__Process__Group_7_1__0_in_rule__Process__Alternatives_72134);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1010:1: rule__FormElement__Alternatives_4_1 : ( ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) ) | ( 'false' ) );
    public final void rule__FormElement__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1014:1: ( ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) ) | ( 'false' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==53) ) {
                alt9=1;
            }
            else if ( (LA9_0==12) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1010:1: rule__FormElement__Alternatives_4_1 : ( ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) ) | ( 'false' ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1015:1: ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1015:1: ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1016:1: ( rule__FormElement__ReadonlyAssignment_4_1_0 )
                    {
                     before(grammarAccess.getFormElementAccess().getReadonlyAssignment_4_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1017:1: ( rule__FormElement__ReadonlyAssignment_4_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1017:2: rule__FormElement__ReadonlyAssignment_4_1_0
                    {
                    pushFollow(FOLLOW_rule__FormElement__ReadonlyAssignment_4_1_0_in_rule__FormElement__Alternatives_4_12167);
                    rule__FormElement__ReadonlyAssignment_4_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getFormElementAccess().getReadonlyAssignment_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1021:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1021:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1022:1: 'false'
                    {
                     before(grammarAccess.getFormElementAccess().getFalseKeyword_4_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__FormElement__Alternatives_4_12186); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1034:1: rule__Expression__Alternatives : ( ( ruleServiceExpression ) | ( ruleNavigationExpression ) | ( ruleStandardExpression ) | ( ruleOperationExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1038:1: ( ( ruleServiceExpression ) | ( ruleNavigationExpression ) | ( ruleStandardExpression ) | ( ruleOperationExpression ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt10=1;
                }
                break;
            case 51:
            case 54:
                {
                alt10=2;
                }
                break;
            case 20:
            case 21:
                {
                alt10=3;
                }
                break;
            case 48:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1034:1: rule__Expression__Alternatives : ( ( ruleServiceExpression ) | ( ruleNavigationExpression ) | ( ruleStandardExpression ) | ( ruleOperationExpression ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1039:1: ( ruleServiceExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1039:1: ( ruleServiceExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1040:1: ruleServiceExpression
                    {
                     before(grammarAccess.getExpressionAccess().getServiceExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleServiceExpression_in_rule__Expression__Alternatives2220);
                    ruleServiceExpression();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getServiceExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1045:6: ( ruleNavigationExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1045:6: ( ruleNavigationExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1046:1: ruleNavigationExpression
                    {
                     before(grammarAccess.getExpressionAccess().getNavigationExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNavigationExpression_in_rule__Expression__Alternatives2237);
                    ruleNavigationExpression();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getNavigationExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1051:6: ( ruleStandardExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1051:6: ( ruleStandardExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1052:1: ruleStandardExpression
                    {
                     before(grammarAccess.getExpressionAccess().getStandardExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStandardExpression_in_rule__Expression__Alternatives2254);
                    ruleStandardExpression();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getStandardExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1057:6: ( ruleOperationExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1057:6: ( ruleOperationExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1058:1: ruleOperationExpression
                    {
                     before(grammarAccess.getExpressionAccess().getOperationExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleOperationExpression_in_rule__Expression__Alternatives2271);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );
    public final void rule__UIModelElementCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1072:1: ( ( ruleDialogueCall ) | ( ruleProcessCall ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==44) ) {
                    switch ( input.LA(3) ) {
                    case 45:
                        {
                        int LA11_2 = input.LA(4);

                        if ( (LA11_2==46) ) {
                            int LA11_12 = input.LA(5);

                            if ( (LA11_12==48) ) {
                                int LA11_16 = input.LA(6);

                                if ( (LA11_16==RULE_ID) ) {
                                    int LA11_18 = input.LA(7);

                                    if ( (LA11_18==47) ) {
                                        switch ( input.LA(8) ) {
                                        case 49:
                                            {
                                            int LA11_3 = input.LA(9);

                                            if ( (LA11_3==RULE_ID) ) {
                                                int LA11_13 = input.LA(10);

                                                if ( (LA11_13==50) ) {
                                                    int LA11_17 = input.LA(11);

                                                    if ( (LA11_17==RULE_ID) ) {
                                                        int LA11_19 = input.LA(12);

                                                        if ( (LA11_19==41) ) {
                                                            alt11=2;
                                                        }
                                                        else if ( (LA11_19==43) ) {
                                                            alt11=1;
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 19, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 17, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 13, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 3, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 54:
                                            {
                                            int LA11_4 = input.LA(9);

                                            if ( (LA11_4==51) ) {
                                                int LA11_5 = input.LA(10);

                                                if ( (LA11_5==RULE_ID) ) {
                                                    int LA11_14 = input.LA(11);

                                                    if ( (LA11_14==41) ) {
                                                        alt11=2;
                                                    }
                                                    else if ( (LA11_14==43) ) {
                                                        alt11=1;
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 14, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 5, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 4, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 51:
                                            {
                                            int LA11_5 = input.LA(9);

                                            if ( (LA11_5==RULE_ID) ) {
                                                int LA11_14 = input.LA(10);

                                                if ( (LA11_14==41) ) {
                                                    alt11=2;
                                                }
                                                else if ( (LA11_14==43) ) {
                                                    alt11=1;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 14, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 5, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 20:
                                            {
                                            int LA11_6 = input.LA(9);

                                            if ( (LA11_6==43) ) {
                                                alt11=1;
                                            }
                                            else if ( (LA11_6==41) ) {
                                                alt11=2;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 6, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 21:
                                            {
                                            int LA11_7 = input.LA(9);

                                            if ( (LA11_7==41) ) {
                                                alt11=2;
                                            }
                                            else if ( (LA11_7==43) ) {
                                                alt11=1;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 7, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 48:
                                            {
                                            int LA11_8 = input.LA(9);

                                            if ( (LA11_8==RULE_ID) ) {
                                                int LA11_15 = input.LA(10);

                                                if ( (LA11_15==43) ) {
                                                    alt11=1;
                                                }
                                                else if ( (LA11_15==41) ) {
                                                    alt11=2;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 15, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 8, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 43:
                                            {
                                            alt11=1;
                                            }
                                            break;
                                        case 41:
                                            {
                                            alt11=2;
                                            }
                                            break;
                                        default:
                                            NoViableAltException nvae =
                                                new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 20, input);

                                            throw nvae;
                                        }

                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 18, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 16, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 12, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 49:
                        {
                        int LA11_3 = input.LA(4);

                        if ( (LA11_3==RULE_ID) ) {
                            int LA11_13 = input.LA(5);

                            if ( (LA11_13==50) ) {
                                int LA11_17 = input.LA(6);

                                if ( (LA11_17==RULE_ID) ) {
                                    int LA11_19 = input.LA(7);

                                    if ( (LA11_19==41) ) {
                                        alt11=2;
                                    }
                                    else if ( (LA11_19==43) ) {
                                        alt11=1;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 19, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 17, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 13, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 54:
                        {
                        int LA11_4 = input.LA(4);

                        if ( (LA11_4==51) ) {
                            int LA11_5 = input.LA(5);

                            if ( (LA11_5==RULE_ID) ) {
                                int LA11_14 = input.LA(6);

                                if ( (LA11_14==41) ) {
                                    alt11=2;
                                }
                                else if ( (LA11_14==43) ) {
                                    alt11=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 14, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 51:
                        {
                        int LA11_5 = input.LA(4);

                        if ( (LA11_5==RULE_ID) ) {
                            int LA11_14 = input.LA(5);

                            if ( (LA11_14==41) ) {
                                alt11=2;
                            }
                            else if ( (LA11_14==43) ) {
                                alt11=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 14, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 20:
                        {
                        int LA11_6 = input.LA(4);

                        if ( (LA11_6==43) ) {
                            alt11=1;
                        }
                        else if ( (LA11_6==41) ) {
                            alt11=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 21:
                        {
                        int LA11_7 = input.LA(4);

                        if ( (LA11_7==41) ) {
                            alt11=2;
                        }
                        else if ( (LA11_7==43) ) {
                            alt11=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 48:
                        {
                        int LA11_8 = input.LA(4);

                        if ( (LA11_8==RULE_ID) ) {
                            int LA11_15 = input.LA(5);

                            if ( (LA11_15==43) ) {
                                alt11=1;
                            }
                            else if ( (LA11_15==41) ) {
                                alt11=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 43:
                        {
                        alt11=1;
                        }
                        break;
                    case 41:
                        {
                        alt11=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 11, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==46) ) {
                    int LA11_12 = input.LA(3);

                    if ( (LA11_12==48) ) {
                        int LA11_16 = input.LA(4);

                        if ( (LA11_16==RULE_ID) ) {
                            int LA11_18 = input.LA(5);

                            if ( (LA11_18==47) ) {
                                switch ( input.LA(6) ) {
                                case 49:
                                    {
                                    int LA11_3 = input.LA(7);

                                    if ( (LA11_3==RULE_ID) ) {
                                        int LA11_13 = input.LA(8);

                                        if ( (LA11_13==50) ) {
                                            int LA11_17 = input.LA(9);

                                            if ( (LA11_17==RULE_ID) ) {
                                                int LA11_19 = input.LA(10);

                                                if ( (LA11_19==41) ) {
                                                    alt11=2;
                                                }
                                                else if ( (LA11_19==43) ) {
                                                    alt11=1;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 19, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 17, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 13, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 3, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 54:
                                    {
                                    int LA11_4 = input.LA(7);

                                    if ( (LA11_4==51) ) {
                                        int LA11_5 = input.LA(8);

                                        if ( (LA11_5==RULE_ID) ) {
                                            int LA11_14 = input.LA(9);

                                            if ( (LA11_14==41) ) {
                                                alt11=2;
                                            }
                                            else if ( (LA11_14==43) ) {
                                                alt11=1;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 14, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 5, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 4, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 51:
                                    {
                                    int LA11_5 = input.LA(7);

                                    if ( (LA11_5==RULE_ID) ) {
                                        int LA11_14 = input.LA(8);

                                        if ( (LA11_14==41) ) {
                                            alt11=2;
                                        }
                                        else if ( (LA11_14==43) ) {
                                            alt11=1;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 14, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 5, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 20:
                                    {
                                    int LA11_6 = input.LA(7);

                                    if ( (LA11_6==43) ) {
                                        alt11=1;
                                    }
                                    else if ( (LA11_6==41) ) {
                                        alt11=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 6, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 21:
                                    {
                                    int LA11_7 = input.LA(7);

                                    if ( (LA11_7==41) ) {
                                        alt11=2;
                                    }
                                    else if ( (LA11_7==43) ) {
                                        alt11=1;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 7, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 48:
                                    {
                                    int LA11_8 = input.LA(7);

                                    if ( (LA11_8==RULE_ID) ) {
                                        int LA11_15 = input.LA(8);

                                        if ( (LA11_15==43) ) {
                                            alt11=1;
                                        }
                                        else if ( (LA11_15==41) ) {
                                            alt11=2;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 15, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 8, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 43:
                                    {
                                    alt11=1;
                                    }
                                    break;
                                case 41:
                                    {
                                    alt11=2;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 20, input);

                                    throw nvae;
                                }

                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 18, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 12, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==RULE_ID) ) {
                    int LA11_13 = input.LA(3);

                    if ( (LA11_13==50) ) {
                        int LA11_17 = input.LA(4);

                        if ( (LA11_17==RULE_ID) ) {
                            int LA11_19 = input.LA(5);

                            if ( (LA11_19==41) ) {
                                alt11=2;
                            }
                            else if ( (LA11_19==43) ) {
                                alt11=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 19, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 17, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 13, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                int LA11_4 = input.LA(2);

                if ( (LA11_4==51) ) {
                    int LA11_5 = input.LA(3);

                    if ( (LA11_5==RULE_ID) ) {
                        int LA11_14 = input.LA(4);

                        if ( (LA11_14==41) ) {
                            alt11=2;
                        }
                        else if ( (LA11_14==43) ) {
                            alt11=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 14, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 4, input);

                    throw nvae;
                }
                }
                break;
            case 51:
                {
                int LA11_5 = input.LA(2);

                if ( (LA11_5==RULE_ID) ) {
                    int LA11_14 = input.LA(3);

                    if ( (LA11_14==41) ) {
                        alt11=2;
                    }
                    else if ( (LA11_14==43) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 14, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 5, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                int LA11_6 = input.LA(2);

                if ( (LA11_6==43) ) {
                    alt11=1;
                }
                else if ( (LA11_6==41) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 6, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA11_7 = input.LA(2);

                if ( (LA11_7==41) ) {
                    alt11=2;
                }
                else if ( (LA11_7==43) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 7, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA11_8 = input.LA(2);

                if ( (LA11_8==RULE_ID) ) {
                    int LA11_15 = input.LA(3);

                    if ( (LA11_15==43) ) {
                        alt11=1;
                    }
                    else if ( (LA11_15==41) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 15, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 8, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                alt11=1;
                }
                break;
            case 41:
                {
                alt11=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1068:1: rule__UIModelElementCall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1073:1: ( ruleDialogueCall )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1073:1: ( ruleDialogueCall )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1074:1: ruleDialogueCall
                    {
                     before(grammarAccess.getUIModelElementCallAccess().getDialogueCallParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDialogueCall_in_rule__UIModelElementCall__Alternatives2303);
                    ruleDialogueCall();
                    _fsp--;

                     after(grammarAccess.getUIModelElementCallAccess().getDialogueCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1079:6: ( ruleProcessCall )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1079:6: ( ruleProcessCall )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1080:1: ruleProcessCall
                    {
                     before(grammarAccess.getUIModelElementCallAccess().getProcessCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleProcessCall_in_rule__UIModelElementCall__Alternatives2320);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1090:1: rule__ProcessType__Alternatives : ( ( ( 'new' ) ) | ( ( 'save' ) ) | ( ( 'edit' ) ) | ( ( 'delete' ) ) | ( ( 'cancel' ) ) | ( ( 'removefrom' ) ) | ( ( 'addto' ) ) );
    public final void rule__ProcessType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1094:1: ( ( ( 'new' ) ) | ( ( 'save' ) ) | ( ( 'edit' ) ) | ( ( 'delete' ) ) | ( ( 'cancel' ) ) | ( ( 'removefrom' ) ) | ( ( 'addto' ) ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt12=1;
                }
                break;
            case 14:
                {
                alt12=2;
                }
                break;
            case 15:
                {
                alt12=3;
                }
                break;
            case 16:
                {
                alt12=4;
                }
                break;
            case 17:
                {
                alt12=5;
                }
                break;
            case 18:
                {
                alt12=6;
                }
                break;
            case 19:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1090:1: rule__ProcessType__Alternatives : ( ( ( 'new' ) ) | ( ( 'save' ) ) | ( ( 'edit' ) ) | ( ( 'delete' ) ) | ( ( 'cancel' ) ) | ( ( 'removefrom' ) ) | ( ( 'addto' ) ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1095:1: ( ( 'new' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1095:1: ( ( 'new' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1096:1: ( 'new' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1097:1: ( 'new' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1097:3: 'new'
                    {
                    match(input,13,FOLLOW_13_in_rule__ProcessType__Alternatives2353); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1102:6: ( ( 'save' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1102:6: ( ( 'save' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1103:1: ( 'save' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1104:1: ( 'save' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1104:3: 'save'
                    {
                    match(input,14,FOLLOW_14_in_rule__ProcessType__Alternatives2374); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1109:6: ( ( 'edit' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1109:6: ( ( 'edit' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1110:1: ( 'edit' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1111:1: ( 'edit' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1111:3: 'edit'
                    {
                    match(input,15,FOLLOW_15_in_rule__ProcessType__Alternatives2395); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1116:6: ( ( 'delete' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1116:6: ( ( 'delete' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1117:1: ( 'delete' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1118:1: ( 'delete' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1118:3: 'delete'
                    {
                    match(input,16,FOLLOW_16_in_rule__ProcessType__Alternatives2416); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getDELETEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1123:6: ( ( 'cancel' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1123:6: ( ( 'cancel' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1124:1: ( 'cancel' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getCANCELEnumLiteralDeclaration_4()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1125:1: ( 'cancel' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1125:3: 'cancel'
                    {
                    match(input,17,FOLLOW_17_in_rule__ProcessType__Alternatives2437); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getCANCELEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1130:6: ( ( 'removefrom' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1130:6: ( ( 'removefrom' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1131:1: ( 'removefrom' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getREMOVEFROMEnumLiteralDeclaration_5()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1132:1: ( 'removefrom' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1132:3: 'removefrom'
                    {
                    match(input,18,FOLLOW_18_in_rule__ProcessType__Alternatives2458); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getREMOVEFROMEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1137:6: ( ( 'addto' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1137:6: ( ( 'addto' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1138:1: ( 'addto' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getADDTOEnumLiteralDeclaration_6()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1139:1: ( 'addto' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1139:3: 'addto'
                    {
                    match(input,19,FOLLOW_19_in_rule__ProcessType__Alternatives2479); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1149:1: rule__ExpressionType__Alternatives : ( ( ( 'all' ) ) | ( ( 'find' ) ) );
    public final void rule__ExpressionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1153:1: ( ( ( 'all' ) ) | ( ( 'find' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            else if ( (LA13_0==21) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1149:1: rule__ExpressionType__Alternatives : ( ( ( 'all' ) ) | ( ( 'find' ) ) );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1154:1: ( ( 'all' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1154:1: ( ( 'all' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1155:1: ( 'all' )
                    {
                     before(grammarAccess.getExpressionTypeAccess().getALLEnumLiteralDeclaration_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1156:1: ( 'all' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1156:3: 'all'
                    {
                    match(input,20,FOLLOW_20_in_rule__ExpressionType__Alternatives2515); 

                    }

                     after(grammarAccess.getExpressionTypeAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1161:6: ( ( 'find' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1161:6: ( ( 'find' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1162:1: ( 'find' )
                    {
                     before(grammarAccess.getExpressionTypeAccess().getFINDEnumLiteralDeclaration_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1163:1: ( 'find' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1163:3: 'find'
                    {
                    match(input,21,FOLLOW_21_in_rule__ExpressionType__Alternatives2536); 

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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1175:1: rule__PresentationModel__Group__0 : ( ( rule__PresentationModel__DescriptionAssignment_0 )? ) rule__PresentationModel__Group__1 ;
    public final void rule__PresentationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1179:1: ( ( ( rule__PresentationModel__DescriptionAssignment_0 )? ) rule__PresentationModel__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1180:1: ( ( rule__PresentationModel__DescriptionAssignment_0 )? ) rule__PresentationModel__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1180:1: ( ( rule__PresentationModel__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1181:1: ( rule__PresentationModel__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getPresentationModelAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1182:1: ( rule__PresentationModel__DescriptionAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1182:2: rule__PresentationModel__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PresentationModel__DescriptionAssignment_0_in_rule__PresentationModel__Group__02573);
                    rule__PresentationModel__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentationModelAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__1_in_rule__PresentationModel__Group__02583);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1193:1: rule__PresentationModel__Group__1 : ( 'presentation' ) rule__PresentationModel__Group__2 ;
    public final void rule__PresentationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1197:1: ( ( 'presentation' ) rule__PresentationModel__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1198:1: ( 'presentation' ) rule__PresentationModel__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1198:1: ( 'presentation' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1199:1: 'presentation'
            {
             before(grammarAccess.getPresentationModelAccess().getPresentationKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__PresentationModel__Group__12612); 
             after(grammarAccess.getPresentationModelAccess().getPresentationKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__2_in_rule__PresentationModel__Group__12622);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1213:1: rule__PresentationModel__Group__2 : ( ( rule__PresentationModel__NameAssignment_2 ) ) rule__PresentationModel__Group__3 ;
    public final void rule__PresentationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1217:1: ( ( ( rule__PresentationModel__NameAssignment_2 ) ) rule__PresentationModel__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1218:1: ( ( rule__PresentationModel__NameAssignment_2 ) ) rule__PresentationModel__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1218:1: ( ( rule__PresentationModel__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1219:1: ( rule__PresentationModel__NameAssignment_2 )
            {
             before(grammarAccess.getPresentationModelAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1220:1: ( rule__PresentationModel__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1220:2: rule__PresentationModel__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PresentationModel__NameAssignment_2_in_rule__PresentationModel__Group__22650);
            rule__PresentationModel__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPresentationModelAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__3_in_rule__PresentationModel__Group__22659);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1231:1: rule__PresentationModel__Group__3 : ( ';' ) rule__PresentationModel__Group__4 ;
    public final void rule__PresentationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1235:1: ( ( ';' ) rule__PresentationModel__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1236:1: ( ';' ) rule__PresentationModel__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1236:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1237:1: ';'
            {
             before(grammarAccess.getPresentationModelAccess().getSemicolonKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__PresentationModel__Group__32688); 
             after(grammarAccess.getPresentationModelAccess().getSemicolonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__4_in_rule__PresentationModel__Group__32698);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1251:1: rule__PresentationModel__Group__4 : ( ( rule__PresentationModel__ExternalReferencesAssignment_4 )* ) rule__PresentationModel__Group__5 ;
    public final void rule__PresentationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1255:1: ( ( ( rule__PresentationModel__ExternalReferencesAssignment_4 )* ) rule__PresentationModel__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1256:1: ( ( rule__PresentationModel__ExternalReferencesAssignment_4 )* ) rule__PresentationModel__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1256:1: ( ( rule__PresentationModel__ExternalReferencesAssignment_4 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1257:1: ( rule__PresentationModel__ExternalReferencesAssignment_4 )*
            {
             before(grammarAccess.getPresentationModelAccess().getExternalReferencesAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1258:1: ( rule__PresentationModel__ExternalReferencesAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1258:2: rule__PresentationModel__ExternalReferencesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__PresentationModel__ExternalReferencesAssignment_4_in_rule__PresentationModel__Group__42726);
            	    rule__PresentationModel__ExternalReferencesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPresentationModelAccess().getExternalReferencesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__5_in_rule__PresentationModel__Group__42736);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1269:1: rule__PresentationModel__Group__5 : ( ( rule__PresentationModel__StartAssignment_5 ) ) rule__PresentationModel__Group__6 ;
    public final void rule__PresentationModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1273:1: ( ( ( rule__PresentationModel__StartAssignment_5 ) ) rule__PresentationModel__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1274:1: ( ( rule__PresentationModel__StartAssignment_5 ) ) rule__PresentationModel__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1274:1: ( ( rule__PresentationModel__StartAssignment_5 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1275:1: ( rule__PresentationModel__StartAssignment_5 )
            {
             before(grammarAccess.getPresentationModelAccess().getStartAssignment_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1276:1: ( rule__PresentationModel__StartAssignment_5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1276:2: rule__PresentationModel__StartAssignment_5
            {
            pushFollow(FOLLOW_rule__PresentationModel__StartAssignment_5_in_rule__PresentationModel__Group__52764);
            rule__PresentationModel__StartAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getPresentationModelAccess().getStartAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__PresentationModel__Group__6_in_rule__PresentationModel__Group__52773);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1287:1: rule__PresentationModel__Group__6 : ( ( rule__PresentationModel__ElementsAssignment_6 )* ) ;
    public final void rule__PresentationModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1291:1: ( ( ( rule__PresentationModel__ElementsAssignment_6 )* ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1292:1: ( ( rule__PresentationModel__ElementsAssignment_6 )* )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1292:1: ( ( rule__PresentationModel__ElementsAssignment_6 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1293:1: ( rule__PresentationModel__ElementsAssignment_6 )*
            {
             before(grammarAccess.getPresentationModelAccess().getElementsAssignment_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1294:1: ( rule__PresentationModel__ElementsAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_STRING||LA16_0==29||LA16_0==35||(LA16_0>=37 && LA16_0<=38)||LA16_0==41) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1294:2: rule__PresentationModel__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__PresentationModel__ElementsAssignment_6_in_rule__PresentationModel__Group__62801);
            	    rule__PresentationModel__ElementsAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1318:1: rule__Application__Group__0 : ( 'application' ) rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1322:1: ( ( 'application' ) rule__Application__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1323:1: ( 'application' ) rule__Application__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1323:1: ( 'application' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1324:1: 'application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Application__Group__02851); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Application__Group__1_in_rule__Application__Group__02861);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1338:1: rule__Application__Group__1 : ( '[' ) rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1342:1: ( ( '[' ) rule__Application__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1343:1: ( '[' ) rule__Application__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1343:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1344:1: '['
            {
             before(grammarAccess.getApplicationAccess().getLeftSquareBracketKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Application__Group__12890); 
             after(grammarAccess.getApplicationAccess().getLeftSquareBracketKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Application__Group__2_in_rule__Application__Group__12900);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1358:1: rule__Application__Group__2 : ( ( ( rule__Application__Group_2__0 ) ) ( ( rule__Application__Group_2__0 )* ) ) rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1362:1: ( ( ( ( rule__Application__Group_2__0 ) ) ( ( rule__Application__Group_2__0 )* ) ) rule__Application__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1363:1: ( ( ( rule__Application__Group_2__0 ) ) ( ( rule__Application__Group_2__0 )* ) ) rule__Application__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1363:1: ( ( ( rule__Application__Group_2__0 ) ) ( ( rule__Application__Group_2__0 )* ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1364:1: ( ( rule__Application__Group_2__0 ) ) ( ( rule__Application__Group_2__0 )* )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1364:1: ( ( rule__Application__Group_2__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1365:1: ( rule__Application__Group_2__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1366:1: ( rule__Application__Group_2__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1366:2: rule__Application__Group_2__0
            {
            pushFollow(FOLLOW_rule__Application__Group_2__0_in_rule__Application__Group__22930);
            rule__Application__Group_2__0();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup_2()); 

            }

            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1369:1: ( ( rule__Application__Group_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1370:1: ( rule__Application__Group_2__0 )*
            {
             before(grammarAccess.getApplicationAccess().getGroup_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1371:1: ( rule__Application__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1371:2: rule__Application__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Application__Group_2__0_in_rule__Application__Group__22942);
            	    rule__Application__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getGroup_2()); 

            }


            }

            pushFollow(FOLLOW_rule__Application__Group__3_in_rule__Application__Group__22954);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1383:1: rule__Application__Group__3 : ( ']' ) ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1387:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1388:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1388:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1389:1: ']'
            {
             before(grammarAccess.getApplicationAccess().getRightSquareBracketKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Application__Group__32983); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1410:1: rule__Application__Group_2__0 : ( ( rule__Application__StartProcessesAssignment_2_0 ) ) rule__Application__Group_2__1 ;
    public final void rule__Application__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1414:1: ( ( ( rule__Application__StartProcessesAssignment_2_0 ) ) rule__Application__Group_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1415:1: ( ( rule__Application__StartProcessesAssignment_2_0 ) ) rule__Application__Group_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1415:1: ( ( rule__Application__StartProcessesAssignment_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1416:1: ( rule__Application__StartProcessesAssignment_2_0 )
            {
             before(grammarAccess.getApplicationAccess().getStartProcessesAssignment_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1417:1: ( rule__Application__StartProcessesAssignment_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1417:2: rule__Application__StartProcessesAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Application__StartProcessesAssignment_2_0_in_rule__Application__Group_2__03026);
            rule__Application__StartProcessesAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getStartProcessesAssignment_2_0()); 

            }

            pushFollow(FOLLOW_rule__Application__Group_2__1_in_rule__Application__Group_2__03035);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1428:1: rule__Application__Group_2__1 : ( ';' ) ;
    public final void rule__Application__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1432:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1433:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1433:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1434:1: ';'
            {
             before(grammarAccess.getApplicationAccess().getSemicolonKeyword_2_1()); 
            match(input,23,FOLLOW_23_in_rule__Application__Group_2__13064); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1451:1: rule__ExternalReference__Group__0 : ( 'from' ) rule__ExternalReference__Group__1 ;
    public final void rule__ExternalReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1455:1: ( ( 'from' ) rule__ExternalReference__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1456:1: ( 'from' ) rule__ExternalReference__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1456:1: ( 'from' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1457:1: 'from'
            {
             before(grammarAccess.getExternalReferenceAccess().getFromKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__ExternalReference__Group__03104); 
             after(grammarAccess.getExternalReferenceAccess().getFromKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__1_in_rule__ExternalReference__Group__03114);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1471:1: rule__ExternalReference__Group__1 : ( ( rule__ExternalReference__ModelNameAssignment_1 ) ) rule__ExternalReference__Group__2 ;
    public final void rule__ExternalReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1475:1: ( ( ( rule__ExternalReference__ModelNameAssignment_1 ) ) rule__ExternalReference__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1476:1: ( ( rule__ExternalReference__ModelNameAssignment_1 ) ) rule__ExternalReference__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1476:1: ( ( rule__ExternalReference__ModelNameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1477:1: ( rule__ExternalReference__ModelNameAssignment_1 )
            {
             before(grammarAccess.getExternalReferenceAccess().getModelNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1478:1: ( rule__ExternalReference__ModelNameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1478:2: rule__ExternalReference__ModelNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalReference__ModelNameAssignment_1_in_rule__ExternalReference__Group__13142);
            rule__ExternalReference__ModelNameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getModelNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__2_in_rule__ExternalReference__Group__13151);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1489:1: rule__ExternalReference__Group__2 : ( 'import' ) rule__ExternalReference__Group__3 ;
    public final void rule__ExternalReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1493:1: ( ( 'import' ) rule__ExternalReference__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1494:1: ( 'import' ) rule__ExternalReference__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1494:1: ( 'import' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1495:1: 'import'
            {
             before(grammarAccess.getExternalReferenceAccess().getImportKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__ExternalReference__Group__23180); 
             after(grammarAccess.getExternalReferenceAccess().getImportKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__3_in_rule__ExternalReference__Group__23190);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1509:1: rule__ExternalReference__Group__3 : ( ( rule__ExternalReference__NameAssignment_3 ) ) rule__ExternalReference__Group__4 ;
    public final void rule__ExternalReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1513:1: ( ( ( rule__ExternalReference__NameAssignment_3 ) ) rule__ExternalReference__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1514:1: ( ( rule__ExternalReference__NameAssignment_3 ) ) rule__ExternalReference__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1514:1: ( ( rule__ExternalReference__NameAssignment_3 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1515:1: ( rule__ExternalReference__NameAssignment_3 )
            {
             before(grammarAccess.getExternalReferenceAccess().getNameAssignment_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1516:1: ( rule__ExternalReference__NameAssignment_3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1516:2: rule__ExternalReference__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ExternalReference__NameAssignment_3_in_rule__ExternalReference__Group__33218);
            rule__ExternalReference__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getNameAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__4_in_rule__ExternalReference__Group__33227);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1527:1: rule__ExternalReference__Group__4 : ( ';' ) ;
    public final void rule__ExternalReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1531:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1532:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1532:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1533:1: ';'
            {
             before(grammarAccess.getExternalReferenceAccess().getSemicolonKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__ExternalReference__Group__43256); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1556:1: rule__ContentForm__Group__0 : ( ( rule__ContentForm__DescriptionAssignment_0 )? ) rule__ContentForm__Group__1 ;
    public final void rule__ContentForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1560:1: ( ( ( rule__ContentForm__DescriptionAssignment_0 )? ) rule__ContentForm__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1561:1: ( ( rule__ContentForm__DescriptionAssignment_0 )? ) rule__ContentForm__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1561:1: ( ( rule__ContentForm__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1562:1: ( rule__ContentForm__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getContentFormAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1563:1: ( rule__ContentForm__DescriptionAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1563:2: rule__ContentForm__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__DescriptionAssignment_0_in_rule__ContentForm__Group__03301);
                    rule__ContentForm__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__1_in_rule__ContentForm__Group__03311);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1574:1: rule__ContentForm__Group__1 : ( 'form' ) rule__ContentForm__Group__2 ;
    public final void rule__ContentForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1578:1: ( ( 'form' ) rule__ContentForm__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1579:1: ( 'form' ) rule__ContentForm__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1579:1: ( 'form' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1580:1: 'form'
            {
             before(grammarAccess.getContentFormAccess().getFormKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__ContentForm__Group__13340); 
             after(grammarAccess.getContentFormAccess().getFormKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__2_in_rule__ContentForm__Group__13350);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1594:1: rule__ContentForm__Group__2 : ( ( rule__ContentForm__NameAssignment_2 ) ) rule__ContentForm__Group__3 ;
    public final void rule__ContentForm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1598:1: ( ( ( rule__ContentForm__NameAssignment_2 ) ) rule__ContentForm__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1599:1: ( ( rule__ContentForm__NameAssignment_2 ) ) rule__ContentForm__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1599:1: ( ( rule__ContentForm__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1600:1: ( rule__ContentForm__NameAssignment_2 )
            {
             before(grammarAccess.getContentFormAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1601:1: ( rule__ContentForm__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1601:2: rule__ContentForm__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ContentForm__NameAssignment_2_in_rule__ContentForm__Group__23378);
            rule__ContentForm__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__3_in_rule__ContentForm__Group__23387);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1612:1: rule__ContentForm__Group__3 : ( 'context' ) rule__ContentForm__Group__4 ;
    public final void rule__ContentForm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1616:1: ( ( 'context' ) rule__ContentForm__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1617:1: ( 'context' ) rule__ContentForm__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1617:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1618:1: 'context'
            {
             before(grammarAccess.getContentFormAccess().getContextKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__ContentForm__Group__33416); 
             after(grammarAccess.getContentFormAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__4_in_rule__ContentForm__Group__33426);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1632:1: rule__ContentForm__Group__4 : ( ( rule__ContentForm__CollectionContextAssignment_4 )? ) rule__ContentForm__Group__5 ;
    public final void rule__ContentForm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1636:1: ( ( ( rule__ContentForm__CollectionContextAssignment_4 )? ) rule__ContentForm__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1637:1: ( ( rule__ContentForm__CollectionContextAssignment_4 )? ) rule__ContentForm__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1637:1: ( ( rule__ContentForm__CollectionContextAssignment_4 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1638:1: ( rule__ContentForm__CollectionContextAssignment_4 )?
            {
             before(grammarAccess.getContentFormAccess().getCollectionContextAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1639:1: ( rule__ContentForm__CollectionContextAssignment_4 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==52) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1639:2: rule__ContentForm__CollectionContextAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ContentForm__CollectionContextAssignment_4_in_rule__ContentForm__Group__43454);
                    rule__ContentForm__CollectionContextAssignment_4();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getCollectionContextAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__5_in_rule__ContentForm__Group__43464);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1650:1: rule__ContentForm__Group__5 : ( ( rule__ContentForm__ContextRefAssignment_5 ) ) rule__ContentForm__Group__6 ;
    public final void rule__ContentForm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1654:1: ( ( ( rule__ContentForm__ContextRefAssignment_5 ) ) rule__ContentForm__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1655:1: ( ( rule__ContentForm__ContextRefAssignment_5 ) ) rule__ContentForm__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1655:1: ( ( rule__ContentForm__ContextRefAssignment_5 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1656:1: ( rule__ContentForm__ContextRefAssignment_5 )
            {
             before(grammarAccess.getContentFormAccess().getContextRefAssignment_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1657:1: ( rule__ContentForm__ContextRefAssignment_5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1657:2: rule__ContentForm__ContextRefAssignment_5
            {
            pushFollow(FOLLOW_rule__ContentForm__ContextRefAssignment_5_in_rule__ContentForm__Group__53492);
            rule__ContentForm__ContextRefAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getContextRefAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__6_in_rule__ContentForm__Group__53501);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1668:1: rule__ContentForm__Group__6 : ( '[' ) rule__ContentForm__Group__7 ;
    public final void rule__ContentForm__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1672:1: ( ( '[' ) rule__ContentForm__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1673:1: ( '[' ) rule__ContentForm__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1673:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1674:1: '['
            {
             before(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__ContentForm__Group__63530); 
             after(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__7_in_rule__ContentForm__Group__63540);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1688:1: rule__ContentForm__Group__7 : ( ( rule__ContentForm__Group_7__0 )? ) rule__ContentForm__Group__8 ;
    public final void rule__ContentForm__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1692:1: ( ( ( rule__ContentForm__Group_7__0 )? ) rule__ContentForm__Group__8 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1693:1: ( ( rule__ContentForm__Group_7__0 )? ) rule__ContentForm__Group__8
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1693:1: ( ( rule__ContentForm__Group_7__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1694:1: ( rule__ContentForm__Group_7__0 )?
            {
             before(grammarAccess.getContentFormAccess().getGroup_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1695:1: ( rule__ContentForm__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1695:2: rule__ContentForm__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__Group_7__0_in_rule__ContentForm__Group__73568);
                    rule__ContentForm__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getGroup_7()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__8_in_rule__ContentForm__Group__73578);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1706:1: rule__ContentForm__Group__8 : ( ( rule__ContentForm__FormElementsAssignment_8 )* ) rule__ContentForm__Group__9 ;
    public final void rule__ContentForm__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1710:1: ( ( ( rule__ContentForm__FormElementsAssignment_8 )* ) rule__ContentForm__Group__9 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1711:1: ( ( rule__ContentForm__FormElementsAssignment_8 )* ) rule__ContentForm__Group__9
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1711:1: ( ( rule__ContentForm__FormElementsAssignment_8 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1712:1: ( rule__ContentForm__FormElementsAssignment_8 )*
            {
             before(grammarAccess.getContentFormAccess().getFormElementsAssignment_8()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1713:1: ( rule__ContentForm__FormElementsAssignment_8 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING||LA21_0==42) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1713:2: rule__ContentForm__FormElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__ContentForm__FormElementsAssignment_8_in_rule__ContentForm__Group__83606);
            	    rule__ContentForm__FormElementsAssignment_8();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getContentFormAccess().getFormElementsAssignment_8()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__9_in_rule__ContentForm__Group__83616);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1724:1: rule__ContentForm__Group__9 : ( ( rule__ContentForm__Group_9__0 )? ) rule__ContentForm__Group__10 ;
    public final void rule__ContentForm__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1728:1: ( ( ( rule__ContentForm__Group_9__0 )? ) rule__ContentForm__Group__10 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1729:1: ( ( rule__ContentForm__Group_9__0 )? ) rule__ContentForm__Group__10
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1729:1: ( ( rule__ContentForm__Group_9__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1730:1: ( rule__ContentForm__Group_9__0 )?
            {
             before(grammarAccess.getContentFormAccess().getGroup_9()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1731:1: ( rule__ContentForm__Group_9__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1731:2: rule__ContentForm__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__Group_9__0_in_rule__ContentForm__Group__93644);
                    rule__ContentForm__Group_9__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getGroup_9()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__10_in_rule__ContentForm__Group__93654);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1742:1: rule__ContentForm__Group__10 : ( ( rule__ContentForm__Group_10__0 )? ) rule__ContentForm__Group__11 ;
    public final void rule__ContentForm__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1746:1: ( ( ( rule__ContentForm__Group_10__0 )? ) rule__ContentForm__Group__11 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1747:1: ( ( rule__ContentForm__Group_10__0 )? ) rule__ContentForm__Group__11
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1747:1: ( ( rule__ContentForm__Group_10__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1748:1: ( rule__ContentForm__Group_10__0 )?
            {
             before(grammarAccess.getContentFormAccess().getGroup_10()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1749:1: ( rule__ContentForm__Group_10__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1749:2: rule__ContentForm__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__Group_10__0_in_rule__ContentForm__Group__103682);
                    rule__ContentForm__Group_10__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getGroup_10()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__11_in_rule__ContentForm__Group__103692);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1760:1: rule__ContentForm__Group__11 : ( ']' ) ;
    public final void rule__ContentForm__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1764:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1765:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1765:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1766:1: ']'
            {
             before(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_11()); 
            match(input,26,FOLLOW_26_in_rule__ContentForm__Group__113721); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1803:1: rule__ContentForm__Group_7__0 : ( 'readonly' ) rule__ContentForm__Group_7__1 ;
    public final void rule__ContentForm__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1807:1: ( ( 'readonly' ) rule__ContentForm__Group_7__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1808:1: ( 'readonly' ) rule__ContentForm__Group_7__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1808:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1809:1: 'readonly'
            {
             before(grammarAccess.getContentFormAccess().getReadonlyKeyword_7_0()); 
            match(input,31,FOLLOW_31_in_rule__ContentForm__Group_7__03781); 
             after(grammarAccess.getContentFormAccess().getReadonlyKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_7__1_in_rule__ContentForm__Group_7__03791);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1823:1: rule__ContentForm__Group_7__1 : ( ( rule__ContentForm__Alternatives_7_1 ) ) rule__ContentForm__Group_7__2 ;
    public final void rule__ContentForm__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1827:1: ( ( ( rule__ContentForm__Alternatives_7_1 ) ) rule__ContentForm__Group_7__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1828:1: ( ( rule__ContentForm__Alternatives_7_1 ) ) rule__ContentForm__Group_7__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1828:1: ( ( rule__ContentForm__Alternatives_7_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1829:1: ( rule__ContentForm__Alternatives_7_1 )
            {
             before(grammarAccess.getContentFormAccess().getAlternatives_7_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1830:1: ( rule__ContentForm__Alternatives_7_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1830:2: rule__ContentForm__Alternatives_7_1
            {
            pushFollow(FOLLOW_rule__ContentForm__Alternatives_7_1_in_rule__ContentForm__Group_7__13819);
            rule__ContentForm__Alternatives_7_1();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getAlternatives_7_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_7__2_in_rule__ContentForm__Group_7__13828);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1841:1: rule__ContentForm__Group_7__2 : ( ';' ) ;
    public final void rule__ContentForm__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1845:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1846:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1846:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1847:1: ';'
            {
             before(grammarAccess.getContentFormAccess().getSemicolonKeyword_7_2()); 
            match(input,23,FOLLOW_23_in_rule__ContentForm__Group_7__23857); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1866:1: rule__ContentForm__Group_9__0 : ( 'actions' ) rule__ContentForm__Group_9__1 ;
    public final void rule__ContentForm__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1870:1: ( ( 'actions' ) rule__ContentForm__Group_9__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1871:1: ( 'actions' ) rule__ContentForm__Group_9__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1871:1: ( 'actions' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1872:1: 'actions'
            {
             before(grammarAccess.getContentFormAccess().getActionsKeyword_9_0()); 
            match(input,32,FOLLOW_32_in_rule__ContentForm__Group_9__03899); 
             after(grammarAccess.getContentFormAccess().getActionsKeyword_9_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_9__1_in_rule__ContentForm__Group_9__03909);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1886:1: rule__ContentForm__Group_9__1 : ( '[' ) rule__ContentForm__Group_9__2 ;
    public final void rule__ContentForm__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1890:1: ( ( '[' ) rule__ContentForm__Group_9__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1891:1: ( '[' ) rule__ContentForm__Group_9__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1891:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1892:1: '['
            {
             before(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_9_1()); 
            match(input,25,FOLLOW_25_in_rule__ContentForm__Group_9__13938); 
             after(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_9_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_9__2_in_rule__ContentForm__Group_9__13948);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1906:1: rule__ContentForm__Group_9__2 : ( ( rule__ContentForm__Group_9_2__0 )* ) rule__ContentForm__Group_9__3 ;
    public final void rule__ContentForm__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1910:1: ( ( ( rule__ContentForm__Group_9_2__0 )* ) rule__ContentForm__Group_9__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1911:1: ( ( rule__ContentForm__Group_9_2__0 )* ) rule__ContentForm__Group_9__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1911:1: ( ( rule__ContentForm__Group_9_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1912:1: ( rule__ContentForm__Group_9_2__0 )*
            {
             before(grammarAccess.getContentFormAccess().getGroup_9_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1913:1: ( rule__ContentForm__Group_9_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)||(LA24_0>=13 && LA24_0<=19)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1913:2: rule__ContentForm__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ContentForm__Group_9_2__0_in_rule__ContentForm__Group_9__23976);
            	    rule__ContentForm__Group_9_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getContentFormAccess().getGroup_9_2()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_9__3_in_rule__ContentForm__Group_9__23986);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1924:1: rule__ContentForm__Group_9__3 : ( ']' ) ;
    public final void rule__ContentForm__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1928:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1929:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1929:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1930:1: ']'
            {
             before(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_9_3()); 
            match(input,26,FOLLOW_26_in_rule__ContentForm__Group_9__34015); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1951:1: rule__ContentForm__Group_9_2__0 : ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) ) rule__ContentForm__Group_9_2__1 ;
    public final void rule__ContentForm__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1955:1: ( ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) ) rule__ContentForm__Group_9_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1956:1: ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) ) rule__ContentForm__Group_9_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1956:1: ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1957:1: ( rule__ContentForm__ActionsAssignment_9_2_0 )
            {
             before(grammarAccess.getContentFormAccess().getActionsAssignment_9_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1958:1: ( rule__ContentForm__ActionsAssignment_9_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1958:2: rule__ContentForm__ActionsAssignment_9_2_0
            {
            pushFollow(FOLLOW_rule__ContentForm__ActionsAssignment_9_2_0_in_rule__ContentForm__Group_9_2__04058);
            rule__ContentForm__ActionsAssignment_9_2_0();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getActionsAssignment_9_2_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_9_2__1_in_rule__ContentForm__Group_9_2__04067);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1969:1: rule__ContentForm__Group_9_2__1 : ( ';' ) ;
    public final void rule__ContentForm__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1973:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1974:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1974:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1975:1: ';'
            {
             before(grammarAccess.getContentFormAccess().getSemicolonKeyword_9_2_1()); 
            match(input,23,FOLLOW_23_in_rule__ContentForm__Group_9_2__14096); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1992:1: rule__ContentForm__Group_10__0 : ( 'processes' ) rule__ContentForm__Group_10__1 ;
    public final void rule__ContentForm__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1996:1: ( ( 'processes' ) rule__ContentForm__Group_10__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1997:1: ( 'processes' ) rule__ContentForm__Group_10__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1997:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1998:1: 'processes'
            {
             before(grammarAccess.getContentFormAccess().getProcessesKeyword_10_0()); 
            match(input,33,FOLLOW_33_in_rule__ContentForm__Group_10__04136); 
             after(grammarAccess.getContentFormAccess().getProcessesKeyword_10_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_10__1_in_rule__ContentForm__Group_10__04146);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2012:1: rule__ContentForm__Group_10__1 : ( '[' ) rule__ContentForm__Group_10__2 ;
    public final void rule__ContentForm__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2016:1: ( ( '[' ) rule__ContentForm__Group_10__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2017:1: ( '[' ) rule__ContentForm__Group_10__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2017:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2018:1: '['
            {
             before(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_10_1()); 
            match(input,25,FOLLOW_25_in_rule__ContentForm__Group_10__14175); 
             after(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_10_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_10__2_in_rule__ContentForm__Group_10__14185);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2032:1: rule__ContentForm__Group_10__2 : ( ( rule__ContentForm__Group_10_2__0 )* ) rule__ContentForm__Group_10__3 ;
    public final void rule__ContentForm__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2036:1: ( ( ( rule__ContentForm__Group_10_2__0 )* ) rule__ContentForm__Group_10__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2037:1: ( ( rule__ContentForm__Group_10_2__0 )* ) rule__ContentForm__Group_10__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2037:1: ( ( rule__ContentForm__Group_10_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2038:1: ( rule__ContentForm__Group_10_2__0 )*
            {
             before(grammarAccess.getContentFormAccess().getGroup_10_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2039:1: ( rule__ContentForm__Group_10_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2039:2: rule__ContentForm__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ContentForm__Group_10_2__0_in_rule__ContentForm__Group_10__24213);
            	    rule__ContentForm__Group_10_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getContentFormAccess().getGroup_10_2()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_10__3_in_rule__ContentForm__Group_10__24223);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2050:1: rule__ContentForm__Group_10__3 : ( ']' ) ;
    public final void rule__ContentForm__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2054:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2055:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2055:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2056:1: ']'
            {
             before(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_10_3()); 
            match(input,26,FOLLOW_26_in_rule__ContentForm__Group_10__34252); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2077:1: rule__ContentForm__Group_10_2__0 : ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) ) rule__ContentForm__Group_10_2__1 ;
    public final void rule__ContentForm__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2081:1: ( ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) ) rule__ContentForm__Group_10_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2082:1: ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) ) rule__ContentForm__Group_10_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2082:1: ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2083:1: ( rule__ContentForm__ProcessesAssignment_10_2_0 )
            {
             before(grammarAccess.getContentFormAccess().getProcessesAssignment_10_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2084:1: ( rule__ContentForm__ProcessesAssignment_10_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2084:2: rule__ContentForm__ProcessesAssignment_10_2_0
            {
            pushFollow(FOLLOW_rule__ContentForm__ProcessesAssignment_10_2_0_in_rule__ContentForm__Group_10_2__04295);
            rule__ContentForm__ProcessesAssignment_10_2_0();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getProcessesAssignment_10_2_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_10_2__1_in_rule__ContentForm__Group_10_2__04304);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2095:1: rule__ContentForm__Group_10_2__1 : ( ';' ) ;
    public final void rule__ContentForm__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2099:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2100:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2100:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2101:1: ';'
            {
             before(grammarAccess.getContentFormAccess().getSemicolonKeyword_10_2_1()); 
            match(input,23,FOLLOW_23_in_rule__ContentForm__Group_10_2__14333); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2118:1: rule__Action__Group__0 : ( ( rule__Action__DescriptionAssignment_0 )? ) rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2122:1: ( ( ( rule__Action__DescriptionAssignment_0 )? ) rule__Action__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2123:1: ( ( rule__Action__DescriptionAssignment_0 )? ) rule__Action__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2123:1: ( ( rule__Action__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2124:1: ( rule__Action__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getActionAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2125:1: ( rule__Action__DescriptionAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2125:2: rule__Action__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Action__DescriptionAssignment_0_in_rule__Action__Group__04372);
                    rule__Action__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04382);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2136:1: rule__Action__Group__1 : ( ( rule__Action__TypeAssignment_1 )? ) rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2140:1: ( ( ( rule__Action__TypeAssignment_1 )? ) rule__Action__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2141:1: ( ( rule__Action__TypeAssignment_1 )? ) rule__Action__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2141:1: ( ( rule__Action__TypeAssignment_1 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2142:1: ( rule__Action__TypeAssignment_1 )?
            {
             before(grammarAccess.getActionAccess().getTypeAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2143:1: ( rule__Action__TypeAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=13 && LA27_0<=19)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2143:2: rule__Action__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Action__TypeAssignment_1_in_rule__Action__Group__14410);
                    rule__Action__TypeAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14420);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2154:1: rule__Action__Group__2 : ( ( rule__Action__NameAssignment_2 ) ) rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2158:1: ( ( ( rule__Action__NameAssignment_2 ) ) rule__Action__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2159:1: ( ( rule__Action__NameAssignment_2 ) ) rule__Action__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2159:1: ( ( rule__Action__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2160:1: ( rule__Action__NameAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2161:1: ( rule__Action__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2161:2: rule__Action__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_2_in_rule__Action__Group__24448);
            rule__Action__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__24457);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2172:1: rule__Action__Group__3 : ( ( rule__Action__Group_3__0 )? ) rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2176:1: ( ( ( rule__Action__Group_3__0 )? ) rule__Action__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2177:1: ( ( rule__Action__Group_3__0 )? ) rule__Action__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2177:1: ( ( rule__Action__Group_3__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2178:1: ( rule__Action__Group_3__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2179:1: ( rule__Action__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2179:2: rule__Action__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__34485);
                    rule__Action__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__4_in_rule__Action__Group__34495);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2190:1: rule__Action__Group__4 : ( ( rule__Action__ProcessElementsAssignment_4 )? ) ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2194:1: ( ( ( rule__Action__ProcessElementsAssignment_4 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2195:1: ( ( rule__Action__ProcessElementsAssignment_4 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2195:1: ( ( rule__Action__ProcessElementsAssignment_4 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2196:1: ( rule__Action__ProcessElementsAssignment_4 )?
            {
             before(grammarAccess.getActionAccess().getProcessElementsAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2197:1: ( rule__Action__ProcessElementsAssignment_4 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=20 && LA29_0<=21)||LA29_0==43||(LA29_0>=48 && LA29_0<=49)||LA29_0==51||LA29_0==54) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2197:2: rule__Action__ProcessElementsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Action__ProcessElementsAssignment_4_in_rule__Action__Group__44523);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2217:1: rule__Action__Group_3__0 : ( 'label' ) rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2221:1: ( ( 'label' ) rule__Action__Group_3__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2222:1: ( 'label' ) rule__Action__Group_3__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2222:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2223:1: 'label'
            {
             before(grammarAccess.getActionAccess().getLabelKeyword_3_0()); 
            match(input,34,FOLLOW_34_in_rule__Action__Group_3__04569); 
             after(grammarAccess.getActionAccess().getLabelKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__04579);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2237:1: rule__Action__Group_3__1 : ( ( rule__Action__LabelAssignment_3_1 ) ) ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2241:1: ( ( ( rule__Action__LabelAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2242:1: ( ( rule__Action__LabelAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2242:1: ( ( rule__Action__LabelAssignment_3_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2243:1: ( rule__Action__LabelAssignment_3_1 )
            {
             before(grammarAccess.getActionAccess().getLabelAssignment_3_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2244:1: ( rule__Action__LabelAssignment_3_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2244:2: rule__Action__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Action__LabelAssignment_3_1_in_rule__Action__Group_3__14607);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2258:1: rule__CompoundDialogue__Group_0__0 : ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? ) rule__CompoundDialogue__Group_0__1 ;
    public final void rule__CompoundDialogue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2262:1: ( ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? ) rule__CompoundDialogue__Group_0__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2263:1: ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? ) rule__CompoundDialogue__Group_0__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2263:1: ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2264:1: ( rule__CompoundDialogue__DescriptionAssignment_0_0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getDescriptionAssignment_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2265:1: ( rule__CompoundDialogue__DescriptionAssignment_0_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2265:2: rule__CompoundDialogue__DescriptionAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__DescriptionAssignment_0_0_in_rule__CompoundDialogue__Group_0__04645);
                    rule__CompoundDialogue__DescriptionAssignment_0_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundDialogueAccess().getDescriptionAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__1_in_rule__CompoundDialogue__Group_0__04655);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2276:1: rule__CompoundDialogue__Group_0__1 : ( 'CompoundDialogue' ) rule__CompoundDialogue__Group_0__2 ;
    public final void rule__CompoundDialogue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2280:1: ( ( 'CompoundDialogue' ) rule__CompoundDialogue__Group_0__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2281:1: ( 'CompoundDialogue' ) rule__CompoundDialogue__Group_0__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2281:1: ( 'CompoundDialogue' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2282:1: 'CompoundDialogue'
            {
             before(grammarAccess.getCompoundDialogueAccess().getCompoundDialogueKeyword_0_1()); 
            match(input,35,FOLLOW_35_in_rule__CompoundDialogue__Group_0__14684); 
             after(grammarAccess.getCompoundDialogueAccess().getCompoundDialogueKeyword_0_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__2_in_rule__CompoundDialogue__Group_0__14694);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2296:1: rule__CompoundDialogue__Group_0__2 : ( ( rule__CompoundDialogue__NameAssignment_0_2 ) ) rule__CompoundDialogue__Group_0__3 ;
    public final void rule__CompoundDialogue__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2300:1: ( ( ( rule__CompoundDialogue__NameAssignment_0_2 ) ) rule__CompoundDialogue__Group_0__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2301:1: ( ( rule__CompoundDialogue__NameAssignment_0_2 ) ) rule__CompoundDialogue__Group_0__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2301:1: ( ( rule__CompoundDialogue__NameAssignment_0_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2302:1: ( rule__CompoundDialogue__NameAssignment_0_2 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getNameAssignment_0_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2303:1: ( rule__CompoundDialogue__NameAssignment_0_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2303:2: rule__CompoundDialogue__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__NameAssignment_0_2_in_rule__CompoundDialogue__Group_0__24722);
            rule__CompoundDialogue__NameAssignment_0_2();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getNameAssignment_0_2()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__3_in_rule__CompoundDialogue__Group_0__24731);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2314:1: rule__CompoundDialogue__Group_0__3 : ( 'context' ) rule__CompoundDialogue__Group_0__4 ;
    public final void rule__CompoundDialogue__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2318:1: ( ( 'context' ) rule__CompoundDialogue__Group_0__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2319:1: ( 'context' ) rule__CompoundDialogue__Group_0__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2319:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2320:1: 'context'
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextKeyword_0_3()); 
            match(input,30,FOLLOW_30_in_rule__CompoundDialogue__Group_0__34760); 
             after(grammarAccess.getCompoundDialogueAccess().getContextKeyword_0_3()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__4_in_rule__CompoundDialogue__Group_0__34770);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2334:1: rule__CompoundDialogue__Group_0__4 : ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) ) rule__CompoundDialogue__Group_0__5 ;
    public final void rule__CompoundDialogue__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2338:1: ( ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) ) rule__CompoundDialogue__Group_0__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2339:1: ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) ) rule__CompoundDialogue__Group_0__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2339:1: ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2340:1: ( rule__CompoundDialogue__ContextRefAssignment_0_4 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextRefAssignment_0_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2341:1: ( rule__CompoundDialogue__ContextRefAssignment_0_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2341:2: rule__CompoundDialogue__ContextRefAssignment_0_4
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__ContextRefAssignment_0_4_in_rule__CompoundDialogue__Group_0__44798);
            rule__CompoundDialogue__ContextRefAssignment_0_4();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getContextRefAssignment_0_4()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__5_in_rule__CompoundDialogue__Group_0__44807);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2352:1: rule__CompoundDialogue__Group_0__5 : ( ( rule__CompoundDialogue__Group_0_5__0 )? ) rule__CompoundDialogue__Group_0__6 ;
    public final void rule__CompoundDialogue__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2356:1: ( ( ( rule__CompoundDialogue__Group_0_5__0 )? ) rule__CompoundDialogue__Group_0__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2357:1: ( ( rule__CompoundDialogue__Group_0_5__0 )? ) rule__CompoundDialogue__Group_0__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2357:1: ( ( rule__CompoundDialogue__Group_0_5__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2358:1: ( rule__CompoundDialogue__Group_0_5__0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2359:1: ( rule__CompoundDialogue__Group_0_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2359:2: rule__CompoundDialogue__Group_0_5__0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_5__0_in_rule__CompoundDialogue__Group_0__54835);
                    rule__CompoundDialogue__Group_0_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundDialogueAccess().getGroup_0_5()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__6_in_rule__CompoundDialogue__Group_0__54845);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2370:1: rule__CompoundDialogue__Group_0__6 : ( ( rule__CompoundDialogue__Group_0_6__0 )? ) rule__CompoundDialogue__Group_0__7 ;
    public final void rule__CompoundDialogue__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2374:1: ( ( ( rule__CompoundDialogue__Group_0_6__0 )? ) rule__CompoundDialogue__Group_0__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2375:1: ( ( rule__CompoundDialogue__Group_0_6__0 )? ) rule__CompoundDialogue__Group_0__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2375:1: ( ( rule__CompoundDialogue__Group_0_6__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2376:1: ( rule__CompoundDialogue__Group_0_6__0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2377:1: ( rule__CompoundDialogue__Group_0_6__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2377:2: rule__CompoundDialogue__Group_0_6__0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__0_in_rule__CompoundDialogue__Group_0__64873);
                    rule__CompoundDialogue__Group_0_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundDialogueAccess().getGroup_0_6()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__7_in_rule__CompoundDialogue__Group_0__64883);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2388:1: rule__CompoundDialogue__Group_0__7 : ( ( rule__CompoundDialogue__Group_0_7__0 )? ) ;
    public final void rule__CompoundDialogue__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2392:1: ( ( ( rule__CompoundDialogue__Group_0_7__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2393:1: ( ( rule__CompoundDialogue__Group_0_7__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2393:1: ( ( rule__CompoundDialogue__Group_0_7__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2394:1: ( rule__CompoundDialogue__Group_0_7__0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2395:1: ( rule__CompoundDialogue__Group_0_7__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2395:2: rule__CompoundDialogue__Group_0_7__0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__0_in_rule__CompoundDialogue__Group_0__74911);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2421:1: rule__CompoundDialogue__Group_0_5__0 : ( 'readonly' ) rule__CompoundDialogue__Group_0_5__1 ;
    public final void rule__CompoundDialogue__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2425:1: ( ( 'readonly' ) rule__CompoundDialogue__Group_0_5__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2426:1: ( 'readonly' ) rule__CompoundDialogue__Group_0_5__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2426:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2427:1: 'readonly'
            {
             before(grammarAccess.getCompoundDialogueAccess().getReadonlyKeyword_0_5_0()); 
            match(input,31,FOLLOW_31_in_rule__CompoundDialogue__Group_0_5__04963); 
             after(grammarAccess.getCompoundDialogueAccess().getReadonlyKeyword_0_5_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_5__1_in_rule__CompoundDialogue__Group_0_5__04973);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2441:1: rule__CompoundDialogue__Group_0_5__1 : ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) ) rule__CompoundDialogue__Group_0_5__2 ;
    public final void rule__CompoundDialogue__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2445:1: ( ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) ) rule__CompoundDialogue__Group_0_5__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2446:1: ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) ) rule__CompoundDialogue__Group_0_5__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2446:1: ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2447:1: ( rule__CompoundDialogue__Alternatives_0_5_1 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getAlternatives_0_5_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2448:1: ( rule__CompoundDialogue__Alternatives_0_5_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2448:2: rule__CompoundDialogue__Alternatives_0_5_1
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__Alternatives_0_5_1_in_rule__CompoundDialogue__Group_0_5__15001);
            rule__CompoundDialogue__Alternatives_0_5_1();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getAlternatives_0_5_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_5__2_in_rule__CompoundDialogue__Group_0_5__15010);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2459:1: rule__CompoundDialogue__Group_0_5__2 : ( ';' ) ;
    public final void rule__CompoundDialogue__Group_0_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2463:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2464:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2464:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2465:1: ';'
            {
             before(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_5_2()); 
            match(input,23,FOLLOW_23_in_rule__CompoundDialogue__Group_0_5__25039); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2484:1: rule__CompoundDialogue__Group_0_6__0 : ( 'dialogues' ) rule__CompoundDialogue__Group_0_6__1 ;
    public final void rule__CompoundDialogue__Group_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2488:1: ( ( 'dialogues' ) rule__CompoundDialogue__Group_0_6__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2489:1: ( 'dialogues' ) rule__CompoundDialogue__Group_0_6__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2489:1: ( 'dialogues' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2490:1: 'dialogues'
            {
             before(grammarAccess.getCompoundDialogueAccess().getDialoguesKeyword_0_6_0()); 
            match(input,36,FOLLOW_36_in_rule__CompoundDialogue__Group_0_6__05081); 
             after(grammarAccess.getCompoundDialogueAccess().getDialoguesKeyword_0_6_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__1_in_rule__CompoundDialogue__Group_0_6__05091);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2504:1: rule__CompoundDialogue__Group_0_6__1 : ( '[' ) rule__CompoundDialogue__Group_0_6__2 ;
    public final void rule__CompoundDialogue__Group_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2508:1: ( ( '[' ) rule__CompoundDialogue__Group_0_6__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2509:1: ( '[' ) rule__CompoundDialogue__Group_0_6__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2509:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2510:1: '['
            {
             before(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_6_1()); 
            match(input,25,FOLLOW_25_in_rule__CompoundDialogue__Group_0_6__15120); 
             after(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_6_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__2_in_rule__CompoundDialogue__Group_0_6__15130);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2524:1: rule__CompoundDialogue__Group_0_6__2 : ( ( rule__CompoundDialogue__Group_0_6_2__0 )* ) rule__CompoundDialogue__Group_0_6__3 ;
    public final void rule__CompoundDialogue__Group_0_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2528:1: ( ( ( rule__CompoundDialogue__Group_0_6_2__0 )* ) rule__CompoundDialogue__Group_0_6__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2529:1: ( ( rule__CompoundDialogue__Group_0_6_2__0 )* ) rule__CompoundDialogue__Group_0_6__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2529:1: ( ( rule__CompoundDialogue__Group_0_6_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2530:1: ( rule__CompoundDialogue__Group_0_6_2__0 )*
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_6_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2531:1: ( rule__CompoundDialogue__Group_0_6_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_STRING||(LA34_0>=20 && LA34_0<=21)||LA34_0==43||LA34_0==45||(LA34_0>=48 && LA34_0<=49)||LA34_0==51||LA34_0==54) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2531:2: rule__CompoundDialogue__Group_0_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6_2__0_in_rule__CompoundDialogue__Group_0_6__25158);
            	    rule__CompoundDialogue__Group_0_6_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getCompoundDialogueAccess().getGroup_0_6_2()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__3_in_rule__CompoundDialogue__Group_0_6__25168);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2542:1: rule__CompoundDialogue__Group_0_6__3 : ( ']' ) ;
    public final void rule__CompoundDialogue__Group_0_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2546:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2547:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2547:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2548:1: ']'
            {
             before(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_6_3()); 
            match(input,26,FOLLOW_26_in_rule__CompoundDialogue__Group_0_6__35197); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2569:1: rule__CompoundDialogue__Group_0_6_2__0 : ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) ) rule__CompoundDialogue__Group_0_6_2__1 ;
    public final void rule__CompoundDialogue__Group_0_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2573:1: ( ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) ) rule__CompoundDialogue__Group_0_6_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2574:1: ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) ) rule__CompoundDialogue__Group_0_6_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2574:1: ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2575:1: ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getDialoguesAssignment_0_6_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2576:1: ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2576:2: rule__CompoundDialogue__DialoguesAssignment_0_6_2_0
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__DialoguesAssignment_0_6_2_0_in_rule__CompoundDialogue__Group_0_6_2__05240);
            rule__CompoundDialogue__DialoguesAssignment_0_6_2_0();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getDialoguesAssignment_0_6_2_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6_2__1_in_rule__CompoundDialogue__Group_0_6_2__05249);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2587:1: rule__CompoundDialogue__Group_0_6_2__1 : ( ';' ) ;
    public final void rule__CompoundDialogue__Group_0_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2591:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2592:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2592:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2593:1: ';'
            {
             before(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_6_2_1()); 
            match(input,23,FOLLOW_23_in_rule__CompoundDialogue__Group_0_6_2__15278); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2610:1: rule__CompoundDialogue__Group_0_7__0 : ( 'processes' ) rule__CompoundDialogue__Group_0_7__1 ;
    public final void rule__CompoundDialogue__Group_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2614:1: ( ( 'processes' ) rule__CompoundDialogue__Group_0_7__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2615:1: ( 'processes' ) rule__CompoundDialogue__Group_0_7__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2615:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2616:1: 'processes'
            {
             before(grammarAccess.getCompoundDialogueAccess().getProcessesKeyword_0_7_0()); 
            match(input,33,FOLLOW_33_in_rule__CompoundDialogue__Group_0_7__05318); 
             after(grammarAccess.getCompoundDialogueAccess().getProcessesKeyword_0_7_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__1_in_rule__CompoundDialogue__Group_0_7__05328);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2630:1: rule__CompoundDialogue__Group_0_7__1 : ( '[' ) rule__CompoundDialogue__Group_0_7__2 ;
    public final void rule__CompoundDialogue__Group_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2634:1: ( ( '[' ) rule__CompoundDialogue__Group_0_7__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2635:1: ( '[' ) rule__CompoundDialogue__Group_0_7__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2635:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2636:1: '['
            {
             before(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_7_1()); 
            match(input,25,FOLLOW_25_in_rule__CompoundDialogue__Group_0_7__15357); 
             after(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_7_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__2_in_rule__CompoundDialogue__Group_0_7__15367);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2650:1: rule__CompoundDialogue__Group_0_7__2 : ( ( rule__CompoundDialogue__Group_0_7_2__0 )* ) rule__CompoundDialogue__Group_0_7__3 ;
    public final void rule__CompoundDialogue__Group_0_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2654:1: ( ( ( rule__CompoundDialogue__Group_0_7_2__0 )* ) rule__CompoundDialogue__Group_0_7__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2655:1: ( ( rule__CompoundDialogue__Group_0_7_2__0 )* ) rule__CompoundDialogue__Group_0_7__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2655:1: ( ( rule__CompoundDialogue__Group_0_7_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2656:1: ( rule__CompoundDialogue__Group_0_7_2__0 )*
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_7_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2657:1: ( rule__CompoundDialogue__Group_0_7_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_STRING||(LA35_0>=20 && LA35_0<=21)||LA35_0==41||LA35_0==45||(LA35_0>=48 && LA35_0<=49)||LA35_0==51||LA35_0==54) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2657:2: rule__CompoundDialogue__Group_0_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7_2__0_in_rule__CompoundDialogue__Group_0_7__25395);
            	    rule__CompoundDialogue__Group_0_7_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getCompoundDialogueAccess().getGroup_0_7_2()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__3_in_rule__CompoundDialogue__Group_0_7__25405);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2668:1: rule__CompoundDialogue__Group_0_7__3 : ( ']' ) ;
    public final void rule__CompoundDialogue__Group_0_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2672:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2673:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2673:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2674:1: ']'
            {
             before(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_7_3()); 
            match(input,26,FOLLOW_26_in_rule__CompoundDialogue__Group_0_7__35434); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2695:1: rule__CompoundDialogue__Group_0_7_2__0 : ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) ) rule__CompoundDialogue__Group_0_7_2__1 ;
    public final void rule__CompoundDialogue__Group_0_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2699:1: ( ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) ) rule__CompoundDialogue__Group_0_7_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2700:1: ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) ) rule__CompoundDialogue__Group_0_7_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2700:1: ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2701:1: ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getProcessesAssignment_0_7_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2702:1: ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2702:2: rule__CompoundDialogue__ProcessesAssignment_0_7_2_0
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__ProcessesAssignment_0_7_2_0_in_rule__CompoundDialogue__Group_0_7_2__05477);
            rule__CompoundDialogue__ProcessesAssignment_0_7_2_0();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getProcessesAssignment_0_7_2_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7_2__1_in_rule__CompoundDialogue__Group_0_7_2__05486);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2713:1: rule__CompoundDialogue__Group_0_7_2__1 : ( ';' ) ;
    public final void rule__CompoundDialogue__Group_0_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2717:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2718:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2718:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2719:1: ';'
            {
             before(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_7_2_1()); 
            match(input,23,FOLLOW_23_in_rule__CompoundDialogue__Group_0_7_2__15515); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2736:1: rule__CollectionDialogue__Group__0 : ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? ) rule__CollectionDialogue__Group__1 ;
    public final void rule__CollectionDialogue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2740:1: ( ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? ) rule__CollectionDialogue__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2741:1: ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? ) rule__CollectionDialogue__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2741:1: ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2742:1: ( rule__CollectionDialogue__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2743:1: ( rule__CollectionDialogue__DescriptionAssignment_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2743:2: rule__CollectionDialogue__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__DescriptionAssignment_0_in_rule__CollectionDialogue__Group__05554);
                    rule__CollectionDialogue__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__1_in_rule__CollectionDialogue__Group__05564);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2754:1: rule__CollectionDialogue__Group__1 : ( 'CollectionDialogue' ) rule__CollectionDialogue__Group__2 ;
    public final void rule__CollectionDialogue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2758:1: ( ( 'CollectionDialogue' ) rule__CollectionDialogue__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2759:1: ( 'CollectionDialogue' ) rule__CollectionDialogue__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2759:1: ( 'CollectionDialogue' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2760:1: 'CollectionDialogue'
            {
             before(grammarAccess.getCollectionDialogueAccess().getCollectionDialogueKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__CollectionDialogue__Group__15593); 
             after(grammarAccess.getCollectionDialogueAccess().getCollectionDialogueKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__2_in_rule__CollectionDialogue__Group__15603);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2774:1: rule__CollectionDialogue__Group__2 : ( ( rule__CollectionDialogue__NameAssignment_2 ) ) rule__CollectionDialogue__Group__3 ;
    public final void rule__CollectionDialogue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2778:1: ( ( ( rule__CollectionDialogue__NameAssignment_2 ) ) rule__CollectionDialogue__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2779:1: ( ( rule__CollectionDialogue__NameAssignment_2 ) ) rule__CollectionDialogue__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2779:1: ( ( rule__CollectionDialogue__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2780:1: ( rule__CollectionDialogue__NameAssignment_2 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2781:1: ( rule__CollectionDialogue__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2781:2: rule__CollectionDialogue__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__NameAssignment_2_in_rule__CollectionDialogue__Group__25631);
            rule__CollectionDialogue__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__3_in_rule__CollectionDialogue__Group__25640);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2792:1: rule__CollectionDialogue__Group__3 : ( 'context' ) rule__CollectionDialogue__Group__4 ;
    public final void rule__CollectionDialogue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2796:1: ( ( 'context' ) rule__CollectionDialogue__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2797:1: ( 'context' ) rule__CollectionDialogue__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2797:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2798:1: 'context'
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__CollectionDialogue__Group__35669); 
             after(grammarAccess.getCollectionDialogueAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__4_in_rule__CollectionDialogue__Group__35679);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2812:1: rule__CollectionDialogue__Group__4 : ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) ) rule__CollectionDialogue__Group__5 ;
    public final void rule__CollectionDialogue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2816:1: ( ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) ) rule__CollectionDialogue__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2817:1: ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) ) rule__CollectionDialogue__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2817:1: ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2818:1: ( rule__CollectionDialogue__ContextRefAssignment_4 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextRefAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2819:1: ( rule__CollectionDialogue__ContextRefAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2819:2: rule__CollectionDialogue__ContextRefAssignment_4
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__ContextRefAssignment_4_in_rule__CollectionDialogue__Group__45707);
            rule__CollectionDialogue__ContextRefAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getContextRefAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__5_in_rule__CollectionDialogue__Group__45716);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2830:1: rule__CollectionDialogue__Group__5 : ( '[' ) rule__CollectionDialogue__Group__6 ;
    public final void rule__CollectionDialogue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2834:1: ( ( '[' ) rule__CollectionDialogue__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2835:1: ( '[' ) rule__CollectionDialogue__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2835:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2836:1: '['
            {
             before(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__CollectionDialogue__Group__55745); 
             after(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__6_in_rule__CollectionDialogue__Group__55755);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2850:1: rule__CollectionDialogue__Group__6 : ( ( rule__CollectionDialogue__Group_6__0 )? ) rule__CollectionDialogue__Group__7 ;
    public final void rule__CollectionDialogue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2854:1: ( ( ( rule__CollectionDialogue__Group_6__0 )? ) rule__CollectionDialogue__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2855:1: ( ( rule__CollectionDialogue__Group_6__0 )? ) rule__CollectionDialogue__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2855:1: ( ( rule__CollectionDialogue__Group_6__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2856:1: ( rule__CollectionDialogue__Group_6__0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2857:1: ( rule__CollectionDialogue__Group_6__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2857:2: rule__CollectionDialogue__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__Group_6__0_in_rule__CollectionDialogue__Group__65783);
                    rule__CollectionDialogue__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getGroup_6()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__7_in_rule__CollectionDialogue__Group__65793);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2868:1: rule__CollectionDialogue__Group__7 : ( ( rule__CollectionDialogue__Group_7__0 )? ) rule__CollectionDialogue__Group__8 ;
    public final void rule__CollectionDialogue__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2872:1: ( ( ( rule__CollectionDialogue__Group_7__0 )? ) rule__CollectionDialogue__Group__8 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2873:1: ( ( rule__CollectionDialogue__Group_7__0 )? ) rule__CollectionDialogue__Group__8
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2873:1: ( ( rule__CollectionDialogue__Group_7__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2874:1: ( rule__CollectionDialogue__Group_7__0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2875:1: ( rule__CollectionDialogue__Group_7__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==36) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2875:2: rule__CollectionDialogue__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__0_in_rule__CollectionDialogue__Group__75821);
                    rule__CollectionDialogue__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getGroup_7()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__8_in_rule__CollectionDialogue__Group__75831);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2886:1: rule__CollectionDialogue__Group__8 : ( ( rule__CollectionDialogue__Group_8__0 )? ) rule__CollectionDialogue__Group__9 ;
    public final void rule__CollectionDialogue__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2890:1: ( ( ( rule__CollectionDialogue__Group_8__0 )? ) rule__CollectionDialogue__Group__9 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2891:1: ( ( rule__CollectionDialogue__Group_8__0 )? ) rule__CollectionDialogue__Group__9
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2891:1: ( ( rule__CollectionDialogue__Group_8__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2892:1: ( rule__CollectionDialogue__Group_8__0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_8()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2893:1: ( rule__CollectionDialogue__Group_8__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==33) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2893:2: rule__CollectionDialogue__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__0_in_rule__CollectionDialogue__Group__85859);
                    rule__CollectionDialogue__Group_8__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getGroup_8()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__9_in_rule__CollectionDialogue__Group__85869);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2904:1: rule__CollectionDialogue__Group__9 : ( ']' ) ;
    public final void rule__CollectionDialogue__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2908:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2909:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2909:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2910:1: ']'
            {
             before(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_9()); 
            match(input,26,FOLLOW_26_in_rule__CollectionDialogue__Group__95898); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2943:1: rule__CollectionDialogue__Group_6__0 : ( 'readonly' ) rule__CollectionDialogue__Group_6__1 ;
    public final void rule__CollectionDialogue__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2947:1: ( ( 'readonly' ) rule__CollectionDialogue__Group_6__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2948:1: ( 'readonly' ) rule__CollectionDialogue__Group_6__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2948:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2949:1: 'readonly'
            {
             before(grammarAccess.getCollectionDialogueAccess().getReadonlyKeyword_6_0()); 
            match(input,31,FOLLOW_31_in_rule__CollectionDialogue__Group_6__05954); 
             after(grammarAccess.getCollectionDialogueAccess().getReadonlyKeyword_6_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_6__1_in_rule__CollectionDialogue__Group_6__05964);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2963:1: rule__CollectionDialogue__Group_6__1 : ( ( rule__CollectionDialogue__Alternatives_6_1 ) ) rule__CollectionDialogue__Group_6__2 ;
    public final void rule__CollectionDialogue__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2967:1: ( ( ( rule__CollectionDialogue__Alternatives_6_1 ) ) rule__CollectionDialogue__Group_6__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2968:1: ( ( rule__CollectionDialogue__Alternatives_6_1 ) ) rule__CollectionDialogue__Group_6__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2968:1: ( ( rule__CollectionDialogue__Alternatives_6_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2969:1: ( rule__CollectionDialogue__Alternatives_6_1 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getAlternatives_6_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2970:1: ( rule__CollectionDialogue__Alternatives_6_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2970:2: rule__CollectionDialogue__Alternatives_6_1
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__Alternatives_6_1_in_rule__CollectionDialogue__Group_6__15992);
            rule__CollectionDialogue__Alternatives_6_1();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getAlternatives_6_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_6__2_in_rule__CollectionDialogue__Group_6__16001);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2981:1: rule__CollectionDialogue__Group_6__2 : ( ';' ) ;
    public final void rule__CollectionDialogue__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2985:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2986:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2986:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2987:1: ';'
            {
             before(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_6_2()); 
            match(input,23,FOLLOW_23_in_rule__CollectionDialogue__Group_6__26030); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3006:1: rule__CollectionDialogue__Group_7__0 : ( 'dialogues' ) rule__CollectionDialogue__Group_7__1 ;
    public final void rule__CollectionDialogue__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3010:1: ( ( 'dialogues' ) rule__CollectionDialogue__Group_7__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3011:1: ( 'dialogues' ) rule__CollectionDialogue__Group_7__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3011:1: ( 'dialogues' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3012:1: 'dialogues'
            {
             before(grammarAccess.getCollectionDialogueAccess().getDialoguesKeyword_7_0()); 
            match(input,36,FOLLOW_36_in_rule__CollectionDialogue__Group_7__06072); 
             after(grammarAccess.getCollectionDialogueAccess().getDialoguesKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__1_in_rule__CollectionDialogue__Group_7__06082);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3026:1: rule__CollectionDialogue__Group_7__1 : ( '[' ) rule__CollectionDialogue__Group_7__2 ;
    public final void rule__CollectionDialogue__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3030:1: ( ( '[' ) rule__CollectionDialogue__Group_7__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3031:1: ( '[' ) rule__CollectionDialogue__Group_7__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3031:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3032:1: '['
            {
             before(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_7_1()); 
            match(input,25,FOLLOW_25_in_rule__CollectionDialogue__Group_7__16111); 
             after(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_7_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__2_in_rule__CollectionDialogue__Group_7__16121);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3046:1: rule__CollectionDialogue__Group_7__2 : ( ( rule__CollectionDialogue__Group_7_2__0 )* ) rule__CollectionDialogue__Group_7__3 ;
    public final void rule__CollectionDialogue__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3050:1: ( ( ( rule__CollectionDialogue__Group_7_2__0 )* ) rule__CollectionDialogue__Group_7__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3051:1: ( ( rule__CollectionDialogue__Group_7_2__0 )* ) rule__CollectionDialogue__Group_7__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3051:1: ( ( rule__CollectionDialogue__Group_7_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3052:1: ( rule__CollectionDialogue__Group_7_2__0 )*
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_7_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3053:1: ( rule__CollectionDialogue__Group_7_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_STRING||(LA40_0>=20 && LA40_0<=21)||LA40_0==43||LA40_0==45||(LA40_0>=48 && LA40_0<=49)||LA40_0==51||LA40_0==54) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3053:2: rule__CollectionDialogue__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CollectionDialogue__Group_7_2__0_in_rule__CollectionDialogue__Group_7__26149);
            	    rule__CollectionDialogue__Group_7_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getCollectionDialogueAccess().getGroup_7_2()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__3_in_rule__CollectionDialogue__Group_7__26159);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3064:1: rule__CollectionDialogue__Group_7__3 : ( ']' ) ;
    public final void rule__CollectionDialogue__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3068:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3069:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3069:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3070:1: ']'
            {
             before(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_7_3()); 
            match(input,26,FOLLOW_26_in_rule__CollectionDialogue__Group_7__36188); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3091:1: rule__CollectionDialogue__Group_7_2__0 : ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) ) rule__CollectionDialogue__Group_7_2__1 ;
    public final void rule__CollectionDialogue__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3095:1: ( ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) ) rule__CollectionDialogue__Group_7_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3096:1: ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) ) rule__CollectionDialogue__Group_7_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3096:1: ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3097:1: ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getDialoguesAssignment_7_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3098:1: ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3098:2: rule__CollectionDialogue__DialoguesAssignment_7_2_0
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__DialoguesAssignment_7_2_0_in_rule__CollectionDialogue__Group_7_2__06231);
            rule__CollectionDialogue__DialoguesAssignment_7_2_0();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getDialoguesAssignment_7_2_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7_2__1_in_rule__CollectionDialogue__Group_7_2__06240);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3109:1: rule__CollectionDialogue__Group_7_2__1 : ( ';' ) ;
    public final void rule__CollectionDialogue__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3113:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3114:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3114:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3115:1: ';'
            {
             before(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_7_2_1()); 
            match(input,23,FOLLOW_23_in_rule__CollectionDialogue__Group_7_2__16269); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3132:1: rule__CollectionDialogue__Group_8__0 : ( 'processes' ) rule__CollectionDialogue__Group_8__1 ;
    public final void rule__CollectionDialogue__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3136:1: ( ( 'processes' ) rule__CollectionDialogue__Group_8__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3137:1: ( 'processes' ) rule__CollectionDialogue__Group_8__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3137:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3138:1: 'processes'
            {
             before(grammarAccess.getCollectionDialogueAccess().getProcessesKeyword_8_0()); 
            match(input,33,FOLLOW_33_in_rule__CollectionDialogue__Group_8__06309); 
             after(grammarAccess.getCollectionDialogueAccess().getProcessesKeyword_8_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__1_in_rule__CollectionDialogue__Group_8__06319);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3152:1: rule__CollectionDialogue__Group_8__1 : ( '[' ) rule__CollectionDialogue__Group_8__2 ;
    public final void rule__CollectionDialogue__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3156:1: ( ( '[' ) rule__CollectionDialogue__Group_8__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3157:1: ( '[' ) rule__CollectionDialogue__Group_8__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3157:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3158:1: '['
            {
             before(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_8_1()); 
            match(input,25,FOLLOW_25_in_rule__CollectionDialogue__Group_8__16348); 
             after(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_8_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__2_in_rule__CollectionDialogue__Group_8__16358);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3172:1: rule__CollectionDialogue__Group_8__2 : ( ( rule__CollectionDialogue__Group_8_2__0 )* ) rule__CollectionDialogue__Group_8__3 ;
    public final void rule__CollectionDialogue__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3176:1: ( ( ( rule__CollectionDialogue__Group_8_2__0 )* ) rule__CollectionDialogue__Group_8__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3177:1: ( ( rule__CollectionDialogue__Group_8_2__0 )* ) rule__CollectionDialogue__Group_8__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3177:1: ( ( rule__CollectionDialogue__Group_8_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3178:1: ( rule__CollectionDialogue__Group_8_2__0 )*
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_8_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3179:1: ( rule__CollectionDialogue__Group_8_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_STRING||(LA41_0>=20 && LA41_0<=21)||LA41_0==41||LA41_0==45||(LA41_0>=48 && LA41_0<=49)||LA41_0==51||LA41_0==54) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3179:2: rule__CollectionDialogue__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CollectionDialogue__Group_8_2__0_in_rule__CollectionDialogue__Group_8__26386);
            	    rule__CollectionDialogue__Group_8_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getCollectionDialogueAccess().getGroup_8_2()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__3_in_rule__CollectionDialogue__Group_8__26396);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3190:1: rule__CollectionDialogue__Group_8__3 : ( ']' ) ;
    public final void rule__CollectionDialogue__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3194:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3195:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3195:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3196:1: ']'
            {
             before(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_8_3()); 
            match(input,26,FOLLOW_26_in_rule__CollectionDialogue__Group_8__36425); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3217:1: rule__CollectionDialogue__Group_8_2__0 : ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) ) rule__CollectionDialogue__Group_8_2__1 ;
    public final void rule__CollectionDialogue__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3221:1: ( ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) ) rule__CollectionDialogue__Group_8_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3222:1: ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) ) rule__CollectionDialogue__Group_8_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3222:1: ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3223:1: ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getProcessesAssignment_8_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3224:1: ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3224:2: rule__CollectionDialogue__ProcessesAssignment_8_2_0
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__ProcessesAssignment_8_2_0_in_rule__CollectionDialogue__Group_8_2__06468);
            rule__CollectionDialogue__ProcessesAssignment_8_2_0();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getProcessesAssignment_8_2_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8_2__1_in_rule__CollectionDialogue__Group_8_2__06477);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3235:1: rule__CollectionDialogue__Group_8_2__1 : ( ';' ) ;
    public final void rule__CollectionDialogue__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3239:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3240:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3240:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3241:1: ';'
            {
             before(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_8_2_1()); 
            match(input,23,FOLLOW_23_in_rule__CollectionDialogue__Group_8_2__16506); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3258:1: rule__MasterDetail__Group__0 : ( ( rule__MasterDetail__DescriptionAssignment_0 )? ) rule__MasterDetail__Group__1 ;
    public final void rule__MasterDetail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3262:1: ( ( ( rule__MasterDetail__DescriptionAssignment_0 )? ) rule__MasterDetail__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3263:1: ( ( rule__MasterDetail__DescriptionAssignment_0 )? ) rule__MasterDetail__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3263:1: ( ( rule__MasterDetail__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3264:1: ( rule__MasterDetail__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getMasterDetailAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3265:1: ( rule__MasterDetail__DescriptionAssignment_0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3265:2: rule__MasterDetail__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__MasterDetail__DescriptionAssignment_0_in_rule__MasterDetail__Group__06545);
                    rule__MasterDetail__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMasterDetailAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__1_in_rule__MasterDetail__Group__06555);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3276:1: rule__MasterDetail__Group__1 : ( 'MasterDetail' ) rule__MasterDetail__Group__2 ;
    public final void rule__MasterDetail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3280:1: ( ( 'MasterDetail' ) rule__MasterDetail__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3281:1: ( 'MasterDetail' ) rule__MasterDetail__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3281:1: ( 'MasterDetail' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3282:1: 'MasterDetail'
            {
             before(grammarAccess.getMasterDetailAccess().getMasterDetailKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__MasterDetail__Group__16584); 
             after(grammarAccess.getMasterDetailAccess().getMasterDetailKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__2_in_rule__MasterDetail__Group__16594);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3296:1: rule__MasterDetail__Group__2 : ( ( rule__MasterDetail__NameAssignment_2 ) ) rule__MasterDetail__Group__3 ;
    public final void rule__MasterDetail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3300:1: ( ( ( rule__MasterDetail__NameAssignment_2 ) ) rule__MasterDetail__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3301:1: ( ( rule__MasterDetail__NameAssignment_2 ) ) rule__MasterDetail__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3301:1: ( ( rule__MasterDetail__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3302:1: ( rule__MasterDetail__NameAssignment_2 )
            {
             before(grammarAccess.getMasterDetailAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3303:1: ( rule__MasterDetail__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3303:2: rule__MasterDetail__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MasterDetail__NameAssignment_2_in_rule__MasterDetail__Group__26622);
            rule__MasterDetail__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__3_in_rule__MasterDetail__Group__26631);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3314:1: rule__MasterDetail__Group__3 : ( 'context' ) rule__MasterDetail__Group__4 ;
    public final void rule__MasterDetail__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3318:1: ( ( 'context' ) rule__MasterDetail__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3319:1: ( 'context' ) rule__MasterDetail__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3319:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3320:1: 'context'
            {
             before(grammarAccess.getMasterDetailAccess().getContextKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__MasterDetail__Group__36660); 
             after(grammarAccess.getMasterDetailAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__4_in_rule__MasterDetail__Group__36670);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3334:1: rule__MasterDetail__Group__4 : ( ( rule__MasterDetail__ContextRefAssignment_4 ) ) rule__MasterDetail__Group__5 ;
    public final void rule__MasterDetail__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3338:1: ( ( ( rule__MasterDetail__ContextRefAssignment_4 ) ) rule__MasterDetail__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3339:1: ( ( rule__MasterDetail__ContextRefAssignment_4 ) ) rule__MasterDetail__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3339:1: ( ( rule__MasterDetail__ContextRefAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3340:1: ( rule__MasterDetail__ContextRefAssignment_4 )
            {
             before(grammarAccess.getMasterDetailAccess().getContextRefAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3341:1: ( rule__MasterDetail__ContextRefAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3341:2: rule__MasterDetail__ContextRefAssignment_4
            {
            pushFollow(FOLLOW_rule__MasterDetail__ContextRefAssignment_4_in_rule__MasterDetail__Group__46698);
            rule__MasterDetail__ContextRefAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getContextRefAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__5_in_rule__MasterDetail__Group__46707);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3352:1: rule__MasterDetail__Group__5 : ( ( rule__MasterDetail__Group_5__0 )? ) rule__MasterDetail__Group__6 ;
    public final void rule__MasterDetail__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3356:1: ( ( ( rule__MasterDetail__Group_5__0 )? ) rule__MasterDetail__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3357:1: ( ( rule__MasterDetail__Group_5__0 )? ) rule__MasterDetail__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3357:1: ( ( rule__MasterDetail__Group_5__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3358:1: ( rule__MasterDetail__Group_5__0 )?
            {
             before(grammarAccess.getMasterDetailAccess().getGroup_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3359:1: ( rule__MasterDetail__Group_5__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==31) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3359:2: rule__MasterDetail__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__MasterDetail__Group_5__0_in_rule__MasterDetail__Group__56735);
                    rule__MasterDetail__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMasterDetailAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__6_in_rule__MasterDetail__Group__56745);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3370:1: rule__MasterDetail__Group__6 : ( 'master' ) rule__MasterDetail__Group__7 ;
    public final void rule__MasterDetail__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3374:1: ( ( 'master' ) rule__MasterDetail__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3375:1: ( 'master' ) rule__MasterDetail__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3375:1: ( 'master' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3376:1: 'master'
            {
             before(grammarAccess.getMasterDetailAccess().getMasterKeyword_6()); 
            match(input,39,FOLLOW_39_in_rule__MasterDetail__Group__66774); 
             after(grammarAccess.getMasterDetailAccess().getMasterKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__7_in_rule__MasterDetail__Group__66784);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3390:1: rule__MasterDetail__Group__7 : ( ( rule__MasterDetail__MasterAssignment_7 ) ) rule__MasterDetail__Group__8 ;
    public final void rule__MasterDetail__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3394:1: ( ( ( rule__MasterDetail__MasterAssignment_7 ) ) rule__MasterDetail__Group__8 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3395:1: ( ( rule__MasterDetail__MasterAssignment_7 ) ) rule__MasterDetail__Group__8
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3395:1: ( ( rule__MasterDetail__MasterAssignment_7 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3396:1: ( rule__MasterDetail__MasterAssignment_7 )
            {
             before(grammarAccess.getMasterDetailAccess().getMasterAssignment_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3397:1: ( rule__MasterDetail__MasterAssignment_7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3397:2: rule__MasterDetail__MasterAssignment_7
            {
            pushFollow(FOLLOW_rule__MasterDetail__MasterAssignment_7_in_rule__MasterDetail__Group__76812);
            rule__MasterDetail__MasterAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getMasterAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__8_in_rule__MasterDetail__Group__76821);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3408:1: rule__MasterDetail__Group__8 : ( ';' ) rule__MasterDetail__Group__9 ;
    public final void rule__MasterDetail__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3412:1: ( ( ';' ) rule__MasterDetail__Group__9 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3413:1: ( ';' ) rule__MasterDetail__Group__9
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3413:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3414:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_8()); 
            match(input,23,FOLLOW_23_in_rule__MasterDetail__Group__86850); 
             after(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__9_in_rule__MasterDetail__Group__86860);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3428:1: rule__MasterDetail__Group__9 : ( 'detail' ) rule__MasterDetail__Group__10 ;
    public final void rule__MasterDetail__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3432:1: ( ( 'detail' ) rule__MasterDetail__Group__10 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3433:1: ( 'detail' ) rule__MasterDetail__Group__10
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3433:1: ( 'detail' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3434:1: 'detail'
            {
             before(grammarAccess.getMasterDetailAccess().getDetailKeyword_9()); 
            match(input,40,FOLLOW_40_in_rule__MasterDetail__Group__96889); 
             after(grammarAccess.getMasterDetailAccess().getDetailKeyword_9()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__10_in_rule__MasterDetail__Group__96899);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3448:1: rule__MasterDetail__Group__10 : ( ( rule__MasterDetail__DetailAssignment_10 ) ) rule__MasterDetail__Group__11 ;
    public final void rule__MasterDetail__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3452:1: ( ( ( rule__MasterDetail__DetailAssignment_10 ) ) rule__MasterDetail__Group__11 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3453:1: ( ( rule__MasterDetail__DetailAssignment_10 ) ) rule__MasterDetail__Group__11
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3453:1: ( ( rule__MasterDetail__DetailAssignment_10 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3454:1: ( rule__MasterDetail__DetailAssignment_10 )
            {
             before(grammarAccess.getMasterDetailAccess().getDetailAssignment_10()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3455:1: ( rule__MasterDetail__DetailAssignment_10 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3455:2: rule__MasterDetail__DetailAssignment_10
            {
            pushFollow(FOLLOW_rule__MasterDetail__DetailAssignment_10_in_rule__MasterDetail__Group__106927);
            rule__MasterDetail__DetailAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getDetailAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__11_in_rule__MasterDetail__Group__106936);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3466:1: rule__MasterDetail__Group__11 : ( ';' ) rule__MasterDetail__Group__12 ;
    public final void rule__MasterDetail__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3470:1: ( ( ';' ) rule__MasterDetail__Group__12 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3471:1: ( ';' ) rule__MasterDetail__Group__12
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3471:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3472:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_11()); 
            match(input,23,FOLLOW_23_in_rule__MasterDetail__Group__116965); 
             after(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_11()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__12_in_rule__MasterDetail__Group__116975);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3486:1: rule__MasterDetail__Group__12 : ( ( rule__MasterDetail__Group_12__0 )? ) ;
    public final void rule__MasterDetail__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3490:1: ( ( ( rule__MasterDetail__Group_12__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3491:1: ( ( rule__MasterDetail__Group_12__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3491:1: ( ( rule__MasterDetail__Group_12__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3492:1: ( rule__MasterDetail__Group_12__0 )?
            {
             before(grammarAccess.getMasterDetailAccess().getGroup_12()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3493:1: ( rule__MasterDetail__Group_12__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==33) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3493:2: rule__MasterDetail__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__MasterDetail__Group_12__0_in_rule__MasterDetail__Group__127003);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3529:1: rule__MasterDetail__Group_5__0 : ( 'readonly' ) rule__MasterDetail__Group_5__1 ;
    public final void rule__MasterDetail__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3533:1: ( ( 'readonly' ) rule__MasterDetail__Group_5__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3534:1: ( 'readonly' ) rule__MasterDetail__Group_5__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3534:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3535:1: 'readonly'
            {
             before(grammarAccess.getMasterDetailAccess().getReadonlyKeyword_5_0()); 
            match(input,31,FOLLOW_31_in_rule__MasterDetail__Group_5__07065); 
             after(grammarAccess.getMasterDetailAccess().getReadonlyKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_5__1_in_rule__MasterDetail__Group_5__07075);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3549:1: rule__MasterDetail__Group_5__1 : ( ( rule__MasterDetail__Alternatives_5_1 ) ) rule__MasterDetail__Group_5__2 ;
    public final void rule__MasterDetail__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3553:1: ( ( ( rule__MasterDetail__Alternatives_5_1 ) ) rule__MasterDetail__Group_5__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3554:1: ( ( rule__MasterDetail__Alternatives_5_1 ) ) rule__MasterDetail__Group_5__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3554:1: ( ( rule__MasterDetail__Alternatives_5_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3555:1: ( rule__MasterDetail__Alternatives_5_1 )
            {
             before(grammarAccess.getMasterDetailAccess().getAlternatives_5_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3556:1: ( rule__MasterDetail__Alternatives_5_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3556:2: rule__MasterDetail__Alternatives_5_1
            {
            pushFollow(FOLLOW_rule__MasterDetail__Alternatives_5_1_in_rule__MasterDetail__Group_5__17103);
            rule__MasterDetail__Alternatives_5_1();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getAlternatives_5_1()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_5__2_in_rule__MasterDetail__Group_5__17112);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3567:1: rule__MasterDetail__Group_5__2 : ( ';' ) ;
    public final void rule__MasterDetail__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3571:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3572:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3572:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3573:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_5_2()); 
            match(input,23,FOLLOW_23_in_rule__MasterDetail__Group_5__27141); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3592:1: rule__MasterDetail__Group_12__0 : ( 'processes' ) rule__MasterDetail__Group_12__1 ;
    public final void rule__MasterDetail__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3596:1: ( ( 'processes' ) rule__MasterDetail__Group_12__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3597:1: ( 'processes' ) rule__MasterDetail__Group_12__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3597:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3598:1: 'processes'
            {
             before(grammarAccess.getMasterDetailAccess().getProcessesKeyword_12_0()); 
            match(input,33,FOLLOW_33_in_rule__MasterDetail__Group_12__07183); 
             after(grammarAccess.getMasterDetailAccess().getProcessesKeyword_12_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_12__1_in_rule__MasterDetail__Group_12__07193);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3612:1: rule__MasterDetail__Group_12__1 : ( '[' ) rule__MasterDetail__Group_12__2 ;
    public final void rule__MasterDetail__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3616:1: ( ( '[' ) rule__MasterDetail__Group_12__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3617:1: ( '[' ) rule__MasterDetail__Group_12__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3617:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3618:1: '['
            {
             before(grammarAccess.getMasterDetailAccess().getLeftSquareBracketKeyword_12_1()); 
            match(input,25,FOLLOW_25_in_rule__MasterDetail__Group_12__17222); 
             after(grammarAccess.getMasterDetailAccess().getLeftSquareBracketKeyword_12_1()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_12__2_in_rule__MasterDetail__Group_12__17232);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3632:1: rule__MasterDetail__Group_12__2 : ( ( rule__MasterDetail__Group_12_2__0 )* ) rule__MasterDetail__Group_12__3 ;
    public final void rule__MasterDetail__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3636:1: ( ( ( rule__MasterDetail__Group_12_2__0 )* ) rule__MasterDetail__Group_12__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3637:1: ( ( rule__MasterDetail__Group_12_2__0 )* ) rule__MasterDetail__Group_12__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3637:1: ( ( rule__MasterDetail__Group_12_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3638:1: ( rule__MasterDetail__Group_12_2__0 )*
            {
             before(grammarAccess.getMasterDetailAccess().getGroup_12_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3639:1: ( rule__MasterDetail__Group_12_2__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_STRING||(LA45_0>=20 && LA45_0<=21)||LA45_0==41||LA45_0==45||(LA45_0>=48 && LA45_0<=49)||LA45_0==51||LA45_0==54) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3639:2: rule__MasterDetail__Group_12_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MasterDetail__Group_12_2__0_in_rule__MasterDetail__Group_12__27260);
            	    rule__MasterDetail__Group_12_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getMasterDetailAccess().getGroup_12_2()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_12__3_in_rule__MasterDetail__Group_12__27270);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3650:1: rule__MasterDetail__Group_12__3 : ( ']' ) ;
    public final void rule__MasterDetail__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3654:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3655:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3655:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3656:1: ']'
            {
             before(grammarAccess.getMasterDetailAccess().getRightSquareBracketKeyword_12_3()); 
            match(input,26,FOLLOW_26_in_rule__MasterDetail__Group_12__37299); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3677:1: rule__MasterDetail__Group_12_2__0 : ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) ) rule__MasterDetail__Group_12_2__1 ;
    public final void rule__MasterDetail__Group_12_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3681:1: ( ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) ) rule__MasterDetail__Group_12_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3682:1: ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) ) rule__MasterDetail__Group_12_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3682:1: ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3683:1: ( rule__MasterDetail__ProcessesAssignment_12_2_0 )
            {
             before(grammarAccess.getMasterDetailAccess().getProcessesAssignment_12_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3684:1: ( rule__MasterDetail__ProcessesAssignment_12_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3684:2: rule__MasterDetail__ProcessesAssignment_12_2_0
            {
            pushFollow(FOLLOW_rule__MasterDetail__ProcessesAssignment_12_2_0_in_rule__MasterDetail__Group_12_2__07342);
            rule__MasterDetail__ProcessesAssignment_12_2_0();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getProcessesAssignment_12_2_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_12_2__1_in_rule__MasterDetail__Group_12_2__07351);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3695:1: rule__MasterDetail__Group_12_2__1 : ( ';' ) ;
    public final void rule__MasterDetail__Group_12_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3699:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3700:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3700:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3701:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_12_2_1()); 
            match(input,23,FOLLOW_23_in_rule__MasterDetail__Group_12_2__17380); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3718:1: rule__Process__Group__0 : ( ( rule__Process__DescriptionAssignment_0 )? ) rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3722:1: ( ( ( rule__Process__DescriptionAssignment_0 )? ) rule__Process__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3723:1: ( ( rule__Process__DescriptionAssignment_0 )? ) rule__Process__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3723:1: ( ( rule__Process__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3724:1: ( rule__Process__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getProcessAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3725:1: ( rule__Process__DescriptionAssignment_0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_STRING) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3725:2: rule__Process__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Process__DescriptionAssignment_0_in_rule__Process__Group__07419);
                    rule__Process__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__1_in_rule__Process__Group__07429);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3736:1: rule__Process__Group__1 : ( 'process' ) rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3740:1: ( ( 'process' ) rule__Process__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3741:1: ( 'process' ) rule__Process__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3741:1: ( 'process' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3742:1: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__Process__Group__17458); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__2_in_rule__Process__Group__17468);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3756:1: rule__Process__Group__2 : ( ( rule__Process__NameAssignment_2 ) ) rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3760:1: ( ( ( rule__Process__NameAssignment_2 ) ) rule__Process__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3761:1: ( ( rule__Process__NameAssignment_2 ) ) rule__Process__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3761:1: ( ( rule__Process__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3762:1: ( rule__Process__NameAssignment_2 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3763:1: ( rule__Process__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3763:2: rule__Process__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Process__NameAssignment_2_in_rule__Process__Group__27496);
            rule__Process__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__3_in_rule__Process__Group__27505);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3774:1: rule__Process__Group__3 : ( 'context' ) rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3778:1: ( ( 'context' ) rule__Process__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3779:1: ( 'context' ) rule__Process__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3779:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3780:1: 'context'
            {
             before(grammarAccess.getProcessAccess().getContextKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Process__Group__37534); 
             after(grammarAccess.getProcessAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__4_in_rule__Process__Group__37544);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3794:1: rule__Process__Group__4 : ( ( rule__Process__CollectionContextAssignment_4 )? ) rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3798:1: ( ( ( rule__Process__CollectionContextAssignment_4 )? ) rule__Process__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3799:1: ( ( rule__Process__CollectionContextAssignment_4 )? ) rule__Process__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3799:1: ( ( rule__Process__CollectionContextAssignment_4 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3800:1: ( rule__Process__CollectionContextAssignment_4 )?
            {
             before(grammarAccess.getProcessAccess().getCollectionContextAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3801:1: ( rule__Process__CollectionContextAssignment_4 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==52) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3801:2: rule__Process__CollectionContextAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Process__CollectionContextAssignment_4_in_rule__Process__Group__47572);
                    rule__Process__CollectionContextAssignment_4();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getCollectionContextAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__5_in_rule__Process__Group__47582);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3812:1: rule__Process__Group__5 : ( ( rule__Process__ContextRefAssignment_5 ) ) rule__Process__Group__6 ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3816:1: ( ( ( rule__Process__ContextRefAssignment_5 ) ) rule__Process__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3817:1: ( ( rule__Process__ContextRefAssignment_5 ) ) rule__Process__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3817:1: ( ( rule__Process__ContextRefAssignment_5 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3818:1: ( rule__Process__ContextRefAssignment_5 )
            {
             before(grammarAccess.getProcessAccess().getContextRefAssignment_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3819:1: ( rule__Process__ContextRefAssignment_5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3819:2: rule__Process__ContextRefAssignment_5
            {
            pushFollow(FOLLOW_rule__Process__ContextRefAssignment_5_in_rule__Process__Group__57610);
            rule__Process__ContextRefAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getContextRefAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__6_in_rule__Process__Group__57619);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3830:1: rule__Process__Group__6 : ( '[' ) rule__Process__Group__7 ;
    public final void rule__Process__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3834:1: ( ( '[' ) rule__Process__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3835:1: ( '[' ) rule__Process__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3835:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3836:1: '['
            {
             before(grammarAccess.getProcessAccess().getLeftSquareBracketKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__Process__Group__67648); 
             after(grammarAccess.getProcessAccess().getLeftSquareBracketKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__7_in_rule__Process__Group__67658);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3850:1: rule__Process__Group__7 : ( ( rule__Process__Alternatives_7 )? ) rule__Process__Group__8 ;
    public final void rule__Process__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3854:1: ( ( ( rule__Process__Alternatives_7 )? ) rule__Process__Group__8 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3855:1: ( ( rule__Process__Alternatives_7 )? ) rule__Process__Group__8
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3855:1: ( ( rule__Process__Alternatives_7 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3856:1: ( rule__Process__Alternatives_7 )?
            {
             before(grammarAccess.getProcessAccess().getAlternatives_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3857:1: ( rule__Process__Alternatives_7 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==11||(LA48_0>=13 && LA48_0<=19)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3857:2: rule__Process__Alternatives_7
                    {
                    pushFollow(FOLLOW_rule__Process__Alternatives_7_in_rule__Process__Group__77686);
                    rule__Process__Alternatives_7();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getAlternatives_7()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__8_in_rule__Process__Group__77696);
            rule__Process__Group__8();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__Process__Group__8
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3868:1: rule__Process__Group__8 : ( ( rule__Process__Group_8__0 )* ) rule__Process__Group__9 ;
    public final void rule__Process__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3872:1: ( ( ( rule__Process__Group_8__0 )* ) rule__Process__Group__9 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3873:1: ( ( rule__Process__Group_8__0 )* ) rule__Process__Group__9
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3873:1: ( ( rule__Process__Group_8__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3874:1: ( rule__Process__Group_8__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_8()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3875:1: ( rule__Process__Group_8__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_STRING||(LA49_0>=20 && LA49_0<=21)||LA49_0==41||LA49_0==43||LA49_0==45||(LA49_0>=48 && LA49_0<=49)||LA49_0==51||LA49_0==54) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3875:2: rule__Process__Group_8__0
            	    {
            	    pushFollow(FOLLOW_rule__Process__Group_8__0_in_rule__Process__Group__87724);
            	    rule__Process__Group_8__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_8()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__9_in_rule__Process__Group__87734);
            rule__Process__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group__8


    // $ANTLR start rule__Process__Group__9
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3886:1: rule__Process__Group__9 : ( ']' ) ;
    public final void rule__Process__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3890:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3891:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3891:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3892:1: ']'
            {
             before(grammarAccess.getProcessAccess().getRightSquareBracketKeyword_9()); 
            match(input,26,FOLLOW_26_in_rule__Process__Group__97763); 
             after(grammarAccess.getProcessAccess().getRightSquareBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group__9


    // $ANTLR start rule__Process__Group_7_1__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3925:1: rule__Process__Group_7_1__0 : ( ( rule__Process__TypeAssignment_7_1_0 ) ) rule__Process__Group_7_1__1 ;
    public final void rule__Process__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3929:1: ( ( ( rule__Process__TypeAssignment_7_1_0 ) ) rule__Process__Group_7_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3930:1: ( ( rule__Process__TypeAssignment_7_1_0 ) ) rule__Process__Group_7_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3930:1: ( ( rule__Process__TypeAssignment_7_1_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3931:1: ( rule__Process__TypeAssignment_7_1_0 )
            {
             before(grammarAccess.getProcessAccess().getTypeAssignment_7_1_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3932:1: ( rule__Process__TypeAssignment_7_1_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3932:2: rule__Process__TypeAssignment_7_1_0
            {
            pushFollow(FOLLOW_rule__Process__TypeAssignment_7_1_0_in_rule__Process__Group_7_1__07818);
            rule__Process__TypeAssignment_7_1_0();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getTypeAssignment_7_1_0()); 

            }

            pushFollow(FOLLOW_rule__Process__Group_7_1__1_in_rule__Process__Group_7_1__07827);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3943:1: rule__Process__Group_7_1__1 : ( ( rule__Process__LinkAssignment_7_1_1 ) ) ;
    public final void rule__Process__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3947:1: ( ( ( rule__Process__LinkAssignment_7_1_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3948:1: ( ( rule__Process__LinkAssignment_7_1_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3948:1: ( ( rule__Process__LinkAssignment_7_1_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3949:1: ( rule__Process__LinkAssignment_7_1_1 )
            {
             before(grammarAccess.getProcessAccess().getLinkAssignment_7_1_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3950:1: ( rule__Process__LinkAssignment_7_1_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3950:2: rule__Process__LinkAssignment_7_1_1
            {
            pushFollow(FOLLOW_rule__Process__LinkAssignment_7_1_1_in_rule__Process__Group_7_1__17855);
            rule__Process__LinkAssignment_7_1_1();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getLinkAssignment_7_1_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Process__Group_8__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3964:1: rule__Process__Group_8__0 : ( ( rule__Process__ProcessElementsAssignment_8_0 ) ) rule__Process__Group_8__1 ;
    public final void rule__Process__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3968:1: ( ( ( rule__Process__ProcessElementsAssignment_8_0 ) ) rule__Process__Group_8__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3969:1: ( ( rule__Process__ProcessElementsAssignment_8_0 ) ) rule__Process__Group_8__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3969:1: ( ( rule__Process__ProcessElementsAssignment_8_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3970:1: ( rule__Process__ProcessElementsAssignment_8_0 )
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_8_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3971:1: ( rule__Process__ProcessElementsAssignment_8_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3971:2: rule__Process__ProcessElementsAssignment_8_0
            {
            pushFollow(FOLLOW_rule__Process__ProcessElementsAssignment_8_0_in_rule__Process__Group_8__07893);
            rule__Process__ProcessElementsAssignment_8_0();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_8_0()); 

            }

            pushFollow(FOLLOW_rule__Process__Group_8__1_in_rule__Process__Group_8__07902);
            rule__Process__Group_8__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_8__0


    // $ANTLR start rule__Process__Group_8__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3982:1: rule__Process__Group_8__1 : ( ';' ) ;
    public final void rule__Process__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3986:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3987:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3987:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3988:1: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_8_1()); 
            match(input,23,FOLLOW_23_in_rule__Process__Group_8__17931); 
             after(grammarAccess.getProcessAccess().getSemicolonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_8__1


    // $ANTLR start rule__FormElement__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4005:1: rule__FormElement__Group__0 : ( ( rule__FormElement__DescriptionAssignment_0 )? ) rule__FormElement__Group__1 ;
    public final void rule__FormElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4009:1: ( ( ( rule__FormElement__DescriptionAssignment_0 )? ) rule__FormElement__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4010:1: ( ( rule__FormElement__DescriptionAssignment_0 )? ) rule__FormElement__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4010:1: ( ( rule__FormElement__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4011:1: ( rule__FormElement__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getFormElementAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4012:1: ( rule__FormElement__DescriptionAssignment_0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_STRING) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4012:2: rule__FormElement__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FormElement__DescriptionAssignment_0_in_rule__FormElement__Group__07970);
                    rule__FormElement__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormElementAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__1_in_rule__FormElement__Group__07980);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4023:1: rule__FormElement__Group__1 : ( 'element' ) rule__FormElement__Group__2 ;
    public final void rule__FormElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4027:1: ( ( 'element' ) rule__FormElement__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4028:1: ( 'element' ) rule__FormElement__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4028:1: ( 'element' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4029:1: 'element'
            {
             before(grammarAccess.getFormElementAccess().getElementKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__FormElement__Group__18009); 
             after(grammarAccess.getFormElementAccess().getElementKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__2_in_rule__FormElement__Group__18019);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4043:1: rule__FormElement__Group__2 : ( ( rule__FormElement__ReferencesAssignment_2 ) ) rule__FormElement__Group__3 ;
    public final void rule__FormElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4047:1: ( ( ( rule__FormElement__ReferencesAssignment_2 ) ) rule__FormElement__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4048:1: ( ( rule__FormElement__ReferencesAssignment_2 ) ) rule__FormElement__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4048:1: ( ( rule__FormElement__ReferencesAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4049:1: ( rule__FormElement__ReferencesAssignment_2 )
            {
             before(grammarAccess.getFormElementAccess().getReferencesAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4050:1: ( rule__FormElement__ReferencesAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4050:2: rule__FormElement__ReferencesAssignment_2
            {
            pushFollow(FOLLOW_rule__FormElement__ReferencesAssignment_2_in_rule__FormElement__Group__28047);
            rule__FormElement__ReferencesAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFormElementAccess().getReferencesAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__3_in_rule__FormElement__Group__28056);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4061:1: rule__FormElement__Group__3 : ( ( rule__FormElement__Group_3__0 )? ) rule__FormElement__Group__4 ;
    public final void rule__FormElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4065:1: ( ( ( rule__FormElement__Group_3__0 )? ) rule__FormElement__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4066:1: ( ( rule__FormElement__Group_3__0 )? ) rule__FormElement__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4066:1: ( ( rule__FormElement__Group_3__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4067:1: ( rule__FormElement__Group_3__0 )?
            {
             before(grammarAccess.getFormElementAccess().getGroup_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4068:1: ( rule__FormElement__Group_3__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==34) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4068:2: rule__FormElement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FormElement__Group_3__0_in_rule__FormElement__Group__38084);
                    rule__FormElement__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormElementAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__4_in_rule__FormElement__Group__38094);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4079:1: rule__FormElement__Group__4 : ( ( rule__FormElement__Group_4__0 )? ) rule__FormElement__Group__5 ;
    public final void rule__FormElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4083:1: ( ( ( rule__FormElement__Group_4__0 )? ) rule__FormElement__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4084:1: ( ( rule__FormElement__Group_4__0 )? ) rule__FormElement__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4084:1: ( ( rule__FormElement__Group_4__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4085:1: ( rule__FormElement__Group_4__0 )?
            {
             before(grammarAccess.getFormElementAccess().getGroup_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4086:1: ( rule__FormElement__Group_4__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==31) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4086:2: rule__FormElement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__FormElement__Group_4__0_in_rule__FormElement__Group__48122);
                    rule__FormElement__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormElementAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__5_in_rule__FormElement__Group__48132);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4097:1: rule__FormElement__Group__5 : ( ';' ) ;
    public final void rule__FormElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4101:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4102:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4102:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4103:1: ';'
            {
             before(grammarAccess.getFormElementAccess().getSemicolonKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__FormElement__Group__58161); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4128:1: rule__FormElement__Group_3__0 : ( 'label' ) rule__FormElement__Group_3__1 ;
    public final void rule__FormElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4132:1: ( ( 'label' ) rule__FormElement__Group_3__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4133:1: ( 'label' ) rule__FormElement__Group_3__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4133:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4134:1: 'label'
            {
             before(grammarAccess.getFormElementAccess().getLabelKeyword_3_0()); 
            match(input,34,FOLLOW_34_in_rule__FormElement__Group_3__08209); 
             after(grammarAccess.getFormElementAccess().getLabelKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group_3__1_in_rule__FormElement__Group_3__08219);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4148:1: rule__FormElement__Group_3__1 : ( ( rule__FormElement__LabelAssignment_3_1 ) ) ;
    public final void rule__FormElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4152:1: ( ( ( rule__FormElement__LabelAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4153:1: ( ( rule__FormElement__LabelAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4153:1: ( ( rule__FormElement__LabelAssignment_3_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4154:1: ( rule__FormElement__LabelAssignment_3_1 )
            {
             before(grammarAccess.getFormElementAccess().getLabelAssignment_3_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4155:1: ( rule__FormElement__LabelAssignment_3_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4155:2: rule__FormElement__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__FormElement__LabelAssignment_3_1_in_rule__FormElement__Group_3__18247);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4169:1: rule__FormElement__Group_4__0 : ( 'readonly' ) rule__FormElement__Group_4__1 ;
    public final void rule__FormElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4173:1: ( ( 'readonly' ) rule__FormElement__Group_4__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4174:1: ( 'readonly' ) rule__FormElement__Group_4__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4174:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4175:1: 'readonly'
            {
             before(grammarAccess.getFormElementAccess().getReadonlyKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__FormElement__Group_4__08286); 
             after(grammarAccess.getFormElementAccess().getReadonlyKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group_4__1_in_rule__FormElement__Group_4__08296);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4189:1: rule__FormElement__Group_4__1 : ( ( rule__FormElement__Alternatives_4_1 ) ) ;
    public final void rule__FormElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4193:1: ( ( ( rule__FormElement__Alternatives_4_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4194:1: ( ( rule__FormElement__Alternatives_4_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4194:1: ( ( rule__FormElement__Alternatives_4_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4195:1: ( rule__FormElement__Alternatives_4_1 )
            {
             before(grammarAccess.getFormElementAccess().getAlternatives_4_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4196:1: ( rule__FormElement__Alternatives_4_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4196:2: rule__FormElement__Alternatives_4_1
            {
            pushFollow(FOLLOW_rule__FormElement__Alternatives_4_1_in_rule__FormElement__Group_4__18324);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4210:1: rule__ActionDialogueCall__Group__0 : ( ( rule__ActionDialogueCall__ContextExpAssignment_0 )? ) rule__ActionDialogueCall__Group__1 ;
    public final void rule__ActionDialogueCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4214:1: ( ( ( rule__ActionDialogueCall__ContextExpAssignment_0 )? ) rule__ActionDialogueCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4215:1: ( ( rule__ActionDialogueCall__ContextExpAssignment_0 )? ) rule__ActionDialogueCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4215:1: ( ( rule__ActionDialogueCall__ContextExpAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4216:1: ( rule__ActionDialogueCall__ContextExpAssignment_0 )?
            {
             before(grammarAccess.getActionDialogueCallAccess().getContextExpAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4217:1: ( rule__ActionDialogueCall__ContextExpAssignment_0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=20 && LA53_0<=21)||(LA53_0>=48 && LA53_0<=49)||LA53_0==51||LA53_0==54) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4217:2: rule__ActionDialogueCall__ContextExpAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ActionDialogueCall__ContextExpAssignment_0_in_rule__ActionDialogueCall__Group__08362);
                    rule__ActionDialogueCall__ContextExpAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionDialogueCallAccess().getContextExpAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ActionDialogueCall__Group__1_in_rule__ActionDialogueCall__Group__08372);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4228:1: rule__ActionDialogueCall__Group__1 : ( 'dialogue' ) rule__ActionDialogueCall__Group__2 ;
    public final void rule__ActionDialogueCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4232:1: ( ( 'dialogue' ) rule__ActionDialogueCall__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4233:1: ( 'dialogue' ) rule__ActionDialogueCall__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4233:1: ( 'dialogue' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4234:1: 'dialogue'
            {
             before(grammarAccess.getActionDialogueCallAccess().getDialogueKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__ActionDialogueCall__Group__18401); 
             after(grammarAccess.getActionDialogueCallAccess().getDialogueKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ActionDialogueCall__Group__2_in_rule__ActionDialogueCall__Group__18411);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4248:1: rule__ActionDialogueCall__Group__2 : ( ( rule__ActionDialogueCall__NameAssignment_2 ) ) ;
    public final void rule__ActionDialogueCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4252:1: ( ( ( rule__ActionDialogueCall__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4253:1: ( ( rule__ActionDialogueCall__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4253:1: ( ( rule__ActionDialogueCall__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4254:1: ( rule__ActionDialogueCall__NameAssignment_2 )
            {
             before(grammarAccess.getActionDialogueCallAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4255:1: ( rule__ActionDialogueCall__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4255:2: rule__ActionDialogueCall__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ActionDialogueCall__NameAssignment_2_in_rule__ActionDialogueCall__Group__28439);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4271:1: rule__DialogueCall__Group__0 : ( ( rule__DialogueCall__Group_0__0 )? ) rule__DialogueCall__Group__1 ;
    public final void rule__DialogueCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4275:1: ( ( ( rule__DialogueCall__Group_0__0 )? ) rule__DialogueCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4276:1: ( ( rule__DialogueCall__Group_0__0 )? ) rule__DialogueCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4276:1: ( ( rule__DialogueCall__Group_0__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4277:1: ( rule__DialogueCall__Group_0__0 )?
            {
             before(grammarAccess.getDialogueCallAccess().getGroup_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4278:1: ( rule__DialogueCall__Group_0__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_STRING) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4278:2: rule__DialogueCall__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__DialogueCall__Group_0__0_in_rule__DialogueCall__Group__08479);
                    rule__DialogueCall__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDialogueCallAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group__1_in_rule__DialogueCall__Group__08489);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4289:1: rule__DialogueCall__Group__1 : ( ( rule__DialogueCall__Group_1__0 )? ) rule__DialogueCall__Group__2 ;
    public final void rule__DialogueCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4293:1: ( ( ( rule__DialogueCall__Group_1__0 )? ) rule__DialogueCall__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4294:1: ( ( rule__DialogueCall__Group_1__0 )? ) rule__DialogueCall__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4294:1: ( ( rule__DialogueCall__Group_1__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4295:1: ( rule__DialogueCall__Group_1__0 )?
            {
             before(grammarAccess.getDialogueCallAccess().getGroup_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4296:1: ( rule__DialogueCall__Group_1__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==45) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4296:2: rule__DialogueCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DialogueCall__Group_1__0_in_rule__DialogueCall__Group__18517);
                    rule__DialogueCall__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDialogueCallAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group__2_in_rule__DialogueCall__Group__18527);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4307:1: rule__DialogueCall__Group__2 : ( ( rule__DialogueCall__ContextExpAssignment_2 )? ) rule__DialogueCall__Group__3 ;
    public final void rule__DialogueCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4311:1: ( ( ( rule__DialogueCall__ContextExpAssignment_2 )? ) rule__DialogueCall__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4312:1: ( ( rule__DialogueCall__ContextExpAssignment_2 )? ) rule__DialogueCall__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4312:1: ( ( rule__DialogueCall__ContextExpAssignment_2 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4313:1: ( rule__DialogueCall__ContextExpAssignment_2 )?
            {
             before(grammarAccess.getDialogueCallAccess().getContextExpAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4314:1: ( rule__DialogueCall__ContextExpAssignment_2 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=20 && LA56_0<=21)||(LA56_0>=48 && LA56_0<=49)||LA56_0==51||LA56_0==54) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4314:2: rule__DialogueCall__ContextExpAssignment_2
                    {
                    pushFollow(FOLLOW_rule__DialogueCall__ContextExpAssignment_2_in_rule__DialogueCall__Group__28555);
                    rule__DialogueCall__ContextExpAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDialogueCallAccess().getContextExpAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group__3_in_rule__DialogueCall__Group__28565);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4325:1: rule__DialogueCall__Group__3 : ( 'dialogue' ) rule__DialogueCall__Group__4 ;
    public final void rule__DialogueCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4329:1: ( ( 'dialogue' ) rule__DialogueCall__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4330:1: ( 'dialogue' ) rule__DialogueCall__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4330:1: ( 'dialogue' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4331:1: 'dialogue'
            {
             before(grammarAccess.getDialogueCallAccess().getDialogueKeyword_3()); 
            match(input,43,FOLLOW_43_in_rule__DialogueCall__Group__38594); 
             after(grammarAccess.getDialogueCallAccess().getDialogueKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group__4_in_rule__DialogueCall__Group__38604);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4345:1: rule__DialogueCall__Group__4 : ( ( rule__DialogueCall__NameAssignment_4 ) ) ;
    public final void rule__DialogueCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4349:1: ( ( ( rule__DialogueCall__NameAssignment_4 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4350:1: ( ( rule__DialogueCall__NameAssignment_4 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4350:1: ( ( rule__DialogueCall__NameAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4351:1: ( rule__DialogueCall__NameAssignment_4 )
            {
             before(grammarAccess.getDialogueCallAccess().getNameAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4352:1: ( rule__DialogueCall__NameAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4352:2: rule__DialogueCall__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__DialogueCall__NameAssignment_4_in_rule__DialogueCall__Group__48632);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4372:1: rule__DialogueCall__Group_0__0 : ( ( rule__DialogueCall__LabelAssignment_0_0 ) ) rule__DialogueCall__Group_0__1 ;
    public final void rule__DialogueCall__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4376:1: ( ( ( rule__DialogueCall__LabelAssignment_0_0 ) ) rule__DialogueCall__Group_0__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4377:1: ( ( rule__DialogueCall__LabelAssignment_0_0 ) ) rule__DialogueCall__Group_0__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4377:1: ( ( rule__DialogueCall__LabelAssignment_0_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4378:1: ( rule__DialogueCall__LabelAssignment_0_0 )
            {
             before(grammarAccess.getDialogueCallAccess().getLabelAssignment_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4379:1: ( rule__DialogueCall__LabelAssignment_0_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4379:2: rule__DialogueCall__LabelAssignment_0_0
            {
            pushFollow(FOLLOW_rule__DialogueCall__LabelAssignment_0_0_in_rule__DialogueCall__Group_0__08676);
            rule__DialogueCall__LabelAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getDialogueCallAccess().getLabelAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group_0__1_in_rule__DialogueCall__Group_0__08685);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4390:1: rule__DialogueCall__Group_0__1 : ( ':' ) ;
    public final void rule__DialogueCall__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4394:1: ( ( ':' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4395:1: ( ':' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4395:1: ( ':' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4396:1: ':'
            {
             before(grammarAccess.getDialogueCallAccess().getColonKeyword_0_1()); 
            match(input,44,FOLLOW_44_in_rule__DialogueCall__Group_0__18714); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4413:1: rule__DialogueCall__Group_1__0 : ( 'if' ) rule__DialogueCall__Group_1__1 ;
    public final void rule__DialogueCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4417:1: ( ( 'if' ) rule__DialogueCall__Group_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4418:1: ( 'if' ) rule__DialogueCall__Group_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4418:1: ( 'if' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4419:1: 'if'
            {
             before(grammarAccess.getDialogueCallAccess().getIfKeyword_1_0()); 
            match(input,45,FOLLOW_45_in_rule__DialogueCall__Group_1__08754); 
             after(grammarAccess.getDialogueCallAccess().getIfKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group_1__1_in_rule__DialogueCall__Group_1__08764);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4433:1: rule__DialogueCall__Group_1__1 : ( '(' ) rule__DialogueCall__Group_1__2 ;
    public final void rule__DialogueCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4437:1: ( ( '(' ) rule__DialogueCall__Group_1__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4438:1: ( '(' ) rule__DialogueCall__Group_1__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4438:1: ( '(' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4439:1: '('
            {
             before(grammarAccess.getDialogueCallAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,46,FOLLOW_46_in_rule__DialogueCall__Group_1__18793); 
             after(grammarAccess.getDialogueCallAccess().getLeftParenthesisKeyword_1_1()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group_1__2_in_rule__DialogueCall__Group_1__18803);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4453:1: rule__DialogueCall__Group_1__2 : ( ( rule__DialogueCall__ConditionAssignment_1_2 ) ) rule__DialogueCall__Group_1__3 ;
    public final void rule__DialogueCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4457:1: ( ( ( rule__DialogueCall__ConditionAssignment_1_2 ) ) rule__DialogueCall__Group_1__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4458:1: ( ( rule__DialogueCall__ConditionAssignment_1_2 ) ) rule__DialogueCall__Group_1__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4458:1: ( ( rule__DialogueCall__ConditionAssignment_1_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4459:1: ( rule__DialogueCall__ConditionAssignment_1_2 )
            {
             before(grammarAccess.getDialogueCallAccess().getConditionAssignment_1_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4460:1: ( rule__DialogueCall__ConditionAssignment_1_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4460:2: rule__DialogueCall__ConditionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__DialogueCall__ConditionAssignment_1_2_in_rule__DialogueCall__Group_1__28831);
            rule__DialogueCall__ConditionAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getDialogueCallAccess().getConditionAssignment_1_2()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group_1__3_in_rule__DialogueCall__Group_1__28840);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4471:1: rule__DialogueCall__Group_1__3 : ( ')' ) ;
    public final void rule__DialogueCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4475:1: ( ( ')' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4476:1: ( ')' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4476:1: ( ')' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4477:1: ')'
            {
             before(grammarAccess.getDialogueCallAccess().getRightParenthesisKeyword_1_3()); 
            match(input,47,FOLLOW_47_in_rule__DialogueCall__Group_1__38869); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4498:1: rule__ProcessCall__Group__0 : ( ( rule__ProcessCall__Group_0__0 )? ) rule__ProcessCall__Group__1 ;
    public final void rule__ProcessCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4502:1: ( ( ( rule__ProcessCall__Group_0__0 )? ) rule__ProcessCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4503:1: ( ( rule__ProcessCall__Group_0__0 )? ) rule__ProcessCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4503:1: ( ( rule__ProcessCall__Group_0__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4504:1: ( rule__ProcessCall__Group_0__0 )?
            {
             before(grammarAccess.getProcessCallAccess().getGroup_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4505:1: ( rule__ProcessCall__Group_0__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_STRING) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4505:2: rule__ProcessCall__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ProcessCall__Group_0__0_in_rule__ProcessCall__Group__08912);
                    rule__ProcessCall__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessCallAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__1_in_rule__ProcessCall__Group__08922);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4516:1: rule__ProcessCall__Group__1 : ( ( rule__ProcessCall__Group_1__0 )? ) rule__ProcessCall__Group__2 ;
    public final void rule__ProcessCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4520:1: ( ( ( rule__ProcessCall__Group_1__0 )? ) rule__ProcessCall__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4521:1: ( ( rule__ProcessCall__Group_1__0 )? ) rule__ProcessCall__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4521:1: ( ( rule__ProcessCall__Group_1__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4522:1: ( rule__ProcessCall__Group_1__0 )?
            {
             before(grammarAccess.getProcessCallAccess().getGroup_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4523:1: ( rule__ProcessCall__Group_1__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==45) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4523:2: rule__ProcessCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ProcessCall__Group_1__0_in_rule__ProcessCall__Group__18950);
                    rule__ProcessCall__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessCallAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__2_in_rule__ProcessCall__Group__18960);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4534:1: rule__ProcessCall__Group__2 : ( ( rule__ProcessCall__ContextExpAssignment_2 )? ) rule__ProcessCall__Group__3 ;
    public final void rule__ProcessCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4538:1: ( ( ( rule__ProcessCall__ContextExpAssignment_2 )? ) rule__ProcessCall__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4539:1: ( ( rule__ProcessCall__ContextExpAssignment_2 )? ) rule__ProcessCall__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4539:1: ( ( rule__ProcessCall__ContextExpAssignment_2 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4540:1: ( rule__ProcessCall__ContextExpAssignment_2 )?
            {
             before(grammarAccess.getProcessCallAccess().getContextExpAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4541:1: ( rule__ProcessCall__ContextExpAssignment_2 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=20 && LA59_0<=21)||(LA59_0>=48 && LA59_0<=49)||LA59_0==51||LA59_0==54) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4541:2: rule__ProcessCall__ContextExpAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ProcessCall__ContextExpAssignment_2_in_rule__ProcessCall__Group__28988);
                    rule__ProcessCall__ContextExpAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessCallAccess().getContextExpAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__3_in_rule__ProcessCall__Group__28998);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4552:1: rule__ProcessCall__Group__3 : ( 'process' ) rule__ProcessCall__Group__4 ;
    public final void rule__ProcessCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4556:1: ( ( 'process' ) rule__ProcessCall__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4557:1: ( 'process' ) rule__ProcessCall__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4557:1: ( 'process' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4558:1: 'process'
            {
             before(grammarAccess.getProcessCallAccess().getProcessKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__ProcessCall__Group__39027); 
             after(grammarAccess.getProcessCallAccess().getProcessKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__4_in_rule__ProcessCall__Group__39037);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4572:1: rule__ProcessCall__Group__4 : ( ( rule__ProcessCall__NameAssignment_4 ) ) rule__ProcessCall__Group__5 ;
    public final void rule__ProcessCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4576:1: ( ( ( rule__ProcessCall__NameAssignment_4 ) ) rule__ProcessCall__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4577:1: ( ( rule__ProcessCall__NameAssignment_4 ) ) rule__ProcessCall__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4577:1: ( ( rule__ProcessCall__NameAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4578:1: ( rule__ProcessCall__NameAssignment_4 )
            {
             before(grammarAccess.getProcessCallAccess().getNameAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4579:1: ( rule__ProcessCall__NameAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4579:2: rule__ProcessCall__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__ProcessCall__NameAssignment_4_in_rule__ProcessCall__Group__49065);
            rule__ProcessCall__NameAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getProcessCallAccess().getNameAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__5_in_rule__ProcessCall__Group__49074);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4590:1: rule__ProcessCall__Group__5 : ( ( rule__ProcessCall__Group_5__0 )? ) ;
    public final void rule__ProcessCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4594:1: ( ( ( rule__ProcessCall__Group_5__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4595:1: ( ( rule__ProcessCall__Group_5__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4595:1: ( ( rule__ProcessCall__Group_5__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4596:1: ( rule__ProcessCall__Group_5__0 )?
            {
             before(grammarAccess.getProcessCallAccess().getGroup_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4597:1: ( rule__ProcessCall__Group_5__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==34) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4597:2: rule__ProcessCall__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ProcessCall__Group_5__0_in_rule__ProcessCall__Group__59102);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4619:1: rule__ProcessCall__Group_0__0 : ( ( rule__ProcessCall__LabelAssignment_0_0 ) ) rule__ProcessCall__Group_0__1 ;
    public final void rule__ProcessCall__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4623:1: ( ( ( rule__ProcessCall__LabelAssignment_0_0 ) ) rule__ProcessCall__Group_0__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4624:1: ( ( rule__ProcessCall__LabelAssignment_0_0 ) ) rule__ProcessCall__Group_0__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4624:1: ( ( rule__ProcessCall__LabelAssignment_0_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4625:1: ( rule__ProcessCall__LabelAssignment_0_0 )
            {
             before(grammarAccess.getProcessCallAccess().getLabelAssignment_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4626:1: ( rule__ProcessCall__LabelAssignment_0_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4626:2: rule__ProcessCall__LabelAssignment_0_0
            {
            pushFollow(FOLLOW_rule__ProcessCall__LabelAssignment_0_0_in_rule__ProcessCall__Group_0__09149);
            rule__ProcessCall__LabelAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getProcessCallAccess().getLabelAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_0__1_in_rule__ProcessCall__Group_0__09158);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4637:1: rule__ProcessCall__Group_0__1 : ( ':' ) ;
    public final void rule__ProcessCall__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4641:1: ( ( ':' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4642:1: ( ':' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4642:1: ( ':' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4643:1: ':'
            {
             before(grammarAccess.getProcessCallAccess().getColonKeyword_0_1()); 
            match(input,44,FOLLOW_44_in_rule__ProcessCall__Group_0__19187); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4660:1: rule__ProcessCall__Group_1__0 : ( 'if' ) rule__ProcessCall__Group_1__1 ;
    public final void rule__ProcessCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4664:1: ( ( 'if' ) rule__ProcessCall__Group_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4665:1: ( 'if' ) rule__ProcessCall__Group_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4665:1: ( 'if' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4666:1: 'if'
            {
             before(grammarAccess.getProcessCallAccess().getIfKeyword_1_0()); 
            match(input,45,FOLLOW_45_in_rule__ProcessCall__Group_1__09227); 
             after(grammarAccess.getProcessCallAccess().getIfKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_1__1_in_rule__ProcessCall__Group_1__09237);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4680:1: rule__ProcessCall__Group_1__1 : ( '(' ) rule__ProcessCall__Group_1__2 ;
    public final void rule__ProcessCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4684:1: ( ( '(' ) rule__ProcessCall__Group_1__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4685:1: ( '(' ) rule__ProcessCall__Group_1__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4685:1: ( '(' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4686:1: '('
            {
             before(grammarAccess.getProcessCallAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,46,FOLLOW_46_in_rule__ProcessCall__Group_1__19266); 
             after(grammarAccess.getProcessCallAccess().getLeftParenthesisKeyword_1_1()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_1__2_in_rule__ProcessCall__Group_1__19276);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4700:1: rule__ProcessCall__Group_1__2 : ( ( rule__ProcessCall__ConditionAssignment_1_2 ) ) rule__ProcessCall__Group_1__3 ;
    public final void rule__ProcessCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4704:1: ( ( ( rule__ProcessCall__ConditionAssignment_1_2 ) ) rule__ProcessCall__Group_1__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4705:1: ( ( rule__ProcessCall__ConditionAssignment_1_2 ) ) rule__ProcessCall__Group_1__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4705:1: ( ( rule__ProcessCall__ConditionAssignment_1_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4706:1: ( rule__ProcessCall__ConditionAssignment_1_2 )
            {
             before(grammarAccess.getProcessCallAccess().getConditionAssignment_1_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4707:1: ( rule__ProcessCall__ConditionAssignment_1_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4707:2: rule__ProcessCall__ConditionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ProcessCall__ConditionAssignment_1_2_in_rule__ProcessCall__Group_1__29304);
            rule__ProcessCall__ConditionAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getProcessCallAccess().getConditionAssignment_1_2()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_1__3_in_rule__ProcessCall__Group_1__29313);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4718:1: rule__ProcessCall__Group_1__3 : ( ')' ) ;
    public final void rule__ProcessCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4722:1: ( ( ')' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4723:1: ( ')' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4723:1: ( ')' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4724:1: ')'
            {
             before(grammarAccess.getProcessCallAccess().getRightParenthesisKeyword_1_3()); 
            match(input,47,FOLLOW_47_in_rule__ProcessCall__Group_1__39342); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4745:1: rule__ProcessCall__Group_5__0 : ( 'label' ) rule__ProcessCall__Group_5__1 ;
    public final void rule__ProcessCall__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4749:1: ( ( 'label' ) rule__ProcessCall__Group_5__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4750:1: ( 'label' ) rule__ProcessCall__Group_5__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4750:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4751:1: 'label'
            {
             before(grammarAccess.getProcessCallAccess().getLabelKeyword_5_0()); 
            match(input,34,FOLLOW_34_in_rule__ProcessCall__Group_5__09386); 
             after(grammarAccess.getProcessCallAccess().getLabelKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_5__1_in_rule__ProcessCall__Group_5__09396);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4765:1: rule__ProcessCall__Group_5__1 : ( ( rule__ProcessCall__LabelAssignment_5_1 ) ) ;
    public final void rule__ProcessCall__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4769:1: ( ( ( rule__ProcessCall__LabelAssignment_5_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4770:1: ( ( rule__ProcessCall__LabelAssignment_5_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4770:1: ( ( rule__ProcessCall__LabelAssignment_5_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4771:1: ( rule__ProcessCall__LabelAssignment_5_1 )
            {
             before(grammarAccess.getProcessCallAccess().getLabelAssignment_5_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4772:1: ( rule__ProcessCall__LabelAssignment_5_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4772:2: rule__ProcessCall__LabelAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ProcessCall__LabelAssignment_5_1_in_rule__ProcessCall__Group_5__19424);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4786:1: rule__OperationExpression__Group__0 : ( 'call' ) rule__OperationExpression__Group__1 ;
    public final void rule__OperationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4790:1: ( ( 'call' ) rule__OperationExpression__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4791:1: ( 'call' ) rule__OperationExpression__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4791:1: ( 'call' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4792:1: 'call'
            {
             before(grammarAccess.getOperationExpressionAccess().getCallKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__OperationExpression__Group__09463); 
             after(grammarAccess.getOperationExpressionAccess().getCallKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__OperationExpression__Group__1_in_rule__OperationExpression__Group__09473);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4806:1: rule__OperationExpression__Group__1 : ( ( rule__OperationExpression__NameAssignment_1 ) ) ;
    public final void rule__OperationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4810:1: ( ( ( rule__OperationExpression__NameAssignment_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4811:1: ( ( rule__OperationExpression__NameAssignment_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4811:1: ( ( rule__OperationExpression__NameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4812:1: ( rule__OperationExpression__NameAssignment_1 )
            {
             before(grammarAccess.getOperationExpressionAccess().getNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4813:1: ( rule__OperationExpression__NameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4813:2: rule__OperationExpression__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OperationExpression__NameAssignment_1_in_rule__OperationExpression__Group__19501);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4827:1: rule__SimpleProcessCall__Group__0 : ( ( rule__SimpleProcessCall__NameAssignment_0 ) ) rule__SimpleProcessCall__Group__1 ;
    public final void rule__SimpleProcessCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4831:1: ( ( ( rule__SimpleProcessCall__NameAssignment_0 ) ) rule__SimpleProcessCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4832:1: ( ( rule__SimpleProcessCall__NameAssignment_0 ) ) rule__SimpleProcessCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4832:1: ( ( rule__SimpleProcessCall__NameAssignment_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4833:1: ( rule__SimpleProcessCall__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleProcessCallAccess().getNameAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4834:1: ( rule__SimpleProcessCall__NameAssignment_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4834:2: rule__SimpleProcessCall__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleProcessCall__NameAssignment_0_in_rule__SimpleProcessCall__Group__09539);
            rule__SimpleProcessCall__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSimpleProcessCallAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleProcessCall__Group__1_in_rule__SimpleProcessCall__Group__09548);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4845:1: rule__SimpleProcessCall__Group__1 : ( ( rule__SimpleProcessCall__Group_1__0 )? ) ;
    public final void rule__SimpleProcessCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4849:1: ( ( ( rule__SimpleProcessCall__Group_1__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4850:1: ( ( rule__SimpleProcessCall__Group_1__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4850:1: ( ( rule__SimpleProcessCall__Group_1__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4851:1: ( rule__SimpleProcessCall__Group_1__0 )?
            {
             before(grammarAccess.getSimpleProcessCallAccess().getGroup_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4852:1: ( rule__SimpleProcessCall__Group_1__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==34) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4852:2: rule__SimpleProcessCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SimpleProcessCall__Group_1__0_in_rule__SimpleProcessCall__Group__19576);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4866:1: rule__SimpleProcessCall__Group_1__0 : ( 'label' ) rule__SimpleProcessCall__Group_1__1 ;
    public final void rule__SimpleProcessCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4870:1: ( ( 'label' ) rule__SimpleProcessCall__Group_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4871:1: ( 'label' ) rule__SimpleProcessCall__Group_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4871:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4872:1: 'label'
            {
             before(grammarAccess.getSimpleProcessCallAccess().getLabelKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__SimpleProcessCall__Group_1__09616); 
             after(grammarAccess.getSimpleProcessCallAccess().getLabelKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleProcessCall__Group_1__1_in_rule__SimpleProcessCall__Group_1__09626);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4886:1: rule__SimpleProcessCall__Group_1__1 : ( ( rule__SimpleProcessCall__LabelAssignment_1_1 ) ) ;
    public final void rule__SimpleProcessCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4890:1: ( ( ( rule__SimpleProcessCall__LabelAssignment_1_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4891:1: ( ( rule__SimpleProcessCall__LabelAssignment_1_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4891:1: ( ( rule__SimpleProcessCall__LabelAssignment_1_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4892:1: ( rule__SimpleProcessCall__LabelAssignment_1_1 )
            {
             before(grammarAccess.getSimpleProcessCallAccess().getLabelAssignment_1_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4893:1: ( rule__SimpleProcessCall__LabelAssignment_1_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4893:2: rule__SimpleProcessCall__LabelAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SimpleProcessCall__LabelAssignment_1_1_in_rule__SimpleProcessCall__Group_1__19654);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4907:1: rule__ServiceExpression__Group__0 : ( 'service' ) rule__ServiceExpression__Group__1 ;
    public final void rule__ServiceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4911:1: ( ( 'service' ) rule__ServiceExpression__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4912:1: ( 'service' ) rule__ServiceExpression__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4912:1: ( 'service' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4913:1: 'service'
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__ServiceExpression__Group__09693); 
             after(grammarAccess.getServiceExpressionAccess().getServiceKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ServiceExpression__Group__1_in_rule__ServiceExpression__Group__09703);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4927:1: rule__ServiceExpression__Group__1 : ( ( rule__ServiceExpression__ServiceNameAssignment_1 ) ) rule__ServiceExpression__Group__2 ;
    public final void rule__ServiceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4931:1: ( ( ( rule__ServiceExpression__ServiceNameAssignment_1 ) ) rule__ServiceExpression__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4932:1: ( ( rule__ServiceExpression__ServiceNameAssignment_1 ) ) rule__ServiceExpression__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4932:1: ( ( rule__ServiceExpression__ServiceNameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4933:1: ( rule__ServiceExpression__ServiceNameAssignment_1 )
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4934:1: ( rule__ServiceExpression__ServiceNameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4934:2: rule__ServiceExpression__ServiceNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ServiceExpression__ServiceNameAssignment_1_in_rule__ServiceExpression__Group__19731);
            rule__ServiceExpression__ServiceNameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getServiceExpressionAccess().getServiceNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ServiceExpression__Group__2_in_rule__ServiceExpression__Group__19740);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4945:1: rule__ServiceExpression__Group__2 : ( '.' ) rule__ServiceExpression__Group__3 ;
    public final void rule__ServiceExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4949:1: ( ( '.' ) rule__ServiceExpression__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4950:1: ( '.' ) rule__ServiceExpression__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4950:1: ( '.' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4951:1: '.'
            {
             before(grammarAccess.getServiceExpressionAccess().getFullStopKeyword_2()); 
            match(input,50,FOLLOW_50_in_rule__ServiceExpression__Group__29769); 
             after(grammarAccess.getServiceExpressionAccess().getFullStopKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__ServiceExpression__Group__3_in_rule__ServiceExpression__Group__29779);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4965:1: rule__ServiceExpression__Group__3 : ( ( rule__ServiceExpression__ServiceMethodAssignment_3 ) ) ;
    public final void rule__ServiceExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4969:1: ( ( ( rule__ServiceExpression__ServiceMethodAssignment_3 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4970:1: ( ( rule__ServiceExpression__ServiceMethodAssignment_3 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4970:1: ( ( rule__ServiceExpression__ServiceMethodAssignment_3 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4971:1: ( rule__ServiceExpression__ServiceMethodAssignment_3 )
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceMethodAssignment_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4972:1: ( rule__ServiceExpression__ServiceMethodAssignment_3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4972:2: rule__ServiceExpression__ServiceMethodAssignment_3
            {
            pushFollow(FOLLOW_rule__ServiceExpression__ServiceMethodAssignment_3_in_rule__ServiceExpression__Group__39807);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4990:1: rule__NavigationExpression__Group__0 : ( ( rule__NavigationExpression__CompositionAssignment_0 )? ) rule__NavigationExpression__Group__1 ;
    public final void rule__NavigationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4994:1: ( ( ( rule__NavigationExpression__CompositionAssignment_0 )? ) rule__NavigationExpression__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4995:1: ( ( rule__NavigationExpression__CompositionAssignment_0 )? ) rule__NavigationExpression__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4995:1: ( ( rule__NavigationExpression__CompositionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4996:1: ( rule__NavigationExpression__CompositionAssignment_0 )?
            {
             before(grammarAccess.getNavigationExpressionAccess().getCompositionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4997:1: ( rule__NavigationExpression__CompositionAssignment_0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==54) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4997:2: rule__NavigationExpression__CompositionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__NavigationExpression__CompositionAssignment_0_in_rule__NavigationExpression__Group__09849);
                    rule__NavigationExpression__CompositionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNavigationExpressionAccess().getCompositionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__NavigationExpression__Group__1_in_rule__NavigationExpression__Group__09859);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5008:1: rule__NavigationExpression__Group__1 : ( 'navigate' ) rule__NavigationExpression__Group__2 ;
    public final void rule__NavigationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5012:1: ( ( 'navigate' ) rule__NavigationExpression__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5013:1: ( 'navigate' ) rule__NavigationExpression__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5013:1: ( 'navigate' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5014:1: 'navigate'
            {
             before(grammarAccess.getNavigationExpressionAccess().getNavigateKeyword_1()); 
            match(input,51,FOLLOW_51_in_rule__NavigationExpression__Group__19888); 
             after(grammarAccess.getNavigationExpressionAccess().getNavigateKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__NavigationExpression__Group__2_in_rule__NavigationExpression__Group__19898);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5028:1: rule__NavigationExpression__Group__2 : ( ( rule__NavigationExpression__ReferencesAssignment_2 ) ) ;
    public final void rule__NavigationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5032:1: ( ( ( rule__NavigationExpression__ReferencesAssignment_2 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5033:1: ( ( rule__NavigationExpression__ReferencesAssignment_2 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5033:1: ( ( rule__NavigationExpression__ReferencesAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5034:1: ( rule__NavigationExpression__ReferencesAssignment_2 )
            {
             before(grammarAccess.getNavigationExpressionAccess().getReferencesAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5035:1: ( rule__NavigationExpression__ReferencesAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5035:2: rule__NavigationExpression__ReferencesAssignment_2
            {
            pushFollow(FOLLOW_rule__NavigationExpression__ReferencesAssignment_2_in_rule__NavigationExpression__Group__29926);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5051:1: rule__PresentationModel__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__PresentationModel__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5055:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5056:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5056:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5057:1: RULE_STRING
            {
             before(grammarAccess.getPresentationModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PresentationModel__DescriptionAssignment_09966); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5066:1: rule__PresentationModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PresentationModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5070:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5071:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5071:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5072:1: RULE_ID
            {
             before(grammarAccess.getPresentationModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PresentationModel__NameAssignment_29997); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5081:1: rule__PresentationModel__ExternalReferencesAssignment_4 : ( ruleExternalReference ) ;
    public final void rule__PresentationModel__ExternalReferencesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5085:1: ( ( ruleExternalReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5086:1: ( ruleExternalReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5086:1: ( ruleExternalReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5087:1: ruleExternalReference
            {
             before(grammarAccess.getPresentationModelAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExternalReference_in_rule__PresentationModel__ExternalReferencesAssignment_410028);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5096:1: rule__PresentationModel__StartAssignment_5 : ( ruleApplication ) ;
    public final void rule__PresentationModel__StartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5100:1: ( ( ruleApplication ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5101:1: ( ruleApplication )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5101:1: ( ruleApplication )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5102:1: ruleApplication
            {
             before(grammarAccess.getPresentationModelAccess().getStartApplicationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__PresentationModel__StartAssignment_510059);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5111:1: rule__PresentationModel__ElementsAssignment_6 : ( ruleModelElementWithContext ) ;
    public final void rule__PresentationModel__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5115:1: ( ( ruleModelElementWithContext ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5116:1: ( ruleModelElementWithContext )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5116:1: ( ruleModelElementWithContext )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5117:1: ruleModelElementWithContext
            {
             before(grammarAccess.getPresentationModelAccess().getElementsModelElementWithContextParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleModelElementWithContext_in_rule__PresentationModel__ElementsAssignment_610090);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5126:1: rule__Application__StartProcessesAssignment_2_0 : ( ruleSimpleProcessCall ) ;
    public final void rule__Application__StartProcessesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5130:1: ( ( ruleSimpleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5131:1: ( ruleSimpleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5131:1: ( ruleSimpleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5132:1: ruleSimpleProcessCall
            {
             before(grammarAccess.getApplicationAccess().getStartProcessesSimpleProcessCallParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleSimpleProcessCall_in_rule__Application__StartProcessesAssignment_2_010121);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5141:1: rule__ExternalReference__ModelNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExternalReference__ModelNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5145:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5146:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5146:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5147:1: RULE_ID
            {
             before(grammarAccess.getExternalReferenceAccess().getModelNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalReference__ModelNameAssignment_110152); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5156:1: rule__ExternalReference__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ExternalReference__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5160:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5161:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5161:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5162:1: RULE_ID
            {
             before(grammarAccess.getExternalReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalReference__NameAssignment_310183); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5171:1: rule__ContentForm__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ContentForm__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5175:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5176:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5176:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5177:1: RULE_STRING
            {
             before(grammarAccess.getContentFormAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ContentForm__DescriptionAssignment_010214); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5186:1: rule__ContentForm__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ContentForm__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5190:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5191:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5191:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5192:1: RULE_ID
            {
             before(grammarAccess.getContentFormAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContentForm__NameAssignment_210245); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5201:1: rule__ContentForm__CollectionContextAssignment_4 : ( ( 'list' ) ) ;
    public final void rule__ContentForm__CollectionContextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5205:1: ( ( ( 'list' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5206:1: ( ( 'list' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5206:1: ( ( 'list' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5207:1: ( 'list' )
            {
             before(grammarAccess.getContentFormAccess().getCollectionContextListKeyword_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5208:1: ( 'list' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5209:1: 'list'
            {
             before(grammarAccess.getContentFormAccess().getCollectionContextListKeyword_4_0()); 
            match(input,52,FOLLOW_52_in_rule__ContentForm__CollectionContextAssignment_410281); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5224:1: rule__ContentForm__ContextRefAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ContentForm__ContextRefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5228:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5229:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5229:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5230:1: ( RULE_ID )
            {
             before(grammarAccess.getContentFormAccess().getContextRefExternalReferenceCrossReference_5_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5231:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5232:1: RULE_ID
            {
             before(grammarAccess.getContentFormAccess().getContextRefExternalReferenceIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContentForm__ContextRefAssignment_510324); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5243:1: rule__ContentForm__ReadonlyAssignment_7_1_0 : ( ( 'true' ) ) ;
    public final void rule__ContentForm__ReadonlyAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5247:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5248:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5248:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5249:1: ( 'true' )
            {
             before(grammarAccess.getContentFormAccess().getReadonlyTrueKeyword_7_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5250:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5251:1: 'true'
            {
             before(grammarAccess.getContentFormAccess().getReadonlyTrueKeyword_7_1_0_0()); 
            match(input,53,FOLLOW_53_in_rule__ContentForm__ReadonlyAssignment_7_1_010364); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5266:1: rule__ContentForm__FormElementsAssignment_8 : ( ruleFormElement ) ;
    public final void rule__ContentForm__FormElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5270:1: ( ( ruleFormElement ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5271:1: ( ruleFormElement )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5271:1: ( ruleFormElement )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5272:1: ruleFormElement
            {
             before(grammarAccess.getContentFormAccess().getFormElementsFormElementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleFormElement_in_rule__ContentForm__FormElementsAssignment_810403);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5281:1: rule__ContentForm__ActionsAssignment_9_2_0 : ( ruleAction ) ;
    public final void rule__ContentForm__ActionsAssignment_9_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5285:1: ( ( ruleAction ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5286:1: ( ruleAction )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5286:1: ( ruleAction )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5287:1: ruleAction
            {
             before(grammarAccess.getContentFormAccess().getActionsActionParserRuleCall_9_2_0_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__ContentForm__ActionsAssignment_9_2_010434);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5296:1: rule__ContentForm__ProcessesAssignment_10_2_0 : ( ruleSimpleProcessCall ) ;
    public final void rule__ContentForm__ProcessesAssignment_10_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5300:1: ( ( ruleSimpleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5301:1: ( ruleSimpleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5301:1: ( ruleSimpleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5302:1: ruleSimpleProcessCall
            {
             before(grammarAccess.getContentFormAccess().getProcessesSimpleProcessCallParserRuleCall_10_2_0_0()); 
            pushFollow(FOLLOW_ruleSimpleProcessCall_in_rule__ContentForm__ProcessesAssignment_10_2_010465);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5311:1: rule__Action__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Action__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5315:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5316:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5316:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5317:1: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Action__DescriptionAssignment_010496); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5326:1: rule__Action__TypeAssignment_1 : ( ruleProcessType ) ;
    public final void rule__Action__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5330:1: ( ( ruleProcessType ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5331:1: ( ruleProcessType )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5331:1: ( ruleProcessType )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5332:1: ruleProcessType
            {
             before(grammarAccess.getActionAccess().getTypeProcessTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProcessType_in_rule__Action__TypeAssignment_110527);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5341:1: rule__Action__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5345:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5346:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5346:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5347:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__NameAssignment_210558); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5356:1: rule__Action__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Action__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5360:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5361:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5361:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5362:1: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Action__LabelAssignment_3_110589); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5371:1: rule__Action__ProcessElementsAssignment_4 : ( ruleActionDialogueCall ) ;
    public final void rule__Action__ProcessElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5375:1: ( ( ruleActionDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5376:1: ( ruleActionDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5376:1: ( ruleActionDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5377:1: ruleActionDialogueCall
            {
             before(grammarAccess.getActionAccess().getProcessElementsActionDialogueCallParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleActionDialogueCall_in_rule__Action__ProcessElementsAssignment_410620);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5386:1: rule__CompoundDialogue__DescriptionAssignment_0_0 : ( RULE_STRING ) ;
    public final void rule__CompoundDialogue__DescriptionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5390:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5391:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5391:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5392:1: RULE_STRING
            {
             before(grammarAccess.getCompoundDialogueAccess().getDescriptionSTRINGTerminalRuleCall_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CompoundDialogue__DescriptionAssignment_0_010651); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5401:1: rule__CompoundDialogue__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__CompoundDialogue__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5405:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5406:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5406:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5407:1: RULE_ID
            {
             before(grammarAccess.getCompoundDialogueAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CompoundDialogue__NameAssignment_0_210682); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5416:1: rule__CompoundDialogue__ContextRefAssignment_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__CompoundDialogue__ContextRefAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5420:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5421:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5421:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5422:1: ( RULE_ID )
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextRefExternalReferenceCrossReference_0_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5423:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5424:1: RULE_ID
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextRefExternalReferenceIDTerminalRuleCall_0_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CompoundDialogue__ContextRefAssignment_0_410717); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5435:1: rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 : ( ( 'true' ) ) ;
    public final void rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5439:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5440:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5440:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5441:1: ( 'true' )
            {
             before(grammarAccess.getCompoundDialogueAccess().getReadonlyTrueKeyword_0_5_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5442:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5443:1: 'true'
            {
             before(grammarAccess.getCompoundDialogueAccess().getReadonlyTrueKeyword_0_5_1_0_0()); 
            match(input,53,FOLLOW_53_in_rule__CompoundDialogue__ReadonlyAssignment_0_5_1_010757); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5458:1: rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 : ( ruleDialogueCall ) ;
    public final void rule__CompoundDialogue__DialoguesAssignment_0_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5462:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5463:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5463:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5464:1: ruleDialogueCall
            {
             before(grammarAccess.getCompoundDialogueAccess().getDialoguesDialogueCallParserRuleCall_0_6_2_0_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__CompoundDialogue__DialoguesAssignment_0_6_2_010796);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5473:1: rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 : ( ruleProcessCall ) ;
    public final void rule__CompoundDialogue__ProcessesAssignment_0_7_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5477:1: ( ( ruleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5478:1: ( ruleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5478:1: ( ruleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5479:1: ruleProcessCall
            {
             before(grammarAccess.getCompoundDialogueAccess().getProcessesProcessCallParserRuleCall_0_7_2_0_0()); 
            pushFollow(FOLLOW_ruleProcessCall_in_rule__CompoundDialogue__ProcessesAssignment_0_7_2_010827);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5488:1: rule__CollectionDialogue__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__CollectionDialogue__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5492:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5493:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5493:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5494:1: RULE_STRING
            {
             before(grammarAccess.getCollectionDialogueAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CollectionDialogue__DescriptionAssignment_010858); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5503:1: rule__CollectionDialogue__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CollectionDialogue__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5507:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5508:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5508:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5509:1: RULE_ID
            {
             before(grammarAccess.getCollectionDialogueAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CollectionDialogue__NameAssignment_210889); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5518:1: rule__CollectionDialogue__ContextRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__CollectionDialogue__ContextRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5522:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5523:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5523:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5524:1: ( RULE_ID )
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextRefExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5525:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5526:1: RULE_ID
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CollectionDialogue__ContextRefAssignment_410924); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5537:1: rule__CollectionDialogue__ReadonlyAssignment_6_1_0 : ( ( 'true' ) ) ;
    public final void rule__CollectionDialogue__ReadonlyAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5541:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5542:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5542:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5543:1: ( 'true' )
            {
             before(grammarAccess.getCollectionDialogueAccess().getReadonlyTrueKeyword_6_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5544:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5545:1: 'true'
            {
             before(grammarAccess.getCollectionDialogueAccess().getReadonlyTrueKeyword_6_1_0_0()); 
            match(input,53,FOLLOW_53_in_rule__CollectionDialogue__ReadonlyAssignment_6_1_010964); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5560:1: rule__CollectionDialogue__DialoguesAssignment_7_2_0 : ( ruleDialogueCall ) ;
    public final void rule__CollectionDialogue__DialoguesAssignment_7_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5564:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5565:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5565:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5566:1: ruleDialogueCall
            {
             before(grammarAccess.getCollectionDialogueAccess().getDialoguesDialogueCallParserRuleCall_7_2_0_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__CollectionDialogue__DialoguesAssignment_7_2_011003);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5575:1: rule__CollectionDialogue__ProcessesAssignment_8_2_0 : ( ruleProcessCall ) ;
    public final void rule__CollectionDialogue__ProcessesAssignment_8_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5579:1: ( ( ruleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5580:1: ( ruleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5580:1: ( ruleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5581:1: ruleProcessCall
            {
             before(grammarAccess.getCollectionDialogueAccess().getProcessesProcessCallParserRuleCall_8_2_0_0()); 
            pushFollow(FOLLOW_ruleProcessCall_in_rule__CollectionDialogue__ProcessesAssignment_8_2_011034);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5590:1: rule__MasterDetail__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MasterDetail__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5594:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5595:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5595:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5596:1: RULE_STRING
            {
             before(grammarAccess.getMasterDetailAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MasterDetail__DescriptionAssignment_011065); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5605:1: rule__MasterDetail__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MasterDetail__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5609:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5610:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5610:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5611:1: RULE_ID
            {
             before(grammarAccess.getMasterDetailAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MasterDetail__NameAssignment_211096); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5620:1: rule__MasterDetail__ContextRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__MasterDetail__ContextRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5624:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5625:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5625:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5626:1: ( RULE_ID )
            {
             before(grammarAccess.getMasterDetailAccess().getContextRefExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5627:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5628:1: RULE_ID
            {
             before(grammarAccess.getMasterDetailAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MasterDetail__ContextRefAssignment_411131); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5639:1: rule__MasterDetail__ReadonlyAssignment_5_1_0 : ( ( 'true' ) ) ;
    public final void rule__MasterDetail__ReadonlyAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5643:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5644:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5644:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5645:1: ( 'true' )
            {
             before(grammarAccess.getMasterDetailAccess().getReadonlyTrueKeyword_5_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5646:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5647:1: 'true'
            {
             before(grammarAccess.getMasterDetailAccess().getReadonlyTrueKeyword_5_1_0_0()); 
            match(input,53,FOLLOW_53_in_rule__MasterDetail__ReadonlyAssignment_5_1_011171); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5662:1: rule__MasterDetail__MasterAssignment_7 : ( ruleDialogueCall ) ;
    public final void rule__MasterDetail__MasterAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5666:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5667:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5667:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5668:1: ruleDialogueCall
            {
             before(grammarAccess.getMasterDetailAccess().getMasterDialogueCallParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__MasterDetail__MasterAssignment_711210);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5677:1: rule__MasterDetail__DetailAssignment_10 : ( ruleDialogueCall ) ;
    public final void rule__MasterDetail__DetailAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5681:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5682:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5682:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5683:1: ruleDialogueCall
            {
             before(grammarAccess.getMasterDetailAccess().getDetailDialogueCallParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__MasterDetail__DetailAssignment_1011241);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5692:1: rule__MasterDetail__ProcessesAssignment_12_2_0 : ( ruleProcessCall ) ;
    public final void rule__MasterDetail__ProcessesAssignment_12_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5696:1: ( ( ruleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5697:1: ( ruleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5697:1: ( ruleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5698:1: ruleProcessCall
            {
             before(grammarAccess.getMasterDetailAccess().getProcessesProcessCallParserRuleCall_12_2_0_0()); 
            pushFollow(FOLLOW_ruleProcessCall_in_rule__MasterDetail__ProcessesAssignment_12_2_011272);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5707:1: rule__Process__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Process__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5711:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5712:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5712:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5713:1: RULE_STRING
            {
             before(grammarAccess.getProcessAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Process__DescriptionAssignment_011303); 
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


    // $ANTLR start rule__Process__NameAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5722:1: rule__Process__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5726:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5727:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5727:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5728:1: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Process__NameAssignment_211334); 
             after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__NameAssignment_2


    // $ANTLR start rule__Process__CollectionContextAssignment_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5737:1: rule__Process__CollectionContextAssignment_4 : ( ( 'list' ) ) ;
    public final void rule__Process__CollectionContextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5741:1: ( ( ( 'list' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5742:1: ( ( 'list' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5742:1: ( ( 'list' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5743:1: ( 'list' )
            {
             before(grammarAccess.getProcessAccess().getCollectionContextListKeyword_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5744:1: ( 'list' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5745:1: 'list'
            {
             before(grammarAccess.getProcessAccess().getCollectionContextListKeyword_4_0()); 
            match(input,52,FOLLOW_52_in_rule__Process__CollectionContextAssignment_411370); 
             after(grammarAccess.getProcessAccess().getCollectionContextListKeyword_4_0()); 

            }

             after(grammarAccess.getProcessAccess().getCollectionContextListKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__CollectionContextAssignment_4


    // $ANTLR start rule__Process__ContextRefAssignment_5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5760:1: rule__Process__ContextRefAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Process__ContextRefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5764:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5765:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5765:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5766:1: ( RULE_ID )
            {
             before(grammarAccess.getProcessAccess().getContextRefExternalReferenceCrossReference_5_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5767:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5768:1: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getContextRefExternalReferenceIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Process__ContextRefAssignment_511413); 
             after(grammarAccess.getProcessAccess().getContextRefExternalReferenceIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getProcessAccess().getContextRefExternalReferenceCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__ContextRefAssignment_5


    // $ANTLR start rule__Process__TypeAssignment_7_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5779:1: rule__Process__TypeAssignment_7_0 : ( ruleProcessType ) ;
    public final void rule__Process__TypeAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5783:1: ( ( ruleProcessType ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5784:1: ( ruleProcessType )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5784:1: ( ruleProcessType )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5785:1: ruleProcessType
            {
             before(grammarAccess.getProcessAccess().getTypeProcessTypeEnumRuleCall_7_0_0()); 
            pushFollow(FOLLOW_ruleProcessType_in_rule__Process__TypeAssignment_7_011448);
            ruleProcessType();
            _fsp--;

             after(grammarAccess.getProcessAccess().getTypeProcessTypeEnumRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__TypeAssignment_7_0


    // $ANTLR start rule__Process__TypeAssignment_7_1_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5794:1: rule__Process__TypeAssignment_7_1_0 : ( ruleProcessTypeLink ) ;
    public final void rule__Process__TypeAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5798:1: ( ( ruleProcessTypeLink ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5799:1: ( ruleProcessTypeLink )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5799:1: ( ruleProcessTypeLink )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5800:1: ruleProcessTypeLink
            {
             before(grammarAccess.getProcessAccess().getTypeProcessTypeLinkEnumRuleCall_7_1_0_0()); 
            pushFollow(FOLLOW_ruleProcessTypeLink_in_rule__Process__TypeAssignment_7_1_011479);
            ruleProcessTypeLink();
            _fsp--;

             after(grammarAccess.getProcessAccess().getTypeProcessTypeLinkEnumRuleCall_7_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__TypeAssignment_7_1_0


    // $ANTLR start rule__Process__LinkAssignment_7_1_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5809:1: rule__Process__LinkAssignment_7_1_1 : ( ruleAssociationRoleReference ) ;
    public final void rule__Process__LinkAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5813:1: ( ( ruleAssociationRoleReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5814:1: ( ruleAssociationRoleReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5814:1: ( ruleAssociationRoleReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5815:1: ruleAssociationRoleReference
            {
             before(grammarAccess.getProcessAccess().getLinkAssociationRoleReferenceParserRuleCall_7_1_1_0()); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_rule__Process__LinkAssignment_7_1_111510);
            ruleAssociationRoleReference();
            _fsp--;

             after(grammarAccess.getProcessAccess().getLinkAssociationRoleReferenceParserRuleCall_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__LinkAssignment_7_1_1


    // $ANTLR start rule__Process__ProcessElementsAssignment_8_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5824:1: rule__Process__ProcessElementsAssignment_8_0 : ( ruleUICall ) ;
    public final void rule__Process__ProcessElementsAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5828:1: ( ( ruleUICall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5829:1: ( ruleUICall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5829:1: ( ruleUICall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5830:1: ruleUICall
            {
             before(grammarAccess.getProcessAccess().getProcessElementsUICallParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_ruleUICall_in_rule__Process__ProcessElementsAssignment_8_011541);
            ruleUICall();
            _fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsUICallParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__ProcessElementsAssignment_8_0


    // $ANTLR start rule__FormElement__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5839:1: rule__FormElement__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__FormElement__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5843:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5844:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5844:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5845:1: RULE_STRING
            {
             before(grammarAccess.getFormElementAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FormElement__DescriptionAssignment_011572); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5854:1: rule__FormElement__ReferencesAssignment_2 : ( ruleDtoPropertyReference ) ;
    public final void rule__FormElement__ReferencesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5858:1: ( ( ruleDtoPropertyReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5859:1: ( ruleDtoPropertyReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5859:1: ( ruleDtoPropertyReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5860:1: ruleDtoPropertyReference
            {
             before(grammarAccess.getFormElementAccess().getReferencesDtoPropertyReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_rule__FormElement__ReferencesAssignment_211603);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5869:1: rule__FormElement__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__FormElement__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5873:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5874:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5874:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5875:1: RULE_STRING
            {
             before(grammarAccess.getFormElementAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FormElement__LabelAssignment_3_111634); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5884:1: rule__FormElement__ReadonlyAssignment_4_1_0 : ( ( 'true' ) ) ;
    public final void rule__FormElement__ReadonlyAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5888:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5889:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5889:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5890:1: ( 'true' )
            {
             before(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_4_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5891:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5892:1: 'true'
            {
             before(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_4_1_0_0()); 
            match(input,53,FOLLOW_53_in_rule__FormElement__ReadonlyAssignment_4_1_011670); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5907:1: rule__ActionDialogueCall__ContextExpAssignment_0 : ( ruleExpression ) ;
    public final void rule__ActionDialogueCall__ContextExpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5911:1: ( ( ruleExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5912:1: ( ruleExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5912:1: ( ruleExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5913:1: ruleExpression
            {
             before(grammarAccess.getActionDialogueCallAccess().getContextExpExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ActionDialogueCall__ContextExpAssignment_011709);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5922:1: rule__ActionDialogueCall__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ActionDialogueCall__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5926:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5927:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5927:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5928:1: RULE_ID
            {
             before(grammarAccess.getActionDialogueCallAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionDialogueCall__NameAssignment_211740); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5937:1: rule__DialogueCall__LabelAssignment_0_0 : ( RULE_STRING ) ;
    public final void rule__DialogueCall__LabelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5941:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5942:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5942:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5943:1: RULE_STRING
            {
             before(grammarAccess.getDialogueCallAccess().getLabelSTRINGTerminalRuleCall_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DialogueCall__LabelAssignment_0_011771); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5952:1: rule__DialogueCall__ConditionAssignment_1_2 : ( ruleOperationExpression ) ;
    public final void rule__DialogueCall__ConditionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5956:1: ( ( ruleOperationExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5957:1: ( ruleOperationExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5957:1: ( ruleOperationExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5958:1: ruleOperationExpression
            {
             before(grammarAccess.getDialogueCallAccess().getConditionOperationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleOperationExpression_in_rule__DialogueCall__ConditionAssignment_1_211802);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5967:1: rule__DialogueCall__ContextExpAssignment_2 : ( ruleExpression ) ;
    public final void rule__DialogueCall__ContextExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5971:1: ( ( ruleExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5972:1: ( ruleExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5972:1: ( ruleExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5973:1: ruleExpression
            {
             before(grammarAccess.getDialogueCallAccess().getContextExpExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__DialogueCall__ContextExpAssignment_211833);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5982:1: rule__DialogueCall__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__DialogueCall__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5986:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5987:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5987:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5988:1: RULE_ID
            {
             before(grammarAccess.getDialogueCallAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DialogueCall__NameAssignment_411864); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5997:1: rule__ProcessCall__LabelAssignment_0_0 : ( RULE_STRING ) ;
    public final void rule__ProcessCall__LabelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6001:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6002:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6002:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6003:1: RULE_STRING
            {
             before(grammarAccess.getProcessCallAccess().getLabelSTRINGTerminalRuleCall_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ProcessCall__LabelAssignment_0_011895); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6012:1: rule__ProcessCall__ConditionAssignment_1_2 : ( ruleOperationExpression ) ;
    public final void rule__ProcessCall__ConditionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6016:1: ( ( ruleOperationExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6017:1: ( ruleOperationExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6017:1: ( ruleOperationExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6018:1: ruleOperationExpression
            {
             before(grammarAccess.getProcessCallAccess().getConditionOperationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleOperationExpression_in_rule__ProcessCall__ConditionAssignment_1_211926);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6027:1: rule__ProcessCall__ContextExpAssignment_2 : ( ruleExpression ) ;
    public final void rule__ProcessCall__ContextExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6031:1: ( ( ruleExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6032:1: ( ruleExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6032:1: ( ruleExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6033:1: ruleExpression
            {
             before(grammarAccess.getProcessCallAccess().getContextExpExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ProcessCall__ContextExpAssignment_211957);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6042:1: rule__ProcessCall__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__ProcessCall__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6046:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6047:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6047:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6048:1: RULE_ID
            {
             before(grammarAccess.getProcessCallAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProcessCall__NameAssignment_411988); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6057:1: rule__ProcessCall__LabelAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__ProcessCall__LabelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6061:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6062:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6062:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6063:1: RULE_ID
            {
             before(grammarAccess.getProcessCallAccess().getLabelIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProcessCall__LabelAssignment_5_112019); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6072:1: rule__OperationExpression__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OperationExpression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6076:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6077:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6077:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6078:1: RULE_ID
            {
             before(grammarAccess.getOperationExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OperationExpression__NameAssignment_112050); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6087:1: rule__SimpleProcessCall__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleProcessCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6091:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6092:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6092:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6093:1: RULE_ID
            {
             before(grammarAccess.getSimpleProcessCallAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleProcessCall__NameAssignment_012081); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6102:1: rule__SimpleProcessCall__LabelAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__SimpleProcessCall__LabelAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6106:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6107:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6107:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6108:1: RULE_STRING
            {
             before(grammarAccess.getSimpleProcessCallAccess().getLabelSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleProcessCall__LabelAssignment_1_112112); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6117:1: rule__StandardExpression__TypeAssignment : ( ruleExpressionType ) ;
    public final void rule__StandardExpression__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6121:1: ( ( ruleExpressionType ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6122:1: ( ruleExpressionType )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6122:1: ( ruleExpressionType )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6123:1: ruleExpressionType
            {
             before(grammarAccess.getStandardExpressionAccess().getTypeExpressionTypeEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleExpressionType_in_rule__StandardExpression__TypeAssignment12143);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6132:1: rule__ServiceExpression__ServiceNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceExpression__ServiceNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6136:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6137:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6137:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6138:1: RULE_ID
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceExpression__ServiceNameAssignment_112174); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6147:1: rule__ServiceExpression__ServiceMethodAssignment_3 : ( RULE_ID ) ;
    public final void rule__ServiceExpression__ServiceMethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6151:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6152:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6152:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6153:1: RULE_ID
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceMethodIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceExpression__ServiceMethodAssignment_312205); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6162:1: rule__NavigationExpression__CompositionAssignment_0 : ( ( 'composite' ) ) ;
    public final void rule__NavigationExpression__CompositionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6166:1: ( ( ( 'composite' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6167:1: ( ( 'composite' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6167:1: ( ( 'composite' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6168:1: ( 'composite' )
            {
             before(grammarAccess.getNavigationExpressionAccess().getCompositionCompositeKeyword_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6169:1: ( 'composite' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6170:1: 'composite'
            {
             before(grammarAccess.getNavigationExpressionAccess().getCompositionCompositeKeyword_0_0()); 
            match(input,54,FOLLOW_54_in_rule__NavigationExpression__CompositionAssignment_012241); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6185:1: rule__NavigationExpression__ReferencesAssignment_2 : ( ruleAssociationRoleReference ) ;
    public final void rule__NavigationExpression__ReferencesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6189:1: ( ( ruleAssociationRoleReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6190:1: ( ruleAssociationRoleReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6190:1: ( ruleAssociationRoleReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6191:1: ruleAssociationRoleReference
            {
             before(grammarAccess.getNavigationExpressionAccess().getReferencesAssociationRoleReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_rule__NavigationExpression__ReferencesAssignment_212280);
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6200:1: rule__DtoPropertyReference__NameAssignment : ( RULE_ID ) ;
    public final void rule__DtoPropertyReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6204:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6205:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6205:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6206:1: RULE_ID
            {
             before(grammarAccess.getDtoPropertyReferenceAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoPropertyReference__NameAssignment12311); 
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
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6215:1: rule__AssociationRoleReference__NameAssignment : ( RULE_ID ) ;
    public final void rule__AssociationRoleReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6219:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6220:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6220:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6221:1: RULE_ID
            {
             before(grammarAccess.getAssociationRoleReferenceAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssociationRoleReference__NameAssignment12342); 
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
    public static final BitSet FOLLOW_rule__Process__TypeAssignment_7_0_in_rule__Process__Alternatives_72116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_7_1__0_in_rule__Process__Alternatives_72134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__ReadonlyAssignment_4_1_0_in_rule__FormElement__Alternatives_4_12167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FormElement__Alternatives_4_12186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceExpression_in_rule__Expression__Alternatives2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_rule__Expression__Alternatives2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardExpression_in_rule__Expression__Alternatives2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_rule__Expression__Alternatives2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__UIModelElementCall__Alternatives2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__UIModelElementCall__Alternatives2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ProcessType__Alternatives2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ProcessType__Alternatives2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ProcessType__Alternatives2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ProcessType__Alternatives2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ProcessType__Alternatives2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ProcessType__Alternatives2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ProcessType__Alternatives2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ExpressionType__Alternatives2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ExpressionType__Alternatives2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__DescriptionAssignment_0_in_rule__PresentationModel__Group__02573 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__1_in_rule__PresentationModel__Group__02583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PresentationModel__Group__12612 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__2_in_rule__PresentationModel__Group__12622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__NameAssignment_2_in_rule__PresentationModel__Group__22650 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__3_in_rule__PresentationModel__Group__22659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PresentationModel__Group__32688 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__4_in_rule__PresentationModel__Group__32698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__ExternalReferencesAssignment_4_in_rule__PresentationModel__Group__42726 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__5_in_rule__PresentationModel__Group__42736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__StartAssignment_5_in_rule__PresentationModel__Group__52764 = new BitSet(new long[]{0x0000026820000012L});
    public static final BitSet FOLLOW_rule__PresentationModel__Group__6_in_rule__PresentationModel__Group__52773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__ElementsAssignment_6_in_rule__PresentationModel__Group__62801 = new BitSet(new long[]{0x0000026820000012L});
    public static final BitSet FOLLOW_24_in_rule__Application__Group__02851 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Application__Group__1_in_rule__Application__Group__02861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Application__Group__12890 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Application__Group__2_in_rule__Application__Group__12900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_2__0_in_rule__Application__Group__22930 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__Application__Group_2__0_in_rule__Application__Group__22942 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__Application__Group__3_in_rule__Application__Group__22954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Application__Group__32983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__StartProcessesAssignment_2_0_in_rule__Application__Group_2__03026 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Application__Group_2__1_in_rule__Application__Group_2__03035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Application__Group_2__13064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ExternalReference__Group__03104 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__1_in_rule__ExternalReference__Group__03114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__ModelNameAssignment_1_in_rule__ExternalReference__Group__13142 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__2_in_rule__ExternalReference__Group__13151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ExternalReference__Group__23180 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__3_in_rule__ExternalReference__Group__23190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__NameAssignment_3_in_rule__ExternalReference__Group__33218 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__4_in_rule__ExternalReference__Group__33227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ExternalReference__Group__43256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__DescriptionAssignment_0_in_rule__ContentForm__Group__03301 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__1_in_rule__ContentForm__Group__03311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ContentForm__Group__13340 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__2_in_rule__ContentForm__Group__13350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__NameAssignment_2_in_rule__ContentForm__Group__23378 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__3_in_rule__ContentForm__Group__23387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ContentForm__Group__33416 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__4_in_rule__ContentForm__Group__33426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__CollectionContextAssignment_4_in_rule__ContentForm__Group__43454 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__5_in_rule__ContentForm__Group__43464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__ContextRefAssignment_5_in_rule__ContentForm__Group__53492 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__6_in_rule__ContentForm__Group__53501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ContentForm__Group__63530 = new BitSet(new long[]{0x0000040384000010L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__7_in_rule__ContentForm__Group__63540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_7__0_in_rule__ContentForm__Group__73568 = new BitSet(new long[]{0x0000040304000010L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__8_in_rule__ContentForm__Group__73578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__FormElementsAssignment_8_in_rule__ContentForm__Group__83606 = new BitSet(new long[]{0x0000040304000010L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__9_in_rule__ContentForm__Group__83616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__0_in_rule__ContentForm__Group__93644 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__10_in_rule__ContentForm__Group__93654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__0_in_rule__ContentForm__Group__103682 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__11_in_rule__ContentForm__Group__103692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ContentForm__Group__113721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ContentForm__Group_7__03781 = new BitSet(new long[]{0x0020000000001000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_7__1_in_rule__ContentForm__Group_7__03791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Alternatives_7_1_in_rule__ContentForm__Group_7__13819 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_7__2_in_rule__ContentForm__Group_7__13828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ContentForm__Group_7__23857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ContentForm__Group_9__03899 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__1_in_rule__ContentForm__Group_9__03909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ContentForm__Group_9__13938 = new BitSet(new long[]{0x00000000040FE030L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__2_in_rule__ContentForm__Group_9__13948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9_2__0_in_rule__ContentForm__Group_9__23976 = new BitSet(new long[]{0x00000000040FE030L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__3_in_rule__ContentForm__Group_9__23986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ContentForm__Group_9__34015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__ActionsAssignment_9_2_0_in_rule__ContentForm__Group_9_2__04058 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9_2__1_in_rule__ContentForm__Group_9_2__04067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ContentForm__Group_9_2__14096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ContentForm__Group_10__04136 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__1_in_rule__ContentForm__Group_10__04146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ContentForm__Group_10__14175 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__2_in_rule__ContentForm__Group_10__14185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10_2__0_in_rule__ContentForm__Group_10__24213 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__3_in_rule__ContentForm__Group_10__24223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ContentForm__Group_10__34252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__ProcessesAssignment_10_2_0_in_rule__ContentForm__Group_10_2__04295 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10_2__1_in_rule__ContentForm__Group_10_2__04304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ContentForm__Group_10_2__14333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DescriptionAssignment_0_in_rule__Action__Group__04372 = new BitSet(new long[]{0x00000000000FE020L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__TypeAssignment_1_in_rule__Action__Group__14410 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_2_in_rule__Action__Group__24448 = new BitSet(new long[]{0x004B080400300002L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__24457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__34485 = new BitSet(new long[]{0x004B080000300002L});
    public static final BitSet FOLLOW_rule__Action__Group__4_in_rule__Action__Group__34495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__ProcessElementsAssignment_4_in_rule__Action__Group__44523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Action__Group_3__04569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__04579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__LabelAssignment_3_1_in_rule__Action__Group_3__14607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__DescriptionAssignment_0_0_in_rule__CompoundDialogue__Group_0__04645 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__1_in_rule__CompoundDialogue__Group_0__04655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CompoundDialogue__Group_0__14684 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__2_in_rule__CompoundDialogue__Group_0__14694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__NameAssignment_0_2_in_rule__CompoundDialogue__Group_0__24722 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__3_in_rule__CompoundDialogue__Group_0__24731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CompoundDialogue__Group_0__34760 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__4_in_rule__CompoundDialogue__Group_0__34770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__ContextRefAssignment_0_4_in_rule__CompoundDialogue__Group_0__44798 = new BitSet(new long[]{0x0000001280000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__5_in_rule__CompoundDialogue__Group_0__44807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_5__0_in_rule__CompoundDialogue__Group_0__54835 = new BitSet(new long[]{0x0000001200000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__6_in_rule__CompoundDialogue__Group_0__54845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__0_in_rule__CompoundDialogue__Group_0__64873 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__7_in_rule__CompoundDialogue__Group_0__64883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__0_in_rule__CompoundDialogue__Group_0__74911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CompoundDialogue__Group_0_5__04963 = new BitSet(new long[]{0x0020000000001000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_5__1_in_rule__CompoundDialogue__Group_0_5__04973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Alternatives_0_5_1_in_rule__CompoundDialogue__Group_0_5__15001 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_5__2_in_rule__CompoundDialogue__Group_0_5__15010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CompoundDialogue__Group_0_5__25039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__CompoundDialogue__Group_0_6__05081 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__1_in_rule__CompoundDialogue__Group_0_6__05091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CompoundDialogue__Group_0_6__15120 = new BitSet(new long[]{0x004B280004300010L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__2_in_rule__CompoundDialogue__Group_0_6__15130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6_2__0_in_rule__CompoundDialogue__Group_0_6__25158 = new BitSet(new long[]{0x004B280004300010L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__3_in_rule__CompoundDialogue__Group_0_6__25168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CompoundDialogue__Group_0_6__35197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__DialoguesAssignment_0_6_2_0_in_rule__CompoundDialogue__Group_0_6_2__05240 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6_2__1_in_rule__CompoundDialogue__Group_0_6_2__05249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CompoundDialogue__Group_0_6_2__15278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CompoundDialogue__Group_0_7__05318 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__1_in_rule__CompoundDialogue__Group_0_7__05328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CompoundDialogue__Group_0_7__15357 = new BitSet(new long[]{0x004B220004300010L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__2_in_rule__CompoundDialogue__Group_0_7__15367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7_2__0_in_rule__CompoundDialogue__Group_0_7__25395 = new BitSet(new long[]{0x004B220004300010L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__3_in_rule__CompoundDialogue__Group_0_7__25405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CompoundDialogue__Group_0_7__35434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__ProcessesAssignment_0_7_2_0_in_rule__CompoundDialogue__Group_0_7_2__05477 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7_2__1_in_rule__CompoundDialogue__Group_0_7_2__05486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CompoundDialogue__Group_0_7_2__15515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__DescriptionAssignment_0_in_rule__CollectionDialogue__Group__05554 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__1_in_rule__CollectionDialogue__Group__05564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__CollectionDialogue__Group__15593 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__2_in_rule__CollectionDialogue__Group__15603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__NameAssignment_2_in_rule__CollectionDialogue__Group__25631 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__3_in_rule__CollectionDialogue__Group__25640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CollectionDialogue__Group__35669 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__4_in_rule__CollectionDialogue__Group__35679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__ContextRefAssignment_4_in_rule__CollectionDialogue__Group__45707 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__5_in_rule__CollectionDialogue__Group__45716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CollectionDialogue__Group__55745 = new BitSet(new long[]{0x0000001284000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__6_in_rule__CollectionDialogue__Group__55755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_6__0_in_rule__CollectionDialogue__Group__65783 = new BitSet(new long[]{0x0000001204000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__7_in_rule__CollectionDialogue__Group__65793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__0_in_rule__CollectionDialogue__Group__75821 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__8_in_rule__CollectionDialogue__Group__75831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__0_in_rule__CollectionDialogue__Group__85859 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__9_in_rule__CollectionDialogue__Group__85869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CollectionDialogue__Group__95898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CollectionDialogue__Group_6__05954 = new BitSet(new long[]{0x0020000000001000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_6__1_in_rule__CollectionDialogue__Group_6__05964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Alternatives_6_1_in_rule__CollectionDialogue__Group_6__15992 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_6__2_in_rule__CollectionDialogue__Group_6__16001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CollectionDialogue__Group_6__26030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__CollectionDialogue__Group_7__06072 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__1_in_rule__CollectionDialogue__Group_7__06082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CollectionDialogue__Group_7__16111 = new BitSet(new long[]{0x004B280004300010L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__2_in_rule__CollectionDialogue__Group_7__16121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7_2__0_in_rule__CollectionDialogue__Group_7__26149 = new BitSet(new long[]{0x004B280004300010L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__3_in_rule__CollectionDialogue__Group_7__26159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CollectionDialogue__Group_7__36188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__DialoguesAssignment_7_2_0_in_rule__CollectionDialogue__Group_7_2__06231 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7_2__1_in_rule__CollectionDialogue__Group_7_2__06240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CollectionDialogue__Group_7_2__16269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CollectionDialogue__Group_8__06309 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__1_in_rule__CollectionDialogue__Group_8__06319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CollectionDialogue__Group_8__16348 = new BitSet(new long[]{0x004B220004300010L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__2_in_rule__CollectionDialogue__Group_8__16358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8_2__0_in_rule__CollectionDialogue__Group_8__26386 = new BitSet(new long[]{0x004B220004300010L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__3_in_rule__CollectionDialogue__Group_8__26396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CollectionDialogue__Group_8__36425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__ProcessesAssignment_8_2_0_in_rule__CollectionDialogue__Group_8_2__06468 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8_2__1_in_rule__CollectionDialogue__Group_8_2__06477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CollectionDialogue__Group_8_2__16506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__DescriptionAssignment_0_in_rule__MasterDetail__Group__06545 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__1_in_rule__MasterDetail__Group__06555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__MasterDetail__Group__16584 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__2_in_rule__MasterDetail__Group__16594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__NameAssignment_2_in_rule__MasterDetail__Group__26622 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__3_in_rule__MasterDetail__Group__26631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MasterDetail__Group__36660 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__4_in_rule__MasterDetail__Group__36670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__ContextRefAssignment_4_in_rule__MasterDetail__Group__46698 = new BitSet(new long[]{0x0000008080000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__5_in_rule__MasterDetail__Group__46707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_5__0_in_rule__MasterDetail__Group__56735 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__6_in_rule__MasterDetail__Group__56745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MasterDetail__Group__66774 = new BitSet(new long[]{0x004B280000300010L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__7_in_rule__MasterDetail__Group__66784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__MasterAssignment_7_in_rule__MasterDetail__Group__76812 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__8_in_rule__MasterDetail__Group__76821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MasterDetail__Group__86850 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__9_in_rule__MasterDetail__Group__86860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MasterDetail__Group__96889 = new BitSet(new long[]{0x004B280000300010L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__10_in_rule__MasterDetail__Group__96899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__DetailAssignment_10_in_rule__MasterDetail__Group__106927 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__11_in_rule__MasterDetail__Group__106936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MasterDetail__Group__116965 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__12_in_rule__MasterDetail__Group__116975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__0_in_rule__MasterDetail__Group__127003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MasterDetail__Group_5__07065 = new BitSet(new long[]{0x0020000000001000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_5__1_in_rule__MasterDetail__Group_5__07075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Alternatives_5_1_in_rule__MasterDetail__Group_5__17103 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_5__2_in_rule__MasterDetail__Group_5__17112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MasterDetail__Group_5__27141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MasterDetail__Group_12__07183 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__1_in_rule__MasterDetail__Group_12__07193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MasterDetail__Group_12__17222 = new BitSet(new long[]{0x004B220004300010L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__2_in_rule__MasterDetail__Group_12__17232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12_2__0_in_rule__MasterDetail__Group_12__27260 = new BitSet(new long[]{0x004B220004300010L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__3_in_rule__MasterDetail__Group_12__27270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MasterDetail__Group_12__37299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__ProcessesAssignment_12_2_0_in_rule__MasterDetail__Group_12_2__07342 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12_2__1_in_rule__MasterDetail__Group_12_2__07351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MasterDetail__Group_12_2__17380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__DescriptionAssignment_0_in_rule__Process__Group__07419 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Process__Group__1_in_rule__Process__Group__07429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Process__Group__17458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Process__Group__2_in_rule__Process__Group__17468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__NameAssignment_2_in_rule__Process__Group__27496 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Process__Group__3_in_rule__Process__Group__27505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Process__Group__37534 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_rule__Process__Group__4_in_rule__Process__Group__37544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__CollectionContextAssignment_4_in_rule__Process__Group__47572 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Process__Group__5_in_rule__Process__Group__47582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__ContextRefAssignment_5_in_rule__Process__Group__57610 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Process__Group__6_in_rule__Process__Group__57619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Process__Group__67648 = new BitSet(new long[]{0x004B2A00043FE810L});
    public static final BitSet FOLLOW_rule__Process__Group__7_in_rule__Process__Group__67658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Alternatives_7_in_rule__Process__Group__77686 = new BitSet(new long[]{0x004B2A0004300010L});
    public static final BitSet FOLLOW_rule__Process__Group__8_in_rule__Process__Group__77696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_8__0_in_rule__Process__Group__87724 = new BitSet(new long[]{0x004B2A0004300010L});
    public static final BitSet FOLLOW_rule__Process__Group__9_in_rule__Process__Group__87734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Process__Group__97763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__TypeAssignment_7_1_0_in_rule__Process__Group_7_1__07818 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Process__Group_7_1__1_in_rule__Process__Group_7_1__07827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__LinkAssignment_7_1_1_in_rule__Process__Group_7_1__17855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__ProcessElementsAssignment_8_0_in_rule__Process__Group_8__07893 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Process__Group_8__1_in_rule__Process__Group_8__07902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Process__Group_8__17931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__DescriptionAssignment_0_in_rule__FormElement__Group__07970 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__1_in_rule__FormElement__Group__07980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__FormElement__Group__18009 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FormElement__Group__2_in_rule__FormElement__Group__18019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__ReferencesAssignment_2_in_rule__FormElement__Group__28047 = new BitSet(new long[]{0x0000000480800000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__3_in_rule__FormElement__Group__28056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group_3__0_in_rule__FormElement__Group__38084 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__4_in_rule__FormElement__Group__38094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group_4__0_in_rule__FormElement__Group__48122 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__5_in_rule__FormElement__Group__48132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FormElement__Group__58161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FormElement__Group_3__08209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FormElement__Group_3__1_in_rule__FormElement__Group_3__08219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__LabelAssignment_3_1_in_rule__FormElement__Group_3__18247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FormElement__Group_4__08286 = new BitSet(new long[]{0x0020000000001000L});
    public static final BitSet FOLLOW_rule__FormElement__Group_4__1_in_rule__FormElement__Group_4__08296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Alternatives_4_1_in_rule__FormElement__Group_4__18324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionDialogueCall__ContextExpAssignment_0_in_rule__ActionDialogueCall__Group__08362 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ActionDialogueCall__Group__1_in_rule__ActionDialogueCall__Group__08372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ActionDialogueCall__Group__18401 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ActionDialogueCall__Group__2_in_rule__ActionDialogueCall__Group__18411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionDialogueCall__NameAssignment_2_in_rule__ActionDialogueCall__Group__28439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_0__0_in_rule__DialogueCall__Group__08479 = new BitSet(new long[]{0x004B280000300000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__1_in_rule__DialogueCall__Group__08489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_1__0_in_rule__DialogueCall__Group__18517 = new BitSet(new long[]{0x004B080000300000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__2_in_rule__DialogueCall__Group__18527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__ContextExpAssignment_2_in_rule__DialogueCall__Group__28555 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__3_in_rule__DialogueCall__Group__28565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__DialogueCall__Group__38594 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__4_in_rule__DialogueCall__Group__38604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__NameAssignment_4_in_rule__DialogueCall__Group__48632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__LabelAssignment_0_0_in_rule__DialogueCall__Group_0__08676 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_0__1_in_rule__DialogueCall__Group_0__08685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__DialogueCall__Group_0__18714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__DialogueCall__Group_1__08754 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_1__1_in_rule__DialogueCall__Group_1__08764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__DialogueCall__Group_1__18793 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_1__2_in_rule__DialogueCall__Group_1__18803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__ConditionAssignment_1_2_in_rule__DialogueCall__Group_1__28831 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_1__3_in_rule__DialogueCall__Group_1__28840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__DialogueCall__Group_1__38869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_0__0_in_rule__ProcessCall__Group__08912 = new BitSet(new long[]{0x004B220000300000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__1_in_rule__ProcessCall__Group__08922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_1__0_in_rule__ProcessCall__Group__18950 = new BitSet(new long[]{0x004B020000300000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__2_in_rule__ProcessCall__Group__18960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__ContextExpAssignment_2_in_rule__ProcessCall__Group__28988 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__3_in_rule__ProcessCall__Group__28998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ProcessCall__Group__39027 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__4_in_rule__ProcessCall__Group__39037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__NameAssignment_4_in_rule__ProcessCall__Group__49065 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__5_in_rule__ProcessCall__Group__49074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_5__0_in_rule__ProcessCall__Group__59102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__LabelAssignment_0_0_in_rule__ProcessCall__Group_0__09149 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_0__1_in_rule__ProcessCall__Group_0__09158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ProcessCall__Group_0__19187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ProcessCall__Group_1__09227 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_1__1_in_rule__ProcessCall__Group_1__09237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ProcessCall__Group_1__19266 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_1__2_in_rule__ProcessCall__Group_1__19276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__ConditionAssignment_1_2_in_rule__ProcessCall__Group_1__29304 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_1__3_in_rule__ProcessCall__Group_1__29313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ProcessCall__Group_1__39342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ProcessCall__Group_5__09386 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_5__1_in_rule__ProcessCall__Group_5__09396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__LabelAssignment_5_1_in_rule__ProcessCall__Group_5__19424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__OperationExpression__Group__09463 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__OperationExpression__Group__1_in_rule__OperationExpression__Group__09473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationExpression__NameAssignment_1_in_rule__OperationExpression__Group__19501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__NameAssignment_0_in_rule__SimpleProcessCall__Group__09539 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__Group__1_in_rule__SimpleProcessCall__Group__09548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__Group_1__0_in_rule__SimpleProcessCall__Group__19576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SimpleProcessCall__Group_1__09616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__Group_1__1_in_rule__SimpleProcessCall__Group_1__09626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__LabelAssignment_1_1_in_rule__SimpleProcessCall__Group_1__19654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ServiceExpression__Group__09693 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ServiceExpression__Group__1_in_rule__ServiceExpression__Group__09703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceExpression__ServiceNameAssignment_1_in_rule__ServiceExpression__Group__19731 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__ServiceExpression__Group__2_in_rule__ServiceExpression__Group__19740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ServiceExpression__Group__29769 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ServiceExpression__Group__3_in_rule__ServiceExpression__Group__29779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceExpression__ServiceMethodAssignment_3_in_rule__ServiceExpression__Group__39807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NavigationExpression__CompositionAssignment_0_in_rule__NavigationExpression__Group__09849 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__NavigationExpression__Group__1_in_rule__NavigationExpression__Group__09859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__NavigationExpression__Group__19888 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NavigationExpression__Group__2_in_rule__NavigationExpression__Group__19898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NavigationExpression__ReferencesAssignment_2_in_rule__NavigationExpression__Group__29926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PresentationModel__DescriptionAssignment_09966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PresentationModel__NameAssignment_29997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_rule__PresentationModel__ExternalReferencesAssignment_410028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__PresentationModel__StartAssignment_510059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_rule__PresentationModel__ElementsAssignment_610090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProcessCall_in_rule__Application__StartProcessesAssignment_2_010121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalReference__ModelNameAssignment_110152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalReference__NameAssignment_310183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ContentForm__DescriptionAssignment_010214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContentForm__NameAssignment_210245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ContentForm__CollectionContextAssignment_410281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContentForm__ContextRefAssignment_510324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ContentForm__ReadonlyAssignment_7_1_010364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_rule__ContentForm__FormElementsAssignment_810403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__ContentForm__ActionsAssignment_9_2_010434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProcessCall_in_rule__ContentForm__ProcessesAssignment_10_2_010465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Action__DescriptionAssignment_010496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessType_in_rule__Action__TypeAssignment_110527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NameAssignment_210558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Action__LabelAssignment_3_110589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDialogueCall_in_rule__Action__ProcessElementsAssignment_410620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CompoundDialogue__DescriptionAssignment_0_010651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CompoundDialogue__NameAssignment_0_210682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CompoundDialogue__ContextRefAssignment_0_410717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__CompoundDialogue__ReadonlyAssignment_0_5_1_010757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__CompoundDialogue__DialoguesAssignment_0_6_2_010796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__CompoundDialogue__ProcessesAssignment_0_7_2_010827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CollectionDialogue__DescriptionAssignment_010858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CollectionDialogue__NameAssignment_210889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CollectionDialogue__ContextRefAssignment_410924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__CollectionDialogue__ReadonlyAssignment_6_1_010964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__CollectionDialogue__DialoguesAssignment_7_2_011003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__CollectionDialogue__ProcessesAssignment_8_2_011034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MasterDetail__DescriptionAssignment_011065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MasterDetail__NameAssignment_211096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MasterDetail__ContextRefAssignment_411131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__MasterDetail__ReadonlyAssignment_5_1_011171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__MasterDetail__MasterAssignment_711210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__MasterDetail__DetailAssignment_1011241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__MasterDetail__ProcessesAssignment_12_2_011272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Process__DescriptionAssignment_011303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Process__NameAssignment_211334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Process__CollectionContextAssignment_411370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Process__ContextRefAssignment_511413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessType_in_rule__Process__TypeAssignment_7_011448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessTypeLink_in_rule__Process__TypeAssignment_7_1_011479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_rule__Process__LinkAssignment_7_1_111510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUICall_in_rule__Process__ProcessElementsAssignment_8_011541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FormElement__DescriptionAssignment_011572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_rule__FormElement__ReferencesAssignment_211603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FormElement__LabelAssignment_3_111634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__FormElement__ReadonlyAssignment_4_1_011670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ActionDialogueCall__ContextExpAssignment_011709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionDialogueCall__NameAssignment_211740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DialogueCall__LabelAssignment_0_011771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_rule__DialogueCall__ConditionAssignment_1_211802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__DialogueCall__ContextExpAssignment_211833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DialogueCall__NameAssignment_411864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ProcessCall__LabelAssignment_0_011895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_rule__ProcessCall__ConditionAssignment_1_211926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ProcessCall__ContextExpAssignment_211957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProcessCall__NameAssignment_411988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProcessCall__LabelAssignment_5_112019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OperationExpression__NameAssignment_112050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleProcessCall__NameAssignment_012081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleProcessCall__LabelAssignment_1_112112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionType_in_rule__StandardExpression__TypeAssignment12143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceExpression__ServiceNameAssignment_112174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceExpression__ServiceMethodAssignment_312205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__NavigationExpression__CompositionAssignment_012241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_rule__NavigationExpression__ReferencesAssignment_212280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoPropertyReference__NameAssignment12311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationRoleReference__NameAssignment12342 = new BitSet(new long[]{0x0000000000000002L});

}