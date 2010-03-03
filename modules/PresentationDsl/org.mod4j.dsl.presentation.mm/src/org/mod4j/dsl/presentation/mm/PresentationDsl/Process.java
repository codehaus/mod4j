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
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getContentForm <em>Content Form</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends AbstractProcess {
    /**
     * Returns the value of the '<em><b>Process Elements</b></em>' containment reference list.
     * The list contents are of type {@link org.mod4j.dsl.presentation.mm.PresentationDsl.UICall}.
     * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getProcess <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process Elements</em>' containment reference list.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getProcess_ProcessElements()
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getProcess
     * @model opposite="process" containment="true"
     * @generated
     */
    EList<UICall> getProcessElements();

    /**
     * Returns the value of the '<em><b>Content Form</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm#getActions <em>Actions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Content Form</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Content Form</em>' container reference.
     * @see #setContentForm(ContentForm)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getProcess_ContentForm()
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm#getActions
     * @model opposite="actions" transient="false"
     * @generated
     */
    ContentForm getContentForm();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getContentForm <em>Content Form</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Content Form</em>' container reference.
     * @see #getContentForm()
     * @generated
     */
    void setContentForm(ContentForm value);

    /**
     * Returns the value of the '<em><b>Link</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Link</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Link</em>' containment reference.
     * @see #setLink(AssociationRoleReference)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getProcess_Link()
     * @model containment="true"
     * @generated
     */
    AssociationRoleReference getLink();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getLink <em>Link</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Link</em>' containment reference.
     * @see #getLink()
     * @generated
     */
    void setLink(AssociationRoleReference value);

} // Process
