package org.company.exampleappXtext.domain;

import org.joda.time.*;

/**
 * Extension point initially generated at: Fri May 09 20:40:52 CEST 2008
 */
public class Order extends OrderImplBase {

	/**
	 *  Minimal constructor for Order
	
	 * @param orderNumber (String) 
	 * @param orderDate (DateTime) 
	 * @param deliveryDate (DateTime) 
	
	 */
	public Order(String orderNumber, DateTime orderDate, DateTime deliveryDate) {
		super(orderNumber, orderDate, deliveryDate);
	}

}
