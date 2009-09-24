package nl.ordina.mod4j.rbs.web.pages.breakfast;

import nl.ordina.mod4j.rbs.dao.BreakfastDAO;
import nl.ordina.mod4j.rbs.model.Breakfast;
import nl.ordina.mod4j.rbs.model.Part;
import nl.ordina.mod4j.rbs.web.templates.RBSTemplate;
import nl.ordina.mod4j.rbs.web.utils.ComestibleComparator;
import nl.ordina.mod4j.rbs.web.utils.DecimalPropertyModel;
import nl.ordina.wicket.ext.models.SortedListItemPropertyModel;
import nl.ordina.wicket.ext.models.SortedListPropertyModel;

import org.apache.wicket.ajax.markup.html.navigation.paging.AjaxPagingNavigator;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.link.PageLink;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.OddEvenItem;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.spring.injection.annot.SpringBean;



public class BreakfastsPage extends RBSTemplate
{
	@SpringBean(name="breakfastDAO")
	private BreakfastDAO breakfastDAO;
	@SpringBean(name="maxItemsPerPage")
	private Integer maxItemsPerPage;

	public BreakfastsPage()
	{
		WebMarkupContainer container = (WebMarkupContainer)new WebMarkupContainer("container")
			.setOutputMarkupId(true);
		BreakfastDataProvider dataProvider = new BreakfastDataProvider(breakfastDAO);
		DataView breakfasts = 
			new DataView("breakfasts",dataProvider)
			{
				private static final long serialVersionUID = 1L;

				@Override
				protected void populateItem(final Item item)
				{
					item.setModel(new CompoundPropertyModel((Breakfast)item.getModelObject()));
					Link link = 
						new Link("view",item.getModel())
						{
							private static final long serialVersionUID = 1L;
	
							@Override
							public void onClick()
							{
								setResponsePage(new BreakfastPage(getModel()));
							}
						}
					;
					link.add(new Label("name"));
					item.add(link);
					item.add(new Label("price",new DecimalPropertyModel((Breakfast)item.getModelObject(),"price")));
					item.add(new Label("servingStyle"));
					item.add(
						new DropDownChoice("comestibles",new SortedListItemPropertyModel(item.getModel(),"parts",new ComestibleComparator()),new SortedListPropertyModel(item.getModel(),"parts",new ComestibleComparator()),
							new IChoiceRenderer()
							{
								private static final long serialVersionUID = 1L;
	
								@Override
								public Object getDisplayValue(Object o)
								{
									return new StringBuilder()
										.append(((Part)o).getQuantity())
										.append(" ")
										.append(((Part)o).getComestible().getName())
									;
								}
	
								@Override
								public String getIdValue(Object o, int index)
								{
									return ((Part)o).getId().toString();
								}
							}
						)
						{
							private static final long serialVersionUID = 1L;

							@Override
							public boolean isVisible()
							{
								return ((Breakfast)item.getModelObject()).getParts().size() > 0;
							}
						}
						.setNullValid(false)
					);
				}
				
				@Override
				protected Item newItem(String id, int index, IModel model)
				{
					return new OddEvenItem(id,index,model);
				}
			}
		;
		breakfasts.setItemsPerPage(maxItemsPerPage);
		container.add(breakfasts);
		add(container);
		add(new AjaxPagingNavigator("navigator",breakfasts));
		add(new PageLink("edit",BreakfastsEditPage.class));
	}

	@Override
	public String getPageTitle()
	{
		return getLocalizer().getString("lbl.breakfasts",this);
	}

}
