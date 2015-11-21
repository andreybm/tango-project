package com.tango.dao;

import org.appfuse.dao.GenericDao;

import com.tango.model.TipoComida;

import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * The Interface TipoComidaDao.
 */
public interface TipoComidaDao extends GenericDao<TipoComida, Long> {

   /**
    * Find by descripcion.
    *
    * @param TipoComida the tipo comida
    * @return the list
    */
   public List<TipoComida> findByDescripcion(String TipoComida);

}