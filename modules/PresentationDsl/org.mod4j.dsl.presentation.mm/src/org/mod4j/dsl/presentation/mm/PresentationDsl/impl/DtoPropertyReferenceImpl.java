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

import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dto Property Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DtoPropertyReferenceImpl#getSubname <em>Subname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DtoPropertyReferenceImpl extends ModelElementImpl implements DtoPropertyReference {
	/**
	 * The default value of the '{@link #getSubname() <em>Subname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubname()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubname() <em>Subname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubname()
	 * @generated
	 * @ordered
	 */
	protected String subname = SUBNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DtoPropertyReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationDslPackage.Literals.DTO_PROPERTY_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubname() {
		return subname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubname(String newSubname) {
		String oldSubname = subname;
		subname = newSubname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.DTO_PROPERTY_REFERENCE__SUBNAME, oldSubname, subname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PresentationDslPackage.DTO_PROPERTY_REFERENCE__SUBNAME:
				return getSubname();
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
			case PresentationDslPackage.DTO_PROPERTY_REFERENCE__SUBNAME:
				setSubname((String)newValue);
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
			case PresentationDslPackage.DTO_PROPERTY_REFERENCE__SUBNAME:
				setSubname(SUBNAME_EDEFAULT);
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
			case PresentationDslPackage.DTO_PROPERTY_REFERENCE__SUBNAME:
				return SUBNAME_EDEFAULT == null ? subname != null : !SUBNAME_EDEFAULT.equals(subname);
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
		result.append(" (subname: ");
		result.append(subname);
		result.append(')');
		return result.toString();
	}

} //DtoPropertyReferenceImpl
