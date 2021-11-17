package com.project_2.project_2.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project_2.project_2.business.abstracts.CategoryService;
import com.project_2.project_2.entities.concretes.SubjectCategory;

@RestController
@RequestMapping("/api/subjectcategory/")
public class SubjectCategoryController {

	CategoryService<SubjectCategory> categoryService;
	
	@Autowired
	public SubjectCategoryController(CategoryService<SubjectCategory> categoryService) {
		this.categoryService = categoryService;
	}
	
	// Working 16/11/21
	@GetMapping("getall")
	public List<SubjectCategory> getAll(){
		return categoryService.getAll();
	}
	
	// Working 16/11/21
	@GetMapping("add")
	public void create(@RequestBody SubjectCategory subjectCategory) {
		categoryService.create(subjectCategory);
	}
	@GetMapping("update")
	public void update(@RequestBody SubjectCategory subjectCategory) {
		categoryService.update(subjectCategory);
	}
	
	@GetMapping("delete")
	public void delete(@RequestBody SubjectCategory subjectCategory) {
		categoryService.delete(subjectCategory);
	}
	@GetMapping("getCategoryById")
	public String getCategoryById(@PathVariable int id) {
		return categoryService.getCategoryById(id);
	}
	
	
	
}
