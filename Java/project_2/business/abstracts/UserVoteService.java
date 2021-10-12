package com.project_2.project_2.business.abstracts;

import java.util.List;

import com.project_2.project_2.entities.concretes.UserVote;

public interface UserVoteService {
	List<UserVote> getAll();
}
