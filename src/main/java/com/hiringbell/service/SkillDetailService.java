package com.hiringbell.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.SkillDetail;
import com.hiringbell.repository.SkillDetailRepository;

@Service
@Component
public class SkillDetailService {
	
	@Autowired
	SkillDetailRepository skillDetailRepository;

	public String addSkillDetailService(SkillDetail skillDetail) {
		var result = this.skillDetailRepository.addSkillDetailRepo(skillDetail);
		return result;
		
	}

	public String updateSkillDetailService(SkillDetail skillDetail, long skillDetailId) {
		var result = this.skillDetailRepository.updateSkillDetailRepo(skillDetail, skillDetailId);
		return result;
		
	}
	
	public String getAllSkillDetailService() {
		var result = this.skillDetailRepository.getAllSkillDetailRepo();
		return result;
	}
	
	public String getByIdSkillDetailService(long skillDetailId) {
		var result = this.skillDetailRepository.getByIdSkillDetailRepo(skillDetailId);
		return result;
	}
	
	public String deleteByIdSkillDetailService(long skillDetailId) {
		var result = this.skillDetailRepository.deleteByIdSkillDetailRepo(skillDetailId);
		return result;
	}

}
