package nl.ordina.mod4j.rbs.web.pages.breakfast;


import nl.ordina.mod4j.rbs.dao.BreakfastDAO;
import nl.ordina.mod4j.rbs.dao.DAOException;

import org.apache.wicket.validation.IValidatable;
import org.apache.wicket.validation.ValidationError;
import org.apache.wicket.validation.validator.AbstractValidator;


public abstract class BreakfastValidator extends AbstractValidator
{
	private static final long serialVersionUID = 1L;
	protected BreakfastDAO breakfastDAO;
	
	public BreakfastValidator(BreakfastDAO breakfastDAO)
	{
		this.breakfastDAO = breakfastDAO;
	}

	public static UniqueNameValidator uniqueName(BreakfastDAO breakfastDAO)
	{
		return new UniqueNameValidator(breakfastDAO);
	}
	
	public static UniqueNameValidator uniqueName(BreakfastDAO breakfastDAO, String currentName)
	{
		return new UniqueNameValidator(breakfastDAO,currentName);
	}
	
	public static class UniqueNameValidator extends BreakfastValidator
	{
		private static final long serialVersionUID = 1L;
		private String currentName;

		public UniqueNameValidator(BreakfastDAO breakfastDAO)
		{
			this(breakfastDAO,null);
		}
		
		public UniqueNameValidator(BreakfastDAO breakfastDAO, String currentName)
		{
			super(breakfastDAO);
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
				if (breakfastDAO.getBreakfast((String)validatable.getValue()) != null)
					error(validatable);
			}
			catch (DAOException e)
			{
				validatable.error(new ValidationError().setMessage("cannot perform unique check"));
			}
		}
	}

}
