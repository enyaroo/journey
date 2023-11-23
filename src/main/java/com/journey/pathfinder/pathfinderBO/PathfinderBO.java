package com.journey.pathfinder.pathfinderBO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.journey.pathfinder.entity.PathfinderEntity;
import com.journey.pathfinder.repository.PathfinderRepository;

@Service
public class PathfinderBO {
	
	@Autowired
	private PathfinderRepository pathfinderRepository;
	
	public Integer addPathfinder(String title, String body) {
		PathfinderEntity pathfinderEntity = pathfinderRepository.save(
				PathfinderEntity.builder()
				.userId(1)
				.title(title)
				.body(body)
				.build());
		return pathfinderEntity == null ? null : pathfinderEntity.getId();
	}
	
	public List<PathfinderEntity> getPathfinderList() {
		return pathfinderRepository.findAll();
	}
}
