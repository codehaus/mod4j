package org.mod4j.dsl.datacontract.xtext;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.mod4j.crossx.broker.CrossxCheck;
import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.EnumerationDto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.ExternalReference;

public class Proposals {

    /**
     * Get a list of proposals for a BusinessClassReference for context 'ctx'
     * 
     * @param ctx
     *            The conmtext within xText for which the proposals is created
     * @return
     */
    static public List<String> getBusinessClassReferenceProposals(EObject ctx) {
        List<String> result = new ArrayList<String>();
        BusinessClassDto dto = null;
        if (ctx == null) {
            return result;
        }
        // The context may be of different types
        if (ctx instanceof BusinessClassPropertyReference) {
            dto = ((BusinessClassPropertyReference) ctx).getDto();
        }
        if ((ctx instanceof BusinessClassDto)) {
            dto = (BusinessClassDto) ctx;
        }
        if (dto == null) {
            result.add("no dto found");
            return result;
        }

        ExternalReference base = dto.getBase();

        if (base == null) {
            result.add("base is null");
            return result;
        }

        Symbol sym = CrossxCheck.lookupSymbol(base.getModelname(), base.getName(), "BusinessClass");
        for (Symbol sub : CrossxCheck.findAllSubSymbols(sym, "Property")) {
            if (!containsPropertyNamed(dto.getPropertyReferences(), sub.getName())) {
                result.add(sub.getName());
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
    static private boolean containsPropertyNamed(List<BusinessClassPropertyReference> properties, String name) {
        for (BusinessClassPropertyReference propertyRef : properties) {
            if (propertyRef.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    /** Get a list of proposals for the base property of a BusinessClassDto
     * 
     * @param ctx The context for the proposals
     * @return The list of names that are proposed
     */
    static public List<String> getBusinessClassBaseProposals(EObject ctx) {
        List<String> result = new ArrayList<String>();
        BusinessClassDto dto = null;
        if (ctx == null) {
            return result;
        }
        if ((ctx instanceof BusinessClassDto)) {
            dto = (BusinessClassDto) ctx;
        }
        if (dto == null) {
            result.add("no dto found");
            return result;
        }

        List<ExternalReference> refs = dto.getDatacontractModel().getExternalReferences();
        for (ExternalReference ext : refs) {
            Symbol sym = CrossxCheck.lookupSymbol(ext.getModelname(), ext.getName(), "BusinessClass");
            if (sym != null) {
                result.add(ext.getName());
            }
        }
        return result;
    }

    /** Get a list of Proposals for the base property for an EnumerationDto
     * 
     * @param ctx The context for the proposals
     * @return The list of names that are proposed
     */
    static public List<String> getEnumerationBaseProposals(EObject ctx) {
        List<String> result = new ArrayList<String>();
        EnumerationDto enumeration = null;
        if (ctx == null) {
            return result;
        }
        if ((ctx instanceof EnumerationDto)) {
            enumeration = (EnumerationDto) ctx;
        }
        if (enumeration == null) {
            result.add("no dto found");
            return result;
        }

        List<ExternalReference> refs = enumeration.getDatacontractModel().getExternalReferences();
        for (ExternalReference ext : refs) {
            Symbol sym = CrossxCheck.lookupSymbol(ext.getModelname(), ext.getName(), "Enumeration");
            if (sym != null) {
                result.add(ext.getName());
            }
        }
        return result;
    }
}
