/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.EnumerationProperty#getType <em>Type</em>}</li>
 *   <li>{@link BusinessDomainDsl.EnumerationProperty#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getEnumerationProperty()
 * @model
 * @generated
 */
public interface EnumerationProperty extends Property {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(Enumeration)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getEnumerationProperty_Type()
     * @model required="true"
     * @generated
     */
    Enumeration getType();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.EnumerationProperty#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(Enumeration value);

    /**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(String)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getEnumerationProperty_DefaultValue()
     * @model
     * @generated
     */
    String getDefaultValue();

    /**
     * Sets the value of the '{@link BusinessDomainDsl.EnumerationProperty#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue(String value);

} // EnumerationProperty
