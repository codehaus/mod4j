package org.mod4j.dsl.presentation.xtext;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.mod4j.crossx.broker.CrossxBroker;
import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Dialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement;

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
     * Get a list of proposals for a DialogueCall for context 'ctx'
     * 
     * @param ctx
     *            The context within xText for which the proposals is created
     * @return
     */
    static public List<String> getDialogueCallProposals(EObject ctx) {
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
        			result.add(element.getName());
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
	        	if (dtoRef.getName().equals(CrossxBroker.getPropertyValue(symb, "context")))
	        	result.add(symb.getName());
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
