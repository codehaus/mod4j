/**
 * Extension point generated initially by Mod4j BusinessDomain DSL by BeanClassExtensionPoint in JavaBean.xpt at: Tue Feb 24 11:25:10 CET 2009
 */
package org.company.recordshop.domain;

import org.joda.time.DateTime;

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
	 * @param firstName (String) First name of the person.
	 * @param lastName (String) Last name of the person.
	 * @param birthDate (DateTime) 
	 * @param customerNr (int) 
	 */
	public Customer(String firstName, String lastName, DateTime birthDate,
			int customerNr) {
		super(firstName, lastName, birthDate, customerNr);
	}

}
