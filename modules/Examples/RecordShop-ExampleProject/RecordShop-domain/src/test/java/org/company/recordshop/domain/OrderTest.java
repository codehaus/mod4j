package org.company.recordshop.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class OrderTest {

	@Test
	public void testHashCode() throws Exception {
		Order order = new Order("1");
		setId(order, 1L);
		assertEquals(1L, order.hashCode());
		setId(order, 2L);
		assertEquals(2L, order.hashCode());
	}

	@Test
	public void testEqualsObject() throws Exception {
		Order one = new Order("1");
		setId(one, 1L);
		Order two = new Order("1");
		setId(two, 1L);
		assertEquals(one, two);
	}

	@Test
	public void testInContainer() throws Exception {
		Set<Order> orders = new HashSet<Order>();
		Order one = new Order("1");
		setId(one, 1L);
		orders.add(one);
		Order two = new Order("1");
		setId(two, 1L);
		orders.add(one);
		assertTrue(orders.contains(two));
		assertTrue(orders.remove(one));
		assertFalse(orders.remove(two));
	}

	private void setId(Object object, Long id) throws Exception {
		Class<?> clazz = object.getClass();
		while (!clazz.getSuperclass().equals(Object.class)) {
			clazz = clazz.getSuperclass();
		}
		Field idField = clazz.getDeclaredField("id");
		idField.setAccessible(true);
		idField.set(object, id);
	}
}
