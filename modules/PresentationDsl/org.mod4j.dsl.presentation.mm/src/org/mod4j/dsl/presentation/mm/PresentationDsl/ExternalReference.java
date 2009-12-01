/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference#getModelName <em>Model Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getExternalReference()
 * @model
 * @generated
 */
public interface ExternalReference extends ModelElement {
	/**
     * Returns the value of the '<em><b>Model Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Model Name</em>' attribute.
     * @see #setModelName(String)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getExternalReference_ModelName()
     * @model
     * @generated
     */
	String getModelName();

	/**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference#getModelName <em>Model Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model Name</em>' attribute.
     * @see #getModelName()
     * @generated
     */
	void setModelName(String value);

} // ExternalReference
