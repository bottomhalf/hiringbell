package com.hiringbell.service;

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

	public String addProfessionalDetailService(ProfessionalDetail pd) 
	{
		var result = this.professionalDetailRepository.addProfessionalDetailRepo(pd);
		return result;
	}
	
	public String updateProfessionalDetailService(ProfessionalDetail pd, long userId)
	{
		String result = "";
		if(userId > 0 )
		{
			result = this.professionalDetailRepository.updateProfessionalDetailRepo(pd, userId);
		}
		return result;
	}
	
	
	public String getAllProfessionalDetailService()
	{
		var result = this.professionalDetailRepository.getAllProfessionalDetailRepo();
		return result;
	}
	
	
	public String getByUserIdProfessionalDetailService(long userId)
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
