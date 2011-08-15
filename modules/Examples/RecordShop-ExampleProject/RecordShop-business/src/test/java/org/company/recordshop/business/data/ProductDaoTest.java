package org.company.recordshop.business.data;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.company.recordshop.business.recordshopcore.data.ProductDao;
import org.company.recordshop.business.recordshopcore.domain.Product;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Johan Vogelzang
 */
public class ProductDaoTest extends AbstractDaoTestCase {

    @Autowired
    private ProductDao productDao;

    @Test
    public void testAddAndRetrieve() {

        Product product = new Product("PRODNR-1234", BigDecimal.valueOf(99.99), true);

        productDao.add(product);
        flush();
        clear();

        Product saved = productDao.retrieve(product.getId());
        assertEquals("PRODNR-1234", saved.getProductNumber());

    }
}
