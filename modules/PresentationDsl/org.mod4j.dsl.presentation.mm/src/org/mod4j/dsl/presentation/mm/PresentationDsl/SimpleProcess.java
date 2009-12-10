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
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dialogue</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dialogue</em>' containment reference.
     * @see #setDialogue(DialogueCall)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getSimpleProcess_Dialogue()
     * @model containment="true"
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

} // SimpleProcess
