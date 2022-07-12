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
	
	
	public String addUserService(User user){
		var result = this.userRepository.addUserRepository(user);
		return result;
	}
	
	public String updateUserByIdService(User user, long userId) throws Exception{
		var result = "";
		User value = this.userRepository.getUserByIdWithProcedureRepository(userId);
		if(value != null) {
			value.setFirstName(user.getFirstName());
			value.setLastName(user.getLastName());
			value.setAddress(user.getAddress());
			value.setEmail(user.getEmail());
			value.setMobile(user.getMobile());
			value.setCompanyName(user.getCompanyName());
			value.setAdminId(user.getAdminId());
			result = this.userRepository.updateUserByIdRepo(value, userId);
		}
		else {
			throw new Exception();
		}
		return result;
	}

	public ArrayList<User> getUserAllByProcedureService() {
		var result = this.userRepository.getUserAllByProcedureRepo();
		return result;	
	}
	
	public User getUserByIdWithProcedureService(long userId) {
		var result = this.userRepository.getUserByIdWithProcedureRepository(userId);
		return result;
	}
	
	public String deleteUserByUserIdService(long userId) {
		var result = this.userRepository.deleteUserByUserIdRepo(userId);
		return result;
	}
	
}
