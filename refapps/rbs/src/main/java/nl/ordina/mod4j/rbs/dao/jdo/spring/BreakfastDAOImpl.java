package nl.ordina.mod4j.rbs.dao.jdo.spring;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

import javax.jdo.JDOException;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import nl.ordina.mod4j.rbs.dao.BreakfastDAO;
import nl.ordina.mod4j.rbs.dao.DAOException;
import nl.ordina.mod4j.rbs.model.Breakfast;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.jdo.JdoCallback;
import org.springframework.orm.jdo.support.JdoDaoSupport;



public class BreakfastDAOImpl extends JdoDaoSupport implements BreakfastDAO
{

	@Override
	public Breakfast getBreakfast(final long id) throws DAOException
	{
		getPersistenceManager().getFetchPlan().setMaxFetchDepth(-1);
		Breakfast breakfast = (Breakfast)getJdoTemplate().getObjectById(Breakfast.class,id);
		return getPersistenceManager().detachCopy(breakfast);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Breakfast getBreakfast(String name) throws DAOException
	{
		try
		{
			Breakfast breakfast = (Breakfast)((Collection)getJdoTemplate().find(Breakfast.class,"name == pName","java.lang.String pName",new Object[]{name})).iterator().next();
			return getPersistenceManager().detachCopy(breakfast);
		}
		catch(NoSuchElementException e)
		{
			return null;
		}
	}

	@Override
	public long getBreakfastCount() throws DAOException
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
						Query query = pm.newQuery(Breakfast.class);
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
	public Collection<Breakfast> getBreakfasts() throws DAOException
	{
		try
		{
	    Collection<Breakfast> breakfasts = getJdoTemplate().find(Breakfast.class,null,"name ascending");
	    return getPersistenceManager().detachCopyAll(breakfasts);
		}
		catch (DataAccessException e)
		{
			throw new DAOException();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Breakfast> getBreakfasts(final int start, final int length) throws DAOException
	{
		try
		{
			Collection<Breakfast> breakfasts = (Collection<Breakfast>)getJdoTemplate().execute(
				new JdoCallback()
				{
					@Override
					public Collection<Breakfast> doInJdo(PersistenceManager pm) throws JDOException
					{
						Query query = pm.newQuery(Breakfast.class);
						query.getFetchPlan().setMaxFetchDepth(-1);
						query.setOrdering("name ascending");
						query.setRange(start,start + length);
						List<Breakfast> result = (List<Breakfast>)query.execute();
						return pm.detachCopyAll(result);
					}
				}
			);
			return breakfasts;
		}
		catch (DataAccessException e)
		{
			throw new DAOException(e);
		}
	}

	public void save (Breakfast breakfast) throws DAOException
	{
		try
		{
			getJdoTemplate().makePersistent(breakfast);
		}
		catch (DataAccessException e)
		{
			throw new DAOException(e);
		}
	}

	public void delete (Breakfast breakfast) throws DAOException
	{
		try
		{
			getJdoTemplate().deletePersistent(breakfast);
		}
		catch (DataAccessException e)
		{
			throw new DAOException(e);
		}
	}

}
