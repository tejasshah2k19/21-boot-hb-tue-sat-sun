package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
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
	PasswordEncoder bcrypt;

	@Autowired
	UserRepository userRepository;

	@GetMapping("/signup")
	public String signup(Model model) {
		//model.addAttribute("user",new UserEn());
		return "Signup";

	}

	@PostMapping("/saveuser") // /public/saveuser
	public String saveUser(UserEntity user,Model model) {

		UserEntity oldUser = userRepository.findByUsername(user.getUsername());
		if (oldUser != null) {
			model.addAttribute("error","Username already taken");
			return "Signup";
		} else {

			user.setRole("ROLE_USERS");
			System.out.println(user.getUsername());
			user.setPassword(bcrypt.encode(user.getPassword()));
			userRepository.save(user);
			return "redirect:/users";

		}
	}

	@GetMapping("/login")
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
