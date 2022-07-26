package com.hiringbell.service;

import java.util.ArrayList;

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
	
	public String updateEmploymentDetailService(EmploymentDetail employmentDetail, long employmentDetailId) throws Exception {
		var result = "";
		EmploymentDetail value = this.employmentDetailRepository.getByIdEmploymentDetailRepo(employmentDetailId);
		if(value != null) {
			value.setDesignation(employmentDetail.getDesignation());
			value.setUserId(employmentDetail.getUserId());
			value.setCompanyName(employmentDetail.getCompanyName());
			value.setIsCurrentCompany(employmentDetail.getIsCurrentCompany());
			value.setJoiningDate(employmentDetail.getJoiningDate());
			value.setWorkedTill(employmentDetail.getWorkedTill());
			value.setCurrencyType(employmentDetail.getCurrencyType());
			value.setCurrentAnnualSalary(employmentDetail.getCurrentAnnualSalary());
			value.setSkillsUsed(employmentDetail.getSkillsUsed());
			value.setJobProfile(employmentDetail.getJobProfile());
			value.setNoticePeriod(employmentDetail.getNoticePeriod());
			value.setIsServingNoticePeriod(employmentDetail.getIsServingNoticePeriod());
			value.setRemainingDaysOfNoticePeriod(employmentDetail.getRemainingDaysOfNoticePeriod());
			value.setAdminId(employmentDetail.getAdminId());
			result = this.employmentDetailRepository.updateEmploymentDetailRepo(value, employmentDetailId);
		}
		else {
			throw new Exception();
		}
		return result;
	}

	public ArrayList<EmploymentDetail> getAllEmploymentDetailService() {
		var result = this.employmentDetailRepository.getAllEmploymentDetailRepo();
		return result;
	}
	
	public EmploymentDetail getByIdEmploymentDetailService(long employmentDetailId) {
		var result = this.employmentDetailRepository.getByIdEmploymentDetailRepo(employmentDetailId);
		return result;
	}

	public String deleteByIdEmploymentDetailService(long employmentDetailId) {
		var result = this.employmentDetailRepository.deleteByIdEmploymentDetailRepo(employmentDetailId);
		return result;
	}
}
