package org.company.recordshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.company.recordshop.data.spring.dao.CustomerDao;
import org.company.recordshop.data.spring.dao.OrderDao;
import org.company.recordshop.data.spring.dao.OrderLineDao;
import org.company.recordshop.data.spring.dao.ProductDao;
import org.company.recordshop.data.spring.dao.RecordDao;
import org.company.recordshop.domain.Customer;
import org.company.recordshop.domain.Order;
import org.company.recordshop.domain.OrderLine;
import org.company.recordshop.domain.Product;
import org.company.recordshop.domain.Record;
import org.company.recordshop.domain.Sexe;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.AssertThrows;
import org.springframework.test.jdbc.SimpleJdbcTestUtils;

/**
 * @author Jos Warmer
 * @author Eric Jan Malotaux
 */
public class AssociationTest extends AbstractDaoTestCase {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private OrderLineDao orderLineDao;

    @Autowired
    private RecordDao recordDao;

    @Autowired
    private ProductDao productDao;

    private List<Customer>  allCustomers  = new ArrayList<Customer>();
    private List<Order>     allOrders     = new ArrayList<Order>();
    private List<OrderLine> allOrderLines = new ArrayList<OrderLine>();
    private List<Record>    allRecords    = new ArrayList<Record>();
    private List<Product>   allProducts   = new ArrayList<Product>();
    
    protected Customer createCustomer(String firstname, String lastName, int custNr){
    	Customer result = new Customer(firstname, lastName, custNr);
    	allCustomers.add(result);
    	customerDao.add(result);
    	return result;
    }

    protected Order createOrder(String orderId, int discount){
    	Order result = new Order(orderId); //, ff);
    	result.setDiscountPercentage(discount);
    	allOrders.add(result);
    	orderDao.add(result);
    	return result;
    }

    protected OrderLine createOrderLine(int i, String desc, Float ff){
    	OrderLine result = new OrderLine(i, desc, ff);
    	allOrderLines.add(result);
    	orderLineDao.add(result);
    	return result;
    }
    
    protected Record createRecord(int i, String asin, Float ff){
    	Record result = new Record(asin, ff);
    	allRecords.add(result);
    	recordDao.add(result);
    	return result;
    }
    
    protected Product createProduct(String prodNr, int price){
    	Product result = new Product (prodNr, price);
    	allProducts.add(result);
    	productDao.add(result);
    	return result;
    }
    
    Customer c01, c02, c03, c04 ;
	Order oder01, order02, order03, o04, o05;
	OrderLine line01, line02, line03, line04, line05, line06; 
	Record record01, record02, record03, record04, record05, record06, r07;
	Product pr01, pr02, pr03, pr04;
	
	@Before
    public void createInstances() {
    	c01 = createCustomer("Jos"   , "Warmer"  , 1);
    	c02 = createCustomer("Piet"  , "Parel"   , 2);
    	c03 = createCustomer("Joanna", "Krater"  , 3);
    	c04 = createCustomer("Karen" , "Grootjes", 4);
    	
    	oder01 = createOrder("order01", 1);
    	order02 = createOrder("order02", 1);
    	order03 = createOrder("order03", 1);
    	o04 = createOrder("order04", 1);
    	o05 = createOrder("order05", 1);

    	c01.addToOrders(oder01);
    	c01.addToOrders(order02);
    	c01.addToOrders(order03);
    	c02.addToOrders(o04);
    	
    	line01 = createOrderLine(1, "line01", 0F);
    	line02 = createOrderLine(2, "line02", 0F);
    	line03 = createOrderLine(3, "line03", 0F);
    	line04 = createOrderLine(4, "line04", 0F);
    	line05 = createOrderLine(5, "line05", 0F);
    	line06 = createOrderLine(6, "line06", 0F);
    	
    	oder01.addToOrderLines(line01);
    	oder01.addToOrderLines(line02);
    	oder01.addToOrderLines(line03);
       	order02.addToOrderLines(line04);
    	order02.addToOrderLines(line05);
    	order03.addToOrderLines(line06);
    	
    	record01 = createRecord(1, "rec 01", 2F);
    	record02 = createRecord(1, "rec 02", 2F);
    	record03 = createRecord(1, "rec 03", 2F);
    	record04 = createRecord(1, "rec 04", 2F);
    	record05 = createRecord(1, "rec 05", 2F);
    	record06 = createRecord(1, "rec 06", 2F);
    	
    	line01.setRecord(record01);
    	line02.setRecord(record02);
    	line03.setRecord(record03);
    	line04.setRecord(record04);
    	line05.setRecord(record05);
    	line06.setRecord(record06);
    	
    	pr01 = createProduct("product 01", 1);
    	pr02 = createProduct("product 02", 2);
    	pr03 = createProduct("product 03", 3);
    	pr04 = createProduct("product 04", 4);
    	
    	record01.setProduct(pr01);
    	record02.setProduct(pr01);
    	record03.setProduct(pr01);
    	record04.setProduct(pr04);
    	
    	flush();
    }
	
