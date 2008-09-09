/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.datacontract.mm.DataContractDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.Dto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.ListDto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.PropertyReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Dto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.ListDtoImpl#getBaseDto <em>Base Dto</em>}</li>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.ListDtoImpl#getSelectedProperties <em>Selected Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListDtoImpl extends DtoImpl implements ListDto {
	/**
	 * The cached value of the '{@link #getBaseDto() <em>Base Dto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseDto()
	 * @generated
	 * @ordered
	 */
	protected Dto baseDto;

	/**
	 * The cached value of the '{@link #getSelectedProperties() <em>Selected Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyReference> selectedProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListDtoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataContractDslPackage.Literals.LIST_DTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dto getBaseDto() {
		if (baseDto != null && baseDto.eIsProxy()) {
			InternalEObject oldBaseDto = (InternalEObject)baseDto;
			baseDto = (Dto)eResolveProxy(oldBaseDto);
			if (baseDto != oldBaseDto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataContractDslPackage.LIST_DTO__BASE_DTO, oldBaseDto, baseDto));
			}
		}
		return baseDto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dto basicGetBaseDto() {
		return baseDto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseDto(Dto newBaseDto) {
		Dto oldBaseDto = baseDto;
		baseDto = newBaseDto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataContractDslPackage.LIST_DTO__BASE_DTO, oldBaseDto, baseDto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyReference> getSelectedProperties() {
		if (selectedProperties == null) {
			selectedProperties = new EObjectResolvingEList<PropertyReference>(PropertyReference.class, this, DataContractDslPackage.LIST_DTO__SELECTED_PROPERTIES);
		}
		return selectedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataContractDslPackage.LIST_DTO__BASE_DTO:
				if (resolve) return getBaseDto();
				return basicGetBaseDto();
			case DataContractDslPackage.LIST_DTO__SELECTED_PROPERTIES:
				return getSelectedProperties();
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
			case DataContractDslPackage.LIST_DTO__BASE_DTO:
				setBaseDto((Dto)newValue);
				return;
			case DataContractDslPackage.LIST_DTO__SELECTED_PROPERTIES:
				getSelectedProperties().clear();
				getSelectedProperties().addAll((Collection<? extends PropertyReference>)newValue);
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
			case DataContractDslPackage.LIST_DTO__BASE_DTO:
				setBaseDto((Dto)null);
				return;
			case DataContractDslPackage.LIST_DTO__SELECTED_PROPERTIES:
				getSelectedProperties().clear();
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
			case DataContractDslPackage.LIST_DTO__BASE_DTO:
				return baseDto != null;
			case DataContractDslPackage.LIST_DTO__SELECTED_PROPERTIES:
				return selectedProperties != null && !selectedProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListDtoImpl
