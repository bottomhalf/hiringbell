package com.hiringbell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiringbell.entity.Certification;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.CertificationService;

@RestController
@RequestMapping("/Certification")
public class CertificationController extends BaseController {
	
	@Autowired
	CertificationService certificationService;
	
	
	public ResponseModal addCertification(@RequestBody Certification certification) {
		var result = this.certificationService.addCertificationService(certification);
		return BuildOk(result);
	}
	

}
