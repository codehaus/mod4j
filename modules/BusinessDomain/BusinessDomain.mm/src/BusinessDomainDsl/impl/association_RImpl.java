/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.BusinessClass;
import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.association_R;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>association R</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.association_RImpl#getSource <em>Source</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.association_RImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.association_RImpl#getSourceRoleName <em>Source Role Name</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.association_RImpl#getSourceMultiplicity <em>Source Multiplicity</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.association_RImpl#isTargetNavigability <em>Target Navigability</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.association_RImpl#isSourceNavigability <em>Source Navigability</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.association_RImpl#getTargetRoleName <em>Target Role Name</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.association_RImpl#getTargetMultiplicity <em>Target Multiplicity</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.association_RImpl#isIsComposite <em>Is Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class association_RImpl extends EObjectImpl implements association_R {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected BusinessClass source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected BusinessClass target;

	/**
	 * The default value of the '{@link #getSourceRoleName() <em>Source Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRoleName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ROLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceRoleName() <em>Source Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRoleName()
	 * @generated
	 * @ordered
	 */
	protected String sourceRoleName = SOURCE_ROLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceMultiplicity() <em>Source Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_MULTIPLICITY_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSourceMultiplicity() <em>Source Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected String sourceMultiplicity = SOURCE_MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isTargetNavigability() <em>Target Navigability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTargetNavigability()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TARGET_NAVIGABILITY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isTargetNavigability() <em>Target Navigability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTargetNavigability()
	 * @generated
	 * @ordered
	 */
	protected boolean targetNavigability = TARGET_NAVIGABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isSourceNavigability() <em>Source Navigability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceNavigability()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOURCE_NAVIGABILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSourceNavigability() <em>Source Navigability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceNavigability()
	 * @generated
	 * @ordered
	 */
	protected boolean sourceNavigability = SOURCE_NAVIGABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetRoleName() <em>Target Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRoleName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ROLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetRoleName() <em>Target Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRoleName()
	 * @generated
	 * @ordered
	 */
	protected String targetRoleName = TARGET_ROLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetMultiplicity() <em>Target Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_MULTIPLICITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetMultiplicity() <em>Target Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected String targetMultiplicity = TARGET_MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected boolean isComposite = IS_COMPOSITE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected association_RImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessDomainDslPackage.Literals.ASSOCIATION_R;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessClass getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (BusinessClass)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessDomainDslPackage.ASSOCIATION_R__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessClass basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(BusinessClass newSource, NotificationChain msgs) {
		BusinessClass oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION_R__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(BusinessClass newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_TO, BusinessClass.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_TO, BusinessClass.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION_R__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessClass getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (BusinessClass)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessDomainDslPackage.ASSOCIATION_R__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessClass basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(BusinessClass newTarget, NotificationChain msgs) {
		BusinessClass oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION_R__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(BusinessClass newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_FROM, BusinessClass.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_FROM, BusinessClass.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION_R__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceRoleName() {
		return sourceRoleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRoleName(String newSourceRoleName) {
		String oldSourceRoleName = sourceRoleName;
		sourceRoleName = newSourceRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION_R__SOURCE_ROLE_NAME, oldSourceRoleName, sourceRoleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceMultiplicity() {
		return sourceMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceMultiplicity(String newSourceMultiplicity) {
		String oldSourceMultiplicity = sourceMultiplicity;
		sourceMultiplicity = newSourceMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION_R__SOURCE_MULTIPLICITY, oldSourceMultiplicity, sourceMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTargetNavigability() {
		return targetNavigability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNavigability(boolean newTargetNavigability) {
		boolean oldTargetNavigability = targetNavigability;
		targetNavigability = newTargetNavigability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION_R__TARGET_NAVIGABILITY, oldTargetNavigability, targetNavigability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSourceNavigability() {
		return sourceNavigability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceNavigability(boolean newSourceNavigability) {
		boolean oldSourceNavigability = sourceNavigability;
		sourceNavigability = newSourceNavigability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION_R__SOURCE_NAVIGABILITY, oldSourceNavigability, sourceNavigability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetRoleName() {
		return targetRoleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRoleName(String newTargetRoleName) {
		String oldTargetRoleName = targetRoleName;
		targetRoleName = newTargetRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION_R__TARGET_ROLE_NAME, oldTargetRoleName, targetRoleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetMultiplicity() {
		return targetMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetMultiplicity(String newTargetMultiplicity) {
		String oldTargetMultiplicity = targetMultiplicity;
		targetMultiplicity = newTargetMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION_R__TARGET_MULTIPLICITY, oldTargetMultiplicity, targetMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComposite() {
		return isComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComposite(boolean newIsComposite) {
		boolean oldIsComposite = isComposite;
		isComposite = newIsComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION_R__IS_COMPOSITE, oldIsComposite, isComposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_TO, BusinessClass.class, msgs);
				return basicSetSource((BusinessClass)otherEnd, msgs);
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATION_FROM, BusinessClass.class, msgs);
				return basicSetTarget((BusinessClass)otherEnd, msgs);
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
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE:
				return basicSetSource(null, msgs);
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET:
				return basicSetTarget(null, msgs);
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
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE_ROLE_NAME:
				return getSourceRoleName();
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE_MULTIPLICITY:
				return getSourceMultiplicity();
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET_NAVIGABILITY:
				return isTargetNavigability() ? Boolean.TRUE : Boolean.FALSE;
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE_NAVIGABILITY:
				return isSourceNavigability() ? Boolean.TRUE : Boolean.FALSE;
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET_ROLE_NAME:
				return getTargetRoleName();
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET_MULTIPLICITY:
				return getTargetMultiplicity();
			case BusinessDomainDslPackage.ASSOCIATION_R__IS_COMPOSITE:
				return isIsComposite() ? Boolean.TRUE : Boolean.FALSE;
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
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE:
				setSource((BusinessClass)newValue);
				return;
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET:
				setTarget((BusinessClass)newValue);
				return;
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE_ROLE_NAME:
				setSourceRoleName((String)newValue);
				return;
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE_MULTIPLICITY:
				setSourceMultiplicity((String)newValue);
				return;
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET_NAVIGABILITY:
				setTargetNavigability(((Boolean)newValue).booleanValue());
				return;
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE_NAVIGABILITY:
				setSourceNavigability(((Boolean)newValue).booleanValue());
				return;
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET_ROLE_NAME:
				setTargetRoleName((String)newValue);
				return;
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET_MULTIPLICITY:
				setTargetMultiplicity((String)newValue);
				return;
			case BusinessDomainDslPackage.ASSOCIATION_R__IS_COMPOSITE:
				setIsComposite(((Boolean)newValue).booleanValue());
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
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE:
				setSource((BusinessClass)null);
				return;
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET:
				setTarget((BusinessClass)null);
				return;
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE_ROLE_NAME:
				setSourceRoleName(SOURCE_ROLE_NAME_EDEFAULT);
				return;
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE_MULTIPLICITY:
				setSourceMultiplicity(SOURCE_MULTIPLICITY_EDEFAULT);
				return;
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET_NAVIGABILITY:
				setTargetNavigability(TARGET_NAVIGABILITY_EDEFAULT);
				return;
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE_NAVIGABILITY:
				setSourceNavigability(SOURCE_NAVIGABILITY_EDEFAULT);
				return;
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET_ROLE_NAME:
				setTargetRoleName(TARGET_ROLE_NAME_EDEFAULT);
				return;
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET_MULTIPLICITY:
				setTargetMultiplicity(TARGET_MULTIPLICITY_EDEFAULT);
				return;
			case BusinessDomainDslPackage.ASSOCIATION_R__IS_COMPOSITE:
				setIsComposite(IS_COMPOSITE_EDEFAULT);
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
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE:
				return source != null;
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET:
				return target != null;
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE_ROLE_NAME:
				return SOURCE_ROLE_NAME_EDEFAULT == null ? sourceRoleName != null : !SOURCE_ROLE_NAME_EDEFAULT.equals(sourceRoleName);
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE_MULTIPLICITY:
				return SOURCE_MULTIPLICITY_EDEFAULT == null ? sourceMultiplicity != null : !SOURCE_MULTIPLICITY_EDEFAULT.equals(sourceMultiplicity);
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET_NAVIGABILITY:
				return targetNavigability != TARGET_NAVIGABILITY_EDEFAULT;
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE_NAVIGABILITY:
				return sourceNavigability != SOURCE_NAVIGABILITY_EDEFAULT;
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET_ROLE_NAME:
				return TARGET_ROLE_NAME_EDEFAULT == null ? targetRoleName != null : !TARGET_ROLE_NAME_EDEFAULT.equals(targetRoleName);
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET_MULTIPLICITY:
				return TARGET_MULTIPLICITY_EDEFAULT == null ? targetMultiplicity != null : !TARGET_MULTIPLICITY_EDEFAULT.equals(targetMultiplicity);
			case BusinessDomainDslPackage.ASSOCIATION_R__IS_COMPOSITE:
				return isComposite != IS_COMPOSITE_EDEFAULT;
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
		result.append(" (sourceRoleName: ");
		result.append(sourceRoleName);
		result.append(", sourceMultiplicity: ");
		result.append(sourceMultiplicity);
		result.append(", targetNavigability: ");
		result.append(targetNavigability);
		result.append(", sourceNavigability: ");
		result.append(sourceNavigability);
		result.append(", targetRoleName: ");
		result.append(targetRoleName);
		result.append(", targetMultiplicity: ");
		result.append(targetMultiplicity);
		result.append(", isComposite: ");
		result.append(isComposite);
		result.append(')');
		return result.toString();
	}

} //association_RImpl
