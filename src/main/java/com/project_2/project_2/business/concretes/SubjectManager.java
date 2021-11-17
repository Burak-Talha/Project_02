package com.project_2.project_2.business.concretes;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_2.project_2.business.abstracts.SubjectService;
import com.project_2.project_2.entities.concretes.Subject;
import com.project_2.project_2.dataAccess.abstracts.SubjectDal;

@Service
public class SubjectManager implements SubjectService{
    
    private SubjectDal subjectDal;

    @Autowired
    public SubjectManager(SubjectDal subjectDal){
        this.subjectDal=subjectDal;
    }
    
	@Override
	@Transactional
	public List<Subject> getAllSubject() {
		return this.subjectDal.getAllSubject();
	}

	@Override
	@Transactional
	public void create(Subject subject) {
		if(subject.getSubjectName().length() >= 2 && subject.getSubjectName().length() <= 45) {
		this.subjectDal.create(subject);
		}
		else {
			System.out.println("Girilen isimin uzunluk değeri geçersiz");
		}
	}

	@Override
	@Transactional
	public void update(Subject subject) {
		if(subject.getSubjectName().length() >= 2 && subject.getSubjectName().length() >= 45) {
		this.subjectDal.update(subject);
		}
		else {
			System.out.println("Girilen isimin uzunluk değeri geçersiz");
		}	
	}

	@Override
	@Transactional
	public String getSubjectById(int id) {
		this.subjectDal.getSubjectById(id);
		return null;
	}

}