/**
 * 
 */
package com.tango.dao;


import org.appfuse.dao.GenericDao;
import com.tango.model.Empleado;
import java.util.List;
// TODO: Auto-generated Javadoc

/**
 * The Interface EmpleadoDao.
 *
 * @author Esteban Enoc
 */
public interface EmpleadoDao extends GenericDao<Empleado, Long> {
	
	 /**
 	 * Find by name.
 	 *
 	 * @param Nombre the nombre
 	 * @return the list
 	 */
 	public List<Empleado> findByName(String Nombre);

	 /**
 	 * Find by departamento.
 	 *
 	 * @param Departamento the departamento
 	 * @return the list
 	 */
 	public List<Empleado> findByDepartamento(String Departamento);

}
