package nl.ordina.mod4j.rbs.web.pages.breakfast;

import nl.ordina.mod4j.rbs.model.Part;
import nl.ordina.mod4j.rbs.web.templates.RBSTemplate;
import nl.ordina.mod4j.rbs.web.utils.ComestibleComparator;
import nl.ordina.mod4j.rbs.web.utils.DecimalPropertyModel;
import nl.ordina.wicket.ext.models.SortedListPropertyModel;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.PropertyModel;



public class BreakfastPage extends RBSTemplate
{
	public BreakfastPage(final IModel client)
	{
		add(new Label("name",new PropertyModel(client,"name")));
		add(new Label("price",new DecimalPropertyModel(client,"price")));
		add(new Label("servingStyle",new PropertyModel(client,"servingStyle")));
		ListView parts = 
			new ListView("comestibles",new SortedListPropertyModel(client,"parts",new ComestibleComparator()))
			{
				private static final long serialVersionUID = 1L;

				@Override
				protected void populateItem(ListItem item)
				{
					item.setModel(new CompoundPropertyModel((Part)item.getModelObject()));
					item.add(new Label("quantity"));
					item.add(new Label("comestible.name"));
				}
			}
		;
		add(parts);

		add(
			new Link("edit")
			{
				private static final long serialVersionUID = 1L;

				@Override
				public void onClick()
				{
					setResponsePage(new BreakfastEditPage(client));
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
					setResponsePage(BreakfastsPage.class);
				}
			}
		);
	}
	
	@Override
	public String getPageTitle()
	{
		return getLocalizer().getString("lbl.breakfast",this);
	}

}