	public Customer lookup(Collection<Customer> coll, String name) {
		for (Customer customer : coll) {
			if( customer.getFirstName() != null) {
				if( customer.getFirstName().equals(name) ){
					return customer;
				}
			} else {
				System.err.println("Customer  has null firstName");
			}
		}
		return null;
	}

	public Order lookup(Collection<Order> coll, String name) {
		for (Order order : coll) {
			if( order.getOrderNumber() != null) {
				if( order.getOrderNumber().equals(name) ){
					return order;
				}
			} else {
				System.err.println("Order number ["+ order.getOrderNumber()+ "] has null ordernumber");
			}
		}
		return null;
	}

	public Record lookup(Collection<Record> coll, String name) {
		for (Record  record : coll) {
			if( record .getAsin() != null) {
				if( record .getAsin().equals(name) ){
					return record ;
				}
			} else {
				System.err.println("Record asin has null asic");
			}
		}
		return null;
	}

	public Product lookup(Collection<Product> coll, String name) {
		for (Product product : coll) {
			if( product.getProductNumnber() != null) {
				if( product.getProductNumnber().equals(name) ){
					return product;
				}
			} else {
				System.err.println("product has null ProductNumnber");
			}
		}
		return null;
	}

	public OrderLine lookup(Collection<OrderLine> coll, int lineNr) {
		for (OrderLine line: coll) {
			if( line.getLineNumber() == lineNr){
				return line;
			}
		}
		return null;
	}
    
    @Test
    public void testAssociationsJava() {
    	customerAssociations( allCustomers );
    	orderAssociations(allOrders);
    	orderLineAssociations(allOrderLines);
    	recordAssociations(allRecords);
    	productAssociations(allProducts);
    }
    
    @Test
    public void testAssociationsHibernate() {
    	clear();
    	
    	allCustomers = customerDao.listAllCustomers();
    	// Chech whether new opbjects have been created, not the original cached ones.
    	assertEquals(false, allCustomers.contains(c01));
    	assertEquals(false, allCustomers.contains(c02));
    	assertEquals(false, allCustomers.contains(c03));
    	assertEquals(false, allCustomers.contains(c04));
    	assertEquals(4, allCustomers.size());
    	c01 = lookup(allCustomers, "Jos");
    	c02 = lookup(allCustomers, "Piet");
    	c03 = lookup(allCustomers, "Joanna");
    	c04 = lookup(allCustomers, "Karen");
    	
    	allOrders = orderDao.listAllOrders();
    	// Chech whether new opbjects have been created, not the original cached ones.
    	assertEquals(false, allOrders.contains(oder01));
    	assertEquals(false, allOrders.contains(order02));
    	assertEquals(false, allOrders.contains(order03));
    	assertEquals(false, allOrders.contains(o04));
    	assertEquals(false, allOrders.contains(o05));
    	assertEquals(5, allOrders.size());
    	oder01 = lookup(allOrders, "order01");
    	order02 = lookup(allOrders, "order02");
    	order03 = lookup(allOrders, "order03");
    	o04 = lookup(allOrders, "order04");
    	o05 = lookup(allOrders, "order05");
    	
    	allOrderLines = orderLineDao.listAllOrderLines();
    	line01 = lookup(allOrderLines, 1);
    	line02 = lookup(allOrderLines, 2);
    	line03 = lookup(allOrderLines, 3);
    	line04 = lookup(allOrderLines, 4);
    	line05 = lookup(allOrderLines, 5);
    	line06 = lookup(allOrderLines, 6);

    	allRecords = recordDao.listAllRecords();
    	record01 = lookup(allRecords, "rec 01");
    	record02 = lookup(allRecords, "rec 02");
    	record03 = lookup(allRecords, "rec 03");
    	record04 = lookup(allRecords, "rec 04");
    	record05 = lookup(allRecords, "rec 05");
    	record06 = lookup(allRecords, "rec 06");
    	
    	allProducts = productDao.listAllProducts();
    	pr01 = lookup(allProducts, "product 01");
    	pr02 = lookup(allProducts, "product 02");
    	pr03 = lookup(allProducts, "product 03");
    	pr04 = lookup(allProducts, "product 04");

   		instances();
   		
    	customerAssociations( allCustomers);
    	orderAssociations(allOrders);
    	orderLineAssociations(allOrderLines);
    	recordAssociations(allRecords);
    	productAssociations(allProducts);

    }
    
