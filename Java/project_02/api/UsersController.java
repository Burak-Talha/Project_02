package com.project_02.project_02.api;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project_02.project_02.business.abstracts.UsersService;
import com.project_02.project_02.entities.concretes.Users;

@RestController
@RequestMapping(value = "/api/users")
public class UsersController {
	
	private UsersService usersService;

	@Autowired
	public UsersController(UsersService usersService) {
		this.usersService = usersService;
	}
	
	@GetMapping("/findall")
	public List<Users> findAll(){
		List<Users> users = usersService.findAll();
		
		return users;
	}
	
	@GetMapping("/getbyusername")
	public Users getByUserName(char usersname) {
		
	return this.usersService.getByUsersName(usersname);
	}

	
	@GetMapping("/peoplenumbers")
	public long count(){
		return usersService.count();
	}
	
	@GetMapping("/findallsorted")
	public List<Users> findAllSorted() {
		return usersService.findAllSorted();
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Users users) {
		return this.usersService.add(users);
	}
	
	

}
