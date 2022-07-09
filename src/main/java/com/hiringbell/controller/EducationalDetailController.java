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
	
	@PostMapping("/addED")
	public ResponseModal addEducationalDetail(@RequestBody EducationalDetail ed) {
		var result = this.educationalDetailService.addEducationalDetailService(ed);
		return BuildOk(result);
	}
	
	@PutMapping("/updateEducationalDetail/{edId}")
	public ResponseModal updateEducationalDetail(@RequestBody EducationalDetail ed, @PathVariable long educationalDetailId) {
		var result = this.educationalDetailService.updateEducationalDetailService(ed, educationalDetailId);
		return BuildOk(result);
	}
	
	
	@GetMapping("/getAllEducationalDetail")
	public ResponseModal getAllEducationalDetail() {
		var result = this.educationalDetailService.getAllEducationalDetailService();
		return BuildOk(result);
	}
	
	@GetMapping("/getById/{edId}")
	public ResponseModal getByIdEducationalDetail(@PathVariable ("edId") long educationalDetailId) {
		var result = this.educationalDetailService.getByIdEducationalDetailService(educationalDetailId);
		return BuildOk(result);
	}
	
	@DeleteMapping("/deleteById/{edId}")
	public ResponseModal deleteByIdEducationalDetail(@PathVariable("edId") long educationalDetailId) {
		var result = this.educationalDetailService.deleteByIdEducationalDetailService(educationalDetailId);
		return BuildOk(result);
	}

}
