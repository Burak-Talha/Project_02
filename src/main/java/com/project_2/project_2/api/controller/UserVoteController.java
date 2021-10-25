package com.project_2.project_2.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project_2.project_2.business.abstracts.UserVoteService;
import com.project_2.project_2.entities.concretes.UsersVote;

@RestController
@RequestMapping("/api/usersvote/")
public class UserVoteController {

	private UserVoteService userVoteService;

	@Autowired
	public UserVoteController(UserVoteService userVoteService) {
		this.userVoteService = userVoteService;
	}
	
	@GetMapping("getall")
	public List<UsersVote> getAll(){
		return userVoteService.getAll();
	}
}
