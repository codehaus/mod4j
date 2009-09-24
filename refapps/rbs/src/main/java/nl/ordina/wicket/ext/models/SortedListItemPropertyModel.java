package nl.ordina.wicket.ext.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.apache.wicket.model.PropertyModel;

public class SortedListItemPropertyModel<T> extends PropertyModel
{
	private static final long serialVersionUID = 1L;
	private Comparator<T> comparator;

	public SortedListItemPropertyModel(Serializable object, String expression, Comparator<T> comparator)
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
				if (((Set<T>)object).size() > 0)
				{
					ArrayList<T> list = new ArrayList<T>((Set<T>)object);
					Collections.sort(list,comparator);
					object = list.get(0);
				}
				else
					object = null;
			}
			else if (object instanceof List)
			{
				if (((List<T>)object).size() > 0)
				{
					Collections.sort((List)object,comparator);
					object = ((List)object).get(0);
				}
				else
					object = null;
			}
		}
		return object;
	}
	
	@Override
	public void setObject(Object object)
	{
		super.setObject(object);
	}
	
}
