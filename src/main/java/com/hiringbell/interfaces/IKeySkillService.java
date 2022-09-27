package com.hiringbell.interfaces;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.hiringbell.entity.KeySkill;

public interface IKeySkillService {
	
	String addKeySkillService(KeySkill keySkill, long userId) throws JsonProcessingException;
	String updateKeySkillByKeySkillIdService(KeySkill keySkill, long keySkillId) throws IOException;
	ArrayList<KeySkill> getAllKeySkillService();
	KeySkill getByUserIdKeySkillService(long userId) throws JsonMappingException, JsonProcessingException;
	String deleteByKeySkillIdKeySkillService(long keySkillId);

}
