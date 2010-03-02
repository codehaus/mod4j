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
 * A representation of the model object '<em><b>UI Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getProcess <em>Process</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getLabel <em>Label</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getContextExp <em>Context Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getUICall()
 * @model abstract="true"
 * @generated
 */
public interface UICall extends ModelElement {
    /**
     * Returns the value of the '<em><b>Process</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getProcessElements <em>Process Elements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process</em>' container reference.
     * @see #setProcess(org.mod4j.dsl.presentation.mm.PresentationDsl.Process)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getUICall_Process()
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getProcessElements
     * @model opposite="processElements" transient="false"
     * @generated
     */
    org.mod4j.dsl.presentation.mm.PresentationDsl.Process getProcess();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getProcess <em>Process</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process</em>' container reference.
     * @see #getProcess()
     * @generated
     */
    void setProcess(org.mod4j.dsl.presentation.mm.PresentationDsl.Process value);

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
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getUICall_Condition()
     * @model containment="true"
     * @generated
     */
    Expression getCondition();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getCondition <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition</em>' containment reference.
     * @see #getCondition()
     * @generated
     */
    void setCondition(Expression value);

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
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getUICall_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

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
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getUICall_Arguments()
     * @model containment="true"
     * @generated
     */
    EList<Expression> getArguments();

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
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getUICall_ContextExp()
     * @model containment="true"
     * @generated
     */
    Expression getContextExp();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getContextExp <em>Context Exp</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Exp</em>' containment reference.
     * @see #getContextExp()
     * @generated
     */
    void setContextExp(Expression value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    ProcessCall asProcessCall();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    DialogueCall asDialogueCall();

} // UICall
