/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.PersistencyMode;
import BusinessDomainDsl.Property;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.PropertyImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.PropertyImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.PropertyImpl#getPersistency <em>Persistency</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.PropertyImpl#isHasDefault <em>Has Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends ModelElementImpl implements Property {
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
     * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNullable()
     * @generated
     * @ordered
     */
    protected static final boolean NULLABLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNullable()
     * @generated
     * @ordered
     */
    protected boolean nullable = NULLABLE_EDEFAULT;

    /**
     * The default value of the '{@link #getPersistency() <em>Persistency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPersistency()
     * @generated
     * @ordered
     */
    protected static final PersistencyMode PERSISTENCY_EDEFAULT = PersistencyMode.READ_WRITE;

    /**
     * The cached value of the '{@link #getPersistency() <em>Persistency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPersistency()
     * @generated
     * @ordered
     */
    protected PersistencyMode persistency = PERSISTENCY_EDEFAULT;

    /**
     * The default value of the '{@link #isHasDefault() <em>Has Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isHasDefault()
     * @generated
     * @ordered
     */
    protected static final boolean HAS_DEFAULT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isHasDefault() <em>Has Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isHasDefault()
     * @generated
     * @ordered
     */
    protected boolean hasDefault = HAS_DEFAULT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BusinessDomainDslPackage.Literals.PROPERTY;
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
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.PROPERTY__DATA_TYPE, oldDataType, dataType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isNullable() {
        return nullable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNullable(boolean newNullable) {
        boolean oldNullable = nullable;
        nullable = newNullable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.PROPERTY__NULLABLE, oldNullable, nullable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PersistencyMode getPersistency() {
        return persistency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPersistency(PersistencyMode newPersistency) {
        PersistencyMode oldPersistency = persistency;
        persistency = newPersistency == null ? PERSISTENCY_EDEFAULT : newPersistency;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.PROPERTY__PERSISTENCY, oldPersistency, persistency));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isHasDefault() {
        return hasDefault;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHasDefault(boolean newHasDefault) {
        boolean oldHasDefault = hasDefault;
        hasDefault = newHasDefault;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.PROPERTY__HAS_DEFAULT, oldHasDefault, hasDefault));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BusinessDomainDslPackage.PROPERTY__DATA_TYPE:
                return getDataType();
            case BusinessDomainDslPackage.PROPERTY__NULLABLE:
                return isNullable() ? Boolean.TRUE : Boolean.FALSE;
            case BusinessDomainDslPackage.PROPERTY__PERSISTENCY:
                return getPersistency();
            case BusinessDomainDslPackage.PROPERTY__HAS_DEFAULT:
                return isHasDefault() ? Boolean.TRUE : Boolean.FALSE;
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
            case BusinessDomainDslPackage.PROPERTY__DATA_TYPE:
                setDataType((String)newValue);
                return;
            case BusinessDomainDslPackage.PROPERTY__NULLABLE:
                setNullable(((Boolean)newValue).booleanValue());
                return;
            case BusinessDomainDslPackage.PROPERTY__PERSISTENCY:
                setPersistency((PersistencyMode)newValue);
                return;
            case BusinessDomainDslPackage.PROPERTY__HAS_DEFAULT:
                setHasDefault(((Boolean)newValue).booleanValue());
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
            case BusinessDomainDslPackage.PROPERTY__DATA_TYPE:
                setDataType(DATA_TYPE_EDEFAULT);
                return;
            case BusinessDomainDslPackage.PROPERTY__NULLABLE:
                setNullable(NULLABLE_EDEFAULT);
                return;
            case BusinessDomainDslPackage.PROPERTY__PERSISTENCY:
                setPersistency(PERSISTENCY_EDEFAULT);
                return;
            case BusinessDomainDslPackage.PROPERTY__HAS_DEFAULT:
                setHasDefault(HAS_DEFAULT_EDEFAULT);
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
            case BusinessDomainDslPackage.PROPERTY__DATA_TYPE:
                return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
            case BusinessDomainDslPackage.PROPERTY__NULLABLE:
                return nullable != NULLABLE_EDEFAULT;
            case BusinessDomainDslPackage.PROPERTY__PERSISTENCY:
                return persistency != PERSISTENCY_EDEFAULT;
            case BusinessDomainDslPackage.PROPERTY__HAS_DEFAULT:
                return hasDefault != HAS_DEFAULT_EDEFAULT;
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
        result.append(", nullable: ");
        result.append(nullable);
        result.append(", persistency: ");
        result.append(persistency);
        result.append(", hasDefault: ");
        result.append(hasDefault);
        result.append(')');
        return result.toString();
    }

} //PropertyImpl
