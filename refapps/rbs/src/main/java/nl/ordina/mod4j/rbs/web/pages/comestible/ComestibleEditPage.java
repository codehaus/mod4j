package nl.ordina.mod4j.rbs.web.pages.comestible;

import nl.ordina.mod4j.rbs.dao.ComestibleDAO;
import nl.ordina.mod4j.rbs.dao.DAOException;
import nl.ordina.mod4j.rbs.model.Comestible;
import nl.ordina.mod4j.rbs.web.feedback.FieldFeedbackPanel;
import nl.ordina.mod4j.rbs.web.feedback.FormFeedbackPanel;
import nl.ordina.mod4j.rbs.web.templates.RBSTemplate;
import nl.ordina.mod4j.rbs.web.utils.DecimalPropertyModel;
import nl.ordina.wicket.ext.components.AjaxUpdatingBehaviour;
import nl.ordina.wicket.ext.components.ComponentsFeedbackMessageFilter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.wicket.behavior.SimpleAttributeModifier;
import org.apache.wicket.feedback.ComponentFeedbackMessageFilter;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.ResourceModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.apache.wicket.validation.validator.NumberValidator;


public class ComestibleEditPage extends RBSTemplate
{
	private static final Log log = LogFactory.getLog(ComestibleEditPage.class);
	@SpringBean(name="comestibleDAO")
	private ComestibleDAO comestibleDAO;

	public ComestibleEditPage(final IModel comestible)
	{
		boolean isNew = ((Comestible)comestible.getObject()).getId() == null;
		CompoundPropertyModel comestibleModel = new CompoundPropertyModel(comestible);
		Form form = (Form)new Form("frmComestible",comestibleModel)
			.setOutputMarkupId(true);
		Button save = 
			new Button("save",new ResourceModel("cmd.save"))
			{
				private static final long serialVersionUID = 1L;
	
				@Override
				public void onSubmit()
				{
					try
					{						
						Comestible comestible = (Comestible)getParent().getModelObject();
						comestibleDAO.save(comestible);
						setResponsePage(new ComestiblesPage());
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
					Comestible comestible = (Comestible)getParent().getModelObject();
					try
					{
						comestibleDAO.delete(comestible);
						setResponsePage(new ComestiblesPage());
					}
					//Fix for failing exception handling in comestibleDAO.delete() (due to proxy???)
					catch (org.springframework.orm.jdo.JdoResourceFailureException e)
					{
						info(getLocalizer().getString("comestibleInUse",this,getParent().getModel()));
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
			.add(new SimpleAttributeModifier("onclick","return confirm('" + getLocalizer().getString("msg.confirm",this) + "');"))
		;
		Button cancel = 
			new Button("cancel",new ResourceModel("cmd.cancel"))
			{
				private static final long serialVersionUID = 1L;

				@Override
				public void onSubmit()
				{
					setResponsePage(new ComestiblesPage());
				}
			}
			.setDefaultFormProcessing(false)
		;
		form.setDefaultButton(save);
		FormFeedbackPanel formMsgs = (FormFeedbackPanel)new FormFeedbackPanel("formMsgs",new ComponentsFeedbackMessageFilter(form,save,delete,cancel))
		  .setOutputMarkupId(true);
		TextField name = (TextField)new TextField("name")
			.setLabel(new Model(getLocalizer().getString("lbl.name",this)))
			.setRequired(true)
			.add(ComestibleValidator.uniqueName(comestibleDAO,((Comestible)comestible.getObject()).getName()))
		;
		FieldFeedbackPanel nameMsgs = (FieldFeedbackPanel)new FieldFeedbackPanel("nameMsgs",new ComponentFeedbackMessageFilter(name))
			.setOutputMarkupId(true);
		name.add(new AjaxUpdatingBehaviour(formMsgs,nameMsgs));
		TextField minimalQuantity = (TextField)new TextField("minimalQuantity")
			.setLabel(new Model(getLocalizer().getString("lbl.minimalQuantity",this)))
			.setRequired(true)
			.add(new NumberValidator.RangeValidator(1,99));
		;
		FieldFeedbackPanel minimalQuantityMsgs = (FieldFeedbackPanel)new FieldFeedbackPanel("minimalQuantityMsgs",new ComponentFeedbackMessageFilter(minimalQuantity))
			.setOutputMarkupId(true);
		minimalQuantity.add(new AjaxUpdatingBehaviour(formMsgs,minimalQuantityMsgs));
		TextField price = (TextField)new TextField("price",new DecimalPropertyModel(comestible,"price"))
			.setLabel(new Model(getLocalizer().getString("lbl.price",this)))
			.setRequired(true)
			.add(new NumberValidator.DoubleRangeValidator(0.01,100.0))
		;
		FieldFeedbackPanel priceMsgs = (FieldFeedbackPanel)new FieldFeedbackPanel("priceMsgs",new ComponentFeedbackMessageFilter(price))
			.setOutputMarkupId(true);
		price.add(new AjaxUpdatingBehaviour(formMsgs,priceMsgs));

		TextField transportForm = (TextField)new TextField("transportForm")
			.setLabel(new Model(getLocalizer().getString("lbl.transportForm",this)))
		;
		FieldFeedbackPanel transportFormMsgs = (FieldFeedbackPanel)new FieldFeedbackPanel("transportFormMsgs",new ComponentFeedbackMessageFilter(transportForm))
			.setOutputMarkupId(true);
		transportForm.add(new AjaxUpdatingBehaviour(formMsgs,transportFormMsgs));
		
		form.add(name);
		form.add(nameMsgs);
		form.add(minimalQuantity);
		form.add(minimalQuantityMsgs);
		form.add(price);
		form.add(priceMsgs);
		form.add(transportForm);
		form.add(transportFormMsgs);
		form.add(save);
		form.add(delete);
		form.add(cancel);
		add(formMsgs);
		add(form);
	}

	@Override
	public String getPageTitle()
	{
		return getLocalizer().getString("lbl.comestibleEdit",this);
	}

}
