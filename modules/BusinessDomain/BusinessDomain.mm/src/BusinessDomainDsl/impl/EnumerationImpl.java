/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.Enumeration;
import BusinessDomainDsl.EnumerationLiteral;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.EnumerationImpl#isPersistAsString <em>Persist As String</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.EnumerationImpl#getEnumerationLiteral <em>Enumeration Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationImpl extends CommentableElementImpl implements Enumeration {
	/**
	 * The default value of the '{@link #isPersistAsString() <em>Persist As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistAsString()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSIST_AS_STRING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPersistAsString() <em>Persist As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistAsString()
	 * @generated
	 * @ordered
	 */
	protected boolean persistAsString = PERSIST_AS_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnumerationLiteral() <em>Enumeration Literal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationLiteral()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationLiteral> enumerationLiteral;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessDomainDslPackage.Literals.ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPersistAsString() {
		return persistAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistAsString(boolean newPersistAsString) {
		boolean oldPersistAsString = persistAsString;
		persistAsString = newPersistAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ENUMERATION__PERSIST_AS_STRING, oldPersistAsString, persistAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationLiteral> getEnumerationLiteral() {
		if (enumerationLiteral == null) {
			enumerationLiteral = new EObjectContainmentEList<EnumerationLiteral>(EnumerationLiteral.class, this, BusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERAL);
		}
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERAL:
				return ((InternalEList<?>)getEnumerationLiteral()).basicRemove(otherEnd, msgs);
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
			case BusinessDomainDslPackage.ENUMERATION__PERSIST_AS_STRING:
				return isPersistAsString() ? Boolean.TRUE : Boolean.FALSE;
			case BusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERAL:
				return getEnumerationLiteral();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BusinessDomainDslPackage.ENUMERATION__PERSIST_AS_STRING:
				setPersistAsString(((Boolean)newValue).booleanValue());
				return;
			case BusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERAL:
				getEnumerationLiteral().clear();
				getEnumerationLiteral().addAll((Collection<? extends EnumerationLiteral>)newValue);
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
			case BusinessDomainDslPackage.ENUMERATION__PERSIST_AS_STRING:
				setPersistAsString(PERSIST_AS_STRING_EDEFAULT);
				return;
			case BusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERAL:
				getEnumerationLiteral().clear();
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
			case BusinessDomainDslPackage.ENUMERATION__PERSIST_AS_STRING:
				return persistAsString != PERSIST_AS_STRING_EDEFAULT;
			case BusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERAL:
				return enumerationLiteral != null && !enumerationLiteral.isEmpty();
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
		result.append(" (persistAsString: ");
		result.append(persistAsString);
		result.append(')');
		return result.toString();
	}

} //EnumerationImpl
