package org.company.recordshop.service;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Set;

import org.company.recordshop.service.dto.FullProductDto;
import org.company.recordshop.service.dto.OrderDto;
import org.company.recordshop.service.dto.OrderLineDto;
import org.company.recordshop.service.dto.OrderNumberAndDateDto;
import org.company.recordshop.service.dto.OrderWithOrderLinesDto;
import org.company.recordshop.service.dto.ProductWithCustomersDto;
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
		"/org/company/recordshop/data/sessionFactoryContext.xml",
		"/org/company/recordshop/data/applicationContext.xml",
		"/org/company/recordshop/business/applicationContext.xml",
        "/org/company/recordshop/service/dtoTranslatorsContext.xml",
		"/org/company/recordshop/service/applicationContext.xml",
		"/org/company/recordshop/service/testContext.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class AssociationsServiceTest extends
		AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	CustomerServiceModelLocalService customerServiceModelService;

	public void setCustomerServiceModelService(
			CustomerServiceModelLocalService customerServiceModelService) {
		this.customerServiceModelService = customerServiceModelService;
	}

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

	public void setupMore() {
		OrderDto order2 = new OrderDto();
		order2.setOrderNumber("ISO 002");
		order2.setOrderDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));
		OrderDto createdOrder2 = orderServiceModelService.createOrder(order2);
		customerServiceModelService.addToOrders(createdCustomer, createdOrder2);

		order2 = new OrderDto();
		order2.setOrderNumber("ISO 003");
		order2.setOrderDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));
		createdOrder2 = orderServiceModelService.createOrder(order2);
		customerServiceModelService.addToOrders(createdCustomer, createdOrder2);

		order2 = new OrderDto();
		order2.setOrderNumber("ISO 004");
		order2.setOrderDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));
		createdOrder2 = orderServiceModelService.createOrder(order2);
		customerServiceModelService.addToOrders(createdCustomer, createdOrder2);
	}

	public void tearDown() {
		createdCustomer = null;
		createdOrder = null;
	}

	@Test
	public final void testListAll() {
		setup();

		List<SimpleCustomerDto> all = customerServiceModelService
				.listCustomers();

		for (SimpleCustomerDto simpleCustomerDto : all) {
			int nr = simpleCustomerDto.getCustomerNr();
			Assert.assertTrue((nr == 3) || (nr == 44) || (nr == 12345));
		}
		Assert.assertEquals(all.size(), 3);
		tearDown();
	}

	@Test
	public final void testGetFrom() {
		setup();
		setupMore();

		List<SimpleCustomerDto> all = customerServiceModelService
				.listCustomers();

		for (SimpleCustomerDto simpleCustomerDto : all) {
			int nr = simpleCustomerDto.getCustomerNr();
			List<OrderNumberAndDateDto> orders = customerServiceModelService
					.getOrders(simpleCustomerDto);
			if (createdCustomer.getId() == simpleCustomerDto.getId()) {
				Assert.assertTrue(orders.size() == 3);
				for (OrderNumberAndDateDto order : orders) {
					OrderDto orderDto = new OrderDto(order.getId(), order
							.getVersion());
					SimpleCustomerDto customer = customerServiceModelService
							.getCustomer(orderDto);
					Assert.assertTrue(simpleCustomerDto.getId() == customer
							.getId());
				}
			} else {
				Assert.assertTrue(orders.size() == 0);
			}
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

		SimpleCustomerDto example = new SimpleCustomerDto();
		example.clear();
		List<SimpleCustomerDto> result = customerServiceModelService
				.findCustomers(example);
		assertEquals(3, result.size());

		example.setBlackListed(false);
		result = customerServiceModelService.findCustomers(example);
		assertEquals(3, result.size());

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
		customerServiceModelService.addToOrders(createdCustomer, createdOrder);

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
			customerServiceModelService.addToOrders(createdCustomer, null);
			Assert
					.fail("Expecting Service Exception: Adding null order to customer");
		} catch (ServiceException e) {
			System.err.println("Expected exception: " + e.getMessage());
		}

		try {
			customerServiceModelService.addToOrders(null, createdOrder);
			Assert
					.fail("Expecting Service Exception: Adding order to null customer");
		} catch (ServiceException e) {
			System.err.println("Expected exception: " + e.getMessage());
		}

		try {
			customerServiceModelService.addToOrders(createdCustomer,
					new OrderDto(-1L, 0));
			Assert
					.fail("Expecting Service Exception: Adding order with incorrect id to customer");
		} catch (ServiceException e) {
			System.err.println("Expected exception: " + e.getMessage());
		}

		try {
			customerServiceModelService.addToOrders(new SimpleCustomerDto(-1L,
					0), createdOrder);
			Assert
					.fail("Expecting Service Exception: Adding order to customer with incorrect id");
		} catch (ServiceException e) {
			System.err.println("Expected exception: " + e.getMessage());
		}
		tearDown();
	}

	/**
	 * tries to add an existing Product to an OrderLine. Currently goes wrong !
	 * Same case as above, but this is for multiplicity ONE
	 * 
	 */
	@Test
	public final void testAddExistingProduct() {
		setup();
		ProductWithCustomersDto p001 = new ProductWithCustomersDto();
		p001.setProductNumber("p001");
		p001.setPrice(new Float(8));
		p001.setOrderable(true);
		ProductWithCustomersDto createdP001 = customerServiceModelService
				.createProduct(p001);

		// Comment the try below and uncomment the ones below that to get the
		// real test.
		// try {
		// createdP001.addToBuyers(createdCustomer);
		// ProductWithCustomersDto createdP002 =
		// customerServiceModelService.updateProduct(createdP001);
		// Assert.fail("Expecting Service Exception");
		// } catch (TranslatorException e) {
		// System.err.println("Expected exception: " + e.getMessage());
		// }

		// JOS: The above is incorrect (just not to break the build)
		// The below should be run as a test and shows the error.
		FullProductDto fullProduct = customerServiceModelService
				.readProductAsFullProductDto(createdP001.getId());
		OrderLineDto orderLine = new OrderLineDto();
		orderLine.setProduct(fullProduct);
		orderLine.setLineNumber(1);
		orderLine.setDescription("an orderline");
		OrderWithOrderLinesDto order = new OrderWithOrderLinesDto();
		order.addToOrderLines(orderLine);
		order.setOrderNumber("aap");
		order = orderServiceModelService.createOrder(order);

		// Assert.assertTrue("Number of customers should be one",
		// stored.getBuyers().size() == 1);
		// SimpleCustomerDto storedCustomer =
		// stored.getFromBuyers(createdCustomer.getId());
		// Assert.assertTrue("Customer should be there", storedCustomer !=
		// null);
		//		
		// storedCustomer.setCustomerNr(9101);
		// stored.addToBuyers(storedCustomer);
		// createdP002 = customerServiceModelService.updateProduct(stored);
		//
		// stored =
		// customerServiceModelService.readProductAsProductWithCustomersDto(createdP001.getId());
		// Assert.assertTrue("Number of customers should be one",
		// stored.getBuyers().size() == 1);
		// storedCustomer = stored.getFromBuyers(createdCustomer.getId());
		// Assert.assertTrue("Customer should be there", storedCustomer !=
		// null);
		// Assert.assertTrue("Customer number inciiorrect",
		// storedCustomer.getCustomerNr()== 9101);

	}

	/**
	 * tries to add an existing Customer to a Product. Currently goes wrong !
	 * 
	 */
	@Test
	public final void testAddExistingCustomer() {
		setup();
		ProductWithCustomersDto p001 = new ProductWithCustomersDto();
		p001.setProductNumber("p001");
		p001.setPrice(new Float(8));
		p001.setOrderable(true);
		ProductWithCustomersDto createdP001 = customerServiceModelService
				.createProduct(p001);

		// Comment the try below and uncomment the ones below that to get the
		// real test.
		// try {
		// createdP001.addToBuyers(createdCustomer);
		// ProductWithCustomersDto createdP002 =
		// customerServiceModelService.updateProduct(createdP001);
		// Assert.fail("Expecting Service Exception");
		// } catch (TranslatorException e) {
		// System.err.println("Expected exception: " + e.getMessage());
		// }

		// JOS: The above is incorrect (just not to break the build)
		// The below should be run as a test and shows the error.
		createdP001.addToBuyers(createdCustomer);
		ProductWithCustomersDto createdP002 = customerServiceModelService
				.updateProduct(createdP001);

		ProductWithCustomersDto stored = customerServiceModelService
				.readProductAsProductWithCustomersDto(createdP001.getId());
		Assert.assertTrue("Number of customers should be one", stored
				.getBuyers().size() == 1);
		SimpleCustomerDto storedCustomer = stored.getFromBuyers(createdCustomer
				.getId());
		Assert.assertTrue("Customer should be there", storedCustomer != null);

		storedCustomer.setCustomerNr(9101);
		stored.addToBuyers(storedCustomer);
		createdP002 = customerServiceModelService.updateProduct(stored);

		stored = customerServiceModelService
				.readProductAsProductWithCustomersDto(createdP001.getId());
		Assert.assertTrue("Number of customers should be one", stored
				.getBuyers().size() == 1);
		storedCustomer = stored.getFromBuyers(createdCustomer.getId());
		Assert.assertTrue("Customer should be there", storedCustomer != null);
		Assert.assertTrue("Customer number inciiorrect", storedCustomer
				.getCustomerNr() == 9101);

	}

	@Test
	public final void testAddCustomer() {
		setup();

		Long id = createdOrder.getId();
		customerServiceModelService.setCustomer(createdOrder, createdCustomer);

		OrderNumberAndDateDto o = orderServiceModelService
				.readOrderAsOrderNumberAndDateDto(createdOrder.getId());
		SimpleCustomerDto orderCustomer = o.getCustomer();
		Assert.assertEquals(o.getCustomer().getId(), createdCustomer.getId());

		Set<OrderNumberAndDateDto> orders = o.getCustomer().getOrders();
		Assert.assertEquals(((OrderNumberAndDateDto) (orders.toArray()[0]))
				.getId(), id);

		customerServiceModelService.setCustomer(createdOrder, null);
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
			customerServiceModelService.setCustomer(null, createdCustomer);
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

		customerServiceModelService.addToOrders(createdCustomer, createdOrder);
		OrderDto newOrder = orderServiceModelService
				.readOrderAsOrderDto(createdOrder.getId());
		customerServiceModelService.removeFromOrders(createdCustomer, newOrder);

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

		customerServiceModelService.addToOrders(createdCustomer, createdOrder);
		OrderDto newOrder = orderServiceModelService
				.readOrderAsOrderDto(createdOrder.getId());

		try {
			customerServiceModelService.removeFromOrders(null, newOrder);
			Assert
					.fail("Expecting Service Exception: Removing order from null customer");
		} catch (ServiceException e) {
			System.err.println("Expected exception: " + e.getMessage());
		}

		try {
			customerServiceModelService.removeFromOrders(createdCustomer, null);
			Assert
					.fail("Expecting Service Exception: Removing null order from customer");
		} catch (ServiceException e) {
			System.err.println("Expected exception: " + e.getMessage());
		}

		tearDown();
	}

}
