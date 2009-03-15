package org.company.recordshop.domain;

import static org.junit.Assert.assertFalse;

import org.joda.time.DateTime;
import org.junit.Test;

public class HashCodeTest {

    @Test
    public void testHashCode() {
        Customer one = new Customer("Karl", "Popper", new DateTime(), 1);
        Customer other = new Customer("Karl", "Popper", new DateTime(), 2);
        assertFalse(one.hashCode() == other.hashCode());
        assertFalse(one.equals(other));
    }
}
