package com.example.project_2.business.concretes;

import java.util.List;


import com.example.project_2.business.abstracts.CategoryService;
import com.example.project_2.dataAccess.abstracts.CategoryDal;
import com.example.project_2.entities.concretes.Subject;
import com.example.project_2.entities.concretes.SubjectCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectCategoryManager implements CategoryService<SubjectCategory> {

	private CategoryDal categoryDal;

	@Autowired
	public SubjectCategoryManager(CategoryDal categoryDal) {
		this.categoryDal = categoryDal;
	}

	@Override
	public List<SubjectCategory> getAll() {
		return categoryDal.getAll();
	}

	@Override
	public SubjectCategory getCategoryById(int id) {
		return categoryDal.getCategoryById(id);
	}

	@Override
	public void create(SubjectCategory category) {
		categoryDal.create(category);
	}

	@Override
	public void update(SubjectCategory category) {
		categoryDal.update(category);
	}

	@Override
	public void delete(SubjectCategory category) {
		categoryDal.delete(category);
	}

	@Override
	public List<Subject> getByName(String name) {
		return categoryDal.getByName(name);
	}


}
