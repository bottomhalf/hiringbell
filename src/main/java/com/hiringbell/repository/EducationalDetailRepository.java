package com.hiringbell.repository;

import org.springframework.stereotype.Repository;

import com.hiringbell.entity.EducationalDetail;

@Repository
public class EducationalDetailRepository {
	
	
	public String addEducationalDetailRepo(EducationalDetail ed) {
		return "Data added successfully in EducationalDetail";
	}

	public String updateEducationalDetailRepo(EducationalDetail ed, long edId) {
		return "Data Updated of EducationalDetail successfully";	
	}

	public String getAllEducationalDetailRepo() {
		return "Got all Data of EducationalDetail Successfully";
	}
	
	public String getByIdEducationalDetailRepo(long edId) {
		return "Got data of EducationalDetail on the basis of edId";
	}

	public String deleteByIdEducationalDetailRepo(long edId) {
		return "Data deleted of EducationDetail on the basis of edId";
		
	}
	
	
	
	
}
