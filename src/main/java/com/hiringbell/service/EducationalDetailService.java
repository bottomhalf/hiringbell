package com.hiringbell.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.EducationalDetail;
import com.hiringbell.entity.ProjectDetail;
import com.hiringbell.interfaces.IEducationalDetailService;
import com.hiringbell.repository.EducationalDetailRepository;

@Service
@Component
public class EducationalDetailService implements IEducationalDetailService {
	
	@Autowired
	EducationalDetailRepository educationalDetailRepository;
	
	
	public String addEducationalDetailService(EducationalDetail educationalDetail) {
		var result = this.educationalDetailRepository.addEducationalDetailRepo(educationalDetail);
		return result;
	}
	
	public String updateEducationalDetailService(EducationalDetail educationalDetail, long educationalDetailId) throws Exception {
		var result = "";
		if(educationalDetailId > 0)
		{
			result = this.educationalDetailRepository.updateEducationalDetailRepo(educationalDetail, educationalDetailId);
			if(result == null || result =="")
				throw new IOException("Unable to update");
		}
		return result;
	}

	public ArrayList<EducationalDetail> getAllEducationalDetailService() {
		var result = this.educationalDetailRepository.getAllEducationalDetailRepo();
		return result;
	}
	
	public ArrayList<EducationalDetail> getByUserIdEducationalDetailService(long userId) {
		var result = this.educationalDetailRepository.getByUserIdEducationalDetailRepo(userId);
		return result;
	}

	public String deleteByIdEducationalDetailService(long educationalDetailId) {
		var result = this.educationalDetailRepository.deleteByIdEducationalDetailRepo(educationalDetailId);
		return result;
		
	}
	
}
