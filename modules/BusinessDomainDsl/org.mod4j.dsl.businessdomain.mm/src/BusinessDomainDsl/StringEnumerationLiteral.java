/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.StringEnumerationLiteral#getPersistedValue <em>Persisted Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getStringEnumerationLiteral()
 * @model
 * @generated
 */
public interface StringEnumerationLiteral extends EnumerationLiteral {
    /**
     * Returns the value of the '<em><b>Persisted Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Persisted Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Persisted Value</em>' attribute.
     * @see #setPersistedValue(String)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getStringEnumerationLiteral_PersistedValue()
     * @model
     * @generated
     */
    String getPersistedValue();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.StringEnumerationLiteral#getPersistedValue <em>Persisted Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Persisted Value</em>' attribute.
     * @see #getPersistedValue()
     * @generated
     */
    void setPersistedValue(String value);

} // StringEnumerationLiteral
