package org.company.recordshop.domain;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OrderImplementsDerivedTotalAmountTest {

    @Test
    public void testGetTotalAmount() {
        
        OrderLine orderline1 = new OrderLine(1, "1", 0.0F);
        OrderLine orderline2 = new OrderLine(2, "2", 0.0F);
        OrderLine orderline3 = new OrderLine(3, "3", 0.0F);
        OrderLine orderline4 = new OrderLine(4, "4", 0.0F);
        OrderLine orderline5 = new OrderLine(5, "5", 0.0F);
        
        orderline1.setLineAmount(100.00F);
        orderline2.setLineAmount(200.00F);
        orderline3.setLineAmount(300.00F);
        orderline4.setLineAmount(400.00F);
        orderline5.setLineAmount(500.00F);
        
        Order order = new Order();
        order.addToOrderLines(orderline1);
        order.addToOrderLines(orderline2);
        order.addToOrderLines(orderline3);
        order.addToOrderLines(orderline4);
        order.addToOrderLines(orderline5);
        assertTrue("Order totalAmount should be equal to 1500.0", order.getTotalAmount() == 1500.0F);
        
    }
}
