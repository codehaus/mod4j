/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.service.mm.ServiceDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mod4j.dsl.service.mm.ServiceDsl.CrudService;
import org.mod4j.dsl.service.mm.ServiceDsl.DtoReference;
import org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crud Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.CrudServiceImpl#getDto <em>Dto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CrudServiceImpl extends ModelElementImpl implements CrudService {
	/**
	 * The cached value of the '{@link #getDto() <em>Dto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDto()
	 * @generated
	 * @ordered
	 */
	protected DtoReference dto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrudServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServiceDslPackage.Literals.CRUD_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DtoReference getDto() {
		if (dto != null && dto.eIsProxy()) {
			InternalEObject oldDto = (InternalEObject)dto;
			dto = (DtoReference)eResolveProxy(oldDto);
			if (dto != oldDto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServiceDslPackage.CRUD_SERVICE__DTO, oldDto, dto));
			}
		}
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DtoReference basicGetDto() {
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDto(DtoReference newDto) {
		DtoReference oldDto = dto;
		dto = newDto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceDslPackage.CRUD_SERVICE__DTO, oldDto, dto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServiceDslPackage.CRUD_SERVICE__DTO:
				if (resolve) return getDto();
				return basicGetDto();
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
			case ServiceDslPackage.CRUD_SERVICE__DTO:
				setDto((DtoReference)newValue);
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
			case ServiceDslPackage.CRUD_SERVICE__DTO:
				setDto((DtoReference)null);
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
			case ServiceDslPackage.CRUD_SERVICE__DTO:
				return dto != null;
		}
		return super.eIsSet(featureID);
	}

} //CrudServiceImpl
