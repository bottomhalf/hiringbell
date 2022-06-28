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

import com.hiringbell.entity.SkillDetail;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.SkillDetailService;

@RestController
@RequestMapping("/SkillDetail")
public class SkillDetailController extends BaseController {
	
	@Autowired
	SkillDetailService skillDetailService;
	
	@PostMapping("/addSkillDetail")
	public ResponseModal addSkillDetail(@RequestBody SkillDetail skillDetail) {
		var result = this.skillDetailService.addSkillDetailService(skillDetail);
		return BuildOk(result);
	}
	
	@PutMapping("/updateSkillDetail/{skillDetailId}")
	public ResponseModal updateSkillDetail(@RequestBody SkillDetail skillDetail, @PathVariable("skillDetailId") long skillDetailId) {
		var result = this.skillDetailService.updateSkillDetailService(skillDetail, skillDetailId);
		return BuildOk(result);
	}
	
	@GetMapping("/getAllSkillDetail")
	public ResponseModal getAllSkillDetail() {
		var result = this.skillDetailService.getAllSkillDetailService();
		return BuildOk(result);
	}
	
	@GetMapping("/getById/{skillDetailId}")
	public ResponseModal getByIdSkillDetail (@PathVariable("skillDetailId") long skillDetailId) {
		var result = this.skillDetailService.getByIdSkillDetailService(skillDetailId);
		return BuildOk(result);
	}
	
	@DeleteMapping("/deleteById/{skillDetailId}")
	public ResponseModal deleteByIdSkillDetail(@PathVariable("skillDetailId") long skillDetailId) {
		var result = this.skillDetailService.deleteByIdSkillDetailService(skillDetailId);
		return BuildOk(result);
	}

}
