package com.project_2.project_2.api.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project_2.project_2.business.abstracts.UsersService;
import com.project_2.project_2.entities.concretes.Users;

@RestController
@RequestMapping("/api/users/")
public class UserController {

	private UsersService userService;

	@Autowired
	public UserController(UsersService userService) {
		this.userService = userService;
	}
	
	// Working 16/11/21
	@GetMapping("getall")
	public List<Users> getAll(){
		return userService.getAll();
	}
	
	// Working 16/11/21
	@PostMapping("add")
	public void create(@RequestBody Users user){
		userService.create(user);
	}
	
	@PostMapping("update")
	public void update(@RequestBody Users user){
		userService.update(user);
	}
	
	@PostMapping("delete")
	public void delete(@RequestBody Users user) {
		userService.delete(user);
	}
	
	@GetMapping("users/{id}")
	public Users getById(@PathVariable int id){
	return userService.getByUserId(id);
	}

	
	
	
	
}
