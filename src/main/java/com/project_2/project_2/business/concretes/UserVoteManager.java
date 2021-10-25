package com.project_2.project_2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_2.project_2.business.abstracts.UserVoteService;
import com.project_2.project_2.entities.concretes.UsersVote;
import com.project_2.project_2.dataAccess.abstracts.UserVoteDal;

@Service
public class UserVoteManager implements UserVoteService{

    private UserVoteDal userVoteDal;
    
    @Autowired
    public UserVoteManager(UserVoteDal userVoteDal){
        this.userVoteDal=userVoteDal;
    }
    
	@Override
	public List<UsersVote> getAll() {
		this.userVoteDal.getAll();
		return null;
	}

}
    

