package com.example.project_2.dataAccess.concretes;

import java.util.List;


import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import com.example.project_2.dataAccess.abstracts.SubjectOptionsDal;
import com.example.project_2.entities.concretes.SubjectOptions;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class HibernateSubjectOptionsDal implements SubjectOptionsDal {

	private EntityManager entityManager;
	
	@Autowired
	public HibernateSubjectOptionsDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<SubjectOptions> getAllSubjectOptions() {
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
	public List<SubjectOptions> getSubjectOptionsBySubjectId(int subjectId) {
		Session session = entityManager.unwrap(Session.class);
		List<SubjectOptions> subjectOptions = session.createSQLQuery("select * from SubjectOptions where subject_id = '"+subjectId+"'").list();
		return subjectOptions;
	}

}
