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
 * A representation of the model object '<em><b>Presentation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel#getElements <em>Elements</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel#getExternalReferences <em>External References</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getPresentationModel()
 * @model
 * @generated
 */
public interface PresentationModel extends ModelElement {
    /**
     * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
     * The list contents are of type {@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext}.
     * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext#getPresentationModel <em>Presentation Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elements</em>' containment reference list.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getPresentationModel_Elements()
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext#getPresentationModel
     * @model opposite="presentationModel" containment="true"
     * @generated
     */
    EList<ModelElementWithContext> getElements();

    /**
     * Returns the value of the '<em><b>External References</b></em>' containment reference list.
     * The list contents are of type {@link org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>External References</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>External References</em>' containment reference list.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getPresentationModel_ExternalReferences()
     * @model containment="true"
     * @generated
     */
    EList<ExternalReference> getExternalReferences();

    /**
     * Returns the value of the '<em><b>Start</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start</em>' containment reference.
     * @see #setStart(Application)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getPresentationModel_Start()
     * @model containment="true"
     * @generated
     */
    Application getStart();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel#getStart <em>Start</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start</em>' containment reference.
     * @see #getStart()
     * @generated
     */
    void setStart(Application value);

} // PresentationModel
