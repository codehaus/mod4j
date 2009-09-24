package nl.ordina.mod4j.rbs.web.utils;

import java.text.DecimalFormat;

import org.apache.wicket.model.PropertyModel;

public class DecimalPropertyModel extends PropertyModel
{
	private static final long serialVersionUID = 1L;
	private DecimalFormat format;

	public DecimalPropertyModel(Object modelObject, String expression)
	{
		super(modelObject,expression);
		format = new DecimalFormat("#,##0.00");
	}

	public DecimalPropertyModel(Object modelObject, String expression, String format)
	{
		super(modelObject,expression);
		this.format = new DecimalFormat(format);
	}

	@Override
	public Object getObject()
	{
		return super.getObject() == null ? null : format.format(super.getObject());
	}
}
