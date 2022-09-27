package com.hiringbell.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.hiringbell.entity.EducationalDetail;
import com.hiringbell.entity.EmploymentDetail;
import com.hiringbell.entity.ItSkills;
import com.hiringbell.entity.KeySkill;
import com.hiringbell.entity.ProfileSummary;
import com.hiringbell.entity.ProjectDetail;

@Component
public class CommonResultModal {
	
	ArrayList<EducationalDetail> educationDetailResult;
	ArrayList<EmploymentDetail> employmentDetailResult;
	ArrayList<ProjectDetail> projectDetailResult;
	ArrayList<ItSkills> itSkillsResult;
	ArrayList<ProfileSummary> profileSummaryResult;
	KeySkill keySkillResult;
	
	public ArrayList<EducationalDetail> getEducationDetailResult() {
		return educationDetailResult;
	}
	public void setEducationDetailResult(ArrayList<EducationalDetail> educationDetailResult) {
		this.educationDetailResult = educationDetailResult;
	}
	public ArrayList<EmploymentDetail> getEmploymentDetailResult() {
		return employmentDetailResult;
	}
	public void setEmploymentDetailResult(ArrayList<EmploymentDetail> employmentDetailResult) {
		this.employmentDetailResult = employmentDetailResult;
	}
	public ArrayList<ProjectDetail> getProjectDetailResult() {
		return projectDetailResult;
	}
	public void setProjectDetailResult(ArrayList<ProjectDetail> projectDetailResult) {
		this.projectDetailResult = projectDetailResult;
	}
	public ArrayList<ItSkills> getItSkillsResult() {
		return itSkillsResult;
	}
	public void setItSkillsResult(ArrayList<ItSkills> itSkillsResult) {
		this.itSkillsResult = itSkillsResult;
	}
	public ArrayList<ProfileSummary> getProfileSummaryResult() {
		return profileSummaryResult;
	}
	public void setProfileSummaryResult(ArrayList<ProfileSummary> profileSummaryResult) {
		this.profileSummaryResult = profileSummaryResult;
	}
	public KeySkill getKeySkillResult() {
		return keySkillResult;
	}
	public void setKeySkillResult(KeySkill keySkillResult) {
		this.keySkillResult = keySkillResult;
	}
	
	public CommonResultModal(ArrayList<EducationalDetail> educationDetailResult,
			ArrayList<EmploymentDetail> employmentDetailResult, ArrayList<ProjectDetail> projectDetailResult,
			ArrayList<ItSkills> itSkillsResult, ArrayList<ProfileSummary> profileSummaryResult,
			KeySkill keySkillResult) {
		super();
		this.educationDetailResult = educationDetailResult;
		this.employmentDetailResult = employmentDetailResult;
		this.projectDetailResult = projectDetailResult;
		this.itSkillsResult = itSkillsResult;
		this.profileSummaryResult = profileSummaryResult;
		this.keySkillResult = keySkillResult;
	}
	
	public CommonResultModal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
