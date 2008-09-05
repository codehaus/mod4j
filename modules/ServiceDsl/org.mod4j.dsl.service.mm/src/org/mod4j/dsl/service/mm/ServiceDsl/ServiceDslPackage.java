/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.service.mm.ServiceDsl;

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
	 * The number of structural features of the '<em>Service Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.DataContractReferenceImpl <em>Data Contract Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.DataContractReferenceImpl
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getDataContractReference()
	 * @generated
	 */
	int DATA_CONTRACT_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTRACT_REFERENCE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTRACT_REFERENCE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTRACT_REFERENCE__MODEL = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Contract Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTRACT_REFERENCE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceMethodImpl <em>Service Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceMethodImpl
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getServiceMethod()
	 * @generated
	 */
	int SERVICE_METHOD = 3;

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
	 * The number of structural features of the '<em>Service Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METHOD_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;


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
	 * Returns the meta object for class '{@link org.mod4j.dsl.service.mm.ServiceDsl.DataContractReference <em>Data Contract Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Contract Reference</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.DataContractReference
	 * @generated
	 */
	EClass getDataContractReference();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.service.mm.ServiceDsl.DataContractReference#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.DataContractReference#getModel()
	 * @see #getDataContractReference()
	 * @generated
	 */
	EAttribute getDataContractReference_Model();

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
		 * The meta object literal for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.DataContractReferenceImpl <em>Data Contract Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.DataContractReferenceImpl
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getDataContractReference()
		 * @generated
		 */
		EClass DATA_CONTRACT_REFERENCE = eINSTANCE.getDataContractReference();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CONTRACT_REFERENCE__MODEL = eINSTANCE.getDataContractReference_Model();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceMethodImpl <em>Service Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceMethodImpl
		 * @see org.mod4j.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getServiceMethod()
		 * @generated
		 */
		EClass SERVICE_METHOD = eINSTANCE.getServiceMethod();

	}

} //ServiceDslPackage
