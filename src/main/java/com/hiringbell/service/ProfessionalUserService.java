package com.hiringbell.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.ProfessionalUser;
import com.hiringbell.repository.ProfessionalUserRepository;

@Service
@Component
public class ProfessionalUserService {
	
	@Autowired
	ProfessionalUserRepository professionalUserRepository;

	public String addProfessionalUserService(ProfessionalUser professionalUser) {
		var result = this.professionalUserRepository.addProfessionalUserRepo(professionalUser);
		return result;
	}

	public String updateProfessionalUserService(ProfessionalUser professionalUser, long userId) {
		var result = this.professionalUserRepository.updateProfessionalUserRepo(professionalUser, userId);
		return result;
	}
	
	public String getAllProfessionalUserService() {
		var result = this.professionalUserRepository.getAllProfessionalUserRepo();
		return result;
	}
	
	public String getByUserIdProfessionalUserService(long userId) {
		var result = this.professionalUserRepository.getByUserIdProfessionalUserRepo(userId);
		return result;
	}
	
	public String deleteByUserIdProfessionalUserService(long userId) {
		var result = this.professionalUserRepository.deleteByUserIdProfessionalUserRepo(userId);
		return result;
	}
}
