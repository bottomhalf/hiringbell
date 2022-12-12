package com.hiringbell.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.WorkSample;
import com.hiringbell.repository.WorkSampleRepository;

@Service
public class WorkSampleService {
	
	@Autowired
	WorkSampleRepository workSampleRepository;
	
	
	public String addWorkSampleService(WorkSample workSample) {
		var result = this.workSampleRepository.addWorkSampleRepository(workSample);
		return result;
	}


	public String updateByworkSampleIdWorkSampleService(WorkSample workSample, long workSampleId) throws IOException {
		var result = "";
		if(workSampleId > 0) {
			result = this.workSampleRepository.updateByworkSampleIdWorkSampleRepo(workSample, workSampleId);
			if(result == null || result == "")
				throw new IOException("Unable to update");
		}
		return result;
	}


	public ArrayList<WorkSample> getAllWorkSampleService() {
		var result = this.workSampleRepository.getAllWorkSampleRepository();
		return result;
		
	}


	public ArrayList<WorkSample> getByUserIdWorkSampleService(long userId) {
		var result = this.workSampleRepository.getByUserIdWorkSampleRepository(userId);
		return result;
	}
	
	public String deleteByworkSampleIdWorkSampleService(long workSampleId) {
		var result = this.workSampleRepository.deleteByworkSampleIdWorkSampleRepo(workSampleId);
		return null;
	}


}
