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

import org.mod4j.dsl.service.mm.ServiceDsl.CustomMethod;
import org.mod4j.dsl.service.mm.ServiceDsl.DtoReference;
import org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.CustomMethodImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.mod4j.dsl.service.mm.ServiceDsl.impl.CustomMethodImpl#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomMethodImpl extends ServiceMethodImpl implements CustomMethod {
	/**
     * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInput()
     * @generated
     * @ordered
     */
	protected DtoReference input;

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
	public DtoReference getInput() {
        if (input != null && input.eIsProxy()) {
            InternalEObject oldInput = (InternalEObject)input;
            input = (DtoReference)eResolveProxy(oldInput);
            if (input != oldInput) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServiceDslPackage.CUSTOM_METHOD__INPUT, oldInput, input));
            }
        }
        return input;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DtoReference basicGetInput() {
        return input;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setInput(DtoReference newInput) {
        DtoReference oldInput = input;
        input = newInput;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServiceDslPackage.CUSTOM_METHOD__INPUT, oldInput, input));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ServiceDslPackage.CUSTOM_METHOD__INPUT:
                if (resolve) return getInput();
                return basicGetInput();
            case ServiceDslPackage.CUSTOM_METHOD__OUTPUT:
                if (resolve) return getOutput();
                return basicGetOutput();
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
            case ServiceDslPackage.CUSTOM_METHOD__INPUT:
                setInput((DtoReference)newValue);
                return;
            case ServiceDslPackage.CUSTOM_METHOD__OUTPUT:
                setOutput((DtoReference)newValue);
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
            case ServiceDslPackage.CUSTOM_METHOD__INPUT:
                setInput((DtoReference)null);
                return;
            case ServiceDslPackage.CUSTOM_METHOD__OUTPUT:
                setOutput((DtoReference)null);
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
            case ServiceDslPackage.CUSTOM_METHOD__INPUT:
                return input != null;
            case ServiceDslPackage.CUSTOM_METHOD__OUTPUT:
                return output != null;
        }
        return super.eIsSet(featureID);
    }

} //CustomMethodImpl
