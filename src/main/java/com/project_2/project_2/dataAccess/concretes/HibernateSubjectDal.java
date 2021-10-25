package com.project_2.project_2.dataAccess.concretes;

import java.util.List;


import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_2.project_2.dataAccess.abstracts.SubjectDal;
import com.project_2.project_2.entities.concretes.Subject;


@Repository
public class HibernateSubjectDal implements SubjectDal {

	private EntityManager entityManager;
	
	@Autowired
	public HibernateSubjectDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public List<Subject> getAllSubject() {
		Session session = entityManager.unwrap(Session.class);
		String query = "from Subject";
		List<Subject> subject = session.createQuery(query, Subject.class).list();
		return subject;
	}

	@Override
	@Transactional
	public void create(Subject subject) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(subject);
	}

	@Override
	@Transactional
	public void update(Subject subject) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(subject);
	}

	@Override
	public String getSubjectById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Subject subject = session.get(Subject.class, id);
		return subject.getSubjectName();
	}

}
