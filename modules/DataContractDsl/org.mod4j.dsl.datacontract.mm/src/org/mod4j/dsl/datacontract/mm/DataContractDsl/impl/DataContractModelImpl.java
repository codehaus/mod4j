/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.datacontract.mm.DataContractDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassReference;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.Dto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.Enumeration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Contract Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractModelImpl#getDtos <em>Dtos</em>}</li>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractModelImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractModelImpl#getBusinessClasses <em>Business Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataContractModelImpl extends ModelElementImpl implements DataContractModel {
    /**
     * The cached value of the '{@link #getDtos() <em>Dtos</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtos()
     * @generated
     * @ordered
     */
    protected EList<Dto> dtos;

    /**
     * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnumerations()
     * @generated
     * @ordered
     */
    protected EList<Enumeration> enumerations;

    /**
     * The cached value of the '{@link #getBusinessClasses() <em>Business Classes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBusinessClasses()
     * @generated
     * @ordered
     */
    protected EList<BusinessClassReference> businessClasses;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataContractModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataContractDslPackage.Literals.DATA_CONTRACT_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Dto> getDtos() {
        if (dtos == null) {
            dtos = new EObjectContainmentWithInverseEList<Dto>(Dto.class, this, DataContractDslPackage.DATA_CONTRACT_MODEL__DTOS, DataContractDslPackage.DTO__DATACONTRACT_MODEL);
        }
        return dtos;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Enumeration> getEnumerations() {
        if (enumerations == null) {
            enumerations = new EObjectContainmentEList<Enumeration>(Enumeration.class, this, DataContractDslPackage.DATA_CONTRACT_MODEL__ENUMERATIONS);
        }
        return enumerations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BusinessClassReference> getBusinessClasses() {
        if (businessClasses == null) {
            businessClasses = new EObjectContainmentWithInverseEList<BusinessClassReference>(BusinessClassReference.class, this, DataContractDslPackage.DATA_CONTRACT_MODEL__BUSINESS_CLASSES, DataContractDslPackage.BUSINESS_CLASS_REFERENCE__DATACONTRACT_MODEL);
        }
        return businessClasses;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DataContractDslPackage.DATA_CONTRACT_MODEL__DTOS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getDtos()).basicAdd(otherEnd, msgs);
            case DataContractDslPackage.DATA_CONTRACT_MODEL__BUSINESS_CLASSES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getBusinessClasses()).basicAdd(otherEnd, msgs);
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
            case DataContractDslPackage.DATA_CONTRACT_MODEL__DTOS:
                return ((InternalEList<?>)getDtos()).basicRemove(otherEnd, msgs);
            case DataContractDslPackage.DATA_CONTRACT_MODEL__ENUMERATIONS:
                return ((InternalEList<?>)getEnumerations()).basicRemove(otherEnd, msgs);
            case DataContractDslPackage.DATA_CONTRACT_MODEL__BUSINESS_CLASSES:
                return ((InternalEList<?>)getBusinessClasses()).basicRemove(otherEnd, msgs);
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
            case DataContractDslPackage.DATA_CONTRACT_MODEL__DTOS:
                return getDtos();
            case DataContractDslPackage.DATA_CONTRACT_MODEL__ENUMERATIONS:
                return getEnumerations();
            case DataContractDslPackage.DATA_CONTRACT_MODEL__BUSINESS_CLASSES:
                return getBusinessClasses();
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
            case DataContractDslPackage.DATA_CONTRACT_MODEL__DTOS:
                getDtos().clear();
                getDtos().addAll((Collection<? extends Dto>)newValue);
                return;
            case DataContractDslPackage.DATA_CONTRACT_MODEL__ENUMERATIONS:
                getEnumerations().clear();
                getEnumerations().addAll((Collection<? extends Enumeration>)newValue);
                return;
            case DataContractDslPackage.DATA_CONTRACT_MODEL__BUSINESS_CLASSES:
                getBusinessClasses().clear();
                getBusinessClasses().addAll((Collection<? extends BusinessClassReference>)newValue);
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
            case DataContractDslPackage.DATA_CONTRACT_MODEL__DTOS:
                getDtos().clear();
                return;
            case DataContractDslPackage.DATA_CONTRACT_MODEL__ENUMERATIONS:
                getEnumerations().clear();
                return;
            case DataContractDslPackage.DATA_CONTRACT_MODEL__BUSINESS_CLASSES:
                getBusinessClasses().clear();
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
            case DataContractDslPackage.DATA_CONTRACT_MODEL__DTOS:
                return dtos != null && !dtos.isEmpty();
            case DataContractDslPackage.DATA_CONTRACT_MODEL__ENUMERATIONS:
                return enumerations != null && !enumerations.isEmpty();
            case DataContractDslPackage.DATA_CONTRACT_MODEL__BUSINESS_CLASSES:
                return businessClasses != null && !businessClasses.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //DataContractModelImpl
