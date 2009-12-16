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

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.mod4j.dsl.presentation.mm.PresentationDsl.Dialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessCallImpl#getOwningDialogue <em>Owning Dialogue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProcessCallImpl extends UIModelElementCallImpl implements ProcessCall {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcessCallImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PresentationDslPackage.Literals.PROCESS_CALL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Dialogue getOwningDialogue() {
        if (eContainerFeatureID() != PresentationDslPackage.PROCESS_CALL__OWNING_DIALOGUE) return null;
        return (Dialogue)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwningDialogue(Dialogue newOwningDialogue, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOwningDialogue, PresentationDslPackage.PROCESS_CALL__OWNING_DIALOGUE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwningDialogue(Dialogue newOwningDialogue) {
        if (newOwningDialogue != eInternalContainer() || (eContainerFeatureID() != PresentationDslPackage.PROCESS_CALL__OWNING_DIALOGUE && newOwningDialogue != null)) {
            if (EcoreUtil.isAncestor(this, newOwningDialogue))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newOwningDialogue != null)
                msgs = ((InternalEObject)newOwningDialogue).eInverseAdd(this, PresentationDslPackage.DIALOGUE__PROCESSES, Dialogue.class, msgs);
            msgs = basicSetOwningDialogue(newOwningDialogue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.PROCESS_CALL__OWNING_DIALOGUE, newOwningDialogue, newOwningDialogue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PresentationDslPackage.PROCESS_CALL__OWNING_DIALOGUE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOwningDialogue((Dialogue)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PresentationDslPackage.PROCESS_CALL__OWNING_DIALOGUE:
                return basicSetOwningDialogue(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case PresentationDslPackage.PROCESS_CALL__OWNING_DIALOGUE:
                return eInternalContainer().eInverseRemove(this, PresentationDslPackage.DIALOGUE__PROCESSES, Dialogue.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PresentationDslPackage.PROCESS_CALL__OWNING_DIALOGUE:
                return getOwningDialogue();
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
            case PresentationDslPackage.PROCESS_CALL__OWNING_DIALOGUE:
                setOwningDialogue((Dialogue)newValue);
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
            case PresentationDslPackage.PROCESS_CALL__OWNING_DIALOGUE:
                setOwningDialogue((Dialogue)null);
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
            case PresentationDslPackage.PROCESS_CALL__OWNING_DIALOGUE:
                return getOwningDialogue() != null;
        }
        return super.eIsSet(featureID);
    }

} //ProcessCallImpl
