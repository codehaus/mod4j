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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mod4j.dsl.presentation.mm.PresentationDsl.AbstractDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Page;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PageImpl#getDialogue <em>Dialogue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends AbstractDialogueImpl implements Page {
	/**
	 */
	@Override
	public DtoReference getContextRef() {
		if( super.getContextRef() != null ){
			return super.getContextRef();
		} else {
			return getDialogue().getContextRef();
		}
	}
	
	@Override
	public boolean isCollectionContext() {
		if( this.getDialogue() != null ){
			return this.dialogue.isCollectionContext();
		} else {
			return super.isCollectionContext();
		}
	}

	/**
	 * The cached value of the '{@link #getDialogue() <em>Dialogue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialogue()
	 * @generated
	 * @ordered
	 */
	protected AbstractDialogue dialogue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationDslPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractDialogue getDialogue() {
		if (dialogue != null && dialogue.eIsProxy()) {
			InternalEObject oldDialogue = (InternalEObject)dialogue;
			dialogue = (AbstractDialogue)eResolveProxy(oldDialogue);
			if (dialogue != oldDialogue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PresentationDslPackage.PAGE__DIALOGUE, oldDialogue, dialogue));
			}
		}
		return dialogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractDialogue basicGetDialogue() {
		return dialogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDialogue(AbstractDialogue newDialogue) {
		AbstractDialogue oldDialogue = dialogue;
		dialogue = newDialogue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.PAGE__DIALOGUE, oldDialogue, dialogue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PresentationDslPackage.PAGE__DIALOGUE:
				if (resolve) return getDialogue();
				return basicGetDialogue();
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
			case PresentationDslPackage.PAGE__DIALOGUE:
				setDialogue((AbstractDialogue)newValue);
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
			case PresentationDslPackage.PAGE__DIALOGUE:
				setDialogue((AbstractDialogue)null);
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
			case PresentationDslPackage.PAGE__DIALOGUE:
				return dialogue != null;
		}
		return super.eIsSet(featureID);
	}

} //PageImpl
