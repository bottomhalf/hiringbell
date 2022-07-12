package com.hiringbell.service;

import java.util.ArrayList;

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
	
	public String updatePersonalDetailService(PersonalDetail personalDetail, long personalDetailId) throws Exception {
		var result = "";
		PersonalDetail value = this.personalDetailRepository.getByIdPersonalDetailRepo(personalDetailId);
		if(value!=null) {
			value.setDob(personalDetail.getDob());
			value.setGender(personalDetail.getGender());
			value.setAddress(personalDetail.getAddress());
			value.setHomeTown(personalDetail.getHomeTown());
			value.setPinCode(personalDetail.getPinCode());
			value.setMaritalStatus(personalDetail.getMaritalStatus());
			value.setCategory(personalDetail.getCategory());
			value.setDifferentlyAbled(personalDetail.getDifferentlyAbled());
			value.setPermitUSA(personalDetail.getPermitUSA());
			value.setPermitOtherCountry(personalDetail.getPermitOtherCountry());
			value.setLanguageDetails(personalDetail.getLanguageDetails());
			value.setAdminId(personalDetail.getAdminId());
			result = this.personalDetailRepository.updatePersonalDetailRepo(value, personalDetailId);
		}
		else {
			throw new Exception("Exception message");
		}
		return result;
	}
	
	public ArrayList<PersonalDetail> getAllPersonalDetailService() {
		var result = this.personalDetailRepository.getAllPersonalDetailRepo();
		return result;
	}
	
	public PersonalDetail getByIdPersonalDetailService(long personalDetailId) {
		var result = this.personalDetailRepository.getByIdPersonalDetailRepo(personalDetailId);
		return result;
	}

	public String deleteByIdPersonalDetailService(long personalDetailId) {
		var result = this.personalDetailRepository.deleteByIdPersonalDetailRepo(personalDetailId);
		return result;
		
	}
}
