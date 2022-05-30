package com.hiringbell.service;

import java.util.ArrayList;
import java.util.List;

import com.hiringbell.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiringbell.model.User;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	private List<User> users;

	@Autowired
	User user;
	
	public LoginService() {
		// TODO Auto-generated constructor stub
		users = new ArrayList<User>();
		users.add(new User("admin", "test"));
		users.add(new User("jone", "test"));
		users.add(new User("smith", "test"));
		users.add(new User("ali", "12345"));
		users.add(new User("rahim", "super"));
	}
	
	public void addUser(User user) {
		
	}
	
	public User getUserById(String userId) {
		var users = this.loginRepository.getRepoUse rById(user);
		return users;
	}

	public User authenticateUser(User user) {
		this.loginRepository.authenticateUser(user);
		// login validate user from data base.
		user = null;
		return user;
	}
}
