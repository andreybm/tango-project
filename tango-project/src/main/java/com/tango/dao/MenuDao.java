package com.tango.dao;

import java.util.List;
import org.appfuse.dao.GenericDao;
import com.tango.model.Menu;

public interface MenuDao {
	
	public List<Menu> findByMenuID(Long menuId);

}
