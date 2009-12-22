/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.SimpleProcess#getDialogue <em>Dialogue</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.SimpleProcess#getType <em>Type</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.SimpleProcess#getContentForm <em>Content Form</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.SimpleProcess#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getSimpleProcess()
 * @model
 * @generated
 */
public interface SimpleProcess extends ModelElement {
    /**
     * Returns the value of the '<em><b>Dialogue</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall#getCallingSimpleProcess <em>Calling Simple Process</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dialogue</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dialogue</em>' containment reference.
     * @see #setDialogue(DialogueCall)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getSimpleProcess_Dialogue()
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall#getCallingSimpleProcess
     * @model opposite="callingSimpleProcess" containment="true"
     * @generated
     */
    DialogueCall getDialogue();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.SimpleProcess#getDialogue <em>Dialogue</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dialogue</em>' containment reference.
     * @see #getDialogue()
     * @generated
     */
    void setDialogue(DialogueCall value);

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
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getSimpleProcess_Type()
     * @model default="CUSTOM"
     * @generated
     */
    ProcessType getType();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.SimpleProcess#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType
     * @see #getType()
     * @generated
     */
    void setType(ProcessType value);

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
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getSimpleProcess_ContentForm()
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm#getActions
     * @model opposite="actions" transient="false"
     * @generated
     */
    ContentForm getContentForm();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.SimpleProcess#getContentForm <em>Content Form</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Content Form</em>' container reference.
     * @see #getContentForm()
     * @generated
     */
    void setContentForm(ContentForm value);

    /**
     * Returns the value of the '<em><b>Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process</em>' containment reference.
     * @see #setProcess(AutomatedProcess)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getSimpleProcess_Process()
     * @model containment="true"
     * @generated
     */
    AutomatedProcess getProcess();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.SimpleProcess#getProcess <em>Process</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process</em>' containment reference.
     * @see #getProcess()
     * @generated
     */
    void setProcess(AutomatedProcess value);

} // SimpleProcess
