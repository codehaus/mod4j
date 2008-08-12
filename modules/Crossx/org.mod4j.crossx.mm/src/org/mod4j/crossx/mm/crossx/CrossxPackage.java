/**
 * (c) Mod4j and contributors
 *
 * $Id$
 */
package org.mod4j.crossx.mm.crossx;

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
 * @see org.mod4j.crossx.mm.crossx.CrossxFactory
 * @model kind="package"
 * @generated
 */
public interface CrossxPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "crossx";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.mod4j.org/mod4j.crossx";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "crossx";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CrossxPackage eINSTANCE = org.mod4j.crossx.mm.crossx.impl.CrossxPackageImpl.init();

    /**
     * The meta object id for the '{@link org.mod4j.crossx.mm.crossx.impl.ModelInfoImpl <em>Model Info</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.crossx.mm.crossx.impl.ModelInfoImpl
     * @see org.mod4j.crossx.mm.crossx.impl.CrossxPackageImpl#getModelInfo()
     * @generated
     */
    int MODEL_INFO = 0;

    /**
     * The feature id for the '<em><b>Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_INFO__MODEL = 0;

    /**
     * The feature id for the '<em><b>Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_INFO__ELEMENTS = 1;

    /**
     * The feature id for the '<em><b>Last Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_INFO__LAST_CHANGED = 2;

    /**
     * The number of structural features of the '<em>Model Info</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_INFO_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.mod4j.crossx.mm.crossx.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.crossx.mm.crossx.impl.ModelReferenceImpl
     * @see org.mod4j.crossx.mm.crossx.impl.CrossxPackageImpl#getModelReference()
     * @generated
     */
    int MODEL_REFERENCE = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_REFERENCE__NAME = 0;

    /**
     * The feature id for the '<em><b>Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_REFERENCE__RESOURCE = 1;

    /**
     * The number of structural features of the '<em>Model Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_REFERENCE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.mod4j.crossx.mm.crossx.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.crossx.mm.crossx.impl.ElementImpl
     * @see org.mod4j.crossx.mm.crossx.impl.CrossxPackageImpl#getElement()
     * @generated
     */
    int ELEMENT = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__NAME = 0;

    /**
     * The feature id for the '<em><b>Elem Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__ELEM_TYPE = 1;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__PROPERTIES = 2;

    /**
     * The feature id for the '<em><b>Sub Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__SUB_ELEMENTS = 3;

    /**
     * The number of structural features of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.mod4j.crossx.mm.crossx.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.crossx.mm.crossx.impl.PropertyImpl
     * @see org.mod4j.crossx.mm.crossx.impl.CrossxPackageImpl#getProperty()
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
    int PROPERTY__NAME = 0;

    /**
     * The feature id for the '<em><b>Sub Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__SUB_PROPERTIES = 1;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.mod4j.crossx.mm.crossx.impl.LiteralPropertyImpl <em>Literal Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.crossx.mm.crossx.impl.LiteralPropertyImpl
     * @see org.mod4j.crossx.mm.crossx.impl.CrossxPackageImpl#getLiteralProperty()
     * @generated
     */
    int LITERAL_PROPERTY = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Sub Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_PROPERTY__SUB_PROPERTIES = PROPERTY__SUB_PROPERTIES;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_PROPERTY__VALUE = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Literal Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.mod4j.crossx.mm.crossx.impl.ReferencePropertyImpl <em>Reference Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.crossx.mm.crossx.impl.ReferencePropertyImpl
     * @see org.mod4j.crossx.mm.crossx.impl.CrossxPackageImpl#getReferenceProperty()
     * @generated
     */
    int REFERENCE_PROPERTY = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PROPERTY__NAME = PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Sub Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PROPERTY__SUB_PROPERTIES = PROPERTY__SUB_PROPERTIES;

    /**
     * The feature id for the '<em><b>Referred Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PROPERTY__REFERRED_TYPE = PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Reference Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;


    /**
     * Returns the meta object for class '{@link org.mod4j.crossx.mm.crossx.ModelInfo <em>Model Info</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model Info</em>'.
     * @see org.mod4j.crossx.mm.crossx.ModelInfo
     * @generated
     */
    EClass getModelInfo();

    /**
     * Returns the meta object for the containment reference '{@link org.mod4j.crossx.mm.crossx.ModelInfo#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Model</em>'.
     * @see org.mod4j.crossx.mm.crossx.ModelInfo#getModel()
     * @see #getModelInfo()
     * @generated
     */
    EReference getModelInfo_Model();

    /**
     * Returns the meta object for the containment reference list '{@link org.mod4j.crossx.mm.crossx.ModelInfo#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Elements</em>'.
     * @see org.mod4j.crossx.mm.crossx.ModelInfo#getElements()
     * @see #getModelInfo()
     * @generated
     */
    EReference getModelInfo_Elements();

    /**
     * Returns the meta object for the attribute '{@link org.mod4j.crossx.mm.crossx.ModelInfo#getLastChanged <em>Last Changed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Last Changed</em>'.
     * @see org.mod4j.crossx.mm.crossx.ModelInfo#getLastChanged()
     * @see #getModelInfo()
     * @generated
     */
    EAttribute getModelInfo_LastChanged();

    /**
     * Returns the meta object for class '{@link org.mod4j.crossx.mm.crossx.ModelReference <em>Model Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model Reference</em>'.
     * @see org.mod4j.crossx.mm.crossx.ModelReference
     * @generated
     */
    EClass getModelReference();

    /**
     * Returns the meta object for the attribute '{@link org.mod4j.crossx.mm.crossx.ModelReference#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.mod4j.crossx.mm.crossx.ModelReference#getName()
     * @see #getModelReference()
     * @generated
     */
    EAttribute getModelReference_Name();

    /**
     * Returns the meta object for the attribute '{@link org.mod4j.crossx.mm.crossx.ModelReference#getResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resource</em>'.
     * @see org.mod4j.crossx.mm.crossx.ModelReference#getResource()
     * @see #getModelReference()
     * @generated
     */
    EAttribute getModelReference_Resource();

    /**
     * Returns the meta object for class '{@link org.mod4j.crossx.mm.crossx.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element</em>'.
     * @see org.mod4j.crossx.mm.crossx.Element
     * @generated
     */
    EClass getElement();

    /**
     * Returns the meta object for the attribute '{@link org.mod4j.crossx.mm.crossx.Element#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.mod4j.crossx.mm.crossx.Element#getName()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_Name();

    /**
     * Returns the meta object for the attribute '{@link org.mod4j.crossx.mm.crossx.Element#getElemType <em>Elem Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Elem Type</em>'.
     * @see org.mod4j.crossx.mm.crossx.Element#getElemType()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_ElemType();

    /**
     * Returns the meta object for the containment reference list '{@link org.mod4j.crossx.mm.crossx.Element#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see org.mod4j.crossx.mm.crossx.Element#getProperties()
     * @see #getElement()
     * @generated
     */
    EReference getElement_Properties();

    /**
     * Returns the meta object for the containment reference list '{@link org.mod4j.crossx.mm.crossx.Element#getSubElements <em>Sub Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Elements</em>'.
     * @see org.mod4j.crossx.mm.crossx.Element#getSubElements()
     * @see #getElement()
     * @generated
     */
    EReference getElement_SubElements();

    /**
     * Returns the meta object for class '{@link org.mod4j.crossx.mm.crossx.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see org.mod4j.crossx.mm.crossx.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the attribute '{@link org.mod4j.crossx.mm.crossx.Property#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.mod4j.crossx.mm.crossx.Property#getName()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Name();

    /**
     * Returns the meta object for the containment reference list '{@link org.mod4j.crossx.mm.crossx.Property#getSubProperties <em>Sub Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Properties</em>'.
     * @see org.mod4j.crossx.mm.crossx.Property#getSubProperties()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_SubProperties();

    /**
     * Returns the meta object for class '{@link org.mod4j.crossx.mm.crossx.LiteralProperty <em>Literal Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Literal Property</em>'.
     * @see org.mod4j.crossx.mm.crossx.LiteralProperty
     * @generated
     */
    EClass getLiteralProperty();

    /**
     * Returns the meta object for the attribute '{@link org.mod4j.crossx.mm.crossx.LiteralProperty#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.mod4j.crossx.mm.crossx.LiteralProperty#getValue()
     * @see #getLiteralProperty()
     * @generated
     */
    EAttribute getLiteralProperty_Value();

    /**
     * Returns the meta object for class '{@link org.mod4j.crossx.mm.crossx.ReferenceProperty <em>Reference Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference Property</em>'.
     * @see org.mod4j.crossx.mm.crossx.ReferenceProperty
     * @generated
     */
    EClass getReferenceProperty();

    /**
     * Returns the meta object for the attribute '{@link org.mod4j.crossx.mm.crossx.ReferenceProperty#getReferredType <em>Referred Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Referred Type</em>'.
     * @see org.mod4j.crossx.mm.crossx.ReferenceProperty#getReferredType()
     * @see #getReferenceProperty()
     * @generated
     */
    EAttribute getReferenceProperty_ReferredType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CrossxFactory getCrossxFactory();

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
         * The meta object literal for the '{@link org.mod4j.crossx.mm.crossx.impl.ModelInfoImpl <em>Model Info</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.crossx.mm.crossx.impl.ModelInfoImpl
         * @see org.mod4j.crossx.mm.crossx.impl.CrossxPackageImpl#getModelInfo()
         * @generated
         */
        EClass MODEL_INFO = eINSTANCE.getModelInfo();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_INFO__MODEL = eINSTANCE.getModelInfo_Model();

        /**
         * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_INFO__ELEMENTS = eINSTANCE.getModelInfo_Elements();

        /**
         * The meta object literal for the '<em><b>Last Changed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_INFO__LAST_CHANGED = eINSTANCE.getModelInfo_LastChanged();

        /**
         * The meta object literal for the '{@link org.mod4j.crossx.mm.crossx.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.crossx.mm.crossx.impl.ModelReferenceImpl
         * @see org.mod4j.crossx.mm.crossx.impl.CrossxPackageImpl#getModelReference()
         * @generated
         */
        EClass MODEL_REFERENCE = eINSTANCE.getModelReference();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_REFERENCE__NAME = eINSTANCE.getModelReference_Name();

        /**
         * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_REFERENCE__RESOURCE = eINSTANCE.getModelReference_Resource();

        /**
         * The meta object literal for the '{@link org.mod4j.crossx.mm.crossx.impl.ElementImpl <em>Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.crossx.mm.crossx.impl.ElementImpl
         * @see org.mod4j.crossx.mm.crossx.impl.CrossxPackageImpl#getElement()
         * @generated
         */
        EClass ELEMENT = eINSTANCE.getElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

        /**
         * The meta object literal for the '<em><b>Elem Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__ELEM_TYPE = eINSTANCE.getElement_ElemType();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT__PROPERTIES = eINSTANCE.getElement_Properties();

        /**
         * The meta object literal for the '<em><b>Sub Elements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT__SUB_ELEMENTS = eINSTANCE.getElement_SubElements();

        /**
         * The meta object literal for the '{@link org.mod4j.crossx.mm.crossx.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.crossx.mm.crossx.impl.PropertyImpl
         * @see org.mod4j.crossx.mm.crossx.impl.CrossxPackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

        /**
         * The meta object literal for the '<em><b>Sub Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY__SUB_PROPERTIES = eINSTANCE.getProperty_SubProperties();

        /**
         * The meta object literal for the '{@link org.mod4j.crossx.mm.crossx.impl.LiteralPropertyImpl <em>Literal Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.crossx.mm.crossx.impl.LiteralPropertyImpl
         * @see org.mod4j.crossx.mm.crossx.impl.CrossxPackageImpl#getLiteralProperty()
         * @generated
         */
        EClass LITERAL_PROPERTY = eINSTANCE.getLiteralProperty();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LITERAL_PROPERTY__VALUE = eINSTANCE.getLiteralProperty_Value();

        /**
         * The meta object literal for the '{@link org.mod4j.crossx.mm.crossx.impl.ReferencePropertyImpl <em>Reference Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.crossx.mm.crossx.impl.ReferencePropertyImpl
         * @see org.mod4j.crossx.mm.crossx.impl.CrossxPackageImpl#getReferenceProperty()
         * @generated
         */
        EClass REFERENCE_PROPERTY = eINSTANCE.getReferenceProperty();

        /**
         * The meta object literal for the '<em><b>Referred Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REFERENCE_PROPERTY__REFERRED_TYPE = eINSTANCE.getReferenceProperty_ReferredType();

    }

} //CrossxPackage
