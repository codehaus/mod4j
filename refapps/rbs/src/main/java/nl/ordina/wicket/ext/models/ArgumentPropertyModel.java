package nl.ordina.wicket.ext.models;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.util.string.Strings;

public class ArgumentPropertyModel extends Model
{
	private static final long serialVersionUID = 1L;
	private String property;
	private Object[] arguments;

	public ArgumentPropertyModel(Serializable object, String property, Object ... arguments)
	{
		super(object);
		this.property = property;
		this.arguments = arguments;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Object getObject()
	{
		try
		{
			Object object = super.getObject();
			if (object instanceof IModel)
				object = ((IModel)object).getObject();
			if (object != null)
			{
				List<Object> a = new ArrayList<Object>();
				List<Class> aTypes = new ArrayList<Class>();
				for (Object argument : arguments)
					if (argument instanceof IModel)
					{
						a.add(((IModel)argument).getObject());
						if (argument instanceof PropertyModel)
							aTypes.add(((PropertyModel)argument).getPropertyField().getDeclaringClass().getDeclaredField(((PropertyModel)argument).getPropertyExpression()).getType());
							//aTypes.add(((PropertyModel)argument).getPropertyField().getDeclaringClass().getMethod("get" + Strings.capilalize(((PropertyModel)argument).getPropertyExpression())).getReturnType());
						else
							aTypes.add(((IModel)argument).getObject().getClass());
					}
					else
					{
						a.add(argument);
						aTypes.add(argument.getClass());
					}
//				for (Object argument : a)
//					aTypes.add(argument.getClass());
				Method m = object.getClass().getMethod("get" + Strings.capitalize(property),aTypes.toArray(new Class[0]));
				return m.invoke(object,a.toArray(new Object[0]));
			}
			return null;
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void setObject(Object object)
	{
		super.setObject(object);
	}
	
	@Override
	public void setObject(Serializable object)
	{
		super.setObject(object);
	}

}
