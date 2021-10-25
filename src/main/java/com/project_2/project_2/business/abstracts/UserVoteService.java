package com.project_2.project_2.business.abstracts;

import java.util.List;

import com.project_2.project_2.entities.concretes.UsersVote;

public interface UserVoteService {
	List<UsersVote> getAll();
}
