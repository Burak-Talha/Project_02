package com.example.project_2.dataAccess.abstracts;

import java.util.List;
import com.example.project_2.entities.abstracts.Category;
import com.example.project_2.entities.concretes.Subject;
import com.example.project_2.entities.concretes.SubjectCategory;


public interface CategoryDal<T extends Category> {
	List<T> getAll();
	SubjectCategory getCategoryById(int id);
	void create(T category);
	void update(T category);
	void delete(T category);

	List<Category> getByName(String name);
}
