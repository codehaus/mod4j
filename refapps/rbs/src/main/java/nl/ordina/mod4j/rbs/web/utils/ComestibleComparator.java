package nl.ordina.mod4j.rbs.web.utils;

import java.io.Serializable;
import java.util.Comparator;

import nl.ordina.mod4j.rbs.model.Part;

public class ComestibleComparator implements Serializable, Comparator<Part>
{
	private static final long serialVersionUID = 1L;

	@Override
	public int compare(Part part1, Part part2)
	{
		return part1.getComestible().getName().compareTo(part2.getComestible().getName());
	}

}
