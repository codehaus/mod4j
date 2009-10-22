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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'datacontract'", "'from'", "'import'", "'class'", "'represents'", "'['", "']'", "'references'", "'enumeration'", "'as'", "'list'", "'contains'", "'custom'", "'boolean'", "'string'", "'datetime'", "'integer'", "'decimal'"
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


    // $ANTLR start rule__BusinessClassDto__Alternatives_5
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:542:1: rule__BusinessClassDto__Alternatives_5 : ( ( ';' ) | ( ( rule__BusinessClassDto__Group_5_1__0 ) ) );
    public final void rule__BusinessClassDto__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:546:1: ( ( ';' ) | ( ( rule__BusinessClassDto__Group_5_1__0 ) ) )
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
                    new NoViableAltException("542:1: rule__BusinessClassDto__Alternatives_5 : ( ( ';' ) | ( ( rule__BusinessClassDto__Group_5_1__0 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:547:1: ( ';' )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:547:1: ( ';' )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:548:1: ';'
                    {
                     before(grammarAccess.getBusinessClassDtoAccess().getSemicolonKeyword_5_0()); 
                    match(input,11,FOLLOW_11_in_rule__BusinessClassDto__Alternatives_51148); 
                     after(grammarAccess.getBusinessClassDtoAccess().getSemicolonKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:555:6: ( ( rule__BusinessClassDto__Group_5_1__0 ) )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:555:6: ( ( rule__BusinessClassDto__Group_5_1__0 ) )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:556:1: ( rule__BusinessClassDto__Group_5_1__0 )
                    {
                     before(grammarAccess.getBusinessClassDtoAccess().getGroup_5_1()); 
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:557:1: ( rule__BusinessClassDto__Group_5_1__0 )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:557:2: rule__BusinessClassDto__Group_5_1__0
                    {
                    pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1__0_in_rule__BusinessClassDto__Alternatives_51167);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:566:1: rule__DtoProperty__Alternatives_0 : ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) );
    public final void rule__DtoProperty__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:570:1: ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt4=3;
                    }
                    break;
                case 26:
                    {
                    alt4=2;
                    }
                    break;
                case 28:
                    {
                    alt4=4;
                    }
                    break;
                case 25:
                    {
                    alt4=1;
                    }
                    break;
                case 29:
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
                        new NoViableAltException("566:1: rule__DtoProperty__Alternatives_0 : ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) );", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case 25:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 27:
                {
                alt4=3;
                }
                break;
            case 28:
                {
                alt4=4;
                }
                break;
            case 29:
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
                    new NoViableAltException("566:1: rule__DtoProperty__Alternatives_0 : ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:571:1: ( ruleDtoBooleanProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:571:1: ( ruleDtoBooleanProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:572:1: ruleDtoBooleanProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoBooleanPropertyParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleDtoBooleanProperty_in_rule__DtoProperty__Alternatives_01200);
                    ruleDtoBooleanProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoBooleanPropertyParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:577:6: ( ruleDtoStringProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:577:6: ( ruleDtoStringProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:578:1: ruleDtoStringProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoStringPropertyParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleDtoStringProperty_in_rule__DtoProperty__Alternatives_01217);
                    ruleDtoStringProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoStringPropertyParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:583:6: ( ruleDtoDateTimeProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:583:6: ( ruleDtoDateTimeProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:584:1: ruleDtoDateTimeProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoDateTimePropertyParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleDtoDateTimeProperty_in_rule__DtoProperty__Alternatives_01234);
                    ruleDtoDateTimeProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoDateTimePropertyParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:589:6: ( ruleDtoIntegerProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:589:6: ( ruleDtoIntegerProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:590:1: ruleDtoIntegerProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoIntegerPropertyParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleDtoIntegerProperty_in_rule__DtoProperty__Alternatives_01251);
                    ruleDtoIntegerProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoIntegerPropertyParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:595:6: ( ruleDtoDecimalProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:595:6: ( ruleDtoDecimalProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:596:1: ruleDtoDecimalProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoDecimalPropertyParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleDtoDecimalProperty_in_rule__DtoProperty__Alternatives_01268);
                    ruleDtoDecimalProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoDecimalPropertyParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:601:6: ( ruleDtoEnumerationProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:601:6: ( ruleDtoEnumerationProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:602:1: ruleDtoEnumerationProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoEnumerationPropertyParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_ruleDtoEnumerationProperty_in_rule__DtoProperty__Alternatives_01285);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:614:1: rule__DataContractModel__Group__0 : ( ( rule__DataContractModel__DescriptionAssignment_0 )? ) rule__DataContractModel__Group__1 ;
    public final void rule__DataContractModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:618:1: ( ( ( rule__DataContractModel__DescriptionAssignment_0 )? ) rule__DataContractModel__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:619:1: ( ( rule__DataContractModel__DescriptionAssignment_0 )? ) rule__DataContractModel__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:619:1: ( ( rule__DataContractModel__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:620:1: ( rule__DataContractModel__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDataContractModelAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:621:1: ( rule__DataContractModel__DescriptionAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:621:2: rule__DataContractModel__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DataContractModel__DescriptionAssignment_0_in_rule__DataContractModel__Group__01319);
                    rule__DataContractModel__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataContractModelAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DataContractModel__Group__1_in_rule__DataContractModel__Group__01329);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:632:1: rule__DataContractModel__Group__1 : ( 'datacontract' ) rule__DataContractModel__Group__2 ;
    public final void rule__DataContractModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:636:1: ( ( 'datacontract' ) rule__DataContractModel__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:637:1: ( 'datacontract' ) rule__DataContractModel__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:637:1: ( 'datacontract' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:638:1: 'datacontract'
            {
             before(grammarAccess.getDataContractModelAccess().getDatacontractKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__DataContractModel__Group__11358); 
             after(grammarAccess.getDataContractModelAccess().getDatacontractKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__DataContractModel__Group__2_in_rule__DataContractModel__Group__11368);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:652:1: rule__DataContractModel__Group__2 : ( ( rule__DataContractModel__NameAssignment_2 ) ) rule__DataContractModel__Group__3 ;
    public final void rule__DataContractModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:656:1: ( ( ( rule__DataContractModel__NameAssignment_2 ) ) rule__DataContractModel__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:657:1: ( ( rule__DataContractModel__NameAssignment_2 ) ) rule__DataContractModel__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:657:1: ( ( rule__DataContractModel__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:658:1: ( rule__DataContractModel__NameAssignment_2 )
            {
             before(grammarAccess.getDataContractModelAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:659:1: ( rule__DataContractModel__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:659:2: rule__DataContractModel__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DataContractModel__NameAssignment_2_in_rule__DataContractModel__Group__21396);
            rule__DataContractModel__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDataContractModelAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__DataContractModel__Group__3_in_rule__DataContractModel__Group__21405);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:670:1: rule__DataContractModel__Group__3 : ( ';' ) rule__DataContractModel__Group__4 ;
    public final void rule__DataContractModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:674:1: ( ( ';' ) rule__DataContractModel__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:675:1: ( ';' ) rule__DataContractModel__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:675:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:676:1: ';'
            {
             before(grammarAccess.getDataContractModelAccess().getSemicolonKeyword_3()); 
            match(input,11,FOLLOW_11_in_rule__DataContractModel__Group__31434); 
             after(grammarAccess.getDataContractModelAccess().getSemicolonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__DataContractModel__Group__4_in_rule__DataContractModel__Group__31444);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:690:1: rule__DataContractModel__Group__4 : ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* ) rule__DataContractModel__Group__5 ;
    public final void rule__DataContractModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:694:1: ( ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* ) rule__DataContractModel__Group__5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:695:1: ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* ) rule__DataContractModel__Group__5
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:695:1: ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:696:1: ( rule__DataContractModel__ExternalReferencesAssignment_4 )*
            {
             before(grammarAccess.getDataContractModelAccess().getExternalReferencesAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:697:1: ( rule__DataContractModel__ExternalReferencesAssignment_4 )*
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
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:697:2: rule__DataContractModel__ExternalReferencesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__DataContractModel__ExternalReferencesAssignment_4_in_rule__DataContractModel__Group__41472);
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

            pushFollow(FOLLOW_rule__DataContractModel__Group__5_in_rule__DataContractModel__Group__41482);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:708:1: rule__DataContractModel__Group__5 : ( ( rule__DataContractModel__Alternatives_5 )* ) ;
    public final void rule__DataContractModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:712:1: ( ( ( rule__DataContractModel__Alternatives_5 )* ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:713:1: ( ( rule__DataContractModel__Alternatives_5 )* )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:713:1: ( ( rule__DataContractModel__Alternatives_5 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:714:1: ( rule__DataContractModel__Alternatives_5 )*
            {
             before(grammarAccess.getDataContractModelAccess().getAlternatives_5()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:715:1: ( rule__DataContractModel__Alternatives_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING||LA7_0==15||LA7_0==20||LA7_0==22||LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:715:2: rule__DataContractModel__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__DataContractModel__Alternatives_5_in_rule__DataContractModel__Group__51510);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:737:1: rule__ExternalReference__Group__0 : ( ( rule__ExternalReference__DescriptionAssignment_0 )? ) rule__ExternalReference__Group__1 ;
    public final void rule__ExternalReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:741:1: ( ( ( rule__ExternalReference__DescriptionAssignment_0 )? ) rule__ExternalReference__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:742:1: ( ( rule__ExternalReference__DescriptionAssignment_0 )? ) rule__ExternalReference__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:742:1: ( ( rule__ExternalReference__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:743:1: ( rule__ExternalReference__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getExternalReferenceAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:744:1: ( rule__ExternalReference__DescriptionAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:744:2: rule__ExternalReference__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ExternalReference__DescriptionAssignment_0_in_rule__ExternalReference__Group__01557);
                    rule__ExternalReference__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalReferenceAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__1_in_rule__ExternalReference__Group__01567);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:755:1: rule__ExternalReference__Group__1 : ( 'from' ) rule__ExternalReference__Group__2 ;
    public final void rule__ExternalReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:759:1: ( ( 'from' ) rule__ExternalReference__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:760:1: ( 'from' ) rule__ExternalReference__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:760:1: ( 'from' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:761:1: 'from'
            {
             before(grammarAccess.getExternalReferenceAccess().getFromKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__ExternalReference__Group__11596); 
             after(grammarAccess.getExternalReferenceAccess().getFromKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__2_in_rule__ExternalReference__Group__11606);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:775:1: rule__ExternalReference__Group__2 : ( ( rule__ExternalReference__ModelnameAssignment_2 ) ) rule__ExternalReference__Group__3 ;
    public final void rule__ExternalReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:779:1: ( ( ( rule__ExternalReference__ModelnameAssignment_2 ) ) rule__ExternalReference__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:780:1: ( ( rule__ExternalReference__ModelnameAssignment_2 ) ) rule__ExternalReference__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:780:1: ( ( rule__ExternalReference__ModelnameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:781:1: ( rule__ExternalReference__ModelnameAssignment_2 )
            {
             before(grammarAccess.getExternalReferenceAccess().getModelnameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:782:1: ( rule__ExternalReference__ModelnameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:782:2: rule__ExternalReference__ModelnameAssignment_2
            {
            pushFollow(FOLLOW_rule__ExternalReference__ModelnameAssignment_2_in_rule__ExternalReference__Group__21634);
            rule__ExternalReference__ModelnameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getModelnameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__3_in_rule__ExternalReference__Group__21643);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:793:1: rule__ExternalReference__Group__3 : ( 'import' ) rule__ExternalReference__Group__4 ;
    public final void rule__ExternalReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:797:1: ( ( 'import' ) rule__ExternalReference__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:798:1: ( 'import' ) rule__ExternalReference__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:798:1: ( 'import' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:799:1: 'import'
            {
             before(grammarAccess.getExternalReferenceAccess().getImportKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__ExternalReference__Group__31672); 
             after(grammarAccess.getExternalReferenceAccess().getImportKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__4_in_rule__ExternalReference__Group__31682);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:813:1: rule__ExternalReference__Group__4 : ( ( rule__ExternalReference__NameAssignment_4 ) ) rule__ExternalReference__Group__5 ;
    public final void rule__ExternalReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:817:1: ( ( ( rule__ExternalReference__NameAssignment_4 ) ) rule__ExternalReference__Group__5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:818:1: ( ( rule__ExternalReference__NameAssignment_4 ) ) rule__ExternalReference__Group__5
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:818:1: ( ( rule__ExternalReference__NameAssignment_4 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:819:1: ( rule__ExternalReference__NameAssignment_4 )
            {
             before(grammarAccess.getExternalReferenceAccess().getNameAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:820:1: ( rule__ExternalReference__NameAssignment_4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:820:2: rule__ExternalReference__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__ExternalReference__NameAssignment_4_in_rule__ExternalReference__Group__41710);
            rule__ExternalReference__NameAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getNameAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__5_in_rule__ExternalReference__Group__41719);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:831:1: rule__ExternalReference__Group__5 : ( ';' ) ;
    public final void rule__ExternalReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:835:1: ( ( ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:836:1: ( ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:836:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:837:1: ';'
            {
             before(grammarAccess.getExternalReferenceAccess().getSemicolonKeyword_5()); 
            match(input,11,FOLLOW_11_in_rule__ExternalReference__Group__51748); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:862:1: rule__BusinessClassDto__Group__0 : ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? ) rule__BusinessClassDto__Group__1 ;
    public final void rule__BusinessClassDto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:866:1: ( ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? ) rule__BusinessClassDto__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:867:1: ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? ) rule__BusinessClassDto__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:867:1: ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:868:1: ( rule__BusinessClassDto__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBusinessClassDtoAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:869:1: ( rule__BusinessClassDto__DescriptionAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:869:2: rule__BusinessClassDto__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BusinessClassDto__DescriptionAssignment_0_in_rule__BusinessClassDto__Group__01795);
                    rule__BusinessClassDto__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassDtoAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__1_in_rule__BusinessClassDto__Group__01805);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:880:1: rule__BusinessClassDto__Group__1 : ( 'class' ) rule__BusinessClassDto__Group__2 ;
    public final void rule__BusinessClassDto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:884:1: ( ( 'class' ) rule__BusinessClassDto__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:885:1: ( 'class' ) rule__BusinessClassDto__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:885:1: ( 'class' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:886:1: 'class'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getClassKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__BusinessClassDto__Group__11834); 
             after(grammarAccess.getBusinessClassDtoAccess().getClassKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__2_in_rule__BusinessClassDto__Group__11844);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:900:1: rule__BusinessClassDto__Group__2 : ( ( rule__BusinessClassDto__NameAssignment_2 ) ) rule__BusinessClassDto__Group__3 ;
    public final void rule__BusinessClassDto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:904:1: ( ( ( rule__BusinessClassDto__NameAssignment_2 ) ) rule__BusinessClassDto__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:905:1: ( ( rule__BusinessClassDto__NameAssignment_2 ) ) rule__BusinessClassDto__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:905:1: ( ( rule__BusinessClassDto__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:906:1: ( rule__BusinessClassDto__NameAssignment_2 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:907:1: ( rule__BusinessClassDto__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:907:2: rule__BusinessClassDto__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__NameAssignment_2_in_rule__BusinessClassDto__Group__21872);
            rule__BusinessClassDto__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__3_in_rule__BusinessClassDto__Group__21881);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:918:1: rule__BusinessClassDto__Group__3 : ( 'represents' ) rule__BusinessClassDto__Group__4 ;
    public final void rule__BusinessClassDto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:922:1: ( ( 'represents' ) rule__BusinessClassDto__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:923:1: ( 'represents' ) rule__BusinessClassDto__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:923:1: ( 'represents' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:924:1: 'represents'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getRepresentsKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__BusinessClassDto__Group__31910); 
             after(grammarAccess.getBusinessClassDtoAccess().getRepresentsKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__4_in_rule__BusinessClassDto__Group__31920);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:938:1: rule__BusinessClassDto__Group__4 : ( ( rule__BusinessClassDto__BaseAssignment_4 ) ) rule__BusinessClassDto__Group__5 ;
    public final void rule__BusinessClassDto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:942:1: ( ( ( rule__BusinessClassDto__BaseAssignment_4 ) ) rule__BusinessClassDto__Group__5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:943:1: ( ( rule__BusinessClassDto__BaseAssignment_4 ) ) rule__BusinessClassDto__Group__5
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:943:1: ( ( rule__BusinessClassDto__BaseAssignment_4 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:944:1: ( rule__BusinessClassDto__BaseAssignment_4 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getBaseAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:945:1: ( rule__BusinessClassDto__BaseAssignment_4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:945:2: rule__BusinessClassDto__BaseAssignment_4
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__BaseAssignment_4_in_rule__BusinessClassDto__Group__41948);
            rule__BusinessClassDto__BaseAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getBaseAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__5_in_rule__BusinessClassDto__Group__41957);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:956:1: rule__BusinessClassDto__Group__5 : ( ( rule__BusinessClassDto__Alternatives_5 ) ) ;
    public final void rule__BusinessClassDto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:960:1: ( ( ( rule__BusinessClassDto__Alternatives_5 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:961:1: ( ( rule__BusinessClassDto__Alternatives_5 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:961:1: ( ( rule__BusinessClassDto__Alternatives_5 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:962:1: ( rule__BusinessClassDto__Alternatives_5 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getAlternatives_5()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:963:1: ( rule__BusinessClassDto__Alternatives_5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:963:2: rule__BusinessClassDto__Alternatives_5
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__Alternatives_5_in_rule__BusinessClassDto__Group__51985);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:985:1: rule__BusinessClassDto__Group_5_1__0 : ( '[' ) rule__BusinessClassDto__Group_5_1__1 ;
    public final void rule__BusinessClassDto__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:989:1: ( ( '[' ) rule__BusinessClassDto__Group_5_1__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:990:1: ( '[' ) rule__BusinessClassDto__Group_5_1__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:990:1: ( '[' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:991:1: '['
            {
             before(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_1_0()); 
            match(input,17,FOLLOW_17_in_rule__BusinessClassDto__Group_5_1__02032); 
             after(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_1_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1__1_in_rule__BusinessClassDto__Group_5_1__02042);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1005:1: rule__BusinessClassDto__Group_5_1__1 : ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )* ) ) rule__BusinessClassDto__Group_5_1__2 ;
    public final void rule__BusinessClassDto__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1009:1: ( ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )* ) ) rule__BusinessClassDto__Group_5_1__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1010:1: ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )* ) ) rule__BusinessClassDto__Group_5_1__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1010:1: ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )* ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1011:1: ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )* )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1011:1: ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1012:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesAssignment_5_1_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1013:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1013:2: rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1_in_rule__BusinessClassDto__Group_5_1__12072);
            rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesAssignment_5_1_1()); 

            }

            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1016:1: ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1017:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )*
            {
             before(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesAssignment_5_1_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1018:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1018:2: rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1
            	    {
            	    pushFollow(FOLLOW_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1_in_rule__BusinessClassDto__Group_5_1__12084);
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

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1__2_in_rule__BusinessClassDto__Group_5_1__12096);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1030:1: rule__BusinessClassDto__Group_5_1__2 : ( ( rule__BusinessClassDto__Group_5_1_2__0 )? ) rule__BusinessClassDto__Group_5_1__3 ;
    public final void rule__BusinessClassDto__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1034:1: ( ( ( rule__BusinessClassDto__Group_5_1_2__0 )? ) rule__BusinessClassDto__Group_5_1__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1035:1: ( ( rule__BusinessClassDto__Group_5_1_2__0 )? ) rule__BusinessClassDto__Group_5_1__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1035:1: ( ( rule__BusinessClassDto__Group_5_1_2__0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1036:1: ( rule__BusinessClassDto__Group_5_1_2__0 )?
            {
             before(grammarAccess.getBusinessClassDtoAccess().getGroup_5_1_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1037:1: ( rule__BusinessClassDto__Group_5_1_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1037:2: rule__BusinessClassDto__Group_5_1_2__0
                    {
                    pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1_2__0_in_rule__BusinessClassDto__Group_5_1__22124);
                    rule__BusinessClassDto__Group_5_1_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassDtoAccess().getGroup_5_1_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1__3_in_rule__BusinessClassDto__Group_5_1__22134);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1048:1: rule__BusinessClassDto__Group_5_1__3 : ( ']' ) ;
    public final void rule__BusinessClassDto__Group_5_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1052:1: ( ( ']' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1053:1: ( ']' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1053:1: ( ']' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1054:1: ']'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getRightSquareBracketKeyword_5_1_3()); 
            match(input,18,FOLLOW_18_in_rule__BusinessClassDto__Group_5_1__32163); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1075:1: rule__BusinessClassDto__Group_5_1_2__0 : ( 'references' ) rule__BusinessClassDto__Group_5_1_2__1 ;
    public final void rule__BusinessClassDto__Group_5_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1079:1: ( ( 'references' ) rule__BusinessClassDto__Group_5_1_2__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1080:1: ( 'references' ) rule__BusinessClassDto__Group_5_1_2__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1080:1: ( 'references' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1081:1: 'references'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getReferencesKeyword_5_1_2_0()); 
            match(input,19,FOLLOW_19_in_rule__BusinessClassDto__Group_5_1_2__02207); 
             after(grammarAccess.getBusinessClassDtoAccess().getReferencesKeyword_5_1_2_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1_2__1_in_rule__BusinessClassDto__Group_5_1_2__02217);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1095:1: rule__BusinessClassDto__Group_5_1_2__1 : ( '[' ) rule__BusinessClassDto__Group_5_1_2__2 ;
    public final void rule__BusinessClassDto__Group_5_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1099:1: ( ( '[' ) rule__BusinessClassDto__Group_5_1_2__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1100:1: ( '[' ) rule__BusinessClassDto__Group_5_1_2__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1100:1: ( '[' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1101:1: '['
            {
             before(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_1_2_1()); 
            match(input,17,FOLLOW_17_in_rule__BusinessClassDto__Group_5_1_2__12246); 
             after(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_1_2_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1_2__2_in_rule__BusinessClassDto__Group_5_1_2__12256);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1115:1: rule__BusinessClassDto__Group_5_1_2__2 : ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )* ) ) rule__BusinessClassDto__Group_5_1_2__3 ;
    public final void rule__BusinessClassDto__Group_5_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1119:1: ( ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )* ) ) rule__BusinessClassDto__Group_5_1_2__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1120:1: ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )* ) ) rule__BusinessClassDto__Group_5_1_2__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1120:1: ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )* ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1121:1: ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )* )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1121:1: ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1122:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesAssignment_5_1_2_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1123:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1123:2: rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2_in_rule__BusinessClassDto__Group_5_1_2__22286);
            rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesAssignment_5_1_2_2()); 

            }

            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1126:1: ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1127:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )*
            {
             before(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesAssignment_5_1_2_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1128:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1128:2: rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2
            	    {
            	    pushFollow(FOLLOW_rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2_in_rule__BusinessClassDto__Group_5_1_2__22298);
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

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1_2__3_in_rule__BusinessClassDto__Group_5_1_2__22310);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1140:1: rule__BusinessClassDto__Group_5_1_2__3 : ( ']' ) ;
    public final void rule__BusinessClassDto__Group_5_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1144:1: ( ( ']' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1145:1: ( ']' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1145:1: ( ']' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1146:1: ']'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getRightSquareBracketKeyword_5_1_2_3()); 
            match(input,18,FOLLOW_18_in_rule__BusinessClassDto__Group_5_1_2__32339); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1167:1: rule__EnumerationDto__Group__0 : ( ( rule__EnumerationDto__DescriptionAssignment_0 )? ) rule__EnumerationDto__Group__1 ;
    public final void rule__EnumerationDto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1171:1: ( ( ( rule__EnumerationDto__DescriptionAssignment_0 )? ) rule__EnumerationDto__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1172:1: ( ( rule__EnumerationDto__DescriptionAssignment_0 )? ) rule__EnumerationDto__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1172:1: ( ( rule__EnumerationDto__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1173:1: ( rule__EnumerationDto__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumerationDtoAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1174:1: ( rule__EnumerationDto__DescriptionAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1174:2: rule__EnumerationDto__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EnumerationDto__DescriptionAssignment_0_in_rule__EnumerationDto__Group__02382);
                    rule__EnumerationDto__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationDtoAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationDto__Group__1_in_rule__EnumerationDto__Group__02392);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1185:1: rule__EnumerationDto__Group__1 : ( 'enumeration' ) rule__EnumerationDto__Group__2 ;
    public final void rule__EnumerationDto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1189:1: ( ( 'enumeration' ) rule__EnumerationDto__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1190:1: ( 'enumeration' ) rule__EnumerationDto__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1190:1: ( 'enumeration' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1191:1: 'enumeration'
            {
             before(grammarAccess.getEnumerationDtoAccess().getEnumerationKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__EnumerationDto__Group__12421); 
             after(grammarAccess.getEnumerationDtoAccess().getEnumerationKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__EnumerationDto__Group__2_in_rule__EnumerationDto__Group__12431);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1205:1: rule__EnumerationDto__Group__2 : ( ( rule__EnumerationDto__NameAssignment_2 ) ) rule__EnumerationDto__Group__3 ;
    public final void rule__EnumerationDto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1209:1: ( ( ( rule__EnumerationDto__NameAssignment_2 ) ) rule__EnumerationDto__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1210:1: ( ( rule__EnumerationDto__NameAssignment_2 ) ) rule__EnumerationDto__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1210:1: ( ( rule__EnumerationDto__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1211:1: ( rule__EnumerationDto__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationDtoAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1212:1: ( rule__EnumerationDto__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1212:2: rule__EnumerationDto__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumerationDto__NameAssignment_2_in_rule__EnumerationDto__Group__22459);
            rule__EnumerationDto__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEnumerationDtoAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__EnumerationDto__Group__3_in_rule__EnumerationDto__Group__22468);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1223:1: rule__EnumerationDto__Group__3 : ( 'represents' ) rule__EnumerationDto__Group__4 ;
    public final void rule__EnumerationDto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1227:1: ( ( 'represents' ) rule__EnumerationDto__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1228:1: ( 'represents' ) rule__EnumerationDto__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1228:1: ( 'represents' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1229:1: 'represents'
            {
             before(grammarAccess.getEnumerationDtoAccess().getRepresentsKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__EnumerationDto__Group__32497); 
             after(grammarAccess.getEnumerationDtoAccess().getRepresentsKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__EnumerationDto__Group__4_in_rule__EnumerationDto__Group__32507);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1243:1: rule__EnumerationDto__Group__4 : ( ( rule__EnumerationDto__BaseAssignment_4 ) ) rule__EnumerationDto__Group__5 ;
    public final void rule__EnumerationDto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1247:1: ( ( ( rule__EnumerationDto__BaseAssignment_4 ) ) rule__EnumerationDto__Group__5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1248:1: ( ( rule__EnumerationDto__BaseAssignment_4 ) ) rule__EnumerationDto__Group__5
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1248:1: ( ( rule__EnumerationDto__BaseAssignment_4 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1249:1: ( rule__EnumerationDto__BaseAssignment_4 )
            {
             before(grammarAccess.getEnumerationDtoAccess().getBaseAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1250:1: ( rule__EnumerationDto__BaseAssignment_4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1250:2: rule__EnumerationDto__BaseAssignment_4
            {
            pushFollow(FOLLOW_rule__EnumerationDto__BaseAssignment_4_in_rule__EnumerationDto__Group__42535);
            rule__EnumerationDto__BaseAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getEnumerationDtoAccess().getBaseAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__EnumerationDto__Group__5_in_rule__EnumerationDto__Group__42544);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1261:1: rule__EnumerationDto__Group__5 : ( ';' ) ;
    public final void rule__EnumerationDto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1265:1: ( ( ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1266:1: ( ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1266:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1267:1: ';'
            {
             before(grammarAccess.getEnumerationDtoAccess().getSemicolonKeyword_5()); 
            match(input,11,FOLLOW_11_in_rule__EnumerationDto__Group__52573); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1292:1: rule__BusinessClassPropertyReference__Group__0 : ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) ) rule__BusinessClassPropertyReference__Group__1 ;
    public final void rule__BusinessClassPropertyReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1296:1: ( ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) ) rule__BusinessClassPropertyReference__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1297:1: ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) ) rule__BusinessClassPropertyReference__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1297:1: ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1298:1: ( rule__BusinessClassPropertyReference__NameAssignment_0 )
            {
             before(grammarAccess.getBusinessClassPropertyReferenceAccess().getNameAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1299:1: ( rule__BusinessClassPropertyReference__NameAssignment_0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1299:2: rule__BusinessClassPropertyReference__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BusinessClassPropertyReference__NameAssignment_0_in_rule__BusinessClassPropertyReference__Group__02620);
            rule__BusinessClassPropertyReference__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassPropertyReferenceAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassPropertyReference__Group__1_in_rule__BusinessClassPropertyReference__Group__02629);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1310:1: rule__BusinessClassPropertyReference__Group__1 : ( ';' ) ;
    public final void rule__BusinessClassPropertyReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1314:1: ( ( ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1315:1: ( ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1315:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1316:1: ';'
            {
             before(grammarAccess.getBusinessClassPropertyReferenceAccess().getSemicolonKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__BusinessClassPropertyReference__Group__12658); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1333:1: rule__BusinessClassAssociationRoleReference__Group__0 : ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) ) rule__BusinessClassAssociationRoleReference__Group__1 ;
    public final void rule__BusinessClassAssociationRoleReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1337:1: ( ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) ) rule__BusinessClassAssociationRoleReference__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1338:1: ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) ) rule__BusinessClassAssociationRoleReference__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1338:1: ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1339:1: ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 )
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getNameAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1340:1: ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1340:2: rule__BusinessClassAssociationRoleReference__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__NameAssignment_0_in_rule__BusinessClassAssociationRoleReference__Group__02697);
            rule__BusinessClassAssociationRoleReference__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__Group__1_in_rule__BusinessClassAssociationRoleReference__Group__02706);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1351:1: rule__BusinessClassAssociationRoleReference__Group__1 : ( 'as' ) rule__BusinessClassAssociationRoleReference__Group__2 ;
    public final void rule__BusinessClassAssociationRoleReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1355:1: ( ( 'as' ) rule__BusinessClassAssociationRoleReference__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1356:1: ( 'as' ) rule__BusinessClassAssociationRoleReference__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1356:1: ( 'as' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1357:1: 'as'
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getAsKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__BusinessClassAssociationRoleReference__Group__12735); 
             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getAsKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__Group__2_in_rule__BusinessClassAssociationRoleReference__Group__12745);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1371:1: rule__BusinessClassAssociationRoleReference__Group__2 : ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) ) rule__BusinessClassAssociationRoleReference__Group__3 ;
    public final void rule__BusinessClassAssociationRoleReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1375:1: ( ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) ) rule__BusinessClassAssociationRoleReference__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1376:1: ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) ) rule__BusinessClassAssociationRoleReference__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1376:1: ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1377:1: ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 )
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1378:1: ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1378:2: rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2_in_rule__BusinessClassAssociationRoleReference__Group__22773);
            rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__Group__3_in_rule__BusinessClassAssociationRoleReference__Group__22782);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1389:1: rule__BusinessClassAssociationRoleReference__Group__3 : ( ';' ) ;
    public final void rule__BusinessClassAssociationRoleReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1393:1: ( ( ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1394:1: ( ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1394:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1395:1: ';'
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getSemicolonKeyword_3()); 
            match(input,11,FOLLOW_11_in_rule__BusinessClassAssociationRoleReference__Group__32811); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1416:1: rule__ListDto__Group__0 : ( ( rule__ListDto__DescriptionAssignment_0 )? ) rule__ListDto__Group__1 ;
    public final void rule__ListDto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1420:1: ( ( ( rule__ListDto__DescriptionAssignment_0 )? ) rule__ListDto__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1421:1: ( ( rule__ListDto__DescriptionAssignment_0 )? ) rule__ListDto__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1421:1: ( ( rule__ListDto__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1422:1: ( rule__ListDto__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getListDtoAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1423:1: ( rule__ListDto__DescriptionAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1423:2: rule__ListDto__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ListDto__DescriptionAssignment_0_in_rule__ListDto__Group__02854);
                    rule__ListDto__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListDtoAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ListDto__Group__1_in_rule__ListDto__Group__02864);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1434:1: rule__ListDto__Group__1 : ( 'list' ) rule__ListDto__Group__2 ;
    public final void rule__ListDto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1438:1: ( ( 'list' ) rule__ListDto__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1439:1: ( 'list' ) rule__ListDto__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1439:1: ( 'list' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1440:1: 'list'
            {
             before(grammarAccess.getListDtoAccess().getListKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__ListDto__Group__12893); 
             after(grammarAccess.getListDtoAccess().getListKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ListDto__Group__2_in_rule__ListDto__Group__12903);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1454:1: rule__ListDto__Group__2 : ( ( rule__ListDto__NameAssignment_2 ) ) rule__ListDto__Group__3 ;
    public final void rule__ListDto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1458:1: ( ( ( rule__ListDto__NameAssignment_2 ) ) rule__ListDto__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1459:1: ( ( rule__ListDto__NameAssignment_2 ) ) rule__ListDto__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1459:1: ( ( rule__ListDto__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1460:1: ( rule__ListDto__NameAssignment_2 )
            {
             before(grammarAccess.getListDtoAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1461:1: ( rule__ListDto__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1461:2: rule__ListDto__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ListDto__NameAssignment_2_in_rule__ListDto__Group__22931);
            rule__ListDto__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getListDtoAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ListDto__Group__3_in_rule__ListDto__Group__22940);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1472:1: rule__ListDto__Group__3 : ( 'contains' ) rule__ListDto__Group__4 ;
    public final void rule__ListDto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1476:1: ( ( 'contains' ) rule__ListDto__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1477:1: ( 'contains' ) rule__ListDto__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1477:1: ( 'contains' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1478:1: 'contains'
            {
             before(grammarAccess.getListDtoAccess().getContainsKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__ListDto__Group__32969); 
             after(grammarAccess.getListDtoAccess().getContainsKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ListDto__Group__4_in_rule__ListDto__Group__32979);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1492:1: rule__ListDto__Group__4 : ( ( rule__ListDto__BaseDtoAssignment_4 ) ) rule__ListDto__Group__5 ;
    public final void rule__ListDto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1496:1: ( ( ( rule__ListDto__BaseDtoAssignment_4 ) ) rule__ListDto__Group__5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1497:1: ( ( rule__ListDto__BaseDtoAssignment_4 ) ) rule__ListDto__Group__5
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1497:1: ( ( rule__ListDto__BaseDtoAssignment_4 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1498:1: ( rule__ListDto__BaseDtoAssignment_4 )
            {
             before(grammarAccess.getListDtoAccess().getBaseDtoAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1499:1: ( rule__ListDto__BaseDtoAssignment_4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1499:2: rule__ListDto__BaseDtoAssignment_4
            {
            pushFollow(FOLLOW_rule__ListDto__BaseDtoAssignment_4_in_rule__ListDto__Group__43007);
            rule__ListDto__BaseDtoAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getListDtoAccess().getBaseDtoAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ListDto__Group__5_in_rule__ListDto__Group__43016);
            rule__ListDto__Group__5();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__ListDto__Group__5
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1510:1: rule__ListDto__Group__5 : ( ';' ) ;
    public final void rule__ListDto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1514:1: ( ( ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1515:1: ( ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1515:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1516:1: ';'
            {
             before(grammarAccess.getListDtoAccess().getSemicolonKeyword_5()); 
            match(input,11,FOLLOW_11_in_rule__ListDto__Group__53045); 
             after(grammarAccess.getListDtoAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListDto__Group__5


    // $ANTLR start rule__CustomDto__Group__0
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1541:1: rule__CustomDto__Group__0 : ( ( rule__CustomDto__DescriptionAssignment_0 )? ) rule__CustomDto__Group__1 ;
    public final void rule__CustomDto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1545:1: ( ( ( rule__CustomDto__DescriptionAssignment_0 )? ) rule__CustomDto__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1546:1: ( ( rule__CustomDto__DescriptionAssignment_0 )? ) rule__CustomDto__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1546:1: ( ( rule__CustomDto__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1547:1: ( rule__CustomDto__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getCustomDtoAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1548:1: ( rule__CustomDto__DescriptionAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1548:2: rule__CustomDto__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CustomDto__DescriptionAssignment_0_in_rule__CustomDto__Group__03092);
                    rule__CustomDto__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomDtoAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__CustomDto__Group__1_in_rule__CustomDto__Group__03102);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1559:1: rule__CustomDto__Group__1 : ( 'custom' ) rule__CustomDto__Group__2 ;
    public final void rule__CustomDto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1563:1: ( ( 'custom' ) rule__CustomDto__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1564:1: ( 'custom' ) rule__CustomDto__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1564:1: ( 'custom' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1565:1: 'custom'
            {
             before(grammarAccess.getCustomDtoAccess().getCustomKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__CustomDto__Group__13131); 
             after(grammarAccess.getCustomDtoAccess().getCustomKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__CustomDto__Group__2_in_rule__CustomDto__Group__13141);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1579:1: rule__CustomDto__Group__2 : ( ( rule__CustomDto__NameAssignment_2 ) ) rule__CustomDto__Group__3 ;
    public final void rule__CustomDto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1583:1: ( ( ( rule__CustomDto__NameAssignment_2 ) ) rule__CustomDto__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1584:1: ( ( rule__CustomDto__NameAssignment_2 ) ) rule__CustomDto__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1584:1: ( ( rule__CustomDto__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1585:1: ( rule__CustomDto__NameAssignment_2 )
            {
             before(grammarAccess.getCustomDtoAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1586:1: ( rule__CustomDto__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1586:2: rule__CustomDto__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CustomDto__NameAssignment_2_in_rule__CustomDto__Group__23169);
            rule__CustomDto__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCustomDtoAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__CustomDto__Group__3_in_rule__CustomDto__Group__23178);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1597:1: rule__CustomDto__Group__3 : ( '[' ) rule__CustomDto__Group__4 ;
    public final void rule__CustomDto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1601:1: ( ( '[' ) rule__CustomDto__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1602:1: ( '[' ) rule__CustomDto__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1602:1: ( '[' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1603:1: '['
            {
             before(grammarAccess.getCustomDtoAccess().getLeftSquareBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__CustomDto__Group__33207); 
             after(grammarAccess.getCustomDtoAccess().getLeftSquareBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__CustomDto__Group__4_in_rule__CustomDto__Group__33217);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1617:1: rule__CustomDto__Group__4 : ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) ) rule__CustomDto__Group__5 ;
    public final void rule__CustomDto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1621:1: ( ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) ) rule__CustomDto__Group__5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1622:1: ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) ) rule__CustomDto__Group__5
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1622:1: ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1623:1: ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1623:1: ( ( rule__CustomDto__PropertiesAssignment_4 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1624:1: ( rule__CustomDto__PropertiesAssignment_4 )
            {
             before(grammarAccess.getCustomDtoAccess().getPropertiesAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1625:1: ( rule__CustomDto__PropertiesAssignment_4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1625:2: rule__CustomDto__PropertiesAssignment_4
            {
            pushFollow(FOLLOW_rule__CustomDto__PropertiesAssignment_4_in_rule__CustomDto__Group__43247);
            rule__CustomDto__PropertiesAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getCustomDtoAccess().getPropertiesAssignment_4()); 

            }

            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1628:1: ( ( rule__CustomDto__PropertiesAssignment_4 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1629:1: ( rule__CustomDto__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getCustomDtoAccess().getPropertiesAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1630:1: ( rule__CustomDto__PropertiesAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||(LA16_0>=25 && LA16_0<=29)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1630:2: rule__CustomDto__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__CustomDto__PropertiesAssignment_4_in_rule__CustomDto__Group__43259);
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

            pushFollow(FOLLOW_rule__CustomDto__Group__5_in_rule__CustomDto__Group__43271);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1642:1: rule__CustomDto__Group__5 : ( ']' ) ;
    public final void rule__CustomDto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1646:1: ( ( ']' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1647:1: ( ']' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1647:1: ( ']' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1648:1: ']'
            {
             before(grammarAccess.getCustomDtoAccess().getRightSquareBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__CustomDto__Group__53300); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1673:1: rule__DtoProperty__Group__0 : ( ( rule__DtoProperty__Alternatives_0 ) ) rule__DtoProperty__Group__1 ;
    public final void rule__DtoProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1677:1: ( ( ( rule__DtoProperty__Alternatives_0 ) ) rule__DtoProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1678:1: ( ( rule__DtoProperty__Alternatives_0 ) ) rule__DtoProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1678:1: ( ( rule__DtoProperty__Alternatives_0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1679:1: ( rule__DtoProperty__Alternatives_0 )
            {
             before(grammarAccess.getDtoPropertyAccess().getAlternatives_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1680:1: ( rule__DtoProperty__Alternatives_0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1680:2: rule__DtoProperty__Alternatives_0
            {
            pushFollow(FOLLOW_rule__DtoProperty__Alternatives_0_in_rule__DtoProperty__Group__03347);
            rule__DtoProperty__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getDtoPropertyAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__DtoProperty__Group__1_in_rule__DtoProperty__Group__03356);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1691:1: rule__DtoProperty__Group__1 : ( ';' ) ;
    public final void rule__DtoProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1695:1: ( ( ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1696:1: ( ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1696:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1697:1: ';'
            {
             before(grammarAccess.getDtoPropertyAccess().getSemicolonKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__DtoProperty__Group__13385); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1714:1: rule__DtoBooleanProperty__Group__0 : ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? ) rule__DtoBooleanProperty__Group__1 ;
    public final void rule__DtoBooleanProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1718:1: ( ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? ) rule__DtoBooleanProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1719:1: ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? ) rule__DtoBooleanProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1719:1: ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1720:1: ( rule__DtoBooleanProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1721:1: ( rule__DtoBooleanProperty__DescriptionAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1721:2: rule__DtoBooleanProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoBooleanProperty__DescriptionAssignment_0_in_rule__DtoBooleanProperty__Group__03424);
                    rule__DtoBooleanProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoBooleanPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoBooleanProperty__Group__1_in_rule__DtoBooleanProperty__Group__03434);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1732:1: rule__DtoBooleanProperty__Group__1 : ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) ) rule__DtoBooleanProperty__Group__2 ;
    public final void rule__DtoBooleanProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1736:1: ( ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) ) rule__DtoBooleanProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1737:1: ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) ) rule__DtoBooleanProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1737:1: ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1738:1: ( rule__DtoBooleanProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1739:1: ( rule__DtoBooleanProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1739:2: rule__DtoBooleanProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoBooleanProperty__DataTypeAssignment_1_in_rule__DtoBooleanProperty__Group__13462);
            rule__DtoBooleanProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoBooleanProperty__Group__2_in_rule__DtoBooleanProperty__Group__13471);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1750:1: rule__DtoBooleanProperty__Group__2 : ( ( rule__DtoBooleanProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoBooleanProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1754:1: ( ( ( rule__DtoBooleanProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1755:1: ( ( rule__DtoBooleanProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1755:1: ( ( rule__DtoBooleanProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1756:1: ( rule__DtoBooleanProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1757:1: ( rule__DtoBooleanProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1757:2: rule__DtoBooleanProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoBooleanProperty__NameAssignment_2_in_rule__DtoBooleanProperty__Group__23499);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1773:1: rule__DtoStringProperty__Group__0 : ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? ) rule__DtoStringProperty__Group__1 ;
    public final void rule__DtoStringProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1777:1: ( ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? ) rule__DtoStringProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1778:1: ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? ) rule__DtoStringProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1778:1: ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1779:1: ( rule__DtoStringProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1780:1: ( rule__DtoStringProperty__DescriptionAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1780:2: rule__DtoStringProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoStringProperty__DescriptionAssignment_0_in_rule__DtoStringProperty__Group__03539);
                    rule__DtoStringProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoStringPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoStringProperty__Group__1_in_rule__DtoStringProperty__Group__03549);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1791:1: rule__DtoStringProperty__Group__1 : ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) ) rule__DtoStringProperty__Group__2 ;
    public final void rule__DtoStringProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1795:1: ( ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) ) rule__DtoStringProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1796:1: ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) ) rule__DtoStringProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1796:1: ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1797:1: ( rule__DtoStringProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1798:1: ( rule__DtoStringProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1798:2: rule__DtoStringProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoStringProperty__DataTypeAssignment_1_in_rule__DtoStringProperty__Group__13577);
            rule__DtoStringProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoStringPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoStringProperty__Group__2_in_rule__DtoStringProperty__Group__13586);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1809:1: rule__DtoStringProperty__Group__2 : ( ( rule__DtoStringProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoStringProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1813:1: ( ( ( rule__DtoStringProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1814:1: ( ( rule__DtoStringProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1814:1: ( ( rule__DtoStringProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1815:1: ( rule__DtoStringProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoStringPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1816:1: ( rule__DtoStringProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1816:2: rule__DtoStringProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoStringProperty__NameAssignment_2_in_rule__DtoStringProperty__Group__23614);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1832:1: rule__DtoDateTimeProperty__Group__0 : ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? ) rule__DtoDateTimeProperty__Group__1 ;
    public final void rule__DtoDateTimeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1836:1: ( ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? ) rule__DtoDateTimeProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1837:1: ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? ) rule__DtoDateTimeProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1837:1: ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1838:1: ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1839:1: ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1839:2: rule__DtoDateTimeProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoDateTimeProperty__DescriptionAssignment_0_in_rule__DtoDateTimeProperty__Group__03654);
                    rule__DtoDateTimeProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoDateTimePropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoDateTimeProperty__Group__1_in_rule__DtoDateTimeProperty__Group__03664);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1850:1: rule__DtoDateTimeProperty__Group__1 : ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) ) rule__DtoDateTimeProperty__Group__2 ;
    public final void rule__DtoDateTimeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1854:1: ( ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) ) rule__DtoDateTimeProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1855:1: ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) ) rule__DtoDateTimeProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1855:1: ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1856:1: ( rule__DtoDateTimeProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1857:1: ( rule__DtoDateTimeProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1857:2: rule__DtoDateTimeProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoDateTimeProperty__DataTypeAssignment_1_in_rule__DtoDateTimeProperty__Group__13692);
            rule__DtoDateTimeProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoDateTimeProperty__Group__2_in_rule__DtoDateTimeProperty__Group__13701);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1868:1: rule__DtoDateTimeProperty__Group__2 : ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoDateTimeProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1872:1: ( ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1873:1: ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1873:1: ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1874:1: ( rule__DtoDateTimeProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1875:1: ( rule__DtoDateTimeProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1875:2: rule__DtoDateTimeProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoDateTimeProperty__NameAssignment_2_in_rule__DtoDateTimeProperty__Group__23729);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1891:1: rule__DtoIntegerProperty__Group__0 : ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? ) rule__DtoIntegerProperty__Group__1 ;
    public final void rule__DtoIntegerProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1895:1: ( ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? ) rule__DtoIntegerProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1896:1: ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? ) rule__DtoIntegerProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1896:1: ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1897:1: ( rule__DtoIntegerProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1898:1: ( rule__DtoIntegerProperty__DescriptionAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1898:2: rule__DtoIntegerProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoIntegerProperty__DescriptionAssignment_0_in_rule__DtoIntegerProperty__Group__03769);
                    rule__DtoIntegerProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoIntegerPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoIntegerProperty__Group__1_in_rule__DtoIntegerProperty__Group__03779);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1909:1: rule__DtoIntegerProperty__Group__1 : ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) ) rule__DtoIntegerProperty__Group__2 ;
    public final void rule__DtoIntegerProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1913:1: ( ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) ) rule__DtoIntegerProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1914:1: ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) ) rule__DtoIntegerProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1914:1: ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1915:1: ( rule__DtoIntegerProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1916:1: ( rule__DtoIntegerProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1916:2: rule__DtoIntegerProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoIntegerProperty__DataTypeAssignment_1_in_rule__DtoIntegerProperty__Group__13807);
            rule__DtoIntegerProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoIntegerProperty__Group__2_in_rule__DtoIntegerProperty__Group__13816);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1927:1: rule__DtoIntegerProperty__Group__2 : ( ( rule__DtoIntegerProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoIntegerProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1931:1: ( ( ( rule__DtoIntegerProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1932:1: ( ( rule__DtoIntegerProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1932:1: ( ( rule__DtoIntegerProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1933:1: ( rule__DtoIntegerProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1934:1: ( rule__DtoIntegerProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1934:2: rule__DtoIntegerProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoIntegerProperty__NameAssignment_2_in_rule__DtoIntegerProperty__Group__23844);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1950:1: rule__DtoDecimalProperty__Group__0 : ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? ) rule__DtoDecimalProperty__Group__1 ;
    public final void rule__DtoDecimalProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1954:1: ( ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? ) rule__DtoDecimalProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1955:1: ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? ) rule__DtoDecimalProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1955:1: ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1956:1: ( rule__DtoDecimalProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1957:1: ( rule__DtoDecimalProperty__DescriptionAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1957:2: rule__DtoDecimalProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoDecimalProperty__DescriptionAssignment_0_in_rule__DtoDecimalProperty__Group__03884);
                    rule__DtoDecimalProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoDecimalPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoDecimalProperty__Group__1_in_rule__DtoDecimalProperty__Group__03894);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1968:1: rule__DtoDecimalProperty__Group__1 : ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) ) rule__DtoDecimalProperty__Group__2 ;
    public final void rule__DtoDecimalProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1972:1: ( ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) ) rule__DtoDecimalProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1973:1: ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) ) rule__DtoDecimalProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1973:1: ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1974:1: ( rule__DtoDecimalProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1975:1: ( rule__DtoDecimalProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1975:2: rule__DtoDecimalProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoDecimalProperty__DataTypeAssignment_1_in_rule__DtoDecimalProperty__Group__13922);
            rule__DtoDecimalProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoDecimalProperty__Group__2_in_rule__DtoDecimalProperty__Group__13931);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1986:1: rule__DtoDecimalProperty__Group__2 : ( ( rule__DtoDecimalProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoDecimalProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1990:1: ( ( ( rule__DtoDecimalProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1991:1: ( ( rule__DtoDecimalProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1991:1: ( ( rule__DtoDecimalProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1992:1: ( rule__DtoDecimalProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1993:1: ( rule__DtoDecimalProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1993:2: rule__DtoDecimalProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoDecimalProperty__NameAssignment_2_in_rule__DtoDecimalProperty__Group__23959);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2009:1: rule__DtoEnumerationProperty__Group__0 : ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? ) rule__DtoEnumerationProperty__Group__1 ;
    public final void rule__DtoEnumerationProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2013:1: ( ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? ) rule__DtoEnumerationProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2014:1: ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? ) rule__DtoEnumerationProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2014:1: ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2015:1: ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2016:1: ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2016:2: rule__DtoEnumerationProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoEnumerationProperty__DescriptionAssignment_0_in_rule__DtoEnumerationProperty__Group__03999);
                    rule__DtoEnumerationProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoEnumerationPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoEnumerationProperty__Group__1_in_rule__DtoEnumerationProperty__Group__04009);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2027:1: rule__DtoEnumerationProperty__Group__1 : ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) ) rule__DtoEnumerationProperty__Group__2 ;
    public final void rule__DtoEnumerationProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2031:1: ( ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) ) rule__DtoEnumerationProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2032:1: ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) ) rule__DtoEnumerationProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2032:1: ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2033:1: ( rule__DtoEnumerationProperty__TypeAssignment_1 )
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2034:1: ( rule__DtoEnumerationProperty__TypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2034:2: rule__DtoEnumerationProperty__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoEnumerationProperty__TypeAssignment_1_in_rule__DtoEnumerationProperty__Group__14037);
            rule__DtoEnumerationProperty__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoEnumerationPropertyAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoEnumerationProperty__Group__2_in_rule__DtoEnumerationProperty__Group__14046);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2045:1: rule__DtoEnumerationProperty__Group__2 : ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoEnumerationProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2049:1: ( ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2050:1: ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2050:1: ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2051:1: ( rule__DtoEnumerationProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2052:1: ( rule__DtoEnumerationProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2052:2: rule__DtoEnumerationProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoEnumerationProperty__NameAssignment_2_in_rule__DtoEnumerationProperty__Group__24074);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2068:1: rule__DataContractModel__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DataContractModel__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2072:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2073:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2073:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2074:1: RULE_STRING
            {
             before(grammarAccess.getDataContractModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DataContractModel__DescriptionAssignment_04114); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2083:1: rule__DataContractModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataContractModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2087:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2088:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2088:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2089:1: RULE_ID
            {
             before(grammarAccess.getDataContractModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataContractModel__NameAssignment_24145); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2098:1: rule__DataContractModel__ExternalReferencesAssignment_4 : ( ruleExternalReference ) ;
    public final void rule__DataContractModel__ExternalReferencesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2102:1: ( ( ruleExternalReference ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2103:1: ( ruleExternalReference )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2103:1: ( ruleExternalReference )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2104:1: ruleExternalReference
            {
             before(grammarAccess.getDataContractModelAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExternalReference_in_rule__DataContractModel__ExternalReferencesAssignment_44176);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2113:1: rule__DataContractModel__DtosAssignment_5_0 : ( ruleDto ) ;
    public final void rule__DataContractModel__DtosAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2117:1: ( ( ruleDto ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2118:1: ( ruleDto )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2118:1: ( ruleDto )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2119:1: ruleDto
            {
             before(grammarAccess.getDataContractModelAccess().getDtosDtoParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleDto_in_rule__DataContractModel__DtosAssignment_5_04207);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2128:1: rule__DataContractModel__EnumerationsAssignment_5_1 : ( ruleEnumerationDto ) ;
    public final void rule__DataContractModel__EnumerationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2132:1: ( ( ruleEnumerationDto ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2133:1: ( ruleEnumerationDto )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2133:1: ( ruleEnumerationDto )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2134:1: ruleEnumerationDto
            {
             before(grammarAccess.getDataContractModelAccess().getEnumerationsEnumerationDtoParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleEnumerationDto_in_rule__DataContractModel__EnumerationsAssignment_5_14238);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2143:1: rule__ExternalReference__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ExternalReference__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2147:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2148:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2148:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2149:1: RULE_STRING
            {
             before(grammarAccess.getExternalReferenceAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ExternalReference__DescriptionAssignment_04269); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2158:1: rule__ExternalReference__ModelnameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ExternalReference__ModelnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2162:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2163:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2163:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2164:1: RULE_ID
            {
             before(grammarAccess.getExternalReferenceAccess().getModelnameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalReference__ModelnameAssignment_24300); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2173:1: rule__ExternalReference__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__ExternalReference__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2177:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2178:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2178:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2179:1: RULE_ID
            {
             before(grammarAccess.getExternalReferenceAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalReference__NameAssignment_44331); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2188:1: rule__BusinessClassDto__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessClassDto__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2192:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2193:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2193:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2194:1: RULE_STRING
            {
             before(grammarAccess.getBusinessClassDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BusinessClassDto__DescriptionAssignment_04362); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2203:1: rule__BusinessClassDto__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessClassDto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2207:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2208:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2208:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2209:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassDtoAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassDto__NameAssignment_24393); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2218:1: rule__BusinessClassDto__BaseAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__BusinessClassDto__BaseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2222:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2223:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2223:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2224:1: ( RULE_ID )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getBaseExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2225:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2226:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassDtoAccess().getBaseExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassDto__BaseAssignment_44428); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2237:1: rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 : ( ruleBusinessClassPropertyReference ) ;
    public final void rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2241:1: ( ( ruleBusinessClassPropertyReference ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2242:1: ( ruleBusinessClassPropertyReference )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2242:1: ( ruleBusinessClassPropertyReference )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2243:1: ruleBusinessClassPropertyReference
            {
             before(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesBusinessClassPropertyReferenceParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_ruleBusinessClassPropertyReference_in_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_14463);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2252:1: rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 : ( ruleBusinessClassAssociationRoleReference ) ;
    public final void rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2256:1: ( ( ruleBusinessClassAssociationRoleReference ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2257:1: ( ruleBusinessClassAssociationRoleReference )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2257:1: ( ruleBusinessClassAssociationRoleReference )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2258:1: ruleBusinessClassAssociationRoleReference
            {
             before(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesBusinessClassAssociationRoleReferenceParserRuleCall_5_1_2_2_0()); 
            pushFollow(FOLLOW_ruleBusinessClassAssociationRoleReference_in_rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_24494);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2267:1: rule__EnumerationDto__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__EnumerationDto__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2271:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2272:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2272:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2273:1: RULE_STRING
            {
             before(grammarAccess.getEnumerationDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnumerationDto__DescriptionAssignment_04525); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2282:1: rule__EnumerationDto__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumerationDto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2286:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2287:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2287:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2288:1: RULE_ID
            {
             before(grammarAccess.getEnumerationDtoAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationDto__NameAssignment_24556); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2297:1: rule__EnumerationDto__BaseAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__EnumerationDto__BaseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2301:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2302:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2302:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2303:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumerationDtoAccess().getBaseExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2304:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2305:1: RULE_ID
            {
             before(grammarAccess.getEnumerationDtoAccess().getBaseExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationDto__BaseAssignment_44591); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2316:1: rule__BusinessClassPropertyReference__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BusinessClassPropertyReference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2320:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2321:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2321:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2322:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassPropertyReferenceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassPropertyReference__NameAssignment_04626); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2331:1: rule__BusinessClassAssociationRoleReference__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BusinessClassAssociationRoleReference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2335:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2336:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2336:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2337:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassAssociationRoleReference__NameAssignment_04657); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2346:1: rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2350:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2351:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2351:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2352:1: ( RULE_ID )
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeDtoCrossReference_2_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2353:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2354:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeDtoIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_24692); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2365:1: rule__ListDto__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ListDto__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2369:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2370:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2370:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2371:1: RULE_STRING
            {
             before(grammarAccess.getListDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ListDto__DescriptionAssignment_04727); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2380:1: rule__ListDto__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ListDto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2384:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2385:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2385:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2386:1: RULE_ID
            {
             before(grammarAccess.getListDtoAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ListDto__NameAssignment_24758); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2395:1: rule__ListDto__BaseDtoAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ListDto__BaseDtoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2399:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2400:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2400:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2401:1: ( RULE_ID )
            {
             before(grammarAccess.getListDtoAccess().getBaseDtoDtoCrossReference_4_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2402:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2403:1: RULE_ID
            {
             before(grammarAccess.getListDtoAccess().getBaseDtoDtoIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ListDto__BaseDtoAssignment_44793); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2414:1: rule__CustomDto__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__CustomDto__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2418:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2419:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2419:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2420:1: RULE_STRING
            {
             before(grammarAccess.getCustomDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CustomDto__DescriptionAssignment_04828); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2429:1: rule__CustomDto__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CustomDto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2433:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2434:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2434:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2435:1: RULE_ID
            {
             before(grammarAccess.getCustomDtoAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomDto__NameAssignment_24859); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2444:1: rule__CustomDto__PropertiesAssignment_4 : ( ruleDtoProperty ) ;
    public final void rule__CustomDto__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2448:1: ( ( ruleDtoProperty ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2449:1: ( ruleDtoProperty )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2449:1: ( ruleDtoProperty )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2450:1: ruleDtoProperty
            {
             before(grammarAccess.getCustomDtoAccess().getPropertiesDtoPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDtoProperty_in_rule__CustomDto__PropertiesAssignment_44890);
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2459:1: rule__DtoBooleanProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoBooleanProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2463:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2464:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2464:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2465:1: RULE_STRING
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoBooleanProperty__DescriptionAssignment_04921); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2474:1: rule__DtoBooleanProperty__DataTypeAssignment_1 : ( ( 'boolean' ) ) ;
    public final void rule__DtoBooleanProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2478:1: ( ( ( 'boolean' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2479:1: ( ( 'boolean' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2479:1: ( ( 'boolean' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2480:1: ( 'boolean' )
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeBooleanKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2481:1: ( 'boolean' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2482:1: 'boolean'
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeBooleanKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__DtoBooleanProperty__DataTypeAssignment_14957); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2497:1: rule__DtoBooleanProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoBooleanProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2501:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2502:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2502:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2503:1: RULE_ID
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoBooleanProperty__NameAssignment_24996); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2512:1: rule__DtoStringProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoStringProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2516:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2517:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2517:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2518:1: RULE_STRING
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoStringProperty__DescriptionAssignment_05027); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2527:1: rule__DtoStringProperty__DataTypeAssignment_1 : ( ( 'string' ) ) ;
    public final void rule__DtoStringProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2531:1: ( ( ( 'string' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2532:1: ( ( 'string' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2532:1: ( ( 'string' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2533:1: ( 'string' )
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDataTypeStringKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2534:1: ( 'string' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2535:1: 'string'
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDataTypeStringKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__DtoStringProperty__DataTypeAssignment_15063); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2550:1: rule__DtoStringProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoStringProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2554:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2555:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2555:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2556:1: RULE_ID
            {
             before(grammarAccess.getDtoStringPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoStringProperty__NameAssignment_25102); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2565:1: rule__DtoDateTimeProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoDateTimeProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2569:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2570:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2570:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2571:1: RULE_STRING
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoDateTimeProperty__DescriptionAssignment_05133); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2580:1: rule__DtoDateTimeProperty__DataTypeAssignment_1 : ( ( 'datetime' ) ) ;
    public final void rule__DtoDateTimeProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2584:1: ( ( ( 'datetime' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2585:1: ( ( 'datetime' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2585:1: ( ( 'datetime' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2586:1: ( 'datetime' )
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2587:1: ( 'datetime' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2588:1: 'datetime'
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__DtoDateTimeProperty__DataTypeAssignment_15169); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2603:1: rule__DtoDateTimeProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoDateTimeProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2607:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2608:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2608:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2609:1: RULE_ID
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoDateTimeProperty__NameAssignment_25208); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2618:1: rule__DtoIntegerProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoIntegerProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2622:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2623:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2623:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2624:1: RULE_STRING
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoIntegerProperty__DescriptionAssignment_05239); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2633:1: rule__DtoIntegerProperty__DataTypeAssignment_1 : ( ( 'integer' ) ) ;
    public final void rule__DtoIntegerProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2637:1: ( ( ( 'integer' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2638:1: ( ( 'integer' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2638:1: ( ( 'integer' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2639:1: ( 'integer' )
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2640:1: ( 'integer' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2641:1: 'integer'
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__DtoIntegerProperty__DataTypeAssignment_15275); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2656:1: rule__DtoIntegerProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoIntegerProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2660:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2661:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2661:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2662:1: RULE_ID
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoIntegerProperty__NameAssignment_25314); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2671:1: rule__DtoDecimalProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoDecimalProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2675:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2676:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2676:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2677:1: RULE_STRING
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoDecimalProperty__DescriptionAssignment_05345); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2686:1: rule__DtoDecimalProperty__DataTypeAssignment_1 : ( ( 'decimal' ) ) ;
    public final void rule__DtoDecimalProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2690:1: ( ( ( 'decimal' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2691:1: ( ( 'decimal' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2691:1: ( ( 'decimal' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2692:1: ( 'decimal' )
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2693:1: ( 'decimal' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2694:1: 'decimal'
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__DtoDecimalProperty__DataTypeAssignment_15381); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2709:1: rule__DtoDecimalProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoDecimalProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2713:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2714:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2714:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2715:1: RULE_ID
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoDecimalProperty__NameAssignment_25420); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2724:1: rule__DtoEnumerationProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoEnumerationProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2728:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2729:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2729:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2730:1: RULE_STRING
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoEnumerationProperty__DescriptionAssignment_05451); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2739:1: rule__DtoEnumerationProperty__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DtoEnumerationProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2743:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2744:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2744:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2745:1: ( RULE_ID )
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getTypeEnumerationDtoCrossReference_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2746:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2747:1: RULE_ID
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getTypeEnumerationDtoIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoEnumerationProperty__TypeAssignment_15486); 
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2758:1: rule__DtoEnumerationProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoEnumerationProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2762:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2763:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2763:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2764:1: RULE_ID
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoEnumerationProperty__NameAssignment_25521); 
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
    public static final BitSet FOLLOW_11_in_rule__BusinessClassDto__Alternatives_51148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1__0_in_rule__BusinessClassDto__Alternatives_51167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoBooleanProperty_in_rule__DtoProperty__Alternatives_01200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoStringProperty_in_rule__DtoProperty__Alternatives_01217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoDateTimeProperty_in_rule__DtoProperty__Alternatives_01234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoIntegerProperty_in_rule__DtoProperty__Alternatives_01251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoDecimalProperty_in_rule__DtoProperty__Alternatives_01268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoEnumerationProperty_in_rule__DtoProperty__Alternatives_01285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__DescriptionAssignment_0_in_rule__DataContractModel__Group__01319 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__1_in_rule__DataContractModel__Group__01329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DataContractModel__Group__11358 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__2_in_rule__DataContractModel__Group__11368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__NameAssignment_2_in_rule__DataContractModel__Group__21396 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__3_in_rule__DataContractModel__Group__21405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__DataContractModel__Group__31434 = new BitSet(new long[]{0x000000000150A012L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__4_in_rule__DataContractModel__Group__31444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__ExternalReferencesAssignment_4_in_rule__DataContractModel__Group__41472 = new BitSet(new long[]{0x000000000150A012L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__5_in_rule__DataContractModel__Group__41482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__Alternatives_5_in_rule__DataContractModel__Group__51510 = new BitSet(new long[]{0x0000000001508012L});
    public static final BitSet FOLLOW_rule__ExternalReference__DescriptionAssignment_0_in_rule__ExternalReference__Group__01557 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__1_in_rule__ExternalReference__Group__01567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ExternalReference__Group__11596 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__2_in_rule__ExternalReference__Group__11606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__ModelnameAssignment_2_in_rule__ExternalReference__Group__21634 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__3_in_rule__ExternalReference__Group__21643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ExternalReference__Group__31672 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__4_in_rule__ExternalReference__Group__31682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__NameAssignment_4_in_rule__ExternalReference__Group__41710 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__5_in_rule__ExternalReference__Group__41719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ExternalReference__Group__51748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__DescriptionAssignment_0_in_rule__BusinessClassDto__Group__01795 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__1_in_rule__BusinessClassDto__Group__01805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BusinessClassDto__Group__11834 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__2_in_rule__BusinessClassDto__Group__11844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__NameAssignment_2_in_rule__BusinessClassDto__Group__21872 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__3_in_rule__BusinessClassDto__Group__21881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BusinessClassDto__Group__31910 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__4_in_rule__BusinessClassDto__Group__31920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__BaseAssignment_4_in_rule__BusinessClassDto__Group__41948 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__5_in_rule__BusinessClassDto__Group__41957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Alternatives_5_in_rule__BusinessClassDto__Group__51985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BusinessClassDto__Group_5_1__02032 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1__1_in_rule__BusinessClassDto__Group_5_1__02042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1_in_rule__BusinessClassDto__Group_5_1__12072 = new BitSet(new long[]{0x00000000000C0020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1_in_rule__BusinessClassDto__Group_5_1__12084 = new BitSet(new long[]{0x00000000000C0020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1__2_in_rule__BusinessClassDto__Group_5_1__12096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1_2__0_in_rule__BusinessClassDto__Group_5_1__22124 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1__3_in_rule__BusinessClassDto__Group_5_1__22134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BusinessClassDto__Group_5_1__32163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BusinessClassDto__Group_5_1_2__02207 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1_2__1_in_rule__BusinessClassDto__Group_5_1_2__02217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BusinessClassDto__Group_5_1_2__12246 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1_2__2_in_rule__BusinessClassDto__Group_5_1_2__12256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2_in_rule__BusinessClassDto__Group_5_1_2__22286 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2_in_rule__BusinessClassDto__Group_5_1_2__22298 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1_2__3_in_rule__BusinessClassDto__Group_5_1_2__22310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BusinessClassDto__Group_5_1_2__32339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDto__DescriptionAssignment_0_in_rule__EnumerationDto__Group__02382 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__1_in_rule__EnumerationDto__Group__02392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumerationDto__Group__12421 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__2_in_rule__EnumerationDto__Group__12431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDto__NameAssignment_2_in_rule__EnumerationDto__Group__22459 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__3_in_rule__EnumerationDto__Group__22468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EnumerationDto__Group__32497 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__4_in_rule__EnumerationDto__Group__32507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDto__BaseAssignment_4_in_rule__EnumerationDto__Group__42535 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__5_in_rule__EnumerationDto__Group__42544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__EnumerationDto__Group__52573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassPropertyReference__NameAssignment_0_in_rule__BusinessClassPropertyReference__Group__02620 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__BusinessClassPropertyReference__Group__1_in_rule__BusinessClassPropertyReference__Group__02629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BusinessClassPropertyReference__Group__12658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__NameAssignment_0_in_rule__BusinessClassAssociationRoleReference__Group__02697 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__Group__1_in_rule__BusinessClassAssociationRoleReference__Group__02706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BusinessClassAssociationRoleReference__Group__12735 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__Group__2_in_rule__BusinessClassAssociationRoleReference__Group__12745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2_in_rule__BusinessClassAssociationRoleReference__Group__22773 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__Group__3_in_rule__BusinessClassAssociationRoleReference__Group__22782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BusinessClassAssociationRoleReference__Group__32811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListDto__DescriptionAssignment_0_in_rule__ListDto__Group__02854 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ListDto__Group__1_in_rule__ListDto__Group__02864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ListDto__Group__12893 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ListDto__Group__2_in_rule__ListDto__Group__12903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListDto__NameAssignment_2_in_rule__ListDto__Group__22931 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ListDto__Group__3_in_rule__ListDto__Group__22940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ListDto__Group__32969 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ListDto__Group__4_in_rule__ListDto__Group__32979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListDto__BaseDtoAssignment_4_in_rule__ListDto__Group__43007 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ListDto__Group__5_in_rule__ListDto__Group__43016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ListDto__Group__53045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomDto__DescriptionAssignment_0_in_rule__CustomDto__Group__03092 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__1_in_rule__CustomDto__Group__03102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CustomDto__Group__13131 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__2_in_rule__CustomDto__Group__13141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomDto__NameAssignment_2_in_rule__CustomDto__Group__23169 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__3_in_rule__CustomDto__Group__23178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CustomDto__Group__33207 = new BitSet(new long[]{0x000000003E000030L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__4_in_rule__CustomDto__Group__33217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomDto__PropertiesAssignment_4_in_rule__CustomDto__Group__43247 = new BitSet(new long[]{0x000000003E040030L});
    public static final BitSet FOLLOW_rule__CustomDto__PropertiesAssignment_4_in_rule__CustomDto__Group__43259 = new BitSet(new long[]{0x000000003E040030L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__5_in_rule__CustomDto__Group__43271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CustomDto__Group__53300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoProperty__Alternatives_0_in_rule__DtoProperty__Group__03347 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__DtoProperty__Group__1_in_rule__DtoProperty__Group__03356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__DtoProperty__Group__13385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__DescriptionAssignment_0_in_rule__DtoBooleanProperty__Group__03424 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__Group__1_in_rule__DtoBooleanProperty__Group__03434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__DataTypeAssignment_1_in_rule__DtoBooleanProperty__Group__13462 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__Group__2_in_rule__DtoBooleanProperty__Group__13471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__NameAssignment_2_in_rule__DtoBooleanProperty__Group__23499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__DescriptionAssignment_0_in_rule__DtoStringProperty__Group__03539 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__Group__1_in_rule__DtoStringProperty__Group__03549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__DataTypeAssignment_1_in_rule__DtoStringProperty__Group__13577 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__Group__2_in_rule__DtoStringProperty__Group__13586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__NameAssignment_2_in_rule__DtoStringProperty__Group__23614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__DescriptionAssignment_0_in_rule__DtoDateTimeProperty__Group__03654 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__Group__1_in_rule__DtoDateTimeProperty__Group__03664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__DataTypeAssignment_1_in_rule__DtoDateTimeProperty__Group__13692 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__Group__2_in_rule__DtoDateTimeProperty__Group__13701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__NameAssignment_2_in_rule__DtoDateTimeProperty__Group__23729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__DescriptionAssignment_0_in_rule__DtoIntegerProperty__Group__03769 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__Group__1_in_rule__DtoIntegerProperty__Group__03779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__DataTypeAssignment_1_in_rule__DtoIntegerProperty__Group__13807 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__Group__2_in_rule__DtoIntegerProperty__Group__13816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__NameAssignment_2_in_rule__DtoIntegerProperty__Group__23844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__DescriptionAssignment_0_in_rule__DtoDecimalProperty__Group__03884 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__Group__1_in_rule__DtoDecimalProperty__Group__03894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__DataTypeAssignment_1_in_rule__DtoDecimalProperty__Group__13922 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__Group__2_in_rule__DtoDecimalProperty__Group__13931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__NameAssignment_2_in_rule__DtoDecimalProperty__Group__23959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__DescriptionAssignment_0_in_rule__DtoEnumerationProperty__Group__03999 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__Group__1_in_rule__DtoEnumerationProperty__Group__04009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__TypeAssignment_1_in_rule__DtoEnumerationProperty__Group__14037 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__Group__2_in_rule__DtoEnumerationProperty__Group__14046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__NameAssignment_2_in_rule__DtoEnumerationProperty__Group__24074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DataContractModel__DescriptionAssignment_04114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataContractModel__NameAssignment_24145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_rule__DataContractModel__ExternalReferencesAssignment_44176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDto_in_rule__DataContractModel__DtosAssignment_5_04207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDto_in_rule__DataContractModel__EnumerationsAssignment_5_14238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ExternalReference__DescriptionAssignment_04269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalReference__ModelnameAssignment_24300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalReference__NameAssignment_44331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BusinessClassDto__DescriptionAssignment_04362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassDto__NameAssignment_24393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassDto__BaseAssignment_44428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassPropertyReference_in_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_14463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassAssociationRoleReference_in_rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_24494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnumerationDto__DescriptionAssignment_04525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationDto__NameAssignment_24556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationDto__BaseAssignment_44591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassPropertyReference__NameAssignment_04626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassAssociationRoleReference__NameAssignment_04657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_24692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ListDto__DescriptionAssignment_04727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ListDto__NameAssignment_24758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ListDto__BaseDtoAssignment_44793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomDto__DescriptionAssignment_04828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomDto__NameAssignment_24859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoProperty_in_rule__CustomDto__PropertiesAssignment_44890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoBooleanProperty__DescriptionAssignment_04921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DtoBooleanProperty__DataTypeAssignment_14957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoBooleanProperty__NameAssignment_24996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoStringProperty__DescriptionAssignment_05027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DtoStringProperty__DataTypeAssignment_15063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoStringProperty__NameAssignment_25102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoDateTimeProperty__DescriptionAssignment_05133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DtoDateTimeProperty__DataTypeAssignment_15169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoDateTimeProperty__NameAssignment_25208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoIntegerProperty__DescriptionAssignment_05239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DtoIntegerProperty__DataTypeAssignment_15275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoIntegerProperty__NameAssignment_25314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoDecimalProperty__DescriptionAssignment_05345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DtoDecimalProperty__DataTypeAssignment_15381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoDecimalProperty__NameAssignment_25420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoEnumerationProperty__DescriptionAssignment_05451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoEnumerationProperty__TypeAssignment_15486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoEnumerationProperty__NameAssignment_25521 = new BitSet(new long[]{0x0000000000000002L});

}