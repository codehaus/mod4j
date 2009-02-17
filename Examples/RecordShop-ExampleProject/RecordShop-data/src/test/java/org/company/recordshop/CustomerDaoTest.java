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
import org.company.recordshop.domain.CustomerExample;
import org.company.recordshop.domain.Order;
import org.company.recordshop.domain.OrderLine;
import org.company.recordshop.domain.SexeEnum;
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
            return (one.getFirstName() + one.getLastName()).compareTo(other.getFirstName() + other.getLastName());
        }
    }

    @Autowired
    private CustomerDao customerDao;

    /**
     * Test method for {@link CustomerDao#retrieve(int)}.
     */
    @Test
    public void testRetrieve() {
        Customer customer = new Customer("Vincent", "Van Gogh", 1);
        customer.setDiscountPercentage(50);
        customer.setNumberOfEars(1);
        customerDao.add(customer);
        flush();
        clear();

        Customer saved = customerDao.retrieve(customer.getId());
        assertNotNull(saved);
        assertEquals("Vincent", saved.getFirstName());
        assertEquals("Van Gogh", saved.getLastName());
        assertNull(saved.getSexe());
        assertEquals(1, saved.getCustomerNr());
        assertEquals(false, saved.isBlackListed());
        assertEquals(1, saved.getNumberOfEars());
        assertEquals(0, saved.getOrders().size());
    }

    /**
     * Test method for {@link CustomerDao#add(Customer)}.
     */
    @Test
    public void testAdd() {
        assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
        Customer customer = new Customer("Johannes", "Vermeer", 222);
        customerDao.add(customer);
        flush();

        assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
        assertEquals(222, simpleJdbcTemplate.queryForInt("select customernr from Customer_TABLE where id = ?", customer
                .getId()));
    }

    /**
     * Test method for {@link CustomerDao#update(Customer)}.
     */
    @Test
    public void testUpdate() {
        Customer customer = new Customer("Vincent", "van Gogh", 1);
        customer.setCustomerNr(1);
        customerDao.add(customer);
        Customer saved = null;
        assertNotNull(saved = customerDao.retrieve(customer.getId()));
        assertEquals("Vincent", saved.getFirstName());
        assertEquals("van Gogh", saved.getLastName());
        assertNull(saved.getSexe());
        assertEquals(2, saved.getNumberOfEars());
        assertEquals(1, saved.getCustomerNr());
        assertEquals(false, saved.isBlackListed());
        assertEquals(0, saved.getOrders().size());

        saved.setFirstName("Thea");
        saved.setBlackListed(true);
        saved.setSexe(SexeEnum.FEMALE);
        saved.setCustomerNr(2);
        saved.setNumberOfEars(2);
        saved.setLastName("Engelhard");
        customerDao.update(saved);
        flush();

        Customer updated = customerDao.retrieve(saved.getId());
        assertEquals("Thea", updated.getFirstName());
        assertEquals("Engelhard", updated.getLastName());
        assertEquals(SexeEnum.FEMALE, updated.getSexe());
        assertEquals(2, updated.getNumberOfEars());
        assertEquals(2, updated.getCustomerNr());
        assertEquals(true, updated.isBlackListed());
        assertEquals(0, updated.getOrders().size());
    }

    /**
     * Test method for {@link CustomerDao#delete(Customer)}.
     */
    @Test
    public void testDelete() {
        assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
        Customer rembrandt = customerDao.add(new Customer("Rembrandt", "van Rijn", 3));
        Customer saskia = customerDao.add(new Customer("Saskia", "van Rijn", 4));
        Customer potter = customerDao.add(new Customer("Paulus", "Potter", 5));
        flush();
        assertEquals(3, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
        customerDao.delete(new Customer("Piet", "Paaltjens", 6));
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
        customerDao.add(new Customer("Rembrandt", "van Rijn", 3));
        customerDao.add(new Customer("Saskia", "van Rijn", 4));
        customerDao.add(new Customer("Paulus", "Potter", 5));
        flush();
        clear();
        assertEquals(3, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
        List<Customer> customers = customerDao.listAll();
        assertNotNull(customers);
        assertEquals(3, customers.size());
        Collections.sort(customers, new CustomerComparator()); // Om
        // willekeurige
        // volgorde te
        // vermijden.
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
        Customer customer = new Customer("Johannes", "Vermeer", 2);

        Order order = new Order("AA111");
        order.addToOrderLines(new OrderLine(1, "verf", 30));
        order.addToOrderLines(new OrderLine(2, "kwast", 20));
        order.addToOrderLines(new OrderLine(3, "doek", 40));

        order = new Order("AA222");
        order.addToOrderLines(new OrderLine(4, "rood", 2));
        order.addToOrderLines(new OrderLine(5, "penseel", 3));
        order.addToOrderLines(new OrderLine(6, "ezel", 110));
        customer.addToOrders(order);

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

    @Test
    public void testFindByExample() {
        customerDao.add(new Customer("Rembrandt", "van Rijn", 3));
        customerDao.add(new Customer("Saskia", "van Rijn", 4));
        Customer paulus = new Customer("Paulus", "Potter", 5);
        paulus.setBlackListed(true);
        customerDao.add(paulus);
        flush();
        clear();

        CustomerExample example = new CustomerExample();
        List<Customer> result = customerDao.findByExample(example);
        assertEquals(3, result.size());

        example = new CustomerExample();
        example.setBlackListed(true);
        result = customerDao.findByExample(example);
        assertEquals(1, result.size());

        example = new CustomerExample();
        example.setBlackListed(false);
        result = customerDao.findByExample(example);
        assertEquals(2, result.size());

        example = new CustomerExample();
        example.setFirstName("Rembrandt");
        Customer customer = customerDao.findByExample(example).get(0);
        assertEquals(3, customer.getCustomerNr());

        example = new CustomerExample();
        example.setFirstName("rEMBRANDT");
        customer = customerDao.findByExample(example).get(0);
        assertEquals(3, customer.getCustomerNr());

        example = new CustomerExample();
        example.setFirstName("Rem");
        customer = customerDao.findByExample(example).get(0);
        assertEquals(3, customer.getCustomerNr());

        example = new CustomerExample();
        example.setFirstName(null);
        example.setLastName("Rij");
        customer = customerDao.findByExample(example).get(0);
        assertEquals(3, customer.getCustomerNr());
        customer = customerDao.findByExample(example).get(1);
        assertEquals(4, customer.getCustomerNr());

        example.setFirstName("mbr");
        customer = customerDao.findByExample(example).get(0);
        assertEquals(3, customer.getCustomerNr());

        example = new CustomerExample();
        example.setBlackListed(null);
        example.setCustomerNr(5);
        customer = customerDao.findByExample(example).get(0);
        assertEquals(5, customer.getCustomerNr());
    }
}
