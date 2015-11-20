package com.tango.dao.hibernate;


import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import com.tango.dao.PlatilloDao;
import com.tango.model.Platillo;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("platilloDao")
public class PlatilloDaoHibernate extends GenericDaoHibernate<Platillo, Long>implements PlatilloDao {

	public PlatilloDaoHibernate() {
		super(Platillo.class);
	}

	@Override
	public List<Platillo> findByNombre(String Nombre) {
		return getSession().createCriteria(Platillo.class).add(Restrictions.eq("Nombre", Nombre)).list();
	}

	@Override
	public List<Platillo> findByDias(String DiasDisponibles) {
		return getSession().createCriteria(Platillo.class).add(Restrictions.eq("Dias_Disponibles", DiasDisponibles)).list();
	}

	@Override
	public List<Platillo> findByDescripcion(String Descripcion) {
		return getSession().createCriteria(Platillo.class).add(Restrictions.eq("Descripcion", Descripcion)).list();
	}
	
}
