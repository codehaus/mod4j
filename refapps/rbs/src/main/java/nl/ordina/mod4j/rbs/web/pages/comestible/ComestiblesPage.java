package nl.ordina.mod4j.rbs.web.pages.comestible;

import nl.ordina.mod4j.rbs.dao.ComestibleDAO;
import nl.ordina.mod4j.rbs.model.Comestible;
import nl.ordina.mod4j.rbs.web.templates.RBSTemplate;
import nl.ordina.mod4j.rbs.web.utils.DecimalPropertyModel;

import org.apache.wicket.ajax.markup.html.navigation.paging.AjaxPagingNavigator;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.link.PageLink;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.OddEvenItem;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.spring.injection.annot.SpringBean;



public class ComestiblesPage extends RBSTemplate
{
	@SpringBean(name="comestibleDAO")
	private ComestibleDAO comestibleDAO;
	@SpringBean(name="maxItemsPerPage")
	private Integer maxItemsPerPage;

	public ComestiblesPage()
	{
		WebMarkupContainer container = (WebMarkupContainer)new WebMarkupContainer("container")
			.setOutputMarkupId(true);
		ComestibleDataProvider dataProvider = new ComestibleDataProvider(comestibleDAO);
		DataView services = 
			(DataView)new DataView("comestibles",dataProvider)
			{
				private static final long serialVersionUID = 1L;
	
				@Override
				protected void populateItem(Item item)
				{
					item.setModel(new CompoundPropertyModel((Comestible)item.getModelObject()));
					Link link = 
						new Link("view",item.getModel())
						{
							private static final long serialVersionUID = 1L;
	
							@Override
							public void onClick()
							{
								setResponsePage(new ComestiblePage(getModel()));
							}
						}
					;
					link.add(new Label("name"));
					item.add(link);
					item.add(new Label("minimalQuantity"));
					item.add(new Label("price",new DecimalPropertyModel((Comestible)item.getModelObject(),"price")));
					item.add(new Label("transportForm"));
				}
				
				@Override
				protected Item newItem(String id, int index, IModel model)
				{
					return new OddEvenItem(id,index,model);
				}
			}
			.setOutputMarkupId(true)
		;
		services.setItemsPerPage(maxItemsPerPage);
		container.add(services);
		add(container);
		add(new AjaxPagingNavigator("navigator",services));
		add(new PageLink("edit",ComestiblesEditPage.class));
	}

	@Override
	public String getPageTitle()
	{
		return getLocalizer().getString("lbl.comestibles",this);
	}

}
