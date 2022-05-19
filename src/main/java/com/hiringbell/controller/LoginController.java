package com.hiringbell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiringbell.model.User;
import com.hiringbell.service.LoginService;

@RestController
@RequestMapping("/user")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/{userId}")
	public User GetUserById(@PathVariable("userId") String userId) {
		var user = this.loginService.getUserById(userId);
		return user;
	}

	@GetMapping("")
	public String AuthUser() {

		return "User logged in successfully";
	}
}
