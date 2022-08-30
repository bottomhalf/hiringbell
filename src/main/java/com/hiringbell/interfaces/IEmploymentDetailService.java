package com.hiringbell.interfaces;

import java.util.ArrayList;

import com.hiringbell.entity.EmploymentDetail;

public interface IEmploymentDetailService {

	String addEmploymentDetailService(EmploymentDetail employmentDetail);
	String updateEmploymentDetailService(EmploymentDetail employmentDetail, long employmentDetailId) throws Exception;
	ArrayList<EmploymentDetail> getAllEmploymentDetailService();
	ArrayList<EmploymentDetail> getByUserIdEmploymentDetailService(long userId);
	String deleteByIdEmploymentDetailService(long employmentDetailId);
		
}
