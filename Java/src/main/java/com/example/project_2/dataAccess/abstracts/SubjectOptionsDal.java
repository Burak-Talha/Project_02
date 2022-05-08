package com.example.project_2.dataAccess.abstracts;

import java.util.List;

import com.example.project_2.entities.concretes.SubjectOptions;



public interface SubjectOptionsDal {
	List<SubjectOptions> getAllSubjectOptions();

	List<SubjectOptions> getSubjectOptionsBySubjectId(int subjectId);
	void create(SubjectOptions subjectOptions);
	void update(SubjectOptions subjectOptions);
	void delete(SubjectOptions subjectOptions);
}
