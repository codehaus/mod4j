/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.Enumeration#isPersistAsString <em>Persist As String</em>}</li>
 *   <li>{@link BusinessDomainDsl.Enumeration#getEnumerationLiteral <em>Enumeration Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Persist As String</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persist As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persist As String</em>' attribute.
	 * @see #setPersistAsString(boolean)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getEnumeration_PersistAsString()
	 * @model default="false"
	 * @generated
	 */
	boolean isPersistAsString();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.Enumeration#isPersistAsString <em>Persist As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persist As String</em>' attribute.
	 * @see #isPersistAsString()
	 * @generated
	 */
	void setPersistAsString(boolean value);

	/**
	 * Returns the value of the '<em><b>Enumeration Literal</b></em>' containment reference list.
	 * The list contents are of type {@link BusinessDomainDsl.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Literal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Literal</em>' containment reference list.
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getEnumeration_EnumerationLiteral()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationLiteral> getEnumerationLiteral();

} // Enumeration
