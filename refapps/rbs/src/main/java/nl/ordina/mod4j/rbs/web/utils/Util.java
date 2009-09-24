package nl.ordina.mod4j.rbs.web.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import nl.ordina.mod4j.rbs.model.Breakfast;
import nl.ordina.mod4j.rbs.model.Comestible;
import nl.ordina.mod4j.rbs.model.Part;



public class Util implements Serializable
{
	private static final long serialVersionUID = 1L;

	public Collection<Comestible> getUnused(ArrayList<Comestible> comestibles, Breakfast breakfast)
	{
		return getUnused((Collection<Comestible>)comestibles,breakfast);
	}
	
	public static Collection<Comestible> getUnused(Collection<Comestible> comestibles, Breakfast breakfast)
	{
		Collection<Comestible> remove = new ArrayList<Comestible>();
		for (Part part : breakfast.getParts())
			for (Comestible comestible : comestibles)
				if (part.getComestible().getId().equals(comestible.getId()))
				{
					remove.add(comestible);
					break;
				}
		comestibles.removeAll(remove);
		return comestibles;
	}
	
}
