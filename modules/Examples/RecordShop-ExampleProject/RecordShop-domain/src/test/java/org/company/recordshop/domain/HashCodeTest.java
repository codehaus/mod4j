package org.company.recordshop.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import org.joda.time.DateTime;
import org.junit.Test;

public class HashCodeTest {

    @Test
    public void testUnequalHashCodeWithoutId() {
        Customer one = new Customer("Karl", "Popper", new DateTime(), 1);
        Customer other = new Customer("Karl", "Popper", new DateTime(), 2);
        assertFalse(one.hashCode() == other.hashCode());
        assertFalse(one.equals(other));
    }

    @Test
    public void testUnequalHashCodeWithId() throws Exception {
        Customer one = new Customer("Karl", "Popper", new DateTime(), 1);
        Customer other = new Customer("Karl", "Popper", new DateTime(), 2);
        setId(one, 1L);
        setId(other, 2L);
        assertFalse(one.hashCode() == other.hashCode());
        assertFalse(one.equals(other));
    }

    @Test
    public void testEqualHashCodeWithId() throws Exception {
        Customer one = new Customer("Karl", "Popper", new DateTime(), 1);
        Customer other = new Customer("Karl", "Popper", new DateTime(), 2);
        setId(one, 1L);
        setId(other, 1L);
        assertTrue(one.hashCode() == other.hashCode());
        assertTrue(one.equals(other));
        setId(one, 2L);
        setId(other, 2L);
        assertTrue(one.hashCode() == other.hashCode());
        assertTrue(one.equals(other));
        setId(one, 3L);
        setId(other, 3L);
        assertTrue(one.hashCode() == other.hashCode());
        assertTrue(one.equals(other));
    }

    @Test
    public void testContainment() throws Exception {
        Set<Customer> set = new HashSet<Customer>();
        Customer one = new Customer("Karl", "Popper", new DateTime(), 1);
        Customer other = new Customer("Karl", "Popper", new DateTime(), 2);
        Customer third = new Customer("Karl", "Popper", new DateTime(), 3);
        setId(one, 1L);
        setId(other, 2L);
        setId(other, 3L);
        set.add(one);
        set.add(other);
        assertTrue(set.contains(one));
        assertTrue(set.contains(other));
        assertFalse(set.contains(third));
    }

    @Test
    public void testRemoveFromSet() throws Exception {
        Set<Customer> set = new HashSet<Customer>();
        Customer one = new Customer("Karl", "Popper", new DateTime(), 1);
        Customer other = new Customer("Karl", "Popper", new DateTime(), 2);
        Customer third = new Customer("Karl", "Popper", new DateTime(), 3);
        setId(one, 1L);
        setId(other, 2L);
        setId(other, 3L);
        set.add(one);
        set.add(other);
        assertTrue(set.contains(one));
        assertTrue(set.contains(other));
        assertFalse(set.contains(third));
        
        set.remove(one);
        assertFalse(set.contains(one));
        set.remove(other);
        assertFalse(set.contains(other));
        assertEquals(0, set.size());
        assertFalse(set.remove(third));
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
