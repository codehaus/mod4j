/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.datacontract.mm.DataContractDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslFactory
 * @model kind="package"
 * @generated
 */
public interface DataContractDslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DataContractDsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mod4j.org/datacontract";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datacontract";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataContractDslPackage eINSTANCE = org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.ModelElementImpl
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 14;

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
	 * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractModelImpl <em>Data Contract Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractModelImpl
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDataContractModel()
	 * @generated
	 */
	int DATA_CONTRACT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTRACT_MODEL__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTRACT_MODEL__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dtos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTRACT_MODEL__DTOS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enumerations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTRACT_MODEL__ENUMERATIONS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domain Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTRACT_MODEL__DOMAIN_CLASSES = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Contract Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTRACT_MODEL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoImpl <em>Dto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoImpl
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDto()
	 * @generated
	 */
	int DTO = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DomainClassDtoImpl <em>Domain Class Dto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DomainClassDtoImpl
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDomainClassDto()
	 * @generated
	 */
	int DOMAIN_CLASS_DTO = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CLASS_DTO__NAME = DTO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CLASS_DTO__DESCRIPTION = DTO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CLASS_DTO__PROPERTIES = DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CLASS_DTO__BASE = DTO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain Class Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CLASS_DTO_FEATURE_COUNT = DTO_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.ListDtoImpl <em>List Dto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.ListDtoImpl
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getListDto()
	 * @generated
	 */
	int LIST_DTO = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DTO__NAME = DTO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DTO__DESCRIPTION = DTO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Base Dto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DTO__BASE_DTO = DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selected Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DTO__SELECTED_PROPERTIES = DTO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DTO_FEATURE_COUNT = DTO_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.SubsetDtoImpl <em>Subset Dto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.SubsetDtoImpl
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getSubsetDto()
	 * @generated
	 */
	int SUBSET_DTO = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_DTO__NAME = DTO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_DTO__DESCRIPTION = DTO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Base Dto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_DTO__BASE_DTO = DTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selected Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_DTO__SELECTED_PROPERTIES = DTO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subset Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_DTO_FEATURE_COUNT = DTO_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.CompositeDtoImpl <em>Composite Dto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.CompositeDtoImpl
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getCompositeDto()
	 * @generated
	 */
	int COMPOSITE_DTO = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DTO__NAME = DTO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DTO__DESCRIPTION = DTO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dtos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DTO__DTOS = DTO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DTO_FEATURE_COUNT = DTO_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.ReferenceDtoImpl <em>Reference Dto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.ReferenceDtoImpl
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getReferenceDto()
	 * @generated
	 */
	int REFERENCE_DTO = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DTO__NAME = DTO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DTO__DESCRIPTION = DTO__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Reference Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DTO_FEATURE_COUNT = DTO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.PropertyImpl
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 7;

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
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.PropertyReferenceImpl
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getPropertyReference()
	 * @generated
	 */
	int PROPERTY_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE__DESCRIPTION = PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE__DATA_TYPE = PROPERTY__DATA_TYPE;

	/**
	 * The number of structural features of the '<em>Property Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataPropertyImpl <em>Data Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataPropertyImpl
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDataProperty()
	 * @generated
	 */
	int DATA_PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

	/**
	 * The number of structural features of the '<em>Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.StringPropertyImpl <em>String Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.StringPropertyImpl
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getStringProperty()
	 * @generated
	 */
	int STRING_PROPERTY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY__NAME = DATA_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY__DESCRIPTION = DATA_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY__DATA_TYPE = DATA_PROPERTY__DATA_TYPE;

	/**
	 * The number of structural features of the '<em>String Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY_FEATURE_COUNT = DATA_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BooleanPropertyImpl <em>Boolean Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BooleanPropertyImpl
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getBooleanProperty()
	 * @generated
	 */
	int BOOLEAN_PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY__NAME = DATA_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY__DESCRIPTION = DATA_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY__DATA_TYPE = DATA_PROPERTY__DATA_TYPE;

	/**
	 * The number of structural features of the '<em>Boolean Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY_FEATURE_COUNT = DATA_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.EnumerationImpl
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 12;

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
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERALS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.EnumerationLiteralImpl
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 13;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.CustomDtoImpl <em>Custom Dto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.CustomDtoImpl
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getCustomDto()
	 * @generated
	 */
	int CUSTOM_DTO = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DTO__NAME = DTO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DTO__DESCRIPTION = DTO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DTO__PROPERTIES = DTO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DTO_FEATURE_COUNT = DTO_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DomainClassReferenceImpl <em>Domain Class Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DomainClassReferenceImpl
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDomainClassReference()
	 * @generated
	 */
	int DOMAIN_CLASS_REFERENCE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CLASS_REFERENCE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CLASS_REFERENCE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Domain Class Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CLASS_REFERENCE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel <em>Data Contract Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Contract Model</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel
	 * @generated
	 */
	EClass getDataContractModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel#getDtos <em>Dtos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dtos</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel#getDtos()
	 * @see #getDataContractModel()
	 * @generated
	 */
	EReference getDataContractModel_Dtos();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerations</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel#getEnumerations()
	 * @see #getDataContractModel()
	 * @generated
	 */
	EReference getDataContractModel_Enumerations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel#getDomainClasses <em>Domain Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Classes</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel#getDomainClasses()
	 * @see #getDataContractModel()
	 * @generated
	 */
	EReference getDataContractModel_DomainClasses();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.Dto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dto</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.Dto
	 * @generated
	 */
	EClass getDto();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DomainClassDto <em>Domain Class Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Class Dto</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DomainClassDto
	 * @generated
	 */
	EClass getDomainClassDto();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DomainClassDto#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DomainClassDto#getProperties()
	 * @see #getDomainClassDto()
	 * @generated
	 */
	EReference getDomainClassDto_Properties();

	/**
	 * Returns the meta object for the reference '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DomainClassDto#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DomainClassDto#getBase()
	 * @see #getDomainClassDto()
	 * @generated
	 */
	EReference getDomainClassDto_Base();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.ListDto <em>List Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Dto</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.ListDto
	 * @generated
	 */
	EClass getListDto();

	/**
	 * Returns the meta object for the reference '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.ListDto#getBaseDto <em>Base Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dto</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.ListDto#getBaseDto()
	 * @see #getListDto()
	 * @generated
	 */
	EReference getListDto_BaseDto();

	/**
	 * Returns the meta object for the reference list '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.ListDto#getSelectedProperties <em>Selected Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected Properties</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.ListDto#getSelectedProperties()
	 * @see #getListDto()
	 * @generated
	 */
	EReference getListDto_SelectedProperties();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.SubsetDto <em>Subset Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subset Dto</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.SubsetDto
	 * @generated
	 */
	EClass getSubsetDto();

	/**
	 * Returns the meta object for the reference '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.SubsetDto#getBaseDto <em>Base Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dto</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.SubsetDto#getBaseDto()
	 * @see #getSubsetDto()
	 * @generated
	 */
	EReference getSubsetDto_BaseDto();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.SubsetDto#getSelectedProperties <em>Selected Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selected Properties</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.SubsetDto#getSelectedProperties()
	 * @see #getSubsetDto()
	 * @generated
	 */
	EReference getSubsetDto_SelectedProperties();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.CompositeDto <em>Composite Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Dto</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.CompositeDto
	 * @generated
	 */
	EClass getCompositeDto();

	/**
	 * Returns the meta object for the reference list '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.CompositeDto#getDtos <em>Dtos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dtos</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.CompositeDto#getDtos()
	 * @see #getCompositeDto()
	 * @generated
	 */
	EReference getCompositeDto_Dtos();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.ReferenceDto <em>Reference Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Dto</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.ReferenceDto
	 * @generated
	 */
	EClass getReferenceDto();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.Property#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.Property#getDataType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_DataType();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.PropertyReference <em>Property Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Reference</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.PropertyReference
	 * @generated
	 */
	EClass getPropertyReference();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataProperty
	 * @generated
	 */
	EClass getDataProperty();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.StringProperty <em>String Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Property</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.StringProperty
	 * @generated
	 */
	EClass getStringProperty();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BooleanProperty <em>Boolean Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Property</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.BooleanProperty
	 * @generated
	 */
	EClass getBooleanProperty();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.Enumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.Enumeration#getLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literals();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.ModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.ModelElement#getDescription()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Description();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.CustomDto <em>Custom Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Dto</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.CustomDto
	 * @generated
	 */
	EClass getCustomDto();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.CustomDto#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.CustomDto#getProperties()
	 * @see #getCustomDto()
	 * @generated
	 */
	EReference getCustomDto_Properties();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DomainClassReference <em>Domain Class Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Class Reference</em>'.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DomainClassReference
	 * @generated
	 */
	EClass getDomainClassReference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataContractDslFactory getDataContractDslFactory();

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
		 * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractModelImpl <em>Data Contract Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractModelImpl
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDataContractModel()
		 * @generated
		 */
		EClass DATA_CONTRACT_MODEL = eINSTANCE.getDataContractModel();

		/**
		 * The meta object literal for the '<em><b>Dtos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTRACT_MODEL__DTOS = eINSTANCE.getDataContractModel_Dtos();

		/**
		 * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTRACT_MODEL__ENUMERATIONS = eINSTANCE.getDataContractModel_Enumerations();

		/**
		 * The meta object literal for the '<em><b>Domain Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTRACT_MODEL__DOMAIN_CLASSES = eINSTANCE.getDataContractModel_DomainClasses();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoImpl <em>Dto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoImpl
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDto()
		 * @generated
		 */
		EClass DTO = eINSTANCE.getDto();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DomainClassDtoImpl <em>Domain Class Dto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DomainClassDtoImpl
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDomainClassDto()
		 * @generated
		 */
		EClass DOMAIN_CLASS_DTO = eINSTANCE.getDomainClassDto();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_CLASS_DTO__PROPERTIES = eINSTANCE.getDomainClassDto_Properties();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_CLASS_DTO__BASE = eINSTANCE.getDomainClassDto_Base();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.ListDtoImpl <em>List Dto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.ListDtoImpl
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getListDto()
		 * @generated
		 */
		EClass LIST_DTO = eINSTANCE.getListDto();

		/**
		 * The meta object literal for the '<em><b>Base Dto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_DTO__BASE_DTO = eINSTANCE.getListDto_BaseDto();

		/**
		 * The meta object literal for the '<em><b>Selected Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_DTO__SELECTED_PROPERTIES = eINSTANCE.getListDto_SelectedProperties();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.SubsetDtoImpl <em>Subset Dto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.SubsetDtoImpl
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getSubsetDto()
		 * @generated
		 */
		EClass SUBSET_DTO = eINSTANCE.getSubsetDto();

		/**
		 * The meta object literal for the '<em><b>Base Dto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSET_DTO__BASE_DTO = eINSTANCE.getSubsetDto_BaseDto();

		/**
		 * The meta object literal for the '<em><b>Selected Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSET_DTO__SELECTED_PROPERTIES = eINSTANCE.getSubsetDto_SelectedProperties();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.CompositeDtoImpl <em>Composite Dto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.CompositeDtoImpl
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getCompositeDto()
		 * @generated
		 */
		EClass COMPOSITE_DTO = eINSTANCE.getCompositeDto();

		/**
		 * The meta object literal for the '<em><b>Dtos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_DTO__DTOS = eINSTANCE.getCompositeDto_Dtos();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.ReferenceDtoImpl <em>Reference Dto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.ReferenceDtoImpl
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getReferenceDto()
		 * @generated
		 */
		EClass REFERENCE_DTO = eINSTANCE.getReferenceDto();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.PropertyImpl
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getProperty()
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
		 * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.PropertyReferenceImpl
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getPropertyReference()
		 * @generated
		 */
		EClass PROPERTY_REFERENCE = eINSTANCE.getPropertyReference();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataPropertyImpl <em>Data Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataPropertyImpl
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDataProperty()
		 * @generated
		 */
		EClass DATA_PROPERTY = eINSTANCE.getDataProperty();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.StringPropertyImpl <em>String Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.StringPropertyImpl
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getStringProperty()
		 * @generated
		 */
		EClass STRING_PROPERTY = eINSTANCE.getStringProperty();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BooleanPropertyImpl <em>Boolean Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BooleanPropertyImpl
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getBooleanProperty()
		 * @generated
		 */
		EClass BOOLEAN_PROPERTY = eINSTANCE.getBooleanProperty();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.EnumerationImpl
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.EnumerationLiteralImpl
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.ModelElementImpl
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getModelElement()
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
		 * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.CustomDtoImpl <em>Custom Dto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.CustomDtoImpl
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getCustomDto()
		 * @generated
		 */
		EClass CUSTOM_DTO = eINSTANCE.getCustomDto();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_DTO__PROPERTIES = eINSTANCE.getCustomDto_Properties();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DomainClassReferenceImpl <em>Domain Class Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DomainClassReferenceImpl
		 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDomainClassReference()
		 * @generated
		 */
		EClass DOMAIN_CLASS_REFERENCE = eINSTANCE.getDomainClassReference();

	}

} //DataContractDslPackage
