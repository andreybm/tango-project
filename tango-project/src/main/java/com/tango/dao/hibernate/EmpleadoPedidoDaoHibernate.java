package com.tango.dao.hibernate;
/**
 * @author Esteban Enoc
 *
 */
import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import com.tango.dao.EmpleadoPedidoDao;
import com.tango.model.EmpleadoPedido;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("EmpleadoDao")
public class EmpleadoPedidoDaoHibernate extends GenericDaoHibernate<EmpleadoPedido, Long>implements EmpleadoPedidoDao {

	public EmpleadoPedidoDaoHibernate() {
		super(EmpleadoPedido.class);
	}
	
	@Override
	public List<EmpleadoPedido> findByNombre(String Nombre){
		return getSession().createCriteria(EmpleadoPedido.class).add(Restrictions.eq("Nombre", Nombre)).list();
	}

	@Override
	public List<EmpleadoPedido> findByApellido(String Apellido){
		return getSession().createCriteria(EmpleadoPedido.class).add(Restrictions.eq("Apellido", Apellido)).list();
	}

	@Override
	public List<EmpleadoPedido> findByDepartamento(String Departamento){
		return getSession().createCriteria(EmpleadoPedido.class).add(Restrictions.eq("Departamento", Departamento)).list();
	}
	
	@Override
	public List<EmpleadoPedido> findByCorreo(String Correo){
		return getSession().createCriteria(EmpleadoPedido.class).add(Restrictions.eq("Correo", Correo)).list();
	}
	
}
