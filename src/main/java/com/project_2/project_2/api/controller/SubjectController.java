package com.project_2.project_2.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project_2.project_2.business.abstracts.SubjectService;
import com.project_2.project_2.entities.concretes.Subject;




@RestController
@RequestMapping("/api/subject/")
public class SubjectController {

	private SubjectService subjectService;
	
	@Autowired
	public SubjectController(SubjectService subjectService) {
		this.subjectService = subjectService;
	}
	
	// Working 16/11/21
	@GetMapping("getall")
	public List<Subject> getAllSubject(){
		return subjectService.getAllSubject();
	}
	
	// Working 16/11/21
	@PostMapping("add")
	public void create(@RequestBody Subject subject){
		subjectService.create(subject);
	}
	
	@PostMapping("update")
	public void update(@RequestBody Subject subject){
		subjectService.update(subject);
	}
	
	@GetMapping("get_subject/{id}")
	public String getSubjectById(@PathVariable int id){
	return subjectService.getSubjectById(id);
	}
	
	
}
