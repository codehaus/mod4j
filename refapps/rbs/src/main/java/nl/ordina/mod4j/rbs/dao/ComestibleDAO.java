package nl.ordina.mod4j.rbs.dao;

import java.io.Serializable;
import java.util.Collection;

import nl.ordina.mod4j.rbs.model.Breakfast;
import nl.ordina.mod4j.rbs.model.Comestible;



public interface ComestibleDAO extends Serializable
{
	Comestible getComestible(long id) throws DAOException;
	Comestible getComestible(String name) throws DAOException;
	long getComestibleCount() throws DAOException;
	Collection<Comestible> getComestibles() throws DAOException;
	Collection<Comestible> getComestibles(int start, int length) throws DAOException;
	Collection<Comestible> getUnusedComestibles(Breakfast breakfast) throws DAOException;
	
	void save(Comestible comestible) throws DAOException;
	void delete(Comestible comestible) throws DAOException;
}
