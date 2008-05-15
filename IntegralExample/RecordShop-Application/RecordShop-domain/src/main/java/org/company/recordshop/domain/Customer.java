package org.company.recordshop.domain;

/**
 * Extension point initially generated at: Tue May 13 12:39:03 CEST 2008
 */
public class Customer extends CustomerImplBase {

	/**
	 *  Minimal constructor for Customer
	
	 * @param firstName (String) 
	 * @param lastName (String) 
	 * @param sexe (Sexe) 
	

	 * @param customerId (int) 
	 * @param isBlackListed (boolean) 
	
	 */
	public Customer(String firstName, String lastName, Sexe sexe,
			int customerId, boolean isBlackListed) {

		super(firstName, lastName, sexe, customerId, isBlackListed);
	}

}
