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
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Application#getStartProcesses <em>Start Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends ModelElement {
    /**
     * Returns the value of the '<em><b>Start Processes</b></em>' containment reference list.
     * The list contents are of type {@link org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Processes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Processes</em>' containment reference list.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getApplication_StartProcesses()
     * @model containment="true"
     * @generated
     */
    EList<ProcessCall> getStartProcesses();

} // Application
