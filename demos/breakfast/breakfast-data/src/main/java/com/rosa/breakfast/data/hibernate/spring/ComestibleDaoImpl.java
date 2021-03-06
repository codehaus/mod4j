/**
 * Initially generated by Mod4j at Wed Apr 01 21:03:34 CEST 2009
 */
package com.rosa.breakfast.data.hibernate.spring;

import java.util.List;

import com.rosa.breakfast.data.ComestibleDao;

/**
 * Comestible Data Access Object (DOA) Implementation. Responsible for Creating,
 * Reading, Updating and Deleting Comestible objects in the database. All
 * database access is done here.
 * 
 * @author Initially generated by Mod4j
 */
public class ComestibleDaoImpl extends ComestibleDaoImplBase implements
		ComestibleDao {

	@SuppressWarnings("unchecked")
	public boolean isComestibleUsed(Long comestibleId) {
		List<Long> result = getHibernateTemplate().findByNamedParam(
				"select count(*) from Part where comestible.id = :id", "id",
				comestibleId);
		return (result.get(0).intValue() > 0);
	}

}
