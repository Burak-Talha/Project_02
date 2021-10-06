package com.project_2.project_2.business.concretes;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_2.project_2.business.abstracts.UserService;
import com.project_2.project_2.dataAccess.abstracts.UsersDal;
import com.project_2.project_2.entities.concretes.Users;

@Service
public class UserManager implements UserService {

	// The business code writing in here
	
	private UsersDal usersDal;
	
	@Autowired
	public UserManager(com.project_2.project_2.dataAccess.abstracts.UsersDal usersDal) {
		this.usersDal = usersDal;
	}

	@Override
	@Transactional
	public List<Users> getAll() {
		return this.usersDal.getAll();
	}

	@Override
	@Transactional
	public Users getById(int id) {
		this.usersDal.getById(id);
		return null;
	}

	@Override
	@Transactional
	public void create(Users user) {
		this.usersDal.create(user);
	}

	@Override
	@Transactional
	public void update(Users user) {
		this.usersDal.update(user);
	}

	@Override
	@Transactional
	public void delete(Users user) {
		this.usersDal.delete(user);
	}

}
