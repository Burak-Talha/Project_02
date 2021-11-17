package com.project_2.project_2.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project_2.project_2.entities.concretes.Sweepstake;
import com.project_2.project_2.business.abstracts.SweepstakeService; 

@RestController
@RequestMapping("/api/sweepstake/")
public class SweepstakeController {


	SweepstakeService sweepstakeService;
	
	@Autowired
	public SweepstakeController(SweepstakeService sweepstakeService) {
		this.sweepstakeService = sweepstakeService;
	}
	
	// Working 17/11/21
	@GetMapping("getall")
	public List<Sweepstake> getAll(){
		return sweepstakeService.getAll();
	}
	
	// Working 17/11/21
	@PostMapping("add")
	public void create(@RequestBody Sweepstake Sweepstake) {
		sweepstakeService.create(Sweepstake);
	}
	
	// Working 17/11/21
	@GetMapping("update")
	public void update(@RequestBody Sweepstake Sweepstake) {
		sweepstakeService.update(Sweepstake);
	}
	// Working 17/11/21
	@PostMapping("delete")
	public void delete(@RequestBody Sweepstake Sweepstake) {
		sweepstakeService.delete(Sweepstake);
	}
}
