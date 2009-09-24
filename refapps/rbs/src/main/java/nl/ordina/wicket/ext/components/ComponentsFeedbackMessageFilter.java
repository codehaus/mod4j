package nl.ordina.wicket.ext.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.wicket.Component;
import org.apache.wicket.feedback.FeedbackMessage;
import org.apache.wicket.feedback.IFeedbackMessageFilter;

public class ComponentsFeedbackMessageFilter implements IFeedbackMessageFilter
{
	private static final long serialVersionUID = 1L;
	private List<Component> components;
	
	public ComponentsFeedbackMessageFilter(Component ... components)
	{
		this.components = new ArrayList<Component>(Arrays.asList(components)); //Arrays.asList(components);
	}

	@Override
	public boolean accept(FeedbackMessage message)
	{
		return components.contains(message.getReporter());
	}

	public List<Component> getComponents()
	{
		return components;
	}

	public void setComponents(List<Component> components)
	{
		this.components = components;
	}

}
