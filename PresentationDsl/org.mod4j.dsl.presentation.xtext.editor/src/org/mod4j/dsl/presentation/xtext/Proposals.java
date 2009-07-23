package org.mod4j.dsl.presentation.xtext;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.mod4j.crossx.broker.CrossxBroker;
import org.mod4j.crossx.mm.crossx.ReferenceSymbolProperty;
import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Dialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Link;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkStep;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedDialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElementCall;

public class Proposals {
	
	   /**
     * Get a list of proposals for a FormElementReference for context 'ctx'
     * 
     * @param ctx
     *            The context within xText for which the proposals is created
     * @return
     */
    static public List<String> getFormElementReferenceProposals(EObject ctx) {
        List<String> result = new ArrayList<String>();
        ExternalReference dtoRef = null;
        if (ctx == null) {
            return result;
        }
        // The context may be of different types
        if (ctx instanceof FormElement) {
            dtoRef = ((FormElement) ctx).getForm().getContextRef();
        }
        if (dtoRef == null) {
            result.add("<<no context found>>");
            return result;
        }

        Symbol sym = CrossxBroker.lookupSymbol(dtoRef.getModelName(), dtoRef.getName(), "Dto");
        for (Symbol sub : CrossxBroker.findAllSubSymbols(sym, "Property")) {
        	result.add(sub.getName());
        }
        return result;
    }

	   /**
     * Get a list of proposals for a FormElementReference for context 'ctx'
     * 
     * @param ctx
     *            The context within xText for which the proposals is created
     * @return
     */
    static public List<String> getLinkStepReferencesProposals(EObject ctx) {
        List<String> result = new ArrayList<String>();
        ExternalReference dtoRef = null;
        if (ctx == null) {
            return result;
        }
        if (ctx instanceof Link) {
            dtoRef = ((Link) ctx).getContextRef();
        }
        if (dtoRef == null) {
            result.add("<<no context found>>");
            return result;
        }

        Symbol sym = CrossxBroker.lookupSymbol(dtoRef.getModelName(), dtoRef.getName(), "Dto");
        for (Symbol sub : CrossxBroker.findAllSubSymbols(sym, "AssociationRoleReference")) {
        	result.add(sub.getName());
        }
        return result;
    }
    
	   /**
     * Get a list of proposals for a LinkReference for context 'ctx'
     * 
     * @param ctx
     *            The context within xText for which the proposals is created
     * @return
     */
    static public List<String> getLinkReferenceProposals(EObject ctx) {
        List<String> result = new ArrayList<String>();
        ExternalReference dtoRef = null;
        if (ctx == null) {
            return result;
        }
        List<String> models = new ArrayList<String>();
        // The context may be of different types
        if (ctx instanceof UIModelElementCall) {
            ctx = ctx.eContainer();
        }
        if (ctx instanceof UIModelElement) {
        	UIModelElement uime = (UIModelElement)ctx;
        	for (ModelElement element : uime.getPresentationModel().getElements()) {
        		if (element instanceof Link && uime.getContextRef().getName().equals(((Link)element).getContextRef().getName())) {
        			result.add(element.getName());
        		}
        	}
            dtoRef = uime.getContextRef();
            List<ExternalReference> refs = uime.getPresentationModel().getExternalReferences();
            for (ExternalReference ref : refs) {
            	models.add(ref.getModelName());
            }
        }
        if (dtoRef == null) {
            result.add("<<no context found>>");
            return result;
        }
        for (String model : models) {
	        List<Symbol> symbols = CrossxBroker.findAllFromModel(model, "Link");
	        for (Symbol symb : symbols) {
	        	if (dtoRef.getName().equals(CrossxBroker.getPropertyValue(symb, "context"))) {
       				result.add(symb.getName());
	        	}
	        }
        }
        return result;
    }
    
	   /**
     * Get a list of proposals for a DialogueCall for context 'ctx'
     * 
     * @param ctx
     *            The context within xText for which the proposals is created
     * @return
     */
    static public List<String> getDialogueCallProposals(EObject ctx, List<String> subTypes) {
        List<String> result = new ArrayList<String>();
        ExternalReference dtoRef = null;
        if (ctx == null) {
            return result;
        }
        List<String> models = new ArrayList<String>();
        // The context may be of different types
        if (ctx instanceof DialogueCall) {
        	ctx = ctx.eContainer();
        }
        if (ctx instanceof Dialogue) {
        	Dialogue d = (Dialogue) ctx;
        	for (ModelElement element : d.getPresentationModel().getElements()) {
        		if (element instanceof Dialogue && d.getContextRef().getName().equals(((Dialogue)element).getContextRef().getName())) {
        			if (subTypes.isEmpty() || subTypes.contains(element.eClass().getName())) {
        				result.add(element.getName());
        			}
        		}
        	}
            dtoRef = d.getContextRef();
            List<ExternalReference> refs = d.getPresentationModel().getExternalReferences();
            for (ExternalReference ref : refs) {
            	models.add(ref.getModelName());
            }
        }
        if (dtoRef == null) {
            result.add("<<no context found>>");
            return result;
        }
        for (String model : models) {
	        List<Symbol> symbols = CrossxBroker.findAllFromModel(model, "Dialogue");
	        for (Symbol symb : symbols) {
	        	if (dtoRef.getName().equals(CrossxBroker.getPropertyValue(symb, "context")) && (subTypes.isEmpty() || subTypes.contains(CrossxBroker.getPropertyValue(symb, "dialogueType")))) {
       				result.add(symb.getName());
	        	}
	        }
        }
        return result;
    }

