package nl.ordina.mod4j.rbs.web.pages.breakfast;

import java.util.Iterator;


import nl.ordina.mod4j.rbs.model.Breakfast;
import nl.ordina.mod4j.rbs.model.Part;

import org.apache.wicket.markup.repeater.data.IDataProvider;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;


public class PartsDataProvider implements IDataProvider
{
	private static final long serialVersionUID = 1L;
	private IModel breakfast;

	public PartsDataProvider(IModel breakfast)
	{
		this.breakfast = breakfast;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Iterator iterator(int first, int count)
	{
		Breakfast t = ((Breakfast)breakfast.getObject());
		return t.getParts().iterator();
	}

	@Override
	public IModel model(Object object)
	{
		final Long id = ((Part)object).getId();
		return
			new LoadableDetachableModel()
			{
				private static final long serialVersionUID = 1L;

				@Override
				protected Object load()
				{
					for (Part part : ((Breakfast)breakfast.getObject()).getParts())
						if (id.equals(part.getId()))
							return part;
					return null;
				}
			};
	}

	@Override
	public int size()
	{
		return ((Breakfast)breakfast.getObject()).getParts().size();
	}

	@Override
	public void detach()
	{
	}

}
