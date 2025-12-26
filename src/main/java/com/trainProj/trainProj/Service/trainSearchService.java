package com.trainProj.trainProj.Service;

import com.trainProj.trainProj.Entity.trainSchedule;
import com.trainProj.trainProj.Repo.trainScheduleRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class trainSearchService {

    private trainScheduleRepo trainScheduleRepo;

    public trainSearchService(trainScheduleRepo trainScheduleRepo){
        this.trainScheduleRepo =trainScheduleRepo;
    }

    public List<trainSchedule> findTrainByStationCode(String sourceCode, String destinationCode) {
        return trainScheduleRepo.findBySource_StationCodeAndDestination_StationCode(sourceCode,destinationCode);
    }

    public List<trainSchedule> findTrainByStationName(String sourceName, String destinationName) {
        return trainScheduleRepo.findBySource_StationNameAndDestination_StationName(sourceName,destinationName);
    }
}
