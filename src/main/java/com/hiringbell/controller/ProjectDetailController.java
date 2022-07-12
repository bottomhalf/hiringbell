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

import com.hiringbell.entity.ProjectDetail;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.ProjectDetailService;


@RestController
@RequestMapping("/ProjectDetail")
public class ProjectDetailController extends BaseController {
	
	
	@Autowired
	ProjectDetailService projectDetailService;
	
	@PostMapping("/addProjectDetail")
	public ResponseModal addProjectDetail(@RequestBody ProjectDetail projectDetail) {
		var result = this.projectDetailService.addProjectDetailService(projectDetail);
		return BuildOk(result);
	}
	
	@PutMapping("/updateProjectDetail/{projectDetailId}")
	public ResponseModal updateProjectDetail(@RequestBody ProjectDetail projectDetail, @PathVariable("projectDetailId") long projectDetailId) throws Exception {
		var result = this.projectDetailService.updateProjectDetailService(projectDetail, projectDetailId);
		return BuildOk(result);
	}
	
	@GetMapping("/getAllProjectDetail")
	public ResponseModal getAllProjectDetail() {
		var result = this.projectDetailService.getAllProjectDetailService();
		return BuildOk(result);
	}
	
	@GetMapping("/getById/{projectDetailId}")
	public ResponseModal getByIdProjectDetail(@PathVariable("projectDetailId") long projectDetailId){
		var result = this.projectDetailService.getByIdProjectDetailService(projectDetailId);
		return BuildOk(result);
	}
	
	@DeleteMapping("/deleteById/{projectDetailId}")
	public ResponseModal deleteByIdProjectDetail(@PathVariable ("projectDetailId") long projectDetailId) {
		var result = this.projectDetailService.deleteByIdProjectDetailService(projectDetailId);
		return BuildOk(result);
	}

}
