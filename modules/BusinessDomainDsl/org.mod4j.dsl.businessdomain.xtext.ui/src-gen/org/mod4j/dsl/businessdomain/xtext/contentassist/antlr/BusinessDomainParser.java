/*
* generated by Xtext
*/
package org.mod4j.dsl.businessdomain.xtext.contentassist.antlr;

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

import org.mod4j.dsl.businessdomain.xtext.services.BusinessDomainGrammarAccess;

public class BusinessDomainParser extends AbstractContentAssistParser {
	
	@Inject
	private BusinessDomainGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.mod4j.dsl.businessdomain.xtext.contentassist.antlr.internal.InternalBusinessDomainLexer createLexer(CharStream stream) {
		return new org.mod4j.dsl.businessdomain.xtext.contentassist.antlr.internal.InternalBusinessDomainLexer(stream);
	}
	
	@Override
	protected org.mod4j.dsl.businessdomain.xtext.contentassist.antlr.internal.InternalBusinessDomainParser createParser() {
		org.mod4j.dsl.businessdomain.xtext.contentassist.antlr.internal.InternalBusinessDomainParser result = new org.mod4j.dsl.businessdomain.xtext.contentassist.antlr.internal.InternalBusinessDomainParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				{
					put(grammarAccess.getBusinessDomainModelAccess().getAlternatives_4(), "rule__BusinessDomainModel__Alternatives_4");
					put(grammarAccess.getAssociationAccess().getAlternatives_7(), "rule__Association__Alternatives_7");
					put(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAlternatives_4_0(), "rule__Enumeration__EnumerationLiteralsAlternatives_4_0");
					put(grammarAccess.getAbstractBusinessRuleAccess().getAlternatives(), "rule__AbstractBusinessRule__Alternatives");
					put(grammarAccess.getPropertyAccess().getAlternatives_0(), "rule__Property__Alternatives_0");
					put(grammarAccess.getBoolPropertyAccess().getAlternatives_3_1(), "rule__BoolProperty__Alternatives_3_1");
					put(grammarAccess.getMultiplicityAccess().getAlternatives(), "rule__Multiplicity__Alternatives");
					put(grammarAccess.getDateTimeAccuracyAccess().getAlternatives(), "rule__DateTimeAccuracy__Alternatives");
					put(grammarAccess.getPersistencyModeAccess().getAlternatives(), "rule__PersistencyMode__Alternatives");
					put(grammarAccess.getBusinessDomainModelAccess().getGroup(), "rule__BusinessDomainModel__Group__0");
					put(grammarAccess.getAssociationAccess().getGroup(), "rule__Association__Group__0");
					put(grammarAccess.getAssociationAccess().getGroup_4(), "rule__Association__Group_4__0");
					put(grammarAccess.getAssociationAccess().getGroup_5(), "rule__Association__Group_5__0");
					put(grammarAccess.getAssociationAccess().getGroup_9(), "rule__Association__Group_9__0");
					put(grammarAccess.getAssociationAccess().getGroup_12(), "rule__Association__Group_12__0");
					put(grammarAccess.getAssociationAccess().getGroup_13(), "rule__Association__Group_13__0");
					put(grammarAccess.getAssociationAccess().getGroup_14(), "rule__Association__Group_14__0");
					put(grammarAccess.getAssociationAccess().getGroup_14_1(), "rule__Association__Group_14_1__0");
					put(grammarAccess.getBusinessClassAccess().getGroup(), "rule__BusinessClass__Group__0");
					put(grammarAccess.getBusinessClassAccess().getGroup_3(), "rule__BusinessClass__Group_3__0");
					put(grammarAccess.getBusinessClassAccess().getGroup_4(), "rule__BusinessClass__Group_4__0");
					put(grammarAccess.getBusinessClassAccess().getGroup_7(), "rule__BusinessClass__Group_7__0");
					put(grammarAccess.getEnumerationAccess().getGroup(), "rule__Enumeration__Group__0");
					put(grammarAccess.getIntegerEnumerationLiteralAccess().getGroup(), "rule__IntegerEnumerationLiteral__Group__0");
					put(grammarAccess.getIntegerEnumerationLiteralAccess().getGroup_2(), "rule__IntegerEnumerationLiteral__Group_2__0");
					put(grammarAccess.getStringEnumerationLiteralAccess().getGroup(), "rule__StringEnumerationLiteral__Group__0");
					put(grammarAccess.getStringEnumerationLiteralAccess().getGroup_2(), "rule__StringEnumerationLiteral__Group_2__0");
					put(grammarAccess.getBusinessRuleAccess().getGroup(), "rule__BusinessRule__Group__0");
					put(grammarAccess.getUniqueRuleAccess().getGroup(), "rule__UniqueRule__Group__0");
					put(grammarAccess.getUniqueRuleAccess().getGroup_5(), "rule__UniqueRule__Group_5__0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getPropertyAccess().getGroup_2(), "rule__Property__Group_2__0");
					put(grammarAccess.getPropertyAccess().getGroup_3(), "rule__Property__Group_3__0");
					put(grammarAccess.getBoolPropertyAccess().getGroup(), "rule__BoolProperty__Group__0");
					put(grammarAccess.getBoolPropertyAccess().getGroup_3(), "rule__BoolProperty__Group_3__0");
					put(grammarAccess.getStringPropertyAccess().getGroup(), "rule__StringProperty__Group__0");
					put(grammarAccess.getStringPropertyAccess().getGroup_3(), "rule__StringProperty__Group_3__0");
					put(grammarAccess.getStringPropertyAccess().getGroup_4(), "rule__StringProperty__Group_4__0");
					put(grammarAccess.getStringPropertyAccess().getGroup_5(), "rule__StringProperty__Group_5__0");
					put(grammarAccess.getStringPropertyAccess().getGroup_6(), "rule__StringProperty__Group_6__0");
					put(grammarAccess.getDateTimePropertyAccess().getGroup(), "rule__DateTimeProperty__Group__0");
					put(grammarAccess.getDateTimePropertyAccess().getGroup_3(), "rule__DateTimeProperty__Group_3__0");
					put(grammarAccess.getIntegerPropertyAccess().getGroup(), "rule__IntegerProperty__Group__0");
					put(grammarAccess.getIntegerPropertyAccess().getGroup_3(), "rule__IntegerProperty__Group_3__0");
					put(grammarAccess.getIntegerPropertyAccess().getGroup_4(), "rule__IntegerProperty__Group_4__0");
					put(grammarAccess.getIntegerPropertyAccess().getGroup_5(), "rule__IntegerProperty__Group_5__0");
					put(grammarAccess.getDecimalPropertyAccess().getGroup(), "rule__DecimalProperty__Group__0");
					put(grammarAccess.getEnumerationPropertyAccess().getGroup(), "rule__EnumerationProperty__Group__0");
					put(grammarAccess.getEnumerationPropertyAccess().getGroup_3(), "rule__EnumerationProperty__Group_3__0");
					put(grammarAccess.getBusinessDomainModelAccess().getDescriptionAssignment_0(), "rule__BusinessDomainModel__DescriptionAssignment_0");
					put(grammarAccess.getBusinessDomainModelAccess().getNameAssignment_2(), "rule__BusinessDomainModel__NameAssignment_2");
					put(grammarAccess.getBusinessDomainModelAccess().getTypesAssignment_4_0(), "rule__BusinessDomainModel__TypesAssignment_4_0");
					put(grammarAccess.getBusinessDomainModelAccess().getEnumerationsAssignment_4_1(), "rule__BusinessDomainModel__EnumerationsAssignment_4_1");
					put(grammarAccess.getBusinessDomainModelAccess().getAssociationsAssignment_4_2(), "rule__BusinessDomainModel__AssociationsAssignment_4_2");
					put(grammarAccess.getAssociationAccess().getDescriptionAssignment_0(), "rule__Association__DescriptionAssignment_0");
					put(grammarAccess.getAssociationAccess().getSourceAssignment_2(), "rule__Association__SourceAssignment_2");
					put(grammarAccess.getAssociationAccess().getSourceRoleNameAssignment_3(), "rule__Association__SourceRoleNameAssignment_3");
					put(grammarAccess.getAssociationAccess().getSourceForeignKeyAssignment_4_1(), "rule__Association__SourceForeignKeyAssignment_4_1");
					put(grammarAccess.getAssociationAccess().getSourceAlternateKeyAssignment_5_1(), "rule__Association__SourceAlternateKeyAssignment_5_1");
					put(grammarAccess.getAssociationAccess().getSourceMultiplicityAssignment_6(), "rule__Association__SourceMultiplicityAssignment_6");
					put(grammarAccess.getAssociationAccess().getBidirectionalAssignment_7_0(), "rule__Association__BidirectionalAssignment_7_0");
					put(grammarAccess.getAssociationAccess().getTargetMultiplicityAssignment_8(), "rule__Association__TargetMultiplicityAssignment_8");
					put(grammarAccess.getAssociationAccess().getTableAssignment_9_1(), "rule__Association__TableAssignment_9_1");
					put(grammarAccess.getAssociationAccess().getTargetAssignment_10(), "rule__Association__TargetAssignment_10");
					put(grammarAccess.getAssociationAccess().getTargetRoleNameAssignment_11(), "rule__Association__TargetRoleNameAssignment_11");
					put(grammarAccess.getAssociationAccess().getTargetForeignKeyAssignment_12_1(), "rule__Association__TargetForeignKeyAssignment_12_1");
					put(grammarAccess.getAssociationAccess().getTargetAlternateKeyAssignment_13_1(), "rule__Association__TargetAlternateKeyAssignment_13_1");
					put(grammarAccess.getAssociationAccess().getOrderedAssignment_14_0(), "rule__Association__OrderedAssignment_14_0");
					put(grammarAccess.getAssociationAccess().getOrderingColumnAssignment_14_1_1(), "rule__Association__OrderingColumnAssignment_14_1_1");
					put(grammarAccess.getBusinessClassAccess().getDescriptionAssignment_0(), "rule__BusinessClass__DescriptionAssignment_0");
					put(grammarAccess.getBusinessClassAccess().getNameAssignment_2(), "rule__BusinessClass__NameAssignment_2");
					put(grammarAccess.getBusinessClassAccess().getSuperclassAssignment_3_1(), "rule__BusinessClass__SuperclassAssignment_3_1");
					put(grammarAccess.getBusinessClassAccess().getTableAssignment_4_1(), "rule__BusinessClass__TableAssignment_4_1");
					put(grammarAccess.getBusinessClassAccess().getPropertiesAssignment_6(), "rule__BusinessClass__PropertiesAssignment_6");
					put(grammarAccess.getBusinessClassAccess().getBusinessRulesAssignment_7_2(), "rule__BusinessClass__BusinessRulesAssignment_7_2");
					put(grammarAccess.getEnumerationAccess().getDescriptionAssignment_0(), "rule__Enumeration__DescriptionAssignment_0");
					put(grammarAccess.getEnumerationAccess().getNameAssignment_2(), "rule__Enumeration__NameAssignment_2");
					put(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_4(), "rule__Enumeration__EnumerationLiteralsAssignment_4");
					put(grammarAccess.getIntegerEnumerationLiteralAccess().getDescriptionAssignment_0(), "rule__IntegerEnumerationLiteral__DescriptionAssignment_0");
					put(grammarAccess.getIntegerEnumerationLiteralAccess().getNameAssignment_1(), "rule__IntegerEnumerationLiteral__NameAssignment_1");
					put(grammarAccess.getIntegerEnumerationLiteralAccess().getPersistedValueAssignment_2_1(), "rule__IntegerEnumerationLiteral__PersistedValueAssignment_2_1");
					put(grammarAccess.getStringEnumerationLiteralAccess().getDescriptionAssignment_0(), "rule__StringEnumerationLiteral__DescriptionAssignment_0");
					put(grammarAccess.getStringEnumerationLiteralAccess().getNameAssignment_1(), "rule__StringEnumerationLiteral__NameAssignment_1");
					put(grammarAccess.getStringEnumerationLiteralAccess().getPersistedValueAssignment_2_1(), "rule__StringEnumerationLiteral__PersistedValueAssignment_2_1");
					put(grammarAccess.getBusinessRuleAccess().getDescriptionAssignment_0(), "rule__BusinessRule__DescriptionAssignment_0");
					put(grammarAccess.getBusinessRuleAccess().getNameAssignment_1(), "rule__BusinessRule__NameAssignment_1");
					put(grammarAccess.getUniqueRuleAccess().getDescriptionAssignment_0(), "rule__UniqueRule__DescriptionAssignment_0");
					put(grammarAccess.getUniqueRuleAccess().getNameAssignment_2(), "rule__UniqueRule__NameAssignment_2");
					put(grammarAccess.getUniqueRuleAccess().getPropertiesAssignment_4(), "rule__UniqueRule__PropertiesAssignment_4");
					put(grammarAccess.getUniqueRuleAccess().getPropertiesAssignment_5_1(), "rule__UniqueRule__PropertiesAssignment_5_1");
					put(grammarAccess.getPropertyAccess().getNullableAssignment_1(), "rule__Property__NullableAssignment_1");
					put(grammarAccess.getPropertyAccess().getDerivedAssignment_2_0(), "rule__Property__DerivedAssignment_2_0");
					put(grammarAccess.getPropertyAccess().getWritableAssignment_2_1(), "rule__Property__WritableAssignment_2_1");
					put(grammarAccess.getPropertyAccess().getColumnAssignment_3_1(), "rule__Property__ColumnAssignment_3_1");
					put(grammarAccess.getBoolPropertyAccess().getDescriptionAssignment_0(), "rule__BoolProperty__DescriptionAssignment_0");
					put(grammarAccess.getBoolPropertyAccess().getDataTypeAssignment_1(), "rule__BoolProperty__DataTypeAssignment_1");
					put(grammarAccess.getBoolPropertyAccess().getNameAssignment_2(), "rule__BoolProperty__NameAssignment_2");
					put(grammarAccess.getBoolPropertyAccess().getHasDefaultAssignment_3_0(), "rule__BoolProperty__HasDefaultAssignment_3_0");
					put(grammarAccess.getBoolPropertyAccess().getDefaultValueAssignment_3_1_0(), "rule__BoolProperty__DefaultValueAssignment_3_1_0");
					put(grammarAccess.getStringPropertyAccess().getDescriptionAssignment_0(), "rule__StringProperty__DescriptionAssignment_0");
					put(grammarAccess.getStringPropertyAccess().getDataTypeAssignment_1(), "rule__StringProperty__DataTypeAssignment_1");
					put(grammarAccess.getStringPropertyAccess().getNameAssignment_2(), "rule__StringProperty__NameAssignment_2");
					put(grammarAccess.getStringPropertyAccess().getHasDefaultAssignment_3_0(), "rule__StringProperty__HasDefaultAssignment_3_0");
					put(grammarAccess.getStringPropertyAccess().getDefaultValueAssignment_3_1(), "rule__StringProperty__DefaultValueAssignment_3_1");
					put(grammarAccess.getStringPropertyAccess().getMinLengthAssignment_4_1(), "rule__StringProperty__MinLengthAssignment_4_1");
					put(grammarAccess.getStringPropertyAccess().getMaxLengthAssignment_5_1(), "rule__StringProperty__MaxLengthAssignment_5_1");
					put(grammarAccess.getStringPropertyAccess().getRegularExpressionAssignment_6_1(), "rule__StringProperty__RegularExpressionAssignment_6_1");
					put(grammarAccess.getDateTimePropertyAccess().getDescriptionAssignment_0(), "rule__DateTimeProperty__DescriptionAssignment_0");
					put(grammarAccess.getDateTimePropertyAccess().getDataTypeAssignment_1(), "rule__DateTimeProperty__DataTypeAssignment_1");
					put(grammarAccess.getDateTimePropertyAccess().getNameAssignment_2(), "rule__DateTimeProperty__NameAssignment_2");
					put(grammarAccess.getDateTimePropertyAccess().getHasDefaultAssignment_3_0(), "rule__DateTimeProperty__HasDefaultAssignment_3_0");
					put(grammarAccess.getDateTimePropertyAccess().getDefaultValueAssignment_3_1(), "rule__DateTimeProperty__DefaultValueAssignment_3_1");
					put(grammarAccess.getIntegerPropertyAccess().getDescriptionAssignment_0(), "rule__IntegerProperty__DescriptionAssignment_0");
					put(grammarAccess.getIntegerPropertyAccess().getDataTypeAssignment_1(), "rule__IntegerProperty__DataTypeAssignment_1");
					put(grammarAccess.getIntegerPropertyAccess().getNameAssignment_2(), "rule__IntegerProperty__NameAssignment_2");
					put(grammarAccess.getIntegerPropertyAccess().getHasDefaultAssignment_3_0(), "rule__IntegerProperty__HasDefaultAssignment_3_0");
					put(grammarAccess.getIntegerPropertyAccess().getDefaultValueAssignment_3_1(), "rule__IntegerProperty__DefaultValueAssignment_3_1");
					put(grammarAccess.getIntegerPropertyAccess().getMinValueAssignment_4_1(), "rule__IntegerProperty__MinValueAssignment_4_1");
					put(grammarAccess.getIntegerPropertyAccess().getMaxValueAssignment_5_1(), "rule__IntegerProperty__MaxValueAssignment_5_1");
					put(grammarAccess.getDecimalPropertyAccess().getDescriptionAssignment_0(), "rule__DecimalProperty__DescriptionAssignment_0");
					put(grammarAccess.getDecimalPropertyAccess().getDataTypeAssignment_1(), "rule__DecimalProperty__DataTypeAssignment_1");
					put(grammarAccess.getDecimalPropertyAccess().getNameAssignment_2(), "rule__DecimalProperty__NameAssignment_2");
					put(grammarAccess.getEnumerationPropertyAccess().getDescriptionAssignment_0(), "rule__EnumerationProperty__DescriptionAssignment_0");
					put(grammarAccess.getEnumerationPropertyAccess().getTypeAssignment_1(), "rule__EnumerationProperty__TypeAssignment_1");
					put(grammarAccess.getEnumerationPropertyAccess().getNameAssignment_2(), "rule__EnumerationProperty__NameAssignment_2");
					put(grammarAccess.getEnumerationPropertyAccess().getHasDefaultAssignment_3_0(), "rule__EnumerationProperty__HasDefaultAssignment_3_0");
					put(grammarAccess.getEnumerationPropertyAccess().getDefaultValueAsStringAssignment_3_1(), "rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.mod4j.dsl.businessdomain.xtext.contentassist.antlr.internal.InternalBusinessDomainParser typedParser = (org.mod4j.dsl.businessdomain.xtext.contentassist.antlr.internal.InternalBusinessDomainParser) parser;
			typedParser.entryRuleBusinessDomainModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public BusinessDomainGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(BusinessDomainGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
