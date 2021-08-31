package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.UserEntity;
import com.repository.UserRepository;

@Controller
public class UserController2 {

	@Autowired
	UserRepository userRepository;

	@GetMapping("/users")
	public String getAllUsers(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "Home";
	}

	
	@GetMapping("/deleteuser/{userId}")
	public String deleteUser(@PathVariable("userId") Long userId) {
		userRepository.deleteById(userId);
		
		return "redirect:/users";
	}


	@GetMapping("/getuser/{userId}")
	public String getUser(@PathVariable("userId") Long userId,Model model) {
		
		UserEntity user = userRepository.getById(userId);
		model.addAttribute("user",user);
		return "EditUser";
	}
	
	@PostMapping("updateuser")
	public String updateUser(UserEntity user) {

		UserEntity tmp = userRepository.getById(user.getUserId());
	
		tmp.setFirstName(user.getFirstName());
		tmp.setEmail(user.getEmail());

		userRepository.save(tmp);
		return "redirect:/users";
	}
}













