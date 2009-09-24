package nl.ordina.mod4j.rbs.dao;

import java.util.Collection;

import nl.ordina.mod4j.rbs.model.Breakfast;



public interface BreakfastDAO
{
	Breakfast getBreakfast(long id) throws DAOException;
	Breakfast getBreakfast(String name) throws DAOException;
	long getBreakfastCount() throws DAOException;
	Collection<Breakfast> getBreakfasts() throws DAOException;
	Collection<Breakfast> getBreakfasts(int start, int length) throws DAOException;
	
	void save(Breakfast breakfast) throws DAOException;
	void delete(Breakfast breakfast) throws DAOException;
}
