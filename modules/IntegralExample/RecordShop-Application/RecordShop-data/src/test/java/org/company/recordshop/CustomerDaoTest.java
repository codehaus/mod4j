package org.company.recordshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.company.recordshop.data.spring.dao.CustomerDao;
import org.company.recordshop.domain.Customer;
import org.company.recordshop.domain.Sexe;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jdbc.SimpleJdbcTestUtils;

/**
 * @author Jos Warmer
 * @author Eric Jan Malotaux
 */
public class CustomerDaoTest extends AbstractDaoTestCase {

    @Autowired
    private CustomerDao customerDao;

    /**
     * Test method for {@link org.company.recordshop.data.spring.dao.CustomerDaoImpl#retrieve(int)}.
     */
    @Test
    public void testRetrieveInt() {
        Customer customer = new Customer("Vincent", "Van Gogh", Sexe.MALE, 1, false);
        customer.setNumberOfEars(1);
        customerDao.add(customer);
        Customer savedCust = null;
        assertNotNull(savedCust = customerDao.retrieve(customer.getId()));
        assertEquals("Van Gogh", savedCust.getLastName());
        assertEquals(1, savedCust.getNumberOfEars().intValue());
    }

    /**
     * Test method for
     * {@link nl.ordina.innovation.architecture.customer.data.spring.dao.CustomerDaoImpl#add(nl.ordina.innovation.architecture.customer.domein.Customer)}.
     */
    @Test
    public void testAdd() {
        assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
        Customer customer = new Customer("Johannes", "Vermeer", Sexe.MALE, 222, false);
        customerDao.add(customer);
        sessionFactory.getCurrentSession().flush();
        assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Customer_TABLE"));
        assertEquals(222, simpleJdbcTemplate.queryForInt("select customernr from customer_table where id = ?", customer
                .getId()));
    }

    /**
     * Test method for
     * {@link nl.ordina.innovation.architecture.customer.data.spring.dao.CustomerDaoImpl#update(nl.ordina.innovation.architecture.customer.domein.Customer)}.
     */
    @Test
    public void testUpdate() {
        Customer customer = new Customer("Pinokkio");
        customer.setLevel(Level.EXPERT);
        customerDao.add(customer);
        Customer saved = null;
        assertNotNull(saved = customerDao.retrieve("Pinokkio"));
        assertEquals("Pinokkio", saved.getCustomerName());
        assertEquals(Level.EXPERT, saved.getLevel());

        saved.setCustomerName("Shrek");
        saved.setLevel(Level.BEGINNER);
        sessionFactory.getCurrentSession().flush();
        assertNotNull(saved = customerDao.retrieve("Shrek"));
        assertEquals(Level.BEGINNER, saved.getLevel());
        assertNull(saved = customerDao.retrieve("niets"));

        assertNotNull(saved = customerDao.retrieve("Shrek"));
        saved.setLevel(null);
        sessionFactory.getCurrentSession().flush();
        assertNotNull(saved = customerDao.retrieve("Shrek"));
        assertNull(saved.getLevel());
    }

    /**
     * Test method for
     * {@link nl.ordina.innovation.architecture.customer.data.spring.dao.CustomerDaoImpl#delete(nl.ordina.innovation.architecture.customer.domein.Customer)}.
     */
    /*
     * @Test public void testDelete() { assertEquals(0, SimpleJdbcTestUtils.countRowsInTable( simpleJdbcTemplate,
     * "Customer_TABLE")); customerDao.add(new Customer("onderwerp")); customerDao.add(new Customer("gezegde"));
     * customerDao.add(new Customer("lijdend voorwerp")); sessionFactory.getCurrentSession().flush(); assertEquals(3,
     * SimpleJdbcTestUtils.countRowsInTable( simpleJdbcTemplate, "Customer_TABLE"));
     * customerDao.delete(customerDao.retrieve("onderwerp")); sessionFactory.getCurrentSession().flush();
     * assertEquals(2, SimpleJdbcTestUtils.countRowsInTable( simpleJdbcTemplate, "Customer_TABLE"));
     * customerDao.delete(customerDao.retrieve("gezegde")); sessionFactory.getCurrentSession().flush(); assertEquals(1,
     * SimpleJdbcTestUtils.countRowsInTable( simpleJdbcTemplate, "Customer_TABLE"));
     * customerDao.delete(customerDao.retrieve("lijdend voorwerp")); sessionFactory.getCurrentSession().flush();
     * assertEquals(0, SimpleJdbcTestUtils.countRowsInTable( simpleJdbcTemplate, "Customer_TABLE"));
     * customerDao.delete(new Customer("bestaat niet")); }
     * 
     *//**
     * Test method for
     * {@link nl.ordina.innovation.architecture.customer.data.spring.dao.CustomerDaoImpl#listAllCustomers()}.
     */
    /*
     * @Test public void testListAllCustomers() { customerDao.add(new Customer("Pinokkio")); customerDao.add(new
     * Customer("Shrek")); customerDao.add(new Customer("Donkey")); sessionFactory.getCurrentSession().flush();
     * assertEquals(3, SimpleJdbcTestUtils.countRowsInTable( simpleJdbcTemplate, "Customer_TABLE")); List<Customer>
     * customers = customerDao.listAllCustomers(); assertNotNull(customers); assertEquals(3, customers.size()); // Om
     * willekeurige volgorde te vermijden. Collections.sort(customers, new CustomerComparator()); assertEquals("Donkey",
     * customers.get(0).getCustomerName()); assertEquals("Pinokkio", customers.get(1).getCustomerName());
     * assertEquals("Shrek", customers.get(2).getCustomerName()); }
     * 
     * public class CustomerComparator implements Comparator<Customer> {
     * 
     * public int compare(Customer o1, Customer o2) { return o1.compareTo(o2); } }
     */
}
