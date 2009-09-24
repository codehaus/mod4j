package nl.ordina.wicket.ext.components;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormComponentUpdatingBehavior;

public class AjaxUpdatingBehaviour extends AjaxFormComponentUpdatingBehavior
{
	private static final long serialVersionUID = 1L;
	private Component[] components;

	public AjaxUpdatingBehaviour(Component ... components)
	{
		this("onblur",components);
	}
	
	public AjaxUpdatingBehaviour(String event, Component ... components)
	{
		super(event);
		this.components = components;
	}

	@Override
	protected void onUpdate(AjaxRequestTarget target)
	{
		for (Component component : components)
			target.addComponent(component);
	}
	
	@Override
	protected void onError(AjaxRequestTarget target, RuntimeException e)
	{
		super.onError(target,e);
		for (Component component : components)
			target.addComponent(component);
	}

	public Component[] getComponents()
	{
		return components;
	}
	
}
