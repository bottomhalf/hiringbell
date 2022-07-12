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

	public String updateProjectDetailService(ProjectDetail projectDetail, long projectDetailId) throws Exception {
		var result = "";
		ProjectDetail value = this.projectDetailRepository.getByIdProjectDetailRepo(projectDetailId);
		if(value!=null)
		{
			value.setProjectTitle(projectDetail.getProjectTitle());
			value.setProjectTitle(projectDetail.getProjectTitle());
			value.setProjectTag(projectDetail.getProjectTag());
			value.setProjectWorkingYear(projectDetail.getProjectWorkingYear());
			value.setProjectWorkingMonth(projectDetail.getProjectWorkingMonth());
			value.setProjectWorkedYear(projectDetail.getProjectWorkedYear());
			value.setProjectWorkedMonth(projectDetail.getProjectWorkedMonth());
			value.setProjectStatus(projectDetail.getProjectStatus());
			value.setClientName(projectDetail.getClientName());
			value.setProjectDetails(projectDetail.getProjectDetails());
			value.setRolesResponsibility(projectDetail.getRolesResponsibility());
			value.setTechnalogyStack(projectDetail.getTechnalogyStack());
			value.setProjectDuration(projectDetail.getProjectDuration());
			value.setProjectIndex(projectDetail.getProjectIndex());
			value.setAdminId(projectDetail.getAdminId());
			result = this.projectDetailRepository.updateProjectDetailRepo(value, projectDetailId);
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

	public ProjectDetail getByIdProjectDetailService(long projectDetailId) {
		var result = this.projectDetailRepository.getByIdProjectDetailRepo(projectDetailId);
		return result;
	}
	
	public String deleteByIdProjectDetailService(long projectDetailId) {
		var result = this.projectDetailRepository.deleteByIdProjectDetailRepo(projectDetailId);
		return result;
	}
	
	
	

}
