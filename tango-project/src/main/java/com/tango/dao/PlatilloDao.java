package com.tango.dao;
/**
 * @author Esteban Enoc
 *
 */
import org.appfuse.dao.GenericDao;

import com.tango.model.Platillo;
import java.util.List;

public interface PlatilloDao extends GenericDao<Platillo, Long> {

	public List<Platillo> findByNombre(String Nombre);

	public List<Platillo> findByDescripcion(String Descripcion);

	public List<Platillo> findByDias(String DiasDisponibles);
	
}
