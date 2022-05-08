package com.example.project_2.business.abstracts;

import java.util.List;

import com.example.project_2.entities.concretes.Users;


public interface UsersService {

	List<Users> getAll();
	Users getByUserId(int id);
	void create(Users user);
	void update(Users user);
	void delete(Users user);
	
}
