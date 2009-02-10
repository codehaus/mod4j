/**
 * 
 */
package org.company.recordshop.business;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.company.recordshop.domain.Customer;
import org.company.recordshop.domain.CustomerExample;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.access.BeanFactoryLocator;
import org.springframework.beans.factory.access.BeanFactoryReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.access.ContextSingletonBeanFactoryLocator;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.mock.jndi.SimpleNamingContextBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * @author emalotau
 * 
 */
@ContextConfiguration(locations = { "/Mod4jCommonContext.xml",
        "/org/company/recordshop/data/applicationContextBase.xml",
        "/org/company/recordshop/data/applicationContext.xml",
        "/org/company/recordshop/business/testDataSourceContext.xml",
        "/org/company/recordshop/business/applicationContextBase.xml",
        "/org/company/recordshop/business/applicationContext.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class CustomerServiceModelDomainServiceImplTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private CustomerServiceModelDomainService service;

    @Autowired
    protected SessionFactory sessionFactory;

    /**
     * Test method for
     * {@link org.company.recordshop.business.CustomerServiceModelDomainServiceImpl#findCustomersByExample(org.company.recordshop.domain.CustomerExample)}
     * .
     */
    @Test
    public void testFindCustomersByExample() {
        service.createCustomer(new Customer("Johan", "Vogelzang", 1));
        service.createCustomer(new Customer("Jos", "Warmer", 2));
        service.createCustomer(new Customer("Eric Jan", "Malotaux", 3));
        sessionFactory.getCurrentSession().flush();
        sessionFactory.getCurrentSession().clear();
        assertEquals(3, countRowsInTable("Customer_TABLE"));

        CustomerExample example = new CustomerExample();
        List<Customer> result = service.findCustomerByExample(example);
        assertEquals(3, result.size());
        
        example.setBlackListed(false);
        result = service.findCustomerByExample(example);
        assertEquals(3, result.size());
        
        example.setBlackListed(true);
        result = service.findCustomerByExample(example);
        assertEquals(0, result.size());
        
        example.setBlackListed(null);
        example.setFirstName("Jo");
        result = service.findCustomerByExample(example);
        assertEquals(2, result.size());
    }

    class MyBeanFactoryLocator extends ContextSingletonBeanFactoryLocator {
        protected MyBeanFactoryLocator(String resourceLocation) {
            super(resourceLocation);
        }
    }
}
