package org.company.recordshop.domain;

import org.joda.time.*;

/**
 * Extension point initially generated at: Tue May 13 12:39:03 CEST 2008
 */
public class Order extends OrderImplBase {

	/**
	 *  Minimal constructor for Order
	
	 * @param orderNumber (String) 
	 * @param totalAmount (float) 
	
	 */
	public Order(String orderNumber, float totalAmount) {

		super(orderNumber, totalAmount);
	}

}
