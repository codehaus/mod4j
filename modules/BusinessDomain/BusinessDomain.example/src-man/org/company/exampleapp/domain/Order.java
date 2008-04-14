package org.company.exampleapp.domain;

/**
 * Initialy generated at: Mon Apr 14 23:24:15 CEST 2008
 */
public class Order extends OrderImplBase {

	/**
	 *  Constructor for Order 
	 */
	Order(Boolean isConfirmed, String logicalOrderId, Integer orderNumber,
			String orderDate) {
		super(isConfirmed, logicalOrderId, orderNumber, orderDate);
	}

}
