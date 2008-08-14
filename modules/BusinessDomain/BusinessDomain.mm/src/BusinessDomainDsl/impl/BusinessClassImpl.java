/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.AbstractBusinessRule;
import BusinessDomainDsl.Association;
import BusinessDomainDsl.BusinessClass;
import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.BusinessRule;
import BusinessDomainDsl.InheritanceModifier;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassImpl#getInheritanceModifier <em>Inheritance Modifier</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassImpl#getBusinessRules <em>Business Rules</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassImpl#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassImpl#getAssociationsTo <em>Associations To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessClassImpl extends AbstractBusinessClassImpl implements BusinessClass {
    /**
     * The default value of the '{@link #getInheritanceModifier() <em>Inheritance Modifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInheritanceModifier()
     * @generated
     * @ordered
     */
    protected static final InheritanceModifier INHERITANCE_MODIFIER_EDEFAULT = InheritanceModifier.NONE;

    /**
     * The cached value of the '{@link #getInheritanceModifier() <em>Inheritance Modifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInheritanceModifier()
     * @generated
     * @ordered
     */
    protected InheritanceModifier inheritanceModifier = INHERITANCE_MODIFIER_EDEFAULT;

    /**
     * The cached value of the '{@link #getBusinessRules() <em>Business Rules</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBusinessRules()
     * @generated
     * @ordered
     */
    protected EList<AbstractBusinessRule> businessRules;

    /**
     * The cached value of the '{@link #getSuperclass() <em>Superclass</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperclass()
     * @generated
     * @ordered
     */
    protected BusinessClass superclass;

    /**
     * The cached value of the '{@link #getAssociationsTo() <em>Associations To</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssociationsTo()
     * @generated
     * @ordered
     */
    protected EList<Association> associationsTo;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BusinessClassImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BusinessDomainDslPackage.Literals.BUSINESS_CLASS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InheritanceModifier getInheritanceModifier() {
        return inheritanceModifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInheritanceModifier(InheritanceModifier newInheritanceModifier) {
        InheritanceModifier oldInheritanceModifier = inheritanceModifier;
        inheritanceModifier = newInheritanceModifier == null ? INHERITANCE_MODIFIER_EDEFAULT : newInheritanceModifier;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.BUSINESS_CLASS__INHERITANCE_MODIFIER, oldInheritanceModifier, inheritanceModifier));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractBusinessRule> getBusinessRules() {
        if (businessRules == null) {
            businessRules = new EObjectContainmentEList<AbstractBusinessRule>(AbstractBusinessRule.class, this, BusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULES);
        }
        return businessRules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessClass getSuperclass() {
        if (superclass != null && superclass.eIsProxy()) {
            InternalEObject oldSuperclass = (InternalEObject)superclass;
            superclass = (BusinessClass)eResolveProxy(oldSuperclass);
            if (superclass != oldSuperclass) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessDomainDslPackage.BUSINESS_CLASS__SUPERCLASS, oldSuperclass, superclass));
            }
        }
        return superclass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessClass basicGetSuperclass() {
        return superclass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSuperclass(BusinessClass newSuperclass) {
        BusinessClass oldSuperclass = superclass;
        superclass = newSuperclass;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.BUSINESS_CLASS__SUPERCLASS, oldSuperclass, superclass));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Association> getAssociationsTo() {
        if (associationsTo == null) {
            associationsTo = new EObjectWithInverseResolvingEList<Association>(Association.class, this, BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO, BusinessDomainDslPackage.ASSOCIATION__SOURCE);
        }
        return associationsTo;
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
            case BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociationsTo()).basicAdd(otherEnd, msgs);
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
            case BusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULES:
                return ((InternalEList<?>)getBusinessRules()).basicRemove(otherEnd, msgs);
            case BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO:
                return ((InternalEList<?>)getAssociationsTo()).basicRemove(otherEnd, msgs);
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
            case BusinessDomainDslPackage.BUSINESS_CLASS__INHERITANCE_MODIFIER:
                return getInheritanceModifier();
            case BusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULES:
                return getBusinessRules();
            case BusinessDomainDslPackage.BUSINESS_CLASS__SUPERCLASS:
                if (resolve) return getSuperclass();
                return basicGetSuperclass();
            case BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO:
                return getAssociationsTo();
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
            case BusinessDomainDslPackage.BUSINESS_CLASS__INHERITANCE_MODIFIER:
                setInheritanceModifier((InheritanceModifier)newValue);
                return;
            case BusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULES:
                getBusinessRules().clear();
                getBusinessRules().addAll((Collection<? extends AbstractBusinessRule>)newValue);
                return;
            case BusinessDomainDslPackage.BUSINESS_CLASS__SUPERCLASS:
                setSuperclass((BusinessClass)newValue);
                return;
            case BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO:
                getAssociationsTo().clear();
                getAssociationsTo().addAll((Collection<? extends Association>)newValue);
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
            case BusinessDomainDslPackage.BUSINESS_CLASS__INHERITANCE_MODIFIER:
                setInheritanceModifier(INHERITANCE_MODIFIER_EDEFAULT);
                return;
            case BusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULES:
                getBusinessRules().clear();
                return;
            case BusinessDomainDslPackage.BUSINESS_CLASS__SUPERCLASS:
                setSuperclass((BusinessClass)null);
                return;
            case BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO:
                getAssociationsTo().clear();
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
            case BusinessDomainDslPackage.BUSINESS_CLASS__INHERITANCE_MODIFIER:
                return inheritanceModifier != INHERITANCE_MODIFIER_EDEFAULT;
            case BusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULES:
                return businessRules != null && !businessRules.isEmpty();
            case BusinessDomainDslPackage.BUSINESS_CLASS__SUPERCLASS:
                return superclass != null;
            case BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO:
                return associationsTo != null && !associationsTo.isEmpty();
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
        result.append(" (inheritanceModifier: ");
        result.append(inheritanceModifier);
        result.append(')');
        return result.toString();
    }

} //BusinessClassImpl
