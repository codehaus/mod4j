/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mod4j.crossx;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mod4j.crossx.CrossxPackage
 * @generated
 */
public interface CrossxFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CrossxFactory eINSTANCE = mod4j.crossx.impl.CrossxFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Model Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Model Info</em>'.
     * @generated
     */
    ModelInfo createModelInfo();

    /**
     * Returns a new object of class '<em>Model Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Model Reference</em>'.
     * @generated
     */
    ModelReference createModelReference();

    /**
     * Returns a new object of class '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Element</em>'.
     * @generated
     */
    Element createElement();

    /**
     * Returns a new object of class '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property</em>'.
     * @generated
     */
    Property createProperty();

    /**
     * Returns a new object of class '<em>Literal Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Literal Property</em>'.
     * @generated
     */
    LiteralProperty createLiteralProperty();

    /**
     * Returns a new object of class '<em>Reference Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reference Property</em>'.
     * @generated
     */
    ReferenceProperty createReferenceProperty();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    CrossxPackage getCrossxPackage();

} //CrossxFactory
