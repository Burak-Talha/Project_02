package com.project_2.project_2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import javax.transaction.Transactional;


import org.springframework.stereotype.Service;
import com.project_2.project_2.business.abstracts.CategoryService;
import com.project_2.project_2.entities.concretes.SubjectCategory;
import com.project_2.project_2.dataAccess.abstracts.CategoryDal;

@Service
public class SubjectCategoryManager implements CategoryService<SubjectCategory>{
    private CategoryDal<SubjectCategory> categoryDal;

    @Autowired
    public SubjectCategoryManager(CategoryDal<SubjectCategory> categoryDal){
		this.categoryDal=categoryDal;
	}
      
	@Override
	@Transactional
	public List<SubjectCategory> getAll() {
		return this.categoryDal.getAll();
	}

	
	@Override
	@Transactional
	public String getCategoryById(int id) {
		this.categoryDal.getCategoryById(id);
		return null;
	}

	@Override
	@Transactional
	public void create(SubjectCategory category) {
		if(category.getSubjectCategory().length() >= 2 && category.getSubjectCategory().length() <= 30) {
			this.categoryDal.create(category);	
		}
		else {
			System.out.println("Konu kategorisinin ismi çok uzun veya çok kısadır. Referans aralığı : 2 ile 30 karakter arasındadır.");
		}
	}

	@Override
	@Transactional
	public void update(SubjectCategory category) {
		if(category.getSubjectCategory().length() >= 2 && category.getSubjectCategory().length() <= 30) {
			this.categoryDal.update(category);	
		}
		else {
			System.out.println("Konu kategorisinin ismi çok uzun veya çok kısadır. Referans aralığı : 2 ile 30 karakter arasındadır.");
		}
	}

	@Override
	@Transactional
	public void delete(SubjectCategory category) {
		this.categoryDal.delete(category);
	}

 
}