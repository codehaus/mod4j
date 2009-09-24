package nl.ordina.mod4j.rbs.web.pages.comestible;

import java.util.Iterator;


import nl.ordina.mod4j.rbs.dao.ComestibleDAO;
import nl.ordina.mod4j.rbs.dao.DAOException;
import nl.ordina.mod4j.rbs.model.Comestible;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.wicket.markup.repeater.data.IDataProvider;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;


public class ComestibleDataProvider implements IDataProvider
{
	private static final long serialVersionUID = 1L;
	private static final Log log = LogFactory.getLog(ComestibleDataProvider.class);
	private ComestibleDAO comestibleDAO;

	public ComestibleDataProvider(ComestibleDAO comestibleDAO)
	{
		this.comestibleDAO = comestibleDAO;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Iterator iterator(int first, int count)
	{
		try
		{
			return comestibleDAO.getComestibles(first,count).iterator();
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
		final Long id = ((Comestible)object).getId();
		return
			new LoadableDetachableModel()
			{
				private static final long serialVersionUID = 1L;

				@Override
				protected Object load()
				{
					try
					{
						return comestibleDAO.getComestible(id);
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
			return (int)comestibleDAO.getComestibleCount();
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
