/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mod4j.crossx.impl;

import mod4j.crossx.*;

import org.eclipse.emf.ecore.EClass;
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
public class CrossxFactoryImpl extends EFactoryImpl implements CrossxFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CrossxFactory init() {
        try {
            CrossxFactory theCrossxFactory = (CrossxFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mod4j.org/mod4j.crossx"); 
            if (theCrossxFactory != null) {
                return theCrossxFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CrossxFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CrossxFactoryImpl() {
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
            case CrossxPackage.MODEL_INFO: return createModelInfo();
            case CrossxPackage.MODEL_REFERENCE: return createModelReference();
            case CrossxPackage.ELEMENT: return createElement();
            case CrossxPackage.PROPERTY: return createProperty();
            case CrossxPackage.LITERAL_PROPERTY: return createLiteralProperty();
            case CrossxPackage.REFERENCE_PROPERTY: return createReferenceProperty();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelInfo createModelInfo() {
        ModelInfoImpl modelInfo = new ModelInfoImpl();
        return modelInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelReference createModelReference() {
        ModelReferenceImpl modelReference = new ModelReferenceImpl();
        return modelReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Element createElement() {
        ElementImpl element = new ElementImpl();
        return element;
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
    public LiteralProperty createLiteralProperty() {
        LiteralPropertyImpl literalProperty = new LiteralPropertyImpl();
        return literalProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReferenceProperty createReferenceProperty() {
        ReferencePropertyImpl referenceProperty = new ReferencePropertyImpl();
        return referenceProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CrossxPackage getCrossxPackage() {
        return (CrossxPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CrossxPackage getPackage() {
        return CrossxPackage.eINSTANCE;
    }

} //CrossxFactoryImpl
