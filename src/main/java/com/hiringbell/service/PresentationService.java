package com.hiringbell.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.Presentation;
import com.hiringbell.repository.PresentationRepository;

@Service
public class PresentationService {
	
	@Autowired
	PresentationRepository presentationRepository;
	
	
	public String addPresentationService(Presentation presentation) {
		var result = this.presentationRepository.PresentationRepository(presentation);
		return result;
	}
	
	public String updatePresentationService(Presentation presentation, long presentationId) throws IOException {
		var result = "";
		if(presentationId > 0) {
			result = this.presentationRepository.updatePresentationRepository(presentation, presentationId);
			if(result == null || result == "")
				throw new IOException("Unable to Update");
		}
		return result;
	}

	public ArrayList<Presentation> getAllPresentationService() {
		var result = this.presentationRepository.getAllPresentationRepository();
		return result;
		
	}

	public ArrayList<Presentation> getPresentationByUserIdService(long userId) {
		var result = this.presentationRepository.getPresentationByUserIdRepo(userId);
		return result;
		
	}

	public String deletePresentationByPresentationIdService(long presentationId) {
		var result = this.presentationRepository.deletePresentationByPresentationIdRepo(presentationId);
		return result;
	}
	
}
