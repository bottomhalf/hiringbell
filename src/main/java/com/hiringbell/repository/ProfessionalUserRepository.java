package com.hiringbell.repository;

import org.springframework.stereotype.Repository;

import com.hiringbell.entity.ProfessionalUser;

	@Repository
	public class ProfessionalUserRepository {
	
	public String addProfessionalUserRepo(ProfessionalUser professionalUser) {
		return "Data added in ProfessionalUser successfully";
	}
	
	public String updateProfessionalUserRepo(ProfessionalUser professionalUser, long userId) {
		return "Data updated successfully in ProfessionalUser";
	}
	
	public String getAllProfessionalUserRepo() {
		return "Got All data of ProfessionalUser";
	}
	
	public String getByUserIdProfessionalUserRepo(long userId) {
		return "getByUserIdProfessionalUser successfully";
	}
	
	public String deleteByUserIdProfessionalUserRepo(long userId) {
		return "data deleted from ProfessionalUser By userId";
	}
	
}
