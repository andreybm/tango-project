package com.tango.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;


import com.tango.dao.ComidaDao;
import com.tango.model.Comida;

// TODO: Auto-generated Javadoc
/**
 * The Class ComidaDaoHibernate.
 */
@Repository("comidaDao")
public class ComidaDaoHibernate extends GenericDaoHibernate<Comida, Long> implements ComidaDao {

	/**
	 * constructor.
	 */
    public ComidaDaoHibernate() {
        super(Comida.class);
    }
	
    /* (non-Javadoc)
     * @see com.tango.dao.ComidaDao#findByNombre(java.lang.String)
     */
    @Override
    public List<Comida> findByNombre(String Nombre) {
        return getSession().createCriteria(Comida.class).add(Restrictions.eq("Nombre", Nombre)).list();
    }
    
    /* (non-Javadoc)
     * @see com.tango.dao.ComidaDao#findByDescripcion(java.lang.String)
     */
    @Override
    public List<Comida> findByDescripcion(String Descripcion) {
        return getSession().createCriteria(Comida.class).add(Restrictions.eq("Descripcion", Descripcion)).list();
    }
    
    /* (non-Javadoc)
     * @see com.tango.dao.ComidaDao#findByDias(java.lang.String)
     */
    @Override
    public List<Comida> findByDias(String Dias) {
        return getSession().createCriteria(Comida.class).add(Restrictions.eq("Dias", Dias)).list();
    }
}
