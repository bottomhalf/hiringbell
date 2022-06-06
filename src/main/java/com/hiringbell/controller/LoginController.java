package com.hiringbell.controller;

import com.hiringbell.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiringbell.model.User;
import com.hiringbell.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/{userId}")
	public User GetUserById(@PathVariable("userId") String userId) {
		var user = this.loginService.getUserById(userId);
		
		return user;
	}

	@GetMapping("/auth")
	public User AuthUser(Login login) {

		return null;
	}
	
	@PostMapping("/AuthenticateUser")
	public Login AuthenticateUser(@RequestBody Login login)
	{
		System.out.println("This is Login Value : " + login); 
		 var result = this.loginService.AuthenticateUserService(login);
		 
		 System.out.println(login.toString());
		 
		return null;
	}
}
