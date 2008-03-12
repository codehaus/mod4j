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
	 * The meta object id for the '{@link BusinessDomainDsl.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.impl.NamedElementImpl
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

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
	int BUSINESS_DOMAIN_MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Auto Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN_MODEL__AUTO_GENERATE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Business Process Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN_MODEL__BUSINESS_PROCESS_PROJECT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Business Process Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN_MODEL__BUSINESS_PROCESS_DIRECTORY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Host Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN_MODEL__SERVICE_HOST_PROJECT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Database Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN_MODEL__DATABASE_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN_MODEL__DATABASE_NAME = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN_MODEL__COMMENT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN_MODEL__ENUMERATION = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Property Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN_MODEL__PROPERTY_CONTAINER = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN_MODEL__ASSOCIATIONS = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Business Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.impl.CommentableElementImpl <em>Commentable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.impl.CommentableElementImpl
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getCommentableElement()
	 * @generated
	 */
	int COMMENTABLE_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTABLE_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTABLE_ELEMENT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Commentable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTABLE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.impl.PropertyContainerImpl <em>Property Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.impl.PropertyContainerImpl
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getPropertyContainer()
	 * @generated
	 */
	int PROPERTY_CONTAINER = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTAINER__NAME = COMMENTABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTAINER__DESCRIPTION = COMMENTABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTAINER__PROPERTY = COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTAINER_FEATURE_COUNT = COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

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
	int BUSINESS_CLASS__NAME = PROPERTY_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS__DESCRIPTION = PROPERTY_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS__PROPERTY = PROPERTY_CONTAINER__PROPERTY;

	/**
	 * The feature id for the '<em><b>Inheritance Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS__INHERITANCE_MODIFIER = PROPERTY_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Auto Generate Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS__AUTO_GENERATE_MAPPING = PROPERTY_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Business Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS__BUSINESS_RULE = PROPERTY_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Composition Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS__COMPOSITION_TARGET = PROPERTY_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS__BASE_CLASS = PROPERTY_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS__CONSTRAINT = PROPERTY_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Association To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS__ASSOCIATION_TO = PROPERTY_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Association From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS__ASSOCIATION_FROM = PROPERTY_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Business Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS_FEATURE_COUNT = PROPERTY_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.impl.CommentImpl
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TEXT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commentable Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENTABLE_ELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.impl.PropertyImpl
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DATA_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NULLABLE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEFAULT_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Use As Logical Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__USE_AS_LOGICAL_ID = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Persistency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PERSISTENCY = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.impl.EnumerationImpl
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = COMMENTABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__DESCRIPTION = COMMENTABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Persist As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__PERSIST_AS_STRING = COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enumeration Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ENUMERATION_LITERAL = COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.impl.EnumerationLiteralImpl
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Persisted Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__PERSISTED_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.impl.BusinessRuleImpl <em>Business Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.impl.BusinessRuleImpl
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBusinessRule()
	 * @generated
	 */
	int BUSINESS_RULE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Business Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.impl.BoolPropertyImpl <em>Bool Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.impl.BoolPropertyImpl
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBoolProperty()
	 * @generated
	 */
	int BOOL_PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_PROPERTY__NAME = PROPERTY__NAME;

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
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_PROPERTY__DEFAULT_VALUE = PROPERTY__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Use As Logical Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_PROPERTY__USE_AS_LOGICAL_ID = PROPERTY__USE_AS_LOGICAL_ID;

	/**
	 * The feature id for the '<em><b>Persistency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Bool Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.impl.DateTimePropertyImpl <em>Date Time Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.impl.DateTimePropertyImpl
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getDateTimeProperty()
	 * @generated
	 */
	int DATE_TIME_PROPERTY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PROPERTY__NAME = PROPERTY__NAME;

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
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PROPERTY__DEFAULT_VALUE = PROPERTY__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Use As Logical Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PROPERTY__USE_AS_LOGICAL_ID = PROPERTY__USE_AS_LOGICAL_ID;

	/**
	 * The feature id for the '<em><b>Persistency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PROPERTY__ACCURACY = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Time Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.impl.CustomPropertyImpl <em>Custom Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.impl.CustomPropertyImpl
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getCustomProperty()
	 * @generated
	 */
	int CUSTOM_PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY__NULLABLE = PROPERTY__NULLABLE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY__DEFAULT_VALUE = PROPERTY__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Use As Logical Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY__USE_AS_LOGICAL_ID = PROPERTY__USE_AS_LOGICAL_ID;

	/**
	 * The feature id for the '<em><b>Persistency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Custom Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY__CUSTOM_DATA_TYPE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY__ENUMERATION = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY__NAMESPACE = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Custom Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.impl.NumberPropertyImpl <em>Number Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.impl.NumberPropertyImpl
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getNumberProperty()
	 * @generated
	 */
	int NUMBER_PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY__NULLABLE = PROPERTY__NULLABLE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY__DEFAULT_VALUE = PROPERTY__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Use As Logical Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY__USE_AS_LOGICAL_ID = PROPERTY__USE_AS_LOGICAL_ID;

	/**
	 * The feature id for the '<em><b>Persistency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY__MIN_VALUE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY__MAX_VALUE = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY__MIN_INCLUSIVE = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY__MAX_INCLUSIVE = PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Number Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.impl.StringPropertyImpl <em>String Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.impl.StringPropertyImpl
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getStringProperty()
	 * @generated
	 */
	int STRING_PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY__NAME = PROPERTY__NAME;

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
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY__DEFAULT_VALUE = PROPERTY__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Use As Logical Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY__USE_AS_LOGICAL_ID = PROPERTY__USE_AS_LOGICAL_ID;

	/**
	 * The feature id for the '<em><b>Persistency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

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
	 * The number of structural features of the '<em>String Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.impl.CustomDataTypeImpl <em>Custom Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.impl.CustomDataTypeImpl
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getCustomDataType()
	 * @generated
	 */
	int CUSTOM_DATA_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DATA_TYPE__NAME = PROPERTY_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DATA_TYPE__DESCRIPTION = PROPERTY_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DATA_TYPE__PROPERTY = PROPERTY_CONTAINER__PROPERTY;

	/**
	 * The feature id for the '<em><b>Auto Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DATA_TYPE__AUTO_GENERATE = PROPERTY_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DATA_TYPE_FEATURE_COUNT = PROPERTY_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.impl.BlobBinaryPropertyImpl <em>Blob Binary Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.impl.BlobBinaryPropertyImpl
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getBlobBinaryProperty()
	 * @generated
	 */
	int BLOB_BINARY_PROPERTY = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_BINARY_PROPERTY__NAME = PROPERTY__NAME;

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
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_BINARY_PROPERTY__DEFAULT_VALUE = PROPERTY__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Use As Logical Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_BINARY_PROPERTY__USE_AS_LOGICAL_ID = PROPERTY__USE_AS_LOGICAL_ID;

	/**
	 * The feature id for the '<em><b>Persistency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_BINARY_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_BINARY_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

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
	int BLOB_TEXT_PROPERTY = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_TEXT_PROPERTY__NAME = PROPERTY__NAME;

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
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_TEXT_PROPERTY__DEFAULT_VALUE = PROPERTY__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Use As Logical Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_TEXT_PROPERTY__USE_AS_LOGICAL_ID = PROPERTY__USE_AS_LOGICAL_ID;

	/**
	 * The feature id for the '<em><b>Persistency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_TEXT_PROPERTY__PERSISTENCY = PROPERTY__PERSISTENCY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_TEXT_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Blob Text Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_TEXT_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.impl.ConstraintImpl
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Database Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DATABASE_CONSTRAINT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__RESOURCE_KEY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validation Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__VALIDATION_MESSAGE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.impl.associationImpl <em>association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.impl.associationImpl
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getassociation()
	 * @generated
	 */
	int ASSOCIATION = 19;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Source Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE_ROLE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Source Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE_MULTIPLICITY = 3;

	/**
	 * The feature id for the '<em><b>Target Navigability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_NAVIGABILITY = 4;

	/**
	 * The feature id for the '<em><b>Source Navigability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE_NAVIGABILITY = 5;

	/**
	 * The feature id for the '<em><b>Target Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_ROLE_NAME = 6;

	/**
	 * The feature id for the '<em><b>Target Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_MULTIPLICITY = 7;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_COMPOSITE = 8;

	/**
	 * The number of structural features of the '<em>association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.AccessModifier <em>Access Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.AccessModifier
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getAccessModifier()
	 * @generated
	 */
	int ACCESS_MODIFIER = 20;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.TypeAccessModifier <em>Type Access Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.TypeAccessModifier
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getTypeAccessModifier()
	 * @generated
	 */
	int TYPE_ACCESS_MODIFIER = 21;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.InheritanceModifier <em>Inheritance Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.InheritanceModifier
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getInheritanceModifier()
	 * @generated
	 */
	int INHERITANCE_MODIFIER = 22;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.Multiplicity <em>Multiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.Multiplicity
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 23;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.OperationConcurrency <em>Operation Concurrency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.OperationConcurrency
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getOperationConcurrency()
	 * @generated
	 */
	int OPERATION_CONCURRENCY = 24;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.DateTimeAccuracy <em>Date Time Accuracy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.DateTimeAccuracy
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getDateTimeAccuracy()
	 * @generated
	 */
	int DATE_TIME_ACCURACY = 25;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.PersistencyMode <em>Persistency Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.PersistencyMode
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getPersistencyMode()
	 * @generated
	 */
	int PERSISTENCY_MODE = 26;

	/**
	 * The meta object id for the '{@link BusinessDomainDsl.DatabaseType <em>Database Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BusinessDomainDsl.DatabaseType
	 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getDatabaseType()
	 * @generated
	 */
	int DATABASE_TYPE = 27;


	/**
	 * Returns the meta object for class '{@link BusinessDomainDsl.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see BusinessDomainDsl.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BusinessDomainDsl.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

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
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.BusinessDomainModel#isAutoGenerate <em>Auto Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Generate</em>'.
	 * @see BusinessDomainDsl.BusinessDomainModel#isAutoGenerate()
	 * @see #getBusinessDomainModel()
	 * @generated
	 */
	EAttribute getBusinessDomainModel_AutoGenerate();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.BusinessDomainModel#getBusinessProcessProject <em>Business Process Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Process Project</em>'.
	 * @see BusinessDomainDsl.BusinessDomainModel#getBusinessProcessProject()
	 * @see #getBusinessDomainModel()
	 * @generated
	 */
	EAttribute getBusinessDomainModel_BusinessProcessProject();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.BusinessDomainModel#getBusinessProcessDirectory <em>Business Process Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Process Directory</em>'.
	 * @see BusinessDomainDsl.BusinessDomainModel#getBusinessProcessDirectory()
	 * @see #getBusinessDomainModel()
	 * @generated
	 */
	EAttribute getBusinessDomainModel_BusinessProcessDirectory();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.BusinessDomainModel#getServiceHostProject <em>Service Host Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Host Project</em>'.
	 * @see BusinessDomainDsl.BusinessDomainModel#getServiceHostProject()
	 * @see #getBusinessDomainModel()
	 * @generated
	 */
	EAttribute getBusinessDomainModel_ServiceHostProject();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.BusinessDomainModel#getDatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Type</em>'.
	 * @see BusinessDomainDsl.BusinessDomainModel#getDatabaseType()
	 * @see #getBusinessDomainModel()
	 * @generated
	 */
	EAttribute getBusinessDomainModel_DatabaseType();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.BusinessDomainModel#getDatabaseName <em>Database Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Name</em>'.
	 * @see BusinessDomainDsl.BusinessDomainModel#getDatabaseName()
	 * @see #getBusinessDomainModel()
	 * @generated
	 */
	EAttribute getBusinessDomainModel_DatabaseName();

	/**
	 * Returns the meta object for the containment reference list '{@link BusinessDomainDsl.BusinessDomainModel#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comment</em>'.
	 * @see BusinessDomainDsl.BusinessDomainModel#getComment()
	 * @see #getBusinessDomainModel()
	 * @generated
	 */
	EReference getBusinessDomainModel_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link BusinessDomainDsl.BusinessDomainModel#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration</em>'.
	 * @see BusinessDomainDsl.BusinessDomainModel#getEnumeration()
	 * @see #getBusinessDomainModel()
	 * @generated
	 */
	EReference getBusinessDomainModel_Enumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link BusinessDomainDsl.BusinessDomainModel#getPropertyContainer <em>Property Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Container</em>'.
	 * @see BusinessDomainDsl.BusinessDomainModel#getPropertyContainer()
	 * @see #getBusinessDomainModel()
	 * @generated
	 */
	EReference getBusinessDomainModel_PropertyContainer();

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
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.BusinessClass#isAutoGenerateMapping <em>Auto Generate Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Generate Mapping</em>'.
	 * @see BusinessDomainDsl.BusinessClass#isAutoGenerateMapping()
	 * @see #getBusinessClass()
	 * @generated
	 */
	EAttribute getBusinessClass_AutoGenerateMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link BusinessDomainDsl.BusinessClass#getBusinessRule <em>Business Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Rule</em>'.
	 * @see BusinessDomainDsl.BusinessClass#getBusinessRule()
	 * @see #getBusinessClass()
	 * @generated
	 */
	EReference getBusinessClass_BusinessRule();

	/**
	 * Returns the meta object for the reference list '{@link BusinessDomainDsl.BusinessClass#getCompositionTarget <em>Composition Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composition Target</em>'.
	 * @see BusinessDomainDsl.BusinessClass#getCompositionTarget()
	 * @see #getBusinessClass()
	 * @generated
	 */
	EReference getBusinessClass_CompositionTarget();

	/**
	 * Returns the meta object for the reference '{@link BusinessDomainDsl.BusinessClass#getBaseClass <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see BusinessDomainDsl.BusinessClass#getBaseClass()
	 * @see #getBusinessClass()
	 * @generated
	 */
	EReference getBusinessClass_BaseClass();

	/**
	 * Returns the meta object for the containment reference list '{@link BusinessDomainDsl.BusinessClass#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see BusinessDomainDsl.BusinessClass#getConstraint()
	 * @see #getBusinessClass()
	 * @generated
	 */
	EReference getBusinessClass_Constraint();

	/**
	 * Returns the meta object for the reference list '{@link BusinessDomainDsl.BusinessClass#getAssociationTo <em>Association To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association To</em>'.
	 * @see BusinessDomainDsl.BusinessClass#getAssociationTo()
	 * @see #getBusinessClass()
	 * @generated
	 */
	EReference getBusinessClass_AssociationTo();

	/**
	 * Returns the meta object for the reference list '{@link BusinessDomainDsl.BusinessClass#getAssociationFrom <em>Association From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association From</em>'.
	 * @see BusinessDomainDsl.BusinessClass#getAssociationFrom()
	 * @see #getBusinessClass()
	 * @generated
	 */
	EReference getBusinessClass_AssociationFrom();

	/**
	 * Returns the meta object for class '{@link BusinessDomainDsl.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see BusinessDomainDsl.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.Comment#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see BusinessDomainDsl.Comment#getText()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Text();

	/**
	 * Returns the meta object for the reference list '{@link BusinessDomainDsl.Comment#getCommentableElement <em>Commentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commentable Element</em>'.
	 * @see BusinessDomainDsl.Comment#getCommentableElement()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_CommentableElement();

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
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.Property#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see BusinessDomainDsl.Property#getDefaultValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.Property#isUseAsLogicalId <em>Use As Logical Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use As Logical Id</em>'.
	 * @see BusinessDomainDsl.Property#isUseAsLogicalId()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_UseAsLogicalId();

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
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.Property#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see BusinessDomainDsl.Property#getDescription()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Description();

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
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.Enumeration#isPersistAsString <em>Persist As String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persist As String</em>'.
	 * @see BusinessDomainDsl.Enumeration#isPersistAsString()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_PersistAsString();

	/**
	 * Returns the meta object for the containment reference list '{@link BusinessDomainDsl.Enumeration#getEnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration Literal</em>'.
	 * @see BusinessDomainDsl.Enumeration#getEnumerationLiteral()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_EnumerationLiteral();

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
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.EnumerationLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see BusinessDomainDsl.EnumerationLiteral#getValue()
	 * @see #getEnumerationLiteral()
	 * @generated
	 */
	EAttribute getEnumerationLiteral_Value();

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
	 * Returns the meta object for class '{@link BusinessDomainDsl.CommentableElement <em>Commentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commentable Element</em>'.
	 * @see BusinessDomainDsl.CommentableElement
	 * @generated
	 */
	EClass getCommentableElement();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.CommentableElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see BusinessDomainDsl.CommentableElement#getDescription()
	 * @see #getCommentableElement()
	 * @generated
	 */
	EAttribute getCommentableElement_Description();

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
	 * Returns the meta object for class '{@link BusinessDomainDsl.CustomProperty <em>Custom Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Property</em>'.
	 * @see BusinessDomainDsl.CustomProperty
	 * @generated
	 */
	EClass getCustomProperty();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.CustomProperty#getCustomDataType <em>Custom Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Data Type</em>'.
	 * @see BusinessDomainDsl.CustomProperty#getCustomDataType()
	 * @see #getCustomProperty()
	 * @generated
	 */
	EAttribute getCustomProperty_CustomDataType();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.CustomProperty#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enumeration</em>'.
	 * @see BusinessDomainDsl.CustomProperty#getEnumeration()
	 * @see #getCustomProperty()
	 * @generated
	 */
	EAttribute getCustomProperty_Enumeration();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.CustomProperty#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see BusinessDomainDsl.CustomProperty#getNamespace()
	 * @see #getCustomProperty()
	 * @generated
	 */
	EAttribute getCustomProperty_Namespace();

	/**
	 * Returns the meta object for class '{@link BusinessDomainDsl.NumberProperty <em>Number Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Property</em>'.
	 * @see BusinessDomainDsl.NumberProperty
	 * @generated
	 */
	EClass getNumberProperty();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.NumberProperty#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see BusinessDomainDsl.NumberProperty#getMinValue()
	 * @see #getNumberProperty()
	 * @generated
	 */
	EAttribute getNumberProperty_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.NumberProperty#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see BusinessDomainDsl.NumberProperty#getMaxValue()
	 * @see #getNumberProperty()
	 * @generated
	 */
	EAttribute getNumberProperty_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.NumberProperty#isMinInclusive <em>Min Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Inclusive</em>'.
	 * @see BusinessDomainDsl.NumberProperty#isMinInclusive()
	 * @see #getNumberProperty()
	 * @generated
	 */
	EAttribute getNumberProperty_MinInclusive();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.NumberProperty#isMaxInclusive <em>Max Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Inclusive</em>'.
	 * @see BusinessDomainDsl.NumberProperty#isMaxInclusive()
	 * @see #getNumberProperty()
	 * @generated
	 */
	EAttribute getNumberProperty_MaxInclusive();

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
	 * Returns the meta object for class '{@link BusinessDomainDsl.CustomDataType <em>Custom Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Data Type</em>'.
	 * @see BusinessDomainDsl.CustomDataType
	 * @generated
	 */
	EClass getCustomDataType();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.CustomDataType#isAutoGenerate <em>Auto Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Generate</em>'.
	 * @see BusinessDomainDsl.CustomDataType#isAutoGenerate()
	 * @see #getCustomDataType()
	 * @generated
	 */
	EAttribute getCustomDataType_AutoGenerate();

	/**
	 * Returns the meta object for class '{@link BusinessDomainDsl.PropertyContainer <em>Property Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Container</em>'.
	 * @see BusinessDomainDsl.PropertyContainer
	 * @generated
	 */
	EClass getPropertyContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link BusinessDomainDsl.PropertyContainer#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see BusinessDomainDsl.PropertyContainer#getProperty()
	 * @see #getPropertyContainer()
	 * @generated
	 */
	EReference getPropertyContainer_Property();

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
	 * Returns the meta object for class '{@link BusinessDomainDsl.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see BusinessDomainDsl.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.Constraint#getDatabaseConstraint <em>Database Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Constraint</em>'.
	 * @see BusinessDomainDsl.Constraint#getDatabaseConstraint()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_DatabaseConstraint();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.Constraint#getResourceKey <em>Resource Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Key</em>'.
	 * @see BusinessDomainDsl.Constraint#getResourceKey()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_ResourceKey();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.Constraint#getValidationMessage <em>Validation Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Message</em>'.
	 * @see BusinessDomainDsl.Constraint#getValidationMessage()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_ValidationMessage();

	/**
	 * Returns the meta object for class '{@link BusinessDomainDsl.association <em>association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>association</em>'.
	 * @see BusinessDomainDsl.association
	 * @generated
	 */
	EClass getassociation();

	/**
	 * Returns the meta object for the reference '{@link BusinessDomainDsl.association#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see BusinessDomainDsl.association#getSource()
	 * @see #getassociation()
	 * @generated
	 */
	EReference getassociation_Source();

	/**
	 * Returns the meta object for the reference '{@link BusinessDomainDsl.association#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see BusinessDomainDsl.association#getTarget()
	 * @see #getassociation()
	 * @generated
	 */
	EReference getassociation_Target();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.association#getSourceRoleName <em>Source Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Role Name</em>'.
	 * @see BusinessDomainDsl.association#getSourceRoleName()
	 * @see #getassociation()
	 * @generated
	 */
	EAttribute getassociation_SourceRoleName();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.association#getSourceMultiplicity <em>Source Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Multiplicity</em>'.
	 * @see BusinessDomainDsl.association#getSourceMultiplicity()
	 * @see #getassociation()
	 * @generated
	 */
	EAttribute getassociation_SourceMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.association#isTargetNavigability <em>Target Navigability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Navigability</em>'.
	 * @see BusinessDomainDsl.association#isTargetNavigability()
	 * @see #getassociation()
	 * @generated
	 */
	EAttribute getassociation_TargetNavigability();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.association#isSourceNavigability <em>Source Navigability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Navigability</em>'.
	 * @see BusinessDomainDsl.association#isSourceNavigability()
	 * @see #getassociation()
	 * @generated
	 */
	EAttribute getassociation_SourceNavigability();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.association#getTargetRoleName <em>Target Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Role Name</em>'.
	 * @see BusinessDomainDsl.association#getTargetRoleName()
	 * @see #getassociation()
	 * @generated
	 */
	EAttribute getassociation_TargetRoleName();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.association#getTargetMultiplicity <em>Target Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Multiplicity</em>'.
	 * @see BusinessDomainDsl.association#getTargetMultiplicity()
	 * @see #getassociation()
	 * @generated
	 */
	EAttribute getassociation_TargetMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link BusinessDomainDsl.association#isIsComposite <em>Is Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Composite</em>'.
	 * @see BusinessDomainDsl.association#isIsComposite()
	 * @see #getassociation()
	 * @generated
	 */
	EAttribute getassociation_IsComposite();

	/**
	 * Returns the meta object for enum '{@link BusinessDomainDsl.AccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Modifier</em>'.
	 * @see BusinessDomainDsl.AccessModifier
	 * @generated
	 */
	EEnum getAccessModifier();

	/**
	 * Returns the meta object for enum '{@link BusinessDomainDsl.TypeAccessModifier <em>Type Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Access Modifier</em>'.
	 * @see BusinessDomainDsl.TypeAccessModifier
	 * @generated
	 */
	EEnum getTypeAccessModifier();

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
	 * Returns the meta object for enum '{@link BusinessDomainDsl.OperationConcurrency <em>Operation Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Concurrency</em>'.
	 * @see BusinessDomainDsl.OperationConcurrency
	 * @generated
	 */
	EEnum getOperationConcurrency();

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
	 * Returns the meta object for enum '{@link BusinessDomainDsl.DatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Database Type</em>'.
	 * @see BusinessDomainDsl.DatabaseType
	 * @generated
	 */
	EEnum getDatabaseType();

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
		 * The meta object literal for the '{@link BusinessDomainDsl.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BusinessDomainDsl.impl.NamedElementImpl
		 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

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
		 * The meta object literal for the '<em><b>Auto Generate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_DOMAIN_MODEL__AUTO_GENERATE = eINSTANCE.getBusinessDomainModel_AutoGenerate();

		/**
		 * The meta object literal for the '<em><b>Business Process Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_DOMAIN_MODEL__BUSINESS_PROCESS_PROJECT = eINSTANCE.getBusinessDomainModel_BusinessProcessProject();

		/**
		 * The meta object literal for the '<em><b>Business Process Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_DOMAIN_MODEL__BUSINESS_PROCESS_DIRECTORY = eINSTANCE.getBusinessDomainModel_BusinessProcessDirectory();

		/**
		 * The meta object literal for the '<em><b>Service Host Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_DOMAIN_MODEL__SERVICE_HOST_PROJECT = eINSTANCE.getBusinessDomainModel_ServiceHostProject();

		/**
		 * The meta object literal for the '<em><b>Database Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_DOMAIN_MODEL__DATABASE_TYPE = eINSTANCE.getBusinessDomainModel_DatabaseType();

		/**
		 * The meta object literal for the '<em><b>Database Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_DOMAIN_MODEL__DATABASE_NAME = eINSTANCE.getBusinessDomainModel_DatabaseName();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_DOMAIN_MODEL__COMMENT = eINSTANCE.getBusinessDomainModel_Comment();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_DOMAIN_MODEL__ENUMERATION = eINSTANCE.getBusinessDomainModel_Enumeration();

		/**
		 * The meta object literal for the '<em><b>Property Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_DOMAIN_MODEL__PROPERTY_CONTAINER = eINSTANCE.getBusinessDomainModel_PropertyContainer();

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
		 * The meta object literal for the '<em><b>Auto Generate Mapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_CLASS__AUTO_GENERATE_MAPPING = eINSTANCE.getBusinessClass_AutoGenerateMapping();

		/**
		 * The meta object literal for the '<em><b>Business Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CLASS__BUSINESS_RULE = eINSTANCE.getBusinessClass_BusinessRule();

		/**
		 * The meta object literal for the '<em><b>Composition Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CLASS__COMPOSITION_TARGET = eINSTANCE.getBusinessClass_CompositionTarget();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CLASS__BASE_CLASS = eINSTANCE.getBusinessClass_BaseClass();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CLASS__CONSTRAINT = eINSTANCE.getBusinessClass_Constraint();

		/**
		 * The meta object literal for the '<em><b>Association To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CLASS__ASSOCIATION_TO = eINSTANCE.getBusinessClass_AssociationTo();

		/**
		 * The meta object literal for the '<em><b>Association From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CLASS__ASSOCIATION_FROM = eINSTANCE.getBusinessClass_AssociationFrom();

		/**
		 * The meta object literal for the '{@link BusinessDomainDsl.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BusinessDomainDsl.impl.CommentImpl
		 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__TEXT = eINSTANCE.getComment_Text();

		/**
		 * The meta object literal for the '<em><b>Commentable Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__COMMENTABLE_ELEMENT = eINSTANCE.getComment_CommentableElement();

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
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DEFAULT_VALUE = eINSTANCE.getProperty_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Use As Logical Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__USE_AS_LOGICAL_ID = eINSTANCE.getProperty_UseAsLogicalId();

		/**
		 * The meta object literal for the '<em><b>Persistency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__PERSISTENCY = eINSTANCE.getProperty_Persistency();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

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
		 * The meta object literal for the '<em><b>Persist As String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__PERSIST_AS_STRING = eINSTANCE.getEnumeration_PersistAsString();

		/**
		 * The meta object literal for the '<em><b>Enumeration Literal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__ENUMERATION_LITERAL = eINSTANCE.getEnumeration_EnumerationLiteral();

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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_LITERAL__VALUE = eINSTANCE.getEnumerationLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Persisted Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_LITERAL__PERSISTED_VALUE = eINSTANCE.getEnumerationLiteral_PersistedValue();

		/**
		 * The meta object literal for the '{@link BusinessDomainDsl.impl.CommentableElementImpl <em>Commentable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BusinessDomainDsl.impl.CommentableElementImpl
		 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getCommentableElement()
		 * @generated
		 */
		EClass COMMENTABLE_ELEMENT = eINSTANCE.getCommentableElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENTABLE_ELEMENT__DESCRIPTION = eINSTANCE.getCommentableElement_Description();

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
		 * The meta object literal for the '{@link BusinessDomainDsl.impl.CustomPropertyImpl <em>Custom Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BusinessDomainDsl.impl.CustomPropertyImpl
		 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getCustomProperty()
		 * @generated
		 */
		EClass CUSTOM_PROPERTY = eINSTANCE.getCustomProperty();

		/**
		 * The meta object literal for the '<em><b>Custom Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_PROPERTY__CUSTOM_DATA_TYPE = eINSTANCE.getCustomProperty_CustomDataType();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_PROPERTY__ENUMERATION = eINSTANCE.getCustomProperty_Enumeration();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_PROPERTY__NAMESPACE = eINSTANCE.getCustomProperty_Namespace();

		/**
		 * The meta object literal for the '{@link BusinessDomainDsl.impl.NumberPropertyImpl <em>Number Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BusinessDomainDsl.impl.NumberPropertyImpl
		 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getNumberProperty()
		 * @generated
		 */
		EClass NUMBER_PROPERTY = eINSTANCE.getNumberProperty();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_PROPERTY__MIN_VALUE = eINSTANCE.getNumberProperty_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_PROPERTY__MAX_VALUE = eINSTANCE.getNumberProperty_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_PROPERTY__MIN_INCLUSIVE = eINSTANCE.getNumberProperty_MinInclusive();

		/**
		 * The meta object literal for the '<em><b>Max Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_PROPERTY__MAX_INCLUSIVE = eINSTANCE.getNumberProperty_MaxInclusive();

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
		 * The meta object literal for the '{@link BusinessDomainDsl.impl.CustomDataTypeImpl <em>Custom Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BusinessDomainDsl.impl.CustomDataTypeImpl
		 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getCustomDataType()
		 * @generated
		 */
		EClass CUSTOM_DATA_TYPE = eINSTANCE.getCustomDataType();

		/**
		 * The meta object literal for the '<em><b>Auto Generate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_DATA_TYPE__AUTO_GENERATE = eINSTANCE.getCustomDataType_AutoGenerate();

		/**
		 * The meta object literal for the '{@link BusinessDomainDsl.impl.PropertyContainerImpl <em>Property Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BusinessDomainDsl.impl.PropertyContainerImpl
		 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getPropertyContainer()
		 * @generated
		 */
		EClass PROPERTY_CONTAINER = eINSTANCE.getPropertyContainer();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CONTAINER__PROPERTY = eINSTANCE.getPropertyContainer_Property();

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
		 * The meta object literal for the '{@link BusinessDomainDsl.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BusinessDomainDsl.impl.ConstraintImpl
		 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Database Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__DATABASE_CONSTRAINT = eINSTANCE.getConstraint_DatabaseConstraint();

		/**
		 * The meta object literal for the '<em><b>Resource Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__RESOURCE_KEY = eINSTANCE.getConstraint_ResourceKey();

		/**
		 * The meta object literal for the '<em><b>Validation Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__VALIDATION_MESSAGE = eINSTANCE.getConstraint_ValidationMessage();

		/**
		 * The meta object literal for the '{@link BusinessDomainDsl.impl.associationImpl <em>association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BusinessDomainDsl.impl.associationImpl
		 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getassociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getassociation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SOURCE = eINSTANCE.getassociation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TARGET = eINSTANCE.getassociation_Target();

		/**
		 * The meta object literal for the '<em><b>Source Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__SOURCE_ROLE_NAME = eINSTANCE.getassociation_SourceRoleName();

		/**
		 * The meta object literal for the '<em><b>Source Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__SOURCE_MULTIPLICITY = eINSTANCE.getassociation_SourceMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Target Navigability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TARGET_NAVIGABILITY = eINSTANCE.getassociation_TargetNavigability();

		/**
		 * The meta object literal for the '<em><b>Source Navigability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__SOURCE_NAVIGABILITY = eINSTANCE.getassociation_SourceNavigability();

		/**
		 * The meta object literal for the '<em><b>Target Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TARGET_ROLE_NAME = eINSTANCE.getassociation_TargetRoleName();

		/**
		 * The meta object literal for the '<em><b>Target Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TARGET_MULTIPLICITY = eINSTANCE.getassociation_TargetMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Is Composite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__IS_COMPOSITE = eINSTANCE.getassociation_IsComposite();

		/**
		 * The meta object literal for the '{@link BusinessDomainDsl.AccessModifier <em>Access Modifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BusinessDomainDsl.AccessModifier
		 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getAccessModifier()
		 * @generated
		 */
		EEnum ACCESS_MODIFIER = eINSTANCE.getAccessModifier();

		/**
		 * The meta object literal for the '{@link BusinessDomainDsl.TypeAccessModifier <em>Type Access Modifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BusinessDomainDsl.TypeAccessModifier
		 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getTypeAccessModifier()
		 * @generated
		 */
		EEnum TYPE_ACCESS_MODIFIER = eINSTANCE.getTypeAccessModifier();

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
		 * The meta object literal for the '{@link BusinessDomainDsl.OperationConcurrency <em>Operation Concurrency</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BusinessDomainDsl.OperationConcurrency
		 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getOperationConcurrency()
		 * @generated
		 */
		EEnum OPERATION_CONCURRENCY = eINSTANCE.getOperationConcurrency();

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

		/**
		 * The meta object literal for the '{@link BusinessDomainDsl.DatabaseType <em>Database Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BusinessDomainDsl.DatabaseType
		 * @see BusinessDomainDsl.impl.BusinessDomainDslPackageImpl#getDatabaseType()
		 * @generated
		 */
		EEnum DATABASE_TYPE = eINSTANCE.getDatabaseType();

	}

} //BusinessDomainDslPackage
