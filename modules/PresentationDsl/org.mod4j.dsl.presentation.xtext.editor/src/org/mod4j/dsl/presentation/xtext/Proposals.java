package org.mod4j.dsl.presentation.xtext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.mod4j.crossx.broker.CrossxBroker;
import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement;

public class Proposals {
	   /**
     * Get a list of proposals for a BusinessClassReference for context 'ctx'
     * 
     * @param ctx
     *            The conmtext within xText for which the proposals is created
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
