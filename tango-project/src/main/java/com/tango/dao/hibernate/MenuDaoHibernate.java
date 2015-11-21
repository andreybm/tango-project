/**
 * 
 */
package com.tango.dao.hibernate;

/**
 * @author Esteban Enoc
 *
 */
import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;


import com.tango.dao.MenuDao;
import com.tango.model.Menu;

@Repository("menuDao")
public class MenuDaoHibernate extends GenericDaoHibernate<Menu, Long> implements MenuDao {

	/**
	 * constructor
	 */
    public MenuDaoHibernate() {
        super(Menu.class);
    }
    
    @Override
	    public List<Menu> findByEmpleadoID(Long EmpleadoID) {
	        return getSession().createCriteria(Menu.class).createCriteria("EmpleadoID").add(Restrictions.eq("EmpleadoID", EmpleadoID)).list();
	    }
    
}
