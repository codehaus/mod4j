/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mod4j.crossx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mod4j.crossx.ModelReference#getName <em>Name</em>}</li>
 *   <li>{@link mod4j.crossx.ModelReference#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see mod4j.crossx.CrossxPackage#getModelReference()
 * @model
 * @generated
 */
public interface ModelReference extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see mod4j.crossx.CrossxPackage#getModelReference_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link mod4j.crossx.ModelReference#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Resource</b></em>' attribute.
     * The default value is <code>"[unknown]"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource</em>' attribute.
     * @see #setResource(String)
     * @see mod4j.crossx.CrossxPackage#getModelReference_Resource()
     * @model default="[unknown]"
     * @generated
     */
    String getResource();

    /**
     * Sets the value of the '{@link mod4j.crossx.ModelReference#getResource <em>Resource</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource</em>' attribute.
     * @see #getResource()
     * @generated
     */
    void setResource(String value);

} // ModelReference
