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

import com.hiringbell.entity.EmploymentDetail;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.EmploymentDetailService;

@RestController
@RequestMapping("/EmploymentDetail")
public class EmploymentDetailController extends BaseController {
	
	@Autowired
	EmploymentDetailService employmentDetailService;
	
	@PostMapping("/addEmploymentDetail")
	public ResponseModal addEmploymentDetail(@RequestBody EmploymentDetail employmentDetail) {
		var result = this.employmentDetailService.addEmploymentDetailService(employmentDetail);
		return BuildOk(result);
	}
	
	@PutMapping("/updateEmploymentDetail/{employmentDetailId}")
	public ResponseModal updateEmploymentDetail(@RequestBody EmploymentDetail employmentDetail, @PathVariable("employmentDetailId") long employmentDetailId) throws Exception {
		var result = this.employmentDetailService.updateEmploymentDetailService(employmentDetail, employmentDetailId);
		return BuildOk(result);
	}
	
	@GetMapping("/getAllEmploymentDetail")
	public ResponseModal getAllEmploymentDetail() {
		var result = this.employmentDetailService.getAllEmploymentDetailService();
		return BuildOk(result);
	}
	
	@GetMapping("/getByUserId/{userId}")
	public ResponseModal getByUserIdEmploymentDetail(@PathVariable ("userId") long userId) {
		var result = this.employmentDetailService.getByUserIdEmploymentDetailService(userId);
		return BuildOk(result);
	}
	
	@DeleteMapping("/deleteByEmploymentDetailId/{employmentDetailId}")
	public ResponseModal deleteByIdEmploymentDetail (@PathVariable ("employmentDetailId") long employmentDetailId) {
		var result = this.employmentDetailService.deleteByIdEmploymentDetailService(employmentDetailId);
		return BuildOk(result);
	}

}
