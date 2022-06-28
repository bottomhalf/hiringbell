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

import com.hiringbell.entity.AccomplishmentsDetail;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.AccomplishmentsDetailService;

@RestController
@RequestMapping("/AccomplishmentsDetail")
public class AccomplishmentsDetailController extends BaseController {
	
	@Autowired
	AccomplishmentsDetailService accomplishmentsDetailService;
	
	
	@PostMapping("/addAD")
	public ResponseModal addAccomplishmentsDetail(@RequestBody AccomplishmentsDetail ad) {
		var result = this.accomplishmentsDetailService.addAccomplishmentsDetailService(ad);
		return BuildOk(result);
	}
	
	
	@PutMapping("/updatePD/{accomplishmentId}")
	public ResponseModal updateAccomplishmentsDetail(@RequestBody AccomplishmentsDetail ad, @PathVariable ("accomplishmentId") long accomplishmentId ) {
		var result = this.accomplishmentsDetailService.updateAccomplishmentsDetailService(ad, accomplishmentId);
		return BuildOk(result);
	}
	
	@GetMapping("/allAD")
	public ResponseModal getAllAccomplishmentsDetail() {
		var result = this.accomplishmentsDetailService.getAllAccomplishmentsDetailService();
		return BuildOk(result);
	}
	
	@GetMapping("/getById/{accomplishmentId}")
	public ResponseModal getByIdAccomplishmentsDetail(@PathVariable ("accomplishmentId") long accomplishmentId) {
		var result = this.accomplishmentsDetailService.getByIdAccomplishmentsDetailService(accomplishmentId);
		return BuildOk(result);
		
	}
	
	@DeleteMapping("/deleteById/{accomplishmentId}")
	public ResponseModal deleteByIdAccomplishmentsDetail(@PathVariable ("accomplishmentId") long accomplishmentId) {
		var result = this.accomplishmentsDetailService.deleteByIdAccomplishmentsDetailService(accomplishmentId);
		return BuildOk(result);
	}
	

}
