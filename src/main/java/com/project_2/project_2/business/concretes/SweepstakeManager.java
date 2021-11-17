package com.project_2.project_2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_2.project_2.business.abstracts.SweepstakeService;
import com.project_2.project_2.dataAccess.abstracts.SweepstakeDal;
import com.project_2.project_2.entities.concretes.Sweepstake;

@Service
public class SweepstakeManager implements SweepstakeService{

	private SweepstakeDal sweepstakeDal;  
	
	@Autowired
	public SweepstakeManager(SweepstakeDal sweepstakeDal) {
		this.sweepstakeDal = sweepstakeDal;
	}

	@Override
	public List<Sweepstake> getAll() {
		return sweepstakeDal.getAll();
	}

	@Override
	public void create(Sweepstake Sweepstake) {
		sweepstakeDal.create(Sweepstake);
		System.out.println("Kullanıcı eklendi");
	}

	@Override
	public void update(Sweepstake Sweepstake) {
		sweepstakeDal.update(Sweepstake);
		System.out.println("Kullanıcı güncellendi");
	}

	@Override
	public void delete(Sweepstake Sweepstake) {
		sweepstakeDal.delete(Sweepstake);
	}

}
