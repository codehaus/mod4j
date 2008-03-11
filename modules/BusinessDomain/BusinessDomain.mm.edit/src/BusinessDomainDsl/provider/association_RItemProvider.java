/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.provider;


import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.association_R;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link BusinessDomainDsl.association_R} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class association_RItemProvider
	extends ItemProviderAdapter
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
	public association_RItemProvider(AdapterFactory adapterFactory) {
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

			addSourcePropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
			addSourceRoleNamePropertyDescriptor(object);
			addSourceMultiplicityPropertyDescriptor(object);
			addTargetNavigabilityPropertyDescriptor(object);
			addSourceNavigabilityPropertyDescriptor(object);
			addTargetRoleNamePropertyDescriptor(object);
			addTargetMultiplicityPropertyDescriptor(object);
			addIsCompositePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_association_R_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_association_R_source_feature", "_UI_association_R_type"),
				 BusinessDomainDslPackage.Literals.ASSOCIATION_R__SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_association_R_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_association_R_target_feature", "_UI_association_R_type"),
				 BusinessDomainDslPackage.Literals.ASSOCIATION_R__TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Role Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceRoleNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_association_R_sourceRoleName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_association_R_sourceRoleName_feature", "_UI_association_R_type"),
				 BusinessDomainDslPackage.Literals.ASSOCIATION_R__SOURCE_ROLE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Multiplicity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceMultiplicityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_association_R_sourceMultiplicity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_association_R_sourceMultiplicity_feature", "_UI_association_R_type"),
				 BusinessDomainDslPackage.Literals.ASSOCIATION_R__SOURCE_MULTIPLICITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Navigability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetNavigabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_association_R_targetNavigability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_association_R_targetNavigability_feature", "_UI_association_R_type"),
				 BusinessDomainDslPackage.Literals.ASSOCIATION_R__TARGET_NAVIGABILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Navigability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceNavigabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_association_R_sourceNavigability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_association_R_sourceNavigability_feature", "_UI_association_R_type"),
				 BusinessDomainDslPackage.Literals.ASSOCIATION_R__SOURCE_NAVIGABILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Role Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetRoleNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_association_R_targetRoleName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_association_R_targetRoleName_feature", "_UI_association_R_type"),
				 BusinessDomainDslPackage.Literals.ASSOCIATION_R__TARGET_ROLE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Multiplicity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetMultiplicityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_association_R_targetMultiplicity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_association_R_targetMultiplicity_feature", "_UI_association_R_type"),
				 BusinessDomainDslPackage.Literals.ASSOCIATION_R__TARGET_MULTIPLICITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Composite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsCompositePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_association_R_isComposite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_association_R_isComposite_feature", "_UI_association_R_type"),
				 BusinessDomainDslPackage.Literals.ASSOCIATION_R__IS_COMPOSITE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns association_R.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/association_R"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((association_R)object).getSourceRoleName();
		return label == null || label.length() == 0 ?
			getString("_UI_association_R_type") :
			getString("_UI_association_R_type") + " " + label;
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

		switch (notification.getFeatureID(association_R.class)) {
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE_ROLE_NAME:
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE_MULTIPLICITY:
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET_NAVIGABILITY:
			case BusinessDomainDslPackage.ASSOCIATION_R__SOURCE_NAVIGABILITY:
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET_ROLE_NAME:
			case BusinessDomainDslPackage.ASSOCIATION_R__TARGET_MULTIPLICITY:
			case BusinessDomainDslPackage.ASSOCIATION_R__IS_COMPOSITE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
