package com.example.project_2.business.concretes;

import java.util.List;

import com.example.project_2.business.abstracts.UserVoteService;
import com.example.project_2.dataAccess.abstracts.UserVoteDal;
import com.example.project_2.entities.concretes.UserVote;
import com.example.project_2.entities.concretes.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserVoteManager implements UserVoteService {

	private UserVoteDal userVoteDal;

	@Autowired
	public UserVoteManager(UserVoteDal userVoteDal) {
		this.userVoteDal = userVoteDal;
	}

	@Override
	public List<UserVote> getAll() {
		return userVoteDal.getAll();
	}

	@Override
	public UserVote getByUserId(int id) {
		return userVoteDal.getByUserId(id);
	}

	@Override
	public void create(UserVote userVote) {
		userVoteDal.create(userVote);
	}

	@Override
	public void update(UserVote userVote) {
		userVoteDal.update(userVote);
	}

	@Override
	public void delete(UserVote userVote) {
		userVoteDal.delete(userVote);
	}

}
