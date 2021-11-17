package com.project_2.project_2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_2.project_2.business.abstracts.SubjectOptionsService;
import com.project_2.project_2.entities.concretes.SubjectOptions;
import com.project_2.project_2.dataAccess.abstracts.SubjectOptionsDal;

@Service
public class SubjectOptionsManager implements SubjectOptionsService{
    private SubjectOptionsDal subjectOptionsDal;
    @Autowired
    public SubjectOptionsManager(com.project_2.project_2.dataAccess.abstracts.SubjectOptionsDal subjectOptionsDal){
        this.subjectOptionsDal=subjectOptionsDal;
    }
    @Override
	public List<SubjectOptions> getAllSubject() {
		return this.subjectOptionsDal.getAllSubject();
	}

	@Override
	public SubjectOptions getSubjectOptionsById(int id) {
		this.subjectOptionsDal.getSubjectOptionsById(id);
		return null;
	}

	@Override
	public void create(SubjectOptions subjectOptions) {
		if (subjectOptions.getSubjectOptions().length() >= 1 && subjectOptions.getSubjectOptions().length() <= 25) {
		this.subjectOptionsDal.create(subjectOptions);
		}
		else {
			System.out.println("Girilen isim değerinin uzunluk parametreleri geçerli değildir.");
		}
	}

	@Override
	public void update(SubjectOptions subjectOptions) {
		if (subjectOptions.getSubjectOptions().length() >= 1 && subjectOptions.getSubjectOptions().length() >= 25) {
			this.subjectOptionsDal.update(subjectOptions);
		}
		else {
			System.out.println("Girilen isim değerinin uzunluk parametreleri geçerli değildir.");
		}
	}

	@Override
	public void delete(SubjectOptions subjectOptions) {
		this.subjectOptionsDal.delete(subjectOptions);
		
	}


}