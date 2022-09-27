package com.hiringbell.interfaces;

import java.util.ArrayList;

import com.hiringbell.entity.EducationalDetail;

public interface IEducationalDetailService {
	
	String addEducationalDetailService(EducationalDetail educationalDetail);
	String updateEducationalDetailService(EducationalDetail educationalDetail, long educationalDetailId) throws Exception;
	ArrayList<EducationalDetail> getAllEducationalDetailService();
	ArrayList<EducationalDetail> getByUserIdEducationalDetailService(long userId);
	String deleteByIdEducationalDetailService(long educationalDetailId);
	
}
