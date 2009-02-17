/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.datacontract.mm.DataContractDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.Dto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoAssociationRoleProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dto Association Role Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoAssociationRolePropertyImpl#getDtoType <em>Dto Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DtoAssociationRolePropertyImpl extends DtoPropertyImpl implements DtoAssociationRoleProperty {
    /**
     * The cached value of the '{@link #getDtoType() <em>Dto Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtoType()
     * @generated
     * @ordered
     */
    protected Dto dtoType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DtoAssociationRolePropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataContractDslPackage.Literals.DTO_ASSOCIATION_ROLE_PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Dto getDtoType() {
        if (dtoType != null && dtoType.eIsProxy()) {
            InternalEObject oldDtoType = (InternalEObject)dtoType;
            dtoType = (Dto)eResolveProxy(oldDtoType);
            if (dtoType != oldDtoType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataContractDslPackage.DTO_ASSOCIATION_ROLE_PROPERTY__DTO_TYPE, oldDtoType, dtoType));
            }
        }
        return dtoType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Dto basicGetDtoType() {
        return dtoType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDtoType(Dto newDtoType) {
        Dto oldDtoType = dtoType;
        dtoType = newDtoType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataContractDslPackage.DTO_ASSOCIATION_ROLE_PROPERTY__DTO_TYPE, oldDtoType, dtoType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DataContractDslPackage.DTO_ASSOCIATION_ROLE_PROPERTY__DTO_TYPE:
                if (resolve) return getDtoType();
                return basicGetDtoType();
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
            case DataContractDslPackage.DTO_ASSOCIATION_ROLE_PROPERTY__DTO_TYPE:
                setDtoType((Dto)newValue);
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
            case DataContractDslPackage.DTO_ASSOCIATION_ROLE_PROPERTY__DTO_TYPE:
                setDtoType((Dto)null);
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
            case DataContractDslPackage.DTO_ASSOCIATION_ROLE_PROPERTY__DTO_TYPE:
                return dtoType != null;
        }
        return super.eIsSet(featureID);
    }

} //DtoAssociationRolePropertyImpl
