package org.company.recordshop.service;

import static org.junit.Assert.fail;
import org.junit.Assert;

import org.company.recordshop.service.dto.SimpleCustomerDto;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

@ContextConfiguration(locations = {"/RecordShopDataLaagContext.xml",
                                   "/RecordShopDataLaagTestContext.xml",
                                   "/RecordShopBusinessLayerContextImplBase.xml",
                                   "/RecordShopServiceLayerTestContext.xml",
                                   "/Mod4jCommonContext.xml"})
// TODO Replace RecordShopServiceLayerTestContext.xml for RecordShopServiceLayerImplBaseContext.xml
// We need to test with the original Spring configuration. 
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=true)

public class CustomerServiceTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    CustomerServiceModelLocalService CustomerServiceModelService;
        
    @Test
    public final void testCreateCustomer() {
        
        SimpleCustomerDto customer = new SimpleCustomerDto();
        customer.setFirstName("Alfred");
        customer.setLastName("Sloan");
        customer.setCustomerNr(12345);
        
        SimpleCustomerDto createdCustomer = CustomerServiceModelService.createCustomer(customer);
        
        SimpleCustomerDto foundCustomer = CustomerServiceModelService.readCustomer(createdCustomer.getId());       
        Assert.assertNotNull(foundCustomer);
        Assert.assertEquals(foundCustomer.getId(), createdCustomer.getId() );
        Assert.assertTrue(foundCustomer.getCustomerNr() == 12345);
        Assert.assertEquals(foundCustomer.getFirstName(), "Alfred");
        Assert.assertEquals(foundCustomer.getLastName(), "Sloan");
        Assert.assertNull(foundCustomer.getSexe());
        Assert.assertTrue(foundCustomer.getOrders().isEmpty());
    }
    @Test

    public final void testCreateIllegalCustomer() {
        
        SimpleCustomerDto customer = new SimpleCustomerDto();
       
        SimpleCustomerDto createdCustomer = CustomerServiceModelService.createCustomer(customer);
        Assert.fail();
    }

    //@Test
    public final void testUpdateCustomer() {
        fail("Not yet implemented"); // TODO
    }

    //@Test
    public final void testDeleteCustomer() {
        fail("Not yet implemented"); // TODO
    }

    //@Test
    public final void testReadCustomer() {
        fail("Not yet implemented"); // TODO
    }

}
