/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.SimpleProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.SimpleProcessImpl#getDialogue <em>Dialogue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleProcessImpl extends ModelElementImpl implements SimpleProcess {
    /**
     * The cached value of the '{@link #getDialogue() <em>Dialogue</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDialogue()
     * @generated
     * @ordered
     */
    protected DialogueCall dialogue;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SimpleProcessImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PresentationDslPackage.Literals.SIMPLE_PROCESS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DialogueCall getDialogue() {
        return dialogue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDialogue(DialogueCall newDialogue, NotificationChain msgs) {
        DialogueCall oldDialogue = dialogue;
        dialogue = newDialogue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationDslPackage.SIMPLE_PROCESS__DIALOGUE, oldDialogue, newDialogue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDialogue(DialogueCall newDialogue) {
        if (newDialogue != dialogue) {
            NotificationChain msgs = null;
            if (dialogue != null)
                msgs = ((InternalEObject)dialogue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.SIMPLE_PROCESS__DIALOGUE, null, msgs);
            if (newDialogue != null)
                msgs = ((InternalEObject)newDialogue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.SIMPLE_PROCESS__DIALOGUE, null, msgs);
            msgs = basicSetDialogue(newDialogue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.SIMPLE_PROCESS__DIALOGUE, newDialogue, newDialogue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PresentationDslPackage.SIMPLE_PROCESS__DIALOGUE:
                return basicSetDialogue(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PresentationDslPackage.SIMPLE_PROCESS__DIALOGUE:
                return getDialogue();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PresentationDslPackage.SIMPLE_PROCESS__DIALOGUE:
                setDialogue((DialogueCall)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case PresentationDslPackage.SIMPLE_PROCESS__DIALOGUE:
                setDialogue((DialogueCall)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case PresentationDslPackage.SIMPLE_PROCESS__DIALOGUE:
                return dialogue != null;
        }
        return super.eIsSet(featureID);
    }

} //SimpleProcessImpl
