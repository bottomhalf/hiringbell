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
	
	@PostMapping("/addEmpDetail")
	public ResponseModal addEmploymentDetail(@RequestBody EmploymentDetail employmentDetail) {
		var result = this.employmentDetailService.addEmploymentDetailService(employmentDetail);
		return BuildOk(result);
	}
	
	@PutMapping("/updateEmpDetail/{employmentDetailId}")
	public ResponseModal updateEmploymentDetail(@RequestBody EmploymentDetail employmentDetail, @PathVariable("employmentDetailId") long employmentDetailId) {
		var result = this.employmentDetailService.updateEmploymentDetailService(employmentDetail, employmentDetailId);
		return BuildOk(result);
	}
	
	@GetMapping("/getAllEmpDetail")
	public ResponseModal getAllEmploymentDetail() {
		var result = this.employmentDetailService.getAllEmploymentDetailService();
		return BuildOk(result);
	}
	
	@GetMapping("/getByempDetailId/{employmentDetailId}")
	public ResponseModal getByIdEmploymentDetail(@PathVariable ("employmentDetailId") long employmentDetailId) {
		var result = this.employmentDetailService.getByIdEmploymentDetailService(employmentDetailId);
		return BuildOk(result);
	}
	
	@DeleteMapping("/deleteByempDetailId/{employmentDetailId}")
	public ResponseModal deleteByIdEmploymentDetail (@PathVariable ("employmentDetailId") long employmentDetailId) {
		var result = this.employmentDetailService.deleteByIdEmploymentDetailService(employmentDetailId);
		return BuildOk(result);
	}

}
