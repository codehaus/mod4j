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
	 * Returns the value of the '<em><b>Dialogues</b></em>' reference list.
	 * The list contents are of type {@link org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialogues</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialogues</em>' reference list.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getCompoundDialogue_Dialogues()
	 * @model
	 * @generated
	 */
	EList<DialogueCall> getDialogues();
} // CompoundDialogue
