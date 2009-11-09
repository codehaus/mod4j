package org.company.recordshop.service.dto;

import static org.junit.Assert.assertTrue;

import org.joda.time.DateTime;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;

@ContextConfiguration(locations = { "/Mod4jCommonContext.xml",
		"/org/company/recordshop/data/sessionFactoryContext.xml",
		"/org/company/recordshop/data/applicationContext.xml",
		"/org/company/recordshop/business/applicationContext.xml",
		"/org/company/recordshop/service/applicationContext.xml",
        "/org/company/recordshop/service/testContext.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class SimpleCustomerDtoTest {

	private final static String ORDER_NR = "123456789";

	/**
	 * Test method for {@link SimpleCustomerDto}. 
	 */
	@Test
	public void testCustomerDtoValues() {

		SimpleCustomerDto customerDto = new SimpleCustomerDto();
		OrderNumberAndDateDto newOrder = new OrderNumberAndDateDto();
		newOrder.setOrderDate(new DateTime());
		newOrder.setOrderNumber(ORDER_NR);

		customerDto.setBlackListed(false);
		customerDto.setFirstName("John");
		customerDto.setSexe(SexeEnumDto.MALE);
		customerDto.addToOrders(newOrder);

		for (OrderNumberAndDateDto order : customerDto.getOrders()) {
			assertTrue("Order must exist", order.getOrderNumber().equals(ORDER_NR));
		}
	}
}
