package com.hiringbell.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.EmploymentDetail;
import com.hiringbell.interfaces.IEmploymentDetailService;
import com.hiringbell.repository.EmploymentDetailRepository;

@Service
@Component
public class EmploymentDetailService implements IEmploymentDetailService {
	
	@Autowired
	EmploymentDetailRepository employmentDetailRepository;
	
	public String addEmploymentDetailService(EmploymentDetail employmentDetail) {
		var result = this.employmentDetailRepository.addEmploymentDetailRepo(employmentDetail);
		return result;
	}
	
	public String updateEmploymentDetailService(EmploymentDetail employmentDetail, long employmentDetailId) throws Exception {
		var result = "";
		if(employmentDetailId > 0)
		{
			result = this.employmentDetailRepository.updateEmploymentDetailRepo(employmentDetail, employmentDetailId);
			if(result == null || result =="")
				throw new IOException("Unable to update");
		}
		return result;
	}
	

	public ArrayList<EmploymentDetail> getAllEmploymentDetailService() {
		var result = this.employmentDetailRepository.getAllEmploymentDetailRepo();
		return result;
	}
	
	public ArrayList<EmploymentDetail> getByUserIdEmploymentDetailService(long userId) {
		var result = this.employmentDetailRepository.getByUserIdEmploymentDetailRepo(userId);
		return result;
	}

	public String deleteByIdEmploymentDetailService(long employmentDetailId) {
		var result = this.employmentDetailRepository.deleteByIdEmploymentDetailRepo(employmentDetailId);
		return result;
	}
}
