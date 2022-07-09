package com.hiringbell.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.AccomplishmentsDetail;
import com.hiringbell.repository.AccomplishmentsDetailRepo;

@Service
@Component
public class AccomplishmentsDetailService {
	
	@Autowired
	AccomplishmentsDetailRepo accomplishmentsDetailRepo;

	public String addAccomplishmentsDetailService(AccomplishmentsDetail accomplishmentsDetail) {
		var result = this.accomplishmentsDetailRepo.addAccomplishmentsDetailRepo(accomplishmentsDetail);
		return result;
	}

	public String updateAccomplishmentsDetailService(AccomplishmentsDetail accomplishmentsDetail, long accomplishmentId) throws Exception {
		var result = "";
		AccomplishmentsDetail value = this.accomplishmentsDetailRepo.getByIdAccomplishmentsDetailRepo(accomplishmentId);
		if(value != null)
		{
			value.setOnlineProfile(accomplishmentsDetail.getOnlineProfile());
			value.setWorkSample(accomplishmentsDetail.getWorkSample());
			value.setResearch(accomplishmentsDetail.getResearch());
			value.setPresentation(accomplishmentsDetail.getPresentation());
			value.setPatent(accomplishmentsDetail.getPatent());
			value.setCertification(accomplishmentsDetail.getCertification());
			value.setAdminId(accomplishmentsDetail.getAdminId());
		result = this.accomplishmentsDetailRepo.updateAccomplishmentsDetailRepo(value, accomplishmentId);
		}
		else {
			throw new Exception("Exception Message");
		}
		return result;
	}
	
	public ArrayList<AccomplishmentsDetail> getAllAccomplishmentsDetailService() {
		var result = this.accomplishmentsDetailRepo.getAllAccomplishmentsDetailRepo();
		return result;
	}

	public AccomplishmentsDetail getByIdAccomplishmentsDetailService(long accomplishmentId) {
		var result = this.accomplishmentsDetailRepo.getByIdAccomplishmentsDetailRepo(accomplishmentId);
		return result;
		
	}
	
	public String deleteByIdAccomplishmentsDetailService (long accomplishmentId) {
		var result = this.accomplishmentsDetailRepo.deleteByIdAccomplishmentsDetailRepo(accomplishmentId);
		return result;
	}
	
	
	
	
	
}
