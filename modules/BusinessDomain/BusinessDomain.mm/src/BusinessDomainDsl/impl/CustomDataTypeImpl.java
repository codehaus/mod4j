/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.CustomDataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.CustomDataTypeImpl#isAutoGenerate <em>Auto Generate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomDataTypeImpl extends PropertyContainerImpl implements CustomDataType {
	/**
	 * The default value of the '{@link #isAutoGenerate() <em>Auto Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoGenerate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_GENERATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAutoGenerate() <em>Auto Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoGenerate()
	 * @generated
	 * @ordered
	 */
	protected boolean autoGenerate = AUTO_GENERATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessDomainDslPackage.Literals.CUSTOM_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoGenerate() {
		return autoGenerate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoGenerate(boolean newAutoGenerate) {
		boolean oldAutoGenerate = autoGenerate;
		autoGenerate = newAutoGenerate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.CUSTOM_DATA_TYPE__AUTO_GENERATE, oldAutoGenerate, autoGenerate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BusinessDomainDslPackage.CUSTOM_DATA_TYPE__AUTO_GENERATE:
				return isAutoGenerate() ? Boolean.TRUE : Boolean.FALSE;
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
			case BusinessDomainDslPackage.CUSTOM_DATA_TYPE__AUTO_GENERATE:
				setAutoGenerate(((Boolean)newValue).booleanValue());
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
			case BusinessDomainDslPackage.CUSTOM_DATA_TYPE__AUTO_GENERATE:
				setAutoGenerate(AUTO_GENERATE_EDEFAULT);
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
			case BusinessDomainDslPackage.CUSTOM_DATA_TYPE__AUTO_GENERATE:
				return autoGenerate != AUTO_GENERATE_EDEFAULT;
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
		result.append(" (autoGenerate: ");
		result.append(autoGenerate);
		result.append(')');
		return result.toString();
	}

} //CustomDataTypeImpl
