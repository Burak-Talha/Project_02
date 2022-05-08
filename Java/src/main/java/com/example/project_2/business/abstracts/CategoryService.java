package com.example.project_2.business.abstracts;

import java.util.List;

import com.example.project_2.entities.abstracts.Category;
import com.example.project_2.entities.concretes.Subject;


public interface CategoryService<T extends Category> {
	List<T> getAll();
	Category getCategoryById(int id);
	void create(T category);
	void update(T category);
	void delete(T category);

	List<Subject> getByName(String name);
}
