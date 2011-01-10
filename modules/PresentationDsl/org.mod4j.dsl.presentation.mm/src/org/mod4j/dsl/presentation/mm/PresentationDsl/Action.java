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
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getLink <em>Link</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getNextPage <em>Next Page</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getContextExp <em>Context Exp</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getView <em>View</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getMenu <em>Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends AbstractProcess {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(AssociationRoleReference)
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getAction_Link()
	 * @model containment="true"
	 * @generated
	 */
	AssociationRoleReference getLink();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(AssociationRoleReference value);

	/**
	 * Returns the value of the '<em><b>Next Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Page</em>' reference.
	 * @see #setNextPage(Page)
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getAction_NextPage()
	 * @model
	 * @generated
	 */
	Page getNextPage();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getNextPage <em>Next Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page</em>' reference.
	 * @see #getNextPage()
	 * @generated
	 */
	void setNextPage(Page value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getAction_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Context Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Exp</em>' containment reference.
	 * @see #setContextExp(Expression)
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getAction_ContextExp()
	 * @model containment="true"
	 * @generated
	 */
	Expression getContextExp();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getContextExp <em>Context Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Exp</em>' containment reference.
	 * @see #getContextExp()
	 * @generated
	 */
	void setContextExp(Expression value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.mod4j.dsl.presentation.mm.PresentationDsl.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getAction_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

	/**
	 * Returns the value of the '<em><b>View</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.View#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' container reference.
	 * @see #setView(View)
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getAction_View()
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.View#getActions
	 * @model opposite="actions" transient="false"
	 * @generated
	 */
	View getView();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getView <em>View</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' container reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(View value);

	/**
	 * Returns the value of the '<em><b>Menu</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Menu#getStartActions <em>Start Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' container reference.
	 * @see #setMenu(Menu)
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getAction_Menu()
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Menu#getStartActions
	 * @model opposite="startActions" transient="false"
	 * @generated
	 */
	Menu getMenu();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getMenu <em>Menu</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu</em>' container reference.
	 * @see #getMenu()
	 * @generated
	 */
	void setMenu(Menu value);

} // Action
