package com.project_2.project_2.dataAccess.concretes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import com.project_2.project_2.dataAccess.abstracts.UserVoteDal;
import com.project_2.project_2.entities.concretes.UserVote;


public class HibernateUserVote implements UserVoteDal{

	private EntityManager entityManager;
	
	@Autowired
	public HibernateUserVote(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<UserVote> getAll() {
		Session session = entityManager.unwrap(Session.class);
		String query = "from users_vote";
		List<UserVote> usersVote = session.createQuery(query, UserVote.class).list();
		return usersVote;
	}
}
