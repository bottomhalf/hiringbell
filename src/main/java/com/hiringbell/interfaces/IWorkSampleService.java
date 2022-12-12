package com.hiringbell.interfaces;

import java.io.IOException;
import java.util.ArrayList;

import com.hiringbell.entity.WorkSample;

public interface IWorkSampleService {
	
	String addWorkSampleService(WorkSample workSample);
	String updateByworkSampleIdWorkSampleService(WorkSample workSample, long workSampleId) throws IOException;
	ArrayList<WorkSample> getAllWorkSampleService();
	ArrayList<WorkSample> getByUserIdWorkSampleService(long userId);
	String deleteByworkSampleIdWorkSampleService(long workSampleId);

}
