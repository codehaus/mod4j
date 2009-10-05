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
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getProcessElements <em>Process Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getProcess()
 * @model abstract="true"
 * @generated
 */
public interface Process extends UIModelElement {

    /**
     * Returns the value of the '<em><b>Process Elements</b></em>' containment reference list.
     * The list contents are of type {@link org.mod4j.dsl.presentation.mm.PresentationDsl.UICall}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process Elements</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process Elements</em>' containment reference list.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getProcess_ProcessElements()
     * @model containment="true"
     * @generated
     */
    EList<UICall> getProcessElements();
} // Process
