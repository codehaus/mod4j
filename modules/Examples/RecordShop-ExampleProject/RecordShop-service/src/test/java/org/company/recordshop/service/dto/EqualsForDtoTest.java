package org.company.recordshop.service.dto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EqualsForDtoTest {

	@Test
	public void testNotEqualswithoutIds() {
		SimpleCustomerDto one = new SimpleCustomerDto();
		SimpleCustomerDto two = new SimpleCustomerDto();
		assertFalse(one.equals(two));
		assertFalse(two.equals(one));
		assertFalse(one.hashCode() == two.hashCode());
	}
	
	@Test
	public void testEqualsIfSame() {
		SimpleCustomerDto one = new SimpleCustomerDto();
		SimpleCustomerDto two = one;
		assertSame(one, two);
		assertTrue(one.equals(two));
		assertTrue(two.equals(one));
		assertEquals(one.hashCode(), two.hashCode());
	}
	
	@Test
	public void testEqualsWithIds() {
		SimpleCustomerDto one = new SimpleCustomerDto(1L, 1);
		SimpleCustomerDto two = new SimpleCustomerDto(1L, 1);
		assertNotSame(one, two);
		assertTrue(one.equals(two));
		assertTrue(two.equals(one));
		assertEquals(one.hashCode(), two.hashCode());
	}
	
	@Test
	public void testNotEqualsWithIds() {
		SimpleCustomerDto one = new SimpleCustomerDto(1L, 1);
		SimpleCustomerDto two = new SimpleCustomerDto(2L, 1);
		assertNotSame(one, two);
		assertFalse(one.equals(two));
		assertFalse(two.equals(one));
		assertFalse(one.hashCode() == two.hashCode());
	}
}
