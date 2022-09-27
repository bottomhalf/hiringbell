package com.hiringbell.service;


import java.io.IOException;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hiringbell.entity.KeySkill;
import com.hiringbell.repository.KeySkillRepository;


@Service
@Component
public class KeySkillService {
	
	
	@Autowired
	KeySkillRepository keySkillRepository;
	
	public String addKeySkillService(KeySkill keySkill, long userId) throws JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
		
		System.out.println("checking data: " + keySkill.getKeySkillData());
		//var jsondata = mapper.writeValueAsString(keySkill.getKeySkillData());
		//System.out.println(jsondata);
	keySkill.setKeySkill(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(keySkill.getKeySkillData()));
	System.out.println(keySkill);
		
		var result = this.keySkillRepository.addKeySkillRepository(keySkill);
	
		return result;
	}
	
	
	public String updateKeySkillByKeySkillIdService(KeySkill keySkill, long keySkillId) throws IOException {
		var result = "";
		if(keySkillId > 0) {
			ObjectMapper mapper = new ObjectMapper();
			
			System.out.println("checking data: " + keySkill.getKeySkillData());
			keySkill.setKeySkill(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(keySkill.getKeySkillData()));
			System.out.println(keySkill);	
			result = this.keySkillRepository.updateKeySkillByKeySkillIdRepo(keySkill, keySkillId);
			if(result == null || result == "")
				throw new IOException("Unable to update");
		}
		
		return result;
	}

	public ArrayList<KeySkill> getAllKeySkillService() {
		var result = this.keySkillRepository.getAllKeySkillRepo();
		return result;
	}
	
	public KeySkill getByUserIdKeySkillService(long userId) throws JsonMappingException, JsonProcessingException {
		String resultData = null;
		ArrayList<String> resultList = null;
		KeySkill result = this.keySkillRepository.getByUserIdKeySkillRepo(userId);
		System.out.println(result);
		resultData = result.getKeySkill();
		ObjectMapper mapper = new ObjectMapper();
		resultList = mapper.readValue(resultData, new TypeReference<ArrayList<String>>() {});
		result.setKeySkillData((ArrayList<String>) resultList);
		return result;
	}

	public String deleteByKeySkillIdKeySkillService(long keySkillId) {
		var result = this.keySkillRepository.deleteByKeySkillIdKeySkillRepo(keySkillId);
		return result;
		
	}


}
