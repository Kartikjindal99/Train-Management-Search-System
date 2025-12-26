package com.trainProj.trainProj.Service;

import com.trainProj.trainProj.Entity.Train;
import com.trainProj.trainProj.Repo.trainRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class trainService {

    private trainRepo trainRepo;

    public trainService(trainRepo trainRepo){
        this.trainRepo=trainRepo;
    }

    public List<Train> getAllTrains() {
        return trainRepo.findAll();
    }

    public Train addTrain(Train train) {
        return trainRepo.save(train);
    }
}
