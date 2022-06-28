package com.hiringbell.repository;

import org.springframework.stereotype.Repository;

import com.hiringbell.entity.Company;

@Repository
public class CompanyRepository {
	
	public String addCompanyRepo(Company company) {
		return "Data created successfully in Company";
	}
	
	public String updateCompanyByIdRepo(Company company, long companyId) {
		return "Data updated successfully in company";
	}
	
	public String getAllCompanyRepo() {
		return "Got all data of Company successfully";
	}
	
	public String getCompanyByIdRepo(long comapanyId) {
		return "Got data of Company successfully on the basis of companyId";
	}

	public String deleteByIdCompanyRepo(long companyId) {
		return "Data deleted of Company on the basis of companyId";
		
	}
}
