package com.journey.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class UserController {
	
	@GetMapping("/sign-up-view")
	public String signUpView() {
		return "";
	}
	
	@GetMapping("/sign-in-view")
	public String signInView() {
		return "";
	}
	
	@GetMapping("/main-view")
	public String userMainView() {
		return "";
	}
	
}
