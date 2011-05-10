/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.AbstractBusinessClass;
import BusinessDomainDsl.Association;
import BusinessDomainDsl.BusinessClass;
import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.BusinessDomainModel;
import BusinessDomainDsl.Multiplicity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#getSourceRoleName <em>Source Role Name</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#getSourceMultiplicity <em>Source Multiplicity</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#getTargetRoleName <em>Target Role Name</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#getTargetMultiplicity <em>Target Multiplicity</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#isComposite <em>Composite</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#getModel <em>Model</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#getSourceForeignKey <em>Source Foreign Key</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#getTargetForeignKey <em>Target Foreign Key</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#getOrderingColumn <em>Ordering Column</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.AssociationImpl#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends ModelElementImpl implements Association {
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
	protected AbstractBusinessClass target;

	/**
     * The default value of the '{@link #getSourceRoleName() <em>Source Role Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSourceRoleName()
     * @generated
     * @ordered
     */
	protected static final String SOURCE_ROLE_NAME_EDEFAULT = "sourceRoleName";

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
	protected static final Multiplicity SOURCE_MULTIPLICITY_EDEFAULT = Multiplicity.ONE;

	/**
     * The cached value of the '{@link #getSourceMultiplicity() <em>Source Multiplicity</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSourceMultiplicity()
     * @generated
     * @ordered
     */
	protected Multiplicity sourceMultiplicity = SOURCE_MULTIPLICITY_EDEFAULT;

	/**
     * The default value of the '{@link #getTargetRoleName() <em>Target Role Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTargetRoleName()
     * @generated
     * @ordered
     */
	protected static final String TARGET_ROLE_NAME_EDEFAULT = "targetRoleName";

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
	protected static final Multiplicity TARGET_MULTIPLICITY_EDEFAULT = Multiplicity.ZERO_MANY;

	/**
     * The cached value of the '{@link #getTargetMultiplicity() <em>Target Multiplicity</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTargetMultiplicity()
     * @generated
     * @ordered
     */
	protected Multiplicity targetMultiplicity = TARGET_MULTIPLICITY_EDEFAULT;

	/**
     * The default value of the '{@link #isComposite() <em>Composite</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isComposite()
     * @generated
     * @ordered
     */
	protected static final boolean COMPOSITE_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isComposite() <em>Composite</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isComposite()
     * @generated
     * @ordered
     */
	protected boolean composite = COMPOSITE_EDEFAULT;

	/**
     * The default value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isBidirectional()
     * @generated
     * @ordered
     */
	protected static final boolean BIDIRECTIONAL_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isBidirectional()
     * @generated
     * @ordered
     */
	protected boolean bidirectional = BIDIRECTIONAL_EDEFAULT;

	/**
     * The default value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isOrdered()
     * @generated
     * @ordered
     */
	protected static final boolean ORDERED_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isOrdered()
     * @generated
     * @ordered
     */
	protected boolean ordered = ORDERED_EDEFAULT;

	/**
     * The default value of the '{@link #getSourceForeignKey() <em>Source Foreign Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceForeignKey()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_FOREIGN_KEY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSourceForeignKey() <em>Source Foreign Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceForeignKey()
     * @generated
     * @ordered
     */
    protected String sourceForeignKey = SOURCE_FOREIGN_KEY_EDEFAULT;

    /**
     * The default value of the '{@link #getTargetForeignKey() <em>Target Foreign Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetForeignKey()
     * @generated
     * @ordered
     */
    protected static final String TARGET_FOREIGN_KEY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetForeignKey() <em>Target Foreign Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetForeignKey()
     * @generated
     * @ordered
     */
    protected String targetForeignKey = TARGET_FOREIGN_KEY_EDEFAULT;

    /**
     * The default value of the '{@link #getOrderingColumn() <em>Ordering Column</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrderingColumn()
     * @generated
     * @ordered
     */
    protected static final String ORDERING_COLUMN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOrderingColumn() <em>Ordering Column</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrderingColumn()
     * @generated
     * @ordered
     */
    protected String orderingColumn = ORDERING_COLUMN_EDEFAULT;

    /**
     * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTable()
     * @generated
     * @ordered
     */
    protected static final String TABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTable()
     * @generated
     * @ordered
     */
    protected String table = TABLE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AssociationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return BusinessDomainDslPackage.Literals.ASSOCIATION;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessDomainDslPackage.ASSOCIATION__SOURCE, oldSource, source));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION__SOURCE, oldSource, newSource);
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
                msgs = ((InternalEObject)source).eInverseRemove(this, BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO, BusinessClass.class, msgs);
            if (newSource != null)
                msgs = ((InternalEObject)newSource).eInverseAdd(this, BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO, BusinessClass.class, msgs);
            msgs = basicSetSource(newSource, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION__SOURCE, newSource, newSource));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AbstractBusinessClass getTarget() {
        if (target != null && target.eIsProxy()) {
            InternalEObject oldTarget = (InternalEObject)target;
            target = (AbstractBusinessClass)eResolveProxy(oldTarget);
            if (target != oldTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessDomainDslPackage.ASSOCIATION__TARGET, oldTarget, target));
            }
        }
        return target;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AbstractBusinessClass basicGetTarget() {
        return target;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetTarget(AbstractBusinessClass newTarget, NotificationChain msgs) {
        AbstractBusinessClass oldTarget = target;
        target = newTarget;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION__TARGET, oldTarget, newTarget);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTarget(AbstractBusinessClass newTarget) {
        if (newTarget != target) {
            NotificationChain msgs = null;
            if (target != null)
                msgs = ((InternalEObject)target).eInverseRemove(this, BusinessDomainDslPackage.ABSTRACT_BUSINESS_CLASS__ASSOCIATIONS_FROM, AbstractBusinessClass.class, msgs);
            if (newTarget != null)
                msgs = ((InternalEObject)newTarget).eInverseAdd(this, BusinessDomainDslPackage.ABSTRACT_BUSINESS_CLASS__ASSOCIATIONS_FROM, AbstractBusinessClass.class, msgs);
            msgs = basicSetTarget(newTarget, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION__TARGET, newTarget, newTarget));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION__SOURCE_ROLE_NAME, oldSourceRoleName, sourceRoleName));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Multiplicity getSourceMultiplicity() {
        return sourceMultiplicity;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSourceMultiplicity(Multiplicity newSourceMultiplicity) {
        Multiplicity oldSourceMultiplicity = sourceMultiplicity;
        sourceMultiplicity = newSourceMultiplicity == null ? SOURCE_MULTIPLICITY_EDEFAULT : newSourceMultiplicity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION__SOURCE_MULTIPLICITY, oldSourceMultiplicity, sourceMultiplicity));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION__TARGET_ROLE_NAME, oldTargetRoleName, targetRoleName));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Multiplicity getTargetMultiplicity() {
        return targetMultiplicity;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTargetMultiplicity(Multiplicity newTargetMultiplicity) {
        Multiplicity oldTargetMultiplicity = targetMultiplicity;
        targetMultiplicity = newTargetMultiplicity == null ? TARGET_MULTIPLICITY_EDEFAULT : newTargetMultiplicity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION__TARGET_MULTIPLICITY, oldTargetMultiplicity, targetMultiplicity));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isComposite() {
        return composite;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setComposite(boolean newComposite) {
        boolean oldComposite = composite;
        composite = newComposite;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION__COMPOSITE, oldComposite, composite));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isBidirectional() {
        return bidirectional;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBidirectional(boolean newBidirectional) {
        boolean oldBidirectional = bidirectional;
        bidirectional = newBidirectional;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION__BIDIRECTIONAL, oldBidirectional, bidirectional));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isOrdered() {
        return ordered;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOrdered(boolean newOrdered) {
        boolean oldOrdered = ordered;
        ordered = newOrdered;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION__ORDERED, oldOrdered, ordered));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BusinessDomainModel getModel() {
        if (eContainerFeatureID() != BusinessDomainDslPackage.ASSOCIATION__MODEL) return null;
        return (BusinessDomainModel)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetModel(BusinessDomainModel newModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newModel, BusinessDomainDslPackage.ASSOCIATION__MODEL, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setModel(BusinessDomainModel newModel) {
        if (newModel != eInternalContainer() || (eContainerFeatureID() != BusinessDomainDslPackage.ASSOCIATION__MODEL && newModel != null)) {
            if (EcoreUtil.isAncestor(this, newModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, BusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ASSOCIATIONS, BusinessDomainModel.class, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION__MODEL, newModel, newModel));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSourceForeignKey() {
        return sourceForeignKey;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceForeignKey(String newSourceForeignKey) {
        String oldSourceForeignKey = sourceForeignKey;
        sourceForeignKey = newSourceForeignKey;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION__SOURCE_FOREIGN_KEY, oldSourceForeignKey, sourceForeignKey));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTargetForeignKey() {
        return targetForeignKey;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetForeignKey(String newTargetForeignKey) {
        String oldTargetForeignKey = targetForeignKey;
        targetForeignKey = newTargetForeignKey;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION__TARGET_FOREIGN_KEY, oldTargetForeignKey, targetForeignKey));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOrderingColumn() {
        return orderingColumn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOrderingColumn(String newOrderingColumn) {
        String oldOrderingColumn = orderingColumn;
        orderingColumn = newOrderingColumn;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION__ORDERING_COLUMN, oldOrderingColumn, orderingColumn));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTable() {
        return table;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTable(String newTable) {
        String oldTable = table;
        table = newTable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.ASSOCIATION__TABLE, oldTable, table));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BusinessDomainDslPackage.ASSOCIATION__SOURCE:
                if (source != null)
                    msgs = ((InternalEObject)source).eInverseRemove(this, BusinessDomainDslPackage.BUSINESS_CLASS__ASSOCIATIONS_TO, BusinessClass.class, msgs);
                return basicSetSource((BusinessClass)otherEnd, msgs);
            case BusinessDomainDslPackage.ASSOCIATION__TARGET:
                if (target != null)
                    msgs = ((InternalEObject)target).eInverseRemove(this, BusinessDomainDslPackage.ABSTRACT_BUSINESS_CLASS__ASSOCIATIONS_FROM, AbstractBusinessClass.class, msgs);
                return basicSetTarget((AbstractBusinessClass)otherEnd, msgs);
            case BusinessDomainDslPackage.ASSOCIATION__MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetModel((BusinessDomainModel)otherEnd, msgs);
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
            case BusinessDomainDslPackage.ASSOCIATION__SOURCE:
                return basicSetSource(null, msgs);
            case BusinessDomainDslPackage.ASSOCIATION__TARGET:
                return basicSetTarget(null, msgs);
            case BusinessDomainDslPackage.ASSOCIATION__MODEL:
                return basicSetModel(null, msgs);
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
            case BusinessDomainDslPackage.ASSOCIATION__MODEL:
                return eInternalContainer().eInverseRemove(this, BusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ASSOCIATIONS, BusinessDomainModel.class, msgs);
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
            case BusinessDomainDslPackage.ASSOCIATION__SOURCE:
                if (resolve) return getSource();
                return basicGetSource();
            case BusinessDomainDslPackage.ASSOCIATION__TARGET:
                if (resolve) return getTarget();
                return basicGetTarget();
            case BusinessDomainDslPackage.ASSOCIATION__SOURCE_ROLE_NAME:
                return getSourceRoleName();
            case BusinessDomainDslPackage.ASSOCIATION__SOURCE_MULTIPLICITY:
                return getSourceMultiplicity();
            case BusinessDomainDslPackage.ASSOCIATION__TARGET_ROLE_NAME:
                return getTargetRoleName();
            case BusinessDomainDslPackage.ASSOCIATION__TARGET_MULTIPLICITY:
                return getTargetMultiplicity();
            case BusinessDomainDslPackage.ASSOCIATION__COMPOSITE:
                return isComposite();
            case BusinessDomainDslPackage.ASSOCIATION__BIDIRECTIONAL:
                return isBidirectional();
            case BusinessDomainDslPackage.ASSOCIATION__ORDERED:
                return isOrdered();
            case BusinessDomainDslPackage.ASSOCIATION__MODEL:
                return getModel();
            case BusinessDomainDslPackage.ASSOCIATION__SOURCE_FOREIGN_KEY:
                return getSourceForeignKey();
            case BusinessDomainDslPackage.ASSOCIATION__TARGET_FOREIGN_KEY:
                return getTargetForeignKey();
            case BusinessDomainDslPackage.ASSOCIATION__ORDERING_COLUMN:
                return getOrderingColumn();
            case BusinessDomainDslPackage.ASSOCIATION__TABLE:
                return getTable();
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
            case BusinessDomainDslPackage.ASSOCIATION__SOURCE:
                setSource((BusinessClass)newValue);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__TARGET:
                setTarget((AbstractBusinessClass)newValue);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__SOURCE_ROLE_NAME:
                setSourceRoleName((String)newValue);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__SOURCE_MULTIPLICITY:
                setSourceMultiplicity((Multiplicity)newValue);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__TARGET_ROLE_NAME:
                setTargetRoleName((String)newValue);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__TARGET_MULTIPLICITY:
                setTargetMultiplicity((Multiplicity)newValue);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__COMPOSITE:
                setComposite((Boolean)newValue);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__BIDIRECTIONAL:
                setBidirectional((Boolean)newValue);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__ORDERED:
                setOrdered((Boolean)newValue);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__MODEL:
                setModel((BusinessDomainModel)newValue);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__SOURCE_FOREIGN_KEY:
                setSourceForeignKey((String)newValue);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__TARGET_FOREIGN_KEY:
                setTargetForeignKey((String)newValue);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__ORDERING_COLUMN:
                setOrderingColumn((String)newValue);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__TABLE:
                setTable((String)newValue);
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
            case BusinessDomainDslPackage.ASSOCIATION__SOURCE:
                setSource((BusinessClass)null);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__TARGET:
                setTarget((AbstractBusinessClass)null);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__SOURCE_ROLE_NAME:
                setSourceRoleName(SOURCE_ROLE_NAME_EDEFAULT);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__SOURCE_MULTIPLICITY:
                setSourceMultiplicity(SOURCE_MULTIPLICITY_EDEFAULT);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__TARGET_ROLE_NAME:
                setTargetRoleName(TARGET_ROLE_NAME_EDEFAULT);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__TARGET_MULTIPLICITY:
                setTargetMultiplicity(TARGET_MULTIPLICITY_EDEFAULT);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__COMPOSITE:
                setComposite(COMPOSITE_EDEFAULT);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__BIDIRECTIONAL:
                setBidirectional(BIDIRECTIONAL_EDEFAULT);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__ORDERED:
                setOrdered(ORDERED_EDEFAULT);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__MODEL:
                setModel((BusinessDomainModel)null);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__SOURCE_FOREIGN_KEY:
                setSourceForeignKey(SOURCE_FOREIGN_KEY_EDEFAULT);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__TARGET_FOREIGN_KEY:
                setTargetForeignKey(TARGET_FOREIGN_KEY_EDEFAULT);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__ORDERING_COLUMN:
                setOrderingColumn(ORDERING_COLUMN_EDEFAULT);
                return;
            case BusinessDomainDslPackage.ASSOCIATION__TABLE:
                setTable(TABLE_EDEFAULT);
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
            case BusinessDomainDslPackage.ASSOCIATION__SOURCE:
                return source != null;
            case BusinessDomainDslPackage.ASSOCIATION__TARGET:
                return target != null;
            case BusinessDomainDslPackage.ASSOCIATION__SOURCE_ROLE_NAME:
                return SOURCE_ROLE_NAME_EDEFAULT == null ? sourceRoleName != null : !SOURCE_ROLE_NAME_EDEFAULT.equals(sourceRoleName);
            case BusinessDomainDslPackage.ASSOCIATION__SOURCE_MULTIPLICITY:
                return sourceMultiplicity != SOURCE_MULTIPLICITY_EDEFAULT;
            case BusinessDomainDslPackage.ASSOCIATION__TARGET_ROLE_NAME:
                return TARGET_ROLE_NAME_EDEFAULT == null ? targetRoleName != null : !TARGET_ROLE_NAME_EDEFAULT.equals(targetRoleName);
            case BusinessDomainDslPackage.ASSOCIATION__TARGET_MULTIPLICITY:
                return targetMultiplicity != TARGET_MULTIPLICITY_EDEFAULT;
            case BusinessDomainDslPackage.ASSOCIATION__COMPOSITE:
                return composite != COMPOSITE_EDEFAULT;
            case BusinessDomainDslPackage.ASSOCIATION__BIDIRECTIONAL:
                return bidirectional != BIDIRECTIONAL_EDEFAULT;
            case BusinessDomainDslPackage.ASSOCIATION__ORDERED:
                return ordered != ORDERED_EDEFAULT;
            case BusinessDomainDslPackage.ASSOCIATION__MODEL:
                return getModel() != null;
            case BusinessDomainDslPackage.ASSOCIATION__SOURCE_FOREIGN_KEY:
                return SOURCE_FOREIGN_KEY_EDEFAULT == null ? sourceForeignKey != null : !SOURCE_FOREIGN_KEY_EDEFAULT.equals(sourceForeignKey);
            case BusinessDomainDslPackage.ASSOCIATION__TARGET_FOREIGN_KEY:
                return TARGET_FOREIGN_KEY_EDEFAULT == null ? targetForeignKey != null : !TARGET_FOREIGN_KEY_EDEFAULT.equals(targetForeignKey);
            case BusinessDomainDslPackage.ASSOCIATION__ORDERING_COLUMN:
                return ORDERING_COLUMN_EDEFAULT == null ? orderingColumn != null : !ORDERING_COLUMN_EDEFAULT.equals(orderingColumn);
            case BusinessDomainDslPackage.ASSOCIATION__TABLE:
                return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
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
        result.append(", targetRoleName: ");
        result.append(targetRoleName);
        result.append(", targetMultiplicity: ");
        result.append(targetMultiplicity);
        result.append(", composite: ");
        result.append(composite);
        result.append(", bidirectional: ");
        result.append(bidirectional);
        result.append(", ordered: ");
        result.append(ordered);
        result.append(", sourceForeignKey: ");
        result.append(sourceForeignKey);
        result.append(", targetForeignKey: ");
        result.append(targetForeignKey);
        result.append(", orderingColumn: ");
        result.append(orderingColumn);
        result.append(", table: ");
        result.append(table);
        result.append(')');
        return result.toString();
    }

} //AssociationImpl
