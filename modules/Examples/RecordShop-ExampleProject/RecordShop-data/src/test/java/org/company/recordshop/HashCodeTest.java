package org.company.recordshop;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.company.recordshop.data.spring.dao.CustomerDao;
import org.company.recordshop.domain.Customer;
import org.joda.time.DateTime;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class HashCodeTest extends AbstractDaoTestCase {
    @Autowired
    private CustomerDao customerDao;

    @Test
    public void testEqualsObject() {
        Customer one = customerDao.add(new Customer("Karl", "Popper", new DateTime(), 1));
        Customer two = customerDao.add(new Customer("Ludwig", "Wittgenstein", new DateTime(), 2));
        Customer read = new Customer("Karl", "Popper", new DateTime(), 1);
        assertFalse(one.equals(read));
        assertFalse(one.hashCode() == read.hashCode());
        flush();
        clear();

        read = customerDao.retrieve(one.getId());
        assertTrue(one.equals(read));
        assertTrue(one.hashCode() == read.hashCode());
        two = customerDao.retrieve(two.getId());
        assertFalse(two.equals(read));
        assertFalse(two.hashCode() == read.hashCode());
    }
}
