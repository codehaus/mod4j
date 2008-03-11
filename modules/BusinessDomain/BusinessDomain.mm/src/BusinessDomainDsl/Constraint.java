/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.Constraint#getDatabaseConstraint <em>Database Constraint</em>}</li>
 *   <li>{@link BusinessDomainDsl.Constraint#getResourceKey <em>Resource Key</em>}</li>
 *   <li>{@link BusinessDomainDsl.Constraint#getValidationMessage <em>Validation Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Database Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Constraint</em>' attribute.
	 * @see #setDatabaseConstraint(String)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getConstraint_DatabaseConstraint()
	 * @model
	 * @generated
	 */
	String getDatabaseConstraint();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.Constraint#getDatabaseConstraint <em>Database Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Constraint</em>' attribute.
	 * @see #getDatabaseConstraint()
	 * @generated
	 */
	void setDatabaseConstraint(String value);

	/**
	 * Returns the value of the '<em><b>Resource Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Key</em>' attribute.
	 * @see #setResourceKey(String)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getConstraint_ResourceKey()
	 * @model
	 * @generated
	 */
	String getResourceKey();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.Constraint#getResourceKey <em>Resource Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Key</em>' attribute.
	 * @see #getResourceKey()
	 * @generated
	 */
	void setResourceKey(String value);

	/**
	 * Returns the value of the '<em><b>Validation Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Message</em>' attribute.
	 * @see #setValidationMessage(String)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getConstraint_ValidationMessage()
	 * @model
	 * @generated
	 */
	String getValidationMessage();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.Constraint#getValidationMessage <em>Validation Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Message</em>' attribute.
	 * @see #getValidationMessage()
	 * @generated
	 */
	void setValidationMessage(String value);

} // Constraint
