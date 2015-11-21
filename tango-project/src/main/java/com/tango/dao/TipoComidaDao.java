package com.tango.dao;

import org.appfuse.dao.GenericDao;

import com.tango.model.TipoComida;

import java.util.List;


public interface TipoComidaDao extends GenericDao<TipoComida, Long> {

   public List<TipoComida> findByDescripcion(String TipoComida);

}