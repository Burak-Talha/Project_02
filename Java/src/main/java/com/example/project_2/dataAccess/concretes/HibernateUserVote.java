package com.example.project_2.dataAccess.concretes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import com.example.project_2.dataAccess.abstracts.UserVoteDal;
import com.example.project_2.entities.concretes.UserVote;
import com.example.project_2.entities.concretes.Users;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class HibernateUserVote implements UserVoteDal {

	private EntityManager entityManager;
	
	@Autowired
	public HibernateUserVote(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<UserVote> getAll() {
		Session session = entityManager.unwrap(Session.class);
		String query = "from UserVote";
		List<UserVote> usersVote = session.createQuery(query, UserVote.class).list();
		return usersVote;
	}

	@Override
	public UserVote getByUserId(int id) {
		Session session = entityManager.unwrap(Session.class);
		UserVote userVote = session.get(UserVote.class, id);
		return userVote;
	}

	@Override
	public void create(UserVote userVote) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(userVote);
	}

	@Override
	public void update(UserVote userVote) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(userVote);
	}

	@Override
	public void delete(UserVote userVote) {
		Session session = entityManager.unwrap(Session.class);
		Users userToDelete = session.get(Users.class, userVote.getId());
		session.delete(userToDelete);
	}

}
