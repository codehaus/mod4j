package nl.ordina.mod4j.rbs.dao.stub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import nl.ordina.mod4j.rbs.dao.ComestibleDAO;
import nl.ordina.mod4j.rbs.dao.DAOException;
import nl.ordina.mod4j.rbs.model.Breakfast;
import nl.ordina.mod4j.rbs.model.Comestible;
import nl.ordina.mod4j.rbs.web.utils.Util;



public class ComestibleDAOImpl implements ComestibleDAO
{
	private static final long serialVersionUID = 1L;
	private List<Comestible> comestibles;
	private long id;

	private class NameComparator implements Comparator<Comestible>
	{
		@Override
		public int compare(Comestible comestible1, Comestible comestible2)
		{
			return comestible1.getName().compareTo(comestible2.getName());
		}
	}

	public ComestibleDAOImpl()
	{
		this(new ArrayList<Comestible>());
	}
	
	public ComestibleDAOImpl(List<Comestible> comestibles)
	{
		this.comestibles = comestibles;
		id = comestibles.size();
	}
	
	private synchronized long nextId()
	{
		return ++id;
	}

	@Override
	public Comestible getComestible(long id) throws DAOException
	{
		for (Comestible comestible : comestibles)
			if (id == comestible.getId())
				return comestible;
		return null;
	}

	@Override
	public Comestible getComestible(String name) throws DAOException
	{
		for (Comestible comestible : comestibles)
			if (name.equals(comestible.getName()))
				return comestible;
		return null;
	}

	@Override
	public long getComestibleCount() throws DAOException
	{
		return comestibles.size();
	}

	@Override
	public Collection<Comestible> getComestibles() throws DAOException
	{
		return comestibles;
	}

	@Override
	public Collection<Comestible> getComestibles(final int start, final int length) throws DAOException
	{
		return comestibles.subList(start,start + length);
	}

	@Override
	public Collection<Comestible> getUnusedComestibles(Breakfast breakfast) throws DAOException
	{
		return Util.getUnused(getComestibles(),breakfast);
	}

	@Override
	public void save (Comestible comestible) throws DAOException
	{
		if (comestible.getId() == null)
			comestible.setId(nextId());
		else
			delete(comestible);
		comestibles.add(comestible);
		Collections.sort(comestibles,new NameComparator());
	}

	@Override
	public void delete (Comestible comestible) throws DAOException
	{
		for (Comestible c : comestibles)
			if (c.getId().equals(comestible.getId()))
			{
				comestibles.remove(c);
				break;
			}
	}

}
