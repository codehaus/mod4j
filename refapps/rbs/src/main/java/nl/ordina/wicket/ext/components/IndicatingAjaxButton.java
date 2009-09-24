package nl.ordina.wicket.ext.components;

import org.apache.wicket.ajax.IAjaxIndicatorAware;
import org.apache.wicket.ajax.markup.html.form.AjaxFallbackButton;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.IModel;

public abstract class IndicatingAjaxButton extends AjaxFallbackButton implements IAjaxIndicatorAware
{
	private String ajaxIndicatorMarkupId;

	public IndicatingAjaxButton(String id, IModel model, Form form)
	{
		this(id,model,form,"ajaxIndicator");
	}

	public IndicatingAjaxButton(String id, IModel model, Form form, String ajaxIndicatorMarkupId)
	{
		super(id,model,form);
		this.ajaxIndicatorMarkupId = ajaxIndicatorMarkupId;
	}

	@Override
	public String getAjaxIndicatorMarkupId()
	{
		return ajaxIndicatorMarkupId;
	}
}