	   /**
     * Get a list of proposals for a LinkedDialogueCall for context 'ctx'
     * 
     * @param ctx
     *            The context within xText for which the proposals is created
     * @return
     */
    static public List<String> getLinkedDialogueCallProposals(EObject ctx, List<String> subTypes) {
        List<String> result = new ArrayList<String>();
        ExternalReference dtoRef = null;
        String referencedDtoName = null; 
        if (ctx == null) {
            return result;
        }
        List<String> models = new ArrayList<String>();
        // The context may be of different types
        if (ctx instanceof LinkedDialogueCall) {
        	LinkedDialogueCall ldc = (LinkedDialogueCall) ctx;
        	// Find the AssociationRoleReference
        	        	// Start at the containing Dialogue and get the context Dto
        	UIModelElement uime = (UIModelElement)ldc.eContainer();
        	PresentationModel currentModel = uime.getPresentationModel();
        	dtoRef = uime.getContextRef();
        	Symbol dtoSymbol = CrossxBroker.lookupSymbol(dtoRef.getModelName(), dtoRef.getName(), "Dto");
        	// Then get the Link
        	for (ModelElement element : currentModel.getElements()) {
        		if (element instanceof LinkStep && element.getName().equals(ldc.getLink().getName())) {
                	// Then find the AssociationRoleReference
                	Symbol referenceSymbol = CrossxBroker.getSubSymbol(dtoSymbol, ((LinkStep)element).getReference().getName());
                	
                	// Get the ReferencedDto name
                	ReferenceSymbolProperty rsp = CrossxBroker.getReferenceProperty(referenceSymbol, "ReferencedDto");
                	referencedDtoName = rsp.getSymbolname();
                	Symbol referencedDto = CrossxBroker.lookupSymbol(rsp.getModelname(), referencedDtoName, "Dto");
                	boolean many = "ListDto".equals(rsp.getType());
                	if (many) {
                		referencedDtoName = CrossxBroker.getPropertyValue(referencedDto, "baseDto");
                		// If it is a list and there is not already a subtype selection add CollectionDialogue and MasterDetailDialogue
                		if (subTypes.isEmpty()) {
                			subTypes.add("CollectionDialogue");
                			subTypes.add("MasterDetailDialogue");
                		}
                	}
        		}
        	}
        	if (referencedDtoName != null) {
	        	// Look for Dialogues with this context
	        	for (ModelElement element : currentModel.getElements()) {
	        		if (element instanceof Dialogue && referencedDtoName.equals(((Dialogue)element).getContextRef().getName())) {
	        			if (subTypes.isEmpty() || subTypes.contains(element.eClass().getName())) {
	        				result.add(element.getName());
	        			}
	        		}
	        	}
	            List<ExternalReference> refs = uime.getPresentationModel().getExternalReferences();
	            for (ExternalReference ref : refs) {
	            	models.add(ref.getModelName());
	            }
        	}
        }
        if (dtoRef == null || referencedDtoName == null) {
            result.add("<<no context found>>");
            return result;
        }
        for (String model : models) {
	        List<Symbol> symbols = CrossxBroker.findAllFromModel(model, "Dialogue");
	        for (Symbol symb : symbols) {
	        	if (referencedDtoName.equals(CrossxBroker.getPropertyValue(symb, "context")) && (subTypes.isEmpty() || subTypes.contains(CrossxBroker.getPropertyValue(symb, "dialogueType")))) {
       				result.add(symb.getName());
	        	}
	        }
        }
        return result;
    }
    
    /**
     * Checks whether the list 'properties' contains an element with name 'name'
     * @param properties
     * @param name
     * @return
     */
    static private boolean containsPropertyNamed(List<DtoPropertyReference> properties, String name) {
        for (DtoPropertyReference propertyRef : properties) {
            if (propertyRef.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
}