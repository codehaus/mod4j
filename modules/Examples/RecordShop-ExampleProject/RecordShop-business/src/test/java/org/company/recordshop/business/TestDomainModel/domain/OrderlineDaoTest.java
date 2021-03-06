package org.company.recordshop.business.TestDomainModel.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.company.recordshop.business.data.AbstractDaoTestCase;
import org.company.recordshop.business.recordshopcore.data.OrderLineDao;
import org.company.recordshop.business.recordshopcore.domain.OrderLine;
import org.company.recordshop.business.recordshopcore.domain.Product;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Johan Vogelzang
 */
public class OrderlineDaoTest extends AbstractDaoTestCase {

	@Autowired
	private OrderLineDao orderLineDao;

	@Test
	public void testAddAndRetrieve() {
       
	    Product product = new Product("PRODNR-1234", BigDecimal.valueOf(99.99), true);
        
        OrderLine orderLine = new OrderLine(1, "ORDERLINE-1");
        orderLine.setProduct(product);
        
        orderLineDao.add(orderLine);
        flush();
        clear();

        OrderLine saved = orderLineDao.retrieve(orderLine.getId());
        assertTrue(saved.getProduct().getId() > 0);
        assertEquals("PRODNR-1234", saved.getProduct().getProductNumber());
    }
}
