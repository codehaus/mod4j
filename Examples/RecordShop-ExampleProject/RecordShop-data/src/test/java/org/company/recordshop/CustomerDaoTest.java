package org.company.recordshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.company.recordshop.data.CustomerDao;
import org.company.recordshop.domain.Customer;
import org.company.recordshop.domain.CustomerExample;
import org.company.recordshop.domain.Order;
import org.company.recordshop.domain.OrderLine;
import org.company.recordshop.domain.SexeEnum;
import org.hibernate.exception.ConstraintViolationException;
import org.joda.time.DateTime;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.ExpectedException;
import org.springframework.test.jdbc.SimpleJdbcTestUtils;
import org.springframework.transaction.annotation.Transactional;

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

    public class OrderlineComparator implements Comparator<OrderLine> {
        public int compare(OrderLine one, OrderLine other) {
            return one.getLineNumber() - other.getLineNumber();
        }
    }

    @Autowired
    private CustomerDao customerDao;

    protected DateTime date() {
        return new DateTime(2008, 11, 6, 0, 0, 0, 0);
    }

    /**
     * Test method for {@link CustomerDao#retrieve(int)}.
     */
    @Test
    public void testRetrieve() {
        Customer customer = new Customer("Vincent", "Van Gogh", date(), 1);
        customer.setDiscountPercentage(50);
        customer.setNumberOfEars(1);
        customerDao.add(customer);
        flush();
        clear();

        Customer saved = customerDao.retrieve(customer.getId());
        assertNotNull(saved);
        assertEquals("Vincent", saved.getFirstName());
        assertEquals("Van Gogh", saved.getLastName());
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
        Customer customer = new Customer("Johannes", "Vermeer", date(), 222);
        customerDao.add(customer);
        flush();

        assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
        assertEquals(222, simpleJdbcTemplate.queryForInt("select customer_nr from Customer_TABLE where id = ?",
                customer.getId()));
    }

    /**
     * Test method for {@link CustomerDao#update(Customer)}.
     */
    @Test
    public void testUpdate() {
        Customer customer = new Customer("Vincent", "van Gogh", date(), 1);
        customer.setCustomerNr(1);
        customerDao.add(customer);
        Customer saved = null;
        assertNotNull(saved = customerDao.retrieve(customer.getId()));
        assertEquals("Vincent", saved.getFirstName());
        assertEquals("van Gogh", saved.getLastName());
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
        Customer rembrandt = customerDao.add(new Customer("Rembrandt", "van Rijn", date(), 3));
        Customer saskia = customerDao.add(new Customer("Saskia", "van Rijn", date(), 4));
        Customer potter = customerDao.add(new Customer("Paulus", "Potter", date(), 5));
        flush();
        assertEquals(3, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
        customerDao.delete(new Customer("Piet", "Paaltjens", date(), 6));
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
     * Basic Collection pattern test (inverse="true"). Test method for deleting a customer with orders added. </br>
     * Model code: <code>association Customer customer one <-> many Order orders;</code> </br> Its a bi-directional
     * one-to-many relation without notion of composite- or aggregate-root concept. Tests when a Customer with an
     * existing order is deleted, an ConstraintViolationException is thrown.
     */
    @Test
    @ExpectedException(ConstraintViolationException.class)
    public void testDeleteWithOrders() {
        Customer customer = new Customer("John", "Stayshort", new DateTime("1980-01-01"), 12345);
        Order order = new Order("54321");
        customer.addToOrders(order);
        customerDao.add(customer);
        flush();
        clear();
        assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Order_TABLE"));
        customerDao.delete(customer);
        flush();
        fail("Expected a ConstraintViolationException");
        /*
         * DELETE on table 'CUSTOMER_TABLE' caused a violation of foreign key constraint 'FK75A2F39DAE33DD38' for key
         * (557056)
         */
    }

    /**
     * Test method for {@link CustomerDao#update(Customer)} with orders added.
     */
    @Test
    public void testAddWithOrders() {
        Customer customer = new Customer("Johannes", "Vermeer", date(), 2);

        Order order = new Order("AA111");
        order.addToOrderLines(new OrderLine(1, "verf"));
        order.addToOrderLines(new OrderLine(2, "kwast"));
        order.addToOrderLines(new OrderLine(3, "doek"));
        customer.addToOrders(order);

        order = new Order("AA222");
        order.addToOrderLines(new OrderLine(7, "rood"));
        order.addToOrderLines(new OrderLine(8, "penseel"));
        order.addToOrderLines(new OrderLine(9, "ezel"));
        customer.addToOrders(order);

        customerDao.add(customer);
        flush();

        Customer saved = customerDao.retrieve(customer.getId());
        Set<Order> savedOrders = saved.getOrders();
        assertEquals(2, savedOrders.size());

        int sum;
        for (Order o : savedOrders) {
            if (o.getOrderNumber().equals("AA111")) {
                ArrayList<OrderLine> lines = new ArrayList<OrderLine>(o.getOrderLines());
                assertEquals(3, lines.size());
                sum = 0;
                for (OrderLine line : lines) {
                    sum = sum + line.getLineNumber();
                }
                assertEquals(6, sum); // 1+2+3
            }
            if (o.getOrderNumber().equals("AA222")) {
                ArrayList<OrderLine> lines = new ArrayList<OrderLine>(o.getOrderLines());
                assertEquals(3, lines.size());
                sum = 0;
                for (OrderLine line : lines) {
                    sum = sum + line.getLineNumber();
                }
                assertTrue(sum == 24); // 7+8+9
            }
        }
    }

    @Test
    public void testFindByExample() {
        customerDao.add(new Customer("Rembrandt", "van Rijn", date(), 3));
        customerDao.add(new Customer("Saskia", "van Rijn", date(), 4));
        Customer paulus = new Customer("Paulus", "Potter", date(), 5);
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
