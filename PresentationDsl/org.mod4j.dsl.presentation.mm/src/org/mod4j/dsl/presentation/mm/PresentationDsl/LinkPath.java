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
 * A representation of the model object '<em><b>Link Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.LinkPath#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getLinkPath()
 * @model
 * @generated
 */
public interface LinkPath extends Link {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' reference list.
	 * The list contents are of type {@link org.mod4j.dsl.presentation.mm.PresentationDsl.LinkRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' reference list.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getLinkPath_Steps()
	 * @model required="true"
	 * @generated
	 */
	EList<LinkRef> getSteps();

} // LinkPath
