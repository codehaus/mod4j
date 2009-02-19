/*******************************************************************************
 * Copyright (c) 2009 Ordina and committers to Mod4j
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ordina - initial implementation
 *******************************************************************************/
package org.mod4j.dsl.service.xtext;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.mod4j.crossx.broker.CrossxBroker;
import org.mod4j.crossx.mm.crossx.ReferenceSymbolProperty;
import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.dsl.service.mm.ServiceDsl.AssociationMethod;
import org.mod4j.dsl.service.mm.ServiceDsl.DtoReference;

public class ServiceProposals {

    /**
     * Get a list of proposals for a BusinessClassReference for context 'ctx'
     * 
     * @param ctx
     *            The conmtext within xText for which the proposals is created
     * @return
     */
    static public List<String> getRolenameProposals(EObject ctx) {
        List<String> result = new ArrayList<String>();
        DtoReference dto = null;
        AssociationMethod method = null;
        
        if (ctx == null) {
            return result;
        }
        // The context may be of different types
        if (ctx instanceof DtoReference) {
            dto = ((DtoReference) ctx);
        }
        if (ctx instanceof AssociationMethod) {
            method = ((AssociationMethod) ctx);
            dto = method.getMain();
        }
        if (dto == null) {
            result.add("No code completion possible because of earlier errors");
            return result;
        }
        
        Symbol dtoSymbol = CrossxBroker.lookupSymbol(dto.getModelname(), dto.getName(), "Dto");
        
        if (dtoSymbol == null ) {
            result.add("dto reference not found");
            return result;
        }

        String dtoType = CrossxBroker.getPropertyValue(dtoSymbol, "dtoType");
        if (! dtoType.equals("BusinessClassDto") ) {
            result.add("ERROR: [" + dtoSymbol.getName() + "] is not a business class dto");
            return result;
        }
        
        ReferenceSymbolProperty busclassProperty = CrossxBroker.getReferenceProperty(dtoSymbol, "BaseClass");
        Symbol busclassSymbol = CrossxBroker.lookupReference(busclassProperty);
        
        for (Symbol sub : CrossxBroker.findAllSubSymbols(busclassSymbol, "Association")) {
            result.add(sub.getName());
        }
        return result;
    }

    static public List<String> getPartProposals(EObject ctx) {
        List<String> result = new ArrayList<String>();
        DtoReference dto = null;
        AssociationMethod method = null;
        if (ctx == null) {
            result.add("No code completion on null context");
            return result;
        }
        if (ctx instanceof AssociationMethod) {
            method = ((AssociationMethod) ctx);
            dto = method.getMain();
        }
        if (dto == null) {
            result.add("No code completion possible because of earlier errors");
             return result;
        }
        
        Symbol dtoSymbol = CrossxBroker.lookupSymbol(dto.getModelname(), dto.getName(), "Dto");
        
        if (dtoSymbol == null ) {
            result.add("dto reference not found");
            return result;
        }

        String dtoType = CrossxBroker.getPropertyValue(dtoSymbol, "dtoType");
        if (! dtoType.equals("BusinessClassDto") ) {
            result.add("ERROR: [" + dtoSymbol.getName() + "] is not a business class dto");
            return result;
        }
        
        ReferenceSymbolProperty busclassProperty = CrossxBroker.getReferenceProperty(dtoSymbol, "BaseClass");
        Symbol busclassSymbol = CrossxBroker.lookupReference(busclassProperty);
        
        Symbol associationSymbol = CrossxBroker.getSubSymbol(busclassSymbol, method.getRolename());
        String requiredBusinessClass = CrossxBroker.getPropertyValue(associationSymbol, "BusinessClass");
        
        List<DtoReference> availableDtos = method.getModel().getDtoReferences();
        
        for (DtoReference ref: availableDtos ) {
            Symbol refSymbol = CrossxBroker.lookupSymbol(ref.getModelname(), ref.getName(), "Dto");
            String refDtoType = CrossxBroker.getPropertyValue(refSymbol, "dtoType");
            if ( refDtoType .equals("BusinessClassDto") ) {
                busclassProperty = CrossxBroker.getReferenceProperty(refSymbol, "BaseClass");
                if( busclassProperty.getSymbolname().equals(requiredBusinessClass)){
                    result.add(ref.getName());
                }
            }
        }
        return result;
    }


}
