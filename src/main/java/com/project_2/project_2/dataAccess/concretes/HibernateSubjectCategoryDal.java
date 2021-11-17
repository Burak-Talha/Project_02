package com.project_2.project_2.dataAccess.concretes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_2.project_2.dataAccess.abstracts.CategoryDal;
import com.project_2.project_2.entities.concretes.SubjectCategory;

@Repository
public class HibernateSubjectCategoryDal implements CategoryDal<SubjectCategory>{

	private EntityManager entityManager;
	
	@Autowired
	public HibernateSubjectCategoryDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public List<SubjectCategory> getAll() {
		Session session = entityManager.unwrap(Session.class);
		String query = "from SubjectCategory";
		List<SubjectCategory> category = session.createQuery(query, SubjectCategory.class).list();
		return category;
	}

	@Override
	@Transactional
	public void create(SubjectCategory category) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(category);
	}

	@Override
	@Transactional
	public void update(SubjectCategory category) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(category);
	}

	@Override
	@Transactional
	public void delete(SubjectCategory category) {
		Session session = entityManager.unwrap(Session.class);
		SubjectCategory subjectCategoryToDelete = session.get(SubjectCategory.class, category.getId());
		session.delete(subjectCategoryToDelete);
	}

	@Override
	public String getCategoryById(int id) {
		Session session = entityManager.unwrap(Session.class);
		SubjectCategory subjectCategory = session.get(SubjectCategory.class, id);
		return subjectCategory.getSubjectCategory();
	}

}
