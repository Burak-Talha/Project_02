package com.project_02.project_02.dataAccess.abstracts;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project_02.project_02.entities.concretes.Users;



public interface UsersDao extends JpaRepository<Users, Integer> {

	Users getByUsersName(char usersName);
	List<Users>getByUsersNameStartsWith(String productName);

	
}
