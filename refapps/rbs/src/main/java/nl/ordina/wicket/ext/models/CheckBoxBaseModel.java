package nl.ordina.wicket.ext.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.apache.wicket.model.IModel;


public class CheckBoxBaseModel implements IModel, Serializable
{
	private static final long serialVersionUID = 1L;
	private final IModel model;
	private List<IModel> selectedModels; 

	public CheckBoxBaseModel(List<IModel> selectedModels, IModel model)
	{
		this.selectedModels = selectedModels;
		this.model = model;
	}
	public IModel getNestedModel()
	{
		return null;
	}
	public Object getObject()
	{
		return isBookAlreadyMarkedForCheckout();
	}
	private Boolean isBookAlreadyMarkedForCheckout()
	{
		if (selectedModels.contains(model))
			return Boolean.TRUE;
		else
			return Boolean.FALSE;
	}
	public void setObject(Object object)
	{
		boolean selected = ((Boolean)object).booleanValue();
		boolean previouslySelected = isBookAlreadyMarkedForCheckout().booleanValue();
		if (selected)
		{
			if (!previouslySelected)
				selectedModels.add(model);
		}
		else
		{
			if (previouslySelected)
				selectedModels.remove(model);
		}
	}
	public void detach()
	{
	}
	
	public static List<IModel> newSelectedList()
	{
		//??? TreeSet<IModel>(new Comparator(){})
		return new ArrayList<IModel>()
		{
			private static final long serialVersionUID = 1L;

			@Override
			public boolean contains(Object o)
			{
				Iterator<IModel> i = iterator();
				IModel model = (IModel)o;
				while (i.hasNext())
					if (((BaseModel)model.getObject()).getId().equals(((BaseModel)i.next().getObject()).getId()))
						return true;
				return false;
			}
			
			@Override
			public boolean remove(Object o)
			{
				Iterator<IModel> i = iterator();
				IModel model = (IModel)o;
				while (i.hasNext())
				{
					IModel item = i.next();
					if (((BaseModel)model.getObject()).getId().equals(((BaseModel)item.getObject()).getId()))
						return super.remove(item);
				}
				return false;
			}
		}
	;
	}

}
