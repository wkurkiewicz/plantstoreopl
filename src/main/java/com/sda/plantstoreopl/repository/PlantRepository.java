package com.sda.plantstoreopl.repository;

import com.sda.plantstoreopl.entity.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantRepository extends JpaRepository<Plant,Long> {
}
