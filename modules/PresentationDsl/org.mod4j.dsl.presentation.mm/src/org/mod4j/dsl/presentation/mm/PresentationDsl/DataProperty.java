/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty#isIsEnumeration <em>Is Enumeration</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty#getFormElement <em>Form Element</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty#isEditable <em>Editable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getDataProperty()
 * @model
 * @generated
 */
public interface DataProperty extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(String)
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getDataProperty_DataType()
	 * @model
	 * @generated
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(String value);

	/**
	 * Returns the value of the '<em><b>Is Enumeration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Enumeration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Enumeration</em>' attribute.
	 * @see #setIsEnumeration(boolean)
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getDataProperty_IsEnumeration()
	 * @model
	 * @generated
	 */
	boolean isIsEnumeration();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty#isIsEnumeration <em>Is Enumeration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Enumeration</em>' attribute.
	 * @see #isIsEnumeration()
	 * @generated
	 */
	void setIsEnumeration(boolean value);

	/**
	 * Returns the value of the '<em><b>Form Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getDataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Element</em>' container reference.
	 * @see #setFormElement(FormElement)
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getDataProperty_FormElement()
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getDataProperty
	 * @model opposite="dataProperty" transient="false"
	 * @generated
	 */
	FormElement getFormElement();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty#getFormElement <em>Form Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Element</em>' container reference.
	 * @see #getFormElement()
	 * @generated
	 */
	void setFormElement(FormElement value);

	/**
	 * Returns the value of the '<em><b>Editable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editable</em>' attribute.
	 * @see #setEditable(boolean)
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getDataProperty_Editable()
	 * @model default="true"
	 * @generated
	 */
	boolean isEditable();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty#isEditable <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable</em>' attribute.
	 * @see #isEditable()
	 * @generated
	 */
	void setEditable(boolean value);

} // DataProperty
