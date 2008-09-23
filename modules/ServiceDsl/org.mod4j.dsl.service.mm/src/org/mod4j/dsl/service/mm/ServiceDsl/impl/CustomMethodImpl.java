/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.service.mm.ServiceDsl.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mod4j.dsl.service.mm.ServiceDsl.CustomMethod;
import org.mod4j.dsl.service.mm.ServiceDsl.DtoReference;
import org.mod4j.dsl.service.mm.ServiceDsl.Parameter;
import org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.CustomMethodImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.CustomMethodImpl#getInParameters <em>In Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomMethodImpl extends ServiceMethodImpl implements CustomMethod {
	/**
     * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOutput()
     * @generated
     * @ordered
     */
	protected DtoReference output;

	/**
     * The cached value of the '{@link #getInParameters() <em>In Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInParameters()
     * @generated
     * @ordered
     */
    protected EList<Parameter> inParameters;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CustomMethodImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ServiceDslPackage.Literals.CUSTOM_METHOD;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DtoReference getOutput() {
        if (output != null && output.eIsProxy()) {
            InternalEObject oldOutput = (InternalEObject)output;
            output = (DtoReference)eResolveProxy(oldOutput);
            if (output != oldOutput) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServiceDslPackage.CUSTOM_METHOD__OUTPUT, oldOutput, output));
            }
        }
        return output;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DtoReference basicGetOutput() {
        return output;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOutput(DtoReference newOutput) {
        DtoReference oldOutput = output;
        output = newOutput;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServiceDslPackage.CUSTOM_METHOD__OUTPUT, oldOutput, output));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Parameter> getInParameters() {
        if (inParameters == null) {
            inParameters = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, ServiceDslPackage.CUSTOM_METHOD__IN_PARAMETERS, ServiceDslPackage.PARAMETER__METHOD);
        }
        return inParameters;
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
            case ServiceDslPackage.CUSTOM_METHOD__IN_PARAMETERS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInParameters()).basicAdd(otherEnd, msgs);
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
            case ServiceDslPackage.CUSTOM_METHOD__IN_PARAMETERS:
                return ((InternalEList<?>)getInParameters()).basicRemove(otherEnd, msgs);
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
            case ServiceDslPackage.CUSTOM_METHOD__OUTPUT:
                if (resolve) return getOutput();
                return basicGetOutput();
            case ServiceDslPackage.CUSTOM_METHOD__IN_PARAMETERS:
                return getInParameters();
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
            case ServiceDslPackage.CUSTOM_METHOD__OUTPUT:
                setOutput((DtoReference)newValue);
                return;
            case ServiceDslPackage.CUSTOM_METHOD__IN_PARAMETERS:
                getInParameters().clear();
                getInParameters().addAll((Collection<? extends Parameter>)newValue);
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
            case ServiceDslPackage.CUSTOM_METHOD__OUTPUT:
                setOutput((DtoReference)null);
                return;
            case ServiceDslPackage.CUSTOM_METHOD__IN_PARAMETERS:
                getInParameters().clear();
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
            case ServiceDslPackage.CUSTOM_METHOD__OUTPUT:
                return output != null;
            case ServiceDslPackage.CUSTOM_METHOD__IN_PARAMETERS:
                return inParameters != null && !inParameters.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //CustomMethodImpl
