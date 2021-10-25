package com.project_2.project_2.dataAccess.concretes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_2.project_2.dataAccess.abstracts.UserVoteDal;
import com.project_2.project_2.entities.concretes.UsersVote;

@Repository
public class HibernateUsersVoteDal implements UserVoteDal{

	private EntityManager entityManager;
	
	@Autowired
	public HibernateUsersVoteDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<UsersVote> getAll() {
		Session session = entityManager.unwrap(Session.class);
		String query = "from Usersvote";
		List<UsersVote> usersVote = session.createQuery(query, UsersVote.class).list();
		return usersVote;
	}
}
