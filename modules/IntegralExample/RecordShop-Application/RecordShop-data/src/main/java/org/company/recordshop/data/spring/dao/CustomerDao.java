/** Generated by Mod4j at Tue May 20 16:10:58 CEST 2008
 */
package org.company.recordshop.data.spring.dao;

import java.util.List;

import org.company.recordshop.domain.Customer;

/**
 * CustomerDao Data Access Object (DAO). Responsible for accessing the forum database.
 * 
 * @author Mod4j generated
 * 
 */
public interface CustomerDao {

	/**
	 * Retrieves a Customer by its ID from the database.
	 * 
	 * @param id
	 *                id of the Customer to retrieve.
	 * @return Customer retrieved or null when no Customer was found.
	 */
	Customer retrieve(long id);

	/**
	 * Adds a new Customer to the database
	 * 
	 * @param customer
	 *                the Customer to add to the database.
	 * @return the stored Customer.
	 */
	Customer add(Customer customer);

	/**
	 * Stores/Updates the Customer in the database. Inclusive all its posts.
	 * 
	 * @param customer
	 *                the Customer to store/update
	 * @return
	 */
	Customer update(Customer customer);

	/**
	 * Deletes a Customer from the database.
	 * 
	 * @param customer
	 *                the Customer to delete
	 */
	void delete(Customer customer);

	/**
	 * Selects all Customers from the database.
	 * 
	 * @return a List of all Customer objects.
	 */
	List<Customer> listAllCustomers();
}
