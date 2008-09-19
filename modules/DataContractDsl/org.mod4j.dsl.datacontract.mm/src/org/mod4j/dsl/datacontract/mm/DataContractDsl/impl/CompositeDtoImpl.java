/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.datacontract.mm.DataContractDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.mod4j.dsl.datacontract.mm.DataContractDsl.CompositeDto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.Dto;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Dto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.CompositeDtoImpl#getDtos <em>Dtos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeDtoImpl extends DtoImpl implements CompositeDto {
    /**
     * The cached value of the '{@link #getDtos() <em>Dtos</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtos()
     * @generated
     * @ordered
     */
    protected EList<Dto> dtos;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CompositeDtoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataContractDslPackage.Literals.COMPOSITE_DTO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Dto> getDtos() {
        if (dtos == null) {
            dtos = new EObjectResolvingEList<Dto>(Dto.class, this, DataContractDslPackage.COMPOSITE_DTO__DTOS);
        }
        return dtos;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DataContractDslPackage.COMPOSITE_DTO__DTOS:
                return getDtos();
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
            case DataContractDslPackage.COMPOSITE_DTO__DTOS:
                getDtos().clear();
                getDtos().addAll((Collection<? extends Dto>)newValue);
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
            case DataContractDslPackage.COMPOSITE_DTO__DTOS:
                getDtos().clear();
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
            case DataContractDslPackage.COMPOSITE_DTO__DTOS:
                return dtos != null && !dtos.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //CompositeDtoImpl
