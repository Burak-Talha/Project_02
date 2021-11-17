package com.project_2.project_2.dataAccess.abstracts;

import java.util.List;

import com.project_2.project_2.entities.concretes.Sweepstake;

public interface SweepstakeDal {
	public List<Sweepstake> getAll();
	public Sweepstake getById(int id);
	public void create(Sweepstake Sweepstake);
	public void update(Sweepstake Sweepstake);
	public void delete(Sweepstake Sweepstake);
}
