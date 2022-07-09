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

	public String addAccomplishmentsDetailService(AccomplishmentsDetail ad) {
		var result = this.accomplishmentsDetailRepo.addAccomplishmentsDetailService(ad);
		return result;
	}

	public String updateAccomplishmentsDetailService(AccomplishmentsDetail ad, long accomplishmentId) {
		var result = this.accomplishmentsDetailRepo.updateAccomplishmentsDetailRepo(ad, accomplishmentId);
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
