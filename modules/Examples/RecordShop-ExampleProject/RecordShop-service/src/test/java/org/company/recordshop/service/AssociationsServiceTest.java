package org.company.recordshop.service;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Set;

import org.company.recordshop.domain.Customer;
import org.company.recordshop.domain.CustomerExample;
import org.company.recordshop.service.dto.OrderDto;
import org.company.recordshop.service.dto.OrderNumberAndDateDto;
import org.company.recordshop.service.dto.SimpleCustomerDto;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;
import org.mod4j.runtime.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

@ContextConfiguration(locations = { "/Mod4jCommonContext.xml",
		"/org/company/recordshop/data/applicationContextBase.xml",
		"/org/company/recordshop/data/applicationContext.xml",
		"/org/company/recordshop/business/applicationContextBase.xml",
		"/org/company/recordshop/business/applicationContext.xml",
        "/org/company/recordshop/service/testDataSourceContext.xml",
		"/org/company/recordshop/service/testContext.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class AssociationsServiceTest extends
		AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	CustomerServiceModelLocalService customerServiceModelService;

	@Autowired
	OrderServiceModelLocalService orderServiceModelService;

	SimpleCustomerDto createdCustomer = null;
	OrderDto createdOrder = null;

	public void createCustomer(String first, String last, int nr) {
		SimpleCustomerDto customer2 = new SimpleCustomerDto();
		customer2.setFirstName(first);
		customer2.setLastName(last);
		customer2.setCustomerNr(nr);
        customer2.setBirthDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));
		customer2 = customerServiceModelService.createCustomer(customer2);
	}

	public void setup() {
		SimpleCustomerDto customer = new SimpleCustomerDto();
		customer.setFirstName("Alfred");
		customer.setLastName("Sloan");
		customer.setCustomerNr(12345);
        customer.setBirthDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));
		createdCustomer = customerServiceModelService.createCustomer(customer);

		createCustomer("Joan", "Perfect", 3);
		createCustomer("Mark", "Thorpe", 44);

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
	public final void testListAll() {
		setup();

		List<SimpleCustomerDto> all = customerServiceModelService
				.listAllCustomers();

		for (SimpleCustomerDto simpleCustomerDto : all) {
			int nr = simpleCustomerDto.getCustomerNr();
			Assert.assertTrue((nr == 3) || (nr == 44) || (nr == 12345));
		}
		Assert.assertEquals(all.size(), 3);
		tearDown();
	}

	@Test
	public final void testFindByExample() {
		SimpleCustomerDto c = new SimpleCustomerDto();
		c.setFirstName("Johan");
		c.setLastName("Vogelzang");
		c.setCustomerNr(1);
		c.setBlackListed(false);
        c.setBirthDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));
		customerServiceModelService.createCustomer(c);
		c = new SimpleCustomerDto();
		c.setFirstName("Jos");
		c.setLastName("Warmer");
		c.setCustomerNr(2);
        c.setBirthDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));
		customerServiceModelService.createCustomer(c);
		c = new SimpleCustomerDto();
		c.setFirstName("Eric Jan");
		c.setLastName("Malotaux");
		c.setCustomerNr(3);
        c.setBirthDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));
		customerServiceModelService.createCustomer(c);
		
//        assertEquals(3, countRowsInTable("Customer_TABLE"));

        SimpleCustomerDto example  = new SimpleCustomerDto();
        List<SimpleCustomerDto> result = customerServiceModelService.findCustomers(example);
        assertEquals(3, result.size());
        
        example.setBlackListed(false);
        result = customerServiceModelService.findCustomers(example);
        assertEquals(1, result.size());
        
        example.setBlackListed(true);
        result = customerServiceModelService.findCustomers(example);
        assertEquals(0, result.size());
        
        example.setBlackListed(null);
        example.setFirstName("Jo");
        result = customerServiceModelService.findCustomers(example);
        assertEquals(2, result.size());
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
			Assert
					.fail("Expecting Service Exception: Adding null order to customer");
		} catch (ServiceException e) {
			System.err.println("Expected exception: " + e.getMessage());
		}

		try {
			customerServiceModelService.addToOrders(createdOrder, null);
			Assert
					.fail("Expecting Service Exception: Adding order to null customer");
		} catch (ServiceException e) {
			System.err.println("Expected exception: " + e.getMessage());
		}

		try {
			createdOrder.setId(-1L);
			customerServiceModelService.addToOrders(createdOrder,
					createdCustomer);
			Assert
					.fail("Expecting Service Exception: Adding order with incorrect id to customer");
		} catch (ServiceException e) {
			System.err.println("Expected exception: " + e.getMessage());
		}

		try {
			createdOrder.setId(id);
			createdCustomer.setId(-1L);
			customerServiceModelService.addToOrders(createdOrder,
					createdCustomer);
			Assert
					.fail("Expecting Service Exception: Adding order to customer with incorrect id");
		} catch (ServiceException e) {
			System.err.println("Expected exception: " + e.getMessage());
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
		Assert.assertEquals(((OrderNumberAndDateDto) (orders.toArray()[0]))
				.getId(), id);

		customerServiceModelService.setCustomer(null, createdOrder);
		o = orderServiceModelService
				.readOrderAsOrderNumberAndDateDto(createdOrder.getId());
		Assert.assertNull(o.getCustomer());

		SimpleCustomerDto sim = customerServiceModelService
				.readCustomer(createdCustomer.getId());
		Assert.assertTrue(sim.getOrders().size() == 0);
		tearDown();
	}

	@Test
	public final void testAddCustomerFailure() {
		setup();

		try {
			customerServiceModelService.setCustomer(createdCustomer, null);
			Assert
					.fail("Expecting Service Exception: Adding customer to null order");
		} catch (ServiceException e) {
			System.err.println("Expected exception: " + e.getMessage());
		}

		tearDown();
	}

	@Test
	public final void testRemoveOrder() {
		setup();

		customerServiceModelService.addToOrders(createdOrder, createdCustomer);
		OrderDto newOrder = orderServiceModelService
				.readOrderAsOrderDto(createdOrder.getId());
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
		OrderDto newOrder = orderServiceModelService
				.readOrderAsOrderDto(createdOrder.getId());

		try {
			customerServiceModelService.removeFromOrders(newOrder, null);
			Assert
					.fail("Expecting Service Exception: Removing order from null customer");
		} catch (ServiceException e) {
			System.err.println("Expected exception: " + e.getMessage());
		}

		try {
			customerServiceModelService.removeFromOrders(null, createdCustomer);
			Assert
					.fail("Expecting Service Exception: Removing null order from customer");
		} catch (ServiceException e) {
			System.err.println("Expected exception: " + e.getMessage());
		}

		tearDown();
	}

}
