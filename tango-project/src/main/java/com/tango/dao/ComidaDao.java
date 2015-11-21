/**
 * 
 */
package com.tango.dao;

/**
 * @author Esteban Enoc
 *
 */

import org.appfuse.dao.GenericDao;
import com.tango.model.Comida;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Interface ComidaDao.
 */
public interface ComidaDao extends GenericDao<Comida, Long> {

	 /**
 	 * Find by nombre.
 	 *
 	 * @param Nombre the nombre
 	 * @return the list
 	 */
 	public List<Comida> findByNombre(String Nombre);
	 
	 /**
 	 * Find by descripcion.
 	 *
 	 * @param Descripcion the descripcion
 	 * @return the list
 	 */
 	public List<Comida> findByDescripcion(String Descripcion);

	 /**
 	 * Find by dias.
 	 *
 	 * @param Dias the dias
 	 * @return the list
 	 */
 	public List<Comida> findByDias(String Dias);
	 
}