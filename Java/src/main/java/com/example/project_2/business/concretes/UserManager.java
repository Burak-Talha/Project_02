package com.example.project_2.business.concretes;

import java.util.List;


import javax.transaction.Transactional;

import com.example.project_2.business.abstracts.UsersService;
import com.example.project_2.dataAccess.abstracts.UsersDal;
import com.example.project_2.entities.concretes.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserManager implements UsersService {

	// The business code writing in here
	
	private UsersDal usersDal;
	
	@Autowired
	public UserManager(UsersDal usersDal) {
		this.usersDal = usersDal;
	}

	@Override
	@Transactional
	public List<Users> getAll() {
		return this.usersDal.getAll();
	}

	@Override
	@Transactional
	public Users getByUserId(int id) {
		// if-else statement
		return this.usersDal.getByUserId(id);
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
