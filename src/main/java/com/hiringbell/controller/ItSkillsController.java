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

import com.hiringbell.entity.ItSkills;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.ItSkillsService;

@RestController
@RequestMapping("/ItSkills")
public class ItSkillsController extends BaseController {
	
	
	@Autowired
	ItSkillsService itSkillsService;
	
	@PostMapping("/addItSkill")
	public ResponseModal addItSkill(@RequestBody ItSkills itSkills) {
		var result = this.itSkillsService.addItSkillService(itSkills);
		return BuildOk(result);
	}
	
	@PutMapping("/updateItSkills/{itSkillId}")
	public ResponseModal updateItSkillsByItSkillId(@RequestBody ItSkills itSkills, @PathVariable("itSkillId") long itSkillId) throws IOException {
		var result = this.itSkillsService.updateItSkillsByItSkillIdService(itSkills, itSkillId);
		return BuildOk(result);
	}
	
	@GetMapping("/getAllItSkills")
	public ResponseModal getAllItSkills() {
		var result = this.itSkillsService.getAllItSkillsService();
		return BuildOk(result);
	}
	
	@GetMapping("/getByUserId/{userId}")
	public ResponseModal getByUserIdItSkills(@PathVariable ("userId") long userId) {
		var result = this.itSkillsService.getByUserIdItSkillsService(userId);
		return BuildOk(result);
	}
	
	@DeleteMapping("/deleteByitSkillId/{itSkillId}")
	public ResponseModal deleteByitSkillIdItSkills(@PathVariable ("itSkillId") long itSkillId) {
		var result = this.itSkillsService.deleteByitSkillIdItSkillsService(itSkillId);
		return BuildOk(null);
	}
	
}
