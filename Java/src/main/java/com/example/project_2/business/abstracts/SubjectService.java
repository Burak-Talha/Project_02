package com.example.project_2.business.abstracts;

import java.util.List;

import com.example.project_2.entities.concretes.Subject;
import org.springframework.stereotype.Service;



public interface SubjectService {
	List<Subject> getAllSubject();
	void create(Subject subject);
	void update(Subject subject);
	void delete(Subject subject);
	Subject getSubjectById(int id);
	List<Subject> getByName(String name);
}
