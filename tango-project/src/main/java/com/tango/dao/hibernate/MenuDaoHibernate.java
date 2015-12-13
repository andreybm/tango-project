package com.tango.dao.hibernate;

import org.springframework.stereotype.Repository;

import java.util.List;
import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tango.dao.LoginDao;
import com.tango.dao.MenuDao;
import com.tango.model.Login;
import com.tango.model.Menu;

@Repository("MenuDao")
public class MenuDaoHibernate extends GenericDaoHibernate<Menu, Long>implements MenuDao{

	public MenuDaoHibernate(Class<Menu> persistentClass) {
		super(Menu.class);
		
	}
	
	public List<Menu> findByMenuID(Long menuId) {
		
		return getSession().createCriteria(Menu.class).add(Restrictions.eq("menuId", menuId)).list();
		
	}

}
