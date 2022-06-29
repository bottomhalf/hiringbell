package com.hiringbell.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.PersonalDetail;
import com.hiringbell.repository.PersonalDetailRepository;

@Service
@Component
public class PersonalDetailService {
	
	@Autowired
	PersonalDetailRepository personalDetailRepository;

	public String addPersonalDetailService(PersonalDetail personalDetail) {
		var result = this.personalDetailRepository.addPersonalDetailRepo(personalDetail);
		return result;
	}
	
	public String updatePersonalDetailService(PersonalDetail personalDetail, long personalDetailId) {
		var result = this.personalDetailRepository.updatePersonalDetailRepo(personalDetail, personalDetailId);
		return result;
	}
	
	public String getAllPersonalDetailService() {
		var result = this.personalDetailRepository.getAllPersonalDetailRepo();
		return result;
	}
	
	public String getByIdPersonalDetailService(long personalDetailId) {
		var result = this.personalDetailRepository.getByIdPersonalDetailRepo(personalDetailId);
		return result;
	}

	public String deleteByIdPersonalDetailService(long personalDetailId) {
		var result = this.personalDetailRepository.deleteByIdPersonalDetailRepo(personalDetailId);
		return result;
		
	}
}
