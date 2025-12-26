package com.trainProj.trainProj.Controller;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.trainProj.trainProj.Entity.Train;
import com.trainProj.trainProj.Entity.trainSchedule;
import com.trainProj.trainProj.Service.trainSearchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/search")
@CrossOrigin
public class trainSearchController {

    private trainSearchService trainSearchService;

    public trainSearchController(trainSearchService trainSearchService){
        this.trainSearchService=trainSearchService;
    }

    @GetMapping("/by-code")
    public List<trainSchedule>findTrainByStationCode(@RequestParam String sourceCode,@RequestParam String destinationCode){
        return trainSearchService.findTrainByStationCode(sourceCode.toUpperCase(),destinationCode.toUpperCase());
    }

    @GetMapping("/by-name")
    @JsonBackReference
    public List<trainSchedule>findTrainByStationName(@RequestParam String sourceName,@RequestParam String destinationName){
        return trainSearchService.findTrainByStationName(sourceName,destinationName);
    }
}
