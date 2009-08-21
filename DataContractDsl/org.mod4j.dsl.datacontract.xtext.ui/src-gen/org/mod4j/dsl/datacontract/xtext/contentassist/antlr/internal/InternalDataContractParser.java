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




    // $ANTLR start entryRuleDataContractModel
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:55:1: entryRuleDataContractModel : ruleDataContractModel EOF ;
    public final void entryRuleDataContractModel() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:55:28: ( ruleDataContractModel EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:56:1: ruleDataContractModel EOF
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:63:1: ruleDataContractModel : ( ( rule__DataContractModel__Group__0 ) ) ;
    public final void ruleDataContractModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:67:2: ( ( ( rule__DataContractModel__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:68:1: ( ( rule__DataContractModel__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:68:1: ( ( rule__DataContractModel__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:69:1: ( rule__DataContractModel__Group__0 )
            {
             before(grammarAccess.getDataContractModelAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:70:1: ( rule__DataContractModel__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:70:2: rule__DataContractModel__Group__0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:82:1: entryRuleDto : ruleDto EOF ;
    public final void entryRuleDto() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:82:14: ( ruleDto EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:83:1: ruleDto EOF
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:90:1: ruleDto : ( ( rule__Dto__Alternatives ) ) ;
    public final void ruleDto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:94:2: ( ( ( rule__Dto__Alternatives ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:95:1: ( ( rule__Dto__Alternatives ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:95:1: ( ( rule__Dto__Alternatives ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:96:1: ( rule__Dto__Alternatives )
            {
             before(grammarAccess.getDtoAccess().getAlternatives()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:97:1: ( rule__Dto__Alternatives )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:97:2: rule__Dto__Alternatives
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:109:1: entryRuleExternalReference : ruleExternalReference EOF ;
    public final void entryRuleExternalReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:109:28: ( ruleExternalReference EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:110:1: ruleExternalReference EOF
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:117:1: ruleExternalReference : ( ( rule__ExternalReference__Group__0 ) ) ;
    public final void ruleExternalReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:121:2: ( ( ( rule__ExternalReference__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:122:1: ( ( rule__ExternalReference__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:122:1: ( ( rule__ExternalReference__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:123:1: ( rule__ExternalReference__Group__0 )
            {
             before(grammarAccess.getExternalReferenceAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:124:1: ( rule__ExternalReference__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:124:2: rule__ExternalReference__Group__0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:136:1: entryRuleBusinessClassDto : ruleBusinessClassDto EOF ;
    public final void entryRuleBusinessClassDto() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:136:27: ( ruleBusinessClassDto EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:137:1: ruleBusinessClassDto EOF
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:144:1: ruleBusinessClassDto : ( ( rule__BusinessClassDto__Group__0 ) ) ;
    public final void ruleBusinessClassDto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:148:2: ( ( ( rule__BusinessClassDto__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:149:1: ( ( rule__BusinessClassDto__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:149:1: ( ( rule__BusinessClassDto__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:150:1: ( rule__BusinessClassDto__Group__0 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:151:1: ( rule__BusinessClassDto__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:151:2: rule__BusinessClassDto__Group__0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:163:1: entryRuleEnumerationDto : ruleEnumerationDto EOF ;
    public final void entryRuleEnumerationDto() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:163:25: ( ruleEnumerationDto EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:164:1: ruleEnumerationDto EOF
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:171:1: ruleEnumerationDto : ( ( rule__EnumerationDto__Group__0 ) ) ;
    public final void ruleEnumerationDto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:175:2: ( ( ( rule__EnumerationDto__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:176:1: ( ( rule__EnumerationDto__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:176:1: ( ( rule__EnumerationDto__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:177:1: ( rule__EnumerationDto__Group__0 )
            {
             before(grammarAccess.getEnumerationDtoAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:178:1: ( rule__EnumerationDto__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:178:2: rule__EnumerationDto__Group__0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:190:1: entryRuleBusinessClassPropertyReference : ruleBusinessClassPropertyReference EOF ;
    public final void entryRuleBusinessClassPropertyReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:190:41: ( ruleBusinessClassPropertyReference EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:191:1: ruleBusinessClassPropertyReference EOF
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:198:1: ruleBusinessClassPropertyReference : ( ( rule__BusinessClassPropertyReference__Group__0 ) ) ;
    public final void ruleBusinessClassPropertyReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:202:2: ( ( ( rule__BusinessClassPropertyReference__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:203:1: ( ( rule__BusinessClassPropertyReference__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:203:1: ( ( rule__BusinessClassPropertyReference__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:204:1: ( rule__BusinessClassPropertyReference__Group__0 )
            {
             before(grammarAccess.getBusinessClassPropertyReferenceAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:205:1: ( rule__BusinessClassPropertyReference__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:205:2: rule__BusinessClassPropertyReference__Group__0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:217:1: entryRuleBusinessClassAssociationRoleReference : ruleBusinessClassAssociationRoleReference EOF ;
    public final void entryRuleBusinessClassAssociationRoleReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:217:48: ( ruleBusinessClassAssociationRoleReference EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:218:1: ruleBusinessClassAssociationRoleReference EOF
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:225:1: ruleBusinessClassAssociationRoleReference : ( ( rule__BusinessClassAssociationRoleReference__Group__0 ) ) ;
    public final void ruleBusinessClassAssociationRoleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:229:2: ( ( ( rule__BusinessClassAssociationRoleReference__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:230:1: ( ( rule__BusinessClassAssociationRoleReference__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:230:1: ( ( rule__BusinessClassAssociationRoleReference__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:231:1: ( rule__BusinessClassAssociationRoleReference__Group__0 )
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:232:1: ( rule__BusinessClassAssociationRoleReference__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:232:2: rule__BusinessClassAssociationRoleReference__Group__0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:244:1: entryRuleListDto : ruleListDto EOF ;
    public final void entryRuleListDto() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:244:18: ( ruleListDto EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:245:1: ruleListDto EOF
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:252:1: ruleListDto : ( ( rule__ListDto__Group__0 ) ) ;
    public final void ruleListDto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:256:2: ( ( ( rule__ListDto__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:257:1: ( ( rule__ListDto__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:257:1: ( ( rule__ListDto__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:258:1: ( rule__ListDto__Group__0 )
            {
             before(grammarAccess.getListDtoAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:259:1: ( rule__ListDto__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:259:2: rule__ListDto__Group__0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:271:1: entryRuleCustomDto : ruleCustomDto EOF ;
    public final void entryRuleCustomDto() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:271:20: ( ruleCustomDto EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:272:1: ruleCustomDto EOF
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:279:1: ruleCustomDto : ( ( rule__CustomDto__Group__0 ) ) ;
    public final void ruleCustomDto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:283:2: ( ( ( rule__CustomDto__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:284:1: ( ( rule__CustomDto__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:284:1: ( ( rule__CustomDto__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:285:1: ( rule__CustomDto__Group__0 )
            {
             before(grammarAccess.getCustomDtoAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:286:1: ( rule__CustomDto__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:286:2: rule__CustomDto__Group__0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:298:1: entryRuleDtoProperty : ruleDtoProperty EOF ;
    public final void entryRuleDtoProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:298:22: ( ruleDtoProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:299:1: ruleDtoProperty EOF
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:306:1: ruleDtoProperty : ( ( rule__DtoProperty__Group__0 ) ) ;
    public final void ruleDtoProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:310:2: ( ( ( rule__DtoProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:311:1: ( ( rule__DtoProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:311:1: ( ( rule__DtoProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:312:1: ( rule__DtoProperty__Group__0 )
            {
             before(grammarAccess.getDtoPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:313:1: ( rule__DtoProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:313:2: rule__DtoProperty__Group__0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:325:1: entryRuleDtoBooleanProperty : ruleDtoBooleanProperty EOF ;
    public final void entryRuleDtoBooleanProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:325:29: ( ruleDtoBooleanProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:326:1: ruleDtoBooleanProperty EOF
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:333:1: ruleDtoBooleanProperty : ( ( rule__DtoBooleanProperty__Group__0 ) ) ;
    public final void ruleDtoBooleanProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:337:2: ( ( ( rule__DtoBooleanProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:338:1: ( ( rule__DtoBooleanProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:338:1: ( ( rule__DtoBooleanProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:339:1: ( rule__DtoBooleanProperty__Group__0 )
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:340:1: ( rule__DtoBooleanProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:340:2: rule__DtoBooleanProperty__Group__0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:352:1: entryRuleDtoStringProperty : ruleDtoStringProperty EOF ;
    public final void entryRuleDtoStringProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:352:28: ( ruleDtoStringProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:353:1: ruleDtoStringProperty EOF
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:360:1: ruleDtoStringProperty : ( ( rule__DtoStringProperty__Group__0 ) ) ;
    public final void ruleDtoStringProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:364:2: ( ( ( rule__DtoStringProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:365:1: ( ( rule__DtoStringProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:365:1: ( ( rule__DtoStringProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:366:1: ( rule__DtoStringProperty__Group__0 )
            {
             before(grammarAccess.getDtoStringPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:367:1: ( rule__DtoStringProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:367:2: rule__DtoStringProperty__Group__0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:379:1: entryRuleDtoDateTimeProperty : ruleDtoDateTimeProperty EOF ;
    public final void entryRuleDtoDateTimeProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:379:30: ( ruleDtoDateTimeProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:380:1: ruleDtoDateTimeProperty EOF
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:387:1: ruleDtoDateTimeProperty : ( ( rule__DtoDateTimeProperty__Group__0 ) ) ;
    public final void ruleDtoDateTimeProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:391:2: ( ( ( rule__DtoDateTimeProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:392:1: ( ( rule__DtoDateTimeProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:392:1: ( ( rule__DtoDateTimeProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:393:1: ( rule__DtoDateTimeProperty__Group__0 )
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:394:1: ( rule__DtoDateTimeProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:394:2: rule__DtoDateTimeProperty__Group__0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:406:1: entryRuleDtoIntegerProperty : ruleDtoIntegerProperty EOF ;
    public final void entryRuleDtoIntegerProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:406:29: ( ruleDtoIntegerProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:407:1: ruleDtoIntegerProperty EOF
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:414:1: ruleDtoIntegerProperty : ( ( rule__DtoIntegerProperty__Group__0 ) ) ;
    public final void ruleDtoIntegerProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:418:2: ( ( ( rule__DtoIntegerProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:419:1: ( ( rule__DtoIntegerProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:419:1: ( ( rule__DtoIntegerProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:420:1: ( rule__DtoIntegerProperty__Group__0 )
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:421:1: ( rule__DtoIntegerProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:421:2: rule__DtoIntegerProperty__Group__0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:433:1: entryRuleDtoDecimalProperty : ruleDtoDecimalProperty EOF ;
    public final void entryRuleDtoDecimalProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:433:29: ( ruleDtoDecimalProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:434:1: ruleDtoDecimalProperty EOF
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:441:1: ruleDtoDecimalProperty : ( ( rule__DtoDecimalProperty__Group__0 ) ) ;
    public final void ruleDtoDecimalProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:445:2: ( ( ( rule__DtoDecimalProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:446:1: ( ( rule__DtoDecimalProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:446:1: ( ( rule__DtoDecimalProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:447:1: ( rule__DtoDecimalProperty__Group__0 )
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:448:1: ( rule__DtoDecimalProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:448:2: rule__DtoDecimalProperty__Group__0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:460:1: entryRuleDtoEnumerationProperty : ruleDtoEnumerationProperty EOF ;
    public final void entryRuleDtoEnumerationProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:460:33: ( ruleDtoEnumerationProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:461:1: ruleDtoEnumerationProperty EOF
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:468:1: ruleDtoEnumerationProperty : ( ( rule__DtoEnumerationProperty__Group__0 ) ) ;
    public final void ruleDtoEnumerationProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:472:2: ( ( ( rule__DtoEnumerationProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:473:1: ( ( rule__DtoEnumerationProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:473:1: ( ( rule__DtoEnumerationProperty__Group__0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:474:1: ( rule__DtoEnumerationProperty__Group__0 )
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:475:1: ( rule__DtoEnumerationProperty__Group__0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:475:2: rule__DtoEnumerationProperty__Group__0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:487:1: rule__DataContractModel__Alternatives_5 : ( ( ( rule__DataContractModel__DtosAssignment_5_0 ) ) | ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) ) );
    public final void rule__DataContractModel__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:491:1: ( ( ( rule__DataContractModel__DtosAssignment_5_0 ) ) | ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) ) )
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
                        new NoViableAltException("487:1: rule__DataContractModel__Alternatives_5 : ( ( ( rule__DataContractModel__DtosAssignment_5_0 ) ) | ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) ) );", 1, 1, input);

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
                    new NoViableAltException("487:1: rule__DataContractModel__Alternatives_5 : ( ( ( rule__DataContractModel__DtosAssignment_5_0 ) ) | ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:492:1: ( ( rule__DataContractModel__DtosAssignment_5_0 ) )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:492:1: ( ( rule__DataContractModel__DtosAssignment_5_0 ) )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:493:1: ( rule__DataContractModel__DtosAssignment_5_0 )
                    {
                     before(grammarAccess.getDataContractModelAccess().getDtosAssignment_5_0()); 
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:494:1: ( rule__DataContractModel__DtosAssignment_5_0 )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:494:2: rule__DataContractModel__DtosAssignment_5_0
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
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:498:6: ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:498:6: ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:499:1: ( rule__DataContractModel__EnumerationsAssignment_5_1 )
                    {
                     before(grammarAccess.getDataContractModelAccess().getEnumerationsAssignment_5_1()); 
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:500:1: ( rule__DataContractModel__EnumerationsAssignment_5_1 )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:500:2: rule__DataContractModel__EnumerationsAssignment_5_1
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:509:1: rule__Dto__Alternatives : ( ( ruleBusinessClassDto ) | ( ruleListDto ) | ( ruleCustomDto ) );
    public final void rule__Dto__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:513:1: ( ( ruleBusinessClassDto ) | ( ruleListDto ) | ( ruleCustomDto ) )
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
                        new NoViableAltException("509:1: rule__Dto__Alternatives : ( ( ruleBusinessClassDto ) | ( ruleListDto ) | ( ruleCustomDto ) );", 2, 1, input);

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
                    new NoViableAltException("509:1: rule__Dto__Alternatives : ( ( ruleBusinessClassDto ) | ( ruleListDto ) | ( ruleCustomDto ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:514:1: ( ruleBusinessClassDto )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:514:1: ( ruleBusinessClassDto )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:515:1: ruleBusinessClassDto
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
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:520:6: ( ruleListDto )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:520:6: ( ruleListDto )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:521:1: ruleListDto
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
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:526:6: ( ruleCustomDto )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:526:6: ( ruleCustomDto )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:527:1: ruleCustomDto
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:537:1: rule__DtoProperty__Alternatives_0 : ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) );
    public final void rule__DtoProperty__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:541:1: ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) )
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
                        new NoViableAltException("537:1: rule__DtoProperty__Alternatives_0 : ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) );", 3, 1, input);

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
                    new NoViableAltException("537:1: rule__DtoProperty__Alternatives_0 : ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:542:1: ( ruleDtoBooleanProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:542:1: ( ruleDtoBooleanProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:543:1: ruleDtoBooleanProperty
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
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:548:6: ( ruleDtoStringProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:548:6: ( ruleDtoStringProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:549:1: ruleDtoStringProperty
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
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:554:6: ( ruleDtoDateTimeProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:554:6: ( ruleDtoDateTimeProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:555:1: ruleDtoDateTimeProperty
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
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:560:6: ( ruleDtoIntegerProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:560:6: ( ruleDtoIntegerProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:561:1: ruleDtoIntegerProperty
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
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:566:6: ( ruleDtoDecimalProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:566:6: ( ruleDtoDecimalProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:567:1: ruleDtoDecimalProperty
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
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:572:6: ( ruleDtoEnumerationProperty )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:572:6: ( ruleDtoEnumerationProperty )
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:573:1: ruleDtoEnumerationProperty
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:585:1: rule__DataContractModel__Group__0 : ( ( rule__DataContractModel__DescriptionAssignment_0 )? ) rule__DataContractModel__Group__1 ;
    public final void rule__DataContractModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:589:1: ( ( ( rule__DataContractModel__DescriptionAssignment_0 )? ) rule__DataContractModel__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:590:1: ( ( rule__DataContractModel__DescriptionAssignment_0 )? ) rule__DataContractModel__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:590:1: ( ( rule__DataContractModel__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:591:1: ( rule__DataContractModel__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDataContractModelAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:592:1: ( rule__DataContractModel__DescriptionAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:592:2: rule__DataContractModel__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:603:1: rule__DataContractModel__Group__1 : ( 'datacontract' ) rule__DataContractModel__Group__2 ;
    public final void rule__DataContractModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:607:1: ( ( 'datacontract' ) rule__DataContractModel__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:608:1: ( 'datacontract' ) rule__DataContractModel__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:608:1: ( 'datacontract' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:609:1: 'datacontract'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:623:1: rule__DataContractModel__Group__2 : ( ( rule__DataContractModel__NameAssignment_2 ) ) rule__DataContractModel__Group__3 ;
    public final void rule__DataContractModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:627:1: ( ( ( rule__DataContractModel__NameAssignment_2 ) ) rule__DataContractModel__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:628:1: ( ( rule__DataContractModel__NameAssignment_2 ) ) rule__DataContractModel__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:628:1: ( ( rule__DataContractModel__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:629:1: ( rule__DataContractModel__NameAssignment_2 )
            {
             before(grammarAccess.getDataContractModelAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:630:1: ( rule__DataContractModel__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:630:2: rule__DataContractModel__NameAssignment_2
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:641:1: rule__DataContractModel__Group__3 : ( ';' ) rule__DataContractModel__Group__4 ;
    public final void rule__DataContractModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:645:1: ( ( ';' ) rule__DataContractModel__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:646:1: ( ';' ) rule__DataContractModel__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:646:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:647:1: ';'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:661:1: rule__DataContractModel__Group__4 : ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* ) rule__DataContractModel__Group__5 ;
    public final void rule__DataContractModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:665:1: ( ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* ) rule__DataContractModel__Group__5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:666:1: ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* ) rule__DataContractModel__Group__5
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:666:1: ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:667:1: ( rule__DataContractModel__ExternalReferencesAssignment_4 )*
            {
             before(grammarAccess.getDataContractModelAccess().getExternalReferencesAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:668:1: ( rule__DataContractModel__ExternalReferencesAssignment_4 )*
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
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:668:2: rule__DataContractModel__ExternalReferencesAssignment_4
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:679:1: rule__DataContractModel__Group__5 : ( ( rule__DataContractModel__Alternatives_5 )* ) ;
    public final void rule__DataContractModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:683:1: ( ( ( rule__DataContractModel__Alternatives_5 )* ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:684:1: ( ( rule__DataContractModel__Alternatives_5 )* )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:684:1: ( ( rule__DataContractModel__Alternatives_5 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:685:1: ( rule__DataContractModel__Alternatives_5 )*
            {
             before(grammarAccess.getDataContractModelAccess().getAlternatives_5()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:686:1: ( rule__DataContractModel__Alternatives_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING||LA6_0==15||LA6_0==20||LA6_0==22||LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:686:2: rule__DataContractModel__Alternatives_5
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:708:1: rule__ExternalReference__Group__0 : ( ( rule__ExternalReference__DescriptionAssignment_0 )? ) rule__ExternalReference__Group__1 ;
    public final void rule__ExternalReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:712:1: ( ( ( rule__ExternalReference__DescriptionAssignment_0 )? ) rule__ExternalReference__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:713:1: ( ( rule__ExternalReference__DescriptionAssignment_0 )? ) rule__ExternalReference__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:713:1: ( ( rule__ExternalReference__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:714:1: ( rule__ExternalReference__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getExternalReferenceAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:715:1: ( rule__ExternalReference__DescriptionAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:715:2: rule__ExternalReference__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:726:1: rule__ExternalReference__Group__1 : ( 'from' ) rule__ExternalReference__Group__2 ;
    public final void rule__ExternalReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:730:1: ( ( 'from' ) rule__ExternalReference__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:731:1: ( 'from' ) rule__ExternalReference__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:731:1: ( 'from' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:732:1: 'from'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:746:1: rule__ExternalReference__Group__2 : ( ( rule__ExternalReference__ModelnameAssignment_2 ) ) rule__ExternalReference__Group__3 ;
    public final void rule__ExternalReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:750:1: ( ( ( rule__ExternalReference__ModelnameAssignment_2 ) ) rule__ExternalReference__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:751:1: ( ( rule__ExternalReference__ModelnameAssignment_2 ) ) rule__ExternalReference__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:751:1: ( ( rule__ExternalReference__ModelnameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:752:1: ( rule__ExternalReference__ModelnameAssignment_2 )
            {
             before(grammarAccess.getExternalReferenceAccess().getModelnameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:753:1: ( rule__ExternalReference__ModelnameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:753:2: rule__ExternalReference__ModelnameAssignment_2
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:764:1: rule__ExternalReference__Group__3 : ( 'import' ) rule__ExternalReference__Group__4 ;
    public final void rule__ExternalReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:768:1: ( ( 'import' ) rule__ExternalReference__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:769:1: ( 'import' ) rule__ExternalReference__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:769:1: ( 'import' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:770:1: 'import'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:784:1: rule__ExternalReference__Group__4 : ( ( rule__ExternalReference__NameAssignment_4 ) ) rule__ExternalReference__Group__5 ;
    public final void rule__ExternalReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:788:1: ( ( ( rule__ExternalReference__NameAssignment_4 ) ) rule__ExternalReference__Group__5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:789:1: ( ( rule__ExternalReference__NameAssignment_4 ) ) rule__ExternalReference__Group__5
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:789:1: ( ( rule__ExternalReference__NameAssignment_4 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:790:1: ( rule__ExternalReference__NameAssignment_4 )
            {
             before(grammarAccess.getExternalReferenceAccess().getNameAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:791:1: ( rule__ExternalReference__NameAssignment_4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:791:2: rule__ExternalReference__NameAssignment_4
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:802:1: rule__ExternalReference__Group__5 : ( ';' ) ;
    public final void rule__ExternalReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:806:1: ( ( ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:807:1: ( ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:807:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:808:1: ';'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:833:1: rule__BusinessClassDto__Group__0 : ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? ) rule__BusinessClassDto__Group__1 ;
    public final void rule__BusinessClassDto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:837:1: ( ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? ) rule__BusinessClassDto__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:838:1: ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? ) rule__BusinessClassDto__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:838:1: ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:839:1: ( rule__BusinessClassDto__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBusinessClassDtoAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:840:1: ( rule__BusinessClassDto__DescriptionAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:840:2: rule__BusinessClassDto__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:851:1: rule__BusinessClassDto__Group__1 : ( 'class' ) rule__BusinessClassDto__Group__2 ;
    public final void rule__BusinessClassDto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:855:1: ( ( 'class' ) rule__BusinessClassDto__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:856:1: ( 'class' ) rule__BusinessClassDto__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:856:1: ( 'class' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:857:1: 'class'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:871:1: rule__BusinessClassDto__Group__2 : ( ( rule__BusinessClassDto__NameAssignment_2 ) ) rule__BusinessClassDto__Group__3 ;
    public final void rule__BusinessClassDto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:875:1: ( ( ( rule__BusinessClassDto__NameAssignment_2 ) ) rule__BusinessClassDto__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:876:1: ( ( rule__BusinessClassDto__NameAssignment_2 ) ) rule__BusinessClassDto__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:876:1: ( ( rule__BusinessClassDto__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:877:1: ( rule__BusinessClassDto__NameAssignment_2 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:878:1: ( rule__BusinessClassDto__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:878:2: rule__BusinessClassDto__NameAssignment_2
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:889:1: rule__BusinessClassDto__Group__3 : ( 'represents' ) rule__BusinessClassDto__Group__4 ;
    public final void rule__BusinessClassDto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:893:1: ( ( 'represents' ) rule__BusinessClassDto__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:894:1: ( 'represents' ) rule__BusinessClassDto__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:894:1: ( 'represents' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:895:1: 'represents'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:909:1: rule__BusinessClassDto__Group__4 : ( ( rule__BusinessClassDto__BaseAssignment_4 ) ) rule__BusinessClassDto__Group__5 ;
    public final void rule__BusinessClassDto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:913:1: ( ( ( rule__BusinessClassDto__BaseAssignment_4 ) ) rule__BusinessClassDto__Group__5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:914:1: ( ( rule__BusinessClassDto__BaseAssignment_4 ) ) rule__BusinessClassDto__Group__5
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:914:1: ( ( rule__BusinessClassDto__BaseAssignment_4 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:915:1: ( rule__BusinessClassDto__BaseAssignment_4 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getBaseAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:916:1: ( rule__BusinessClassDto__BaseAssignment_4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:916:2: rule__BusinessClassDto__BaseAssignment_4
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:927:1: rule__BusinessClassDto__Group__5 : ( ( rule__BusinessClassDto__Group_5__0 )? ) ;
    public final void rule__BusinessClassDto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:931:1: ( ( ( rule__BusinessClassDto__Group_5__0 )? ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:932:1: ( ( rule__BusinessClassDto__Group_5__0 )? )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:932:1: ( ( rule__BusinessClassDto__Group_5__0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:933:1: ( rule__BusinessClassDto__Group_5__0 )?
            {
             before(grammarAccess.getBusinessClassDtoAccess().getGroup_5()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:934:1: ( rule__BusinessClassDto__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:934:2: rule__BusinessClassDto__Group_5__0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:956:1: rule__BusinessClassDto__Group_5__0 : ( '[' ) rule__BusinessClassDto__Group_5__1 ;
    public final void rule__BusinessClassDto__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:960:1: ( ( '[' ) rule__BusinessClassDto__Group_5__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:961:1: ( '[' ) rule__BusinessClassDto__Group_5__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:961:1: ( '[' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:962:1: '['
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:976:1: rule__BusinessClassDto__Group_5__1 : ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )* ) ) rule__BusinessClassDto__Group_5__2 ;
    public final void rule__BusinessClassDto__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:980:1: ( ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )* ) ) rule__BusinessClassDto__Group_5__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:981:1: ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )* ) ) rule__BusinessClassDto__Group_5__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:981:1: ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )* ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:982:1: ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )* )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:982:1: ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:983:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesAssignment_5_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:984:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:984:2: rule__BusinessClassDto__PropertyReferencesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_in_rule__BusinessClassDto__Group_5__12020);
            rule__BusinessClassDto__PropertyReferencesAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesAssignment_5_1()); 

            }

            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:987:1: ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:988:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )*
            {
             before(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesAssignment_5_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:989:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:989:2: rule__BusinessClassDto__PropertyReferencesAssignment_5_1
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1001:1: rule__BusinessClassDto__Group_5__2 : ( ( rule__BusinessClassDto__Group_5_2__0 )? ) rule__BusinessClassDto__Group_5__3 ;
    public final void rule__BusinessClassDto__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1005:1: ( ( ( rule__BusinessClassDto__Group_5_2__0 )? ) rule__BusinessClassDto__Group_5__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1006:1: ( ( rule__BusinessClassDto__Group_5_2__0 )? ) rule__BusinessClassDto__Group_5__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1006:1: ( ( rule__BusinessClassDto__Group_5_2__0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1007:1: ( rule__BusinessClassDto__Group_5_2__0 )?
            {
             before(grammarAccess.getBusinessClassDtoAccess().getGroup_5_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1008:1: ( rule__BusinessClassDto__Group_5_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1008:2: rule__BusinessClassDto__Group_5_2__0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1019:1: rule__BusinessClassDto__Group_5__3 : ( ']' ) ;
    public final void rule__BusinessClassDto__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1023:1: ( ( ']' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1024:1: ( ']' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1024:1: ( ']' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1025:1: ']'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1046:1: rule__BusinessClassDto__Group_5_2__0 : ( 'references' ) rule__BusinessClassDto__Group_5_2__1 ;
    public final void rule__BusinessClassDto__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1050:1: ( ( 'references' ) rule__BusinessClassDto__Group_5_2__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1051:1: ( 'references' ) rule__BusinessClassDto__Group_5_2__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1051:1: ( 'references' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1052:1: 'references'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1066:1: rule__BusinessClassDto__Group_5_2__1 : ( '[' ) rule__BusinessClassDto__Group_5_2__2 ;
    public final void rule__BusinessClassDto__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1070:1: ( ( '[' ) rule__BusinessClassDto__Group_5_2__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1071:1: ( '[' ) rule__BusinessClassDto__Group_5_2__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1071:1: ( '[' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1072:1: '['
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1086:1: rule__BusinessClassDto__Group_5_2__2 : ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )* ) ) rule__BusinessClassDto__Group_5_2__3 ;
    public final void rule__BusinessClassDto__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1090:1: ( ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )* ) ) rule__BusinessClassDto__Group_5_2__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1091:1: ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )* ) ) rule__BusinessClassDto__Group_5_2__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1091:1: ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )* ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1092:1: ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )* )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1092:1: ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1093:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesAssignment_5_2_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1094:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1094:2: rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2_in_rule__BusinessClassDto__Group_5_2__22234);
            rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesAssignment_5_2_2()); 

            }

            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1097:1: ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1098:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )*
            {
             before(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesAssignment_5_2_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1099:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1099:2: rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1111:1: rule__BusinessClassDto__Group_5_2__3 : ( ']' ) ;
    public final void rule__BusinessClassDto__Group_5_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1115:1: ( ( ']' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1116:1: ( ']' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1116:1: ( ']' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1117:1: ']'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1138:1: rule__EnumerationDto__Group__0 : ( ( rule__EnumerationDto__DescriptionAssignment_0 )? ) rule__EnumerationDto__Group__1 ;
    public final void rule__EnumerationDto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1142:1: ( ( ( rule__EnumerationDto__DescriptionAssignment_0 )? ) rule__EnumerationDto__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1143:1: ( ( rule__EnumerationDto__DescriptionAssignment_0 )? ) rule__EnumerationDto__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1143:1: ( ( rule__EnumerationDto__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1144:1: ( rule__EnumerationDto__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumerationDtoAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1145:1: ( rule__EnumerationDto__DescriptionAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1145:2: rule__EnumerationDto__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1156:1: rule__EnumerationDto__Group__1 : ( 'enumeration' ) rule__EnumerationDto__Group__2 ;
    public final void rule__EnumerationDto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1160:1: ( ( 'enumeration' ) rule__EnumerationDto__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1161:1: ( 'enumeration' ) rule__EnumerationDto__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1161:1: ( 'enumeration' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1162:1: 'enumeration'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1176:1: rule__EnumerationDto__Group__2 : ( ( rule__EnumerationDto__NameAssignment_2 ) ) rule__EnumerationDto__Group__3 ;
    public final void rule__EnumerationDto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1180:1: ( ( ( rule__EnumerationDto__NameAssignment_2 ) ) rule__EnumerationDto__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1181:1: ( ( rule__EnumerationDto__NameAssignment_2 ) ) rule__EnumerationDto__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1181:1: ( ( rule__EnumerationDto__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1182:1: ( rule__EnumerationDto__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationDtoAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1183:1: ( rule__EnumerationDto__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1183:2: rule__EnumerationDto__NameAssignment_2
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1194:1: rule__EnumerationDto__Group__3 : ( 'represents' ) rule__EnumerationDto__Group__4 ;
    public final void rule__EnumerationDto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1198:1: ( ( 'represents' ) rule__EnumerationDto__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1199:1: ( 'represents' ) rule__EnumerationDto__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1199:1: ( 'represents' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1200:1: 'represents'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1214:1: rule__EnumerationDto__Group__4 : ( ( rule__EnumerationDto__BaseAssignment_4 ) ) ;
    public final void rule__EnumerationDto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1218:1: ( ( ( rule__EnumerationDto__BaseAssignment_4 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1219:1: ( ( rule__EnumerationDto__BaseAssignment_4 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1219:1: ( ( rule__EnumerationDto__BaseAssignment_4 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1220:1: ( rule__EnumerationDto__BaseAssignment_4 )
            {
             before(grammarAccess.getEnumerationDtoAccess().getBaseAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1221:1: ( rule__EnumerationDto__BaseAssignment_4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1221:2: rule__EnumerationDto__BaseAssignment_4
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1241:1: rule__BusinessClassPropertyReference__Group__0 : ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) ) rule__BusinessClassPropertyReference__Group__1 ;
    public final void rule__BusinessClassPropertyReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1245:1: ( ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) ) rule__BusinessClassPropertyReference__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1246:1: ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) ) rule__BusinessClassPropertyReference__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1246:1: ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1247:1: ( rule__BusinessClassPropertyReference__NameAssignment_0 )
            {
             before(grammarAccess.getBusinessClassPropertyReferenceAccess().getNameAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1248:1: ( rule__BusinessClassPropertyReference__NameAssignment_0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1248:2: rule__BusinessClassPropertyReference__NameAssignment_0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1259:1: rule__BusinessClassPropertyReference__Group__1 : ( ';' ) ;
    public final void rule__BusinessClassPropertyReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1263:1: ( ( ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1264:1: ( ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1264:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1265:1: ';'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1282:1: rule__BusinessClassAssociationRoleReference__Group__0 : ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) ) rule__BusinessClassAssociationRoleReference__Group__1 ;
    public final void rule__BusinessClassAssociationRoleReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1286:1: ( ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) ) rule__BusinessClassAssociationRoleReference__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1287:1: ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) ) rule__BusinessClassAssociationRoleReference__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1287:1: ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1288:1: ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 )
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getNameAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1289:1: ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1289:2: rule__BusinessClassAssociationRoleReference__NameAssignment_0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1300:1: rule__BusinessClassAssociationRoleReference__Group__1 : ( 'as' ) rule__BusinessClassAssociationRoleReference__Group__2 ;
    public final void rule__BusinessClassAssociationRoleReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1304:1: ( ( 'as' ) rule__BusinessClassAssociationRoleReference__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1305:1: ( 'as' ) rule__BusinessClassAssociationRoleReference__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1305:1: ( 'as' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1306:1: 'as'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1320:1: rule__BusinessClassAssociationRoleReference__Group__2 : ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) ) rule__BusinessClassAssociationRoleReference__Group__3 ;
    public final void rule__BusinessClassAssociationRoleReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1324:1: ( ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) ) rule__BusinessClassAssociationRoleReference__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1325:1: ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) ) rule__BusinessClassAssociationRoleReference__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1325:1: ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1326:1: ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 )
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1327:1: ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1327:2: rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1338:1: rule__BusinessClassAssociationRoleReference__Group__3 : ( ';' ) ;
    public final void rule__BusinessClassAssociationRoleReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1342:1: ( ( ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1343:1: ( ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1343:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1344:1: ';'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1365:1: rule__ListDto__Group__0 : ( ( rule__ListDto__DescriptionAssignment_0 )? ) rule__ListDto__Group__1 ;
    public final void rule__ListDto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1369:1: ( ( ( rule__ListDto__DescriptionAssignment_0 )? ) rule__ListDto__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1370:1: ( ( rule__ListDto__DescriptionAssignment_0 )? ) rule__ListDto__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1370:1: ( ( rule__ListDto__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1371:1: ( rule__ListDto__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getListDtoAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1372:1: ( rule__ListDto__DescriptionAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1372:2: rule__ListDto__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1383:1: rule__ListDto__Group__1 : ( 'list' ) rule__ListDto__Group__2 ;
    public final void rule__ListDto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1387:1: ( ( 'list' ) rule__ListDto__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1388:1: ( 'list' ) rule__ListDto__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1388:1: ( 'list' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1389:1: 'list'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1403:1: rule__ListDto__Group__2 : ( ( rule__ListDto__NameAssignment_2 ) ) rule__ListDto__Group__3 ;
    public final void rule__ListDto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1407:1: ( ( ( rule__ListDto__NameAssignment_2 ) ) rule__ListDto__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1408:1: ( ( rule__ListDto__NameAssignment_2 ) ) rule__ListDto__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1408:1: ( ( rule__ListDto__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1409:1: ( rule__ListDto__NameAssignment_2 )
            {
             before(grammarAccess.getListDtoAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1410:1: ( rule__ListDto__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1410:2: rule__ListDto__NameAssignment_2
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1421:1: rule__ListDto__Group__3 : ( 'contains' ) rule__ListDto__Group__4 ;
    public final void rule__ListDto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1425:1: ( ( 'contains' ) rule__ListDto__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1426:1: ( 'contains' ) rule__ListDto__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1426:1: ( 'contains' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1427:1: 'contains'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1441:1: rule__ListDto__Group__4 : ( ( rule__ListDto__BaseDtoAssignment_4 ) ) ;
    public final void rule__ListDto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1445:1: ( ( ( rule__ListDto__BaseDtoAssignment_4 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1446:1: ( ( rule__ListDto__BaseDtoAssignment_4 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1446:1: ( ( rule__ListDto__BaseDtoAssignment_4 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1447:1: ( rule__ListDto__BaseDtoAssignment_4 )
            {
             before(grammarAccess.getListDtoAccess().getBaseDtoAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1448:1: ( rule__ListDto__BaseDtoAssignment_4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1448:2: rule__ListDto__BaseDtoAssignment_4
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1468:1: rule__CustomDto__Group__0 : ( ( rule__CustomDto__DescriptionAssignment_0 )? ) rule__CustomDto__Group__1 ;
    public final void rule__CustomDto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1472:1: ( ( ( rule__CustomDto__DescriptionAssignment_0 )? ) rule__CustomDto__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1473:1: ( ( rule__CustomDto__DescriptionAssignment_0 )? ) rule__CustomDto__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1473:1: ( ( rule__CustomDto__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1474:1: ( rule__CustomDto__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getCustomDtoAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1475:1: ( rule__CustomDto__DescriptionAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1475:2: rule__CustomDto__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1486:1: rule__CustomDto__Group__1 : ( 'custom' ) rule__CustomDto__Group__2 ;
    public final void rule__CustomDto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1490:1: ( ( 'custom' ) rule__CustomDto__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1491:1: ( 'custom' ) rule__CustomDto__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1491:1: ( 'custom' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1492:1: 'custom'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1506:1: rule__CustomDto__Group__2 : ( ( rule__CustomDto__NameAssignment_2 ) ) rule__CustomDto__Group__3 ;
    public final void rule__CustomDto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1510:1: ( ( ( rule__CustomDto__NameAssignment_2 ) ) rule__CustomDto__Group__3 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1511:1: ( ( rule__CustomDto__NameAssignment_2 ) ) rule__CustomDto__Group__3
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1511:1: ( ( rule__CustomDto__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1512:1: ( rule__CustomDto__NameAssignment_2 )
            {
             before(grammarAccess.getCustomDtoAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1513:1: ( rule__CustomDto__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1513:2: rule__CustomDto__NameAssignment_2
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1524:1: rule__CustomDto__Group__3 : ( '[' ) rule__CustomDto__Group__4 ;
    public final void rule__CustomDto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1528:1: ( ( '[' ) rule__CustomDto__Group__4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1529:1: ( '[' ) rule__CustomDto__Group__4
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1529:1: ( '[' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1530:1: '['
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1544:1: rule__CustomDto__Group__4 : ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) ) rule__CustomDto__Group__5 ;
    public final void rule__CustomDto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1548:1: ( ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) ) rule__CustomDto__Group__5 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1549:1: ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) ) rule__CustomDto__Group__5
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1549:1: ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1550:1: ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1550:1: ( ( rule__CustomDto__PropertiesAssignment_4 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1551:1: ( rule__CustomDto__PropertiesAssignment_4 )
            {
             before(grammarAccess.getCustomDtoAccess().getPropertiesAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1552:1: ( rule__CustomDto__PropertiesAssignment_4 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1552:2: rule__CustomDto__PropertiesAssignment_4
            {
            pushFollow(FOLLOW_rule__CustomDto__PropertiesAssignment_4_in_rule__CustomDto__Group__43113);
            rule__CustomDto__PropertiesAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getCustomDtoAccess().getPropertiesAssignment_4()); 

            }

            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1555:1: ( ( rule__CustomDto__PropertiesAssignment_4 )* )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1556:1: ( rule__CustomDto__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getCustomDtoAccess().getPropertiesAssignment_4()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1557:1: ( rule__CustomDto__PropertiesAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||(LA16_0>=25 && LA16_0<=29)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1557:2: rule__CustomDto__PropertiesAssignment_4
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1569:1: rule__CustomDto__Group__5 : ( ']' ) ;
    public final void rule__CustomDto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1573:1: ( ( ']' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1574:1: ( ']' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1574:1: ( ']' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1575:1: ']'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1600:1: rule__DtoProperty__Group__0 : ( ( rule__DtoProperty__Alternatives_0 ) ) rule__DtoProperty__Group__1 ;
    public final void rule__DtoProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1604:1: ( ( ( rule__DtoProperty__Alternatives_0 ) ) rule__DtoProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1605:1: ( ( rule__DtoProperty__Alternatives_0 ) ) rule__DtoProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1605:1: ( ( rule__DtoProperty__Alternatives_0 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1606:1: ( rule__DtoProperty__Alternatives_0 )
            {
             before(grammarAccess.getDtoPropertyAccess().getAlternatives_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1607:1: ( rule__DtoProperty__Alternatives_0 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1607:2: rule__DtoProperty__Alternatives_0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1618:1: rule__DtoProperty__Group__1 : ( ';' ) ;
    public final void rule__DtoProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1622:1: ( ( ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1623:1: ( ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1623:1: ( ';' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1624:1: ';'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1641:1: rule__DtoBooleanProperty__Group__0 : ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? ) rule__DtoBooleanProperty__Group__1 ;
    public final void rule__DtoBooleanProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1645:1: ( ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? ) rule__DtoBooleanProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1646:1: ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? ) rule__DtoBooleanProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1646:1: ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1647:1: ( rule__DtoBooleanProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1648:1: ( rule__DtoBooleanProperty__DescriptionAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1648:2: rule__DtoBooleanProperty__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1659:1: rule__DtoBooleanProperty__Group__1 : ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) ) rule__DtoBooleanProperty__Group__2 ;
    public final void rule__DtoBooleanProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1663:1: ( ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) ) rule__DtoBooleanProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1664:1: ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) ) rule__DtoBooleanProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1664:1: ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1665:1: ( rule__DtoBooleanProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1666:1: ( rule__DtoBooleanProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1666:2: rule__DtoBooleanProperty__DataTypeAssignment_1
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1677:1: rule__DtoBooleanProperty__Group__2 : ( ( rule__DtoBooleanProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoBooleanProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1681:1: ( ( ( rule__DtoBooleanProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1682:1: ( ( rule__DtoBooleanProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1682:1: ( ( rule__DtoBooleanProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1683:1: ( rule__DtoBooleanProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1684:1: ( rule__DtoBooleanProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1684:2: rule__DtoBooleanProperty__NameAssignment_2
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1700:1: rule__DtoStringProperty__Group__0 : ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? ) rule__DtoStringProperty__Group__1 ;
    public final void rule__DtoStringProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1704:1: ( ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? ) rule__DtoStringProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1705:1: ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? ) rule__DtoStringProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1705:1: ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1706:1: ( rule__DtoStringProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1707:1: ( rule__DtoStringProperty__DescriptionAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1707:2: rule__DtoStringProperty__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1718:1: rule__DtoStringProperty__Group__1 : ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) ) rule__DtoStringProperty__Group__2 ;
    public final void rule__DtoStringProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1722:1: ( ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) ) rule__DtoStringProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1723:1: ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) ) rule__DtoStringProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1723:1: ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1724:1: ( rule__DtoStringProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1725:1: ( rule__DtoStringProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1725:2: rule__DtoStringProperty__DataTypeAssignment_1
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1736:1: rule__DtoStringProperty__Group__2 : ( ( rule__DtoStringProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoStringProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1740:1: ( ( ( rule__DtoStringProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1741:1: ( ( rule__DtoStringProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1741:1: ( ( rule__DtoStringProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1742:1: ( rule__DtoStringProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoStringPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1743:1: ( rule__DtoStringProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1743:2: rule__DtoStringProperty__NameAssignment_2
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1759:1: rule__DtoDateTimeProperty__Group__0 : ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? ) rule__DtoDateTimeProperty__Group__1 ;
    public final void rule__DtoDateTimeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1763:1: ( ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? ) rule__DtoDateTimeProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1764:1: ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? ) rule__DtoDateTimeProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1764:1: ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1765:1: ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1766:1: ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1766:2: rule__DtoDateTimeProperty__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1777:1: rule__DtoDateTimeProperty__Group__1 : ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) ) rule__DtoDateTimeProperty__Group__2 ;
    public final void rule__DtoDateTimeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1781:1: ( ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) ) rule__DtoDateTimeProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1782:1: ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) ) rule__DtoDateTimeProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1782:1: ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1783:1: ( rule__DtoDateTimeProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1784:1: ( rule__DtoDateTimeProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1784:2: rule__DtoDateTimeProperty__DataTypeAssignment_1
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1795:1: rule__DtoDateTimeProperty__Group__2 : ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoDateTimeProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1799:1: ( ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1800:1: ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1800:1: ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1801:1: ( rule__DtoDateTimeProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1802:1: ( rule__DtoDateTimeProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1802:2: rule__DtoDateTimeProperty__NameAssignment_2
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1818:1: rule__DtoIntegerProperty__Group__0 : ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? ) rule__DtoIntegerProperty__Group__1 ;
    public final void rule__DtoIntegerProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1822:1: ( ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? ) rule__DtoIntegerProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1823:1: ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? ) rule__DtoIntegerProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1823:1: ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1824:1: ( rule__DtoIntegerProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1825:1: ( rule__DtoIntegerProperty__DescriptionAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1825:2: rule__DtoIntegerProperty__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1836:1: rule__DtoIntegerProperty__Group__1 : ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) ) rule__DtoIntegerProperty__Group__2 ;
    public final void rule__DtoIntegerProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1840:1: ( ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) ) rule__DtoIntegerProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1841:1: ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) ) rule__DtoIntegerProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1841:1: ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1842:1: ( rule__DtoIntegerProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1843:1: ( rule__DtoIntegerProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1843:2: rule__DtoIntegerProperty__DataTypeAssignment_1
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1854:1: rule__DtoIntegerProperty__Group__2 : ( ( rule__DtoIntegerProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoIntegerProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1858:1: ( ( ( rule__DtoIntegerProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1859:1: ( ( rule__DtoIntegerProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1859:1: ( ( rule__DtoIntegerProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1860:1: ( rule__DtoIntegerProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1861:1: ( rule__DtoIntegerProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1861:2: rule__DtoIntegerProperty__NameAssignment_2
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1877:1: rule__DtoDecimalProperty__Group__0 : ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? ) rule__DtoDecimalProperty__Group__1 ;
    public final void rule__DtoDecimalProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1881:1: ( ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? ) rule__DtoDecimalProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1882:1: ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? ) rule__DtoDecimalProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1882:1: ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1883:1: ( rule__DtoDecimalProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1884:1: ( rule__DtoDecimalProperty__DescriptionAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1884:2: rule__DtoDecimalProperty__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1895:1: rule__DtoDecimalProperty__Group__1 : ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) ) rule__DtoDecimalProperty__Group__2 ;
    public final void rule__DtoDecimalProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1899:1: ( ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) ) rule__DtoDecimalProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1900:1: ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) ) rule__DtoDecimalProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1900:1: ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1901:1: ( rule__DtoDecimalProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1902:1: ( rule__DtoDecimalProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1902:2: rule__DtoDecimalProperty__DataTypeAssignment_1
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1913:1: rule__DtoDecimalProperty__Group__2 : ( ( rule__DtoDecimalProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoDecimalProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1917:1: ( ( ( rule__DtoDecimalProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1918:1: ( ( rule__DtoDecimalProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1918:1: ( ( rule__DtoDecimalProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1919:1: ( rule__DtoDecimalProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1920:1: ( rule__DtoDecimalProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1920:2: rule__DtoDecimalProperty__NameAssignment_2
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1936:1: rule__DtoEnumerationProperty__Group__0 : ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? ) rule__DtoEnumerationProperty__Group__1 ;
    public final void rule__DtoEnumerationProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1940:1: ( ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? ) rule__DtoEnumerationProperty__Group__1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1941:1: ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? ) rule__DtoEnumerationProperty__Group__1
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1941:1: ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1942:1: ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1943:1: ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1943:2: rule__DtoEnumerationProperty__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1954:1: rule__DtoEnumerationProperty__Group__1 : ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) ) rule__DtoEnumerationProperty__Group__2 ;
    public final void rule__DtoEnumerationProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1958:1: ( ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) ) rule__DtoEnumerationProperty__Group__2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1959:1: ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) ) rule__DtoEnumerationProperty__Group__2
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1959:1: ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1960:1: ( rule__DtoEnumerationProperty__TypeAssignment_1 )
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getTypeAssignment_1()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1961:1: ( rule__DtoEnumerationProperty__TypeAssignment_1 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1961:2: rule__DtoEnumerationProperty__TypeAssignment_1
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1972:1: rule__DtoEnumerationProperty__Group__2 : ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoEnumerationProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1976:1: ( ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1977:1: ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1977:1: ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1978:1: ( rule__DtoEnumerationProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1979:1: ( rule__DtoEnumerationProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1979:2: rule__DtoEnumerationProperty__NameAssignment_2
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1995:1: rule__DataContractModel__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DataContractModel__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1999:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2000:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2000:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2001:1: RULE_STRING
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2010:1: rule__DataContractModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataContractModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2014:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2015:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2015:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2016:1: RULE_ID
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2025:1: rule__DataContractModel__ExternalReferencesAssignment_4 : ( ruleExternalReference ) ;
    public final void rule__DataContractModel__ExternalReferencesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2029:1: ( ( ruleExternalReference ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2030:1: ( ruleExternalReference )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2030:1: ( ruleExternalReference )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2031:1: ruleExternalReference
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2040:1: rule__DataContractModel__DtosAssignment_5_0 : ( ruleDto ) ;
    public final void rule__DataContractModel__DtosAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2044:1: ( ( ruleDto ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2045:1: ( ruleDto )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2045:1: ( ruleDto )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2046:1: ruleDto
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2055:1: rule__DataContractModel__EnumerationsAssignment_5_1 : ( ruleEnumerationDto ) ;
    public final void rule__DataContractModel__EnumerationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2059:1: ( ( ruleEnumerationDto ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2060:1: ( ruleEnumerationDto )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2060:1: ( ruleEnumerationDto )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2061:1: ruleEnumerationDto
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2070:1: rule__ExternalReference__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ExternalReference__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2074:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2075:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2075:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2076:1: RULE_STRING
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2085:1: rule__ExternalReference__ModelnameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ExternalReference__ModelnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2089:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2090:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2090:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2091:1: RULE_ID
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2100:1: rule__ExternalReference__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__ExternalReference__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2104:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2105:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2105:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2106:1: RULE_ID
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2115:1: rule__BusinessClassDto__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessClassDto__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2119:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2120:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2120:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2121:1: RULE_STRING
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2130:1: rule__BusinessClassDto__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessClassDto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2134:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2135:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2135:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2136:1: RULE_ID
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2145:1: rule__BusinessClassDto__BaseAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__BusinessClassDto__BaseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2149:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2150:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2150:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2151:1: ( RULE_ID )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getBaseExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2152:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2153:1: RULE_ID
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2164:1: rule__BusinessClassDto__PropertyReferencesAssignment_5_1 : ( ruleBusinessClassPropertyReference ) ;
    public final void rule__BusinessClassDto__PropertyReferencesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2168:1: ( ( ruleBusinessClassPropertyReference ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2169:1: ( ruleBusinessClassPropertyReference )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2169:1: ( ruleBusinessClassPropertyReference )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2170:1: ruleBusinessClassPropertyReference
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2179:1: rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2 : ( ruleBusinessClassAssociationRoleReference ) ;
    public final void rule__BusinessClassDto__AssociationReferencesAssignment_5_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2183:1: ( ( ruleBusinessClassAssociationRoleReference ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2184:1: ( ruleBusinessClassAssociationRoleReference )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2184:1: ( ruleBusinessClassAssociationRoleReference )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2185:1: ruleBusinessClassAssociationRoleReference
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2194:1: rule__EnumerationDto__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__EnumerationDto__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2198:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2199:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2199:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2200:1: RULE_STRING
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2209:1: rule__EnumerationDto__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumerationDto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2213:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2214:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2214:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2215:1: RULE_ID
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2224:1: rule__EnumerationDto__BaseAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__EnumerationDto__BaseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2228:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2229:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2229:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2230:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumerationDtoAccess().getBaseExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2231:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2232:1: RULE_ID
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2243:1: rule__BusinessClassPropertyReference__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BusinessClassPropertyReference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2247:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2248:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2248:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2249:1: RULE_ID
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2258:1: rule__BusinessClassAssociationRoleReference__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BusinessClassAssociationRoleReference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2262:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2263:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2263:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2264:1: RULE_ID
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2273:1: rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2277:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2278:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2278:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2279:1: ( RULE_ID )
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeDtoCrossReference_2_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2280:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2281:1: RULE_ID
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2292:1: rule__ListDto__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ListDto__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2296:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2297:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2297:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2298:1: RULE_STRING
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2307:1: rule__ListDto__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ListDto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2311:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2312:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2312:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2313:1: RULE_ID
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2322:1: rule__ListDto__BaseDtoAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ListDto__BaseDtoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2326:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2327:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2327:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2328:1: ( RULE_ID )
            {
             before(grammarAccess.getListDtoAccess().getBaseDtoDtoCrossReference_4_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2329:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2330:1: RULE_ID
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2341:1: rule__CustomDto__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__CustomDto__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2345:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2346:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2346:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2347:1: RULE_STRING
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2356:1: rule__CustomDto__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CustomDto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2360:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2361:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2361:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2362:1: RULE_ID
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2371:1: rule__CustomDto__PropertiesAssignment_4 : ( ruleDtoProperty ) ;
    public final void rule__CustomDto__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2375:1: ( ( ruleDtoProperty ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2376:1: ( ruleDtoProperty )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2376:1: ( ruleDtoProperty )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2377:1: ruleDtoProperty
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2386:1: rule__DtoBooleanProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoBooleanProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2390:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2391:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2391:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2392:1: RULE_STRING
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2401:1: rule__DtoBooleanProperty__DataTypeAssignment_1 : ( ( 'boolean' ) ) ;
    public final void rule__DtoBooleanProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2405:1: ( ( ( 'boolean' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2406:1: ( ( 'boolean' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2406:1: ( ( 'boolean' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2407:1: ( 'boolean' )
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeBooleanKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2408:1: ( 'boolean' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2409:1: 'boolean'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2424:1: rule__DtoBooleanProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoBooleanProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2428:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2429:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2429:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2430:1: RULE_ID
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2439:1: rule__DtoStringProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoStringProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2443:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2444:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2444:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2445:1: RULE_STRING
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2454:1: rule__DtoStringProperty__DataTypeAssignment_1 : ( ( 'string' ) ) ;
    public final void rule__DtoStringProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2458:1: ( ( ( 'string' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2459:1: ( ( 'string' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2459:1: ( ( 'string' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2460:1: ( 'string' )
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDataTypeStringKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2461:1: ( 'string' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2462:1: 'string'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2477:1: rule__DtoStringProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoStringProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2481:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2482:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2482:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2483:1: RULE_ID
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2492:1: rule__DtoDateTimeProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoDateTimeProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2496:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2497:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2497:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2498:1: RULE_STRING
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2507:1: rule__DtoDateTimeProperty__DataTypeAssignment_1 : ( ( 'datetime' ) ) ;
    public final void rule__DtoDateTimeProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2511:1: ( ( ( 'datetime' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2512:1: ( ( 'datetime' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2512:1: ( ( 'datetime' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2513:1: ( 'datetime' )
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2514:1: ( 'datetime' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2515:1: 'datetime'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2530:1: rule__DtoDateTimeProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoDateTimeProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2534:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2535:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2535:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2536:1: RULE_ID
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2545:1: rule__DtoIntegerProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoIntegerProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2549:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2550:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2550:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2551:1: RULE_STRING
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2560:1: rule__DtoIntegerProperty__DataTypeAssignment_1 : ( ( 'integer' ) ) ;
    public final void rule__DtoIntegerProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2564:1: ( ( ( 'integer' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2565:1: ( ( 'integer' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2565:1: ( ( 'integer' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2566:1: ( 'integer' )
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2567:1: ( 'integer' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2568:1: 'integer'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2583:1: rule__DtoIntegerProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoIntegerProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2587:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2588:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2588:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2589:1: RULE_ID
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2598:1: rule__DtoDecimalProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoDecimalProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2602:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2603:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2603:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2604:1: RULE_STRING
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2613:1: rule__DtoDecimalProperty__DataTypeAssignment_1 : ( ( 'decimal' ) ) ;
    public final void rule__DtoDecimalProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2617:1: ( ( ( 'decimal' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2618:1: ( ( 'decimal' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2618:1: ( ( 'decimal' ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2619:1: ( 'decimal' )
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2620:1: ( 'decimal' )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2621:1: 'decimal'
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2636:1: rule__DtoDecimalProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoDecimalProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2640:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2641:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2641:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2642:1: RULE_ID
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2651:1: rule__DtoEnumerationProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoEnumerationProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2655:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2656:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2656:1: ( RULE_STRING )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2657:1: RULE_STRING
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2666:1: rule__DtoEnumerationProperty__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DtoEnumerationProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2670:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2671:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2671:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2672:1: ( RULE_ID )
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getTypeEnumerationDtoCrossReference_1_0()); 
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2673:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2674:1: RULE_ID
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
    // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2685:1: rule__DtoEnumerationProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoEnumerationProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2689:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2690:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2690:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2691:1: RULE_ID
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