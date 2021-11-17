package com.project_2.project_2.dataAccess.concretes;

import java.util.List;


import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_2.project_2.dataAccess.abstracts.SubjectOptionsDal;
import com.project_2.project_2.entities.concretes.SubjectOptions;



@Repository
public class HibernateSubjectOptionsDal implements SubjectOptionsDal{

	private EntityManager entityManager;
	
	@Autowired
	public HibernateSubjectOptionsDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<SubjectOptions> getAllSubject() {
		Session session = entityManager.unwrap(Session.class);
		String query = "from SubjectOptions";
		List<SubjectOptions> subjectOptions = session.createQuery(query, SubjectOptions.class).list();
		return subjectOptions;
	}

	@Override
	@Transactional
	public void create(SubjectOptions subjectOptions) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(subjectOptions);
	}

	@Override
	@Transactional
	public void update(SubjectOptions subjectOptions) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(subjectOptions);
	}

	@Override
	@Transactional
	public void delete(SubjectOptions subjectOptions) {
		Session session = entityManager.unwrap(Session.class);
		SubjectOptions subjectOptionsToDelete = session.get(SubjectOptions.class, subjectOptions.getId());
		session.delete(subjectOptionsToDelete);
	}

	@Override
	public String getSubjectOptionsById(int id) {
		Session session = entityManager.unwrap(Session.class);
		SubjectOptions subjectOptions = session.get(SubjectOptions.class, id);
		return subjectOptions.getSubjectOptions();
	}


}
