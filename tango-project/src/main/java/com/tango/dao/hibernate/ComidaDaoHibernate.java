package com.tango.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;


import com.tango.dao.ComidaDao;
import com.tango.model.Comida;

@Repository("comidaDao")
public class ComidaDaoHibernate extends GenericDaoHibernate<Comida, Long> implements ComidaDao {

	/**
	 * constructor
	 */
    public ComidaDaoHibernate() {
        super(Comida.class);
    }
	
    @Override
    public List<Comida> findByNombre(String Nombre) {
        return getSession().createCriteria(Comida.class).add(Restrictions.eq("Nombre", Nombre)).list();
    }
    
    @Override
    public List<Comida> findByDescripcion(String Descripcion) {
        return getSession().createCriteria(Comida.class).add(Restrictions.eq("Descripcion", Descripcion)).list();
    }
    
    @Override
    public List<Comida> findByDias(String Dias) {
        return getSession().createCriteria(Comida.class).add(Restrictions.eq("Dias", Dias)).list();
    }
}
