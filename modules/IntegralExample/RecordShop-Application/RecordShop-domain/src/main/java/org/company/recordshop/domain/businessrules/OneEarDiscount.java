/**
 * Extension Point initial generated by Mod4j at: Fri Jun 13 17:35:02 CEST 2008
 */

package org.company.recordshop.domain.businessrules;

import org.company.recordshop.domain.Customer;
import org.springframework.validation.Errors;

/**
 * If Customer has one ear, he/she get a discount of 50 percent.
 * 
 * This ExtensionPoint is intended to be manually changed by developers.
 * 
 */
public class OneEarDiscount extends OneEarDiscountImplBase {

    /**
     * {@inheritDoc}
     */
    public void validate(Object target, Errors errors) {

        Customer cust = (Customer) target;
        if (cust.getNumberOfEars() == 1 && cust.getDiscountPercentage() != 50) {
            errors.rejectValue("discountPercentage", "businessrule.OneEarDiscount.not.valid", new Integer[] { new Integer(50), new Integer(cust.getDiscountPercentage()) },
                    "discountPercentage" + " for Customers with one ear should be " + 50 + ", but was " + cust.getDiscountPercentage());
        }

    }

}
