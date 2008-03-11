/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.BusinessClassModel;
import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.Comment;
import BusinessDomainDsl.DatabaseType;
import BusinessDomainDsl.Enumeration;
import BusinessDomainDsl.PropertyContainer;
import BusinessDomainDsl.association_R;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Class Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassModelImpl#isAutoGenerate <em>Auto Generate</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassModelImpl#getBusinessProcessProject <em>Business Process Project</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassModelImpl#getBusinessProcessDirectory <em>Business Process Directory</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassModelImpl#getServiceHostProject <em>Service Host Project</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassModelImpl#getDatabaseType <em>Database Type</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassModelImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassModelImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassModelImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassModelImpl#getPropertyContainer <em>Property Container</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.BusinessClassModelImpl#getAssociations <em>Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessClassModelImpl extends NamedElementImpl implements BusinessClassModel {
	/**
	 * The default value of the '{@link #isAutoGenerate() <em>Auto Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoGenerate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_GENERATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAutoGenerate() <em>Auto Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoGenerate()
	 * @generated
	 * @ordered
	 */
	protected boolean autoGenerate = AUTO_GENERATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusinessProcessProject() <em>Business Process Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessProcessProject()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_PROCESS_PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusinessProcessProject() <em>Business Process Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessProcessProject()
	 * @generated
	 * @ordered
	 */
	protected String businessProcessProject = BUSINESS_PROCESS_PROJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusinessProcessDirectory() <em>Business Process Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessProcessDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_PROCESS_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusinessProcessDirectory() <em>Business Process Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessProcessDirectory()
	 * @generated
	 * @ordered
	 */
	protected String businessProcessDirectory = BUSINESS_PROCESS_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceHostProject() <em>Service Host Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceHostProject()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_HOST_PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceHostProject() <em>Service Host Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceHostProject()
	 * @generated
	 * @ordered
	 */
	protected String serviceHostProject = SERVICE_HOST_PROJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseType() <em>Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseType()
	 * @generated
	 * @ordered
	 */
	protected static final DatabaseType DATABASE_TYPE_EDEFAULT = DatabaseType.SQL_SERVER_2005;

	/**
	 * The cached value of the '{@link #getDatabaseType() <em>Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseType()
	 * @generated
	 * @ordered
	 */
	protected DatabaseType databaseType = DATABASE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected String databaseName = DATABASE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comment;

	/**
	 * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeration()
	 * @generated
	 * @ordered
	 */
	protected EList<Enumeration> enumeration;

	/**
	 * The cached value of the '{@link #getPropertyContainer() <em>Property Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyContainer> propertyContainer;

	/**
	 * The cached value of the '{@link #getAssociations() <em>Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<association_R> associations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessClassModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessDomainDslPackage.Literals.BUSINESS_CLASS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoGenerate() {
		return autoGenerate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoGenerate(boolean newAutoGenerate) {
		boolean oldAutoGenerate = autoGenerate;
		autoGenerate = newAutoGenerate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__AUTO_GENERATE, oldAutoGenerate, autoGenerate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusinessProcessProject() {
		return businessProcessProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessProcessProject(String newBusinessProcessProject) {
		String oldBusinessProcessProject = businessProcessProject;
		businessProcessProject = newBusinessProcessProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__BUSINESS_PROCESS_PROJECT, oldBusinessProcessProject, businessProcessProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusinessProcessDirectory() {
		return businessProcessDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessProcessDirectory(String newBusinessProcessDirectory) {
		String oldBusinessProcessDirectory = businessProcessDirectory;
		businessProcessDirectory = newBusinessProcessDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__BUSINESS_PROCESS_DIRECTORY, oldBusinessProcessDirectory, businessProcessDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceHostProject() {
		return serviceHostProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceHostProject(String newServiceHostProject) {
		String oldServiceHostProject = serviceHostProject;
		serviceHostProject = newServiceHostProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__SERVICE_HOST_PROJECT, oldServiceHostProject, serviceHostProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseType getDatabaseType() {
		return databaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseType(DatabaseType newDatabaseType) {
		DatabaseType oldDatabaseType = databaseType;
		databaseType = newDatabaseType == null ? DATABASE_TYPE_EDEFAULT : newDatabaseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__DATABASE_TYPE, oldDatabaseType, databaseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseName(String newDatabaseName) {
		String oldDatabaseName = databaseName;
		databaseName = newDatabaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__DATABASE_NAME, oldDatabaseName, databaseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComment() {
		if (comment == null) {
			comment = new EObjectContainmentEList<Comment>(Comment.class, this, BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__COMMENT);
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enumeration> getEnumeration() {
		if (enumeration == null) {
			enumeration = new EObjectContainmentEList<Enumeration>(Enumeration.class, this, BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__ENUMERATION);
		}
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyContainer> getPropertyContainer() {
		if (propertyContainer == null) {
			propertyContainer = new EObjectContainmentEList<PropertyContainer>(PropertyContainer.class, this, BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__PROPERTY_CONTAINER);
		}
		return propertyContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<association_R> getAssociations() {
		if (associations == null) {
			associations = new EObjectContainmentEList<association_R>(association_R.class, this, BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__ASSOCIATIONS);
		}
		return associations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__COMMENT:
				return ((InternalEList<?>)getComment()).basicRemove(otherEnd, msgs);
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__ENUMERATION:
				return ((InternalEList<?>)getEnumeration()).basicRemove(otherEnd, msgs);
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__PROPERTY_CONTAINER:
				return ((InternalEList<?>)getPropertyContainer()).basicRemove(otherEnd, msgs);
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__ASSOCIATIONS:
				return ((InternalEList<?>)getAssociations()).basicRemove(otherEnd, msgs);
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
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__AUTO_GENERATE:
				return isAutoGenerate() ? Boolean.TRUE : Boolean.FALSE;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__BUSINESS_PROCESS_PROJECT:
				return getBusinessProcessProject();
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__BUSINESS_PROCESS_DIRECTORY:
				return getBusinessProcessDirectory();
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__SERVICE_HOST_PROJECT:
				return getServiceHostProject();
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__DATABASE_TYPE:
				return getDatabaseType();
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__DATABASE_NAME:
				return getDatabaseName();
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__COMMENT:
				return getComment();
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__ENUMERATION:
				return getEnumeration();
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__PROPERTY_CONTAINER:
				return getPropertyContainer();
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__ASSOCIATIONS:
				return getAssociations();
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
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__AUTO_GENERATE:
				setAutoGenerate(((Boolean)newValue).booleanValue());
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__BUSINESS_PROCESS_PROJECT:
				setBusinessProcessProject((String)newValue);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__BUSINESS_PROCESS_DIRECTORY:
				setBusinessProcessDirectory((String)newValue);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__SERVICE_HOST_PROJECT:
				setServiceHostProject((String)newValue);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__DATABASE_TYPE:
				setDatabaseType((DatabaseType)newValue);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__DATABASE_NAME:
				setDatabaseName((String)newValue);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends Comment>)newValue);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__ENUMERATION:
				getEnumeration().clear();
				getEnumeration().addAll((Collection<? extends Enumeration>)newValue);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__PROPERTY_CONTAINER:
				getPropertyContainer().clear();
				getPropertyContainer().addAll((Collection<? extends PropertyContainer>)newValue);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__ASSOCIATIONS:
				getAssociations().clear();
				getAssociations().addAll((Collection<? extends association_R>)newValue);
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
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__AUTO_GENERATE:
				setAutoGenerate(AUTO_GENERATE_EDEFAULT);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__BUSINESS_PROCESS_PROJECT:
				setBusinessProcessProject(BUSINESS_PROCESS_PROJECT_EDEFAULT);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__BUSINESS_PROCESS_DIRECTORY:
				setBusinessProcessDirectory(BUSINESS_PROCESS_DIRECTORY_EDEFAULT);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__SERVICE_HOST_PROJECT:
				setServiceHostProject(SERVICE_HOST_PROJECT_EDEFAULT);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__DATABASE_TYPE:
				setDatabaseType(DATABASE_TYPE_EDEFAULT);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__DATABASE_NAME:
				setDatabaseName(DATABASE_NAME_EDEFAULT);
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__COMMENT:
				getComment().clear();
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__ENUMERATION:
				getEnumeration().clear();
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__PROPERTY_CONTAINER:
				getPropertyContainer().clear();
				return;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__ASSOCIATIONS:
				getAssociations().clear();
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
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__AUTO_GENERATE:
				return autoGenerate != AUTO_GENERATE_EDEFAULT;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__BUSINESS_PROCESS_PROJECT:
				return BUSINESS_PROCESS_PROJECT_EDEFAULT == null ? businessProcessProject != null : !BUSINESS_PROCESS_PROJECT_EDEFAULT.equals(businessProcessProject);
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__BUSINESS_PROCESS_DIRECTORY:
				return BUSINESS_PROCESS_DIRECTORY_EDEFAULT == null ? businessProcessDirectory != null : !BUSINESS_PROCESS_DIRECTORY_EDEFAULT.equals(businessProcessDirectory);
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__SERVICE_HOST_PROJECT:
				return SERVICE_HOST_PROJECT_EDEFAULT == null ? serviceHostProject != null : !SERVICE_HOST_PROJECT_EDEFAULT.equals(serviceHostProject);
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__DATABASE_TYPE:
				return databaseType != DATABASE_TYPE_EDEFAULT;
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__COMMENT:
				return comment != null && !comment.isEmpty();
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__ENUMERATION:
				return enumeration != null && !enumeration.isEmpty();
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__PROPERTY_CONTAINER:
				return propertyContainer != null && !propertyContainer.isEmpty();
			case BusinessDomainDslPackage.BUSINESS_CLASS_MODEL__ASSOCIATIONS:
				return associations != null && !associations.isEmpty();
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
		result.append(" (autoGenerate: ");
		result.append(autoGenerate);
		result.append(", businessProcessProject: ");
		result.append(businessProcessProject);
		result.append(", businessProcessDirectory: ");
		result.append(businessProcessDirectory);
		result.append(", serviceHostProject: ");
		result.append(serviceHostProject);
		result.append(", databaseType: ");
		result.append(databaseType);
		result.append(", databaseName: ");
		result.append(databaseName);
		result.append(')');
		return result.toString();
	}

} //BusinessClassModelImpl
