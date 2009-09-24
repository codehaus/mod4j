package nl.ordina.mod4j.rbs.web.pages.breakfast;

import java.util.Arrays;
import java.util.List;

import nl.ordina.mod4j.rbs.dao.BreakfastDAO;
import nl.ordina.mod4j.rbs.dao.ComestibleDAO;
import nl.ordina.mod4j.rbs.dao.DAOException;
import nl.ordina.mod4j.rbs.model.Breakfast;
import nl.ordina.mod4j.rbs.model.Comestible;
import nl.ordina.mod4j.rbs.model.Part;
import nl.ordina.mod4j.rbs.web.feedback.FieldFeedbackPanel;
import nl.ordina.mod4j.rbs.web.feedback.FormFeedbackPanel;
import nl.ordina.mod4j.rbs.web.pages.part.PartsFormPanel;
import nl.ordina.mod4j.rbs.web.templates.RBSTemplate;
import nl.ordina.mod4j.rbs.web.utils.ComestibleComparator;
import nl.ordina.mod4j.rbs.web.utils.DecimalPropertyModel;
import nl.ordina.wicket.ext.components.AjaxEditableLabel;
import nl.ordina.wicket.ext.components.AjaxIndicator;
import nl.ordina.wicket.ext.components.AjaxUpdatingBehaviour;
import nl.ordina.wicket.ext.components.ComponentsFeedbackMessageFilter;
import nl.ordina.wicket.ext.components.ConfirmAjaxButton;
import nl.ordina.wicket.ext.components.IndicatingAjaxButton;
import nl.ordina.wicket.ext.components.ModalWindow;
import nl.ordina.wicket.ext.models.BaseModel;
import nl.ordina.wicket.ext.models.CheckBoxObjectModel;
import nl.ordina.wicket.ext.models.SortedListPropertyModel;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxCheckBox;
import org.apache.wicket.behavior.SimpleAttributeModifier;
import org.apache.wicket.feedback.ComponentFeedbackMessageFilter;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.model.ResourceModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.apache.wicket.validation.validator.NumberValidator;
import org.apache.wicket.validation.validator.PatternValidator;



public class BreakfastEditPage extends RBSTemplate
{
	private Log log = LogFactory.getLog(getClass());
	@SpringBean(name="breakfastDAO")
	private BreakfastDAO breakfastDAO;
	@SpringBean(name="comestibleDAO")
	private ComestibleDAO comestibleDAO;
	private String comestibleName;
	private Comestible comestible;
	private boolean blocked;
	private List<BaseModel> selectedComestibles = CheckBoxObjectModel.newSelectedList();

