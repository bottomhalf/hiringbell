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

import com.hiringbell.entity.PersonalDetail;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.PersonalDetailService;


@RestController
@RequestMapping("/PersonalDetail")
public class PersonalDetailController extends BaseController {
	
	@Autowired
	PersonalDetailService personalDetailService;
	
	@PostMapping("/addPersonalDetail")
	public ResponseModal addPersonalDetail(@RequestBody PersonalDetail personalDetail) {
		var result = this.personalDetailService.addPersonalDetailService(personalDetail);
		return BuildOk(result);
	}
	
	@PutMapping("/updatePersonalDetail/{personalDetailId}")
	public ResponseModal updatePersonalDetail(@RequestBody PersonalDetail personalDetail, @PathVariable("personalDetailId") long personalDetailId) throws Exception {
		var result = this.personalDetailService.updatePersonalDetailService(personalDetail, personalDetailId);
		return BuildOk(result);
	}
	
	@GetMapping("/getAllPersonalDetail")
	public ResponseModal getAllPersonalDetail() {
		var result = this.personalDetailService.getAllPersonalDetailService();
		return BuildOk(result);
	}
	
	@GetMapping("/getById/{personalDetailId}")
	public ResponseModal getByIdPersonalDetail(@PathVariable("personalDetailId") long personalDetailId){
		var result = this.personalDetailService.getByIdPersonalDetailService(personalDetailId);
		return BuildOk(result);
	}
	
	@DeleteMapping("/deleteById/{personalDetailId}")
	public ResponseModal deleteByIdPersonalDetail(@PathVariable ("personalDetailId") long personalDetailId) {
		var result = this.personalDetailService.deleteByIdPersonalDetailService(personalDetailId);
		return BuildOk(result);
	}
	
}
