package org.mod4j.dsl.datacontract.xtext.contentassist.antlr.internal; 

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
import org.mod4j.dsl.datacontract.xtext.services.DataContractGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalDataContractParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'datacontract'", "'from'", "'import'", "'class'", "'represents'", "'['", "']'", "'references'", "'enumeration'", "'as'", "'custom'", "'boolean'", "'string'", "'datetime'", "'integer'", "'decimal'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;

        public InternalDataContractParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g"; }


     
     	private DataContractGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DataContractGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleDataContractModel
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:60:1: entryRuleDataContractModel : ruleDataContractModel EOF ;
    public final void entryRuleDataContractModel() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:60:28: ( ruleDataContractModel EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:61:1: ruleDataContractModel EOF
            {
             before(grammarAccess.getDataContractModelRule()); 
            pushFollow(FOLLOW_ruleDataContractModel_in_entryRuleDataContractModel60);
            ruleDataContractModel();
            _fsp--;

             after(grammarAccess.getDataContractModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataContractModel67); 

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
    // $ANTLR end entryRuleDataContractModel


    // $ANTLR start ruleDataContractModel
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:68:1: ruleDataContractModel : ( ( rule__DataContractModel__Group__0 ) ) ;
    public final void ruleDataContractModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:72:2: ( ( ( rule__DataContractModel__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:73:1: ( ( rule__DataContractModel__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:73:1: ( ( rule__DataContractModel__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:74:1: ( rule__DataContractModel__Group__0 )
            {
             before(grammarAccess.getDataContractModelAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:75:1: ( rule__DataContractModel__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:75:2: rule__DataContractModel__Group__0
            {
            pushFollow(FOLLOW_rule__DataContractModel__Group__0_in_ruleDataContractModel94);
            rule__DataContractModel__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDataContractModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDataContractModel


    // $ANTLR start entryRuleDto
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:87:1: entryRuleDto : ruleDto EOF ;
    public final void entryRuleDto() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:87:14: ( ruleDto EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:88:1: ruleDto EOF
            {
             before(grammarAccess.getDtoRule()); 
            pushFollow(FOLLOW_ruleDto_in_entryRuleDto120);
            ruleDto();
            _fsp--;

             after(grammarAccess.getDtoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDto127); 

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
    // $ANTLR end entryRuleDto


    // $ANTLR start ruleDto
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:95:1: ruleDto : ( ( rule__Dto__Alternatives ) ) ;
    public final void ruleDto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:99:2: ( ( ( rule__Dto__Alternatives ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:100:1: ( ( rule__Dto__Alternatives ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:100:1: ( ( rule__Dto__Alternatives ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:101:1: ( rule__Dto__Alternatives )
            {
             before(grammarAccess.getDtoAccess().getAlternatives()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:102:1: ( rule__Dto__Alternatives )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:102:2: rule__Dto__Alternatives
            {
            pushFollow(FOLLOW_rule__Dto__Alternatives_in_ruleDto154);
            rule__Dto__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDtoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDto


    // $ANTLR start entryRuleExternalReference
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:114:1: entryRuleExternalReference : ruleExternalReference EOF ;
    public final void entryRuleExternalReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:114:28: ( ruleExternalReference EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:115:1: ruleExternalReference EOF
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:122:1: ruleExternalReference : ( ( rule__ExternalReference__Group__0 ) ) ;
    public final void ruleExternalReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:126:2: ( ( ( rule__ExternalReference__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:127:1: ( ( rule__ExternalReference__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:127:1: ( ( rule__ExternalReference__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:128:1: ( rule__ExternalReference__Group__0 )
            {
             before(grammarAccess.getExternalReferenceAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:129:1: ( rule__ExternalReference__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:129:2: rule__ExternalReference__Group__0
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


    // $ANTLR start entryRuleBusinessClassDto
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:141:1: entryRuleBusinessClassDto : ruleBusinessClassDto EOF ;
    public final void entryRuleBusinessClassDto() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:141:27: ( ruleBusinessClassDto EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:142:1: ruleBusinessClassDto EOF
            {
             before(grammarAccess.getBusinessClassDtoRule()); 
            pushFollow(FOLLOW_ruleBusinessClassDto_in_entryRuleBusinessClassDto240);
            ruleBusinessClassDto();
            _fsp--;

             after(grammarAccess.getBusinessClassDtoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClassDto247); 

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
    // $ANTLR end entryRuleBusinessClassDto


    // $ANTLR start ruleBusinessClassDto
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:149:1: ruleBusinessClassDto : ( ( rule__BusinessClassDto__Group__0 ) ) ;
    public final void ruleBusinessClassDto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:153:2: ( ( ( rule__BusinessClassDto__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:154:1: ( ( rule__BusinessClassDto__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:154:1: ( ( rule__BusinessClassDto__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:155:1: ( rule__BusinessClassDto__Group__0 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:156:1: ( rule__BusinessClassDto__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:156:2: rule__BusinessClassDto__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__Group__0_in_ruleBusinessClassDto274);
            rule__BusinessClassDto__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBusinessClassDto


    // $ANTLR start entryRuleEnumerationDto
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:168:1: entryRuleEnumerationDto : ruleEnumerationDto EOF ;
    public final void entryRuleEnumerationDto() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:168:25: ( ruleEnumerationDto EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:169:1: ruleEnumerationDto EOF
            {
             before(grammarAccess.getEnumerationDtoRule()); 
            pushFollow(FOLLOW_ruleEnumerationDto_in_entryRuleEnumerationDto300);
            ruleEnumerationDto();
            _fsp--;

             after(grammarAccess.getEnumerationDtoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationDto307); 

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
    // $ANTLR end entryRuleEnumerationDto


    // $ANTLR start ruleEnumerationDto
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:176:1: ruleEnumerationDto : ( ( rule__EnumerationDto__Group__0 ) ) ;
    public final void ruleEnumerationDto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:180:2: ( ( ( rule__EnumerationDto__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:181:1: ( ( rule__EnumerationDto__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:181:1: ( ( rule__EnumerationDto__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:182:1: ( rule__EnumerationDto__Group__0 )
            {
             before(grammarAccess.getEnumerationDtoAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:183:1: ( rule__EnumerationDto__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:183:2: rule__EnumerationDto__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationDto__Group__0_in_ruleEnumerationDto334);
            rule__EnumerationDto__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationDtoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumerationDto


    // $ANTLR start entryRuleBusinessClassPropertyReference
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:195:1: entryRuleBusinessClassPropertyReference : ruleBusinessClassPropertyReference EOF ;
    public final void entryRuleBusinessClassPropertyReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:195:41: ( ruleBusinessClassPropertyReference EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:196:1: ruleBusinessClassPropertyReference EOF
            {
             before(grammarAccess.getBusinessClassPropertyReferenceRule()); 
            pushFollow(FOLLOW_ruleBusinessClassPropertyReference_in_entryRuleBusinessClassPropertyReference360);
            ruleBusinessClassPropertyReference();
            _fsp--;

             after(grammarAccess.getBusinessClassPropertyReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClassPropertyReference367); 

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
    // $ANTLR end entryRuleBusinessClassPropertyReference


    // $ANTLR start ruleBusinessClassPropertyReference
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:203:1: ruleBusinessClassPropertyReference : ( ( rule__BusinessClassPropertyReference__Group__0 ) ) ;
    public final void ruleBusinessClassPropertyReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:207:2: ( ( ( rule__BusinessClassPropertyReference__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:208:1: ( ( rule__BusinessClassPropertyReference__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:208:1: ( ( rule__BusinessClassPropertyReference__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:209:1: ( rule__BusinessClassPropertyReference__Group__0 )
            {
             before(grammarAccess.getBusinessClassPropertyReferenceAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:210:1: ( rule__BusinessClassPropertyReference__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:210:2: rule__BusinessClassPropertyReference__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessClassPropertyReference__Group__0_in_ruleBusinessClassPropertyReference394);
            rule__BusinessClassPropertyReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassPropertyReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBusinessClassPropertyReference


    // $ANTLR start entryRuleBusinessClassAssociationRoleReference
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:222:1: entryRuleBusinessClassAssociationRoleReference : ruleBusinessClassAssociationRoleReference EOF ;
    public final void entryRuleBusinessClassAssociationRoleReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:222:48: ( ruleBusinessClassAssociationRoleReference EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:223:1: ruleBusinessClassAssociationRoleReference EOF
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceRule()); 
            pushFollow(FOLLOW_ruleBusinessClassAssociationRoleReference_in_entryRuleBusinessClassAssociationRoleReference420);
            ruleBusinessClassAssociationRoleReference();
            _fsp--;

             after(grammarAccess.getBusinessClassAssociationRoleReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClassAssociationRoleReference427); 

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
    // $ANTLR end entryRuleBusinessClassAssociationRoleReference


    // $ANTLR start ruleBusinessClassAssociationRoleReference
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:230:1: ruleBusinessClassAssociationRoleReference : ( ( rule__BusinessClassAssociationRoleReference__Group__0 ) ) ;
    public final void ruleBusinessClassAssociationRoleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:234:2: ( ( ( rule__BusinessClassAssociationRoleReference__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:235:1: ( ( rule__BusinessClassAssociationRoleReference__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:235:1: ( ( rule__BusinessClassAssociationRoleReference__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:236:1: ( rule__BusinessClassAssociationRoleReference__Group__0 )
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:237:1: ( rule__BusinessClassAssociationRoleReference__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:237:2: rule__BusinessClassAssociationRoleReference__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__Group__0_in_ruleBusinessClassAssociationRoleReference454);
            rule__BusinessClassAssociationRoleReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBusinessClassAssociationRoleReference


    // $ANTLR start entryRuleCustomDto
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:249:1: entryRuleCustomDto : ruleCustomDto EOF ;
    public final void entryRuleCustomDto() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:249:20: ( ruleCustomDto EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:250:1: ruleCustomDto EOF
            {
             before(grammarAccess.getCustomDtoRule()); 
            pushFollow(FOLLOW_ruleCustomDto_in_entryRuleCustomDto480);
            ruleCustomDto();
            _fsp--;

             after(grammarAccess.getCustomDtoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomDto487); 

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
    // $ANTLR end entryRuleCustomDto


    // $ANTLR start ruleCustomDto
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:257:1: ruleCustomDto : ( ( rule__CustomDto__Group__0 ) ) ;
    public final void ruleCustomDto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:261:2: ( ( ( rule__CustomDto__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:262:1: ( ( rule__CustomDto__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:262:1: ( ( rule__CustomDto__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:263:1: ( rule__CustomDto__Group__0 )
            {
             before(grammarAccess.getCustomDtoAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:264:1: ( rule__CustomDto__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:264:2: rule__CustomDto__Group__0
            {
            pushFollow(FOLLOW_rule__CustomDto__Group__0_in_ruleCustomDto514);
            rule__CustomDto__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCustomDtoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCustomDto


    // $ANTLR start entryRuleDtoProperty
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:276:1: entryRuleDtoProperty : ruleDtoProperty EOF ;
    public final void entryRuleDtoProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:276:22: ( ruleDtoProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:277:1: ruleDtoProperty EOF
            {
             before(grammarAccess.getDtoPropertyRule()); 
            pushFollow(FOLLOW_ruleDtoProperty_in_entryRuleDtoProperty540);
            ruleDtoProperty();
            _fsp--;

             after(grammarAccess.getDtoPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoProperty547); 

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
    // $ANTLR end entryRuleDtoProperty


    // $ANTLR start ruleDtoProperty
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:284:1: ruleDtoProperty : ( ( rule__DtoProperty__Group__0 ) ) ;
    public final void ruleDtoProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:288:2: ( ( ( rule__DtoProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:289:1: ( ( rule__DtoProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:289:1: ( ( rule__DtoProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:290:1: ( rule__DtoProperty__Group__0 )
            {
             before(grammarAccess.getDtoPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:291:1: ( rule__DtoProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:291:2: rule__DtoProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoProperty__Group__0_in_ruleDtoProperty574);
            rule__DtoProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDtoPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDtoProperty


    // $ANTLR start entryRuleDtoBooleanProperty
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:303:1: entryRuleDtoBooleanProperty : ruleDtoBooleanProperty EOF ;
    public final void entryRuleDtoBooleanProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:303:29: ( ruleDtoBooleanProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:304:1: ruleDtoBooleanProperty EOF
            {
             before(grammarAccess.getDtoBooleanPropertyRule()); 
            pushFollow(FOLLOW_ruleDtoBooleanProperty_in_entryRuleDtoBooleanProperty600);
            ruleDtoBooleanProperty();
            _fsp--;

             after(grammarAccess.getDtoBooleanPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoBooleanProperty607); 

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
    // $ANTLR end entryRuleDtoBooleanProperty


    // $ANTLR start ruleDtoBooleanProperty
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:311:1: ruleDtoBooleanProperty : ( ( rule__DtoBooleanProperty__Group__0 ) ) ;
    public final void ruleDtoBooleanProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:315:2: ( ( ( rule__DtoBooleanProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:316:1: ( ( rule__DtoBooleanProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:316:1: ( ( rule__DtoBooleanProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:317:1: ( rule__DtoBooleanProperty__Group__0 )
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:318:1: ( rule__DtoBooleanProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:318:2: rule__DtoBooleanProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoBooleanProperty__Group__0_in_ruleDtoBooleanProperty634);
            rule__DtoBooleanProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDtoBooleanPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDtoBooleanProperty


    // $ANTLR start entryRuleDtoStringProperty
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:330:1: entryRuleDtoStringProperty : ruleDtoStringProperty EOF ;
    public final void entryRuleDtoStringProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:330:28: ( ruleDtoStringProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:331:1: ruleDtoStringProperty EOF
            {
             before(grammarAccess.getDtoStringPropertyRule()); 
            pushFollow(FOLLOW_ruleDtoStringProperty_in_entryRuleDtoStringProperty660);
            ruleDtoStringProperty();
            _fsp--;

             after(grammarAccess.getDtoStringPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoStringProperty667); 

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
    // $ANTLR end entryRuleDtoStringProperty


    // $ANTLR start ruleDtoStringProperty
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:338:1: ruleDtoStringProperty : ( ( rule__DtoStringProperty__Group__0 ) ) ;
    public final void ruleDtoStringProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:342:2: ( ( ( rule__DtoStringProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:343:1: ( ( rule__DtoStringProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:343:1: ( ( rule__DtoStringProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:344:1: ( rule__DtoStringProperty__Group__0 )
            {
             before(grammarAccess.getDtoStringPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:345:1: ( rule__DtoStringProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:345:2: rule__DtoStringProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoStringProperty__Group__0_in_ruleDtoStringProperty694);
            rule__DtoStringProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDtoStringPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDtoStringProperty


    // $ANTLR start entryRuleDtoDateTimeProperty
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:357:1: entryRuleDtoDateTimeProperty : ruleDtoDateTimeProperty EOF ;
    public final void entryRuleDtoDateTimeProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:357:30: ( ruleDtoDateTimeProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:358:1: ruleDtoDateTimeProperty EOF
            {
             before(grammarAccess.getDtoDateTimePropertyRule()); 
            pushFollow(FOLLOW_ruleDtoDateTimeProperty_in_entryRuleDtoDateTimeProperty720);
            ruleDtoDateTimeProperty();
            _fsp--;

             after(grammarAccess.getDtoDateTimePropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoDateTimeProperty727); 

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
    // $ANTLR end entryRuleDtoDateTimeProperty


    // $ANTLR start ruleDtoDateTimeProperty
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:365:1: ruleDtoDateTimeProperty : ( ( rule__DtoDateTimeProperty__Group__0 ) ) ;
    public final void ruleDtoDateTimeProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:369:2: ( ( ( rule__DtoDateTimeProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:370:1: ( ( rule__DtoDateTimeProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:370:1: ( ( rule__DtoDateTimeProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:371:1: ( rule__DtoDateTimeProperty__Group__0 )
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:372:1: ( rule__DtoDateTimeProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:372:2: rule__DtoDateTimeProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoDateTimeProperty__Group__0_in_ruleDtoDateTimeProperty754);
            rule__DtoDateTimeProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDtoDateTimePropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDtoDateTimeProperty


    // $ANTLR start entryRuleDtoIntegerProperty
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:384:1: entryRuleDtoIntegerProperty : ruleDtoIntegerProperty EOF ;
    public final void entryRuleDtoIntegerProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:384:29: ( ruleDtoIntegerProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:385:1: ruleDtoIntegerProperty EOF
            {
             before(grammarAccess.getDtoIntegerPropertyRule()); 
            pushFollow(FOLLOW_ruleDtoIntegerProperty_in_entryRuleDtoIntegerProperty780);
            ruleDtoIntegerProperty();
            _fsp--;

             after(grammarAccess.getDtoIntegerPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoIntegerProperty787); 

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
    // $ANTLR end entryRuleDtoIntegerProperty


    // $ANTLR start ruleDtoIntegerProperty
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:392:1: ruleDtoIntegerProperty : ( ( rule__DtoIntegerProperty__Group__0 ) ) ;
    public final void ruleDtoIntegerProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:396:2: ( ( ( rule__DtoIntegerProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:397:1: ( ( rule__DtoIntegerProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:397:1: ( ( rule__DtoIntegerProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:398:1: ( rule__DtoIntegerProperty__Group__0 )
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:399:1: ( rule__DtoIntegerProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:399:2: rule__DtoIntegerProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoIntegerProperty__Group__0_in_ruleDtoIntegerProperty814);
            rule__DtoIntegerProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDtoIntegerPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDtoIntegerProperty


    // $ANTLR start entryRuleDtoDecimalProperty
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:411:1: entryRuleDtoDecimalProperty : ruleDtoDecimalProperty EOF ;
    public final void entryRuleDtoDecimalProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:411:29: ( ruleDtoDecimalProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:412:1: ruleDtoDecimalProperty EOF
            {
             before(grammarAccess.getDtoDecimalPropertyRule()); 
            pushFollow(FOLLOW_ruleDtoDecimalProperty_in_entryRuleDtoDecimalProperty840);
            ruleDtoDecimalProperty();
            _fsp--;

             after(grammarAccess.getDtoDecimalPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoDecimalProperty847); 

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
    // $ANTLR end entryRuleDtoDecimalProperty


    // $ANTLR start ruleDtoDecimalProperty
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:419:1: ruleDtoDecimalProperty : ( ( rule__DtoDecimalProperty__Group__0 ) ) ;
    public final void ruleDtoDecimalProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:423:2: ( ( ( rule__DtoDecimalProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:424:1: ( ( rule__DtoDecimalProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:424:1: ( ( rule__DtoDecimalProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:425:1: ( rule__DtoDecimalProperty__Group__0 )
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:426:1: ( rule__DtoDecimalProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:426:2: rule__DtoDecimalProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoDecimalProperty__Group__0_in_ruleDtoDecimalProperty874);
            rule__DtoDecimalProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDtoDecimalPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDtoDecimalProperty


    // $ANTLR start entryRuleDtoEnumerationProperty
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:438:1: entryRuleDtoEnumerationProperty : ruleDtoEnumerationProperty EOF ;
    public final void entryRuleDtoEnumerationProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:438:33: ( ruleDtoEnumerationProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:439:1: ruleDtoEnumerationProperty EOF
            {
             before(grammarAccess.getDtoEnumerationPropertyRule()); 
            pushFollow(FOLLOW_ruleDtoEnumerationProperty_in_entryRuleDtoEnumerationProperty900);
            ruleDtoEnumerationProperty();
            _fsp--;

             after(grammarAccess.getDtoEnumerationPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoEnumerationProperty907); 

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
    // $ANTLR end entryRuleDtoEnumerationProperty


    // $ANTLR start ruleDtoEnumerationProperty
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:446:1: ruleDtoEnumerationProperty : ( ( rule__DtoEnumerationProperty__Group__0 ) ) ;
    public final void ruleDtoEnumerationProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:450:2: ( ( ( rule__DtoEnumerationProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:451:1: ( ( rule__DtoEnumerationProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:451:1: ( ( rule__DtoEnumerationProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:452:1: ( rule__DtoEnumerationProperty__Group__0 )
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:453:1: ( rule__DtoEnumerationProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:453:2: rule__DtoEnumerationProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoEnumerationProperty__Group__0_in_ruleDtoEnumerationProperty934);
            rule__DtoEnumerationProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDtoEnumerationPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDtoEnumerationProperty


    // $ANTLR start rule__DataContractModel__Alternatives_5
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:465:1: rule__DataContractModel__Alternatives_5 : ( ( ( rule__DataContractModel__DtosAssignment_5_0 ) ) | ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) ) );
    public final void rule__DataContractModel__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:469:1: ( ( ( rule__DataContractModel__DtosAssignment_5_0 ) ) | ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==20) ) {
                    alt1=2;
                }
                else if ( (LA1_1==15||LA1_1==22) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("465:1: rule__DataContractModel__Alternatives_5 : ( ( ( rule__DataContractModel__DtosAssignment_5_0 ) ) | ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) ) );", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 22:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("465:1: rule__DataContractModel__Alternatives_5 : ( ( ( rule__DataContractModel__DtosAssignment_5_0 ) ) | ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:470:1: ( ( rule__DataContractModel__DtosAssignment_5_0 ) )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:470:1: ( ( rule__DataContractModel__DtosAssignment_5_0 ) )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:471:1: ( rule__DataContractModel__DtosAssignment_5_0 )
                    {
                     before(grammarAccess.getDataContractModelAccess().getDtosAssignment_5_0()); 
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:472:1: ( rule__DataContractModel__DtosAssignment_5_0 )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:472:2: rule__DataContractModel__DtosAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__DataContractModel__DtosAssignment_5_0_in_rule__DataContractModel__Alternatives_5970);
                    rule__DataContractModel__DtosAssignment_5_0();
                    _fsp--;


                    }

                     after(grammarAccess.getDataContractModelAccess().getDtosAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:476:6: ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:476:6: ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:477:1: ( rule__DataContractModel__EnumerationsAssignment_5_1 )
                    {
                     before(grammarAccess.getDataContractModelAccess().getEnumerationsAssignment_5_1()); 
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:478:1: ( rule__DataContractModel__EnumerationsAssignment_5_1 )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:478:2: rule__DataContractModel__EnumerationsAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__DataContractModel__EnumerationsAssignment_5_1_in_rule__DataContractModel__Alternatives_5988);
                    rule__DataContractModel__EnumerationsAssignment_5_1();
                    _fsp--;


                    }

                     after(grammarAccess.getDataContractModelAccess().getEnumerationsAssignment_5_1()); 

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
    // $ANTLR end rule__DataContractModel__Alternatives_5


    // $ANTLR start rule__Dto__Alternatives
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:487:1: rule__Dto__Alternatives : ( ( ruleBusinessClassDto ) | ( ruleCustomDto ) );
    public final void rule__Dto__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:491:1: ( ( ruleBusinessClassDto ) | ( ruleCustomDto ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==15) ) {
                    alt2=1;
                }
                else if ( (LA2_1==22) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("487:1: rule__Dto__Alternatives : ( ( ruleBusinessClassDto ) | ( ruleCustomDto ) );", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("487:1: rule__Dto__Alternatives : ( ( ruleBusinessClassDto ) | ( ruleCustomDto ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:492:1: ( ruleBusinessClassDto )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:492:1: ( ruleBusinessClassDto )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:493:1: ruleBusinessClassDto
                    {
                     before(grammarAccess.getDtoAccess().getBusinessClassDtoParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBusinessClassDto_in_rule__Dto__Alternatives1021);
                    ruleBusinessClassDto();
                    _fsp--;

                     after(grammarAccess.getDtoAccess().getBusinessClassDtoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:498:6: ( ruleCustomDto )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:498:6: ( ruleCustomDto )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:499:1: ruleCustomDto
                    {
                     before(grammarAccess.getDtoAccess().getCustomDtoParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCustomDto_in_rule__Dto__Alternatives1038);
                    ruleCustomDto();
                    _fsp--;

                     after(grammarAccess.getDtoAccess().getCustomDtoParserRuleCall_1()); 

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
    // $ANTLR end rule__Dto__Alternatives


    // $ANTLR start rule__BusinessClassDto__Alternatives_5
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:509:1: rule__BusinessClassDto__Alternatives_5 : ( ( ';' ) | ( ( rule__BusinessClassDto__Group_5_1__0 ) ) );
    public final void rule__BusinessClassDto__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:513:1: ( ( ';' ) | ( ( rule__BusinessClassDto__Group_5_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("509:1: rule__BusinessClassDto__Alternatives_5 : ( ( ';' ) | ( ( rule__BusinessClassDto__Group_5_1__0 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:514:1: ( ';' )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:514:1: ( ';' )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:515:1: ';'
                    {
                     before(grammarAccess.getBusinessClassDtoAccess().getSemicolonKeyword_5_0()); 
                    match(input,11,FOLLOW_11_in_rule__BusinessClassDto__Alternatives_51071); 
                     after(grammarAccess.getBusinessClassDtoAccess().getSemicolonKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:522:6: ( ( rule__BusinessClassDto__Group_5_1__0 ) )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:522:6: ( ( rule__BusinessClassDto__Group_5_1__0 ) )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:523:1: ( rule__BusinessClassDto__Group_5_1__0 )
                    {
                     before(grammarAccess.getBusinessClassDtoAccess().getGroup_5_1()); 
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:524:1: ( rule__BusinessClassDto__Group_5_1__0 )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:524:2: rule__BusinessClassDto__Group_5_1__0
                    {
                    pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1__0_in_rule__BusinessClassDto__Alternatives_51090);
                    rule__BusinessClassDto__Group_5_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBusinessClassDtoAccess().getGroup_5_1()); 

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
    // $ANTLR end rule__BusinessClassDto__Alternatives_5


    // $ANTLR start rule__DtoProperty__Alternatives_0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:533:1: rule__DtoProperty__Alternatives_0 : ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) );
    public final void rule__DtoProperty__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:537:1: ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt4=3;
                    }
                    break;
                case 24:
                    {
                    alt4=2;
                    }
                    break;
                case 23:
                    {
                    alt4=1;
                    }
                    break;
                case 27:
                    {
                    alt4=5;
                    }
                    break;
                case 26:
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
                        new NoViableAltException("533:1: rule__DtoProperty__Alternatives_0 : ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) );", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case 23:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 25:
                {
                alt4=3;
                }
                break;
            case 26:
                {
                alt4=4;
                }
                break;
            case 27:
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
                    new NoViableAltException("533:1: rule__DtoProperty__Alternatives_0 : ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:538:1: ( ruleDtoBooleanProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:538:1: ( ruleDtoBooleanProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:539:1: ruleDtoBooleanProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoBooleanPropertyParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleDtoBooleanProperty_in_rule__DtoProperty__Alternatives_01123);
                    ruleDtoBooleanProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoBooleanPropertyParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:544:6: ( ruleDtoStringProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:544:6: ( ruleDtoStringProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:545:1: ruleDtoStringProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoStringPropertyParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleDtoStringProperty_in_rule__DtoProperty__Alternatives_01140);
                    ruleDtoStringProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoStringPropertyParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:550:6: ( ruleDtoDateTimeProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:550:6: ( ruleDtoDateTimeProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:551:1: ruleDtoDateTimeProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoDateTimePropertyParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleDtoDateTimeProperty_in_rule__DtoProperty__Alternatives_01157);
                    ruleDtoDateTimeProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoDateTimePropertyParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:556:6: ( ruleDtoIntegerProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:556:6: ( ruleDtoIntegerProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:557:1: ruleDtoIntegerProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoIntegerPropertyParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleDtoIntegerProperty_in_rule__DtoProperty__Alternatives_01174);
                    ruleDtoIntegerProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoIntegerPropertyParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:562:6: ( ruleDtoDecimalProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:562:6: ( ruleDtoDecimalProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:563:1: ruleDtoDecimalProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoDecimalPropertyParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleDtoDecimalProperty_in_rule__DtoProperty__Alternatives_01191);
                    ruleDtoDecimalProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoDecimalPropertyParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:568:6: ( ruleDtoEnumerationProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:568:6: ( ruleDtoEnumerationProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:569:1: ruleDtoEnumerationProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoEnumerationPropertyParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_ruleDtoEnumerationProperty_in_rule__DtoProperty__Alternatives_01208);
                    ruleDtoEnumerationProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoEnumerationPropertyParserRuleCall_0_5()); 

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
    // $ANTLR end rule__DtoProperty__Alternatives_0


    // $ANTLR start rule__DataContractModel__Group__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:581:1: rule__DataContractModel__Group__0 : ( ( rule__DataContractModel__DescriptionAssignment_0 )? ) rule__DataContractModel__Group__1 ;
    public final void rule__DataContractModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:585:1: ( ( ( rule__DataContractModel__DescriptionAssignment_0 )? ) rule__DataContractModel__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:586:1: ( ( rule__DataContractModel__DescriptionAssignment_0 )? ) rule__DataContractModel__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:586:1: ( ( rule__DataContractModel__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:587:1: ( rule__DataContractModel__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDataContractModelAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:588:1: ( rule__DataContractModel__DescriptionAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:588:2: rule__DataContractModel__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DataContractModel__DescriptionAssignment_0_in_rule__DataContractModel__Group__01242);
                    rule__DataContractModel__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataContractModelAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DataContractModel__Group__1_in_rule__DataContractModel__Group__01252);
            rule__DataContractModel__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataContractModel__Group__0


    // $ANTLR start rule__DataContractModel__Group__1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:599:1: rule__DataContractModel__Group__1 : ( 'datacontract' ) rule__DataContractModel__Group__2 ;
    public final void rule__DataContractModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:603:1: ( ( 'datacontract' ) rule__DataContractModel__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:604:1: ( 'datacontract' ) rule__DataContractModel__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:604:1: ( 'datacontract' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:605:1: 'datacontract'
            {
             before(grammarAccess.getDataContractModelAccess().getDatacontractKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__DataContractModel__Group__11281); 
             after(grammarAccess.getDataContractModelAccess().getDatacontractKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__DataContractModel__Group__2_in_rule__DataContractModel__Group__11291);
            rule__DataContractModel__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataContractModel__Group__1


    // $ANTLR start rule__DataContractModel__Group__2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:619:1: rule__DataContractModel__Group__2 : ( ( rule__DataContractModel__NameAssignment_2 ) ) rule__DataContractModel__Group__3 ;
    public final void rule__DataContractModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:623:1: ( ( ( rule__DataContractModel__NameAssignment_2 ) ) rule__DataContractModel__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:624:1: ( ( rule__DataContractModel__NameAssignment_2 ) ) rule__DataContractModel__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:624:1: ( ( rule__DataContractModel__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:625:1: ( rule__DataContractModel__NameAssignment_2 )
            {
             before(grammarAccess.getDataContractModelAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:626:1: ( rule__DataContractModel__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:626:2: rule__DataContractModel__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DataContractModel__NameAssignment_2_in_rule__DataContractModel__Group__21319);
            rule__DataContractModel__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDataContractModelAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__DataContractModel__Group__3_in_rule__DataContractModel__Group__21328);
            rule__DataContractModel__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataContractModel__Group__2


    // $ANTLR start rule__DataContractModel__Group__3
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:637:1: rule__DataContractModel__Group__3 : ( ';' ) rule__DataContractModel__Group__4 ;
    public final void rule__DataContractModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:641:1: ( ( ';' ) rule__DataContractModel__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:642:1: ( ';' ) rule__DataContractModel__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:642:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:643:1: ';'
            {
             before(grammarAccess.getDataContractModelAccess().getSemicolonKeyword_3()); 
            match(input,11,FOLLOW_11_in_rule__DataContractModel__Group__31357); 
             after(grammarAccess.getDataContractModelAccess().getSemicolonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__DataContractModel__Group__4_in_rule__DataContractModel__Group__31367);
            rule__DataContractModel__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataContractModel__Group__3


    // $ANTLR start rule__DataContractModel__Group__4
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:657:1: rule__DataContractModel__Group__4 : ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* ) rule__DataContractModel__Group__5 ;
    public final void rule__DataContractModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:661:1: ( ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* ) rule__DataContractModel__Group__5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:662:1: ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* ) rule__DataContractModel__Group__5
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:662:1: ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:663:1: ( rule__DataContractModel__ExternalReferencesAssignment_4 )*
            {
             before(grammarAccess.getDataContractModelAccess().getExternalReferencesAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:664:1: ( rule__DataContractModel__ExternalReferencesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==13) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:664:2: rule__DataContractModel__ExternalReferencesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__DataContractModel__ExternalReferencesAssignment_4_in_rule__DataContractModel__Group__41395);
            	    rule__DataContractModel__ExternalReferencesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDataContractModelAccess().getExternalReferencesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__DataContractModel__Group__5_in_rule__DataContractModel__Group__41405);
            rule__DataContractModel__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataContractModel__Group__4


    // $ANTLR start rule__DataContractModel__Group__5
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:675:1: rule__DataContractModel__Group__5 : ( ( rule__DataContractModel__Alternatives_5 )* ) ;
    public final void rule__DataContractModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:679:1: ( ( ( rule__DataContractModel__Alternatives_5 )* ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:680:1: ( ( rule__DataContractModel__Alternatives_5 )* )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:680:1: ( ( rule__DataContractModel__Alternatives_5 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:681:1: ( rule__DataContractModel__Alternatives_5 )*
            {
             before(grammarAccess.getDataContractModelAccess().getAlternatives_5()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:682:1: ( rule__DataContractModel__Alternatives_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING||LA7_0==15||LA7_0==20||LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:682:2: rule__DataContractModel__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__DataContractModel__Alternatives_5_in_rule__DataContractModel__Group__51433);
            	    rule__DataContractModel__Alternatives_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDataContractModelAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataContractModel__Group__5


    // $ANTLR start rule__ExternalReference__Group__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:704:1: rule__ExternalReference__Group__0 : ( ( rule__ExternalReference__DescriptionAssignment_0 )? ) rule__ExternalReference__Group__1 ;
    public final void rule__ExternalReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:708:1: ( ( ( rule__ExternalReference__DescriptionAssignment_0 )? ) rule__ExternalReference__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:709:1: ( ( rule__ExternalReference__DescriptionAssignment_0 )? ) rule__ExternalReference__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:709:1: ( ( rule__ExternalReference__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:710:1: ( rule__ExternalReference__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getExternalReferenceAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:711:1: ( rule__ExternalReference__DescriptionAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:711:2: rule__ExternalReference__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ExternalReference__DescriptionAssignment_0_in_rule__ExternalReference__Group__01480);
                    rule__ExternalReference__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalReferenceAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__1_in_rule__ExternalReference__Group__01490);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:722:1: rule__ExternalReference__Group__1 : ( 'from' ) rule__ExternalReference__Group__2 ;
    public final void rule__ExternalReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:726:1: ( ( 'from' ) rule__ExternalReference__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:727:1: ( 'from' ) rule__ExternalReference__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:727:1: ( 'from' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:728:1: 'from'
            {
             before(grammarAccess.getExternalReferenceAccess().getFromKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__ExternalReference__Group__11519); 
             after(grammarAccess.getExternalReferenceAccess().getFromKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__2_in_rule__ExternalReference__Group__11529);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:742:1: rule__ExternalReference__Group__2 : ( ( rule__ExternalReference__ModelnameAssignment_2 ) ) rule__ExternalReference__Group__3 ;
    public final void rule__ExternalReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:746:1: ( ( ( rule__ExternalReference__ModelnameAssignment_2 ) ) rule__ExternalReference__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:747:1: ( ( rule__ExternalReference__ModelnameAssignment_2 ) ) rule__ExternalReference__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:747:1: ( ( rule__ExternalReference__ModelnameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:748:1: ( rule__ExternalReference__ModelnameAssignment_2 )
            {
             before(grammarAccess.getExternalReferenceAccess().getModelnameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:749:1: ( rule__ExternalReference__ModelnameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:749:2: rule__ExternalReference__ModelnameAssignment_2
            {
            pushFollow(FOLLOW_rule__ExternalReference__ModelnameAssignment_2_in_rule__ExternalReference__Group__21557);
            rule__ExternalReference__ModelnameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getModelnameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__3_in_rule__ExternalReference__Group__21566);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:760:1: rule__ExternalReference__Group__3 : ( 'import' ) rule__ExternalReference__Group__4 ;
    public final void rule__ExternalReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:764:1: ( ( 'import' ) rule__ExternalReference__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:765:1: ( 'import' ) rule__ExternalReference__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:765:1: ( 'import' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:766:1: 'import'
            {
             before(grammarAccess.getExternalReferenceAccess().getImportKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__ExternalReference__Group__31595); 
             after(grammarAccess.getExternalReferenceAccess().getImportKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__4_in_rule__ExternalReference__Group__31605);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:780:1: rule__ExternalReference__Group__4 : ( ( rule__ExternalReference__NameAssignment_4 ) ) rule__ExternalReference__Group__5 ;
    public final void rule__ExternalReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:784:1: ( ( ( rule__ExternalReference__NameAssignment_4 ) ) rule__ExternalReference__Group__5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:785:1: ( ( rule__ExternalReference__NameAssignment_4 ) ) rule__ExternalReference__Group__5
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:785:1: ( ( rule__ExternalReference__NameAssignment_4 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:786:1: ( rule__ExternalReference__NameAssignment_4 )
            {
             before(grammarAccess.getExternalReferenceAccess().getNameAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:787:1: ( rule__ExternalReference__NameAssignment_4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:787:2: rule__ExternalReference__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__ExternalReference__NameAssignment_4_in_rule__ExternalReference__Group__41633);
            rule__ExternalReference__NameAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getNameAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__5_in_rule__ExternalReference__Group__41642);
            rule__ExternalReference__Group__5();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__ExternalReference__Group__5
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:798:1: rule__ExternalReference__Group__5 : ( ';' ) ;
    public final void rule__ExternalReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:802:1: ( ( ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:803:1: ( ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:803:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:804:1: ';'
            {
             before(grammarAccess.getExternalReferenceAccess().getSemicolonKeyword_5()); 
            match(input,11,FOLLOW_11_in_rule__ExternalReference__Group__51671); 
             after(grammarAccess.getExternalReferenceAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExternalReference__Group__5


    // $ANTLR start rule__BusinessClassDto__Group__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:829:1: rule__BusinessClassDto__Group__0 : ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? ) rule__BusinessClassDto__Group__1 ;
    public final void rule__BusinessClassDto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:833:1: ( ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? ) rule__BusinessClassDto__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:834:1: ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? ) rule__BusinessClassDto__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:834:1: ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:835:1: ( rule__BusinessClassDto__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBusinessClassDtoAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:836:1: ( rule__BusinessClassDto__DescriptionAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:836:2: rule__BusinessClassDto__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BusinessClassDto__DescriptionAssignment_0_in_rule__BusinessClassDto__Group__01718);
                    rule__BusinessClassDto__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassDtoAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__1_in_rule__BusinessClassDto__Group__01728);
            rule__BusinessClassDto__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group__0


    // $ANTLR start rule__BusinessClassDto__Group__1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:847:1: rule__BusinessClassDto__Group__1 : ( 'class' ) rule__BusinessClassDto__Group__2 ;
    public final void rule__BusinessClassDto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:851:1: ( ( 'class' ) rule__BusinessClassDto__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:852:1: ( 'class' ) rule__BusinessClassDto__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:852:1: ( 'class' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:853:1: 'class'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getClassKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__BusinessClassDto__Group__11757); 
             after(grammarAccess.getBusinessClassDtoAccess().getClassKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__2_in_rule__BusinessClassDto__Group__11767);
            rule__BusinessClassDto__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group__1


    // $ANTLR start rule__BusinessClassDto__Group__2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:867:1: rule__BusinessClassDto__Group__2 : ( ( rule__BusinessClassDto__NameAssignment_2 ) ) rule__BusinessClassDto__Group__3 ;
    public final void rule__BusinessClassDto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:871:1: ( ( ( rule__BusinessClassDto__NameAssignment_2 ) ) rule__BusinessClassDto__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:872:1: ( ( rule__BusinessClassDto__NameAssignment_2 ) ) rule__BusinessClassDto__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:872:1: ( ( rule__BusinessClassDto__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:873:1: ( rule__BusinessClassDto__NameAssignment_2 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:874:1: ( rule__BusinessClassDto__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:874:2: rule__BusinessClassDto__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__NameAssignment_2_in_rule__BusinessClassDto__Group__21795);
            rule__BusinessClassDto__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__3_in_rule__BusinessClassDto__Group__21804);
            rule__BusinessClassDto__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group__2


    // $ANTLR start rule__BusinessClassDto__Group__3
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:885:1: rule__BusinessClassDto__Group__3 : ( 'represents' ) rule__BusinessClassDto__Group__4 ;
    public final void rule__BusinessClassDto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:889:1: ( ( 'represents' ) rule__BusinessClassDto__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:890:1: ( 'represents' ) rule__BusinessClassDto__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:890:1: ( 'represents' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:891:1: 'represents'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getRepresentsKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__BusinessClassDto__Group__31833); 
             after(grammarAccess.getBusinessClassDtoAccess().getRepresentsKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__4_in_rule__BusinessClassDto__Group__31843);
            rule__BusinessClassDto__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group__3


    // $ANTLR start rule__BusinessClassDto__Group__4
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:905:1: rule__BusinessClassDto__Group__4 : ( ( rule__BusinessClassDto__BaseAssignment_4 ) ) rule__BusinessClassDto__Group__5 ;
    public final void rule__BusinessClassDto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:909:1: ( ( ( rule__BusinessClassDto__BaseAssignment_4 ) ) rule__BusinessClassDto__Group__5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:910:1: ( ( rule__BusinessClassDto__BaseAssignment_4 ) ) rule__BusinessClassDto__Group__5
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:910:1: ( ( rule__BusinessClassDto__BaseAssignment_4 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:911:1: ( rule__BusinessClassDto__BaseAssignment_4 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getBaseAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:912:1: ( rule__BusinessClassDto__BaseAssignment_4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:912:2: rule__BusinessClassDto__BaseAssignment_4
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__BaseAssignment_4_in_rule__BusinessClassDto__Group__41871);
            rule__BusinessClassDto__BaseAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getBaseAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__5_in_rule__BusinessClassDto__Group__41880);
            rule__BusinessClassDto__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group__4


    // $ANTLR start rule__BusinessClassDto__Group__5
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:923:1: rule__BusinessClassDto__Group__5 : ( ( rule__BusinessClassDto__Alternatives_5 ) ) ;
    public final void rule__BusinessClassDto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:927:1: ( ( ( rule__BusinessClassDto__Alternatives_5 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:928:1: ( ( rule__BusinessClassDto__Alternatives_5 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:928:1: ( ( rule__BusinessClassDto__Alternatives_5 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:929:1: ( rule__BusinessClassDto__Alternatives_5 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getAlternatives_5()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:930:1: ( rule__BusinessClassDto__Alternatives_5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:930:2: rule__BusinessClassDto__Alternatives_5
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__Alternatives_5_in_rule__BusinessClassDto__Group__51908);
            rule__BusinessClassDto__Alternatives_5();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group__5


    // $ANTLR start rule__BusinessClassDto__Group_5_1__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:952:1: rule__BusinessClassDto__Group_5_1__0 : ( '[' ) rule__BusinessClassDto__Group_5_1__1 ;
    public final void rule__BusinessClassDto__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:956:1: ( ( '[' ) rule__BusinessClassDto__Group_5_1__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:957:1: ( '[' ) rule__BusinessClassDto__Group_5_1__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:957:1: ( '[' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:958:1: '['
            {
             before(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_1_0()); 
            match(input,17,FOLLOW_17_in_rule__BusinessClassDto__Group_5_1__01955); 
             after(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_1_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1__1_in_rule__BusinessClassDto__Group_5_1__01965);
            rule__BusinessClassDto__Group_5_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group_5_1__0


    // $ANTLR start rule__BusinessClassDto__Group_5_1__1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:972:1: rule__BusinessClassDto__Group_5_1__1 : ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )* ) ) rule__BusinessClassDto__Group_5_1__2 ;
    public final void rule__BusinessClassDto__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:976:1: ( ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )* ) ) rule__BusinessClassDto__Group_5_1__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:977:1: ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )* ) ) rule__BusinessClassDto__Group_5_1__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:977:1: ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )* ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:978:1: ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )* )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:978:1: ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:979:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesAssignment_5_1_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:980:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:980:2: rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1_in_rule__BusinessClassDto__Group_5_1__11995);
            rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesAssignment_5_1_1()); 

            }

            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:983:1: ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:984:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )*
            {
             before(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesAssignment_5_1_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:985:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:985:2: rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1
            	    {
            	    pushFollow(FOLLOW_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1_in_rule__BusinessClassDto__Group_5_1__12007);
            	    rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesAssignment_5_1_1()); 

            }


            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1__2_in_rule__BusinessClassDto__Group_5_1__12019);
            rule__BusinessClassDto__Group_5_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group_5_1__1


    // $ANTLR start rule__BusinessClassDto__Group_5_1__2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:997:1: rule__BusinessClassDto__Group_5_1__2 : ( ( rule__BusinessClassDto__Group_5_1_2__0 )? ) rule__BusinessClassDto__Group_5_1__3 ;
    public final void rule__BusinessClassDto__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1001:1: ( ( ( rule__BusinessClassDto__Group_5_1_2__0 )? ) rule__BusinessClassDto__Group_5_1__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1002:1: ( ( rule__BusinessClassDto__Group_5_1_2__0 )? ) rule__BusinessClassDto__Group_5_1__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1002:1: ( ( rule__BusinessClassDto__Group_5_1_2__0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1003:1: ( rule__BusinessClassDto__Group_5_1_2__0 )?
            {
             before(grammarAccess.getBusinessClassDtoAccess().getGroup_5_1_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1004:1: ( rule__BusinessClassDto__Group_5_1_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1004:2: rule__BusinessClassDto__Group_5_1_2__0
                    {
                    pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1_2__0_in_rule__BusinessClassDto__Group_5_1__22047);
                    rule__BusinessClassDto__Group_5_1_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassDtoAccess().getGroup_5_1_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1__3_in_rule__BusinessClassDto__Group_5_1__22057);
            rule__BusinessClassDto__Group_5_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group_5_1__2


    // $ANTLR start rule__BusinessClassDto__Group_5_1__3
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1015:1: rule__BusinessClassDto__Group_5_1__3 : ( ']' ) ;
    public final void rule__BusinessClassDto__Group_5_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1019:1: ( ( ']' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1020:1: ( ']' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1020:1: ( ']' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1021:1: ']'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getRightSquareBracketKeyword_5_1_3()); 
            match(input,18,FOLLOW_18_in_rule__BusinessClassDto__Group_5_1__32086); 
             after(grammarAccess.getBusinessClassDtoAccess().getRightSquareBracketKeyword_5_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group_5_1__3


    // $ANTLR start rule__BusinessClassDto__Group_5_1_2__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1042:1: rule__BusinessClassDto__Group_5_1_2__0 : ( 'references' ) rule__BusinessClassDto__Group_5_1_2__1 ;
    public final void rule__BusinessClassDto__Group_5_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1046:1: ( ( 'references' ) rule__BusinessClassDto__Group_5_1_2__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1047:1: ( 'references' ) rule__BusinessClassDto__Group_5_1_2__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1047:1: ( 'references' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1048:1: 'references'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getReferencesKeyword_5_1_2_0()); 
            match(input,19,FOLLOW_19_in_rule__BusinessClassDto__Group_5_1_2__02130); 
             after(grammarAccess.getBusinessClassDtoAccess().getReferencesKeyword_5_1_2_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1_2__1_in_rule__BusinessClassDto__Group_5_1_2__02140);
            rule__BusinessClassDto__Group_5_1_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group_5_1_2__0


    // $ANTLR start rule__BusinessClassDto__Group_5_1_2__1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1062:1: rule__BusinessClassDto__Group_5_1_2__1 : ( '[' ) rule__BusinessClassDto__Group_5_1_2__2 ;
    public final void rule__BusinessClassDto__Group_5_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1066:1: ( ( '[' ) rule__BusinessClassDto__Group_5_1_2__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1067:1: ( '[' ) rule__BusinessClassDto__Group_5_1_2__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1067:1: ( '[' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1068:1: '['
            {
             before(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_1_2_1()); 
            match(input,17,FOLLOW_17_in_rule__BusinessClassDto__Group_5_1_2__12169); 
             after(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_1_2_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1_2__2_in_rule__BusinessClassDto__Group_5_1_2__12179);
            rule__BusinessClassDto__Group_5_1_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group_5_1_2__1


    // $ANTLR start rule__BusinessClassDto__Group_5_1_2__2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1082:1: rule__BusinessClassDto__Group_5_1_2__2 : ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )* ) ) rule__BusinessClassDto__Group_5_1_2__3 ;
    public final void rule__BusinessClassDto__Group_5_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1086:1: ( ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )* ) ) rule__BusinessClassDto__Group_5_1_2__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1087:1: ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )* ) ) rule__BusinessClassDto__Group_5_1_2__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1087:1: ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )* ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1088:1: ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )* )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1088:1: ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1089:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesAssignment_5_1_2_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1090:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1090:2: rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2_in_rule__BusinessClassDto__Group_5_1_2__22209);
            rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesAssignment_5_1_2_2()); 

            }

            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1093:1: ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1094:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )*
            {
             before(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesAssignment_5_1_2_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1095:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1095:2: rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2
            	    {
            	    pushFollow(FOLLOW_rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2_in_rule__BusinessClassDto__Group_5_1_2__22221);
            	    rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesAssignment_5_1_2_2()); 

            }


            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1_2__3_in_rule__BusinessClassDto__Group_5_1_2__22233);
            rule__BusinessClassDto__Group_5_1_2__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group_5_1_2__2


    // $ANTLR start rule__BusinessClassDto__Group_5_1_2__3
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1107:1: rule__BusinessClassDto__Group_5_1_2__3 : ( ']' ) ;
    public final void rule__BusinessClassDto__Group_5_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1111:1: ( ( ']' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1112:1: ( ']' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1112:1: ( ']' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1113:1: ']'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getRightSquareBracketKeyword_5_1_2_3()); 
            match(input,18,FOLLOW_18_in_rule__BusinessClassDto__Group_5_1_2__32262); 
             after(grammarAccess.getBusinessClassDtoAccess().getRightSquareBracketKeyword_5_1_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group_5_1_2__3


    // $ANTLR start rule__EnumerationDto__Group__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1134:1: rule__EnumerationDto__Group__0 : ( ( rule__EnumerationDto__DescriptionAssignment_0 )? ) rule__EnumerationDto__Group__1 ;
    public final void rule__EnumerationDto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1138:1: ( ( ( rule__EnumerationDto__DescriptionAssignment_0 )? ) rule__EnumerationDto__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1139:1: ( ( rule__EnumerationDto__DescriptionAssignment_0 )? ) rule__EnumerationDto__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1139:1: ( ( rule__EnumerationDto__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1140:1: ( rule__EnumerationDto__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumerationDtoAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1141:1: ( rule__EnumerationDto__DescriptionAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1141:2: rule__EnumerationDto__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EnumerationDto__DescriptionAssignment_0_in_rule__EnumerationDto__Group__02305);
                    rule__EnumerationDto__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationDtoAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationDto__Group__1_in_rule__EnumerationDto__Group__02315);
            rule__EnumerationDto__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationDto__Group__0


    // $ANTLR start rule__EnumerationDto__Group__1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1152:1: rule__EnumerationDto__Group__1 : ( 'enumeration' ) rule__EnumerationDto__Group__2 ;
    public final void rule__EnumerationDto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1156:1: ( ( 'enumeration' ) rule__EnumerationDto__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1157:1: ( 'enumeration' ) rule__EnumerationDto__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1157:1: ( 'enumeration' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1158:1: 'enumeration'
            {
             before(grammarAccess.getEnumerationDtoAccess().getEnumerationKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__EnumerationDto__Group__12344); 
             after(grammarAccess.getEnumerationDtoAccess().getEnumerationKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__EnumerationDto__Group__2_in_rule__EnumerationDto__Group__12354);
            rule__EnumerationDto__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationDto__Group__1


    // $ANTLR start rule__EnumerationDto__Group__2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1172:1: rule__EnumerationDto__Group__2 : ( ( rule__EnumerationDto__NameAssignment_2 ) ) rule__EnumerationDto__Group__3 ;
    public final void rule__EnumerationDto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1176:1: ( ( ( rule__EnumerationDto__NameAssignment_2 ) ) rule__EnumerationDto__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1177:1: ( ( rule__EnumerationDto__NameAssignment_2 ) ) rule__EnumerationDto__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1177:1: ( ( rule__EnumerationDto__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1178:1: ( rule__EnumerationDto__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationDtoAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1179:1: ( rule__EnumerationDto__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1179:2: rule__EnumerationDto__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumerationDto__NameAssignment_2_in_rule__EnumerationDto__Group__22382);
            rule__EnumerationDto__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEnumerationDtoAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__EnumerationDto__Group__3_in_rule__EnumerationDto__Group__22391);
            rule__EnumerationDto__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationDto__Group__2


    // $ANTLR start rule__EnumerationDto__Group__3
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1190:1: rule__EnumerationDto__Group__3 : ( 'represents' ) rule__EnumerationDto__Group__4 ;
    public final void rule__EnumerationDto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1194:1: ( ( 'represents' ) rule__EnumerationDto__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1195:1: ( 'represents' ) rule__EnumerationDto__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1195:1: ( 'represents' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1196:1: 'represents'
            {
             before(grammarAccess.getEnumerationDtoAccess().getRepresentsKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__EnumerationDto__Group__32420); 
             after(grammarAccess.getEnumerationDtoAccess().getRepresentsKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__EnumerationDto__Group__4_in_rule__EnumerationDto__Group__32430);
            rule__EnumerationDto__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationDto__Group__3


    // $ANTLR start rule__EnumerationDto__Group__4
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1210:1: rule__EnumerationDto__Group__4 : ( ( rule__EnumerationDto__BaseAssignment_4 ) ) rule__EnumerationDto__Group__5 ;
    public final void rule__EnumerationDto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1214:1: ( ( ( rule__EnumerationDto__BaseAssignment_4 ) ) rule__EnumerationDto__Group__5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1215:1: ( ( rule__EnumerationDto__BaseAssignment_4 ) ) rule__EnumerationDto__Group__5
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1215:1: ( ( rule__EnumerationDto__BaseAssignment_4 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1216:1: ( rule__EnumerationDto__BaseAssignment_4 )
            {
             before(grammarAccess.getEnumerationDtoAccess().getBaseAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1217:1: ( rule__EnumerationDto__BaseAssignment_4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1217:2: rule__EnumerationDto__BaseAssignment_4
            {
            pushFollow(FOLLOW_rule__EnumerationDto__BaseAssignment_4_in_rule__EnumerationDto__Group__42458);
            rule__EnumerationDto__BaseAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getEnumerationDtoAccess().getBaseAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__EnumerationDto__Group__5_in_rule__EnumerationDto__Group__42467);
            rule__EnumerationDto__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationDto__Group__4


    // $ANTLR start rule__EnumerationDto__Group__5
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1228:1: rule__EnumerationDto__Group__5 : ( ';' ) ;
    public final void rule__EnumerationDto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1232:1: ( ( ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1233:1: ( ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1233:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1234:1: ';'
            {
             before(grammarAccess.getEnumerationDtoAccess().getSemicolonKeyword_5()); 
            match(input,11,FOLLOW_11_in_rule__EnumerationDto__Group__52496); 
             after(grammarAccess.getEnumerationDtoAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationDto__Group__5


    // $ANTLR start rule__BusinessClassPropertyReference__Group__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1259:1: rule__BusinessClassPropertyReference__Group__0 : ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) ) rule__BusinessClassPropertyReference__Group__1 ;
    public final void rule__BusinessClassPropertyReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1263:1: ( ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) ) rule__BusinessClassPropertyReference__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1264:1: ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) ) rule__BusinessClassPropertyReference__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1264:1: ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1265:1: ( rule__BusinessClassPropertyReference__NameAssignment_0 )
            {
             before(grammarAccess.getBusinessClassPropertyReferenceAccess().getNameAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1266:1: ( rule__BusinessClassPropertyReference__NameAssignment_0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1266:2: rule__BusinessClassPropertyReference__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BusinessClassPropertyReference__NameAssignment_0_in_rule__BusinessClassPropertyReference__Group__02543);
            rule__BusinessClassPropertyReference__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassPropertyReferenceAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassPropertyReference__Group__1_in_rule__BusinessClassPropertyReference__Group__02552);
            rule__BusinessClassPropertyReference__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassPropertyReference__Group__0


    // $ANTLR start rule__BusinessClassPropertyReference__Group__1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1277:1: rule__BusinessClassPropertyReference__Group__1 : ( ';' ) ;
    public final void rule__BusinessClassPropertyReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1281:1: ( ( ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1282:1: ( ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1282:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1283:1: ';'
            {
             before(grammarAccess.getBusinessClassPropertyReferenceAccess().getSemicolonKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__BusinessClassPropertyReference__Group__12581); 
             after(grammarAccess.getBusinessClassPropertyReferenceAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassPropertyReference__Group__1


    // $ANTLR start rule__BusinessClassAssociationRoleReference__Group__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1300:1: rule__BusinessClassAssociationRoleReference__Group__0 : ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) ) rule__BusinessClassAssociationRoleReference__Group__1 ;
    public final void rule__BusinessClassAssociationRoleReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1304:1: ( ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) ) rule__BusinessClassAssociationRoleReference__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1305:1: ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) ) rule__BusinessClassAssociationRoleReference__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1305:1: ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1306:1: ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 )
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getNameAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1307:1: ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1307:2: rule__BusinessClassAssociationRoleReference__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__NameAssignment_0_in_rule__BusinessClassAssociationRoleReference__Group__02620);
            rule__BusinessClassAssociationRoleReference__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__Group__1_in_rule__BusinessClassAssociationRoleReference__Group__02629);
            rule__BusinessClassAssociationRoleReference__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassAssociationRoleReference__Group__0


    // $ANTLR start rule__BusinessClassAssociationRoleReference__Group__1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1318:1: rule__BusinessClassAssociationRoleReference__Group__1 : ( 'as' ) rule__BusinessClassAssociationRoleReference__Group__2 ;
    public final void rule__BusinessClassAssociationRoleReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1322:1: ( ( 'as' ) rule__BusinessClassAssociationRoleReference__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1323:1: ( 'as' ) rule__BusinessClassAssociationRoleReference__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1323:1: ( 'as' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1324:1: 'as'
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getAsKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__BusinessClassAssociationRoleReference__Group__12658); 
             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getAsKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__Group__2_in_rule__BusinessClassAssociationRoleReference__Group__12668);
            rule__BusinessClassAssociationRoleReference__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassAssociationRoleReference__Group__1


    // $ANTLR start rule__BusinessClassAssociationRoleReference__Group__2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1338:1: rule__BusinessClassAssociationRoleReference__Group__2 : ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) ) rule__BusinessClassAssociationRoleReference__Group__3 ;
    public final void rule__BusinessClassAssociationRoleReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1342:1: ( ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) ) rule__BusinessClassAssociationRoleReference__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1343:1: ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) ) rule__BusinessClassAssociationRoleReference__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1343:1: ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1344:1: ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 )
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1345:1: ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1345:2: rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2_in_rule__BusinessClassAssociationRoleReference__Group__22696);
            rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__Group__3_in_rule__BusinessClassAssociationRoleReference__Group__22705);
            rule__BusinessClassAssociationRoleReference__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassAssociationRoleReference__Group__2


    // $ANTLR start rule__BusinessClassAssociationRoleReference__Group__3
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1356:1: rule__BusinessClassAssociationRoleReference__Group__3 : ( ';' ) ;
    public final void rule__BusinessClassAssociationRoleReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1360:1: ( ( ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1361:1: ( ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1361:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1362:1: ';'
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getSemicolonKeyword_3()); 
            match(input,11,FOLLOW_11_in_rule__BusinessClassAssociationRoleReference__Group__32734); 
             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassAssociationRoleReference__Group__3


    // $ANTLR start rule__CustomDto__Group__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1383:1: rule__CustomDto__Group__0 : ( ( rule__CustomDto__DescriptionAssignment_0 )? ) rule__CustomDto__Group__1 ;
    public final void rule__CustomDto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1387:1: ( ( ( rule__CustomDto__DescriptionAssignment_0 )? ) rule__CustomDto__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1388:1: ( ( rule__CustomDto__DescriptionAssignment_0 )? ) rule__CustomDto__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1388:1: ( ( rule__CustomDto__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1389:1: ( rule__CustomDto__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getCustomDtoAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1390:1: ( rule__CustomDto__DescriptionAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1390:2: rule__CustomDto__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CustomDto__DescriptionAssignment_0_in_rule__CustomDto__Group__02777);
                    rule__CustomDto__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomDtoAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__CustomDto__Group__1_in_rule__CustomDto__Group__02787);
            rule__CustomDto__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomDto__Group__0


    // $ANTLR start rule__CustomDto__Group__1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1401:1: rule__CustomDto__Group__1 : ( 'custom' ) rule__CustomDto__Group__2 ;
    public final void rule__CustomDto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1405:1: ( ( 'custom' ) rule__CustomDto__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1406:1: ( 'custom' ) rule__CustomDto__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1406:1: ( 'custom' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1407:1: 'custom'
            {
             before(grammarAccess.getCustomDtoAccess().getCustomKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__CustomDto__Group__12816); 
             after(grammarAccess.getCustomDtoAccess().getCustomKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__CustomDto__Group__2_in_rule__CustomDto__Group__12826);
            rule__CustomDto__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomDto__Group__1


    // $ANTLR start rule__CustomDto__Group__2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1421:1: rule__CustomDto__Group__2 : ( ( rule__CustomDto__NameAssignment_2 ) ) rule__CustomDto__Group__3 ;
    public final void rule__CustomDto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1425:1: ( ( ( rule__CustomDto__NameAssignment_2 ) ) rule__CustomDto__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1426:1: ( ( rule__CustomDto__NameAssignment_2 ) ) rule__CustomDto__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1426:1: ( ( rule__CustomDto__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1427:1: ( rule__CustomDto__NameAssignment_2 )
            {
             before(grammarAccess.getCustomDtoAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1428:1: ( rule__CustomDto__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1428:2: rule__CustomDto__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CustomDto__NameAssignment_2_in_rule__CustomDto__Group__22854);
            rule__CustomDto__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCustomDtoAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__CustomDto__Group__3_in_rule__CustomDto__Group__22863);
            rule__CustomDto__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomDto__Group__2


    // $ANTLR start rule__CustomDto__Group__3
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1439:1: rule__CustomDto__Group__3 : ( '[' ) rule__CustomDto__Group__4 ;
    public final void rule__CustomDto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1443:1: ( ( '[' ) rule__CustomDto__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1444:1: ( '[' ) rule__CustomDto__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1444:1: ( '[' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1445:1: '['
            {
             before(grammarAccess.getCustomDtoAccess().getLeftSquareBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__CustomDto__Group__32892); 
             after(grammarAccess.getCustomDtoAccess().getLeftSquareBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__CustomDto__Group__4_in_rule__CustomDto__Group__32902);
            rule__CustomDto__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomDto__Group__3


    // $ANTLR start rule__CustomDto__Group__4
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1459:1: rule__CustomDto__Group__4 : ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) ) rule__CustomDto__Group__5 ;
    public final void rule__CustomDto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1463:1: ( ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) ) rule__CustomDto__Group__5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1464:1: ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) ) rule__CustomDto__Group__5
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1464:1: ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1465:1: ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1465:1: ( ( rule__CustomDto__PropertiesAssignment_4 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1466:1: ( rule__CustomDto__PropertiesAssignment_4 )
            {
             before(grammarAccess.getCustomDtoAccess().getPropertiesAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1467:1: ( rule__CustomDto__PropertiesAssignment_4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1467:2: rule__CustomDto__PropertiesAssignment_4
            {
            pushFollow(FOLLOW_rule__CustomDto__PropertiesAssignment_4_in_rule__CustomDto__Group__42932);
            rule__CustomDto__PropertiesAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getCustomDtoAccess().getPropertiesAssignment_4()); 

            }

            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1470:1: ( ( rule__CustomDto__PropertiesAssignment_4 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1471:1: ( rule__CustomDto__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getCustomDtoAccess().getPropertiesAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1472:1: ( rule__CustomDto__PropertiesAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)||(LA15_0>=23 && LA15_0<=27)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1472:2: rule__CustomDto__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__CustomDto__PropertiesAssignment_4_in_rule__CustomDto__Group__42944);
            	    rule__CustomDto__PropertiesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getCustomDtoAccess().getPropertiesAssignment_4()); 

            }


            }

            pushFollow(FOLLOW_rule__CustomDto__Group__5_in_rule__CustomDto__Group__42956);
            rule__CustomDto__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomDto__Group__4


    // $ANTLR start rule__CustomDto__Group__5
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1484:1: rule__CustomDto__Group__5 : ( ']' ) ;
    public final void rule__CustomDto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1488:1: ( ( ']' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1489:1: ( ']' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1489:1: ( ']' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1490:1: ']'
            {
             before(grammarAccess.getCustomDtoAccess().getRightSquareBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__CustomDto__Group__52985); 
             after(grammarAccess.getCustomDtoAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomDto__Group__5


    // $ANTLR start rule__DtoProperty__Group__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1515:1: rule__DtoProperty__Group__0 : ( ( rule__DtoProperty__Alternatives_0 ) ) rule__DtoProperty__Group__1 ;
    public final void rule__DtoProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1519:1: ( ( ( rule__DtoProperty__Alternatives_0 ) ) rule__DtoProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1520:1: ( ( rule__DtoProperty__Alternatives_0 ) ) rule__DtoProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1520:1: ( ( rule__DtoProperty__Alternatives_0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1521:1: ( rule__DtoProperty__Alternatives_0 )
            {
             before(grammarAccess.getDtoPropertyAccess().getAlternatives_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1522:1: ( rule__DtoProperty__Alternatives_0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1522:2: rule__DtoProperty__Alternatives_0
            {
            pushFollow(FOLLOW_rule__DtoProperty__Alternatives_0_in_rule__DtoProperty__Group__03032);
            rule__DtoProperty__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getDtoPropertyAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__DtoProperty__Group__1_in_rule__DtoProperty__Group__03041);
            rule__DtoProperty__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoProperty__Group__0


    // $ANTLR start rule__DtoProperty__Group__1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1533:1: rule__DtoProperty__Group__1 : ( ';' ) ;
    public final void rule__DtoProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1537:1: ( ( ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1538:1: ( ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1538:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1539:1: ';'
            {
             before(grammarAccess.getDtoPropertyAccess().getSemicolonKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__DtoProperty__Group__13070); 
             after(grammarAccess.getDtoPropertyAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoProperty__Group__1


    // $ANTLR start rule__DtoBooleanProperty__Group__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1556:1: rule__DtoBooleanProperty__Group__0 : ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? ) rule__DtoBooleanProperty__Group__1 ;
    public final void rule__DtoBooleanProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1560:1: ( ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? ) rule__DtoBooleanProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1561:1: ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? ) rule__DtoBooleanProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1561:1: ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1562:1: ( rule__DtoBooleanProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1563:1: ( rule__DtoBooleanProperty__DescriptionAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1563:2: rule__DtoBooleanProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoBooleanProperty__DescriptionAssignment_0_in_rule__DtoBooleanProperty__Group__03109);
                    rule__DtoBooleanProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoBooleanPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoBooleanProperty__Group__1_in_rule__DtoBooleanProperty__Group__03119);
            rule__DtoBooleanProperty__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoBooleanProperty__Group__0


    // $ANTLR start rule__DtoBooleanProperty__Group__1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1574:1: rule__DtoBooleanProperty__Group__1 : ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) ) rule__DtoBooleanProperty__Group__2 ;
    public final void rule__DtoBooleanProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1578:1: ( ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) ) rule__DtoBooleanProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1579:1: ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) ) rule__DtoBooleanProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1579:1: ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1580:1: ( rule__DtoBooleanProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1581:1: ( rule__DtoBooleanProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1581:2: rule__DtoBooleanProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoBooleanProperty__DataTypeAssignment_1_in_rule__DtoBooleanProperty__Group__13147);
            rule__DtoBooleanProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoBooleanProperty__Group__2_in_rule__DtoBooleanProperty__Group__13156);
            rule__DtoBooleanProperty__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoBooleanProperty__Group__1


    // $ANTLR start rule__DtoBooleanProperty__Group__2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1592:1: rule__DtoBooleanProperty__Group__2 : ( ( rule__DtoBooleanProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoBooleanProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1596:1: ( ( ( rule__DtoBooleanProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1597:1: ( ( rule__DtoBooleanProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1597:1: ( ( rule__DtoBooleanProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1598:1: ( rule__DtoBooleanProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1599:1: ( rule__DtoBooleanProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1599:2: rule__DtoBooleanProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoBooleanProperty__NameAssignment_2_in_rule__DtoBooleanProperty__Group__23184);
            rule__DtoBooleanProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDtoBooleanPropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoBooleanProperty__Group__2


    // $ANTLR start rule__DtoStringProperty__Group__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1615:1: rule__DtoStringProperty__Group__0 : ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? ) rule__DtoStringProperty__Group__1 ;
    public final void rule__DtoStringProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1619:1: ( ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? ) rule__DtoStringProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1620:1: ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? ) rule__DtoStringProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1620:1: ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1621:1: ( rule__DtoStringProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1622:1: ( rule__DtoStringProperty__DescriptionAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1622:2: rule__DtoStringProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoStringProperty__DescriptionAssignment_0_in_rule__DtoStringProperty__Group__03224);
                    rule__DtoStringProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoStringPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoStringProperty__Group__1_in_rule__DtoStringProperty__Group__03234);
            rule__DtoStringProperty__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoStringProperty__Group__0


    // $ANTLR start rule__DtoStringProperty__Group__1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1633:1: rule__DtoStringProperty__Group__1 : ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) ) rule__DtoStringProperty__Group__2 ;
    public final void rule__DtoStringProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1637:1: ( ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) ) rule__DtoStringProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1638:1: ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) ) rule__DtoStringProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1638:1: ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1639:1: ( rule__DtoStringProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1640:1: ( rule__DtoStringProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1640:2: rule__DtoStringProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoStringProperty__DataTypeAssignment_1_in_rule__DtoStringProperty__Group__13262);
            rule__DtoStringProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoStringPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoStringProperty__Group__2_in_rule__DtoStringProperty__Group__13271);
            rule__DtoStringProperty__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoStringProperty__Group__1


    // $ANTLR start rule__DtoStringProperty__Group__2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1651:1: rule__DtoStringProperty__Group__2 : ( ( rule__DtoStringProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoStringProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1655:1: ( ( ( rule__DtoStringProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1656:1: ( ( rule__DtoStringProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1656:1: ( ( rule__DtoStringProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1657:1: ( rule__DtoStringProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoStringPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1658:1: ( rule__DtoStringProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1658:2: rule__DtoStringProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoStringProperty__NameAssignment_2_in_rule__DtoStringProperty__Group__23299);
            rule__DtoStringProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDtoStringPropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoStringProperty__Group__2


    // $ANTLR start rule__DtoDateTimeProperty__Group__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1674:1: rule__DtoDateTimeProperty__Group__0 : ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? ) rule__DtoDateTimeProperty__Group__1 ;
    public final void rule__DtoDateTimeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1678:1: ( ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? ) rule__DtoDateTimeProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1679:1: ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? ) rule__DtoDateTimeProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1679:1: ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1680:1: ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1681:1: ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1681:2: rule__DtoDateTimeProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoDateTimeProperty__DescriptionAssignment_0_in_rule__DtoDateTimeProperty__Group__03339);
                    rule__DtoDateTimeProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoDateTimePropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoDateTimeProperty__Group__1_in_rule__DtoDateTimeProperty__Group__03349);
            rule__DtoDateTimeProperty__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoDateTimeProperty__Group__0


    // $ANTLR start rule__DtoDateTimeProperty__Group__1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1692:1: rule__DtoDateTimeProperty__Group__1 : ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) ) rule__DtoDateTimeProperty__Group__2 ;
    public final void rule__DtoDateTimeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1696:1: ( ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) ) rule__DtoDateTimeProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1697:1: ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) ) rule__DtoDateTimeProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1697:1: ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1698:1: ( rule__DtoDateTimeProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1699:1: ( rule__DtoDateTimeProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1699:2: rule__DtoDateTimeProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoDateTimeProperty__DataTypeAssignment_1_in_rule__DtoDateTimeProperty__Group__13377);
            rule__DtoDateTimeProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoDateTimeProperty__Group__2_in_rule__DtoDateTimeProperty__Group__13386);
            rule__DtoDateTimeProperty__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoDateTimeProperty__Group__1


    // $ANTLR start rule__DtoDateTimeProperty__Group__2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1710:1: rule__DtoDateTimeProperty__Group__2 : ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoDateTimeProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1714:1: ( ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1715:1: ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1715:1: ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1716:1: ( rule__DtoDateTimeProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1717:1: ( rule__DtoDateTimeProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1717:2: rule__DtoDateTimeProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoDateTimeProperty__NameAssignment_2_in_rule__DtoDateTimeProperty__Group__23414);
            rule__DtoDateTimeProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDtoDateTimePropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoDateTimeProperty__Group__2


    // $ANTLR start rule__DtoIntegerProperty__Group__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1733:1: rule__DtoIntegerProperty__Group__0 : ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? ) rule__DtoIntegerProperty__Group__1 ;
    public final void rule__DtoIntegerProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1737:1: ( ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? ) rule__DtoIntegerProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1738:1: ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? ) rule__DtoIntegerProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1738:1: ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1739:1: ( rule__DtoIntegerProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1740:1: ( rule__DtoIntegerProperty__DescriptionAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1740:2: rule__DtoIntegerProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoIntegerProperty__DescriptionAssignment_0_in_rule__DtoIntegerProperty__Group__03454);
                    rule__DtoIntegerProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoIntegerPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoIntegerProperty__Group__1_in_rule__DtoIntegerProperty__Group__03464);
            rule__DtoIntegerProperty__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoIntegerProperty__Group__0


    // $ANTLR start rule__DtoIntegerProperty__Group__1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1751:1: rule__DtoIntegerProperty__Group__1 : ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) ) rule__DtoIntegerProperty__Group__2 ;
    public final void rule__DtoIntegerProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1755:1: ( ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) ) rule__DtoIntegerProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1756:1: ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) ) rule__DtoIntegerProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1756:1: ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1757:1: ( rule__DtoIntegerProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1758:1: ( rule__DtoIntegerProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1758:2: rule__DtoIntegerProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoIntegerProperty__DataTypeAssignment_1_in_rule__DtoIntegerProperty__Group__13492);
            rule__DtoIntegerProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoIntegerProperty__Group__2_in_rule__DtoIntegerProperty__Group__13501);
            rule__DtoIntegerProperty__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoIntegerProperty__Group__1


    // $ANTLR start rule__DtoIntegerProperty__Group__2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1769:1: rule__DtoIntegerProperty__Group__2 : ( ( rule__DtoIntegerProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoIntegerProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1773:1: ( ( ( rule__DtoIntegerProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1774:1: ( ( rule__DtoIntegerProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1774:1: ( ( rule__DtoIntegerProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1775:1: ( rule__DtoIntegerProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1776:1: ( rule__DtoIntegerProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1776:2: rule__DtoIntegerProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoIntegerProperty__NameAssignment_2_in_rule__DtoIntegerProperty__Group__23529);
            rule__DtoIntegerProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDtoIntegerPropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoIntegerProperty__Group__2


    // $ANTLR start rule__DtoDecimalProperty__Group__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1792:1: rule__DtoDecimalProperty__Group__0 : ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? ) rule__DtoDecimalProperty__Group__1 ;
    public final void rule__DtoDecimalProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1796:1: ( ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? ) rule__DtoDecimalProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1797:1: ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? ) rule__DtoDecimalProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1797:1: ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1798:1: ( rule__DtoDecimalProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1799:1: ( rule__DtoDecimalProperty__DescriptionAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1799:2: rule__DtoDecimalProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoDecimalProperty__DescriptionAssignment_0_in_rule__DtoDecimalProperty__Group__03569);
                    rule__DtoDecimalProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoDecimalPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoDecimalProperty__Group__1_in_rule__DtoDecimalProperty__Group__03579);
            rule__DtoDecimalProperty__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoDecimalProperty__Group__0


    // $ANTLR start rule__DtoDecimalProperty__Group__1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1810:1: rule__DtoDecimalProperty__Group__1 : ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) ) rule__DtoDecimalProperty__Group__2 ;
    public final void rule__DtoDecimalProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1814:1: ( ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) ) rule__DtoDecimalProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1815:1: ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) ) rule__DtoDecimalProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1815:1: ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1816:1: ( rule__DtoDecimalProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1817:1: ( rule__DtoDecimalProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1817:2: rule__DtoDecimalProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoDecimalProperty__DataTypeAssignment_1_in_rule__DtoDecimalProperty__Group__13607);
            rule__DtoDecimalProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoDecimalProperty__Group__2_in_rule__DtoDecimalProperty__Group__13616);
            rule__DtoDecimalProperty__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoDecimalProperty__Group__1


    // $ANTLR start rule__DtoDecimalProperty__Group__2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1828:1: rule__DtoDecimalProperty__Group__2 : ( ( rule__DtoDecimalProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoDecimalProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1832:1: ( ( ( rule__DtoDecimalProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1833:1: ( ( rule__DtoDecimalProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1833:1: ( ( rule__DtoDecimalProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1834:1: ( rule__DtoDecimalProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1835:1: ( rule__DtoDecimalProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1835:2: rule__DtoDecimalProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoDecimalProperty__NameAssignment_2_in_rule__DtoDecimalProperty__Group__23644);
            rule__DtoDecimalProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDtoDecimalPropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoDecimalProperty__Group__2


    // $ANTLR start rule__DtoEnumerationProperty__Group__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1851:1: rule__DtoEnumerationProperty__Group__0 : ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? ) rule__DtoEnumerationProperty__Group__1 ;
    public final void rule__DtoEnumerationProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1855:1: ( ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? ) rule__DtoEnumerationProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1856:1: ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? ) rule__DtoEnumerationProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1856:1: ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1857:1: ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1858:1: ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1858:2: rule__DtoEnumerationProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoEnumerationProperty__DescriptionAssignment_0_in_rule__DtoEnumerationProperty__Group__03684);
                    rule__DtoEnumerationProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoEnumerationPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoEnumerationProperty__Group__1_in_rule__DtoEnumerationProperty__Group__03694);
            rule__DtoEnumerationProperty__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoEnumerationProperty__Group__0


    // $ANTLR start rule__DtoEnumerationProperty__Group__1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1869:1: rule__DtoEnumerationProperty__Group__1 : ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) ) rule__DtoEnumerationProperty__Group__2 ;
    public final void rule__DtoEnumerationProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1873:1: ( ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) ) rule__DtoEnumerationProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1874:1: ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) ) rule__DtoEnumerationProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1874:1: ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1875:1: ( rule__DtoEnumerationProperty__TypeAssignment_1 )
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1876:1: ( rule__DtoEnumerationProperty__TypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1876:2: rule__DtoEnumerationProperty__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoEnumerationProperty__TypeAssignment_1_in_rule__DtoEnumerationProperty__Group__13722);
            rule__DtoEnumerationProperty__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoEnumerationPropertyAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoEnumerationProperty__Group__2_in_rule__DtoEnumerationProperty__Group__13731);
            rule__DtoEnumerationProperty__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoEnumerationProperty__Group__1


    // $ANTLR start rule__DtoEnumerationProperty__Group__2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1887:1: rule__DtoEnumerationProperty__Group__2 : ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoEnumerationProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1891:1: ( ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1892:1: ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1892:1: ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1893:1: ( rule__DtoEnumerationProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1894:1: ( rule__DtoEnumerationProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1894:2: rule__DtoEnumerationProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoEnumerationProperty__NameAssignment_2_in_rule__DtoEnumerationProperty__Group__23759);
            rule__DtoEnumerationProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDtoEnumerationPropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoEnumerationProperty__Group__2


    // $ANTLR start rule__DataContractModel__DescriptionAssignment_0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1910:1: rule__DataContractModel__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DataContractModel__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1914:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1915:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1915:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1916:1: RULE_STRING
            {
             before(grammarAccess.getDataContractModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DataContractModel__DescriptionAssignment_03799); 
             after(grammarAccess.getDataContractModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataContractModel__DescriptionAssignment_0


    // $ANTLR start rule__DataContractModel__NameAssignment_2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1925:1: rule__DataContractModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataContractModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1929:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1930:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1930:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1931:1: RULE_ID
            {
             before(grammarAccess.getDataContractModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataContractModel__NameAssignment_23830); 
             after(grammarAccess.getDataContractModelAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataContractModel__NameAssignment_2


    // $ANTLR start rule__DataContractModel__ExternalReferencesAssignment_4
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1940:1: rule__DataContractModel__ExternalReferencesAssignment_4 : ( ruleExternalReference ) ;
    public final void rule__DataContractModel__ExternalReferencesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1944:1: ( ( ruleExternalReference ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1945:1: ( ruleExternalReference )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1945:1: ( ruleExternalReference )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1946:1: ruleExternalReference
            {
             before(grammarAccess.getDataContractModelAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExternalReference_in_rule__DataContractModel__ExternalReferencesAssignment_43861);
            ruleExternalReference();
            _fsp--;

             after(grammarAccess.getDataContractModelAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataContractModel__ExternalReferencesAssignment_4


    // $ANTLR start rule__DataContractModel__DtosAssignment_5_0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1955:1: rule__DataContractModel__DtosAssignment_5_0 : ( ruleDto ) ;
    public final void rule__DataContractModel__DtosAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1959:1: ( ( ruleDto ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1960:1: ( ruleDto )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1960:1: ( ruleDto )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1961:1: ruleDto
            {
             before(grammarAccess.getDataContractModelAccess().getDtosDtoParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleDto_in_rule__DataContractModel__DtosAssignment_5_03892);
            ruleDto();
            _fsp--;

             after(grammarAccess.getDataContractModelAccess().getDtosDtoParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataContractModel__DtosAssignment_5_0


    // $ANTLR start rule__DataContractModel__EnumerationsAssignment_5_1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1970:1: rule__DataContractModel__EnumerationsAssignment_5_1 : ( ruleEnumerationDto ) ;
    public final void rule__DataContractModel__EnumerationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1974:1: ( ( ruleEnumerationDto ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1975:1: ( ruleEnumerationDto )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1975:1: ( ruleEnumerationDto )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1976:1: ruleEnumerationDto
            {
             before(grammarAccess.getDataContractModelAccess().getEnumerationsEnumerationDtoParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleEnumerationDto_in_rule__DataContractModel__EnumerationsAssignment_5_13923);
            ruleEnumerationDto();
            _fsp--;

             after(grammarAccess.getDataContractModelAccess().getEnumerationsEnumerationDtoParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DataContractModel__EnumerationsAssignment_5_1


    // $ANTLR start rule__ExternalReference__DescriptionAssignment_0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1985:1: rule__ExternalReference__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ExternalReference__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1989:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1990:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1990:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1991:1: RULE_STRING
            {
             before(grammarAccess.getExternalReferenceAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ExternalReference__DescriptionAssignment_03954); 
             after(grammarAccess.getExternalReferenceAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExternalReference__DescriptionAssignment_0


    // $ANTLR start rule__ExternalReference__ModelnameAssignment_2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2000:1: rule__ExternalReference__ModelnameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ExternalReference__ModelnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2004:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2005:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2005:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2006:1: RULE_ID
            {
             before(grammarAccess.getExternalReferenceAccess().getModelnameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalReference__ModelnameAssignment_23985); 
             after(grammarAccess.getExternalReferenceAccess().getModelnameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExternalReference__ModelnameAssignment_2


    // $ANTLR start rule__ExternalReference__NameAssignment_4
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2015:1: rule__ExternalReference__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__ExternalReference__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2019:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2020:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2020:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2021:1: RULE_ID
            {
             before(grammarAccess.getExternalReferenceAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalReference__NameAssignment_44016); 
             after(grammarAccess.getExternalReferenceAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExternalReference__NameAssignment_4


    // $ANTLR start rule__BusinessClassDto__DescriptionAssignment_0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2030:1: rule__BusinessClassDto__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessClassDto__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2034:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2035:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2035:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2036:1: RULE_STRING
            {
             before(grammarAccess.getBusinessClassDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BusinessClassDto__DescriptionAssignment_04047); 
             after(grammarAccess.getBusinessClassDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__DescriptionAssignment_0


    // $ANTLR start rule__BusinessClassDto__NameAssignment_2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2045:1: rule__BusinessClassDto__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessClassDto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2049:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2050:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2050:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2051:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassDtoAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassDto__NameAssignment_24078); 
             after(grammarAccess.getBusinessClassDtoAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__NameAssignment_2


    // $ANTLR start rule__BusinessClassDto__BaseAssignment_4
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2060:1: rule__BusinessClassDto__BaseAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__BusinessClassDto__BaseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2064:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2065:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2065:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2066:1: ( RULE_ID )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getBaseExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2067:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2068:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassDtoAccess().getBaseExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassDto__BaseAssignment_44113); 
             after(grammarAccess.getBusinessClassDtoAccess().getBaseExternalReferenceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getBusinessClassDtoAccess().getBaseExternalReferenceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__BaseAssignment_4


    // $ANTLR start rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2079:1: rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 : ( ruleBusinessClassPropertyReference ) ;
    public final void rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2083:1: ( ( ruleBusinessClassPropertyReference ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2084:1: ( ruleBusinessClassPropertyReference )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2084:1: ( ruleBusinessClassPropertyReference )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2085:1: ruleBusinessClassPropertyReference
            {
             before(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesBusinessClassPropertyReferenceParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_ruleBusinessClassPropertyReference_in_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_14148);
            ruleBusinessClassPropertyReference();
            _fsp--;

             after(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesBusinessClassPropertyReferenceParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1


    // $ANTLR start rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2094:1: rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 : ( ruleBusinessClassAssociationRoleReference ) ;
    public final void rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2098:1: ( ( ruleBusinessClassAssociationRoleReference ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2099:1: ( ruleBusinessClassAssociationRoleReference )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2099:1: ( ruleBusinessClassAssociationRoleReference )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2100:1: ruleBusinessClassAssociationRoleReference
            {
             before(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesBusinessClassAssociationRoleReferenceParserRuleCall_5_1_2_2_0()); 
            pushFollow(FOLLOW_ruleBusinessClassAssociationRoleReference_in_rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_24179);
            ruleBusinessClassAssociationRoleReference();
            _fsp--;

             after(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesBusinessClassAssociationRoleReferenceParserRuleCall_5_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2


    // $ANTLR start rule__EnumerationDto__DescriptionAssignment_0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2109:1: rule__EnumerationDto__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__EnumerationDto__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2113:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2114:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2114:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2115:1: RULE_STRING
            {
             before(grammarAccess.getEnumerationDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnumerationDto__DescriptionAssignment_04210); 
             after(grammarAccess.getEnumerationDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationDto__DescriptionAssignment_0


    // $ANTLR start rule__EnumerationDto__NameAssignment_2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2124:1: rule__EnumerationDto__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumerationDto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2128:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2129:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2129:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2130:1: RULE_ID
            {
             before(grammarAccess.getEnumerationDtoAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationDto__NameAssignment_24241); 
             after(grammarAccess.getEnumerationDtoAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationDto__NameAssignment_2


    // $ANTLR start rule__EnumerationDto__BaseAssignment_4
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2139:1: rule__EnumerationDto__BaseAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__EnumerationDto__BaseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2143:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2144:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2144:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2145:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumerationDtoAccess().getBaseExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2146:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2147:1: RULE_ID
            {
             before(grammarAccess.getEnumerationDtoAccess().getBaseExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationDto__BaseAssignment_44276); 
             after(grammarAccess.getEnumerationDtoAccess().getBaseExternalReferenceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getEnumerationDtoAccess().getBaseExternalReferenceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationDto__BaseAssignment_4


    // $ANTLR start rule__BusinessClassPropertyReference__NameAssignment_0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2158:1: rule__BusinessClassPropertyReference__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BusinessClassPropertyReference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2162:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2163:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2163:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2164:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassPropertyReferenceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassPropertyReference__NameAssignment_04311); 
             after(grammarAccess.getBusinessClassPropertyReferenceAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassPropertyReference__NameAssignment_0


    // $ANTLR start rule__BusinessClassAssociationRoleReference__NameAssignment_0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2173:1: rule__BusinessClassAssociationRoleReference__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BusinessClassAssociationRoleReference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2177:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2178:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2178:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2179:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassAssociationRoleReference__NameAssignment_04342); 
             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassAssociationRoleReference__NameAssignment_0


    // $ANTLR start rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2188:1: rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2192:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2193:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2193:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2194:1: ( RULE_ID )
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeDtoCrossReference_2_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2195:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2196:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeDtoIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_24377); 
             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeDtoIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeDtoCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2


    // $ANTLR start rule__CustomDto__DescriptionAssignment_0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2207:1: rule__CustomDto__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__CustomDto__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2211:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2212:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2212:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2213:1: RULE_STRING
            {
             before(grammarAccess.getCustomDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CustomDto__DescriptionAssignment_04412); 
             after(grammarAccess.getCustomDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomDto__DescriptionAssignment_0


    // $ANTLR start rule__CustomDto__NameAssignment_2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2222:1: rule__CustomDto__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CustomDto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2226:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2227:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2227:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2228:1: RULE_ID
            {
             before(grammarAccess.getCustomDtoAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomDto__NameAssignment_24443); 
             after(grammarAccess.getCustomDtoAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomDto__NameAssignment_2


    // $ANTLR start rule__CustomDto__PropertiesAssignment_4
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2237:1: rule__CustomDto__PropertiesAssignment_4 : ( ruleDtoProperty ) ;
    public final void rule__CustomDto__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2241:1: ( ( ruleDtoProperty ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2242:1: ( ruleDtoProperty )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2242:1: ( ruleDtoProperty )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2243:1: ruleDtoProperty
            {
             before(grammarAccess.getCustomDtoAccess().getPropertiesDtoPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDtoProperty_in_rule__CustomDto__PropertiesAssignment_44474);
            ruleDtoProperty();
            _fsp--;

             after(grammarAccess.getCustomDtoAccess().getPropertiesDtoPropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomDto__PropertiesAssignment_4


    // $ANTLR start rule__DtoBooleanProperty__DescriptionAssignment_0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2252:1: rule__DtoBooleanProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoBooleanProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2256:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2257:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2257:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2258:1: RULE_STRING
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoBooleanProperty__DescriptionAssignment_04505); 
             after(grammarAccess.getDtoBooleanPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoBooleanProperty__DescriptionAssignment_0


    // $ANTLR start rule__DtoBooleanProperty__DataTypeAssignment_1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2267:1: rule__DtoBooleanProperty__DataTypeAssignment_1 : ( ( 'boolean' ) ) ;
    public final void rule__DtoBooleanProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2271:1: ( ( ( 'boolean' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2272:1: ( ( 'boolean' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2272:1: ( ( 'boolean' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2273:1: ( 'boolean' )
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeBooleanKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2274:1: ( 'boolean' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2275:1: 'boolean'
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeBooleanKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__DtoBooleanProperty__DataTypeAssignment_14541); 
             after(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeBooleanKeyword_1_0()); 

            }

             after(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeBooleanKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoBooleanProperty__DataTypeAssignment_1


    // $ANTLR start rule__DtoBooleanProperty__NameAssignment_2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2290:1: rule__DtoBooleanProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoBooleanProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2294:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2295:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2295:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2296:1: RULE_ID
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoBooleanProperty__NameAssignment_24580); 
             after(grammarAccess.getDtoBooleanPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoBooleanProperty__NameAssignment_2


    // $ANTLR start rule__DtoStringProperty__DescriptionAssignment_0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2305:1: rule__DtoStringProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoStringProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2309:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2310:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2310:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2311:1: RULE_STRING
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoStringProperty__DescriptionAssignment_04611); 
             after(grammarAccess.getDtoStringPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoStringProperty__DescriptionAssignment_0


    // $ANTLR start rule__DtoStringProperty__DataTypeAssignment_1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2320:1: rule__DtoStringProperty__DataTypeAssignment_1 : ( ( 'string' ) ) ;
    public final void rule__DtoStringProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2324:1: ( ( ( 'string' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2325:1: ( ( 'string' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2325:1: ( ( 'string' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2326:1: ( 'string' )
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDataTypeStringKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2327:1: ( 'string' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2328:1: 'string'
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDataTypeStringKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__DtoStringProperty__DataTypeAssignment_14647); 
             after(grammarAccess.getDtoStringPropertyAccess().getDataTypeStringKeyword_1_0()); 

            }

             after(grammarAccess.getDtoStringPropertyAccess().getDataTypeStringKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoStringProperty__DataTypeAssignment_1


    // $ANTLR start rule__DtoStringProperty__NameAssignment_2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2343:1: rule__DtoStringProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoStringProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2347:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2348:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2348:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2349:1: RULE_ID
            {
             before(grammarAccess.getDtoStringPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoStringProperty__NameAssignment_24686); 
             after(grammarAccess.getDtoStringPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoStringProperty__NameAssignment_2


    // $ANTLR start rule__DtoDateTimeProperty__DescriptionAssignment_0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2358:1: rule__DtoDateTimeProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoDateTimeProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2362:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2363:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2363:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2364:1: RULE_STRING
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoDateTimeProperty__DescriptionAssignment_04717); 
             after(grammarAccess.getDtoDateTimePropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoDateTimeProperty__DescriptionAssignment_0


    // $ANTLR start rule__DtoDateTimeProperty__DataTypeAssignment_1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2373:1: rule__DtoDateTimeProperty__DataTypeAssignment_1 : ( ( 'datetime' ) ) ;
    public final void rule__DtoDateTimeProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2377:1: ( ( ( 'datetime' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2378:1: ( ( 'datetime' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2378:1: ( ( 'datetime' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2379:1: ( 'datetime' )
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2380:1: ( 'datetime' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2381:1: 'datetime'
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__DtoDateTimeProperty__DataTypeAssignment_14753); 
             after(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 

            }

             after(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoDateTimeProperty__DataTypeAssignment_1


    // $ANTLR start rule__DtoDateTimeProperty__NameAssignment_2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2396:1: rule__DtoDateTimeProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoDateTimeProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2400:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2401:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2401:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2402:1: RULE_ID
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoDateTimeProperty__NameAssignment_24792); 
             after(grammarAccess.getDtoDateTimePropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoDateTimeProperty__NameAssignment_2


    // $ANTLR start rule__DtoIntegerProperty__DescriptionAssignment_0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2411:1: rule__DtoIntegerProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoIntegerProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2415:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2416:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2416:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2417:1: RULE_STRING
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoIntegerProperty__DescriptionAssignment_04823); 
             after(grammarAccess.getDtoIntegerPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoIntegerProperty__DescriptionAssignment_0


    // $ANTLR start rule__DtoIntegerProperty__DataTypeAssignment_1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2426:1: rule__DtoIntegerProperty__DataTypeAssignment_1 : ( ( 'integer' ) ) ;
    public final void rule__DtoIntegerProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2430:1: ( ( ( 'integer' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2431:1: ( ( 'integer' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2431:1: ( ( 'integer' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2432:1: ( 'integer' )
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2433:1: ( 'integer' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2434:1: 'integer'
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__DtoIntegerProperty__DataTypeAssignment_14859); 
             after(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 

            }

             after(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoIntegerProperty__DataTypeAssignment_1


    // $ANTLR start rule__DtoIntegerProperty__NameAssignment_2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2449:1: rule__DtoIntegerProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoIntegerProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2453:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2454:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2454:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2455:1: RULE_ID
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoIntegerProperty__NameAssignment_24898); 
             after(grammarAccess.getDtoIntegerPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoIntegerProperty__NameAssignment_2


    // $ANTLR start rule__DtoDecimalProperty__DescriptionAssignment_0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2464:1: rule__DtoDecimalProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoDecimalProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2468:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2469:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2469:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2470:1: RULE_STRING
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoDecimalProperty__DescriptionAssignment_04929); 
             after(grammarAccess.getDtoDecimalPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoDecimalProperty__DescriptionAssignment_0


    // $ANTLR start rule__DtoDecimalProperty__DataTypeAssignment_1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2479:1: rule__DtoDecimalProperty__DataTypeAssignment_1 : ( ( 'decimal' ) ) ;
    public final void rule__DtoDecimalProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2483:1: ( ( ( 'decimal' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2484:1: ( ( 'decimal' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2484:1: ( ( 'decimal' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2485:1: ( 'decimal' )
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2486:1: ( 'decimal' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2487:1: 'decimal'
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__DtoDecimalProperty__DataTypeAssignment_14965); 
             after(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 

            }

             after(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoDecimalProperty__DataTypeAssignment_1


    // $ANTLR start rule__DtoDecimalProperty__NameAssignment_2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2502:1: rule__DtoDecimalProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoDecimalProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2506:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2507:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2507:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2508:1: RULE_ID
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoDecimalProperty__NameAssignment_25004); 
             after(grammarAccess.getDtoDecimalPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoDecimalProperty__NameAssignment_2


    // $ANTLR start rule__DtoEnumerationProperty__DescriptionAssignment_0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2517:1: rule__DtoEnumerationProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoEnumerationProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2521:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2522:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2522:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2523:1: RULE_STRING
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoEnumerationProperty__DescriptionAssignment_05035); 
             after(grammarAccess.getDtoEnumerationPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoEnumerationProperty__DescriptionAssignment_0


    // $ANTLR start rule__DtoEnumerationProperty__TypeAssignment_1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2532:1: rule__DtoEnumerationProperty__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DtoEnumerationProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2536:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2537:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2537:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2538:1: ( RULE_ID )
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getTypeEnumerationDtoCrossReference_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2539:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2540:1: RULE_ID
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getTypeEnumerationDtoIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoEnumerationProperty__TypeAssignment_15070); 
             after(grammarAccess.getDtoEnumerationPropertyAccess().getTypeEnumerationDtoIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDtoEnumerationPropertyAccess().getTypeEnumerationDtoCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoEnumerationProperty__TypeAssignment_1


    // $ANTLR start rule__DtoEnumerationProperty__NameAssignment_2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2551:1: rule__DtoEnumerationProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoEnumerationProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2555:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2556:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2556:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2557:1: RULE_ID
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoEnumerationProperty__NameAssignment_25105); 
             after(grammarAccess.getDtoEnumerationPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoEnumerationProperty__NameAssignment_2


 

    public static final BitSet FOLLOW_ruleDataContractModel_in_entryRuleDataContractModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataContractModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__0_in_ruleDataContractModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDto_in_entryRuleDto120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDto127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dto__Alternatives_in_ruleDto154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_entryRuleExternalReference180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalReference187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__0_in_ruleExternalReference214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassDto_in_entryRuleBusinessClassDto240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClassDto247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__0_in_ruleBusinessClassDto274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDto_in_entryRuleEnumerationDto300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationDto307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__0_in_ruleEnumerationDto334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassPropertyReference_in_entryRuleBusinessClassPropertyReference360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClassPropertyReference367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassPropertyReference__Group__0_in_ruleBusinessClassPropertyReference394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassAssociationRoleReference_in_entryRuleBusinessClassAssociationRoleReference420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClassAssociationRoleReference427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__Group__0_in_ruleBusinessClassAssociationRoleReference454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomDto_in_entryRuleCustomDto480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomDto487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__0_in_ruleCustomDto514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoProperty_in_entryRuleDtoProperty540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoProperty547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoProperty__Group__0_in_ruleDtoProperty574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoBooleanProperty_in_entryRuleDtoBooleanProperty600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoBooleanProperty607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__Group__0_in_ruleDtoBooleanProperty634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoStringProperty_in_entryRuleDtoStringProperty660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoStringProperty667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__Group__0_in_ruleDtoStringProperty694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoDateTimeProperty_in_entryRuleDtoDateTimeProperty720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoDateTimeProperty727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__Group__0_in_ruleDtoDateTimeProperty754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoIntegerProperty_in_entryRuleDtoIntegerProperty780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoIntegerProperty787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__Group__0_in_ruleDtoIntegerProperty814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoDecimalProperty_in_entryRuleDtoDecimalProperty840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoDecimalProperty847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__Group__0_in_ruleDtoDecimalProperty874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoEnumerationProperty_in_entryRuleDtoEnumerationProperty900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoEnumerationProperty907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__Group__0_in_ruleDtoEnumerationProperty934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__DtosAssignment_5_0_in_rule__DataContractModel__Alternatives_5970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__EnumerationsAssignment_5_1_in_rule__DataContractModel__Alternatives_5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassDto_in_rule__Dto__Alternatives1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomDto_in_rule__Dto__Alternatives1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BusinessClassDto__Alternatives_51071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1__0_in_rule__BusinessClassDto__Alternatives_51090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoBooleanProperty_in_rule__DtoProperty__Alternatives_01123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoStringProperty_in_rule__DtoProperty__Alternatives_01140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoDateTimeProperty_in_rule__DtoProperty__Alternatives_01157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoIntegerProperty_in_rule__DtoProperty__Alternatives_01174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoDecimalProperty_in_rule__DtoProperty__Alternatives_01191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoEnumerationProperty_in_rule__DtoProperty__Alternatives_01208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__DescriptionAssignment_0_in_rule__DataContractModel__Group__01242 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__1_in_rule__DataContractModel__Group__01252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DataContractModel__Group__11281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__2_in_rule__DataContractModel__Group__11291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__NameAssignment_2_in_rule__DataContractModel__Group__21319 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__3_in_rule__DataContractModel__Group__21328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__DataContractModel__Group__31357 = new BitSet(new long[]{0x000000000050A012L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__4_in_rule__DataContractModel__Group__31367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__ExternalReferencesAssignment_4_in_rule__DataContractModel__Group__41395 = new BitSet(new long[]{0x000000000050A012L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__5_in_rule__DataContractModel__Group__41405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__Alternatives_5_in_rule__DataContractModel__Group__51433 = new BitSet(new long[]{0x0000000000508012L});
    public static final BitSet FOLLOW_rule__ExternalReference__DescriptionAssignment_0_in_rule__ExternalReference__Group__01480 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__1_in_rule__ExternalReference__Group__01490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ExternalReference__Group__11519 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__2_in_rule__ExternalReference__Group__11529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__ModelnameAssignment_2_in_rule__ExternalReference__Group__21557 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__3_in_rule__ExternalReference__Group__21566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ExternalReference__Group__31595 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__4_in_rule__ExternalReference__Group__31605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__NameAssignment_4_in_rule__ExternalReference__Group__41633 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__5_in_rule__ExternalReference__Group__41642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ExternalReference__Group__51671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__DescriptionAssignment_0_in_rule__BusinessClassDto__Group__01718 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__1_in_rule__BusinessClassDto__Group__01728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BusinessClassDto__Group__11757 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__2_in_rule__BusinessClassDto__Group__11767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__NameAssignment_2_in_rule__BusinessClassDto__Group__21795 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__3_in_rule__BusinessClassDto__Group__21804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BusinessClassDto__Group__31833 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__4_in_rule__BusinessClassDto__Group__31843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__BaseAssignment_4_in_rule__BusinessClassDto__Group__41871 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__5_in_rule__BusinessClassDto__Group__41880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Alternatives_5_in_rule__BusinessClassDto__Group__51908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BusinessClassDto__Group_5_1__01955 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1__1_in_rule__BusinessClassDto__Group_5_1__01965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1_in_rule__BusinessClassDto__Group_5_1__11995 = new BitSet(new long[]{0x00000000000C0020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1_in_rule__BusinessClassDto__Group_5_1__12007 = new BitSet(new long[]{0x00000000000C0020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1__2_in_rule__BusinessClassDto__Group_5_1__12019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1_2__0_in_rule__BusinessClassDto__Group_5_1__22047 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1__3_in_rule__BusinessClassDto__Group_5_1__22057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BusinessClassDto__Group_5_1__32086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BusinessClassDto__Group_5_1_2__02130 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1_2__1_in_rule__BusinessClassDto__Group_5_1_2__02140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BusinessClassDto__Group_5_1_2__12169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1_2__2_in_rule__BusinessClassDto__Group_5_1_2__12179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2_in_rule__BusinessClassDto__Group_5_1_2__22209 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2_in_rule__BusinessClassDto__Group_5_1_2__22221 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1_2__3_in_rule__BusinessClassDto__Group_5_1_2__22233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BusinessClassDto__Group_5_1_2__32262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDto__DescriptionAssignment_0_in_rule__EnumerationDto__Group__02305 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__1_in_rule__EnumerationDto__Group__02315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumerationDto__Group__12344 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__2_in_rule__EnumerationDto__Group__12354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDto__NameAssignment_2_in_rule__EnumerationDto__Group__22382 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__3_in_rule__EnumerationDto__Group__22391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EnumerationDto__Group__32420 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__4_in_rule__EnumerationDto__Group__32430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDto__BaseAssignment_4_in_rule__EnumerationDto__Group__42458 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__5_in_rule__EnumerationDto__Group__42467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__EnumerationDto__Group__52496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassPropertyReference__NameAssignment_0_in_rule__BusinessClassPropertyReference__Group__02543 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__BusinessClassPropertyReference__Group__1_in_rule__BusinessClassPropertyReference__Group__02552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BusinessClassPropertyReference__Group__12581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__NameAssignment_0_in_rule__BusinessClassAssociationRoleReference__Group__02620 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__Group__1_in_rule__BusinessClassAssociationRoleReference__Group__02629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BusinessClassAssociationRoleReference__Group__12658 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__Group__2_in_rule__BusinessClassAssociationRoleReference__Group__12668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2_in_rule__BusinessClassAssociationRoleReference__Group__22696 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__Group__3_in_rule__BusinessClassAssociationRoleReference__Group__22705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BusinessClassAssociationRoleReference__Group__32734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomDto__DescriptionAssignment_0_in_rule__CustomDto__Group__02777 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__1_in_rule__CustomDto__Group__02787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CustomDto__Group__12816 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__2_in_rule__CustomDto__Group__12826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomDto__NameAssignment_2_in_rule__CustomDto__Group__22854 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__3_in_rule__CustomDto__Group__22863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CustomDto__Group__32892 = new BitSet(new long[]{0x000000000F800030L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__4_in_rule__CustomDto__Group__32902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomDto__PropertiesAssignment_4_in_rule__CustomDto__Group__42932 = new BitSet(new long[]{0x000000000F840030L});
    public static final BitSet FOLLOW_rule__CustomDto__PropertiesAssignment_4_in_rule__CustomDto__Group__42944 = new BitSet(new long[]{0x000000000F840030L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__5_in_rule__CustomDto__Group__42956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CustomDto__Group__52985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoProperty__Alternatives_0_in_rule__DtoProperty__Group__03032 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__DtoProperty__Group__1_in_rule__DtoProperty__Group__03041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__DtoProperty__Group__13070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__DescriptionAssignment_0_in_rule__DtoBooleanProperty__Group__03109 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__Group__1_in_rule__DtoBooleanProperty__Group__03119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__DataTypeAssignment_1_in_rule__DtoBooleanProperty__Group__13147 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__Group__2_in_rule__DtoBooleanProperty__Group__13156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__NameAssignment_2_in_rule__DtoBooleanProperty__Group__23184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__DescriptionAssignment_0_in_rule__DtoStringProperty__Group__03224 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__Group__1_in_rule__DtoStringProperty__Group__03234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__DataTypeAssignment_1_in_rule__DtoStringProperty__Group__13262 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__Group__2_in_rule__DtoStringProperty__Group__13271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__NameAssignment_2_in_rule__DtoStringProperty__Group__23299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__DescriptionAssignment_0_in_rule__DtoDateTimeProperty__Group__03339 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__Group__1_in_rule__DtoDateTimeProperty__Group__03349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__DataTypeAssignment_1_in_rule__DtoDateTimeProperty__Group__13377 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__Group__2_in_rule__DtoDateTimeProperty__Group__13386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__NameAssignment_2_in_rule__DtoDateTimeProperty__Group__23414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__DescriptionAssignment_0_in_rule__DtoIntegerProperty__Group__03454 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__Group__1_in_rule__DtoIntegerProperty__Group__03464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__DataTypeAssignment_1_in_rule__DtoIntegerProperty__Group__13492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__Group__2_in_rule__DtoIntegerProperty__Group__13501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__NameAssignment_2_in_rule__DtoIntegerProperty__Group__23529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__DescriptionAssignment_0_in_rule__DtoDecimalProperty__Group__03569 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__Group__1_in_rule__DtoDecimalProperty__Group__03579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__DataTypeAssignment_1_in_rule__DtoDecimalProperty__Group__13607 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__Group__2_in_rule__DtoDecimalProperty__Group__13616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__NameAssignment_2_in_rule__DtoDecimalProperty__Group__23644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__DescriptionAssignment_0_in_rule__DtoEnumerationProperty__Group__03684 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__Group__1_in_rule__DtoEnumerationProperty__Group__03694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__TypeAssignment_1_in_rule__DtoEnumerationProperty__Group__13722 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__Group__2_in_rule__DtoEnumerationProperty__Group__13731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__NameAssignment_2_in_rule__DtoEnumerationProperty__Group__23759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DataContractModel__DescriptionAssignment_03799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataContractModel__NameAssignment_23830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_rule__DataContractModel__ExternalReferencesAssignment_43861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDto_in_rule__DataContractModel__DtosAssignment_5_03892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDto_in_rule__DataContractModel__EnumerationsAssignment_5_13923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ExternalReference__DescriptionAssignment_03954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalReference__ModelnameAssignment_23985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalReference__NameAssignment_44016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BusinessClassDto__DescriptionAssignment_04047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassDto__NameAssignment_24078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassDto__BaseAssignment_44113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassPropertyReference_in_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_14148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassAssociationRoleReference_in_rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_24179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnumerationDto__DescriptionAssignment_04210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationDto__NameAssignment_24241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationDto__BaseAssignment_44276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassPropertyReference__NameAssignment_04311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassAssociationRoleReference__NameAssignment_04342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_24377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomDto__DescriptionAssignment_04412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomDto__NameAssignment_24443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoProperty_in_rule__CustomDto__PropertiesAssignment_44474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoBooleanProperty__DescriptionAssignment_04505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DtoBooleanProperty__DataTypeAssignment_14541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoBooleanProperty__NameAssignment_24580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoStringProperty__DescriptionAssignment_04611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DtoStringProperty__DataTypeAssignment_14647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoStringProperty__NameAssignment_24686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoDateTimeProperty__DescriptionAssignment_04717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DtoDateTimeProperty__DataTypeAssignment_14753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoDateTimeProperty__NameAssignment_24792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoIntegerProperty__DescriptionAssignment_04823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DtoIntegerProperty__DataTypeAssignment_14859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoIntegerProperty__NameAssignment_24898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoDecimalProperty__DescriptionAssignment_04929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DtoDecimalProperty__DataTypeAssignment_14965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoDecimalProperty__NameAssignment_25004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoEnumerationProperty__DescriptionAssignment_05035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoEnumerationProperty__TypeAssignment_15070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoEnumerationProperty__NameAssignment_25105 = new BitSet(new long[]{0x0000000000000002L});

}