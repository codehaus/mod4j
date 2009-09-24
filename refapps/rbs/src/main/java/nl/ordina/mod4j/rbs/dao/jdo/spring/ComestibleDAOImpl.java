package nl.ordina.mod4j.rbs.dao.jdo.spring;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

import javax.jdo.JDOException;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import nl.ordina.mod4j.rbs.dao.ComestibleDAO;
import nl.ordina.mod4j.rbs.dao.DAOException;
import nl.ordina.mod4j.rbs.model.Breakfast;
import nl.ordina.mod4j.rbs.model.Comestible;
import nl.ordina.mod4j.rbs.web.utils.Util;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.jdo.JdoCallback;
import org.springframework.orm.jdo.support.JdoDaoSupport;



public class ComestibleDAOImpl extends JdoDaoSupport implements ComestibleDAO
{
	private static final long serialVersionUID = 1L;

	@Override
	public Comestible getComestible(long id) throws DAOException
	{
		Comestible comestible = (Comestible)getJdoTemplate().getObjectById(Comestible.class,id);
		return getPersistenceManager().detachCopy(comestible);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Comestible getComestible(String name) throws DAOException
	{
		try
		{
			Comestible comestible = (Comestible)((Collection)getJdoTemplate().find(Comestible.class,"name == pName","java.lang.String pName",new Object[]{name})).iterator().next();
			return getPersistenceManager().detachCopy(comestible);
		}
		catch(NoSuchElementException e)
		{
			return null;
		}
	}

	@Override
	public long getComestibleCount() throws DAOException
	{
		try
		{
			return (Long)getJdoTemplate().execute(
				new JdoCallback()
				{
					@SuppressWarnings("unchecked")
					@Override
					public Long doInJdo(PersistenceManager pm) throws JDOException
					{
						Query query = pm.newQuery(Comestible.class);
						//query.setResult("size()");
						query.setResult("count(name)");
						return (Long)query.execute();
					}
				}
			);
		}
		catch (DataAccessException e)
		{
			throw new DAOException(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Comestible> getComestibles() throws DAOException
	{
		try
		{
	    Collection<Comestible> comestibles = getJdoTemplate().find(Comestible.class,null,"name ascending");
	    return getPersistenceManager().detachCopyAll(comestibles);
		}
		catch (DataAccessException e)
		{
			throw new DAOException(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Comestible> getComestibles(final int start, final int length) throws DAOException
	{
		try
		{
			Collection<Comestible> comestibles = (Collection<Comestible>)getJdoTemplate().execute(
				new JdoCallback()
				{
					@Override
					public Collection<Comestible> doInJdo(PersistenceManager pm) throws JDOException
					{
						Query query = pm.newQuery(Comestible.class);
						query.setOrdering("name ascending");
						query.setRange(start,start + length);
						List<Comestible> result = (List<Comestible>)query.execute();
						return pm.detachCopyAll(result);
					}
				}
			);
			return comestibles;
		}
		catch (DataAccessException e)
		{
			throw new DAOException(e);
		}
	}

	@Override
	public Collection<Comestible> getUnusedComestibles(Breakfast breakfast) throws DAOException
	{
		return Util.getUnused(getComestibles(),breakfast);
	}

	@Override
	public void save (Comestible comestible) throws DAOException
	{
		try
		{
			getJdoTemplate().makePersistent(comestible);
		}
		catch (DataAccessException e)
		{
			throw new DAOException(e);
		}
	}

	@Override
	public void delete (Comestible comestible) throws DAOException
	{
		try
		{
			getJdoTemplate().deletePersistent(comestible);
		}
		catch (DataAccessException e)
		{
			throw new DAOException(e);
		}
	}

}
