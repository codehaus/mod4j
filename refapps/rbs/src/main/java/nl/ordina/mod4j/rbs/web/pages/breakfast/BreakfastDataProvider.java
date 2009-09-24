package nl.ordina.mod4j.rbs.web.pages.breakfast;

import java.util.Iterator;


import nl.ordina.mod4j.rbs.dao.BreakfastDAO;
import nl.ordina.mod4j.rbs.dao.DAOException;
import nl.ordina.mod4j.rbs.model.Breakfast;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.wicket.markup.repeater.data.IDataProvider;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;


public class BreakfastDataProvider implements IDataProvider
{
	private static final long serialVersionUID = 1L;
	private static final Log log = LogFactory.getLog(BreakfastDataProvider.class);
	private BreakfastDAO breakfastDAO;

	public BreakfastDataProvider(BreakfastDAO breakfastDAO)
	{
		this.breakfastDAO = breakfastDAO;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Iterator iterator(int first, int count)
	{
		try
		{
			return breakfastDAO.getBreakfasts(first,count).iterator();
		}
		catch (DAOException e)
		{
			log.error("",e);
			throw new RuntimeException(e);
		}
	}

	@Override
	public IModel model(Object object)
	{
		final Long id = ((Breakfast)object).getId();
		return
			new LoadableDetachableModel()
			{
				private static final long serialVersionUID = 1L;

				@Override
				protected Object load()
				{
					try
					{
						return breakfastDAO.getBreakfast(id);
					}
					catch (DAOException e)
					{
						log.error("",e);
						throw new RuntimeException(e);
					}
				}
			};
	}

	@Override
	public int size()
	{
		try
		{
			return (int)breakfastDAO.getBreakfastCount();
		}
		catch (DAOException e)
		{
			log.error("",e);
			throw new RuntimeException(e);
		}
	}

	@Override
	public void detach()
	{
	}

}
