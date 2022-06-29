package com.hiringbell.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.EducationalDetail;
import com.hiringbell.repository.EducationalDetailRepository;

@Service
@Component
public class EducationalDetailService {
	
	@Autowired
	EducationalDetailRepository educationalDetailRepository;
	
	
	public String addEducationalDetailService(EducationalDetail ed) {
		var result = this.educationalDetailRepository.addEducationalDetailRepo(ed);
		return result;
	}
	
	public String updateEducationalDetailService(EducationalDetail ed, long edId) {
		var result = this.educationalDetailRepository.updateEducationalDetailRepo(ed, edId);
		return result;
	}

	public String getAllEducationalDetailService() {
		var result = this.educationalDetailRepository.getAllEducationalDetailRepo();
		return result;
	}
	
	public String getByIdEducationalDetailService(long edId) {
		var result = this.educationalDetailRepository.getByIdEducationalDetailRepo(edId);
		return result;
	}

	public String deleteByIdEducationalDetailService(long edId) {
		var result = this.educationalDetailRepository.deleteByIdEducationalDetailRepo(edId);
		return result;
		
		
	}
	
	
}
