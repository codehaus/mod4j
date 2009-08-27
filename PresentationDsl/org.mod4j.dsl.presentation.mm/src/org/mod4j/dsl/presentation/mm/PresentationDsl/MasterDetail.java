/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Master Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail#getMaster <em>Master</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail#getDetail <em>Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getMasterDetail()
 * @model
 * @generated
 */
public interface MasterDetail extends CompoundDialogue {
	/**
	 * Returns the value of the '<em><b>Master</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master</em>' containment reference.
	 * @see #setMaster(DialogueCall)
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getMasterDetail_Master()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DialogueCall getMaster();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail#getMaster <em>Master</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master</em>' containment reference.
	 * @see #getMaster()
	 * @generated
	 */
	void setMaster(DialogueCall value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference.
	 * @see #setDetail(DialogueCall)
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getMasterDetail_Detail()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DialogueCall getDetail();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail#getDetail <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' containment reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(DialogueCall value);

} // MasterDetail
