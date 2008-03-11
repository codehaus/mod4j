/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.BusinessClass;
import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.BusinessRule;
import BusinessDomainDsl.Constraint;
import BusinessDomainDsl.InheritanceModifier;
import BusinessDomainDsl.association_R;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassImpl#isAutoGenerateMapping <em>Auto Generate Mapping</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassImpl#getBusinessRule <em>Business Rule</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassImpl#getCompositionTarget <em>Composition Target</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassImpl#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassImpl#getAssociationTo <em>Association To</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassImpl#getAssociationFrom <em>Association From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessClassImpl extends PropertyContainerImpl implements BusinessClass {
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
	 * The default value of the '{@link #isAutoGenerateMapping() <em>Auto Generate Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoGenerateMapping()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_GENERATE_MAPPING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAutoGenerateMapping() <em>Auto Generate Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoGenerateMapping()
	 * @generated
	 * @ordered
	 */
	protected boolean autoGenerateMapping = AUTO_GENERATE_MAPPING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBusinessRule() <em>Business Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessRule()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessRule> businessRule;

	/**
	 * The cached value of the '{@link #getCompositionTarget() <em>Composition Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositionTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessClass> compositionTarget;

	/**
	 * The cached value of the '{@link #getBaseClass() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseClass()
	 * @generated
	 * @ordered
	 */
	protected BusinessClass baseClass;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The cached value of the '{@link #getAssociationTo() <em>Association To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationTo()
	 * @generated
	 * @ordered
	 */
	protected EList<association_R> associationTo;

	/**
	 * The cached value of the '{@link #getAssociationFrom() <em>Association From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<association_R> associationFrom;

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
	public boolean isAutoGenerateMapping() {
		return autoGenerateMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoGenerateMapping(boolean newAutoGenerateMapping) {
		boolean oldAutoGenerateMapping = autoGenerateMapping;
		autoGenerateMapping = newAutoGenerateMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.BUSINESS_CLASS__AUTO_GENERATE_MAPPING, oldAutoGenerateMapping, autoGenerateMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessRule> getBusinessRule() {
		if (businessRule == null) {
			businessRule = new EObjectContainmentEList<BusinessRule>(BusinessRule.class, this, BusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULE);
		}
		return businessRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessClass> getCompositionTarget() {
		if (compositionTarget == null) {
			compositionTarget = new EObjectResolvingEList<BusinessClass>(BusinessClass.class, this, BusinessDomainDslPackage.BUSINESS_CLASS__COMPOSITION_TARGET);
		}
		return compositionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessClass getBaseClass() {
		if (baseClass != null && baseClass.eIsProxy()) {
			InternalEObject oldBaseClass = (InternalEObject)baseClass;
			baseClass = (BusinessClass)eResolveProxy(oldBaseClass);
			if (baseClass != oldBaseClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessDomainDslPackage.BUSINESS_CLASS__BASE_CLASS, oldBaseClass, baseClass));
			}
		}
		return baseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessClass basicGetBaseClass() {
		return baseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseClass(BusinessClass newBaseClass) {
		BusinessClass oldBaseClass = baseClass;
		baseClass = newBaseClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.BUSINESS_CLASS__BASE_CLASS, oldBaseClass, baseClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<Constraint>(Constraint.class, this, BusinessDomainDslPackage.BUSINESS_CLASS__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<association_R> getAssociationTo() {
		if (associationTo == null) {
			associationTo = new EObjectWithInverseResolvingEList<association_R>(association_R.class, this, BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_TO, BusinessDomainDslPackage.ASSOCIATION_R__SOURCE);
		}
		return associationTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<association_R> getAssociationFrom() {
		if (associationFrom == null) {
			associationFrom = new EObjectWithInverseResolvingEList<association_R>(association_R.class, this, BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_FROM, BusinessDomainDslPackage.ASSOCIATION_R__TARGET);
		}
		return associationFrom;
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
			case BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociationTo()).basicAdd(otherEnd, msgs);
			case BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociationFrom()).basicAdd(otherEnd, msgs);
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
			case BusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULE:
				return ((InternalEList<?>)getBusinessRule()).basicRemove(otherEnd, msgs);
			case BusinessDomainDslPackage.BUSINESS_CLASS__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_TO:
				return ((InternalEList<?>)getAssociationTo()).basicRemove(otherEnd, msgs);
			case BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_FROM:
				return ((InternalEList<?>)getAssociationFrom()).basicRemove(otherEnd, msgs);
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
			case BusinessDomainDslPackage.BUSINESS_CLASS__AUTO_GENERATE_MAPPING:
				return isAutoGenerateMapping() ? Boolean.TRUE : Boolean.FALSE;
			case BusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULE:
				return getBusinessRule();
			case BusinessDomainDslPackage.BUSINESS_CLASS__COMPOSITION_TARGET:
				return getCompositionTarget();
			case BusinessDomainDslPackage.BUSINESS_CLASS__BASE_CLASS:
				if (resolve) return getBaseClass();
				return basicGetBaseClass();
			case BusinessDomainDslPackage.BUSINESS_CLASS__CONSTRAINT:
				return getConstraint();
			case BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_TO:
				return getAssociationTo();
			case BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_FROM:
				return getAssociationFrom();
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
			case BusinessDomainDslPackage.BUSINESS_CLASS__AUTO_GENERATE_MAPPING:
				setAutoGenerateMapping(((Boolean)newValue).booleanValue());
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULE:
				getBusinessRule().clear();
				getBusinessRule().addAll((Collection<? extends BusinessRule>)newValue);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS__COMPOSITION_TARGET:
				getCompositionTarget().clear();
				getCompositionTarget().addAll((Collection<? extends BusinessClass>)newValue);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS__BASE_CLASS:
				setBaseClass((BusinessClass)newValue);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_TO:
				getAssociationTo().clear();
				getAssociationTo().addAll((Collection<? extends association_R>)newValue);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_FROM:
				getAssociationFrom().clear();
				getAssociationFrom().addAll((Collection<? extends association_R>)newValue);
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
			case BusinessDomainDslPackage.BUSINESS_CLASS__AUTO_GENERATE_MAPPING:
				setAutoGenerateMapping(AUTO_GENERATE_MAPPING_EDEFAULT);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULE:
				getBusinessRule().clear();
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS__COMPOSITION_TARGET:
				getCompositionTarget().clear();
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS__BASE_CLASS:
				setBaseClass((BusinessClass)null);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS__CONSTRAINT:
				getConstraint().clear();
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_TO:
				getAssociationTo().clear();
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_FROM:
				getAssociationFrom().clear();
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
			case BusinessDomainDslPackage.BUSINESS_CLASS__AUTO_GENERATE_MAPPING:
				return autoGenerateMapping != AUTO_GENERATE_MAPPING_EDEFAULT;
			case BusinessDomainDslPackage.BUSINESS_CLASS__BUSINESS_RULE:
				return businessRule != null && !businessRule.isEmpty();
			case BusinessDomainDslPackage.BUSINESS_CLASS__COMPOSITION_TARGET:
				return compositionTarget != null && !compositionTarget.isEmpty();
			case BusinessDomainDslPackage.BUSINESS_CLASS__BASE_CLASS:
				return baseClass != null;
			case BusinessDomainDslPackage.BUSINESS_CLASS__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_TO:
				return associationTo != null && !associationTo.isEmpty();
			case BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_FROM:
				return associationFrom != null && !associationFrom.isEmpty();
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
		result.append(", autoGenerateMapping: ");
		result.append(autoGenerateMapping);
		result.append(')');
		return result.toString();
	}

} //BusinessClassImpl
