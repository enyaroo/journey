package com.journey.pathfinder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pathfinder")
@Controller
public class PathfinderController {
	
	@GetMapping("/pathfinder-create-view")
	public String pathfinderCreateView() {
		return "";
	}
	
}
