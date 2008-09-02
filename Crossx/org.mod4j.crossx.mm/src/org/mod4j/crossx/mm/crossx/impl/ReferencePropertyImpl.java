/**
 * (c) Mod4j and contributors
 *
 * $Id$
 */
package org.mod4j.crossx.mm.crossx.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mod4j.crossx.mm.crossx.CrossxPackage;
import org.mod4j.crossx.mm.crossx.ReferenceProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.crossx.mm.crossx.impl.ReferencePropertyImpl#getReferredType <em>Referred Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferencePropertyImpl extends PropertyImpl implements ReferenceProperty {
    /**
     * The default value of the '{@link #getReferredType() <em>Referred Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredType()
     * @generated
     * @ordered
     */
    protected static final String REFERRED_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReferredType() <em>Referred Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredType()
     * @generated
     * @ordered
     */
    protected String referredType = REFERRED_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReferencePropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CrossxPackage.Literals.REFERENCE_PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getReferredType() {
        return referredType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferredType(String newReferredType) {
        String oldReferredType = referredType;
        referredType = newReferredType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CrossxPackage.REFERENCE_PROPERTY__REFERRED_TYPE, oldReferredType, referredType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CrossxPackage.REFERENCE_PROPERTY__REFERRED_TYPE:
                return getReferredType();
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
            case CrossxPackage.REFERENCE_PROPERTY__REFERRED_TYPE:
                setReferredType((String)newValue);
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
            case CrossxPackage.REFERENCE_PROPERTY__REFERRED_TYPE:
                setReferredType(REFERRED_TYPE_EDEFAULT);
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
            case CrossxPackage.REFERENCE_PROPERTY__REFERRED_TYPE:
                return REFERRED_TYPE_EDEFAULT == null ? referredType != null : !REFERRED_TYPE_EDEFAULT.equals(referredType);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (referredType: ");
        result.append(referredType);
        result.append(')');
        return result.toString();
    }

} //ReferencePropertyImpl
