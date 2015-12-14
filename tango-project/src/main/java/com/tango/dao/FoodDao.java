package com.tango.dao;

import org.appfuse.dao.GenericDao;
import com.tango.model.Food;

import java.util.List;

public interface FoodDao extends GenericDao<Food, Long> {

	public List<Food> findByDishName(String dishName);

	public List<Food> findByCategory(String foodCategory);
}