package com.hiringbell.repository;

import org.springframework.stereotype.Repository;

import com.hiringbell.entity.SkillDetail;

@Repository
public class SkillDetailRepository {

	public String addSkillDetailRepo(SkillDetail skillDetail) {
		return "Data added successfully in SkillDetail";
		
	}

	public String updateSkillDetailRepo(SkillDetail skillDetail, long skillDetailId) {
		return "Data Updated Successfully of SkillDetail";
	}
	
	public String getAllSkillDetailRepo() {
		return "Got all the data of SkillDetail";
	}
	
	public String getByIdSkillDetailRepo(long skillDetailId) {
		return "Got data from SkillDetail by skillDetailId";
	}
	
	public String deleteByIdSkillDetailRepo(long skillDetailId) {
		return "Data deleted from SkilDetail by skillDetailId";
	}
	
	
	

}
