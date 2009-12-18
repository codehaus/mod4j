/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkNavigation;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkPath;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkRef;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkService;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkStep;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedDialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedProcessCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.SimpleProcess;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UICall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElementCall;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage
 * @generated
 */
public class PresentationDslAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static PresentationDslPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PresentationDslAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = PresentationDslPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PresentationDslSwitch<Adapter> modelSwitch =
        new PresentationDslSwitch<Adapter>() {
            @Override
            public Adapter caseAssociationRoleReference(AssociationRoleReference object) {
                return createAssociationRoleReferenceAdapter();
            }
            @Override
            public Adapter caseAutomatedProcess(AutomatedProcess object) {
                return createAutomatedProcessAdapter();
            }
            @Override
            public Adapter caseContentForm(ContentForm object) {
                return createContentFormAdapter();
            }
            @Override
            public Adapter caseCompoundDialogue(CompoundDialogue object) {
                return createCompoundDialogueAdapter();
            }
            @Override
            public Adapter caseCollectionDialogue(CollectionDialogue object) {
                return createCollectionDialogueAdapter();
            }
            @Override
            public Adapter caseDataProperty(DataProperty object) {
                return createDataPropertyAdapter();
            }
            @Override
            public Adapter caseDialogue(Dialogue object) {
                return createDialogueAdapter();
            }
            @Override
            public Adapter caseDialogueCall(DialogueCall object) {
                return createDialogueCallAdapter();
            }
            @Override
            public Adapter caseDirectDialogueCall(DirectDialogueCall object) {
                return createDirectDialogueCallAdapter();
            }
            @Override
            public Adapter caseDtoPropertyReference(DtoPropertyReference object) {
                return createDtoPropertyReferenceAdapter();
            }
            @Override
            public Adapter caseExternalReference(ExternalReference object) {
                return createExternalReferenceAdapter();
            }
            @Override
            public Adapter caseForm(Form object) {
                return createFormAdapter();
            }
            @Override
            public Adapter caseFormElement(FormElement object) {
                return createFormElementAdapter();
            }
            @Override
            public Adapter caseInteractiveProcess(InteractiveProcess object) {
                return createInteractiveProcessAdapter();
            }
            @Override
            public Adapter caseLink(Link object) {
                return createLinkAdapter();
            }
            @Override
            public Adapter caseLinkedDialogueCall(LinkedDialogueCall object) {
                return createLinkedDialogueCallAdapter();
            }
            @Override
            public Adapter caseLinkedProcessCall(LinkedProcessCall object) {
                return createLinkedProcessCallAdapter();
            }
            @Override
            public Adapter caseLinkRef(LinkRef object) {
                return createLinkRefAdapter();
            }
            @Override
            public Adapter caseLinkPath(LinkPath object) {
                return createLinkPathAdapter();
            }
            @Override
            public Adapter caseLinkStep(LinkStep object) {
                return createLinkStepAdapter();
            }
            @Override
            public Adapter caseMasterDetail(MasterDetail object) {
                return createMasterDetailAdapter();
            }
            @Override
            public Adapter caseModelElementWithContext(ModelElementWithContext object) {
                return createModelElementWithContextAdapter();
            }
            @Override
            public Adapter caseModelElement(ModelElement object) {
                return createModelElementAdapter();
            }
            @Override
            public Adapter casePresentationModel(PresentationModel object) {
                return createPresentationModelAdapter();
            }
            @Override
            public Adapter caseProcess(org.mod4j.dsl.presentation.mm.PresentationDsl.Process object) {
                return createProcessAdapter();
            }
            @Override
            public Adapter caseProcessCall(ProcessCall object) {
                return createProcessCallAdapter();
            }
            @Override
            public Adapter caseUIModelElement(UIModelElement object) {
                return createUIModelElementAdapter();
            }
            @Override
            public Adapter caseUIModelElementCall(UIModelElementCall object) {
                return createUIModelElementCallAdapter();
            }
            @Override
            public Adapter caseUICall(UICall object) {
                return createUICallAdapter();
            }
            @Override
            public Adapter caseDirectProcessCall(DirectProcessCall object) {
                return createDirectProcessCallAdapter();
            }
            @Override
            public Adapter caseSimpleProcess(SimpleProcess object) {
                return createSimpleProcessAdapter();
            }
            @Override
            public Adapter caseLinkService(LinkService object) {
                return createLinkServiceAdapter();
            }
            @Override
            public Adapter caseLinkNavigation(LinkNavigation object) {
                return createLinkNavigationAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference <em>Association Role Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference
     * @generated
     */
    public Adapter createAssociationRoleReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.AutomatedProcess <em>Automated Process</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.AutomatedProcess
     * @generated
     */
    public Adapter createAutomatedProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm <em>Content Form</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm
     * @generated
     */
    public Adapter createContentFormAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.CompoundDialogue <em>Compound Dialogue</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.CompoundDialogue
     * @generated
     */
    public Adapter createCompoundDialogueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.CollectionDialogue <em>Collection Dialogue</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.CollectionDialogue
     * @generated
     */
    public Adapter createCollectionDialogueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty <em>Data Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty
     * @generated
     */
    public Adapter createDataPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Dialogue <em>Dialogue</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Dialogue
     * @generated
     */
    public Adapter createDialogueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall <em>Dialogue Call</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall
     * @generated
     */
    public Adapter createDialogueCallAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DirectDialogueCall <em>Direct Dialogue Call</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DirectDialogueCall
     * @generated
     */
    public Adapter createDirectDialogueCallAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference <em>Dto Property Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference
     * @generated
     */
    public Adapter createDtoPropertyReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference <em>External Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference
     * @generated
     */
    public Adapter createExternalReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Form <em>Form</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Form
     * @generated
     */
    public Adapter createFormAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement <em>Form Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement
     * @generated
     */
    public Adapter createFormElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.InteractiveProcess <em>Interactive Process</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.InteractiveProcess
     * @generated
     */
    public Adapter createInteractiveProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Link <em>Link</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Link
     * @generated
     */
    public Adapter createLinkAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedDialogueCall <em>Linked Dialogue Call</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedDialogueCall
     * @generated
     */
    public Adapter createLinkedDialogueCallAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedProcessCall <em>Linked Process Call</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedProcessCall
     * @generated
     */
    public Adapter createLinkedProcessCallAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.LinkRef <em>Link Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.LinkRef
     * @generated
     */
    public Adapter createLinkRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.LinkPath <em>Link Path</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.LinkPath
     * @generated
     */
    public Adapter createLinkPathAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.LinkStep <em>Link Step</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.LinkStep
     * @generated
     */
    public Adapter createLinkStepAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail <em>Master Detail</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail
     * @generated
     */
    public Adapter createMasterDetailAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext <em>Model Element With Context</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext
     * @generated
     */
    public Adapter createModelElementWithContextAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement <em>Model Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement
     * @generated
     */
    public Adapter createModelElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel <em>Presentation Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel
     * @generated
     */
    public Adapter createPresentationModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Process
     * @generated
     */
    public Adapter createProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall <em>Process Call</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall
     * @generated
     */
    public Adapter createProcessCallAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElement <em>UI Model Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElement
     * @generated
     */
    public Adapter createUIModelElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElementCall <em>UI Model Element Call</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElementCall
     * @generated
     */
    public Adapter createUIModelElementCallAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UICall <em>UI Call</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.UICall
     * @generated
     */
    public Adapter createUICallAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DirectProcessCall <em>Direct Process Call</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DirectProcessCall
     * @generated
     */
    public Adapter createDirectProcessCallAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.SimpleProcess <em>Simple Process</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.SimpleProcess
     * @generated
     */
    public Adapter createSimpleProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.LinkService <em>Link Service</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.LinkService
     * @generated
     */
    public Adapter createLinkServiceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.LinkNavigation <em>Link Navigation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.LinkNavigation
     * @generated
     */
    public Adapter createLinkNavigationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //PresentationDslAdapterFactory
