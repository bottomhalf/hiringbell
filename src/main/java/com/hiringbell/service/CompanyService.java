package com.hiringbell.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.Company;
import com.hiringbell.repository.CompanyRepository;

@Service
@Component
public class CompanyService {
	
	@Autowired
	CompanyRepository companyRepository;

	public String addCompanyService(Company company) {
		var result = this.companyRepository.addCompanyRepo(company);
		return result;
	}
	
	public String updateCompanyByIdService(Company company, long companyId) throws Exception {
		var result = "";
		Company value = this.companyRepository.getCompanyByIdRepo(companyId);
		if(value != null) {
			value.setRole(company.getRole());
			value.setIndustry(company.getIndustry());
			value.setDesignation(company.getDesignation());
			value.setCompanyName(company.getCompanyName());
			value.setFunctionalArea(company.getFunctionalArea());
			value.setDesiredTypePermanent(company.getDesiredTypePermanent());
			value.setDesiredEmploymentType(company.getDesiredEmploymentType());
			value.setPreferredShift(company.getPreferredShift());
			value.setPreferredWorkLocation(company.getPreferredWorkLocation());
			value.setExpectedSalary(company.getExpectedSalary());
			value.setRoleCategory(company.getRoleCategory());
			value.setDepartment(company.getDepartment());
			value.setCurrencyType(company.getCurrencyType());
			value.setAdminId(company.getAdminId());
			result = this.companyRepository.updateCompanyByIdRepo(value, companyId);
		}
		else {
			throw new Exception("Exception message");
		}
		return result;
	}
	
	public ArrayList<Company> getAllCompanyService() {
		var result = this.companyRepository.getAllCompanyRepo();
		return result;
	}
	
	public Company getCompanyByIdService(long companyId) {
		var result = this.companyRepository.getCompanyByIdRepo(companyId);
		return result;
	}
	
	public String deleteByIdCompanyService(long companyId) {
		var result = this.companyRepository.deleteByIdCompanyRepo(companyId);
		return result;
	}

}
