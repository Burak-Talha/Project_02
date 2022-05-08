package com.example.project_2.dataAccess.abstracts;

import com.example.project_2.entities.concretes.Users;

import java.util.List;


public interface UsersDal {

	List<Users> getAll();
	Users getByUserId(int id);
	void create(Users user);
	void update(Users user);
	void delete(Users user);
	
}
