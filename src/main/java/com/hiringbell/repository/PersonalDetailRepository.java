package com.hiringbell.repository;

import org.springframework.stereotype.Repository;

import com.hiringbell.entity.PersonalDetail;

@Repository
public class PersonalDetailRepository {
	
	
	public String addPersonalDetailRepo (PersonalDetail personalDetail) {
		return "Data added successfully in PersonalDetail";
	}

	public String updatePersonalDetailRepo(PersonalDetail personalDetail, long personalDetailId) {
		return "Data updated for PersonalDetail successfully";
	}
	
	public String getAllPersonalDetailRepo() {
		return "Got All data of PersonalDetail successfully";
	}
	
	public String getByIdPersonalDetailRepo(long personalDetailId) {
		return "Got data of PersonalDetail on the basis of personalDetailId";
	}

	public String deleteByIdPersonalDetailRepo(long personalDetailId) {
		return "Data deleted of PersonalDetail on the basis of personalDetailId";
		
	}
}
