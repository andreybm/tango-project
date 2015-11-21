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


import com.tango.dao.EmpleadoDao;
import com.tango.model.Empleado;

// TODO: Auto-generated Javadoc
/**
 * The Class EmpleadoDaoHibernate.
 */
public class EmpleadoDaoHibernate extends GenericDaoHibernate<Empleado, Long> implements EmpleadoDao {

	/**
	 * constructor.
	 */
    public EmpleadoDaoHibernate() {
        super(Empleado.class);
    }

    /* (non-Javadoc)
     * @see com.tango.dao.EmpleadoDao#findByName(java.lang.String)
     */
    @Override
    public List<Empleado> findByName(String Nombre) {
        return getSession().createCriteria(Empleado.class).add(Restrictions.eq("Nombre", Nombre)).list();
    }

    /* (non-Javadoc)
     * @see com.tango.dao.EmpleadoDao#findByDepartamento(java.lang.String)
     */
    @Override
	 public List<Empleado> findByDepartamento(String Departamento){
	    return getSession().createCriteria(Empleado.class).add(Restrictions.eq("Departamento", Departamento)).list();		 
	 }

}
