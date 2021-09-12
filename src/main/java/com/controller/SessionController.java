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

	@PostMapping("/saveuser") // /public/saveuser
	public String saveUser(UserEntity user) {
		user.setRole("ROLE_USERS");
		System.out.println(user.getUsername());
		userRepository.save(user);
		return "redirect:/users";
	}

	@GetMapping("/signin")
	public String signin() {
		return "Login";
	}

	@GetMapping("/demo")
	public String demo() {
		return "demo";
	}
	@PostMapping("/demo")
	public String demo1() {
		return "demo1";
	}
	

}
