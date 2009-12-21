/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall#getOwningDialogue <em>Owning Dialogue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getProcessCall()
 * @model
 * @generated
 */
public interface ProcessCall extends UIModelElementCall {
    /**
     * Returns the value of the '<em><b>Owning Dialogue</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Dialogue#getProcesses <em>Processes</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owning Dialogue</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owning Dialogue</em>' container reference.
     * @see #setOwningDialogue(Dialogue)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getProcessCall_OwningDialogue()
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Dialogue#getProcesses
     * @model opposite="processes" transient="false"
     * @generated
     */
    Dialogue getOwningDialogue();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall#getOwningDialogue <em>Owning Dialogue</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owning Dialogue</em>' container reference.
     * @see #getOwningDialogue()
     * @generated
     */
    void setOwningDialogue(Dialogue value);

} // ProcessCall
