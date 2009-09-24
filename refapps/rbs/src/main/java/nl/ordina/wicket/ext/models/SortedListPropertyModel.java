package nl.ordina.wicket.ext.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.apache.wicket.model.PropertyModel;

public class SortedListPropertyModel<T> extends PropertyModel
{
	private static final long serialVersionUID = 1L;
	private Comparator<T> comparator;

	public SortedListPropertyModel(Object object, String expression, Comparator<T> comparator)
	{
		super(object,expression);
		this.comparator = comparator;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Object getObject()
	{
		Object object = super.getObject();
		if (object != null)
		{
			if (object instanceof Set)
			{
				ArrayList<T> list = new ArrayList<T>((Set<T>)object);
				Collections.sort(list,comparator);
				object = list;
			}
			else if (object instanceof List)
				Collections.sort((List)object,comparator);
			else
				object = Arrays.asList(object);
		}
		else
			object = new ArrayList();
		return object;
	}
	
	@Override
	public void setObject(Object object)
	{
		super.setObject(object);
	}
	
//	@Override
//	public void setObject(Serializable object)
//	{
//		super.setObject(object);
//	}

}
