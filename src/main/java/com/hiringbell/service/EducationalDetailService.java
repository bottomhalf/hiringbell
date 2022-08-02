package com.hiringbell.service;

import java.util.ArrayList;

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
	
	
	public String addEducationalDetailService(EducationalDetail educationalDetail) {
		var result = this.educationalDetailRepository.addEducationalDetailRepo(educationalDetail);
		return result;
	}
	
	
	public String updateEducationalDetailService(EducationalDetail educationalDetail, long educationalDetailId) throws Exception {
		var result = "";
		EducationalDetail value = this.educationalDetailRepository.getByIdEducationalDetailRepo(educationalDetailId);
		if(value != null) {
			
			value.setEducation(educationalDetail.getEducation());
			value.setBoard(educationalDetail.getBoard());
			value.setSchoolMedium(educationalDetail.getSchoolMedium());
			value.setTotalMarks(educationalDetail.getTotalMarks());
			value.setEnglishMarks(educationalDetail.getEnglishMarks());
			value.setMathsMarks(educationalDetail.getMathsMarks());
			value.setCourse(educationalDetail.getCourse());
			value.setOtherCourse(educationalDetail.getOtherCourse());
			value.setSpecialization(educationalDetail.getSpecialization());
			value.setOtherSpecialization(educationalDetail.getOtherSpecialization());
			value.setUniversityInstitute(educationalDetail.getUniversityInstitute());
			value.setCourseType(educationalDetail.getCourseType());
			value.setPassingOutYear(educationalDetail.getPassingOutYear());
			value.setGradingSystem(educationalDetail.getGradingSystem());
			value.setAdminId(educationalDetail.getAdminId());
			result = this.educationalDetailRepository.updateEducationalDetailRepo(value, educationalDetailId);
		}
		else {
			throw new Exception("Exception message");
		}
		return result;
	}

	public ArrayList<EducationalDetail> getAllEducationalDetailService() {
		var result = this.educationalDetailRepository.getAllEducationalDetailRepo();
		return result;
	}
	
	public EducationalDetail getByIdEducationalDetailService(long educationalDetailId) {
		var result = this.educationalDetailRepository.getByIdEducationalDetailRepo(educationalDetailId);
		return result;
	}

	public String deleteByIdEducationalDetailService(long educationalDetailId) {
		var result = this.educationalDetailRepository.deleteByIdEducationalDetailRepo(educationalDetailId);
		return result;
		
	}
	
}
