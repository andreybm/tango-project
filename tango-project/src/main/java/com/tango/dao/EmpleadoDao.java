package com.tango.dao;

import org.appfuse.dao.GenericDao;

import com.tango.model.Empleado;
import java.util.List;

public interface EmpleadoDao extends GenericDao<Empleado, Long> {

	public List<Empleado> findByNombre(String Nombre);

	public List<Empleado> findByApellido(String Apellido);

	public List<Empleado> findByDepartamento(String Departamento);

	public List<Empleado> findByCorreo(String Correo);
	
}

