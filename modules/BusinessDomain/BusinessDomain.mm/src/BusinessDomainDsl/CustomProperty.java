/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.CustomProperty#getCustomDataType <em>Custom Data Type</em>}</li>
 *   <li>{@link BusinessDomainDsl.CustomProperty#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link BusinessDomainDsl.CustomProperty#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getCustomProperty()
 * @model
 * @generated
 */
public interface CustomProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Custom Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Data Type</em>' attribute.
	 * @see #setCustomDataType(String)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getCustomProperty_CustomDataType()
	 * @model
	 * @generated
	 */
	String getCustomDataType();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.CustomProperty#getCustomDataType <em>Custom Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Data Type</em>' attribute.
	 * @see #getCustomDataType()
	 * @generated
	 */
	void setCustomDataType(String value);

	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' attribute.
	 * @see #setEnumeration(String)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getCustomProperty_Enumeration()
	 * @model
	 * @generated
	 */
	String getEnumeration();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.CustomProperty#getEnumeration <em>Enumeration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration</em>' attribute.
	 * @see #getEnumeration()
	 * @generated
	 */
	void setEnumeration(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * The default value is <code>"Current ..."</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getCustomProperty_Namespace()
	 * @model default="Current ..."
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.CustomProperty#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

} // CustomProperty
