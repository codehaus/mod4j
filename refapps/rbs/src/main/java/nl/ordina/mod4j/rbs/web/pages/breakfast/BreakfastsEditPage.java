package nl.ordina.mod4j.rbs.web.pages.breakfast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nl.ordina.mod4j.rbs.dao.BreakfastDAO;
import nl.ordina.mod4j.rbs.dao.DAOException;
import nl.ordina.mod4j.rbs.model.Breakfast;
import nl.ordina.mod4j.rbs.model.Part;
import nl.ordina.mod4j.rbs.web.feedback.FormFeedbackPanel;
import nl.ordina.mod4j.rbs.web.templates.RBSTemplate;
import nl.ordina.mod4j.rbs.web.utils.ComestibleComparator;
import nl.ordina.mod4j.rbs.web.utils.DecimalPropertyModel;
import nl.ordina.wicket.ext.components.AjaxIndicator;
import nl.ordina.wicket.ext.components.ComponentsFeedbackMessageFilter;
import nl.ordina.wicket.ext.components.ConfirmAjaxButton;
import nl.ordina.wicket.ext.components.IndicatingAjaxButton;
import nl.ordina.wicket.ext.models.CheckBoxBaseModel;
import nl.ordina.wicket.ext.models.SortedListItemPropertyModel;
import nl.ordina.wicket.ext.models.SortedListPropertyModel;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxCheckBox;
import org.apache.wicket.ajax.markup.html.form.AjaxFallbackButton;
import org.apache.wicket.ajax.markup.html.navigation.paging.AjaxPagingNavigator;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.OddEvenItem;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.ResourceModel;
import org.apache.wicket.spring.injection.annot.SpringBean;



public class BreakfastsEditPage extends RBSTemplate
{
	private static final Log log = LogFactory.getLog(BreakfastsEditPage.class);
	@SpringBean(name="breakfastDAO")
	private BreakfastDAO breakfastDAO;
	@SpringBean(name="maxItemsPerPage")
	private Integer maxItemsPerPage;
	private List<IModel> selectedBreakfasts = CheckBoxBaseModel.newSelectedList();

	public BreakfastsEditPage()
	{
		Form form = new Form("frmBreakfasts");
		final WebMarkupContainer container = (WebMarkupContainer)new WebMarkupContainer("container")
			.setOutputMarkupId(true);
		Button _new = 
			new Button("new",new ResourceModel("cmd.new"))
			{
				private static final long serialVersionUID = 1L;

				@Override
				public void onSubmit()
				{
					setResponsePage(new BreakfastEditPage(new Model(new Breakfast())));
				}
			}
		;
		final AjaxFallbackButton resetAll = 
			new IndicatingAjaxButton("resetAll",new ResourceModel("cmd.resetAll"),form)
			{
				private static final long serialVersionUID = 1L;

				@Override
				public boolean isEnabled()
				{
					return selectedBreakfasts.size() > 0;
				}
	
				@Override
				protected void onSubmit(AjaxRequestTarget target, Form form)
				{
					selectedBreakfasts.clear();
					if (target != null)
					{
						target.addComponent(this);
						target.addComponent(container);
						target.addComponent(form.getParent().get("formMsgs"));
						target.addComponent(form.get("navigator"));
						target.addComponent(form.get("delete"));
					}
				}
			}
		;
		final AjaxFallbackButton delete =
			(AjaxFallbackButton)new ConfirmAjaxButton("delete",getLocalizer().getString("msg.confirm",this),new ResourceModel("cmd.delete"),form)
			{
				private static final long serialVersionUID = 1L;
	
				@Override
				public boolean isEnabled()
				{
					return selectedBreakfasts.size() > 0;
				}

				@Override
				protected void onSubmit(AjaxRequestTarget target, Form form)
				{
					ArrayList<IModel> deletedBreakfasts = new ArrayList<IModel>();
					for (IModel breakfast : selectedBreakfasts)
						try
						{
							breakfastDAO.delete((Breakfast)breakfast.getObject());
							deletedBreakfasts.add(breakfast);
						}
						//Fix for failing exception handling in comestibleDAO.delete() (due to proxy???)
						catch (org.springframework.orm.jdo.JdoResourceFailureException e)
						{
							info(getLocalizer().getString("breakfastInUse",this,breakfast));
						}
						catch (DAOException e)
						{
							error(e.getMessage());
							log.error("",e);
						}
					selectedBreakfasts.removeAll(deletedBreakfasts);
					if (target != null)
					{
						target.addComponent(this);
						target.addComponent(container);
						target.addComponent(form.getParent().get("formMsgs"));
						target.addComponent(form.get("navigator"));
						target.addComponent(form.get("resetAll"));
					}
				}
			}
		;
		Button cancel = 
			new Button("cancel",new ResourceModel("cmd.cancel"))
			{
				private static final long serialVersionUID = 1L;

				@Override
				public void onSubmit()
				{
					setResponsePage(new BreakfastsPage());
				}
			}
		;
		form.setDefaultButton(delete);
		FormFeedbackPanel formMsgs = (FormFeedbackPanel)new FormFeedbackPanel("formMsgs",new ComponentsFeedbackMessageFilter(form,_new,resetAll,delete,cancel))
			.setOutputMarkupId(true);

		BreakfastDataProvider dataProvider = new BreakfastDataProvider(breakfastDAO);
		DataView breakfasts = 
			new DataView("breakfasts",dataProvider)
			{
				private static final long serialVersionUID = 1L;

				@Override
				protected void populateItem(Item item)
				{
					item.setModel(new CompoundPropertyModel((Breakfast)item.getModelObject()));
					Link link = 
						new Link("view",item.getModel())
						{
							private static final long serialVersionUID = 1L;
	
							@Override
							public void onClick()
							{
								setResponsePage(new BreakfastEditPage(getModel()));
							}
						}
					;
					link.add(new Label("name"));
					item.add(link);
					item.add(new Label("price",new DecimalPropertyModel((Breakfast)item.getModelObject(),"price")));
					item.add(new Label("servingStyle"));
					Collection<Part> parts = ((Breakfast)item.getModelObject()).getParts();
					item.add(new DropDownChoice("comestibles",new SortedListItemPropertyModel(item.getModel(),"parts",new ComestibleComparator()),new SortedListPropertyModel(item.getModel(),"parts",new ComestibleComparator()),
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
					.setNullValid(false)
					.setVisible(parts.size() > 0));

					item.add(
						new AjaxCheckBox("selected",new CheckBoxBaseModel(selectedBreakfasts,item.getModel()))
						{
							private static final long serialVersionUID = 1L;

							@Override
							protected void onUpdate(AjaxRequestTarget target)
							{
								target.addComponent(resetAll);
								target.addComponent(delete);
							}
						}
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
		form.add(container);
		form.add(new AjaxIndicator("ajaxIndicator"));
		form.add(new AjaxPagingNavigator("navigator",breakfasts));
		form.add(_new);
		form.add(resetAll);
		form.add(delete);
		form.add(cancel);
		add(formMsgs);
		add(form);
	}

	@Override
	public String getPageTitle()
	{
		return getLocalizer().getString("lbl.breakfasts",this);
	}

}
