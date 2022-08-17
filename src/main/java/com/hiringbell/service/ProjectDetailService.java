package com.hiringbell.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.ProjectDetail;
import com.hiringbell.repository.ProjectDetailRepository;


@Service
@Component
public class ProjectDetailService {
	
	@Autowired
	ProjectDetailRepository projectDetailRepository;

	public String addProjectDetailService(ProjectDetail projectDetail) {
		var result = this.projectDetailRepository.addProjectDetailRepo(projectDetail);
		return result;
	}

	public String updateProjectDetailService(ProjectDetail projectDetail, long userId) throws Exception {
		var result = "";
		ProjectDetail value = this.projectDetailRepository.getByUserIdProjectDetailRepo(userId);
		if(value!=null)
		{
			value.setProjectDetailId(projectDetail.getProjectDetailId());
			value.setProjectTitle(projectDetail.getProjectTitle());
			value.setClient(projectDetail.getProjectTitle());
			value.setProjectStatus(projectDetail.getProjectStatus());
			value.setWorkedFromYears(projectDetail.getWorkedFromYears());
			value.setWorkedFromMonth(projectDetail.getWorkedFromMonth());
			value.setWorkedTillYears(projectDetail.getWorkedTillYears());
			value.setWorkedTillMonth(projectDetail.getWorkedTillMonth());
			value.setDetailsOfProject(projectDetail.getDetailsOfProject());
			value.setProjectLocation(projectDetail.getProjectLocation());
			value.setProjectSite(projectDetail.getProjectSite());
			value.setNatureOfEmployment(projectDetail.getNatureOfEmployment());
			value.setTeamSize(projectDetail.getTeamSize());
			value.setRole(projectDetail.getRole());
			value.setRoleDescription(projectDetail.getRoleDescription());
			value.setSkillsUsed(projectDetail.getSkillsUsed());
			value.setAdminId(projectDetail.getAdminId());
			result = this.projectDetailRepository.updateProjectDetailRepo(value, userId);
		}
		else {
			throw new Exception("Exception message");
		}
		return result;
	}
	
	public ArrayList<ProjectDetail> getAllProjectDetailService() {
		var result = this.projectDetailRepository.getAllProjectDetailRepo();
		return result;
	}

	public ProjectDetail getByUserIdProjectDetailService(long userId) {
		var result = this.projectDetailRepository.getByUserIdProjectDetailRepo(userId);
		return result;
	}
	
	public String deleteByIdProjectDetailService(long projectDetailId) {
		var result = this.projectDetailRepository.deleteByIdProjectDetailRepo(projectDetailId);
		return result;
	}
	
	
	

}
