package com.journey.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/journey")
@Controller
public class MainController {
	
	@GetMapping("/main-view")
	public String mainView() {
		return "main/main";
	}
	
}
