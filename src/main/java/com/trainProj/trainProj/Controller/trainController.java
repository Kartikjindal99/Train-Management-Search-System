package com.trainProj.trainProj.Controller;

import com.trainProj.trainProj.Entity.Train;
import com.trainProj.trainProj.Service.trainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trains")
@CrossOrigin
public class trainController {
    private trainService trainService;

    public trainController(trainService trainService){
        this.trainService=trainService;
    }

    @GetMapping
    public List<Train>getAllTrains(){
        return trainService.getAllTrains();
    }

    @PostMapping
    public Train addTrain(@RequestBody Train train){
        return trainService.addTrain(train);
    }

}
