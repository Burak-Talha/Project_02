package com.example.project_2.api.controller;

import com.example.project_2.business.abstracts.CategoryService;
import com.example.project_2.business.abstracts.SubjectService;
import com.example.project_2.business.abstracts.UsersService;
import com.example.project_2.business.concretes.SubjectManager;
import com.example.project_2.entities.concretes.Subject;
import com.example.project_2.entities.concretes.SubjectCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//ALl methods working. 07/05/22

@RestController
@RequestMapping("/api/subject/")
public class SubjectController {

    private SubjectService subjectService;
    private CategoryService categoryService;

    @Autowired
    public SubjectController(SubjectService subjectService, CategoryService categoryService) {
        this.subjectService = subjectService;
        this.categoryService = categoryService;
    }

    @GetMapping("getall")
    public List<Subject> getAll(){
        return subjectService.getAllSubject();
    }

    @GetMapping("{id}")
    public Subject getById(@PathVariable int id){
        return subjectService.getSubjectById(id);
    }

    @GetMapping("getbyname/{name}")
    List<Subject> getByName(@PathVariable("name") String name){
        return subjectService.getByName(name);
    }

    @PostMapping("add")
    public void create(@RequestBody Subject subject){
        subjectService.create(subject);
    }

    @PostMapping("addsubjectcategory")
    public void createSubjectCategory(SubjectCategory subjectCategory){
        categoryService.create(subjectCategory);
    }

    @PostMapping("update")
    public void update(@RequestBody Subject subject){
        subjectService.update(subject);
    }

    @PostMapping("delete")
    public void delete(@RequestBody Subject subject){
        subjectService.delete(subject);
    }






}
