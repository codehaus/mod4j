/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.datacontract.mm.DataContractDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassReference;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Class Dto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassDtoImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassDtoImpl#getBase <em>Base</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessClassDtoImpl extends DtoImpl implements BusinessClassDto {
    /**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected EList<DtoProperty> properties;

    /**
     * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBase()
     * @generated
     * @ordered
     */
    protected BusinessClassReference base;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BusinessClassDtoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataContractDslPackage.Literals.BUSINESS_CLASS_DTO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DtoProperty> getProperties() {
        if (properties == null) {
            properties = new EObjectContainmentEList<DtoProperty>(DtoProperty.class, this, DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTIES);
        }
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessClassReference getBase() {
        if (base != null && base.eIsProxy()) {
            InternalEObject oldBase = (InternalEObject)base;
            base = (BusinessClassReference)eResolveProxy(oldBase);
            if (base != oldBase) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataContractDslPackage.BUSINESS_CLASS_DTO__BASE, oldBase, base));
            }
        }
        return base;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessClassReference basicGetBase() {
        return base;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBase(BusinessClassReference newBase) {
        BusinessClassReference oldBase = base;
        base = newBase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataContractDslPackage.BUSINESS_CLASS_DTO__BASE, oldBase, base));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTIES:
                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
            case DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTIES:
                return getProperties();
            case DataContractDslPackage.BUSINESS_CLASS_DTO__BASE:
                if (resolve) return getBase();
                return basicGetBase();
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
            case DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTIES:
                getProperties().clear();
                getProperties().addAll((Collection<? extends DtoProperty>)newValue);
                return;
            case DataContractDslPackage.BUSINESS_CLASS_DTO__BASE:
                setBase((BusinessClassReference)newValue);
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
            case DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTIES:
                getProperties().clear();
                return;
            case DataContractDslPackage.BUSINESS_CLASS_DTO__BASE:
                setBase((BusinessClassReference)null);
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
            case DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTIES:
                return properties != null && !properties.isEmpty();
            case DataContractDslPackage.BUSINESS_CLASS_DTO__BASE:
                return base != null;
        }
        return super.eIsSet(featureID);
    }

} //BusinessClassDtoImpl
