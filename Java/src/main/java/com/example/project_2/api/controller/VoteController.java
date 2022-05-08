package com.example.project_2.api.controller;

import com.example.project_2.business.abstracts.SubjectOptionsService;
import com.example.project_2.business.abstracts.UserVoteService;
import com.example.project_2.entities.concretes.SubjectOptions;
import com.example.project_2.entities.concretes.UserVote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// All methods Working. 07/05/22

@RestController
@RequestMapping("api/vote/")
public class VoteController {

    private SubjectOptionsService subjectOptionsService;
    private UserVoteService userVoteService;

    @Autowired
    public VoteController(SubjectOptionsService subjectOptionsService, UserVoteService userVoteService){
        this.subjectOptionsService = subjectOptionsService;
        this.userVoteService = userVoteService;
    }

    @PostMapping("addsubjectoption")
    public void createSubjectOption(@RequestBody SubjectOptions subjectOptions){
        subjectOptionsService.create(subjectOptions);
    }

    @PostMapping("update")
    public void updateSubjectOption(@RequestBody SubjectOptions subjectOptions){
        subjectOptionsService.update(subjectOptions);
    }

    @PostMapping("delete")
    public void deleteSubjectOption(@RequestBody SubjectOptions subjectOptions){
        subjectOptionsService.delete(subjectOptions);
    }

    @GetMapping("getallsubjectoption")
    public List<SubjectOptions> getAllSubjectOption(){
        return subjectOptionsService.getAllSubjectOptions();
    }

    @GetMapping("{subjectid}")
    public List<SubjectOptions> getSubjectOptionsBySubjectId(@PathVariable("subjectid") int subjectId){
        return subjectOptionsService.getSubjectOptionsBySubjectId(subjectId);
    }

    @PostMapping("adduservote")
    public void addUserVote(@RequestBody UserVote userVote){
        userVoteService.create(userVote);
    }

    @PostMapping("updateuservote")
    public void updateUserVote(@RequestBody UserVote userVote){
        userVoteService.update(userVote);
    }

    @PostMapping("deleteuservote")
    public void deleteUserVote(@RequestBody UserVote userVote){
        userVoteService.delete(userVote);
    }

    @GetMapping("getbyuserid/{userid}")
    public UserVote getByUserId(@PathVariable("userid") int userId){
        return userVoteService.getByUserId(userId);
    }
}
