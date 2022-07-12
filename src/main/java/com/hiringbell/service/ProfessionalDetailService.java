package com.hiringbell.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.ProfessionalDetail;
import com.hiringbell.repository.ProfessionalDetailRepository;

@Service
@Component
public class ProfessionalDetailService {
	
	
	@Autowired
	ProfessionalDetailRepository professionalDetailRepository;

	public String addProfessionalDetailService(ProfessionalDetail professionalDetail) 
	{
		var result = this.professionalDetailRepository.addProfessionalDetailRepo(professionalDetail);
		return result;
	}
	
	public String updateProfessionalDetailService(ProfessionalDetail professionalDetail, long userId) throws Exception{
		var result = "";
		ProfessionalDetail value = this.professionalDetailRepository.getByUserIdProfessionalDetailRepo(userId);
		if(value != null) {
			value.setMobileNumber(professionalDetail.getMobileNumber());
			value.setEmail(professionalDetail.getEmail());
			value.setFirstName(professionalDetail.getFirstName());
			value.setLastName(professionalDetail.getLastName());
			value.setDateOfApplication(professionalDetail.getDateOfApplication());
			value.setTotalEperienceinMonths(professionalDetail.getTotalEperienceinMonths());
			value.setSalaryPackage(professionalDetail.getSalaryPackage());
			value.setNoticePeriod(professionalDetail.getNoticePeriod());
			value.setExpecetedCtc(professionalDetail.getExpecetedCtc());
			value.setCurrentLocation(professionalDetail.getCurrentLocation());
			value.setPreferredLocations(professionalDetail.getPreferredLocations());
			value.setProfessionalDetailJson(professionalDetail.getProfessionalDetailJson());
			value.setAdminId(professionalDetail.getAdminId());
			result = this.professionalDetailRepository.updateProfessionalDetailRepo(value, userId);
		}
		else {
			throw new Exception("Exception Message");
		}
		return result;
	}
	
	
	public ArrayList<ProfessionalDetail> getAllProfessionalDetailService()
	{
		var result = this.professionalDetailRepository.getAllProfessionalDetailRepo();
		return result;
	}
	
	
	public ProfessionalDetail getByUserIdProfessionalDetailService(long userId)
	{	
		var result = this.professionalDetailRepository.getByUserIdProfessionalDetailRepo(userId);
		return result;
	}
	
	public String deleteByUserIdProfessionalDetailService(long userId)
	{
		var result = this.professionalDetailRepository.deleteByUserIdProfessionalDetailRepo(userId);
		return result;
	}

}
