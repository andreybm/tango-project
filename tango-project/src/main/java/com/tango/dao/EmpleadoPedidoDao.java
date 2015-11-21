package com.tango.dao;
/**
 * @author Esteban Enoc
 *
 */
import org.appfuse.dao.GenericDao;

import com.tango.model.EmpleadoPedido;
import java.util.List;

public interface EmpleadoPedidoDao extends GenericDao<EmpleadoPedido, Long> {

	public List<EmpleadoPedido> findByNombre(String Nombre);

	public List<EmpleadoPedido> findByApellido(String Apellido);

	public List<EmpleadoPedido> findByDepartamento(String Departamento);

	public List<EmpleadoPedido> findByCorreo(String Correo);
	
}

