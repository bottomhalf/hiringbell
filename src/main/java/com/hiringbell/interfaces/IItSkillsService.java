package com.hiringbell.interfaces;

import java.io.IOException;
import java.util.ArrayList;

import com.hiringbell.entity.ItSkills;

public interface IItSkillsService {
	
	String addItSkillService(ItSkills itSkills);
	String updateItSkillsByItSkillIdService(ItSkills itSkills, long itSkillId) throws IOException;
	ArrayList<ItSkills> getAllItSkillsService();
	ArrayList<ItSkills> getByUserIdItSkillsService(long userId);
	String deleteByitSkillIdItSkillsService(long itSkillId);

}
