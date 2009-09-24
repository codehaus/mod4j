package nl.ordina.wicket.ext.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.model.IModel;


public class CheckBoxObjectModel implements IModel, Serializable
{
	private static final long serialVersionUID = 1L;
	private final BaseModel model;
	private List<BaseModel> selectedModels; 

	public CheckBoxObjectModel(List<BaseModel> selectedModels, BaseModel model)
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
	
	public static List<BaseModel> newSelectedList()
	{
		return new ArrayList<BaseModel>();
	}

}
