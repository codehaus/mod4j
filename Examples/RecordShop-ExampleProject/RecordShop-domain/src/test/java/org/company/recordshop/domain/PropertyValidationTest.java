package org.company.recordshop.domain;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.mod4j.runtime.exception.BusinessRuleException;

/**
 * @author Johan Vogelzang
 */
public class PropertyValidationTest {

    /**
     * Test method for {@link Customer#setNumberOfEars(int)}. According to the RecordShop business domain model, a
     * Person can have 0,1,2,3 or 4 ears (min 0 max 4). A BusinessRuleException must be thrown if we try set a value
     * beyond this range.
     */
    @Test
    public void testIntegerPropertyMaxValueValidation() {
        Customer customer = new Customer("Vincent", "Van Gogh", 1);
        try {
            customer.setNumberOfEars(4);
            customer.setNumberOfEars(5);
            fail("Expected BusinessRuleException, wrapped in a RuntimeException");
        } catch (BusinessRuleException e) {
            assertTrue( e.getMessage().contains("numberOfEars should be at most 4, but was 5"));
        }
    }

    /**
     * Test method for {@link Customer#setNumberOfEars(int)}. According to the RecordShop business domain model, a
     * Person can have 0,1,2,3 or 4 ears (min 0 max 4). A BusinessRuleException must be thrown if we try set a value
     * before this range.
     */
    @Test
    public void testIntegerPropertyMinValueValidation() {
        Customer customer = new Customer("Vincent", "Van Gogh", 1);
        try {
            customer.setNumberOfEars(0);
            customer.setNumberOfEars(-1);
            fail("Expected BusinessRuleException, wrapped in a RuntimeException");
        } catch (BusinessRuleException e) {
            assertTrue( e.getMessage().contains("numberOfEars should be at least 0, but was -1"));
        }
    }

    /**
     * Test method for {@link Customer#setUsername(String)}. According to the RecordShop business domain model, the
     * length of the username of a Customer must be between 3 or 10 characters. A BusinessRuleException must be thrown
     * if we try set a value beyond this range.
     */
    @Test
    public void testStringPropertyMaxLengthValueValidation() {
        Customer customer = new Customer("Herman", "Bread", 2);
        try {
            customer.setUsername("hermanbrea");
            customer.setUsername("hermanbread");
            fail("Expected BusinessRuleException, wrapped in a RuntimeException");
        } catch (BusinessRuleException e) {
            assertTrue( e.getMessage().contains("username should be at most 10 long, but was 11"));
        }
    }

    /**
     * Test method for {@link Customer#setUsername(String)}. According to the RecordShop business domain model, the
     * length of the username of a Customer must be between 3 or 10 characters. A BusinessRuleException must be thrown
     * if we try set a value before this range.
     */
    @Test
    public void testStringPropertyMinLengthValueValidation() {
        Customer customer = new Customer("Herman", "Bread", 2);
        try {
            customer.setUsername("her");
            customer.setUsername("he");
            fail("Expected BusinessRuleException, wrapped in a RuntimeException");
        } catch (BusinessRuleException e) {
            assertTrue( e.getMessage().contains("username should be at least 3 long, but was 2"));
        }
    }

    /**
     * Test method for {@link Customer#setEmailAddress(String)}. According to the RecordShop business domain model, the
     * email address of a Customer must apply to the given regular expression. A BusinessRuleException must be thrown
     * if the value of the email address does not match the regular expression.
     */
    @Test
    public void testStringPropertyRegExpValidation() {
        Customer customer = new Customer("Jhonny", "Mailer", 2);
        try {
            customer.setEmailAddress("jhonny.mailler@company.com");
            customer.setEmailAddress("jhonny@notavalidemailaddress");
            fail("Expected BusinessRuleException, wrapped in a RuntimeException");
        } catch (BusinessRuleException e) {
            assertTrue(e.getMessage().contains("emailAddress with value 'jhonny@notavalidemailaddress' does not match regular expression"));
        }
    }
    
    /**
     * Test method for {@link Record#setPrice(float)}. According to the RecordShop business domain model, the
     * length of the username of a Customer must be between 3 or 10 characters. A BusinessRuleException must be thrown
     * if we try set a value before this range.
     */
    //TODO @Test
    public void testDecimalPropertyMinValueValidation() {
        Record record = new Record("Saterdaynight", 24.95F);
        
        try {
            record.setPrice(0F);
            record.setPrice(-1F);
            fail("Expected BusinessRuleException, wrapped in a RuntimeException");
        } catch (BusinessRuleException e) {
            assertTrue( e.getMessage().contains("todo"));
        }
    } 
}
