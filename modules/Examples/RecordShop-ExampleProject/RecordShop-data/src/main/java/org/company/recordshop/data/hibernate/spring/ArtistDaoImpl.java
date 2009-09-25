
/**
 * Extension point, initially generated by Mod4j. 
 *     Time             : Fri Sep 25 11:52:18 CEST 2009
 *     Application model: Artist
 *     Generator        :  Mod4j BusinessDomainDsl generator: DaoImpl.xpt
 *
 * It is intended to customize and maintain this file by hand. 
 * If you remove this file, it will be regenerated by Mod4j.
 */

package org.company.recordshop.data.hibernate.spring;

import org.company.recordshop.data.ArtistDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;

/**
 * Artist Data Access Object (DOA) Implementation. Responsible for Creating,
 * Reading, Updating and Deleting Artist objects in the database. All database
 * access is done here.
 *  
 * @author Initially generated by Mod4j
 */
@Repository
public class ArtistDaoImpl extends ArtistDaoImplBase implements ArtistDao {

	@Autowired
	public ArtistDaoImpl(final SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
