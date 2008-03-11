/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.Constraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.ConstraintImpl#getDatabaseConstraint <em>Database Constraint</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.ConstraintImpl#getResourceKey <em>Resource Key</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.ConstraintImpl#getValidationMessage <em>Validation Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends NamedElementImpl implements Constraint {
	/**
	 * The default value of the '{@link #getDatabaseConstraint() <em>Database Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_CONSTRAINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseConstraint() <em>Database Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseConstraint()
	 * @generated
	 * @ordered
	 */
	protected String databaseConstraint = DATABASE_CONSTRAINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceKey() <em>Resource Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceKey()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceKey() <em>Resource Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceKey()
	 * @generated
	 * @ordered
	 */
	protected String resourceKey = RESOURCE_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidationMessage() <em>Validation Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATION_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidationMessage() <em>Validation Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationMessage()
	 * @generated
	 * @ordered
	 */
	protected String validationMessage = VALIDATION_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessDomainDslPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseConstraint() {
		return databaseConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseConstraint(String newDatabaseConstraint) {
		String oldDatabaseConstraint = databaseConstraint;
		databaseConstraint = newDatabaseConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.CONSTRAINT__DATABASE_CONSTRAINT, oldDatabaseConstraint, databaseConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceKey() {
		return resourceKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceKey(String newResourceKey) {
		String oldResourceKey = resourceKey;
		resourceKey = newResourceKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.CONSTRAINT__RESOURCE_KEY, oldResourceKey, resourceKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValidationMessage() {
		return validationMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationMessage(String newValidationMessage) {
		String oldValidationMessage = validationMessage;
		validationMessage = newValidationMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.CONSTRAINT__VALIDATION_MESSAGE, oldValidationMessage, validationMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BusinessDomainDslPackage.CONSTRAINT__DATABASE_CONSTRAINT:
				return getDatabaseConstraint();
			case BusinessDomainDslPackage.CONSTRAINT__RESOURCE_KEY:
				return getResourceKey();
			case BusinessDomainDslPackage.CONSTRAINT__VALIDATION_MESSAGE:
				return getValidationMessage();
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
			case BusinessDomainDslPackage.CONSTRAINT__DATABASE_CONSTRAINT:
				setDatabaseConstraint((String)newValue);
				return;
			case BusinessDomainDslPackage.CONSTRAINT__RESOURCE_KEY:
				setResourceKey((String)newValue);
				return;
			case BusinessDomainDslPackage.CONSTRAINT__VALIDATION_MESSAGE:
				setValidationMessage((String)newValue);
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
			case BusinessDomainDslPackage.CONSTRAINT__DATABASE_CONSTRAINT:
				setDatabaseConstraint(DATABASE_CONSTRAINT_EDEFAULT);
				return;
			case BusinessDomainDslPackage.CONSTRAINT__RESOURCE_KEY:
				setResourceKey(RESOURCE_KEY_EDEFAULT);
				return;
			case BusinessDomainDslPackage.CONSTRAINT__VALIDATION_MESSAGE:
				setValidationMessage(VALIDATION_MESSAGE_EDEFAULT);
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
			case BusinessDomainDslPackage.CONSTRAINT__DATABASE_CONSTRAINT:
				return DATABASE_CONSTRAINT_EDEFAULT == null ? databaseConstraint != null : !DATABASE_CONSTRAINT_EDEFAULT.equals(databaseConstraint);
			case BusinessDomainDslPackage.CONSTRAINT__RESOURCE_KEY:
				return RESOURCE_KEY_EDEFAULT == null ? resourceKey != null : !RESOURCE_KEY_EDEFAULT.equals(resourceKey);
			case BusinessDomainDslPackage.CONSTRAINT__VALIDATION_MESSAGE:
				return VALIDATION_MESSAGE_EDEFAULT == null ? validationMessage != null : !VALIDATION_MESSAGE_EDEFAULT.equals(validationMessage);
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
		result.append(" (databaseConstraint: ");
		result.append(databaseConstraint);
		result.append(", resourceKey: ");
		result.append(resourceKey);
		result.append(", validationMessage: ");
		result.append(validationMessage);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