    public void customerAssociations(Collection<Customer> customers) {
        for (Customer c : customers) {
			for (Order o : c.getOrders()) {
				assertEquals("t1", true, o.getCustomer() == c);
			}
		}
    }
    
    public void orderAssociations(Collection<Order> orders) {
        for( Order o : orders) {
        	if( o.getCustomer() != null ){
        		assertEquals(true , o.getCustomer().getOrders().contains(o) );
        	}
        }
    }
        
    public void orderLineAssociations(Collection<OrderLine > orderLines) {
        for (OrderLine ol : orderLines) {
			Record r = ol.getRecord() ;
			if( r != null ) {
				assertEquals("t3", ol, r.getOrderLine());
			}
		}
    }

    public void recordAssociations(Collection<Record > records) {
        for( Record r : records) {
        	if( r.getOrderLine() != null ){
        		assertEquals(true , r.getOrderLine().getRecord() == r );
        	}
        	if( r.getProduct() != null ){
        		assertEquals(true, r.getProduct().getRecord().contains(r));
        	}
        }
    }

    public void productAssociations(Collection<Product > products ) {
        for( Product p : products) {
			for (Record r : p.getRecord() ) {
				assertEquals("t4", true, r.getProduct() == p);
			}
        }
    }
       
    @Test
    public void testInstances() {
    	instances();
    }
    
    public void instances() {
        assertEquals( true, c01.getOrders().contains(oder01) );
		assertEquals( true, c01.getOrders().contains(order02) );
		assertEquals( true, c01.getOrders().contains(order03) );
		assertEquals( true, c01.getOrders().size() == 3   );

		assertEquals( true, c02.getOrders().contains(o04) );
		assertEquals( true, c02.getOrders().size() == 1 );

		assertEquals( true, o05.getCustomer() == null);
    	
		assertEquals( true, oder01.getOrderLines().contains(line01) );
		assertEquals( true, oder01.getOrderLines().contains(line02) );
		assertEquals( true, oder01.getOrderLines().contains(line03) );

		assertEquals( true, order02.getOrderLines().contains(line04) );
		assertEquals( true, order02.getOrderLines().contains(line05) );

		assertEquals( true, order03.getOrderLines().contains(line06) );
		
		assertEquals(true , record01.getProduct() == pr01);
		assertEquals(true , record02.getProduct() == pr01);
		assertEquals(true , record03.getProduct() == pr01);
		assertEquals(true , record04.getProduct() == pr04);
		
		assertEquals( 3, pr01.getRecord().size());
		assertEquals( 0, pr02.getRecord().size());
		assertEquals( 0, pr03.getRecord().size());
		assertEquals( 1, pr04.getRecord().size());
    }
    
    @Test
    public void testDeleteAssociationsOne2Many() {

    	// Remove an element from a one2many at source side
    	c01.removeFromOrders(oder01);
    	assertEquals( true , c01.getOrders().size() == 2 );
        assertEquals( false, c01.getOrders().contains(oder01) );
    	assertEquals( true , oder01.getCustomer() == null);
    	
    	// Move an element from one one2many at source side to another one
        assertEquals( true , c02.getOrders().contains(o04) );
    	c01.addToOrders(o04);
        assertEquals( true , c01.getOrders().size() == 3 );
        assertEquals( true , c01.getOrders().contains(o04) );
        assertEquals( false, c02.getOrders().contains(o04) );
    	assertEquals( true , o04.getCustomer() == c01);
    	
       	// set from target side with existing source
    	order02.setCustomer(null);
    	assertEquals(true , order02.getCustomer() == null);
    	assertEquals(true , !c01.getOrders().contains(order02));

       	// set from target side withour existing source
    	o05.setCustomer(null);
    	assertEquals(true , o05.getCustomer() == null);

    	// set from target side withour existing source
    	o05.setCustomer(c04);
    	assertEquals(true , o05.getCustomer() == c04);
    	assertEquals(true , c04.getOrders().contains(o05));

    	// Move an element from one one2many at source side to another one
    	line01.setRecord(null);
        assertEquals( true , line01.getRecord() == null);
        assertEquals( true , record01.getOrderLine() == null);
 
    }

    public boolean existsOrderLineWithNumber(Set<OrderLine> orderlines, int num) {
    	
    	for(OrderLine  o : orderlines) {
			if( o.getLineNumber() == num ) return true;
		}
    	return false;
    }
}
