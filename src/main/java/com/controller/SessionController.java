package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.UserEntity;
import com.repository.UserRepository;

@Controller
@RequestMapping("/public")
public class SessionController {
	@Autowired
	UserRepository userRepository;

	@GetMapping("/signup")
	public String signup() {

		return "Signup";

	}

	@PostMapping("/saveuser")
	public String saveUser(UserEntity user) {
		userRepository.save(user);
		return "redirect:/users";
	}

 @GetMapping("/signin")
 public String signin() {
	 	return "Login";
 }

}
