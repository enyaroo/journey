package com.journey.pathfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.journey.pathfinder.entity.PathfinderEntity;

@Repository
public interface PathfinderRepository extends JpaRepository<PathfinderEntity, Integer>{

}
