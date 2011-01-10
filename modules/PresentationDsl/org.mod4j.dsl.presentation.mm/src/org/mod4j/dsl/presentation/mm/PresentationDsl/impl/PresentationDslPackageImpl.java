/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mod4j.dsl.presentation.mm.PresentationDsl.AbstractDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.AbstractProcess;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Action;
import org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Expression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ExpressionType;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Menu;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext;
import org.mod4j.dsl.presentation.mm.PresentationDsl.NavigationExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.OperationExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Page;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PageReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslFactory;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.StandardExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PresentationDslPackageImpl extends EPackageImpl implements PresentationDslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationRoleReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtoPropertyReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementWithContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDialogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtoReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum expressionTypeEEnum = null;

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
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PresentationDslPackageImpl() {
		super(eNS_URI, PresentationDslFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PresentationDslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PresentationDslPackage init() {
		if (isInited) return (PresentationDslPackage)EPackage.Registry.INSTANCE.getEPackage(PresentationDslPackage.eNS_URI);

		// Obtain or create and register package
		PresentationDslPackageImpl thePresentationDslPackage = (PresentationDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PresentationDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PresentationDslPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePresentationDslPackage.createPackageContents();

		// Initialize created meta-data
		thePresentationDslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePresentationDslPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PresentationDslPackage.eNS_URI, thePresentationDslPackage);
		return thePresentationDslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationRoleReference() {
		return associationRoleReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_FormElements() {
		return (EReference)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_BaseView() {
		return (EReference)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Actions() {
		return (EReference)viewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataProperty() {
		return dataPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataProperty_DataType() {
		return (EAttribute)dataPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataProperty_IsEnumeration() {
		return (EAttribute)dataPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataProperty_FormElement() {
		return (EReference)dataPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataProperty_Editable() {
		return (EAttribute)dataPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDtoPropertyReference() {
		return dtoPropertyReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDtoPropertyReference_Subname() {
		return (EAttribute)dtoPropertyReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalReference() {
		return externalReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalReference_ModelName() {
		return (EAttribute)externalReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormElement() {
		return formElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormElement_References() {
		return (EReference)formElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormElement_Readonly() {
		return (EAttribute)formElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormElement_Form() {
		return (EReference)formElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormElement_Label() {
		return (EAttribute)formElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormElement_DataProperty() {
		return (EReference)formElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElementWithContext() {
		return modelElementWithContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElementWithContext_ContextRef() {
		return (EReference)modelElementWithContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElementWithContext_PresentationModel() {
		return (EReference)modelElementWithContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElementWithContext_CollectionContext() {
		return (EAttribute)modelElementWithContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Name() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Description() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresentationModel() {
		return presentationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationModel_Elements() {
		return (EReference)presentationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationModel_ExternalReferences() {
		return (EReference)presentationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationModel_MainMenu() {
		return (EReference)presentationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Link() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_NextPage() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Condition() {
		return (EReference)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_ContextExp() {
		return (EReference)actionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Arguments() {
		return (EReference)actionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_View() {
		return (EReference)actionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Menu() {
		return (EReference)actionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIModelElement() {
		return uiModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceExpression() {
		return serviceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceExpression_Service() {
		return (EReference)serviceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationExpression() {
		return navigationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationExpression_References() {
		return (EReference)navigationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardExpression() {
		return standardExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardExpression_Type() {
		return (EAttribute)standardExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStandardExpression_ContextRef() {
		return (EReference)standardExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationExpression() {
		return operationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenu() {
		return menuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_StartActions() {
		return (EReference)menuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractProcess() {
		return abstractProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractProcess_Type() {
		return (EAttribute)abstractProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractProcess_Label() {
		return (EAttribute)abstractProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDialogue() {
		return abstractDialogueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDtoReference() {
		return dtoReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceReference() {
		return serviceReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Dialogue() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageReference() {
		return pageReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessType() {
		return processTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExpressionType() {
		return expressionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationDslFactory getPresentationDslFactory() {
		return (PresentationDslFactory)getEFactoryInstance();
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
		associationRoleReferenceEClass = createEClass(ASSOCIATION_ROLE_REFERENCE);

		viewEClass = createEClass(VIEW);
		createEReference(viewEClass, VIEW__FORM_ELEMENTS);
		createEReference(viewEClass, VIEW__BASE_VIEW);
		createEReference(viewEClass, VIEW__ACTIONS);

		dataPropertyEClass = createEClass(DATA_PROPERTY);
		createEAttribute(dataPropertyEClass, DATA_PROPERTY__DATA_TYPE);
		createEAttribute(dataPropertyEClass, DATA_PROPERTY__IS_ENUMERATION);
		createEReference(dataPropertyEClass, DATA_PROPERTY__FORM_ELEMENT);
		createEAttribute(dataPropertyEClass, DATA_PROPERTY__EDITABLE);

		dtoPropertyReferenceEClass = createEClass(DTO_PROPERTY_REFERENCE);
		createEAttribute(dtoPropertyReferenceEClass, DTO_PROPERTY_REFERENCE__SUBNAME);

		externalReferenceEClass = createEClass(EXTERNAL_REFERENCE);
		createEAttribute(externalReferenceEClass, EXTERNAL_REFERENCE__MODEL_NAME);

		formElementEClass = createEClass(FORM_ELEMENT);
		createEReference(formElementEClass, FORM_ELEMENT__REFERENCES);
		createEAttribute(formElementEClass, FORM_ELEMENT__READONLY);
		createEReference(formElementEClass, FORM_ELEMENT__FORM);
		createEAttribute(formElementEClass, FORM_ELEMENT__LABEL);
		createEReference(formElementEClass, FORM_ELEMENT__DATA_PROPERTY);

		modelElementWithContextEClass = createEClass(MODEL_ELEMENT_WITH_CONTEXT);
		createEReference(modelElementWithContextEClass, MODEL_ELEMENT_WITH_CONTEXT__CONTEXT_REF);
		createEReference(modelElementWithContextEClass, MODEL_ELEMENT_WITH_CONTEXT__PRESENTATION_MODEL);
		createEAttribute(modelElementWithContextEClass, MODEL_ELEMENT_WITH_CONTEXT__COLLECTION_CONTEXT);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);

		presentationModelEClass = createEClass(PRESENTATION_MODEL);
		createEReference(presentationModelEClass, PRESENTATION_MODEL__ELEMENTS);
		createEReference(presentationModelEClass, PRESENTATION_MODEL__EXTERNAL_REFERENCES);
		createEReference(presentationModelEClass, PRESENTATION_MODEL__MAIN_MENU);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__LINK);
		createEReference(actionEClass, ACTION__NEXT_PAGE);
		createEReference(actionEClass, ACTION__CONDITION);
		createEReference(actionEClass, ACTION__CONTEXT_EXP);
		createEReference(actionEClass, ACTION__ARGUMENTS);
		createEReference(actionEClass, ACTION__VIEW);
		createEReference(actionEClass, ACTION__MENU);

		uiModelElementEClass = createEClass(UI_MODEL_ELEMENT);

		serviceExpressionEClass = createEClass(SERVICE_EXPRESSION);
		createEReference(serviceExpressionEClass, SERVICE_EXPRESSION__SERVICE);

		navigationExpressionEClass = createEClass(NAVIGATION_EXPRESSION);
		createEReference(navigationExpressionEClass, NAVIGATION_EXPRESSION__REFERENCES);

		expressionEClass = createEClass(EXPRESSION);

		standardExpressionEClass = createEClass(STANDARD_EXPRESSION);
		createEAttribute(standardExpressionEClass, STANDARD_EXPRESSION__TYPE);
		createEReference(standardExpressionEClass, STANDARD_EXPRESSION__CONTEXT_REF);

		operationExpressionEClass = createEClass(OPERATION_EXPRESSION);

		menuEClass = createEClass(MENU);
		createEReference(menuEClass, MENU__START_ACTIONS);

		abstractProcessEClass = createEClass(ABSTRACT_PROCESS);
		createEAttribute(abstractProcessEClass, ABSTRACT_PROCESS__TYPE);
		createEAttribute(abstractProcessEClass, ABSTRACT_PROCESS__LABEL);

		abstractDialogueEClass = createEClass(ABSTRACT_DIALOGUE);

		dtoReferenceEClass = createEClass(DTO_REFERENCE);

		serviceReferenceEClass = createEClass(SERVICE_REFERENCE);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__DIALOGUE);

		pageReferenceEClass = createEClass(PAGE_REFERENCE);

		// Create enums
		processTypeEEnum = createEEnum(PROCESS_TYPE);
		expressionTypeEEnum = createEEnum(EXPRESSION_TYPE);
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
		associationRoleReferenceEClass.getESuperTypes().add(this.getModelElement());
		viewEClass.getESuperTypes().add(this.getAbstractDialogue());
		dataPropertyEClass.getESuperTypes().add(this.getModelElement());
		dtoPropertyReferenceEClass.getESuperTypes().add(this.getModelElement());
		externalReferenceEClass.getESuperTypes().add(this.getModelElement());
		formElementEClass.getESuperTypes().add(this.getModelElement());
		modelElementWithContextEClass.getESuperTypes().add(this.getModelElement());
		presentationModelEClass.getESuperTypes().add(this.getModelElement());
		actionEClass.getESuperTypes().add(this.getAbstractProcess());
		uiModelElementEClass.getESuperTypes().add(this.getModelElementWithContext());
		serviceExpressionEClass.getESuperTypes().add(this.getExpression());
		navigationExpressionEClass.getESuperTypes().add(this.getExpression());
		expressionEClass.getESuperTypes().add(this.getModelElement());
		standardExpressionEClass.getESuperTypes().add(this.getExpression());
		operationExpressionEClass.getESuperTypes().add(this.getExpression());
		menuEClass.getESuperTypes().add(this.getModelElement());
		abstractProcessEClass.getESuperTypes().add(this.getUIModelElement());
		abstractDialogueEClass.getESuperTypes().add(this.getUIModelElement());
		dtoReferenceEClass.getESuperTypes().add(this.getExternalReference());
		serviceReferenceEClass.getESuperTypes().add(this.getExternalReference());
		pageEClass.getESuperTypes().add(this.getAbstractDialogue());
		pageReferenceEClass.getESuperTypes().add(this.getPage());
		pageReferenceEClass.getESuperTypes().add(this.getExternalReference());

		// Initialize classes and features; add operations and parameters
		initEClass(associationRoleReferenceEClass, AssociationRoleReference.class, "AssociationRoleReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getView_FormElements(), this.getFormElement(), this.getFormElement_Form(), "formElements", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_BaseView(), this.getView(), null, "baseView", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_Actions(), this.getAction(), this.getAction_View(), "actions", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPropertyEClass, DataProperty.class, "DataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataProperty_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, DataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataProperty_IsEnumeration(), ecorePackage.getEBoolean(), "isEnumeration", null, 0, 1, DataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataProperty_FormElement(), this.getFormElement(), this.getFormElement_DataProperty(), "formElement", null, 0, 1, DataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataProperty_Editable(), ecorePackage.getEBoolean(), "editable", "true", 0, 1, DataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoPropertyReferenceEClass, DtoPropertyReference.class, "DtoPropertyReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDtoPropertyReference_Subname(), ecorePackage.getEString(), "subname", null, 0, 1, DtoPropertyReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalReferenceEClass, ExternalReference.class, "ExternalReference", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalReference_ModelName(), ecorePackage.getEString(), "modelName", null, 0, 1, ExternalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formElementEClass, FormElement.class, "FormElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormElement_References(), this.getDtoPropertyReference(), null, "references", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormElement_Readonly(), ecorePackage.getEBoolean(), "readonly", "false", 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormElement_Form(), this.getView(), this.getView_FormElements(), "form", null, 1, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormElement_Label(), ecorePackage.getEString(), "label", "", 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormElement_DataProperty(), this.getDataProperty(), this.getDataProperty_FormElement(), "dataProperty", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementWithContextEClass, ModelElementWithContext.class, "ModelElementWithContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElementWithContext_ContextRef(), this.getDtoReference(), null, "contextRef", null, 0, 1, ModelElementWithContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElementWithContext_PresentationModel(), this.getPresentationModel(), this.getPresentationModel_Elements(), "presentationModel", null, 0, 1, ModelElementWithContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElementWithContext_CollectionContext(), ecorePackage.getEBoolean(), "collectionContext", "false", 0, 1, ModelElementWithContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(presentationModelEClass, PresentationModel.class, "PresentationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPresentationModel_Elements(), this.getModelElementWithContext(), this.getModelElementWithContext_PresentationModel(), "elements", null, 0, -1, PresentationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationModel_ExternalReferences(), this.getExternalReference(), null, "externalReferences", null, 0, -1, PresentationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationModel_MainMenu(), this.getMenu(), null, "mainMenu", null, 0, 1, PresentationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Link(), this.getAssociationRoleReference(), null, "link", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_NextPage(), this.getPage(), null, "nextPage", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Condition(), this.getExpression(), null, "condition", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_ContextExp(), this.getExpression(), null, "contextExp", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Arguments(), this.getExpression(), null, "arguments", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_View(), this.getView(), this.getView_Actions(), "view", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Menu(), this.getMenu(), this.getMenu_StartActions(), "menu", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiModelElementEClass, UIModelElement.class, "UIModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceExpressionEClass, ServiceExpression.class, "ServiceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceExpression_Service(), this.getServiceReference(), null, "service", null, 0, 1, ServiceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationExpressionEClass, NavigationExpression.class, "NavigationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigationExpression_References(), this.getAssociationRoleReference(), null, "references", null, 0, -1, NavigationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(standardExpressionEClass, StandardExpression.class, "StandardExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandardExpression_Type(), this.getExpressionType(), "type", "NONE", 0, 1, StandardExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStandardExpression_ContextRef(), this.getDtoReference(), null, "contextRef", null, 0, 1, StandardExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationExpressionEClass, OperationExpression.class, "OperationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenu_StartActions(), this.getAction(), this.getAction_Menu(), "startActions", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractProcessEClass, AbstractProcess.class, "AbstractProcess", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractProcess_Type(), this.getProcessType(), "type", "CUSTOM", 0, 1, AbstractProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractProcess_Label(), ecorePackage.getEString(), "label", null, 0, 1, AbstractProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractDialogueEClass, AbstractDialogue.class, "AbstractDialogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dtoReferenceEClass, DtoReference.class, "DtoReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceReferenceEClass, ServiceReference.class, "ServiceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_Dialogue(), this.getAbstractDialogue(), null, "dialogue", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageReferenceEClass, PageReference.class, "PageReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(processTypeEEnum, ProcessType.class, "ProcessType");
		addEEnumLiteral(processTypeEEnum, ProcessType.NEW);
		addEEnumLiteral(processTypeEEnum, ProcessType.SAVE);
		addEEnumLiteral(processTypeEEnum, ProcessType.EDIT);
		addEEnumLiteral(processTypeEEnum, ProcessType.DELETE);
		addEEnumLiteral(processTypeEEnum, ProcessType.CUSTOM);
		addEEnumLiteral(processTypeEEnum, ProcessType.CANCEL);
		addEEnumLiteral(processTypeEEnum, ProcessType.ADDTO);
		addEEnumLiteral(processTypeEEnum, ProcessType.REMOVEFROM);
		addEEnumLiteral(processTypeEEnum, ProcessType.LINK);
		addEEnumLiteral(processTypeEEnum, ProcessType.PREVIOUS);

		initEEnum(expressionTypeEEnum, ExpressionType.class, "ExpressionType");
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.ALL);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.NONE);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.FIND);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.SELECTION);

		// Create resource
		createResource(eNS_URI);
	}

} //PresentationDslPackageImpl
