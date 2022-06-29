package com.hiringbell.service;

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

	public String updateProjectDetailService(ProjectDetail projectDetail, long projectDetailId) {
		var result = this.projectDetailRepository.updateProjectDetailRepo(projectDetail, projectDetailId);
		return result;
	}
	
	public String getAllProjectDetailService() {
		var result = this.projectDetailRepository.getAllProjectDetailRepo();
		return result;
	}

	public String getByIdProjectDetailService(long projectDetailId) {
		var result = this.projectDetailRepository.getByIdProjectDetailRepo(projectDetailId);
		return result;
	}
	
	public String deleteByIdProjectDetailService(long projectDetailId) {
		var result = this.projectDetailRepository.deleteByIdProjectDetailRepo(projectDetailId);
		return result;
	}
	
	
	

}
