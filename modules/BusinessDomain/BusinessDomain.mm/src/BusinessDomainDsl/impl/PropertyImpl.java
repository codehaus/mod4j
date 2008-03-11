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
 *   <li>{@link BusinessDomainDsl.impl.PropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.PropertyImpl#isUseAsLogicalId <em>Use As Logical Id</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.PropertyImpl#getPersistency <em>Persistency</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.PropertyImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends NamedElementImpl implements Property {
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
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseAsLogicalId() <em>Use As Logical Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAsLogicalId()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_AS_LOGICAL_ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseAsLogicalId() <em>Use As Logical Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAsLogicalId()
	 * @generated
	 * @ordered
	 */
	protected boolean useAsLogicalId = USE_AS_LOGICAL_ID_EDEFAULT;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.PROPERTY__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseAsLogicalId() {
		return useAsLogicalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseAsLogicalId(boolean newUseAsLogicalId) {
		boolean oldUseAsLogicalId = useAsLogicalId;
		useAsLogicalId = newUseAsLogicalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.PROPERTY__USE_AS_LOGICAL_ID, oldUseAsLogicalId, useAsLogicalId));
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
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.PROPERTY__DESCRIPTION, oldDescription, description));
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
			case BusinessDomainDslPackage.PROPERTY__DEFAULT_VALUE:
				return getDefaultValue();
			case BusinessDomainDslPackage.PROPERTY__USE_AS_LOGICAL_ID:
				return isUseAsLogicalId() ? Boolean.TRUE : Boolean.FALSE;
			case BusinessDomainDslPackage.PROPERTY__PERSISTENCY:
				return getPersistency();
			case BusinessDomainDslPackage.PROPERTY__DESCRIPTION:
				return getDescription();
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
			case BusinessDomainDslPackage.PROPERTY__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case BusinessDomainDslPackage.PROPERTY__USE_AS_LOGICAL_ID:
				setUseAsLogicalId(((Boolean)newValue).booleanValue());
				return;
			case BusinessDomainDslPackage.PROPERTY__PERSISTENCY:
				setPersistency((PersistencyMode)newValue);
				return;
			case BusinessDomainDslPackage.PROPERTY__DESCRIPTION:
				setDescription((String)newValue);
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
			case BusinessDomainDslPackage.PROPERTY__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case BusinessDomainDslPackage.PROPERTY__USE_AS_LOGICAL_ID:
				setUseAsLogicalId(USE_AS_LOGICAL_ID_EDEFAULT);
				return;
			case BusinessDomainDslPackage.PROPERTY__PERSISTENCY:
				setPersistency(PERSISTENCY_EDEFAULT);
				return;
			case BusinessDomainDslPackage.PROPERTY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case BusinessDomainDslPackage.PROPERTY__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case BusinessDomainDslPackage.PROPERTY__USE_AS_LOGICAL_ID:
				return useAsLogicalId != USE_AS_LOGICAL_ID_EDEFAULT;
			case BusinessDomainDslPackage.PROPERTY__PERSISTENCY:
				return persistency != PERSISTENCY_EDEFAULT;
			case BusinessDomainDslPackage.PROPERTY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", useAsLogicalId: ");
		result.append(useAsLogicalId);
		result.append(", persistency: ");
		result.append(persistency);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
