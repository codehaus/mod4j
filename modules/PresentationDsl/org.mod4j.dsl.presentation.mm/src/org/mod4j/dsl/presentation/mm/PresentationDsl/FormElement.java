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
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getReferences <em>References</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getForm <em>Form</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getLabel <em>Label</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getDataProperty <em>Data Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getFormElement()
 * @model
 * @generated
 */
public interface FormElement extends ModelElement {

	/**
     * Returns the value of the '<em><b>References</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>References</em>' containment reference.
     * @see #setReferences(DtoPropertyReference)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getFormElement_References()
     * @model containment="true"
     * @generated
     */
	DtoPropertyReference getReferences();

	/**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getReferences <em>References</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>References</em>' containment reference.
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
     * Returns the value of the '<em><b>Form</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm#getFormElements <em>Form Elements</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Form</em>' container reference.
     * @see #setForm(ContentForm)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getFormElement_Form()
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm#getFormElements
     * @model opposite="formElements" required="true" transient="false"
     * @generated
     */
	ContentForm getForm();

	/**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getForm <em>Form</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Form</em>' container reference.
     * @see #getForm()
     * @generated
     */
	void setForm(ContentForm value);

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
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getFormElement_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Data Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Property</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Property</em>' containment reference.
     * @see #setDataProperty(DataProperty)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getFormElement_DataProperty()
     * @model containment="true"
     * @generated
     */
    DataProperty getDataProperty();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getDataProperty <em>Data Property</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Property</em>' containment reference.
     * @see #getDataProperty()
     * @generated
     */
    void setDataProperty(DataProperty value);
} // FormElement
