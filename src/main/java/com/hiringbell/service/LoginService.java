package com.hiringbell.service;

import java.util.ArrayList;
import java.util.List;

import com.hiringbell.repository.LoginRepository;
import com.hiringbell.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.Login;
import com.hiringbell.model.User;

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
		users.add(new User(1, "test"));
		users.add(new User(2, "test"));
		users.add(new User(3, "test"));
		users.add(new User(4, "12345"));
		users.add(new User(5, "super"));
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

	public Login AuthenticateUserService(Login login) {
		var result = this.loginRepository.AuthenticateUserRepo(login);

		System.out.println(result.getPassword());
		System.out.println(login.getPassword());

		if (login.getPassword().equals(result.getPassword())) {
			System.out.println("Password is Matched");

			var uid = result.getUserId();
			var userResult = this.userRepository.userRepo(uid);
			return null;

		} else {
			System.out.println("Password is Not Matched");
		}

		System.out.println(result);
		System.out.println("Reached to Service");
		return null;
	}

}
