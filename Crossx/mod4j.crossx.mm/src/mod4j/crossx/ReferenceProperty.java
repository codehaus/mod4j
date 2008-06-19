/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mod4j.crossx;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mod4j.crossx.ReferenceProperty#getReferredType <em>Referred Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mod4j.crossx.CrossxPackage#getReferenceProperty()
 * @model
 * @generated
 */
public interface ReferenceProperty extends Property {
    /**
     * Returns the value of the '<em><b>Referred Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred Type</em>' attribute.
     * @see #setReferredType(String)
     * @see mod4j.crossx.CrossxPackage#getReferenceProperty_ReferredType()
     * @model
     * @generated
     */
    String getReferredType();

    /**
     * Sets the value of the '{@link mod4j.crossx.ReferenceProperty#getReferredType <em>Referred Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referred Type</em>' attribute.
     * @see #getReferredType()
     * @generated
     */
    void setReferredType(String value);

} // ReferenceProperty
