
/**
 * Extension Point initial generated by Mod4j at: Wed Apr 08 12:46:14 CEST 2009
 */
package com.rosa.breakfast.domain.businessrules;

import org.springframework.validation.Errors;

import com.rosa.breakfast.domain.Part;

/**
 * 
 * 
 * This ExtensionPoint is intended to be manually changed by developers.
 * 
 */
public class PartCheckMinimumQuantity extends PartCheckMinimumQuantityImplBase {

	/**
	 *  {@inheritDoc} 
	 */
	public void validate(Object target, Errors errors) {
		Part part = (Part) target;
		if (part.getComestible() != null) {
			if (part.getQuantity() < part.getComestible().getMinimalQuantity()) {
				errors.rejectValue("quantity", "invalid.quantity", new Object[]{"10"}, "cannot be less than '{0}'");
			}
		}
	}

}