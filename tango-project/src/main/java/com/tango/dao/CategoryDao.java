package com.tango.dao;

import org.appfuse.dao.GenericDao;
import com.tango.model.Category;

import java.util.List;

public interface CategoryDao extends GenericDao<Category, Long> {

	public List<Category> findByCategoryName(String categoryName);

	public List<Category> findByCategoryDescription(String categoryDescription);
}