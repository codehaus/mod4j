/**
 * Extension Point initial generated at: Thu Jul 03 22:38:37 CEST 2008
 */
package org.company.recordshop.domain;

/**
 * A Person represents a legal person.
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
public class Person extends PersonImplBase {

	/**
	 * Default no-argument constructor for Person 
	 */
	protected Person() {

	}

	/**
	 * Minimal constructor for Person
	 * @param firstName (string) First name of the person.
	 * @param lastName (string) Last name of the person.
	 */
	public Person(String firstName, String lastName) {
		super(firstName, lastName);
	}

}