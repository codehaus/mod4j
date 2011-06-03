/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.IntegerEnumeration;
import BusinessDomainDsl.IntegerEnumerationLiteral;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.IntegerEnumerationLiteralImpl#getPersistedValue <em>Persisted Value</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.IntegerEnumerationLiteralImpl#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerEnumerationLiteralImpl extends ModelElementImpl implements IntegerEnumerationLiteral {
    /**
     * The default value of the '{@link #getPersistedValue() <em>Persisted Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPersistedValue()
     * @generated
     * @ordered
     */
    protected static final int PERSISTED_VALUE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPersistedValue() <em>Persisted Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPersistedValue()
     * @generated
     * @ordered
     */
    protected int persistedValue = PERSISTED_VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IntegerEnumerationLiteralImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BusinessDomainDslPackage.Literals.INTEGER_ENUMERATION_LITERAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPersistedValue() {
        return persistedValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPersistedValue(int newPersistedValue) {
        int oldPersistedValue = persistedValue;
        persistedValue = newPersistedValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.INTEGER_ENUMERATION_LITERAL__PERSISTED_VALUE, oldPersistedValue, persistedValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntegerEnumeration getEnumeration() {
        if (eContainerFeatureID() != BusinessDomainDslPackage.INTEGER_ENUMERATION_LITERAL__ENUMERATION) return null;
        return (IntegerEnumeration)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnumeration(IntegerEnumeration newEnumeration, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEnumeration, BusinessDomainDslPackage.INTEGER_ENUMERATION_LITERAL__ENUMERATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnumeration(IntegerEnumeration newEnumeration) {
        if (newEnumeration != eInternalContainer() || (eContainerFeatureID() != BusinessDomainDslPackage.INTEGER_ENUMERATION_LITERAL__ENUMERATION && newEnumeration != null)) {
            if (EcoreUtil.isAncestor(this, newEnumeration))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEnumeration != null)
                msgs = ((InternalEObject)newEnumeration).eInverseAdd(this, BusinessDomainDslPackage.INTEGER_ENUMERATION__ENUMERATION_LITERALS, IntegerEnumeration.class, msgs);
            msgs = basicSetEnumeration(newEnumeration, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.INTEGER_ENUMERATION_LITERAL__ENUMERATION, newEnumeration, newEnumeration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BusinessDomainDslPackage.INTEGER_ENUMERATION_LITERAL__ENUMERATION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEnumeration((IntegerEnumeration)otherEnd, msgs);
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
            case BusinessDomainDslPackage.INTEGER_ENUMERATION_LITERAL__ENUMERATION:
                return basicSetEnumeration(null, msgs);
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
            case BusinessDomainDslPackage.INTEGER_ENUMERATION_LITERAL__ENUMERATION:
                return eInternalContainer().eInverseRemove(this, BusinessDomainDslPackage.INTEGER_ENUMERATION__ENUMERATION_LITERALS, IntegerEnumeration.class, msgs);
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
            case BusinessDomainDslPackage.INTEGER_ENUMERATION_LITERAL__PERSISTED_VALUE:
                return getPersistedValue();
            case BusinessDomainDslPackage.INTEGER_ENUMERATION_LITERAL__ENUMERATION:
                return getEnumeration();
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
            case BusinessDomainDslPackage.INTEGER_ENUMERATION_LITERAL__PERSISTED_VALUE:
                setPersistedValue((Integer)newValue);
                return;
            case BusinessDomainDslPackage.INTEGER_ENUMERATION_LITERAL__ENUMERATION:
                setEnumeration((IntegerEnumeration)newValue);
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
            case BusinessDomainDslPackage.INTEGER_ENUMERATION_LITERAL__PERSISTED_VALUE:
                setPersistedValue(PERSISTED_VALUE_EDEFAULT);
                return;
            case BusinessDomainDslPackage.INTEGER_ENUMERATION_LITERAL__ENUMERATION:
                setEnumeration((IntegerEnumeration)null);
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
            case BusinessDomainDslPackage.INTEGER_ENUMERATION_LITERAL__PERSISTED_VALUE:
                return persistedValue != PERSISTED_VALUE_EDEFAULT;
            case BusinessDomainDslPackage.INTEGER_ENUMERATION_LITERAL__ENUMERATION:
                return getEnumeration() != null;
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

} //IntegerEnumerationLiteralImpl
