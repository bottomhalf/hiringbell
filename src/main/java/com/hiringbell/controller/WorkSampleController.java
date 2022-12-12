package com.hiringbell.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiringbell.entity.WorkSample;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.WorkSampleService;

@RestController
@RequestMapping("/WorkSample")
public class WorkSampleController extends BaseController {
	
	@Autowired
	WorkSampleService workSampleService;
	
	@PostMapping("/addWorkSample")
	public ResponseModal addWorkSample(@RequestBody WorkSample workSample) {
		var result = this.workSampleService.addWorkSampleService(workSample);
		return BuildOk(result);
	}
	
	@PutMapping("/updateWorkSample/{workSampleId}")
	public ResponseModal updateByworkSampleIdWorkSample(@RequestBody WorkSample workSample, @PathVariable("workSampleId") long workSampleId) throws IOException {
		var result = this.workSampleService.updateByworkSampleIdWorkSampleService(workSample, workSampleId);
		return BuildOk(result);
	}
	
	@GetMapping("/getAllWorkSample")
	public ResponseModal getAllWorkSample() {
		var result = this.workSampleService.getAllWorkSampleService();
		return BuildOk(result);
	}
	
	
	@GetMapping("/getByUserId/{userId}")
	public ResponseModal getByUserIdWorkSample(@PathVariable("userId") long userId) {
		var result = this.workSampleService.getByUserIdWorkSampleService(userId);
		
		return BuildOk(result);
	}
	
	@DeleteMapping("/deleteByworkSampleId/{workSampleId}")
	public ResponseModal deleteByworkSampleIdWorkSample(@PathVariable("workSampleId") long workSampleId) {
		var result = this.workSampleService.deleteByworkSampleIdWorkSampleService(workSampleId);
		return BuildOk(null);
	}
	
}
