package org.company.recordshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Comparator;

import org.company.recordshop.data.spring.dao.CustomerDao;
import org.company.recordshop.domain.Customer;
import org.junit.Test;
import org.junit.runner.notification.Failure;
import org.mod4j.common.exception.BusinessRuleException;

/**
 * @author Johan Vogelzang
 */
public class PropertyValidationTest extends AbstractDaoTestCase {
    
    /**
     * Test method for {@link Customer#setNumberOfEars(int)}.
     * According to the RecordShop business domain model, a Person can have 0,1,2,3 or 4 ears.
     * A BusinessRuleException must be thrown if we try set a value beyond this range.  
     */
    @Test
    public void testCustomerNumberOfEarsProperty() {
        Customer customer = new Customer("Vincent", "Van Gogh", 1);
        
        try {
            customer.setNumberOfEars(1);
            customer.setNumberOfEars(5);
            fail();
        } catch (BusinessRuleException e) {
            assertEquals(true , e.getMessage().contains("numberOfEars should be at most 4, but was 5"));
        }
    }


}
