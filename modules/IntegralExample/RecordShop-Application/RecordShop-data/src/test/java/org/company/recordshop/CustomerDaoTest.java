package org.company.recordshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.company.recordshop.data.spring.dao.CustomerDao;
import org.company.recordshop.domain.Customer;
import org.company.recordshop.domain.Order;
import org.company.recordshop.domain.OrderLine;
import org.company.recordshop.domain.Sexe;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jdbc.SimpleJdbcTestUtils;

/**
 * @author Jos Warmer
 * @author Eric Jan Malotaux
 */
public class CustomerDaoTest extends AbstractDaoTestCase {

    public class CustomerComparator implements Comparator<Customer> {
        public int compare(Customer one, Customer other) {
            return one.getUsername().compareTo(other.getUsername());
        }

    }

    @Autowired
    private CustomerDao customerDao;

    /**
     * Test method for {@link CustomerDao#retrieve(int)}.
     */
    @Test
    public void testRetrieve() {
        Customer customer = new Customer("vgogh", "Vincent", "Van Gogh");
        customer.setNumberOfEars(1);
        customerDao.add(customer);
        flush();

        Customer saved = customerDao.retrieve(customer.getId());
        assertNotNull(saved);
        assertEquals("Vincent", saved.getFirstName());
        assertEquals("Van Gogh", saved.getLastName());
        assertNull(saved.getSexe());
        assertEquals(1, saved.getCustomerNr());
        assertEquals(false, saved.getIsBlackListed());
        assertEquals(1, saved.getNumberOfEars().intValue());
        assertEquals(0, saved.getOrders().size());
    }

    /**
     * Test method for {@link CustomerDao#add(Customer)}.
     */
    @Test
    public void testAdd() {
        assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
        Customer customer = new Customer("jvermeer", "Johannes", "Vermeer");
        customerDao.add(customer);
        flush();

        assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
        assertEquals(222, simpleJdbcTemplate.queryForInt("select customernr from customer_table where id = ?", customer
                .getId()));
    }

    /**
     * Test method for {@link CustomerDao#update(Customer)}.
     */
    @Test
    public void testUpdate() {
        Customer customer = new Customer("vgogh", "Vincent", "van Gogh");
        customerDao.add(customer);
        Customer saved = null;
        assertNotNull(saved = customerDao.retrieve(customer.getId()));
        assertEquals("Vincent", saved.getFirstName());
        assertEquals("van Gogh", saved.getLastName());
        assertNull(saved.getSexe());
        assertEquals(0, saved.getNumberOfEars().intValue());
        assertEquals(1, saved.getCustomerNr());
        assertEquals(false, saved.getIsBlackListed());
        assertEquals(0, saved.getOrders().size());

        saved.setFirstName("Thea");
        saved.setIsBlackListed(true);
        saved.setSexe(Sexe.FEMALE);
        saved.setCustomerNr(2);
        saved.setNumberOfEars(2);
        saved.setLastName("Engelhard");
        customerDao.update(saved);
        flush();

        Customer updated = customerDao.retrieve(saved.getId());
        assertEquals("Thea", updated.getFirstName());
        assertEquals("Engelhard", updated.getLastName());
        assertEquals(Sexe.FEMALE, updated.getSexe());
        assertEquals(2, updated.getNumberOfEars().intValue());
        assertEquals(2, updated.getCustomerNr());
        assertEquals(true, updated.getIsBlackListed());
        assertEquals(0, updated.getOrders().size());
    }

    /**
     * Test method for {@link CustomerDao#delete(Customer)}.
     */
    @Test
    public void testDelete() {
        assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
        Customer rembrandt = customerDao.add(new Customer("rrijn", "Rembrandt", "van Rijn"));
        Customer saskia = customerDao.add(new Customer("srijn", "Saskia", "van Rijn"));
        Customer potter = customerDao.add(new Customer("ppotter", "Paulus", "Potter"));
        flush();
        assertEquals(3, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
        customerDao.delete(new Customer("ppaaltje", "Piet", "Paaltjens"));
        assertEquals(3, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
        customerDao.delete(customerDao.retrieve(rembrandt.getId()));
        flush();
        assertEquals(2, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
        customerDao.delete(customerDao.retrieve(saskia.getId()));
        flush();
        assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
        customerDao.delete(customerDao.retrieve(potter.getId()));
        flush();
        assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
    }

    /**
     * Test method for {@link CustomerDao#listAllCustomers()}.
     */
    @Test
    public void testListAllCustomers() {
        customerDao.add(new Customer("Rembrandt", "van Rijn", "rrijn"));
        customerDao.add(new Customer("Saskia", "van Rijn", "srijn"));
        customerDao.add(new Customer("Paulus", "Potter", "ppotter"));
        flush();
        assertEquals(3, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
        List<Customer> customers = customerDao.listAllCustomers();
        assertNotNull(customers);
        assertEquals(3, customers.size());
        Collections.sort(customers, new CustomerComparator()); // Om willekeurige volgorde te vermijden.
        assertEquals("Paulus", customers.get(0).getFirstName());
        assertEquals("Rembrandt", customers.get(1).getFirstName());
        assertEquals("Saskia", customers.get(2).getFirstName());
    }

    /**
     * Test method for {@link CustomerDao#update(Customer)} with orders added.
     */
    /*
     * Eric Jan Malotaux(2008-05-22): this test generates a weird SQLDataException: A truncation error was encountered
     * trying to shrink VARCHAR () FOR BIT DATA 'XX-RESOLVE-XX' to length 255. Find out what that means, fix it and
     * re-enable this test. @Test
     */
    public void testAddWithOrders() {
        Customer customer = new Customer("Johannes", "Vermeer", "jvermeer");

        Order order = new Order();
        order.addOrderLine(new OrderLine("verf"));
        order.addOrderLine(new OrderLine("kwast"));
        order.addOrderLine(new OrderLine("doek"));

        order = new Order();
        order.addOrderLine(new OrderLine("rood"));
        order.addOrderLine(new OrderLine("penseel"));
        order.addOrderLine(new OrderLine("ezel"));
        customer.addOrder(order);

        customerDao.add(customer);
        flush();

        Customer saved = customerDao.retrieve(customer.getId());
        Set<Order> orders = saved.getOrders();
        assertEquals(1, orders.size());

        for (Iterator<Order> i = orders.iterator(); i.hasNext();) {
            Order o = i.next();
            assertEquals("2", o.getOrderNumber());
            Set<OrderLine> lines = o.getOrderLines();
            assertEquals(3, lines.size());
            Iterator<OrderLine> j = lines.iterator();
            OrderLine line = (OrderLine) j.next();
            assertEquals(1, line.getLineNumber());
            line = (OrderLine) j.next();
            assertEquals(2, line.getLineNumber());
            line = (OrderLine) j.next();
            assertEquals(3, line.getLineNumber());
        }
    }
}
