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

import com.hiringbell.entity.Patent;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.PatentService;

@RestController
@RequestMapping("/Patent")
public class PatentController extends BaseController {
	
	@Autowired
	PatentService patentService;
	
	@PostMapping("/addPatent")
	public ResponseModal addPatent(@RequestBody Patent patent) {
		var result = this.patentService.addPatentService(patent);
		return BuildOk(result);
	}
	
	@PutMapping("/updatePatent/{patentId}")
	public ResponseModal updatePatent (@RequestBody Patent patent, @PathVariable("patentId") long patentId) throws IOException {
		var result = this.patentService.updatePatentService(patent, patentId);
		return BuildOk(null);
	}
	
	@GetMapping("/getAllPatent")
	public ResponseModal getAllPatent() {
		var result = this.patentService.getAllPatentService();
		return BuildOk(result);
	}
	
	@GetMapping("/getPatentByUserId/{userId}")
	public ResponseModal getPatentByUserId( @PathVariable("userId") long userId) {
		var result = this.patentService.getPatentByUserIdService(userId);
		return BuildOk(result);
	}
	
	@DeleteMapping("/deletePatentByPatentId/{patentId}")
	public ResponseModal deletePatentByPatentId(@PathVariable("patentId") long patentId) {
		var result = this.patentService.deletePatentByPatentIdService(patentId);
		return BuildOk(result);
	}
	
	
}
