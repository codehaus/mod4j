package nl.ordina.mod4j.rbs.web.pages.part;

import nl.ordina.mod4j.rbs.dao.ComestibleDAO;
import nl.ordina.mod4j.rbs.model.Breakfast;
import nl.ordina.mod4j.rbs.model.Comestible;
import nl.ordina.mod4j.rbs.model.Part;
import nl.ordina.mod4j.rbs.web.feedback.FieldFeedbackPanel;
import nl.ordina.mod4j.rbs.web.feedback.FormFeedbackPanel;
import nl.ordina.mod4j.rbs.web.utils.Util;
import nl.ordina.wicket.ext.components.AjaxUpdatingBehaviour;
import nl.ordina.wicket.ext.components.ComponentsFeedbackMessageFilter;
import nl.ordina.wicket.ext.models.ArgumentPropertyModel;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxCheckBox;
import org.apache.wicket.ajax.markup.html.form.AjaxFallbackButton;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow;
import org.apache.wicket.feedback.ComponentFeedbackMessageFilter;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.model.ResourceModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.apache.wicket.validation.validator.NumberValidator;


public class PartsFormPanel extends Panel
{
	private static final long serialVersionUID = 1L;
	@SpringBean(name="comestibleDAO")
	private ComestibleDAO comestibleDAO;
	private String comestibleName;
	private Comestible comestible;
	private int quantity;

	public PartsFormPanel(final ModalWindow window, String id, final IModel breakfast, final Component ... components)
	{
		super(id,breakfast);
		this.setModel(new CompoundPropertyModel(this));
		final Form form = new Form("frmComestible",new CompoundPropertyModel(this));
		
		final Button add =
			new AjaxFallbackButton("add",new ResourceModel("cmd.add"),form)
			{
				private static final long serialVersionUID = 1L;
		
				@Override
				protected void onSubmit(AjaxRequestTarget target, Form form)
				{
					Breakfast breakfast = (Breakfast)getForm().getRootForm().getModelObject();
					breakfast.getParts().add(new Part(getComestible(),getQuantity()));
					form.clearInput();
					if (target != null)
					{
						for (Component component : components)
							target.addComponent(component);
						window.close(target);
					}
				}
				
				@Override
				protected void onError(AjaxRequestTarget target, Form form)
				{
					super.onError(target,form);
					if (target != null)
					{
						target.addComponent(form);
					}
				}
			}
		;
		
		final Button cancel =
			new AjaxFallbackButton("cancel",new ResourceModel("cmd.cancel"),form)
			{
				private static final long serialVersionUID = 1L;
		
				@Override
				protected void onSubmit(AjaxRequestTarget target, Form form)
				{
					window.close(target);
				}
			}
			.setDefaultFormProcessing(false);
		;
		
		FormFeedbackPanel formMsgs = (FormFeedbackPanel)new FormFeedbackPanel("formMsgs",new ComponentsFeedbackMessageFilter(form,add,cancel))
			.setOutputMarkupId(true);
		
		DropDownChoice comestible =
			(DropDownChoice)new DropDownChoice("comestible",new PropertyModel(this,"comestible"),new ArgumentPropertyModel(comestibleDAO,"unusedComestibles",breakfast),
				new IChoiceRenderer()
				{
					private static final long serialVersionUID = 1L;
			
					@Override
					public Object getDisplayValue(Object o)
					{
						return ((Comestible)o).getName();
					}
			
					@Override
					public String getIdValue(Object o, int index)
					{
						return ((Comestible)o).getId() == null ? null : ((Comestible)o).getId().toString();
					}
				}
			)
			{
				private static final long serialVersionUID = 1L;
				
				@Override
				public boolean isRequired()
				{
			    return getForm().getRootForm().findSubmittingButton() == add || (getForm().getRootForm().findSubmittingButton() == null && "frmComestible".equals(getForm().getId()));
				}
				
			}
			.setNullValid(true)
			.setLabel(new Model(getLocalizer().getString("lbl.name",this)))
		;
		FieldFeedbackPanel comestibleMsgs = (FieldFeedbackPanel)new FieldFeedbackPanel("comestibleMsgs",new ComponentFeedbackMessageFilter(comestible))
			.setOutputMarkupId(true);
		comestible.add(new AjaxUpdatingBehaviour(comestibleMsgs));
		
		TextField quantity = 
			(TextField)new TextField("quantity")
			{
				private static final long serialVersionUID = 1L;
				
				@Override
				public boolean isRequired()
				{
					return getForm().getRootForm().findSubmittingButton() == add || (getForm().getRootForm().findSubmittingButton() == null && "frmComestible".equals(getForm().getId()));
				}
			}
			.setLabel(new Model(getLocalizer().getString("lbl.quantity",this)))
			.add(new NumberValidator.RangeValidator(1,99))
		;
		FieldFeedbackPanel quantityMsgs = (FieldFeedbackPanel)new FieldFeedbackPanel("quantityMsgs",new ComponentFeedbackMessageFilter(quantity))
			.setOutputMarkupId(true);
		quantity.add(new AjaxUpdatingBehaviour(quantityMsgs));
		
		form.add(comestible);
		form.add(comestibleMsgs);
		form.add(quantity);
		form.add(quantityMsgs);
		form.add(add);
		form.add(cancel);
		add(formMsgs);
		add(form);
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

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

}
