package org.company.recordshop.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.company.recordshop.data.CustomerDao;
import org.company.recordshop.domain.Customer;
import org.company.recordshop.service.dto.SimpleCustomerDto;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jdbc.SimpleJdbcTestUtils;

/**
 * @author Johan Vogelzang
 */
public class PagingSupportCustomerServciceTest extends AbstractServiceTestCase {

    @Autowired
    private CustomerDao customerDao;
    
    @Autowired
    private CustomerServiceModelLocalService customerServiceModelService;

    private final byte NUMBER_OF_ITEMS = 15;

    protected DateTime date() {
        return new DateTime(2008, 11, 6, 0, 0, 0, 0);
    }

    /**
     * Data initialization
     */
    @Before
    public void setUp() {

        for (int i = 1; i <= NUMBER_OF_ITEMS; i++) {
            Customer customer = new Customer("Customer-" + i, "FirstName", date(), i);
            customerDao.add(customer);
        }
        flush();
        clear();
    }

    /**
     * Test method for {@link CustomerDao#count()}.
     */
    @Test
    public void testCountCustomers() {

        assertEquals(NUMBER_OF_ITEMS, customerServiceModelService.countCustomers());
    }

    /**
     * Test method for {@link CustomerDao#listCustomers(firstResult, maxResults)}.
     */
    @Test
    public void testListCustomersInRange() {

        List<SimpleCustomerDto> custList = customerServiceModelService.listCustomers(5, 15);      
        assertEquals(10, custList.size());
    }
}
