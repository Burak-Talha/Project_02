package com.example.project_2.business.abstracts;

import java.util.List;
import com.example.project_2.entities.concretes.UserVote;
import com.example.project_2.entities.concretes.Users;

public interface UserVoteService {
	List<UserVote> getAll();
	UserVote getByUserId(int id);
	void create(UserVote userVote);
	void update(UserVote userVote);
	void delete(UserVote userVote);
}
