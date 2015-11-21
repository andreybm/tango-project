package com.tango.dao;


import org.appfuse.dao.GenericDao;

import com.tango.model.Menu;
import java.util.List;

public interface MenuDao extends GenericDao<Menu, Long> {
	
	 public List<Menu> findByEmpleadoID(Long EmpleadoID);
}
