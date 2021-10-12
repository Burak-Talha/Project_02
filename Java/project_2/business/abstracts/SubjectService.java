package com.project_2.project_2.business.abstracts;

import java.util.List;
import com.project_2.project_2.entities.concretes.Subject;


public interface SubjectService {
	List<Subject> getAllSubject();
	void create(Subject subject);
	void update(Subject subject);
	String getSubjectById(int id);
}
