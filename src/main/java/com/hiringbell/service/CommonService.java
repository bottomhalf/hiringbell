package com.hiringbell.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.hiringbell.model.CommonResultModal;

@Service
@Component
public class CommonService {
	
	@Autowired
	KeySkillService keySkillService;
	
	@Autowired
	EducationalDetailService educationalDetailService;
	
	@Autowired
	EmploymentDetailService employmentDetailService;
	
	@Autowired
	ProjectDetailService projectDetailService;
	
	@Autowired
	ItSkillsService itSkillsService;
	
	@Autowired
	ProfileSummaryService profileSummaryService;
	
	@Autowired
	OnlineProfileService onlineProfileService;
	
	@Autowired
	WorkSampleService workSampleService;
	
	@Autowired
	ResearchPublicationService researchPublicationService;
	
	@Autowired
	PresentationService presentationService;
	
	@Autowired
	PatentService patentService;
	
	@Autowired
	CommonResultModal commonResultModal;

	public CommonResultModal getLoadAllDetailByUserIdService(long userId) throws JsonMappingException, JsonProcessingException {
		CommonResultModal commonResultModal = new CommonResultModal();
		commonResultModal.setEducationDetailResult(this.educationalDetailService.getByUserIdEducationalDetailService(userId));
		commonResultModal.setEmploymentDetailResult(this.employmentDetailService.getByUserIdEmploymentDetailService(userId));
		commonResultModal.setProjectDetailResult(this.projectDetailService.getByUserIdProjectDetailService(userId));
		commonResultModal.setItSkillsResult(this.itSkillsService.getByUserIdItSkillsService(userId));
		commonResultModal.setProfileSummaryResult(this.profileSummaryService.getByUserIdProfileSummaryService(userId));
		commonResultModal.setKeySkillResult(this.keySkillService.getByUserIdKeySkillService(userId));
		commonResultModal.setOnlineProfileResult(this.onlineProfileService.getByUserIdOnlineProfileService(userId));
		commonResultModal.setWorkSampleResult(this.workSampleService.getByUserIdWorkSampleService(userId));
		commonResultModal.setResearchPublicationResult(this.researchPublicationService.getResearchPublicationByUserIdService(userId));
		commonResultModal.setPresentationResult(this.presentationService.getPresentationByUserIdService(userId));
		commonResultModal.setPatentResult(this.patentService.getPatentByUserIdService(userId));
		
		return commonResultModal;
		
	}

}
