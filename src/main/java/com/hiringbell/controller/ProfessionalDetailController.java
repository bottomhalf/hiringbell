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

import com.hiringbell.entity.ProfessionalDetail;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.ProfessionalDetailService;

@RestController
@RequestMapping("/ProfessionalDetail")
public class ProfessionalDetailController extends BaseController {
	
	@Autowired
	ProfessionalDetailService professionalDetailService;
	
	
	@PostMapping("/addPD")
	public ResponseModal addProfessionalDetail(@RequestBody ProfessionalDetail pd)
	{
		var result = this.professionalDetailService.addProfessionalDetailService(pd);
		
		return BuildOk(result);
	}
	
	@PutMapping("/UpdatePD/{userId}")
	public ResponseModal updateProfessionalDetail(@RequestBody ProfessionalDetail pd, @PathVariable("userId") long userId)
	{
		var result = this.professionalDetailService.updateProfessionalDetailService(pd,userId);
		
		return BuildOk(result);
	}
	
	@GetMapping("/allPD")
	public ResponseModal getAllProfessionalDetail()
	{
		var result = this.professionalDetailService.getAllProfessionalDetailService();
		return BuildOk(result);
	}
	
	
	@GetMapping("/getByUserId/{userId}")
	public ResponseModal getByUserIdProfessionalDetail(@PathVariable("userId") long userId)
	{
		var result = this.professionalDetailService.getByUserIdProfessionalDetailService(userId);
		return BuildOk(result);
	}
	
	
	@DeleteMapping("/deleteByUserId/{userId}")
	public ResponseModal deleteByUserIdProfessionalDetail(@PathVariable("userId") long userId)
	{
		var result = this.professionalDetailService.deleteByUserIdProfessionalDetailService(userId);
		return BuildOk(result);
	}
	
		
}
