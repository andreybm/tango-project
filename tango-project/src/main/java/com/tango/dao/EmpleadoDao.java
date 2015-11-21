/**
 * 
 */
package com.tango.dao;


import org.appfuse.dao.GenericDao;
import com.tango.model.Empleado;
import java.util.List;
/**
 * @author Esteban Enoc
 *
 */
public interface EmpleadoDao extends GenericDao<Empleado, Long> {
	
	 public List<Empleado> findByName(String Empleado);

	 public List<Empleado> findByDepartamento(String Departamento);

}
