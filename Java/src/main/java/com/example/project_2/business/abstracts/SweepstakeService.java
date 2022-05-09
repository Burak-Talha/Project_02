package com.example.project_2.business.abstracts;

import com.example.project_2.entities.concretes.Sweepstake;

import java.util.List;

public interface SweepstakeService {
    List<Sweepstake> getAllSweepstake();
    void create(Sweepstake sweepstake);
    void update(Sweepstake sweepstake);
    void delete(Sweepstake sweepstake);
    Sweepstake getById(int id);
    List<Sweepstake> getByName(String name);
}
