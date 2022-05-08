package com.example.project_2.dataAccess.abstracts;

import com.example.project_2.entities.concretes.Subject;

import javax.transaction.Transactional;
import java.util.List;



public interface SubjectDal {
	List<Subject> getAllSubject();
	void create(Subject subject);
	void update(Subject newSubject);
	void delete(Subject subject);
	Subject getSubjectById(int id);

	List<Subject> getByName(String name);
}
