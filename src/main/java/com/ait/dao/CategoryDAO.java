package com.ait.dao;

import com.ait.entity.CategoryEntity;

public interface CategoryDAO {
	
	void saveCategory(CategoryEntity entity);
	CategoryEntity fetchCategory(Integer categoryId);
	void removeCategory(Integer categoryId);

}
