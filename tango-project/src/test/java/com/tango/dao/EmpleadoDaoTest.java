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
import com.tango.model.TipoComida;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class EmpleadoDaoTest extends BaseDaoTestCase {
    @Autowired
    private TipoComidaDao tipoComidaDao;

    @Test
    public void testFindTipoComidaByDescripcion() throws Exception {
    	// find all foodType 
        List<TipoComida> tipocomida = tipoComidaDao.findByDescripcion("Comida Rapida");
        assertTrue(tipocomida.size() > 0);
    }

}
