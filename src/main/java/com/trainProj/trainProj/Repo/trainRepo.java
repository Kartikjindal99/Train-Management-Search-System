package com.trainProj.trainProj.Repo;

import com.trainProj.trainProj.Entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface trainRepo extends JpaRepository<Train,Long> {
}
