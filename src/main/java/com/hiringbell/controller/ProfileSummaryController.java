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

import com.hiringbell.entity.ProfileSummary;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.ProfileSummaryService;

@RestController
@RequestMapping("/ProfileSummary")
public class ProfileSummaryController extends BaseController {
	
	@Autowired
	ProfileSummaryService profileSummaryService;
	
	
	@PostMapping("/addProfileSummary")
	public ResponseModal addProfileSummary(@RequestBody ProfileSummary profileSummary) {
		var result = this.profileSummaryService.addProfileSummaryService(profileSummary);
		return BuildOk(null);
	}
	
	@PutMapping("/updateByUserId/{userId}")
	public ResponseModal updateByUserIdProfileSummary(@RequestBody ProfileSummary profileSummary, @PathVariable("userId") long userId) throws IOException {
		var result = this.profileSummaryService.updateProfileSummarybyUserIdService(profileSummary, userId);
		return BuildOk(result);
		
	}
	
	@GetMapping("/getByUserId/{userId}")
	public ResponseModal getByUserIdProfileSummary(@PathVariable ("userId") long userId) {
		var result = this.profileSummaryService.getByUserIdProfileSummaryService(userId);
		return BuildOk(result);
	}
	
	@GetMapping("/getAllProfileSummary")
	public ResponseModal getAllProfileSummary() {
		var result = this.profileSummaryService.getAllProfileSummaryService();
		return BuildOk(null);
	}
	
	@DeleteMapping("/deleteByUserId/{userId}")
	public ResponseModal deleteByUserIdProfileSummary(@PathVariable("userId") long userId) {
		var result = this.profileSummaryService.deleteByUserIdProfileSummaryService(userId);
		return BuildOk(result);
	}
	
	
	
}
