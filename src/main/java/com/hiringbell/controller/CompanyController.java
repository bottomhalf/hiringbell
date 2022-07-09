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

import com.hiringbell.entity.Company;
import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.CompanyService;

@RestController
@RequestMapping("/Company")
public class CompanyController extends BaseController {
	
	@Autowired
	CompanyService companyService;
	
	@PostMapping("/addCompany")
	public ResponseModal addCompany(@RequestBody Company company) {
		var result = this.companyService.addCompanyService(company);
		return BuildOk(result);
	}
	
	@PutMapping("/updateCompany/{companyId}")
	public ResponseModal updateCompanyById(@RequestBody Company company, @PathVariable("companyId") long companyId) throws Exception {
		var result = this.companyService.updateCompanyByIdService(company, companyId);
		return BuildOk(result);
	}
	
	@GetMapping("/allCompany")
	public ResponseModal getAllCompany() {
		var result = this.companyService.getAllCompanyService();
		return BuildOk(result);
	}
	
	@GetMapping("/getByCompanyId/{companyId}")
	public ResponseModal getCompanyById(@PathVariable("companyId") long companyId ) {
		var result = this.companyService.getCompanyByIdService(companyId);
		return BuildOk(result);
	}
	
	@DeleteMapping("/deleteByCompanyId/{companyId}")
	public ResponseModal deleteByIdCompany( @PathVariable("companyId") long companyId) {
		var result = this.companyService.deleteByIdCompanyService(companyId);
		return BuildOk(result);
	}
	


}
