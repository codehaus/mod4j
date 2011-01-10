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
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.View#getFormElements <em>Form Elements</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.View#getBaseView <em>Base View</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.View#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getView()
 * @model
 * @generated
 */
public interface View extends AbstractDialogue {
	/**
	 * Returns the value of the '<em><b>Form Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement}.
	 * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Elements</em>' containment reference list.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getView_FormElements()
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getForm
	 * @model opposite="form" containment="true"
	 * @generated
	 */
	EList<FormElement> getFormElements();

	/**
	 * Returns the value of the '<em><b>Base View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base View</em>' reference.
	 * @see #setBaseView(View)
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getView_BaseView()
	 * @model
	 * @generated
	 */
	View getBaseView();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.View#getBaseView <em>Base View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base View</em>' reference.
	 * @see #getBaseView()
	 * @generated
	 */
	void setBaseView(View value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action}.
	 * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getView_Actions()
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getView
	 * @model opposite="view" containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // View
