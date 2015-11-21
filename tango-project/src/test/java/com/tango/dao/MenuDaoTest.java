package com.tango.dao;

/**
 * @author Esteban Enoc
 *
 */

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.tango.model.Comida;
import com.tango.model.Empleado;
import com.tango.model.Menu;


public class MenuDaoTest extends BaseDaoTestCase {

	 @Autowired
	    private MenuDao MenuDao;

}
