package com.journey.pathfinder;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.journey.pathfinder.pathfinderBO.PathfinderBO;

@RequestMapping("/pathfinder")
@RestController
public class PathfinderRestController {

	@Autowired
	private PathfinderBO pathfinderBO;
	
	@PostMapping("/create")
	public Map<String, Object> pathfinderCreate(
			@RequestParam("title") String title
			, @RequestParam("body") String body) {
		
		Integer id = pathfinderBO.addPathfinder(title, body);
		
		Map<String, Object> result = new HashMap<>();
		if (id == null) {
			result.put("code", 500);
			result.put("errorMessage", "Pathfinder 추가에 실패하였습니다.");
		} else {
			result.put("code", 200);
			result.put("result", "Pathfinder 저장 성공");
		}
		return result;
	}
	
}
