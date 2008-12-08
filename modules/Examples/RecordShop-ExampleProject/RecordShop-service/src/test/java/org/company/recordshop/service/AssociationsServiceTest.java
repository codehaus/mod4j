package org.company.recordshop.service;

import static org.junit.Assert.fail;

import java.util.Set;

import org.junit.Assert;

import org.apache.derby.iapi.types.Orderable;
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
	public final void testAddOrderFailure() {
		setup();

		Long id = createdOrder.getId();
		try {
			customerServiceModelService.addToOrders(null, createdCustomer);
			Assert.fail("Expecting Service Exception: Adding null order to customer");
		} catch( ServiceException e) {
			System.err.println("Expected exception: "+ e.getMessage());
		}

		try {
			customerServiceModelService.addToOrders(createdOrder, null);
			Assert.fail("Expecting Service Exception: Adding order to null customer");
		} catch( ServiceException e) {
			System.err.println("Expected exception: "+ e.getMessage());
		}
		
		try {
			createdOrder.setId(-1L);
			customerServiceModelService.addToOrders(createdOrder, createdCustomer);
			Assert.fail("Expecting Service Exception: Adding order with incorrect id to customer");
		} catch( ServiceException e) {
			System.err.println("Expected exception: "+ e.getMessage());
		}
		
		try {
			createdOrder.setId(id);
			createdCustomer.setId(-1L);
			customerServiceModelService.addToOrders(createdOrder, createdCustomer);
			Assert.fail("Expecting Service Exception: Adding order to customer with incorrect id");
		} catch( ServiceException e) {
			System.err.println("Expected exception: "+ e.getMessage());
		}
		tearDown();
	}
	
	@Test
	public final void testAddCustomer() {
		setup();

		Long id = createdOrder.getId();
		customerServiceModelService.setCustomer(createdCustomer, createdOrder);

		OrderNumberAndDateDto o = orderServiceModelService
				.readOrderAsOrderNumberAndDateDto(createdOrder.getId());
		SimpleCustomerDto orderCustomer = o.getCustomer();
		Assert.assertEquals(o.getCustomer().getId(), createdCustomer.getId());
		
		Set<OrderNumberAndDateDto> orders = o.getCustomer().getOrders();
		Assert.assertEquals( ((OrderNumberAndDateDto)(orders.toArray()[0])).getId(), id);
		
		customerServiceModelService.setCustomer(null, createdOrder);
		o = orderServiceModelService.readOrderAsOrderNumberAndDateDto(createdOrder.getId());
		Assert.assertNull(o.getCustomer());
		
		SimpleCustomerDto sim = customerServiceModelService.readCustomer(createdCustomer.getId());
		Assert.assertTrue( sim.getOrders().size() == 0);
		tearDown();
	}

	@Test
	public final void testAddCustomerFailure() {
		setup();

		try {
			customerServiceModelService.setCustomer(createdCustomer, null);
			Assert.fail("Expecting Service Exception: Adding customer to null order");
		} catch( ServiceException e) {
			System.err.println("Expected exception: "+ e.getMessage());
		}

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
		
		tearDown();
	}
	
	@Test
	public final void testRemoveOrderFailure() {
		setup();

		customerServiceModelService.addToOrders(createdOrder, createdCustomer);
		OrderDto newOrder = orderServiceModelService.readOrderAsOrderDto(createdOrder.getId());

		try {
			customerServiceModelService.removeFromOrders(newOrder, null);
			Assert.fail("Expecting Service Exception: Removing order from null customer");
		} catch( ServiceException e) {
			System.err.println("Expected exception: "+ e.getMessage());
		}

		try {
			customerServiceModelService.removeFromOrders(null, createdCustomer);
			Assert.fail("Expecting Service Exception: Removing null order from customer");
		} catch( ServiceException e) {
			System.err.println("Expected exception: "+ e.getMessage());
		}
		
		tearDown();
	}

}
