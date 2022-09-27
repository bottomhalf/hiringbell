package com.hiringbell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.CommonService;

@RestController
@RequestMapping("/CommonController")
public class CommonController extends BaseController {
	
	@Autowired
	CommonService commonService;
	
	
	@GetMapping("/getLoadAllDetailByUserId/{userId}")
	public ResponseModal getLoadAllDetailByUserId(@PathVariable("userId") long userId) throws JsonMappingException, JsonProcessingException {
		var result = this.commonService.getLoadAllDetailByUserIdService(userId);
		return BuildOk(result);
	}

}
