/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see BusinessDomainDsl.BusinessDomainDslFactory
 * @model kind="package"
 * @generated
 */
public interface BusinessDomainDslPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "BusinessDomainDsl";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.mod4j.org/busmod";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "busmod";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    BusinessDomainDslPackage eINSTANCE = BusinessDomainDsl.impl.BusinessDomainDslPackageImpl.init();

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.ModelElementImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getModelElement()
     * @generated
     */
    int MODEL_ELEMENT = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_ELEMENT__NAME = 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_ELEMENT__DESCRIPTION = 1;

    /**
     * The number of structural features of the '<em>Model Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_ELEMENT_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.BusinessDomainModelImpl <em>Business Domain Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.BusinessDomainModelImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBusinessDomainModel()
     * @generated
     */
    int BUSINESS_DOMAIN_MODEL = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_DOMAIN_MODEL__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_DOMAIN_MODEL__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Enumerations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_DOMAIN_MODEL__ENUMERATIONS = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_DOMAIN_MODEL__TYPES = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_DOMAIN_MODEL__ASSOCIATIONS = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Business Domain Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_DOMAIN_MODEL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.AbstractTypeImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getAbstractType()
     * @generated
     */
    int ABSTRACT_TYPE = 12;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TYPE__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TYPE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TYPE__PROPERTIES = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Abstract Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TYPE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.BusinessClassImpl <em>Business Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.BusinessClassImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBusinessClass()
     * @generated
     */
    int BUSINESS_CLASS = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS__NAME = ABSTRACT_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS__DESCRIPTION = ABSTRACT_TYPE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS__PROPERTIES = ABSTRACT_TYPE__PROPERTIES;

    /**
     * The feature id for the '<em><b>Inheritance Modifier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS__INHERITANCE_MODIFIER = ABSTRACT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Business Rules</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS__BUSINESS_RULES = ABSTRACT_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Superclass</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS__SUPERCLASS = ABSTRACT_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Associations To</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS__ASSOCIATIONS_TO = ABSTRACT_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Associations From</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS__ASSOCIATIONS_FROM = ABSTRACT_TYPE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Business Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.PropertyImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__DATA_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__NULLABLE = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Persistency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__PERSISTENCY = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__HAS_DEFAULT = MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.EnumerationImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getEnumeration()
     * @generated
     */
    int ENUMERATION = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Enumeration Literals</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__ENUMERATION_LITERALS = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Enumeration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.EnumerationLiteralImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getEnumerationLiteral()
     * @generated
     */
    int ENUMERATION_LITERAL = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_LITERAL__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_LITERAL__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Persisted Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_LITERAL__PERSISTED_VALUE = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Enumeration Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_LITERAL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.BusinessRuleImpl <em>Business Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.BusinessRuleImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBusinessRule()
     * @generated
     */
    int BUSINESS_RULE = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The number of structural features of the '<em>Business Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.BoolPropertyImpl <em>Bool Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.BoolPropertyImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBoolProperty()
     * @generated
     */
    int BOOL_PROPERTY = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_PROPERTY__NULLABLE = PROPERTY__NULLABLE;

    /**
     * The feature id for the '<em><b>Persistency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

    /**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_PROPERTY__HAS_DEFAULT = PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_PROPERTY__DEFAULT_VALUE = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Bool Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOL_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.DateTimePropertyImpl <em>Date Time Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.DateTimePropertyImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getDateTimeProperty()
     * @generated
     */
    int DATE_TIME_PROPERTY = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY__NULLABLE = PROPERTY__NULLABLE;

    /**
     * The feature id for the '<em><b>Persistency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

    /**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY__HAS_DEFAULT = PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Accuracy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY__ACCURACY = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY__DEFAULT_VALUE = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Date Time Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.EnumerationPropertyImpl <em>Enumeration Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.EnumerationPropertyImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getEnumerationProperty()
     * @generated
     */
    int ENUMERATION_PROPERTY = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY__NULLABLE = PROPERTY__NULLABLE;

    /**
     * The feature id for the '<em><b>Persistency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

    /**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY__HAS_DEFAULT = PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY__TYPE = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY__DEFAULT_VALUE = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Enumeration Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.IntegerPropertyImpl <em>Integer Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.IntegerPropertyImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getIntegerProperty()
     * @generated
     */
    int INTEGER_PROPERTY = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__NULLABLE = PROPERTY__NULLABLE;

    /**
     * The feature id for the '<em><b>Persistency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

    /**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__HAS_DEFAULT = PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Min Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__MIN_VALUE = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__MAX_VALUE = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY__DEFAULT_VALUE = PROPERTY_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Integer Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.StringPropertyImpl <em>String Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.StringPropertyImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getStringProperty()
     * @generated
     */
    int STRING_PROPERTY = 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__NULLABLE = PROPERTY__NULLABLE;

    /**
     * The feature id for the '<em><b>Persistency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

    /**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__HAS_DEFAULT = PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Regular Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__REGULAR_EXPRESSION = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Min Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__MIN_LENGTH = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Max Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__MAX_LENGTH = PROPERTY_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY__DEFAULT_VALUE = PROPERTY_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>String Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.BlobBinaryPropertyImpl <em>Blob Binary Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.BlobBinaryPropertyImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBlobBinaryProperty()
     * @generated
     */
    int BLOB_BINARY_PROPERTY = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_BINARY_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_BINARY_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_BINARY_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_BINARY_PROPERTY__NULLABLE = PROPERTY__NULLABLE;

    /**
     * The feature id for the '<em><b>Persistency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_BINARY_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

    /**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_BINARY_PROPERTY__HAS_DEFAULT = PROPERTY__HAS_DEFAULT;

    /**
     * The number of structural features of the '<em>Blob Binary Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_BINARY_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.BlobTextPropertyImpl <em>Blob Text Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.BlobTextPropertyImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBlobTextProperty()
     * @generated
     */
    int BLOB_TEXT_PROPERTY = 14;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_TEXT_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_TEXT_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_TEXT_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_TEXT_PROPERTY__NULLABLE = PROPERTY__NULLABLE;

    /**
     * The feature id for the '<em><b>Persistency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_TEXT_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

    /**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_TEXT_PROPERTY__HAS_DEFAULT = PROPERTY__HAS_DEFAULT;

    /**
     * The number of structural features of the '<em>Blob Text Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOB_TEXT_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.AssociationImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getAssociation()
     * @generated
     */
    int ASSOCIATION = 15;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__SOURCE = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__TARGET = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Source Role Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__SOURCE_ROLE_NAME = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Source Multiplicity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__SOURCE_MULTIPLICITY = MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Target Role Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__TARGET_ROLE_NAME = MODEL_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Target Multiplicity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__TARGET_MULTIPLICITY = MODEL_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Composite</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__COMPOSITE = MODEL_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__BIDIRECTIONAL = MODEL_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Association</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.impl.DecimalPropertyImpl <em>Decimal Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.impl.DecimalPropertyImpl
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getDecimalProperty()
     * @generated
     */
    int DECIMAL_PROPERTY = 16;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__NULLABLE = PROPERTY__NULLABLE;

    /**
     * The feature id for the '<em><b>Persistency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

    /**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__HAS_DEFAULT = PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Min Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__MIN_VALUE = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__MAX_VALUE = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__MIN_INCLUSIVE = PROPERTY_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__MAX_INCLUSIVE = PROPERTY_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY__DEFAULT_VALUE = PROPERTY_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Decimal Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.InheritanceModifier <em>Inheritance Modifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.InheritanceModifier
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getInheritanceModifier()
     * @generated
     */
    int INHERITANCE_MODIFIER = 17;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.Multiplicity <em>Multiplicity</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.Multiplicity
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getMultiplicity()
     * @generated
     */
    int MULTIPLICITY = 18;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.DateTimeAccuracy <em>Date Time Accuracy</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.DateTimeAccuracy
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getDateTimeAccuracy()
     * @generated
     */
    int DATE_TIME_ACCURACY = 19;

    /**
     * The meta object id for the '{@link BusinessDomainDsl.PersistencyMode <em>Persistency Mode</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see BusinessDomainDsl.PersistencyMode
     * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getPersistencyMode()
     * @generated
     */
    int PERSISTENCY_MODE = 20;


    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.ModelElement <em>Model Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model Element</em>'.
     * @see BusinessDomainDsl.ModelElement
     * @generated
     */
    EClass getModelElement();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.ModelElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see BusinessDomainDsl.ModelElement#getName()
     * @see #getModelElement()
     * @generated
     */
    EAttribute getModelElement_Name();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.ModelElement#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see BusinessDomainDsl.ModelElement#getDescription()
     * @see #getModelElement()
     * @generated
     */
    EAttribute getModelElement_Description();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.BusinessDomainModel <em>Business Domain Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Domain Model</em>'.
     * @see BusinessDomainDsl.BusinessDomainModel
     * @generated
     */
    EClass getBusinessDomainModel();

    /**
     * Returns the meta object for the containment reference list '{@link BusinessDomainDsl.BusinessDomainModel#getEnumerations <em>Enumerations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Enumerations</em>'.
     * @see BusinessDomainDsl.BusinessDomainModel#getEnumerations()
     * @see #getBusinessDomainModel()
     * @generated
     */
    EReference getBusinessDomainModel_Enumerations();

    /**
     * Returns the meta object for the containment reference list '{@link BusinessDomainDsl.BusinessDomainModel#getTypes <em>Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Types</em>'.
     * @see BusinessDomainDsl.BusinessDomainModel#getTypes()
     * @see #getBusinessDomainModel()
     * @generated
     */
    EReference getBusinessDomainModel_Types();

    /**
     * Returns the meta object for the containment reference list '{@link BusinessDomainDsl.BusinessDomainModel#getAssociations <em>Associations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Associations</em>'.
     * @see BusinessDomainDsl.BusinessDomainModel#getAssociations()
     * @see #getBusinessDomainModel()
     * @generated
     */
    EReference getBusinessDomainModel_Associations();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.BusinessClass <em>Business Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Class</em>'.
     * @see BusinessDomainDsl.BusinessClass
     * @generated
     */
    EClass getBusinessClass();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.BusinessClass#getInheritanceModifier <em>Inheritance Modifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Inheritance Modifier</em>'.
     * @see BusinessDomainDsl.BusinessClass#getInheritanceModifier()
     * @see #getBusinessClass()
     * @generated
     */
    EAttribute getBusinessClass_InheritanceModifier();

    /**
     * Returns the meta object for the containment reference list '{@link BusinessDomainDsl.BusinessClass#getBusinessRules <em>Business Rules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Business Rules</em>'.
     * @see BusinessDomainDsl.BusinessClass#getBusinessRules()
     * @see #getBusinessClass()
     * @generated
     */
    EReference getBusinessClass_BusinessRules();

    /**
     * Returns the meta object for the reference '{@link BusinessDomainDsl.BusinessClass#getSuperclass <em>Superclass</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Superclass</em>'.
     * @see BusinessDomainDsl.BusinessClass#getSuperclass()
     * @see #getBusinessClass()
     * @generated
     */
    EReference getBusinessClass_Superclass();

    /**
     * Returns the meta object for the reference list '{@link BusinessDomainDsl.BusinessClass#getAssociationsTo <em>Associations To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Associations To</em>'.
     * @see BusinessDomainDsl.BusinessClass#getAssociationsTo()
     * @see #getBusinessClass()
     * @generated
     */
    EReference getBusinessClass_AssociationsTo();

    /**
     * Returns the meta object for the reference list '{@link BusinessDomainDsl.BusinessClass#getAssociationsFrom <em>Associations From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Associations From</em>'.
     * @see BusinessDomainDsl.BusinessClass#getAssociationsFrom()
     * @see #getBusinessClass()
     * @generated
     */
    EReference getBusinessClass_AssociationsFrom();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see BusinessDomainDsl.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.Property#getDataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Type</em>'.
     * @see BusinessDomainDsl.Property#getDataType()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_DataType();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.Property#isNullable <em>Nullable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nullable</em>'.
     * @see BusinessDomainDsl.Property#isNullable()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Nullable();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.Property#getPersistency <em>Persistency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Persistency</em>'.
     * @see BusinessDomainDsl.Property#getPersistency()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Persistency();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.Property#isHasDefault <em>Has Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Has Default</em>'.
     * @see BusinessDomainDsl.Property#isHasDefault()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_HasDefault();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.Enumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enumeration</em>'.
     * @see BusinessDomainDsl.Enumeration
     * @generated
     */
    EClass getEnumeration();

    /**
     * Returns the meta object for the containment reference list '{@link BusinessDomainDsl.Enumeration#getEnumerationLiterals <em>Enumeration Literals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Enumeration Literals</em>'.
     * @see BusinessDomainDsl.Enumeration#getEnumerationLiterals()
     * @see #getEnumeration()
     * @generated
     */
    EReference getEnumeration_EnumerationLiterals();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.EnumerationLiteral <em>Enumeration Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enumeration Literal</em>'.
     * @see BusinessDomainDsl.EnumerationLiteral
     * @generated
     */
    EClass getEnumerationLiteral();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.EnumerationLiteral#getPersistedValue <em>Persisted Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Persisted Value</em>'.
     * @see BusinessDomainDsl.EnumerationLiteral#getPersistedValue()
     * @see #getEnumerationLiteral()
     * @generated
     */
    EAttribute getEnumerationLiteral_PersistedValue();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.BusinessRule <em>Business Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Rule</em>'.
     * @see BusinessDomainDsl.BusinessRule
     * @generated
     */
    EClass getBusinessRule();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.BoolProperty <em>Bool Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bool Property</em>'.
     * @see BusinessDomainDsl.BoolProperty
     * @generated
     */
    EClass getBoolProperty();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.BoolProperty#isDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see BusinessDomainDsl.BoolProperty#isDefaultValue()
     * @see #getBoolProperty()
     * @generated
     */
    EAttribute getBoolProperty_DefaultValue();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.DateTimeProperty <em>Date Time Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Date Time Property</em>'.
     * @see BusinessDomainDsl.DateTimeProperty
     * @generated
     */
    EClass getDateTimeProperty();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.DateTimeProperty#getAccuracy <em>Accuracy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Accuracy</em>'.
     * @see BusinessDomainDsl.DateTimeProperty#getAccuracy()
     * @see #getDateTimeProperty()
     * @generated
     */
    EAttribute getDateTimeProperty_Accuracy();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.DateTimeProperty#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see BusinessDomainDsl.DateTimeProperty#getDefaultValue()
     * @see #getDateTimeProperty()
     * @generated
     */
    EAttribute getDateTimeProperty_DefaultValue();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.EnumerationProperty <em>Enumeration Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enumeration Property</em>'.
     * @see BusinessDomainDsl.EnumerationProperty
     * @generated
     */
    EClass getEnumerationProperty();

    /**
     * Returns the meta object for the reference '{@link BusinessDomainDsl.EnumerationProperty#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see BusinessDomainDsl.EnumerationProperty#getType()
     * @see #getEnumerationProperty()
     * @generated
     */
    EReference getEnumerationProperty_Type();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.EnumerationProperty#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see BusinessDomainDsl.EnumerationProperty#getDefaultValue()
     * @see #getEnumerationProperty()
     * @generated
     */
    EAttribute getEnumerationProperty_DefaultValue();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.IntegerProperty <em>Integer Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Integer Property</em>'.
     * @see BusinessDomainDsl.IntegerProperty
     * @generated
     */
    EClass getIntegerProperty();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IntegerProperty#getMinValue <em>Min Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Value</em>'.
     * @see BusinessDomainDsl.IntegerProperty#getMinValue()
     * @see #getIntegerProperty()
     * @generated
     */
    EAttribute getIntegerProperty_MinValue();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IntegerProperty#getMaxValue <em>Max Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Value</em>'.
     * @see BusinessDomainDsl.IntegerProperty#getMaxValue()
     * @see #getIntegerProperty()
     * @generated
     */
    EAttribute getIntegerProperty_MaxValue();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.IntegerProperty#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see BusinessDomainDsl.IntegerProperty#getDefaultValue()
     * @see #getIntegerProperty()
     * @generated
     */
    EAttribute getIntegerProperty_DefaultValue();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.StringProperty <em>String Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>String Property</em>'.
     * @see BusinessDomainDsl.StringProperty
     * @generated
     */
    EClass getStringProperty();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.StringProperty#getRegularExpression <em>Regular Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Regular Expression</em>'.
     * @see BusinessDomainDsl.StringProperty#getRegularExpression()
     * @see #getStringProperty()
     * @generated
     */
    EAttribute getStringProperty_RegularExpression();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.StringProperty#getMinLength <em>Min Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Length</em>'.
     * @see BusinessDomainDsl.StringProperty#getMinLength()
     * @see #getStringProperty()
     * @generated
     */
    EAttribute getStringProperty_MinLength();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.StringProperty#getMaxLength <em>Max Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Length</em>'.
     * @see BusinessDomainDsl.StringProperty#getMaxLength()
     * @see #getStringProperty()
     * @generated
     */
    EAttribute getStringProperty_MaxLength();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.StringProperty#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see BusinessDomainDsl.StringProperty#getDefaultValue()
     * @see #getStringProperty()
     * @generated
     */
    EAttribute getStringProperty_DefaultValue();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.AbstractType <em>Abstract Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Type</em>'.
     * @see BusinessDomainDsl.AbstractType
     * @generated
     */
    EClass getAbstractType();

    /**
     * Returns the meta object for the containment reference list '{@link BusinessDomainDsl.AbstractType#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see BusinessDomainDsl.AbstractType#getProperties()
     * @see #getAbstractType()
     * @generated
     */
    EReference getAbstractType_Properties();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.BlobBinaryProperty <em>Blob Binary Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Blob Binary Property</em>'.
     * @see BusinessDomainDsl.BlobBinaryProperty
     * @generated
     */
    EClass getBlobBinaryProperty();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.BlobTextProperty <em>Blob Text Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Blob Text Property</em>'.
     * @see BusinessDomainDsl.BlobTextProperty
     * @generated
     */
    EClass getBlobTextProperty();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.Association <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Association</em>'.
     * @see BusinessDomainDsl.Association
     * @generated
     */
    EClass getAssociation();

    /**
     * Returns the meta object for the reference '{@link BusinessDomainDsl.Association#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see BusinessDomainDsl.Association#getSource()
     * @see #getAssociation()
     * @generated
     */
    EReference getAssociation_Source();

    /**
     * Returns the meta object for the reference '{@link BusinessDomainDsl.Association#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see BusinessDomainDsl.Association#getTarget()
     * @see #getAssociation()
     * @generated
     */
    EReference getAssociation_Target();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.Association#getSourceRoleName <em>Source Role Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Role Name</em>'.
     * @see BusinessDomainDsl.Association#getSourceRoleName()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_SourceRoleName();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.Association#getSourceMultiplicity <em>Source Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Multiplicity</em>'.
     * @see BusinessDomainDsl.Association#getSourceMultiplicity()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_SourceMultiplicity();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.Association#getTargetRoleName <em>Target Role Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Role Name</em>'.
     * @see BusinessDomainDsl.Association#getTargetRoleName()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_TargetRoleName();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.Association#getTargetMultiplicity <em>Target Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Multiplicity</em>'.
     * @see BusinessDomainDsl.Association#getTargetMultiplicity()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_TargetMultiplicity();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.Association#isComposite <em>Composite</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Composite</em>'.
     * @see BusinessDomainDsl.Association#isComposite()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_Composite();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.Association#isBidirectional <em>Bidirectional</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Bidirectional</em>'.
     * @see BusinessDomainDsl.Association#isBidirectional()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_Bidirectional();

    /**
     * Returns the meta object for class '{@link BusinessDomainDsl.DecimalProperty <em>Decimal Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Decimal Property</em>'.
     * @see BusinessDomainDsl.DecimalProperty
     * @generated
     */
    EClass getDecimalProperty();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.DecimalProperty#getMinValue <em>Min Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Value</em>'.
     * @see BusinessDomainDsl.DecimalProperty#getMinValue()
     * @see #getDecimalProperty()
     * @generated
     */
    EAttribute getDecimalProperty_MinValue();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.DecimalProperty#getMaxValue <em>Max Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Value</em>'.
     * @see BusinessDomainDsl.DecimalProperty#getMaxValue()
     * @see #getDecimalProperty()
     * @generated
     */
    EAttribute getDecimalProperty_MaxValue();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.DecimalProperty#isMinInclusive <em>Min Inclusive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Inclusive</em>'.
     * @see BusinessDomainDsl.DecimalProperty#isMinInclusive()
     * @see #getDecimalProperty()
     * @generated
     */
    EAttribute getDecimalProperty_MinInclusive();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.DecimalProperty#isMaxInclusive <em>Max Inclusive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Inclusive</em>'.
     * @see BusinessDomainDsl.DecimalProperty#isMaxInclusive()
     * @see #getDecimalProperty()
     * @generated
     */
    EAttribute getDecimalProperty_MaxInclusive();

    /**
     * Returns the meta object for the attribute '{@link BusinessDomainDsl.DecimalProperty#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see BusinessDomainDsl.DecimalProperty#getDefaultValue()
     * @see #getDecimalProperty()
     * @generated
     */
    EAttribute getDecimalProperty_DefaultValue();

    /**
     * Returns the meta object for enum '{@link BusinessDomainDsl.InheritanceModifier <em>Inheritance Modifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Inheritance Modifier</em>'.
     * @see BusinessDomainDsl.InheritanceModifier
     * @generated
     */
    EEnum getInheritanceModifier();

    /**
     * Returns the meta object for enum '{@link BusinessDomainDsl.Multiplicity <em>Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Multiplicity</em>'.
     * @see BusinessDomainDsl.Multiplicity
     * @generated
     */
    EEnum getMultiplicity();

    /**
     * Returns the meta object for enum '{@link BusinessDomainDsl.DateTimeAccuracy <em>Date Time Accuracy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Date Time Accuracy</em>'.
     * @see BusinessDomainDsl.DateTimeAccuracy
     * @generated
     */
    EEnum getDateTimeAccuracy();

    /**
     * Returns the meta object for enum '{@link BusinessDomainDsl.PersistencyMode <em>Persistency Mode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Persistency Mode</em>'.
     * @see BusinessDomainDsl.PersistencyMode
     * @generated
     */
    EEnum getPersistencyMode();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    BusinessDomainDslFactory getBusinessDomainDslFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.ModelElementImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getModelElement()
         * @generated
         */
        EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getModelElement_Description();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.BusinessDomainModelImpl <em>Business Domain Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.BusinessDomainModelImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBusinessDomainModel()
         * @generated
         */
        EClass BUSINESS_DOMAIN_MODEL = eINSTANCE.getBusinessDomainModel();

        /**
         * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_DOMAIN_MODEL__ENUMERATIONS = eINSTANCE.getBusinessDomainModel_Enumerations();

        /**
         * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_DOMAIN_MODEL__TYPES = eINSTANCE.getBusinessDomainModel_Types();

        /**
         * The meta object literal for the '<em><b>Associations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_DOMAIN_MODEL__ASSOCIATIONS = eINSTANCE.getBusinessDomainModel_Associations();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.BusinessClassImpl <em>Business Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.BusinessClassImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBusinessClass()
         * @generated
         */
        EClass BUSINESS_CLASS = eINSTANCE.getBusinessClass();

        /**
         * The meta object literal for the '<em><b>Inheritance Modifier</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BUSINESS_CLASS__INHERITANCE_MODIFIER = eINSTANCE.getBusinessClass_InheritanceModifier();

        /**
         * The meta object literal for the '<em><b>Business Rules</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_CLASS__BUSINESS_RULES = eINSTANCE.getBusinessClass_BusinessRules();

        /**
         * The meta object literal for the '<em><b>Superclass</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_CLASS__SUPERCLASS = eINSTANCE.getBusinessClass_Superclass();

        /**
         * The meta object literal for the '<em><b>Associations To</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_CLASS__ASSOCIATIONS_TO = eINSTANCE.getBusinessClass_AssociationsTo();

        /**
         * The meta object literal for the '<em><b>Associations From</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_CLASS__ASSOCIATIONS_FROM = eINSTANCE.getBusinessClass_AssociationsFrom();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.PropertyImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
         * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__DATA_TYPE = eINSTANCE.getProperty_DataType();

        /**
         * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__NULLABLE = eINSTANCE.getProperty_Nullable();

        /**
         * The meta object literal for the '<em><b>Persistency</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__PERSISTENCY = eINSTANCE.getProperty_Persistency();

        /**
         * The meta object literal for the '<em><b>Has Default</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__HAS_DEFAULT = eINSTANCE.getProperty_HasDefault();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.EnumerationImpl <em>Enumeration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.EnumerationImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getEnumeration()
         * @generated
         */
        EClass ENUMERATION = eINSTANCE.getEnumeration();

        /**
         * The meta object literal for the '<em><b>Enumeration Literals</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATION__ENUMERATION_LITERALS = eINSTANCE.getEnumeration_EnumerationLiterals();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.EnumerationLiteralImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getEnumerationLiteral()
         * @generated
         */
        EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

        /**
         * The meta object literal for the '<em><b>Persisted Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENUMERATION_LITERAL__PERSISTED_VALUE = eINSTANCE.getEnumerationLiteral_PersistedValue();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.BusinessRuleImpl <em>Business Rule</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.BusinessRuleImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBusinessRule()
         * @generated
         */
        EClass BUSINESS_RULE = eINSTANCE.getBusinessRule();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.BoolPropertyImpl <em>Bool Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.BoolPropertyImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBoolProperty()
         * @generated
         */
        EClass BOOL_PROPERTY = eINSTANCE.getBoolProperty();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOL_PROPERTY__DEFAULT_VALUE = eINSTANCE.getBoolProperty_DefaultValue();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.DateTimePropertyImpl <em>Date Time Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.DateTimePropertyImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getDateTimeProperty()
         * @generated
         */
        EClass DATE_TIME_PROPERTY = eINSTANCE.getDateTimeProperty();

        /**
         * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATE_TIME_PROPERTY__ACCURACY = eINSTANCE.getDateTimeProperty_Accuracy();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATE_TIME_PROPERTY__DEFAULT_VALUE = eINSTANCE.getDateTimeProperty_DefaultValue();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.EnumerationPropertyImpl <em>Enumeration Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.EnumerationPropertyImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getEnumerationProperty()
         * @generated
         */
        EClass ENUMERATION_PROPERTY = eINSTANCE.getEnumerationProperty();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATION_PROPERTY__TYPE = eINSTANCE.getEnumerationProperty_Type();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENUMERATION_PROPERTY__DEFAULT_VALUE = eINSTANCE.getEnumerationProperty_DefaultValue();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.IntegerPropertyImpl <em>Integer Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.IntegerPropertyImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getIntegerProperty()
         * @generated
         */
        EClass INTEGER_PROPERTY = eINSTANCE.getIntegerProperty();

        /**
         * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTEGER_PROPERTY__MIN_VALUE = eINSTANCE.getIntegerProperty_MinValue();

        /**
         * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTEGER_PROPERTY__MAX_VALUE = eINSTANCE.getIntegerProperty_MaxValue();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTEGER_PROPERTY__DEFAULT_VALUE = eINSTANCE.getIntegerProperty_DefaultValue();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.StringPropertyImpl <em>String Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.StringPropertyImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getStringProperty()
         * @generated
         */
        EClass STRING_PROPERTY = eINSTANCE.getStringProperty();

        /**
         * The meta object literal for the '<em><b>Regular Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_PROPERTY__REGULAR_EXPRESSION = eINSTANCE.getStringProperty_RegularExpression();

        /**
         * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_PROPERTY__MIN_LENGTH = eINSTANCE.getStringProperty_MinLength();

        /**
         * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_PROPERTY__MAX_LENGTH = eINSTANCE.getStringProperty_MaxLength();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_PROPERTY__DEFAULT_VALUE = eINSTANCE.getStringProperty_DefaultValue();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.AbstractTypeImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getAbstractType()
         * @generated
         */
        EClass ABSTRACT_TYPE = eINSTANCE.getAbstractType();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_TYPE__PROPERTIES = eINSTANCE.getAbstractType_Properties();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.BlobBinaryPropertyImpl <em>Blob Binary Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.BlobBinaryPropertyImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBlobBinaryProperty()
         * @generated
         */
        EClass BLOB_BINARY_PROPERTY = eINSTANCE.getBlobBinaryProperty();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.BlobTextPropertyImpl <em>Blob Text Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.BlobTextPropertyImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBlobTextProperty()
         * @generated
         */
        EClass BLOB_TEXT_PROPERTY = eINSTANCE.getBlobTextProperty();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.AssociationImpl <em>Association</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.AssociationImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getAssociation()
         * @generated
         */
        EClass ASSOCIATION = eINSTANCE.getAssociation();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSOCIATION__SOURCE = eINSTANCE.getAssociation_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSOCIATION__TARGET = eINSTANCE.getAssociation_Target();

        /**
         * The meta object literal for the '<em><b>Source Role Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSOCIATION__SOURCE_ROLE_NAME = eINSTANCE.getAssociation_SourceRoleName();

        /**
         * The meta object literal for the '<em><b>Source Multiplicity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSOCIATION__SOURCE_MULTIPLICITY = eINSTANCE.getAssociation_SourceMultiplicity();

        /**
         * The meta object literal for the '<em><b>Target Role Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSOCIATION__TARGET_ROLE_NAME = eINSTANCE.getAssociation_TargetRoleName();

        /**
         * The meta object literal for the '<em><b>Target Multiplicity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSOCIATION__TARGET_MULTIPLICITY = eINSTANCE.getAssociation_TargetMultiplicity();

        /**
         * The meta object literal for the '<em><b>Composite</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSOCIATION__COMPOSITE = eINSTANCE.getAssociation_Composite();

        /**
         * The meta object literal for the '<em><b>Bidirectional</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSOCIATION__BIDIRECTIONAL = eINSTANCE.getAssociation_Bidirectional();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.impl.DecimalPropertyImpl <em>Decimal Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.impl.DecimalPropertyImpl
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getDecimalProperty()
         * @generated
         */
        EClass DECIMAL_PROPERTY = eINSTANCE.getDecimalProperty();

        /**
         * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_PROPERTY__MIN_VALUE = eINSTANCE.getDecimalProperty_MinValue();

        /**
         * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_PROPERTY__MAX_VALUE = eINSTANCE.getDecimalProperty_MaxValue();

        /**
         * The meta object literal for the '<em><b>Min Inclusive</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_PROPERTY__MIN_INCLUSIVE = eINSTANCE.getDecimalProperty_MinInclusive();

        /**
         * The meta object literal for the '<em><b>Max Inclusive</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_PROPERTY__MAX_INCLUSIVE = eINSTANCE.getDecimalProperty_MaxInclusive();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_PROPERTY__DEFAULT_VALUE = eINSTANCE.getDecimalProperty_DefaultValue();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.InheritanceModifier <em>Inheritance Modifier</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.InheritanceModifier
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getInheritanceModifier()
         * @generated
         */
        EEnum INHERITANCE_MODIFIER = eINSTANCE.getInheritanceModifier();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.Multiplicity <em>Multiplicity</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.Multiplicity
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getMultiplicity()
         * @generated
         */
        EEnum MULTIPLICITY = eINSTANCE.getMultiplicity();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.DateTimeAccuracy <em>Date Time Accuracy</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.DateTimeAccuracy
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getDateTimeAccuracy()
         * @generated
         */
        EEnum DATE_TIME_ACCURACY = eINSTANCE.getDateTimeAccuracy();

        /**
         * The meta object literal for the '{@link BusinessDomainDsl.PersistencyMode <em>Persistency Mode</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see BusinessDomainDsl.PersistencyMode
         * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getPersistencyMode()
         * @generated
         */
        EEnum PERSISTENCY_MODE = eINSTANCE.getPersistencyMode();

    }

} //BusinessDomainDslPackage
