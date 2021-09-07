package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.UserEntity;
import com.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController2 {

	@Autowired
	UserRepository userRepository;

	@GetMapping("/users")
	public String getAllUsers(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "Home";
	}

}
