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
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getType <em>Type</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getLabel <em>Label</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process#isRoot <em>Root</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getContentForm <em>Content Form</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends UIModelElement {
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
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The default value is <code>"CUSTOM"</code>.
     * The literals are from the enumeration {@link org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType
     * @see #setType(ProcessType)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getProcess_Type()
     * @model default="CUSTOM"
     * @generated
     */
    ProcessType getType();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType
     * @see #getType()
     * @generated
     */
    void setType(ProcessType value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getProcess_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Root</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root</em>' attribute.
     * @see #setRoot(boolean)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getProcess_Root()
     * @model default="false"
     * @generated
     */
    boolean isRoot();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process#isRoot <em>Root</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Root</em>' attribute.
     * @see #isRoot()
     * @generated
     */
    void setRoot(boolean value);

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    boolean isInteractive();

} // Process
