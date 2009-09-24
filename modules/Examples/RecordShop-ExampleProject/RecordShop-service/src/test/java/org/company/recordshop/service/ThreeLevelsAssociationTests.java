package org.company.recordshop.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.company.recordshop.service.dto.CustomerWithOrdersAndOrderLines;
import org.company.recordshop.service.dto.FullProductDto;
import org.company.recordshop.service.dto.OrderLineDto;
import org.company.recordshop.service.dto.OrderWithOrderLinesDto;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author Johan Vogelzang
 *
 */
public class ThreeLevelsAssociationTests extends AbstractServiceTestCase {
    
    @Autowired
    private CustomerServiceModelLocalService customerServiceModelService;

    CustomerWithOrdersAndOrderLines customerDto;
    
    /**
     * Create a customer dto with orders and orderlines to be translated to a DO.
     */
    @Before public void setUp() {

        customerDto = new CustomerWithOrdersAndOrderLines();
        customerDto.setCustomerNr(1234);
        customerDto.setFirstName("Buyer");
        customerDto.setLastName("TheCustomer");
        customerDto.setBirthDate(new DateTime("1970-01-01"));

        FullProductDto productDto = new FullProductDto();
        productDto.setProductNumber("PRODNR-1");
        productDto.setPrice(99.99f);
        productDto.setOrderable(true);

        OrderWithOrderLinesDto order1 = new OrderWithOrderLinesDto();
        order1.setOrderNumber("ORDER-1");
        OrderLineDto orderLineDto1 = new OrderLineDto();
        orderLineDto1.setLineNumber(1);
        orderLineDto1.setDescription("ORDER-1-ORDERLINE-1");
        orderLineDto1.setProduct(productDto);
        OrderLineDto orderLineDto2 = new OrderLineDto();
        orderLineDto2.setLineNumber(2);
        orderLineDto2.setDescription("ORDER-1-ORDERLINE-2");
        orderLineDto2.setProduct(productDto);
        order1.addToOrderLines(orderLineDto1);
        order1.addToOrderLines(orderLineDto2);

        OrderWithOrderLinesDto order2 = new OrderWithOrderLinesDto();
        order2.setOrderNumber("ORDER-2");
        OrderLineDto orderLineDto3 = new OrderLineDto();
        orderLineDto3.setLineNumber(1);
        orderLineDto3.setDescription("ORDER-2-ORDERLINE-1");
        orderLineDto3.setProduct(productDto);
        OrderLineDto orderLineDto4 = new OrderLineDto();
        orderLineDto4.setLineNumber(2);
        orderLineDto4.setDescription("ORDER-2-ORDERLINE-2");
        orderLineDto4.setProduct(productDto);
        order2.addToOrderLines(orderLineDto3);
        order2.addToOrderLines(orderLineDto4);

        customerDto.addToOrders(order1);
        customerDto.addToOrders(order2);
    }

    @Test
    public void testCreateCustomerWithOrdersAndOrderLinesAndProducts() throws Exception {

        /**
         * Save, flush and check.
         */
        
        CustomerWithOrdersAndOrderLines createdCustomer = customerServiceModelService.createCustomer(customerDto);
        flush();
        
        assertEquals(2, createdCustomer.getOrders().size());
        for (OrderWithOrderLinesDto orderDto : createdCustomer.getOrders()) {
            assertTrue(orderDto.getId() > 0);
            assertEquals(2, orderDto.getOrderLines().size());
            for (OrderLineDto orderLineDto : orderDto.getOrderLines()) {
                assertTrue(orderLineDto.getId() > 0);
                assertTrue(orderLineDto.getProduct().getId() > 0);
                assertTrue(orderLineDto.getDescription().contains("-ORDERLINE-" + orderLineDto.getLineNumber()));
                assertEquals("PRODNR-1", orderLineDto.getProduct().getProductNumber());
            }
        }
    }
    
