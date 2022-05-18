package com.hiringbell.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hiringbell.model.User;

@Service
public class LoginService {

	private List<User> users;
	
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
		var user = this.users.stream().filter(x -> x.getUserId().equals(userId)).findFirst().orElse(null);
		return user;
	}
}
