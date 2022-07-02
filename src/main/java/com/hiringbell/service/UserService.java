package com.hiringbell.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.User;
import com.hiringbell.repository.UserRepository;

@Service
@Component
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User getUserByIdService(long userId)
	{
		var result = this.userRepository.getUserByIdRepo(userId);
		
		return result;
	}
	
	
	public ArrayList<User> getUserAllByProcedureService() {
		// TODO Auto-generated method stub
		var result = this.userRepository.getUserAllByProcedureRepo();
		
		return result;	
	}
	
	public User getUserByIdWithProcedureService(long userId) {
		var result = this.userRepository.getUserByIdWithProcedureRepository(userId);
		
		return result;
	}
	
	
	public String updateUserByIdService(User user, long userId)
	{
	
		var status = this.userRepository.updateUserByIdRepo(user, userId);
		return "Updated";
	}
	
	
	
	public String addUserService(User user)
	{
		var result = this.userRepository.addUserRepository(user);
		return result;
	}


	

}
