package org.company.recordshop.business.recordshopcore.domain.businessrules;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.math.BigDecimal;

import org.company.recordshop.business.recordshopcore.domain.OrderLine;
import org.company.recordshop.business.recordshopcore.domain.Product;
import org.junit.Test;
import org.mod4j.runtime.exception.BusinessRuleException;

/**
 * @author Johan Vogelzang
 */
public class ProductMinQuantityBusinessRuleValidationTest {

	
	@Test
	public final void testUpdateOrderLineQauntity() {
		
		Product product = new Product("1234", BigDecimal.ONE, true);
		product.setMinimalQuantity(2);
		OrderLine orderline = new OrderLine(1, "Test line");
		orderline.setQuantity(1);
		try {
			orderline.setProduct(product);
			fail("A BusinessRuleException should be thrown");
		} catch (BusinessRuleException bre) {
			assertTrue( bre.getMessage().contains("orderline.invalid.quantity"));
		}		
		
	}

}
