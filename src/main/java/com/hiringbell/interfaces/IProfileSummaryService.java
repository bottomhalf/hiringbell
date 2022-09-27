package com.hiringbell.interfaces;

import java.io.IOException;
import java.util.ArrayList;

import com.hiringbell.entity.ProfileSummary;

public interface IProfileSummaryService {
	
	String addProfileSummaryService(ProfileSummary profileSummary);
	String updateProfileSummarybyUserIdService(ProfileSummary profileSummary, long userId) throws IOException;
	ArrayList<ProfileSummary> getByUserIdProfileSummaryService(long userId);
	ArrayList<ProfileSummary> getAllProfileSummaryService();
	String deleteByUserIdProfileSummaryService(long userId);

}
