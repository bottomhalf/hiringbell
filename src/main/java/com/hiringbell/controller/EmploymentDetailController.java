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
	public ResponseModal addEmploymentDetail(@RequestBody EmploymentDetail empDetail) {
		var result = this.employmentDetailService.addEmploymentDetailService(empDetail);
		return BuildOk(result);
	}
	
	@PutMapping("/updateEmpDetail/{empDetailId}")
	public ResponseModal updateEmploymentDetail(@RequestBody EmploymentDetail empDetail, @PathVariable("empDetailId") long empDetailId) {
		var result = this.employmentDetailService.updateEmploymentDetailService(empDetail, empDetailId);
		return BuildOk(result);
	}
	
	@GetMapping("/getAllEmpDetail")
	public ResponseModal getAllEmploymentDetail() {
		var result = this.employmentDetailService.getAllEmploymentDetailService();
		return BuildOk(result);
	}
	
	@GetMapping("/getByempDetailId/{empDetailId}")
	public ResponseModal getByIdEmploymentDetail(@PathVariable ("empDetailId") long empDetailId) {
		var result = this.employmentDetailService.getByIdEmploymentDetailService(empDetailId);
		return BuildOk(result);
	}
	
	@DeleteMapping("/deleteByempDetailId/{empDetailId}")
	public ResponseModal deleteByIdEmploymentDetail (@PathVariable ("empDetailId") long empDetailId) {
		var result = this.employmentDetailService.deleteByIdEmploymentDetailService(empDetailId);
		return BuildOk(result);
	}

}
