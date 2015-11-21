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

public class ComidaDaoTest extends BaseDaoTestCase {
    @Autowired
    private ComidaDao comidaDao;

    @Test
    public void testFindComidaByNombre() throws Exception {
        List<Comida> comidas = comidaDao.findByNombre("Nachos"); 
        boolean flagFoodType;
        flagFoodType = false;
        // print all foods with the associated FoodType
        for(Comida comida: comidas){
        	log.debug(comida.toString());
        	if(comida.getTipoComida() != null) 
        	{
        		flagFoodType=true;
        		break;
        	}
        }
        // the test is OK if return one or more foods and FoodType
        assertTrue(flagFoodType);       
        assertTrue(comidas.size() > 0);
    }
}