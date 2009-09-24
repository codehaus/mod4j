package nl.ordina.mod4j.rbs.web.pages.home;


import nl.ordina.mod4j.rbs.web.templates.RBSTemplate;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.FeedbackPanel;


public class HomePage extends RBSTemplate
{
	public HomePage()
	{
		this(new PageParameters());
	}

	public HomePage(PageParameters parameters)
	{
		super();
		add(new FeedbackPanel("feedback"));
	}

	@Override
	public String getPageTitle()
	{
		return getLocalizer().getString("lbl.home",this);
	}
}
