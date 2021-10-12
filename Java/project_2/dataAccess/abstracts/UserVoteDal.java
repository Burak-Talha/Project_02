package com.project_2.project_2.dataAccess.abstracts;

import java.util.List;

import com.project_2.project_2.entities.concretes.UserVote;

public interface UserVoteDal {
	List<UserVote> getAll();
}
