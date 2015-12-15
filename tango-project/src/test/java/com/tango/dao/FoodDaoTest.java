package com.tango.dao;

import org.appfuse.dao.BaseDaoTestCase;
import com.tango.model.Food;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import java.util.List;
import static org.junit.Assert.*;

public class FoodDaoTest extends BaseDaoTestCase {
	
    @Autowired
    private FoodDao foodDao;

    @Test
    public void testFindByDishName() throws Exception {
        List<Food> food = foodDao.findByDishName("Hamburguesa");
        assertTrue(food.size() > 0);
    }
    
    @Test
    public void testFindByCategory() throws Exception {
        List<Food> food = foodDao.findByCategory("Rapida");
        assertTrue(food.size() > 0);
    }
    
    @Test(expected=DataAccessException.class)
    public void testAddAndRemovePerson() throws Exception {
        Food food = new Food();
        food.setDaysServed("Miercoles");
        food.setDishDescription("Comidas RApidas");
        food.setDishName("Chalupas");
        //food.setFoodCategory("1");

        food = foodDao.save(food);
        flush();

        food = foodDao.get(food.getFoodId());

        assertEquals("Country", food.getDishName());
        assertNotNull(food.getFoodId());

        log.debug("removing person...");

        foodDao.remove(food.getFoodId());
        flush();

        // should throw DataAccessException
        foodDao.get(food.getFoodId());
    }
    
}
