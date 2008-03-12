/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.provider;


import BusinessDomainDsl.BusinessDomainDslFactory;
import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.BusinessDomainModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link BusinessDomainDsl.BusinessDomainModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessDomainModelItemProvider
	extends NamedElementItemProvider
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessDomainModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAutoGeneratePropertyDescriptor(object);
			addBusinessProcessProjectPropertyDescriptor(object);
			addBusinessProcessDirectoryPropertyDescriptor(object);
			addServiceHostProjectPropertyDescriptor(object);
			addDatabaseTypePropertyDescriptor(object);
			addDatabaseNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Auto Generate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoGeneratePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessDomainModel_autoGenerate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessDomainModel_autoGenerate_feature", "_UI_BusinessDomainModel_type"),
				 BusinessDomainDslPackage.Literals.BUSINESS_DOMAIN_MODEL__AUTO_GENERATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Business Process Project feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusinessProcessProjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessDomainModel_businessProcessProject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessDomainModel_businessProcessProject_feature", "_UI_BusinessDomainModel_type"),
				 BusinessDomainDslPackage.Literals.BUSINESS_DOMAIN_MODEL__BUSINESS_PROCESS_PROJECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Business Process Directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusinessProcessDirectoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessDomainModel_businessProcessDirectory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessDomainModel_businessProcessDirectory_feature", "_UI_BusinessDomainModel_type"),
				 BusinessDomainDslPackage.Literals.BUSINESS_DOMAIN_MODEL__BUSINESS_PROCESS_DIRECTORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Host Project feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceHostProjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessDomainModel_serviceHostProject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessDomainModel_serviceHostProject_feature", "_UI_BusinessDomainModel_type"),
				 BusinessDomainDslPackage.Literals.BUSINESS_DOMAIN_MODEL__SERVICE_HOST_PROJECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Database Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabaseTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessDomainModel_databaseType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessDomainModel_databaseType_feature", "_UI_BusinessDomainModel_type"),
				 BusinessDomainDslPackage.Literals.BUSINESS_DOMAIN_MODEL__DATABASE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Database Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabaseNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessDomainModel_databaseName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessDomainModel_databaseName_feature", "_UI_BusinessDomainModel_type"),
				 BusinessDomainDslPackage.Literals.BUSINESS_DOMAIN_MODEL__DATABASE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BusinessDomainDslPackage.Literals.BUSINESS_DOMAIN_MODEL__COMMENT);
			childrenFeatures.add(BusinessDomainDslPackage.Literals.BUSINESS_DOMAIN_MODEL__ENUMERATION);
			childrenFeatures.add(BusinessDomainDslPackage.Literals.BUSINESS_DOMAIN_MODEL__PROPERTY_CONTAINER);
			childrenFeatures.add(BusinessDomainDslPackage.Literals.BUSINESS_DOMAIN_MODEL__ASSOCIATIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BusinessDomainModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BusinessDomainModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BusinessDomainModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BusinessDomainModel_type") :
			getString("_UI_BusinessDomainModel_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BusinessDomainModel.class)) {
			case BusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__AUTO_GENERATE:
			case BusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__BUSINESS_PROCESS_PROJECT:
			case BusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__BUSINESS_PROCESS_DIRECTORY:
			case BusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__SERVICE_HOST_PROJECT:
			case BusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__DATABASE_TYPE:
			case BusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__DATABASE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__COMMENT:
			case BusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ENUMERATION:
			case BusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__PROPERTY_CONTAINER:
			case BusinessDomainDslPackage.BUSINESS_DOMAIN_MODEL__ASSOCIATIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BusinessDomainDslPackage.Literals.BUSINESS_DOMAIN_MODEL__COMMENT,
				 BusinessDomainDslFactory.eINSTANCE.createComment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessDomainDslPackage.Literals.BUSINESS_DOMAIN_MODEL__ENUMERATION,
				 BusinessDomainDslFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessDomainDslPackage.Literals.BUSINESS_DOMAIN_MODEL__PROPERTY_CONTAINER,
				 BusinessDomainDslFactory.eINSTANCE.createPropertyContainer()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessDomainDslPackage.Literals.BUSINESS_DOMAIN_MODEL__PROPERTY_CONTAINER,
				 BusinessDomainDslFactory.eINSTANCE.createBusinessClass()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessDomainDslPackage.Literals.BUSINESS_DOMAIN_MODEL__PROPERTY_CONTAINER,
				 BusinessDomainDslFactory.eINSTANCE.createCustomDataType()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessDomainDslPackage.Literals.BUSINESS_DOMAIN_MODEL__ASSOCIATIONS,
				 BusinessDomainDslFactory.eINSTANCE.createassociation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BusinessDomainDslEditPlugin.INSTANCE;
	}

}
