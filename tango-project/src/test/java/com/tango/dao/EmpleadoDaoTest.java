/**
 * 
 */
package com.tango.dao;

/**
 * @author Esteban Enoc
 *
 */

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.tango.model.Empleado;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class EmpleadoDaoTest extends BaseDaoTestCase {
    @Autowired
    private EmpleadoDao empleadoDao;

    @Test
    public void testFindEmpleadoByNombre() throws Exception {
    	// find all Empleados 
        List<Empleado> empleado = empleadoDao.findByName("Andres Salas Loria");
        assertTrue(empleado.size() > 0);
    }
    
    @Test
    public void testFindEmpleadoByDepartamento() throws Exception {
    	// find all Empleados 
        List<Empleado> empleado = empleadoDao.findByDepartamento("TI");
        assertTrue(empleado.size() > 0);
    }

}
