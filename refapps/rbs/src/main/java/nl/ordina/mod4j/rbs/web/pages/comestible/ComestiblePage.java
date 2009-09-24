package nl.ordina.mod4j.rbs.web.pages.comestible;

import nl.ordina.mod4j.rbs.web.templates.RBSTemplate;
import nl.ordina.mod4j.rbs.web.utils.DecimalPropertyModel;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.PropertyModel;



public class ComestiblePage extends RBSTemplate
{
	public ComestiblePage(final IModel comestible)
	{
		add(new Label("name",new PropertyModel(comestible,"name")));
		add(new Label("minimalQuantity",new PropertyModel(comestible,"minimalQuantity")));
		add(new Label("price",new DecimalPropertyModel(comestible,"price")));
		add(new Label("transportForm",new PropertyModel(comestible,"transportForm")));
		add(
			new Link("edit")
			{
				private static final long serialVersionUID = 1L;

				@Override
				public void onClick()
				{
					setResponsePage(new ComestibleEditPage(comestible));
				}
			}
		);
		add(
			new Link("back")
			{
				private static final long serialVersionUID = 0L;

				@Override
				public void onClick()
				{
					setResponsePage(ComestiblesPage.class);
				}
			}
		);
	}

	@Override
	public String getPageTitle()
	{
		return getLocalizer().getString("lbl.comestible",this);
	}

}
