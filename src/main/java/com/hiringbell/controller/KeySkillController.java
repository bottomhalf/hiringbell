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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.hiringbell.entity.KeySkill;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.KeySkillService;

@RestController
@RequestMapping("/KeySkill")
public class KeySkillController extends BaseController {
	
	
	@Autowired
	KeySkillService keySkillService;
	
	@PostMapping("/addKeySkill/{userId}")
	public ResponseModal addKeySkill(@RequestBody KeySkill keySkill, @PathVariable("userId") long userId) throws JsonProcessingException {
		var result = this.keySkillService.addKeySkillService(keySkill, userId);
		return BuildOk(result);
	}
	
	@PutMapping("/ByKeySkillId/{keySkillId}")
	public ResponseModal updateByKeySkillIdKeySkill(@RequestBody KeySkill keySkill, @PathVariable("keySkillId") long keySkillId) throws IOException {
		var result = this.keySkillService.updateKeySkillByKeySkillIdService(keySkill, keySkillId);
		return BuildOk(result);
	}
	
	@GetMapping("/getAllKeySkill")
	public ResponseModal getAllKeySkill() {
		var result = this.keySkillService.getAllKeySkillService();
		return BuildOk(result);
	}
	
	@GetMapping("/getByUserId/{userId}")
	public ResponseModal getByUserIdKeySkill(@PathVariable("userId") long userId) throws JsonMappingException, JsonProcessingException {
		var result = this.keySkillService.getByUserIdKeySkillService(userId);
		return BuildOk(result);
	}
	
	@DeleteMapping("/deleteByKeySkillId/{keySkillId}")
	public ResponseModal deleteByKeySkillIdKeySkill(@PathVariable("keySkillId") long keySkillId) {
		var result = this.keySkillService.deleteByKeySkillIdKeySkillService(keySkillId);
		return BuildOk(result);
	}

}
