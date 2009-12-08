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
import org.mod4j.dsl.presentation.mm.PresentationDsl.CompoundDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dialogue Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DialogueCallImpl#getCompoundDialogue <em>Compound Dialogue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DialogueCallImpl extends UIModelElementCallImpl implements DialogueCall {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DialogueCallImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PresentationDslPackage.Literals.DIALOGUE_CALL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CompoundDialogue getCompoundDialogue() {
        if (eContainerFeatureID() != PresentationDslPackage.DIALOGUE_CALL__COMPOUND_DIALOGUE) return null;
        return (CompoundDialogue)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCompoundDialogue(CompoundDialogue newCompoundDialogue, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newCompoundDialogue, PresentationDslPackage.DIALOGUE_CALL__COMPOUND_DIALOGUE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCompoundDialogue(CompoundDialogue newCompoundDialogue) {
        if (newCompoundDialogue != eInternalContainer() || (eContainerFeatureID() != PresentationDslPackage.DIALOGUE_CALL__COMPOUND_DIALOGUE && newCompoundDialogue != null)) {
            if (EcoreUtil.isAncestor(this, newCompoundDialogue))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newCompoundDialogue != null)
                msgs = ((InternalEObject)newCompoundDialogue).eInverseAdd(this, PresentationDslPackage.COMPOUND_DIALOGUE__DIALOGUES, CompoundDialogue.class, msgs);
            msgs = basicSetCompoundDialogue(newCompoundDialogue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.DIALOGUE_CALL__COMPOUND_DIALOGUE, newCompoundDialogue, newCompoundDialogue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PresentationDslPackage.DIALOGUE_CALL__COMPOUND_DIALOGUE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetCompoundDialogue((CompoundDialogue)otherEnd, msgs);
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
            case PresentationDslPackage.DIALOGUE_CALL__COMPOUND_DIALOGUE:
                return basicSetCompoundDialogue(null, msgs);
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
            case PresentationDslPackage.DIALOGUE_CALL__COMPOUND_DIALOGUE:
                return eInternalContainer().eInverseRemove(this, PresentationDslPackage.COMPOUND_DIALOGUE__DIALOGUES, CompoundDialogue.class, msgs);
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
            case PresentationDslPackage.DIALOGUE_CALL__COMPOUND_DIALOGUE:
                return getCompoundDialogue();
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
            case PresentationDslPackage.DIALOGUE_CALL__COMPOUND_DIALOGUE:
                setCompoundDialogue((CompoundDialogue)newValue);
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
            case PresentationDslPackage.DIALOGUE_CALL__COMPOUND_DIALOGUE:
                setCompoundDialogue((CompoundDialogue)null);
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
            case PresentationDslPackage.DIALOGUE_CALL__COMPOUND_DIALOGUE:
                return getCompoundDialogue() != null;
        }
        return super.eIsSet(featureID);
    }

} //DialogueCallImpl
