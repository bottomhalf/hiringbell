package com.hiringbell.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.ResearchPublication;
import com.hiringbell.repository.ResearchPublicationRepository;

@Service
public class ResearchPublicationService {

	@Autowired
	ResearchPublicationRepository researchPublicationRepository;

	public String addResearchPublicationService(ResearchPublication researchPublication) {
		var result = this.researchPublicationRepository.addResearchPublicationRepo(researchPublication);
		return result;
	}

	public String updateResearchPublicationService(ResearchPublication researchPublication,long researchPublicationId) throws IOException {
		var result = "";
		if(researchPublicationId > 0) {
			result = this.researchPublicationRepository.updateResearchPublicationRepository(researchPublication, researchPublicationId);
			if (result == null | result == "")
				throw new IOException("Unable to update");
		}
		return result;
	}
	
	public ArrayList<ResearchPublication> getAllResearchPublicationService() {
		var result = this.researchPublicationRepository.getAllResearchPublicationRepo();
		return result;
	}

	public ArrayList<ResearchPublication> getResearchPublicationByUserIdService(long userId) {
		var result = this.researchPublicationRepository.getResearchPublicationByUserIdRepository(userId);
		return result;
		
	}

	public String deleteResearchPublicationByresearchPublicationIdService(long researchPublicationId) {
		var result = this.researchPublicationRepository.deleteResearchPublicationByresearchPublicationIdRepo(researchPublicationId);
		return result;
		
	}
	
}
