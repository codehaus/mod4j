package org.company.recordshop.service;

import static org.junit.Assert.fail;
import org.junit.Assert;

import org.company.recordshop.service.dto.OrderNumberAndDateDto;
import org.company.recordshop.service.dto.SimpleCustomerDto;
import org.company.recordshop.service.dto.OrderDto;
import org.mod4j.runtime.exception.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.ExpectedException;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

@ContextConfiguration(locations = { "/RecordShopDataLaagContext.xml",
		"/RecordShopDataLaagTestContext.xml",
		"/RecordShopBusinessLayerContextImplBase.xml",
		"/RecordShopServiceLayerTestContext.xml", "/Mod4jCommonContext.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class AssociationsServiceTest extends
		AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	CustomerServiceModelLocalService customerServiceModelService;

	@Autowired
	OrderServiceModelLocalService orderServiceModelService;

	SimpleCustomerDto createdCustomer = null;
	OrderDto createdOrder = null;

	public void setup() {
		SimpleCustomerDto customer = new SimpleCustomerDto();
		customer.setFirstName("Alfred");
		customer.setLastName("Sloan");
		customer.setCustomerNr(12345);
		createdCustomer = customerServiceModelService.createCustomer(customer);

		OrderDto order = new OrderDto();
		order.setOrderNumber("ISO 001");
		order.setDiscountPercentage(50);
		createdOrder = orderServiceModelService.createOrder(order);
	}

	public void tearDown() {
		createdCustomer = null;
		createdOrder = null;
	}

	@Test
	public final void testAddOrder() {
		setup();

		Long id = createdOrder.getId();
		customerServiceModelService.addToOrders(createdOrder, createdCustomer);

		OrderNumberAndDateDto o = orderServiceModelService
				.readOrderAsOrderNumberAndDateDto(createdOrder.getId());
		SimpleCustomerDto orderCustomer = o.getCustomer();
		Assert.assertEquals(o.getCustomer().getId(), createdCustomer.getId());
		Assert.assertTrue(o.getCustomer().getOrders().size() == 1);
		tearDown();
	}

	@Test
	public final void testRemoveOrder() {
		setup();

		customerServiceModelService.addToOrders(createdOrder, createdCustomer);
		OrderDto newOrder = orderServiceModelService.readOrderAsOrderDto(createdOrder.getId());
		customerServiceModelService.removeFromOrders(newOrder, createdCustomer);

		OrderNumberAndDateDto o2 = orderServiceModelService
				.readOrderAsOrderNumberAndDateDto(createdOrder.getId());
		SimpleCustomerDto orderCustomer2 = o2.getCustomer();
		System.err.println("orderCustomer2 [" + orderCustomer2 + "]");
		Assert.assertEquals(orderCustomer2, null);
	}

}
