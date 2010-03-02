/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialogue Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall#getCompoundDialogue <em>Compound Dialogue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getDialogueCall()
 * @model
 * @generated
 */
public interface DialogueCall extends UICall {
    /**
     * Returns the value of the '<em><b>Compound Dialogue</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.CompoundDialogue#getDialogues <em>Dialogues</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Compound Dialogue</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Compound Dialogue</em>' container reference.
     * @see #setCompoundDialogue(CompoundDialogue)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getDialogueCall_CompoundDialogue()
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.CompoundDialogue#getDialogues
     * @model opposite="dialogues" transient="false"
     * @generated
     */
    CompoundDialogue getCompoundDialogue();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall#getCompoundDialogue <em>Compound Dialogue</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Compound Dialogue</em>' container reference.
     * @see #getCompoundDialogue()
     * @generated
     */
    void setCompoundDialogue(CompoundDialogue value);

} // DialogueCall
