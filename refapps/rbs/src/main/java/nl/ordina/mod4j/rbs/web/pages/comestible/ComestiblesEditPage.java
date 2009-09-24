package nl.ordina.mod4j.rbs.web.pages.comestible;

import java.util.ArrayList;
import java.util.List;

import nl.ordina.mod4j.rbs.dao.ComestibleDAO;
import nl.ordina.mod4j.rbs.dao.DAOException;
import nl.ordina.mod4j.rbs.model.Comestible;
import nl.ordina.mod4j.rbs.web.feedback.FormFeedbackPanel;
import nl.ordina.mod4j.rbs.web.templates.RBSTemplate;
import nl.ordina.mod4j.rbs.web.utils.DecimalPropertyModel;
import nl.ordina.wicket.ext.components.AjaxIndicator;
import nl.ordina.wicket.ext.components.ComponentsFeedbackMessageFilter;
import nl.ordina.wicket.ext.components.ConfirmAjaxButton;
import nl.ordina.wicket.ext.components.IndicatingAjaxButton;
import nl.ordina.wicket.ext.models.CheckBoxBaseModel;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxCheckBox;
import org.apache.wicket.ajax.markup.html.form.AjaxFallbackButton;
import org.apache.wicket.ajax.markup.html.navigation.paging.AjaxPagingNavigator;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.OddEvenItem;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.ResourceModel;
import org.apache.wicket.spring.injection.annot.SpringBean;



public class ComestiblesEditPage extends RBSTemplate
{
	private static final Log log = LogFactory.getLog(ComestiblesEditPage.class);
	@SpringBean(name="comestibleDAO")
	private ComestibleDAO comestibleDAO;
	@SpringBean(name="maxItemsPerPage")
	private Integer maxItemsPerPage;
	private List<IModel> selectedComestibles = CheckBoxBaseModel.newSelectedList(); 
	
	public ComestiblesEditPage()
	{
		final Form form = new Form("frmComestibles");
		final WebMarkupContainer container = (WebMarkupContainer)new WebMarkupContainer("container")
			.setOutputMarkupId(true);
		Button _new = 
			new Button("new",new ResourceModel("cmd.new"))
			{
				private static final long serialVersionUID = 1L;

				@Override
				public void onSubmit()
				{
					setResponsePage(new ComestibleEditPage(new Model(new Comestible())));
				}
			}
		;
		final AjaxFallbackButton resetAll =
			new IndicatingAjaxButton("resetAll",new ResourceModel("cmd.resetAll"),form)
			{
				private static final long serialVersionUID = 0L;

				@Override
				public boolean isEnabled()
				{
					return selectedComestibles.size() > 0;
				}

				@Override
				protected void onSubmit(AjaxRequestTarget target, Form form)
				{
					selectedComestibles.clear();
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
				private static final long serialVersionUID = 0L;
	
				@Override
				public boolean isEnabled()
				{
					return selectedComestibles.size() > 0;
				}
	
				@Override
				protected void onSubmit(AjaxRequestTarget target, Form form)
				{
					//implement a force delete that deletes the Comestible's related Parts first before deleting the Comestible itself???
					//or cascade delete Parts on deletion of a Comestible???
					ArrayList<IModel> deletedComestibles = new ArrayList<IModel>();
					for (IModel comestible : selectedComestibles)
						try
						{
							comestibleDAO.delete((Comestible)comestible.getObject());
							deletedComestibles.add(comestible);
						}
						//Fix for failing exception handling in comestibleDAO.delete() (due to proxy???)
						catch (org.springframework.orm.jdo.JdoResourceFailureException e)
						{
							info(getLocalizer().getString("comestibleInUse",this,comestible));
							//info(new StringResourceModel("comestibleInUse",this,comestible).getString());
						}
						catch (DAOException e)
						{
							error(e.getMessage());
							log.error("",e);
						}
					selectedComestibles.removeAll(deletedComestibles);
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
		Link cancel = 
			new Link("cancel",new ResourceModel("cmd.cancel"))
			{
				private static final long serialVersionUID = 1L;

				@Override
				public void onClick()
				{
					setResponsePage(new ComestiblesPage());
				}
			}
		;
		form.setDefaultButton(delete);
		FormFeedbackPanel formMsgs = (FormFeedbackPanel)new FormFeedbackPanel("formMsgs",new ComponentsFeedbackMessageFilter(form,_new,resetAll,delete,cancel))
			.setOutputMarkupId(true);
		ComestibleDataProvider dataProvider = new ComestibleDataProvider(comestibleDAO);
		DataView comestibles = 
			new DataView("comestibles",dataProvider)
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
								setResponsePage(new ComestibleEditPage(getModel()));
							}
						}
					;
					link.add(new Label("name"));
					item.add(link);
					item.add(new Label("minimalQuantity"));
					item.add(new Label("price",new DecimalPropertyModel((Comestible)item.getModelObject(),"price")));
					item.add(new Label("transportForm"));
					item.add(
						new AjaxCheckBox("selected",new CheckBoxBaseModel(selectedComestibles,item.getModel()))
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
		comestibles.setItemsPerPage(maxItemsPerPage);
		container.add(comestibles);
		form.add(container);
		form.add(new AjaxIndicator("ajaxIndicator"));
		form.add(new AjaxPagingNavigator("navigator",comestibles).setOutputMarkupId(true));
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
		return getLocalizer().getString("lbl.comestibles",this);
	}

}
