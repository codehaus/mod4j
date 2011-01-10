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
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Menu#getStartActions <em>Start Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Start Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action}.
	 * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Actions</em>' containment reference list.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getMenu_StartActions()
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getMenu
	 * @model opposite="menu" containment="true"
	 * @generated
	 */
	EList<Action> getStartActions();

} // Menu
