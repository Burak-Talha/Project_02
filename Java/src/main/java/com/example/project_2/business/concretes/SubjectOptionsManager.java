package com.example.project_2.business.concretes;

import java.util.List;

import com.example.project_2.business.abstracts.SubjectOptionsService;
import com.example.project_2.dataAccess.abstracts.SubjectOptionsDal;
import com.example.project_2.entities.concretes.SubjectOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectOptionsManager implements SubjectOptionsService {

	private SubjectOptionsDal subjectOptionsDal;

	@Autowired
	public SubjectOptionsManager(SubjectOptionsDal subjectOptionsDal) {
		this.subjectOptionsDal = subjectOptionsDal;
	}

	@Override
	public List<SubjectOptions> getAllSubjectOptions() {
		return subjectOptionsDal.getAllSubjectOptions();
	}

	@Override
	public List<SubjectOptions> getSubjectOptionsBySubjectId(int subjectId) {
		return subjectOptionsDal.getSubjectOptionsBySubjectId(subjectId);
	}

	@Override
	public void create(SubjectOptions subjectOptions) {
		subjectOptionsDal.create(subjectOptions);
	}

	@Override
	public void update(SubjectOptions subjectOptions) {
		subjectOptionsDal.update(subjectOptions);
	}

	@Override
	public void delete(SubjectOptions subjectOptions) {
		subjectOptionsDal.delete(subjectOptions);
	}


}
