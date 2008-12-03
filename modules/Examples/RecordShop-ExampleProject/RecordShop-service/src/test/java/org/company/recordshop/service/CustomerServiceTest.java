package org.company.recordshop.service;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import org.company.recordshop.service.dto.FullCustomerDto;
import org.company.recordshop.service.dto.SimpleCustomerDto;
import org.junit.Assert;
import org.junit.Test;
import org.mod4j.runtime.exception.BusinessRuleException;
import org.mod4j.runtime.exception.TranslatorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.ExpectedException;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

@ContextConfiguration(locations = {"/RecordShopDataLaagContext.xml",
                                   "/RecordShopDataLaagTestContext.xml",
                                   "/RecordShopBusinessLayerContextImplBase.xml",
                                   "/RecordShopServiceLayerTestContext.xml",
                                   "/Mod4jCommonContext.xml"})
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=true)

public class CustomerServiceTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    CustomerServiceModelLocalService customerServiceModelService;
        
    @Test
    @Rollback(true)
    public final void testCreateCustomer() {
        
        SimpleCustomerDto customer = new SimpleCustomerDto();
        customer.setFirstName("Alfred");
        customer.setLastName("Sloan");
        customer.setCustomerNr(12345);
         
        customerServiceModelService.createCustomer(customer);
        SimpleCustomerDto createdCustomer = customerServiceModelService.createCustomer(customer);
        
        SimpleCustomerDto foundCustomer = customerServiceModelService.readCustomer(createdCustomer.getId());       
        Assert.assertNotNull(foundCustomer);
        Assert.assertEquals(foundCustomer.getId(), createdCustomer.getId() );
        Assert.assertTrue(foundCustomer.getCustomerNr() == 12345);
        Assert.assertEquals(foundCustomer.getFirstName(), "Alfred");
        Assert.assertEquals(foundCustomer.getLastName(), "Sloan");
        Assert.assertNull(foundCustomer.getSexe());
        Assert.assertTrue(foundCustomer.getOrders().isEmpty());
    }

    /**
     * Test whether the same object can be created twice.
     * Should result in an TranslatorException.
     */
    @Test
    @Rollback(true)
    @ExpectedException(TranslatorException.class)
    public final void testCreateCustomerTwice() {
        
        SimpleCustomerDto customer = new SimpleCustomerDto();
        customer.setFirstName("Alfred");
        customer.setLastName("Sloan");
        customer.setCustomerNr(12345);
         
        customerServiceModelService.createCustomer(customer);
        SimpleCustomerDto createdCustomer = customerServiceModelService.createCustomer(customer);
        
        SimpleCustomerDto foundCustomer = customerServiceModelService.readCustomer(createdCustomer.getId());       
        Assert.assertNotNull(foundCustomer);
        Assert.assertEquals(foundCustomer.getId(), createdCustomer.getId() );

        SimpleCustomerDto createdCustomerTwice = customerServiceModelService.createCustomer(foundCustomer);
    }

    /**
     * Test whether an object can be created while one of his properties violates a constraint.
     * Should result in a BusinessRuleException.
     */
    @Test
    @ExpectedException(BusinessRuleException.class)
    public final void testBusinessRuleException() {
        
        SimpleCustomerDto customer = new SimpleCustomerDto();
        customer.setFirstName("Alfred");
        customer.setLastName("Sloan");
        customer.setCustomerNr(-1); //violates min = 0 constraint 
        
        customerServiceModelService.createCustomer(customer);
        
    }

    /**
     * Test whether an object can be created from a null DTO.
     * Should result in a TranslatorException.
     */
    @Test
    @ExpectedException(TranslatorException.class)
    public final void testTranslatorException() {
        
        customerServiceModelService.createCustomer((SimpleCustomerDto)null);
        fail();
    }

    @Test
    public final void testUpdateCustomerSucceed() {
        
        FullCustomerDto custDto = new FullCustomerDto();
        custDto.setFirstName("Johan");
        custDto.setLastName("Vogelzang");
        custDto.setCustomerNr(54321);
        custDto.setDiscountPercentage(0);

        FullCustomerDto result = customerServiceModelService.createCustomer(custDto);
        result.setDiscountPercentage(100); // Wondering who wrote this test ;)
        customerServiceModelService.updateCustomer(result);
        result = customerServiceModelService.readCustomerAsFullCustomerDto(result.getId());
        assertTrue("DiscountPercentage should be 100", result.getDiscountPercentage() == 100); 
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
