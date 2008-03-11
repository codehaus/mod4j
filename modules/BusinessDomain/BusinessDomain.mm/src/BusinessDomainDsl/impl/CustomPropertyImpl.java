/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.CustomProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.CustomPropertyImpl#getCustomDataType <em>Custom Data Type</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.CustomPropertyImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.CustomPropertyImpl#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomPropertyImpl extends PropertyImpl implements CustomProperty {
	/**
	 * The default value of the '{@link #getCustomDataType() <em>Custom Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomDataType() <em>Custom Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomDataType()
	 * @generated
	 * @ordered
	 */
	protected String customDataType = CUSTOM_DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnumeration() <em>Enumeration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeration()
	 * @generated
	 * @ordered
	 */
	protected static final String ENUMERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeration()
	 * @generated
	 * @ordered
	 */
	protected String enumeration = ENUMERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = "Current ...";

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessDomainDslPackage.Literals.CUSTOM_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomDataType() {
		return customDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomDataType(String newCustomDataType) {
		String oldCustomDataType = customDataType;
		customDataType = newCustomDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.CUSTOM_PROPERTY__CUSTOM_DATA_TYPE, oldCustomDataType, customDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnumeration() {
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeration(String newEnumeration) {
		String oldEnumeration = enumeration;
		enumeration = newEnumeration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.CUSTOM_PROPERTY__ENUMERATION, oldEnumeration, enumeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.CUSTOM_PROPERTY__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BusinessDomainDslPackage.CUSTOM_PROPERTY__CUSTOM_DATA_TYPE:
				return getCustomDataType();
			case BusinessDomainDslPackage.CUSTOM_PROPERTY__ENUMERATION:
				return getEnumeration();
			case BusinessDomainDslPackage.CUSTOM_PROPERTY__NAMESPACE:
				return getNamespace();
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
			case BusinessDomainDslPackage.CUSTOM_PROPERTY__CUSTOM_DATA_TYPE:
				setCustomDataType((String)newValue);
				return;
			case BusinessDomainDslPackage.CUSTOM_PROPERTY__ENUMERATION:
				setEnumeration((String)newValue);
				return;
			case BusinessDomainDslPackage.CUSTOM_PROPERTY__NAMESPACE:
				setNamespace((String)newValue);
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
			case BusinessDomainDslPackage.CUSTOM_PROPERTY__CUSTOM_DATA_TYPE:
				setCustomDataType(CUSTOM_DATA_TYPE_EDEFAULT);
				return;
			case BusinessDomainDslPackage.CUSTOM_PROPERTY__ENUMERATION:
				setEnumeration(ENUMERATION_EDEFAULT);
				return;
			case BusinessDomainDslPackage.CUSTOM_PROPERTY__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
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
			case BusinessDomainDslPackage.CUSTOM_PROPERTY__CUSTOM_DATA_TYPE:
				return CUSTOM_DATA_TYPE_EDEFAULT == null ? customDataType != null : !CUSTOM_DATA_TYPE_EDEFAULT.equals(customDataType);
			case BusinessDomainDslPackage.CUSTOM_PROPERTY__ENUMERATION:
				return ENUMERATION_EDEFAULT == null ? enumeration != null : !ENUMERATION_EDEFAULT.equals(enumeration);
			case BusinessDomainDslPackage.CUSTOM_PROPERTY__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
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
		result.append(" (customDataType: ");
		result.append(customDataType);
		result.append(", enumeration: ");
		result.append(enumeration);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(')');
		return result.toString();
	}

} //CustomPropertyImpl
