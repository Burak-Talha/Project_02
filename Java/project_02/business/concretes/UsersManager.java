package com.project_02.project_02.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.project_02.project_02.business.abstracts.UsersService;
import com.project_02.project_02.dataAccess.abstracts.UsersDao;
import com.project_02.project_02.entities.concretes.Users;

@Service
public class UsersManager implements UsersService {

	private UsersDao usersDao;
	
	@Autowired
	public UsersManager(UsersDao usersDao) {
		this.usersDao = usersDao;
	}


	public List<Users> findAll() {
		return usersDao.findAll();		
	}
	
	public long count(){
		return usersDao.count();
	}

	@Override
	public List<Users> findAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"username");
		List<Users> findSortedAll = usersDao.findAll(sort);
		return findSortedAll;
	}
	
	@Override
	public Users getByUsersName(char username) {
		return usersDao.getByUsersName(username);
	}

	@Override
	public String add(Users users) {
		this.usersDao.save(users);
		return "Başarıyla eklendi";
	}



	
	
	



}
