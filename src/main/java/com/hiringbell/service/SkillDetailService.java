package com.hiringbell.service;

import java.util.ArrayList;

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

	public String updateSkillDetailService(SkillDetail skillDetail, long skillDetailId) throws Exception {
		var result = "";
		SkillDetail value = this.skillDetailRepository.getByIdSkillDetailRepo(skillDetailId);
		if(value!=null)
		{
			value.setSkillIndex(skillDetail.getSkillIndex());
			value.setLanguage(skillDetail.getLanguage());
			value.setVersion(skillDetail.getVersion());
			value.setLastUsed(skillDetail.getLastUsed());
			value.setExperienceInYear(skillDetail.getExperienceInYear());
			value.setExperienceInMonth(skillDetail.getExperienceInMonth());
			value.setAdminId(skillDetail.getAdminId());
			result = this.skillDetailRepository.updateSkillDetailRepo(value, skillDetailId);
		}
		else {
			throw new Exception("Exception message");
		}
		return result;
		
	}
	
	public ArrayList<SkillDetail> getAllSkillDetailService() {
		var result = this.skillDetailRepository.getAllSkillDetailRepo();
		return result;
	}
	
	public SkillDetail getByIdSkillDetailService(long skillDetailId) {
		var result = this.skillDetailRepository.getByIdSkillDetailRepo(skillDetailId);
		return result;
	}
	
	public String deleteByIdSkillDetailService(long skillDetailId) {
		var result = this.skillDetailRepository.deleteByIdSkillDetailRepo(skillDetailId);
		return result;
	}

}
