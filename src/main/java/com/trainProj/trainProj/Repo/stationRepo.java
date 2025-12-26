package com.trainProj.trainProj.Repo;

import com.trainProj.trainProj.Entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface stationRepo extends JpaRepository<Station,Long> {
}
