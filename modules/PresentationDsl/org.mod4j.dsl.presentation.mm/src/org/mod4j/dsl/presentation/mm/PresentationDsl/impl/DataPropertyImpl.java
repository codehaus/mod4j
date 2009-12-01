/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DataPropertyImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DataPropertyImpl#isIsEnumeration <em>Is Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPropertyImpl extends ModelElementImpl implements DataProperty {
    /**
     * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected static final String DATA_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected String dataType = DATA_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #isIsEnumeration() <em>Is Enumeration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsEnumeration()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ENUMERATION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsEnumeration() <em>Is Enumeration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsEnumeration()
     * @generated
     * @ordered
     */
    protected boolean isEnumeration = IS_ENUMERATION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataPropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PresentationDslPackage.Literals.DATA_PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataType(String newDataType) {
        String oldDataType = dataType;
        dataType = newDataType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.DATA_PROPERTY__DATA_TYPE, oldDataType, dataType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsEnumeration() {
        return isEnumeration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsEnumeration(boolean newIsEnumeration) {
        boolean oldIsEnumeration = isEnumeration;
        isEnumeration = newIsEnumeration;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.DATA_PROPERTY__IS_ENUMERATION, oldIsEnumeration, isEnumeration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PresentationDslPackage.DATA_PROPERTY__DATA_TYPE:
                return getDataType();
            case PresentationDslPackage.DATA_PROPERTY__IS_ENUMERATION:
                return isIsEnumeration();
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
            case PresentationDslPackage.DATA_PROPERTY__DATA_TYPE:
                setDataType((String)newValue);
                return;
            case PresentationDslPackage.DATA_PROPERTY__IS_ENUMERATION:
                setIsEnumeration((Boolean)newValue);
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
            case PresentationDslPackage.DATA_PROPERTY__DATA_TYPE:
                setDataType(DATA_TYPE_EDEFAULT);
                return;
            case PresentationDslPackage.DATA_PROPERTY__IS_ENUMERATION:
                setIsEnumeration(IS_ENUMERATION_EDEFAULT);
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
            case PresentationDslPackage.DATA_PROPERTY__DATA_TYPE:
                return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
            case PresentationDslPackage.DATA_PROPERTY__IS_ENUMERATION:
                return isEnumeration != IS_ENUMERATION_EDEFAULT;
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
        result.append(" (dataType: ");
        result.append(dataType);
        result.append(", isEnumeration: ");
        result.append(isEnumeration);
        result.append(')');
        return result.toString();
    }

} //DataPropertyImpl
