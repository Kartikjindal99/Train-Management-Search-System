package com.trainProj.trainProj.Repo;

import com.trainProj.trainProj.Entity.trainSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface trainScheduleRepo extends JpaRepository<trainSchedule,Long> {
    List<trainSchedule> findBySource_StationCodeAndDestination_StationCode(String sourceCode, String destinationCode);

    List<trainSchedule> findBySource_StationNameAndDestination_StationName(String sourceName, String destinationName);
}
