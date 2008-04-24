package org.company.exampleappXtext.domain;

import java.util.Date;

/**
 * Extension point initially generated at: Thu Apr 24 11:57:43 CEST 2008
 */
public class Order extends OrderImplBase {

	/**
	 *  Minimal constructor for Order
	
	 * @param orderNumber (String) 
	 * @param orderDate (Date) 
	 * @param deliveryDate (Date) 
	
	 */
	public Order(String orderNumber, Date orderDate, Date deliveryDate) {
		super(orderNumber, orderDate, deliveryDate);
	}

}
