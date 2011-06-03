/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.StringEnumerationLiteral;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.StringEnumerationLiteralImpl#getPersistedValue <em>Persisted Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringEnumerationLiteralImpl extends EnumerationLiteralImpl implements StringEnumerationLiteral {
    /**
     * The default value of the '{@link #getPersistedValue() <em>Persisted Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPersistedValue()
     * @generated
     * @ordered
     */
    protected static final String PERSISTED_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPersistedValue() <em>Persisted Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPersistedValue()
     * @generated
     * @ordered
     */
    protected String persistedValue = PERSISTED_VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StringEnumerationLiteralImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BusinessDomainDslPackage.Literals.STRING_ENUMERATION_LITERAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPersistedValue() {
        return persistedValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPersistedValue(String newPersistedValue) {
        String oldPersistedValue = persistedValue;
        persistedValue = newPersistedValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.STRING_ENUMERATION_LITERAL__PERSISTED_VALUE, oldPersistedValue, persistedValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BusinessDomainDslPackage.STRING_ENUMERATION_LITERAL__PERSISTED_VALUE:
                return getPersistedValue();
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
            case BusinessDomainDslPackage.STRING_ENUMERATION_LITERAL__PERSISTED_VALUE:
                setPersistedValue((String)newValue);
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
            case BusinessDomainDslPackage.STRING_ENUMERATION_LITERAL__PERSISTED_VALUE:
                setPersistedValue(PERSISTED_VALUE_EDEFAULT);
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
            case BusinessDomainDslPackage.STRING_ENUMERATION_LITERAL__PERSISTED_VALUE:
                return PERSISTED_VALUE_EDEFAULT == null ? persistedValue != null : !PERSISTED_VALUE_EDEFAULT.equals(persistedValue);
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
        result.append(" (persistedValue: ");
        result.append(persistedValue);
        result.append(')');
        return result.toString();
    }

} //StringEnumerationLiteralImpl
