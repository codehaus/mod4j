
/**
 * Extension point, initially generated by Mod4j. 
 *     Time             : Fri Sep 25 11:52:19 CEST 2009
 *     Application model: Many2ManyOrderedTo
 *     Generator        :  Mod4j BusinessDomainDsl generator: DaoImpl.xpt
 *
 * It is intended to customize and maintain this file by hand. 
 * If you remove this file, it will be regenerated by Mod4j.
 */

package org.company.recordshop.data.hibernate.spring;

import org.company.recordshop.data.Many2ManyOrderedToDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;

/**
 * Many2ManyOrderedTo Data Access Object (DOA) Implementation. Responsible for Creating,
 * Reading, Updating and Deleting Many2ManyOrderedTo objects in the database. All database
 * access is done here.
 *  
 * @author Initially generated by Mod4j
 */
@Repository
public class Many2ManyOrderedToDaoImpl extends Many2ManyOrderedToDaoImplBase
		implements
			Many2ManyOrderedToDao {

	@Autowired
	public Many2ManyOrderedToDaoImpl(final SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
