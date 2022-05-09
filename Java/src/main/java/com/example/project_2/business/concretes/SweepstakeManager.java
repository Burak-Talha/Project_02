package com.example.project_2.business.concretes;

import com.example.project_2.business.abstracts.SweepstakeService;
import com.example.project_2.dataAccess.abstracts.SweepstakeDal;
import com.example.project_2.entities.concretes.Sweepstake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SweepstakeManager implements SweepstakeService {

    private SweepstakeDal sweepstakeDal;

    @Autowired
    public SweepstakeManager(SweepstakeDal sweepstakeDal) {
        this.sweepstakeDal = sweepstakeDal;
    }


    @Override
    public List<Sweepstake> getAllSweepstake() {
        return sweepstakeDal.getAllSweepstake();
    }

    @Override
    public void create(Sweepstake sweepstake) {
        sweepstakeDal.create(sweepstake);
    }

    @Override
    public void update(Sweepstake sweepstake) {
        sweepstakeDal.update(sweepstake);
    }

    @Override
    public void delete(Sweepstake sweepstake) {
        sweepstakeDal.delete(sweepstake);
    }

    @Override
    public Sweepstake getById(int id) {
        return sweepstakeDal.getById(id);
    }

    @Override
    public List<Sweepstake> getByName(String name) {
        return sweepstakeDal.getByName(name);
    }
}
