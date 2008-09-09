/**
 * Extension Point initial generated at: Thu Jul 03 22:38:37 CEST 2008
 */
package org.company.recordshop.domain;

/**
 * A Customer represents a Person who orders from the RecordShop.
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
public class Customer extends CustomerImplBase {

	/**
	 * Default no-argument constructor for Customer 
	 */
	protected Customer() {
		super();
	}

	/**
	 * Minimal constructor for Customer
	 * @param firstName (string) First name of the person.
	 * @param lastName (string) Last name of the person.
	 * @param customerNr (integer) 
	 */
	public Customer(String firstName, String lastName, int customerNr) {
		super(firstName, lastName, customerNr);
	}

}