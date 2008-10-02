/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.datacontract.mm.DataContractDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.CustomDto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dto Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyImpl#getBusinessClassDto <em>Business Class Dto</em>}</li>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyImpl#getCustomDto <em>Custom Dto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DtoPropertyImpl extends ModelElementImpl implements DtoProperty {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DtoPropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataContractDslPackage.Literals.DTO_PROPERTY;
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
            eNotify(new ENotificationImpl(this, Notification.SET, DataContractDslPackage.DTO_PROPERTY__DATA_TYPE, oldDataType, dataType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessClassDto getBusinessClassDto() {
        if (eContainerFeatureID != DataContractDslPackage.DTO_PROPERTY__BUSINESS_CLASS_DTO) return null;
        return (BusinessClassDto)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBusinessClassDto(BusinessClassDto newBusinessClassDto, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newBusinessClassDto, DataContractDslPackage.DTO_PROPERTY__BUSINESS_CLASS_DTO, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBusinessClassDto(BusinessClassDto newBusinessClassDto) {
        if (newBusinessClassDto != eInternalContainer() || (eContainerFeatureID != DataContractDslPackage.DTO_PROPERTY__BUSINESS_CLASS_DTO && newBusinessClassDto != null)) {
            if (EcoreUtil.isAncestor(this, newBusinessClassDto))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newBusinessClassDto != null)
                msgs = ((InternalEObject)newBusinessClassDto).eInverseAdd(this, DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTIES, BusinessClassDto.class, msgs);
            msgs = basicSetBusinessClassDto(newBusinessClassDto, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataContractDslPackage.DTO_PROPERTY__BUSINESS_CLASS_DTO, newBusinessClassDto, newBusinessClassDto));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CustomDto getCustomDto() {
        if (eContainerFeatureID != DataContractDslPackage.DTO_PROPERTY__CUSTOM_DTO) return null;
        return (CustomDto)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCustomDto(CustomDto newCustomDto, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newCustomDto, DataContractDslPackage.DTO_PROPERTY__CUSTOM_DTO, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCustomDto(CustomDto newCustomDto) {
        if (newCustomDto != eInternalContainer() || (eContainerFeatureID != DataContractDslPackage.DTO_PROPERTY__CUSTOM_DTO && newCustomDto != null)) {
            if (EcoreUtil.isAncestor(this, newCustomDto))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newCustomDto != null)
                msgs = ((InternalEObject)newCustomDto).eInverseAdd(this, DataContractDslPackage.CUSTOM_DTO__PROPERTIES, CustomDto.class, msgs);
            msgs = basicSetCustomDto(newCustomDto, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataContractDslPackage.DTO_PROPERTY__CUSTOM_DTO, newCustomDto, newCustomDto));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DataContractDslPackage.DTO_PROPERTY__BUSINESS_CLASS_DTO:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetBusinessClassDto((BusinessClassDto)otherEnd, msgs);
            case DataContractDslPackage.DTO_PROPERTY__CUSTOM_DTO:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetCustomDto((CustomDto)otherEnd, msgs);
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
            case DataContractDslPackage.DTO_PROPERTY__BUSINESS_CLASS_DTO:
                return basicSetBusinessClassDto(null, msgs);
            case DataContractDslPackage.DTO_PROPERTY__CUSTOM_DTO:
                return basicSetCustomDto(null, msgs);
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
        switch (eContainerFeatureID) {
            case DataContractDslPackage.DTO_PROPERTY__BUSINESS_CLASS_DTO:
                return eInternalContainer().eInverseRemove(this, DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTIES, BusinessClassDto.class, msgs);
            case DataContractDslPackage.DTO_PROPERTY__CUSTOM_DTO:
                return eInternalContainer().eInverseRemove(this, DataContractDslPackage.CUSTOM_DTO__PROPERTIES, CustomDto.class, msgs);
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
            case DataContractDslPackage.DTO_PROPERTY__DATA_TYPE:
                return getDataType();
            case DataContractDslPackage.DTO_PROPERTY__BUSINESS_CLASS_DTO:
                return getBusinessClassDto();
            case DataContractDslPackage.DTO_PROPERTY__CUSTOM_DTO:
                return getCustomDto();
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
            case DataContractDslPackage.DTO_PROPERTY__DATA_TYPE:
                setDataType((String)newValue);
                return;
            case DataContractDslPackage.DTO_PROPERTY__BUSINESS_CLASS_DTO:
                setBusinessClassDto((BusinessClassDto)newValue);
                return;
            case DataContractDslPackage.DTO_PROPERTY__CUSTOM_DTO:
                setCustomDto((CustomDto)newValue);
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
            case DataContractDslPackage.DTO_PROPERTY__DATA_TYPE:
                setDataType(DATA_TYPE_EDEFAULT);
                return;
            case DataContractDslPackage.DTO_PROPERTY__BUSINESS_CLASS_DTO:
                setBusinessClassDto((BusinessClassDto)null);
                return;
            case DataContractDslPackage.DTO_PROPERTY__CUSTOM_DTO:
                setCustomDto((CustomDto)null);
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
            case DataContractDslPackage.DTO_PROPERTY__DATA_TYPE:
                return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
            case DataContractDslPackage.DTO_PROPERTY__BUSINESS_CLASS_DTO:
                return getBusinessClassDto() != null;
            case DataContractDslPackage.DTO_PROPERTY__CUSTOM_DTO:
                return getCustomDto() != null;
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
        result.append(')');
        return result.toString();
    }

} //DtoPropertyImpl
