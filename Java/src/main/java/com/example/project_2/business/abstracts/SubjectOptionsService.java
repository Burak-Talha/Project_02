package com.example.project_2.business.abstracts;

import com.example.project_2.entities.concretes.SubjectOptions;

import java.util.List;



public interface SubjectOptionsService {
	List<SubjectOptions> getAllSubjectOptions();
	List<SubjectOptions> getSubjectOptionsBySubjectId(int subjectId);
	void create(SubjectOptions subjectOptions);
	void update(SubjectOptions subjectOptions);
	void delete(SubjectOptions subjectOptions);
}
