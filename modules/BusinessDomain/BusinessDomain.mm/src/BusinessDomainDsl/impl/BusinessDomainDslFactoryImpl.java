/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessDomainDslFactoryImpl extends EFactoryImpl implements BusinessDomainDslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BusinessDomainDslFactory init() {
		try {
			BusinessDomainDslFactory theBusinessDomainDslFactory = (BusinessDomainDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mod4j.org/busmod"); 
			if (theBusinessDomainDslFactory != null) {
				return theBusinessDomainDslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BusinessDomainDslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessDomainDslFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BusinessDomainDslPackage.NAMED_ELEMENT: return createNamedElement();
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL: return createBusinessClassModel();
			case BusinessDomainDslPackage.BUSINESS_CLASS: return createBusinessClass();
			case BusinessDomainDslPackage.COMMENT: return createComment();
			case BusinessDomainDslPackage.PROPERTY: return createProperty();
			case BusinessDomainDslPackage.ENUMERATION: return createEnumeration();
			case BusinessDomainDslPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case BusinessDomainDslPackage.COMMENTABLE_ELEMENT: return createCommentableElement();
			case BusinessDomainDslPackage.BUSINESS_RULE: return createBusinessRule();
			case BusinessDomainDslPackage.BOOL_PROPERTY: return createBoolProperty();
			case BusinessDomainDslPackage.DATE_TIME_PROPERTY: return createDateTimeProperty();
			case BusinessDomainDslPackage.CUSTOM_PROPERTY: return createCustomProperty();
			case BusinessDomainDslPackage.NUMBER_PROPERTY: return createNumberProperty();
			case BusinessDomainDslPackage.STRING_PROPERTY: return createStringProperty();
			case BusinessDomainDslPackage.CUSTOM_DATA_TYPE: return createCustomDataType();
			case BusinessDomainDslPackage.PROPERTY_CONTAINER: return createPropertyContainer();
			case BusinessDomainDslPackage.BLOB_BINARY_PROPERTY: return createBlobBinaryProperty();
			case BusinessDomainDslPackage.BLOB_TEXT_PROPERTY: return createBlobTextProperty();
			case BusinessDomainDslPackage.CONSTRAINT: return createConstraint();
			case BusinessDomainDslPackage.ASSOCIATION_R: return createassociation_R();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BusinessDomainDslPackage.ACCESS_MODIFIER:
				return createAccessModifierFromString(eDataType, initialValue);
			case BusinessDomainDslPackage.TYPE_ACCESS_MODIFIER:
				return createTypeAccessModifierFromString(eDataType, initialValue);
			case BusinessDomainDslPackage.INHERITANCE_MODIFIER:
				return createInheritanceModifierFromString(eDataType, initialValue);
			case BusinessDomainDslPackage.MULTIPLICITY:
				return createMultiplicityFromString(eDataType, initialValue);
			case BusinessDomainDslPackage.OPERATION_CONCURRENCY:
				return createOperationConcurrencyFromString(eDataType, initialValue);
			case BusinessDomainDslPackage.DATE_TIME_ACCURACY:
				return createDateTimeAccuracyFromString(eDataType, initialValue);
			case BusinessDomainDslPackage.PERSISTENCY_MODE:
				return createPersistencyModeFromString(eDataType, initialValue);
			case BusinessDomainDslPackage.DATABASE_TYPE:
				return createDatabaseTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BusinessDomainDslPackage.ACCESS_MODIFIER:
				return convertAccessModifierToString(eDataType, instanceValue);
			case BusinessDomainDslPackage.TYPE_ACCESS_MODIFIER:
				return convertTypeAccessModifierToString(eDataType, instanceValue);
			case BusinessDomainDslPackage.INHERITANCE_MODIFIER:
				return convertInheritanceModifierToString(eDataType, instanceValue);
			case BusinessDomainDslPackage.MULTIPLICITY:
				return convertMultiplicityToString(eDataType, instanceValue);
			case BusinessDomainDslPackage.OPERATION_CONCURRENCY:
				return convertOperationConcurrencyToString(eDataType, instanceValue);
			case BusinessDomainDslPackage.DATE_TIME_ACCURACY:
				return convertDateTimeAccuracyToString(eDataType, instanceValue);
			case BusinessDomainDslPackage.PERSISTENCY_MODE:
				return convertPersistencyModeToString(eDataType, instanceValue);
			case BusinessDomainDslPackage.DATABASE_TYPE:
				return convertDatabaseTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessClassModel createBusinessClassModel() {
		BusinessClassModelImpl businessClassModel = new BusinessClassModelImpl();
		return businessClassModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessClass createBusinessClass() {
		BusinessClassImpl businessClass = new BusinessClassImpl();
		return businessClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentableElement createCommentableElement() {
		CommentableElementImpl commentableElement = new CommentableElementImpl();
		return commentableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessRule createBusinessRule() {
		BusinessRuleImpl businessRule = new BusinessRuleImpl();
		return businessRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolProperty createBoolProperty() {
		BoolPropertyImpl boolProperty = new BoolPropertyImpl();
		return boolProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeProperty createDateTimeProperty() {
		DateTimePropertyImpl dateTimeProperty = new DateTimePropertyImpl();
		return dateTimeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomProperty createCustomProperty() {
		CustomPropertyImpl customProperty = new CustomPropertyImpl();
		return customProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberProperty createNumberProperty() {
		NumberPropertyImpl numberProperty = new NumberPropertyImpl();
		return numberProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringProperty createStringProperty() {
		StringPropertyImpl stringProperty = new StringPropertyImpl();
		return stringProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomDataType createCustomDataType() {
		CustomDataTypeImpl customDataType = new CustomDataTypeImpl();
		return customDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyContainer createPropertyContainer() {
		PropertyContainerImpl propertyContainer = new PropertyContainerImpl();
		return propertyContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlobBinaryProperty createBlobBinaryProperty() {
		BlobBinaryPropertyImpl blobBinaryProperty = new BlobBinaryPropertyImpl();
		return blobBinaryProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlobTextProperty createBlobTextProperty() {
		BlobTextPropertyImpl blobTextProperty = new BlobTextPropertyImpl();
		return blobTextProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public association_R createassociation_R() {
		association_RImpl association_R = new association_RImpl();
		return association_R;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifier createAccessModifierFromString(EDataType eDataType, String initialValue) {
		AccessModifier result = AccessModifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessModifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAccessModifier createTypeAccessModifierFromString(EDataType eDataType, String initialValue) {
		TypeAccessModifier result = TypeAccessModifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeAccessModifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceModifier createInheritanceModifierFromString(EDataType eDataType, String initialValue) {
		InheritanceModifier result = InheritanceModifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInheritanceModifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity createMultiplicityFromString(EDataType eDataType, String initialValue) {
		Multiplicity result = Multiplicity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationConcurrency createOperationConcurrencyFromString(EDataType eDataType, String initialValue) {
		OperationConcurrency result = OperationConcurrency.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationConcurrencyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeAccuracy createDateTimeAccuracyFromString(EDataType eDataType, String initialValue) {
		DateTimeAccuracy result = DateTimeAccuracy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimeAccuracyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistencyMode createPersistencyModeFromString(EDataType eDataType, String initialValue) {
		PersistencyMode result = PersistencyMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistencyModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseType createDatabaseTypeFromString(EDataType eDataType, String initialValue) {
		DatabaseType result = DatabaseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatabaseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessDomainDslPackage getBusinessDomainDslPackage() {
		return (BusinessDomainDslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BusinessDomainDslPackage getPackage() {
		return BusinessDomainDslPackage.eINSTANCE;
	}

} //BusinessDomainDslFactoryImpl
