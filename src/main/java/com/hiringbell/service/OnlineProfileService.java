package com.hiringbell.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.OnlineProfile;
import com.hiringbell.repository.OnlineProfileRepository;

@Service
public class OnlineProfileService {
	
	@Autowired
	OnlineProfileRepository onlineProfileRepository;
	
	
	public String addOnlineProfileService (OnlineProfile onlineProfile) {
		var result = this.onlineProfileRepository.addOnlineProfileRepository(onlineProfile);
		return result;
	}


	public String updateOnlineProfileService(OnlineProfile onlineProfile, long onlineProfileId) throws IOException {
		var result = "";
		if(onlineProfileId > 0)
		{
			result = this.onlineProfileRepository.updateOnlineProfileRepository(onlineProfile, onlineProfileId);
			if(result == null || result == "")
				throw new IOException("Unable to update");
		}
		return result;
	}
	
	public ArrayList<OnlineProfile> getAllOnlineProfileService() {
		var result = this.onlineProfileRepository.getAllOnlineProfileRepository();
		return result;
	}
	
	public ArrayList<OnlineProfile> getByUserIdOnlineProfileService(long userId) {
		var result = this.onlineProfileRepository.getByUserIdOnlineProfileReporsitory(userId);
		return result;
	}


	public String deleteByOnlineProfileIdService(long onlineProfileId) {
		var result = this.onlineProfileRepository.deleteByOnlineProfileIdRepository(onlineProfileId);
		return result;
	}
	

}
