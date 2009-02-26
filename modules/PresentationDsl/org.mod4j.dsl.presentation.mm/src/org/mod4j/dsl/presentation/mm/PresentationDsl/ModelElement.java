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
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement#getName <em>Name</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement#getContextRef <em>Context Ref</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement#getPresentationModel <em>Presentation Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends EObject {
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
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getModelElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getModelElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Context Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Ref</em>' reference.
	 * @see #setContextRef(ExternalReference)
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getModelElement_ContextRef()
	 * @model
	 * @generated
	 */
	ExternalReference getContextRef();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement#getContextRef <em>Context Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Ref</em>' reference.
	 * @see #getContextRef()
	 * @generated
	 */
	void setContextRef(ExternalReference value);

	/**
	 * Returns the value of the '<em><b>Presentation Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Model</em>' container reference.
	 * @see #setPresentationModel(PresentationModel)
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getModelElement_PresentationModel()
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel#getElements
	 * @model opposite="elements" required="true" transient="false"
	 * @generated
	 */
	PresentationModel getPresentationModel();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement#getPresentationModel <em>Presentation Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Model</em>' container reference.
	 * @see #getPresentationModel()
	 * @generated
	 */
	void setPresentationModel(PresentationModel value);

} // ModelElement
