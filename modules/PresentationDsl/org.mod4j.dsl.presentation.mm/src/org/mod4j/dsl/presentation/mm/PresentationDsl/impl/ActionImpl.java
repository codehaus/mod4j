/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mod4j.dsl.presentation.mm.PresentationDsl.Action;
import org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Expression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Menu;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Page;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.StandardExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ActionImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ActionImpl#getNextPage <em>Next Page</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ActionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ActionImpl#getContextExp <em>Context Exp</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ActionImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ActionImpl#getView <em>View</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ActionImpl#getMenu <em>Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends AbstractProcessImpl implements Action {
	/**
	 */
	@Override
	public DtoReference getContextRef() {
		if( super.getContextRef() != null ){
			return super.getContextRef();
		} else if(getView() != null ){
			return getView().getContextRef();
		} else if( getContextExp() != null){
			if( getContextExp() instanceof StandardExpression ){
				return ((StandardExpression)getContextExp()).getContextRef();
			} else {
				System.err.println("MOD4J ERROR: no context for action [" + this.getName() + "]");
				return null;
			}
		} else {
			System.err.println("MOD4J ERROR 02: no context for action [" + this.getName() + "]");
			return null;
		}
	}

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected AssociationRoleReference link;

	/**
	 * The cached value of the '{@link #getNextPage() <em>Next Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPage()
	 * @generated
	 * @ordered
	 */
	protected Page nextPage;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getContextExp() <em>Context Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextExp()
	 * @generated
	 * @ordered
	 */
	protected Expression contextExp;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationDslPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationRoleReference getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(AssociationRoleReference newLink, NotificationChain msgs) {
		AssociationRoleReference oldLink = link;
		link = newLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationDslPackage.ACTION__LINK, oldLink, newLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(AssociationRoleReference newLink) {
		if (newLink != link) {
			NotificationChain msgs = null;
			if (link != null)
				msgs = ((InternalEObject)link).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.ACTION__LINK, null, msgs);
			if (newLink != null)
				msgs = ((InternalEObject)newLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.ACTION__LINK, null, msgs);
			msgs = basicSetLink(newLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.ACTION__LINK, newLink, newLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getNextPage() {
		if (nextPage != null && nextPage.eIsProxy()) {
			InternalEObject oldNextPage = (InternalEObject)nextPage;
			nextPage = (Page)eResolveProxy(oldNextPage);
			if (nextPage != oldNextPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PresentationDslPackage.ACTION__NEXT_PAGE, oldNextPage, nextPage));
			}
		}
		return nextPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetNextPage() {
		return nextPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextPage(Page newNextPage) {
		Page oldNextPage = nextPage;
		nextPage = newNextPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.ACTION__NEXT_PAGE, oldNextPage, nextPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationDslPackage.ACTION__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.ACTION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.ACTION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.ACTION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getContextExp() {
		return contextExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextExp(Expression newContextExp, NotificationChain msgs) {
		Expression oldContextExp = contextExp;
		contextExp = newContextExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationDslPackage.ACTION__CONTEXT_EXP, oldContextExp, newContextExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextExp(Expression newContextExp) {
		if (newContextExp != contextExp) {
			NotificationChain msgs = null;
			if (contextExp != null)
				msgs = ((InternalEObject)contextExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.ACTION__CONTEXT_EXP, null, msgs);
			if (newContextExp != null)
				msgs = ((InternalEObject)newContextExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.ACTION__CONTEXT_EXP, null, msgs);
			msgs = basicSetContextExp(newContextExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.ACTION__CONTEXT_EXP, newContextExp, newContextExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Expression>(Expression.class, this, PresentationDslPackage.ACTION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getView() {
		if (eContainerFeatureID() != PresentationDslPackage.ACTION__VIEW) return null;
		return (View)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetView(View newView, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newView, PresentationDslPackage.ACTION__VIEW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(View newView) {
		if (newView != eInternalContainer() || (eContainerFeatureID() != PresentationDslPackage.ACTION__VIEW && newView != null)) {
			if (EcoreUtil.isAncestor(this, newView))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newView != null)
				msgs = ((InternalEObject)newView).eInverseAdd(this, PresentationDslPackage.VIEW__ACTIONS, View.class, msgs);
			msgs = basicSetView(newView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.ACTION__VIEW, newView, newView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu getMenu() {
		if (eContainerFeatureID() != PresentationDslPackage.ACTION__MENU) return null;
		return (Menu)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMenu(Menu newMenu, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMenu, PresentationDslPackage.ACTION__MENU, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenu(Menu newMenu) {
		if (newMenu != eInternalContainer() || (eContainerFeatureID() != PresentationDslPackage.ACTION__MENU && newMenu != null)) {
			if (EcoreUtil.isAncestor(this, newMenu))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMenu != null)
				msgs = ((InternalEObject)newMenu).eInverseAdd(this, PresentationDslPackage.MENU__START_ACTIONS, Menu.class, msgs);
			msgs = basicSetMenu(newMenu, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.ACTION__MENU, newMenu, newMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationDslPackage.ACTION__VIEW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetView((View)otherEnd, msgs);
			case PresentationDslPackage.ACTION__MENU:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMenu((Menu)otherEnd, msgs);
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
			case PresentationDslPackage.ACTION__LINK:
				return basicSetLink(null, msgs);
			case PresentationDslPackage.ACTION__CONDITION:
				return basicSetCondition(null, msgs);
			case PresentationDslPackage.ACTION__CONTEXT_EXP:
				return basicSetContextExp(null, msgs);
			case PresentationDslPackage.ACTION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case PresentationDslPackage.ACTION__VIEW:
				return basicSetView(null, msgs);
			case PresentationDslPackage.ACTION__MENU:
				return basicSetMenu(null, msgs);
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
		switch (eContainerFeatureID()) {
			case PresentationDslPackage.ACTION__VIEW:
				return eInternalContainer().eInverseRemove(this, PresentationDslPackage.VIEW__ACTIONS, View.class, msgs);
			case PresentationDslPackage.ACTION__MENU:
				return eInternalContainer().eInverseRemove(this, PresentationDslPackage.MENU__START_ACTIONS, Menu.class, msgs);
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
			case PresentationDslPackage.ACTION__LINK:
				return getLink();
			case PresentationDslPackage.ACTION__NEXT_PAGE:
				if (resolve) return getNextPage();
				return basicGetNextPage();
			case PresentationDslPackage.ACTION__CONDITION:
				return getCondition();
			case PresentationDslPackage.ACTION__CONTEXT_EXP:
				return getContextExp();
			case PresentationDslPackage.ACTION__ARGUMENTS:
				return getArguments();
			case PresentationDslPackage.ACTION__VIEW:
				return getView();
			case PresentationDslPackage.ACTION__MENU:
				return getMenu();
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
			case PresentationDslPackage.ACTION__LINK:
				setLink((AssociationRoleReference)newValue);
				return;
			case PresentationDslPackage.ACTION__NEXT_PAGE:
				setNextPage((Page)newValue);
				return;
			case PresentationDslPackage.ACTION__CONDITION:
				setCondition((Expression)newValue);
				return;
			case PresentationDslPackage.ACTION__CONTEXT_EXP:
				setContextExp((Expression)newValue);
				return;
			case PresentationDslPackage.ACTION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
				return;
			case PresentationDslPackage.ACTION__VIEW:
				setView((View)newValue);
				return;
			case PresentationDslPackage.ACTION__MENU:
				setMenu((Menu)newValue);
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
			case PresentationDslPackage.ACTION__LINK:
				setLink((AssociationRoleReference)null);
				return;
			case PresentationDslPackage.ACTION__NEXT_PAGE:
				setNextPage((Page)null);
				return;
			case PresentationDslPackage.ACTION__CONDITION:
				setCondition((Expression)null);
				return;
			case PresentationDslPackage.ACTION__CONTEXT_EXP:
				setContextExp((Expression)null);
				return;
			case PresentationDslPackage.ACTION__ARGUMENTS:
				getArguments().clear();
				return;
			case PresentationDslPackage.ACTION__VIEW:
				setView((View)null);
				return;
			case PresentationDslPackage.ACTION__MENU:
				setMenu((Menu)null);
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
			case PresentationDslPackage.ACTION__LINK:
				return link != null;
			case PresentationDslPackage.ACTION__NEXT_PAGE:
				return nextPage != null;
			case PresentationDslPackage.ACTION__CONDITION:
				return condition != null;
			case PresentationDslPackage.ACTION__CONTEXT_EXP:
				return contextExp != null;
			case PresentationDslPackage.ACTION__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case PresentationDslPackage.ACTION__VIEW:
				return getView() != null;
			case PresentationDslPackage.ACTION__MENU:
				return getMenu() != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionImpl
