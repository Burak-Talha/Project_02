package com.project_2.project_2.dataAccess.abstracts;

import java.util.List;

import com.project_2.project_2.entities.abstracts.Category;


public interface CategoryDal<T extends Category> {
	List<T> getAll();
	String getCategoryById(int id);
	void create(T category);
	void update(T category);
	void delete(T category);
}
