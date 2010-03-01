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
					put(grammarAccess.getUIModelElementAccess().getAlternatives(), "rule__UIModelElement__Alternatives");
					put(grammarAccess.getDialogueAccess().getAlternatives(), "rule__Dialogue__Alternatives");
					put(grammarAccess.getContentFormAccess().getAlternatives_7_1(), "rule__ContentForm__Alternatives_7_1");
					put(grammarAccess.getCompoundDialogueAccess().getAlternatives(), "rule__CompoundDialogue__Alternatives");
					put(grammarAccess.getCompoundDialogueAccess().getAlternatives_0_5_1(), "rule__CompoundDialogue__Alternatives_0_5_1");
					put(grammarAccess.getCollectionDialogueAccess().getAlternatives_6_1(), "rule__CollectionDialogue__Alternatives_6_1");
					put(grammarAccess.getMasterDetailAccess().getAlternatives_5_1(), "rule__MasterDetail__Alternatives_5_1");
					put(grammarAccess.getProcessAccess().getAlternatives_2(), "rule__Process__Alternatives_2");
					put(grammarAccess.getProcessAccess().getAlternatives_7(), "rule__Process__Alternatives_7");
					put(grammarAccess.getFormElementAccess().getAlternatives_4_1(), "rule__FormElement__Alternatives_4_1");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getUIModelElementCallAccess().getAlternatives(), "rule__UIModelElementCall__Alternatives");
					put(grammarAccess.getProcessTypeAccess().getAlternatives(), "rule__ProcessType__Alternatives");
					put(grammarAccess.getExpressionTypeAccess().getAlternatives(), "rule__ExpressionType__Alternatives");
					put(grammarAccess.getPresentationModelAccess().getGroup(), "rule__PresentationModel__Group__0");
					put(grammarAccess.getApplicationAccess().getGroup(), "rule__Application__Group__0");
					put(grammarAccess.getApplicationAccess().getGroup_2(), "rule__Application__Group_2__0");
					put(grammarAccess.getExternalReferenceAccess().getGroup(), "rule__ExternalReference__Group__0");
					put(grammarAccess.getContentFormAccess().getGroup(), "rule__ContentForm__Group__0");
					put(grammarAccess.getContentFormAccess().getGroup_7(), "rule__ContentForm__Group_7__0");
					put(grammarAccess.getContentFormAccess().getGroup_9(), "rule__ContentForm__Group_9__0");
					put(grammarAccess.getContentFormAccess().getGroup_9_2(), "rule__ContentForm__Group_9_2__0");
					put(grammarAccess.getContentFormAccess().getGroup_10(), "rule__ContentForm__Group_10__0");
					put(grammarAccess.getContentFormAccess().getGroup_10_2(), "rule__ContentForm__Group_10_2__0");
					put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
					put(grammarAccess.getActionAccess().getGroup_3(), "rule__Action__Group_3__0");
					put(grammarAccess.getCompoundDialogueAccess().getGroup_0(), "rule__CompoundDialogue__Group_0__0");
					put(grammarAccess.getCompoundDialogueAccess().getGroup_0_5(), "rule__CompoundDialogue__Group_0_5__0");
					put(grammarAccess.getCompoundDialogueAccess().getGroup_0_6(), "rule__CompoundDialogue__Group_0_6__0");
					put(grammarAccess.getCompoundDialogueAccess().getGroup_0_6_2(), "rule__CompoundDialogue__Group_0_6_2__0");
					put(grammarAccess.getCompoundDialogueAccess().getGroup_0_7(), "rule__CompoundDialogue__Group_0_7__0");
					put(grammarAccess.getCompoundDialogueAccess().getGroup_0_7_2(), "rule__CompoundDialogue__Group_0_7_2__0");
					put(grammarAccess.getCollectionDialogueAccess().getGroup(), "rule__CollectionDialogue__Group__0");
					put(grammarAccess.getCollectionDialogueAccess().getGroup_6(), "rule__CollectionDialogue__Group_6__0");
					put(grammarAccess.getCollectionDialogueAccess().getGroup_7(), "rule__CollectionDialogue__Group_7__0");
					put(grammarAccess.getCollectionDialogueAccess().getGroup_7_2(), "rule__CollectionDialogue__Group_7_2__0");
					put(grammarAccess.getCollectionDialogueAccess().getGroup_8(), "rule__CollectionDialogue__Group_8__0");
					put(grammarAccess.getCollectionDialogueAccess().getGroup_8_2(), "rule__CollectionDialogue__Group_8_2__0");
					put(grammarAccess.getMasterDetailAccess().getGroup(), "rule__MasterDetail__Group__0");
					put(grammarAccess.getMasterDetailAccess().getGroup_5(), "rule__MasterDetail__Group_5__0");
					put(grammarAccess.getMasterDetailAccess().getGroup_12(), "rule__MasterDetail__Group_12__0");
					put(grammarAccess.getMasterDetailAccess().getGroup_12_2(), "rule__MasterDetail__Group_12_2__0");
					put(grammarAccess.getProcessAccess().getGroup(), "rule__Process__Group__0");
					put(grammarAccess.getProcessAccess().getGroup_2_1(), "rule__Process__Group_2_1__0");
					put(grammarAccess.getProcessAccess().getGroup_7_1(), "rule__Process__Group_7_1__0");
					put(grammarAccess.getProcessAccess().getGroup_7_1_1(), "rule__Process__Group_7_1_1__0");
					put(grammarAccess.getFormElementAccess().getGroup(), "rule__FormElement__Group__0");
					put(grammarAccess.getFormElementAccess().getGroup_3(), "rule__FormElement__Group_3__0");
					put(grammarAccess.getFormElementAccess().getGroup_4(), "rule__FormElement__Group_4__0");
					put(grammarAccess.getActionDialogueCallAccess().getGroup(), "rule__ActionDialogueCall__Group__0");
					put(grammarAccess.getDialogueCallAccess().getGroup(), "rule__DialogueCall__Group__0");
					put(grammarAccess.getDialogueCallAccess().getGroup_0(), "rule__DialogueCall__Group_0__0");
					put(grammarAccess.getDialogueCallAccess().getGroup_1(), "rule__DialogueCall__Group_1__0");
					put(grammarAccess.getProcessCallAccess().getGroup(), "rule__ProcessCall__Group__0");
					put(grammarAccess.getProcessCallAccess().getGroup_0(), "rule__ProcessCall__Group_0__0");
					put(grammarAccess.getProcessCallAccess().getGroup_1(), "rule__ProcessCall__Group_1__0");
					put(grammarAccess.getProcessCallAccess().getGroup_5(), "rule__ProcessCall__Group_5__0");
					put(grammarAccess.getOperationExpressionAccess().getGroup(), "rule__OperationExpression__Group__0");
					put(grammarAccess.getSimpleProcessCallAccess().getGroup(), "rule__SimpleProcessCall__Group__0");
					put(grammarAccess.getSimpleProcessCallAccess().getGroup_1(), "rule__SimpleProcessCall__Group_1__0");
					put(grammarAccess.getServiceExpressionAccess().getGroup(), "rule__ServiceExpression__Group__0");
					put(grammarAccess.getNavigationExpressionAccess().getGroup(), "rule__NavigationExpression__Group__0");
					put(grammarAccess.getPresentationModelAccess().getDescriptionAssignment_0(), "rule__PresentationModel__DescriptionAssignment_0");
					put(grammarAccess.getPresentationModelAccess().getNameAssignment_2(), "rule__PresentationModel__NameAssignment_2");
					put(grammarAccess.getPresentationModelAccess().getExternalReferencesAssignment_4(), "rule__PresentationModel__ExternalReferencesAssignment_4");
					put(grammarAccess.getPresentationModelAccess().getStartAssignment_5(), "rule__PresentationModel__StartAssignment_5");
					put(grammarAccess.getPresentationModelAccess().getElementsAssignment_6(), "rule__PresentationModel__ElementsAssignment_6");
					put(grammarAccess.getApplicationAccess().getStartProcessesAssignment_2_0(), "rule__Application__StartProcessesAssignment_2_0");
					put(grammarAccess.getExternalReferenceAccess().getModelNameAssignment_1(), "rule__ExternalReference__ModelNameAssignment_1");
					put(grammarAccess.getExternalReferenceAccess().getNameAssignment_3(), "rule__ExternalReference__NameAssignment_3");
					put(grammarAccess.getContentFormAccess().getDescriptionAssignment_0(), "rule__ContentForm__DescriptionAssignment_0");
					put(grammarAccess.getContentFormAccess().getNameAssignment_2(), "rule__ContentForm__NameAssignment_2");
					put(grammarAccess.getContentFormAccess().getCollectionContextAssignment_4(), "rule__ContentForm__CollectionContextAssignment_4");
					put(grammarAccess.getContentFormAccess().getContextRefAssignment_5(), "rule__ContentForm__ContextRefAssignment_5");
					put(grammarAccess.getContentFormAccess().getReadonlyAssignment_7_1_0(), "rule__ContentForm__ReadonlyAssignment_7_1_0");
					put(grammarAccess.getContentFormAccess().getFormElementsAssignment_8(), "rule__ContentForm__FormElementsAssignment_8");
					put(grammarAccess.getContentFormAccess().getActionsAssignment_9_2_0(), "rule__ContentForm__ActionsAssignment_9_2_0");
					put(grammarAccess.getContentFormAccess().getProcessesAssignment_10_2_0(), "rule__ContentForm__ProcessesAssignment_10_2_0");
					put(grammarAccess.getActionAccess().getDescriptionAssignment_0(), "rule__Action__DescriptionAssignment_0");
					put(grammarAccess.getActionAccess().getTypeAssignment_1(), "rule__Action__TypeAssignment_1");
					put(grammarAccess.getActionAccess().getNameAssignment_2(), "rule__Action__NameAssignment_2");
					put(grammarAccess.getActionAccess().getLabelAssignment_3_1(), "rule__Action__LabelAssignment_3_1");
					put(grammarAccess.getActionAccess().getProcessElementsAssignment_4(), "rule__Action__ProcessElementsAssignment_4");
					put(grammarAccess.getCompoundDialogueAccess().getDescriptionAssignment_0_0(), "rule__CompoundDialogue__DescriptionAssignment_0_0");
					put(grammarAccess.getCompoundDialogueAccess().getNameAssignment_0_2(), "rule__CompoundDialogue__NameAssignment_0_2");
					put(grammarAccess.getCompoundDialogueAccess().getContextRefAssignment_0_4(), "rule__CompoundDialogue__ContextRefAssignment_0_4");
					put(grammarAccess.getCompoundDialogueAccess().getReadonlyAssignment_0_5_1_0(), "rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0");
					put(grammarAccess.getCompoundDialogueAccess().getDialoguesAssignment_0_6_2_0(), "rule__CompoundDialogue__DialoguesAssignment_0_6_2_0");
					put(grammarAccess.getCompoundDialogueAccess().getProcessesAssignment_0_7_2_0(), "rule__CompoundDialogue__ProcessesAssignment_0_7_2_0");
					put(grammarAccess.getCollectionDialogueAccess().getDescriptionAssignment_0(), "rule__CollectionDialogue__DescriptionAssignment_0");
					put(grammarAccess.getCollectionDialogueAccess().getNameAssignment_2(), "rule__CollectionDialogue__NameAssignment_2");
					put(grammarAccess.getCollectionDialogueAccess().getContextRefAssignment_4(), "rule__CollectionDialogue__ContextRefAssignment_4");
					put(grammarAccess.getCollectionDialogueAccess().getReadonlyAssignment_6_1_0(), "rule__CollectionDialogue__ReadonlyAssignment_6_1_0");
					put(grammarAccess.getCollectionDialogueAccess().getDialoguesAssignment_7_2_0(), "rule__CollectionDialogue__DialoguesAssignment_7_2_0");
					put(grammarAccess.getCollectionDialogueAccess().getProcessesAssignment_8_2_0(), "rule__CollectionDialogue__ProcessesAssignment_8_2_0");
					put(grammarAccess.getMasterDetailAccess().getDescriptionAssignment_0(), "rule__MasterDetail__DescriptionAssignment_0");
					put(grammarAccess.getMasterDetailAccess().getNameAssignment_2(), "rule__MasterDetail__NameAssignment_2");
					put(grammarAccess.getMasterDetailAccess().getContextRefAssignment_4(), "rule__MasterDetail__ContextRefAssignment_4");
					put(grammarAccess.getMasterDetailAccess().getReadonlyAssignment_5_1_0(), "rule__MasterDetail__ReadonlyAssignment_5_1_0");
					put(grammarAccess.getMasterDetailAccess().getMasterAssignment_7(), "rule__MasterDetail__MasterAssignment_7");
					put(grammarAccess.getMasterDetailAccess().getDetailAssignment_10(), "rule__MasterDetail__DetailAssignment_10");
					put(grammarAccess.getMasterDetailAccess().getProcessesAssignment_12_2_0(), "rule__MasterDetail__ProcessesAssignment_12_2_0");
					put(grammarAccess.getProcessAccess().getDescriptionAssignment_0(), "rule__Process__DescriptionAssignment_0");
					put(grammarAccess.getProcessAccess().getTypeAssignment_2_0(), "rule__Process__TypeAssignment_2_0");
					put(grammarAccess.getProcessAccess().getTypeAssignment_2_1_0(), "rule__Process__TypeAssignment_2_1_0");
					put(grammarAccess.getProcessAccess().getLinkAssignment_2_1_1(), "rule__Process__LinkAssignment_2_1_1");
					put(grammarAccess.getProcessAccess().getNameAssignment_3(), "rule__Process__NameAssignment_3");
					put(grammarAccess.getProcessAccess().getCollectionContextAssignment_5(), "rule__Process__CollectionContextAssignment_5");
					put(grammarAccess.getProcessAccess().getContextRefAssignment_6(), "rule__Process__ContextRefAssignment_6");
					put(grammarAccess.getProcessAccess().getProcessElementsAssignment_7_1_1_0(), "rule__Process__ProcessElementsAssignment_7_1_1_0");
					put(grammarAccess.getFormElementAccess().getDescriptionAssignment_0(), "rule__FormElement__DescriptionAssignment_0");
					put(grammarAccess.getFormElementAccess().getReferencesAssignment_2(), "rule__FormElement__ReferencesAssignment_2");
					put(grammarAccess.getFormElementAccess().getLabelAssignment_3_1(), "rule__FormElement__LabelAssignment_3_1");
					put(grammarAccess.getFormElementAccess().getReadonlyAssignment_4_1_0(), "rule__FormElement__ReadonlyAssignment_4_1_0");
					put(grammarAccess.getActionDialogueCallAccess().getContextExpAssignment_0(), "rule__ActionDialogueCall__ContextExpAssignment_0");
					put(grammarAccess.getActionDialogueCallAccess().getNameAssignment_2(), "rule__ActionDialogueCall__NameAssignment_2");
					put(grammarAccess.getDialogueCallAccess().getLabelAssignment_0_0(), "rule__DialogueCall__LabelAssignment_0_0");
					put(grammarAccess.getDialogueCallAccess().getConditionAssignment_1_2(), "rule__DialogueCall__ConditionAssignment_1_2");
					put(grammarAccess.getDialogueCallAccess().getContextExpAssignment_2(), "rule__DialogueCall__ContextExpAssignment_2");
					put(grammarAccess.getDialogueCallAccess().getNameAssignment_4(), "rule__DialogueCall__NameAssignment_4");
					put(grammarAccess.getProcessCallAccess().getLabelAssignment_0_0(), "rule__ProcessCall__LabelAssignment_0_0");
					put(grammarAccess.getProcessCallAccess().getConditionAssignment_1_2(), "rule__ProcessCall__ConditionAssignment_1_2");
					put(grammarAccess.getProcessCallAccess().getContextExpAssignment_2(), "rule__ProcessCall__ContextExpAssignment_2");
					put(grammarAccess.getProcessCallAccess().getNameAssignment_4(), "rule__ProcessCall__NameAssignment_4");
					put(grammarAccess.getProcessCallAccess().getLabelAssignment_5_1(), "rule__ProcessCall__LabelAssignment_5_1");
					put(grammarAccess.getOperationExpressionAccess().getNameAssignment_1(), "rule__OperationExpression__NameAssignment_1");
					put(grammarAccess.getSimpleProcessCallAccess().getNameAssignment_0(), "rule__SimpleProcessCall__NameAssignment_0");
					put(grammarAccess.getSimpleProcessCallAccess().getLabelAssignment_1_1(), "rule__SimpleProcessCall__LabelAssignment_1_1");
					put(grammarAccess.getStandardExpressionAccess().getTypeAssignment(), "rule__StandardExpression__TypeAssignment");
					put(grammarAccess.getServiceExpressionAccess().getServiceNameAssignment_1(), "rule__ServiceExpression__ServiceNameAssignment_1");
					put(grammarAccess.getServiceExpressionAccess().getServiceMethodAssignment_3(), "rule__ServiceExpression__ServiceMethodAssignment_3");
					put(grammarAccess.getNavigationExpressionAccess().getCompositionAssignment_0(), "rule__NavigationExpression__CompositionAssignment_0");
					put(grammarAccess.getNavigationExpressionAccess().getReferencesAssignment_2(), "rule__NavigationExpression__ReferencesAssignment_2");
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
