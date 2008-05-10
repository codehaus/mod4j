package org.company.recordshop.domain;

import org.joda.time.*;

/**
 * Extension point initially generated at: Sat May 10 20:55:16 CEST 2008
 */
public class Order extends OrderImplBase {

	/**
	 *  Minimal constructor for Order
	
	 * @param orderNumber (String) 
	 * @param orderDate (DateTime) 
	 * @param deliveryDate (DateTime) 
	 * @param discountPercentage (int) 
	 * @param totalAmount (float) 
	
	 */
	public Order(String orderNumber, DateTime orderDate, DateTime deliveryDate,
			int discountPercentage, float totalAmount) {

		super(orderNumber, orderDate, deliveryDate, discountPercentage,
				totalAmount);
	}

}
