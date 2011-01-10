/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty;
import org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement;
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
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DataPropertyImpl#getFormElement <em>Form Element</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DataPropertyImpl#isEditable <em>Editable</em>}</li>
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
	 * The default value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDITABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean editable = EDITABLE_EDEFAULT;

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
	public FormElement getFormElement() {
		if (eContainerFeatureID() != PresentationDslPackage.DATA_PROPERTY__FORM_ELEMENT) return null;
		return (FormElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormElement(FormElement newFormElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFormElement, PresentationDslPackage.DATA_PROPERTY__FORM_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormElement(FormElement newFormElement) {
		if (newFormElement != eInternalContainer() || (eContainerFeatureID() != PresentationDslPackage.DATA_PROPERTY__FORM_ELEMENT && newFormElement != null)) {
			if (EcoreUtil.isAncestor(this, newFormElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFormElement != null)
				msgs = ((InternalEObject)newFormElement).eInverseAdd(this, PresentationDslPackage.FORM_ELEMENT__DATA_PROPERTY, FormElement.class, msgs);
			msgs = basicSetFormElement(newFormElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.DATA_PROPERTY__FORM_ELEMENT, newFormElement, newFormElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEditable() {
		return editable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditable(boolean newEditable) {
		boolean oldEditable = editable;
		editable = newEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.DATA_PROPERTY__EDITABLE, oldEditable, editable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationDslPackage.DATA_PROPERTY__FORM_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFormElement((FormElement)otherEnd, msgs);
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
			case PresentationDslPackage.DATA_PROPERTY__FORM_ELEMENT:
				return basicSetFormElement(null, msgs);
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
			case PresentationDslPackage.DATA_PROPERTY__FORM_ELEMENT:
				return eInternalContainer().eInverseRemove(this, PresentationDslPackage.FORM_ELEMENT__DATA_PROPERTY, FormElement.class, msgs);
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
			case PresentationDslPackage.DATA_PROPERTY__DATA_TYPE:
				return getDataType();
			case PresentationDslPackage.DATA_PROPERTY__IS_ENUMERATION:
				return isIsEnumeration();
			case PresentationDslPackage.DATA_PROPERTY__FORM_ELEMENT:
				return getFormElement();
			case PresentationDslPackage.DATA_PROPERTY__EDITABLE:
				return isEditable();
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
			case PresentationDslPackage.DATA_PROPERTY__FORM_ELEMENT:
				setFormElement((FormElement)newValue);
				return;
			case PresentationDslPackage.DATA_PROPERTY__EDITABLE:
				setEditable((Boolean)newValue);
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
			case PresentationDslPackage.DATA_PROPERTY__FORM_ELEMENT:
				setFormElement((FormElement)null);
				return;
			case PresentationDslPackage.DATA_PROPERTY__EDITABLE:
				setEditable(EDITABLE_EDEFAULT);
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
			case PresentationDslPackage.DATA_PROPERTY__FORM_ELEMENT:
				return getFormElement() != null;
			case PresentationDslPackage.DATA_PROPERTY__EDITABLE:
				return editable != EDITABLE_EDEFAULT;
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
		result.append(", editable: ");
		result.append(editable);
		result.append(')');
		return result.toString();
	}

} //DataPropertyImpl
