package org.company.exampleapp.domain;

/**
 * Extension point initially generated at: Sat Apr 19 16:54:46 CEST 2008
 */
public class Order extends OrderImplBase {

	/**
	 *  Minimal constructor for Order
	
	 * @param isConfirmed (Boolean) 
	 * @param logicalOrderId (String) 
	 * @param orderNumber (Integer) The number of the order
	 * @param orderDate (String) The date of ordering yyyy/mm/dd
	
	 */
	public Order(Boolean isConfirmed, String logicalOrderId,
			Integer orderNumber, String orderDate) {
		super(isConfirmed, logicalOrderId, orderNumber, orderDate);
	}

}
