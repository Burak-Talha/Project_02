package com.project_2.project_2.dataAccess.abstracts;

import java.util.List;

import com.project_2.project_2.entities.concretes.UsersVote;

public interface UserVoteDal {
	List<UsersVote> getAll();
}
