/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.AccessModifier;
import BusinessDomainDsl.BlobBinaryProperty;
import BusinessDomainDsl.BlobTextProperty;
import BusinessDomainDsl.BoolProperty;
import BusinessDomainDsl.BusinessClass;
import BusinessDomainDsl.BusinessClassModel;
import BusinessDomainDsl.BusinessDomainDslFactory;
import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.BusinessRule;
import BusinessDomainDsl.Comment;
import BusinessDomainDsl.CommentableElement;
import BusinessDomainDsl.Constraint;
import BusinessDomainDsl.CustomDataType;
import BusinessDomainDsl.CustomProperty;
import BusinessDomainDsl.DatabaseType;
import BusinessDomainDsl.DateTimeAccuracy;
import BusinessDomainDsl.DateTimeProperty;
import BusinessDomainDsl.Enumeration;
import BusinessDomainDsl.EnumerationLiteral;
import BusinessDomainDsl.InheritanceModifier;
import BusinessDomainDsl.Multiplicity;
import BusinessDomainDsl.NamedElement;
import BusinessDomainDsl.NumberProperty;
import BusinessDomainDsl.OperationConcurrency;
import BusinessDomainDsl.PersistencyMode;
import BusinessDomainDsl.Property;
import BusinessDomainDsl.PropertyContainer;
import BusinessDomainDsl.StringProperty;
import BusinessDomainDsl.TypeAccessModifier;
import BusinessDomainDsl.association_R;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessDomainDslPackageImpl extends EPackageImpl implements BusinessDomainDslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessClassModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blobBinaryPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blobTextPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass association_REClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessModifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeAccessModifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inheritanceModifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationConcurrencyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dateTimeAccuracyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum persistencyModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum databaseTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BusinessDomainDslPackageImpl() {
		super(eNS_URI, BusinessDomainDslFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BusinessDomainDslPackage init() {
		if (isInited) return (BusinessDomainDslPackage)EPackage.Registry.INSTANCE.getEPackage(BusinessDomainDslPackage.eNS_URI);

		// Obtain or create and register package
		BusinessDomainDslPackageImpl theBusinessDomainDslPackage = (BusinessDomainDslPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof BusinessDomainDslPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new BusinessDomainDslPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBusinessDomainDslPackage.createPackageContents();

		// Initialize created meta-data
		theBusinessDomainDslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBusinessDomainDslPackage.freeze();

		return theBusinessDomainDslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessClassModel() {
		return businessClassModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessClassModel_AutoGenerate() {
		return (EAttribute)businessClassModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessClassModel_BusinessProcessProject() {
		return (EAttribute)businessClassModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessClassModel_BusinessProcessDirectory() {
		return (EAttribute)businessClassModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessClassModel_ServiceHostProject() {
		return (EAttribute)businessClassModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessClassModel_DatabaseType() {
		return (EAttribute)businessClassModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessClassModel_DatabaseName() {
		return (EAttribute)businessClassModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessClassModel_Comment() {
		return (EReference)businessClassModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessClassModel_Enumeration() {
		return (EReference)businessClassModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessClassModel_PropertyContainer() {
		return (EReference)businessClassModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessClassModel_Associations() {
		return (EReference)businessClassModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessClass() {
		return businessClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessClass_InheritanceModifier() {
		return (EAttribute)businessClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessClass_AutoGenerateMapping() {
		return (EAttribute)businessClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessClass_BusinessRule() {
		return (EReference)businessClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessClass_CompositionTarget() {
		return (EReference)businessClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessClass_BaseClass() {
		return (EReference)businessClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessClass_Constraint() {
		return (EReference)businessClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessClass_AssociationTo() {
		return (EReference)businessClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessClass_AssociationFrom() {
		return (EReference)businessClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Text() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_CommentableElement() {
		return (EReference)commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_DataType() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Nullable() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_DefaultValue() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_UseAsLogicalId() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Persistency() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Description() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumeration_PersistAsString() {
		return (EAttribute)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_EnumerationLiteral() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationLiteral_Value() {
		return (EAttribute)enumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationLiteral_PersistedValue() {
		return (EAttribute)enumerationLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentableElement() {
		return commentableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentableElement_Description() {
		return (EAttribute)commentableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessRule() {
		return businessRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolProperty() {
		return boolPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimeProperty() {
		return dateTimePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeProperty_Accuracy() {
		return (EAttribute)dateTimePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomProperty() {
		return customPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomProperty_CustomDataType() {
		return (EAttribute)customPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomProperty_Enumeration() {
		return (EAttribute)customPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomProperty_Namespace() {
		return (EAttribute)customPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberProperty() {
		return numberPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberProperty_MinValue() {
		return (EAttribute)numberPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberProperty_MaxValue() {
		return (EAttribute)numberPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberProperty_MinInclusive() {
		return (EAttribute)numberPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberProperty_MaxInclusive() {
		return (EAttribute)numberPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringProperty() {
		return stringPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringProperty_RegularExpression() {
		return (EAttribute)stringPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringProperty_MinLength() {
		return (EAttribute)stringPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringProperty_MaxLength() {
		return (EAttribute)stringPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomDataType() {
		return customDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomDataType_AutoGenerate() {
		return (EAttribute)customDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyContainer() {
		return propertyContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyContainer_Property() {
		return (EReference)propertyContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlobBinaryProperty() {
		return blobBinaryPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlobTextProperty() {
		return blobTextPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_DatabaseConstraint() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_ResourceKey() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_ValidationMessage() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getassociation_R() {
		return association_REClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getassociation_R_Source() {
		return (EReference)association_REClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getassociation_R_Target() {
		return (EReference)association_REClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getassociation_R_SourceRoleName() {
		return (EAttribute)association_REClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getassociation_R_SourceMultiplicity() {
		return (EAttribute)association_REClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getassociation_R_TargetNavigability() {
		return (EAttribute)association_REClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getassociation_R_SourceNavigability() {
		return (EAttribute)association_REClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getassociation_R_TargetRoleName() {
		return (EAttribute)association_REClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getassociation_R_TargetMultiplicity() {
		return (EAttribute)association_REClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getassociation_R_IsComposite() {
		return (EAttribute)association_REClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessModifier() {
		return accessModifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeAccessModifier() {
		return typeAccessModifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInheritanceModifier() {
		return inheritanceModifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiplicity() {
		return multiplicityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationConcurrency() {
		return operationConcurrencyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDateTimeAccuracy() {
		return dateTimeAccuracyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersistencyMode() {
		return persistencyModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatabaseType() {
		return databaseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessDomainDslFactory getBusinessDomainDslFactory() {
		return (BusinessDomainDslFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		businessClassModelEClass = createEClass(BUSINESS_CLASS_MODEL);
		createEAttribute(businessClassModelEClass, BUSINESS_CLASS_MODEL__AUTO_GENERATE);
		createEAttribute(businessClassModelEClass, BUSINESS_CLASS_MODEL__BUSINESS_PROCESS_PROJECT);
		createEAttribute(businessClassModelEClass, BUSINESS_CLASS_MODEL__BUSINESS_PROCESS_DIRECTORY);
		createEAttribute(businessClassModelEClass, BUSINESS_CLASS_MODEL__SERVICE_HOST_PROJECT);
		createEAttribute(businessClassModelEClass, BUSINESS_CLASS_MODEL__DATABASE_TYPE);
		createEAttribute(businessClassModelEClass, BUSINESS_CLASS_MODEL__DATABASE_NAME);
		createEReference(businessClassModelEClass, BUSINESS_CLASS_MODEL__COMMENT);
		createEReference(businessClassModelEClass, BUSINESS_CLASS_MODEL__ENUMERATION);
		createEReference(businessClassModelEClass, BUSINESS_CLASS_MODEL__PROPERTY_CONTAINER);
		createEReference(businessClassModelEClass, BUSINESS_CLASS_MODEL__ASSOCIATIONS);

		businessClassEClass = createEClass(BUSINESS_CLASS);
		createEAttribute(businessClassEClass, BUSINESS_CLASS__INHERITANCE_MODIFIER);
		createEAttribute(businessClassEClass, BUSINESS_CLASS__AUTO_GENERATE_MAPPING);
		createEReference(businessClassEClass, BUSINESS_CLASS__BUSINESS_RULE);
		createEReference(businessClassEClass, BUSINESS_CLASS__COMPOSITION_TARGET);
		createEReference(businessClassEClass, BUSINESS_CLASS__BASE_CLASS);
		createEReference(businessClassEClass, BUSINESS_CLASS__CONSTRAINT);
		createEReference(businessClassEClass, BUSINESS_CLASS__ASSOCIATION_TO);
		createEReference(businessClassEClass, BUSINESS_CLASS__ASSOCIATION_FROM);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__TEXT);
		createEReference(commentEClass, COMMENT__COMMENTABLE_ELEMENT);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__DATA_TYPE);
		createEAttribute(propertyEClass, PROPERTY__NULLABLE);
		createEAttribute(propertyEClass, PROPERTY__DEFAULT_VALUE);
		createEAttribute(propertyEClass, PROPERTY__USE_AS_LOGICAL_ID);
		createEAttribute(propertyEClass, PROPERTY__PERSISTENCY);
		createEAttribute(propertyEClass, PROPERTY__DESCRIPTION);

		enumerationEClass = createEClass(ENUMERATION);
		createEAttribute(enumerationEClass, ENUMERATION__PERSIST_AS_STRING);
		createEReference(enumerationEClass, ENUMERATION__ENUMERATION_LITERAL);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
		createEAttribute(enumerationLiteralEClass, ENUMERATION_LITERAL__VALUE);
		createEAttribute(enumerationLiteralEClass, ENUMERATION_LITERAL__PERSISTED_VALUE);

		commentableElementEClass = createEClass(COMMENTABLE_ELEMENT);
		createEAttribute(commentableElementEClass, COMMENTABLE_ELEMENT__DESCRIPTION);

		businessRuleEClass = createEClass(BUSINESS_RULE);

		boolPropertyEClass = createEClass(BOOL_PROPERTY);

		dateTimePropertyEClass = createEClass(DATE_TIME_PROPERTY);
		createEAttribute(dateTimePropertyEClass, DATE_TIME_PROPERTY__ACCURACY);

		customPropertyEClass = createEClass(CUSTOM_PROPERTY);
		createEAttribute(customPropertyEClass, CUSTOM_PROPERTY__CUSTOM_DATA_TYPE);
		createEAttribute(customPropertyEClass, CUSTOM_PROPERTY__ENUMERATION);
		createEAttribute(customPropertyEClass, CUSTOM_PROPERTY__NAMESPACE);

		numberPropertyEClass = createEClass(NUMBER_PROPERTY);
		createEAttribute(numberPropertyEClass, NUMBER_PROPERTY__MIN_VALUE);
		createEAttribute(numberPropertyEClass, NUMBER_PROPERTY__MAX_VALUE);
		createEAttribute(numberPropertyEClass, NUMBER_PROPERTY__MIN_INCLUSIVE);
		createEAttribute(numberPropertyEClass, NUMBER_PROPERTY__MAX_INCLUSIVE);

		stringPropertyEClass = createEClass(STRING_PROPERTY);
		createEAttribute(stringPropertyEClass, STRING_PROPERTY__REGULAR_EXPRESSION);
		createEAttribute(stringPropertyEClass, STRING_PROPERTY__MIN_LENGTH);
		createEAttribute(stringPropertyEClass, STRING_PROPERTY__MAX_LENGTH);

		customDataTypeEClass = createEClass(CUSTOM_DATA_TYPE);
		createEAttribute(customDataTypeEClass, CUSTOM_DATA_TYPE__AUTO_GENERATE);

		propertyContainerEClass = createEClass(PROPERTY_CONTAINER);
		createEReference(propertyContainerEClass, PROPERTY_CONTAINER__PROPERTY);

		blobBinaryPropertyEClass = createEClass(BLOB_BINARY_PROPERTY);

		blobTextPropertyEClass = createEClass(BLOB_TEXT_PROPERTY);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__DATABASE_CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__RESOURCE_KEY);
		createEAttribute(constraintEClass, CONSTRAINT__VALIDATION_MESSAGE);

		association_REClass = createEClass(ASSOCIATION_R);
		createEReference(association_REClass, ASSOCIATION_R__SOURCE);
		createEReference(association_REClass, ASSOCIATION_R__TARGET);
		createEAttribute(association_REClass, ASSOCIATION_R__SOURCE_ROLE_NAME);
		createEAttribute(association_REClass, ASSOCIATION_R__SOURCE_MULTIPLICITY);
		createEAttribute(association_REClass, ASSOCIATION_R__TARGET_NAVIGABILITY);
		createEAttribute(association_REClass, ASSOCIATION_R__SOURCE_NAVIGABILITY);
		createEAttribute(association_REClass, ASSOCIATION_R__TARGET_ROLE_NAME);
		createEAttribute(association_REClass, ASSOCIATION_R__TARGET_MULTIPLICITY);
		createEAttribute(association_REClass, ASSOCIATION_R__IS_COMPOSITE);

		// Create enums
		accessModifierEEnum = createEEnum(ACCESS_MODIFIER);
		typeAccessModifierEEnum = createEEnum(TYPE_ACCESS_MODIFIER);
		inheritanceModifierEEnum = createEEnum(INHERITANCE_MODIFIER);
		multiplicityEEnum = createEEnum(MULTIPLICITY);
		operationConcurrencyEEnum = createEEnum(OPERATION_CONCURRENCY);
		dateTimeAccuracyEEnum = createEEnum(DATE_TIME_ACCURACY);
		persistencyModeEEnum = createEEnum(PERSISTENCY_MODE);
		databaseTypeEEnum = createEEnum(DATABASE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		businessClassModelEClass.getESuperTypes().add(this.getNamedElement());
		businessClassEClass.getESuperTypes().add(this.getPropertyContainer());
		commentEClass.getESuperTypes().add(this.getNamedElement());
		propertyEClass.getESuperTypes().add(this.getNamedElement());
		enumerationEClass.getESuperTypes().add(this.getCommentableElement());
		enumerationLiteralEClass.getESuperTypes().add(this.getNamedElement());
		commentableElementEClass.getESuperTypes().add(this.getNamedElement());
		businessRuleEClass.getESuperTypes().add(this.getNamedElement());
		boolPropertyEClass.getESuperTypes().add(this.getProperty());
		dateTimePropertyEClass.getESuperTypes().add(this.getProperty());
		customPropertyEClass.getESuperTypes().add(this.getProperty());
		numberPropertyEClass.getESuperTypes().add(this.getProperty());
		stringPropertyEClass.getESuperTypes().add(this.getProperty());
		customDataTypeEClass.getESuperTypes().add(this.getPropertyContainer());
		propertyContainerEClass.getESuperTypes().add(this.getCommentableElement());
		blobBinaryPropertyEClass.getESuperTypes().add(this.getProperty());
		blobTextPropertyEClass.getESuperTypes().add(this.getProperty());
		constraintEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", "", 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessClassModelEClass, BusinessClassModel.class, "BusinessClassModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessClassModel_AutoGenerate(), ecorePackage.getEBoolean(), "autoGenerate", "true", 0, 1, BusinessClassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessClassModel_BusinessProcessProject(), ecorePackage.getEString(), "businessProcessProject", null, 0, 1, BusinessClassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessClassModel_BusinessProcessDirectory(), ecorePackage.getEString(), "businessProcessDirectory", null, 0, 1, BusinessClassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessClassModel_ServiceHostProject(), ecorePackage.getEString(), "serviceHostProject", null, 0, 1, BusinessClassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessClassModel_DatabaseType(), this.getDatabaseType(), "databaseType", "SQLServer_2005", 0, 1, BusinessClassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessClassModel_DatabaseName(), ecorePackage.getEString(), "databaseName", null, 0, 1, BusinessClassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessClassModel_Comment(), this.getComment(), null, "comment", null, 0, -1, BusinessClassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessClassModel_Enumeration(), this.getEnumeration(), null, "enumeration", null, 0, -1, BusinessClassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessClassModel_PropertyContainer(), this.getPropertyContainer(), null, "propertyContainer", null, 0, -1, BusinessClassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessClassModel_Associations(), this.getassociation_R(), null, "associations", null, 0, -1, BusinessClassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(businessClassEClass, BusinessClass.class, "BusinessClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessClass_InheritanceModifier(), this.getInheritanceModifier(), "inheritanceModifier", "None", 0, 1, BusinessClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessClass_AutoGenerateMapping(), ecorePackage.getEBoolean(), "autoGenerateMapping", "true", 0, 1, BusinessClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessClass_BusinessRule(), this.getBusinessRule(), null, "businessRule", null, 0, -1, BusinessClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessClass_CompositionTarget(), this.getBusinessClass(), null, "compositionTarget", null, 0, -1, BusinessClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessClass_BaseClass(), this.getBusinessClass(), null, "baseClass", null, 0, 1, BusinessClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessClass_Constraint(), this.getConstraint(), null, "constraint", null, 0, -1, BusinessClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessClass_AssociationTo(), this.getassociation_R(), this.getassociation_R_Source(), "associationTo", null, 0, -1, BusinessClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessClass_AssociationFrom(), this.getassociation_R(), this.getassociation_R_Target(), "associationFrom", null, 0, -1, BusinessClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Text(), ecorePackage.getEString(), "text", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComment_CommentableElement(), this.getCommentableElement(), null, "commentableElement", null, 0, -1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_UseAsLogicalId(), ecorePackage.getEBoolean(), "useAsLogicalId", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Persistency(), this.getPersistencyMode(), "persistency", "ReadWrite", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Description(), ecorePackage.getEString(), "description", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumeration_PersistAsString(), ecorePackage.getEBoolean(), "persistAsString", "false", 0, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumeration_EnumerationLiteral(), this.getEnumerationLiteral(), null, "enumerationLiteral", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationLiteral_PersistedValue(), ecorePackage.getEString(), "persistedValue", null, 0, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentableElementEClass, CommentableElement.class, "CommentableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommentableElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, CommentableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessRuleEClass, BusinessRule.class, "BusinessRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boolPropertyEClass, BoolProperty.class, "BoolProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateTimePropertyEClass, DateTimeProperty.class, "DateTimeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimeProperty_Accuracy(), this.getDateTimeAccuracy(), "accuracy", "DateTime", 0, 1, DateTimeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customPropertyEClass, CustomProperty.class, "CustomProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomProperty_CustomDataType(), ecorePackage.getEString(), "customDataType", null, 0, 1, CustomProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomProperty_Enumeration(), ecorePackage.getEString(), "enumeration", null, 0, 1, CustomProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomProperty_Namespace(), ecorePackage.getEString(), "namespace", "Current ...", 0, 1, CustomProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberPropertyEClass, NumberProperty.class, "NumberProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberProperty_MinValue(), ecorePackage.getEString(), "minValue", null, 0, 1, NumberProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberProperty_MaxValue(), ecorePackage.getEString(), "maxValue", null, 0, 1, NumberProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberProperty_MinInclusive(), ecorePackage.getEBoolean(), "minInclusive", null, 0, 1, NumberProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberProperty_MaxInclusive(), ecorePackage.getEBoolean(), "maxInclusive", null, 0, 1, NumberProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringPropertyEClass, StringProperty.class, "StringProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringProperty_RegularExpression(), ecorePackage.getEString(), "regularExpression", null, 0, 1, StringProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringProperty_MinLength(), ecorePackage.getEInt(), "minLength", null, 0, 1, StringProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringProperty_MaxLength(), ecorePackage.getEInt(), "maxLength", null, 0, 1, StringProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customDataTypeEClass, CustomDataType.class, "CustomDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomDataType_AutoGenerate(), ecorePackage.getEBoolean(), "autoGenerate", "true", 0, 1, CustomDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyContainerEClass, PropertyContainer.class, "PropertyContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyContainer_Property(), this.getProperty(), null, "property", null, 0, -1, PropertyContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blobBinaryPropertyEClass, BlobBinaryProperty.class, "BlobBinaryProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blobTextPropertyEClass, BlobTextProperty.class, "BlobTextProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_DatabaseConstraint(), ecorePackage.getEString(), "databaseConstraint", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_ResourceKey(), ecorePackage.getEString(), "resourceKey", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_ValidationMessage(), ecorePackage.getEString(), "validationMessage", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(association_REClass, association_R.class, "association_R", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getassociation_R_Source(), this.getBusinessClass(), this.getBusinessClass_AssociationTo(), "source", null, 1, 1, association_R.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getassociation_R_Target(), this.getBusinessClass(), this.getBusinessClass_AssociationFrom(), "target", null, 1, 1, association_R.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getassociation_R_SourceRoleName(), ecorePackage.getEString(), "sourceRoleName", null, 0, 1, association_R.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getassociation_R_SourceMultiplicity(), ecorePackage.getEString(), "sourceMultiplicity", "", 0, 1, association_R.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getassociation_R_TargetNavigability(), ecorePackage.getEBoolean(), "targetNavigability", "true", 0, 1, association_R.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getassociation_R_SourceNavigability(), ecorePackage.getEBoolean(), "sourceNavigability", null, 0, 1, association_R.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getassociation_R_TargetRoleName(), ecorePackage.getEString(), "targetRoleName", null, 0, 1, association_R.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getassociation_R_TargetMultiplicity(), ecorePackage.getEString(), "targetMultiplicity", null, 0, 1, association_R.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getassociation_R_IsComposite(), ecorePackage.getEBoolean(), "isComposite", null, 0, 1, association_R.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(accessModifierEEnum, AccessModifier.class, "AccessModifier");
		addEEnumLiteral(accessModifierEEnum, AccessModifier.PUBLIC);
		addEEnumLiteral(accessModifierEEnum, AccessModifier.ASSEMBLY);
		addEEnumLiteral(accessModifierEEnum, AccessModifier.PRIVATE);
		addEEnumLiteral(accessModifierEEnum, AccessModifier.FAMILY);
		addEEnumLiteral(accessModifierEEnum, AccessModifier.FAMILY_OR_ASSEMBLY);
		addEEnumLiteral(accessModifierEEnum, AccessModifier.FAMILY_AND_ASSEMBLY);

		initEEnum(typeAccessModifierEEnum, TypeAccessModifier.class, "TypeAccessModifier");
		addEEnumLiteral(typeAccessModifierEEnum, TypeAccessModifier.PUBLIC);
		addEEnumLiteral(typeAccessModifierEEnum, TypeAccessModifier.PRIVATE);

		initEEnum(inheritanceModifierEEnum, InheritanceModifier.class, "InheritanceModifier");
		addEEnumLiteral(inheritanceModifierEEnum, InheritanceModifier.NONE);
		addEEnumLiteral(inheritanceModifierEEnum, InheritanceModifier.ABSTRACT);
		addEEnumLiteral(inheritanceModifierEEnum, InheritanceModifier.SEALED);

		initEEnum(multiplicityEEnum, Multiplicity.class, "Multiplicity");
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ZERO_MANY);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ONE);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ZERO_ONE);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ONE_MANY);

		initEEnum(operationConcurrencyEEnum, OperationConcurrency.class, "OperationConcurrency");
		addEEnumLiteral(operationConcurrencyEEnum, OperationConcurrency.SEQUENTIAL);
		addEEnumLiteral(operationConcurrencyEEnum, OperationConcurrency.GUARDED);
		addEEnumLiteral(operationConcurrencyEEnum, OperationConcurrency.CONCURRENT);

		initEEnum(dateTimeAccuracyEEnum, DateTimeAccuracy.class, "DateTimeAccuracy");
		addEEnumLiteral(dateTimeAccuracyEEnum, DateTimeAccuracy.MILLISECOND);
		addEEnumLiteral(dateTimeAccuracyEEnum, DateTimeAccuracy.SECOND);
		addEEnumLiteral(dateTimeAccuracyEEnum, DateTimeAccuracy.MINUTE);
		addEEnumLiteral(dateTimeAccuracyEEnum, DateTimeAccuracy.HOUR);
		addEEnumLiteral(dateTimeAccuracyEEnum, DateTimeAccuracy.SHORT_TIME);
		addEEnumLiteral(dateTimeAccuracyEEnum, DateTimeAccuracy.TIME);
		addEEnumLiteral(dateTimeAccuracyEEnum, DateTimeAccuracy.DAY);
		addEEnumLiteral(dateTimeAccuracyEEnum, DateTimeAccuracy.MONTH);
		addEEnumLiteral(dateTimeAccuracyEEnum, DateTimeAccuracy.YEAR);
		addEEnumLiteral(dateTimeAccuracyEEnum, DateTimeAccuracy.DATE);
		addEEnumLiteral(dateTimeAccuracyEEnum, DateTimeAccuracy.DATE_TIME);

		initEEnum(persistencyModeEEnum, PersistencyMode.class, "PersistencyMode");
		addEEnumLiteral(persistencyModeEEnum, PersistencyMode.READ_WRITE);
		addEEnumLiteral(persistencyModeEEnum, PersistencyMode.READ);
		addEEnumLiteral(persistencyModeEEnum, PersistencyMode.NONE);

		initEEnum(databaseTypeEEnum, DatabaseType.class, "DatabaseType");
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.SQL_SERVER_2000);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.ORACLE_ANY_VERSION);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.MY_SQL_3OR_4);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.MY_SQL_5);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.ORACLE_9TO_10G);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.SQL_SERVER_2005);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.SQL_SERVER_7);

		// Create resource
		createResource(eNS_URI);
	}

} //BusinessDomainDslPackageImpl
