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
 *   <li>{@link BusinessDomainDsl.Enumeration#getEnumerationLiterals <em>Enumeration Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends ModelElement {
    /**
	 * Returns the value of the '<em><b>Enumeration Literals</b></em>' containment reference list.
	 * The list contents are of type {@link BusinessDomainDsl.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enumeration Literals</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Literals</em>' containment reference list.
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getEnumeration_EnumerationLiterals()
	 * @model containment="true"
	 * @generated
	 */
    EList<EnumerationLiteral> getEnumerationLiterals();

} // Enumeration
