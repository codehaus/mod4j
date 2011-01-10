/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element With Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext#getContextRef <em>Context Ref</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext#getPresentationModel <em>Presentation Model</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext#isCollectionContext <em>Collection Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getModelElementWithContext()
 * @model abstract="true"
 * @generated
 */
public interface ModelElementWithContext extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Context Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Ref</em>' reference.
	 * @see #setContextRef(DtoReference)
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getModelElementWithContext_ContextRef()
	 * @model
	 * @generated
	 */
	DtoReference getContextRef();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext#getContextRef <em>Context Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Ref</em>' reference.
	 * @see #getContextRef()
	 * @generated
	 */
	void setContextRef(DtoReference value);

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
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getModelElementWithContext_PresentationModel()
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	PresentationModel getPresentationModel();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext#getPresentationModel <em>Presentation Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Model</em>' container reference.
	 * @see #getPresentationModel()
	 * @generated
	 */
	void setPresentationModel(PresentationModel value);

	/**
	 * Returns the value of the '<em><b>Collection Context</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Context</em>' attribute.
	 * @see #setCollectionContext(boolean)
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getModelElementWithContext_CollectionContext()
	 * @model default="false"
	 * @generated
	 */
	boolean isCollectionContext();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext#isCollectionContext <em>Collection Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Context</em>' attribute.
	 * @see #isCollectionContext()
	 * @generated
	 */
	void setCollectionContext(boolean value);

} // ModelElementWithContext
