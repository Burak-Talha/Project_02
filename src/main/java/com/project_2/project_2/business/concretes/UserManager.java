package com.project_2.project_2.business.concretes;

import java.util.List;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_2.project_2.business.abstracts.UsersService;
import com.project_2.project_2.dataAccess.abstracts.UsersDal;
import com.project_2.project_2.entities.concretes.Users;

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
		this.usersDal.getByUserId(id);
		return null;
	}

	@Override
	@Transactional
	public void create(Users user) {
		if(user.getUserName().length() >= 3 && user.getUserName().length() <= 20) { 
		this.usersDal.create(user);
		}
		else {
			System.out.println("Kullanıcı ismi uzunluğu geçersizdir.");
		}
	}

	@Override
	@Transactional
	public void update(Users user) {
		if(user.getUserName().length() >= 3 && user.getUserName().length() <= 20) { 
		this.usersDal.update(user);
		}
		else {
			System.out.println("Kullanıcı ismi uzunluğu geçersizdir.");
		}
	}

	@Override
	@Transactional
	public void delete(Users user) {
		this.usersDal.delete(user);
	}

}
