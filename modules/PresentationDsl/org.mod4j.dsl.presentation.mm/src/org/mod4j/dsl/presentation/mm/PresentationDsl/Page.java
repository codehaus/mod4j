/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Page#getDialogue <em>Dialogue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends AbstractDialogue {
	/**
	 * Returns the value of the '<em><b>Dialogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialogue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialogue</em>' reference.
	 * @see #setDialogue(AbstractDialogue)
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getPage_Dialogue()
	 * @model
	 * @generated
	 */
	AbstractDialogue getDialogue();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Page#getDialogue <em>Dialogue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialogue</em>' reference.
	 * @see #getDialogue()
	 * @generated
	 */
	void setDialogue(AbstractDialogue value);

} // Page
