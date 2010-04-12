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

import org.mod4j.dsl.presentation.mm.PresentationDsl.AbstractProcess;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Dialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Menu;
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
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessCallImpl#getReferredProcess <em>Referred Process</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessCallImpl#getOwningMenu <em>Owning Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessCallImpl extends UICallImpl implements ProcessCall {
    /**
     * The cached value of the '{@link #getReferredProcess() <em>Referred Process</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredProcess()
     * @generated
     * @ordered
     */
    protected AbstractProcess referredProcess;

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
    public AbstractProcess getReferredProcess() {
        if (referredProcess != null && referredProcess.eIsProxy()) {
            InternalEObject oldReferredProcess = (InternalEObject)referredProcess;
            referredProcess = (AbstractProcess)eResolveProxy(oldReferredProcess);
            if (referredProcess != oldReferredProcess) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PresentationDslPackage.PROCESS_CALL__REFERRED_PROCESS, oldReferredProcess, referredProcess));
            }
        }
        return referredProcess;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractProcess basicGetReferredProcess() {
        return referredProcess;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferredProcess(AbstractProcess newReferredProcess) {
        AbstractProcess oldReferredProcess = referredProcess;
        referredProcess = newReferredProcess;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.PROCESS_CALL__REFERRED_PROCESS, oldReferredProcess, referredProcess));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Menu getOwningMenu() {
        if (eContainerFeatureID() != PresentationDslPackage.PROCESS_CALL__OWNING_MENU) return null;
        return (Menu)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwningMenu(Menu newOwningMenu, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOwningMenu, PresentationDslPackage.PROCESS_CALL__OWNING_MENU, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwningMenu(Menu newOwningMenu) {
        if (newOwningMenu != eInternalContainer() || (eContainerFeatureID() != PresentationDslPackage.PROCESS_CALL__OWNING_MENU && newOwningMenu != null)) {
            if (EcoreUtil.isAncestor(this, newOwningMenu))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newOwningMenu != null)
                msgs = ((InternalEObject)newOwningMenu).eInverseAdd(this, PresentationDslPackage.MENU__START_PROCESSES, Menu.class, msgs);
            msgs = basicSetOwningMenu(newOwningMenu, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.PROCESS_CALL__OWNING_MENU, newOwningMenu, newOwningMenu));
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
            case PresentationDslPackage.PROCESS_CALL__OWNING_MENU:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOwningMenu((Menu)otherEnd, msgs);
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
            case PresentationDslPackage.PROCESS_CALL__OWNING_MENU:
                return basicSetOwningMenu(null, msgs);
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
            case PresentationDslPackage.PROCESS_CALL__OWNING_MENU:
                return eInternalContainer().eInverseRemove(this, PresentationDslPackage.MENU__START_PROCESSES, Menu.class, msgs);
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
            case PresentationDslPackage.PROCESS_CALL__REFERRED_PROCESS:
                if (resolve) return getReferredProcess();
                return basicGetReferredProcess();
            case PresentationDslPackage.PROCESS_CALL__OWNING_MENU:
                return getOwningMenu();
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
            case PresentationDslPackage.PROCESS_CALL__REFERRED_PROCESS:
                setReferredProcess((AbstractProcess)newValue);
                return;
            case PresentationDslPackage.PROCESS_CALL__OWNING_MENU:
                setOwningMenu((Menu)newValue);
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
            case PresentationDslPackage.PROCESS_CALL__REFERRED_PROCESS:
                setReferredProcess((AbstractProcess)null);
                return;
            case PresentationDslPackage.PROCESS_CALL__OWNING_MENU:
                setOwningMenu((Menu)null);
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
            case PresentationDslPackage.PROCESS_CALL__REFERRED_PROCESS:
                return referredProcess != null;
            case PresentationDslPackage.PROCESS_CALL__OWNING_MENU:
                return getOwningMenu() != null;
        }
        return super.eIsSet(featureID);
    }

} //ProcessCallImpl
