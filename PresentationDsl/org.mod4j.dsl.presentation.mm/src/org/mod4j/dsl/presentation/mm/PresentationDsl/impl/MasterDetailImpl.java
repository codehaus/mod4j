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
import org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Master Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.MasterDetailImpl#getMaster <em>Master</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.MasterDetailImpl#getDetail <em>Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MasterDetailImpl extends CompoundDialogueImpl implements MasterDetail {
	/**
     * The cached value of the '{@link #getMaster() <em>Master</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaster()
     * @generated
     * @ordered
     */
	protected DialogueCall master;

	/**
     * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDetail()
     * @generated
     * @ordered
     */
	protected DialogueCall detail;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MasterDetailImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return PresentationDslPackage.Literals.MASTER_DETAIL;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DialogueCall getMaster() {
        return master;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetMaster(DialogueCall newMaster, NotificationChain msgs) {
        DialogueCall oldMaster = master;
        master = newMaster;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationDslPackage.MASTER_DETAIL__MASTER, oldMaster, newMaster);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMaster(DialogueCall newMaster) {
        if (newMaster != master) {
            NotificationChain msgs = null;
            if (master != null)
                msgs = ((InternalEObject)master).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.MASTER_DETAIL__MASTER, null, msgs);
            if (newMaster != null)
                msgs = ((InternalEObject)newMaster).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.MASTER_DETAIL__MASTER, null, msgs);
            msgs = basicSetMaster(newMaster, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.MASTER_DETAIL__MASTER, newMaster, newMaster));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DialogueCall getDetail() {
        return detail;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetDetail(DialogueCall newDetail, NotificationChain msgs) {
        DialogueCall oldDetail = detail;
        detail = newDetail;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationDslPackage.MASTER_DETAIL__DETAIL, oldDetail, newDetail);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDetail(DialogueCall newDetail) {
        if (newDetail != detail) {
            NotificationChain msgs = null;
            if (detail != null)
                msgs = ((InternalEObject)detail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.MASTER_DETAIL__DETAIL, null, msgs);
            if (newDetail != null)
                msgs = ((InternalEObject)newDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.MASTER_DETAIL__DETAIL, null, msgs);
            msgs = basicSetDetail(newDetail, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.MASTER_DETAIL__DETAIL, newDetail, newDetail));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PresentationDslPackage.MASTER_DETAIL__MASTER:
                return basicSetMaster(null, msgs);
            case PresentationDslPackage.MASTER_DETAIL__DETAIL:
                return basicSetDetail(null, msgs);
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
            case PresentationDslPackage.MASTER_DETAIL__MASTER:
                return getMaster();
            case PresentationDslPackage.MASTER_DETAIL__DETAIL:
                return getDetail();
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
            case PresentationDslPackage.MASTER_DETAIL__MASTER:
                setMaster((DialogueCall)newValue);
                return;
            case PresentationDslPackage.MASTER_DETAIL__DETAIL:
                setDetail((DialogueCall)newValue);
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
            case PresentationDslPackage.MASTER_DETAIL__MASTER:
                setMaster((DialogueCall)null);
                return;
            case PresentationDslPackage.MASTER_DETAIL__DETAIL:
                setDetail((DialogueCall)null);
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
            case PresentationDslPackage.MASTER_DETAIL__MASTER:
                return master != null;
            case PresentationDslPackage.MASTER_DETAIL__DETAIL:
                return detail != null;
        }
        return super.eIsSet(featureID);
    }

} //MasterDetailImpl
