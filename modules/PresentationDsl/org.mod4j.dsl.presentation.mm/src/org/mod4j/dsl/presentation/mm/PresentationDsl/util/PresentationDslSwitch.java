/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkPath;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkRef;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkStep;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedDialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedProcessCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UICall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElementCall;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage
 * @generated
 */
public class PresentationDslSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static PresentationDslPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PresentationDslSwitch() {
        if (modelPackage == null) {
            modelPackage = PresentationDslPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case PresentationDslPackage.ASSOCIATION_ROLE_REFERENCE: {
                AssociationRoleReference associationRoleReference = (AssociationRoleReference)theEObject;
                T result = caseAssociationRoleReference(associationRoleReference);
                if (result == null) result = caseModelElement(associationRoleReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.AUTOMATED_PROCESS: {
                AutomatedProcess automatedProcess = (AutomatedProcess)theEObject;
                T result = caseAutomatedProcess(automatedProcess);
                if (result == null) result = caseProcess(automatedProcess);
                if (result == null) result = caseUIModelElement(automatedProcess);
                if (result == null) result = caseModelElementWithContext(automatedProcess);
                if (result == null) result = caseModelElement(automatedProcess);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.CONTENT_FORM: {
                ContentForm contentForm = (ContentForm)theEObject;
                T result = caseContentForm(contentForm);
                if (result == null) result = caseForm(contentForm);
                if (result == null) result = caseDialogue(contentForm);
                if (result == null) result = caseUIModelElement(contentForm);
                if (result == null) result = caseModelElementWithContext(contentForm);
                if (result == null) result = caseModelElement(contentForm);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.COMPOUND_DIALOGUE: {
                CompoundDialogue compoundDialogue = (CompoundDialogue)theEObject;
                T result = caseCompoundDialogue(compoundDialogue);
                if (result == null) result = caseDialogue(compoundDialogue);
                if (result == null) result = caseUIModelElement(compoundDialogue);
                if (result == null) result = caseModelElementWithContext(compoundDialogue);
                if (result == null) result = caseModelElement(compoundDialogue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.COLLECTION_DIALOGUE: {
                CollectionDialogue collectionDialogue = (CollectionDialogue)theEObject;
                T result = caseCollectionDialogue(collectionDialogue);
                if (result == null) result = caseCompoundDialogue(collectionDialogue);
                if (result == null) result = caseDialogue(collectionDialogue);
                if (result == null) result = caseUIModelElement(collectionDialogue);
                if (result == null) result = caseModelElementWithContext(collectionDialogue);
                if (result == null) result = caseModelElement(collectionDialogue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.DATA_PROPERTY: {
                DataProperty dataProperty = (DataProperty)theEObject;
                T result = caseDataProperty(dataProperty);
                if (result == null) result = caseModelElement(dataProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.DIALOGUE: {
                Dialogue dialogue = (Dialogue)theEObject;
                T result = caseDialogue(dialogue);
                if (result == null) result = caseUIModelElement(dialogue);
                if (result == null) result = caseModelElementWithContext(dialogue);
                if (result == null) result = caseModelElement(dialogue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.DIALOGUE_CALL: {
                DialogueCall dialogueCall = (DialogueCall)theEObject;
                T result = caseDialogueCall(dialogueCall);
                if (result == null) result = caseUIModelElementCall(dialogueCall);
                if (result == null) result = caseUICall(dialogueCall);
                if (result == null) result = caseModelElement(dialogueCall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.DIRECT_DIALOGUE_CALL: {
                DirectDialogueCall directDialogueCall = (DirectDialogueCall)theEObject;
                T result = caseDirectDialogueCall(directDialogueCall);
                if (result == null) result = caseDialogueCall(directDialogueCall);
                if (result == null) result = caseUIModelElementCall(directDialogueCall);
                if (result == null) result = caseUICall(directDialogueCall);
                if (result == null) result = caseModelElement(directDialogueCall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.DTO_PROPERTY_REFERENCE: {
                DtoPropertyReference dtoPropertyReference = (DtoPropertyReference)theEObject;
                T result = caseDtoPropertyReference(dtoPropertyReference);
                if (result == null) result = caseModelElement(dtoPropertyReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.EXTERNAL_REFERENCE: {
                ExternalReference externalReference = (ExternalReference)theEObject;
                T result = caseExternalReference(externalReference);
                if (result == null) result = caseModelElement(externalReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.FORM: {
                Form form = (Form)theEObject;
                T result = caseForm(form);
                if (result == null) result = caseDialogue(form);
                if (result == null) result = caseUIModelElement(form);
                if (result == null) result = caseModelElementWithContext(form);
                if (result == null) result = caseModelElement(form);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.FORM_ELEMENT: {
                FormElement formElement = (FormElement)theEObject;
                T result = caseFormElement(formElement);
                if (result == null) result = caseModelElement(formElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.INTERACTIVE_PROCESS: {
                InteractiveProcess interactiveProcess = (InteractiveProcess)theEObject;
                T result = caseInteractiveProcess(interactiveProcess);
                if (result == null) result = caseProcess(interactiveProcess);
                if (result == null) result = caseUIModelElement(interactiveProcess);
                if (result == null) result = caseModelElementWithContext(interactiveProcess);
                if (result == null) result = caseModelElement(interactiveProcess);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.LINK: {
                Link link = (Link)theEObject;
                T result = caseLink(link);
                if (result == null) result = caseModelElementWithContext(link);
                if (result == null) result = caseModelElement(link);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.LINKED_DIALOGUE_CALL: {
                LinkedDialogueCall linkedDialogueCall = (LinkedDialogueCall)theEObject;
                T result = caseLinkedDialogueCall(linkedDialogueCall);
                if (result == null) result = caseDialogueCall(linkedDialogueCall);
                if (result == null) result = caseUIModelElementCall(linkedDialogueCall);
                if (result == null) result = caseUICall(linkedDialogueCall);
                if (result == null) result = caseModelElement(linkedDialogueCall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.LINKED_PROCESS_CALL: {
                LinkedProcessCall linkedProcessCall = (LinkedProcessCall)theEObject;
                T result = caseLinkedProcessCall(linkedProcessCall);
                if (result == null) result = caseProcessCall(linkedProcessCall);
                if (result == null) result = caseUIModelElementCall(linkedProcessCall);
                if (result == null) result = caseUICall(linkedProcessCall);
                if (result == null) result = caseModelElement(linkedProcessCall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.LINK_REF: {
                LinkRef linkRef = (LinkRef)theEObject;
                T result = caseLinkRef(linkRef);
                if (result == null) result = caseModelElement(linkRef);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.LINK_PATH: {
                LinkPath linkPath = (LinkPath)theEObject;
                T result = caseLinkPath(linkPath);
                if (result == null) result = caseLink(linkPath);
                if (result == null) result = caseModelElementWithContext(linkPath);
                if (result == null) result = caseModelElement(linkPath);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.LINK_STEP: {
                LinkStep linkStep = (LinkStep)theEObject;
                T result = caseLinkStep(linkStep);
                if (result == null) result = caseLink(linkStep);
                if (result == null) result = caseModelElementWithContext(linkStep);
                if (result == null) result = caseModelElement(linkStep);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.MASTER_DETAIL: {
                MasterDetail masterDetail = (MasterDetail)theEObject;
                T result = caseMasterDetail(masterDetail);
                if (result == null) result = caseCompoundDialogue(masterDetail);
                if (result == null) result = caseDialogue(masterDetail);
                if (result == null) result = caseUIModelElement(masterDetail);
                if (result == null) result = caseModelElementWithContext(masterDetail);
                if (result == null) result = caseModelElement(masterDetail);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT: {
                ModelElementWithContext modelElementWithContext = (ModelElementWithContext)theEObject;
                T result = caseModelElementWithContext(modelElementWithContext);
                if (result == null) result = caseModelElement(modelElementWithContext);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.MODEL_ELEMENT: {
                ModelElement modelElement = (ModelElement)theEObject;
                T result = caseModelElement(modelElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.PRESENTATION_MODEL: {
                PresentationModel presentationModel = (PresentationModel)theEObject;
                T result = casePresentationModel(presentationModel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.PROCESS: {
                org.mod4j.dsl.presentation.mm.PresentationDsl.Process process = (org.mod4j.dsl.presentation.mm.PresentationDsl.Process)theEObject;
                T result = caseProcess(process);
                if (result == null) result = caseUIModelElement(process);
                if (result == null) result = caseModelElementWithContext(process);
                if (result == null) result = caseModelElement(process);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.PROCESS_CALL: {
                ProcessCall processCall = (ProcessCall)theEObject;
                T result = caseProcessCall(processCall);
                if (result == null) result = caseUIModelElementCall(processCall);
                if (result == null) result = caseUICall(processCall);
                if (result == null) result = caseModelElement(processCall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.UI_MODEL_ELEMENT: {
                UIModelElement uiModelElement = (UIModelElement)theEObject;
                T result = caseUIModelElement(uiModelElement);
                if (result == null) result = caseModelElementWithContext(uiModelElement);
                if (result == null) result = caseModelElement(uiModelElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.UI_MODEL_ELEMENT_CALL: {
                UIModelElementCall uiModelElementCall = (UIModelElementCall)theEObject;
                T result = caseUIModelElementCall(uiModelElementCall);
                if (result == null) result = caseUICall(uiModelElementCall);
                if (result == null) result = caseModelElement(uiModelElementCall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.UI_CALL: {
                UICall uiCall = (UICall)theEObject;
                T result = caseUICall(uiCall);
                if (result == null) result = caseModelElement(uiCall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.DIRECT_PROCESS_CALL: {
                DirectProcessCall directProcessCall = (DirectProcessCall)theEObject;
                T result = caseDirectProcessCall(directProcessCall);
                if (result == null) result = caseProcessCall(directProcessCall);
                if (result == null) result = caseUIModelElementCall(directProcessCall);
                if (result == null) result = caseUICall(directProcessCall);
                if (result == null) result = caseModelElement(directProcessCall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Association Role Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Association Role Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssociationRoleReference(AssociationRoleReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Automated Process</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Automated Process</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAutomatedProcess(AutomatedProcess object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Content Form</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Content Form</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContentForm(ContentForm object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Compound Dialogue</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Compound Dialogue</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompoundDialogue(CompoundDialogue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Collection Dialogue</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Collection Dialogue</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCollectionDialogue(CollectionDialogue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataProperty(DataProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dialogue</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dialogue</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDialogue(Dialogue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dialogue Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dialogue Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDialogueCall(DialogueCall object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Direct Dialogue Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Direct Dialogue Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDirectDialogueCall(DirectDialogueCall object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dto Property Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dto Property Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDtoPropertyReference(DtoPropertyReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>External Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>External Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExternalReference(ExternalReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Form</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseForm(Form object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Form Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Form Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFormElement(FormElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interactive Process</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interactive Process</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractiveProcess(InteractiveProcess object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Link</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLink(Link object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Linked Dialogue Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linked Dialogue Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinkedDialogueCall(LinkedDialogueCall object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Linked Process Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linked Process Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinkedProcessCall(LinkedProcessCall object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Link Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Link Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinkRef(LinkRef object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Link Path</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Link Path</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinkPath(LinkPath object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Link Step</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Link Step</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinkStep(LinkStep object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Master Detail</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Master Detail</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMasterDetail(MasterDetail object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model Element With Context</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Element With Context</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModelElementWithContext(ModelElementWithContext object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModelElement(ModelElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Presentation Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Presentation Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePresentationModel(PresentationModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Process</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcess(org.mod4j.dsl.presentation.mm.PresentationDsl.Process object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Process Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Process Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessCall(ProcessCall object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>UI Model Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>UI Model Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUIModelElement(UIModelElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>UI Model Element Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>UI Model Element Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUIModelElementCall(UIModelElementCall object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>UI Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>UI Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUICall(UICall object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Direct Process Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Direct Process Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDirectProcessCall(DirectProcessCall object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(EObject object) {
        return null;
    }

} //PresentationDslSwitch
