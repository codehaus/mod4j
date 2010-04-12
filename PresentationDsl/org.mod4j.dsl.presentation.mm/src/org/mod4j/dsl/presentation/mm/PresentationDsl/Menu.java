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
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Menu#getStartProcesses <em>Start Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends ModelElement {
    /**
     * Returns the value of the '<em><b>Start Processes</b></em>' containment reference list.
     * The list contents are of type {@link org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall}.
     * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall#getOwningMenu <em>Owning Menu</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Processes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Processes</em>' containment reference list.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getMenu_StartProcesses()
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall#getOwningMenu
     * @model opposite="owningMenu" containment="true"
     * @generated
     */
    EList<ProcessCall> getStartProcesses();

} // Menu
