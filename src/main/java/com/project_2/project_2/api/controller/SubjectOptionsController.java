package com.project_2.project_2.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project_2.project_2.business.abstracts.SubjectOptionsService;
import com.project_2.project_2.entities.concretes.SubjectOptions;


@RestController
@RequestMapping("/api/subjectoptions/")
public class SubjectOptionsController {
	
	private SubjectOptionsService subjectOptionsService;

	@Autowired
	public SubjectOptionsController(SubjectOptionsService subjectOptionsService) {
		this.subjectOptionsService = subjectOptionsService;
	}
	
	// Working 17/11/21
	@GetMapping("getall")
	public List<SubjectOptions> getAll(){
		return subjectOptionsService.getAllSubject();
	}
	// Working 17/11/21
	@PostMapping("add")
	public void create(@RequestBody SubjectOptions subjectOptions){
		subjectOptionsService.create(subjectOptions);
	}
	
	@PostMapping("update")
	public void update(@RequestBody SubjectOptions subjectOptions){
		subjectOptionsService.update(subjectOptions);
	}
	
	@PostMapping("delete")
	public void delete(@RequestBody SubjectOptions subjectOptions) {
		subjectOptionsService.delete(subjectOptions);
	}
	
	@GetMapping("subject_options/{id}")
	public SubjectOptions getById(@PathVariable int id){
	return subjectOptionsService.getSubjectOptionsById(id);
	}
	
}
