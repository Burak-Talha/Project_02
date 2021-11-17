package com.project_2.project_2.dataAccess.concretes;

import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.project_2.project_2.dataAccess.abstracts.SweepstakeDal;
import com.project_2.project_2.entities.concretes.Sweepstake;

@Repository
public class HibernateSweepstakeDal implements SweepstakeDal{

private EntityManager entityManager;
	
	@Autowired
	public HibernateSweepstakeDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public List<Sweepstake> getAll() {
		Session session = entityManager.unwrap(Session.class);
		String query = "from Sweepstake";
		List<Sweepstake> Sweepstake = session.createQuery(query, Sweepstake.class).list();
		return Sweepstake;
	}

	@Override
	@Transactional
	public void create(Sweepstake Sweepstake) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(Sweepstake);
	}

	@Override
	@Transactional
	public void update(Sweepstake Sweepstake) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(Sweepstake);
	}
	
	@Transactional
	public void addPerson(Sweepstake Sweepstake, int id) {
		Session session = entityManager.unwrap(Session.class);
		Sweepstake = getById(id);
		int numberOfPerson = Sweepstake.getNumberOfPerson();
		Sweepstake.setNumberOfPerson(numberOfPerson+1);
		session.saveOrUpdate(Sweepstake);
	}

	@Override
	@Transactional
	public void delete(Sweepstake Sweepstake) {
		Session session = entityManager.unwrap(Session.class);
		Sweepstake SweepstakeToDelete = session.get(Sweepstake.class, Sweepstake.getId());
		session.delete(SweepstakeToDelete);
	}

	@Override
	@Transactional
	public Sweepstake getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Sweepstake sweepstake = session.get(Sweepstake.class, id);
		return sweepstake;
	}
	
}
