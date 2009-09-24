package nl.ordina.wicket.ext.components;


import org.apache.wicket.MarkupContainer;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.form.FormComponent;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.IModel;

public class AjaxEditableLabel extends org.apache.wicket.extensions.ajax.markup.html.AjaxEditableLabel
{
	private static final long serialVersionUID = 1L;
	private FeedbackPanel feedbackPanel;

	public AjaxEditableLabel(String id, FeedbackPanel feedbackPanel)
	{
		super(id);
		this.feedbackPanel = feedbackPanel;
	}

	public AjaxEditableLabel(String id, IModel model, FeedbackPanel feedbackPanel)
	{
		super(id,model);
		this.feedbackPanel = feedbackPanel;
	}

	protected FormComponent newEditor(MarkupContainer parent, String componentId, IModel model)
	{
		FormComponent editor = super.newEditor(parent,componentId,model);
		((ComponentsFeedbackMessageFilter)feedbackPanel.getFilter()).getComponents().add(editor);
		return editor;
	}
	
	@Override
	protected void onCancel(AjaxRequestTarget target)
	{
		super.onCancel(target);
		target.addComponent(feedbackPanel);
	}
	
	@Override
	protected void onError(AjaxRequestTarget target)
	{
		super.onError(target);
		target.addComponent(feedbackPanel);
	}
	
	@Override
	protected void onSubmit(AjaxRequestTarget target)
	{
		super.onSubmit(target);
		target.addComponent(feedbackPanel);
	}
	
}
