package com.project_02.project_02.business.abstracts;

import java.util.List;

import com.project_02.project_02.entities.concretes.Users;


public interface UsersService {

	public List<Users> findAllSorted();
	public List<Users> findAll();
	public long count();
	public String add(Users users);
	Users getByUsersName(char usersname);
	
}
