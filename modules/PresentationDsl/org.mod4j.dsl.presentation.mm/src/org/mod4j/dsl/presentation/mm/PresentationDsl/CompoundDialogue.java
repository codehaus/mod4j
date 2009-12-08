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
 * A representation of the model object '<em><b>Compound Dialogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.CompoundDialogue#getDialogues <em>Dialogues</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getCompoundDialogue()
 * @model
 * @generated
 */
public interface CompoundDialogue extends Dialogue {
    /**
     * Returns the value of the '<em><b>Dialogues</b></em>' containment reference list.
     * The list contents are of type {@link org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall}.
     * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall#getCompoundDialogue <em>Compound Dialogue</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dialogues</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dialogues</em>' containment reference list.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getCompoundDialogue_Dialogues()
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall#getCompoundDialogue
     * @model opposite="compoundDialogue" containment="true"
     * @generated
     */
    EList<DialogueCall> getDialogues();

} // CompoundDialogue
