package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
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

	@Autowired
	PasswordEncoder bcrypt;
	
	@PostMapping("/signup")
	public ResponseBean<UserEntity> signup(@RequestBody UserEntity user) {

		String x = "prisha";
		String y = bcrypt.encode(x);
		System.out.println("y => "+y);
		user.setRole("ROLE_USERS");//prefix ROLE 
		user.setPassword(bcrypt.encode(user.getPassword()));
		System.out.println(user.getPassword());
		userRepository.save(user);
		ResponseBean<UserEntity> resp = new ResponseBean<>();
		resp.setData(user);
		resp.setMsg("signup done");
		resp.setStatus(200);

		return resp;
	}

	@GetMapping("/getusers")
	public String getUsers() {
		return "{\"userName\":\"Admin\"}";
	}
}
