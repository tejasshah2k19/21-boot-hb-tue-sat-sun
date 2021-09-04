package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.ResponseBean;
import com.entity.UserEntity;
import com.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;

	@PostMapping("/signup")
	public ResponseBean<UserEntity> signup(@RequestBody UserEntity user) {

		userRepository.save(user);

		ResponseBean<UserEntity> resp = new ResponseBean<>();
		resp.setData(user);
		resp.setMsg("signup done");
		resp.setStatus(200);
		
		return resp;
	}

}
