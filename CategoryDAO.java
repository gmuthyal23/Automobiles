package com.niit.shoppingback.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shoppingback.model.Category;
@Repository
public interface CategoryDAO {
	public boolean save(Category category);
	public boolean update(Category category);
	public boolean delete(Category category);
	
	
	public Category get(String string);
	public List<Category> list();
}
