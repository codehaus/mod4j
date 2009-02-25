package org.company.recordshop.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.joda.time.DateTime;
import org.junit.Test;

public class EqualsTest {

    @Test
    public void testEqualsObject() {
        Customer one = new Customer("Karl", "Popper", new DateTime(), 1);
        Customer other = new Customer("Karl", "Popper", new DateTime(), 2);
        assertSame(one, one);
        assertNotSame(one, other);
        assertFalse(one.equals(other));
    }
}
