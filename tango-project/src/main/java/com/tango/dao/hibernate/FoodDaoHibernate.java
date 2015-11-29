package com.tango.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import com.tango.dao.FoodDao;
import com.tango.model.Food;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("foodDao")
public class FoodDaoHibernate extends GenericDaoHibernate<Food, Long>implements FoodDao {

	public FoodDaoHibernate() {
		super(Food.class);
	}

	@SuppressWarnings("unchecked")
	public List<Food> findByDishName(String dishName) {
		return getSession().createCriteria(Food.class).add(Restrictions.eq("dishName", dishName)).list();
	}

	
	public List<Food> findByCategory(String category) {
		@SuppressWarnings("unchecked")
		List<Food> foodList = getSession().createCriteria(Food.class).createAlias("dishCategory", "dc")
				.add(Restrictions.eq("dc.category", category)).list();
		return foodList;
	}
}