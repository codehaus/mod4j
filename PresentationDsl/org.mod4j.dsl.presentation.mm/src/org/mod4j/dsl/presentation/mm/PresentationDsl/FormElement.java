/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getName <em>Name</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getReferences <em>References</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getForm <em>Form</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getFormElement()
 * @model
 * @generated
 */
public interface FormElement extends EObject {

	/**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getFormElement_Name()
     * @model
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

	/**
     * Returns the value of the '<em><b>References</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>References</em>' reference.
     * @see #setReferences(DtoPropertyReference)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getFormElement_References()
     * @model
     * @generated
     */
	DtoPropertyReference getReferences();

	/**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getReferences <em>References</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>References</em>' reference.
     * @see #getReferences()
     * @generated
     */
	void setReferences(DtoPropertyReference value);

	/**
     * Returns the value of the '<em><b>Readonly</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readonly</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Readonly</em>' attribute.
     * @see #setReadonly(boolean)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getFormElement_Readonly()
     * @model default="false"
     * @generated
     */
	boolean isReadonly();

	/**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#isReadonly <em>Readonly</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Readonly</em>' attribute.
     * @see #isReadonly()
     * @generated
     */
	void setReadonly(boolean value);

	/**
     * Returns the value of the '<em><b>Form</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm#getFormElements <em>Form Elements</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Form</em>' reference.
     * @see #setForm(ContentForm)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getFormElement_Form()
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm#getFormElements
     * @model opposite="formElements" required="true"
     * @generated
     */
	ContentForm getForm();

	/**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getForm <em>Form</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Form</em>' reference.
     * @see #getForm()
     * @generated
     */
	void setForm(ContentForm value);
} // FormElement
