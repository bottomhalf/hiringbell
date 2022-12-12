package com.hiringbell.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.EducationList;
import com.hiringbell.repository.EducationListRepository;

@Service
@Component
public class EducationListService {
	
	@Autowired
	EducationListRepository educationListRepository;

	public ArrayList<EducationList> getAllEducationListService() {
		var educationListData = this.educationListRepository.getAllEducationListServiceRepo();
		return (ArrayList<EducationList>) educationListData;
	}

}
