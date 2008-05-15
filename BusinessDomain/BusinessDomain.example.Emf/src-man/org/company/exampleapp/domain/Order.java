package org.company.exampleapp.domain;

/**
 * Extension point initially generated at: Fri May 09 15:39:19 CEST 2008
 */
public class Order extends OrderImplBase {

	/**
	 *  Minimal constructor for Order
	
	 * @param isConfirmed (Boolean) 
	 * @param logicalOrderId (String) 
	 * @param orderNumber (Integer) The number of the order
	
	 */
	public Order(Boolean isConfirmed, String logicalOrderId, Integer orderNumber) {
		super(isConfirmed, logicalOrderId, orderNumber);
	}

}
