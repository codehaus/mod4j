package nl.ordina.wicket.ext.components;

import org.apache.wicket.ajax.IAjaxCallDecorator;
import org.apache.wicket.ajax.IAjaxIndicatorAware;
import org.apache.wicket.ajax.calldecorator.AjaxPreprocessingCallDecorator;
import org.apache.wicket.ajax.markup.html.form.AjaxFallbackButton;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.IModel;

public abstract class ConfirmAjaxButton extends AjaxFallbackButton implements IAjaxIndicatorAware
{
	private String message;
	private String ajaxIndicatorMarkupId;

	public ConfirmAjaxButton(String id, String message, Form form)
	{
		this(id,message,form,"ajaxIndicator");
	}

	public ConfirmAjaxButton(String id, String message, Form form, String ajaxIndicatorMarkupId)
	{
		super(id,form);
		this.message = message;
		this.ajaxIndicatorMarkupId = ajaxIndicatorMarkupId;
	}

	public ConfirmAjaxButton(String id, String message, IModel model, Form form)
	{
		this(id,message,model,form,"ajaxIndicator");
	}
	
	public ConfirmAjaxButton(String id, String message, IModel model, Form form, String ajaxIndicatorMarkupId)
	{
		super(id,model,form);
		this.message = message;
		this.ajaxIndicatorMarkupId = ajaxIndicatorMarkupId;
	}

	@Override
	protected IAjaxCallDecorator getAjaxCallDecorator()
	{
		return 
			new AjaxPreprocessingCallDecorator(super.getAjaxCallDecorator())
			{
				private static final long serialVersionUID = 1L;

				@Override
				public CharSequence preDecorateScript(CharSequence script)
				{
					//return "return confirm('" + message + "')" + script; 
					return "if (confirm('" + message + "')) {" + script + "}"; 
				}
			}
		;
	}
	
	@Override
	public String getAjaxIndicatorMarkupId()
	{
		return ajaxIndicatorMarkupId;
	}
	
}
