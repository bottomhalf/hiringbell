package com.hiringbell.repository;

import org.springframework.stereotype.Repository;

import com.hiringbell.entity.EmploymentDetail;

@Repository
public class EmploymentDetailRepository {
	
	
	public String addEmploymentDetailRepo(EmploymentDetail empDetail) {
		return "Data added in EmploymentDetail successfully";
	}
	
	public String updateEmploymentDetailRepo(EmploymentDetail empDetail, long empDetailId) {
		return "Data updated successfully in EmploymentDetail";
	}

	public String getAllEmploymentDetailRepo() {
		return "Got all data of EmploymentDetail successfully";
	}
	
	public String getByIdEmploymentDetailRepo(long empDetailId) {
		return "Got data of EmploymentDetail by empDetailId";
	}

	public String deleteByIdEmploymentDetailRepo(long empDetailId) {
	return "Data deleted from EmploymentDetail by empDetailId";
		
	}

}
