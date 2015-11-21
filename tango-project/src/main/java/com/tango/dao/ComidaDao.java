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

public interface ComidaDao extends GenericDao<Comida, Long> {

	 public List<Comida> findByNombre(String Nombre);
	 
	 public List<Comida> findByDescripcion(String Descripcion);

	 public List<Comida> findByDias(String Dias);
	 
}