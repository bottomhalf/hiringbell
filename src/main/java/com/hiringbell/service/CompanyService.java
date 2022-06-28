package com.hiringbell.service;

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
	
	public String updateCompanyByIdService(Company company, long companyId) {
		var result = this.companyRepository.updateCompanyByIdRepo(company, companyId);
		return result;
	}
	
	public String getAllCompanyService() {
		var result = this.companyRepository.getAllCompanyRepo();
		return result;
	}
	
	public String getCompanyByIdService(long companyId) {
		var result = this.companyRepository.getCompanyByIdRepo(companyId);
		return result;
	}
	
	public String deleteByIdCompanyService(long companyId) {
		var result = this.companyRepository.deleteByIdCompanyRepo(companyId);
		return result;
	}

}
