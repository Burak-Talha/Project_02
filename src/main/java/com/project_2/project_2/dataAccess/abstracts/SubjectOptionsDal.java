package com.project_2.project_2.dataAccess.abstracts;

import java.util.List;
import com.project_2.project_2.entities.concretes.SubjectOptions;


public interface SubjectOptionsDal {
	List<SubjectOptions> getAllSubject();
	String getSubjectOptionsById(int id);
	void create(SubjectOptions subjectOptions);
	void update(SubjectOptions subjectOptions);
	void delete(SubjectOptions subjectOptions);
}
