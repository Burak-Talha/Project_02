package com.project_2.project_2.business.abstracts;

import java.util.List;
import com.project_2.project_2.entities.concretes.SubjectOptions;


public interface SubjectOptionsService {
	List<SubjectOptions> getAllSubject();
	SubjectOptions getSubjectOptionsById(int id);
	void create(SubjectOptions subjectOptions);
	void update(SubjectOptions subjectOptions);
	void delete(SubjectOptions subjectOptions);
}
