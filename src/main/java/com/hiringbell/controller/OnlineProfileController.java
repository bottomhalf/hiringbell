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

import com.hiringbell.entity.OnlineProfile;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.OnlineProfileService;

@RestController
@RequestMapping("/OnlineProfile")
public class OnlineProfileController extends BaseController {
	
	@Autowired
	OnlineProfileService onlineProfileService;
	
	@PostMapping("/addOnlineProfile")
	public ResponseModal addOnlineProfile(@RequestBody OnlineProfile onlineProfile) {
		var result = this.onlineProfileService.addOnlineProfileService(onlineProfile);
		return BuildOk(result);
	}
	
	@PutMapping("/updateOnlineProfile/{onlineProfileId}")
		public ResponseModal updateOnlineProfile(@RequestBody OnlineProfile onlineProfile, @PathVariable("onlineProfileId") long onlineProfileId) throws IOException {
			var result = this.onlineProfileService.updateOnlineProfileService(onlineProfile, onlineProfileId);
			return BuildOk(result);
	}
	
	@GetMapping("/getAllOnlineProfile")
	public ResponseModal getAllOnlineProfile() {
		var result = this.onlineProfileService.getAllOnlineProfileService();
		return BuildOk(result);
	}
	
	@GetMapping("/getByUserId/{userId}")
	public ResponseModal getByUserIdOnlineProfile(@PathVariable("userId") long userId) {
		var result = this.onlineProfileService.getByUserIdOnlineProfileService(userId);
		return BuildOk(result);
	}
	
	@DeleteMapping("/deleteByOnlineProfileId/{onlineProfileId}")
	public ResponseModal deleteByOnlineProfileId(@PathVariable("onlineProfileId") long onlineProfileId) {
		var result = this.onlineProfileService.deleteByOnlineProfileIdService(onlineProfileId);
		return BuildOk(result);
	}

	
	
}
