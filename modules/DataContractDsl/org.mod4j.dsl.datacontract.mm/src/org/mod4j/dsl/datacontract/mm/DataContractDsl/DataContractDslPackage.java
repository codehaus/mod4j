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
    int MODEL_ELEMENT = 11;

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
     * The feature id for the '<em><b>Business Classes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_CONTRACT_MODEL__BUSINESS_CLASSES = MODEL_ELEMENT_FEATURE_COUNT + 2;

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
     * The feature id for the '<em><b>Datacontract Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO__DATACONTRACT_MODEL = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Dto</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassDtoImpl <em>Business Class Dto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassDtoImpl
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getBusinessClassDto()
     * @generated
     */
    int BUSINESS_CLASS_DTO = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_DTO__NAME = DTO__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_DTO__DESCRIPTION = DTO__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Datacontract Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_DTO__DATACONTRACT_MODEL = DTO__DATACONTRACT_MODEL;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_DTO__PROPERTIES = DTO_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Base</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_DTO__BASE = DTO_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Property References</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_DTO__PROPERTY_REFERENCES = DTO_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Association References</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_DTO__ASSOCIATION_REFERENCES = DTO_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Business Class Dto</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_DTO_FEATURE_COUNT = DTO_FEATURE_COUNT + 4;

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
     * The feature id for the '<em><b>Datacontract Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_DTO__DATACONTRACT_MODEL = DTO__DATACONTRACT_MODEL;

    /**
     * The feature id for the '<em><b>Base Dto</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_DTO__BASE_DTO = DTO_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Selected Properties</b></em>' containment reference list.
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
     * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyImpl <em>Dto Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyImpl
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoProperty()
     * @generated
     */
    int DTO_PROPERTY = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_PROPERTY__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_PROPERTY__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_PROPERTY__DATA_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Business Class Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_PROPERTY__BUSINESS_CLASS_DTO = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Custom Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_PROPERTY__CUSTOM_DTO = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Dto Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_PROPERTY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyReferenceImpl <em>Dto Property Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyReferenceImpl
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoPropertyReference()
     * @generated
     */
    int DTO_PROPERTY_REFERENCE = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_PROPERTY_REFERENCE__NAME = DTO_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_PROPERTY_REFERENCE__DESCRIPTION = DTO_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_PROPERTY_REFERENCE__DATA_TYPE = DTO_PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Business Class Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_PROPERTY_REFERENCE__BUSINESS_CLASS_DTO = DTO_PROPERTY__BUSINESS_CLASS_DTO;

    /**
     * The feature id for the '<em><b>Custom Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_PROPERTY_REFERENCE__CUSTOM_DTO = DTO_PROPERTY__CUSTOM_DTO;

    /**
     * The feature id for the '<em><b>Referred Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_PROPERTY_REFERENCE__REFERRED_PROPERTY = DTO_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Dto Property Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_PROPERTY_REFERENCE_FEATURE_COUNT = DTO_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoDataPropertyImpl <em>Dto Data Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoDataPropertyImpl
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoDataProperty()
     * @generated
     */
    int DTO_DATA_PROPERTY = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DATA_PROPERTY__NAME = DTO_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DATA_PROPERTY__DESCRIPTION = DTO_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DATA_PROPERTY__DATA_TYPE = DTO_PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Business Class Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DATA_PROPERTY__BUSINESS_CLASS_DTO = DTO_PROPERTY__BUSINESS_CLASS_DTO;

    /**
     * The feature id for the '<em><b>Custom Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DATA_PROPERTY__CUSTOM_DTO = DTO_PROPERTY__CUSTOM_DTO;

    /**
     * The number of structural features of the '<em>Dto Data Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DATA_PROPERTY_FEATURE_COUNT = DTO_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoStringPropertyImpl <em>Dto String Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoStringPropertyImpl
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoStringProperty()
     * @generated
     */
    int DTO_STRING_PROPERTY = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_STRING_PROPERTY__NAME = DTO_DATA_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_STRING_PROPERTY__DESCRIPTION = DTO_DATA_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_STRING_PROPERTY__DATA_TYPE = DTO_DATA_PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Business Class Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_STRING_PROPERTY__BUSINESS_CLASS_DTO = DTO_DATA_PROPERTY__BUSINESS_CLASS_DTO;

    /**
     * The feature id for the '<em><b>Custom Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_STRING_PROPERTY__CUSTOM_DTO = DTO_DATA_PROPERTY__CUSTOM_DTO;

    /**
     * The number of structural features of the '<em>Dto String Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_STRING_PROPERTY_FEATURE_COUNT = DTO_DATA_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoBooleanPropertyImpl <em>Dto Boolean Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoBooleanPropertyImpl
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoBooleanProperty()
     * @generated
     */
    int DTO_BOOLEAN_PROPERTY = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_BOOLEAN_PROPERTY__NAME = DTO_DATA_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_BOOLEAN_PROPERTY__DESCRIPTION = DTO_DATA_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_BOOLEAN_PROPERTY__DATA_TYPE = DTO_DATA_PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Business Class Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_BOOLEAN_PROPERTY__BUSINESS_CLASS_DTO = DTO_DATA_PROPERTY__BUSINESS_CLASS_DTO;

    /**
     * The feature id for the '<em><b>Custom Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_BOOLEAN_PROPERTY__CUSTOM_DTO = DTO_DATA_PROPERTY__CUSTOM_DTO;

    /**
     * The number of structural features of the '<em>Dto Boolean Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_BOOLEAN_PROPERTY_FEATURE_COUNT = DTO_DATA_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.EnumerationImpl
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getEnumeration()
     * @generated
     */
    int ENUMERATION = 9;

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
    int ENUMERATION_LITERAL = 10;

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
    int CUSTOM_DTO = 12;

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
     * The feature id for the '<em><b>Datacontract Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_DTO__DATACONTRACT_MODEL = DTO__DATACONTRACT_MODEL;

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
     * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassReferenceImpl <em>Business Class Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassReferenceImpl
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getBusinessClassReference()
     * @generated
     */
    int BUSINESS_CLASS_REFERENCE = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_REFERENCE__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_REFERENCE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Modelname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_REFERENCE__MODELNAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Datacontract Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_REFERENCE__DATACONTRACT_MODEL = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Business Class Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_REFERENCE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoIntegerPropertyImpl <em>Dto Integer Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoIntegerPropertyImpl
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoIntegerProperty()
     * @generated
     */
    int DTO_INTEGER_PROPERTY = 14;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_INTEGER_PROPERTY__NAME = DTO_DATA_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_INTEGER_PROPERTY__DESCRIPTION = DTO_DATA_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_INTEGER_PROPERTY__DATA_TYPE = DTO_DATA_PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Business Class Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_INTEGER_PROPERTY__BUSINESS_CLASS_DTO = DTO_DATA_PROPERTY__BUSINESS_CLASS_DTO;

    /**
     * The feature id for the '<em><b>Custom Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_INTEGER_PROPERTY__CUSTOM_DTO = DTO_DATA_PROPERTY__CUSTOM_DTO;

    /**
     * The number of structural features of the '<em>Dto Integer Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_INTEGER_PROPERTY_FEATURE_COUNT = DTO_DATA_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoDecimalPropertyImpl <em>Dto Decimal Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoDecimalPropertyImpl
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoDecimalProperty()
     * @generated
     */
    int DTO_DECIMAL_PROPERTY = 15;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DECIMAL_PROPERTY__NAME = DTO_DATA_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DECIMAL_PROPERTY__DESCRIPTION = DTO_DATA_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DECIMAL_PROPERTY__DATA_TYPE = DTO_DATA_PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Business Class Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DECIMAL_PROPERTY__BUSINESS_CLASS_DTO = DTO_DATA_PROPERTY__BUSINESS_CLASS_DTO;

    /**
     * The feature id for the '<em><b>Custom Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DECIMAL_PROPERTY__CUSTOM_DTO = DTO_DATA_PROPERTY__CUSTOM_DTO;

    /**
     * The number of structural features of the '<em>Dto Decimal Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DECIMAL_PROPERTY_FEATURE_COUNT = DTO_DATA_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoEnumerationPropertyImpl <em>Dto Enumeration Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoEnumerationPropertyImpl
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoEnumerationProperty()
     * @generated
     */
    int DTO_ENUMERATION_PROPERTY = 16;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_ENUMERATION_PROPERTY__NAME = DTO_DATA_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_ENUMERATION_PROPERTY__DESCRIPTION = DTO_DATA_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_ENUMERATION_PROPERTY__DATA_TYPE = DTO_DATA_PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Business Class Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_ENUMERATION_PROPERTY__BUSINESS_CLASS_DTO = DTO_DATA_PROPERTY__BUSINESS_CLASS_DTO;

    /**
     * The feature id for the '<em><b>Custom Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_ENUMERATION_PROPERTY__CUSTOM_DTO = DTO_DATA_PROPERTY__CUSTOM_DTO;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_ENUMERATION_PROPERTY__TYPE = DTO_DATA_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Dto Enumeration Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_ENUMERATION_PROPERTY_FEATURE_COUNT = DTO_DATA_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoDateTimePropertyImpl <em>Dto Date Time Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoDateTimePropertyImpl
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoDateTimeProperty()
     * @generated
     */
    int DTO_DATE_TIME_PROPERTY = 17;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DATE_TIME_PROPERTY__NAME = DTO_DATA_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DATE_TIME_PROPERTY__DESCRIPTION = DTO_DATA_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DATE_TIME_PROPERTY__DATA_TYPE = DTO_DATA_PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Business Class Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DATE_TIME_PROPERTY__BUSINESS_CLASS_DTO = DTO_DATA_PROPERTY__BUSINESS_CLASS_DTO;

    /**
     * The feature id for the '<em><b>Custom Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DATE_TIME_PROPERTY__CUSTOM_DTO = DTO_DATA_PROPERTY__CUSTOM_DTO;

    /**
     * The number of structural features of the '<em>Dto Date Time Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DATE_TIME_PROPERTY_FEATURE_COUNT = DTO_DATA_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassPropertyReferenceImpl <em>Business Class Property Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassPropertyReferenceImpl
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getBusinessClassPropertyReference()
     * @generated
     */
    int BUSINESS_CLASS_PROPERTY_REFERENCE = 18;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_PROPERTY_REFERENCE__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_PROPERTY_REFERENCE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_PROPERTY_REFERENCE__DTO = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Business Class Property Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_PROPERTY_REFERENCE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassAssociationRoleReferenceImpl <em>Business Class Association Role Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassAssociationRoleReferenceImpl
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getBusinessClassAssociationRoleReference()
     * @generated
     */
    int BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE = 19;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Dto Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Business Class Association Role Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoAssociationRolePropertyImpl <em>Dto Association Role Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoAssociationRolePropertyImpl
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoAssociationRoleProperty()
     * @generated
     */
    int DTO_ASSOCIATION_ROLE_PROPERTY = 20;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_ASSOCIATION_ROLE_PROPERTY__NAME = DTO_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_ASSOCIATION_ROLE_PROPERTY__DESCRIPTION = DTO_PROPERTY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_ASSOCIATION_ROLE_PROPERTY__DATA_TYPE = DTO_PROPERTY__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Business Class Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_ASSOCIATION_ROLE_PROPERTY__BUSINESS_CLASS_DTO = DTO_PROPERTY__BUSINESS_CLASS_DTO;

    /**
     * The feature id for the '<em><b>Custom Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_ASSOCIATION_ROLE_PROPERTY__CUSTOM_DTO = DTO_PROPERTY__CUSTOM_DTO;

    /**
     * The feature id for the '<em><b>Dto Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_ASSOCIATION_ROLE_PROPERTY__DTO_TYPE = DTO_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Dto Association Role Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_ASSOCIATION_ROLE_PROPERTY_FEATURE_COUNT = DTO_PROPERTY_FEATURE_COUNT + 1;


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
     * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel#getBusinessClasses <em>Business Classes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Business Classes</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel#getBusinessClasses()
     * @see #getDataContractModel()
     * @generated
     */
    EReference getDataContractModel_BusinessClasses();

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
     * Returns the meta object for the container reference '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.Dto#getDatacontractModel <em>Datacontract Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Datacontract Model</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.Dto#getDatacontractModel()
     * @see #getDto()
     * @generated
     */
    EReference getDto_DatacontractModel();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto <em>Business Class Dto</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Class Dto</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto
     * @generated
     */
    EClass getBusinessClassDto();

    /**
     * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getProperties()
     * @see #getBusinessClassDto()
     * @generated
     */
    EReference getBusinessClassDto_Properties();

    /**
     * Returns the meta object for the reference '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getBase <em>Base</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Base</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getBase()
     * @see #getBusinessClassDto()
     * @generated
     */
    EReference getBusinessClassDto_Base();

    /**
     * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getPropertyReferences <em>Property References</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property References</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getPropertyReferences()
     * @see #getBusinessClassDto()
     * @generated
     */
    EReference getBusinessClassDto_PropertyReferences();

    /**
     * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getAssociationReferences <em>Association References</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Association References</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getAssociationReferences()
     * @see #getBusinessClassDto()
     * @generated
     */
    EReference getBusinessClassDto_AssociationReferences();

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
     * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.ListDto#getSelectedProperties <em>Selected Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Selected Properties</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.ListDto#getSelectedProperties()
     * @see #getListDto()
     * @generated
     */
    EReference getListDto_SelectedProperties();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoProperty <em>Dto Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Property</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoProperty
     * @generated
     */
    EClass getDtoProperty();

    /**
     * Returns the meta object for the attribute '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoProperty#getDataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Type</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoProperty#getDataType()
     * @see #getDtoProperty()
     * @generated
     */
    EAttribute getDtoProperty_DataType();

    /**
     * Returns the meta object for the container reference '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoProperty#getBusinessClassDto <em>Business Class Dto</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Business Class Dto</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoProperty#getBusinessClassDto()
     * @see #getDtoProperty()
     * @generated
     */
    EReference getDtoProperty_BusinessClassDto();

    /**
     * Returns the meta object for the container reference '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoProperty#getCustomDto <em>Custom Dto</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Custom Dto</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoProperty#getCustomDto()
     * @see #getDtoProperty()
     * @generated
     */
    EReference getDtoProperty_CustomDto();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoPropertyReference <em>Dto Property Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Property Reference</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoPropertyReference
     * @generated
     */
    EClass getDtoPropertyReference();

    /**
     * Returns the meta object for the reference '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoPropertyReference#getReferredProperty <em>Referred Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referred Property</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoPropertyReference#getReferredProperty()
     * @see #getDtoPropertyReference()
     * @generated
     */
    EReference getDtoPropertyReference_ReferredProperty();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoDataProperty <em>Dto Data Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Data Property</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoDataProperty
     * @generated
     */
    EClass getDtoDataProperty();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoStringProperty <em>Dto String Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto String Property</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoStringProperty
     * @generated
     */
    EClass getDtoStringProperty();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoBooleanProperty <em>Dto Boolean Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Boolean Property</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoBooleanProperty
     * @generated
     */
    EClass getDtoBooleanProperty();

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
     * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassReference <em>Business Class Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Class Reference</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassReference
     * @generated
     */
    EClass getBusinessClassReference();

    /**
     * Returns the meta object for the attribute '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassReference#getModelname <em>Modelname</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Modelname</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassReference#getModelname()
     * @see #getBusinessClassReference()
     * @generated
     */
    EAttribute getBusinessClassReference_Modelname();

    /**
     * Returns the meta object for the container reference '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassReference#getDatacontractModel <em>Datacontract Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Datacontract Model</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassReference#getDatacontractModel()
     * @see #getBusinessClassReference()
     * @generated
     */
    EReference getBusinessClassReference_DatacontractModel();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoIntegerProperty <em>Dto Integer Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Integer Property</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoIntegerProperty
     * @generated
     */
    EClass getDtoIntegerProperty();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoDecimalProperty <em>Dto Decimal Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Decimal Property</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoDecimalProperty
     * @generated
     */
    EClass getDtoDecimalProperty();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty <em>Dto Enumeration Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Enumeration Property</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty
     * @generated
     */
    EClass getDtoEnumerationProperty();

    /**
     * Returns the meta object for the reference '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty#getType()
     * @see #getDtoEnumerationProperty()
     * @generated
     */
    EReference getDtoEnumerationProperty_Type();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoDateTimeProperty <em>Dto Date Time Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Date Time Property</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoDateTimeProperty
     * @generated
     */
    EClass getDtoDateTimeProperty();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference <em>Business Class Property Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Class Property Reference</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference
     * @generated
     */
    EClass getBusinessClassPropertyReference();

    /**
     * Returns the meta object for the container reference '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference#getDto <em>Dto</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Dto</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference#getDto()
     * @see #getBusinessClassPropertyReference()
     * @generated
     */
    EReference getBusinessClassPropertyReference_Dto();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference <em>Business Class Association Role Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Class Association Role Reference</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference
     * @generated
     */
    EClass getBusinessClassAssociationRoleReference();

    /**
     * Returns the meta object for the container reference '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference#getDto <em>Dto</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Dto</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference#getDto()
     * @see #getBusinessClassAssociationRoleReference()
     * @generated
     */
    EReference getBusinessClassAssociationRoleReference_Dto();

    /**
     * Returns the meta object for the reference '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference#getDtoType <em>Dto Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Dto Type</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference#getDtoType()
     * @see #getBusinessClassAssociationRoleReference()
     * @generated
     */
    EReference getBusinessClassAssociationRoleReference_DtoType();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoAssociationRoleProperty <em>Dto Association Role Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Association Role Property</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoAssociationRoleProperty
     * @generated
     */
    EClass getDtoAssociationRoleProperty();

    /**
     * Returns the meta object for the reference '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoAssociationRoleProperty#getDtoType <em>Dto Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Dto Type</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoAssociationRoleProperty#getDtoType()
     * @see #getDtoAssociationRoleProperty()
     * @generated
     */
    EReference getDtoAssociationRoleProperty_DtoType();

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
         * The meta object literal for the '<em><b>Business Classes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_CONTRACT_MODEL__BUSINESS_CLASSES = eINSTANCE.getDataContractModel_BusinessClasses();

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
         * The meta object literal for the '<em><b>Datacontract Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DTO__DATACONTRACT_MODEL = eINSTANCE.getDto_DatacontractModel();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassDtoImpl <em>Business Class Dto</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassDtoImpl
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getBusinessClassDto()
         * @generated
         */
        EClass BUSINESS_CLASS_DTO = eINSTANCE.getBusinessClassDto();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_CLASS_DTO__PROPERTIES = eINSTANCE.getBusinessClassDto_Properties();

        /**
         * The meta object literal for the '<em><b>Base</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_CLASS_DTO__BASE = eINSTANCE.getBusinessClassDto_Base();

        /**
         * The meta object literal for the '<em><b>Property References</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_CLASS_DTO__PROPERTY_REFERENCES = eINSTANCE.getBusinessClassDto_PropertyReferences();

        /**
         * The meta object literal for the '<em><b>Association References</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_CLASS_DTO__ASSOCIATION_REFERENCES = eINSTANCE.getBusinessClassDto_AssociationReferences();

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
         * The meta object literal for the '<em><b>Selected Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LIST_DTO__SELECTED_PROPERTIES = eINSTANCE.getListDto_SelectedProperties();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyImpl <em>Dto Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyImpl
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoProperty()
         * @generated
         */
        EClass DTO_PROPERTY = eINSTANCE.getDtoProperty();

        /**
         * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DTO_PROPERTY__DATA_TYPE = eINSTANCE.getDtoProperty_DataType();

        /**
         * The meta object literal for the '<em><b>Business Class Dto</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DTO_PROPERTY__BUSINESS_CLASS_DTO = eINSTANCE.getDtoProperty_BusinessClassDto();

        /**
         * The meta object literal for the '<em><b>Custom Dto</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DTO_PROPERTY__CUSTOM_DTO = eINSTANCE.getDtoProperty_CustomDto();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyReferenceImpl <em>Dto Property Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyReferenceImpl
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoPropertyReference()
         * @generated
         */
        EClass DTO_PROPERTY_REFERENCE = eINSTANCE.getDtoPropertyReference();

        /**
         * The meta object literal for the '<em><b>Referred Property</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DTO_PROPERTY_REFERENCE__REFERRED_PROPERTY = eINSTANCE.getDtoPropertyReference_ReferredProperty();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoDataPropertyImpl <em>Dto Data Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoDataPropertyImpl
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoDataProperty()
         * @generated
         */
        EClass DTO_DATA_PROPERTY = eINSTANCE.getDtoDataProperty();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoStringPropertyImpl <em>Dto String Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoStringPropertyImpl
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoStringProperty()
         * @generated
         */
        EClass DTO_STRING_PROPERTY = eINSTANCE.getDtoStringProperty();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoBooleanPropertyImpl <em>Dto Boolean Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoBooleanPropertyImpl
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoBooleanProperty()
         * @generated
         */
        EClass DTO_BOOLEAN_PROPERTY = eINSTANCE.getDtoBooleanProperty();

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
         * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassReferenceImpl <em>Business Class Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassReferenceImpl
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getBusinessClassReference()
         * @generated
         */
        EClass BUSINESS_CLASS_REFERENCE = eINSTANCE.getBusinessClassReference();

        /**
         * The meta object literal for the '<em><b>Modelname</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BUSINESS_CLASS_REFERENCE__MODELNAME = eINSTANCE.getBusinessClassReference_Modelname();

        /**
         * The meta object literal for the '<em><b>Datacontract Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_CLASS_REFERENCE__DATACONTRACT_MODEL = eINSTANCE.getBusinessClassReference_DatacontractModel();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoIntegerPropertyImpl <em>Dto Integer Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoIntegerPropertyImpl
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoIntegerProperty()
         * @generated
         */
        EClass DTO_INTEGER_PROPERTY = eINSTANCE.getDtoIntegerProperty();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoDecimalPropertyImpl <em>Dto Decimal Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoDecimalPropertyImpl
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoDecimalProperty()
         * @generated
         */
        EClass DTO_DECIMAL_PROPERTY = eINSTANCE.getDtoDecimalProperty();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoEnumerationPropertyImpl <em>Dto Enumeration Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoEnumerationPropertyImpl
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoEnumerationProperty()
         * @generated
         */
        EClass DTO_ENUMERATION_PROPERTY = eINSTANCE.getDtoEnumerationProperty();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DTO_ENUMERATION_PROPERTY__TYPE = eINSTANCE.getDtoEnumerationProperty_Type();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoDateTimePropertyImpl <em>Dto Date Time Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoDateTimePropertyImpl
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoDateTimeProperty()
         * @generated
         */
        EClass DTO_DATE_TIME_PROPERTY = eINSTANCE.getDtoDateTimeProperty();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassPropertyReferenceImpl <em>Business Class Property Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassPropertyReferenceImpl
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getBusinessClassPropertyReference()
         * @generated
         */
        EClass BUSINESS_CLASS_PROPERTY_REFERENCE = eINSTANCE.getBusinessClassPropertyReference();

        /**
         * The meta object literal for the '<em><b>Dto</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_CLASS_PROPERTY_REFERENCE__DTO = eINSTANCE.getBusinessClassPropertyReference_Dto();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassAssociationRoleReferenceImpl <em>Business Class Association Role Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassAssociationRoleReferenceImpl
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getBusinessClassAssociationRoleReference()
         * @generated
         */
        EClass BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE = eINSTANCE.getBusinessClassAssociationRoleReference();

        /**
         * The meta object literal for the '<em><b>Dto</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO = eINSTANCE.getBusinessClassAssociationRoleReference_Dto();

        /**
         * The meta object literal for the '<em><b>Dto Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO_TYPE = eINSTANCE.getBusinessClassAssociationRoleReference_DtoType();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoAssociationRolePropertyImpl <em>Dto Association Role Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoAssociationRolePropertyImpl
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoAssociationRoleProperty()
         * @generated
         */
        EClass DTO_ASSOCIATION_ROLE_PROPERTY = eINSTANCE.getDtoAssociationRoleProperty();

        /**
         * The meta object literal for the '<em><b>Dto Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DTO_ASSOCIATION_ROLE_PROPERTY__DTO_TYPE = eINSTANCE.getDtoAssociationRoleProperty_DtoType();

    }

} //DataContractDslPackage
