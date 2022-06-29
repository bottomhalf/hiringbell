package com.hiringbell.service;

import java.util.ArrayList;
import java.util.List;

import com.hiringbell.repository.LoginRepository;
import com.hiringbell.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.Login;
import com.hiringbell.entity.User;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	@Autowired
	UserRepository userRepository;
	
	private List<User> users;

	@Autowired
	User user;

	public LoginService() {
		// TODO Auto-generated constructor stub
		users = new ArrayList<User>();
	}

	public void addUser(User user) {

	}

	public User getUserById(String userId) {
		var users = this.loginRepository.getRepoUserById(user);
		return users;
	}

	public User authenticateUser(User user) {
		this.loginRepository.authenticateUser(user);
		// login validate user from data base.
		user = null;
		return user;
	}

	public User AuthenticateUserService(Login login) throws Exception {
		var result = this.loginRepository.AuthenticateUserRepo(login);
		if (login.getPassword().equals(result.getPassword())) {
			
			var uid = result.getUserId();
			var userResult = this.userRepository.userRepo(uid);
			
			return userResult;
		} else {
			throw new Exception("Password not matching");
		}
	}

}