    /**
     * Delete one orderline from each order, Update and check.
     */
    @Test
    public void testUpdateRemovedOrderLines() throws Exception {

        CustomerWithOrdersAndOrderLines createdCustomer = customerServiceModelService.createCustomer(customerDto);
        flush();
        
        for (OrderWithOrderLinesDto orderDto : createdCustomer.getOrders()) {
            OrderLineDto toBeRemoved = null;
            for (OrderLineDto orderLineDto : orderDto.getOrderLines()){
                if (orderLineDto.getLineNumber() == 1) {
                    toBeRemoved = orderLineDto;
                }
            }
            orderDto.removeFromOrderLines(toBeRemoved);
        }
        
        for (OrderWithOrderLinesDto orderDto : createdCustomer.getOrders()) {
            assertEquals(1, orderDto.getOrderLines().size());
        }
               
        //Update the complete customer structure in one service call.
        CustomerWithOrdersAndOrderLines updatedCustomer = customerServiceModelService.updateCustomer(createdCustomer);
        flush();
        
        assertEquals(2, updatedCustomer.getOrders().size());
        for (OrderWithOrderLinesDto updatedOrderDto : updatedCustomer.getOrders()) {
            assertEquals(1, updatedOrderDto.getOrderLines().size());
            for (OrderLineDto orderLineDto : updatedOrderDto.getOrderLines()) {
                assertTrue(2 == orderLineDto.getLineNumber());
            }
        }
    }

    /**
     * Add a new orderline to each order and check.
     */
    @Test
    public void testUpdateOrdersWithNewOrderLine() throws Exception {
       
        CustomerWithOrdersAndOrderLines createdCustomer = customerServiceModelService.createCustomer(customerDto);
        flush();

        OrderLineDto orderLineDtoNew = new OrderLineDto();
        orderLineDtoNew.setLineNumber(3);
        orderLineDtoNew.setDescription("ORDER-NEW-ORDERLINE-3");

        for (OrderWithOrderLinesDto orderDto : createdCustomer.getOrders()) {
            orderDto.addToOrderLines(orderLineDtoNew);
        }

        //Update the complete customer structure in one service call.
        CustomerWithOrdersAndOrderLines updatedCustomer = customerServiceModelService.updateCustomer(createdCustomer);
        flush();

        assertEquals(2, updatedCustomer.getOrders().size());
        for (OrderWithOrderLinesDto updatedOrderDto : updatedCustomer.getOrders()) {
            assertEquals(3, updatedOrderDto.getOrderLines().size());
            for (OrderLineDto orderLineDto : updatedOrderDto.getOrderLines()) {
                if (orderLineDto.getLineNumber() == 3) {
                    assertTrue("ORDER-NEW-ORDERLINE-3".equals(orderLineDto.getDescription()));    
                }
            }
        }
    }
    
    /**
     * Update the several attribute values through the hierarchy.
     */
    @Test
    public void testChangeValueInOrderLine() throws Exception {
      
        CustomerWithOrdersAndOrderLines createdCustomer = customerServiceModelService.createCustomer(customerDto);
        flush();
        
        createdCustomer.setLastName("-CHICKEN-IN-");
        for (OrderWithOrderLinesDto orderDto : createdCustomer.getOrders()) {
            for (OrderLineDto orderLine: orderDto.getOrderLines()){
                orderLine.setDescription("-THE-BASKET-");
                orderLine.getProduct().setPrice(10f);
            }
        }

        //Update the complete customer structure in one service call.
        CustomerWithOrdersAndOrderLines updatedCustomer = customerServiceModelService.updateCustomer(createdCustomer);
        flush();
              
        assertTrue(updatedCustomer.getLastName().equals("-CHICKEN-IN-"));
        for (OrderWithOrderLinesDto orderDto : updatedCustomer.getOrders()) {
            for (OrderLineDto orderLine: orderDto.getOrderLines()){
                assertTrue(orderLine.getDescription().equals("-THE-BASKET-"));
                assertTrue(orderLine.getProduct().getPrice() == 10f);
            }
        }
        
    }    
}