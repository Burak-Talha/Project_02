package com.example.project_2.dataAccess.concretes;

import java.util.List;


import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import com.example.project_2.dataAccess.abstracts.UsersDal;
import com.example.project_2.entities.concretes.Users;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class HibernateUsersDal implements UsersDal {

	private EntityManager entityManager;
	
	@Autowired
	public HibernateUsersDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public List<Users> getAll() {
		Session session = entityManager.unwrap(Session.class);
		String query = "FROM com.example.project_2.entities.concretes.Users";
		List<Users> users = session.createQuery(query, Users.class).list();
		return users;
	}

	@Override
	@Transactional
	public void create(Users user) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(user);
	}

	@Override
	@Transactional
	public void update(Users user) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(user);
	}

	@Override
	@Transactional
	public void delete(Users user) {
		Session session = entityManager.unwrap(Session.class);
		Users userToDelete = session.get(Users.class, user.getId());
		session.delete(userToDelete);
	}
	
	@Override
	public Users getByUserId(int id) {
		Session session = entityManager.unwrap(Session.class);
		Users user = session.get(Users.class, id);
		return user;
	}

}
