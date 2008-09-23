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
     * The number of structural features of the '<em>Business Class Dto</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_CLASS_DTO_FEATURE_COUNT = DTO_FEATURE_COUNT + 2;

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
     * The feature id for the '<em><b>Datacontract Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSET_DTO__DATACONTRACT_MODEL = DTO__DATACONTRACT_MODEL;

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
     * The feature id for the '<em><b>Datacontract Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_DTO__DATACONTRACT_MODEL = DTO__DATACONTRACT_MODEL;

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
     * The feature id for the '<em><b>Datacontract Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_DTO__DATACONTRACT_MODEL = DTO__DATACONTRACT_MODEL;

    /**
     * The number of structural features of the '<em>Reference Dto</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_DTO_FEATURE_COUNT = DTO_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyImpl <em>Dto Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyImpl
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoProperty()
     * @generated
     */
    int DTO_PROPERTY = 7;

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
     * The number of structural features of the '<em>Dto Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_PROPERTY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyReferenceImpl <em>Dto Property Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyReferenceImpl
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoPropertyReference()
     * @generated
     */
    int DTO_PROPERTY_REFERENCE = 8;

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
     * The number of structural features of the '<em>Dto Property Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_PROPERTY_REFERENCE_FEATURE_COUNT = DTO_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoDataPropertyImpl <em>Dto Data Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoDataPropertyImpl
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoDataProperty()
     * @generated
     */
    int DTO_DATA_PROPERTY = 9;

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
    int DTO_STRING_PROPERTY = 10;

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
    int DTO_BOOLEAN_PROPERTY = 11;

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
    int BUSINESS_CLASS_REFERENCE = 16;

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
    int DTO_INTEGER_PROPERTY = 17;

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
    int DTO_DECIMAL_PROPERTY = 18;

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
    int DTO_ENUMERATION_PROPERTY = 19;

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
    int DTO_DATE_TIME_PROPERTY = 20;

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
     * The number of structural features of the '<em>Dto Date Time Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DATE_TIME_PROPERTY_FEATURE_COUNT = DTO_DATA_PROPERTY_FEATURE_COUNT + 0;


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
     * Returns the meta object for class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoPropertyReference <em>Dto Property Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Property Reference</em>'.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoPropertyReference
     * @generated
     */
    EClass getDtoPropertyReference();

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
         * The meta object literal for the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyReferenceImpl <em>Dto Property Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyReferenceImpl
         * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoPropertyReference()
         * @generated
         */
        EClass DTO_PROPERTY_REFERENCE = eINSTANCE.getDtoPropertyReference();

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

    }

} //DataContractDslPackage