	public BreakfastEditPage(final IModel breakfast)
	{
		boolean isNew = ((Breakfast)breakfast.getObject()).getId() == null;
		CompoundPropertyModel breakfastModel = new CompoundPropertyModel(breakfast);
		Form form = new Form("frmBreakfast",breakfastModel);
		Button save = 
			new Button("save",new ResourceModel("cmd.save"))
			{
				private static final long serialVersionUID = 1L;
	
				@Override
				public void onSubmit()
				{
					try
					{
						Breakfast breakfast = (Breakfast)getParent().getModelObject();
						breakfastDAO.save(breakfast);
						setResponsePage(new BreakfastsPage());
					}
					catch (DAOException e)
					{
						error(e.getMessage());
						log.error("",e);
					}
				}
			}
		;
		Button delete = 
			(Button)new Button("delete",new ResourceModel("cmd.delete"))
			{
				private static final long serialVersionUID = 1L;
	
				@Override
				public void onSubmit()
				{
					try
					{
						Breakfast breakfast = (Breakfast)getParent().getModelObject();
						breakfastDAO.delete(breakfast);
						setResponsePage(new BreakfastsPage());
					}
					//Fix for failing exception handling in comestibleDAO.delete() (due to proxy???)
					catch (org.springframework.orm.jdo.JdoResourceFailureException e)
					{
						info(getLocalizer().getString("breakfastInUse",this,getParent().getModel()));
					}
					catch (DAOException e)
					{
						error(e.getMessage());
						log.error("",e);
					}
				}
			}
			.setDefaultFormProcessing(false)
			.setVisible(!isNew)
			.add( new SimpleAttributeModifier("onclick", "return confirm('" + getLocalizer().getString("msg.confirm",this) + "');"))
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
			.setDefaultFormProcessing(false)
		;
		form.setDefaultButton(save);
		FormFeedbackPanel formMsgs = (FormFeedbackPanel)new FormFeedbackPanel("formMsgs",new ComponentsFeedbackMessageFilter(form,save,delete,cancel))
		  .setOutputMarkupId(true);

		TextField name = (TextField)new TextField("name")
			.setLabel(new Model(getLocalizer().getString("lbl.name",BreakfastEditPage.this)))
			.setRequired(true)
			.add(BreakfastValidator.uniqueName(breakfastDAO,((Breakfast)breakfast.getObject()).getName()))
			.add(
				new PatternValidator("^[a-zA-Z0-9]{1,32}$")
				{
					private static final long serialVersionUID = 1L;

					@Override
					protected String resourceKey()
					{
						return "BreakfastNameValidator";
					}
				}
			)
		;
		FieldFeedbackPanel nameMsgs = (FieldFeedbackPanel)new FieldFeedbackPanel("nameMsgs",new ComponentFeedbackMessageFilter(name))
			.setOutputMarkupId(true);
		name.add(new AjaxUpdatingBehaviour(nameMsgs));

		TextField price = (TextField)new TextField("price",new DecimalPropertyModel(breakfast,"price"))
			.setLabel(new Model(getLocalizer().getString("lbl.price",BreakfastEditPage.this)))
			.setRequired(true)
		;
		FieldFeedbackPanel priceMsgs = (FieldFeedbackPanel)new FieldFeedbackPanel("priceMsgs",new ComponentFeedbackMessageFilter(price))
			.setOutputMarkupId(true);
		name.add(new AjaxUpdatingBehaviour(priceMsgs));

		DropDownChoice servingStyle =
			(DropDownChoice)new DropDownChoice("servingStyle",Arrays.asList(Breakfast.ServingStyle.values()),
				new IChoiceRenderer()
				{
					private static final long serialVersionUID = 1L;
			
					@Override
					public Object getDisplayValue(Object o)
					{
						return ((Breakfast.ServingStyle)o).toString();
					}
			
					@Override
					public String getIdValue(Object o, int index)
					{
						return ((Breakfast.ServingStyle)o).name();
					}
				}
			)
			.setNullValid(true)
			.setLabel(new Model(getLocalizer().getString("lbl.servingStyle",this)))
		;
		FieldFeedbackPanel servingStyleMsgs = (FieldFeedbackPanel)new FieldFeedbackPanel("servingStyleMsgs",new ComponentFeedbackMessageFilter(servingStyle))
			.setOutputMarkupId(true);
		servingStyle.add(new AjaxUpdatingBehaviour(servingStyleMsgs));

		final Form formComestibles = new Form("frmComestibles");
		formComestibles.setOutputMarkupId(true);
		form.add(formComestibles);

		final ModalWindow comestibleWindow = new ModalWindow("comestibleWindow");
		comestibleWindow.setTitle(getLocalizer().getString("lbl.addComestible",this));
		comestibleWindow.setCssClassName(ModalWindow.CSS_CLASS_GRAY);
		comestibleWindow.setUseInitialHeight(true);
		comestibleWindow.setInitialHeight(110);
		comestibleWindow.setInitialWidth(520);

		Button addComestible = 
			(Button)new IndicatingAjaxButton("add",new ResourceModel("cmd.add"),formComestibles)
			{
				private static final long serialVersionUID = 1L;
				
				@Override
				public boolean isEnabled()
				{
					try
					{
						return comestibleDAO.getUnusedComestibles((Breakfast)breakfast.getObject()).size() > 0;
					}
					catch (DAOException e)
					{
						log.error("",e);
						throw new RuntimeException(e);
					}
				}
	
				@Override
				protected void onSubmit(AjaxRequestTarget target, Form form)
				{
					comestibleWindow.show(target);
				}
			}
		;
		
		comestibleWindow.setContent(new PartsFormPanel(comestibleWindow,comestibleWindow.getContentId(),breakfast,formComestibles,addComestible));

		final Button deleteComestibles = 
			(Button)new ConfirmAjaxButton("delete",getLocalizer().getString("msg.confirm",this),new ResourceModel("cmd.delete"),formComestibles)
			{
				private static final long serialVersionUID = 1L;
	
				@Override
				public boolean isEnabled()
				{
					return selectedComestibles.size() > 0;
				}
	
				@Override
				public void onSubmit(AjaxRequestTarget target, Form form)
				{
					Breakfast breakfast = (Breakfast)getForm().getRootForm().getModelObject();
					for (BaseModel model : selectedComestibles)
						breakfast.getParts().remove(model);
					selectedComestibles.clear();
					if (target != null)
						target.addComponent(formComestibles);
				}
			}
		;

		final Button resetComestibles = 
			new IndicatingAjaxButton("reset",new ResourceModel("cmd.reset"),formComestibles)
			{
				private static final long serialVersionUID = 1L;
		
				@Override
				public boolean isEnabled()
				{
					return selectedComestibles.size() > 0;
				}
	
				@Override
				public void onSubmit(AjaxRequestTarget target, Form form)
				{
					selectedComestibles.clear();
					if (target != null)
						target.addComponent(formComestibles);
				}
			}
			.setDefaultFormProcessing(false);
		;

		final FormFeedbackPanel formComestiblesMsgs = (FormFeedbackPanel)new FormFeedbackPanel("formMsgs",new ComponentsFeedbackMessageFilter(formComestibles,deleteComestibles,resetComestibles))
	  	.setOutputMarkupId(true);

		ListView comestibles = 
			new ListView("comestibles",new SortedListPropertyModel(breakfast,"parts",new ComestibleComparator()))
			{
				private static final long serialVersionUID = 1L;

				@Override
				protected void populateItem(ListItem item)
				{
					item.setModel(new CompoundPropertyModel((Part)item.getModelObject()));
					item.add(new AjaxEditableLabel("quantity",formComestiblesMsgs));
					((AjaxEditableLabel)item.get("quantity"))
						.setRequired(true)
						.add(new NumberValidator.RangeValidator(1,99))
					;
					item.add(new Label("comestible.name"));
					item.add(
						new AjaxCheckBox("selected",new CheckBoxObjectModel(selectedComestibles,(BaseModel)item.getModelObject()))
						{
							private static final long serialVersionUID = 1L;

							@Override
							protected void onUpdate(AjaxRequestTarget target)
							{
								target.addComponent(deleteComestibles);
								target.addComponent(resetComestibles);
							}
						}
					);
				}
			}
		;
		formComestibles.add(comestibleWindow);
		formComestibles.add(addComestible);
		formComestibles.add(deleteComestibles);
		formComestibles.add(resetComestibles);
		formComestibles.add(formComestiblesMsgs);
		formComestibles.add(comestibles);
		
		form.add(new AjaxIndicator("ajaxIndicator"));
		form.add(name);
		form.add(nameMsgs);
		form.add(price);
		form.add(priceMsgs);
		form.add(servingStyle);
		form.add(servingStyleMsgs);
		form.add(save);
		form.add(delete);
		form.add(cancel);
		add(formMsgs);
		add(form);
	}

	@Override
	public String getPageTitle()
	{
		return getLocalizer().getString("lbl.breakfastEdit",this);
	}

	public String getComestibleName()
	{
		return comestibleName;
	}

	public void setComestibleName(String comestibleName)
	{
		this.comestibleName = comestibleName;
	}

	public Comestible getComestible()
	{
		return comestible;
	}

	public void setComestible(Comestible comestible)
	{
		this.comestible = comestible;
	}

	public boolean isBlocked()
	{
		return blocked;
	}

	public void setBlocked(boolean blocked)
	{
		this.blocked = blocked;
	}

}
