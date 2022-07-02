package com.hiringbell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiringbell.entity.User;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
	
	@Autowired
	UserService userService;
	
	//@GetMapping("/{userId}")
	//public ResponseModal getUserById(@PathVariable("userId") long userId) throws Exception
	//{
		//User result = this.userService.getUserByIdService(userId);
		//System.out.println(result); 
		//var data = BuildOk(result);
		//return data;			
	//}
	
	@GetMapping("/userAll")
	public ResponseModal getUserAllByProcedure()
	{
		var result = this.userService.getUserAllByProcedureService();
		return BuildOk(result);
	}
	
	@GetMapping("/{userId}")
	public ResponseModal getUserByIdWithProcedure(@PathVariable("userId") long userId) throws Exception
	{
		var result = this.userService.getUserByIdWithProcedureService(userId);
		
		return BuildOk(result);
	}
	
	
	@PutMapping("/updateUserById/{userId}")
	public ResponseModal updateUserById(@RequestBody User user, @PathVariable("userId") long userId)
	{
		var result = this.userService.updateUserByIdService(user, userId);
		
		return BuildOk(result) ;
	}
	
	@PostMapping("/addOrUpdateUser")
	public ResponseModal addUser(@RequestBody User user)
	{
		var result = this.userService.addUserService(user);
		
		return BuildOk(result);
	}
}
