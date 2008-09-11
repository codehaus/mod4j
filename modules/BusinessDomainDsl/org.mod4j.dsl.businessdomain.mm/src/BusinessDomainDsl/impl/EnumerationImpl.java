/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.BusinessDomainModel;
import BusinessDomainDsl.Enumeration;
import BusinessDomainDsl.EnumerationLiteral;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.EnumerationImpl#getEnumerationLiterals <em>Enumeration Literals</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.EnumerationImpl#getBusinessDomainModel <em>Business Domain Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationImpl extends ModelElementImpl implements Enumeration {
    /**
     * The cached value of the '{@link #getEnumerationLiterals() <em>Enumeration Literals</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnumerationLiterals()
     * @generated
     * @ordered
     */
    protected EList<EnumerationLiteral> enumerationLiterals;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnumerationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BusinessDomainDslPackage.Literals.ENUMERATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EnumerationLiteral> getEnumerationLiterals() {
        if (enumerationLiterals == null) {
            enumerationLiterals = new EObjectContainmentWithInverseEList<EnumerationLiteral>(EnumerationLiteral.class, this, BusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERALS, BusinessDomainDslPackage.ENUMERATION_LITERAL__ENUMERATION);
        }
        return enumerationLiterals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessDomainModel getBusinessDomainModel() {
        if (eContainerFeatureID != BusinessDomainDslPackage.ENUMERATION__BUSINESS_DOMAIN_MODEL) return null;
        return (BusinessDomainModel)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBusinessDomainModel(BusinessDomainModel newBusinessDomainModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newBusinessDomainModel, BusinessDomainDslPackage.ENUMERATION__BUSINESS_DOMAIN_MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBusinessDomainModel(BusinessDomainModel newBusinessDomainModel) {
        if (newBusinessDomainModel != eInternalContainer() || (eContainerFeatureID != BusinessDomainDslPackage.ENUMERATION__BUSINESS_DOMAIN_MODEL && newBusinessDomainModel != null)) {
            if (EcoreUtil.isAncestor(this, newBusinessDomainModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newBusinessDomainModel != null)
                msgs = ((InternalEObject)newBusinessDomainModel).eInverseAdd(this, BusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ENUMERATIONS, BusinessDomainModel.class, msgs);
            msgs = basicSetBusinessDomainModel(newBusinessDomainModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ENUMERATION__BUSINESS_DOMAIN_MODEL, newBusinessDomainModel, newBusinessDomainModel));
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
            case BusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERALS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnumerationLiterals()).basicAdd(otherEnd, msgs);
            case BusinessDomainDslPackage.ENUMERATION__BUSINESS_DOMAIN_MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetBusinessDomainModel((BusinessDomainModel)otherEnd, msgs);
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
            case BusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERALS:
                return ((InternalEList<?>)getEnumerationLiterals()).basicRemove(otherEnd, msgs);
            case BusinessDomainDslPackage.ENUMERATION__BUSINESS_DOMAIN_MODEL:
                return basicSetBusinessDomainModel(null, msgs);
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
            case BusinessDomainDslPackage.ENUMERATION__BUSINESS_DOMAIN_MODEL:
                return eInternalContainer().eInverseRemove(this, BusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ENUMERATIONS, BusinessDomainModel.class, msgs);
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
            case BusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERALS:
                return getEnumerationLiterals();
            case BusinessDomainDslPackage.ENUMERATION__BUSINESS_DOMAIN_MODEL:
                return getBusinessDomainModel();
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
            case BusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERALS:
                getEnumerationLiterals().clear();
                getEnumerationLiterals().addAll((Collection<? extends EnumerationLiteral>)newValue);
                return;
            case BusinessDomainDslPackage.ENUMERATION__BUSINESS_DOMAIN_MODEL:
                setBusinessDomainModel((BusinessDomainModel)newValue);
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
            case BusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERALS:
                getEnumerationLiterals().clear();
                return;
            case BusinessDomainDslPackage.ENUMERATION__BUSINESS_DOMAIN_MODEL:
                setBusinessDomainModel((BusinessDomainModel)null);
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
            case BusinessDomainDslPackage.ENUMERATION__ENUMERATION_LITERALS:
                return enumerationLiterals != null && !enumerationLiterals.isEmpty();
            case BusinessDomainDslPackage.ENUMERATION__BUSINESS_DOMAIN_MODEL:
                return getBusinessDomainModel() != null;
        }
        return super.eIsSet(featureID);
    }

} //EnumerationImpl
