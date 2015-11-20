package com.tango.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import com.tango.dao.EmpleadoDao;
import com.tango.model.Empleado;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("EmpleadoDao")
public class EmpleadoDaoHibernate extends GenericDaoHibernate<Empleado, Long>implements EmpleadoDao {

	public EmpleadoDaoHibernate() {
		super(Empleado.class);
	}
	
	@Override
	public List<Empleado> findByNombre(String Nombre){
		return getSession().createCriteria(Empleado.class).add(Restrictions.eq("Nombre", Nombre)).list();
	}

	@Override
	public List<Empleado> findByApellido(String Apellido){
		return getSession().createCriteria(Empleado.class).add(Restrictions.eq("Apellido", Apellido)).list();
	}

	@Override
	public List<Empleado> findByDepartamento(String Departamento){
		return getSession().createCriteria(Empleado.class).add(Restrictions.eq("Departamento", Departamento)).list();
	}
	
	@Override
	public List<Empleado> findByCorreo(String Correo){
		return getSession().createCriteria(Empleado.class).add(Restrictions.eq("Correo", Correo)).list();
	}
	
}
