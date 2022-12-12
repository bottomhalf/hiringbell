package com.hiringbell.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.Patent;
import com.hiringbell.repository.PatentRepository;

@Service
public class PatentService {
	
	@Autowired
	PatentRepository patentRepository;
	
	
	public String addPatentService(Patent patent) {
		var result = this.patentRepository.addPatentRepository(patent);
		return result;
	}


	public String updatePatentService(Patent patent, long patentId) throws IOException {
		var result = "";
		if(patentId > 0) {
			result = this.patentRepository.updatePatentRepository(patent, patentId);
			if(result == null || result == "")
				throw new IOException("Unable to update");
		}
		return result;	
	}
	
	public ArrayList<Patent> getAllPatentService() {
		var result = this.patentRepository.getAllPatentRepository();
		return result;
	}

	
	public ArrayList<Patent> getPatentByUserIdService(long userId) {
		var result = this.patentRepository.getPatentByUserIdRepository(userId);
		return result;
	}


	public String deletePatentByPatentIdService(long patentId) {
		var result = this.patentRepository.deletePatentByPatentIdRepository(patentId);
		return result;
	}
	
	
	
	

}
