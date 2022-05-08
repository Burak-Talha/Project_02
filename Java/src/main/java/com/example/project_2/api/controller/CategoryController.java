package com.example.project_2.api.controller;

import com.example.project_2.business.abstracts.CategoryService;
import com.example.project_2.business.abstracts.SubjectService;
import com.example.project_2.entities.abstracts.Category;
import com.example.project_2.entities.concretes.Subject;
import com.example.project_2.entities.concretes.SubjectCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// All methods working. 07/05/22

@RestController
@RequestMapping("/api/category/")
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("getall")
    public List<Subject> getAll(){
        return categoryService.getAll();
    }

    @GetMapping("{id}")
    public Category getById(@PathVariable int id){
        return categoryService.getCategoryById(id);
    }

    @GetMapping("getbyname/{name}")
    List<Subject> getByName(@PathVariable("name") String name){
        return categoryService.getByName(name);
    }

    @PostMapping("add")
    public void create(@RequestBody SubjectCategory subjectCategory){
        categoryService.create(subjectCategory);
    }

    @PostMapping("update")
    public void updateSubjectCategory(@RequestBody SubjectCategory subjectCategory){
        categoryService.update(subjectCategory);
    }

    @PostMapping("delete")
    public void delete(@RequestBody SubjectCategory subjectCategory){
        categoryService.delete(subjectCategory);
    }
}
