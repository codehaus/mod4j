/*
* generated by Xtext
*/
package org.mod4j.dsl.presentation.xtext.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.mod4j.dsl.presentation.xtext.services.PresentationGrammarAccess;

public class PresentationParser extends AbstractContentAssistParser {
	
	@Inject
	private PresentationGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal.InternalPresentationLexer createLexer(CharStream stream) {
		return new org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal.InternalPresentationLexer(stream);
	}
	
	@Override
	protected org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal.InternalPresentationParser createParser() {
		org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal.InternalPresentationParser result = new org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal.InternalPresentationParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				{
					put(grammarAccess.getModelElementAccess().getAlternatives(), "rule__ModelElement__Alternatives");
					put(grammarAccess.getUIModelElementAccess().getAlternatives(), "rule__UIModelElement__Alternatives");
					put(grammarAccess.getDialogueAccess().getAlternatives(), "rule__Dialogue__Alternatives");
					put(grammarAccess.getContentFormAccess().getAlternatives_5_1(), "rule__ContentForm__Alternatives_5_1");
					put(grammarAccess.getCompoundDialogueAccess().getAlternatives(), "rule__CompoundDialogue__Alternatives");
					put(grammarAccess.getCompoundDialogueAccess().getAlternatives_0_5_1(), "rule__CompoundDialogue__Alternatives_0_5_1");
					put(grammarAccess.getCollectionDialogueAccess().getAlternatives_5_1(), "rule__CollectionDialogue__Alternatives_5_1");
					put(grammarAccess.getMasterDetailAccess().getAlternatives_5_1(), "rule__MasterDetail__Alternatives_5_1");
					put(grammarAccess.getProcessAccess().getAlternatives(), "rule__Process__Alternatives");
					put(grammarAccess.getFormElementAccess().getAlternatives_4_1(), "rule__FormElement__Alternatives_4_1");
					put(grammarAccess.getDialogueCallAccess().getAlternatives(), "rule__DialogueCall__Alternatives");
					put(grammarAccess.getLinkAccess().getAlternatives(), "rule__Link__Alternatives");
					put(grammarAccess.getPresentationModelAccess().getGroup(), "rule__PresentationModel__Group__0");
					put(grammarAccess.getExternalReferenceAccess().getGroup(), "rule__ExternalReference__Group__0");
					put(grammarAccess.getContentFormAccess().getGroup(), "rule__ContentForm__Group__0");
					put(grammarAccess.getContentFormAccess().getGroup_5(), "rule__ContentForm__Group_5__0");
					put(grammarAccess.getContentFormAccess().getGroup_7(), "rule__ContentForm__Group_7__0");
					put(grammarAccess.getCompoundDialogueAccess().getGroup_0(), "rule__CompoundDialogue__Group_0__0");
					put(grammarAccess.getCompoundDialogueAccess().getGroup_0_5(), "rule__CompoundDialogue__Group_0_5__0");
					put(grammarAccess.getCompoundDialogueAccess().getGroup_0_6(), "rule__CompoundDialogue__Group_0_6__0");
					put(grammarAccess.getCompoundDialogueAccess().getGroup_0_7(), "rule__CompoundDialogue__Group_0_7__0");
					put(grammarAccess.getCollectionDialogueAccess().getGroup(), "rule__CollectionDialogue__Group__0");
					put(grammarAccess.getCollectionDialogueAccess().getGroup_5(), "rule__CollectionDialogue__Group_5__0");
					put(grammarAccess.getCollectionDialogueAccess().getGroup_6(), "rule__CollectionDialogue__Group_6__0");
					put(grammarAccess.getCollectionDialogueAccess().getGroup_7(), "rule__CollectionDialogue__Group_7__0");
					put(grammarAccess.getMasterDetailAccess().getGroup(), "rule__MasterDetail__Group__0");
					put(grammarAccess.getMasterDetailAccess().getGroup_5(), "rule__MasterDetail__Group_5__0");
					put(grammarAccess.getMasterDetailAccess().getGroup_12(), "rule__MasterDetail__Group_12__0");
					put(grammarAccess.getAutomatedProcessAccess().getGroup(), "rule__AutomatedProcess__Group__0");
					put(grammarAccess.getInteractiveProcessAccess().getGroup(), "rule__InteractiveProcess__Group__0");
					put(grammarAccess.getFormElementAccess().getGroup(), "rule__FormElement__Group__0");
					put(grammarAccess.getFormElementAccess().getGroup_4(), "rule__FormElement__Group_4__0");
					put(grammarAccess.getLinkedDialogueCallAccess().getGroup(), "rule__LinkedDialogueCall__Group__0");
					put(grammarAccess.getDirectDialogueCallAccess().getGroup(), "rule__DirectDialogueCall__Group__0");
					put(grammarAccess.getProcessCallAccess().getGroup(), "rule__ProcessCall__Group__0");
					put(grammarAccess.getLinkStepAccess().getGroup(), "rule__LinkStep__Group__0");
					put(grammarAccess.getLinkPathAccess().getGroup(), "rule__LinkPath__Group__0");
					put(grammarAccess.getPresentationModelAccess().getDescriptionAssignment_0(), "rule__PresentationModel__DescriptionAssignment_0");
					put(grammarAccess.getPresentationModelAccess().getNameAssignment_2(), "rule__PresentationModel__NameAssignment_2");
					put(grammarAccess.getPresentationModelAccess().getExternalReferencesAssignment_3(), "rule__PresentationModel__ExternalReferencesAssignment_3");
					put(grammarAccess.getPresentationModelAccess().getElementsAssignment_4(), "rule__PresentationModel__ElementsAssignment_4");
					put(grammarAccess.getExternalReferenceAccess().getModelNameAssignment_1(), "rule__ExternalReference__ModelNameAssignment_1");
					put(grammarAccess.getExternalReferenceAccess().getNameAssignment_3(), "rule__ExternalReference__NameAssignment_3");
					put(grammarAccess.getContentFormAccess().getDescriptionAssignment_0(), "rule__ContentForm__DescriptionAssignment_0");
					put(grammarAccess.getContentFormAccess().getNameAssignment_2(), "rule__ContentForm__NameAssignment_2");
					put(grammarAccess.getContentFormAccess().getContextRefAssignment_4(), "rule__ContentForm__ContextRefAssignment_4");
					put(grammarAccess.getContentFormAccess().getReadonlyAssignment_5_1_0(), "rule__ContentForm__ReadonlyAssignment_5_1_0");
					put(grammarAccess.getContentFormAccess().getFormElementsAssignment_6(), "rule__ContentForm__FormElementsAssignment_6");
					put(grammarAccess.getContentFormAccess().getProcessesAssignment_7_2(), "rule__ContentForm__ProcessesAssignment_7_2");
					put(grammarAccess.getCompoundDialogueAccess().getDescriptionAssignment_0_0(), "rule__CompoundDialogue__DescriptionAssignment_0_0");
					put(grammarAccess.getCompoundDialogueAccess().getNameAssignment_0_2(), "rule__CompoundDialogue__NameAssignment_0_2");
					put(grammarAccess.getCompoundDialogueAccess().getContextRefAssignment_0_4(), "rule__CompoundDialogue__ContextRefAssignment_0_4");
					put(grammarAccess.getCompoundDialogueAccess().getReadonlyAssignment_0_5_1_0(), "rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0");
					put(grammarAccess.getCompoundDialogueAccess().getDialoguesAssignment_0_6_2(), "rule__CompoundDialogue__DialoguesAssignment_0_6_2");
					put(grammarAccess.getCompoundDialogueAccess().getProcessesAssignment_0_7_2(), "rule__CompoundDialogue__ProcessesAssignment_0_7_2");
					put(grammarAccess.getCollectionDialogueAccess().getDescriptionAssignment_0(), "rule__CollectionDialogue__DescriptionAssignment_0");
					put(grammarAccess.getCollectionDialogueAccess().getNameAssignment_2(), "rule__CollectionDialogue__NameAssignment_2");
					put(grammarAccess.getCollectionDialogueAccess().getContextRefAssignment_4(), "rule__CollectionDialogue__ContextRefAssignment_4");
					put(grammarAccess.getCollectionDialogueAccess().getReadonlyAssignment_5_1_0(), "rule__CollectionDialogue__ReadonlyAssignment_5_1_0");
					put(grammarAccess.getCollectionDialogueAccess().getDialoguesAssignment_6_2(), "rule__CollectionDialogue__DialoguesAssignment_6_2");
					put(grammarAccess.getCollectionDialogueAccess().getProcessesAssignment_7_2(), "rule__CollectionDialogue__ProcessesAssignment_7_2");
					put(grammarAccess.getMasterDetailAccess().getDescriptionAssignment_0(), "rule__MasterDetail__DescriptionAssignment_0");
					put(grammarAccess.getMasterDetailAccess().getNameAssignment_2(), "rule__MasterDetail__NameAssignment_2");
					put(grammarAccess.getMasterDetailAccess().getContextRefAssignment_4(), "rule__MasterDetail__ContextRefAssignment_4");
					put(grammarAccess.getMasterDetailAccess().getReadonlyAssignment_5_1_0(), "rule__MasterDetail__ReadonlyAssignment_5_1_0");
					put(grammarAccess.getMasterDetailAccess().getMasterAssignment_7(), "rule__MasterDetail__MasterAssignment_7");
					put(grammarAccess.getMasterDetailAccess().getDetailAssignment_10(), "rule__MasterDetail__DetailAssignment_10");
					put(grammarAccess.getMasterDetailAccess().getProcessesAssignment_12_2(), "rule__MasterDetail__ProcessesAssignment_12_2");
					put(grammarAccess.getAutomatedProcessAccess().getDescriptionAssignment_0(), "rule__AutomatedProcess__DescriptionAssignment_0");
					put(grammarAccess.getAutomatedProcessAccess().getNameAssignment_2(), "rule__AutomatedProcess__NameAssignment_2");
					put(grammarAccess.getAutomatedProcessAccess().getContextRefAssignment_4(), "rule__AutomatedProcess__ContextRefAssignment_4");
					put(grammarAccess.getInteractiveProcessAccess().getDescriptionAssignment_0(), "rule__InteractiveProcess__DescriptionAssignment_0");
					put(grammarAccess.getInteractiveProcessAccess().getNameAssignment_2(), "rule__InteractiveProcess__NameAssignment_2");
					put(grammarAccess.getInteractiveProcessAccess().getContextRefAssignment_4(), "rule__InteractiveProcess__ContextRefAssignment_4");
					put(grammarAccess.getFormElementAccess().getReferencesAssignment_1(), "rule__FormElement__ReferencesAssignment_1");
					put(grammarAccess.getFormElementAccess().getNameAssignment_3(), "rule__FormElement__NameAssignment_3");
					put(grammarAccess.getFormElementAccess().getReadonlyAssignment_4_1_0(), "rule__FormElement__ReadonlyAssignment_4_1_0");
					put(grammarAccess.getLinkedDialogueCallAccess().getLinkAssignment_1(), "rule__LinkedDialogueCall__LinkAssignment_1");
					put(grammarAccess.getLinkedDialogueCallAccess().getNameAssignment_3(), "rule__LinkedDialogueCall__NameAssignment_3");
					put(grammarAccess.getDirectDialogueCallAccess().getNameAssignment_0(), "rule__DirectDialogueCall__NameAssignment_0");
					put(grammarAccess.getProcessCallAccess().getNameAssignment_0(), "rule__ProcessCall__NameAssignment_0");
					put(grammarAccess.getLinkRefAccess().getNameAssignment(), "rule__LinkRef__NameAssignment");
					put(grammarAccess.getLinkStepAccess().getDescriptionAssignment_0(), "rule__LinkStep__DescriptionAssignment_0");
					put(grammarAccess.getLinkStepAccess().getNameAssignment_2(), "rule__LinkStep__NameAssignment_2");
					put(grammarAccess.getLinkStepAccess().getContextRefAssignment_4(), "rule__LinkStep__ContextRefAssignment_4");
					put(grammarAccess.getLinkStepAccess().getReferenceAssignment_6(), "rule__LinkStep__ReferenceAssignment_6");
					put(grammarAccess.getLinkPathAccess().getDescriptionAssignment_0(), "rule__LinkPath__DescriptionAssignment_0");
					put(grammarAccess.getLinkPathAccess().getNameAssignment_2(), "rule__LinkPath__NameAssignment_2");
					put(grammarAccess.getLinkPathAccess().getContextRefAssignment_4(), "rule__LinkPath__ContextRefAssignment_4");
					put(grammarAccess.getDtoPropertyReferenceAccess().getNameAssignment(), "rule__DtoPropertyReference__NameAssignment");
					put(grammarAccess.getAssociationRoleReferenceAccess().getNameAssignment(), "rule__AssociationRoleReference__NameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal.InternalPresentationParser typedParser = (org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal.InternalPresentationParser) parser;
			typedParser.entryRulePresentationModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public PresentationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PresentationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}