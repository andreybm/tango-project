/**
 * 
 */
package com.tango.dao;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tango.model.TipoComida;

// TODO: Auto-generated Javadoc
/**
 * The Class TipoComidaDaoTest.
 *
 * @author Esteban Enoc
 */
public class TipoComidaDaoTest extends BaseDaoTestCase {
	
	/** The tipo comida dao. */
	@Autowired
    private TipoComidaDao tipoComidaDao;

    /**
     * Test find tipo comida by descripcion.
     *
     * @throws Exception the exception
     */
    @Test
    public void testFindTipoComidaByDescripcion() throws Exception {
    	// find all foodType 
        List<TipoComida> tipocomida = tipoComidaDao.findByDescripcion("Comida Rapida");
        assertTrue(tipocomida.size() > 0);
    }
}
