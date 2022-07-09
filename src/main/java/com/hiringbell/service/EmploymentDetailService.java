package com.hiringbell.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.EmploymentDetail;
import com.hiringbell.repository.EmploymentDetailRepository;

@Service
@Component
public class EmploymentDetailService {
	
	@Autowired
	EmploymentDetailRepository employmentDetailRepository;
	
	public String addEmploymentDetailService(EmploymentDetail employmentDetail) {
		var result = this.employmentDetailRepository.addEmploymentDetailRepo(employmentDetail);
		return result;
	}
	
	public String updateEmploymentDetailService(EmploymentDetail employmentDetail, long employmentDetailId) {
		var result = this.employmentDetailRepository.updateEmploymentDetailRepo(employmentDetail, employmentDetailId);
		return result;
	}

	public String getAllEmploymentDetailService() {
		var result = this.employmentDetailRepository.getAllEmploymentDetailRepo();
		return result;
	}
	
	public String getByIdEmploymentDetailService(long employmentDetailId) {
		var result = this.employmentDetailRepository.getByIdEmploymentDetailRepo(employmentDetailId);
		return result;
	}

	public String deleteByIdEmploymentDetailService(long employmentDetailId) {
		var result = this.employmentDetailRepository.deleteByIdEmploymentDetailRepo(employmentDetailId);
		return result;
	}
}
