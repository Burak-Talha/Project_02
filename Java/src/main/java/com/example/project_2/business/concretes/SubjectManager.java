package com.example.project_2.business.concretes;

import java.util.List;

import com.example.project_2.business.abstracts.SubjectService;
import com.example.project_2.dataAccess.abstracts.SubjectDal;
import com.example.project_2.entities.concretes.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectManager implements SubjectService {

	private SubjectDal subjectDal;

	@Autowired
	public SubjectManager(SubjectDal subjectDal){
		this.subjectDal = subjectDal;
	}

	@Override
	public List<Subject> getAllSubject() {
		return this.subjectDal.getAllSubject();
	}

	@Override
	public void create(Subject subject) {
		subjectDal.create(subject);
	}

	@Override
	public void update(Subject subject) {
		subjectDal.update(subject);
	}

	@Override
	public void delete(Subject subject) {
		subjectDal.delete(subject);
	}

	@Override
	public Subject getSubjectById(int id) {
		return subjectDal.getSubjectById(id);
	}

	@Override
	public List<Subject> getByName(String name) {
		return subjectDal.getByName(name);
	}


}
