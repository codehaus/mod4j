/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.EnumerationLiteral#getPersistedValue <em>Persisted Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getEnumerationLiteral()
 * @model
 * @generated
 */
public interface EnumerationLiteral extends ModelElement {
    /**
     * Returns the value of the '<em><b>Persisted Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Persisted Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Persisted Value</em>' attribute.
     * @see #setPersistedValue(int)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getEnumerationLiteral_PersistedValue()
     * @model
     * @generated
     */
    int getPersistedValue();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.EnumerationLiteral#getPersistedValue <em>Persisted Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Persisted Value</em>' attribute.
     * @see #getPersistedValue()
     * @generated
     */
    void setPersistedValue(int value);

} // EnumerationLiteral
