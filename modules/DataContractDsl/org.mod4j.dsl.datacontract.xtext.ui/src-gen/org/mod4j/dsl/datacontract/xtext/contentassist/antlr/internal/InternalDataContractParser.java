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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datacontract'", "';'", "'from'", "'import'", "'class'", "'represents'", "'['", "']'", "'references'", "'enumeration'", "'as'", "'list'", "'contains'", "'custom'", "'boolean'", "'string'", "'datetime'", "'integer'", "'decimal'"
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


    // $ANTLR start entryRuleListDto
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:249:1: entryRuleListDto : ruleListDto EOF ;
    public final void entryRuleListDto() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:249:18: ( ruleListDto EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:250:1: ruleListDto EOF
            {
             before(grammarAccess.getListDtoRule()); 
            pushFollow(FOLLOW_ruleListDto_in_entryRuleListDto480);
            ruleListDto();
            _fsp--;

             after(grammarAccess.getListDtoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListDto487); 

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
    // $ANTLR end entryRuleListDto


    // $ANTLR start ruleListDto
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:257:1: ruleListDto : ( ( rule__ListDto__Group__0 ) ) ;
    public final void ruleListDto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:261:2: ( ( ( rule__ListDto__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:262:1: ( ( rule__ListDto__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:262:1: ( ( rule__ListDto__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:263:1: ( rule__ListDto__Group__0 )
            {
             before(grammarAccess.getListDtoAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:264:1: ( rule__ListDto__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:264:2: rule__ListDto__Group__0
            {
            pushFollow(FOLLOW_rule__ListDto__Group__0_in_ruleListDto514);
            rule__ListDto__Group__0();
            _fsp--;


            }

             after(grammarAccess.getListDtoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleListDto


    // $ANTLR start entryRuleCustomDto
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:276:1: entryRuleCustomDto : ruleCustomDto EOF ;
    public final void entryRuleCustomDto() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:276:20: ( ruleCustomDto EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:277:1: ruleCustomDto EOF
            {
             before(grammarAccess.getCustomDtoRule()); 
            pushFollow(FOLLOW_ruleCustomDto_in_entryRuleCustomDto540);
            ruleCustomDto();
            _fsp--;

             after(grammarAccess.getCustomDtoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomDto547); 

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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:284:1: ruleCustomDto : ( ( rule__CustomDto__Group__0 ) ) ;
    public final void ruleCustomDto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:288:2: ( ( ( rule__CustomDto__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:289:1: ( ( rule__CustomDto__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:289:1: ( ( rule__CustomDto__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:290:1: ( rule__CustomDto__Group__0 )
            {
             before(grammarAccess.getCustomDtoAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:291:1: ( rule__CustomDto__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:291:2: rule__CustomDto__Group__0
            {
            pushFollow(FOLLOW_rule__CustomDto__Group__0_in_ruleCustomDto574);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:303:1: entryRuleDtoProperty : ruleDtoProperty EOF ;
    public final void entryRuleDtoProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:303:22: ( ruleDtoProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:304:1: ruleDtoProperty EOF
            {
             before(grammarAccess.getDtoPropertyRule()); 
            pushFollow(FOLLOW_ruleDtoProperty_in_entryRuleDtoProperty600);
            ruleDtoProperty();
            _fsp--;

             after(grammarAccess.getDtoPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoProperty607); 

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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:311:1: ruleDtoProperty : ( ( rule__DtoProperty__Group__0 ) ) ;
    public final void ruleDtoProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:315:2: ( ( ( rule__DtoProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:316:1: ( ( rule__DtoProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:316:1: ( ( rule__DtoProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:317:1: ( rule__DtoProperty__Group__0 )
            {
             before(grammarAccess.getDtoPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:318:1: ( rule__DtoProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:318:2: rule__DtoProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoProperty__Group__0_in_ruleDtoProperty634);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:330:1: entryRuleDtoBooleanProperty : ruleDtoBooleanProperty EOF ;
    public final void entryRuleDtoBooleanProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:330:29: ( ruleDtoBooleanProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:331:1: ruleDtoBooleanProperty EOF
            {
             before(grammarAccess.getDtoBooleanPropertyRule()); 
            pushFollow(FOLLOW_ruleDtoBooleanProperty_in_entryRuleDtoBooleanProperty660);
            ruleDtoBooleanProperty();
            _fsp--;

             after(grammarAccess.getDtoBooleanPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoBooleanProperty667); 

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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:338:1: ruleDtoBooleanProperty : ( ( rule__DtoBooleanProperty__Group__0 ) ) ;
    public final void ruleDtoBooleanProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:342:2: ( ( ( rule__DtoBooleanProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:343:1: ( ( rule__DtoBooleanProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:343:1: ( ( rule__DtoBooleanProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:344:1: ( rule__DtoBooleanProperty__Group__0 )
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:345:1: ( rule__DtoBooleanProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:345:2: rule__DtoBooleanProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoBooleanProperty__Group__0_in_ruleDtoBooleanProperty694);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:357:1: entryRuleDtoStringProperty : ruleDtoStringProperty EOF ;
    public final void entryRuleDtoStringProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:357:28: ( ruleDtoStringProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:358:1: ruleDtoStringProperty EOF
            {
             before(grammarAccess.getDtoStringPropertyRule()); 
            pushFollow(FOLLOW_ruleDtoStringProperty_in_entryRuleDtoStringProperty720);
            ruleDtoStringProperty();
            _fsp--;

             after(grammarAccess.getDtoStringPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoStringProperty727); 

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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:365:1: ruleDtoStringProperty : ( ( rule__DtoStringProperty__Group__0 ) ) ;
    public final void ruleDtoStringProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:369:2: ( ( ( rule__DtoStringProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:370:1: ( ( rule__DtoStringProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:370:1: ( ( rule__DtoStringProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:371:1: ( rule__DtoStringProperty__Group__0 )
            {
             before(grammarAccess.getDtoStringPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:372:1: ( rule__DtoStringProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:372:2: rule__DtoStringProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoStringProperty__Group__0_in_ruleDtoStringProperty754);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:384:1: entryRuleDtoDateTimeProperty : ruleDtoDateTimeProperty EOF ;
    public final void entryRuleDtoDateTimeProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:384:30: ( ruleDtoDateTimeProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:385:1: ruleDtoDateTimeProperty EOF
            {
             before(grammarAccess.getDtoDateTimePropertyRule()); 
            pushFollow(FOLLOW_ruleDtoDateTimeProperty_in_entryRuleDtoDateTimeProperty780);
            ruleDtoDateTimeProperty();
            _fsp--;

             after(grammarAccess.getDtoDateTimePropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoDateTimeProperty787); 

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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:392:1: ruleDtoDateTimeProperty : ( ( rule__DtoDateTimeProperty__Group__0 ) ) ;
    public final void ruleDtoDateTimeProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:396:2: ( ( ( rule__DtoDateTimeProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:397:1: ( ( rule__DtoDateTimeProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:397:1: ( ( rule__DtoDateTimeProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:398:1: ( rule__DtoDateTimeProperty__Group__0 )
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:399:1: ( rule__DtoDateTimeProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:399:2: rule__DtoDateTimeProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoDateTimeProperty__Group__0_in_ruleDtoDateTimeProperty814);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:411:1: entryRuleDtoIntegerProperty : ruleDtoIntegerProperty EOF ;
    public final void entryRuleDtoIntegerProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:411:29: ( ruleDtoIntegerProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:412:1: ruleDtoIntegerProperty EOF
            {
             before(grammarAccess.getDtoIntegerPropertyRule()); 
            pushFollow(FOLLOW_ruleDtoIntegerProperty_in_entryRuleDtoIntegerProperty840);
            ruleDtoIntegerProperty();
            _fsp--;

             after(grammarAccess.getDtoIntegerPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoIntegerProperty847); 

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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:419:1: ruleDtoIntegerProperty : ( ( rule__DtoIntegerProperty__Group__0 ) ) ;
    public final void ruleDtoIntegerProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:423:2: ( ( ( rule__DtoIntegerProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:424:1: ( ( rule__DtoIntegerProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:424:1: ( ( rule__DtoIntegerProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:425:1: ( rule__DtoIntegerProperty__Group__0 )
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:426:1: ( rule__DtoIntegerProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:426:2: rule__DtoIntegerProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoIntegerProperty__Group__0_in_ruleDtoIntegerProperty874);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:438:1: entryRuleDtoDecimalProperty : ruleDtoDecimalProperty EOF ;
    public final void entryRuleDtoDecimalProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:438:29: ( ruleDtoDecimalProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:439:1: ruleDtoDecimalProperty EOF
            {
             before(grammarAccess.getDtoDecimalPropertyRule()); 
            pushFollow(FOLLOW_ruleDtoDecimalProperty_in_entryRuleDtoDecimalProperty900);
            ruleDtoDecimalProperty();
            _fsp--;

             after(grammarAccess.getDtoDecimalPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoDecimalProperty907); 

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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:446:1: ruleDtoDecimalProperty : ( ( rule__DtoDecimalProperty__Group__0 ) ) ;
    public final void ruleDtoDecimalProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:450:2: ( ( ( rule__DtoDecimalProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:451:1: ( ( rule__DtoDecimalProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:451:1: ( ( rule__DtoDecimalProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:452:1: ( rule__DtoDecimalProperty__Group__0 )
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:453:1: ( rule__DtoDecimalProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:453:2: rule__DtoDecimalProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoDecimalProperty__Group__0_in_ruleDtoDecimalProperty934);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:465:1: entryRuleDtoEnumerationProperty : ruleDtoEnumerationProperty EOF ;
    public final void entryRuleDtoEnumerationProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:465:33: ( ruleDtoEnumerationProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:466:1: ruleDtoEnumerationProperty EOF
            {
             before(grammarAccess.getDtoEnumerationPropertyRule()); 
            pushFollow(FOLLOW_ruleDtoEnumerationProperty_in_entryRuleDtoEnumerationProperty960);
            ruleDtoEnumerationProperty();
            _fsp--;

             after(grammarAccess.getDtoEnumerationPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoEnumerationProperty967); 

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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:473:1: ruleDtoEnumerationProperty : ( ( rule__DtoEnumerationProperty__Group__0 ) ) ;
    public final void ruleDtoEnumerationProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:477:2: ( ( ( rule__DtoEnumerationProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:478:1: ( ( rule__DtoEnumerationProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:478:1: ( ( rule__DtoEnumerationProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:479:1: ( rule__DtoEnumerationProperty__Group__0 )
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:480:1: ( rule__DtoEnumerationProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:480:2: rule__DtoEnumerationProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoEnumerationProperty__Group__0_in_ruleDtoEnumerationProperty994);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:492:1: rule__DataContractModel__Alternatives_5 : ( ( ( rule__DataContractModel__DtosAssignment_5_0 ) ) | ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) ) );
    public final void rule__DataContractModel__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:496:1: ( ( ( rule__DataContractModel__DtosAssignment_5_0 ) ) | ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==15||LA1_1==22||LA1_1==24) ) {
                    alt1=1;
                }
                else if ( (LA1_1==20) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("492:1: rule__DataContractModel__Alternatives_5 : ( ( ( rule__DataContractModel__DtosAssignment_5_0 ) ) | ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) ) );", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 22:
            case 24:
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
                    new NoViableAltException("492:1: rule__DataContractModel__Alternatives_5 : ( ( ( rule__DataContractModel__DtosAssignment_5_0 ) ) | ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:497:1: ( ( rule__DataContractModel__DtosAssignment_5_0 ) )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:497:1: ( ( rule__DataContractModel__DtosAssignment_5_0 ) )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:498:1: ( rule__DataContractModel__DtosAssignment_5_0 )
                    {
                     before(grammarAccess.getDataContractModelAccess().getDtosAssignment_5_0()); 
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:499:1: ( rule__DataContractModel__DtosAssignment_5_0 )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:499:2: rule__DataContractModel__DtosAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__DataContractModel__DtosAssignment_5_0_in_rule__DataContractModel__Alternatives_51030);
                    rule__DataContractModel__DtosAssignment_5_0();
                    _fsp--;


                    }

                     after(grammarAccess.getDataContractModelAccess().getDtosAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:503:6: ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:503:6: ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:504:1: ( rule__DataContractModel__EnumerationsAssignment_5_1 )
                    {
                     before(grammarAccess.getDataContractModelAccess().getEnumerationsAssignment_5_1()); 
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:505:1: ( rule__DataContractModel__EnumerationsAssignment_5_1 )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:505:2: rule__DataContractModel__EnumerationsAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__DataContractModel__EnumerationsAssignment_5_1_in_rule__DataContractModel__Alternatives_51048);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:514:1: rule__Dto__Alternatives : ( ( ruleBusinessClassDto ) | ( ruleListDto ) | ( ruleCustomDto ) );
    public final void rule__Dto__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:518:1: ( ( ruleBusinessClassDto ) | ( ruleListDto ) | ( ruleCustomDto ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt2=3;
                    }
                    break;
                case 22:
                    {
                    alt2=2;
                    }
                    break;
                case 15:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("514:1: rule__Dto__Alternatives : ( ( ruleBusinessClassDto ) | ( ruleListDto ) | ( ruleCustomDto ) );", 2, 1, input);

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
            case 24:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("514:1: rule__Dto__Alternatives : ( ( ruleBusinessClassDto ) | ( ruleListDto ) | ( ruleCustomDto ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:519:1: ( ruleBusinessClassDto )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:519:1: ( ruleBusinessClassDto )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:520:1: ruleBusinessClassDto
                    {
                     before(grammarAccess.getDtoAccess().getBusinessClassDtoParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBusinessClassDto_in_rule__Dto__Alternatives1081);
                    ruleBusinessClassDto();
                    _fsp--;

                     after(grammarAccess.getDtoAccess().getBusinessClassDtoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:525:6: ( ruleListDto )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:525:6: ( ruleListDto )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:526:1: ruleListDto
                    {
                     before(grammarAccess.getDtoAccess().getListDtoParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleListDto_in_rule__Dto__Alternatives1098);
                    ruleListDto();
                    _fsp--;

                     after(grammarAccess.getDtoAccess().getListDtoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:531:6: ( ruleCustomDto )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:531:6: ( ruleCustomDto )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:532:1: ruleCustomDto
                    {
                     before(grammarAccess.getDtoAccess().getCustomDtoParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleCustomDto_in_rule__Dto__Alternatives1115);
                    ruleCustomDto();
                    _fsp--;

                     after(grammarAccess.getDtoAccess().getCustomDtoParserRuleCall_2()); 

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


    // $ANTLR start rule__DtoProperty__Alternatives_0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:542:1: rule__DtoProperty__Alternatives_0 : ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) );
    public final void rule__DtoProperty__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:546:1: ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt3=4;
                    }
                    break;
                case 27:
                    {
                    alt3=3;
                    }
                    break;
                case 25:
                    {
                    alt3=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt3=6;
                    }
                    break;
                case 26:
                    {
                    alt3=2;
                    }
                    break;
                case 29:
                    {
                    alt3=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("542:1: rule__DtoProperty__Alternatives_0 : ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) );", 3, 1, input);

                    throw nvae;
                }

                }
                break;
            case 25:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            case 28:
                {
                alt3=4;
                }
                break;
            case 29:
                {
                alt3=5;
                }
                break;
            case RULE_ID:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("542:1: rule__DtoProperty__Alternatives_0 : ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:547:1: ( ruleDtoBooleanProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:547:1: ( ruleDtoBooleanProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:548:1: ruleDtoBooleanProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoBooleanPropertyParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleDtoBooleanProperty_in_rule__DtoProperty__Alternatives_01147);
                    ruleDtoBooleanProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoBooleanPropertyParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:553:6: ( ruleDtoStringProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:553:6: ( ruleDtoStringProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:554:1: ruleDtoStringProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoStringPropertyParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleDtoStringProperty_in_rule__DtoProperty__Alternatives_01164);
                    ruleDtoStringProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoStringPropertyParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:559:6: ( ruleDtoDateTimeProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:559:6: ( ruleDtoDateTimeProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:560:1: ruleDtoDateTimeProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoDateTimePropertyParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleDtoDateTimeProperty_in_rule__DtoProperty__Alternatives_01181);
                    ruleDtoDateTimeProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoDateTimePropertyParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:565:6: ( ruleDtoIntegerProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:565:6: ( ruleDtoIntegerProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:566:1: ruleDtoIntegerProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoIntegerPropertyParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleDtoIntegerProperty_in_rule__DtoProperty__Alternatives_01198);
                    ruleDtoIntegerProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoIntegerPropertyParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:571:6: ( ruleDtoDecimalProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:571:6: ( ruleDtoDecimalProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:572:1: ruleDtoDecimalProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoDecimalPropertyParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleDtoDecimalProperty_in_rule__DtoProperty__Alternatives_01215);
                    ruleDtoDecimalProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoDecimalPropertyParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:577:6: ( ruleDtoEnumerationProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:577:6: ( ruleDtoEnumerationProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:578:1: ruleDtoEnumerationProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoEnumerationPropertyParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_ruleDtoEnumerationProperty_in_rule__DtoProperty__Alternatives_01232);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:590:1: rule__DataContractModel__Group__0 : ( ( rule__DataContractModel__DescriptionAssignment_0 )? ) rule__DataContractModel__Group__1 ;
    public final void rule__DataContractModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:594:1: ( ( ( rule__DataContractModel__DescriptionAssignment_0 )? ) rule__DataContractModel__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:595:1: ( ( rule__DataContractModel__DescriptionAssignment_0 )? ) rule__DataContractModel__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:595:1: ( ( rule__DataContractModel__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:596:1: ( rule__DataContractModel__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDataContractModelAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:597:1: ( rule__DataContractModel__DescriptionAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:597:2: rule__DataContractModel__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DataContractModel__DescriptionAssignment_0_in_rule__DataContractModel__Group__01266);
                    rule__DataContractModel__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataContractModelAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DataContractModel__Group__1_in_rule__DataContractModel__Group__01276);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:608:1: rule__DataContractModel__Group__1 : ( 'datacontract' ) rule__DataContractModel__Group__2 ;
    public final void rule__DataContractModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:612:1: ( ( 'datacontract' ) rule__DataContractModel__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:613:1: ( 'datacontract' ) rule__DataContractModel__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:613:1: ( 'datacontract' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:614:1: 'datacontract'
            {
             before(grammarAccess.getDataContractModelAccess().getDatacontractKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__DataContractModel__Group__11305); 
             after(grammarAccess.getDataContractModelAccess().getDatacontractKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__DataContractModel__Group__2_in_rule__DataContractModel__Group__11315);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:628:1: rule__DataContractModel__Group__2 : ( ( rule__DataContractModel__NameAssignment_2 ) ) rule__DataContractModel__Group__3 ;
    public final void rule__DataContractModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:632:1: ( ( ( rule__DataContractModel__NameAssignment_2 ) ) rule__DataContractModel__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:633:1: ( ( rule__DataContractModel__NameAssignment_2 ) ) rule__DataContractModel__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:633:1: ( ( rule__DataContractModel__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:634:1: ( rule__DataContractModel__NameAssignment_2 )
            {
             before(grammarAccess.getDataContractModelAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:635:1: ( rule__DataContractModel__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:635:2: rule__DataContractModel__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DataContractModel__NameAssignment_2_in_rule__DataContractModel__Group__21343);
            rule__DataContractModel__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDataContractModelAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__DataContractModel__Group__3_in_rule__DataContractModel__Group__21352);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:646:1: rule__DataContractModel__Group__3 : ( ';' ) rule__DataContractModel__Group__4 ;
    public final void rule__DataContractModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:650:1: ( ( ';' ) rule__DataContractModel__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:651:1: ( ';' ) rule__DataContractModel__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:651:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:652:1: ';'
            {
             before(grammarAccess.getDataContractModelAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__DataContractModel__Group__31381); 
             after(grammarAccess.getDataContractModelAccess().getSemicolonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__DataContractModel__Group__4_in_rule__DataContractModel__Group__31391);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:666:1: rule__DataContractModel__Group__4 : ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* ) rule__DataContractModel__Group__5 ;
    public final void rule__DataContractModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:670:1: ( ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* ) rule__DataContractModel__Group__5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:671:1: ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* ) rule__DataContractModel__Group__5
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:671:1: ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:672:1: ( rule__DataContractModel__ExternalReferencesAssignment_4 )*
            {
             before(grammarAccess.getDataContractModelAccess().getExternalReferencesAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:673:1: ( rule__DataContractModel__ExternalReferencesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==13) ) {
                        alt5=1;
                    }


                }
                else if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:673:2: rule__DataContractModel__ExternalReferencesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__DataContractModel__ExternalReferencesAssignment_4_in_rule__DataContractModel__Group__41419);
            	    rule__DataContractModel__ExternalReferencesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getDataContractModelAccess().getExternalReferencesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__DataContractModel__Group__5_in_rule__DataContractModel__Group__41429);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:684:1: rule__DataContractModel__Group__5 : ( ( rule__DataContractModel__Alternatives_5 )* ) ;
    public final void rule__DataContractModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:688:1: ( ( ( rule__DataContractModel__Alternatives_5 )* ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:689:1: ( ( rule__DataContractModel__Alternatives_5 )* )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:689:1: ( ( rule__DataContractModel__Alternatives_5 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:690:1: ( rule__DataContractModel__Alternatives_5 )*
            {
             before(grammarAccess.getDataContractModelAccess().getAlternatives_5()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:691:1: ( rule__DataContractModel__Alternatives_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING||LA6_0==15||LA6_0==20||LA6_0==22||LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:691:2: rule__DataContractModel__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__DataContractModel__Alternatives_5_in_rule__DataContractModel__Group__51457);
            	    rule__DataContractModel__Alternatives_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:713:1: rule__ExternalReference__Group__0 : ( ( rule__ExternalReference__DescriptionAssignment_0 )? ) rule__ExternalReference__Group__1 ;
    public final void rule__ExternalReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:717:1: ( ( ( rule__ExternalReference__DescriptionAssignment_0 )? ) rule__ExternalReference__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:718:1: ( ( rule__ExternalReference__DescriptionAssignment_0 )? ) rule__ExternalReference__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:718:1: ( ( rule__ExternalReference__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:719:1: ( rule__ExternalReference__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getExternalReferenceAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:720:1: ( rule__ExternalReference__DescriptionAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:720:2: rule__ExternalReference__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ExternalReference__DescriptionAssignment_0_in_rule__ExternalReference__Group__01504);
                    rule__ExternalReference__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalReferenceAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__1_in_rule__ExternalReference__Group__01514);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:731:1: rule__ExternalReference__Group__1 : ( 'from' ) rule__ExternalReference__Group__2 ;
    public final void rule__ExternalReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:735:1: ( ( 'from' ) rule__ExternalReference__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:736:1: ( 'from' ) rule__ExternalReference__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:736:1: ( 'from' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:737:1: 'from'
            {
             before(grammarAccess.getExternalReferenceAccess().getFromKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__ExternalReference__Group__11543); 
             after(grammarAccess.getExternalReferenceAccess().getFromKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__2_in_rule__ExternalReference__Group__11553);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:751:1: rule__ExternalReference__Group__2 : ( ( rule__ExternalReference__ModelnameAssignment_2 ) ) rule__ExternalReference__Group__3 ;
    public final void rule__ExternalReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:755:1: ( ( ( rule__ExternalReference__ModelnameAssignment_2 ) ) rule__ExternalReference__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:756:1: ( ( rule__ExternalReference__ModelnameAssignment_2 ) ) rule__ExternalReference__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:756:1: ( ( rule__ExternalReference__ModelnameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:757:1: ( rule__ExternalReference__ModelnameAssignment_2 )
            {
             before(grammarAccess.getExternalReferenceAccess().getModelnameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:758:1: ( rule__ExternalReference__ModelnameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:758:2: rule__ExternalReference__ModelnameAssignment_2
            {
            pushFollow(FOLLOW_rule__ExternalReference__ModelnameAssignment_2_in_rule__ExternalReference__Group__21581);
            rule__ExternalReference__ModelnameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getModelnameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__3_in_rule__ExternalReference__Group__21590);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:769:1: rule__ExternalReference__Group__3 : ( 'import' ) rule__ExternalReference__Group__4 ;
    public final void rule__ExternalReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:773:1: ( ( 'import' ) rule__ExternalReference__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:774:1: ( 'import' ) rule__ExternalReference__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:774:1: ( 'import' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:775:1: 'import'
            {
             before(grammarAccess.getExternalReferenceAccess().getImportKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__ExternalReference__Group__31619); 
             after(grammarAccess.getExternalReferenceAccess().getImportKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__4_in_rule__ExternalReference__Group__31629);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:789:1: rule__ExternalReference__Group__4 : ( ( rule__ExternalReference__NameAssignment_4 ) ) rule__ExternalReference__Group__5 ;
    public final void rule__ExternalReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:793:1: ( ( ( rule__ExternalReference__NameAssignment_4 ) ) rule__ExternalReference__Group__5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:794:1: ( ( rule__ExternalReference__NameAssignment_4 ) ) rule__ExternalReference__Group__5
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:794:1: ( ( rule__ExternalReference__NameAssignment_4 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:795:1: ( rule__ExternalReference__NameAssignment_4 )
            {
             before(grammarAccess.getExternalReferenceAccess().getNameAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:796:1: ( rule__ExternalReference__NameAssignment_4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:796:2: rule__ExternalReference__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__ExternalReference__NameAssignment_4_in_rule__ExternalReference__Group__41657);
            rule__ExternalReference__NameAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getNameAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__5_in_rule__ExternalReference__Group__41666);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:807:1: rule__ExternalReference__Group__5 : ( ';' ) ;
    public final void rule__ExternalReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:811:1: ( ( ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:812:1: ( ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:812:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:813:1: ';'
            {
             before(grammarAccess.getExternalReferenceAccess().getSemicolonKeyword_5()); 
            match(input,12,FOLLOW_12_in_rule__ExternalReference__Group__51695); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:838:1: rule__BusinessClassDto__Group__0 : ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? ) rule__BusinessClassDto__Group__1 ;
    public final void rule__BusinessClassDto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:842:1: ( ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? ) rule__BusinessClassDto__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:843:1: ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? ) rule__BusinessClassDto__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:843:1: ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:844:1: ( rule__BusinessClassDto__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBusinessClassDtoAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:845:1: ( rule__BusinessClassDto__DescriptionAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:845:2: rule__BusinessClassDto__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BusinessClassDto__DescriptionAssignment_0_in_rule__BusinessClassDto__Group__01742);
                    rule__BusinessClassDto__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassDtoAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__1_in_rule__BusinessClassDto__Group__01752);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:856:1: rule__BusinessClassDto__Group__1 : ( 'class' ) rule__BusinessClassDto__Group__2 ;
    public final void rule__BusinessClassDto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:860:1: ( ( 'class' ) rule__BusinessClassDto__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:861:1: ( 'class' ) rule__BusinessClassDto__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:861:1: ( 'class' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:862:1: 'class'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getClassKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__BusinessClassDto__Group__11781); 
             after(grammarAccess.getBusinessClassDtoAccess().getClassKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__2_in_rule__BusinessClassDto__Group__11791);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:876:1: rule__BusinessClassDto__Group__2 : ( ( rule__BusinessClassDto__NameAssignment_2 ) ) rule__BusinessClassDto__Group__3 ;
    public final void rule__BusinessClassDto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:880:1: ( ( ( rule__BusinessClassDto__NameAssignment_2 ) ) rule__BusinessClassDto__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:881:1: ( ( rule__BusinessClassDto__NameAssignment_2 ) ) rule__BusinessClassDto__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:881:1: ( ( rule__BusinessClassDto__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:882:1: ( rule__BusinessClassDto__NameAssignment_2 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:883:1: ( rule__BusinessClassDto__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:883:2: rule__BusinessClassDto__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__NameAssignment_2_in_rule__BusinessClassDto__Group__21819);
            rule__BusinessClassDto__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__3_in_rule__BusinessClassDto__Group__21828);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:894:1: rule__BusinessClassDto__Group__3 : ( 'represents' ) rule__BusinessClassDto__Group__4 ;
    public final void rule__BusinessClassDto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:898:1: ( ( 'represents' ) rule__BusinessClassDto__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:899:1: ( 'represents' ) rule__BusinessClassDto__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:899:1: ( 'represents' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:900:1: 'represents'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getRepresentsKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__BusinessClassDto__Group__31857); 
             after(grammarAccess.getBusinessClassDtoAccess().getRepresentsKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__4_in_rule__BusinessClassDto__Group__31867);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:914:1: rule__BusinessClassDto__Group__4 : ( ( rule__BusinessClassDto__BaseAssignment_4 ) ) rule__BusinessClassDto__Group__5 ;
    public final void rule__BusinessClassDto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:918:1: ( ( ( rule__BusinessClassDto__BaseAssignment_4 ) ) rule__BusinessClassDto__Group__5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:919:1: ( ( rule__BusinessClassDto__BaseAssignment_4 ) ) rule__BusinessClassDto__Group__5
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:919:1: ( ( rule__BusinessClassDto__BaseAssignment_4 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:920:1: ( rule__BusinessClassDto__BaseAssignment_4 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getBaseAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:921:1: ( rule__BusinessClassDto__BaseAssignment_4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:921:2: rule__BusinessClassDto__BaseAssignment_4
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__BaseAssignment_4_in_rule__BusinessClassDto__Group__41895);
            rule__BusinessClassDto__BaseAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getBaseAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__5_in_rule__BusinessClassDto__Group__41904);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:932:1: rule__BusinessClassDto__Group__5 : ( ( rule__BusinessClassDto__Group_5__0 )? ) ;
    public final void rule__BusinessClassDto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:936:1: ( ( ( rule__BusinessClassDto__Group_5__0 )? ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:937:1: ( ( rule__BusinessClassDto__Group_5__0 )? )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:937:1: ( ( rule__BusinessClassDto__Group_5__0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:938:1: ( rule__BusinessClassDto__Group_5__0 )?
            {
             before(grammarAccess.getBusinessClassDtoAccess().getGroup_5()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:939:1: ( rule__BusinessClassDto__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:939:2: rule__BusinessClassDto__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__BusinessClassDto__Group_5__0_in_rule__BusinessClassDto__Group__51932);
                    rule__BusinessClassDto__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassDtoAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start rule__BusinessClassDto__Group_5__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:961:1: rule__BusinessClassDto__Group_5__0 : ( '[' ) rule__BusinessClassDto__Group_5__1 ;
    public final void rule__BusinessClassDto__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:965:1: ( ( '[' ) rule__BusinessClassDto__Group_5__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:966:1: ( '[' ) rule__BusinessClassDto__Group_5__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:966:1: ( '[' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:967:1: '['
            {
             before(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,17,FOLLOW_17_in_rule__BusinessClassDto__Group_5__01980); 
             after(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5__1_in_rule__BusinessClassDto__Group_5__01990);
            rule__BusinessClassDto__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group_5__0


    // $ANTLR start rule__BusinessClassDto__Group_5__1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:981:1: rule__BusinessClassDto__Group_5__1 : ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )* ) ) rule__BusinessClassDto__Group_5__2 ;
    public final void rule__BusinessClassDto__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:985:1: ( ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )* ) ) rule__BusinessClassDto__Group_5__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:986:1: ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )* ) ) rule__BusinessClassDto__Group_5__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:986:1: ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )* ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:987:1: ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )* )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:987:1: ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:988:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesAssignment_5_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:989:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:989:2: rule__BusinessClassDto__PropertyReferencesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_in_rule__BusinessClassDto__Group_5__12020);
            rule__BusinessClassDto__PropertyReferencesAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesAssignment_5_1()); 

            }

            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:992:1: ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:993:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )*
            {
             before(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesAssignment_5_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:994:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:994:2: rule__BusinessClassDto__PropertyReferencesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_in_rule__BusinessClassDto__Group_5__12032);
            	    rule__BusinessClassDto__PropertyReferencesAssignment_5_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesAssignment_5_1()); 

            }


            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5__2_in_rule__BusinessClassDto__Group_5__12044);
            rule__BusinessClassDto__Group_5__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group_5__1


    // $ANTLR start rule__BusinessClassDto__Group_5__2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1006:1: rule__BusinessClassDto__Group_5__2 : ( ( rule__BusinessClassDto__Group_5_2__0 )? ) rule__BusinessClassDto__Group_5__3 ;
    public final void rule__BusinessClassDto__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1010:1: ( ( ( rule__BusinessClassDto__Group_5_2__0 )? ) rule__BusinessClassDto__Group_5__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1011:1: ( ( rule__BusinessClassDto__Group_5_2__0 )? ) rule__BusinessClassDto__Group_5__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1011:1: ( ( rule__BusinessClassDto__Group_5_2__0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1012:1: ( rule__BusinessClassDto__Group_5_2__0 )?
            {
             before(grammarAccess.getBusinessClassDtoAccess().getGroup_5_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1013:1: ( rule__BusinessClassDto__Group_5_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1013:2: rule__BusinessClassDto__Group_5_2__0
                    {
                    pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_2__0_in_rule__BusinessClassDto__Group_5__22072);
                    rule__BusinessClassDto__Group_5_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassDtoAccess().getGroup_5_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5__3_in_rule__BusinessClassDto__Group_5__22082);
            rule__BusinessClassDto__Group_5__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group_5__2


    // $ANTLR start rule__BusinessClassDto__Group_5__3
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1024:1: rule__BusinessClassDto__Group_5__3 : ( ']' ) ;
    public final void rule__BusinessClassDto__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1028:1: ( ( ']' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1029:1: ( ']' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1029:1: ( ']' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1030:1: ']'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getRightSquareBracketKeyword_5_3()); 
            match(input,18,FOLLOW_18_in_rule__BusinessClassDto__Group_5__32111); 
             after(grammarAccess.getBusinessClassDtoAccess().getRightSquareBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group_5__3


    // $ANTLR start rule__BusinessClassDto__Group_5_2__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1051:1: rule__BusinessClassDto__Group_5_2__0 : ( 'references' ) rule__BusinessClassDto__Group_5_2__1 ;
    public final void rule__BusinessClassDto__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1055:1: ( ( 'references' ) rule__BusinessClassDto__Group_5_2__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1056:1: ( 'references' ) rule__BusinessClassDto__Group_5_2__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1056:1: ( 'references' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1057:1: 'references'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getReferencesKeyword_5_2_0()); 
            match(input,19,FOLLOW_19_in_rule__BusinessClassDto__Group_5_2__02155); 
             after(grammarAccess.getBusinessClassDtoAccess().getReferencesKeyword_5_2_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_2__1_in_rule__BusinessClassDto__Group_5_2__02165);
            rule__BusinessClassDto__Group_5_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group_5_2__0


    // $ANTLR start rule__BusinessClassDto__Group_5_2__1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1071:1: rule__BusinessClassDto__Group_5_2__1 : ( '[' ) rule__BusinessClassDto__Group_5_2__2 ;
    public final void rule__BusinessClassDto__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1075:1: ( ( '[' ) rule__BusinessClassDto__Group_5_2__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1076:1: ( '[' ) rule__BusinessClassDto__Group_5_2__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1076:1: ( '[' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1077:1: '['
            {
             before(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_2_1()); 
            match(input,17,FOLLOW_17_in_rule__BusinessClassDto__Group_5_2__12194); 
             after(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_2_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_2__2_in_rule__BusinessClassDto__Group_5_2__12204);
            rule__BusinessClassDto__Group_5_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group_5_2__1


    // $ANTLR start rule__BusinessClassDto__Group_5_2__2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1091:1: rule__BusinessClassDto__Group_5_2__2 : ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )* ) ) rule__BusinessClassDto__Group_5_2__3 ;
    public final void rule__BusinessClassDto__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1095:1: ( ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )* ) ) rule__BusinessClassDto__Group_5_2__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1096:1: ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )* ) ) rule__BusinessClassDto__Group_5_2__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1096:1: ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )* ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1097:1: ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )* )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1097:1: ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1098:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesAssignment_5_2_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1099:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1099:2: rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2_in_rule__BusinessClassDto__Group_5_2__22234);
            rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesAssignment_5_2_2()); 

            }

            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1102:1: ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1103:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )*
            {
             before(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesAssignment_5_2_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1104:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1104:2: rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2
            	    {
            	    pushFollow(FOLLOW_rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2_in_rule__BusinessClassDto__Group_5_2__22246);
            	    rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesAssignment_5_2_2()); 

            }


            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_2__3_in_rule__BusinessClassDto__Group_5_2__22258);
            rule__BusinessClassDto__Group_5_2__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group_5_2__2


    // $ANTLR start rule__BusinessClassDto__Group_5_2__3
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1116:1: rule__BusinessClassDto__Group_5_2__3 : ( ']' ) ;
    public final void rule__BusinessClassDto__Group_5_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1120:1: ( ( ']' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1121:1: ( ']' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1121:1: ( ']' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1122:1: ']'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getRightSquareBracketKeyword_5_2_3()); 
            match(input,18,FOLLOW_18_in_rule__BusinessClassDto__Group_5_2__32287); 
             after(grammarAccess.getBusinessClassDtoAccess().getRightSquareBracketKeyword_5_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__Group_5_2__3


    // $ANTLR start rule__EnumerationDto__Group__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1143:1: rule__EnumerationDto__Group__0 : ( ( rule__EnumerationDto__DescriptionAssignment_0 )? ) rule__EnumerationDto__Group__1 ;
    public final void rule__EnumerationDto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1147:1: ( ( ( rule__EnumerationDto__DescriptionAssignment_0 )? ) rule__EnumerationDto__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1148:1: ( ( rule__EnumerationDto__DescriptionAssignment_0 )? ) rule__EnumerationDto__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1148:1: ( ( rule__EnumerationDto__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1149:1: ( rule__EnumerationDto__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumerationDtoAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1150:1: ( rule__EnumerationDto__DescriptionAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1150:2: rule__EnumerationDto__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EnumerationDto__DescriptionAssignment_0_in_rule__EnumerationDto__Group__02330);
                    rule__EnumerationDto__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationDtoAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationDto__Group__1_in_rule__EnumerationDto__Group__02340);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1161:1: rule__EnumerationDto__Group__1 : ( 'enumeration' ) rule__EnumerationDto__Group__2 ;
    public final void rule__EnumerationDto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1165:1: ( ( 'enumeration' ) rule__EnumerationDto__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1166:1: ( 'enumeration' ) rule__EnumerationDto__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1166:1: ( 'enumeration' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1167:1: 'enumeration'
            {
             before(grammarAccess.getEnumerationDtoAccess().getEnumerationKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__EnumerationDto__Group__12369); 
             after(grammarAccess.getEnumerationDtoAccess().getEnumerationKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__EnumerationDto__Group__2_in_rule__EnumerationDto__Group__12379);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1181:1: rule__EnumerationDto__Group__2 : ( ( rule__EnumerationDto__NameAssignment_2 ) ) rule__EnumerationDto__Group__3 ;
    public final void rule__EnumerationDto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1185:1: ( ( ( rule__EnumerationDto__NameAssignment_2 ) ) rule__EnumerationDto__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1186:1: ( ( rule__EnumerationDto__NameAssignment_2 ) ) rule__EnumerationDto__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1186:1: ( ( rule__EnumerationDto__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1187:1: ( rule__EnumerationDto__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationDtoAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1188:1: ( rule__EnumerationDto__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1188:2: rule__EnumerationDto__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumerationDto__NameAssignment_2_in_rule__EnumerationDto__Group__22407);
            rule__EnumerationDto__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEnumerationDtoAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__EnumerationDto__Group__3_in_rule__EnumerationDto__Group__22416);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1199:1: rule__EnumerationDto__Group__3 : ( 'represents' ) rule__EnumerationDto__Group__4 ;
    public final void rule__EnumerationDto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1203:1: ( ( 'represents' ) rule__EnumerationDto__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1204:1: ( 'represents' ) rule__EnumerationDto__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1204:1: ( 'represents' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1205:1: 'represents'
            {
             before(grammarAccess.getEnumerationDtoAccess().getRepresentsKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__EnumerationDto__Group__32445); 
             after(grammarAccess.getEnumerationDtoAccess().getRepresentsKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__EnumerationDto__Group__4_in_rule__EnumerationDto__Group__32455);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1219:1: rule__EnumerationDto__Group__4 : ( ( rule__EnumerationDto__BaseAssignment_4 ) ) ;
    public final void rule__EnumerationDto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1223:1: ( ( ( rule__EnumerationDto__BaseAssignment_4 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1224:1: ( ( rule__EnumerationDto__BaseAssignment_4 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1224:1: ( ( rule__EnumerationDto__BaseAssignment_4 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1225:1: ( rule__EnumerationDto__BaseAssignment_4 )
            {
             before(grammarAccess.getEnumerationDtoAccess().getBaseAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1226:1: ( rule__EnumerationDto__BaseAssignment_4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1226:2: rule__EnumerationDto__BaseAssignment_4
            {
            pushFollow(FOLLOW_rule__EnumerationDto__BaseAssignment_4_in_rule__EnumerationDto__Group__42483);
            rule__EnumerationDto__BaseAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getEnumerationDtoAccess().getBaseAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start rule__BusinessClassPropertyReference__Group__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1246:1: rule__BusinessClassPropertyReference__Group__0 : ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) ) rule__BusinessClassPropertyReference__Group__1 ;
    public final void rule__BusinessClassPropertyReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1250:1: ( ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) ) rule__BusinessClassPropertyReference__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1251:1: ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) ) rule__BusinessClassPropertyReference__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1251:1: ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1252:1: ( rule__BusinessClassPropertyReference__NameAssignment_0 )
            {
             before(grammarAccess.getBusinessClassPropertyReferenceAccess().getNameAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1253:1: ( rule__BusinessClassPropertyReference__NameAssignment_0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1253:2: rule__BusinessClassPropertyReference__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BusinessClassPropertyReference__NameAssignment_0_in_rule__BusinessClassPropertyReference__Group__02527);
            rule__BusinessClassPropertyReference__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassPropertyReferenceAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassPropertyReference__Group__1_in_rule__BusinessClassPropertyReference__Group__02536);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1264:1: rule__BusinessClassPropertyReference__Group__1 : ( ';' ) ;
    public final void rule__BusinessClassPropertyReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1268:1: ( ( ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1269:1: ( ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1269:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1270:1: ';'
            {
             before(grammarAccess.getBusinessClassPropertyReferenceAccess().getSemicolonKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__BusinessClassPropertyReference__Group__12565); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1287:1: rule__BusinessClassAssociationRoleReference__Group__0 : ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) ) rule__BusinessClassAssociationRoleReference__Group__1 ;
    public final void rule__BusinessClassAssociationRoleReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1291:1: ( ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) ) rule__BusinessClassAssociationRoleReference__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1292:1: ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) ) rule__BusinessClassAssociationRoleReference__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1292:1: ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1293:1: ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 )
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getNameAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1294:1: ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1294:2: rule__BusinessClassAssociationRoleReference__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__NameAssignment_0_in_rule__BusinessClassAssociationRoleReference__Group__02604);
            rule__BusinessClassAssociationRoleReference__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__Group__1_in_rule__BusinessClassAssociationRoleReference__Group__02613);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1305:1: rule__BusinessClassAssociationRoleReference__Group__1 : ( 'as' ) rule__BusinessClassAssociationRoleReference__Group__2 ;
    public final void rule__BusinessClassAssociationRoleReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1309:1: ( ( 'as' ) rule__BusinessClassAssociationRoleReference__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1310:1: ( 'as' ) rule__BusinessClassAssociationRoleReference__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1310:1: ( 'as' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1311:1: 'as'
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getAsKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__BusinessClassAssociationRoleReference__Group__12642); 
             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getAsKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__Group__2_in_rule__BusinessClassAssociationRoleReference__Group__12652);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1325:1: rule__BusinessClassAssociationRoleReference__Group__2 : ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) ) rule__BusinessClassAssociationRoleReference__Group__3 ;
    public final void rule__BusinessClassAssociationRoleReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1329:1: ( ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) ) rule__BusinessClassAssociationRoleReference__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1330:1: ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) ) rule__BusinessClassAssociationRoleReference__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1330:1: ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1331:1: ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 )
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1332:1: ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1332:2: rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2_in_rule__BusinessClassAssociationRoleReference__Group__22680);
            rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__Group__3_in_rule__BusinessClassAssociationRoleReference__Group__22689);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1343:1: rule__BusinessClassAssociationRoleReference__Group__3 : ( ';' ) ;
    public final void rule__BusinessClassAssociationRoleReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1347:1: ( ( ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1348:1: ( ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1348:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1349:1: ';'
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__BusinessClassAssociationRoleReference__Group__32718); 
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


    // $ANTLR start rule__ListDto__Group__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1370:1: rule__ListDto__Group__0 : ( ( rule__ListDto__DescriptionAssignment_0 )? ) rule__ListDto__Group__1 ;
    public final void rule__ListDto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1374:1: ( ( ( rule__ListDto__DescriptionAssignment_0 )? ) rule__ListDto__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1375:1: ( ( rule__ListDto__DescriptionAssignment_0 )? ) rule__ListDto__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1375:1: ( ( rule__ListDto__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1376:1: ( rule__ListDto__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getListDtoAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1377:1: ( rule__ListDto__DescriptionAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1377:2: rule__ListDto__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ListDto__DescriptionAssignment_0_in_rule__ListDto__Group__02761);
                    rule__ListDto__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListDtoAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ListDto__Group__1_in_rule__ListDto__Group__02771);
            rule__ListDto__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListDto__Group__0


    // $ANTLR start rule__ListDto__Group__1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1388:1: rule__ListDto__Group__1 : ( 'list' ) rule__ListDto__Group__2 ;
    public final void rule__ListDto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1392:1: ( ( 'list' ) rule__ListDto__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1393:1: ( 'list' ) rule__ListDto__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1393:1: ( 'list' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1394:1: 'list'
            {
             before(grammarAccess.getListDtoAccess().getListKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__ListDto__Group__12800); 
             after(grammarAccess.getListDtoAccess().getListKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ListDto__Group__2_in_rule__ListDto__Group__12810);
            rule__ListDto__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListDto__Group__1


    // $ANTLR start rule__ListDto__Group__2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1408:1: rule__ListDto__Group__2 : ( ( rule__ListDto__NameAssignment_2 ) ) rule__ListDto__Group__3 ;
    public final void rule__ListDto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1412:1: ( ( ( rule__ListDto__NameAssignment_2 ) ) rule__ListDto__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1413:1: ( ( rule__ListDto__NameAssignment_2 ) ) rule__ListDto__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1413:1: ( ( rule__ListDto__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1414:1: ( rule__ListDto__NameAssignment_2 )
            {
             before(grammarAccess.getListDtoAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1415:1: ( rule__ListDto__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1415:2: rule__ListDto__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ListDto__NameAssignment_2_in_rule__ListDto__Group__22838);
            rule__ListDto__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getListDtoAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ListDto__Group__3_in_rule__ListDto__Group__22847);
            rule__ListDto__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListDto__Group__2


    // $ANTLR start rule__ListDto__Group__3
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1426:1: rule__ListDto__Group__3 : ( 'contains' ) rule__ListDto__Group__4 ;
    public final void rule__ListDto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1430:1: ( ( 'contains' ) rule__ListDto__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1431:1: ( 'contains' ) rule__ListDto__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1431:1: ( 'contains' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1432:1: 'contains'
            {
             before(grammarAccess.getListDtoAccess().getContainsKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__ListDto__Group__32876); 
             after(grammarAccess.getListDtoAccess().getContainsKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ListDto__Group__4_in_rule__ListDto__Group__32886);
            rule__ListDto__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListDto__Group__3


    // $ANTLR start rule__ListDto__Group__4
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1446:1: rule__ListDto__Group__4 : ( ( rule__ListDto__BaseDtoAssignment_4 ) ) ;
    public final void rule__ListDto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1450:1: ( ( ( rule__ListDto__BaseDtoAssignment_4 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1451:1: ( ( rule__ListDto__BaseDtoAssignment_4 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1451:1: ( ( rule__ListDto__BaseDtoAssignment_4 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1452:1: ( rule__ListDto__BaseDtoAssignment_4 )
            {
             before(grammarAccess.getListDtoAccess().getBaseDtoAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1453:1: ( rule__ListDto__BaseDtoAssignment_4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1453:2: rule__ListDto__BaseDtoAssignment_4
            {
            pushFollow(FOLLOW_rule__ListDto__BaseDtoAssignment_4_in_rule__ListDto__Group__42914);
            rule__ListDto__BaseDtoAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getListDtoAccess().getBaseDtoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListDto__Group__4


    // $ANTLR start rule__CustomDto__Group__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1473:1: rule__CustomDto__Group__0 : ( ( rule__CustomDto__DescriptionAssignment_0 )? ) rule__CustomDto__Group__1 ;
    public final void rule__CustomDto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1477:1: ( ( ( rule__CustomDto__DescriptionAssignment_0 )? ) rule__CustomDto__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1478:1: ( ( rule__CustomDto__DescriptionAssignment_0 )? ) rule__CustomDto__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1478:1: ( ( rule__CustomDto__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1479:1: ( rule__CustomDto__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getCustomDtoAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1480:1: ( rule__CustomDto__DescriptionAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1480:2: rule__CustomDto__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CustomDto__DescriptionAssignment_0_in_rule__CustomDto__Group__02958);
                    rule__CustomDto__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomDtoAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__CustomDto__Group__1_in_rule__CustomDto__Group__02968);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1491:1: rule__CustomDto__Group__1 : ( 'custom' ) rule__CustomDto__Group__2 ;
    public final void rule__CustomDto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1495:1: ( ( 'custom' ) rule__CustomDto__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1496:1: ( 'custom' ) rule__CustomDto__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1496:1: ( 'custom' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1497:1: 'custom'
            {
             before(grammarAccess.getCustomDtoAccess().getCustomKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__CustomDto__Group__12997); 
             after(grammarAccess.getCustomDtoAccess().getCustomKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__CustomDto__Group__2_in_rule__CustomDto__Group__13007);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1511:1: rule__CustomDto__Group__2 : ( ( rule__CustomDto__NameAssignment_2 ) ) rule__CustomDto__Group__3 ;
    public final void rule__CustomDto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1515:1: ( ( ( rule__CustomDto__NameAssignment_2 ) ) rule__CustomDto__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1516:1: ( ( rule__CustomDto__NameAssignment_2 ) ) rule__CustomDto__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1516:1: ( ( rule__CustomDto__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1517:1: ( rule__CustomDto__NameAssignment_2 )
            {
             before(grammarAccess.getCustomDtoAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1518:1: ( rule__CustomDto__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1518:2: rule__CustomDto__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CustomDto__NameAssignment_2_in_rule__CustomDto__Group__23035);
            rule__CustomDto__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCustomDtoAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__CustomDto__Group__3_in_rule__CustomDto__Group__23044);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1529:1: rule__CustomDto__Group__3 : ( '[' ) rule__CustomDto__Group__4 ;
    public final void rule__CustomDto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1533:1: ( ( '[' ) rule__CustomDto__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1534:1: ( '[' ) rule__CustomDto__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1534:1: ( '[' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1535:1: '['
            {
             before(grammarAccess.getCustomDtoAccess().getLeftSquareBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__CustomDto__Group__33073); 
             after(grammarAccess.getCustomDtoAccess().getLeftSquareBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__CustomDto__Group__4_in_rule__CustomDto__Group__33083);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1549:1: rule__CustomDto__Group__4 : ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) ) rule__CustomDto__Group__5 ;
    public final void rule__CustomDto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1553:1: ( ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) ) rule__CustomDto__Group__5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1554:1: ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) ) rule__CustomDto__Group__5
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1554:1: ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1555:1: ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1555:1: ( ( rule__CustomDto__PropertiesAssignment_4 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1556:1: ( rule__CustomDto__PropertiesAssignment_4 )
            {
             before(grammarAccess.getCustomDtoAccess().getPropertiesAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1557:1: ( rule__CustomDto__PropertiesAssignment_4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1557:2: rule__CustomDto__PropertiesAssignment_4
            {
            pushFollow(FOLLOW_rule__CustomDto__PropertiesAssignment_4_in_rule__CustomDto__Group__43113);
            rule__CustomDto__PropertiesAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getCustomDtoAccess().getPropertiesAssignment_4()); 

            }

            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1560:1: ( ( rule__CustomDto__PropertiesAssignment_4 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1561:1: ( rule__CustomDto__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getCustomDtoAccess().getPropertiesAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1562:1: ( rule__CustomDto__PropertiesAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||(LA16_0>=25 && LA16_0<=29)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1562:2: rule__CustomDto__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__CustomDto__PropertiesAssignment_4_in_rule__CustomDto__Group__43125);
            	    rule__CustomDto__PropertiesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getCustomDtoAccess().getPropertiesAssignment_4()); 

            }


            }

            pushFollow(FOLLOW_rule__CustomDto__Group__5_in_rule__CustomDto__Group__43137);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1574:1: rule__CustomDto__Group__5 : ( ']' ) ;
    public final void rule__CustomDto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1578:1: ( ( ']' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1579:1: ( ']' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1579:1: ( ']' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1580:1: ']'
            {
             before(grammarAccess.getCustomDtoAccess().getRightSquareBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__CustomDto__Group__53166); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1605:1: rule__DtoProperty__Group__0 : ( ( rule__DtoProperty__Alternatives_0 ) ) rule__DtoProperty__Group__1 ;
    public final void rule__DtoProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1609:1: ( ( ( rule__DtoProperty__Alternatives_0 ) ) rule__DtoProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1610:1: ( ( rule__DtoProperty__Alternatives_0 ) ) rule__DtoProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1610:1: ( ( rule__DtoProperty__Alternatives_0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1611:1: ( rule__DtoProperty__Alternatives_0 )
            {
             before(grammarAccess.getDtoPropertyAccess().getAlternatives_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1612:1: ( rule__DtoProperty__Alternatives_0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1612:2: rule__DtoProperty__Alternatives_0
            {
            pushFollow(FOLLOW_rule__DtoProperty__Alternatives_0_in_rule__DtoProperty__Group__03213);
            rule__DtoProperty__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getDtoPropertyAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__DtoProperty__Group__1_in_rule__DtoProperty__Group__03222);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1623:1: rule__DtoProperty__Group__1 : ( ';' ) ;
    public final void rule__DtoProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1627:1: ( ( ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1628:1: ( ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1628:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1629:1: ';'
            {
             before(grammarAccess.getDtoPropertyAccess().getSemicolonKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__DtoProperty__Group__13251); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1646:1: rule__DtoBooleanProperty__Group__0 : ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? ) rule__DtoBooleanProperty__Group__1 ;
    public final void rule__DtoBooleanProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1650:1: ( ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? ) rule__DtoBooleanProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1651:1: ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? ) rule__DtoBooleanProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1651:1: ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1652:1: ( rule__DtoBooleanProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1653:1: ( rule__DtoBooleanProperty__DescriptionAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1653:2: rule__DtoBooleanProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoBooleanProperty__DescriptionAssignment_0_in_rule__DtoBooleanProperty__Group__03290);
                    rule__DtoBooleanProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoBooleanPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoBooleanProperty__Group__1_in_rule__DtoBooleanProperty__Group__03300);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1664:1: rule__DtoBooleanProperty__Group__1 : ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) ) rule__DtoBooleanProperty__Group__2 ;
    public final void rule__DtoBooleanProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1668:1: ( ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) ) rule__DtoBooleanProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1669:1: ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) ) rule__DtoBooleanProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1669:1: ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1670:1: ( rule__DtoBooleanProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1671:1: ( rule__DtoBooleanProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1671:2: rule__DtoBooleanProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoBooleanProperty__DataTypeAssignment_1_in_rule__DtoBooleanProperty__Group__13328);
            rule__DtoBooleanProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoBooleanProperty__Group__2_in_rule__DtoBooleanProperty__Group__13337);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1682:1: rule__DtoBooleanProperty__Group__2 : ( ( rule__DtoBooleanProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoBooleanProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1686:1: ( ( ( rule__DtoBooleanProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1687:1: ( ( rule__DtoBooleanProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1687:1: ( ( rule__DtoBooleanProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1688:1: ( rule__DtoBooleanProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1689:1: ( rule__DtoBooleanProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1689:2: rule__DtoBooleanProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoBooleanProperty__NameAssignment_2_in_rule__DtoBooleanProperty__Group__23365);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1705:1: rule__DtoStringProperty__Group__0 : ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? ) rule__DtoStringProperty__Group__1 ;
    public final void rule__DtoStringProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1709:1: ( ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? ) rule__DtoStringProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1710:1: ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? ) rule__DtoStringProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1710:1: ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1711:1: ( rule__DtoStringProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1712:1: ( rule__DtoStringProperty__DescriptionAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1712:2: rule__DtoStringProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoStringProperty__DescriptionAssignment_0_in_rule__DtoStringProperty__Group__03405);
                    rule__DtoStringProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoStringPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoStringProperty__Group__1_in_rule__DtoStringProperty__Group__03415);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1723:1: rule__DtoStringProperty__Group__1 : ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) ) rule__DtoStringProperty__Group__2 ;
    public final void rule__DtoStringProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1727:1: ( ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) ) rule__DtoStringProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1728:1: ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) ) rule__DtoStringProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1728:1: ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1729:1: ( rule__DtoStringProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1730:1: ( rule__DtoStringProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1730:2: rule__DtoStringProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoStringProperty__DataTypeAssignment_1_in_rule__DtoStringProperty__Group__13443);
            rule__DtoStringProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoStringPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoStringProperty__Group__2_in_rule__DtoStringProperty__Group__13452);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1741:1: rule__DtoStringProperty__Group__2 : ( ( rule__DtoStringProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoStringProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1745:1: ( ( ( rule__DtoStringProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1746:1: ( ( rule__DtoStringProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1746:1: ( ( rule__DtoStringProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1747:1: ( rule__DtoStringProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoStringPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1748:1: ( rule__DtoStringProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1748:2: rule__DtoStringProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoStringProperty__NameAssignment_2_in_rule__DtoStringProperty__Group__23480);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1764:1: rule__DtoDateTimeProperty__Group__0 : ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? ) rule__DtoDateTimeProperty__Group__1 ;
    public final void rule__DtoDateTimeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1768:1: ( ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? ) rule__DtoDateTimeProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1769:1: ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? ) rule__DtoDateTimeProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1769:1: ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1770:1: ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1771:1: ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1771:2: rule__DtoDateTimeProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoDateTimeProperty__DescriptionAssignment_0_in_rule__DtoDateTimeProperty__Group__03520);
                    rule__DtoDateTimeProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoDateTimePropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoDateTimeProperty__Group__1_in_rule__DtoDateTimeProperty__Group__03530);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1782:1: rule__DtoDateTimeProperty__Group__1 : ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) ) rule__DtoDateTimeProperty__Group__2 ;
    public final void rule__DtoDateTimeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1786:1: ( ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) ) rule__DtoDateTimeProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1787:1: ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) ) rule__DtoDateTimeProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1787:1: ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1788:1: ( rule__DtoDateTimeProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1789:1: ( rule__DtoDateTimeProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1789:2: rule__DtoDateTimeProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoDateTimeProperty__DataTypeAssignment_1_in_rule__DtoDateTimeProperty__Group__13558);
            rule__DtoDateTimeProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoDateTimeProperty__Group__2_in_rule__DtoDateTimeProperty__Group__13567);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1800:1: rule__DtoDateTimeProperty__Group__2 : ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoDateTimeProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1804:1: ( ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1805:1: ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1805:1: ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1806:1: ( rule__DtoDateTimeProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1807:1: ( rule__DtoDateTimeProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1807:2: rule__DtoDateTimeProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoDateTimeProperty__NameAssignment_2_in_rule__DtoDateTimeProperty__Group__23595);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1823:1: rule__DtoIntegerProperty__Group__0 : ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? ) rule__DtoIntegerProperty__Group__1 ;
    public final void rule__DtoIntegerProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1827:1: ( ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? ) rule__DtoIntegerProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1828:1: ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? ) rule__DtoIntegerProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1828:1: ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1829:1: ( rule__DtoIntegerProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1830:1: ( rule__DtoIntegerProperty__DescriptionAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1830:2: rule__DtoIntegerProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoIntegerProperty__DescriptionAssignment_0_in_rule__DtoIntegerProperty__Group__03635);
                    rule__DtoIntegerProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoIntegerPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoIntegerProperty__Group__1_in_rule__DtoIntegerProperty__Group__03645);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1841:1: rule__DtoIntegerProperty__Group__1 : ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) ) rule__DtoIntegerProperty__Group__2 ;
    public final void rule__DtoIntegerProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1845:1: ( ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) ) rule__DtoIntegerProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1846:1: ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) ) rule__DtoIntegerProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1846:1: ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1847:1: ( rule__DtoIntegerProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1848:1: ( rule__DtoIntegerProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1848:2: rule__DtoIntegerProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoIntegerProperty__DataTypeAssignment_1_in_rule__DtoIntegerProperty__Group__13673);
            rule__DtoIntegerProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoIntegerProperty__Group__2_in_rule__DtoIntegerProperty__Group__13682);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1859:1: rule__DtoIntegerProperty__Group__2 : ( ( rule__DtoIntegerProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoIntegerProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1863:1: ( ( ( rule__DtoIntegerProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1864:1: ( ( rule__DtoIntegerProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1864:1: ( ( rule__DtoIntegerProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1865:1: ( rule__DtoIntegerProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1866:1: ( rule__DtoIntegerProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1866:2: rule__DtoIntegerProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoIntegerProperty__NameAssignment_2_in_rule__DtoIntegerProperty__Group__23710);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1882:1: rule__DtoDecimalProperty__Group__0 : ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? ) rule__DtoDecimalProperty__Group__1 ;
    public final void rule__DtoDecimalProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1886:1: ( ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? ) rule__DtoDecimalProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1887:1: ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? ) rule__DtoDecimalProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1887:1: ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1888:1: ( rule__DtoDecimalProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1889:1: ( rule__DtoDecimalProperty__DescriptionAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1889:2: rule__DtoDecimalProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoDecimalProperty__DescriptionAssignment_0_in_rule__DtoDecimalProperty__Group__03750);
                    rule__DtoDecimalProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoDecimalPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoDecimalProperty__Group__1_in_rule__DtoDecimalProperty__Group__03760);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1900:1: rule__DtoDecimalProperty__Group__1 : ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) ) rule__DtoDecimalProperty__Group__2 ;
    public final void rule__DtoDecimalProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1904:1: ( ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) ) rule__DtoDecimalProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1905:1: ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) ) rule__DtoDecimalProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1905:1: ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1906:1: ( rule__DtoDecimalProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1907:1: ( rule__DtoDecimalProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1907:2: rule__DtoDecimalProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoDecimalProperty__DataTypeAssignment_1_in_rule__DtoDecimalProperty__Group__13788);
            rule__DtoDecimalProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoDecimalProperty__Group__2_in_rule__DtoDecimalProperty__Group__13797);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1918:1: rule__DtoDecimalProperty__Group__2 : ( ( rule__DtoDecimalProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoDecimalProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1922:1: ( ( ( rule__DtoDecimalProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1923:1: ( ( rule__DtoDecimalProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1923:1: ( ( rule__DtoDecimalProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1924:1: ( rule__DtoDecimalProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1925:1: ( rule__DtoDecimalProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1925:2: rule__DtoDecimalProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoDecimalProperty__NameAssignment_2_in_rule__DtoDecimalProperty__Group__23825);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1941:1: rule__DtoEnumerationProperty__Group__0 : ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? ) rule__DtoEnumerationProperty__Group__1 ;
    public final void rule__DtoEnumerationProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1945:1: ( ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? ) rule__DtoEnumerationProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1946:1: ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? ) rule__DtoEnumerationProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1946:1: ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1947:1: ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1948:1: ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1948:2: rule__DtoEnumerationProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoEnumerationProperty__DescriptionAssignment_0_in_rule__DtoEnumerationProperty__Group__03865);
                    rule__DtoEnumerationProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoEnumerationPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoEnumerationProperty__Group__1_in_rule__DtoEnumerationProperty__Group__03875);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1959:1: rule__DtoEnumerationProperty__Group__1 : ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) ) rule__DtoEnumerationProperty__Group__2 ;
    public final void rule__DtoEnumerationProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1963:1: ( ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) ) rule__DtoEnumerationProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1964:1: ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) ) rule__DtoEnumerationProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1964:1: ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1965:1: ( rule__DtoEnumerationProperty__TypeAssignment_1 )
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1966:1: ( rule__DtoEnumerationProperty__TypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1966:2: rule__DtoEnumerationProperty__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoEnumerationProperty__TypeAssignment_1_in_rule__DtoEnumerationProperty__Group__13903);
            rule__DtoEnumerationProperty__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoEnumerationPropertyAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoEnumerationProperty__Group__2_in_rule__DtoEnumerationProperty__Group__13912);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1977:1: rule__DtoEnumerationProperty__Group__2 : ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoEnumerationProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1981:1: ( ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1982:1: ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1982:1: ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1983:1: ( rule__DtoEnumerationProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1984:1: ( rule__DtoEnumerationProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1984:2: rule__DtoEnumerationProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoEnumerationProperty__NameAssignment_2_in_rule__DtoEnumerationProperty__Group__23940);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2000:1: rule__DataContractModel__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DataContractModel__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2004:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2005:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2005:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2006:1: RULE_STRING
            {
             before(grammarAccess.getDataContractModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DataContractModel__DescriptionAssignment_03980); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2015:1: rule__DataContractModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataContractModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2019:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2020:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2020:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2021:1: RULE_ID
            {
             before(grammarAccess.getDataContractModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataContractModel__NameAssignment_24011); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2030:1: rule__DataContractModel__ExternalReferencesAssignment_4 : ( ruleExternalReference ) ;
    public final void rule__DataContractModel__ExternalReferencesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2034:1: ( ( ruleExternalReference ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2035:1: ( ruleExternalReference )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2035:1: ( ruleExternalReference )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2036:1: ruleExternalReference
            {
             before(grammarAccess.getDataContractModelAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExternalReference_in_rule__DataContractModel__ExternalReferencesAssignment_44042);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2045:1: rule__DataContractModel__DtosAssignment_5_0 : ( ruleDto ) ;
    public final void rule__DataContractModel__DtosAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2049:1: ( ( ruleDto ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2050:1: ( ruleDto )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2050:1: ( ruleDto )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2051:1: ruleDto
            {
             before(grammarAccess.getDataContractModelAccess().getDtosDtoParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleDto_in_rule__DataContractModel__DtosAssignment_5_04073);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2060:1: rule__DataContractModel__EnumerationsAssignment_5_1 : ( ruleEnumerationDto ) ;
    public final void rule__DataContractModel__EnumerationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2064:1: ( ( ruleEnumerationDto ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2065:1: ( ruleEnumerationDto )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2065:1: ( ruleEnumerationDto )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2066:1: ruleEnumerationDto
            {
             before(grammarAccess.getDataContractModelAccess().getEnumerationsEnumerationDtoParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleEnumerationDto_in_rule__DataContractModel__EnumerationsAssignment_5_14104);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2075:1: rule__ExternalReference__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ExternalReference__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2079:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2080:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2080:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2081:1: RULE_STRING
            {
             before(grammarAccess.getExternalReferenceAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ExternalReference__DescriptionAssignment_04135); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2090:1: rule__ExternalReference__ModelnameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ExternalReference__ModelnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2094:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2095:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2095:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2096:1: RULE_ID
            {
             before(grammarAccess.getExternalReferenceAccess().getModelnameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalReference__ModelnameAssignment_24166); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2105:1: rule__ExternalReference__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__ExternalReference__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2109:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2110:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2110:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2111:1: RULE_ID
            {
             before(grammarAccess.getExternalReferenceAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalReference__NameAssignment_44197); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2120:1: rule__BusinessClassDto__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessClassDto__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2124:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2125:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2125:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2126:1: RULE_STRING
            {
             before(grammarAccess.getBusinessClassDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BusinessClassDto__DescriptionAssignment_04228); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2135:1: rule__BusinessClassDto__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessClassDto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2139:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2140:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2140:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2141:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassDtoAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassDto__NameAssignment_24259); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2150:1: rule__BusinessClassDto__BaseAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__BusinessClassDto__BaseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2154:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2155:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2155:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2156:1: ( RULE_ID )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getBaseExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2157:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2158:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassDtoAccess().getBaseExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassDto__BaseAssignment_44294); 
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


    // $ANTLR start rule__BusinessClassDto__PropertyReferencesAssignment_5_1
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2169:1: rule__BusinessClassDto__PropertyReferencesAssignment_5_1 : ( ruleBusinessClassPropertyReference ) ;
    public final void rule__BusinessClassDto__PropertyReferencesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2173:1: ( ( ruleBusinessClassPropertyReference ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2174:1: ( ruleBusinessClassPropertyReference )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2174:1: ( ruleBusinessClassPropertyReference )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2175:1: ruleBusinessClassPropertyReference
            {
             before(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesBusinessClassPropertyReferenceParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleBusinessClassPropertyReference_in_rule__BusinessClassDto__PropertyReferencesAssignment_5_14329);
            ruleBusinessClassPropertyReference();
            _fsp--;

             after(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesBusinessClassPropertyReferenceParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__PropertyReferencesAssignment_5_1


    // $ANTLR start rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2184:1: rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 : ( ruleBusinessClassAssociationRoleReference ) ;
    public final void rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2188:1: ( ( ruleBusinessClassAssociationRoleReference ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2189:1: ( ruleBusinessClassAssociationRoleReference )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2189:1: ( ruleBusinessClassAssociationRoleReference )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2190:1: ruleBusinessClassAssociationRoleReference
            {
             before(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesBusinessClassAssociationRoleReferenceParserRuleCall_5_2_2_0()); 
            pushFollow(FOLLOW_ruleBusinessClassAssociationRoleReference_in_rule__BusinessClassDto__AssociationReferencesAssignment_5_2_24360);
            ruleBusinessClassAssociationRoleReference();
            _fsp--;

             after(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesBusinessClassAssociationRoleReferenceParserRuleCall_5_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2


    // $ANTLR start rule__EnumerationDto__DescriptionAssignment_0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2199:1: rule__EnumerationDto__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__EnumerationDto__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2203:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2204:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2204:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2205:1: RULE_STRING
            {
             before(grammarAccess.getEnumerationDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnumerationDto__DescriptionAssignment_04391); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2214:1: rule__EnumerationDto__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumerationDto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2218:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2219:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2219:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2220:1: RULE_ID
            {
             before(grammarAccess.getEnumerationDtoAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationDto__NameAssignment_24422); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2229:1: rule__EnumerationDto__BaseAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__EnumerationDto__BaseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2233:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2234:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2234:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2235:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumerationDtoAccess().getBaseExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2236:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2237:1: RULE_ID
            {
             before(grammarAccess.getEnumerationDtoAccess().getBaseExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationDto__BaseAssignment_44457); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2248:1: rule__BusinessClassPropertyReference__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BusinessClassPropertyReference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2252:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2253:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2253:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2254:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassPropertyReferenceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassPropertyReference__NameAssignment_04492); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2263:1: rule__BusinessClassAssociationRoleReference__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BusinessClassAssociationRoleReference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2267:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2268:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2268:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2269:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassAssociationRoleReference__NameAssignment_04523); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2278:1: rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2282:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2283:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2283:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2284:1: ( RULE_ID )
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeDtoCrossReference_2_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2285:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2286:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeDtoIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_24558); 
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


    // $ANTLR start rule__ListDto__DescriptionAssignment_0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2297:1: rule__ListDto__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ListDto__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2301:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2302:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2302:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2303:1: RULE_STRING
            {
             before(grammarAccess.getListDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ListDto__DescriptionAssignment_04593); 
             after(grammarAccess.getListDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListDto__DescriptionAssignment_0


    // $ANTLR start rule__ListDto__NameAssignment_2
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2312:1: rule__ListDto__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ListDto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2316:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2317:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2317:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2318:1: RULE_ID
            {
             before(grammarAccess.getListDtoAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ListDto__NameAssignment_24624); 
             after(grammarAccess.getListDtoAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListDto__NameAssignment_2


    // $ANTLR start rule__ListDto__BaseDtoAssignment_4
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2327:1: rule__ListDto__BaseDtoAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ListDto__BaseDtoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2331:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2332:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2332:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2333:1: ( RULE_ID )
            {
             before(grammarAccess.getListDtoAccess().getBaseDtoDtoCrossReference_4_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2334:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2335:1: RULE_ID
            {
             before(grammarAccess.getListDtoAccess().getBaseDtoDtoIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ListDto__BaseDtoAssignment_44659); 
             after(grammarAccess.getListDtoAccess().getBaseDtoDtoIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getListDtoAccess().getBaseDtoDtoCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListDto__BaseDtoAssignment_4


    // $ANTLR start rule__CustomDto__DescriptionAssignment_0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2346:1: rule__CustomDto__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__CustomDto__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2350:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2351:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2351:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2352:1: RULE_STRING
            {
             before(grammarAccess.getCustomDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CustomDto__DescriptionAssignment_04694); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2361:1: rule__CustomDto__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CustomDto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2365:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2366:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2366:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2367:1: RULE_ID
            {
             before(grammarAccess.getCustomDtoAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomDto__NameAssignment_24725); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2376:1: rule__CustomDto__PropertiesAssignment_4 : ( ruleDtoProperty ) ;
    public final void rule__CustomDto__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2380:1: ( ( ruleDtoProperty ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2381:1: ( ruleDtoProperty )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2381:1: ( ruleDtoProperty )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2382:1: ruleDtoProperty
            {
             before(grammarAccess.getCustomDtoAccess().getPropertiesDtoPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDtoProperty_in_rule__CustomDto__PropertiesAssignment_44756);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2391:1: rule__DtoBooleanProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoBooleanProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2395:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2396:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2396:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2397:1: RULE_STRING
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoBooleanProperty__DescriptionAssignment_04787); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2406:1: rule__DtoBooleanProperty__DataTypeAssignment_1 : ( ( 'boolean' ) ) ;
    public final void rule__DtoBooleanProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2410:1: ( ( ( 'boolean' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2411:1: ( ( 'boolean' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2411:1: ( ( 'boolean' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2412:1: ( 'boolean' )
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeBooleanKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2413:1: ( 'boolean' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2414:1: 'boolean'
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeBooleanKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__DtoBooleanProperty__DataTypeAssignment_14823); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2429:1: rule__DtoBooleanProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoBooleanProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2433:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2434:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2434:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2435:1: RULE_ID
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoBooleanProperty__NameAssignment_24862); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2444:1: rule__DtoStringProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoStringProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2448:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2449:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2449:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2450:1: RULE_STRING
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoStringProperty__DescriptionAssignment_04893); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2459:1: rule__DtoStringProperty__DataTypeAssignment_1 : ( ( 'string' ) ) ;
    public final void rule__DtoStringProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2463:1: ( ( ( 'string' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2464:1: ( ( 'string' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2464:1: ( ( 'string' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2465:1: ( 'string' )
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDataTypeStringKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2466:1: ( 'string' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2467:1: 'string'
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDataTypeStringKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__DtoStringProperty__DataTypeAssignment_14929); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2482:1: rule__DtoStringProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoStringProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2486:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2487:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2487:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2488:1: RULE_ID
            {
             before(grammarAccess.getDtoStringPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoStringProperty__NameAssignment_24968); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2497:1: rule__DtoDateTimeProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoDateTimeProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2501:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2502:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2502:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2503:1: RULE_STRING
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoDateTimeProperty__DescriptionAssignment_04999); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2512:1: rule__DtoDateTimeProperty__DataTypeAssignment_1 : ( ( 'datetime' ) ) ;
    public final void rule__DtoDateTimeProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2516:1: ( ( ( 'datetime' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2517:1: ( ( 'datetime' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2517:1: ( ( 'datetime' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2518:1: ( 'datetime' )
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2519:1: ( 'datetime' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2520:1: 'datetime'
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__DtoDateTimeProperty__DataTypeAssignment_15035); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2535:1: rule__DtoDateTimeProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoDateTimeProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2539:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2540:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2540:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2541:1: RULE_ID
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoDateTimeProperty__NameAssignment_25074); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2550:1: rule__DtoIntegerProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoIntegerProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2554:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2555:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2555:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2556:1: RULE_STRING
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoIntegerProperty__DescriptionAssignment_05105); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2565:1: rule__DtoIntegerProperty__DataTypeAssignment_1 : ( ( 'integer' ) ) ;
    public final void rule__DtoIntegerProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2569:1: ( ( ( 'integer' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2570:1: ( ( 'integer' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2570:1: ( ( 'integer' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2571:1: ( 'integer' )
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2572:1: ( 'integer' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2573:1: 'integer'
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__DtoIntegerProperty__DataTypeAssignment_15141); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2588:1: rule__DtoIntegerProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoIntegerProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2592:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2593:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2593:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2594:1: RULE_ID
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoIntegerProperty__NameAssignment_25180); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2603:1: rule__DtoDecimalProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoDecimalProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2607:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2608:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2608:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2609:1: RULE_STRING
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoDecimalProperty__DescriptionAssignment_05211); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2618:1: rule__DtoDecimalProperty__DataTypeAssignment_1 : ( ( 'decimal' ) ) ;
    public final void rule__DtoDecimalProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2622:1: ( ( ( 'decimal' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2623:1: ( ( 'decimal' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2623:1: ( ( 'decimal' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2624:1: ( 'decimal' )
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2625:1: ( 'decimal' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2626:1: 'decimal'
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__DtoDecimalProperty__DataTypeAssignment_15247); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2641:1: rule__DtoDecimalProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoDecimalProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2645:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2646:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2646:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2647:1: RULE_ID
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoDecimalProperty__NameAssignment_25286); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2656:1: rule__DtoEnumerationProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoEnumerationProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2660:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2661:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2661:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2662:1: RULE_STRING
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoEnumerationProperty__DescriptionAssignment_05317); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2671:1: rule__DtoEnumerationProperty__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DtoEnumerationProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2675:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2676:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2676:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2677:1: ( RULE_ID )
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getTypeEnumerationDtoCrossReference_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2678:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2679:1: RULE_ID
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getTypeEnumerationDtoIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoEnumerationProperty__TypeAssignment_15352); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2690:1: rule__DtoEnumerationProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoEnumerationProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2694:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2695:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2695:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2696:1: RULE_ID
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoEnumerationProperty__NameAssignment_25387); 
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
    public static final BitSet FOLLOW_ruleListDto_in_entryRuleListDto480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListDto487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListDto__Group__0_in_ruleListDto514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomDto_in_entryRuleCustomDto540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomDto547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__0_in_ruleCustomDto574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoProperty_in_entryRuleDtoProperty600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoProperty607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoProperty__Group__0_in_ruleDtoProperty634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoBooleanProperty_in_entryRuleDtoBooleanProperty660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoBooleanProperty667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__Group__0_in_ruleDtoBooleanProperty694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoStringProperty_in_entryRuleDtoStringProperty720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoStringProperty727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__Group__0_in_ruleDtoStringProperty754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoDateTimeProperty_in_entryRuleDtoDateTimeProperty780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoDateTimeProperty787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__Group__0_in_ruleDtoDateTimeProperty814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoIntegerProperty_in_entryRuleDtoIntegerProperty840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoIntegerProperty847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__Group__0_in_ruleDtoIntegerProperty874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoDecimalProperty_in_entryRuleDtoDecimalProperty900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoDecimalProperty907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__Group__0_in_ruleDtoDecimalProperty934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoEnumerationProperty_in_entryRuleDtoEnumerationProperty960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoEnumerationProperty967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__Group__0_in_ruleDtoEnumerationProperty994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__DtosAssignment_5_0_in_rule__DataContractModel__Alternatives_51030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__EnumerationsAssignment_5_1_in_rule__DataContractModel__Alternatives_51048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassDto_in_rule__Dto__Alternatives1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListDto_in_rule__Dto__Alternatives1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomDto_in_rule__Dto__Alternatives1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoBooleanProperty_in_rule__DtoProperty__Alternatives_01147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoStringProperty_in_rule__DtoProperty__Alternatives_01164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoDateTimeProperty_in_rule__DtoProperty__Alternatives_01181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoIntegerProperty_in_rule__DtoProperty__Alternatives_01198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoDecimalProperty_in_rule__DtoProperty__Alternatives_01215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoEnumerationProperty_in_rule__DtoProperty__Alternatives_01232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__DescriptionAssignment_0_in_rule__DataContractModel__Group__01266 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__1_in_rule__DataContractModel__Group__01276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__DataContractModel__Group__11305 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__2_in_rule__DataContractModel__Group__11315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__NameAssignment_2_in_rule__DataContractModel__Group__21343 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__3_in_rule__DataContractModel__Group__21352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DataContractModel__Group__31381 = new BitSet(new long[]{0x000000000150A012L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__4_in_rule__DataContractModel__Group__31391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__ExternalReferencesAssignment_4_in_rule__DataContractModel__Group__41419 = new BitSet(new long[]{0x000000000150A012L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__5_in_rule__DataContractModel__Group__41429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__Alternatives_5_in_rule__DataContractModel__Group__51457 = new BitSet(new long[]{0x0000000001508012L});
    public static final BitSet FOLLOW_rule__ExternalReference__DescriptionAssignment_0_in_rule__ExternalReference__Group__01504 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__1_in_rule__ExternalReference__Group__01514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ExternalReference__Group__11543 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__2_in_rule__ExternalReference__Group__11553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__ModelnameAssignment_2_in_rule__ExternalReference__Group__21581 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__3_in_rule__ExternalReference__Group__21590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ExternalReference__Group__31619 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__4_in_rule__ExternalReference__Group__31629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__NameAssignment_4_in_rule__ExternalReference__Group__41657 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__5_in_rule__ExternalReference__Group__41666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ExternalReference__Group__51695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__DescriptionAssignment_0_in_rule__BusinessClassDto__Group__01742 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__1_in_rule__BusinessClassDto__Group__01752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BusinessClassDto__Group__11781 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__2_in_rule__BusinessClassDto__Group__11791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__NameAssignment_2_in_rule__BusinessClassDto__Group__21819 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__3_in_rule__BusinessClassDto__Group__21828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BusinessClassDto__Group__31857 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__4_in_rule__BusinessClassDto__Group__31867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__BaseAssignment_4_in_rule__BusinessClassDto__Group__41895 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__5_in_rule__BusinessClassDto__Group__41904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5__0_in_rule__BusinessClassDto__Group__51932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BusinessClassDto__Group_5__01980 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5__1_in_rule__BusinessClassDto__Group_5__01990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_in_rule__BusinessClassDto__Group_5__12020 = new BitSet(new long[]{0x00000000000C0020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_in_rule__BusinessClassDto__Group_5__12032 = new BitSet(new long[]{0x00000000000C0020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5__2_in_rule__BusinessClassDto__Group_5__12044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_2__0_in_rule__BusinessClassDto__Group_5__22072 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5__3_in_rule__BusinessClassDto__Group_5__22082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BusinessClassDto__Group_5__32111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BusinessClassDto__Group_5_2__02155 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_2__1_in_rule__BusinessClassDto__Group_5_2__02165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BusinessClassDto__Group_5_2__12194 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_2__2_in_rule__BusinessClassDto__Group_5_2__12204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2_in_rule__BusinessClassDto__Group_5_2__22234 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2_in_rule__BusinessClassDto__Group_5_2__22246 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_2__3_in_rule__BusinessClassDto__Group_5_2__22258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BusinessClassDto__Group_5_2__32287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDto__DescriptionAssignment_0_in_rule__EnumerationDto__Group__02330 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__1_in_rule__EnumerationDto__Group__02340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumerationDto__Group__12369 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__2_in_rule__EnumerationDto__Group__12379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDto__NameAssignment_2_in_rule__EnumerationDto__Group__22407 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__3_in_rule__EnumerationDto__Group__22416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EnumerationDto__Group__32445 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__4_in_rule__EnumerationDto__Group__32455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDto__BaseAssignment_4_in_rule__EnumerationDto__Group__42483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassPropertyReference__NameAssignment_0_in_rule__BusinessClassPropertyReference__Group__02527 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__BusinessClassPropertyReference__Group__1_in_rule__BusinessClassPropertyReference__Group__02536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BusinessClassPropertyReference__Group__12565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__NameAssignment_0_in_rule__BusinessClassAssociationRoleReference__Group__02604 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__Group__1_in_rule__BusinessClassAssociationRoleReference__Group__02613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BusinessClassAssociationRoleReference__Group__12642 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__Group__2_in_rule__BusinessClassAssociationRoleReference__Group__12652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2_in_rule__BusinessClassAssociationRoleReference__Group__22680 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__Group__3_in_rule__BusinessClassAssociationRoleReference__Group__22689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BusinessClassAssociationRoleReference__Group__32718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListDto__DescriptionAssignment_0_in_rule__ListDto__Group__02761 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ListDto__Group__1_in_rule__ListDto__Group__02771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ListDto__Group__12800 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ListDto__Group__2_in_rule__ListDto__Group__12810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListDto__NameAssignment_2_in_rule__ListDto__Group__22838 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ListDto__Group__3_in_rule__ListDto__Group__22847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ListDto__Group__32876 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ListDto__Group__4_in_rule__ListDto__Group__32886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListDto__BaseDtoAssignment_4_in_rule__ListDto__Group__42914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomDto__DescriptionAssignment_0_in_rule__CustomDto__Group__02958 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__1_in_rule__CustomDto__Group__02968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CustomDto__Group__12997 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__2_in_rule__CustomDto__Group__13007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomDto__NameAssignment_2_in_rule__CustomDto__Group__23035 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__3_in_rule__CustomDto__Group__23044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CustomDto__Group__33073 = new BitSet(new long[]{0x000000003E000030L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__4_in_rule__CustomDto__Group__33083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomDto__PropertiesAssignment_4_in_rule__CustomDto__Group__43113 = new BitSet(new long[]{0x000000003E040030L});
    public static final BitSet FOLLOW_rule__CustomDto__PropertiesAssignment_4_in_rule__CustomDto__Group__43125 = new BitSet(new long[]{0x000000003E040030L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__5_in_rule__CustomDto__Group__43137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CustomDto__Group__53166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoProperty__Alternatives_0_in_rule__DtoProperty__Group__03213 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__DtoProperty__Group__1_in_rule__DtoProperty__Group__03222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DtoProperty__Group__13251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__DescriptionAssignment_0_in_rule__DtoBooleanProperty__Group__03290 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__Group__1_in_rule__DtoBooleanProperty__Group__03300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__DataTypeAssignment_1_in_rule__DtoBooleanProperty__Group__13328 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__Group__2_in_rule__DtoBooleanProperty__Group__13337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__NameAssignment_2_in_rule__DtoBooleanProperty__Group__23365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__DescriptionAssignment_0_in_rule__DtoStringProperty__Group__03405 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__Group__1_in_rule__DtoStringProperty__Group__03415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__DataTypeAssignment_1_in_rule__DtoStringProperty__Group__13443 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__Group__2_in_rule__DtoStringProperty__Group__13452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__NameAssignment_2_in_rule__DtoStringProperty__Group__23480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__DescriptionAssignment_0_in_rule__DtoDateTimeProperty__Group__03520 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__Group__1_in_rule__DtoDateTimeProperty__Group__03530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__DataTypeAssignment_1_in_rule__DtoDateTimeProperty__Group__13558 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__Group__2_in_rule__DtoDateTimeProperty__Group__13567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__NameAssignment_2_in_rule__DtoDateTimeProperty__Group__23595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__DescriptionAssignment_0_in_rule__DtoIntegerProperty__Group__03635 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__Group__1_in_rule__DtoIntegerProperty__Group__03645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__DataTypeAssignment_1_in_rule__DtoIntegerProperty__Group__13673 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__Group__2_in_rule__DtoIntegerProperty__Group__13682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__NameAssignment_2_in_rule__DtoIntegerProperty__Group__23710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__DescriptionAssignment_0_in_rule__DtoDecimalProperty__Group__03750 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__Group__1_in_rule__DtoDecimalProperty__Group__03760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__DataTypeAssignment_1_in_rule__DtoDecimalProperty__Group__13788 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__Group__2_in_rule__DtoDecimalProperty__Group__13797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__NameAssignment_2_in_rule__DtoDecimalProperty__Group__23825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__DescriptionAssignment_0_in_rule__DtoEnumerationProperty__Group__03865 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__Group__1_in_rule__DtoEnumerationProperty__Group__03875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__TypeAssignment_1_in_rule__DtoEnumerationProperty__Group__13903 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__Group__2_in_rule__DtoEnumerationProperty__Group__13912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__NameAssignment_2_in_rule__DtoEnumerationProperty__Group__23940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DataContractModel__DescriptionAssignment_03980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataContractModel__NameAssignment_24011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_rule__DataContractModel__ExternalReferencesAssignment_44042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDto_in_rule__DataContractModel__DtosAssignment_5_04073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDto_in_rule__DataContractModel__EnumerationsAssignment_5_14104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ExternalReference__DescriptionAssignment_04135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalReference__ModelnameAssignment_24166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalReference__NameAssignment_44197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BusinessClassDto__DescriptionAssignment_04228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassDto__NameAssignment_24259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassDto__BaseAssignment_44294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassPropertyReference_in_rule__BusinessClassDto__PropertyReferencesAssignment_5_14329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassAssociationRoleReference_in_rule__BusinessClassDto__AssociationReferencesAssignment_5_2_24360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnumerationDto__DescriptionAssignment_04391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationDto__NameAssignment_24422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationDto__BaseAssignment_44457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassPropertyReference__NameAssignment_04492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassAssociationRoleReference__NameAssignment_04523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_24558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ListDto__DescriptionAssignment_04593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ListDto__NameAssignment_24624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ListDto__BaseDtoAssignment_44659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomDto__DescriptionAssignment_04694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomDto__NameAssignment_24725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoProperty_in_rule__CustomDto__PropertiesAssignment_44756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoBooleanProperty__DescriptionAssignment_04787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DtoBooleanProperty__DataTypeAssignment_14823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoBooleanProperty__NameAssignment_24862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoStringProperty__DescriptionAssignment_04893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DtoStringProperty__DataTypeAssignment_14929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoStringProperty__NameAssignment_24968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoDateTimeProperty__DescriptionAssignment_04999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DtoDateTimeProperty__DataTypeAssignment_15035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoDateTimeProperty__NameAssignment_25074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoIntegerProperty__DescriptionAssignment_05105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DtoIntegerProperty__DataTypeAssignment_15141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoIntegerProperty__NameAssignment_25180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoDecimalProperty__DescriptionAssignment_05211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DtoDecimalProperty__DataTypeAssignment_15247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoDecimalProperty__NameAssignment_25286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoEnumerationProperty__DescriptionAssignment_05317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoEnumerationProperty__TypeAssignment_15352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoEnumerationProperty__NameAssignment_25387 = new BitSet(new long[]{0x0000000000000002L});

}