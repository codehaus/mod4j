/** Generated by Mod4j at Tue May 20 16:10:58 CEST 2008
 */
package org.company.recordshop.data.spring.dao;

import java.util.Iterator;
import java.util.List;

import org.company.recordshop.domain.Order;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Order Data Access Object (DOA) Implementation. Responsible for Creating,
 * Reading, Updating and Deleting Order objects in the database. All database
 * access is done here.
 *  
 * @author Generated by Mod4j
 */
public class OrderDaoImpl extends HibernateDaoSupport implements OrderDao {

	public Order retrieve(long id) {
		Object o = getHibernateTemplate().get(Order.class, new Long(id));
		if (o == null) {
			return null;
		}
		return (Order) o;
	}

	public Order add(Order object) {
		getHibernateTemplate().save(object);
		return object;
	}

	public Order update(Order object) {
		getHibernateTemplate().save(object);
		return object;
	}

	public void delete(Order order) {
		getHibernateTemplate().delete(order);
	}

	@SuppressWarnings("unchecked")
	public List<Order> listAllOrders() {
		return getHibernateTemplate().find("from Order");
	}
}
