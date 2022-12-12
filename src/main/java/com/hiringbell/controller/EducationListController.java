package com.hiringbell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.EducationListService;

@RestController
@RequestMapping("/EducationList")
public class EducationListController extends BaseController {
	
	
	@Autowired
	EducationListService educationListService;
	
	
	@GetMapping("/getAllEducationList")
	public ResponseModal getAllEducationList () {
		var result = this.educationListService.getAllEducationListService();
		return BuildOk(result);
	}

}
