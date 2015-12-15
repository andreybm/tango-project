package com.tango.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import com.tango.dao.MenuDao;
import com.tango.model.Menu;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("MenuDao")
public class MenuDaoHibernate extends GenericDaoHibernate<Menu, Long>implements MenuDao{

	public MenuDaoHibernate(){
		super(Menu.class);	
	}
	
	@SuppressWarnings("unchecked")
	public List<Menu>findByMenuId(Long menuId){
		
		return getSession().createCriteria(Menu.class).add(Restrictions.eq("menu_id", menuId)).list();
		
	}
	
}
