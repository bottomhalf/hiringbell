package com.hiringbell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiringbell.entity.ProfessionalUser;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.ProfessionalUserService;



@RestController
@RequestMapping("/ProfessionalUser")
public class ProfessionalUserController extends BaseController {
	
	@Autowired
	ProfessionalUserService professionalUserService;
	
	
	@PostMapping("/addProfessionalUser")
	public ResponseModal addProfessionalUser(@RequestBody ProfessionalUser professionalUser) {
		var result = this.professionalUserService.addProfessionalUserService(professionalUser);
		return BuildOk(result);
	}
	
	@PutMapping("/updateProfessionalUser/{userId}")
	public ResponseModal updateProfessionalUser(@RequestBody ProfessionalUser professionalUser, @PathVariable("userId") long userId) {
		var result = this.professionalUserService.updateProfessionalUserService(professionalUser, userId);
		return BuildOk(result);
	}
	
	@GetMapping("/getAllProfessionalUser")
	public ResponseModal getAllProfessionalUser() {
		var result = this.professionalUserService.getAllProfessionalUserService();
		return BuildOk(result);
	}
	
	@GetMapping("/getByUserId/{userId}")
	public ResponseModal getByUserIdProfessionalUser(@PathVariable("userId") long userId) {
		var result = this.professionalUserService.getByUserIdProfessionalUserService(userId);
		return BuildOk(result);
	}
	
	@DeleteMapping("/deleteByUserId/{userId}")
	public ResponseModal deleteByUserIdProfessionalUser(@PathVariable("userId") long userId) {
		var result = this.professionalUserService.deleteByUserIdProfessionalUserService(userId);
		return BuildOk(result);
	}
	

}
