package org.company.recordshop.service.dto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ToStringForDtoTest {

	@Test
	public void testToStringWithNullProperties() {
		SimpleCustomerDto customer = new SimpleCustomerDto();
		assertEquals("org.company.recordshop.service.dto.SimpleCustomerDto"
				+ "[id=null,customerNr=null,lastName=null,firstName=null,"
				+ "blackListed=null,username=null,sexe=null,birthDate=null,"
				+ "orders=[]]", customer.toString());
	}

	@Test
	public void testToStringWithSomeProperties() {
		SimpleCustomerDto customer = new SimpleCustomerDto();
		customer.setId(1L);
		customer.setBlackListed(true);
		assertEquals("org.company.recordshop.service.dto.SimpleCustomerDto"
				+ "[id=1,customerNr=null,lastName=null,firstName=null,"
				+ "blackListed=true,username=null,sexe=null,birthDate=null,"
				+ "orders=[]]", customer.toString());
	}

	@Test
	public void testToStringWithOrders() {
		SimpleCustomerDto customer = new SimpleCustomerDto();
		OrderNumberAndDateDto order = new OrderNumberAndDateDto();
		order.setId(1L);
		order.setOrderNumber("1");
		customer.addToOrders(order);
		assertEquals("org.company.recordshop.service.dto.SimpleCustomerDto[" +
				"id=null,customerNr=null,lastName=null,firstName=null," +
				"blackListed=null,username=null,sexe=null,birthDate=null,orders=[" +
				"org.company.recordshop.service.dto.OrderNumberAndDateDto[" +
				"id=1,orderNumber=1,orderDate=null,customer=null]]]",
				customer.toString());
	}
}
