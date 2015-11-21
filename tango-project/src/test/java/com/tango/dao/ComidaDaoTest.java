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
import org.springframework.dao.DataAccessException;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.tango.dao.ComidaDao;
import com.tango.model.Comida;

// TODO: Auto-generated Javadoc
/**
 * The Class ComidaDaoTest.
 */
public class ComidaDaoTest extends BaseDaoTestCase {
    
    /** The comida dao. */
    @Autowired
    private ComidaDao comidaDao;

    /**
     * Test find comida by nombre.
     *
     * @throws Exception the exception
     */
    @Test
    public void testFindComidaByNombre() throws Exception {
        List<Comida> comidas = comidaDao.findByNombre("Nachos"); 
        boolean flagTipoComida;
        flagTipoComida= false;
        // print all foods with the associated FoodType
        for(Comida comida: comidas){
        	log.debug(comida.toString());
        	if(comida.getTipoComida() != null) 
        	{
        		flagTipoComida=true;
        		break;
        	}
        }
        // the test is OK if return one or more foods and FoodType
        assertTrue(flagTipoComida);       
        assertTrue(comidas.size() > 0);
    }
}