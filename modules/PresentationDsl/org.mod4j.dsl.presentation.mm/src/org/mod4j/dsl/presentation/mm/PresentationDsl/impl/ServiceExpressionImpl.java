/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ServiceExpressionImpl#getServiceMethod <em>Service Method</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ServiceExpressionImpl#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceExpressionImpl extends ExpressionImpl implements ServiceExpression {
    /**
     * The default value of the '{@link #getServiceMethod() <em>Service Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceMethod()
     * @generated
     * @ordered
     */
    protected static final String SERVICE_METHOD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getServiceMethod() <em>Service Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceMethod()
     * @generated
     * @ordered
     */
    protected String serviceMethod = SERVICE_METHOD_EDEFAULT;

    /**
     * The cached value of the '{@link #getService() <em>Service</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getService()
     * @generated
     * @ordered
     */
    protected ServiceReference service;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PresentationDslPackage.Literals.SERVICE_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getServiceMethod() {
        return serviceMethod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setServiceMethod(String newServiceMethod) {
        String oldServiceMethod = serviceMethod;
        serviceMethod = newServiceMethod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.SERVICE_EXPRESSION__SERVICE_METHOD, oldServiceMethod, serviceMethod));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceReference getService() {
        if (service != null && service.eIsProxy()) {
            InternalEObject oldService = (InternalEObject)service;
            service = (ServiceReference)eResolveProxy(oldService);
            if (service != oldService) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PresentationDslPackage.SERVICE_EXPRESSION__SERVICE, oldService, service));
            }
        }
        return service;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceReference basicGetService() {
        return service;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setService(ServiceReference newService) {
        ServiceReference oldService = service;
        service = newService;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.SERVICE_EXPRESSION__SERVICE, oldService, service));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PresentationDslPackage.SERVICE_EXPRESSION__SERVICE_METHOD:
                return getServiceMethod();
            case PresentationDslPackage.SERVICE_EXPRESSION__SERVICE:
                if (resolve) return getService();
                return basicGetService();
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
            case PresentationDslPackage.SERVICE_EXPRESSION__SERVICE_METHOD:
                setServiceMethod((String)newValue);
                return;
            case PresentationDslPackage.SERVICE_EXPRESSION__SERVICE:
                setService((ServiceReference)newValue);
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
            case PresentationDslPackage.SERVICE_EXPRESSION__SERVICE_METHOD:
                setServiceMethod(SERVICE_METHOD_EDEFAULT);
                return;
            case PresentationDslPackage.SERVICE_EXPRESSION__SERVICE:
                setService((ServiceReference)null);
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
            case PresentationDslPackage.SERVICE_EXPRESSION__SERVICE_METHOD:
                return SERVICE_METHOD_EDEFAULT == null ? serviceMethod != null : !SERVICE_METHOD_EDEFAULT.equals(serviceMethod);
            case PresentationDslPackage.SERVICE_EXPRESSION__SERVICE:
                return service != null;
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
        result.append(" (serviceMethod: ");
        result.append(serviceMethod);
        result.append(')');
        return result.toString();
    }

} //ServiceExpressionImpl
