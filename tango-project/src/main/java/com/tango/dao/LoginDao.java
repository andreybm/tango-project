package com.tango.dao;

import java.util.List;
import org.appfuse.dao.GenericDao;
import com.tango.model.Login;

public interface LoginDao extends GenericDao<Login, Long> {
	public List<Login> findByUsername(String username);
}