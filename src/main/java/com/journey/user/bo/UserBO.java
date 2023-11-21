package com.journey.user.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.journey.user.entity.UserEntity;
import com.journey.user.repository.UserRepository;

@Service
public class UserBO {
	
	@Autowired
	private UserRepository userRepository;
	
	public Integer addUser(String loginId, String password, String userName) {
		UserEntity userEntity = userRepository.save(
				UserEntity.builder()
				.loginId(loginId)
				.password(password)
				.userName(userName)
				.build());
		return userEntity == null ? null : userEntity.getId();
	}
}
