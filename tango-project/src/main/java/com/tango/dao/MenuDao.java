package com.tango.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import com.tango.model.Food;
import com.tango.model.Menu;

public interface MenuDao extends GenericDao<Menu, Long> {
	
	public List<Menu> findByMenuId(Long menuId);
	

}
