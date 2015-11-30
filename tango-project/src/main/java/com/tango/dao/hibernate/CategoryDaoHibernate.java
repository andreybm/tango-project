package com.tango.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import com.tango.dao.CategoryDao;
import com.tango.model.Category;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("categoryDao")
public class CategoryDaoHibernate extends GenericDaoHibernate<Category, Long>implements CategoryDao {

	public CategoryDaoHibernate() {
		super(Category.class);
	}

	@SuppressWarnings("unchecked")
	public List<Category> findByCategoryName(String categoryName) {
		return getSession().createCriteria(Category.class).add(Restrictions.eq("categoryName", categoryName)).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Category> findByCategoryDescription(String categoryDescription) {
		return getSession().createCriteria(Category.class).add(Restrictions.eq("categoryDescription", categoryDescription)).list();
	}
	
}