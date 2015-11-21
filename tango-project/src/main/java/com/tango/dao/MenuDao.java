package com.tango.dao;


import org.appfuse.dao.GenericDao;

import com.tango.model.Menu;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Interface MenuDao.
 */
public interface MenuDao extends GenericDao<Menu, Long> {
	
	 /**
 	 * Find by empleado id.
 	 *
 	 * @param EmpleadoID the empleado id
 	 * @return the list
 	 */
 	public List<Menu> findByEmpleadoID(Long EmpleadoID);
}
