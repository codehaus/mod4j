package nl.ordina.mod4j.rbs.web.pages.comestible;


import nl.ordina.mod4j.rbs.dao.ComestibleDAO;
import nl.ordina.mod4j.rbs.dao.DAOException;

import org.apache.wicket.validation.IValidatable;
import org.apache.wicket.validation.ValidationError;
import org.apache.wicket.validation.validator.AbstractValidator;


public abstract class ComestibleValidator extends AbstractValidator
{
	private static final long serialVersionUID = 1L;
	protected ComestibleDAO comestibleDAO;
	
	public ComestibleValidator(ComestibleDAO comestibleDAO)
	{
		this.comestibleDAO = comestibleDAO;
	}

	public static UniqueNameValidator uniqueName(ComestibleDAO comestibleDAO)
	{
		return new UniqueNameValidator(comestibleDAO);
	}
	
	public static UniqueNameValidator uniqueName(ComestibleDAO comestibleDAO, String currentName)
	{
		return new UniqueNameValidator(comestibleDAO,currentName);
	}
	
	public static class UniqueNameValidator extends ComestibleValidator
	{
		private static final long serialVersionUID = 1L;
		private String currentName;

		public UniqueNameValidator(ComestibleDAO comestibleDAO)
		{
			this(comestibleDAO,null);
		}
		
		public UniqueNameValidator(ComestibleDAO comestibleDAO, String currentName)
		{
			super(comestibleDAO);
			this.currentName = currentName;
		}

		@Override
		protected String resourceKey()
		{
			return "UserValidator.uniqueUsername";
		}
	
		@Override
		protected void onValidate(IValidatable validatable)
		{
			try
			{
				if (currentName != null && currentName.equals(validatable.getValue()))
					return;
				if (comestibleDAO.getComestible((String)validatable.getValue()) != null)
					error(validatable);
			}
			catch (DAOException e)
			{
				validatable.error(new ValidationError().setMessage("cannot perform unique check"));
			}
		}
	}

}
