
/**
 * Extension point generated initially by Mod4j BusinessDomain DSL by BeanClassExtensionPoint in NewJavaBean.xpt at: Fri Mar 13 10:00:52 CET 2009
 */
package org.company.recordshop.domain;

import org.joda.time.DateTime;
import org.joda.time.Years;

/**
 * A Person represents a legal person.
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
@SuppressWarnings("serial")
public class Person extends PersonImplBase {

	/**
	 * Default no-argument constructor for Person 
	 */
	protected Person() {

	}

	/**
	 * Minimal constructor for Person
	 * @param firstName (String) First name of the person.
	 * @param lastName (String) Last name of the person.
	 * @param birthDate (DateTime) 
	 */
	public Person(String firstName, String lastName, DateTime birthDate) {
		super(firstName, lastName, birthDate);
	}

	protected Person(Long id) {
        super(id);
    }

    @Override
	public Integer getAge() {
		
        return Years.yearsBetween(birthDate, new DateTime()).getYears();
	}

	

}
