package org.company.exampleapp.domain;

import org.junit.Test;
import org.junit.internal.runners.TestClassRunner;
import org.junit.runner.RunWith;

import junit.framework.TestCase;

@RunWith(TestClassRunner.class)
public class CustomerTest extends TestCase {
    
    @Test 
    public void createCustomer(){
        Customer cust = new Customer("Van Gogh", "Vincent" , "govinc");
        assertTrue("Customer lastname is Van Gogh", cust.getLastName().equals("Van Gogh"));
        
    }

    @Test 
    public void customerOrder(){

        Customer cust = new Customer("Van Gogh", "Vincent" , "govinc");
        cust.setNumberOfEars(1);
        Order order = new Order(Boolean.FALSE, "NR-1", Integer.valueOf(123),"1-1-2008");
        
        order.setCustomer(cust);
        cust.addOrder(order);
        assertTrue("Customer has order.", cust.getOrders().contains(order));
    }
}
