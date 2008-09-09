/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.service.mm.ServiceDsl;

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
 * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslFactory
 * @model kind="package"
 * @generated
 */
public interface ServiceDslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ServiceDsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mod4j.org/service";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "service";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServiceDslPackage eINSTANCE = org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ModelElementImpl
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 1;

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
	 * The meta object id for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceModelImpl <em>Service Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceModelImpl
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getServiceModel()
	 * @generated
	 */
	int SERVICE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL__METHODS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dto References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL__DTO_REFERENCES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Crud Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL__CRUD_SERVICES = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.DtoReferenceImpl <em>Dto Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.DtoReferenceImpl
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getDtoReference()
	 * @generated
	 */
	int DTO_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REFERENCE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REFERENCE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REFERENCE__MODEL = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dto Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REFERENCE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceMethodImpl <em>Service Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceMethodImpl
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getServiceMethod()
	 * @generated
	 */
	int SERVICE_METHOD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METHOD__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METHOD__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METHOD__TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METHOD_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.CustomMethodImpl <em>Custom Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.CustomMethodImpl
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getCustomMethod()
	 * @generated
	 */
	int CUSTOM_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD__NAME = SERVICE_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD__DESCRIPTION = SERVICE_METHOD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD__TYPE = SERVICE_METHOD__TYPE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD__INPUT = SERVICE_METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD__OUTPUT = SERVICE_METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD_FEATURE_COUNT = SERVICE_METHOD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.CrudServiceImpl <em>Crud Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.CrudServiceImpl
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getCrudService()
	 * @generated
	 */
	int CRUD_SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_SERVICE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_SERVICE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_SERVICE__DTO = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Crud Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_SERVICE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.SpecialMethodImpl <em>Special Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.SpecialMethodImpl
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getSpecialMethod()
	 * @generated
	 */
	int SPECIAL_METHOD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_METHOD__NAME = SERVICE_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_METHOD__DESCRIPTION = SERVICE_METHOD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_METHOD__TYPE = SERVICE_METHOD__TYPE;

	/**
	 * The feature id for the '<em><b>Dto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_METHOD__DTO = SERVICE_METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Special Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_METHOD_FEATURE_COUNT = SERVICE_METHOD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.MethodType <em>Method Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.MethodType
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getMethodType()
	 * @generated
	 */
	int METHOD_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.service.mm.ServiceDsl.ServiceModel <em>Service Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Model</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceModel
	 * @generated
	 */
	EClass getServiceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.service.mm.ServiceDsl.ServiceModel#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceModel#getMethods()
	 * @see #getServiceModel()
	 * @generated
	 */
	EReference getServiceModel_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.service.mm.ServiceDsl.ServiceModel#getDtoReferences <em>Dto References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dto References</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceModel#getDtoReferences()
	 * @see #getServiceModel()
	 * @generated
	 */
	EReference getServiceModel_DtoReferences();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.service.mm.ServiceDsl.ServiceModel#getCrudServices <em>Crud Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Crud Services</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceModel#getCrudServices()
	 * @see #getServiceModel()
	 * @generated
	 */
	EReference getServiceModel_CrudServices();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.service.mm.ServiceDsl.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.service.mm.ServiceDsl.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.service.mm.ServiceDsl.ModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.ModelElement#getDescription()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Description();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.service.mm.ServiceDsl.DtoReference <em>Dto Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dto Reference</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.DtoReference
	 * @generated
	 */
	EClass getDtoReference();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.service.mm.ServiceDsl.DtoReference#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.DtoReference#getModel()
	 * @see #getDtoReference()
	 * @generated
	 */
	EAttribute getDtoReference_Model();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.service.mm.ServiceDsl.CustomMethod <em>Custom Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Method</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.CustomMethod
	 * @generated
	 */
	EClass getCustomMethod();

	/**
	 * Returns the meta object for the reference '{@link org.mod4j.dsl.service.mm.ServiceDsl.CustomMethod#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.CustomMethod#getInput()
	 * @see #getCustomMethod()
	 * @generated
	 */
	EReference getCustomMethod_Input();

	/**
	 * Returns the meta object for the reference '{@link org.mod4j.dsl.service.mm.ServiceDsl.CustomMethod#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.CustomMethod#getOutput()
	 * @see #getCustomMethod()
	 * @generated
	 */
	EReference getCustomMethod_Output();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.service.mm.ServiceDsl.CrudService <em>Crud Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crud Service</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.CrudService
	 * @generated
	 */
	EClass getCrudService();

	/**
	 * Returns the meta object for the reference '{@link org.mod4j.dsl.service.mm.ServiceDsl.CrudService#getDto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dto</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.CrudService#getDto()
	 * @see #getCrudService()
	 * @generated
	 */
	EReference getCrudService_Dto();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.service.mm.ServiceDsl.SpecialMethod <em>Special Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Method</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.SpecialMethod
	 * @generated
	 */
	EClass getSpecialMethod();

	/**
	 * Returns the meta object for the reference '{@link org.mod4j.dsl.service.mm.ServiceDsl.SpecialMethod#getDto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dto</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.SpecialMethod#getDto()
	 * @see #getSpecialMethod()
	 * @generated
	 */
	EReference getSpecialMethod_Dto();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.service.mm.ServiceDsl.ServiceMethod <em>Service Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Method</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceMethod
	 * @generated
	 */
	EClass getServiceMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.service.mm.ServiceDsl.ServiceMethod#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceMethod#getType()
	 * @see #getServiceMethod()
	 * @generated
	 */
	EAttribute getServiceMethod_Type();

	/**
	 * Returns the meta object for enum '{@link org.mod4j.dsl.service.mm.ServiceDsl.MethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method Type</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.MethodType
	 * @generated
	 */
	EEnum getMethodType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServiceDslFactory getServiceDslFactory();

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
		 * The meta object literal for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceModelImpl <em>Service Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceModelImpl
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getServiceModel()
		 * @generated
		 */
		EClass SERVICE_MODEL = eINSTANCE.getServiceModel();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MODEL__METHODS = eINSTANCE.getServiceModel_Methods();

		/**
		 * The meta object literal for the '<em><b>Dto References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MODEL__DTO_REFERENCES = eINSTANCE.getServiceModel_DtoReferences();

		/**
		 * The meta object literal for the '<em><b>Crud Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MODEL__CRUD_SERVICES = eINSTANCE.getServiceModel_CrudServices();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ModelElementImpl
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getModelElement()
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
		 * The meta object literal for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.DtoReferenceImpl <em>Dto Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.DtoReferenceImpl
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getDtoReference()
		 * @generated
		 */
		EClass DTO_REFERENCE = eINSTANCE.getDtoReference();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTO_REFERENCE__MODEL = eINSTANCE.getDtoReference_Model();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.CustomMethodImpl <em>Custom Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.CustomMethodImpl
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getCustomMethod()
		 * @generated
		 */
		EClass CUSTOM_METHOD = eINSTANCE.getCustomMethod();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_METHOD__INPUT = eINSTANCE.getCustomMethod_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_METHOD__OUTPUT = eINSTANCE.getCustomMethod_Output();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.CrudServiceImpl <em>Crud Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.CrudServiceImpl
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getCrudService()
		 * @generated
		 */
		EClass CRUD_SERVICE = eINSTANCE.getCrudService();

		/**
		 * The meta object literal for the '<em><b>Dto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRUD_SERVICE__DTO = eINSTANCE.getCrudService_Dto();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.SpecialMethodImpl <em>Special Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.SpecialMethodImpl
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getSpecialMethod()
		 * @generated
		 */
		EClass SPECIAL_METHOD = eINSTANCE.getSpecialMethod();

		/**
		 * The meta object literal for the '<em><b>Dto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIAL_METHOD__DTO = eINSTANCE.getSpecialMethod_Dto();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceMethodImpl <em>Service Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceMethodImpl
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getServiceMethod()
		 * @generated
		 */
		EClass SERVICE_METHOD = eINSTANCE.getServiceMethod();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_METHOD__TYPE = eINSTANCE.getServiceMethod_Type();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.MethodType <em>Method Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.MethodType
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getMethodType()
		 * @generated
		 */
		EEnum METHOD_TYPE = eINSTANCE.getMethodType();

	}

} //ServiceDslPackage
