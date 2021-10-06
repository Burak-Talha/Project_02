package com.project_2.project_2.dataAccess.abstracts;

import java.util.List;
import com.project_2.project_2.entities.concretes.Users;

public interface UsersDal {

	List<Users> getAll();
	Users getById(int id);
	void create(Users user);
	void update(Users user);
	void delete(Users user);
}
