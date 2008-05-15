/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mod4j.crossx;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mod4j.crossx.LiteralProperty#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see mod4j.crossx.CrossxPackage#getLiteralProperty()
 * @model
 * @generated
 */
public interface LiteralProperty extends Property {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see mod4j.crossx.CrossxPackage#getLiteralProperty_Value()
     * @model
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link mod4j.crossx.LiteralProperty#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

} // LiteralProperty
