package org.mod4j.dsl.datacontract.xtext;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.mod4j.crossx.broker.CrossxCheck;
import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassReference;

public class Proposals {

    
        static public List<String> getProposal( EObject ctx) {
            List<String> result = new ArrayList<String>();
            BusinessClassDto dto = null;
            if( ctx == null ) { return result;}
            if( ctx instanceof BusinessClassPropertyReference ) {
                dto = ((BusinessClassPropertyReference)ctx).getDto();
            }
            if( (ctx instanceof BusinessClassDto)  ) {
                dto = (BusinessClassDto)ctx;
            }
            if( dto == null ) { result.add("no dto found"); return result; }
            
            BusinessClassReference base = dto.getBase();

            if( base == null ) {
                result.add("bas is null"); return result;
            }
            
            Symbol sym = CrossxCheck.lookupSymbol(base.getModelname(), base.getName(), "BusinessClass");
            for( Symbol sub : CrossxCheck.findAllSubSymbols(sym, "Property")) {
                result.add(sub.getName() );
            }
            return result;
        }
}
