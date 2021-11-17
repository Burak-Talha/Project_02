package com.project_2.project_2.business.abstracts;

import java.util.List;

import com.project_2.project_2.entities.concretes.Sweepstake;

public interface SweepstakeService {
	public List<Sweepstake> getAll();
	public void create(Sweepstake Sweepstake);
	public void update(Sweepstake Sweepstake);
	public void delete(Sweepstake Sweepstake);
}
