package com.hiringbell.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.ProfileSummary;
import com.hiringbell.interfaces.IProfileSummaryService;
import com.hiringbell.repository.ProfileSummaryRepository;

@Service
public class ProfileSummaryService implements IProfileSummaryService {
	
	@Autowired
	ProfileSummaryRepository profileSummaryRepository;
	
	
	public String addProfileSummaryService(ProfileSummary profileSummary) {
		var result = this.profileSummaryRepository.addProfileSummaryRepo(profileSummary);
		return result;
	}
	
	public String updateProfileSummarybyUserIdService(ProfileSummary profileSummary, long userId) throws IOException {
		var result = "";
		if(userId > 0)
		{
			result = this.profileSummaryRepository.updateProfileSummarybyUserIdRepo(profileSummary, userId);
			if(result == null || result == "")
				throw new IOException ("Unable to update");
		}
		
		return result;
	}
	
	public ArrayList<ProfileSummary> getByUserIdProfileSummaryService(long userId) {
		var result = this.profileSummaryRepository.getByUserIdProfileSummaryRepo(userId);
		return result;
	}
	
	public ArrayList<ProfileSummary> getAllProfileSummaryService() {
		var result = this.profileSummaryRepository.getAllProfileSummaryRepo();
		return result;
	}

	public String deleteByUserIdProfileSummaryService(long userId) {
		var result = this.profileSummaryRepository.deleteByUserIdProfileSummaryRepo(userId);
		return result;
	}
	
}
