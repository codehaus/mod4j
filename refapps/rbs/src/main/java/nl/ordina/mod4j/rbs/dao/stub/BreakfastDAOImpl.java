package nl.ordina.mod4j.rbs.dao.stub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import nl.ordina.mod4j.rbs.dao.BreakfastDAO;
import nl.ordina.mod4j.rbs.dao.DAOException;
import nl.ordina.mod4j.rbs.model.Breakfast;
import nl.ordina.mod4j.rbs.model.Part;



public class BreakfastDAOImpl implements BreakfastDAO
{
	private List<Breakfast> breakfasts;
	private long id;

	private class NameComparator implements Comparator<Breakfast>
	{
		@Override
		public int compare(Breakfast breakfast1, Breakfast breakfast2)
		{
			return breakfast1.getName().compareTo(breakfast2.getName());
		}
	}

	public BreakfastDAOImpl()
	{
		this(new ArrayList<Breakfast>());
	}
	
	public BreakfastDAOImpl(List<Breakfast> breakfasts)
	{
		this.breakfasts = breakfasts;
		id = breakfasts.size();
	}
	
	private synchronized long nextId()
	{
		return ++id;
	}

	@Override
	public Breakfast getBreakfast(long id) throws DAOException
	{
		for (Breakfast breakfast : breakfasts)
			if (id == breakfast.getId())
				return breakfast;
		return null;
	}

	@Override
	public Breakfast getBreakfast(String name) throws DAOException
	{
		for (Breakfast breakfast : breakfasts)
			if (name.equals(breakfast.getName()))
				return breakfast;
		return null;
	}

	@Override
	public long getBreakfastCount() throws DAOException
	{
		return breakfasts.size();
	}

	@Override
	public Collection<Breakfast> getBreakfasts() throws DAOException
	{
		return breakfasts;
	}

	@Override
	public Collection<Breakfast> getBreakfasts(final int start, final int length) throws DAOException
	{
		return breakfasts.subList(start,start + length);
	}

	public void save (Breakfast breakfast) throws DAOException
	{
		if (breakfast.getId() == null)
			breakfast.setId(nextId());
		else
			delete(breakfast);
		long id = 0;
		for (Part part : breakfast.getParts())
			part.setId(id++);
		breakfasts.add(breakfast);
		Collections.sort(breakfasts,new NameComparator());
	}

	public void delete (Breakfast breakfast) throws DAOException
	{
		for (Breakfast b : breakfasts)
			if (b.getId().equals(breakfast.getId()))
			{
				breakfasts.remove(b);
				break;
			}
	}

}
