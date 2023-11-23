package com.journey.pathfinder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.journey.pathfinder.entity.PathfinderEntity;
import com.journey.pathfinder.pathfinderBO.PathfinderBO;

@RequestMapping("/pathfinder")
@Controller
public class PathfinderController {

	@Autowired
	private PathfinderBO pathfinderBO;
	
	@GetMapping("/pathfinder-create-view")
	public String pathfinderCreateView() {
		return "pathfinder/pathfinderCreate";
	}
	
	@GetMapping("/pathfinder-list-view")
	public String pathfinderListView(Model model) {
		List<PathfinderEntity> pathfinderList = pathfinderBO.getPathfinderList();
		
		model.addAttribute("pathfinderList", pathfinderList);
		return "pathfinder/pathfinderList";
	}
}
