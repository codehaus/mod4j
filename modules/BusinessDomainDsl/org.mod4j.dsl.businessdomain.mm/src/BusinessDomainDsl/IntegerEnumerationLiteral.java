/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.IntegerEnumerationLiteral#getPersistedValue <em>Persisted Value</em>}</li>
 *   <li>{@link BusinessDomainDsl.IntegerEnumerationLiteral#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getIntegerEnumerationLiteral()
 * @model
 * @generated
 */
public interface IntegerEnumerationLiteral extends ModelElement {
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
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getIntegerEnumerationLiteral_PersistedValue()
     * @model
     * @generated
     */
    int getPersistedValue();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IntegerEnumerationLiteral#getPersistedValue <em>Persisted Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Persisted Value</em>' attribute.
     * @see #getPersistedValue()
     * @generated
     */
    void setPersistedValue(int value);

    /**
     * Returns the value of the '<em><b>Enumeration</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.IntegerEnumeration#getEnumerationLiterals <em>Enumeration Literals</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enumeration</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enumeration</em>' container reference.
     * @see #setEnumeration(IntegerEnumeration)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getIntegerEnumerationLiteral_Enumeration()
     * @see BusinessDomainDsl.IntegerEnumeration#getEnumerationLiterals
     * @model opposite="enumerationLiterals" transient="false"
     * @generated
     */
    IntegerEnumeration getEnumeration();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.IntegerEnumerationLiteral#getEnumeration <em>Enumeration</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enumeration</em>' container reference.
     * @see #getEnumeration()
     * @generated
     */
    void setEnumeration(IntegerEnumeration value);

} // IntegerEnumerationLiteral
