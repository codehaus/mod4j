package nl.ordina.mod4j.rbs;

import nl.ordina.mod4j.rbs.dao.BreakfastDAO;
import nl.ordina.mod4j.rbs.dao.DAOException;
import nl.ordina.mod4j.rbs.model.Breakfast;
import nl.ordina.mod4j.rbs.model.Comestible;
import nl.ordina.mod4j.rbs.model.Part;


public class Init
{
	public static void execute() throws DAOException
	{
		BreakfastDAO breakfastDAO = (BreakfastDAO)ServiceLocator.getInstance().get("breakfastDAO");

		Breakfast breakfast = new Breakfast("Standard",5.0,Breakfast.ServingStyle.SIMPLE);
		breakfast.getParts().add(createPart("Sandwich",1,4.0,"",1));
		breakfast.getParts().add(createPart("Milk",1,1.0,"",1));
		breakfastDAO.save(breakfast);
	}

	private static Part createPart(String name, int minimalQuantity, double price, String transportForm, int quantity)
	{
		Part result = new Part();
		Comestible comestible = new Comestible(name,minimalQuantity,price,transportForm);
		result.setComestible(comestible);
		result.setQuantity(quantity);
		return result;
	}

	public static void main(String[] args) throws DAOException
	{
		System.out.println("Starting...");
		Init.execute();
		System.out.println("Done...");
	}

}
