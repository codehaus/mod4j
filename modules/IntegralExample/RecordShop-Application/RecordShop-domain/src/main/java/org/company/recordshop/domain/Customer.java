package org.company.recordshop.domain;

/**
 * Extension point initially generated at: Sat May 10 20:55:16 CEST 2008
 */
public class Customer extends CustomerImplBase {

	/**
	 *  Minimal constructor for Customer
	
	 * @param firstName (String) 
	 * @param lastName (String) 
	 * @param numberOfEars (int) 
	

	 * @param customerId (int) 
	 * @param isBlackListed (boolean) 
	
	 */
	public Customer(String firstName, String lastName, int numberOfEars,
			int customerId, boolean isBlackListed) {

		super(firstName, lastName, numberOfEars, customerId, isBlackListed);
	}

}
