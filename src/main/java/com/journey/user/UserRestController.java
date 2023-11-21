package com.journey.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.journey.user.bo.UserBO;

@RequestMapping("/user")
@RestController
public class UserRestController {
	
	@Autowired
	private UserBO userBO;
	
	@PostMapping("/sign-up")
	public Map<String, Object> signUp(
			@RequestParam("loginId") String loginId
			, @RequestParam("password") String password
			, @RequestParam("userName") String userName) {
		// insert
		Integer id = userBO.addUser(loginId, password, userName);
		
		// 응답
		Map<String, Object> result = new HashMap<>();
		if (id == null) {
			result.put("code", 500);
			result.put("errorMessage", "회원가입에 실패하였습니다.");
		} else {
			result.put("code", 200);
			result.put("result", "회원가입 성공");
		}
		
		return result;
	}
	
}
