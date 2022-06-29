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
	
	public String addEmploymentDetailService(EmploymentDetail empDetail) {
		var result = this.employmentDetailRepository.addEmploymentDetailRepo(empDetail);
		return result;
	}
	
	public String updateEmploymentDetailService(EmploymentDetail empDetail, long empDetailId) {
		var result = this.employmentDetailRepository.updateEmploymentDetailRepo(empDetail, empDetailId);
		return result;
	}

	public String getAllEmploymentDetailService() {
		var result = this.employmentDetailRepository.getAllEmploymentDetailRepo();
		return result;
	}
	
	public String getByIdEmploymentDetailService(long empDetailId) {
		var result = this.employmentDetailRepository.getByIdEmploymentDetailRepo(empDetailId);
		return result;
	}

	public String deleteByIdEmploymentDetailService(long empDetailId) {
		var result = this.employmentDetailRepository.deleteByIdEmploymentDetailRepo(empDetailId);
		return result;
	}
}
