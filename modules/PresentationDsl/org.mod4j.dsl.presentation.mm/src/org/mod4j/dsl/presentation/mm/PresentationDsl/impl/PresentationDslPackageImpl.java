/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.AutomatedProcess;
import org.mod4j.dsl.presentation.mm.PresentationDsl.CollectionDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.CompoundDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Dialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DirectDialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DirectProcessCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Form;
import org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.InteractiveProcess;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Link;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkPath;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkRef;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkStep;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedDialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedProcessCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslFactory;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.SimpleProcess;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UICall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElementCall;

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
    private EClass automatedProcessEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contentFormEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass compoundDialogueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass collectionDialogueEClass = null;

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
    private EClass dialogueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dialogueCallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass directDialogueCallEClass = null;

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
    private EClass formEClass = null;

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
    private EClass interactiveProcessEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass linkEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass linkedDialogueCallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass linkedProcessCallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass linkRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass linkPathEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass linkStepEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass masterDetailEClass = null;

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
    private EClass processEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processCallEClass = null;

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
    private EClass uiModelElementCallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass uiCallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass directProcessCallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass simpleProcessEClass = null;

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
    public EClass getAutomatedProcess() {
        return automatedProcessEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContentForm() {
        return contentFormEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContentForm_FormElements() {
        return (EReference)contentFormEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContentForm_IsCollection() {
        return (EAttribute)contentFormEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContentForm_Actions() {
        return (EReference)contentFormEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCompoundDialogue() {
        return compoundDialogueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCompoundDialogue_Dialogues() {
        return (EReference)compoundDialogueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCollectionDialogue() {
        return collectionDialogueEClass;
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
    public EClass getDialogue() {
        return dialogueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDialogue_Readonly() {
        return (EAttribute)dialogueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDialogue_Processes() {
        return (EReference)dialogueEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDialogueCall() {
        return dialogueCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDialogueCall_CompoundDialogue() {
        return (EReference)dialogueCallEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDirectDialogueCall() {
        return directDialogueCallEClass;
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
    public EClass getForm() {
        return formEClass;
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
    public EClass getInteractiveProcess() {
        return interactiveProcessEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLink() {
        return linkEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLinkedDialogueCall() {
        return linkedDialogueCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLinkedDialogueCall_Link() {
        return (EReference)linkedDialogueCallEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLinkedProcessCall() {
        return linkedProcessCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLinkedProcessCall_Link() {
        return (EReference)linkedProcessCallEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLinkRef() {
        return linkRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLinkPath() {
        return linkPathEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLinkPath_Steps() {
        return (EReference)linkPathEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLinkStep() {
        return linkStepEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLinkStep_Reference() {
        return (EReference)linkStepEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMasterDetail() {
        return masterDetailEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMasterDetail_Master() {
        return (EReference)masterDetailEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMasterDetail_Detail() {
        return (EReference)masterDetailEClass.getEStructuralFeatures().get(1);
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
    public EAttribute getPresentationModel_Name() {
        return (EAttribute)presentationModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPresentationModel_Description() {
        return (EAttribute)presentationModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPresentationModel_Elements() {
        return (EReference)presentationModelEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPresentationModel_ExternalReferences() {
        return (EReference)presentationModelEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcess() {
        return processEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcess_ProcessElements() {
        return (EReference)processEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcessCall() {
        return processCallEClass;
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
    public EClass getUIModelElementCall() {
        return uiModelElementCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUIModelElementCall_Alias() {
        return (EAttribute)uiModelElementCallEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUICall() {
        return uiCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUICall_Process() {
        return (EReference)uiCallEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDirectProcessCall() {
        return directProcessCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSimpleProcess() {
        return simpleProcessEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSimpleProcess_Dialogue() {
        return (EReference)simpleProcessEClass.getEStructuralFeatures().get(0);
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

        automatedProcessEClass = createEClass(AUTOMATED_PROCESS);

        contentFormEClass = createEClass(CONTENT_FORM);
        createEReference(contentFormEClass, CONTENT_FORM__FORM_ELEMENTS);
        createEAttribute(contentFormEClass, CONTENT_FORM__IS_COLLECTION);
        createEReference(contentFormEClass, CONTENT_FORM__ACTIONS);

        compoundDialogueEClass = createEClass(COMPOUND_DIALOGUE);
        createEReference(compoundDialogueEClass, COMPOUND_DIALOGUE__DIALOGUES);

        collectionDialogueEClass = createEClass(COLLECTION_DIALOGUE);

        dataPropertyEClass = createEClass(DATA_PROPERTY);
        createEAttribute(dataPropertyEClass, DATA_PROPERTY__DATA_TYPE);
        createEAttribute(dataPropertyEClass, DATA_PROPERTY__IS_ENUMERATION);
        createEReference(dataPropertyEClass, DATA_PROPERTY__FORM_ELEMENT);

        dialogueEClass = createEClass(DIALOGUE);
        createEAttribute(dialogueEClass, DIALOGUE__READONLY);
        createEReference(dialogueEClass, DIALOGUE__PROCESSES);

        dialogueCallEClass = createEClass(DIALOGUE_CALL);
        createEReference(dialogueCallEClass, DIALOGUE_CALL__COMPOUND_DIALOGUE);

        directDialogueCallEClass = createEClass(DIRECT_DIALOGUE_CALL);

        dtoPropertyReferenceEClass = createEClass(DTO_PROPERTY_REFERENCE);

        externalReferenceEClass = createEClass(EXTERNAL_REFERENCE);
        createEAttribute(externalReferenceEClass, EXTERNAL_REFERENCE__MODEL_NAME);

        formEClass = createEClass(FORM);

        formElementEClass = createEClass(FORM_ELEMENT);
        createEReference(formElementEClass, FORM_ELEMENT__REFERENCES);
        createEAttribute(formElementEClass, FORM_ELEMENT__READONLY);
        createEReference(formElementEClass, FORM_ELEMENT__FORM);
        createEAttribute(formElementEClass, FORM_ELEMENT__LABEL);
        createEReference(formElementEClass, FORM_ELEMENT__DATA_PROPERTY);

        interactiveProcessEClass = createEClass(INTERACTIVE_PROCESS);

        linkEClass = createEClass(LINK);

        linkedDialogueCallEClass = createEClass(LINKED_DIALOGUE_CALL);
        createEReference(linkedDialogueCallEClass, LINKED_DIALOGUE_CALL__LINK);

        linkedProcessCallEClass = createEClass(LINKED_PROCESS_CALL);
        createEReference(linkedProcessCallEClass, LINKED_PROCESS_CALL__LINK);

        linkRefEClass = createEClass(LINK_REF);

        linkPathEClass = createEClass(LINK_PATH);
        createEReference(linkPathEClass, LINK_PATH__STEPS);

        linkStepEClass = createEClass(LINK_STEP);
        createEReference(linkStepEClass, LINK_STEP__REFERENCE);

        masterDetailEClass = createEClass(MASTER_DETAIL);
        createEReference(masterDetailEClass, MASTER_DETAIL__MASTER);
        createEReference(masterDetailEClass, MASTER_DETAIL__DETAIL);

        modelElementWithContextEClass = createEClass(MODEL_ELEMENT_WITH_CONTEXT);
        createEReference(modelElementWithContextEClass, MODEL_ELEMENT_WITH_CONTEXT__CONTEXT_REF);
        createEReference(modelElementWithContextEClass, MODEL_ELEMENT_WITH_CONTEXT__PRESENTATION_MODEL);

        modelElementEClass = createEClass(MODEL_ELEMENT);
        createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
        createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);

        presentationModelEClass = createEClass(PRESENTATION_MODEL);
        createEAttribute(presentationModelEClass, PRESENTATION_MODEL__NAME);
        createEAttribute(presentationModelEClass, PRESENTATION_MODEL__DESCRIPTION);
        createEReference(presentationModelEClass, PRESENTATION_MODEL__ELEMENTS);
        createEReference(presentationModelEClass, PRESENTATION_MODEL__EXTERNAL_REFERENCES);

        processEClass = createEClass(PROCESS);
        createEReference(processEClass, PROCESS__PROCESS_ELEMENTS);

        processCallEClass = createEClass(PROCESS_CALL);

        uiModelElementEClass = createEClass(UI_MODEL_ELEMENT);

        uiModelElementCallEClass = createEClass(UI_MODEL_ELEMENT_CALL);
        createEAttribute(uiModelElementCallEClass, UI_MODEL_ELEMENT_CALL__ALIAS);

        uiCallEClass = createEClass(UI_CALL);
        createEReference(uiCallEClass, UI_CALL__PROCESS);

        directProcessCallEClass = createEClass(DIRECT_PROCESS_CALL);

        simpleProcessEClass = createEClass(SIMPLE_PROCESS);
        createEReference(simpleProcessEClass, SIMPLE_PROCESS__DIALOGUE);
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
        automatedProcessEClass.getESuperTypes().add(this.getProcess());
        contentFormEClass.getESuperTypes().add(this.getForm());
        compoundDialogueEClass.getESuperTypes().add(this.getDialogue());
        collectionDialogueEClass.getESuperTypes().add(this.getCompoundDialogue());
        dataPropertyEClass.getESuperTypes().add(this.getModelElement());
        dialogueEClass.getESuperTypes().add(this.getUIModelElement());
        dialogueCallEClass.getESuperTypes().add(this.getUIModelElementCall());
        directDialogueCallEClass.getESuperTypes().add(this.getDialogueCall());
        dtoPropertyReferenceEClass.getESuperTypes().add(this.getModelElement());
        externalReferenceEClass.getESuperTypes().add(this.getModelElement());
        formEClass.getESuperTypes().add(this.getDialogue());
        formElementEClass.getESuperTypes().add(this.getModelElement());
        interactiveProcessEClass.getESuperTypes().add(this.getProcess());
        linkEClass.getESuperTypes().add(this.getModelElementWithContext());
        linkedDialogueCallEClass.getESuperTypes().add(this.getDialogueCall());
        linkedProcessCallEClass.getESuperTypes().add(this.getProcessCall());
        linkRefEClass.getESuperTypes().add(this.getModelElement());
        linkPathEClass.getESuperTypes().add(this.getLink());
        linkStepEClass.getESuperTypes().add(this.getLink());
        masterDetailEClass.getESuperTypes().add(this.getCompoundDialogue());
        modelElementWithContextEClass.getESuperTypes().add(this.getModelElement());
        processEClass.getESuperTypes().add(this.getUIModelElement());
        processCallEClass.getESuperTypes().add(this.getUIModelElementCall());
        uiModelElementEClass.getESuperTypes().add(this.getModelElementWithContext());
        uiModelElementCallEClass.getESuperTypes().add(this.getUICall());
        uiCallEClass.getESuperTypes().add(this.getModelElement());
        directProcessCallEClass.getESuperTypes().add(this.getProcessCall());
        simpleProcessEClass.getESuperTypes().add(this.getModelElement());

        // Initialize classes and features; add operations and parameters
        initEClass(associationRoleReferenceEClass, AssociationRoleReference.class, "AssociationRoleReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(automatedProcessEClass, AutomatedProcess.class, "AutomatedProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(contentFormEClass, ContentForm.class, "ContentForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContentForm_FormElements(), this.getFormElement(), this.getFormElement_Form(), "formElements", null, 0, -1, ContentForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getContentForm_IsCollection(), ecorePackage.getEBoolean(), "isCollection", null, 0, 1, ContentForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContentForm_Actions(), this.getSimpleProcess(), null, "actions", null, 0, -1, ContentForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(compoundDialogueEClass, CompoundDialogue.class, "CompoundDialogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCompoundDialogue_Dialogues(), this.getDialogueCall(), this.getDialogueCall_CompoundDialogue(), "dialogues", null, 0, -1, CompoundDialogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(collectionDialogueEClass, CollectionDialogue.class, "CollectionDialogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dataPropertyEClass, DataProperty.class, "DataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDataProperty_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, DataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataProperty_IsEnumeration(), ecorePackage.getEBoolean(), "isEnumeration", null, 0, 1, DataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataProperty_FormElement(), this.getFormElement(), this.getFormElement_DataProperty(), "formElement", null, 0, 1, DataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dialogueEClass, Dialogue.class, "Dialogue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDialogue_Readonly(), ecorePackage.getEBoolean(), "readonly", "false", 0, 1, Dialogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDialogue_Processes(), this.getProcessCall(), null, "processes", null, 0, -1, Dialogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dialogueCallEClass, DialogueCall.class, "DialogueCall", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDialogueCall_CompoundDialogue(), this.getCompoundDialogue(), this.getCompoundDialogue_Dialogues(), "compoundDialogue", null, 0, 1, DialogueCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(directDialogueCallEClass, DirectDialogueCall.class, "DirectDialogueCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dtoPropertyReferenceEClass, DtoPropertyReference.class, "DtoPropertyReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(externalReferenceEClass, ExternalReference.class, "ExternalReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getExternalReference_ModelName(), ecorePackage.getEString(), "modelName", null, 0, 1, ExternalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(formElementEClass, FormElement.class, "FormElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFormElement_References(), this.getDtoPropertyReference(), null, "references", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFormElement_Readonly(), ecorePackage.getEBoolean(), "readonly", "false", 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFormElement_Form(), this.getContentForm(), this.getContentForm_FormElements(), "form", null, 1, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFormElement_Label(), ecorePackage.getEString(), "label", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFormElement_DataProperty(), this.getDataProperty(), this.getDataProperty_FormElement(), "dataProperty", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interactiveProcessEClass, InteractiveProcess.class, "InteractiveProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(linkEClass, Link.class, "Link", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(linkEClass, this.getModelElement(), "getTarget", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(linkedDialogueCallEClass, LinkedDialogueCall.class, "LinkedDialogueCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLinkedDialogueCall_Link(), this.getLinkRef(), null, "link", null, 0, 1, LinkedDialogueCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(linkedProcessCallEClass, LinkedProcessCall.class, "LinkedProcessCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLinkedProcessCall_Link(), this.getLinkRef(), null, "link", null, 0, 1, LinkedProcessCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(linkRefEClass, LinkRef.class, "LinkRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(linkPathEClass, LinkPath.class, "LinkPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLinkPath_Steps(), this.getLinkRef(), null, "steps", null, 1, -1, LinkPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(linkStepEClass, LinkStep.class, "LinkStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLinkStep_Reference(), this.getAssociationRoleReference(), null, "reference", null, 0, 1, LinkStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(masterDetailEClass, MasterDetail.class, "MasterDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMasterDetail_Master(), this.getDialogueCall(), null, "master", null, 1, 1, MasterDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMasterDetail_Detail(), this.getDialogueCall(), null, "detail", null, 1, 1, MasterDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(modelElementWithContextEClass, ModelElementWithContext.class, "ModelElementWithContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getModelElementWithContext_ContextRef(), this.getExternalReference(), null, "contextRef", null, 0, 1, ModelElementWithContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getModelElementWithContext_PresentationModel(), this.getPresentationModel(), this.getPresentationModel_Elements(), "presentationModel", null, 0, 1, ModelElementWithContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(presentationModelEClass, PresentationModel.class, "PresentationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPresentationModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, PresentationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPresentationModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, PresentationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPresentationModel_Elements(), this.getModelElementWithContext(), this.getModelElementWithContext_PresentationModel(), "elements", null, 0, -1, PresentationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPresentationModel_ExternalReferences(), this.getExternalReference(), null, "externalReferences", null, 0, -1, PresentationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processEClass, org.mod4j.dsl.presentation.mm.PresentationDsl.Process.class, "Process", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProcess_ProcessElements(), this.getUICall(), this.getUICall_Process(), "processElements", null, 0, -1, org.mod4j.dsl.presentation.mm.PresentationDsl.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processCallEClass, ProcessCall.class, "ProcessCall", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(uiModelElementEClass, UIModelElement.class, "UIModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(uiModelElementCallEClass, UIModelElementCall.class, "UIModelElementCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getUIModelElementCall_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, UIModelElementCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(uiCallEClass, UICall.class, "UICall", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUICall_Process(), this.getProcess(), this.getProcess_ProcessElements(), "process", null, 0, 1, UICall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(directProcessCallEClass, DirectProcessCall.class, "DirectProcessCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(simpleProcessEClass, SimpleProcess.class, "SimpleProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSimpleProcess_Dialogue(), this.getDialogueCall(), null, "dialogue", null, 0, 1, SimpleProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //PresentationDslPackageImpl
