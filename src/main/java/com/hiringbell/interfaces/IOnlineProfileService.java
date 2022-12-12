package com.hiringbell.interfaces;

import java.io.IOException;
import java.util.ArrayList;

import com.hiringbell.entity.OnlineProfile;

public interface IOnlineProfileService {
	
	String addOnlineProfileService (OnlineProfile onlineProfile);
	String updateOnlineProfileService(OnlineProfile onlineProfile, long onlineProfileId) throws IOException;
	ArrayList<OnlineProfile> getAllOnlineProfileService();
	ArrayList<OnlineProfile> getByUserIdOnlineProfileService(long userId);
	String deleteByOnlineProfileIdService(long onlineProfileId);
	
}
