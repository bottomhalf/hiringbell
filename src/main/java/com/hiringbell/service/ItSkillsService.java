package com.hiringbell.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.ItSkills;
import com.hiringbell.interfaces.IItSkillsService;
import com.hiringbell.repository.ItSkillsRepository;

@Service
public class ItSkillsService implements IItSkillsService {
	
	@Autowired
	ItSkillsRepository itSkillsRepository;

	public String addItSkillService(ItSkills itSkills) {
		var result = this.itSkillsRepository.addItSkillRepo(itSkills);
		return result;
	}
	
	public String updateItSkillsByItSkillIdService(ItSkills itSkills, long itSkillId) throws IOException {
		var result = "";
		if(itSkillId > 0) {
			result = this.itSkillsRepository.updateItSkillsByItSkillIdRepo(itSkills, itSkillId);
			if(result == null || result == "")
				throw new IOException("unable to update");
		}
		return result;
	}
	
	public ArrayList<ItSkills> getAllItSkillsService() {
		var result = this.itSkillsRepository.getAllItSkillsRepo();
		return result;
	}

	public ArrayList<ItSkills> getByUserIdItSkillsService(long userId) {
		var result = this.itSkillsRepository.getByUserIdItSkillsRepo(userId);
		return result;
	}

	public String deleteByitSkillIdItSkillsService(long itSkillId) {
		var result = this.itSkillsRepository.deleteByitSkillIdItSkillsRepo(itSkillId);
		return result;
	}

}
