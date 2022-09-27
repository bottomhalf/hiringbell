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

import com.hiringbell.entity.EducationalDetail;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.EducationalDetailService;

@RestController
@RequestMapping("/EducationalDetail")
public class EducationalDetailController extends BaseController {
	
	@Autowired
	EducationalDetailService educationalDetailService;
	
	@PostMapping("/addEducationalDetail")
	public ResponseModal addEducationalDetail(@RequestBody EducationalDetail educationalDetail) {
		var result = this.educationalDetailService.addEducationalDetailService(educationalDetail);
		return BuildOk(result);
	}
	
	@PutMapping("/updateEducationalDetail/{educationalDetailId}")
	public ResponseModal updateEducationalDetail(@RequestBody EducationalDetail educationalDetail, @PathVariable ("educationalDetailId") long educationalDetailId) throws Exception {
		var result = this.educationalDetailService.updateEducationalDetailService(educationalDetail, educationalDetailId);
		return BuildOk(result);
	}
	
	
	@GetMapping("/getAllEducationalDetail")
	public ResponseModal getAllEducationalDetail() {
		var result = this.educationalDetailService.getAllEducationalDetailService();
		return BuildOk(result);
	}
	
	@GetMapping("/getByUserId/{userId}")
	public ResponseModal getByUserIdEducationalDetail(@PathVariable ("userId") long userId) {
		var result = this.educationalDetailService.getByUserIdEducationalDetailService(userId);
		return BuildOk(result);
	}
	
	@DeleteMapping("/deleteById/{educationalDetailId}")
	public ResponseModal deleteByIdEducationalDetail(@PathVariable("educationalDetailId") long educationalDetailId) {
		var result = this.educationalDetailService.deleteByIdEducationalDetailService(educationalDetailId);
		return BuildOk(result);
	}

}
