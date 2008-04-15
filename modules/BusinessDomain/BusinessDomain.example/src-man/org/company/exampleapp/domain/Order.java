package org.company.exampleapp.domain;

/**
 * Extension point initially generated at: Tue Apr 15 18:15:23 CEST 2008
 */
public class Order extends OrderImplBase {

	/**
	 *  Constructor for Order 
	 */
	public Order(Boolean isConfirmed, String logicalOrderId,
			Integer orderNumber, String orderDate) {
		super(isConfirmed, logicalOrderId, orderNumber, orderDate);
	}

}
