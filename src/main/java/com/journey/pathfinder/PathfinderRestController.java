package com.journey.pathfinder;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathfinderRestController {

	@PostMapping("/create")
	public Map<String, Object> pathfinderCreate(
			@RequestParam("title") String title
			, @RequestParam("body") String body) {
		
		
		Map<String, Object> result = new HashMap<>();
		return result;
	}
	
}
